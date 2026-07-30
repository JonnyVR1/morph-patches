package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class up4 {
    /* JADX INFO: renamed from: a */
    public static void m194603a(tp4 tp4Var, View view) {
        tp4Var.f171432g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tp4Var.f171433h = viewGroup.getChildAt(0);
        tp4Var.f171434i = (VPager) viewGroup.getChildAt(1);
        tp4Var.f171435j = (VPagerCircleIndicator) viewGroup.getChildAt(2);
        tp4Var.f171436k = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m194604b(tp4 tp4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95735d1, viewGroup, false);
        m194603a(tp4Var, viewInflate);
        return viewInflate;
    }
}
