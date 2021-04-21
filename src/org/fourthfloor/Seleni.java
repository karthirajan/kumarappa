package org.fourthfloor;

import java.util.Scanner;



public class Seleni {

	public class LoopFunction {

		public void postPreMethod(){
			//		int i=10;
			//		//i++;
			//		System.out.println(i++);
			//		
			//		System.out.println(i--);

			int a=10;
			System.out.println(a++);

			int b=20;
			System.out.println(b++);

			System.out.println(a);
			System.out.println(b);

			System.out.println(++a);
			System.out.println(--b);



		}


		public void  WhileMethod()
		{
			int i =5;
			while (i<10)  //condition
			{
				System.out.println(i); //logic
				i++;                    //increment
			}
		}


		public void  doWhileMethod()
		{
			int i =5;                   //assign
			do 
			{
				System.out.println(i); //logic
				i++;                    //increment
			}
			while(i<1);                  //condition check point
		}

		public void forLoop()
		{
			//assign;       condition;         operation
			for (int i=5;        i<20;              i++)
			{
				System.out.println(i);
			}
		}

		public void switchMethod()
		{
			Scanner s =new Scanner(System.in);
			System.out.println("enter");
			String days = s.nextLine();
			
			//String days = "mon";
			switch(days)
			{
			case"mon":
				System.out.println("working day");
				System.out.println("week start");
				break;
				
				
			case"sun":
				System.out.println("hoilday");
				break;
				
				
			case "fir":
				System.out.println("weekend");
				break;
				default:System.out.println("enter mon sun fri");
		
			}
		}

		public void continuesystemexit()
		{
		
			for(int a=5; a<20; a++)
			{
				if(a==8)
				{
					//break;          //overall iteration will break
					continue;       //current iteration break
					//System.exit(0);   // terminate your jvm
				}
				System.out.println(a);
			}
			System.out.println("break done a==8");
		}



		public void main(String[] args) {
			// TODO Auto-generated method stub

			LoopFunction obj = new LoopFunction();
			//obj.postPreMethod();
			//obj.WhileMethod();
			//obj.doWhileMethod();
			//obj.forLoop();
			obj.switchMethod();
			//obj.continuesystemexit();
			//obj.switchMethod();
		}
	}

}
