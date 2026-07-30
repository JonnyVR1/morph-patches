package com.p051p1.mobile.putong.live.base.mmsdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGAVideoEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.Nullable;
import p153l.so0;
import p153l.wo0;

/* JADX INFO: loaded from: classes13.dex */
public class AnimEffectPlayer extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public boolean f45367a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer$a */
    public class C12614a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wo0 f45368a;

        public C12614a(wo0 wo0Var) {
            this.f45368a = wo0Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            wo0 wo0Var = this.f45368a;
            if (wo0Var != null) {
                wo0Var.mo70745b();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onPause() {
            wo0 wo0Var = this.f45368a;
            if (wo0Var != null) {
                wo0Var.mo77317e();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onRepeat() {
            wo0 wo0Var = this.f45368a;
            if (wo0Var != null) {
                wo0Var.mo74021f();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            wo0 wo0Var = this.f45368a;
            if (wo0Var != null) {
                wo0Var.mo70786g();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            wo0 wo0Var = this.f45368a;
            if (wo0Var != null) {
                wo0Var.mo77318h(i, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer$b */
    public class C12615b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wo0 f45370a;

        public C12615b(wo0 wo0Var) {
            this.f45370a = wo0Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, SVGAException sVGAException) {
            if (this.f45370a != null) {
                this.f45370a.mo74020a(AnimEffectPlayer.this.m69679f(sVGAException));
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f45370a != null) {
                boolean z = resource.get() instanceof SVGAVideoEntity;
                wo0 wo0Var = this.f45370a;
                if (z) {
                    wo0Var.mo71712d(so0.m187041a((SVGAVideoEntity) resource.get()));
                } else {
                    wo0Var.mo74703c();
                }
            }
        }
    }

    public AnimEffectPlayer(@Nullable Context context) {
        super(context);
        this.f45367a = false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final String m69679f(SVGAException sVGAException) {
        String message = NullChecker.m82486a(sVGAException) ? sVGAException.getMessage() : null;
        return TextUtils.isEmpty(message) ? "svga 远程下载未知错误" : message;
    }

    /* JADX INFO: renamed from: g */
    public void mo69680g(String str, int i, wo0 wo0Var, boolean z) {
        m69681h(str, i, wo0Var, z, true);
    }

    /* JADX INFO: renamed from: h */
    public void m69681h(String str, int i, wo0 wo0Var, boolean z, boolean z2) {
        SVGALoader.with(getContext()).from(str).isCacheable(z2).repeatCount(i).autoPlay(z).loadCallback(new C12615b(wo0Var)).animListener(new C12614a(wo0Var)).into(this);
    }

    /* JADX INFO: renamed from: i */
    public void m69682i(String str, int i, wo0 wo0Var, boolean z) {
        mo69680g(str, i, wo0Var, z);
    }

    /* JADX INFO: renamed from: j */
    public void m69683j(String str, int i) {
        m69681h(str, i, null, true, true);
    }

    /* JADX INFO: renamed from: k */
    public void m69684k(String str, int i, boolean z) {
        m69681h(str, i, null, true, z);
    }

    /* JADX INFO: renamed from: l */
    public void mo69685l(String str, int i, wo0 wo0Var) {
        mo69680g(str, i, wo0Var, true);
    }

    /* JADX INFO: renamed from: m */
    public void m69686m(String str, int i, wo0 wo0Var, boolean z) {
        m69681h(str, i, wo0Var, true, z);
    }

    /* JADX INFO: renamed from: n */
    public void m69687n() {
        if (isAnimating()) {
            stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m69688o() {
        if (isAnimating()) {
            stopAnimation(this.f45367a);
        }
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationEnd(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationPause(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationRepeat(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationResume(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.Animator.AnimatorListener
    public void onAnimationStart(@androidx.annotation.Nullable Animator animator) {
        super.onAnimationStart(animator);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@androidx.annotation.Nullable ValueAnimator valueAnimator) {
        super.onAnimationUpdate(valueAnimator);
    }

    public void setClearsAfterStop(boolean z) {
        this.f45367a = z;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45367a = false;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45367a = false;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f45367a = false;
    }
}
