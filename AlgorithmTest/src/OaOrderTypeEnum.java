
public enum OaOrderTypeEnum{
	/**
	 * 31 - OA销售补发单
	 * 32 - OA非销售订单
	 * 33 - OA渠道销售订单
	 */
	product_supply_again("product-supply-again", "31"),
	not_sales_order_supply_again("not-sales-order-supply-again", "32"),
	pay_on_delivery_supply_again("pay-on-delivery-supply-again", "33");

	private String name;
	private String Type;

	OaOrderTypeEnum(String name, String type) {
		this.name = name;
		Type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return Type;
	}
	public static void main(String[] args) {
		for(OaOrderTypeEnum oaOrderTypeEnum : OaOrderTypeEnum.values()){
			if(oaOrderTypeEnum.getName().equals("not-sales-order-supply-again")){
				// todo 这里不行，得是数字，想想怎么定义 订单类型，用于前端转换
				String type = oaOrderTypeEnum.getType();
				System.out.println(type);
				System.out.println("11");
			}
		}
	}
}

