package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.t6b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u6b0 {
    /* JADX INFO: renamed from: a */
    public static void m9653a(t6b0 t6b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t6b0Var.t = (LinearLayout) viewGroup.getChildAt(0);
        t6b0Var.u = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        t6b0Var.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        t6b0Var.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        t6b0Var.x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        t6b0Var.y = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        t6b0Var.z = viewGroup.getChildAt(1);
        t6b0Var.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        t6b0Var.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        t6b0Var.C = viewGroup.getChildAt(2);
        t6b0Var.D = (FrameLayout) viewGroup.getChildAt(3);
    }
}
