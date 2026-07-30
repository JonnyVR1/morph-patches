package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VListCell;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tv4 {
    /* JADX INFO: renamed from: a */
    public static void m190720a(sv4 sv4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sv4Var.f166521a = (VNavigationBar) viewGroup.getChildAt(0);
        sv4Var.f166522b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sv4Var.f166523c = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m190721b(sv4 sv4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95769f1, viewGroup, false);
        m190720a(sv4Var, viewInflate);
        return viewInflate;
    }
}
