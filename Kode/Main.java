public class Main {
    public static void main(String[] args) {
        Birds red1 = new Red();
        Pig pig1 = new Pighat();
        pig1.setNyawaBabi(10);
        pig1.setNamaBabi("Piggie");

        Pig pig2 = new PigMetal();
        pig2.setNamaBabi("Piggie Kedua");
        pig2.setNyawaBabi(5); 

        Birds matilda1 = new Matilda();

        //KASUS PERTAMA
        red1.serang("Red", pig1, 20);

       

        //KASUS KEDUA
        System.out.println();
        red1.serang("Red", pig2, 10);
        System.out.println();

        //KASUS KETIGA
        matilda1.serang("Matilda", pig2, 10);

    }
}
