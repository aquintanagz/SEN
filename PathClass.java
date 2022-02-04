
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aquintanagz
 */
public class PathClass {
    
     
    
    public static void main(String[] args) throws IOException {
       
         Path path1 = Paths.get("/Users/aquintanagz/Desktop/Hola6.txt"); // ruta absoluta
         Files.createFile(path1);
            
         // Path path2 = Paths.get("Users","aquintanagz","Desktop","NUEVO_DIRECTORIO"); // ruta absoluta
         Path path2 = Paths.get("/Users/aquintanagz/Desktop/AUDI"); // ruta absoluta
         Files.createDirectory(path2);
     }
    
    public static void main15(String[] args) throws IOException {
       
        
          // file:///Users/aquintanagz/Documents/
          
           
            Path path1 = Paths.get("/Users/aquintanagz/Desktop/Hola.txt"); // ruta absoluta
         
            Files.createFile(path1);
       }
     public static void main14(String[] args) throws IOException {
       
        
          // file:///Users/aquintanagz/Documents/
          
           
            Path path1 = Paths.get("/Users/aquintanagz/Documents/aui"); // ruta absoluta
         
            Files.createDirectory(path1);
       }
          
       public static void main13(String[] args) {
       
          // Si el metodo resolve recibe una absoluta entonces regresa una copia de absoluta
          
          // Si empieza / es una ruta absoluta
          // Si empieza con letra es una ruta absoluta
          // si empieza con puntops ../ es relativa
          
           
            Path path1 = Paths.get("/pets/.././cats.txt"); // ruta absoluta
           Path  path2 = Paths.get("./dog.txt"); //ruta relativa
           
            System.out.println(path1.normalize());
            System.out.println(path1.resolve(path2));
             System.out.println(path2.resolve(path1));

       }
          
    
    
       public static void main12(String[] args) {
       
            Path path = Paths.get("../..","/kodiacbear.txt");
            System.out.println(path);
            System.out.println(path.relativize(Paths.get("../aaron.txt")));

       }
          
    
       public static void main11(String[] args) {
       
            Path path = Paths.get("../..","/kodiacbear.txt");
            System.out.println(path);
            System.out.println(path.relativize(Paths.get("../../aaron.txt")));

       }
          
    
       public static void main10(String[] args) {
       
        Path path = Paths.get("A/B","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("../aaron.txt")));
        
       }
          
       public static void main9(String[] args) {
       
        Path path = Paths.get("../..","/kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("../aaron.txt")));
        
       }
          
    
        public static void main8(String[] args) {

            Path path = Paths.get("../","kodiacbear.txt");
            System.out.println(path);
            System.out.println(path.relativize(Paths.get("/aaron.txt")));

       }
       
    
       public static void main7(String[] args) {
       
        Path path = Paths.get("../","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("/aaron.txt")));
        
       }
       
    
    
       public static void main6(String[] args) {
       
        Path path = Paths.get("../","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("../aaron.txt")));
        
       }
       
    
    
      public static void main5(String[] args) {
       
        Path path = Paths.get("/user/./root","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("/aaron.txt")));
        
       }
       
      public static void main4(String[] args) {
       
        Path path = Paths.get("/user/. /root","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("../aaron.txt")));
        
       }
      
       public static void main4a(String[] args) {
       
        Path path = Paths.get("/user/./root","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.relativize(Paths.get("/aaron.txt")));//../../../../aaron.txt
        
       }
       
       
      // Ambas deben de ser absolutas o ambas relativas en relavitize
       public static void main3a(String[] args) {
       
     
        Path path = Paths.get("../user/../root","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(path.normalize().relativize(Paths.get("/lion")));
        
    }
       
       public static void main3(String[] args) {
       
     
        Path path = Paths.get("/user/../root","kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(path.normalize().relativize(Paths.get("/lion")));
        
    }
       
         public static void main2a(String[] args) {
       
     
        Path path = Paths.get("/user/.././root","../kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(path.normalize().relativize(Paths.get("/lion")));
        
    }
         
         
          public static void main190(String[] args) {
                Path path1 =  Paths.get(".").normalize();
                System.out.println(path1);
               System.out.println(path1.getNameCount());
              for (int i = 0; i < path1.getNameCount(); i++) {
                  
                  
              }
      }
       
      public static void main2d(String[] args) {
        Path path1 =  Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
          Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
          System.out.println(path1.normalize());
          System.out.println(path2.normalize());
      }
       
      public static void main2b(String[] args) {
       
     
        Path path = Paths.get("./kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(path.normalize().relativize(Paths.get("/lion")));
        
    }
      
         public static void main2c(String[] args) {
       
     
        Path path = Paths.get("/kodiacbear.txt");
        System.out.println(path);
        System.out.println(path.normalize());
        System.out.println(path.normalize().relativize(Paths.get("/lion")));
        
    }
         
    public static void main1(String[] args) {
       
        Path path3 = Paths.get("E:\\data");
        Path path4 = Paths.get("E:\\user\\home");
        
        Path relativePath = path3.relativize(path4);
            System.out.println(path3.resolve(relativePath)); 
            System.out.println(path3.resolve(relativePath).normalize()); 
            

   
        
    }
    
}
