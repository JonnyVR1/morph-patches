package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e1j0 {
    /* JADX INFO: renamed from: a */
    public static void m9599a(TopicRecommendTopicItemView topicRecommendTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicItemView.f4016c = viewGroup.getChildAt(0);
        topicRecommendTopicItemView.f4017d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicItemView.f4018e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicRecommendTopicItemView.f4019f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicRecommendTopicItemView.f4020g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicRecommendTopicItemView.f4021h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
