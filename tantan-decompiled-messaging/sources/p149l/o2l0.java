package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VFrame_Shadow;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o2l0 {
    /* JADX INFO: renamed from: a */
    public static void m162303a(n2l0 n2l0Var, View view) {
        n2l0Var.f136850e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        n2l0Var.f136851f = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n2l0Var.f136852g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        n2l0Var.f136853h = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        n2l0Var.f136854i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        n2l0Var.f136855j = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        n2l0Var.f136856k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m162304b(n2l0 n2l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95980r9, viewGroup, false);
        m162303a(n2l0Var, viewInflate);
        return viewInflate;
    }
}
