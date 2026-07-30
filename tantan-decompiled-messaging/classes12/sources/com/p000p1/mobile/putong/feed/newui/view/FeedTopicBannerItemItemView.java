package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import l.i0g0;
import p007l.j7i;
import p007l.vqg;
import v.VDraweeView;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTopicBannerItemItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f4878a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4879b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4880c;

    /* JADX INFO: renamed from: d */
    public VImage f4881d;

    /* JADX INFO: renamed from: e */
    public TextView f4882e;

    /* JADX INFO: renamed from: f */
    public TextView f4883f;

    public FeedTopicBannerItemItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7528a(View view) {
        j7i.m11073a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7529b(TopicMoment topicMoment) {
        if (NullChecker.a(topicMoment)) {
            this.f4882e.setText(topicMoment.name);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f4883f;
            if (zIsQATopicType) {
                textView.setText(i0g0.u(topicMoment.voteCounter) + "人参与了投票");
            } else {
                textView.setText(i0g0.u(topicMoment.momentCounter) + "条动态");
            }
            vqg.m15476F0(this.f4879b, topicMoment.headIcon);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7528a(this);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
