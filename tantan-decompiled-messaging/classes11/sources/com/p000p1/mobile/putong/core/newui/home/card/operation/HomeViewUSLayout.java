package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.ndl;
import l.t100;
import l.upa;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeViewUSLayout extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f1656A;

    /* JADX INFO: renamed from: B */
    public GradientBgButton f1657B;

    /* JADX INFO: renamed from: C */
    public View f1658C;

    /* JADX INFO: renamed from: D */
    public View f1659D;

    /* JADX INFO: renamed from: E */
    public View f1660E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f1661F;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f1662a;

    /* JADX INFO: renamed from: b */
    public View f1663b;

    /* JADX INFO: renamed from: c */
    public VText f1664c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1665d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f1666e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f1667f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f1668g;

    /* JADX INFO: renamed from: h */
    public GradientBgButton f1669h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f1670i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f1671j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f1672k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f1673l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f1674m;

    /* JADX INFO: renamed from: n */
    public GradientBgButton f1675n;

    /* JADX INFO: renamed from: o */
    public GradientBgButton f1676o;

    /* JADX INFO: renamed from: p */
    public GradientBgButton f1677p;

    /* JADX INFO: renamed from: q */
    public VLinear f1678q;

    /* JADX INFO: renamed from: r */
    public VLinear f1679r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f1680s;

    /* JADX INFO: renamed from: t */
    public VImage f1681t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f1682u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f1683v;

    /* JADX INFO: renamed from: w */
    public VImage f1684w;

    /* JADX INFO: renamed from: x */
    public VLinear f1685x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f1686y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f1687z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$a */
    public class C0156a implements ValueAnimator.AnimatorUpdateListener {
        public C0156a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            HomeViewUSLayout.this.f1671j.setAlpha(f);
            HomeViewUSLayout.this.f1662a.setAlpha(f);
            HomeViewUSLayout.this.f1678q.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$b */
    public class C0157b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1689a;

        public C0157b(boolean z) {
            this.f1689a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            boolean z = this.f1689a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                xdl0.M(homeViewUSLayout.f1671j, false);
                xdl0.M(HomeViewUSLayout.this.f1678q, true);
                HomeViewUSLayout.this.f1663b.setClickable(false);
            } else {
                xdl0.M(homeViewUSLayout.f1671j, true);
                xdl0.M(HomeViewUSLayout.this.f1678q, false);
                HomeViewUSLayout.this.f1663b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = this.f1689a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                xdl0.M(homeViewUSLayout.f1671j, false);
                xdl0.M(HomeViewUSLayout.this.f1678q, true);
                HomeViewUSLayout.this.f1663b.setClickable(false);
            } else {
                xdl0.M(homeViewUSLayout.f1671j, true);
                xdl0.M(HomeViewUSLayout.this.f1678q, false);
                HomeViewUSLayout.this.f1663b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M(HomeViewUSLayout.this.f1678q, true);
            xdl0.M(HomeViewUSLayout.this.f1671j, true);
            HomeViewUSLayout.this.f1663b.setClickable(true);
        }
    }

    public HomeViewUSLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2431p(this);
        if (!upa.N3()) {
            m2435w();
            return;
        }
        m2433u();
        xdl0.U(this.f1663b, t100.d(120.0f));
        xdl0.W(this.f1663b, t100.d(79.0f));
        xdl0.U(this.f1671j, t100.d(120.0f));
        xdl0.C0(this.f1663b, t100.d(36.0f));
        this.f1664c.setTextSize(12.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m2431p(View view) {
        ndl.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m2432s(boolean z) {
        if (z) {
            m2434v();
        } else {
            m2433u();
        }
        ValueAnimator valueAnimator = this.f1661F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f1661F = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (!z) {
            this.f1661F = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f1661F.setDuration(200L);
        this.f1661F.addUpdateListener(new C0156a());
        this.f1661F.addListener(new C0157b(z));
        this.f1661F.start();
    }

    /* JADX INFO: renamed from: u */
    public final void m2433u() {
        this.f1687z = this.f1671j;
        this.f1656A = this.f1672k;
        this.f1657B = this.f1674m;
        this.f1658C = this.f1675n;
        this.f1659D = this.f1676o;
        this.f1660E = this.f1677p;
    }

    /* JADX INFO: renamed from: v */
    public final void m2434v() {
        this.f1656A = this.f1685x;
        this.f1657B = this.f1682u;
        this.f1658C = this.f1683v;
        this.f1659D = this.f1680s;
    }

    /* JADX INFO: renamed from: w */
    public final void m2435w() {
        this.f1687z = this.f1665d;
        this.f1656A = this.f1666e;
        this.f1657B = this.f1667f;
        this.f1658C = this.f1668g;
        this.f1659D = this.f1669h;
        this.f1660E = this.f1670i;
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
