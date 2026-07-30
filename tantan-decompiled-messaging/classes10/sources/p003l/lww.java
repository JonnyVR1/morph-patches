package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.kww;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lww {
    /* JADX INFO: renamed from: a */
    public static void m7924a(kww kwwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kwwVar.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kwwVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kwwVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        kwwVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        kwwVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        kwwVar.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7925b(kww kwwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.L, viewGroup, false);
        m7924a(kwwVar, viewInflate);
        return viewInflate;
    }
}
