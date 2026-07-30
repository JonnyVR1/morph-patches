package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.lfh0;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mfh0 {
    /* JADX INFO: renamed from: a */
    public static void m8153a(lfh0 lfh0Var, View view) {
        lfh0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lfh0Var.b = viewGroup.getChildAt(0);
        lfh0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        lfh0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        lfh0Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        lfh0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        lfh0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        lfh0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8154b(lfh0 lfh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.S0, viewGroup, false);
        m8153a(lfh0Var, viewInflate);
        return viewInflate;
    }
}
