package fr.tanaria.launcher.ui.panel;

import fr.flowarg.flowlogger.ILogger;
import fr.tanaria.launcher.Launcher;
import fr.tanaria.launcher.PanelManager;
import javafx.scene.layout.GridPane;

public abstract class Panel implements IPanel, IMovable, ITakePlace{
    protected final ILogger logger;
    protected GridPane layout = new GridPane();
    protected PanelManager panelManager;

    public Panel(){
        this.logger = Launcher.getInstance().getLauncher();
    }
}
