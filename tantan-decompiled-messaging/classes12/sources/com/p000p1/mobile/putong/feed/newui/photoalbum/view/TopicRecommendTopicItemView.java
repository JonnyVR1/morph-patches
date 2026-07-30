package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.i0g0;
import p007l.e1j0;
import p007l.vqg;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicRecommendTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f4016c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4017d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4018e;

    /* JADX INFO: renamed from: f */
    public VImage f4019f;

    /* JADX INFO: renamed from: g */
    public TextView f4020g;

    /* JADX INFO: renamed from: h */
    public TextView f4021h;

    public TopicRecommendTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m6360P(View view) {
        e1j0.m9599a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m6361Q(TopicMoment topicMoment) {
        this.f4020g.setText(topicMoment.name);
        boolean zIsQATopicType = topicMoment.isQATopicType();
        TextView textView = this.f4021h;
        if (zIsQATopicType) {
            textView.setText(i0g0.u(topicMoment.voteCounter) + "人参与了投票");
        } else {
            textView.setText(i0g0.u(topicMoment.momentCounter) + "条动态");
        }
        vqg.m15476F0(this.f4017d, topicMoment.headIcon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6360P(this);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
