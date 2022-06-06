/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 */
public class SuperClass_Parent {
    public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenBurgerM;
    public double BeefCheeseBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;

    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    public double GetAmount()
    {
        Meals = Filet_O_Fish + ChickenBurger + ChickenLegend + ChickenBurgerM + BeefCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    //================================Price==========================================
    
     public double pFilet_O_Fish = 250;
    public double pChickenBurger = 120;
    public double pChickenLegend = 150;
    public double pChickenBurgerM = 200;
    public double pBeefCheeseBurger = 220;
    
    public double pMilkShake = 55;
    public double pVanillaCone = 50;
    public double pClasVanilla = 55;
    public double pVanMilkShake = 60;
    public double pChocMilkShake = 70;
    
    //==========================================================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    //==========================================================================
}
