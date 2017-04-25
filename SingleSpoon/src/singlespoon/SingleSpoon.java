package singlespoon;

public class SingleSpoon {

    private Soup soupLastUsedWith;

    private static SingleSpoon singleSpoonInstance;
    private static boolean theSpoonIsAvailable = true;

    private SingleSpoon() {
    }

    public static SingleSpoon getSingleSpoon() {
        if (theSpoonIsAvailable) {
            if (singleSpoonInstance == null) {
                singleSpoonInstance = new SingleSpoon();
            }
            theSpoonIsAvailable = false;
            return singleSpoonInstance;
        } else {
            return null;
            //spoon not available, 
            //could throw error or return null (as shown)
        }
    }

    public String toString() {
        return "Behold the glorious single spoon!";
    }

    public static void returnTheSpoon() {
        singleSpoonInstance.cleanSpoon();
        theSpoonIsAvailable = true;
    }

    public Soup getSoupLastUsedWith() {
        return this.soupLastUsedWith;
    }

    public void setSoupLastUsedWith(Soup soup) {
        this.soupLastUsedWith = soup;
    }

    public void cleanSpoon() {
        this.setSoupLastUsedWith(null);
    }
}
