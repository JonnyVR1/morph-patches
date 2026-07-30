package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.pc5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qc5 {
    /* JADX INFO: renamed from: a */
    public static void m8953a(pc5 pc5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pc5Var.a = viewGroup.getChildAt(1);
        pc5Var.b = viewGroup.getChildAt(2);
        pc5Var.c = (LinearLayout) viewGroup.getChildAt(3);
        pc5Var.d = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pc5Var.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
