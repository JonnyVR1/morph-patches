package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.cmg;
import p153l.hxh;
import p153l.ksg;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostTopicItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f40888a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40889b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f40890c;

    /* JADX INFO: renamed from: d */
    public VImage f40891d;

    /* JADX INFO: renamed from: e */
    public VLinear f40892e;

    /* JADX INFO: renamed from: f */
    public TextView f40893f;

    /* JADX INFO: renamed from: g */
    public TextView f40894g;

    /* JADX INFO: renamed from: h */
    public TextView f40895h;

    /* JADX INFO: renamed from: i */
    public TextView f40896i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f40897j;

    public FeedPostTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m63162b(View view) {
        hxh.m137607a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m63163c(TopicMoment topicMoment) {
        if (this.f40892e.getMeasuredWidth() > 0) {
            int measuredWidth = (this.f40892e.getMeasuredWidth() - (bnl0.m105529O0(this.f40895h) ? this.f40895h.getMeasuredWidth() + qa00.m175859d(4.0f) : 0)) - (bnl0.m105529O0(this.f40894g) ? this.f40894g.getMeasuredWidth() + qa00.m175859d(6.0f) : 0);
            String str = topicMoment.name;
            float f = measuredWidth;
            if (this.f40893f.getPaint().measureText(str) < f) {
                this.f40893f.setText(str);
                return;
            }
            for (int length = str.length() - 2; length > 1; length--) {
                String strConcat = str.substring(0, length).concat("...");
                if (this.f40893f.getPaint().measureText(strConcat) < f) {
                    this.f40893f.setText(strConcat);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m63164d(TopicMoment topicMoment) {
        if (NullChecker.m82486a(topicMoment)) {
            bnl0.m105524M(this.f40895h, topicMoment.isTopicAnonymousType());
            m63165e(topicMoment);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f40896i;
            if (zIsQATopicType) {
                textView.setText(q8g0.m175816u(topicMoment.voteCounter) + "人参与了投票 " + q8g0.m175816u(topicMoment.viewCounter) + "次浏览");
            } else {
                textView.setText(q8g0.m175816u(topicMoment.momentCounter) + "条动态 " + q8g0.m175816u(topicMoment.viewCounter) + "次浏览");
            }
            ksg.m151165F0(this.f40889b, topicMoment.headIcon);
            this.f40897j.setChecked(topicMoment.selected);
            if (!cmg.m111186N() || !NullChecker.m82486a(topicMoment.group) || TextUtils.isEmpty(topicMoment.group.name)) {
                bnl0.m105524M(this.f40894g, false);
            } else {
                bnl0.m105524M(this.f40894g, true);
                this.f40894g.setText(topicMoment.group.name);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m63165e(final TopicMoment topicMoment) {
        this.f40892e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.gxh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f106943a.m63163c(topicMoment);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63162b(this);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
