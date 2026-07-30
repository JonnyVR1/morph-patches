package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.label.CommonTextureFrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p147v.VImage;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.psq;
import p149l.t100;
import p149l.upa;
import p149l.usq;
import p149l.x2c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleLayoutOptNew extends CommonTextureFrameLayout {

    /* JADX INFO: renamed from: k */
    public View f23152k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f23153l;

    /* JADX INFO: renamed from: m */
    public VImage f23154m;

    /* JADX INFO: renamed from: n */
    public VText_Default_Bold f23155n;

    /* JADX INFO: renamed from: o */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f23156o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23157p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$a */
    public class C8015a implements ValueAnimator.AnimatorUpdateListener {
        public C8015a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOptNew.this.f23152k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$b */
    public class C8016b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23159a;

        public C8016b(boolean z) {
            this.f23159a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            xdl0.m208344M(JustRealHomeTitleLayoutOptNew.this.f23152k, this.f23159a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            xdl0.m208344M(JustRealHomeTitleLayoutOptNew.this.f23152k, this.f23159a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f23159a && !xdl0.m208349O0(JustRealHomeTitleLayoutOptNew.this.f23152k)) {
                xdl0.m208344M(JustRealHomeTitleLayoutOptNew.this.f23152k, true);
            }
            JustRealHomeTitleLayoutOptNew.this.f23152k.setAlpha(this.f23159a ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$c */
    public class C8017c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f23161a;

        public C8017c(int i) {
            this.f23161a = i;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleLayoutOptNew.this.f23154m.setImageResource(this.f23161a);
            JustRealHomeTitleLayoutOptNew.this.f23154m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f23153l.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleLayoutOptNew.this.f23154m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f23153l.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$d */
    public class C8018d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f23163a;

        public C8018d(int i) {
            this.f23163a = i;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            JustRealHomeTitleLayoutOptNew.this.f23154m.setImageResource(this.f23163a);
            JustRealHomeTitleLayoutOptNew.this.f23154m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f23153l.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            JustRealHomeTitleLayoutOptNew.this.f23154m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f23153l.setAlpha(1.0f);
            super.onStart();
        }
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m38690i(View view) {
        usq.m195226a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m38691j(boolean z) {
        if (upa.m194847z()) {
            return;
        }
        ValueAnimator valueAnimator = this.f23157p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23157p.cancel();
        }
        if (z) {
            this.f23157p = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            this.f23157p = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f23157p.setDuration(400L);
        this.f23157p.addUpdateListener(new C8015a());
        this.f23157p.addListener(new C8016b(z));
        this.f23157p.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m38692k(View view) {
        psq.m171200P((Act) xdl0.m208326D(getContext()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m38693l(boolean z, j760 j760Var) {
        String str;
        int i;
        F f = j760Var.f116564a;
        if (((CoreJustVerificationCardApi.JustRealStatus) f).started != this.f23156o.f116564a.started) {
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started) {
                str = z ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga";
            } else {
                str = z ? "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga";
            }
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started) {
                i = z ? x2c0.f190170gd : x2c0.f190138fd;
            } else {
                i = z ? x2c0.f190106ed : x2c0.f190075dd;
            }
            m38695n(str, i, true);
            m38691j(((CoreJustVerificationCardApi.JustRealStatus) j760Var.f116564a).started);
        }
        m38697p(j760Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m38694m() {
        if (upa.m194847z()) {
            xdl0.m208325C0(this, t100.m186890d(34.0f));
            xdl0.m208344M(this.f23152k, false);
            setBackground(null);
            m21094f(x2c0.f190100e7);
            this.f23155n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            m21093e(true, -8264961, t100.m186890d(10.0f));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m38695n(String str, int i, boolean z) {
        if (z) {
            this.f23153l.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C8018d(i)).loadCallback(new C8017c(i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f23153l);
        } else {
            this.f23154m.setImageResource(i);
            this.f23154m.setAlpha(1.0f);
            this.f23153l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m38696o(Act act) {
        String str;
        int i;
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarM30248k3 = CoreModule.f17545c.f19704z2.m30248k3();
        final boolean zM194847z = upa.m194847z();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = j760VarM30248k3.f116564a;
        if (justRealStatus.started) {
            str = zM194847z ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga";
        } else {
            str = zM194847z ? "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga";
        }
        if (justRealStatus.started) {
            i = zM194847z ? x2c0.f190170gd : x2c0.f190138fd;
        } else {
            i = zM194847z ? x2c0.f190106ed : x2c0.f190075dd;
        }
        m38695n(str, i, false);
        m38691j(j760VarM30248k3.f116564a.started);
        m38697p(j760VarM30248k3);
        act.duringCreated(CoreModule.f17545c.f19704z2.m30250m3().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.tsq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171951a.m38693l(zM194847z, (j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38690i(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ssq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166237a.m38692k(view);
            }
        });
        m38694m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23152k.getMeasuredWidth() != getMeasuredWidth()) {
            xdl0.m208327D0(getMeasuredWidth(), this.f23152k);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m38697p(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f23156o = j760Var;
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
