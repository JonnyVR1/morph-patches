package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.eia0;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fia0 {
    /* JADX INFO: renamed from: a */
    public static void m6474a(eia0 eia0Var, View view) {
        eia0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eia0Var.b = (TextView) viewGroup.getChildAt(0);
        eia0Var.c = (TextView) viewGroup.getChildAt(1);
        eia0Var.d = viewGroup.getChildAt(2);
        eia0Var.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6475b(eia0 eia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.D0, viewGroup, false);
        m6474a(eia0Var, viewInflate);
        return viewInflate;
    }
}
