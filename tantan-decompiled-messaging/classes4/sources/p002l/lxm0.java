package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.kxm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lxm0 {
    /* JADX INFO: renamed from: a */
    public static void m17507a(kxm0 kxm0Var, View view) {
        kxm0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kxm0Var.b = viewGroup.getChildAt(0);
        kxm0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kxm0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kxm0Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kxm0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m17508b(kxm0 kxm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19906k8, viewGroup, false);
        m17507a(kxm0Var, viewInflate);
        return viewInflate;
    }
}
