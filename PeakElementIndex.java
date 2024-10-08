class PeakElement{
    public int findPeakelement(int arr[], int low, int high, int n){
        int mid=low+(high-low)/2;


        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
        { 
            return mid;
        }

    else if(mid>0 && arr[mid-1]> arr[mid]){
        return findPeakelement(arr, low, mid-1, n);
    }
    else{
        return findPeakelement(arr, mid+1, high, n);
    }
}




public static void main(String[] args) {
    int arr[]={0,6,8,5,7,9};
    int n=arr.length;

    PeakElement p = new PeakElement();
    System.out.println("Peak element index:");
    int peakIndex = p.findPeakelement(arr,0,n-1,n);
    System.out.println(peakIndex);
}
}