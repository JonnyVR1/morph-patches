package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.dr5;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class er5 {
    /* JADX INFO: renamed from: a */
    public static void m6313a(dr5 dr5Var, View view) {
        dr5Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dr5Var.g = (FrameLayout) viewGroup.getChildAt(0);
        dr5Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        dr5Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        dr5Var.j = (LinearLayout) viewGroup.getChildAt(1);
        dr5Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dr5Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        dr5Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
