package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.VBannerPager;
import com.p051p1.mobile.putong.feed.newui.view.TopicRecommendView;

/* JADX INFO: loaded from: classes13.dex */
public class waj0 {
    /* JADX INFO: renamed from: a */
    public static void m205658a(TopicRecommendView topicRecommendView, View view) {
        topicRecommendView.f44346d = (TopicRecommendView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendView.f44347e = (TextView) viewGroup.getChildAt(0);
        topicRecommendView.f44348f = (TextView) viewGroup.getChildAt(1);
        topicRecommendView.f44349g = (VBannerPager) viewGroup.getChildAt(2);
        topicRecommendView.f44350h = (LinearLayout) viewGroup.getChildAt(3);
    }
}
