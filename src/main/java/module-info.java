module fes.aragon.admin_pro {
    requires javafx.controls;
    requires javafx.fxml;


    opens fes.aragon.admin_pro to javafx.fxml;
    exports fes.aragon.admin_pro;
}