package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c9j {
    /* JADX INFO: renamed from: a */
    public static void m9110a(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, View view) {
        friendsFeedViewPagerFrag.f2989z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        friendsFeedViewPagerFrag.f2960A = (DiscoveryPager) viewGroup.getChildAt(0);
        friendsFeedViewPagerFrag.f2961B = viewGroup.getChildAt(1);
        friendsFeedViewPagerFrag.f2962C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9111b(FriendsFeedViewPagerFrag friendsFeedViewPagerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11333x0, viewGroup, false);
        m9110a(friendsFeedViewPagerFrag, viewInflate);
        return viewInflate;
    }
}
