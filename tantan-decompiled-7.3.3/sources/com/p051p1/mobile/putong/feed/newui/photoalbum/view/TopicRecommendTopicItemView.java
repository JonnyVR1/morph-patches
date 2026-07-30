package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.iaj0;
import p153l.ksg;
import p153l.q8g0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicRecommendTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f43403c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43404d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43405e;

    /* JADX INFO: renamed from: f */
    public VImage f43406f;

    /* JADX INFO: renamed from: g */
    public TextView f43407g;

    /* JADX INFO: renamed from: h */
    public TextView f43408h;

    public TopicRecommendTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66442P(View view) {
        iaj0.m139196a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m66443Q(TopicMoment topicMoment) {
        this.f43407g.setText(topicMoment.name);
        boolean zIsQATopicType = topicMoment.isQATopicType();
        TextView textView = this.f43408h;
        if (zIsQATopicType) {
            textView.setText(q8g0.m175816u(topicMoment.voteCounter) + "人参与了投票");
        } else {
            textView.setText(q8g0.m175816u(topicMoment.momentCounter) + "条动态");
        }
        ksg.m151165F0(this.f43404d, topicMoment.headIcon);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66442P(this);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicRecommendTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
