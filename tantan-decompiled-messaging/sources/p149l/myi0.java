package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationHeaderView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class myi0 {
    /* JADX INFO: renamed from: a */
    public static void m157087a(TopicAggregationHeaderView topicAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAggregationHeaderView.f43191a = (VDraweeView) viewGroup.getChildAt(0);
        topicAggregationHeaderView.f43192b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        topicAggregationHeaderView.f43193c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        topicAggregationHeaderView.f43194d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m157088b(TopicAggregationHeaderView topicAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142164b4, viewGroup, false);
        m157087a(topicAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
