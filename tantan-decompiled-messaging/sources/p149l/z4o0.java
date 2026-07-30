package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z4o0 {
    /* JADX INFO: renamed from: a */
    public static void m217114a(y4o0 y4o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y4o0Var.f196316a = viewGroup.getChildAt(0);
        y4o0Var.f196317b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        y4o0Var.f196318c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        y4o0Var.f196319d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m217115b(y4o0 y4o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168233W9, viewGroup, false);
        m217114a(y4o0Var, viewInflate);
        return viewInflate;
    }
}
