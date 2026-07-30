package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.bq;
import l.n6c0;

/* JADX INFO: renamed from: l.cq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3313cq {
    /* JADX INFO: renamed from: a */
    public static void m5990a(bq bqVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bqVar.a = viewGroup.getChildAt(0);
        bqVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bqVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bqVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        bqVar.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5991b(bq bqVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.e, viewGroup, false);
        m5990a(bqVar, viewInflate);
        return viewInflate;
    }
}
