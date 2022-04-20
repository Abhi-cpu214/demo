import java.util.*;
/*class ProgrammingLang
{
private String language;
public String getlang()
{
return language;
}
public void setlang(String lang)
{
language = lang;
}
}



class Developer
{
List <ProgrammingLang> language;
private String name;
public String getname()
{
return name;
}
public void setname(String name)
{
this.name = name;
}
public List<ProgrammingLang> getlanguage()
{
return language;
}
public void setlanguage(List<ProgrammingLang> language)
{
this.language = language;
}

}



class student
{
public static void main(String args[])
{
Developer d = new Developer();
d.setname("kuchbhi");
ProgrammingLang l = new ProgrammingLang();
l.setlang("java");
List<ProgrammingLang> list1 = new ArrayList<ProgrammingLang>();
list1.add(l);
d.setlanguage(list1);
System.out.println(d.getname());
System.out.println(l.getlang());


}
}*/

/*class student
{
    public static void main (String[] args)
    {        
      
      int[] a;
         
      
      a = new int[10];
      int i;
      for(i=0;i<a.length;i++)
      {
         a[i]=(i+1)*10;
         System.out.println(a[i]);

      }
    }
}*/

/*class student{
   public static void main (String[] args)
   {
     String[] arr = { "hello", "Zee", "Tech" };
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
   }
}*/
/*class student{
   public static void main(String[] args)
   {
      int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  

n=sc.nextInt();  

int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  

array[i]=sc.nextInt();  
}  
System.out.print("Enter the number of elements you want to store: "); 
int num=nextInt();
for(int i=0;i<n;i++)
{
   if(array[i]==num)
   System.out.println("Yes");  
}
   }
}  */

/*class student{
   public static void main(String[] args)
   {
      char[] ch= {'Z', 'e', 'e', 'T', 'e','c','h'};  
        for (int i=0; i<ch.length; i++) {  
        if(ch[i]=='c')
        {
           System.out.println(i);
        }  
        }  
   }
}*/

/*class student{
   public static void main(String[] args)
   {
      int count=0;
      char[] ch= {'Z', 'e', 'e', 'T', 'e','c','h'};  
        for (int i=0; i<ch.length; i++) {  
        if(ch[i]=='e')
        {
           count++;
        }  
      
        }  
        System.out.println(count);
   }
}*/

/*class student{
   public static void main(String[] args)
   {
      
      char[] ch= {'Z', 'e', 'e', 'T', 'e','c','h'};  
        for (int i=0; i<ch.length; i=i+2) {  
           System.out.println(ch[i]);
        }  
        
   }
}*/
/*class student{
   public static void main(String[] args)
   {
      
      char[] ch= {'Z', 'e', 'e', 'T', 'e','c','h'};  
        for (int i=0; i<ch.length; i=i+1) { 
           if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
           {
              ch[i]='Z';
           }
        }
        for (int i=0; i<ch.length; i=i+1) { 
           System.out.println(ch[i]);
        }  
        
   }
}*/

    

/*public class student {

	
	public static int stringCompare(String str1, String str2)
	{

		int l1 = str1.length();
		int l2 = str2.length();
		int lmin = Math.min(l1, l2);

		for (int i = 0; i < lmin; i++) {
			int str1_ch = (int)str1.charAt(i);
			int str2_ch = (int)str2.charAt(i);

			if (str1_ch != str2_ch) {
				return str1_ch - str2_ch;
			}
		}

		
		if (l1 != l2) {
			return l1 - l2;
		}

		else {
			return 0;
		}
	}

	
	public static void main(String args[])
	{
		String string1 = new String("Abhishek");
		String string2 = new String("Abhi");
		

		
		System.out.println("Comparing "+ stringCompare(string1, string2));

	}
}*/
class student {
  public static void findFile() throws IOException {
    
    File newFile=new File("test.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try{
      findFile();
    } catch(IOException e){
      System.out.println(e);
    }
  }
}


