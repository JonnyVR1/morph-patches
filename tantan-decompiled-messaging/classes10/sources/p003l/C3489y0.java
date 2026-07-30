package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.x0;

/* JADX INFO: renamed from: l.y0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3489y0 {
    /* JADX INFO: renamed from: a */
    public static void m11071a(x0 x0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        x0Var.b = viewGroup.getChildAt(0);
        x0Var.c = viewGroup.getChildAt(1);
        x0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11072b(x0 x0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.C, viewGroup, false);
        m11071a(x0Var, viewInflate);
        return viewInflate;
    }
}
