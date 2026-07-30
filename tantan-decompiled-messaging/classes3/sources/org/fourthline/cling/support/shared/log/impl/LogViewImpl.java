package org.fourthline.cling.support.shared.log.impl;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.eclipse.jetty.http.HttpStatus;
import org.fourthline.cling.support.shared.CenterWindow;
import org.fourthline.cling.support.shared.log.LogView;
import org.seamless.swing.Application;
import org.seamless.swing.logging.LogCategorySelector;
import org.seamless.swing.logging.LogController;
import org.seamless.swing.logging.LogMessage;
import org.seamless.swing.logging.LogTableCellRenderer;
import org.seamless.swing.logging.LogTableModel;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LogViewImpl extends JPanel implements LogView {
    protected Event<CenterWindow> centerWindowEvent;
    protected LogView.LogCategories logCategories;
    protected LogCategorySelector logCategorySelector;
    protected JTable logTable;
    protected LogTableModel logTableModel;
    protected LogView.Presenter presenter;
    protected final JToolBar toolBar = new JToolBar();
    protected final JButton configureButton = new JButton("Options...", Application.createImageIcon(LogController.class, "img/configure.png"));
    protected final JButton clearButton = new JButton("Clear Log", Application.createImageIcon(LogController.class, "img/removetext.png"));
    protected final JButton copyButton = new JButton("Copy", Application.createImageIcon(LogController.class, "img/copyclipboard.png"));
    protected final JButton expandButton = new JButton("Expand", Application.createImageIcon(LogController.class, "img/viewtext.png"));
    protected final JButton pauseButton = new JButton("Pause/Continue Log", Application.createImageIcon(LogController.class, "img/pause.png"));
    protected final JLabel pauseLabel = new JLabel(" (Active)");
    protected final JComboBox expirationComboBox = new JComboBox(LogController.Expiration.values());

    public void adjustTableUI() {
        this.logTable.setFocusable(false);
        this.logTable.setRowHeight(18);
        this.logTable.getTableHeader().setReorderingAllowed(false);
        this.logTable.setBorder(BorderFactory.createEmptyBorder());
        this.logTable.getColumnModel().getColumn(0).setMinWidth(30);
        this.logTable.getColumnModel().getColumn(0).setMaxWidth(30);
        this.logTable.getColumnModel().getColumn(0).setResizable(false);
        this.logTable.getColumnModel().getColumn(1).setMinWidth(90);
        this.logTable.getColumnModel().getColumn(1).setMaxWidth(90);
        this.logTable.getColumnModel().getColumn(1).setResizable(false);
        this.logTable.getColumnModel().getColumn(2).setMinWidth(EACTags.APPLICATION_RELATED_DATA);
        this.logTable.getColumnModel().getColumn(2).setMaxWidth(250);
        this.logTable.getColumnModel().getColumn(3).setPreferredWidth(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA);
        this.logTable.getColumnModel().getColumn(3).setMaxWidth(HttpStatus.BAD_REQUEST_400);
        this.logTable.getColumnModel().getColumn(4).setPreferredWidth(600);
    }

    @Override // org.fourthline.cling.support.shared.View
    public Component asUIComponent() {
        return this;
    }

    @Override // org.fourthline.cling.support.shared.log.LogView
    public void dispose() {
        this.logCategorySelector.dispose();
    }

    public ImageIcon getDebugIcon() {
        return Application.createImageIcon(LogController.class, "img/debug.png");
    }

    public LogController.Expiration getDefaultExpiration() {
        return LogController.Expiration.SIXTY_SECONDS;
    }

    public int getExpandMessageCharacterLimit() {
        return 100;
    }

    public ImageIcon getInfoIcon() {
        return Application.createImageIcon(LogController.class, "img/info.png");
    }

    public List<LogMessage> getSelectedMessages() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.logTable.getSelectedRows()) {
            arrayList.add((LogMessage) this.logTableModel.getValueAt(i, 0));
        }
        return arrayList;
    }

    public ImageIcon getTraceIcon() {
        return Application.createImageIcon(LogController.class, "img/trace.png");
    }

    public ImageIcon getWarnErrorIcon() {
        return Application.createImageIcon(LogController.class, "img/warn.png");
    }

    @PostConstruct
    public void init() {
        setLayout(new BorderLayout());
        LogController.Expiration defaultExpiration = getDefaultExpiration();
        this.logCategorySelector = new LogCategorySelector(this.logCategories);
        this.logTableModel = new LogTableModel(defaultExpiration.getSeconds());
        JTable jTable = new JTable(this.logTableModel);
        this.logTable = jTable;
        jTable.setDefaultRenderer(LogMessage.class, new LogTableCellRenderer() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.1
            public ImageIcon getDebugIcon() {
                return LogViewImpl.this.getDebugIcon();
            }

            public ImageIcon getInfoIcon() {
                return LogViewImpl.this.getInfoIcon();
            }

            public ImageIcon getTraceIcon() {
                return LogViewImpl.this.getTraceIcon();
            }

            public ImageIcon getWarnErrorIcon() {
                return LogViewImpl.this.getWarnErrorIcon();
            }
        });
        this.logTable.setCellSelectionEnabled(false);
        this.logTable.setRowSelectionAllowed(true);
        this.logTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.2
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (!listSelectionEvent.getValueIsAdjusting() && listSelectionEvent.getSource() == LogViewImpl.this.logTable.getSelectionModel()) {
                    int[] selectedRows = LogViewImpl.this.logTable.getSelectedRows();
                    if (selectedRows == null || selectedRows.length == 0) {
                        LogViewImpl.this.copyButton.setEnabled(false);
                        LogViewImpl.this.expandButton.setEnabled(false);
                        return;
                    }
                    int length = selectedRows.length;
                    LogViewImpl logViewImpl = LogViewImpl.this;
                    if (length != 1) {
                        logViewImpl.copyButton.setEnabled(true);
                        LogViewImpl.this.expandButton.setEnabled(false);
                        return;
                    }
                    logViewImpl.copyButton.setEnabled(true);
                    int length2 = ((LogMessage) LogViewImpl.this.logTableModel.getValueAt(selectedRows[0], 0)).getMessage().length();
                    int expandMessageCharacterLimit = LogViewImpl.this.getExpandMessageCharacterLimit();
                    LogViewImpl logViewImpl2 = LogViewImpl.this;
                    if (length2 > expandMessageCharacterLimit) {
                        logViewImpl2.expandButton.setEnabled(true);
                    } else {
                        logViewImpl2.expandButton.setEnabled(false);
                    }
                }
            }
        });
        adjustTableUI();
        initializeToolBar(defaultExpiration);
        setPreferredSize(new Dimension(250, 100));
        setMinimumSize(new Dimension(250, 50));
        add(new JScrollPane(this.logTable), "Center");
        add(this.toolBar, "South");
    }

    public void initializeToolBar(LogController.Expiration expiration) {
        this.configureButton.setFocusable(false);
        this.configureButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.3
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl logViewImpl = LogViewImpl.this;
                logViewImpl.centerWindowEvent.fire(new CenterWindow(logViewImpl.logCategorySelector));
                LogCategorySelector logCategorySelector = LogViewImpl.this.logCategorySelector;
                logCategorySelector.setVisible(!logCategorySelector.isVisible());
            }
        });
        this.clearButton.setFocusable(false);
        this.clearButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.4
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl.this.logTableModel.clearMessages();
            }
        });
        this.copyButton.setFocusable(false);
        this.copyButton.setEnabled(false);
        this.copyButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.5
            public void actionPerformed(ActionEvent actionEvent) {
                StringBuilder sb = new StringBuilder();
                Iterator<LogMessage> it = LogViewImpl.this.getSelectedMessages().iterator();
                while (it.hasNext()) {
                    sb.append(it.next().toString());
                    sb.append("\n");
                }
                Application.copyToClipboard(sb.toString());
            }
        });
        this.expandButton.setFocusable(false);
        this.expandButton.setEnabled(false);
        this.expandButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.6
            public void actionPerformed(ActionEvent actionEvent) {
                List<LogMessage> selectedMessages = LogViewImpl.this.getSelectedMessages();
                if (selectedMessages.size() != 1) {
                    return;
                }
                LogViewImpl.this.presenter.onExpand(selectedMessages.get(0));
            }
        });
        this.pauseButton.setFocusable(false);
        this.pauseButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.7
            public void actionPerformed(ActionEvent actionEvent) {
                LogTableModel logTableModel = LogViewImpl.this.logTableModel;
                logTableModel.setPaused(!logTableModel.isPaused());
                boolean zIsPaused = LogViewImpl.this.logTableModel.isPaused();
                LogViewImpl logViewImpl = LogViewImpl.this;
                if (zIsPaused) {
                    logViewImpl.pauseLabel.setText(" (Paused)");
                } else {
                    logViewImpl.pauseLabel.setText(" (Active)");
                }
            }
        });
        this.expirationComboBox.setSelectedItem(expiration);
        this.expirationComboBox.setMaximumSize(new Dimension(100, 32));
        this.expirationComboBox.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.8
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl.this.logTableModel.setMaxAgeSeconds(((LogController.Expiration) ((JComboBox) actionEvent.getSource()).getSelectedItem()).getSeconds());
            }
        });
        this.toolBar.setFloatable(false);
        this.toolBar.add(this.copyButton);
        this.toolBar.add(this.expandButton);
        this.toolBar.add(Box.createHorizontalGlue());
        this.toolBar.add(this.configureButton);
        this.toolBar.add(this.clearButton);
        this.toolBar.add(this.pauseButton);
        this.toolBar.add(this.pauseLabel);
        this.toolBar.add(Box.createHorizontalGlue());
        this.toolBar.add(new JLabel("Clear after:"));
        this.toolBar.add(this.expirationComboBox);
    }

    @Override // org.fourthline.cling.support.shared.log.LogView
    public void pushMessage(LogMessage logMessage) {
        this.logTableModel.pushMessage(logMessage);
        if (this.logTableModel.isPaused()) {
            return;
        }
        JTable jTable = this.logTable;
        jTable.scrollRectToVisible(jTable.getCellRect(this.logTableModel.getRowCount() - 1, 0, true));
    }

    @Override // org.fourthline.cling.support.shared.View
    public void setPresenter(LogView.Presenter presenter) {
        this.presenter = presenter;
    }
}
