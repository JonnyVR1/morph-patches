package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.yc2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zc2 {
    /* JADX INFO: renamed from: a */
    public static void m11384a(yc2 yc2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yc2Var.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        yc2Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        yc2Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        yc2Var.d = viewGroup.getChildAt(1);
        yc2Var.e = viewGroup.getChildAt(2);
        yc2Var.f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m11385b(yc2 yc2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.a, viewGroup, false);
        m11384a(yc2Var, viewInflate);
        return viewInflate;
    }
}
