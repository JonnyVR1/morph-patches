package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.f6c0;
import l.kpi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lpi {
    /* JADX INFO: renamed from: a */
    public static void m7763a(kpi kpiVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kpiVar.b = viewGroup.getChildAt(0);
        kpiVar.c = (ImageView) viewGroup.getChildAt(1);
        kpiVar.d = viewGroup.getChildAt(2);
        kpiVar.e = viewGroup.getChildAt(3);
        kpiVar.f = viewGroup.getChildAt(4);
        kpiVar.g = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7764b(kpi kpiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H4, viewGroup, false);
        m7763a(kpiVar, viewInflate);
        return viewInflate;
    }
}
