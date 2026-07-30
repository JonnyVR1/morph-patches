package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kpa0 {
    /* JADX INFO: renamed from: a */
    public static void m146834a(jpa0 jpa0Var, View view) {
        jpa0Var.f119136u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jpa0Var.f119137v = (VText) viewGroup.getChildAt(0);
        jpa0Var.f119138w = (VDraweeView) viewGroup.getChildAt(1);
        jpa0Var.f119139x = (VText) viewGroup.getChildAt(2);
        jpa0Var.f119140y = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m146835b(jpa0 jpa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95795ga, viewGroup, false);
        m146834a(jpa0Var, viewInflate);
        return viewInflate;
    }
}
