public class Main {
    public static void main(String[] args) {

      HashMap<Integer,Integer> hm= new HashMap<>();
      hm.put(1,2);
      hm.put(2,3);
      hm.put(3,1);
        System.out.println(hm.get(1));
        System.out.println(hm.containskey(2));
        System.out.println(hm.containskey(5));
        hm.remove(2);
        System.out.println(hm.containskey(2));
        System.out.println(hm.size());
    }
}