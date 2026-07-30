package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class b2i {
    /* JADX INFO: renamed from: a */
    public static void m102166a(FeedStateCardView feedStateCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateCardView.f43579a = (SimpleDraweeView) viewGroup.getChildAt(0);
        feedStateCardView.f43580b = (FeedStatesMediaView) viewGroup.getChildAt(1);
        feedStateCardView.f43581c = (VImage) viewGroup.getChildAt(2);
        feedStateCardView.f43582d = (FeedVideoLikeContainerView) viewGroup.getChildAt(3);
        feedStateCardView.f43583e = (VText) viewGroup.getChildAt(4);
        feedStateCardView.f43584f = (TextView) viewGroup.getChildAt(5);
        feedStateCardView.f43585g = (VText) viewGroup.getChildAt(6);
        feedStateCardView.f43586h = (VDraweeView) viewGroup.getChildAt(7);
        feedStateCardView.f43587i = (TextView) viewGroup.getChildAt(8);
        feedStateCardView.f43588j = (TextView) viewGroup.getChildAt(9);
        feedStateCardView.f43589k = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m102167b(FeedStateCardView feedStateCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173765u3, viewGroup, false);
        m102166a(feedStateCardView, viewInflate);
        return viewInflate;
    }
}
