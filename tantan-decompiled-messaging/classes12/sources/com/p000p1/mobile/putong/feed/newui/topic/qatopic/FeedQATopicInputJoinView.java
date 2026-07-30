package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p007l.dwh;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f4523f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f4524g;

    /* JADX INFO: renamed from: h */
    public VImage f4525h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f4526i;

    /* JADX INFO: renamed from: j */
    public VEditText f4527j;

    /* JADX INFO: renamed from: k */
    public VText f4528k;

    public FeedQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m7098H(context);
    }

    /* JADX INFO: renamed from: H */
    private void m7098H(Context context) {
        m7076k(m7099G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m7099G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dwh.m9581b(this, layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f4523f;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f4525h;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f4526i;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f4527j;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f4524g;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f4528k;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return null;
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7098H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7098H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7098H(context);
    }
}
