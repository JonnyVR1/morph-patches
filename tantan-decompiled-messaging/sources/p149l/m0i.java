package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class m0i {
    /* JADX INFO: renamed from: a */
    public static void m152506a(FeedStateCardView feedStateCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateCardView.f42731a = (SimpleDraweeView) viewGroup.getChildAt(0);
        feedStateCardView.f42732b = (FeedStatesMediaView) viewGroup.getChildAt(1);
        feedStateCardView.f42733c = (VImage) viewGroup.getChildAt(2);
        feedStateCardView.f42734d = (FeedVideoLikeContainerView) viewGroup.getChildAt(3);
        feedStateCardView.f42735e = (VText) viewGroup.getChildAt(4);
        feedStateCardView.f42736f = (TextView) viewGroup.getChildAt(5);
        feedStateCardView.f42737g = (VText) viewGroup.getChildAt(6);
        feedStateCardView.f42738h = (VDraweeView) viewGroup.getChildAt(7);
        feedStateCardView.f42739i = (TextView) viewGroup.getChildAt(8);
        feedStateCardView.f42740j = (TextView) viewGroup.getChildAt(9);
        feedStateCardView.f42741k = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m152507b(FeedStateCardView feedStateCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142296u3, viewGroup, false);
        m152506a(feedStateCardView, viewInflate);
        return viewInflate;
    }
}
