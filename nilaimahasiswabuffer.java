/**
 * @(#)nilaimahasiswabuffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */


import java.io.*;
public class nilaimahasiswabuffer
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		char nhuruf;
		String nama;
		double ntugas1,ntugas2,ntugas3,nmid,nfinal;
		double nrata2tugas;
		double nakhir;
	
		System.out.println("inputan Buffered Reader");
		System.out.print("masukkan nama         : ");
		nama=in.readLine();
		System.out.print("masukkan nilai tugas 1: ");
		ntugas1=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai tugas 2: ");
		ntugas2=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai tugas 3: ");
		ntugas3=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai mid    : ");
		nmid=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai final  : ");
		nfinal=Integer.parseInt(in.readLine());
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