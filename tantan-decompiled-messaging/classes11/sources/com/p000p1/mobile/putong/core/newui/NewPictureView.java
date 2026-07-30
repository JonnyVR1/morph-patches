package com.p000p1.mobile.putong.core.newui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.NewPictureView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.e30;
import l.fce;
import l.ffx;
import l.ikh0;
import l.lsi0;
import l.mkd0;
import l.o7m;
import l.q140;
import l.qib0;
import l.r3l0;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s5l0;
import l.t100;
import l.u4c0;
import l.w0c0;
import l.x1l0;
import l.x2c0;
import l.xdl0;
import l.xij0;
import p009l.fyx;
import p009l.yni;
import rx.c;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VImage;
import v.VProgressBar;
import v.VText;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.b, o7m {

    /* JADX INFO: renamed from: A */
    public a<Boolean> f0A;

    /* JADX INFO: renamed from: B */
    public boolean f1B;

    /* JADX INFO: renamed from: C */
    public e30<Boolean> f2C;

    /* JADX INFO: renamed from: D */
    public int f3D;

    /* JADX INFO: renamed from: E */
    public float f4E;

    /* JADX INFO: renamed from: F */
    public int f5F;

    /* JADX INFO: renamed from: G */
    public float f6G;

    /* JADX INFO: renamed from: a */
    public VDraweeView f7a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f8b;

    /* JADX INFO: renamed from: c */
    public ImageView f9c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f10d;

    /* JADX INFO: renamed from: e */
    public ImageView f11e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f12f;

    /* JADX INFO: renamed from: g */
    public VText f13g;

    /* JADX INFO: renamed from: h */
    public VText f14h;

    /* JADX INFO: renamed from: i */
    public VImage f15i;

    /* JADX INFO: renamed from: j */
    public VText f16j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f17k;

    /* JADX INFO: renamed from: l */
    public VText f18l;

    /* JADX INFO: renamed from: m */
    public VImage f19m;

    /* JADX INFO: renamed from: n */
    public VTexturePlayer f20n;

    /* JADX INFO: renamed from: o */
    public VTexturePlayer.b f21o;

    /* JADX INFO: renamed from: p */
    public Media f22p;

    /* JADX INFO: renamed from: q */
    public boolean f23q;

    /* JADX INFO: renamed from: r */
    public boolean f24r;

    /* JADX INFO: renamed from: s */
    public boolean f25s;

    /* JADX INFO: renamed from: t */
    public String f26t;

    /* JADX INFO: renamed from: u */
    public String f27u;

    /* JADX INFO: renamed from: v */
    public long f28v;

    /* JADX INFO: renamed from: w */
    public long f29w;

    /* JADX INFO: renamed from: x */
    public float f30x;

    /* JADX INFO: renamed from: y */
    public boolean f31y;

    /* JADX INFO: renamed from: z */
    public a<roj0> f32z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.NewPictureView$a */
    public class C0000a implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f33a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34b;

        public C0000a(String str, int i) {
            this.f33a = str;
            this.f34b = i;
        }

        /* JADX INFO: renamed from: O */
        public void m26O() {
            NewPictureView.this.f28v = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public void m27a() {
            fyx.m14674c(NewPictureView.this.f29w, System.currentTimeMillis(), this.f33a, this.f34b);
        }

        /* JADX INFO: renamed from: b */
        public void m28b(int i, int i2) {
            fyx.m14676e(i, i2, !Network.isConnected(CoreModule.b), this.f33a, this.f34b);
        }

        /* JADX INFO: renamed from: c */
        public void m29c(long j) {
            if (NewPictureView.this.f28v == -1 || !NullChecker.a(NewPictureView.this.f22p)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - NewPictureView.this.f28v >= 200) {
                TrackMediaUploadUtil.m10661h0(jCurrentTimeMillis - NewPictureView.this.f28v, NewPictureView.this.f27u, this.f33a);
                fyx.m14673b(NewPictureView.this.f28v, jCurrentTimeMillis, this.f33a, this.f34b);
            }
            NewPictureView.this.f28v = -1L;
        }
    }

    public NewPictureView(Context context) {
        super(context);
        this.f26t = "";
        this.f28v = -1L;
        this.f29w = -1L;
        this.f32z = a.b();
        this.f0A = a.c(Boolean.FALSE);
        this.f1B = false;
        this.f2C = new e30() { // from class: l.k140
            public final void call(Object obj) {
                this.f15383a.m11u((Boolean) obj);
            }
        };
        this.f3D = u4c0.oa;
        this.f4E = 0.2f;
        this.f5F = 2000;
        this.f6G = -1.0f;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2e(Object obj) {
        if (Network.isConnected(CoreModule.b)) {
            return;
        }
        lsi0.i(R.string.p4, true);
    }

    /* JADX INFO: renamed from: o */
    private Act m10o() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m11u(Boolean bool) {
        this.f0A.onNext(bool);
        yni.m25482n(TabName.Card);
    }

    /* JADX INFO: renamed from: b */
    public void m12b(boolean z) {
        if (z) {
            m17q(true);
        } else {
            m23x();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13d() {
        this.f8b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.a(this.f20n) && this.f20n.getAlpha() != 0.0f) {
            this.f20n.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m16p(u4c0.oa);
        if (NullChecker.a(this.f21o)) {
            this.f21o.d();
        }
    }

    public String getFrom() {
        return this.f27u;
    }

    public Bitmap getPictureBitmap() {
        if (this.f7a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f7a.getDrawable()).getBitmap();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m14h() {
        m16p(u4c0.D7);
        if (NullChecker.a(this.f21o)) {
            this.f21o.h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15n(View view) {
        q140.a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = this.f3D;
        if (i == u4c0.oa) {
            m25z();
        } else if (i == u4c0.r9) {
            m23x();
        } else if (i == u4c0.D7) {
            m23x();
        }
    }

    public void onComplete() {
        boolean zD0 = xij0.d0();
        VTexturePlayer vTexturePlayer = this.f20n;
        if (zD0) {
            vTexturePlayer.v();
            onPause();
            if (NullChecker.a(this.f21o)) {
                this.f21o.onComplete();
            }
            m25z();
            return;
        }
        vTexturePlayer.v();
        this.f8b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f20n.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.p140
            @Override // java.lang.Runnable
            public final void run() {
                this.f18313a.m21v();
            }
        }, 400L);
        if (NullChecker.a(this.f21o)) {
            this.f21o.onComplete();
        }
    }

    public void onError(int i, int i2) {
        CrashHelper.d(new Throwable("NewPictureView play video error " + this.f23q + " " + i + " " + i2), 100);
        if (NullChecker.a(this.f21o)) {
            this.f21o.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m15n(this);
        this.f8b.setOnClickListener(this);
        Drawable drawable = getResources().getDrawable(x2c0.I2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f14h.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f14h.setBackgroundDrawable(fce.b(m10o().color(w0c0.D1), t100.d(8.0f)));
        this.f13g.setBackgroundDrawable(fce.b(m10o().color(w0c0.C1), t100.d(8.0f)));
        this.f16j.setBackgroundDrawable(fce.b(m10o().color(w0c0.B1), t100.d(12.0f)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f24r) {
            int iA = ikh0.a(i, i2);
            super.onMeasure(iA, iA);
            return;
        }
        if (!this.f31y || !NullChecker.a(this.f22p)) {
            if (this.f30x <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            int iD = ffx.d(i);
            super.onMeasure(ffx.b(iD), ffx.b((int) (iD / this.f30x)));
            return;
        }
        int iD2 = ffx.d(i);
        int iD3 = ffx.d(i2);
        int i3 = (int) (((iD2 * 1.0f) / this.f22p.cover().size.width) * this.f22p.cover().size.height);
        if (i3 <= iD3) {
            super.onMeasure(ffx.b(iD2), ffx.b(i3));
        } else {
            super.onMeasure(ffx.b((int) (((iD3 * 1.0f) / this.f22p.cover().size.height) * this.f22p.cover().size.width)), ffx.b(iD3));
        }
    }

    public void onPause() {
        this.f20n.setVisibility(4);
        m16p(u4c0.oa);
        if (NullChecker.a(this.f21o)) {
            this.f21o.onPause();
        }
    }

    public void onResume() {
        this.f8b.animate().alpha(this.f4E).setDuration(this.f5F).start();
        m16p(u4c0.r9);
        if (NullChecker.a(this.f21o)) {
            this.f21o.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f6G = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m16p(int i) {
        this.f3D = i;
        for (int i2 = 0; i2 < this.f8b.getChildCount(); i2++) {
            int id = this.f8b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f8b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m17q(boolean z) {
        m18r(z);
        qib0.G.o(this.f7a);
        this.f7a.setVisibility(0);
    }

    /* JADX INFO: renamed from: r */
    public void m18r(boolean z) {
        this.f25s = false;
        if (NullChecker.a(this.f20n)) {
            this.f20n.i(z);
            this.f20n.animate().cancel();
            this.f20n.setAlpha(0.0f);
            this.f20n.setVisibility(4);
            removeView(this.f20n);
            this.f20n = null;
        }
        m16p(u4c0.oa);
        this.f8b.animate().cancel();
        this.f8b.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: s */
    public final void m19s() {
        if (this.f20n == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f20n = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f20n.k(true);
            this.f20n.setId(u4c0.Wd);
            FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            if (getMeasuredHeight() > 0) {
                this.f20n.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f20n.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f20n, 1, layoutParamsGenerateDefaultLayoutParams, true);
        }
    }

    public void setAdjustAspectRateByPictureSize(boolean z) {
        this.f31y = z;
    }

    public void setAspectRateFitWidth(float f) {
        this.f30x = f;
    }

    public void setFrom(String str) {
        this.f27u = str;
    }

    public void setPlayerListener(VTexturePlayer.b bVar) {
        this.f21o = bVar;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.b(this.f8b) && this.f8b.getVisibility() == 0 && f > 0.0f) {
            this.f8b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.b(this.f8b) && this.f8b.getVisibility() == 0 && f > 0.0f) {
            this.f8b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public final float m20t(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m21v() {
        if (NullChecker.a(this.f20n)) {
            this.f20n.v();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m22w(String str, int i, Integer num) {
        fyx.m14675d(this.f29w, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: x */
    public void m23x() {
        this.f25s = false;
        if (NullChecker.a(this.f20n)) {
            this.f8b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f20n.r();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m24y() {
        this.f20n.setVisibility(0);
        if (this.f20n.getAlpha() < 1.0f) {
            this.f20n.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f8b.animate().alpha(this.f4E).setDuration(this.f5F).setInterpolator(new LinearInterpolator()).start();
        m16p(u4c0.r9);
        if (NullChecker.a(this.f21o)) {
            this.f21o.y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m25z() {
        this.f32z.onNext(roj0.a);
        this.f25s = true;
        this.f8b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f22p;
        if (media instanceof Video) {
            Video videoClone = (Video) media;
            m19s();
            if (videoClone.size == null && TEnum.equals(((Media) videoClone).status, "raw")) {
                videoClone = videoClone.clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(((Media) videoClone).url)), this.f24r, false);
                ((Media) videoClone).mediaType = "video/mp4";
                videoClone.size = new Dimension(s5l0Var.m());
                videoClone.duration = s5l0Var.b;
            }
            float fM20t = m20t(videoClone);
            final String square = this.f24r ? videoClone.formatSquare() : videoClone.formatAspectRatio();
            boolean zC = r3l0.c();
            this.f29w = System.currentTimeMillis();
            final int i = fyx.f13233a;
            this.f20n.setIsInABGroup(zC);
            this.f20n.setNetErrorListener(new e30() { // from class: l.l140
                public final void call(Object obj) {
                    NewPictureView.m2e(obj);
                }
            });
            this.f20n.w((VTexturePlayer.a) null, c.fromCallable(new Callable() { // from class: l.m140
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.n().u(square));
                }
            }).compose(mkd0.C()), videoClone.duration);
            this.f20n.setOnBufferListener(new C0000a(square, i));
            this.f20n.s(Uri.parse(qib0.d0(square)), fM20t, square, (zC || !((Media) videoClone).url.startsWith("http") || Network.isConnected(CoreModule.b)) ? false : true, R.string.p4, R.string.Yj);
            x1l0.n().q(square).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.n140
                public final void call(Object obj) {
                    this.f17179a.m22w(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.o140
                public final void call(Object obj) {
                    NewPictureView.m1c((Throwable) obj);
                }
            }));
        }
    }

    public NewPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26t = "";
        this.f28v = -1L;
        this.f29w = -1L;
        this.f32z = a.b();
        this.f0A = a.c(Boolean.FALSE);
        this.f1B = false;
        this.f2C = new e30() { // from class: l.k140
            public final void call(Object obj) {
                this.f15383a.m11u((Boolean) obj);
            }
        };
        this.f3D = u4c0.oa;
        this.f4E = 0.2f;
        this.f5F = 2000;
        this.f6G = -1.0f;
    }

    public NewPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26t = "";
        this.f28v = -1L;
        this.f29w = -1L;
        this.f32z = a.b();
        this.f0A = a.c(Boolean.FALSE);
        this.f1B = false;
        this.f2C = new e30() { // from class: l.k140
            public final void call(Object obj) {
                this.f15383a.m11u((Boolean) obj);
            }
        };
        this.f3D = u4c0.oa;
        this.f4E = 0.2f;
        this.f5F = 2000;
        this.f6G = -1.0f;
    }
}
