package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.yj90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zj90 {
    /* JADX INFO: renamed from: a */
    public static void m11427a(yj90 yj90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yj90Var.u = viewGroup.getChildAt(0);
        yj90Var.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yj90Var.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yj90Var.x = viewGroup.getChildAt(1);
        yj90Var.y = viewGroup.getChildAt(2);
        yj90Var.z = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yj90Var.A = viewGroup.getChildAt(3);
        yj90Var.B = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        yj90Var.C = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        yj90Var.D = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        yj90Var.E = viewGroup.getChildAt(4);
        yj90Var.F = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        yj90Var.G = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        yj90Var.H = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11428b(yj90 yj90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.y9, viewGroup, false);
        m11427a(yj90Var, viewInflate);
        return viewInflate;
    }
}
