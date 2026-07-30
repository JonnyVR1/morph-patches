package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vpe0 {
    /* JADX INFO: renamed from: a */
    public static void m202230a(upe0 upe0Var, View view) {
        upe0Var.f180246a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        upe0Var.f180247b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        upe0Var.f180248c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        upe0Var.f180249d = (VText) viewGroup.getChildAt(1);
        upe0Var.f180250e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        upe0Var.f180251f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        upe0Var.f180252g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        upe0Var.f180253h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        upe0Var.f180254i = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        upe0Var.f180255j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        upe0Var.f180256k = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        upe0Var.f180257l = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        upe0Var.f180258m = (VText) viewGroup.getChildAt(4);
        upe0Var.f180259n = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        upe0Var.f180260o = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        upe0Var.f180261p = (VText) viewGroup.getChildAt(7);
        upe0Var.f180262q = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m202231b(upe0 upe0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157111r4, viewGroup, false);
        m202230a(upe0Var, viewInflate);
        return viewInflate;
    }
}
