package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.m6c0;
import l.ox40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class px40 {
    /* JADX INFO: renamed from: a */
    public static void m8842a(ox40 ox40Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ox40Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ox40Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ox40Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        ox40Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        ox40Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ox40Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ox40Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ox40Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        ox40Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        ox40Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(3);
        ox40Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2);
        ox40Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        ox40Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        ox40Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        ox40Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        ox40Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(2);
        ox40Var.z = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(3);
        ox40Var.A = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ox40Var.B = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ox40Var.C = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        ox40Var.D = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        ox40Var.E = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8843b(ox40 ox40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.X0, viewGroup, false);
        m8842a(ox40Var, viewInflate);
        return viewInflate;
    }
}
