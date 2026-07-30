package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.VBannerPager;
import com.p046p1.mobile.putong.feed.newui.view.TopicRecommendView;

/* JADX INFO: loaded from: classes12.dex */
public class s1j0 {
    /* JADX INFO: renamed from: a */
    public static void m181967a(TopicRecommendView topicRecommendView, View view) {
        topicRecommendView.f43498d = (TopicRecommendView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendView.f43499e = (TextView) viewGroup.getChildAt(0);
        topicRecommendView.f43500f = (TextView) viewGroup.getChildAt(1);
        topicRecommendView.f43501g = (VBannerPager) viewGroup.getChildAt(2);
        topicRecommendView.f43502h = (LinearLayout) viewGroup.getChildAt(3);
    }
}
