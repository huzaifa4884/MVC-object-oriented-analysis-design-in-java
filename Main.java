package sort_MVC;



import sort_MVC.Sort_controller;
import sort_MVC.Sort_View;
import sort_MVC.sortModel;



public class Main {

	public static void main(String[] args) {		
		
				// TODO Auto-generated method stub
				sortModel model = new sortModel();
				Sort_View view = new Sort_View();
				Sort_controller controller = new Sort_controller(model,view);
				controller.InputFtn();
				int arr[] = null;
				controller.OutputFtn(arr);
	}

}
