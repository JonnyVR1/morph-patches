package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import l.i0g0;
import l.t100;
import l.xdl0;
import p007l.nkg;
import p007l.svh;
import p007l.vqg;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostTopicItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f1501a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1502b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1503c;

    /* JADX INFO: renamed from: d */
    public VImage f1504d;

    /* JADX INFO: renamed from: e */
    public VLinear f1505e;

    /* JADX INFO: renamed from: f */
    public TextView f1506f;

    /* JADX INFO: renamed from: g */
    public TextView f1507g;

    /* JADX INFO: renamed from: h */
    public TextView f1508h;

    /* JADX INFO: renamed from: i */
    public TextView f1509i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f1510j;

    public FeedPostTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2953b(View view) {
        svh.m14332a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2954c(TopicMoment topicMoment) {
        if (this.f1505e.getMeasuredWidth() > 0) {
            int measuredWidth = (this.f1505e.getMeasuredWidth() - (xdl0.O0(this.f1508h) ? this.f1508h.getMeasuredWidth() + t100.d(4.0f) : 0)) - (xdl0.O0(this.f1507g) ? this.f1507g.getMeasuredWidth() + t100.d(6.0f) : 0);
            String str = topicMoment.name;
            float f = measuredWidth;
            if (this.f1506f.getPaint().measureText(str) < f) {
                this.f1506f.setText(str);
                return;
            }
            for (int length = str.length() - 2; length > 1; length--) {
                String strConcat = str.substring(0, length).concat("...");
                if (this.f1506f.getPaint().measureText(strConcat) < f) {
                    this.f1506f.setText(strConcat);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2955d(TopicMoment topicMoment) {
        if (NullChecker.a(topicMoment)) {
            xdl0.M(this.f1508h, topicMoment.isTopicAnonymousType());
            m2956e(topicMoment);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f1509i;
            if (zIsQATopicType) {
                textView.setText(i0g0.u(topicMoment.voteCounter) + "人参与了投票 " + i0g0.u(topicMoment.viewCounter) + "次浏览");
            } else {
                textView.setText(i0g0.u(topicMoment.momentCounter) + "条动态 " + i0g0.u(topicMoment.viewCounter) + "次浏览");
            }
            vqg.m15476F0(this.f1502b, topicMoment.headIcon);
            this.f1510j.setChecked(topicMoment.selected);
            if (!nkg.m12216N() || !NullChecker.a(topicMoment.group) || TextUtils.isEmpty(topicMoment.group.name)) {
                xdl0.M(this.f1507g, false);
            } else {
                xdl0.M(this.f1507g, true);
                this.f1507g.setText(topicMoment.group.name);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2956e(final TopicMoment topicMoment) {
        this.f1505e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.rvh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f12743a.m2954c(topicMoment);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2953b(this);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
