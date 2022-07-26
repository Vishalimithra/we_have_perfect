package mini_project;
import java.util.*;
public class User {
	void cartitems(String items) {
		System.out.println("the cart items are:");
		ArrayList<String> li=new ArrayList<String>();
		li.add(items);
		Iterator<String> it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	void occasion() {
		Scanner sc=new Scanner(System.in);
		User u=new User();
		System.out.println("CHOOSE YOUR OCCASION:");
		System.out.println("1.WEDDING");
		System.out.println("2.RECEPTION");
		System.out.println("3.MEHENDI");
		System.out.println("4.PARTY");
		
		System.out.println("enter the occasion");
		int choose=sc.nextInt();
		switch(choose) 
		{
		case 1:
			u.wedding();	
			break;
	case 2:
		u.reception();
		break;
	case 3:
		u.mehandi();
		break;
	case 4:
		u.party();
		break;
	default:
		System.out.println("choose occasion");
		break;
	}
	}
		void wedding() {
			System.out.println("CHOOSE YOUR WEDDING DRESS STYLE");
			Scanner sc=new Scanner(System.in);
			User w=new User();
			//array concept
			//String[] style= {"KURTA","SHERWANI","KURTA PAJAMA","DHOTI SET"};
			//System.out.println("KURTA,SHERWANI,KURTA PAJAMA,DHOTI SET");
			ArrayList<String> l=new ArrayList();
			l.add("kurta");
			l.add("sherwani");
			l.add("kurta pajama");
			l.add("dhotin set");
			Iterator<String> it=l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			int i;
			String styles="";
			String size="";
			String color="";
			int d=0;
			//for( i=0;i<style.length;i++) {
				//System.out.println(style[i]);
			//}
			System.out.println("enter the style:");
			 styles=sc.nextLine();
			if(styles.equals("kurta")) 
			{
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("white,lightpink,lightblue,beige");
			 color=sc.nextLine();
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
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			w.cartitems(selected);
			}
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			if(styles.equals("sherwani")) 
			{
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("red,pink,blue,orange");
			 color=sc.nextLine();
			System.out.println("enter the dates needed(maxium 3 days):");	
			System.out.println("RENT FOR ONE DAY:3000");
			int days=sc.nextInt();
			int j=1;
			if(days<=3) {
				while(j<=days) {
					d=3000*j;
					j++;
				}	
			}
			else {
				System.out.println("only 3 days");}
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			w.cartitems(selected);
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			}
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			if(styles.equals("dhotin set")) 
			{
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("red,pink,blue,orange,green,violet");
			 color=sc.nextLine();
			System.out.println("enter the dates needed(maxium 3 days):");	
			System.out.println("RENT FOR ONE DAY:1000");
			int days=sc.nextInt();
			int j=1;
			if(days<=3) {
				while(j<=days) {
					d=1000*j;
					j++;
				}	
			}
			else {
				System.out.println("only 3 days");
			}
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			w.cartitems(selected);
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			}
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			 if(styles.equals("kurta pajama")) 
			{
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("white,skyblue,lightpink");
			 color=sc.nextLine();
			System.out.println("enter the dates needed(maxium 3 days):");	
			System.out.println("RENT FOR ONE DAY:4000");
			int days=sc.nextInt();
			int j=1;
			if(days<=3) {
				while(j<=days) {
					d=4000*j;
					j++;
				}	
			}
			else {
				System.out.println("only 3 days");
			}
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			w.cartitems(selected);
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			}
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
		}
		
		
		void reception() {
			System.out.println("CHOOSE YOUR RECEPTION DRESS STYLE");
			Scanner sc=new Scanner(System.in);
			User r=new User();
			//array concept
			String[] style= {""};
			int i;
			String styles="";
			String size="";
			String color="";
			int d=0;
			String[] dress_style= {"coat-suit","designed kurhas"};
			for( i=0;i<dress_style.length;i++) {
				System.out.println(dress_style[i]);
			}
			System.out.println("enter the style:");
			 styles=sc.nextLine();
			if(styles.equals("caot-suite")) {
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("white,black,red,brown,lightblue,beige");
			 color=sc.nextLine();
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
			else
				System.out.println("only 3 days");
			//String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			r.cartitems(selected);
			}
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			if(styles.equals("designed kurhas")) {
				System.out.println("enter the size:");	
				System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
				size=sc.nextLine();
				System.out.println("enter the color:");	
				System.out.println("brown,black,white");
				 color=sc.nextLine();
				System.out.println("enter the dates needed(maxium 3 days):");	
				System.out.println("RENT FOR ONE DAY:6000");
				int days=sc.nextInt();
				int j=1;
				if(days<=3) {
					while(j<=days) {
						d=6000*j;
						j++;
					}	
				}
				else
					System.out.println("only 3 days");
				//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				System.out.println(selected);
				r.cartitems(selected);
				}
				//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			
		}
		void mehandi() {
			System.out.println("CHOOSE YOUR MEHANDI DRESS STYLE");
			Scanner sc=new Scanner(System.in);
			User m=new User();
			//array concept
			String[] style= {""};
			int i;
			String styles="";
			String size="";
			String color="";
			int d=0;
			String[] dress_style= {"pathani suit","parth","jaypore"};
			for( i=0;i<dress_style.length;i++) {
				System.out.println(dress_style[i]);
			}
			System.out.println("enter the style:");
			 styles=sc.nextLine();
			if(styles.equals("pathani suit")) {
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the color:");	
			System.out.println("white,black,red,brown,lightblue,beige,green,darkgreen");
			 color=sc.nextLine();
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
			else
				System.out.println("only 3 days");
			//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			m.cartitems(selected);
			}
			if(styles.equals("jaypore")) {
				System.out.println("enter the size:");	
				System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
				size=sc.nextLine();
				System.out.println("enter the color:");	
				System.out.println("white,black,red,brown,lightblue,beige,green,darkgreen");
				 color=sc.nextLine();
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
				else
					System.out.println("only 3 days");
				//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				System.out.println(selected);
				m.cartitems(selected);
				}
			if(styles.equals("parth")) {
				System.out.println("enter the size:");	
				System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
				size=sc.nextLine();
				System.out.println("enter the color:");	
				System.out.println("white,black,red,brown,lightblue,beige,green,darkgreen");
				 color=sc.nextLine();
				System.out.println("enter the dates needed(maxium 3 days):");	
				System.out.println("RENT FOR ONE DAY:5000");
				int days=sc.nextInt();
				int j=1;
				if(days<=3) {
					while(j<=days) {
						d=2000*j;
						j++;
					}	
				}
				else
					System.out.println("only 3 days");
				//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				System.out.println(selected);
				m.cartitems(selected);
				}
		}
		void party() {
			System.out.println("CHOOSE YOUR PARTY DRESS STYLE");
			Scanner sc=new Scanner(System.in);
			User p=new User();
			//array concept
			String[] style= {""};
			int i;
			String styles="";
			String size="";
			String color="";
			String shrit_color="";
			String pant_color="";
			int d=0;
			String[] dress_style= {"fromal set","coat-suit"};
			for( i=0;i<dress_style.length;i++) {
				System.out.println(dress_style[i]);
			}
			System.out.println("enter the style:");
			 styles=sc.nextLine();
			if(styles.equals("formal set")) {
			System.out.println("enter the size:");	
			System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
			size=sc.nextLine();
			System.out.println("enter the shrit_color:");	
			System.out.println("white,black,red,brown,lightblue,beige,green,darkgreen");
			 shrit_color=sc.nextLine();
			 System.out.println("enter the pant_color:");	
			 System.out.println("black,grey,lightblue,beige");
			 pant_color=sc.nextLine();
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
			else
				System.out.println("only 3 days");
			
			String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   pant_color of the dress is: "+pant_color+"   shrit_color of the dress is: "+shrit_color+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
			System.out.println(selected);
			p.cartitems(selected);
			}
			if(styles.equals("caot-suite")) {
				System.out.println("enter the size:");	
				System.out.println("XS,S,MEDIUM,LARGE,EXTRALARGE");
				size=sc.nextLine();
				System.out.println("enter the color:");	
				System.out.println("white,black,red,brown,lightblue,beige");
				 color=sc.nextLine();
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
				else
					System.out.println("only 3 days");
				//System.out.println("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				String selected=("style of the dress is: "+styles+"   size of the dress is: "+size+"   color of the dress is: "+color+"    Final rate for rent is: "+d);
				System.out.println(selected);
				p.cartitems(selected);
				}
		}
		
public static void main(String[] args) {
		System.out.println("Hello handsome");
		Scanner sc=new Scanner(System.in);
		User u=new User();
		u.occasion();
	}

}
