package org.fourthline.cling.support.shared.log;

import java.util.List;
import org.fourthline.cling.support.shared.View;
import org.seamless.swing.logging.LogCategory;
import org.seamless.swing.logging.LogMessage;

/* JADX INFO: loaded from: classes3.dex */
public interface LogView extends View<Presenter> {

    public interface LogCategories extends List<LogCategory> {
    }

    public interface Presenter {
        void init();

        void onExpand(LogMessage logMessage);

        void pushMessage(LogMessage logMessage);
    }

    void dispose();

    void pushMessage(LogMessage logMessage);
}
