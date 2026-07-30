package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class kaj0 {
    /* JADX INFO: renamed from: a */
    public static void m148989a(TopicRecommendTopicView topicRecommendTopicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicView.f43409c = (VLinear) viewGroup.getChildAt(0);
        topicRecommendTopicView.f43410d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicView.f43411e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
