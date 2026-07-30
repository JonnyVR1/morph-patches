package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class a6q0 implements InterfaceC18318lu {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m95156c(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().mo103048j((ActionMenuItemView) childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p149l.InterfaceC18318lu
    /* JADX INFO: renamed from: a */
    public Drawable mo95157a(Act act) {
        return act.getAppTheme().mo103044c();
    }

    @Override // p149l.InterfaceC18318lu
    /* JADX INFO: renamed from: b */
    public void mo95158b(final Act act) {
        if (NullChecker.m81303a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m81303a(actionMenuView)) {
                    xdl0.m208366b0(actionMenuView, new v9j() { // from class: l.z5q0
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return a6q0.m95156c(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("setIntlMenuViewTheme error: " + e));
            }
        }
    }
}
