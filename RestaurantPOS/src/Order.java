public class Order {
    private String entree;
    private String mainCourse;
    private String dessert;
    private String modifiers;
    private String drinks;

    public Order (){
        entree = "none";
        mainCourse = "none";
        dessert = "none";
        drinks = "none";
        modifiers = "none";
    }

    public Order (String entree, String mainCourse, String dessert, String modifiers, String drinks){
        this.entree = entree;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drinks = drinks;
        this.modifiers = modifiers;
    }

    public void setEntree(String entree){
        this.entree = entree;
    }
    public void setMainCourse(String mainCourse){
        this.mainCourse = mainCourse;
    }
    public void setDessert(String dessert){
        this.dessert = dessert;
    }
    public void setModifiers(String modifiers){
        this.modifiers = modifiers;
    }
    public void setDrinks(String drinks){
        this.drinks = drinks;
    }

    public String getEntree(){
        return entree;
    }
    public String getMainCourse(){
        return mainCourse;
    }
    public String getDessert(){
        return dessert;
    }
    public String getModifiers(){
        return modifiers;
    }
    public String getDrinks(){
        return drinks;
    }

    // Method for printing order.
    public void printOrder(){
        System.out.printf("Entree %s\nMain Course %s\nDessert %s\nDrinks %s\nModifiers %s\n",entree, mainCourse, dessert, drinks, modifiers);
    }


}
