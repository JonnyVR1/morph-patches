package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.ih90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jh90 {
    /* JADX INFO: renamed from: a */
    public static void m7415a(ih90 ih90Var, View view) {
        ih90Var.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ih90Var.b = viewGroup.getChildAt(0);
        ih90Var.c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ih90Var.d = viewGroup.getChildAt(1);
        ih90Var.e = viewGroup.getChildAt(2);
        ih90Var.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ih90Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ih90Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ih90Var.i = viewGroup.getChildAt(3);
        ih90Var.j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
