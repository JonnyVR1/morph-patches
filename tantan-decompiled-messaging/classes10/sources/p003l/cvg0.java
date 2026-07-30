package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.bvg0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cvg0 {
    /* JADX INFO: renamed from: a */
    public static void m6005a(bvg0 bvg0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bvg0Var.a = viewGroup.getChildAt(0);
        bvg0Var.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6006b(bvg0 bvg0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.gc, viewGroup, false);
        m6005a(bvg0Var, viewInflate);
        return viewInflate;
    }
}
