package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class tq4 {
    /* JADX INFO: renamed from: a */
    public static void m192232a(sq4 sq4Var, View view) {
        sq4Var.f170134g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sq4Var.f170135h = viewGroup.getChildAt(0);
        sq4Var.f170136i = (VPager) viewGroup.getChildAt(1);
        sq4Var.f170137j = (VPagerCircleIndicator) viewGroup.getChildAt(2);
        sq4Var.f170138k = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m192233b(sq4 sq4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125789d1, viewGroup, false);
        m192232a(sq4Var, viewInflate);
        return viewInflate;
    }
}
