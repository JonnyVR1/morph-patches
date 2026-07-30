package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.y4o0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z4o0 {
    /* JADX INFO: renamed from: a */
    public static void m27078a(y4o0 y4o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y4o0Var.a = viewGroup.getChildAt(0);
        y4o0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        y4o0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        y4o0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m27079b(y4o0 y4o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19729W9, viewGroup, false);
        m27078a(y4o0Var, viewInflate);
        return viewInflate;
    }
}
