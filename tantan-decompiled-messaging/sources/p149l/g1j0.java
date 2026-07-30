package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicView;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class g1j0 {
    /* JADX INFO: renamed from: a */
    public static void m124082a(TopicRecommendTopicView topicRecommendTopicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicView.f42561c = (VLinear) viewGroup.getChildAt(0);
        topicRecommendTopicView.f42562d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicView.f42563e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
