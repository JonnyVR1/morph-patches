package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.i0g0;
import p149l.nkg;
import p149l.svh;
import p149l.t100;
import p149l.vqg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostTopicItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f40040a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40041b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f40042c;

    /* JADX INFO: renamed from: d */
    public VImage f40043d;

    /* JADX INFO: renamed from: e */
    public VLinear f40044e;

    /* JADX INFO: renamed from: f */
    public TextView f40045f;

    /* JADX INFO: renamed from: g */
    public TextView f40046g;

    /* JADX INFO: renamed from: h */
    public TextView f40047h;

    /* JADX INFO: renamed from: i */
    public TextView f40048i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f40049j;

    public FeedPostTopicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61979b(View view) {
        svh.m186082a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m61980c(TopicMoment topicMoment) {
        if (this.f40044e.getMeasuredWidth() > 0) {
            int measuredWidth = (this.f40044e.getMeasuredWidth() - (xdl0.m208349O0(this.f40047h) ? this.f40047h.getMeasuredWidth() + t100.m186890d(4.0f) : 0)) - (xdl0.m208349O0(this.f40046g) ? this.f40046g.getMeasuredWidth() + t100.m186890d(6.0f) : 0);
            String str = topicMoment.name;
            float f = measuredWidth;
            if (this.f40045f.getPaint().measureText(str) < f) {
                this.f40045f.setText(str);
                return;
            }
            for (int length = str.length() - 2; length > 1; length--) {
                String strConcat = str.substring(0, length).concat("...");
                if (this.f40045f.getPaint().measureText(strConcat) < f) {
                    this.f40045f.setText(strConcat);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m61981d(TopicMoment topicMoment) {
        if (NullChecker.m81303a(topicMoment)) {
            xdl0.m208344M(this.f40047h, topicMoment.isTopicAnonymousType());
            m61982e(topicMoment);
            boolean zIsQATopicType = topicMoment.isQATopicType();
            TextView textView = this.f40048i;
            if (zIsQATopicType) {
                textView.setText(i0g0.m133881u(topicMoment.voteCounter) + "人参与了投票 " + i0g0.m133881u(topicMoment.viewCounter) + "次浏览");
            } else {
                textView.setText(i0g0.m133881u(topicMoment.momentCounter) + "条动态 " + i0g0.m133881u(topicMoment.viewCounter) + "次浏览");
            }
            vqg.m199506F0(this.f40041b, topicMoment.headIcon);
            this.f40049j.setChecked(topicMoment.selected);
            if (!nkg.m159857N() || !NullChecker.m81303a(topicMoment.group) || TextUtils.isEmpty(topicMoment.group.name)) {
                xdl0.m208344M(this.f40046g, false);
            } else {
                xdl0.m208344M(this.f40046g, true);
                this.f40046g.setText(topicMoment.group.name);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61982e(final TopicMoment topicMoment) {
        this.f40044e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.rvh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f161202a.m61980c(topicMoment);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61979b(this);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
