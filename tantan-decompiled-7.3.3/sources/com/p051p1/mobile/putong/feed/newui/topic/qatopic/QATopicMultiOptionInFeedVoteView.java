package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p153l.bnl0;
import p153l.l1i;
import p153l.lbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicMultiOptionInFeedVoteView extends QATopicMultiOptionVoteView {
    public QATopicMultiOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo67140C(l1i l1iVar) {
        super.mo67140C(l1iVar);
        m67139B(l1iVar).f43918b.setColor(Color.parseColor("#33FE7E1D"));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo67141E(l1i l1iVar) {
        super.mo67141E(l1iVar);
        m67139B(l1iVar).f43918b.setColor(Color.parseColor("#ededed"));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo67142F(l1i l1iVar) {
        super.mo67142F(l1iVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f43919c.setGravity(19);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo67143G(l1i l1iVar) {
        super.mo67143G(l1iVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f43919c.setGravity(17);
        }
        m67139B(l1iVar).f43917a.setBackgroundResource(lbc0.f130933R5);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo67144K(Context context) {
        super.mo67144K(context);
        bnl0.m105554f0(this, qa00.m175859d(6.0f));
        for (FeedQaTopicItem feedQaTopicItem : getQaTopicVoteViewList()) {
            feedQaTopicItem.f43918b.setRadius(qa00.m175859d(8.0f));
            ((View) feedQaTopicItem.f43918b.getParent()).setBackgroundResource(lbc0.f130933R5);
            bnl0.m105538V(feedQaTopicItem.f43919c, qa00.m175859d(12.0f));
            bnl0.m105552e0((ViewGroup) feedQaTopicItem.f43920d.getParent(), qa00.m175859d(12.0f));
            feedQaTopicItem.f43918b.setWidthOffset(0.0f);
            feedQaTopicItem.f43919c.setGravity(17);
            feedQaTopicItem.f43919c.setTextSize(14.0f);
            bnl0.m105540X(feedQaTopicItem, qa00.m175859d(6.0f));
            bnl0.m105505C0(feedQaTopicItem.f43918b, qa00.m175859d(46.0f));
            bnl0.m105505C0((ViewGroup) feedQaTopicItem.f43920d.getParent(), qa00.m175859d(46.0f));
            bnl0.m105505C0(feedQaTopicItem.f43917a, qa00.m175859d(46.0f));
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView
    public int getRadius() {
        return qa00.m175859d(8.0f);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo67150u() {
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
