package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.label.CommonTextureFrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p151v.VImage;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.quq;
import p153l.vuq;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleLayoutOptNew extends CommonTextureFrameLayout {

    /* JADX INFO: renamed from: k */
    public View f23894k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f23895l;

    /* JADX INFO: renamed from: m */
    public VImage f23896m;

    /* JADX INFO: renamed from: n */
    public VText_Default_Bold f23897n;

    /* JADX INFO: renamed from: o */
    public pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> f23898o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23899p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$a */
    public class C8166a implements ValueAnimator.AnimatorUpdateListener {
        public C8166a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOptNew.this.f23894k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$b */
    public class C8167b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23901a;

        public C8167b(boolean z) {
            this.f23901a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            bnl0.m105524M(JustRealHomeTitleLayoutOptNew.this.f23894k, this.f23901a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            bnl0.m105524M(JustRealHomeTitleLayoutOptNew.this.f23894k, this.f23901a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f23901a && !bnl0.m105529O0(JustRealHomeTitleLayoutOptNew.this.f23894k)) {
                bnl0.m105524M(JustRealHomeTitleLayoutOptNew.this.f23894k, true);
            }
            JustRealHomeTitleLayoutOptNew.this.f23894k.setAlpha(this.f23901a ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$c */
    public class C8168c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f23903a;

        public C8168c(int i) {
            this.f23903a = i;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleLayoutOptNew.this.f23896m.setImageResource(this.f23903a);
            JustRealHomeTitleLayoutOptNew.this.f23896m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f23895l.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleLayoutOptNew.this.f23896m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f23895l.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew$d */
    public class C8169d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f23905a;

        public C8169d(int i) {
            this.f23905a = i;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            JustRealHomeTitleLayoutOptNew.this.f23896m.setImageResource(this.f23905a);
            JustRealHomeTitleLayoutOptNew.this.f23896m.setAlpha(1.0f);
            JustRealHomeTitleLayoutOptNew.this.f23895l.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            JustRealHomeTitleLayoutOptNew.this.f23896m.setAlpha(0.0f);
            JustRealHomeTitleLayoutOptNew.this.f23895l.setAlpha(1.0f);
            super.onStart();
        }
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m39693i(View view) {
        vuq.m202876a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m39694j(boolean z) {
        if (gra.m131778z()) {
            return;
        }
        ValueAnimator valueAnimator = this.f23899p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23899p.cancel();
        }
        if (z) {
            this.f23899p = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            this.f23899p = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.f23899p.setDuration(400L);
        this.f23899p.addUpdateListener(new C8166a());
        this.f23899p.addListener(new C8167b(z));
        this.f23899p.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m39695k(View view) {
        quq.m178180P((Act) bnl0.m105506D(getContext()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m39696l(boolean z, pf60 pf60Var) {
        String str;
        int i;
        F f = pf60Var.f152156a;
        if (((CoreJustVerificationCardApi.JustRealStatus) f).started != this.f23898o.f152156a.started) {
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started) {
                str = z ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga";
            } else {
                str = z ? "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga";
            }
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started) {
                i = z ? dbc0.f87052hd : dbc0.f87019gd;
            } else {
                i = z ? dbc0.f86986fd : dbc0.f86953ed;
            }
            m39698n(str, i, true);
            m39694j(((CoreJustVerificationCardApi.JustRealStatus) pf60Var.f152156a).started);
        }
        m39700p(pf60Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m39697m() {
        if (gra.m131778z()) {
            bnl0.m105505C0(this, qa00.m175859d(34.0f));
            bnl0.m105524M(this.f23894k, false);
            setBackground(null);
            m22093f(dbc0.f86980f7);
            this.f23897n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            m22092e(true, -8264961, qa00.m175859d(10.0f));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m39698n(String str, int i, boolean z) {
        if (z) {
            this.f23895l.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C8169d(i)).loadCallback(new C8168c(i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f23895l);
        } else {
            this.f23896m.setImageResource(i);
            this.f23896m.setAlpha(1.0f);
            this.f23895l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m39699o(Act act) {
        String str;
        int i;
        pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60VarM31246k3 = CoreModule.f18264c.f20446z2.m31246k3();
        final boolean zM131778z = gra.m131778z();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = pf60VarM31246k3.f152156a;
        if (justRealStatus.started) {
            str = zM131778z ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga";
        } else {
            str = zM131778z ? "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga";
        }
        if (justRealStatus.started) {
            i = zM131778z ? dbc0.f87052hd : dbc0.f87019gd;
        } else {
            i = zM131778z ? dbc0.f86986fd : dbc0.f86953ed;
        }
        m39698n(str, i, false);
        m39694j(pf60VarM31246k3.f152156a.started);
        m39700p(pf60VarM31246k3);
        act.duringCreated(CoreModule.f18264c.f20446z2.m31248m3().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.uuq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181087a.m39696l(zM131778z, (pf60) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39693i(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.tuq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176204a.m39695k(view);
            }
        });
        m39697m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23894k.getMeasuredWidth() != getMeasuredWidth()) {
            bnl0.m105507D0(getMeasuredWidth(), this.f23894k);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m39700p(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        this.f23898o = pf60Var;
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHomeTitleLayoutOptNew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
