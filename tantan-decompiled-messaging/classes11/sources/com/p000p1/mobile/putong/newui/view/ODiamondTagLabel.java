package com.p000p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.ui.label.LabelStyle;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.e30;
import l.e6c0;
import l.mep0;
import l.qib0;
import l.rx40;
import l.t100;
import l.w2c0;
import l.xdl0;
import p009l.mqi0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ODiamondTagLabel extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f7770d;

    /* JADX INFO: renamed from: e */
    public VImage f7771e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f7772f;

    /* JADX INFO: renamed from: g */
    public long f7773g;

    /* JADX INFO: renamed from: h */
    public boolean f7774h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$a */
    public class C0484a extends AnimListener {
        public C0484a() {
        }

        public void onFinished() {
            ODiamondTagLabel.this.f7773g = mqi0.m18550o();
        }

        public void onStart() {
            boolean z = ODiamondTagLabel.this.f7774h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m9482k0();
            } else {
                xdl0.M0(oDiamondTagLabel.f7772f, true);
                xdl0.M0(ODiamondTagLabel.this.f7771e, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$b */
    public class C0485b implements e30<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f7776a;

        public C0485b(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f7776a = sVGARequestBuilder;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            xdl0.C0(oDiamondTagLabel.f7772f, oDiamondTagLabel.f7770d.getHeight());
            xdl0.D0(ODiamondTagLabel.this.f7770d.getWidth(), new View[]{ODiamondTagLabel.this.f7772f});
            this.f7776a.into(ODiamondTagLabel.this.f7772f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$c */
    public class C0486c extends AnimListener {
        public C0486c() {
        }

        public void onFinished() {
            xdl0.M0(ODiamondTagLabel.this.f7772f, false);
            ODiamondTagLabel.this.f7773g = mqi0.m18550o();
        }

        public void onStart() {
            boolean z = ODiamondTagLabel.this.f7774h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m9482k0();
            } else {
                xdl0.M0(oDiamondTagLabel.f7772f, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$d */
    public class C0487d implements e30<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f7779a;

        public C0487d(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f7779a = sVGARequestBuilder;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            xdl0.C0(oDiamondTagLabel.f7772f, oDiamondTagLabel.f7770d.getHeight());
            xdl0.D0(ODiamondTagLabel.this.f7770d.getWidth(), new View[]{ODiamondTagLabel.this.f7772f});
            this.f7779a.into(ODiamondTagLabel.this.f7772f);
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7774h = false;
        m9480r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m9480r() {
        LayoutInflater.from(getContext()).inflate(e6c0.k, (ViewGroup) this);
        m9481j0(this);
        xdl0.M(this.f7771e, true);
        this.f7772f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qib0.b0.b.bs(getContext(), this, qib0.b0.b.F0());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m9481j0(View view) {
        rx40.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m9482k0() {
        this.f7774h = true;
        this.f7773g = 0L;
        xdl0.M0(this.f7772f, false);
        this.f7772f.stopAnimation(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m9483l0() {
        boolean zI4 = qib0.b0.b.I4();
        VImage vImage = this.f7771e;
        if (zI4) {
            vImage.setImageResource(qib0.b0.b.e9(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(w2c0.Z);
        }
        qib0.b0.b.bs(getContext(), this, qib0.b0.b.F2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public void m9484m0() {
        boolean zI4 = qib0.b0.b.I4();
        VImage vImage = this.f7771e;
        if (zI4) {
            vImage.setImageResource(qib0.b0.b.e9(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(w2c0.a0);
        }
        qib0.b0.b.bs(getContext(), this, qib0.b0.b.F2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m9485n0() {
        this.f7771e.setImageResource(w2c0.c0);
        qib0.b0.b.bs(getContext(), this, qib0.b0.b.O1());
    }

    /* JADX INFO: renamed from: o0 */
    public void m9486o0() {
        if (qib0.b0.b.Wp()) {
            this.f7771e.setImageResource(w2c0.V);
            return;
        }
        boolean zI4 = qib0.b0.b.I4();
        VImage vImage = this.f7771e;
        if (zI4) {
            vImage.setImageResource(qib0.b0.b.db(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(w2c0.e0);
            m9489r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m9482k0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m9487p0() {
        if (qib0.b0.b.Wp()) {
            this.f7771e.setImageResource(w2c0.W);
            return;
        }
        boolean zI4 = qib0.b0.b.I4();
        VImage vImage = this.f7771e;
        if (zI4) {
            vImage.setImageResource(qib0.b0.b.db(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(w2c0.f0);
            m9489r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public void m9488q0() {
        if (this.f7772f.isAnimating()) {
            return;
        }
        long jM18550o = mqi0.m18550o();
        if (jM18550o - this.f7773g < 1000) {
            this.f7773g = jM18550o;
            return;
        }
        this.f7774h = false;
        xdl0.Q0(this.f7770d, new C0485b(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/be74791e-f7e3-4190-ba06-4a030b44d5d514.pdf").autoPlay(true).repeatCount(1).animListener(new C0484a())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public void m9489r0() {
        if (this.f7772f.isAnimating()) {
            return;
        }
        long jM18550o = mqi0.m18550o();
        if (jM18550o - this.f7773g < 1000) {
            this.f7773g = jM18550o;
            return;
        }
        this.f7774h = false;
        xdl0.Q0(this.f7770d, new C0487d(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a2418e95-0e28-4e6c-8be1-fd8fb05a08b911.pdf").autoPlay(true).repeatCount(1).animListener(new C0486c())));
    }

    public void setLargeMode(boolean z) {
        if (qib0.b0.b.Wp()) {
            this.f7771e.setImageResource(w2c0.U);
            mep0.d1(this.f7772f, t100.g);
            if (z) {
                m9488q0();
                return;
            }
            return;
        }
        boolean zI4 = qib0.b0.b.I4();
        VImage vImage = this.f7771e;
        if (zI4) {
            vImage.setImageResource(qib0.b0.b.db(LabelStyle.MAX));
        } else {
            vImage.setImageResource(w2c0.d0);
            m9489r0();
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ODiamondTagLabel(@NonNull Context context) {
        this(context, null);
    }
}
