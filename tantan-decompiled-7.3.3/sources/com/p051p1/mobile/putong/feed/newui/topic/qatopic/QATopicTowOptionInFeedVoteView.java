package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p153l.bnl0;
import p153l.l1i;
import p153l.lbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicTowOptionInFeedVoteView extends QATopicTowOptionVoteView {
    public QATopicTowOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo67140C(l1i l1iVar) {
        super.mo67140C(l1iVar);
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f131003b4);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo67141E(l1i l1iVar) {
        super.mo67141E(l1iVar);
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f130995a4);
        this.f43990l.setVisibility(8);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo67143G(l1i l1iVar) {
        super.mo67143G(l1iVar);
        this.f43982d.setBackgroundResource(lbc0.f130980Y3);
        m67240Z(l1iVar.m152489c()).setBackgroundResource(lbc0.f130995a4);
        this.f43990l.setVisibility(0);
        m67238X(m67139B(l1iVar).f43924a, 8);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo67144K(Context context) {
        super.mo67144K(context);
        bnl0.m105540X(this.f43981c, qa00.m175859d(12.0f));
        this.f43990l.setVisibility(0);
        bnl0.m105505C0(this.f43982d, qa00.m175859d(46.0f));
        for (FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem : getQaTopicVoteViewList()) {
            feedQaTwoOptionTopicItem.f43926c.setTextSize(14.0f);
            feedQaTwoOptionTopicItem.f43925b.setTextSize(14.0f);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView
    public int getRadius() {
        return qa00.m175859d(8.0f);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo67150u() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: v */
    public void mo67151v(l1i l1iVar) {
        super.mo67151v(l1iVar);
        boolean zM152494h = l1iVar.m152494h();
        View view = this.f43990l;
        if (zM152494h) {
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
