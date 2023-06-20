package courseworkresit.Step_1;

//Lisa Downie B00396778
//package courseworkresit.Step_1;
public class Site {

    public class PageNameNotUniqueException extends Exception {
    }

    private class PageNode {
        private String name;
        private PageNode up; 
        private PageNode across;
        private PageNode down; 
    }
      
    private PageNode homePage;

    public Site() {
        this.homePage = new PageNode();
        this.homePage.name = "home";
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
