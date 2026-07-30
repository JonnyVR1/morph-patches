package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class uo00 {
    /* JADX INFO: renamed from: a */
    public static void m194540a(to00 to00Var, View view) {
        to00Var.f171304a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        to00Var.f171305b = (VPager) viewGroup.getChildAt(0);
        to00Var.f171306c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194541b(to00 to00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142325y4, viewGroup, false);
        m194540a(to00Var, viewInflate);
        return viewInflate;
    }
}
