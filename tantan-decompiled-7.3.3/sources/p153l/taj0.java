package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class taj0 {
    /* JADX INFO: renamed from: a */
    public static void m189857a(TopicRecommendUserView topicRecommendUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendUserView.f43436c = (VLinear) viewGroup.getChildAt(0);
        topicRecommendUserView.f43437d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendUserView.f43438e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
