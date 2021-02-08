import java.io.*;
import java.util.*;
public class GetMazePath
{
    public static void main(String []args)throws Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        ArrayList<String>path=gmp(1,1,n,m);
        System.out.println(path);
    }
    public static ArrayList<String>gmp(int sr,int sc,int dr,int dc)
    {
     if(sr==dr && sc==dc){
         ArrayList<String>bres=new ArrayList<>();
         bres.add(" ");
         return bres;
     }
     ArrayList<String>hpath=new ArrayList<>();
     ArrayList<String>vpath=new ArrayList<>();
     if(sc<dc){
         hpath=gmp(sr,sc+1,dr,dc);
     }
     if(sr<dr){
         vpath=gmp(sr+1,sc,dr,dc);
     }
     ArrayList<String>mypath=new ArrayList<>();
     for(String rstr:hpath)
     {
         mypath.add("h"+rstr);
     }
        for(String rstr:vpath) {
            mypath.add("v" + rstr);
        }
        return mypath;
    }
}
