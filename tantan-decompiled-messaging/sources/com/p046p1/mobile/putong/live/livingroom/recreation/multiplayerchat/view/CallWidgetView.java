package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import java.util.List;
import p147v.VRelative;
import p149l.bt0;
import p149l.cud;
import p149l.e30;
import p149l.h54;
import p149l.i0s;
import p149l.i54;
import p149l.i74;
import p149l.s7m;
import p149l.t100;
import p149l.v44;
import p149l.vwb;
import p149l.w74;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class CallWidgetView extends LinearLayout implements s7m<i74> {

    /* JADX INFO: renamed from: a */
    public CallWidgetView f51490a;

    /* JADX INFO: renamed from: b */
    public VRelative f51491b;

    /* JADX INFO: renamed from: c */
    public CallWidgetItemView f51492c;

    /* JADX INFO: renamed from: d */
    public CallWidgetItemView f51493d;

    /* JADX INFO: renamed from: e */
    public CallWidgetItemView f51494e;

    /* JADX INFO: renamed from: f */
    public ImageView f51495f;

    /* JADX INFO: renamed from: g */
    public ImageView f51496g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f51497h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f51498i;

    /* JADX INFO: renamed from: j */
    public List<CallWidgetItemView> f51499j;

    /* JADX INFO: renamed from: k */
    public int f51500k;

    /* JADX INFO: renamed from: l */
    public int f51501l;

    /* JADX INFO: renamed from: m */
    public boolean f51502m;

    /* JADX INFO: renamed from: n */
    public boolean f51503n;

    /* JADX INFO: renamed from: o */
    public i74 f51504o;

    public CallWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51500k = t100.m186890d(42.0f);
        this.f51501l = t100.m186890d(28.0f);
        this.f51503n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m75927A(View view) {
        m75948K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m75928B(View view) {
        this.f51504o.mo134729N3();
    }

    private void setItemViewValue(int i) {
        for (int i2 = 0; i2 < this.f51499j.size(); i2++) {
            CallWidgetItemView callWidgetItemView = this.f51499j.get(i2);
            FrameLayout frameLayout = callWidgetItemView.f51473a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
            frameLayout.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) callWidgetItemView.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = xdl0.f192403e;
            callWidgetItemView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m75941C(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        double d = ((double) iIntValue) / ((double) this.f51501l);
        setItemViewValue(iIntValue);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51491b.getLayoutParams();
        if (d == 1.0d) {
            layoutParams.height = t100.m186890d(48.0f);
            layoutParams.width = t100.m186890d(100.0f);
        } else {
            layoutParams.height = (int) (((double) t100.m186890d(48.0f)) * 1.19d * d);
            layoutParams.width = (int) (((double) t100.m186890d(100.0f)) * 1.1d * d);
        }
        this.f51491b.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m75942E() {
        setItemViewMinimize(true);
        xdl0.m208344M(this.f51496g, false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m75943F(View view) {
        m75949L(true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m75944G() {
        this.f51491b.setOnClickListener(new View.OnClickListener() { // from class: l.m74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131788a.m75943F(view);
            }
        });
        this.f51503n = true;
        i74 i74Var = this.f51504o;
        if (i74Var != null) {
            i74Var.m134732U3(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m75945H(boolean z) {
        setItemViewMinimize(false);
        this.f51491b.setOnClickListener(null);
        xdl0.m208344M(this.f51496g, z);
        this.f51503n = false;
        i74 i74Var = this.f51504o;
        if (i74Var != null) {
            i74Var.m134732U3(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m75946I(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        double d = ((double) iIntValue) / ((double) this.f51500k);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f51491b.getLayoutParams();
        setItemViewValue(iIntValue);
        layoutParams.height = m75955s((int) (((double) t100.m186890d(89.0f)) * 1.19d * d), t100.m186890d(89.0f));
        layoutParams.width = m75955s((int) (d * 1.1d * ((double) t100.m186890d(166.0f))), t100.m186890d(166.0f));
        this.f51491b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m75947J(boolean z, CallWidgetItemView callWidgetItemView) {
        callWidgetItemView.m75922j(z, this.f51502m);
    }

    /* JADX INFO: renamed from: K */
    public final void m75948K() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f51500k, this.f51501l);
        this.f51498i = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u74
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f174917a.m75941C(valueAnimator);
            }
        });
        bt0.m103750w(this.f51498i, new Runnable() { // from class: l.v74
            @Override // java.lang.Runnable
            public final void run() {
                this.f180297a.m75942E();
            }
        }, new Runnable() { // from class: l.l74
            @Override // java.lang.Runnable
            public final void run() {
                this.f126690a.m75944G();
            }
        });
        this.f51498i.setInterpolator(new LinearInterpolator());
        this.f51498i.setDuration(50L);
        this.f51498i.start();
    }

    /* JADX INFO: renamed from: L */
    public void m75949L(final boolean z) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f51501l, this.f51500k);
        this.f51497h = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.s74
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f162886a.m75946I(valueAnimator);
            }
        });
        bt0.m103733f(this.f51497h, new Runnable() { // from class: l.t74
            @Override // java.lang.Runnable
            public final void run() {
                this.f168657a.m75945H(z);
            }
        });
        this.f51497h.setInterpolator(new LinearInterpolator());
        this.f51497h.setDuration(50L);
        this.f51497h.start();
    }

    /* JADX INFO: renamed from: M */
    public final void m75950M() {
        for (int i = 0; i < this.f51499j.size(); i++) {
            m75957v(i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m75951N(cud cudVar, BLiveCall bLiveCall) {
        h54.m129377d("updateDeputyView " + bLiveCall.getDeputyViewPos());
        i54 i54VarM108754g = cudVar.m108754g(Integer.valueOf(bLiveCall.getDeputyViewPos()));
        if (i54VarM108754g != null) {
            this.f51499j.get(bLiveCall.getDeputyViewPos()).m75920h(bLiveCall, i54VarM108754g, bLiveCall.getDeputyViewPos(), (this.f51502m || v44.m196943k(bLiveCall)) && !this.f51503n);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m75952O(cud cudVar, BLiveCall bLiveCall) {
        this.f51499j.get(bLiveCall.getDeputyViewPos()).m75925m(bLiveCall);
    }

    @Override // p149l.s7m
    public void destroy() {
        m75956u();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m75956u();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75953p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m75953p(View view) {
        w74.m202004a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i74 i74Var) {
        this.f51504o = i74Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m75955s(int i, int i2) {
        return Math.min(i, i2);
    }

    public void setItemViewMinimize(final boolean z) {
        vwb.m200354z(this.f51499j, new e30() { // from class: l.k74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121529a.m75947J(z, (CallWidgetItemView) obj);
            }
        });
    }

    public void setLiveCallModel(cud cudVar) {
        i0s i0sVarM108760m = cudVar.m108760m();
        m75950M();
        for (int i = 0; i < i0sVarM108760m.m133919m().size(); i++) {
            m75951N(cudVar, i0sVarM108760m.m133919m().get(i));
        }
    }

    public void setMinimizeVisible(boolean z) {
        xdl0.m208344M(this.f51496g, z);
    }

    public void setVisible(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m75956u() {
        ValueAnimator valueAnimator = this.f51497h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f51498i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m75957v(int i) {
        if (i < 0 || i >= this.f51499j.size()) {
            return;
        }
        this.f51499j.get(i).m75916d(i);
    }

    /* JADX INFO: renamed from: w */
    public void m75958w(boolean z) {
        this.f51499j = vwb.m200324f0(this.f51494e, this.f51493d, this.f51492c);
        for (final int i = 0; i < this.f51499j.size(); i++) {
            m75957v(i);
            CallWidgetItemView callWidgetItemView = this.f51499j.get(i);
            callWidgetItemView.f51474b.setOnClickListener(new View.OnClickListener() { // from class: l.n74
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137480a.m75959x(i, view);
                }
            });
            callWidgetItemView.f51479g.setOnClickListener(new View.OnClickListener() { // from class: l.o74
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142454a.m75960y(i, view);
                }
            });
            callWidgetItemView.f51477e.setOnClickListener(new View.OnClickListener() { // from class: l.p74
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147473a.m75961z(i, view);
                }
            });
        }
        this.f51502m = z;
        this.f51496g.setOnClickListener(new View.OnClickListener() { // from class: l.q74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152980a.m75927A(view);
            }
        });
        xdl0.m208344M(this.f51495f, z);
        this.f51495f.setOnClickListener(new View.OnClickListener() { // from class: l.r74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158008a.m75928B(view);
            }
        });
        if (this.f51503n) {
            m75949L(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m75959x(int i, View view) {
        this.f51504o.m134730O3(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m75960y(int i, View view) {
        this.f51504o.m134730O3(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m75961z(int i, View view) {
        this.f51504o.mo114367P3(i);
    }

    public CallWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CallWidgetView(Context context) {
        this(context, null);
    }
}
