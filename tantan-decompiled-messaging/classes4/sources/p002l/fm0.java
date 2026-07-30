package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fm0 {
    /* JADX INFO: renamed from: a */
    public static void m13300a(em0 em0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        em0Var.f9863a = viewGroup.getChildAt(2);
        em0Var.f9864b = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m13301b(em0 em0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19758Z2, viewGroup, false);
        m13300a(em0Var, viewInflate);
        return viewInflate;
    }
}
