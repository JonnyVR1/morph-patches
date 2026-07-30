package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import p007l.wzh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicMultiOptionInFeedVoteView extends QATopicMultiOptionVoteView {
    public QATopicMultiOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo7109C(wzh wzhVar) {
        super.mo7109C(wzhVar);
        m7108B(wzhVar).f4531b.setColor(Color.parseColor("#33FE7E1D"));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo7110E(wzh wzhVar) {
        super.mo7110E(wzhVar);
        m7108B(wzhVar).f4531b.setColor(Color.parseColor("#ededed"));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo7111F(wzh wzhVar) {
        super.mo7111F(wzhVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f4532c.setGravity(19);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo7112G(wzh wzhVar) {
        super.mo7112G(wzhVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f4532c.setGravity(17);
        }
        m7108B(wzhVar).f4530a.setBackgroundResource(f3c0.f7698R5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo7113K(Context context) {
        super.mo7113K(context);
        xdl0.f0(this, t100.d(6.0f));
        for (FeedQaTopicItem feedQaTopicItem : getQaTopicVoteViewList()) {
            feedQaTopicItem.f4531b.setRadius(t100.d(8.0f));
            ((View) feedQaTopicItem.f4531b.getParent()).setBackgroundResource(f3c0.f7698R5);
            xdl0.V(feedQaTopicItem.f4532c, t100.d(12.0f));
            xdl0.e0((ViewGroup) feedQaTopicItem.f4533d.getParent(), t100.d(12.0f));
            feedQaTopicItem.f4531b.setWidthOffset(0.0f);
            feedQaTopicItem.f4532c.setGravity(17);
            feedQaTopicItem.f4532c.setTextSize(14.0f);
            xdl0.X(feedQaTopicItem, t100.d(6.0f));
            xdl0.C0(feedQaTopicItem.f4531b, t100.d(46.0f));
            xdl0.C0((ViewGroup) feedQaTopicItem.f4533d.getParent(), t100.d(46.0f));
            xdl0.C0(feedQaTopicItem.f4530a, t100.d(46.0f));
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView
    public int getRadius() {
        return t100.d(8.0f);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo7119u() {
        return false;
    }

    public QATopicMultiOptionInFeedVoteView(Context context, String str) {
        super(context, str);
    }

    public QATopicMultiOptionInFeedVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QATopicMultiOptionInFeedVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
