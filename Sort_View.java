package sort_MVC;

import javax.swing.JOptionPane;

public class Sort_View {

		public int[] getinput()
		{
			int j =1;
			String temp = "";
			
			String in = JOptionPane.showInputDialog("Enter the date here saparated by comas ,");
			
			//finding the size of array here
			for(int i =0; i < in.length(); i++)
			{
				if(in.charAt(i) == ',')
				{
					j++;
				}
			}
				
			//declaring array
			int[] arr  = new int[j];
			j = 0;
			//throwing the String to the array
			System.out.print(in.length()+"   ::::  ");
			for (int i = 0; i < in.length(); i++)
			{
				
				if(in.charAt(i) == ','|| i == (in.length() - 1))
				{
					if(i == (in.length() - 1))
					{
						temp = temp + in.charAt(i);
					}
					arr[j] = Integer.valueOf(temp);
					temp = "";
					j++;
				}
				else
				{
					temp = temp + in.charAt(i);
				}
			}
			return arr;
		}
		
		public void OutPut(int arr[])
		{
			JOptionPane.showConfirmDialog(null, "Sort Complete watch the ouptutin console");
			for(int i =0; i < arr.length; i++)
			{
				System.out.print(arr[i]+" , ");
			}
		}
}
