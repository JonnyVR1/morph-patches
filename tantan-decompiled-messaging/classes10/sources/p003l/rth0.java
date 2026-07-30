package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.qth0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rth0 {
    /* JADX INFO: renamed from: a */
    public static void m9186a(qth0 qth0Var, View view) {
        qth0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qth0Var.g = viewGroup.getChildAt(0);
        qth0Var.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9187b(qth0 qth0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.wc, viewGroup, false);
        m9186a(qth0Var, viewInflate);
        return viewInflate;
    }
}
