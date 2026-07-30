package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.sxj;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ddm;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IdolUserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f6020a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f6021b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6022c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f6023d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f6024e;

    /* JADX INFO: renamed from: f */
    public VText f6025f;

    /* JADX INFO: renamed from: g */
    public VText f6026g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6027h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f6028i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView$a */
    public class C0408a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUserUpgrade f6029a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f6030b;

        public C0408a(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
            this.f6029a = bLiveUserUpgrade;
            this.f6030b = d30Var;
        }

        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            IdolUserUpgradeView.this.m7605j(this.f6029a);
            IdolUserUpgradeView.this.m7603h(this.f6030b);
        }
    }

    public IdolUserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m7599d(View view) {
        ddm.m11760a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m7600e() {
        dt0.C(this.f6028i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7601f() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7602g(d30 d30Var) {
        xdl0.M(this, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m7603h(final d30 d30Var) {
        this.f6023d.j("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so", 1);
        this.f6021b.setTranslationY(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6022c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6024e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(1500L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6020a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(1500L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6021b, "translationY", 0.0f, (float) (((double) t100.d(136.0f)) * (-0.1d)), -t100.d(136.0f));
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setStartDelay(3000L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6028i = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f6028i.play(objectAnimatorOfFloat4);
        this.f6028i.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat3);
        bt0.w(this.f6028i, new Runnable() { // from class: l.bdm
            @Override // java.lang.Runnable
            public final void run() {
                this.f8084a.m7601f();
            }
        }, new Runnable() { // from class: l.cdm
            @Override // java.lang.Runnable
            public final void run() {
                this.f8601a.m7602g(d30Var);
            }
        });
        this.f6028i.start();
    }

    /* JADX INFO: renamed from: i */
    public void m7604i(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so").loadCallback(new C0408a(bLiveUserUpgrade, d30Var)).downloadOnly();
    }

    /* JADX INFO: renamed from: j */
    public void m7605j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f6025f.setText(bLiveUserUpgrade.userName);
        hxs.s("context_livingAct", this.f6022c, bLiveUserUpgrade.avatarUrl);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            sxj.c(bLiveUserLevel.backendUrl, this.f6027h, bLiveUserUpgrade.grade >= 42 ? sxj.b : sxj.a);
        }
        this.f6026g.setText(R$string.f3280fe);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7600e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7599d(this);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
