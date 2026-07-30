package com.p051p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.p053ui.label.LabelStyle;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p153l.bnl0;
import p153l.cbc0;
import p153l.g650;
import p153l.jec0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qnp0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondTagLabel extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f55012d;

    /* JADX INFO: renamed from: e */
    public VImage f55013e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f55014f;

    /* JADX INFO: renamed from: g */
    public long f55015g;

    /* JADX INFO: renamed from: h */
    public boolean f55016h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$a */
    public class C13245a extends AnimListener {
        public C13245a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            ODiamondTagLabel.this.f55015g = pzi0.m174454o();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            boolean z = ODiamondTagLabel.this.f55016h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m80346k0();
            } else {
                bnl0.m105525M0(oDiamondTagLabel.f55014f, true);
                bnl0.m105525M0(ODiamondTagLabel.this.f55013e, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$b */
    public class C13246b implements y20<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f55018a;

        public C13246b(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f55018a = sVGARequestBuilder;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            bnl0.m105505C0(oDiamondTagLabel.f55014f, oDiamondTagLabel.f55012d.getHeight());
            bnl0.m105507D0(ODiamondTagLabel.this.f55012d.getWidth(), ODiamondTagLabel.this.f55014f);
            this.f55018a.into(ODiamondTagLabel.this.f55014f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$c */
    public class C13247c extends AnimListener {
        public C13247c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105525M0(ODiamondTagLabel.this.f55014f, false);
            ODiamondTagLabel.this.f55015g = pzi0.m174454o();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            boolean z = ODiamondTagLabel.this.f55016h;
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            if (z) {
                oDiamondTagLabel.m80346k0();
            } else {
                bnl0.m105525M0(oDiamondTagLabel.f55014f, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.ODiamondTagLabel$d */
    public class C13248d implements y20<int[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGALoader.SVGARequestBuilder f55021a;

        public C13248d(SVGALoader.SVGARequestBuilder sVGARequestBuilder) {
            this.f55021a = sVGARequestBuilder;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(int[] iArr) {
            ODiamondTagLabel oDiamondTagLabel = ODiamondTagLabel.this;
            bnl0.m105505C0(oDiamondTagLabel.f55014f, oDiamondTagLabel.f55012d.getHeight());
            bnl0.m105507D0(ODiamondTagLabel.this.f55012d.getWidth(), ODiamondTagLabel.this.f55014f);
            this.f55021a.into(ODiamondTagLabel.this.f55014f);
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55016h = false;
        m80344r();
    }

    /* JADX INFO: renamed from: r */
    private void m80344r() {
        LayoutInflater.from(getContext()).inflate(jec0.f120465k, this);
        m80345j0(this);
        bnl0.m105524M(this.f55013e, true);
        this.f55014f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        uqb0.f180396b0.f170325b.mo31751bs(getContext(), this, uqb0.f180396b0.f170325b.mo31687F0());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m80345j0(View view) {
        g650.m129090a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m80346k0() {
        this.f55016h = true;
        this.f55015g = 0L;
        bnl0.m105525M0(this.f55014f, false);
        this.f55014f.stopAnimation(true);
    }

    /* JADX INFO: renamed from: l0 */
    public void m80347l0() {
        boolean zMo31695I4 = uqb0.f180396b0.f170325b.mo31695I4();
        VImage vImage = this.f55013e;
        if (zMo31695I4) {
            vImage.setImageResource(uqb0.f180396b0.f170325b.mo31761e9(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(cbc0.f80757Z);
        }
        uqb0.f180396b0.f170325b.mo31751bs(getContext(), this, uqb0.f180396b0.f170325b.mo31688F2());
    }

    /* JADX INFO: renamed from: m0 */
    public void m80348m0() {
        boolean zMo31695I4 = uqb0.f180396b0.f170325b.mo31695I4();
        VImage vImage = this.f55013e;
        if (zMo31695I4) {
            vImage.setImageResource(uqb0.f180396b0.f170325b.mo31761e9(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(cbc0.f80759a0);
        }
        uqb0.f180396b0.f170325b.mo31751bs(getContext(), this, uqb0.f180396b0.f170325b.mo31688F2());
    }

    /* JADX INFO: renamed from: n0 */
    public void m80349n0() {
        this.f55013e.setImageResource(cbc0.f80763c0);
        uqb0.f180396b0.f170325b.mo31751bs(getContext(), this, uqb0.f180396b0.f170325b.mo31716O1());
    }

    /* JADX INFO: renamed from: o0 */
    public void m80350o0() {
        if (uqb0.f180396b0.f170325b.mo31736Wp()) {
            this.f55013e.setImageResource(cbc0.f80753V);
            return;
        }
        boolean zMo31695I4 = uqb0.f180396b0.f170325b.mo31695I4();
        VImage vImage = this.f55013e;
        if (zMo31695I4) {
            vImage.setImageResource(uqb0.f180396b0.f170325b.mo31757db(LabelStyle.MIDDLE));
        } else {
            vImage.setImageResource(cbc0.f80767e0);
            m80353r0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80346k0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m80351p0() {
        if (uqb0.f180396b0.f170325b.mo31736Wp()) {
            this.f55013e.setImageResource(cbc0.f80754W);
            return;
        }
        boolean zMo31695I4 = uqb0.f180396b0.f170325b.mo31695I4();
        VImage vImage = this.f55013e;
        if (zMo31695I4) {
            vImage.setImageResource(uqb0.f180396b0.f170325b.mo31757db(LabelStyle.SMALL));
        } else {
            vImage.setImageResource(cbc0.f80769f0);
            m80353r0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m80352q0() {
        if (this.f55014f.isAnimating()) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        if (jM174454o - this.f55015g < 1000) {
            this.f55015g = jM174454o;
            return;
        }
        this.f55016h = false;
        bnl0.m105533Q0(this.f55012d, new C13246b(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/be74791e-f7e3-4190-ba06-4a030b44d5d514.pdf").autoPlay(true).repeatCount(1).animListener(new C13245a())));
    }

    /* JADX INFO: renamed from: r0 */
    public void m80353r0() {
        if (this.f55014f.isAnimating()) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        if (jM174454o - this.f55015g < 1000) {
            this.f55015g = jM174454o;
            return;
        }
        this.f55016h = false;
        bnl0.m105533Q0(this.f55012d, new C13248d(SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a2418e95-0e28-4e6c-8be1-fd8fb05a08b911.pdf").autoPlay(true).repeatCount(1).animListener(new C13247c())));
    }

    public void setLargeMode(boolean z) {
        if (uqb0.f180396b0.f170325b.mo31736Wp()) {
            this.f55013e.setImageResource(cbc0.f80752U);
            qnp0.m177261d1(this.f55014f, qa00.f156320g);
            if (z) {
                m80352q0();
                return;
            }
            return;
        }
        boolean zMo31695I4 = uqb0.f180396b0.f170325b.mo31695I4();
        VImage vImage = this.f55013e;
        if (zMo31695I4) {
            vImage.setImageResource(uqb0.f180396b0.f170325b.mo31757db(LabelStyle.MAX));
        } else {
            vImage.setImageResource(cbc0.f80765d0);
            m80353r0();
        }
    }

    public ODiamondTagLabel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ODiamondTagLabel(@NonNull Context context) {
        this(context, null);
    }
}
