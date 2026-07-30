package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.lkf;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mkf {
    /* JADX INFO: renamed from: a */
    public static void m8163a(lkf lkfVar, View view) {
        lkfVar.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lkfVar.b = viewGroup.getChildAt(0);
        lkfVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        lkfVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        lkfVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        lkfVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        lkfVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        lkfVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        lkfVar.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        lkfVar.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        lkfVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        lkfVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        lkfVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        lkfVar.n = viewGroup.getChildAt(1);
        lkfVar.o = viewGroup.getChildAt(2);
        lkfVar.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        lkfVar.q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8164b(lkf lkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.S2, viewGroup, false);
        m8163a(lkfVar, viewInflate);
        return viewInflate;
    }
}
