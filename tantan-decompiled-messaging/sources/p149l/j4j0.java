package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class j4j0 {
    /* JADX INFO: renamed from: a */
    public static void m139682a(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicVoteAggregationHeaderView.f43269a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicVoteAggregationHeaderView.f43270b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        topicVoteAggregationHeaderView.f43271c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        topicVoteAggregationHeaderView.f43272d = (VText) viewGroup.getChildAt(1);
        topicVoteAggregationHeaderView.f43273e = (VFrame) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139683b(TopicVoteAggregationHeaderView topicVoteAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142171c4, viewGroup, false);
        m139682a(topicVoteAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
