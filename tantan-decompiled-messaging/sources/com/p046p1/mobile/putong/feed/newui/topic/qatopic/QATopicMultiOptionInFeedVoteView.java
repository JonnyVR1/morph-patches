package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p149l.f3c0;
import p149l.t100;
import p149l.wzh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicMultiOptionInFeedVoteView extends QATopicMultiOptionVoteView {
    public QATopicMultiOptionInFeedVoteView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: C */
    public void mo65957C(wzh wzhVar) {
        super.mo65957C(wzhVar);
        m65956B(wzhVar).f43070b.setColor(Color.parseColor("#33FE7E1D"));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: E */
    public void mo65958E(wzh wzhVar) {
        super.mo65958E(wzhVar);
        m65956B(wzhVar).f43070b.setColor(Color.parseColor("#ededed"));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: F */
    public void mo65959F(wzh wzhVar) {
        super.mo65959F(wzhVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f43071c.setGravity(19);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: G */
    public void mo65960G(wzh wzhVar) {
        super.mo65960G(wzhVar);
        Iterator<FeedQaTopicItem> it = getQaTopicVoteViewList().iterator();
        while (it.hasNext()) {
            it.next().f43071c.setGravity(17);
        }
        m65956B(wzhVar).f43069a.setBackgroundResource(f3c0.f94415R5);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView, com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: K */
    public void mo65961K(Context context) {
        super.mo65961K(context);
        xdl0.m208374f0(this, t100.m186890d(6.0f));
        for (FeedQaTopicItem feedQaTopicItem : getQaTopicVoteViewList()) {
            feedQaTopicItem.f43070b.setRadius(t100.m186890d(8.0f));
            ((View) feedQaTopicItem.f43070b.getParent()).setBackgroundResource(f3c0.f94415R5);
            xdl0.m208358V(feedQaTopicItem.f43071c, t100.m186890d(12.0f));
            xdl0.m208372e0((ViewGroup) feedQaTopicItem.f43072d.getParent(), t100.m186890d(12.0f));
            feedQaTopicItem.f43070b.setWidthOffset(0.0f);
            feedQaTopicItem.f43071c.setGravity(17);
            feedQaTopicItem.f43071c.setTextSize(14.0f);
            xdl0.m208360X(feedQaTopicItem, t100.m186890d(6.0f));
            xdl0.m208325C0(feedQaTopicItem.f43070b, t100.m186890d(46.0f));
            xdl0.m208325C0((ViewGroup) feedQaTopicItem.f43072d.getParent(), t100.m186890d(46.0f));
            xdl0.m208325C0(feedQaTopicItem.f43069a, t100.m186890d(46.0f));
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView
    public int getRadius() {
        return t100.m186890d(8.0f);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicVoteListGroupView
    /* JADX INFO: renamed from: u */
    public boolean mo65967u() {
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
