public class Artwork{
private String title;
private int Year;
private Artist artist;
 public Artwork(String ntitle,int nyear,Artist nartist){
title=ntitle;
year=nyear;
artist=nartist;}
public Artwork(String newtitle,int newyear){
title=newtitle;
year=newyear;
//artist;}

public String getTitle(){
return title;}
public int getYear(){
return year;}
public void setArtist( Artist n){
artist=n;}
public Artist getArtist(){
return artist;}
public void displayArtwork(){
System.out.println("the title is:"+title);
System.out.println("the year is:"+year);
artist.display();}









}