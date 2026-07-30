package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import java.util.List;
import p151v.VRelative;
import p153l.bnl0;
import p153l.g64;
import p153l.gt0;
import p153l.h64;
import p153l.h84;
import p153l.iam;
import p153l.j2s;
import p153l.jyb;
import p153l.qa00;
import p153l.qvd;
import p153l.u54;
import p153l.v84;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class CallWidgetView extends LinearLayout implements iam<h84> {

    /* JADX INFO: renamed from: a */
    public CallWidgetView f52338a;

    /* JADX INFO: renamed from: b */
    public VRelative f52339b;

    /* JADX INFO: renamed from: c */
    public CallWidgetItemView f52340c;

    /* JADX INFO: renamed from: d */
    public CallWidgetItemView f52341d;

    /* JADX INFO: renamed from: e */
    public CallWidgetItemView f52342e;

    /* JADX INFO: renamed from: f */
    public ImageView f52343f;

    /* JADX INFO: renamed from: g */
    public ImageView f52344g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f52345h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f52346i;

    /* JADX INFO: renamed from: j */
    public List<CallWidgetItemView> f52347j;

    /* JADX INFO: renamed from: k */
    public int f52348k;

    /* JADX INFO: renamed from: l */
    public int f52349l;

    /* JADX INFO: renamed from: m */
    public boolean f52350m;

    /* JADX INFO: renamed from: n */
    public boolean f52351n;

    /* JADX INFO: renamed from: o */
    public h84 f52352o;

    public CallWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52348k = qa00.m175859d(42.0f);
        this.f52349l = qa00.m175859d(28.0f);
        this.f52351n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m77110A(View view) {
        m77131K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m77111B(View view) {
        this.f52352o.mo133897N3();
    }

    private void setItemViewValue(int i) {
        for (int i2 = 0; i2 < this.f52347j.size(); i2++) {
            CallWidgetItemView callWidgetItemView = this.f52347j.get(i2);
            FrameLayout frameLayout = callWidgetItemView.f52321a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
            frameLayout.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) callWidgetItemView.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = bnl0.f77544e;
            callWidgetItemView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m77124C(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        double d = ((double) iIntValue) / ((double) this.f52349l);
        setItemViewValue(iIntValue);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f52339b.getLayoutParams();
        if (d == 1.0d) {
            layoutParams.height = qa00.m175859d(48.0f);
            layoutParams.width = qa00.m175859d(100.0f);
        } else {
            layoutParams.height = (int) (((double) qa00.m175859d(48.0f)) * 1.19d * d);
            layoutParams.width = (int) (((double) qa00.m175859d(100.0f)) * 1.1d * d);
        }
        this.f52339b.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m77125E() {
        setItemViewMinimize(true);
        bnl0.m105524M(this.f52344g, false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m77126F(View view) {
        m77132L(true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m77127G() {
        this.f52339b.setOnClickListener(new View.OnClickListener() { // from class: l.l84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130412a.m77126F(view);
            }
        });
        this.f52351n = true;
        h84 h84Var = this.f52352o;
        if (h84Var != null) {
            h84Var.m133900U3(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m77128H(boolean z) {
        setItemViewMinimize(false);
        this.f52339b.setOnClickListener(null);
        bnl0.m105524M(this.f52344g, z);
        this.f52351n = false;
        h84 h84Var = this.f52352o;
        if (h84Var != null) {
            h84Var.m133900U3(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m77129I(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        double d = ((double) iIntValue) / ((double) this.f52348k);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f52339b.getLayoutParams();
        setItemViewValue(iIntValue);
        layoutParams.height = m77138s((int) (((double) qa00.m175859d(89.0f)) * 1.19d * d), qa00.m175859d(89.0f));
        layoutParams.width = m77138s((int) (d * 1.1d * ((double) qa00.m175859d(166.0f))), qa00.m175859d(166.0f));
        this.f52339b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m77130J(boolean z, CallWidgetItemView callWidgetItemView) {
        callWidgetItemView.m77105j(z, this.f52350m);
    }

    /* JADX INFO: renamed from: K */
    public final void m77131K() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f52348k, this.f52349l);
        this.f52346i = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t84
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f172489a.m77124C(valueAnimator);
            }
        });
        gt0.m132177w(this.f52346i, new Runnable() { // from class: l.u84
            @Override // java.lang.Runnable
            public final void run() {
                this.f177971a.m77125E();
            }
        }, new Runnable() { // from class: l.k84
            @Override // java.lang.Runnable
            public final void run() {
                this.f124360a.m77127G();
            }
        });
        this.f52346i.setInterpolator(new LinearInterpolator());
        this.f52346i.setDuration(50L);
        this.f52346i.start();
    }

    /* JADX INFO: renamed from: L */
    public void m77132L(final boolean z) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f52349l, this.f52348k);
        this.f52345h = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r84
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f161662a.m77129I(valueAnimator);
            }
        });
        gt0.m132160f(this.f52345h, new Runnable() { // from class: l.s84
            @Override // java.lang.Runnable
            public final void run() {
                this.f166738a.m77128H(z);
            }
        });
        this.f52345h.setInterpolator(new LinearInterpolator());
        this.f52345h.setDuration(50L);
        this.f52345h.start();
    }

    /* JADX INFO: renamed from: M */
    public final void m77133M() {
        for (int i = 0; i < this.f52347j.size(); i++) {
            m77140v(i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m77134N(qvd qvdVar, BLiveCall bLiveCall) {
        g64.m129083d("updateDeputyView " + bLiveCall.getDeputyViewPos());
        h64 h64VarM178264g = qvdVar.m178264g(Integer.valueOf(bLiveCall.getDeputyViewPos()));
        if (h64VarM178264g != null) {
            this.f52347j.get(bLiveCall.getDeputyViewPos()).m77103h(bLiveCall, h64VarM178264g, bLiveCall.getDeputyViewPos(), (this.f52350m || u54.m194531k(bLiveCall)) && !this.f52351n);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m77135O(qvd qvdVar, BLiveCall bLiveCall) {
        this.f52347j.get(bLiveCall.getDeputyViewPos()).m77108m(bLiveCall);
    }

    @Override // p153l.iam
    public void destroy() {
        m77139u();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77139u();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77136p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m77136p(View view) {
        v84.m200287a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h84 h84Var) {
        this.f52352o = h84Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m77138s(int i, int i2) {
        return Math.min(i, i2);
    }

    public void setItemViewMinimize(final boolean z) {
        jyb.m147537z(this.f52347j, new y20() { // from class: l.j84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118748a.m77130J(z, (CallWidgetItemView) obj);
            }
        });
    }

    public void setLiveCallModel(qvd qvdVar) {
        j2s j2sVarM178270m = qvdVar.m178270m();
        m77133M();
        for (int i = 0; i < j2sVarM178270m.m143253m().size(); i++) {
            m77134N(qvdVar, j2sVarM178270m.m143253m().get(i));
        }
    }

    public void setMinimizeVisible(boolean z) {
        bnl0.m105524M(this.f52344g, z);
    }

    public void setVisible(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m77139u() {
        ValueAnimator valueAnimator = this.f52345h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f52346i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m77140v(int i) {
        if (i < 0 || i >= this.f52347j.size()) {
            return;
        }
        this.f52347j.get(i).m77099d(i);
    }

    /* JADX INFO: renamed from: w */
    public void m77141w(boolean z) {
        this.f52347j = jyb.m147507f0(this.f52342e, this.f52341d, this.f52340c);
        for (final int i = 0; i < this.f52347j.size(); i++) {
            m77140v(i);
            CallWidgetItemView callWidgetItemView = this.f52347j.get(i);
            callWidgetItemView.f52322b.setOnClickListener(new View.OnClickListener() { // from class: l.m84
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135146a.m77142x(i, view);
                }
            });
            callWidgetItemView.f52327g.setOnClickListener(new View.OnClickListener() { // from class: l.n84
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140647a.m77143y(i, view);
                }
            });
            callWidgetItemView.f52325e.setOnClickListener(new View.OnClickListener() { // from class: l.o84
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145354a.m77144z(i, view);
                }
            });
        }
        this.f52350m = z;
        this.f52344g.setOnClickListener(new View.OnClickListener() { // from class: l.p84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150984a.m77110A(view);
            }
        });
        bnl0.m105524M(this.f52343f, z);
        this.f52343f.setOnClickListener(new View.OnClickListener() { // from class: l.q84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156075a.m77111B(view);
            }
        });
        if (this.f52351n) {
            m77132L(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m77142x(int i, View view) {
        this.f52352o.m133898O3(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m77143y(int i, View view) {
        this.f52352o.m133898O3(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m77144z(int i, View view) {
        this.f52352o.mo113671P3(i);
    }

    public CallWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CallWidgetView(Context context) {
        this(context, null);
    }
}
