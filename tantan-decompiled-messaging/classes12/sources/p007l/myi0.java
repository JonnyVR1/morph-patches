package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class myi0 {
    /* JADX INFO: renamed from: a */
    public static void m12062a(TopicAggregationHeaderView topicAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAggregationHeaderView.f4652a = viewGroup.getChildAt(0);
        topicAggregationHeaderView.f4653b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicAggregationHeaderView.f4654c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        topicAggregationHeaderView.f4655d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12063b(TopicAggregationHeaderView topicAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11183b4, viewGroup, false);
        m12062a(topicAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
