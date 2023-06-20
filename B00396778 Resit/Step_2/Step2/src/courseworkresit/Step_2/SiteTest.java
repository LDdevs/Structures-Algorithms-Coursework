//Lisa Downie B00396778
package courseworkresit.Step_2;


import java.util.*;


public class SiteTest {

    public static void main(String[] args) {
        
        String name;
        
        Site website = new Site();

        Integer option;
        
        do {
            System.out.println("0: Quit");
            System.out.println("1: Add Page");
            System.out.println("2: Move Down");
            System.out.println("3: Move Up");
            System.out.println("4: Display Current Page");
            System.out.println("5: Display Website");
            option = Input.getInteger("Input option: ");
            switch (option) {
                      
                case 0:
                    System.out.println("----------------");
                    System.out.println("quitting program");
                    System.out.println("----------------");
                   break;
            
                case 1: 
                    name = Input.getString("input the page name: ");
                     try{
                        website.addPage(name);
                    }
                    catch(Site.PageNameNotUniqueException exception){
                        System.out.println("add page invalid - page name not unique");
                     }
                     System.out.println("Page added - " + name);
                     System.out.println("----------------");
                    break;
                case 2:
                    System.out.println("----------------");
                    System.out.println("moving down");
//                    try{
//                        this.currentPage.down(currentPage.name);
//                    }
//                    catch(Site.PageNameNotUniqueException exception){
//                        System.out.println("add page invalid - page name not unique");
//                     }
                    System.out.println("----------------");
                   break;
                case 3:
                    System.out.println("----------------");
                    System.out.println("moving up");
                    System.out.println("----------------");
                   break;
                case 4: 
                    System.out.println("----------------");
                    System.out.println(website.getCurrent());
                    System.out.println("----------------");
                    break;
                case 5: 
                    System.out.println("----------------");
                    System.out.println(website);
                    System.out.println("----------------");
                    break;
               default:
               System.out.println("invalid option");
            }
        } while (option != 0);
        }

}