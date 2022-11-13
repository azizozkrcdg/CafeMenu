public class Cold extends Drinks {

    public void coldDrinksPrint() {
        System.out.println(
                "1 - Soğuk Kahve / Frappe \n" +
                "2 - Frozen \n" +
                "0 - Geri Git ");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");
        switch (select){
            case 1:
                ColdCoffeeFrozen coffeeFrappe = new ColdCoffeeFrozen();
                coffeeFrappe.coldCoffeePrint();
                break;
            case 2:
                ColdCoffeeFrozen frozen = new ColdCoffeeFrozen();
                frozen.frozenPrint();
            case 0:
                Drinks drinks = new Drinks();
                drinks.drinksPrint();
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                coldDrinksPrint();
                break;
        }

    }

}
