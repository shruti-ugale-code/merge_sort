import java.util.Arrays;

public class merge_sort_inplace {


        public static void main(String[] args) {
            int[] arr={5,4,6,7,8,9};
            sort(arr,0,arr.length);
            System.out.println(Arrays.toString(arr));


        }
        public static void sort(int[] mix,int s,int e){
            if((e-s)==1){
                return ;
            }

            int mid=(s+e)/2;
            sort( mix,s,mid);

           sort(mix,mid,e);

             merge(mix,s,mid,e);

        }
        public static void merge(int[] mix,int s,int m,int e){
            
           int  temp[]=new int[e-s];
            int i=s;
            int j=m;
            int k=0;

            while(i< m && j<e){
                if(mix[i]<mix[j]){
                    temp[k]=mix[i];
                    i++;

                }else{
                    temp[k]=mix[j];
                    j++;

                }
                k++;



            }
            while (i<m){
                temp[k]=mix[i];
                i++;
                k++;
            }
            while (j<e){
                temp[k]=mix[j];
                j++;
                k++;
            }
            for (int l = 0; l <temp.length ; l++) {
                mix[s+l]=temp[l];

            }
        }



    }

