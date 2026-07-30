package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.ir90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jr90 {
    /* JADX INFO: renamed from: a */
    public static void m7457a(ir90 ir90Var, View view) {
        ir90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ir90Var.v = (LinearLayout) viewGroup.getChildAt(0);
        ir90Var.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ir90Var.x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ir90Var.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ir90Var.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ir90Var.A = (LinearLayout) viewGroup.getChildAt(1);
        ir90Var.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ir90Var.C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7458b(ir90 ir90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.K9, viewGroup, false);
        m7457a(ir90Var, viewInflate);
        return viewInflate;
    }
}
