package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.AbstractC17238h7;
import p149l.c74;
import p149l.ei2;
import p149l.hxs;
import p149l.i3c0;
import p149l.i54;
import p149l.l6j;
import p149l.ngm;
import p149l.t100;
import p149l.v44;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class CallWidgetItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51473a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51474b;

    /* JADX INFO: renamed from: c */
    public ImageView f51475c;

    /* JADX INFO: renamed from: d */
    public VText f51476d;

    /* JADX INFO: renamed from: e */
    public ImageView f51477e;

    /* JADX INFO: renamed from: f */
    public ImageView f51478f;

    /* JADX INFO: renamed from: g */
    public ImageView f51479g;

    /* JADX INFO: renamed from: h */
    public View f51480h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51481i;

    /* JADX INFO: renamed from: j */
    public TextView f51482j;

    /* JADX INFO: renamed from: k */
    public TextView f51483k;

    /* JADX INFO: renamed from: l */
    public AbstractC17238h7 f51484l;

    /* JADX INFO: renamed from: m */
    public boolean f51485m;

    /* JADX INFO: renamed from: n */
    public BLiveCall f51486n;

    /* JADX INFO: renamed from: o */
    public Animatable f51487o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f51488p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView$a */
    public class C12906a extends ei2<ngm> {
        public C12906a() {
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            CallWidgetItemView.this.f51487o = animatable;
            animatable.start();
        }
    }

    public CallWidgetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m75915c(View view) {
        c74.m105526a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m75916d(int i) {
        this.f51476d.setTypeface(Typeface.DEFAULT_BOLD);
        VText vText = this.f51476d;
        StringBuilder sb = new StringBuilder("");
        int i2 = i + 1;
        sb.append(i2);
        vText.setText(sb.toString());
        this.f51482j.setText(getContext().getString(R$string.f47312j1, Integer.valueOf(i2)));
        m75921i(this.f51482j, 4);
        this.f51482j.setTextColor(-1);
        this.f51479g.setImageResource(i3c0.f111071l1);
        xdl0.m208344M(this.f51479g, true);
        xdl0.m208344M(this.f51477e, false);
        xdl0.m208344M(this.f51478f, false);
        xdl0.m208344M(this.f51474b, false);
        xdl0.m208344M(this.f51483k, false);
        xdl0.m208344M(this.f51475c, false);
        m75923k();
        this.f51486n = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m75917e(ValueAnimator valueAnimator) {
        ((GradientDrawable) this.f51480h.getBackground()).setColors(new int[]{0, Color.parseColor("#00ff852a"), ((Integer) valueAnimator.getAnimatedValue()).intValue()});
    }

    /* JADX INFO: renamed from: f */
    public final void m75918f() {
        if (xdl0.m208349O0(this.f51481i)) {
            return;
        }
        xdl0.m208345M0(this.f51481i, true);
        xdl0.m208345M0(this.f51480h, true);
        if (this.f51484l == null) {
            this.f51484l = l6j.m148750g().m121500O("res://drawable/" + i3c0.f110913X8).m8204B(new C12906a()).build();
        }
        this.f51481i.setController(this.f51484l);
        m75919g();
    }

    /* JADX INFO: renamed from: g */
    public final void m75919g() {
        this.f51480h.setBackgroundResource(i3c0.f111017g7);
        xdl0.m208345M0(this.f51480h, true);
        ValueAnimator valueAnimator = this.f51488p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f51488p = null;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(Color.parseColor("#b4ffbb00"), Color.parseColor("#67ffbb00"));
        this.f51488p = valueAnimatorOfArgb;
        valueAnimatorOfArgb.setDuration(750L);
        this.f51488p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b74
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f73900a.m75917e(valueAnimator2);
            }
        });
        this.f51488p.setRepeatMode(2);
        this.f51488p.setRepeatCount(-1);
        this.f51488p.start();
    }

    /* JADX INFO: renamed from: h */
    public void m75920h(BLiveCall bLiveCall, i54 i54Var, int i, boolean z) {
        this.f51486n = bLiveCall;
        this.f51483k.setText(x8u.m207433c(bLiveCall.userRecvRewardPoint));
        if (v44.m196940h(bLiveCall)) {
            this.f51478f.setImageResource(i3c0.f111131q1);
            this.f51482j.setText(getContext().getString(R$string.f47312j1, Integer.valueOf(i + 1)));
            this.f51482j.setTextColor(-1);
            xdl0.m208344M(this.f51483k, false);
            xdl0.m208344M(this.f51475c, false);
            xdl0.m208344M(this.f51477e, false);
            xdl0.m208344M(this.f51474b, false);
            m75923k();
        } else {
            xdl0.m208344M(this.f51474b, true);
            hxs.m133407t("context_single_room", this.f51474b, i54Var.f111522c, t100.f167277z);
            if (v44.m196944l(bLiveCall)) {
                this.f51478f.setImageResource(i3c0.f110699F1);
                xdl0.m208344M(this.f51475c, true);
                m75923k();
            } else if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser) {
                this.f51478f.setImageResource(i3c0.f111143r1);
                xdl0.m208344M(this.f51475c, true);
                m75923k();
            } else {
                xdl0.m208344M(this.f51475c, false);
                this.f51478f.setImageDrawable(null);
            }
            this.f51482j.setText(i54Var.f111521b);
            this.f51482j.setTextColor(-1);
            xdl0.m208344M(this.f51483k, !this.f51485m);
            xdl0.m208344M(this.f51477e, z);
        }
        m75921i(this.f51482j, 3);
        xdl0.m208344M(this.f51478f, true);
        xdl0.m208344M(this.f51479g, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m75921i(TextView textView, int i) {
        textView.setEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: renamed from: j */
    public void m75922j(boolean z, boolean z2) {
        this.f51485m = z;
        xdl0.m208344M(this.f51482j, !z);
        BLiveCall bLiveCall = this.f51486n;
        TextView textView = this.f51483k;
        boolean z3 = false;
        if (bLiveCall == null) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, (z || v44.m196940h(bLiveCall)) ? false : true);
        }
        boolean zM208349O0 = xdl0.m208349O0(this.f51474b);
        ImageView imageView = this.f51477e;
        if (!zM208349O0) {
            xdl0.m208344M(imageView, false);
            return;
        }
        if (!z && z2 && !v44.m196940h(this.f51486n)) {
            z3 = true;
        }
        xdl0.m208344M(imageView, z3);
    }

    /* JADX INFO: renamed from: k */
    public void m75923k() {
        Animatable animatable = this.f51487o;
        if (animatable != null) {
            animatable.stop();
        }
        xdl0.m208345M0(this.f51481i, false);
        m75924l();
    }

    /* JADX INFO: renamed from: l */
    public final void m75924l() {
        ValueAnimator valueAnimator = this.f51488p;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        xdl0.m208345M0(this.f51480h, false);
    }

    /* JADX INFO: renamed from: m */
    public void m75925m(BLiveCall bLiveCall) {
        if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser || !bLiveCall.isSpeak || v44.m196944l(bLiveCall)) {
            m75923k();
        } else {
            m75918f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75923k();
        this.f51487o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75915c(this);
    }

    public CallWidgetItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallWidgetItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
