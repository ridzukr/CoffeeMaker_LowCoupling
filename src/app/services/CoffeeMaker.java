package app.services;

import app.view.Drinks;

public class CoffeeMaker {

  private Drinks drinks;

    public void setMaker(Drinks drinks) {
        this.drinks = drinks;
    }

   public void startMaker() {
      drinks.make();
   }
}
