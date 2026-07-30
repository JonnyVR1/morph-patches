package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.IntlBounceBackViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.IntlTopCardLayout;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class pfp {
    /* JADX INFO: renamed from: a */
    public static void m172139a(IntlTopCardLayout intlTopCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTopCardLayout._viewpager = (IntlBounceBackViewPager) viewGroup.getChildAt(0);
        intlTopCardLayout._indicator = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m172140b(IntlTopCardLayout intlTopCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125861h5, viewGroup, true);
        m172139a(intlTopCardLayout, viewInflate);
        return viewInflate;
    }
}
