package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class l4l0 {
    /* JADX INFO: renamed from: a */
    public static void m152788a(k4l0 k4l0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k4l0Var.f123896a = (VNavigationBar) viewGroup.getChildAt(0);
        k4l0Var.f123897b = (VLinear) viewGroup.getChildAt(1);
        k4l0Var.f123898c = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152789b(k4l0 k4l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125653Uc, viewGroup, false);
        m152788a(k4l0Var, viewInflate);
        return viewInflate;
    }
}
