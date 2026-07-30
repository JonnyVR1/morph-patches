package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p153l.cmg;
import p153l.i4g0;
import p153l.jyb;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVoteContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedQaTopicVoteListGroupView f43928a;

    /* JADX INFO: renamed from: b */
    public FeedQaTopicVoteListGroupView f43929b;

    /* JADX INFO: renamed from: c */
    public FeedQaTopicVoteListGroupView f43930c;

    /* JADX INFO: renamed from: d */
    public String f43931d;

    /* JADX INFO: renamed from: e */
    public TopicMoment f43932e;

    public FeedVoteContainer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final Act m67156a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m67157b(TopicMoment topicMoment, boolean z, String str) {
        if (topicMoment.options == null) {
            return;
        }
        String str2 = m67156a() instanceof QATopicAggregationActivity ? "p_topic_recommend" : null;
        if (!TextUtils.isEmpty(str2)) {
            i4g0.m138492A("e_qa_optional", str2, jyb.m147494Y("topic_id", topicMoment.f40095id));
        }
        this.f43932e = topicMoment;
        this.f43931d = str;
        if (cmg.m111222m0() && topicMoment.options.size() == 2) {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f43928a;
            if (feedQaTopicVoteListGroupView != null) {
                this.f43930c = feedQaTopicVoteListGroupView;
            } else {
                FeedQaTopicVoteListGroupView qATopicTowOptionInFeedVoteView = z ? new QATopicTowOptionInFeedVoteView(getContext(), str) : new QATopicTowOptionVoteView(getContext(), str);
                this.f43928a = qATopicTowOptionInFeedVoteView;
                this.f43930c = qATopicTowOptionInFeedVoteView;
            }
        } else {
            FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView2 = this.f43929b;
            if (feedQaTopicVoteListGroupView2 != null) {
                this.f43930c = feedQaTopicVoteListGroupView2;
            } else {
                FeedQaTopicVoteListGroupView qATopicMultiOptionInFeedVoteView = z ? new QATopicMultiOptionInFeedVoteView(getContext(), str) : new QATopicMultiOptionVoteView(getContext(), str);
                this.f43929b = qATopicMultiOptionInFeedVoteView;
                this.f43930c = qATopicMultiOptionInFeedVoteView;
            }
        }
        removeAllViews();
        addView(this.f43930c.getView());
        this.f43930c.m67148O(topicMoment);
    }

    public int getItemAnimTime() {
        FeedQaTopicVoteListGroupView feedQaTopicVoteListGroupView = this.f43930c;
        if (feedQaTopicVoteListGroupView != null) {
            return feedQaTopicVoteListGroupView.getAnimTime();
        }
        return 0;
    }

    @Nullable
    public FeedQaTopicVoteListGroupView getShowVoteListView() {
        return this.f43930c;
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
