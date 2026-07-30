package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VScroll_Horizontal;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l450 {
    /* JADX INFO: renamed from: a */
    public static void m152746a(k450 k450Var, View view) {
        k450Var.f123829a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k450Var.f123830b = viewGroup.getChildAt(0);
        k450Var.f123831c = viewGroup.getChildAt(1);
        k450Var.f123832d = viewGroup.getChildAt(2);
        k450Var.f123833e = (VDraweeView) viewGroup.getChildAt(3);
        k450Var.f123834f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        k450Var.f123835g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        k450Var.f123836h = (VLinear_FillerMeasure) viewGroup.getChildAt(5);
        k450Var.f123837i = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        k450Var.f123838j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        k450Var.f123839k = (VText) viewGroup.getChildAt(6);
        k450Var.f123840l = (LinearLayout) viewGroup.getChildAt(7);
        k450Var.f123841m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        k450Var.f123842n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        k450Var.f123843o = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        k450Var.f123844p = (LinearLayout) viewGroup.getChildAt(8);
        k450Var.f123845q = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        k450Var.f123846r = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        k450Var.f123847s = (VScroll_Horizontal) viewGroup.getChildAt(9);
        k450Var.f123848t = (VLinear) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        k450Var.f123849u = (FrameLayout) viewGroup.getChildAt(10);
        k450Var.f123850v = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m152747b(k450 k450Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151937Q1, viewGroup, false);
        m152746a(k450Var, viewInflate);
        return viewInflate;
    }
}
