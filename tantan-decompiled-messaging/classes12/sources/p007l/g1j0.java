package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g1j0 {
    /* JADX INFO: renamed from: a */
    public static void m10362a(TopicRecommendTopicView topicRecommendTopicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicView.f4022c = viewGroup.getChildAt(0);
        topicRecommendTopicView.f4023d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicView.f4024e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
