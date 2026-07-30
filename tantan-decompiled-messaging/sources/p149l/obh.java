package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class obh {
    /* JADX INFO: renamed from: a */
    public static void m163442a(FeedLiveRecommendView feedLiveRecommendView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveRecommendView.f42025d = (VDraweeView) viewGroup.getChildAt(0);
        feedLiveRecommendView.f42026e = (TextView) viewGroup.getChildAt(1);
        feedLiveRecommendView.f42027f = (TextView) viewGroup.getChildAt(2);
        feedLiveRecommendView.f42028g = (TextView) viewGroup.getChildAt(3);
    }
}
