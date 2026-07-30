package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import l.hnd0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jnd0 {
    /* JADX INFO: renamed from: a */
    public static void m7431a(hnd0 hnd0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hnd0Var.a = viewGroup.getChildAt(0);
        hnd0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hnd0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hnd0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hnd0Var.e = (FrameLayout) viewGroup.getChildAt(1);
        hnd0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hnd0Var.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hnd0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hnd0Var.i = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7432b(hnd0 hnd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.c2, viewGroup, false);
        m7431a(hnd0Var, viewInflate);
        return viewInflate;
    }
}
