package mini_project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Women 
{
	public void cartitems(String items) {
		System.out.println("the cart items are:");
		Women mm=new Women();
		ArrayList<String> li=new ArrayList<String>();
		li.add(items);
		Iterator<String> it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	void occassion()	
{
		Scanner sc=new Scanner(System.in);
		Women wo=new Women();
		System.out.println("CHOOSE YOUR OCCASION:");
		System.out.println("1.WEDDING");
		System.out.println("2.RECEPTION");
		System.out.println("3.MEHENDI");
		System.out.println("4.PARTY");
		
		System.out.println("ENTER THE OCCASSION:");
		int choose=sc.nextInt();
		switch(choose) 
		{
	case 1:
			wo.wedding();	
			break;
	case 2:
		wo.reception();
		break;
	case 3:
		wo.mehandi();
		break;
	case 4:
		wo.party();
		break;
	default:
		System.out.println("KINDLY CHOOSE OCCASSION");
		break;
		}
}	
	void wedding() {
		System.out.println("CHOOSE YOUR WEDDING DRESS STYLE");
		Scanner sc=new Scanner(System.in);
		Women w=new Women();
		ArrayList<String> l=new ArrayList();
		l.add("silk saree");
		l.add("half-saree");
		l.add("wedding lehenga");
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int i;
		String styles="";
		String pattern="";
		String color="";
		String top_color="";
		String match_color="";
		String size="";
		int d=0;
		System.out.println("ENTER THE STYLE YOU WANTED:");
		 styles=sc.nextLine();
		if(styles.equals("silk saree")) 
		{
		System.out.println("enter the pattern:");	
		System.out.println("patch,flower,double-color,slimmer,border-pattern");
		pattern=sc.nextLine();
		System.out.println("enter the color you wanted:");	
		System.out.println("red,voilet,yellow,skyblue");
		 color=sc.nextLine();
		System.out.println("enter the dates needed(maxium 3 days):");	
		System.out.println("RENT FOR ONE DAY:7000");
		int days=sc.nextInt();
		int j=1;
		if(days<=3) {
			while(j<=days) {
				d=7000*j;
				j++;
			}	
		}
		else {
			System.out.println("only 3 days");
		}
		String selected=("style of the dress is: "+styles+"pattern of the saree"+pattern+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
		//System.out.println(selected);
		w.cartitems(selected);
		}
		if(styles.equals("half-saree")) 
		{
		System.out.println("enter the pattern:");	
		System.out.println("designed,ariwork");
		pattern=sc.nextLine();
		System.out.println("enter the color you wanted:");	
		System.out.println("white,lightpink,lightblue,beige");
		 color=sc.nextLine();
		 System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
		 System.out.println("enter the color_matching you wanted:");	
			System.out.println("red,pink,orange");
			 match_color=sc.nextLine();
		System.out.println("enter the dates needed(maxium 3 days):");	
		System.out.println("RENT FOR ONE DAY:9000");
		int days=sc.nextInt();
		int j=1;
		if(days<=3) {
			while(j<=days) {
				d=9000*j;
				j++;
			}	
		}
		else {
			System.out.println("only 3 days");
		}
		String selected=("style of the dress is: "+styles+"size of dress"+size+"   color of the dress is: "+color+"match_color of dress "+match_color+"    Final rate for rent is: "+d);
		//System.out.println(selected);
		w.cartitems(selected);
		}
		if(styles.equals("wedding lehenga")) 
		{
		System.out.println("enter the pattern:");	
		System.out.println("designed,ariwork");
		pattern=sc.nextLine();
		System.out.println("enter the top color you wanted:");	
		System.out.println("white,lightpink,lightblue,beige");
		 top_color=sc.nextLine();
		 System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
		 System.out.println("enter the color_matching you wanted:");	
			System.out.println("red,pink,orange");
			 match_color=sc.nextLine();
		System.out.println("enter the dates needed(maxium 3 days):");	
		System.out.println("RENT FOR ONE DAY:10000");
		int days=sc.nextInt();
		int j=1;
		if(days<=3) {
			while(j<=days) {
				d=10000*j;
				j++;
			}	
		}
		else {
			System.out.println("only 3 days");
		}
		String selected=("style of the dress is: "+styles+"size of top"+size+"   top color of the dress is: "+top_color+"match_color of dress "+match_color+"    Final rate for rent is: "+d);
		//System.out.println(selected);
		w.cartitems(selected);
		}
		
	}
void reception() {
	System.out.println("CHOOSE YOUR RECEPTION DRESS STYLE");
	Scanner sc=new Scanner(System.in);
	Women wr=new Women();
	ArrayList<String> l=new ArrayList();
	l.add("grandsaree");
	l.add("gown");
	l.add("lehenga");
	Iterator<String> it=l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	int i;
	String styles="";
	String pattern="";
	String color="";
	String top_color="";
	String match_color="";
	String size="";
	int d=0;
	System.out.println("ENTER THE STYLE YOU WANTED:");
	 styles=sc.nextLine();
	if(styles.equals("grandsaree")) 
	{
	System.out.println("enter the pattern:");	
	System.out.println("stones,aeriworks,embrodary");
	pattern=sc.nextLine();
	System.out.println("enter the color you wanted:");	
	System.out.println("red,voilet,yellow,skyblue,orange,green,grey,black");
	 color=sc.nextLine();
	System.out.println("enter the dates needed(maxium 3 days):");	
	System.out.println("RENT FOR ONE DAY:10000");
	int days=sc.nextInt();
	int j=1;
	if(days<=3) {
		while(j<=days) {
			d=10000*j;
			j++;
		}	
	}
	else {
		System.out.println("only 3 days");
	}
	String selected=("style of the dress is: "+styles+"pattern of the sareee"+pattern+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
	//System.out.println(selected);
	wr.cartitems(selected);
	}
	if(styles.equals("gown")) 
	{
	System.out.println("enter the pattern:");	
	System.out.println("designed,ariwork,stone,slimmer,classic");
	pattern=sc.nextLine();
	System.out.println("enter the color you wanted:");	
	System.out.println("red,green,pink,grey");
	 color=sc.nextLine();
	 System.out.println("enter the size:");	
		System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
		size=sc.nextLine();
	System.out.println("enter the dates needed(maxium 3 days):");	
	System.out.println("RENT FOR ONE DAY:15000");
	int days=sc.nextInt();
	int j=1;
	if(days<=3) {
		while(j<=days) {
			d=15000*j;
			j++;
		}	
	}
	else {
		System.out.println("only 3 days");
	}
	String selected=("style of the dress is: "+styles+"size of dress"+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
	//System.out.println(selected);
	wr.cartitems(selected);
	}
	if(styles.equals("lehenga")) 
	{
	System.out.println("enter the pattern:");	
	System.out.println("designed,ariwork");
	pattern=sc.nextLine();
	System.out.println("enter the top color you wanted:");	
	System.out.println("white,lightpink,lightblue,beige");
	 top_color=sc.nextLine();
	 System.out.println("enter the size:");	
		System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
		size=sc.nextLine();
	 System.out.println("enter the color_matching you wanted:");	
		System.out.println("red,pink,orange");
		 match_color=sc.nextLine();
	System.out.println("enter the dates needed(maxium 3 days):");	
	System.out.println("RENT FOR ONE DAY:10000");
	int days=sc.nextInt();
	int j=1;
	if(days<=3) {
		while(j<=days) {
			d=10000*j;
			j++;
		}	
	}
	else {
		System.out.println("only 3 days");
	}
	String selected=("style of the dress is: "+styles+"   top color of the dress is: "+top_color+"match_color of dress "+match_color+"    Final rate for rent is: "+d);
	//System.out.println(selected);
	wr.cartitems(selected);
	}
	
	}
	void mehandi() {
		System.out.println("CHOOSE YOUR RECEPTION DRESS STYLE");
		Scanner sc=new Scanner(System.in);
		Women wm=new Women();
		ArrayList<String> l=new ArrayList();
		l.add("saree");
		l.add("crop set");
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int i;
		String styles="";
		String pattern="";
		String color="";
		String top_color="";
		String match_color="";
		String size="";
		int d=0;
		System.out.println("ENTER THE STYLE YOU WANTED:");
		 styles=sc.nextLine();
		 if(styles.equals("saree")) 
			{
			System.out.println("enter the pattern:");	
			System.out.println("stones,aeriworks,embrodary");
			pattern=sc.nextLine();
			System.out.println("enter the color you wanted:");	
			System.out.println("yellow,skyblue");
			 color=sc.nextLine();
			System.out.println("enter the dates needed(maxium 3 days):");	
			System.out.println("RENT FOR ONE DAY:500");
			int days=sc.nextInt();
			int j=1;
			if(days<=3) {
				while(j<=days) {
					d=500*j;
					j++;
				}	
			}
			else {
				System.out.println("only 3 days");
			}
			String selected=("style of the dress is: "+styles+"pattern of the sareee"+pattern+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			wm.cartitems(selected);
			}
		 if(styles.equals("crop set")) 
			{
			System.out.println("enter the pattern:");	
			System.out.println("designed,ariwork");
			pattern=sc.nextLine();
			System.out.println("enter the top color you wanted:");	
			System.out.println("white,lightpink,lightblue,beige");
			 top_color=sc.nextLine();
			 System.out.println("enter the size:");	
				System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
				size=sc.nextLine();
			 System.out.println("enter the color_matching you wanted:");	
				System.out.println("red,pink,orange");
				 match_color=sc.nextLine();
			System.out.println("enter the dates needed(maxium 3 days):");	
			System.out.println("RENT FOR ONE DAY:2000");
			int days=sc.nextInt();
			int j=1;
			if(days<=3) {
				while(j<=days) {
					d=2000*j;
					j++;
				}	
			}
			else {
				System.out.println("only 3 days");
			}
			String selected=("style of the dress is: "+styles+"size of top"+size+"   top color of the dress is: "+top_color+"match_color of dress "+match_color+"    Final rate for rent is: "+d);
			//System.out.println(selected);
			wm.cartitems(selected);
			}
	}
	void party() {
		System.out.println("CHOOSE YOUR RECEPTION DRESS STYLE");
		Scanner sc=new Scanner(System.in);
		Women wp=new Women();
		ArrayList<String> l=new ArrayList();
		l.add("modern crop");
		l.add("full grown");
		
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int i;
		String styles="";
		String pattern="";
		String color="";
		String top_color="";
		String match_color="";
		String size="";
		int d=0;
		System.out.println("ENTER THE STYLE YOU WANTED:");
		 styles=sc.nextLine();
		if(styles.equals("modern crop")) 
		{
		System.out.println("enter the color you wanted:");	
		System.out.println("red,voilet,yellow,skyblue,orange,green,grey,black");
		 color=sc.nextLine();
		 System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
		System.out.println("enter the dates needed(maxium 3 days):");	
		System.out.println("RENT FOR ONE DAY:3400");
		int days=sc.nextInt();
		int j=1;
		if(days<=3) {
			while(j<=days) {
				d=3400*j;
				j++;
			}	
		}
		else {
			System.out.println("only 3 days");
		}
		String selected=("style of the dress is: "+styles+"size of the dress"+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
		//System.out.println(selected);
		wp.cartitems(selected);
		}
		if(styles.equals("full grown")) 
		{
		System.out.println("enter the pattern:");	
		System.out.println("designed,ariwork,stone,slimmer,classic");
		pattern=sc.nextLine();
		System.out.println("enter the color you wanted:");	
		System.out.println("red,green,pink,grey");
		 color=sc.nextLine();
		 System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
		System.out.println("enter the dates needed(maxium 3 days):");	
		System.out.println("RENT FOR ONE DAY:5000");
		int days=sc.nextInt();
		int j=1;
		if(days<=3) {
			while(j<=days) {
				d=5000*j;
				j++;
			}	
		}
		else {
			System.out.println("only 3 days");
		}
		String selected=("style of the dress is: "+styles+"size of the dress"+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
		//System.out.println(selected);
		wp.cartitems(selected);
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello PRETTY");
		Scanner sc=new Scanner(System.in);
		Women w=new Women();
		w.occassion();
	}

}
