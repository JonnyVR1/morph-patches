package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class ni90 {
    /* JADX INFO: renamed from: a */
    public static void m159495a(mi90 mi90Var, View view) {
        mi90Var.f133948u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mi90Var.f133949v = (VText) viewGroup.getChildAt(0);
        mi90Var.f133950w = (VText) viewGroup.getChildAt(1);
        mi90Var.f133951x = (VText) viewGroup.getChildAt(2);
        mi90Var.f133952y = (VText_Tags) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m159496b(mi90 mi90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95548R9, viewGroup, false);
        m159495a(mi90Var, viewInflate);
        return viewInflate;
    }
}
