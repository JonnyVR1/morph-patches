package org.fourthline.cling.support.shared.log.impl;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.swing.SwingUtilities;
import org.fourthline.cling.support.shared.TextExpand;
import org.fourthline.cling.support.shared.log.LogView;
import org.seamless.swing.logging.LogMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@ApplicationScoped
public class LogPresenter implements LogView.Presenter {
    protected Event<TextExpand> textExpandEvent;
    protected LogView view;

    @PreDestroy
    public void destroy() {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.log.impl.LogPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                LogPresenter.this.view.dispose();
            }
        });
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void init() {
        this.view.setPresenter(this);
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void onExpand(LogMessage logMessage) {
        this.textExpandEvent.fire(new TextExpand(logMessage.getMessage()));
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void pushMessage(final LogMessage logMessage) {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.log.impl.LogPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                LogPresenter.this.view.pushMessage(logMessage);
            }
        });
    }
}
