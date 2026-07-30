package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class j3l {
    /* JADX INFO: renamed from: a */
    public static void m143358a(i3l i3lVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i3lVar.f112735a = (VNavigationBar) viewGroup.getChildAt(0);
        i3lVar.f112736b = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        i3lVar.f112737c = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        i3lVar.f112738d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143359b(i3l i3lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193928z0, viewGroup, false);
        m143358a(i3lVar, viewInflate);
        return viewInflate;
    }
}
