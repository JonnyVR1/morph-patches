package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.yj30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zj30 {
    /* JADX INFO: renamed from: a */
    public static void m11425a(yj30 yj30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yj30Var.b = viewGroup.getChildAt(0);
        yj30Var.c = viewGroup.getChildAt(1);
        yj30Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11426b(yj30 yj30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5506V0, viewGroup, false);
        m11425a(yj30Var, viewInflate);
        return viewInflate;
    }
}
