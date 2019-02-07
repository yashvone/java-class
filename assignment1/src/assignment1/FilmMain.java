package assignment1;

import java.util.*;

class film{
    String name, lang, lead, cat;
    int dur;
    film(){
        name=""; lang=""; lead=""; cat="";
        dur=0;
    }    
    film(String a, String b, String c, String d, int x){
        name=a; lang=b; lead=c; cat=d;
        dur=x;
    }
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of film: ");
        name = s.nextLine();
        System.out.println("Enter the language of film: ");
        lang = s.nextLine();
        System.out.println("Enter name of lead: ");
        lead = s.nextLine();
        System.out.println("Enter Category of film: ");
        cat = s.nextLine();
        System.out.println("Enter duration of film(in mins.): ");
        dur = s.nextInt();
    }
    void display(){
        System.out.println("Name: "+name+"\nLanguage: "+lang+"\nLead: "+lead+"\nCategory: "+cat+"\nDuration: "+dur);
    }
}
        
public class FilmMain {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Vector v = new Vector();
        while(true){
            int ch, sh = 0;
            Vector d = new Vector();
            System.out.println("1. Add a film\n2. Run functions\n3. Exit");
            ch = i.nextInt();
            Iterator<film> itr = v.iterator();
            switch(ch){
                case 1: film o = new film();
                        o.input();
                        v.addElement(o);
                        break;
                case 2: while(itr.hasNext()){
	                        film e = itr.next();
	                        if (e.lang.toLowerCase().equals("tamil") && e.lead.toLowerCase().equals("rajni"))
	                            e.display();
	                        else if (e.cat.toLowerCase().equals("comedy")){
	                            e.display();
	                        }
	                        else if (e.lang.toLowerCase().equals("english") && e.lead.toLowerCase().equals("arnold")) {
	                        	d.addElement(e);
	                        	if (sh == 0) 
	                				sh=e.dur;
	                			else if(e.dur<sh)
	                				sh=e.dur;
	                        }
	                            
                        }
                		Iterator<film> shortest = d.iterator();
                		while(shortest.hasNext()) {
                			film x = shortest.next();
                			if (sh == x.dur)
                				x.display();
                		}
                        break;
                case 3: System.exit(0);
                		
            }
        }
    }
    
}
