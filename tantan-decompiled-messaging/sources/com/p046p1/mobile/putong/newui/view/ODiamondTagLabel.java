package com.p046p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.p048ui.label.LabelStyle;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p149l.e30;
import p149l.e6c0;
import p149l.mep0;
import p149l.mqi0;
import p149l.qib0;
import p149l.rx40;
import p149l.t100;
import p149l.w2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ODiamondTagLabel extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f54164d;

    /* JADX INFO: renamed from: e */
    public VImage f54165e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f54166f;

    /* JADX INFO: renamed from: g */
    public long f54167g;

    /* JADX INFO: renamed from: h */
    public boolean f54168h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$a */
    public class C13082a extends AnimListener {
        public C13082a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            ODiamondTagLabel.this.f54167g = mqi0.m155944o();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            boolean z = ODiamondTagLabel.this.f54168h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m79163k0();
            } else {
                xdl0.m208345M0(oDiamondTagLabel.f54166f, true);
                xdl0.m208345M0(ODiamondTagLabel.this.f54165e, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$b */
    public class C13083b implements e30<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f54170a;

        public C13083b(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f54170a = sVGARequestBuilder;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            xdl0.m208325C0(oDiamondTagLabel.f54166f, oDiamondTagLabel.f54164d.getHeight());
            xdl0.m208327D0(ODiamondTagLabel.this.f54164d.getWidth(), ODiamondTagLabel.this.f54166f);
            this.f54170a.into(ODiamondTagLabel.this.f54166f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$c */
    public class C13084c extends AnimListener {
        public C13084c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208345M0(ODiamondTagLabel.this.f54166f, false);
            ODiamondTagLabel.this.f54167g = mqi0.m155944o();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            boolean z = ODiamondTagLabel.this.f54168h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m79163k0();
            } else {
                xdl0.m208345M0(oDiamondTagLabel.f54166f, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$d */
    public class C13085d implements e30<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f54173a;

        public C13085d(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f54173a = sVGARequestBuilder;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            xdl0.m208325C0(oDiamondTagLabel.f54166f, oDiamondTagLabel.f54164d.getHeight());
            xdl0.m208327D0(ODiamondTagLabel.this.f54164d.getWidth(), ODiamondTagLabel.this.f54166f);
            this.f54173a.into(ODiamondTagLabel.this.f54166f);
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54168h = false;
        m79161r();
    }

    /* JADX INFO: renamed from: r */
    private void m79161r() {
        LayoutInflater.from(getContext()).inflate(e6c0.f89552k, this);
        m79162j0(this);
        xdl0.m208344M(this.f54165e, true);
        this.f54166f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qib0.f154713b0.f139231b.mo30748bs(getContext(), this, qib0.f154713b0.f139231b.mo30684F0());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79162j0(View view) {
        rx40.m181469a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m79163k0() {
        this.f54168h = true;
        this.f54167g = 0L;
        xdl0.m208345M0(this.f54166f, false);
        this.f54166f.stopAnimation(true);
    }

    /* JADX INFO: renamed from: l0 */
    public void m79164l0() {
        boolean zMo30692I4 = qib0.f154713b0.f139231b.mo30692I4();
        VImage vImage = this.f54165e;
        if (zMo30692I4) {
            vImage.setImageResource(qib0.f154713b0.f139231b.mo30758e9(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(w2c0.f184161Z);
        }
        qib0.f154713b0.f139231b.mo30748bs(getContext(), this, qib0.f154713b0.f139231b.mo30685F2());
    }

    /* JADX INFO: renamed from: m0 */
    public void m79165m0() {
        boolean zMo30692I4 = qib0.f154713b0.f139231b.mo30692I4();
        VImage vImage = this.f54165e;
        if (zMo30692I4) {
            vImage.setImageResource(qib0.f154713b0.f139231b.mo30758e9(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(w2c0.f184163a0);
        }
        qib0.f154713b0.f139231b.mo30748bs(getContext(), this, qib0.f154713b0.f139231b.mo30685F2());
    }

    /* JADX INFO: renamed from: n0 */
    public void m79166n0() {
        this.f54165e.setImageResource(w2c0.f184167c0);
        qib0.f154713b0.f139231b.mo30748bs(getContext(), this, qib0.f154713b0.f139231b.mo30713O1());
    }

    /* JADX INFO: renamed from: o0 */
    public void m79167o0() {
        if (qib0.f154713b0.f139231b.mo30733Wp()) {
            this.f54165e.setImageResource(w2c0.f184157V);
            return;
        }
        boolean zMo30692I4 = qib0.f154713b0.f139231b.mo30692I4();
        VImage vImage = this.f54165e;
        if (zMo30692I4) {
            vImage.setImageResource(qib0.f154713b0.f139231b.mo30754db(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(w2c0.f184171e0);
            m79170r0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79163k0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m79168p0() {
        if (qib0.f154713b0.f139231b.mo30733Wp()) {
            this.f54165e.setImageResource(w2c0.f184158W);
            return;
        }
        boolean zMo30692I4 = qib0.f154713b0.f139231b.mo30692I4();
        VImage vImage = this.f54165e;
        if (zMo30692I4) {
            vImage.setImageResource(qib0.f154713b0.f139231b.mo30754db(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(w2c0.f184173f0);
            m79170r0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m79169q0() {
        if (this.f54166f.isAnimating()) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        if (jM155944o - this.f54167g < 1000) {
            this.f54167g = jM155944o;
            return;
        }
        this.f54168h = false;
        xdl0.m208353Q0(this.f54164d, new C13083b(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/be74791e-f7e3-4190-ba06-4a030b44d5d514.pdf").autoPlay(true).repeatCount(1).animListener(new C13082a())));
    }

    /* JADX INFO: renamed from: r0 */
    public void m79170r0() {
        if (this.f54166f.isAnimating()) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        if (jM155944o - this.f54167g < 1000) {
            this.f54167g = jM155944o;
            return;
        }
        this.f54168h = false;
        xdl0.m208353Q0(this.f54164d, new C13085d(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a2418e95-0e28-4e6c-8be1-fd8fb05a08b911.pdf").autoPlay(true).repeatCount(1).animListener(new C13084c())));
    }

    public void setLargeMode(boolean z) {
        if (qib0.f154713b0.f139231b.mo30733Wp()) {
            this.f54165e.setImageResource(w2c0.f184156U);
            mep0.m154302d1(this.f54166f, t100.f167258g);
            if (z) {
                m79169q0();
                return;
            }
            return;
        }
        boolean zMo30692I4 = qib0.f154713b0.f139231b.mo30692I4();
        VImage vImage = this.f54165e;
        if (zMo30692I4) {
            vImage.setImageResource(qib0.f154713b0.f139231b.mo30754db(LabelStyle.MAX));
        } else {
            vImage.setImageResource(w2c0.f184169d0);
            m79170r0();
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ODiamondTagLabel(@NonNull Context context) {
        this(context, null);
    }
}
