package com.p051p1.mobile.putong.core.newui.home.card.operation;

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
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dgl;
import p153l.gra;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class HomeViewUSLayout extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f23620A;

    /* JADX INFO: renamed from: B */
    public GradientBgButton f23621B;

    /* JADX INFO: renamed from: C */
    public View f23622C;

    /* JADX INFO: renamed from: D */
    public View f23623D;

    /* JADX INFO: renamed from: E */
    public View f23624E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f23625F;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f23626a;

    /* JADX INFO: renamed from: b */
    public View f23627b;

    /* JADX INFO: renamed from: c */
    public VText f23628c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f23629d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f23630e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f23631f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f23632g;

    /* JADX INFO: renamed from: h */
    public GradientBgButton f23633h;

    /* JADX INFO: renamed from: i */
    public GradientBgButton f23634i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f23635j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f23636k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f23637l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f23638m;

    /* JADX INFO: renamed from: n */
    public GradientBgButton f23639n;

    /* JADX INFO: renamed from: o */
    public GradientBgButton f23640o;

    /* JADX INFO: renamed from: p */
    public GradientBgButton f23641p;

    /* JADX INFO: renamed from: q */
    public VLinear f23642q;

    /* JADX INFO: renamed from: r */
    public VLinear f23643r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f23644s;

    /* JADX INFO: renamed from: t */
    public VImage f23645t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f23646u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f23647v;

    /* JADX INFO: renamed from: w */
    public VImage f23648w;

    /* JADX INFO: renamed from: x */
    public VLinear f23649x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f23650y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f23651z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$a */
    public class C8143a implements ValueAnimator.AnimatorUpdateListener {
        public C8143a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            HomeViewUSLayout.this.f23635j.setAlpha(f);
            HomeViewUSLayout.this.f23626a.setAlpha(f);
            HomeViewUSLayout.this.f23642q.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout$b */
    public class C8144b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23653a;

        public C8144b(boolean z) {
            this.f23653a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            boolean z = this.f23653a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                bnl0.m105524M(homeViewUSLayout.f23635j, false);
                bnl0.m105524M(HomeViewUSLayout.this.f23642q, true);
                HomeViewUSLayout.this.f23627b.setClickable(false);
            } else {
                bnl0.m105524M(homeViewUSLayout.f23635j, true);
                bnl0.m105524M(HomeViewUSLayout.this.f23642q, false);
                HomeViewUSLayout.this.f23627b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = this.f23653a;
            HomeViewUSLayout homeViewUSLayout = HomeViewUSLayout.this;
            if (z) {
                bnl0.m105524M(homeViewUSLayout.f23635j, false);
                bnl0.m105524M(HomeViewUSLayout.this.f23642q, true);
                HomeViewUSLayout.this.f23627b.setClickable(false);
            } else {
                bnl0.m105524M(homeViewUSLayout.f23635j, true);
                bnl0.m105524M(HomeViewUSLayout.this.f23642q, false);
                HomeViewUSLayout.this.f23627b.setClickable(true);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105524M(HomeViewUSLayout.this.f23642q, true);
            bnl0.m105524M(HomeViewUSLayout.this.f23635j, true);
            HomeViewUSLayout.this.f23627b.setClickable(true);
        }
    }

    public HomeViewUSLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39456p(this);
        if (!gra.m131606N3()) {
            m39460w();
            return;
        }
        m39458u();
        bnl0.m105537U(this.f23627b, qa00.m175859d(120.0f));
        bnl0.m105539W(this.f23627b, qa00.m175859d(79.0f));
        bnl0.m105537U(this.f23635j, qa00.m175859d(120.0f));
        bnl0.m105505C0(this.f23627b, qa00.m175859d(36.0f));
        this.f23628c.setTextSize(12.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m39456p(View view) {
        dgl.m115657a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39457s(boolean z) {
        if (z) {
            m39459v();
        } else {
            m39458u();
        }
        ValueAnimator valueAnimator = this.f23625F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23625F = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (!z) {
            this.f23625F = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f23625F.setDuration(200L);
        this.f23625F.addUpdateListener(new C8143a());
        this.f23625F.addListener(new C8144b(z));
        this.f23625F.start();
    }

    /* JADX INFO: renamed from: u */
    public final void m39458u() {
        this.f23651z = this.f23635j;
        this.f23620A = this.f23636k;
        this.f23621B = this.f23638m;
        this.f23622C = this.f23639n;
        this.f23623D = this.f23640o;
        this.f23624E = this.f23641p;
    }

    /* JADX INFO: renamed from: v */
    public final void m39459v() {
        this.f23620A = this.f23649x;
        this.f23621B = this.f23646u;
        this.f23622C = this.f23647v;
        this.f23623D = this.f23644s;
    }

    /* JADX INFO: renamed from: w */
    public final void m39460w() {
        this.f23651z = this.f23629d;
        this.f23620A = this.f23630e;
        this.f23621B = this.f23631f;
        this.f23622C = this.f23632g;
        this.f23623D = this.f23633h;
        this.f23624E = this.f23634i;
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeViewUSLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
