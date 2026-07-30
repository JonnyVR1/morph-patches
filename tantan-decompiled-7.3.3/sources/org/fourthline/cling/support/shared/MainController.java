package org.fourthline.cling.support.shared;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.UIManager;
import org.fourthline.cling.UpnpService;
import org.seamless.swing.AbstractController;
import org.seamless.swing.Application;
import org.seamless.swing.logging.LogCategory;
import org.seamless.swing.logging.LogController;
import org.seamless.swing.logging.LogMessage;
import org.seamless.swing.logging.LoggingHandler;
import org.seamless.util.logging.LoggingUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MainController extends AbstractController<JFrame> {
    private final LogController logController;
    private final JPanel logPanel;

    public static class ShutdownWindow extends JWindow {
        public static final JWindow INSTANCE = new ShutdownWindow();

        public ShutdownWindow() {
            JLabel jLabel = new JLabel("Shutting down, please wait...");
            jLabel.setHorizontalAlignment(0);
            getContentPane().add(jLabel);
            setPreferredSize(new Dimension(300, 30));
            pack();
            Application.center(this);
        }
    }

    public MainController(JFrame jFrame, List<LogCategory> list) {
        super(jFrame);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Unable to load native look and feel: " + e.toString());
        }
        System.setProperty("sun.awt.exception.handler", AWTExceptionHandler.class.getName());
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.fourthline.cling.support.shared.MainController.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (MainController.this.getUpnpService() != null) {
                    MainController.this.getUpnpService().shutdown();
                }
            }
        });
        LogController logController = new LogController(this, list) { // from class: org.fourthline.cling.support.shared.MainController.2
            public void expand(LogMessage logMessage) {
                fireEventGlobal(new TextExpandEvent(logMessage.getMessage()));
            }

            public Frame getParentWindow() {
                return MainController.this.getView();
            }
        };
        this.logController = logController;
        JPanel view = logController.getView();
        this.logPanel = view;
        view.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        Handler handler = new LoggingHandler() { // from class: org.fourthline.cling.support.shared.MainController.3
            public void log(LogMessage logMessage) {
                MainController.this.logController.pushMessage(logMessage);
            }
        };
        if (System.getProperty("java.util.logging.config.file") == null) {
            LoggingUtil.resetRootHandler(handler);
        } else {
            LogManager.getLogManager().getLogger("").addHandler(handler);
        }
    }

    public void dispose() {
        super.dispose();
        ShutdownWindow.INSTANCE.setVisible(true);
        new Thread() { // from class: org.fourthline.cling.support.shared.MainController.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                System.exit(0);
            }
        }.start();
    }

    public LogController getLogController() {
        return this.logController;
    }

    public JPanel getLogPanel() {
        return this.logPanel;
    }

    public abstract UpnpService getUpnpService();

    public void log(Level level, String str) {
        log(new LogMessage(level, str));
    }

    public void log(LogMessage logMessage) {
        getLogController().pushMessage(logMessage);
    }
}
