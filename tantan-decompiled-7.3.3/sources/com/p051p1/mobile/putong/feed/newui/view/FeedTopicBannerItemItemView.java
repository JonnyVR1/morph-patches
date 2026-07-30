package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p153l.ksg;
import p153l.q8g0;
import p153l.y8i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTopicBannerItemItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f44265a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44266b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f44267c;

    /* JADX INFO: renamed from: d */
    public VImage f44268d;

    /* JADX INFO: renamed from: e */
    public TextView f44269e;

    /* JADX INFO: renamed from: f */
    public TextView f44270f;

    public FeedTopicBannerItemItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m67546a(View view) {
        y8i.m214751a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m67547b(TopicMoment topicMoment) {
        if (NullChecker.m82486a(topicMoment)) {
            this.f44269e.setText(topicMoment.name);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f44270f;
            if (zIsQATopicType) {
                textView.setText(q8g0.m175816u(topicMoment.voteCounter) + "人参与了投票");
            } else {
                textView.setText(q8g0.m175816u(topicMoment.momentCounter) + "条动态");
            }
            ksg.m151165F0(this.f44266b, topicMoment.headIcon);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67546a(this);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedTopicBannerItemItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
