package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.byw;
import l.n6c0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cyw {
    /* JADX INFO: renamed from: a */
    public static void m6021a(byw bywVar, View view) {
        bywVar.c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bywVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bywVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bywVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bywVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        bywVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        bywVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        bywVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        bywVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        bywVar.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bywVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        bywVar.n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        bywVar.o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6022b(byw bywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.Z, viewGroup, false);
        m6021a(bywVar, viewInflate);
        return viewInflate;
    }
}
