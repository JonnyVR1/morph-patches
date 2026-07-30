package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.BounceBackViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class q2j0 {
    /* JADX INFO: renamed from: a */
    public static void m175042a(TopCardLayout topCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topCardLayout._viewpager = (BounceBackViewPager) viewGroup.getChildAt(0);
        topCardLayout._indicator = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m175043b(TopCardLayout topCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126017q9, viewGroup, true);
        m175042a(topCardLayout, viewInflate);
        return viewInflate;
    }
}
