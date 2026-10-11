class jaggedArray 
{
    int arr[][] = {{1,2},{3,4,5,6},{7,8,9}};
    //int arr[][] = new int[3][];
    int i, j;
    // jaggedArray()
    // {
    //     arr[0] = new int[] { 1, 2 };
    //     arr[1] = new int[] { 3, 4, 5, 6 };
    //     arr[2] = new int[] { 7, 8, 9 };
    // }
    
    void display()
    {
        System.out.println("Jagged array elements are");
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j <arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        jaggedArray ja = new jaggedArray();
        ja.display();
    }
}
