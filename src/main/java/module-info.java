module com.example.arithmentic_coder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arithmentic_coder to javafx.fxml;
    exports com.example.arithmentic_coder;
}