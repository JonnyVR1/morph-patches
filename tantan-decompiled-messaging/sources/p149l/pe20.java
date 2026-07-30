package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class pe20 {
    /* JADX INFO: renamed from: a */
    public static void m168500a(oe20 oe20Var, View view) {
        oe20Var.f143259a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oe20Var.f143260b = (VNavigationBar) viewGroup.getChildAt(0);
        oe20Var.f143261c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oe20Var.f143262d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oe20Var.f143263e = (VLinear) viewGroup.getChildAt(2);
        oe20Var.f143264f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        oe20Var.f143265g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m168501b(oe20 oe20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137363l0, viewGroup, false);
        m168500a(oe20Var, viewInflate);
        return viewInflate;
    }
}
