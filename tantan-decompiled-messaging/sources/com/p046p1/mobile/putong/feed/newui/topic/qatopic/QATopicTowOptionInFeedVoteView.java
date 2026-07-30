package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p149l.f3c0;
import p149l.t100;
import p149l.wzh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicTowOptionInFeedVoteView extends QATopicTowOptionVoteView {
    public QATopicTowOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo65957C(wzh wzhVar) {
        super.mo65957C(wzhVar);
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94485b4);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo65958E(wzh wzhVar) {
        super.mo65958E(wzhVar);
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94477a4);
        this.f43142l.setVisibility(8);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo65960G(wzh wzhVar) {
        super.mo65960G(wzhVar);
        this.f43134d.setBackgroundResource(f3c0.f94462Y3);
        m66057Z(wzhVar.m206282c()).setBackgroundResource(f3c0.f94477a4);
        this.f43142l.setVisibility(0);
        m66055X(m65956B(wzhVar).f43076a, 8);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo65961K(Context context) {
        super.mo65961K(context);
        xdl0.m208360X(this.f43133c, t100.m186890d(12.0f));
        this.f43142l.setVisibility(0);
        xdl0.m208325C0(this.f43134d, t100.m186890d(46.0f));
        for (FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem : getQaTopicVoteViewList()) {
            feedQaTwoOptionTopicItem.f43078c.setTextSize(14.0f);
            feedQaTwoOptionTopicItem.f43077b.setTextSize(14.0f);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView
    public int getRadius() {
        return t100.m186890d(8.0f);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo65967u() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo65968v(wzh wzhVar) {
        super.mo65968v(wzhVar);
        boolean zM206287h = wzhVar.m206287h();
        View view = this.f43142l;
        if (zM206287h) {
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
