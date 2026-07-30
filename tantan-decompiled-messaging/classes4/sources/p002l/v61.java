package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.u61;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v61 {
    /* JADX INFO: renamed from: a */
    public static void m23784a(u61 u61Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        u61Var.x = viewGroup.getChildAt(0);
        u61Var.y = viewGroup.getChildAt(1);
        u61Var.z = (TextView) viewGroup.getChildAt(2);
        u61Var.A = (TextView) viewGroup.getChildAt(3);
        u61Var.B = (TextView) viewGroup.getChildAt(4);
        u61Var.C = (TextView) viewGroup.getChildAt(5);
    }
}
