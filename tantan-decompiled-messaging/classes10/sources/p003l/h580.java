package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.g580;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h580 {
    /* JADX INFO: renamed from: a */
    public static void m6915a(g580 g580Var, View view) {
        g580Var.l = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6916b(g580 g580Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.t0, viewGroup, false);
        m6915a(g580Var, viewInflate);
        return viewInflate;
    }
}
