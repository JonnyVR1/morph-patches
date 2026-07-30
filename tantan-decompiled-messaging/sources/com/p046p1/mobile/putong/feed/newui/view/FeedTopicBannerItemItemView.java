package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p149l.i0g0;
import p149l.j7i;
import p149l.vqg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTopicBannerItemItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f43417a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43418b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43419c;

    /* JADX INFO: renamed from: d */
    public VImage f43420d;

    /* JADX INFO: renamed from: e */
    public TextView f43421e;

    /* JADX INFO: renamed from: f */
    public TextView f43422f;

    public FeedTopicBannerItemItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m66363a(View view) {
        j7i.m140094a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m66364b(TopicMoment topicMoment) {
        if (NullChecker.m81303a(topicMoment)) {
            this.f43421e.setText(topicMoment.name);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f43422f;
            if (zIsQATopicType) {
                textView.setText(i0g0.m133881u(topicMoment.voteCounter) + "人参与了投票");
            } else {
                textView.setText(i0g0.m133881u(topicMoment.momentCounter) + "条动态");
            }
            vqg.m199506F0(this.f43418b, topicMoment.headIcon);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66363a(this);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
