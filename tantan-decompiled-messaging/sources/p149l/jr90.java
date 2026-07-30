package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jr90 {
    /* JADX INFO: renamed from: a */
    public static void m142924a(ir90 ir90Var, View view) {
        ir90Var.f114597u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ir90Var.f114598v = (LinearLayout) viewGroup.getChildAt(0);
        ir90Var.f114599w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ir90Var.f114600x = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ir90Var.f114601y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ir90Var.f114602z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ir90Var.f114594A = (LinearLayout) viewGroup.getChildAt(1);
        ir90Var.f114595B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ir90Var.f114596C = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m142925b(ir90 ir90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95436K9, viewGroup, false);
        m142924a(ir90Var, viewInflate);
        return viewInflate;
    }
}
