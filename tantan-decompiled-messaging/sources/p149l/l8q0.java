package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l8q0 {
    /* JADX INFO: renamed from: a */
    public static void m148949a(j8q0 j8q0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j8q0Var.f116770a = (VProgressBar) viewGroup.getChildAt(0);
        j8q0Var.f116771b = (LinearLayout) viewGroup.getChildAt(1);
        j8q0Var.f116772c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j8q0Var.f116773d = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148950b(j8q0 j8q0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131594g2, viewGroup, false);
        m148949a(j8q0Var, viewInflate);
        return viewInflate;
    }
}
