package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.ti90;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ui90 {
    /* JADX INFO: renamed from: a */
    public static void m9736a(ti90 ti90Var, View view) {
        ti90Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ti90Var.g = viewGroup.getChildAt(0);
        ti90Var.h = (LinearLayout) viewGroup.getChildAt(1);
        ti90Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ti90Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
