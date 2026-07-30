package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.u2x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v2x {
    /* JADX INFO: renamed from: a */
    public static void m9806a(u2x u2xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        u2xVar.a = viewGroup.getChildAt(0);
        u2xVar.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        u2xVar.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        u2xVar.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        u2xVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        u2xVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        u2xVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        u2xVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        u2xVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        u2xVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        u2xVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        u2xVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        u2xVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        u2xVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        u2xVar.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        u2xVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        u2xVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        u2xVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        u2xVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        u2xVar.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(2);
        u2xVar.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        u2xVar.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(3);
        u2xVar.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        u2xVar.x = viewGroup.getChildAt(2);
        u2xVar.y = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9807b(u2x u2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.c7, viewGroup, false);
        m9806a(u2xVar, viewInflate);
        return viewInflate;
    }
}
