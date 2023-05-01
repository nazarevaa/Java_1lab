public class mainC {


    public static void main(String[] args) {

        ArrList<Integer> IntArrList = new ArrList<>();
        IntArrList.add(12);
        IntArrList.add(34);
        IntArrList.add(90);
        IntArrList.add(789);
        IntArrList.add(56);
        System.out.println("0: " + IntArrList.getByIndex(0));
        System.out.println("1: " + IntArrList.getByIndex(1));
        System.out.println("2: " + IntArrList.getByIndex(2));
        System.out.println("4: " + IntArrList.getByIndex(4));
        System.out.println("3 before deleting :" + IntArrList.getByIndex(3));
        System.out.println("Delete 3 ...");
        IntArrList.remove(3);
        System.out.println("3 after deleting:" + IntArrList.getByIndex(3));


    }
}