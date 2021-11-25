import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        List<Integer> myList = new ArrayList<>();
        List<Integer> mySecondList = op.getPopulatedList(100);

        myList.add(50);
        myList.add(80);
        myList.add(16);

//        System.out.println(myList);
//        myList.remove(Integer.valueOf(3));
//        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);

        //Seteaza o valoare la un index(pozitie)
        //ambele chestii de mai jos sunt acelasi lucru
//        myList.set(2, 3);
//        myList.add(2, 3);

        //Cerinta 1
   //     op.getPopulatedList1(50);

        //Cerinta 2
        System.out.println(op.addNumberToEnd(mySecondList,999));

        //Cerinta 3
        List<Integer> myThirdList = op.getPopulatedList(50);
        op.printListFromNumber(myThirdList, 20);

        //Cerinta 4
        op.invertList(mySecondList);

        //Cerinta 5
        List<String> myStringList = new ArrayList<>();
        myStringList.add("John");
        myStringList.add("Mihai");
        myStringList.add("Alex");
        myStringList.add("Basescu");
        System.out.println(op.addString(myStringList, "Marcel", 3));

        //Cerinta 6
        List<Integer> cerinta6 = op.getPopulatedList(10);
        System.out.println(op.firstPosition(cerinta6, 5));
        System.out.println("----------------");

        //Cerinta 7
        List<Integer> cerinta7 = op.getPopulatedList(10);
        op.cerinta7(cerinta7);
        System.out.println("----------------");

        //Cerinta 8
        List<Integer> cerinta8 = op.getPopulatedList(25);
        System.out.println("Valoarea cea mai mare din lista este " + op.cerinta8(cerinta8) + ".");

        //Tema OPTIONALA
        //Cerinta 1
        List<Integer> cerinta1opt = op.getPopulatedList(10);
        // x si y = index
        System.out.println(op.optionala1(cerinta1opt, 3, 7));
        System.out.println("----------------");

        //Cerinta 2
        List<Integer> cerinta2opt = op.getPopulatedList(10);
        System.out.println(op.opt2(cerinta2opt));
        System.out.println("----------------");

        //Cerinta 3
        List<Integer> cerinta3opt = new ArrayList<>();
        cerinta3opt.add(50);
        cerinta3opt.add(100);
        cerinta3opt.add(20);
        cerinta3opt.add(10);
        cerinta3opt.add(11);
        cerinta3opt.add(13);
        cerinta3opt.add(12);
        cerinta3opt.add(15);
        System.out.println("Lista initiala: " + cerinta3opt);
        System.out.println("Lista ordonata crescator:" + op.opt3(cerinta3opt));


    }
}
