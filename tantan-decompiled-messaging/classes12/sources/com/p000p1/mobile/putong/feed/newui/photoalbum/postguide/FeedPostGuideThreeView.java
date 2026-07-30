package com.p000p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import l.xdl0;
import p007l.cth;
import p007l.vsh;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostGuideThreeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f3778c;

    /* JADX INFO: renamed from: d */
    public VText f3779d;

    /* JADX INFO: renamed from: e */
    public VLinear f3780e;

    /* JADX INFO: renamed from: f */
    public Act f3781f;

    /* JADX INFO: renamed from: g */
    public MyTabPostGuide f3782g;

    public FeedPostGuideThreeView(Context context) {
        super(context);
        m6143R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m6143R(Context context) {
        addView(m6145Q(LayoutInflater.from(context), this));
        this.f3781f = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m6144S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f708id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m15576b(this.f3781f, topicMomentNew_);
        vsh.m15575a(3, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m6145Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cth.m9244b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m6146T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f3782g = myTabPostGuide;
        this.f3779d.setText(myTabPostGuide.title);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.bth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6431a.m6144S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6143R(context);
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6143R(context);
    }
}
