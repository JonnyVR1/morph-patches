package com.p046p1.mobile.putong.core.view.diamond;

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
import p149l.j33;
import p149l.mep0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class BlackDiamondTagView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f38681d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f38682e;

    /* JADX INFO: renamed from: f */
    public TextView f38683f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f38684g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f38685h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$a */
    public class C9171a extends AnimListener {
        public C9171a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208344M(BlackDiamondTagView.this.f38684g, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            xdl0.m208344M(BlackDiamondTagView.this.f38684g, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$b */
    public class C9172b extends AnimListener {
        public C9172b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208344M(BlackDiamondTagView.this.f38685h, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            xdl0.m208344M(BlackDiamondTagView.this.f38685h, true);
        }
    }

    public BlackDiamondTagView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m59637h0(View view) {
        j33.m139515a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m59638i0(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f38684g.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f38682e.getLayoutParams();
        if (z) {
            layoutParams.width = t100.m186890d(28.0f);
            layoutParams.height = t100.m186890d(20.0f);
            this.f38684g.setLayoutParams(layoutParams);
            layoutParams2.width = t100.m186890d(28.0f);
            layoutParams2.height = t100.m186890d(20.0f);
            this.f38682e.setLayoutParams(layoutParams2);
            this.f38683f.setTextSize(12.0f);
            return;
        }
        layoutParams.width = t100.m186890d(23.0f);
        layoutParams.height = t100.m186890d(16.0f);
        this.f38684g.setLayoutParams(layoutParams);
        layoutParams2.width = t100.m186890d(23.0f);
        layoutParams2.height = t100.m186890d(16.0f);
        this.f38682e.setLayoutParams(layoutParams2);
        this.f38683f.setTextSize(9.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m59639j0() {
        m59641l0(this.f38684g, this.f38682e, this.f38685h);
    }

    /* JADX INFO: renamed from: k0 */
    public void m59640k0() {
        SVGAnimationView sVGAnimationView = this.f38684g;
        if (sVGAnimationView != null && !sVGAnimationView.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cc4e37f9-cd92-4916-8280-def38db2ce9a11.so").repeatCount(1).animListener(new C9171a()).into(this.f38684g);
        }
        SVGAnimationView sVGAnimationView2 = this.f38685h;
        if (sVGAnimationView2 != null && !sVGAnimationView2.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/8563c300-b598-4140-8fd5-bc638d5981df10.so").repeatCount(1).animListener(new C9172b()).into(this.f38685h);
        }
        SVGAnimationView sVGAnimationView3 = this.f38682e;
        if (sVGAnimationView3 == null || sVGAnimationView3.isAnimating()) {
            return;
        }
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea2e7057-cacb-4ccd-97a0-f0de165a03d611.so").into(this.f38682e);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m59641l0(SVGAnimationView... sVGAnimationViewArr) {
        for (SVGAnimationView sVGAnimationView : sVGAnimationViewArr) {
            if (sVGAnimationView != null && sVGAnimationView.isAnimating()) {
                sVGAnimationView.stopAnimation(false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m59639j0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59637h0(this);
        mep0.m154301c1(this.f38685h, 0, 0, 0, 0, t100.m186890d(6.0f));
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
