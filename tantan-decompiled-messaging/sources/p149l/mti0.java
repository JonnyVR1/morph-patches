package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.BounceBackViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.TopCardLayout;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class mti0 {
    /* JADX INFO: renamed from: a */
    public static void m156232a(TopCardLayout topCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topCardLayout._viewpager = (BounceBackViewPager) viewGroup.getChildAt(0);
        topCardLayout._indicator = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m156233b(TopCardLayout topCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95844j9, viewGroup, true);
        m156232a(topCardLayout, viewInflate);
        return viewInflate;
    }
}
