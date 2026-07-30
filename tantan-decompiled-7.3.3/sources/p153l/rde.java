package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.banner.DrawerBannersView;
import p151v.AspectRatioViewPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class rde {
    /* JADX INFO: renamed from: a */
    public static void m180846a(DrawerBannersView drawerBannersView, View view) {
        drawerBannersView.f29326a = (DrawerBannersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawerBannersView.f29327b = (AspectRatioViewPager) viewGroup.getChildAt(0);
        drawerBannersView.f29328c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
