package sort_MVC;

public class Sort_controller {
	private sortModel model;
	private Sort_View view;
	
	public Sort_controller(sortModel model , Sort_View view)
	{
		this.model = model;
		this.view = view;
	}
	
	public int[] InputFtn()
	{
		
		int arr[] = view.getinput();
		int arr1[] = model.insertionSort(arr);
		return arr1;
		
	}
	
	public void OutputFtn(int arr[])
	{
		view.OutPut(arr);
	}

}
