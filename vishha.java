package com.pro.guvi;

import java.util.Scanner;

public class nlog 
{
     static Scanner in=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int k=in.nextInt();
		int stack[]=new int[100];
		
		for (int i = 0; i < stack.length; i++) 
		{
			stack[i]=in.nextInt();
			
			int temp=0;
			for (int j = 0; j < stack.length; j++) 
			
				for (int j2 = i+1; j2 < stack.length; j2++) 
				{
					if(stack[j]==stack[j2])
					{
			    int count=temp+1;
			    stack[j]=count;
					
					}
					
		}
		
		

	}
		for (int i = 0; i < stack.length; i++)
		{
			System.out.println(stack[i]);
		}

}
}
