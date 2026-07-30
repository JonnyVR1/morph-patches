package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.oj30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rj30 {
    /* JADX INFO: renamed from: a */
    public static void m9146a(oj30 oj30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oj30Var.b = viewGroup.getChildAt(0);
        oj30Var.c = viewGroup.getChildAt(1);
        oj30Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9147b(oj30 oj30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5503U0, viewGroup, false);
        m9146a(oj30Var, viewInflate);
        return viewInflate;
    }
}
