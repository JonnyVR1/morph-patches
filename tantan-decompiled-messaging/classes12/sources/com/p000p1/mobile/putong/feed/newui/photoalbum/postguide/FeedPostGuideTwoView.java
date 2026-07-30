package com.p000p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import l.bkb0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.eth;
import p007l.f3c0;
import p007l.vsh;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostGuideTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f3783c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f3784d;

    /* JADX INFO: renamed from: e */
    public VText f3785e;

    /* JADX INFO: renamed from: f */
    public VLinear f3786f;

    /* JADX INFO: renamed from: g */
    public VText f3787g;

    /* JADX INFO: renamed from: h */
    public VText f3788h;

    /* JADX INFO: renamed from: i */
    public Act f3789i;

    /* JADX INFO: renamed from: j */
    public MyTabPostGuide f3790j;

    public FeedPostGuideTwoView(Context context) {
        super(context);
        m6148R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m6148R(Context context) {
        addView(m6150Q(LayoutInflater.from(context), this));
        this.f3785e.setTypeface((Typeface) null, 1);
        this.f3787g.setTypeface((Typeface) null, 1);
        this.f3789i = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m6149S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f708id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m15576b(this.f3789i, topicMomentNew_);
        vsh.m15575a(2, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m6150Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eth.m9959b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m6151T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f3790j = myTabPostGuide;
        if (TextUtils.isEmpty(myTabPostGuide.picture)) {
            qib0.G.Y0(this.f3784d, f3c0.f7623H3);
        } else {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f3784d;
            String str2 = myTabPostGuide.picture;
            int i = t100.E;
            bkb0Var.I0(vDraweeView, str2, i, i);
        }
        this.f3787g.setText(myTabPostGuide.title);
        this.f3788h.setText(myTabPostGuide.subtitle);
        this.f3785e.setText(myTabPostGuide.buttonText);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7062a.m6149S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6148R(context);
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6148R(context);
    }
}
