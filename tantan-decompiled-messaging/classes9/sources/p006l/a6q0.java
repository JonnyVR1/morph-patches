package p006l;

import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.v9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a6q0 implements InterfaceC0993lu {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m11758c(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            ActionMenuItemView childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().j(childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p006l.InterfaceC0993lu
    /* JADX INFO: renamed from: a */
    public Drawable mo11759a(Act act) {
        return act.getAppTheme().c();
    }

    @Override // p006l.InterfaceC0993lu
    /* JADX INFO: renamed from: b */
    public void mo11760b(final Act act) {
        if (NullChecker.a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.a(actionMenuView)) {
                    xdl0.b0(actionMenuView, new v9j() { // from class: l.z5q0
                        public final Object call() {
                            return a6q0.m11758c(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("setIntlMenuViewTheme error: " + e));
            }
        }
    }
}
