package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class e1j0 {
    /* JADX INFO: renamed from: a */
    public static void m114417a(TopicRecommendTopicItemView topicRecommendTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicItemView.f42555c = (VFrame) viewGroup.getChildAt(0);
        topicRecommendTopicItemView.f42556d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicItemView.f42557e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicRecommendTopicItemView.f42558f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicRecommendTopicItemView.f42559g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicRecommendTopicItemView.f42560h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
