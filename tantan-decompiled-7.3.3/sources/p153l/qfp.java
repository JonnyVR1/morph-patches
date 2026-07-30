package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.IntlBounceBackViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class qfp {
    /* JADX INFO: renamed from: a */
    public static void m176389a(IntlTopCardLayout intlTopCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTopCardLayout._viewpager = (IntlBounceBackViewPager) viewGroup.getChildAt(0);
        intlTopCardLayout._indicator = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176390b(IntlTopCardLayout intlTopCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125338B5, viewGroup, true);
        m176389a(intlTopCardLayout, viewInflate);
        return viewInflate;
    }
}
