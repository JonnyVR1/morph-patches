package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j4j0 {
    /* JADX INFO: renamed from: a */
    public static void m11070a(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicVoteAggregationHeaderView.f4730a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicVoteAggregationHeaderView.f4731b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicVoteAggregationHeaderView.f4732c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicVoteAggregationHeaderView.f4733d = viewGroup.getChildAt(1);
        topicVoteAggregationHeaderView.f4734e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11071b(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11190c4, viewGroup, false);
        m11070a(topicVoteAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
