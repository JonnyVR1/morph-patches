package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.fyw;
import l.n6c0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hyw {
    /* JADX INFO: renamed from: a */
    public static void m7089a(fyw fywVar, View view) {
        fywVar.c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fywVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fywVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7090b(fyw fywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.b0, viewGroup, false);
        m7089a(fywVar, viewInflate);
        return viewInflate;
    }
}
