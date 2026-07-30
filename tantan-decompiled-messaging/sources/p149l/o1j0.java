package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class o1j0 {
    /* JADX INFO: renamed from: a */
    public static void m162255a(TopicRecommendUserItemView topicRecommendUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendUserItemView.f42571a = (VLinear) viewGroup.getChildAt(0);
        topicRecommendUserItemView.f42572b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendUserItemView.f42573c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicRecommendUserItemView.f42574d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicRecommendUserItemView.f42575e = (VFrame) viewGroup.getChildAt(1);
        topicRecommendUserItemView.f42576f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicRecommendUserItemView.f42577g = (VLinear) viewGroup.getChildAt(2);
        topicRecommendUserItemView.f42578h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        topicRecommendUserItemView.f42579i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        topicRecommendUserItemView.f42580j = (VText) viewGroup.getChildAt(3);
        topicRecommendUserItemView.f42581k = (VText) viewGroup.getChildAt(4);
        topicRecommendUserItemView.f42582l = (VButton) viewGroup.getChildAt(5);
    }
}
