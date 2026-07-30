package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.e2x;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f2x {
    /* JADX INFO: renamed from: a */
    public static void m6374a(e2x e2xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e2xVar.a = viewGroup.getChildAt(0);
        e2xVar.b = viewGroup.getChildAt(1);
        e2xVar.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e2xVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        e2xVar.e = viewGroup.getChildAt(2);
        e2xVar.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e2xVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6375b(e2x e2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.j0, viewGroup, false);
        m6374a(e2xVar, viewInflate);
        return viewInflate;
    }
}
