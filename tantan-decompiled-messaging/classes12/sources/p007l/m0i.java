package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m0i {
    /* JADX INFO: renamed from: a */
    public static void m11745a(FeedStateCardView feedStateCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateCardView.f4192a = viewGroup.getChildAt(0);
        feedStateCardView.f4193b = (FeedStatesMediaView) viewGroup.getChildAt(1);
        feedStateCardView.f4194c = viewGroup.getChildAt(2);
        feedStateCardView.f4195d = (FeedVideoLikeContainerView) viewGroup.getChildAt(3);
        feedStateCardView.f4196e = viewGroup.getChildAt(4);
        feedStateCardView.f4197f = (TextView) viewGroup.getChildAt(5);
        feedStateCardView.f4198g = viewGroup.getChildAt(6);
        feedStateCardView.f4199h = viewGroup.getChildAt(7);
        feedStateCardView.f4200i = (TextView) viewGroup.getChildAt(8);
        feedStateCardView.f4201j = (TextView) viewGroup.getChildAt(9);
        feedStateCardView.f4202k = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m11746b(FeedStateCardView feedStateCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11315u3, viewGroup, false);
        m11745a(feedStateCardView, viewInflate);
        return viewInflate;
    }
}
