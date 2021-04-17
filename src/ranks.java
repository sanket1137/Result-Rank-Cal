	import java.util.Scanner;
public class ranks {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n,ns,tm,pm,c,r,temp,cq=0,t=0,i=0,j,s;

			Scanner sc=new Scanner(System.in);
				System.out.println("\n**************************************************************************************************");
				System.out.println("                                  ......RESULT......");
				System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("\n\tEnter the Number of Students");	 n=sc.nextInt();
			System.out.println("\n\tEnter the Number of Subjects");  ns=sc.nextInt();
			System.out.println("\n\tEnter the TOTAL Marks");		 tm=sc.nextInt();  temp=tm*ns;
			System.out.println("\n\tEnter the Passing Marks");		 pm=sc.nextInt();

			String sname[]=new String[n];
			String subn[]=new String[ns];
			int sheet[][]=new int[n][ns];
			int tp[]=new int[n];
			String rg[][]=new String[n][2];
			float total[]=new float[n];
			float ran[]=new float [n];

			for(c=0;c<ns;c++){
							System.out.println("\tName of Subject"+(c+1)+"\t");
							subn[c]=sc.next();
							}

				for(c=0;c<ns;c++){
					if(c==0){
						System.out.print("\nStudent Name");
					}
					
								}
								
				for(r=0;r<n;r++){
				System.out.println("\n");
				sname[r]=sc.next();

				for(c=0;c<ns;c++){

								
									System.out.print("\t"+subn[c]+":\t");
									
									sheet[r][c]=sc.nextInt();
									
										
									
									if(sheet[r][c]>tm){
										System.out.print("Entered Marks Cant be more then Total Marks\n\t"+subn[c]+":\t");
										sheet[r][c]=sc.nextInt();
														}
									 if(sheet[r][c]<=tm){
															t=t+sheet[r][c];
															tp[r]=t;
															total[r]=(tp[r]*100 / temp);
															
															
														}
														if(r==n-1 && c==ns-1)
														{
															System.out.println("Insertion is Done");
														}
														
								}
								
								t=0;
								
								}
	//for Grade and total						
	/*Printing Heading	*/	System.out.print("Name");
									for (c=0;c<ns;c++){
										
										System.out.print("\t"+subn[c]);}
									
	/*Printing Heading	*/				System.out.print("\tTOTAL\tPERCENTAGE\tRESULT  GRADE\tRANK");
							
			ran[i]=total[n];
			int small=0,large=n-1;
			boolean flag=true;
			
			for(i=0;i<n;i++){
				if (flag)
					ran[i]=total[large--];
				else
					ran[i]=total[small++];
				
				flag=!flag;
				r=i	;
		
	
	/*Display	*/				for(r=0;r<n;r++){
											System.out.print("\n"+sname[r]);
										for(c=0;c<ns;c++){
												if(c<ns ){
													if(sheet[r][c]<pm){
														rg[r][0]="FAIL";
														cq=1;
														System.out.print("\t*"+sheet[r][c]);
													
													}
													else if( cq==0){
														rg[r][0]="PASS";
													System.out.print("\t"+sheet[r][c]);}else if(sheet[r][c]>=pm){
														System.out.print("\t"+sheet[r][c]);}
													}
												
										}System.out.print("\t"+tp[r]);
										
										System.out.print("\t   "+total[r]+"%");
										
										System.out.print("\t"+rg[r][0]);
									
											if (tp[r]>80 && rg[r][0]!="FAIL"){
												rg[r][1]="A";
												
											}else if(tp[r]>60 && tp[r]<=80 && rg[r][0]!="FAIL"){
												rg[r][1]="B";
												
											}else if(tp[r]>40 && tp[r]<=60 && rg[r][0]!="FAIL"){
												rg[r][1]="C";
												
											}else if(tp[r]>35 && tp[r]<=40 && rg[r][0]!="FAIL"){
												rg[r][1]="D";
												}
												else{
													rg[r][1]="Fail";
												}
										System.out.print("\t  "+rg[r][1]);
										
										cq=0;
										}			
			}
		}

	}

	