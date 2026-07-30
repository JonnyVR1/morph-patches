package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class d1i0 {
    /* JADX INFO: renamed from: a */
    public static void m113573a(c1i0 c1i0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c1i0Var.f79399j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c1i0Var.f79400k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c1i0Var.f79401l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c1i0Var.f79402m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m113574b(c1i0 c1i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125965n8, viewGroup, false);
        m113573a(c1i0Var, viewInflate);
        return viewInflate;
    }
}
