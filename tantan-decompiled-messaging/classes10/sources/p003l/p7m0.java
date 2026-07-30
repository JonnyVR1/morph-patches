package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.o7m0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p7m0 {
    /* JADX INFO: renamed from: a */
    public static void m8716a(o7m0 o7m0Var, View view) {
        o7m0Var.b = view.findViewById(x4c0.f8329W);
        ViewGroup viewGroup = (ViewGroup) view;
        o7m0Var.c = viewGroup.getChildAt(1);
        o7m0Var.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        o7m0Var.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8717b(o7m0 o7m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5516Y1, viewGroup, false);
        m8716a(o7m0Var, viewInflate);
        return viewInflate;
    }
}
