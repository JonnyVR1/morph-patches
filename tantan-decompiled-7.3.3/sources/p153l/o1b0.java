package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o1b0 {
    /* JADX INFO: renamed from: a */
    public static void m165589a(n1b0 n1b0Var, View view) {
        n1b0Var.f139735u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        n1b0Var.f139736v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n1b0Var.f139737w = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        n1b0Var.f139738x = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165590b(n1b0 n1b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126069ta, viewGroup, false);
        m165589a(n1b0Var, viewInflate);
        return viewInflate;
    }
}
