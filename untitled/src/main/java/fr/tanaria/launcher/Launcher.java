package fr.tanaria.launcher;

import fr.flowarg.flowlogger.ILogger;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

    private static Launcher instance;
    private final ILogger

    @Override
    public void start(Stage stage) throws Exception {

    }

    public ILogger getLogger() {
        return logger;
    }

    public static Launcher getInstance() {
        return instance;
    }
}
