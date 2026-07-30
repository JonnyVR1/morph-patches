package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.n320;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o320 {
    /* JADX INFO: renamed from: a */
    public static void m8393a(n320 n320Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        n320Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n320Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        n320Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        n320Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        n320Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        n320Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        n320Var.l = viewGroup.getChildAt(1);
    }
}
