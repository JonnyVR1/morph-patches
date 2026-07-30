package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.ymj0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zmj0 {
    /* JADX INFO: renamed from: a */
    public static void m27435a(ymj0 ymj0Var, View view) {
        ymj0Var.i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ymj0Var.j = viewGroup.getChildAt(0);
        ymj0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ymj0Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ymj0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ymj0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        ymj0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        ymj0Var.p = viewGroup.getChildAt(2);
    }
}
