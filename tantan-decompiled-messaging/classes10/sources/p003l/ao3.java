package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import l.h6c0;
import l.zn3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ao3 {
    /* JADX INFO: renamed from: a */
    public static void m5478a(zn3 zn3Var, View view) {
        zn3Var.b = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zn3Var.c = viewGroup.getChildAt(0);
        zn3Var.d = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zn3Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zn3Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        zn3Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        zn3Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        zn3Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        zn3Var.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        zn3Var.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        zn3Var.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        zn3Var.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m5479b(zn3 zn3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.p, viewGroup, false);
        m5478a(zn3Var, viewInflate);
        return viewInflate;
    }
}
