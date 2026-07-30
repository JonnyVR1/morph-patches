package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jti0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kti0 {
    /* JADX INFO: renamed from: a */
    public static void m7639a(jti0 jti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jti0Var.a = viewGroup.getChildAt(0);
        jti0Var.b = viewGroup.getChildAt(1);
        jti0Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7640b(jti0 jti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5524b, viewGroup, true);
        m7639a(jti0Var, viewInflate);
        return viewInflate;
    }
}
