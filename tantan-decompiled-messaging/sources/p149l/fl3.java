package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fl3 {
    /* JADX INFO: renamed from: a */
    public static void m121947a(el3 el3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        el3Var.f92060a = (VNavigationBar) viewGroup.getChildAt(0);
        el3Var.f92061b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        el3Var.f92062c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        el3Var.f92063d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        el3Var.f92064e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m121948b(el3 el3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95750e, viewGroup, false);
        m121947a(el3Var, viewInflate);
        return viewInflate;
    }
}
