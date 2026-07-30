package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ndj0 {
    /* JADX INFO: renamed from: a */
    public static void m162712a(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicVoteAggregationHeaderView.f44117a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicVoteAggregationHeaderView.f44118b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicVoteAggregationHeaderView.f44119c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicVoteAggregationHeaderView.f44120d = (VText) viewGroup.getChildAt(1);
        topicVoteAggregationHeaderView.f44121e = (VFrame) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m162713b(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173640c4, viewGroup, false);
        m162712a(topicVoteAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
