package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;
import p149l.dwh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f43062f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43063g;

    /* JADX INFO: renamed from: h */
    public VImage f43064h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43065i;

    /* JADX INFO: renamed from: j */
    public VEditText f43066j;

    /* JADX INFO: renamed from: k */
    public VText f43067k;

    public FeedQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m65946H(context);
    }

    /* JADX INFO: renamed from: H */
    private void m65946H(Context context) {
        m65924k(m65947G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m65947G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dwh.m113891b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f43062f;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f43064h;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f43065i;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f43066j;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f43063g;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f43067k;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return null;
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65946H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65946H(context);
    }

    public FeedQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m65946H(context);
    }
}
