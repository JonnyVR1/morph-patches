package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.sq;

/* JADX INFO: renamed from: l.tq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3435tq {
    /* JADX INFO: renamed from: a */
    public static void m9613a(sq sqVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sqVar.a = viewGroup.getChildAt(0);
        sqVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sqVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        sqVar.d = viewGroup.getChildAt(2);
        sqVar.e = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9614b(sq sqVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f, viewGroup, false);
        m9613a(sqVar, viewInflate);
        return viewInflate;
    }
}
