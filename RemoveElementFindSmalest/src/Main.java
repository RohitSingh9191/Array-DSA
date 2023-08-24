import java.util.ArrayList;
public class Main {
    public static void find(String value,int t){
        System.out.println("Element = "+value);
        int n=value.length();
        char newValue[]=value.toCharArray();
        ArrayList<Integer> intarr=new ArrayList<>();

        for(int j=0;j<n;j++){
            char arr[]=new char[n-1];
            int z=0;
            for(int i=0;i<n;i++){
                if(j==i){
                }else{
                    arr[z]=newValue[i];
                    z++;
                }
            }
            String num=new String(arr);
            Integer number=Integer.parseInt(num);
             intarr.add(number);
        }
        System.out.println(intarr);
      Integer min=  intarr.stream().min((x,y)->x.compareTo(y)).get();

      if(t>1){
          String s=String.valueOf(min);
          t--;
          find(s,t);
      }else{
          System.out.println("Minimun value= "+min);
      }

    }
    public static void main(String[] args) {

       find("1514234",2);

    }
}