package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.banner.DrawerBannersView;
import p147v.AspectRatioViewPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class nce {
    /* JADX INFO: renamed from: a */
    public static void m158929a(DrawerBannersView drawerBannersView, View view) {
        drawerBannersView.f28478a = (DrawerBannersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawerBannersView.f28479b = (AspectRatioViewPager) viewGroup.getChildAt(0);
        drawerBannersView.f28480c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
