package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.dnj0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class enj0 {
    /* JADX INFO: renamed from: a */
    public static void m12622a(dnj0 dnj0Var, View view) {
        dnj0Var.i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dnj0Var.j = viewGroup.getChildAt(0);
        dnj0Var.k = viewGroup.getChildAt(1);
        dnj0Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dnj0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dnj0Var.n = viewGroup.getChildAt(2);
        dnj0Var.o = viewGroup.getChildAt(3);
        dnj0Var.p = viewGroup.getChildAt(4);
        dnj0Var.q = viewGroup.getChildAt(5);
    }
}
