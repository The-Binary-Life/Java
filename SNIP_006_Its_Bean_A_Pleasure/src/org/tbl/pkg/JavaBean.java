package org.tbl.pkg;

import java.io.Serializable;

/**
 * @author The_Binary_Life
 * @version 1.0.0
 */

//The class should implement Serializable marker interface
public class JavaBean implements Serializable {
    //Properties should be private
    private String alertMessage;
    private String warningIcon;
    private boolean showCancelButton;

    //Should contain a no-arg default constructor

    //Should contain setters to set data in the private members

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public void setWarningIcon(String warningIcon) {
        this.warningIcon = warningIcon;
    }

    public void setShowCancelButton(boolean showCancelButton) {
        this.showCancelButton = showCancelButton;
    }

    //Should contain getters to get the data from the private members

    public String getAlertMessage() {
        return alertMessage;
    }

    public String getWarningIcon() {
        return warningIcon;
    }

    public boolean isShowCancelButton() {
        return showCancelButton;
    }
}
