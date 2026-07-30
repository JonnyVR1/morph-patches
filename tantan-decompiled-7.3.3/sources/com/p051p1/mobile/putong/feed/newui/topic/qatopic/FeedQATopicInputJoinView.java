package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;
import p153l.sxh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f43910f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43911g;

    /* JADX INFO: renamed from: h */
    public VImage f43912h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43913i;

    /* JADX INFO: renamed from: j */
    public VEditText f43914j;

    /* JADX INFO: renamed from: k */
    public VText f43915k;

    public FeedQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m67129H(context);
    }

    /* JADX INFO: renamed from: H */
    private void m67129H(Context context) {
        m67107k(m67130G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m67130G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sxh.m188479b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f43910f;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f43912h;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f43913i;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f43914j;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f43911g;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f43915k;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return null;
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67129H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67129H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m67129H(context);
    }
}
