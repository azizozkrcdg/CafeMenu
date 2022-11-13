public class Foods extends Menus {
    private String name;
    private int price;

    public Foods(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Foods(){}

    public void foodsPrint(){
        System.out.println("1 - Yemekler \n" +
                "2 - Tatlılar \n" +
                "0 - Geri Git");

        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select){
            case 1:
                FoodAndSweet foodAndSweet = new FoodAndSweet();
                foodAndSweet.foodPrint();
                break;
            case 2:
                FoodAndSweet foodAndSweet1 = new FoodAndSweet();
                foodAndSweet1.sweetPrint();
                break;
            case 0:
                Menus menus = new Menus();
                menus.menusPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                foodsPrint();
                break;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
