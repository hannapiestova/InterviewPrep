import java.util.*;

class Sample {
    private String barcode;
    private int id;

    public Sample(String barcode, int id){
        this.barcode=barcode;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setBarcode(String barcode){
        this.barcode=barcode;
    }

    public String getBarcode(){
        return barcode;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "barcode='" + barcode + '\'' +
                ", id=" + id +
                '}';
    }
}

class sampleComparator implements Comparator<Sample> {

    @Override
    public int compare(Sample o1, Sample o2) {
        if(o1.getBarcode().equals(o2.getBarcode())){
            return o2.getId()-o1.getId();
        }
       return o2.getBarcode().compareToIgnoreCase(o1.getBarcode());
    }
}

public class Test
{

    public static void main(String[] args) {
        Sample s1 = new Sample("test1", 1);
        Sample s2 = new Sample("test15", 2);
        Sample s3 = new Sample("test15", 3);
        Sample s4 = new Sample("test6", 4);
        Sample s5 = new Sample("something", 5);


        List<Sample> list = new LinkedList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        List<Sample> list1 = new ArrayList<>();

        for( Sample each : list ){
            list1.add(each);
        }
        System.out.println(list1);
        Collections.sort(list1, new sampleComparator());
        System.out.println(list1);


        for(int i =0 ;i<list1.size(); i++){
            if(!list.get(i).getBarcode().startsWith("test")){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);

        List<Integer> ids = new ArrayList<>();
        for(Sample each : list1){
            ids.add(each.getId());
        }


        List<Integer>testid = new ArrayList<>();
        for(Sample each : list1){
            testid.add(Integer.parseInt(each.getBarcode().substring(4)));
        }
        Collections.sort(ids);
        Collections.sort(testid);
        list1.add(new Sample("test"+(testid.get(testid.size()-1)+1), (ids.get(ids.size()-1))+1));
        System.out.println(list1);

        Map<String, Integer> map = new HashMap<>();
        for(Sample each : list1){
            map.put(each.getBarcode(), each.getId());

        }
        System.out.println(map);



    }



}
