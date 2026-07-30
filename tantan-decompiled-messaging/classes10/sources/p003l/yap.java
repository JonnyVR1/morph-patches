package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.xap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yap {
    /* JADX INFO: renamed from: a */
    public static void m11165a(xap xapVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xapVar.b = viewGroup.getChildAt(0);
        xapVar.c = viewGroup.getChildAt(2);
        xapVar.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xapVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xapVar.f = viewGroup.getChildAt(3);
        xapVar.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        xapVar.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        xapVar.i = viewGroup.getChildAt(4);
        xapVar.j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        xapVar.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        xapVar.l = viewGroup.getChildAt(5);
        xapVar.m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        xapVar.n = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        xapVar.o = viewGroup.getChildAt(7);
        xapVar.p = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        xapVar.q = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        xapVar.r = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        xapVar.s = viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m11166b(xap xapVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.K5, viewGroup, false);
        m11165a(xapVar, viewInflate);
        return viewInflate;
    }
}
