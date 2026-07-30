package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.seh0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class teh0 {
    /* JADX INFO: renamed from: a */
    public static void m9570a(seh0 seh0Var, View view) {
        seh0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        seh0Var.b = viewGroup.getChildAt(0);
        seh0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        seh0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        seh0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        seh0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        seh0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9571b(seh0 seh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.R0, viewGroup, false);
        m9570a(seh0Var, viewInflate);
        return viewInflate;
    }
}
