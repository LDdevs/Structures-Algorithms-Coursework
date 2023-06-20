//Lisa Downie B00396778
package courseworkresit.Step_1;

public class SiteTest {

    public static void main(String[] args) {
       
        String name;
        
        Site website = new Site();

        Integer option;
        
        do {
            System.out.println("0: Quit");
            System.out.println("1: Add Page");
            System.out.println("2: Display Website");
            option = Input.getInteger("Input option: ");
            switch (option) {          
                 case 0:
                 System.out.println("quitting program");
                    break;
            
                case 1: 
                    name = Input.getString("input the page name: ");
                     try{
                        website.addPage(name);
                    }
                    catch(Site.PageNameNotUniqueException exception){
                        System.out.println("add page invalid - page name not unique");
                     }
                    break;
                
                case 2: 
                    System.out.println(website);
                    break;
               default:
               System.out.println("invalid option");
            }
        } while (option != 0);
        }

}