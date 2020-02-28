package lab.assignment.beforerefactoring;

public class AmericanoMaker extends CoffeeTemplate {
    @Override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }
    
    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}
