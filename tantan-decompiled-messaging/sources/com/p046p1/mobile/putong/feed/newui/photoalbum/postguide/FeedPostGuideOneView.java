package com.p046p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.animation.Animator;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.ath;
import p149l.bt0;
import p149l.t100;
import p149l.vsh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostGuideOneView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f42310c;

    /* JADX INFO: renamed from: d */
    public VText f42311d;

    /* JADX INFO: renamed from: e */
    public VText f42312e;

    /* JADX INFO: renamed from: f */
    public VImage f42313f;

    /* JADX INFO: renamed from: g */
    public Act f42314g;

    /* JADX INFO: renamed from: h */
    public MyTabPostGuide f42315h;

    /* JADX INFO: renamed from: i */
    public Animator f42316i;

    public FeedPostGuideOneView(Context context) {
        super(context);
        m65034T(context);
    }

    /* JADX INFO: renamed from: T */
    private void m65034T(Context context) {
        addView(m65035S(LayoutInflater.from(context), this));
        TextPaint paint = this.f42311d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f42312e.setTypeface(null, 1);
        this.f42314g = (Act) context;
    }

    /* JADX INFO: renamed from: S */
    public View m65035S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ath.m98799b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m65036V(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f39247id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m199868b(this.f42314g, topicMomentNew_);
        vsh.m199867a(1, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m65037W() {
        this.f42313f.setVisibility(0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m65038X() {
        this.f42313f.setVisibility(8);
        this.f42316i = null;
    }

    /* JADX INFO: renamed from: Y */
    public void m65039Y(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f42315h = myTabPostGuide;
        this.f42312e.setText(myTabPostGuide.title);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204595a.m65036V(myTabPostGuide, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m65040Z() {
        if (NullChecker.m81303a(this.f42316i)) {
            this.f42316i.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f42313f, "translationX", 250L, 1500L, new AccelerateDecelerateInterpolator(), 0.0f, (xdl0.m208412y0() - t100.m186890d(76.0f)) - t100.m186890d(46.0f));
        this.f42316i = animatorM103743p;
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.xsh
            @Override // java.lang.Runnable
            public final void run() {
                this.f194275a.m65037W();
            }
        });
        bt0.m103733f(this.f42316i, new Runnable() { // from class: l.ysh
            @Override // java.lang.Runnable
            public final void run() {
                this.f199769a.m65038X();
            }
        });
        this.f42316i.start();
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65034T(context);
    }

    public FeedPostGuideOneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65034T(context);
    }
}
