package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.nc5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oc5 {
    /* JADX INFO: renamed from: a */
    public static void m8439a(nc5 nc5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nc5Var.a = (LinearLayout) viewGroup.getChildAt(0);
        nc5Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nc5Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nc5Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nc5Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        nc5Var.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nc5Var.g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nc5Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        nc5Var.i = viewGroup.getChildAt(2);
    }
}
