package lab.assignment.beforerefactoring;

abstract public class CoffeeTemplate {

    public void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }


    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    abstract protected void addIngredients();

    abstract protected void finalTouch();

}
