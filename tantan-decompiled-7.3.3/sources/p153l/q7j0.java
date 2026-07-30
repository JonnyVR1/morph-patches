package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationHeaderView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class q7j0 {
    /* JADX INFO: renamed from: a */
    public static void m175656a(TopicAggregationHeaderView topicAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAggregationHeaderView.f44039a = (VDraweeView) viewGroup.getChildAt(0);
        topicAggregationHeaderView.f44040b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicAggregationHeaderView.f44041c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        topicAggregationHeaderView.f44042d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m175657b(TopicAggregationHeaderView topicAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173633b4, viewGroup, false);
        m175656a(topicAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
