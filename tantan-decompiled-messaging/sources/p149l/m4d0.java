package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import p147v.VButton;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class m4d0 {
    /* JADX INFO: renamed from: a */
    public static void m153015a(l4d0 l4d0Var, View view) {
        l4d0Var.f126019a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l4d0Var.f126020b = (VNavigationBar) viewGroup.getChildAt(0);
        l4d0Var.f126021c = (RightNiceNumberView) viewGroup.getChildAt(1);
        l4d0Var.f126022d = (VButton) viewGroup.getChildAt(2);
        l4d0Var.f126023e = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m153016b(l4d0 l4d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162788q1, viewGroup, false);
        m153015a(l4d0Var, viewInflate);
        return viewInflate;
    }
}
