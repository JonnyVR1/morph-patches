package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class p1j0 {
    /* JADX INFO: renamed from: a */
    public static void m167073a(TopicRecommendUserView topicRecommendUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendUserView.f42588c = (VLinear) viewGroup.getChildAt(0);
        topicRecommendUserView.f42589d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendUserView.f42590e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
