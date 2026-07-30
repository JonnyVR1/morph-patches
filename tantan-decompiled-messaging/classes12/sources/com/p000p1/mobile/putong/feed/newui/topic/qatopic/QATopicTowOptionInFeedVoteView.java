package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import p007l.wzh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicTowOptionInFeedVoteView extends QATopicTowOptionVoteView {
    public QATopicTowOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo7109C(wzh wzhVar) {
        super.mo7109C(wzhVar);
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7768b4);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo7110E(wzh wzhVar) {
        super.mo7110E(wzhVar);
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7760a4);
        this.f4603l.setVisibility(8);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo7112G(wzh wzhVar) {
        super.mo7112G(wzhVar);
        this.f4595d.setBackgroundResource(f3c0.f7745Y3);
        m7209Z(wzhVar.m15946c()).setBackgroundResource(f3c0.f7760a4);
        this.f4603l.setVisibility(0);
        m7207X(m7108B(wzhVar).f4537a, 8);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo7113K(Context context) {
        super.mo7113K(context);
        xdl0.X(this.f4594c, t100.d(12.0f));
        this.f4603l.setVisibility(0);
        xdl0.C0(this.f4595d, t100.d(46.0f));
        for (FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem : getQaTopicVoteViewList()) {
            feedQaTwoOptionTopicItem.f4539c.setTextSize(14.0f);
            feedQaTwoOptionTopicItem.f4538b.setTextSize(14.0f);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView
    public int getRadius() {
        return t100.d(8.0f);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo7119u() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo7120v(wzh wzhVar) {
        super.mo7120v(wzhVar);
        boolean zM15951h = wzhVar.m15951h();
        View view = this.f4603l;
        if (zM15951h) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public QATopicTowOptionInFeedVoteView(Context context, String str) {
        super(context, str);
    }

    public QATopicTowOptionInFeedVoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QATopicTowOptionInFeedVoteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
