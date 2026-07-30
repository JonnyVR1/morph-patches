package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import p147v.VFrame;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class c9j {
    /* JADX INFO: renamed from: a */
    public static void m105850a(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, View view) {
        friendsFeedViewPagerFrag.f41528z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        friendsFeedViewPagerFrag.f41499A = (DiscoveryPager) viewGroup.getChildAt(0);
        friendsFeedViewPagerFrag.f41500B = (VFrame) viewGroup.getChildAt(1);
        friendsFeedViewPagerFrag.f41501C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m105851b(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142314x0, viewGroup, false);
        m105850a(friendsFeedViewPagerFrag, viewInflate);
        return viewInflate;
    }
}
