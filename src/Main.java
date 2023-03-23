import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();//1
        ll.add("Cat");
        ll.add("Cat");
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Cat");
        ll.add("Dog");
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Dog");
        ll.add("Cat");
        System.out.println(ll);




        int count = 0;
        for (int i = 0; i < ll.size(); i++) {  //2
            if (ll.get(i).contains("Cat")) {
                count++;
                if (count == 2) {
                    ll.remove(i);
                    count = 0;
                    i--;
                }
            }
        }
        System.out.println(ll);



        int count2 = 0;
        for (int i = 0; i < ll.size(); i++) { //3
            if (ll.get(i).contains("Dog")) {
                count2++;
                if (count2 == 3) {
                    ll.add(i + 1, "Mouse");
                    count2 = 0;
                    i++;
                }
            }
        }
        System.out.println(ll);




        ArrayList<String> al = new ArrayList<>();   //4
        for (int i = 0; i < ll.size(); i++) {
            al.add(ll.get(i));
        }
        System.out.println(al);


        System.out.println(al.size());//5



        LinkedList<String> lll = new LinkedList<>();//6
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).contains("Cat")) {
                lll.add(al.get(i));
            }

        }  for (int i = 0; i < al.size(); i++) {
            if (al.get(i).contains("Dog")) {
                lll.add(al.get(i));
            }

        }  for (int i = 0; i < al.size(); i++) {
            if (al.get(i).contains("Mouse")) {
                lll.add(al.get(i));
            }

        }
            System.out.println(lll);


//        ll.add("Cpp");
//        ll.add("Php");
//        ll.add("null");
//        String c= ll.get(0);
//        ll.set(0,ll.get(1));
//        ll.set(1,c);
//        ll.add("Css");
//        ll.add("Python");
//        ll.add("NySql");
////        ll.addFirst("Java");
////        ll.remove(0);
////        ll.remove(4);
//        System.out.println(ll);
//        LinkedList<String>lll=new LinkedList<>();
//        lll.add("JavaScript");
//        lll.add("HTML");
//        lll.add("C++");
//        lll.add("C");
//        ll.addAll(lll);
//        System.out.println(ll);


        }
    }