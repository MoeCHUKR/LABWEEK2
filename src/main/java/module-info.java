module org.example.labsw2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.labsw2 to javafx.fxml;
    exports org.example.labsw2;
}