package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.sxw;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class txw {
    /* JADX INFO: renamed from: a */
    public static void m9633a(sxw sxwVar, View view) {
        sxwVar.c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sxwVar.d = viewGroup.getChildAt(0);
        sxwVar.e = viewGroup.getChildAt(1);
        sxwVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sxwVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9634b(sxw sxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.Q, viewGroup, false);
        m9633a(sxwVar, viewInflate);
        return viewInflate;
    }
}
