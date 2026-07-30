package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.toc0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uoc0 {
    /* JADX INFO: renamed from: a */
    public static void m9756a(toc0 toc0Var, View view) {
        toc0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        toc0Var.g = (LinearLayout) viewGroup.getChildAt(0);
        toc0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        toc0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        toc0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        toc0Var.k = (LinearLayout) viewGroup.getChildAt(1);
        toc0Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        toc0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
