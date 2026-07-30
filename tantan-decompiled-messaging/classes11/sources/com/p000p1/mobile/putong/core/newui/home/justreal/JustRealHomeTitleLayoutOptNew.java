package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.label.CommonTextureFrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.upa;
import l.usq;
import l.x2c0;
import l.xdl0;
import p009l.psq;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealHomeTitleLayoutOptNew extends CommonTextureFrameLayout {

    /* JADX INFO: renamed from: k */
    public View f1930k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f1931l;

    /* JADX INFO: renamed from: m */
    public VImage f1932m;

    /* JADX INFO: renamed from: n */
    public VText_Default_Bold f1933n;

    /* JADX INFO: renamed from: o */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f1934o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f1935p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$a */
    public class C0179a implements ValueAnimator.AnimatorUpdateListener {
        public C0179a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOptNew.this.f1930k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$b */
    public class C0180b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1937a;

        public C0180b(boolean z) {
            this.f1937a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            xdl0.M(JustRealHomeTitleLayoutOptNew.this.f1930k, this.f1937a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            xdl0.M(JustRealHomeTitleLayoutOptNew.this.f1930k, this.f1937a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f1937a && !xdl0.O0(JustRealHomeTitleLayoutOptNew.this.f1930k)) {
                xdl0.M(JustRealHomeTitleLayoutOptNew.this.f1930k, true);
            }
            JustRealHomeTitleLayoutOptNew.this.f1930k.setAlpha(this.f1937a ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$c */
    public class C0181c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1939a;

        public C0181c(int i) {
            this.f1939a = i;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleLayoutOptNew.this.f1932m.setImageResource(this.f1939a);
            JustRealHomeTitleLayoutOptNew.this.f1932m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f1931l.setAlpha(0.0f);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleLayoutOptNew.this.f1932m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f1931l.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$d */
    public class C0182d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1941a;

        public C0182d(int i) {
            this.f1941a = i;
        }

        public void onFinished() {
            super.onFinished();
            JustRealHomeTitleLayoutOptNew.this.f1932m.setImageResource(this.f1941a);
            JustRealHomeTitleLayoutOptNew.this.f1932m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f1931l.setAlpha(0.0f);
        }

        public void onStart() {
            JustRealHomeTitleLayoutOptNew.this.f1932m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f1931l.setAlpha(1.0f);
            super.onStart();
        }
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m2676i(View view) {
        usq.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m2677j(boolean z) {
        if (upa.z()) {
            return;
        }
        ValueAnimator valueAnimator = this.f1935p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1935p.cancel();
        }
        if (z) {
            this.f1935p = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            this.f1935p = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f1935p.setDuration(400L);
        this.f1935p.addUpdateListener(new C0179a());
        this.f1935p.addListener(new C0180b(z));
        this.f1935p.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m2678k(View view) {
        psq.m20645P(xdl0.D(getContext()), true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2679l(boolean z, j760 j760Var) {
        String str;
        int i;
        Object obj = j760Var.a;
        if (((CoreJustVerificationCardApi.JustRealStatus) obj).started != ((CoreJustVerificationCardApi.JustRealStatus) this.f1934o.a).started) {
            if (((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
                str = z ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga";
            } else {
                str = z ? "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga";
            }
            if (((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
                i = z ? x2c0.gd : x2c0.fd;
            } else {
                i = z ? x2c0.ed : x2c0.dd;
            }
            m2681n(str, i, true);
            m2677j(((CoreJustVerificationCardApi.JustRealStatus) j760Var.a).started);
        }
        m2683p(j760Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m2680m() {
        if (upa.z()) {
            xdl0.C0(this, t100.d(34.0f));
            xdl0.M(this.f1930k, false);
            setBackground(null);
            f(x2c0.e7);
            this.f1933n.setTextColor(-16777216);
            e(true, -8264961, t100.d(10.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m2681n(String str, int i, boolean z) {
        if (z) {
            this.f1931l.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C0182d(i)).loadCallback(new C0181c(i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f1931l);
        } else {
            this.f1932m.setImageResource(i);
            this.f1932m.setAlpha(1.0f);
            this.f1931l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2682o(Act act) {
        String str;
        int i;
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarK3 = CoreModule.c.z2.k3();
        final boolean z = upa.z();
        Object obj = j760VarK3.a;
        if (((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
            str = z ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga";
        } else {
            str = z ? "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga";
        }
        if (((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
            i = z ? x2c0.gd : x2c0.fd;
        } else {
            i = z ? x2c0.ed : x2c0.dd;
        }
        m2681n(str, i, false);
        m2677j(((CoreJustVerificationCardApi.JustRealStatus) j760VarK3.a).started);
        m2683p(j760VarK3);
        act.duringCreated(CoreModule.c.z2.m3().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.tsq
            public final void call(Object obj2) {
                this.f20857a.m2679l(z, (j760) obj2);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2676i(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ssq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20455a.m2678k(view);
            }
        });
        m2680m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (this.f1930k.getMeasuredWidth() != getMeasuredWidth()) {
            xdl0.D0(getMeasuredWidth(), new View[]{this.f1930k});
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2683p(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f1934o = j760Var;
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
