package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VEditText;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class pma0 {
    /* JADX INFO: renamed from: a */
    public static void m170300a(oma0 oma0Var, View view) {
        oma0Var.f144593a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oma0Var.f144594b = (VText_Default_Bold) viewGroup.getChildAt(0);
        oma0Var.f144595c = (RelativeLayout) viewGroup.getChildAt(1);
        oma0Var.f144596d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oma0Var.f144597e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oma0Var.f144598f = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m170301b(oma0 oma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137300H0, viewGroup, false);
        m170300a(oma0Var, viewInflate);
        return viewInflate;
    }
}
