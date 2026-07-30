package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.ohj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class phj {
    /* JADX INFO: renamed from: a */
    public static void m8750a(ohj ohjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ohjVar.a = viewGroup.getChildAt(0);
        ohjVar.b = (TextView) viewGroup.getChildAt(1);
        ohjVar.c = viewGroup.getChildAt(2);
        ohjVar.d = viewGroup.getChildAt(3);
        ohjVar.e = viewGroup.getChildAt(4);
        ohjVar.f = viewGroup.getChildAt(5);
        ohjVar.g = viewGroup.getChildAt(6);
        ohjVar.h = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        ohjVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        ohjVar.j = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        ohjVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        ohjVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        ohjVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        ohjVar.n = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        ohjVar.o = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8751b(ohj ohjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.s, viewGroup, false);
        m8750a(ohjVar, viewInflate);
        return viewInflate;
    }
}
