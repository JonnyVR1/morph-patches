package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.ddm;
import p149l.dt0;
import p149l.hxs;
import p149l.sxj;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class IdolUserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f49978a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49979b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49980c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f49981d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f49982e;

    /* JADX INFO: renamed from: f */
    public VText f49983f;

    /* JADX INFO: renamed from: g */
    public VText f49984g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49985h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f49986i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView$a */
    public class C12819a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUserUpgrade f49987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f49988b;

        public C12819a(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
            this.f49987a = bLiveUserUpgrade;
            this.f49988b = d30Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            IdolUserUpgradeView.this.m74044j(this.f49987a);
            IdolUserUpgradeView.this.m74042h(this.f49988b);
        }
    }

    public IdolUserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m74038d(View view) {
        ddm.m111041a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m74039e() {
        dt0.m113503C(this.f49986i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74040f() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m74041g(d30 d30Var) {
        xdl0.m208344M(this, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m74042h(final d30 d30Var) {
        this.f49981d.m68500j("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so", 1);
        this.f49979b.setTranslationY(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49980c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49982e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(1500L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f49978a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(1500L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f49979b, "translationY", 0.0f, (float) (((double) t100.m186890d(136.0f)) * (-0.1d)), -t100.m186890d(136.0f));
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setStartDelay(3000L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49986i = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f49986i.play(objectAnimatorOfFloat4);
        this.f49986i.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat3);
        bt0.m103750w(this.f49986i, new Runnable() { // from class: l.bdm
            @Override // java.lang.Runnable
            public final void run() {
                this.f75043a.m74040f();
            }
        }, new Runnable() { // from class: l.cdm
            @Override // java.lang.Runnable
            public final void run() {
                this.f80380a.m74041g(d30Var);
            }
        });
        this.f49986i.start();
    }

    /* JADX INFO: renamed from: i */
    public void m74043i(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so").loadCallback(new C12819a(bLiveUserUpgrade, d30Var)).downloadOnly();
    }

    /* JADX INFO: renamed from: j */
    public void m74044j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f49983f.setText(bLiveUserUpgrade.userName);
        hxs.m133406s("context_livingAct", this.f49980c, bLiveUserUpgrade.avatarUrl);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f49985h, bLiveUserUpgrade.grade >= 42 ? sxj.f166798b : sxj.f166797a);
        }
        this.f49984g.setText(R$string.f47238fe);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m74039e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74038d(this);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
