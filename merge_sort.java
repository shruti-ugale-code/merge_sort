import java.util.Arrays;

public class merge_sort {

    public static void main(String[] args) {
        int[] arr={5,4,6,7,8,9};
       arr=sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] sort(int[] mix){
        if(mix.length==1){
            return mix;
        }

         int mid=mix.length/2;
        int[] fir=sort( Arrays.copyOfRange(mix,0,mid));
        int[] sec=sort(Arrays.copyOfRange(mix,mid,mix.length));

         return merge(fir,sec);

    }
    public static int[] merge(int[] fir,int[] sec){
        int[] mix=new int[fir.length+sec.length];
        int i=0;
        int j=0;
        int k=0;

        while(i< fir.length && j< sec.length){
            if(fir[i]<sec[j]){
                mix[k]=fir[i];
                i++;

            }else{
                mix[k]=sec[j];
                j++;

            }
            k++;



        }
        while (i<fir.length){
            mix[k]=fir[i];
            i++;
            k++;
        }
        while (j<sec.length){
            mix[k]=sec[j];
            j++;
            k++;
        }
        return mix;
    }



}
