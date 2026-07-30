package com.p051p1.mobile.putong.core.view.diamond;

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
import p153l.bnl0;
import p153l.qa00;
import p153l.qnp0;
import p153l.z33;

/* JADX INFO: loaded from: classes12.dex */
public class BlackDiamondTagView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f39529d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f39530e;

    /* JADX INFO: renamed from: f */
    public TextView f39531f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f39532g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f39533h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$a */
    public class C9334a extends AnimListener {
        public C9334a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105524M(BlackDiamondTagView.this.f39532g, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            bnl0.m105524M(BlackDiamondTagView.this.f39532g, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView$b */
    public class C9335b extends AnimListener {
        public C9335b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105524M(BlackDiamondTagView.this.f39533h, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            bnl0.m105524M(BlackDiamondTagView.this.f39533h, true);
        }
    }

    public BlackDiamondTagView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m60821h0(View view) {
        z33.m218467a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m60822i0(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f39532g.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f39530e.getLayoutParams();
        if (z) {
            layoutParams.width = qa00.m175859d(28.0f);
            layoutParams.height = qa00.m175859d(20.0f);
            this.f39532g.setLayoutParams(layoutParams);
            layoutParams2.width = qa00.m175859d(28.0f);
            layoutParams2.height = qa00.m175859d(20.0f);
            this.f39530e.setLayoutParams(layoutParams2);
            this.f39531f.setTextSize(12.0f);
            return;
        }
        layoutParams.width = qa00.m175859d(23.0f);
        layoutParams.height = qa00.m175859d(16.0f);
        this.f39532g.setLayoutParams(layoutParams);
        layoutParams2.width = qa00.m175859d(23.0f);
        layoutParams2.height = qa00.m175859d(16.0f);
        this.f39530e.setLayoutParams(layoutParams2);
        this.f39531f.setTextSize(9.0f);
    }

    /* JADX INFO: renamed from: j0 */
    public void m60823j0() {
        m60825l0(this.f39532g, this.f39530e, this.f39533h);
    }

    /* JADX INFO: renamed from: k0 */
    public void m60824k0() {
        SVGAnimationView sVGAnimationView = this.f39532g;
        if (sVGAnimationView != null && !sVGAnimationView.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/cc4e37f9-cd92-4916-8280-def38db2ce9a11.so").repeatCount(1).animListener(new C9334a()).into(this.f39532g);
        }
        SVGAnimationView sVGAnimationView2 = this.f39533h;
        if (sVGAnimationView2 != null && !sVGAnimationView2.isAnimating()) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/8563c300-b598-4140-8fd5-bc638d5981df10.so").repeatCount(1).animListener(new C9335b()).into(this.f39533h);
        }
        SVGAnimationView sVGAnimationView3 = this.f39530e;
        if (sVGAnimationView3 == null || sVGAnimationView3.isAnimating()) {
            return;
        }
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea2e7057-cacb-4ccd-97a0-f0de165a03d611.so").into(this.f39530e);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m60825l0(SVGAnimationView... sVGAnimationViewArr) {
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
        m60823j0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60821h0(this);
        qnp0.m177260c1(this.f39533h, 0, 0, 0, 0, qa00.m175859d(6.0f));
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BlackDiamondTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
