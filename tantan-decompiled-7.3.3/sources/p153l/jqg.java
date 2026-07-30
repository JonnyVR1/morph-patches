package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class jqg {
    /* JADX INFO: renamed from: a */
    public static void m146579a(FeedBannersView feedBannersView, View view) {
        feedBannersView.f43547a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBannersView.f43548b = (VPager) viewGroup.getChildAt(0);
        feedBannersView.f43549c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146580b(FeedBannersView feedBannersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173531L, viewGroup, false);
        m146579a(feedBannersView, viewInflate);
        return viewInflate;
    }
}
