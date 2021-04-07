package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] x = new int[4];
        ArrayList<Integer> arrayList = new ArrayList<>(); // 10
        // Обратиться по его индексу
        int b = x[1];
        //int c = arrayList.get(0);
        arrayList.add(100); // в конец
        arrayList.add(0,90); // вперед


        // LinkedList - двухсвязный список
        LinkedList<Integer> linkedList = new LinkedList<>();
       // int d = linkedList.get(10);

        // Stack - LIFO - Last in First out
        // Queue - FIFO - First in First out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String [] y = {"1","2","3","4","5"};
        for(int i=0;i<y.length;i++) {
            stack.push(y[i]);
            queue.offer(y[i]);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        ArrayList<String> names = new ArrayList<>();

        names.add("Ivan");
        names.add("Petr");
        names.add("Maria");
        names.add("Ivan");

        TreeSet<String> names_uniq = new TreeSet<>(names);
        Iterator iterator = names_uniq.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }




        /*
        Collections (Коллекции)
        - List (Списки)
        Реализации в Java:
        ArrayList, LinkedList, (Queues: Stack, Queue)
        - Set (Множества)
        Реализации в Java:
          неупорядочены, уникальные
         TreeSet, HashSet
        - Map (словари - ключ-значения)
          Реализации:
          Hashtable, HashMap, TreeMap
         */

        // Hashtable
        // все методы synchronized (медленнее)
        // null нельзя

        Hashtable<String,Integer> phones = new Hashtable<>();
        phones.put("Ivan",34534545);
        phones.put("Petr",6786786);
        phones.put("Maria",34523412);

        Set<Map.Entry<String,Integer>> set = phones.entrySet();
        for(Map.Entry<String,Integer> s: set) {
            System.out.println(s.getKey() + "; "+s.getValue());
        }

        // HashMap
        // no synchronized (быстрее)
        // нельзя использовать в многопоточном приложении
        // null можно

        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("key1","value1");
        hashMap1.put("key2","value2");
        hashMap1.put("key3","value3");


        HashMap<String,String> hashMap2 = new HashMap<>();
        hashMap2.put("key4","value4");
        hashMap2.put("key5","value5");
        hashMap2.put("key6","value6");

        hashMap1.putAll(hashMap2);

        Set<Map.Entry<String,String>> set2 = hashMap1.entrySet();
        for(Map.Entry<String,String> s: set2) {
            System.out.println(s.getKey() + "; "+s.getValue());
        }


        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Monday");
        days.put(7,"Wednesday");
        days.put(1,"Sunday");

        System.out.println(days.keySet());
        System.out.println(days.values());

        class User implements Comparable<User> {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                return this.name.compareTo(o.name);
            }
        }

        Comparator<User> rule = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                //return o1.name.compareTo(o2.name);
                return o1.age-o2.age;
            }
        };
        TreeMap<User,String> users = new TreeMap<>();
        users.put(new User("Ivan",15),"Math");
        users.put(new User("Maria",14),"CS");

        Set<Map.Entry<User,String>> ext = users.entrySet();
        for(Map.Entry<User,String> u: ext) {
            System.out.println(u.getKey().getAge() + "; "+
                    u.getKey().getName() + "; "+u.getValue());
        }

    }
}
