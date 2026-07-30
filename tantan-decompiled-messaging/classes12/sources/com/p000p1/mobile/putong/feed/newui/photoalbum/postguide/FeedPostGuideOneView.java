package com.p000p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p000p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.t100;
import l.xdl0;
import p007l.ath;
import p007l.vsh;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostGuideOneView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f3771c;

    /* JADX INFO: renamed from: d */
    public VText f3772d;

    /* JADX INFO: renamed from: e */
    public VText f3773e;

    /* JADX INFO: renamed from: f */
    public VImage f3774f;

    /* JADX INFO: renamed from: g */
    public Act f3775g;

    /* JADX INFO: renamed from: h */
    public MyTabPostGuide f3776h;

    /* JADX INFO: renamed from: i */
    public Animator f3777i;

    public FeedPostGuideOneView(Context context) {
        super(context);
        m6135T(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private void m6135T(Context context) {
        addView(m6136S(LayoutInflater.from(context), this));
        TextPaint paint = this.f3772d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f3773e.setTypeface((Typeface) null, 1);
        this.f3775g = (Act) context;
    }

    /* JADX INFO: renamed from: S */
    public View m6136S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ath.m8594b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m6137V(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f708id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m15576b(this.f3775g, topicMomentNew_);
        vsh.m15575a(1, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6138W() {
        this.f3774f.setVisibility(0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m6139X() {
        this.f3774f.setVisibility(8);
        this.f3777i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public void m6140Y(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f3776h = myTabPostGuide;
        this.f3773e.setText(myTabPostGuide.title);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15853a.m6137V(myTabPostGuide, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m6141Z() {
        if (NullChecker.a(this.f3777i)) {
            this.f3777i.cancel();
        }
        Animator animatorP = bt0.p(this.f3774f, "translationX", 250L, 1500L, new AccelerateDecelerateInterpolator(), new float[]{0.0f, (xdl0.y0() - t100.d(76.0f)) - t100.d(46.0f)});
        this.f3777i = animatorP;
        bt0.v(animatorP, new Runnable() { // from class: l.xsh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15147a.m6138W();
            }
        });
        bt0.f(this.f3777i, new Runnable() { // from class: l.ysh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15498a.m6139X();
            }
        });
        this.f3777i.start();
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6135T(context);
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6135T(context);
    }
}
