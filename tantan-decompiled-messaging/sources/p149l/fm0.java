package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fm0 {
    /* JADX INFO: renamed from: a */
    public static void m122104a(em0 em0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        em0Var.f92153a = (VText) viewGroup.getChildAt(2);
        em0Var.f92154b = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m122105b(em0 em0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168262Z2, viewGroup, false);
        m122104a(em0Var, viewInflate);
        return viewInflate;
    }
}
