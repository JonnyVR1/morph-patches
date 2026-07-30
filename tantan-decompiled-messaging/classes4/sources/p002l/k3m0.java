package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import l.j3m0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k3m0 {
    /* JADX INFO: renamed from: a */
    public static void m16494a(j3m0 j3m0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j3m0Var.k = viewGroup.getChildAt(0);
        j3m0Var.l = viewGroup.getChildAt(1);
        j3m0Var.m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j3m0Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j3m0Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        j3m0Var.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        j3m0Var.q = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
