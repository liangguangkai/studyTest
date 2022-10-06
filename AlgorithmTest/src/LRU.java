import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author liangguangkai
 * @version 1.0
 * @date 2022/9/27
 */
public class LRU {

    /**
     * 存储的结构
     */
    GirlNode head = new GirlNode();  // 头结点下一个为第一个节点
    GirlNode tail = new GirlNode();  // 尾结点前一个为最后一个节点
    Map<String, GirlNode> nameIndexMap = new HashMap<>();
    /**
     * 基础数据
     */
    Integer capacity;

    public LRU(Integer capacity) {
        this.capacity = capacity;
    }

    public Girl get(String key){
        if(nameIndexMap.size() == 0){
            return null;
        }
        // 获取对象
        GirlNode girlNode = nameIndexMap.get(key);
        GirlNode next = girlNode.getNext();
        GirlNode pre = girlNode.getPre();

        // 更改引用该节点的节点
        pre.setNext(next);
        next.setPre(pre);

        // 将对象插入头节点
        GirlNode headNext = head.getNext();
        head.setNext(girlNode);
        girlNode.setPre(head);
        girlNode.setNext(headNext);

        return girlNode.getValue();
    }

    public void put(Girl girl){
        GirlNode girlNode = new GirlNode();
        girlNode.setValue(girl);
        if(capacity == 0){
            tail.setPre(girlNode);
            head.setNext(girlNode);
            girlNode.setNext(tail);
        }else{
            GirlNode headNext = head.getNext();
            head.setNext(girlNode);
            girlNode.setNext(headNext);
        }
        girlNode.setPre(head);

        // 判断是否超出容量，并且需要加入hashmap中，判断是否键值重复等




    }


    public void addHead(){
        // 移除队列中的对象


    }







    public static void main(String[] args) {
       ;

    }

}
