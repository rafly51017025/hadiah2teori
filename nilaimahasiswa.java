/**
 * @(#)nilaimahasiswa.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */


import java.util.Scanner;
public class nilaimahasiswa
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		char nhuruf;
		String nama;
		double ntugas1,ntugas2,ntugas3,nmid,nfinal;
		double nrata2tugas;
		double nakhir;
		
		System.out.print("masukkan nama         : ");
		nama=in.nextLine();
		System.out.print("masukkan nilai tugas 1: ");
		ntugas1=in.nextInt();
		System.out.print("masukkan nilai tugas 2: ");
		ntugas2=in.nextInt();
		System.out.print("masukkan nilai tugas 3: ");
		ntugas3=in.nextInt();
		System.out.print("masukkan nilai mid    : ");
		nmid=in.nextInt();
		System.out.print("masukkan nilai final  : ");
		nfinal=in.nextInt();
		System.out.println();
		
		nrata2tugas=(ntugas1+ntugas2+ntugas3)/3;
		nakhir=(nrata2tugas*0.3)+(nmid*0.3)+(nfinal*0.4);
		
		if(nakhir>=80)
		{
			nhuruf='A';
		}
		else if(nakhir>=60 && nakhir<=79.9)
		{
			nhuruf='B';
		}
		else if(nakhir>=50 && nakhir<=59.9)
		{
			nhuruf='C';	
		}
		else if(nakhir>=40 && nakhir<=49.9)
		{
			nhuruf='D';
		}
		else
		{
			nhuruf='E' ;
		}
		
		System.out.println("nama       : "+nama);
		System.out.println("nilai akhir: "+nakhir);
		System.out.println("nilai huruf: "+nhuruf);
	
	
		
		
		
	}
}