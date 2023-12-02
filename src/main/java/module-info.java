module com.example.pet_shelter {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pet_shelter to javafx.fxml;
    exports com.example.pet_shelter;
}