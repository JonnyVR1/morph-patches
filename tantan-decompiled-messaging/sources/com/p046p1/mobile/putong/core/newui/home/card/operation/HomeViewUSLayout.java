package com.p046p1.mobile.putong.core.newui.home.card.operation;

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
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ndl;
import p149l.t100;
import p149l.upa;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeViewUSLayout extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f22878A;

    /* JADX INFO: renamed from: B */
    public GradientBgButton f22879B;

    /* JADX INFO: renamed from: C */
    public View f22880C;

    /* JADX INFO: renamed from: D */
    public View f22881D;

    /* JADX INFO: renamed from: E */
    public View f22882E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f22883F;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f22884a;

    /* JADX INFO: renamed from: b */
    public View f22885b;

    /* JADX INFO: renamed from: c */
    public VText f22886c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f22887d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f22888e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f22889f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f22890g;

    /* JADX INFO: renamed from: h */
    public GradientBgButton f22891h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f22892i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f22893j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f22894k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f22895l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f22896m;

    /* JADX INFO: renamed from: n */
    public GradientBgButton f22897n;

    /* JADX INFO: renamed from: o */
    public GradientBgButton f22898o;

    /* JADX INFO: renamed from: p */
    public GradientBgButton f22899p;

    /* JADX INFO: renamed from: q */
    public VLinear f22900q;

    /* JADX INFO: renamed from: r */
    public VLinear f22901r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f22902s;

    /* JADX INFO: renamed from: t */
    public VImage f22903t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f22904u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f22905v;

    /* JADX INFO: renamed from: w */
    public VImage f22906w;

    /* JADX INFO: renamed from: x */
    public VLinear f22907x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f22908y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f22909z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$a */
    public class C7992a implements ValueAnimator.AnimatorUpdateListener {
        public C7992a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            HomeViewUSLayout.this.f22893j.setAlpha(f);
            HomeViewUSLayout.this.f22884a.setAlpha(f);
            HomeViewUSLayout.this.f22900q.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$b */
    public class C7993b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f22911a;

        public C7993b(boolean z) {
            this.f22911a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            boolean z = this.f22911a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                xdl0.m208344M(homeViewUSLayout.f22893j, false);
                xdl0.m208344M(HomeViewUSLayout.this.f22900q, true);
                HomeViewUSLayout.this.f22885b.setClickable(false);
            } else {
                xdl0.m208344M(homeViewUSLayout.f22893j, true);
                xdl0.m208344M(HomeViewUSLayout.this.f22900q, false);
                HomeViewUSLayout.this.f22885b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = this.f22911a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                xdl0.m208344M(homeViewUSLayout.f22893j, false);
                xdl0.m208344M(HomeViewUSLayout.this.f22900q, true);
                HomeViewUSLayout.this.f22885b.setClickable(false);
            } else {
                xdl0.m208344M(homeViewUSLayout.f22893j, true);
                xdl0.m208344M(HomeViewUSLayout.this.f22900q, false);
                HomeViewUSLayout.this.f22885b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208344M(HomeViewUSLayout.this.f22900q, true);
            xdl0.m208344M(HomeViewUSLayout.this.f22893j, true);
            HomeViewUSLayout.this.f22885b.setClickable(true);
        }
    }

    public HomeViewUSLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38453p(this);
        if (!upa.m194675N3()) {
            m38457w();
            return;
        }
        m38455u();
        xdl0.m208357U(this.f22885b, t100.m186890d(120.0f));
        xdl0.m208359W(this.f22885b, t100.m186890d(79.0f));
        xdl0.m208357U(this.f22893j, t100.m186890d(120.0f));
        xdl0.m208325C0(this.f22885b, t100.m186890d(36.0f));
        this.f22886c.setTextSize(12.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m38453p(View view) {
        ndl.m158993a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m38454s(boolean z) {
        if (z) {
            m38456v();
        } else {
            m38455u();
        }
        ValueAnimator valueAnimator = this.f22883F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f22883F = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (!z) {
            this.f22883F = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f22883F.setDuration(200L);
        this.f22883F.addUpdateListener(new C7992a());
        this.f22883F.addListener(new C7993b(z));
        this.f22883F.start();
    }

    /* JADX INFO: renamed from: u */
    public final void m38455u() {
        this.f22909z = this.f22893j;
        this.f22878A = this.f22894k;
        this.f22879B = this.f22896m;
        this.f22880C = this.f22897n;
        this.f22881D = this.f22898o;
        this.f22882E = this.f22899p;
    }

    /* JADX INFO: renamed from: v */
    public final void m38456v() {
        this.f22878A = this.f22907x;
        this.f22879B = this.f22904u;
        this.f22880C = this.f22905v;
        this.f22881D = this.f22902s;
    }

    /* JADX INFO: renamed from: w */
    public final void m38457w() {
        this.f22909z = this.f22887d;
        this.f22878A = this.f22888e;
        this.f22879B = this.f22889f;
        this.f22880C = this.f22890g;
        this.f22881D = this.f22891h;
        this.f22882E = this.f22892i;
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
