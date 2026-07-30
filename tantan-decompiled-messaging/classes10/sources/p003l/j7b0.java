package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.i7b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j7b0 {
    /* JADX INFO: renamed from: a */
    public static void m7376a(i7b0 i7b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i7b0Var.t = viewGroup.getChildAt(0);
        i7b0Var.u = viewGroup.getChildAt(1);
        i7b0Var.v = viewGroup.getChildAt(2);
        i7b0Var.w = (LinearLayout) viewGroup.getChildAt(3);
        i7b0Var.x = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        i7b0Var.y = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        i7b0Var.z = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        i7b0Var.A = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        i7b0Var.B = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
    }
}
