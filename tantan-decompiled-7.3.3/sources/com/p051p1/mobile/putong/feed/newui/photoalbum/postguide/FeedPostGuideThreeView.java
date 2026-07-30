package com.p051p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.kuh;
import p153l.ruh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostGuideThreeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43165c;

    /* JADX INFO: renamed from: d */
    public VText f43166d;

    /* JADX INFO: renamed from: e */
    public VLinear f43167e;

    /* JADX INFO: renamed from: f */
    public Act f43168f;

    /* JADX INFO: renamed from: g */
    public MyTabPostGuide f43169g;

    public FeedPostGuideThreeView(Context context) {
        super(context);
        m66225R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m66225R(Context context) {
        addView(m66227Q(LayoutInflater.from(context), this));
        this.f43168f = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m66226S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f40095id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        kuh.m151539b(this.f43168f, topicMomentNew_);
        kuh.m151538a(3, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m66227Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ruh.m183194b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m66228T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f43169g = myTabPostGuide;
        this.f43166d.setText(myTabPostGuide.title);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.quh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159582a.m66226S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66225R(context);
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66225R(context);
    }
}
