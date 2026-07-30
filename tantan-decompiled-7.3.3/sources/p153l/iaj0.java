package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class iaj0 {
    /* JADX INFO: renamed from: a */
    public static void m139196a(TopicRecommendTopicItemView topicRecommendTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendTopicItemView.f43403c = (VFrame) viewGroup.getChildAt(0);
        topicRecommendTopicItemView.f43404d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendTopicItemView.f43405e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicRecommendTopicItemView.f43406f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicRecommendTopicItemView.f43407g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicRecommendTopicItemView.f43408h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
