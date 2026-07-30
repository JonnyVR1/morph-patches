package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.e1j0;
import p149l.i0g0;
import p149l.vqg;

/* JADX INFO: loaded from: classes12.dex */
public class TopicRecommendTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f42555c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42556d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42557e;

    /* JADX INFO: renamed from: f */
    public VImage f42558f;

    /* JADX INFO: renamed from: g */
    public TextView f42559g;

    /* JADX INFO: renamed from: h */
    public TextView f42560h;

    public TopicRecommendTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65259P(View view) {
        e1j0.m114417a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m65260Q(TopicMoment topicMoment) {
        this.f42559g.setText(topicMoment.name);
        boolean zIsQATopicType = topicMoment.isQATopicType();
        TextView textView = this.f42560h;
        if (zIsQATopicType) {
            textView.setText(i0g0.m133881u(topicMoment.voteCounter) + "人参与了投票");
        } else {
            textView.setText(i0g0.m133881u(topicMoment.momentCounter) + "条动态");
        }
        vqg.m199506F0(this.f42556d, topicMoment.headIcon);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65259P(this);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
