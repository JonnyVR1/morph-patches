package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.j4p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k4p {
    /* JADX INFO: renamed from: a */
    public static void m7530a(j4p j4pVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j4pVar.f = viewGroup.getChildAt(0);
        j4pVar.g = viewGroup.getChildAt(1);
        j4pVar.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j4pVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j4pVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        j4pVar.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        j4pVar.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        j4pVar.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        j4pVar.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m7531b(j4p j4pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.O4, viewGroup, false);
        m7530a(j4pVar, viewInflate);
        return viewInflate;
    }
}
