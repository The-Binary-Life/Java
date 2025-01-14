package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */
public class WhatIsThis {
    //Instance fields of the class
    String alertMessage;
    String warningIcon;
    boolean showCancelButton;

    //Constructor
    public WhatIsThis(String alertMessage, String wrngIcon, boolean showCancelButton){
        String warningIcon;

        this.alertMessage = alertMessage;       //Assignment to field
        showCancelButton = showCancelButton;    //Assignment to parameter, meaningless
        warningIcon = wrngIcon;                 //Assignment to local variable
        this.callMe();                          //This explicitly calls the methods with the current this reference
        callMe();                               //If we call the instance method callMe, this reference is passed implicitly
    }

    //Instance method which prints out the reference of the current object
    public void callMe(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        WhatIsThis newRef = new WhatIsThis("Do you want to cancel?", "AmberIcon", true);

        System.out.println("Alert Message: " + newRef.alertMessage);
        System.out.println("Warning: " + newRef.warningIcon);
        System.out.println("Show Cancel Button? " + newRef.showCancelButton);
    }
}
