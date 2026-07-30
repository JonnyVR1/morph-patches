package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ha60 {
    /* JADX INFO: renamed from: a */
    public static void m130068a(ga60 ga60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ga60Var.f101631a = (VNavigationBar) viewGroup.getChildAt(0);
        ga60Var.f101632b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ga60Var.f101633c = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130069b(ga60 ga60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137356i, viewGroup, false);
        m130068a(ga60Var, viewInflate);
        return viewInflate;
    }
}
