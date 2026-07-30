package com.p046p1.mobile.putong.live.base.mmsdk;

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
import p149l.ap0;
import p149l.wo0;

/* JADX INFO: loaded from: classes13.dex */
public class AnimEffectPlayer extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public boolean f44519a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer$a */
    public class C12451a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ap0 f44520a;

        public C12451a(ap0 ap0Var) {
            this.f44520a = ap0Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            ap0 ap0Var = this.f44520a;
            if (ap0Var != null) {
                ap0Var.mo69562b();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onPause() {
            ap0 ap0Var = this.f44520a;
            if (ap0Var != null) {
                ap0Var.mo76134e();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onRepeat() {
            ap0 ap0Var = this.f44520a;
            if (ap0Var != null) {
                ap0Var.mo72838f();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            ap0 ap0Var = this.f44520a;
            if (ap0Var != null) {
                ap0Var.mo69603g();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            ap0 ap0Var = this.f44520a;
            if (ap0Var != null) {
                ap0Var.mo76135h(i, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer$b */
    public class C12452b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ap0 f44522a;

        public C12452b(ap0 ap0Var) {
            this.f44522a = ap0Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, SVGAException sVGAException) {
            if (this.f44522a != null) {
                this.f44522a.mo72837a(AnimEffectPlayer.this.m68496f(sVGAException));
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f44522a != null) {
                boolean z = resource.get() instanceof SVGAVideoEntity;
                ap0 ap0Var = this.f44522a;
                if (z) {
                    ap0Var.mo70529d(wo0.m204794a((SVGAVideoEntity) resource.get()));
                } else {
                    ap0Var.mo73520c();
                }
            }
        }
    }

    public AnimEffectPlayer(@Nullable Context context) {
        super(context);
        this.f44519a = false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final String m68496f(SVGAException sVGAException) {
        String message = NullChecker.m81303a(sVGAException) ? sVGAException.getMessage() : null;
        return TextUtils.isEmpty(message) ? "svga 远程下载未知错误" : message;
    }

    /* JADX INFO: renamed from: g */
    public void mo68497g(String str, int i, ap0 ap0Var, boolean z) {
        m68498h(str, i, ap0Var, z, true);
    }

    /* JADX INFO: renamed from: h */
    public void m68498h(String str, int i, ap0 ap0Var, boolean z, boolean z2) {
        SVGALoader.with(getContext()).from(str).isCacheable(z2).repeatCount(i).autoPlay(z).loadCallback(new C12452b(ap0Var)).animListener(new C12451a(ap0Var)).into(this);
    }

    /* JADX INFO: renamed from: i */
    public void m68499i(String str, int i, ap0 ap0Var, boolean z) {
        mo68497g(str, i, ap0Var, z);
    }

    /* JADX INFO: renamed from: j */
    public void m68500j(String str, int i) {
        m68498h(str, i, null, true, true);
    }

    /* JADX INFO: renamed from: k */
    public void m68501k(String str, int i, boolean z) {
        m68498h(str, i, null, true, z);
    }

    /* JADX INFO: renamed from: l */
    public void mo68502l(String str, int i, ap0 ap0Var) {
        mo68497g(str, i, ap0Var, true);
    }

    /* JADX INFO: renamed from: m */
    public void m68503m(String str, int i, ap0 ap0Var, boolean z) {
        m68498h(str, i, ap0Var, true, z);
    }

    /* JADX INFO: renamed from: n */
    public void m68504n() {
        if (isAnimating()) {
            stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m68505o() {
        if (isAnimating()) {
            stopAnimation(this.f44519a);
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
        this.f44519a = z;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44519a = false;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44519a = false;
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f44519a = false;
    }
}
