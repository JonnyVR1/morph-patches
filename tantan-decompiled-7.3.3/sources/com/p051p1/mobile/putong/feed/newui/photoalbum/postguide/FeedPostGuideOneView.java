package com.p051p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.animation.Animator;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.kuh;
import p153l.puh;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostGuideOneView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f43158c;

    /* JADX INFO: renamed from: d */
    public VText f43159d;

    /* JADX INFO: renamed from: e */
    public VText f43160e;

    /* JADX INFO: renamed from: f */
    public VImage f43161f;

    /* JADX INFO: renamed from: g */
    public Act f43162g;

    /* JADX INFO: renamed from: h */
    public MyTabPostGuide f43163h;

    /* JADX INFO: renamed from: i */
    public Animator f43164i;

    public FeedPostGuideOneView(Context context) {
        super(context);
        m66217T(context);
    }

    /* JADX INFO: renamed from: T */
    private void m66217T(Context context) {
        addView(m66218S(LayoutInflater.from(context), this));
        TextPaint paint = this.f43159d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43160e.setTypeface(null, 1);
        this.f43162g = (Act) context;
    }

    /* JADX INFO: renamed from: S */
    public View m66218S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return puh.m173882b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m66219V(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f40095id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        kuh.m151539b(this.f43162g, topicMomentNew_);
        kuh.m151538a(1, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m66220W() {
        this.f43161f.setVisibility(0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m66221X() {
        this.f43161f.setVisibility(8);
        this.f43164i = null;
    }

    /* JADX INFO: renamed from: Y */
    public void m66222Y(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f43163h = myTabPostGuide;
        this.f43160e.setText(myTabPostGuide.title);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ouh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149161a.m66219V(myTabPostGuide, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m66223Z() {
        if (NullChecker.m82486a(this.f43164i)) {
            this.f43164i.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f43161f, "translationX", 250L, 1500L, new AccelerateDecelerateInterpolator(), 0.0f, (bnl0.m105592y0() - qa00.m175859d(76.0f)) - qa00.m175859d(46.0f));
        this.f43164i = animatorM132170p;
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.muh
            @Override // java.lang.Runnable
            public final void run() {
                this.f138820a.m66220W();
            }
        });
        gt0.m132160f(this.f43164i, new Runnable() { // from class: l.nuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f143715a.m66221X();
            }
        });
        this.f43164i.start();
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66217T(context);
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66217T(context);
    }
}
