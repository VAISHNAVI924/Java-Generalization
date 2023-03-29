package generlization;

public class Mobile {
static void selectApp(FooddeliveryApp obj) {
	obj.orderingfood();
}
	public static void main(String[] args) {
selectApp(new Swiggy());
Zomato z=new Zomato();
selectApp(z);

	}
	}


