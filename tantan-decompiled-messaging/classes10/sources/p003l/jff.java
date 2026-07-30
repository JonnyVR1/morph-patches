package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import l.f6c0;
import l.iff;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jff {
    /* JADX INFO: renamed from: a */
    public static void m7409a(iff iffVar, View view) {
        iffVar.e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iffVar.f = viewGroup.getChildAt(0);
        iffVar.g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iffVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        iffVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.j = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iffVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        iffVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        iffVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        iffVar.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        iffVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        iffVar.q = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        iffVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        iffVar.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iffVar.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        iffVar.u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iffVar.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        iffVar.w = viewGroup.getChildAt(2);
        iffVar.x = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iffVar.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7410b(iff iffVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.F9, viewGroup, false);
        m7409a(iffVar, viewInflate);
        return viewInflate;
    }
}
