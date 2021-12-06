 public static void reverse(int[] a){
    // write your code here
    for(int i=0,j=a.length-1;i<j;i++,j--)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
  }