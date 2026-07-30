package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.VBannerPager;
import com.p000p1.mobile.putong.feed.newui.view.TopicRecommendView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s1j0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m13983a(TopicRecommendView topicRecommendView, View view) {
        topicRecommendView.f4959d = (TopicRecommendView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendView.f4960e = (TextView) viewGroup.getChildAt(0);
        topicRecommendView.f4961f = (TextView) viewGroup.getChildAt(1);
        topicRecommendView.f4962g = (VBannerPager) viewGroup.getChildAt(2);
        topicRecommendView.f4963h = (LinearLayout) viewGroup.getChildAt(3);
    }
}
