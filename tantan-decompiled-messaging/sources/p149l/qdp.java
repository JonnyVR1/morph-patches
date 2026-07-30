package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.IntlBounceBackViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class qdp {
    /* JADX INFO: renamed from: a */
    public static void m174083a(IntlTopCardLayout intlTopCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTopCardLayout._viewpager = (IntlBounceBackViewPager) viewGroup.getChildAt(0);
        intlTopCardLayout._indicator = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174084b(IntlTopCardLayout intlTopCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95272A5, viewGroup, true);
        m174083a(intlTopCardLayout, viewInflate);
        return viewInflate;
    }
}
