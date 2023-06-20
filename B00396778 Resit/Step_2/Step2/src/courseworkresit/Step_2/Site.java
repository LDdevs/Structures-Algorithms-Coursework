//Lisa Downie B00396778
package courseworkresit.Step_2;


import java.util.*;

public class Site {

    private PageNode currentPage;

    private static class PageNameNotFoundException extends Exception {

        public PageNameNotFoundException() {
        }
    }

    private static class pageName {

        private static boolean equalsIgnoreCase(String name) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public pageName() {
        }
    }

    

    public class PageNameNotUniqueException extends Exception {
    }
    
    public class MoveUpInvalidException extends Exception {
    }
    
    public class MoveDownInvalidException extends Exception {
    }

    public class PageNode {

        private String name;
        private PageNode up;
        private PageNode across;
        private PageNode down;
    }

    public PageNode homePage;
    public PageNode current;

    public Site() {
        this.homePage = new PageNode();
        this.homePage.name = "Home";
        this.current = this.homePage;
    }

    public void addPage(String pageName) throws PageNameNotUniqueException {

        if (pageName.equalsIgnoreCase(this.homePage.name)) {
            throw new PageNameNotUniqueException();
        }

        PageNode newPage = new PageNode();

        newPage.name = pageName;
        newPage.up = this.homePage;
        if (this.homePage.down == null) {
            this.homePage.down = newPage;
        } else {
            PageNode page = this.homePage.down;
            while (page.across != null) {
                if (newPage.name.equalsIgnoreCase(page.name)) {
                    throw new PageNameNotUniqueException();
                } else {
                    page = page.across;
                }
            }
            page.across = newPage;
        }
    }
    
    public String getCurrent () {
        String currentPage = new String();
        currentPage += this.current.name;
        return currentPage;
    }
    
    public PageNode moveDown () throws PageNameNotFoundException {
        String movingDown = new String();
        movingDown += this.homePage.down;
        PageNode page = this.currentPage.down;
//        while (!pageName.equalsIgnoreCase(page.name)){
//            page = page.across;
//            if (page == null)
//                throw new PageNameNotFoundException();
//        } 
//        if(this.currentPage==this.homePage)
//            throw new MoveDownInvalidException();
//        else {
//            currentPage = this.currentPage.down;
//            
//        }
        return this.currentPage;
    }
    
    public PageNode moveUp () throws MoveUpInvalidException {
        String movingUp = new String();
        movingUp += this.currentPage.up;
//        if(this.currentPage==this.homePage)
//            throw new MoveUpInvalidException();
//        else {
//            currentPage = this.currentPage.up;
//            return this.currentPage;
//        }
        if(this.currentPage == this.homePage) {
            throw new MoveUpInvalidException();
        } else {
            return this.currentPage.up;
        }
    }
    
    

    @Override
    public String toString() {
        String siteDetails = new String();
        siteDetails += this.homePage.name + "\n";
        
        if (this.homePage.down == null) {
            siteDetails += " has no downs\n";
        } else {
            
            PageNode page = this.homePage.down;
            while (page != null) {
                siteDetails += " " + page.name + "\n";
                
                page = page.across;
            }
        }
        return siteDetails;
    }
}

