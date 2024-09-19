public class Main{
public static void main(String arg[]){
Artist a=new Artist();
a.display();
Artwork art1=new Artwork("Shein",2024,"lisa");
Artwork art2=new Artwork("exhibit",2023);
art2=setArtist("unknown artist");
System.out.println(art1.name);
System.out.println(art1.title);
System.out.println(art1.artist);
System.out.println(art2.name);
System.out.println(art2.title);
System.out.println(art2.getartist());}


 


 











}