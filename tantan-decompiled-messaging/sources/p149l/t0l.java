package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class t0l {
    /* JADX INFO: renamed from: a */
    public static void m186872a(s0l s0lVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        s0lVar.f161778a = (VNavigationBar) viewGroup.getChildAt(0);
        s0lVar.f161779b = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        s0lVar.f161780c = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        s0lVar.f161781d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m186873b(s0l s0lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162814z0, viewGroup, false);
        m186872a(s0lVar, viewInflate);
        return viewInflate;
    }
}
