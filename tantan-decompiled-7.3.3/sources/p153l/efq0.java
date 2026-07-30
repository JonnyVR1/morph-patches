package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class efq0 implements InterfaceC17076fu {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m120705c(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().mo134830j((ActionMenuItemView) childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p153l.InterfaceC17076fu
    /* JADX INFO: renamed from: a */
    public Drawable mo120706a(Act act) {
        return act.getAppTheme().mo134823c();
    }

    @Override // p153l.InterfaceC17076fu
    /* JADX INFO: renamed from: b */
    public void mo120707b(final Act act) {
        if (NullChecker.m82486a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m82486a(actionMenuView)) {
                    bnl0.m105546b0(actionMenuView, new pcj() { // from class: l.dfq0
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return efq0.m120705c(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("setIntlMenuViewTheme error: " + e));
            }
        }
    }
}
