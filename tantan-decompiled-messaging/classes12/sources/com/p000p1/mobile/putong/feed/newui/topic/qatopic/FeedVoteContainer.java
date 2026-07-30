package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import l.j760;
import l.vwb;
import l.zvf0;
import p007l.nkg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVoteContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView f4541a;

    /* JADX INFO: renamed from: b */
    public FeedQaTopicVoteListGroupView f4542b;

    /* JADX INFO: renamed from: c */
    public FeedQaTopicVoteListGroupView f4543c;

    /* JADX INFO: renamed from: d */
    public String f4544d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f4545e;

    public FeedVoteContainer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final Act m7125a() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m7126b(TopicMoment topicMoment, boolean z, String str) {
        if (topicMoment.options == null) {
            return;
        }
        String str2 = m7125a() instanceof QATopicAggregationActivity ? "p_topic_recommend" : null;
        if (!TextUtils.isEmpty(str2)) {
            zvf0.A("e_qa_optional", str2, new j760[]{vwb.Y("topic_id", topicMoment.f708id)});
        }
        this.f4545e = topicMoment;
        this.f4544d = str;
        if (nkg.m12252m0() && topicMoment.options.size() == 2) {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f4541a;
            if (feedQaTopicVoteListGroupView != null) {
                this.f4543c = feedQaTopicVoteListGroupView;
            } else {
                FeedQaTopicVoteListGroupView qATopicTowOptionInFeedVoteView = z ? new QATopicTowOptionInFeedVoteView(getContext(), str) : new QATopicTowOptionVoteView(getContext(), str);
                this.f4541a = qATopicTowOptionInFeedVoteView;
                this.f4543c = qATopicTowOptionInFeedVoteView;
            }
        } else {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView2 = this.f4542b;
            if (feedQaTopicVoteListGroupView2 != null) {
                this.f4543c = feedQaTopicVoteListGroupView2;
            } else {
                FeedQaTopicVoteListGroupView qATopicMultiOptionInFeedVoteView = z ? new QATopicMultiOptionInFeedVoteView(getContext(), str) : new QATopicMultiOptionVoteView(getContext(), str);
                this.f4542b = qATopicMultiOptionInFeedVoteView;
                this.f4543c = qATopicMultiOptionInFeedVoteView;
            }
        }
        removeAllViews();
        addView(this.f4543c.getView());
        this.f4543c.m7117O(topicMoment);
    }

    public int getItemAnimTime() {
        FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f4543c;
        if (feedQaTopicVoteListGroupView != null) {
            return feedQaTopicVoteListGroupView.getAnimTime();
        }
        return 0;
    }

    @Nullable
    public FeedQaTopicVoteListGroupView getShowVoteListView() {
        return this.f4543c;
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
