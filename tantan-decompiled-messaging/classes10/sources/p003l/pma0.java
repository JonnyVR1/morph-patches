package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.n6c0;
import l.oma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pma0 {
    /* JADX INFO: renamed from: a */
    public static void m8763a(oma0 oma0Var, View view) {
        oma0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oma0Var.b = viewGroup.getChildAt(0);
        oma0Var.c = (RelativeLayout) viewGroup.getChildAt(1);
        oma0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oma0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oma0Var.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8764b(oma0 oma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.H0, viewGroup, false);
        m8763a(oma0Var, viewInflate);
        return viewInflate;
    }
}
