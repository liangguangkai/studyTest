/**
 * @author liangguangkai
 * @version 1.0
 * @date 2022/10/6
 */
public class GirlNode {
    private Girl value;
    private GirlNode pre;
    private GirlNode next;

    public Girl getValue() {
        return value;
    }

    public void setValue(Girl value) {
        this.value = value;
    }

    public GirlNode getPre() {
        return pre;
    }

    public void setPre(GirlNode pre) {
        this.pre = pre;
    }

    public GirlNode getNext() {
        return next;
    }

    public void setNext(GirlNode next) {
        this.next = next;
    }
}
