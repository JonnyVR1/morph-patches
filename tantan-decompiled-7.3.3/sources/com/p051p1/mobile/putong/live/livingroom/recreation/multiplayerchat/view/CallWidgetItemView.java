package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.AbstractC16203c7;
import p153l.b84;
import p153l.bnl0;
import p153l.f9j;
import p153l.h64;
import p153l.izs;
import p153l.li2;
import p153l.obc0;
import p153l.qa00;
import p153l.qim;
import p153l.u54;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class CallWidgetItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52321a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52322b;

    /* JADX INFO: renamed from: c */
    public ImageView f52323c;

    /* JADX INFO: renamed from: d */
    public VText f52324d;

    /* JADX INFO: renamed from: e */
    public ImageView f52325e;

    /* JADX INFO: renamed from: f */
    public ImageView f52326f;

    /* JADX INFO: renamed from: g */
    public ImageView f52327g;

    /* JADX INFO: renamed from: h */
    public View f52328h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f52329i;

    /* JADX INFO: renamed from: j */
    public TextView f52330j;

    /* JADX INFO: renamed from: k */
    public TextView f52331k;

    /* JADX INFO: renamed from: l */
    public AbstractC16203c7 f52332l;

    /* JADX INFO: renamed from: m */
    public boolean f52333m;

    /* JADX INFO: renamed from: n */
    public BLiveCall f52334n;

    /* JADX INFO: renamed from: o */
    public Animatable f52335o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f52336p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView$a */
    public class C13069a extends li2<qim> {
        public C13069a() {
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, @Nullable qim qimVar, @Nullable Animatable animatable) {
            CallWidgetItemView.this.f52335o = animatable;
            animatable.start();
        }
    }

    public CallWidgetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m77098c(View view) {
        b84.m102915a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m77099d(int i) {
        this.f52324d.setTypeface(Typeface.DEFAULT_BOLD);
        VText vText = this.f52324d;
        StringBuilder sb = new StringBuilder("");
        int i2 = i + 1;
        sb.append(i2);
        vText.setText(sb.toString());
        this.f52330j.setText(getContext().getString(R$string.f48160j1, Integer.valueOf(i2)));
        m77104i(this.f52330j, 4);
        this.f52330j.setTextColor(-1);
        this.f52327g.setImageResource(obc0.f146399l1);
        bnl0.m105524M(this.f52327g, true);
        bnl0.m105524M(this.f52325e, false);
        bnl0.m105524M(this.f52326f, false);
        bnl0.m105524M(this.f52322b, false);
        bnl0.m105524M(this.f52331k, false);
        bnl0.m105524M(this.f52323c, false);
        m77106k();
        this.f52334n = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m77100e(ValueAnimator valueAnimator) {
        ((GradientDrawable) this.f52328h.getBackground()).setColors(new int[]{0, Color.parseColor("#00ff852a"), ((Integer) valueAnimator.getAnimatedValue()).intValue()});
    }

    /* JADX INFO: renamed from: f */
    public final void m77101f() {
        if (bnl0.m105529O0(this.f52329i)) {
            return;
        }
        bnl0.m105525M0(this.f52329i, true);
        bnl0.m105525M0(this.f52328h, true);
        if (this.f52332l == null) {
            this.f52332l = f9j.m124665g().m155331O("res://drawable/" + obc0.f146241X8).m8258B(new C13069a()).build();
        }
        this.f52329i.setController(this.f52332l);
        m77102g();
    }

    /* JADX INFO: renamed from: g */
    public final void m77102g() {
        this.f52328h.setBackgroundResource(obc0.f146345g7);
        bnl0.m105525M0(this.f52328h, true);
        ValueAnimator valueAnimator = this.f52336p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f52336p = null;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(Color.parseColor("#b4ffbb00"), Color.parseColor("#67ffbb00"));
        this.f52336p = valueAnimatorOfArgb;
        valueAnimatorOfArgb.setDuration(750L);
        this.f52336p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a84
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f68886a.m77100e(valueAnimator2);
            }
        });
        this.f52336p.setRepeatMode(2);
        this.f52336p.setRepeatCount(-1);
        this.f52336p.start();
    }

    /* JADX INFO: renamed from: h */
    public void m77103h(BLiveCall bLiveCall, h64 h64Var, int i, boolean z) {
        this.f52334n = bLiveCall;
        this.f52331k.setText(yau.m214935c(bLiveCall.userRecvRewardPoint));
        if (u54.m194528h(bLiveCall)) {
            this.f52326f.setImageResource(obc0.f146459q1);
            this.f52330j.setText(getContext().getString(R$string.f48160j1, Integer.valueOf(i + 1)));
            this.f52330j.setTextColor(-1);
            bnl0.m105524M(this.f52331k, false);
            bnl0.m105524M(this.f52323c, false);
            bnl0.m105524M(this.f52325e, false);
            bnl0.m105524M(this.f52322b, false);
            m77106k();
        } else {
            bnl0.m105524M(this.f52322b, true);
            izs.m142869t("context_single_room", this.f52322b, h64Var.f107999c, qa00.f156339z);
            if (u54.m194532l(bLiveCall)) {
                this.f52326f.setImageResource(obc0.f146027F1);
                bnl0.m105524M(this.f52323c, true);
                m77106k();
            } else if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser) {
                this.f52326f.setImageResource(obc0.f146471r1);
                bnl0.m105524M(this.f52323c, true);
                m77106k();
            } else {
                bnl0.m105524M(this.f52323c, false);
                this.f52326f.setImageDrawable(null);
            }
            this.f52330j.setText(h64Var.f107998b);
            this.f52330j.setTextColor(-1);
            bnl0.m105524M(this.f52331k, !this.f52333m);
            bnl0.m105524M(this.f52325e, z);
        }
        m77104i(this.f52330j, 3);
        bnl0.m105524M(this.f52326f, true);
        bnl0.m105524M(this.f52327g, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m77104i(TextView textView, int i) {
        textView.setEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: renamed from: j */
    public void m77105j(boolean z, boolean z2) {
        this.f52333m = z;
        bnl0.m105524M(this.f52330j, !z);
        BLiveCall bLiveCall = this.f52334n;
        TextView textView = this.f52331k;
        boolean z3 = false;
        if (bLiveCall == null) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, (z || u54.m194528h(bLiveCall)) ? false : true);
        }
        boolean zM105529O0 = bnl0.m105529O0(this.f52322b);
        ImageView imageView = this.f52325e;
        if (!zM105529O0) {
            bnl0.m105524M(imageView, false);
            return;
        }
        if (!z && z2 && !u54.m194528h(this.f52334n)) {
            z3 = true;
        }
        bnl0.m105524M(imageView, z3);
    }

    /* JADX INFO: renamed from: k */
    public void m77106k() {
        Animatable animatable = this.f52335o;
        if (animatable != null) {
            animatable.stop();
        }
        bnl0.m105525M0(this.f52329i, false);
        m77107l();
    }

    /* JADX INFO: renamed from: l */
    public final void m77107l() {
        ValueAnimator valueAnimator = this.f52336p;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        bnl0.m105525M0(this.f52328h, false);
    }

    /* JADX INFO: renamed from: m */
    public void m77108m(BLiveCall bLiveCall) {
        if (bLiveCall.mutedByAnchor || bLiveCall.mutedByUser || !bLiveCall.isSpeak || u54.m194532l(bLiveCall)) {
            m77106k();
        } else {
            m77101f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m77106k();
        this.f52335o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77098c(this);
    }

    public CallWidgetItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallWidgetItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
