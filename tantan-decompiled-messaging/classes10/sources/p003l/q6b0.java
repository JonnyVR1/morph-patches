package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.p6b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q6b0 {
    /* JADX INFO: renamed from: a */
    public static void m8918a(p6b0 p6b0Var, View view) {
        p6b0Var.K = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p6b0Var.L = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p6b0Var.M = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        p6b0Var.N = viewGroup.getChildAt(1);
    }
}
