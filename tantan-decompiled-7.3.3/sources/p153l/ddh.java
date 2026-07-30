package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class ddh {
    /* JADX INFO: renamed from: a */
    public static void m115340a(FeedLiveRecommendView feedLiveRecommendView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveRecommendView.f42873d = (VDraweeView) viewGroup.getChildAt(0);
        feedLiveRecommendView.f42874e = (TextView) viewGroup.getChildAt(1);
        feedLiveRecommendView.f42875f = (TextView) viewGroup.getChildAt(2);
        feedLiveRecommendView.f42876g = (TextView) viewGroup.getChildAt(3);
    }
}
