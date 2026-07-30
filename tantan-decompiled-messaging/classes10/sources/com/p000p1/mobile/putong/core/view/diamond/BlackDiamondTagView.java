package com.p000p1.mobile.putong.core.view.diamond;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.mep0;
import l.t100;
import l.xdl0;
import p003l.j33;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BlackDiamondTagView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f2623d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f2624e;

    /* JADX INFO: renamed from: f */
    public TextView f2625f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f2626g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f2627h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$a */
    public class C3269a extends AnimListener {
        public C3269a() {
        }

        public void onFinished() {
            xdl0.M(BlackDiamondTagView.this.f2626g, false);
        }

        public void onStart() {
            xdl0.M(BlackDiamondTagView.this.f2626g, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$b */
    public class C3270b extends AnimListener {
        public C3270b() {
        }

        public void onFinished() {
            xdl0.M(BlackDiamondTagView.this.f2627h, false);
        }

        public void onStart() {
            xdl0.M(BlackDiamondTagView.this.f2627h, true);
        }
    }

    public BlackDiamondTagView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5046h0(View view) {
        j33.m7332a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m5047i0(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f2626g.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f2624e.getLayoutParams();
        if (z) {
            layoutParams.width = t100.d(28.0f);
            layoutParams.height = t100.d(20.0f);
            this.f2626g.setLayoutParams(layoutParams);
            layoutParams2.width = t100.d(28.0f);
            layoutParams2.height = t100.d(20.0f);
            this.f2624e.setLayoutParams(layoutParams2);
            this.f2625f.setTextSize(12.0f);
            return;
        }
        layoutParams.width = t100.d(23.0f);
        layoutParams.height = t100.d(16.0f);
        this.f2626g.setLayoutParams(layoutParams);
        layoutParams2.width = t100.d(23.0f);
        layoutParams2.height = t100.d(16.0f);
        this.f2624e.setLayoutParams(layoutParams2);
        this.f2625f.setTextSize(9.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m5048j0() {
        m5050l0(this.f2626g, this.f2624e, this.f2627h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m5049k0() {
        SVGAnimationView sVGAnimationView = this.f2626g;
        if (sVGAnimationView != null && !sVGAnimationView.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cc4e37f9-cd92-4916-8280-def38db2ce9a11.so").repeatCount(1).animListener(new C3269a()).into(this.f2626g);
        }
        SVGAnimationView sVGAnimationView2 = this.f2627h;
        if (sVGAnimationView2 != null && !sVGAnimationView2.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/8563c300-b598-4140-8fd5-bc638d5981df10.so").repeatCount(1).animListener(new C3270b()).into(this.f2627h);
        }
        SVGAnimationView sVGAnimationView3 = this.f2624e;
        if (sVGAnimationView3 == null || sVGAnimationView3.isAnimating()) {
            return;
        }
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea2e7057-cacb-4ccd-97a0-f0de165a03d611.so").into(this.f2624e);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m5050l0(SVGAnimationView... sVGAnimationViewArr) {
        for (SVGAnimationView sVGAnimationView : sVGAnimationViewArr) {
            if (sVGAnimationView != null && sVGAnimationView.isAnimating()) {
                sVGAnimationView.stopAnimation(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m5048j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5046h0(this);
        mep0.c1(this.f2627h, 0, 0, 0, 0, t100.d(6.0f));
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
