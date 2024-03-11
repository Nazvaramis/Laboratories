module com.example.rtsllab1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;

    opens com.example.rtsllab1 to javafx.fxml;
    exports com.example.rtsllab1;
}

