package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.krl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lrl0 {
    /* JADX INFO: renamed from: a */
    public static void m17385a(krl0 krl0Var, View view) {
        krl0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        krl0Var.b = viewGroup.getChildAt(0);
        krl0Var.c = viewGroup.getChildAt(1);
        krl0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        krl0Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17386b(krl0 krl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19642P6, viewGroup, false);
        m17385a(krl0Var, viewInflate);
        return viewInflate;
    }
}
