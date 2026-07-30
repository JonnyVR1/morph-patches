package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.ada0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bda0 {
    /* JADX INFO: renamed from: a */
    public static void m5710a(ada0 ada0Var, View view) {
        ada0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ada0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ada0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ada0Var.i = viewGroup.getChildAt(1);
    }
}
