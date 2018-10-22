public class PeopleDome {
    public static void main(String[] args) {
        People a = new People();

        a.setName("Tom");
        a.setAge(20);
        a.setSex("man");
        a.setHeight(178.3);
        a.setWeight(70.5);

        People b = new People("Alice",19,"woman",165,50);

        String name_1 = a.getName();
        String name_2 = b.getName();
        double height = a.getHeight();
        double weighe = b.getWeight();

        System.out.println("The height of "+name_1+" is "+height);
        System.out.println("The weight of "+name_2+" is "+weighe);
    }
}
