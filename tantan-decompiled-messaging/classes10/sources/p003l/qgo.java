package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.pgo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qgo {
    /* JADX INFO: renamed from: a */
    public static void m8984a(pgo pgoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pgoVar.c = viewGroup.getChildAt(0);
        pgoVar.d = (FrameLayout) viewGroup.getChildAt(1);
        pgoVar.e = viewGroup.getChildAt(2);
        pgoVar.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pgoVar.g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        pgoVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pgoVar.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        pgoVar.j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        pgoVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        pgoVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        pgoVar.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        pgoVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        pgoVar.o = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        pgoVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        pgoVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        pgoVar.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(2);
        pgoVar.s = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        pgoVar.t = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        pgoVar.u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        pgoVar.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        pgoVar.w = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m8985b(pgo pgoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5442A, viewGroup, false);
        m8984a(pgoVar, viewInflate);
        return viewInflate;
    }
}
