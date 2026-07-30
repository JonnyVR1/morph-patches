package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import p151v.VButton;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class pcd0 {
    /* JADX INFO: renamed from: a */
    public static void m171641a(ocd0 ocd0Var, View view) {
        ocd0Var.f146687a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ocd0Var.f146688b = (VNavigationBar) viewGroup.getChildAt(0);
        ocd0Var.f146689c = (RightNiceNumberView) viewGroup.getChildAt(1);
        ocd0Var.f146690d = (VButton) viewGroup.getChildAt(2);
        ocd0Var.f146691e = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m171642b(ocd0 ocd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193902q1, viewGroup, false);
        m171641a(ocd0Var, viewInflate);
        return viewInflate;
    }
}
