package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class obh {
    /* JADX INFO: renamed from: a */
    public static void m12511a(FeedLiveRecommendView feedLiveRecommendView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveRecommendView.f3486d = viewGroup.getChildAt(0);
        feedLiveRecommendView.f3487e = (TextView) viewGroup.getChildAt(1);
        feedLiveRecommendView.f3488f = (TextView) viewGroup.getChildAt(2);
        feedLiveRecommendView.f3489g = (TextView) viewGroup.getChildAt(3);
    }
}
