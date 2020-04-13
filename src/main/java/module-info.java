module il.ac.haifa.abbas {
    requires javafx.controls;
    requires javafx.fxml;

    opens il.ac.haifa.abbas to javafx.fxml;
    exports il.ac.haifa.abbas;
}