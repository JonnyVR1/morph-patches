package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import p151v.VFrame;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class wbj {
    /* JADX INFO: renamed from: a */
    public static void m205718a(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, View view) {
        friendsFeedViewPagerFrag.f42376z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        friendsFeedViewPagerFrag.f42347A = (DiscoveryPager) viewGroup.getChildAt(0);
        friendsFeedViewPagerFrag.f42348B = (VFrame) viewGroup.getChildAt(1);
        friendsFeedViewPagerFrag.f42349C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m205719b(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173783x0, viewGroup, false);
        m205718a(friendsFeedViewPagerFrag, viewInflate);
        return viewInflate;
    }
}
