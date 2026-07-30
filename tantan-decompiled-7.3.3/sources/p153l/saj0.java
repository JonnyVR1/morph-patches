package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class saj0 {
    /* JADX INFO: renamed from: a */
    public static void m185270a(TopicRecommendUserItemView topicRecommendUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendUserItemView.f43419a = (VLinear) viewGroup.getChildAt(0);
        topicRecommendUserItemView.f43420b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendUserItemView.f43421c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicRecommendUserItemView.f43422d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicRecommendUserItemView.f43423e = (VFrame) viewGroup.getChildAt(1);
        topicRecommendUserItemView.f43424f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicRecommendUserItemView.f43425g = (VLinear) viewGroup.getChildAt(2);
        topicRecommendUserItemView.f43426h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        topicRecommendUserItemView.f43427i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        topicRecommendUserItemView.f43428j = (VText) viewGroup.getChildAt(3);
        topicRecommendUserItemView.f43429k = (VText) viewGroup.getChildAt(4);
        topicRecommendUserItemView.f43430l = (VButton) viewGroup.getChildAt(5);
    }
}
