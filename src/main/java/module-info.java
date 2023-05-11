module com.example.spotitsim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spotitsim to javafx.fxml;
    exports com.example.spotitsim;
}