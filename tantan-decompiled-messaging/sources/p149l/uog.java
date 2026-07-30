package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class uog {
    /* JADX INFO: renamed from: a */
    public static void m194552a(FeedBannersView feedBannersView, View view) {
        feedBannersView.f42699a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBannersView.f42700b = (VPager) viewGroup.getChildAt(0);
        feedBannersView.f42701c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194553b(FeedBannersView feedBannersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142062L, viewGroup, false);
        m194552a(feedBannersView, viewInflate);
        return viewInflate;
    }
}
