package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.i0k;
import p153l.it0;
import p153l.izs;
import p153l.qa00;
import p153l.tfm;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class IdolUserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f50826a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50827b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50828c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f50829d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f50830e;

    /* JADX INFO: renamed from: f */
    public VText f50831f;

    /* JADX INFO: renamed from: g */
    public VText f50832g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50833h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f50834i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.IdolUserUpgradeView$a */
    public class C12982a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUserUpgrade f50835a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f50836b;

        public C12982a(BLiveUserUpgrade bLiveUserUpgrade, x20 x20Var) {
            this.f50835a = bLiveUserUpgrade;
            this.f50836b = x20Var;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
            IdolUserUpgradeView.this.m75227j(this.f50835a);
            IdolUserUpgradeView.this.m75225h(this.f50836b);
        }
    }

    public IdolUserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m75221d(View view) {
        tfm.m190955a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m75222e() {
        it0.m142009C(this.f50834i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m75223f() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m75224g(x20 x20Var) {
        bnl0.m105524M(this, false);
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m75225h(final x20 x20Var) {
        this.f50829d.m69683j("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so", 1);
        this.f50827b.setTranslationY(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50828c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50830e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(1500L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50826a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(1500L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50827b, "translationY", 0.0f, (float) (((double) qa00.m175859d(136.0f)) * (-0.1d)), -qa00.m175859d(136.0f));
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setStartDelay(3000L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50834i = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f50834i.play(objectAnimatorOfFloat4);
        this.f50834i.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat3);
        gt0.m132177w(this.f50834i, new Runnable() { // from class: l.rfm
            @Override // java.lang.Runnable
            public final void run() {
                this.f162810a.m75223f();
            }
        }, new Runnable() { // from class: l.sfm
            @Override // java.lang.Runnable
            public final void run() {
                this.f167728a.m75224g(x20Var);
            }
        });
        this.f50834i.start();
    }

    /* JADX INFO: renamed from: i */
    public void m75226i(BLiveUserUpgrade bLiveUserUpgrade, x20 x20Var) {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/80ca3e7c-8dd2-4c1f-a8f6-e35ea72e0a0511.so").loadCallback(new C12982a(bLiveUserUpgrade, x20Var)).downloadOnly();
    }

    /* JADX INFO: renamed from: j */
    public void m75227j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f50831f.setText(bLiveUserUpgrade.userName);
        izs.m142868s("context_livingAct", this.f50828c, bLiveUserUpgrade.avatarUrl);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f50833h, bLiveUserUpgrade.grade >= 42 ? i0k.f112379b : i0k.f112378a);
        }
        this.f50832g.setText(R$string.f48086fe);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75222e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75221d(this);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdolUserUpgradeView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
