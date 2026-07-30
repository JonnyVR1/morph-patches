package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p149l.nkg;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVoteContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView f43080a;

    /* JADX INFO: renamed from: b */
    public FeedQaTopicVoteListGroupView f43081b;

    /* JADX INFO: renamed from: c */
    public FeedQaTopicVoteListGroupView f43082c;

    /* JADX INFO: renamed from: d */
    public String f43083d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f43084e;

    public FeedVoteContainer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final Act m65973a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m65974b(TopicMoment topicMoment, boolean z, String str) {
        if (topicMoment.options == null) {
            return;
        }
        String str2 = m65973a() instanceof QATopicAggregationActivity ? "p_topic_recommend" : null;
        if (!TextUtils.isEmpty(str2)) {
            zvf0.m220368A("e_qa_optional", str2, vwb.m200311Y("topic_id", topicMoment.f39247id));
        }
        this.f43084e = topicMoment;
        this.f43083d = str;
        if (nkg.m159893m0() && topicMoment.options.size() == 2) {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f43080a;
            if (feedQaTopicVoteListGroupView != null) {
                this.f43082c = feedQaTopicVoteListGroupView;
            } else {
                FeedQaTopicVoteListGroupView qATopicTowOptionInFeedVoteView = z ? new QATopicTowOptionInFeedVoteView(getContext(), str) : new QATopicTowOptionVoteView(getContext(), str);
                this.f43080a = qATopicTowOptionInFeedVoteView;
                this.f43082c = qATopicTowOptionInFeedVoteView;
            }
        } else {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView2 = this.f43081b;
            if (feedQaTopicVoteListGroupView2 != null) {
                this.f43082c = feedQaTopicVoteListGroupView2;
            } else {
                FeedQaTopicVoteListGroupView qATopicMultiOptionInFeedVoteView = z ? new QATopicMultiOptionInFeedVoteView(getContext(), str) : new QATopicMultiOptionVoteView(getContext(), str);
                this.f43081b = qATopicMultiOptionInFeedVoteView;
                this.f43082c = qATopicMultiOptionInFeedVoteView;
            }
        }
        removeAllViews();
        addView(this.f43082c.getView());
        this.f43082c.m65965O(topicMoment);
    }

    public int getItemAnimTime() {
        FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f43082c;
        if (feedQaTopicVoteListGroupView != null) {
            return feedQaTopicVoteListGroupView.getAnimTime();
        }
        return 0;
    }

    @Nullable
    public FeedQaTopicVoteListGroupView getShowVoteListView() {
        return this.f43082c;
    }

    public FeedVoteContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedVoteContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedVoteContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
