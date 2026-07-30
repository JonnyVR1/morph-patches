package com.p000p1.mobile.putong.feed.p005ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.p005ui.PictureView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.c4g0;
import l.e30;
import l.fce;
import l.ffx;
import l.fyx;
import l.ikh0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ngm;
import l.qib0;
import l.qkq0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.t100;
import l.x1l0;
import l.xdl0;
import l.ym2;
import l.yni;
import p007l.ai70;
import p007l.b5c0;
import p007l.e1c0;
import p007l.kjb0;
import p007l.u2h;
import rx.c;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VImage;
import v.VProgressBar;
import v.VText;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.b {

    /* JADX INFO: renamed from: C */
    public static long f5023C;

    /* JADX INFO: renamed from: A */
    public int f5024A;

    /* JADX INFO: renamed from: B */
    public float f5025B;

    /* JADX INFO: renamed from: a */
    public VDraweeView f5026a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f5027b;

    /* JADX INFO: renamed from: c */
    public ImageView f5028c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f5029d;

    /* JADX INFO: renamed from: e */
    public ImageView f5030e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f5031f;

    /* JADX INFO: renamed from: g */
    public VText f5032g;

    /* JADX INFO: renamed from: h */
    public VImage f5033h;

    /* JADX INFO: renamed from: i */
    public VText f5034i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f5035j;

    /* JADX INFO: renamed from: k */
    public VTexturePlayer.b f5036k;

    /* JADX INFO: renamed from: l */
    public Media f5037l;

    /* JADX INFO: renamed from: m */
    public boolean f5038m;

    /* JADX INFO: renamed from: n */
    public boolean f5039n;

    /* JADX INFO: renamed from: o */
    public boolean f5040o;

    /* JADX INFO: renamed from: p */
    public boolean f5041p;

    /* JADX INFO: renamed from: q */
    public int f5042q;

    /* JADX INFO: renamed from: r */
    public String f5043r;

    /* JADX INFO: renamed from: s */
    public long f5044s;

    /* JADX INFO: renamed from: t */
    public long f5045t;

    /* JADX INFO: renamed from: u */
    public boolean f5046u;

    /* JADX INFO: renamed from: v */
    public c4g0 f5047v;

    /* JADX INFO: renamed from: w */
    public a<Boolean> f5048w;

    /* JADX INFO: renamed from: x */
    public e30<Boolean> f5049x;

    /* JADX INFO: renamed from: y */
    public int f5050y;

    /* JADX INFO: renamed from: z */
    public float f5051z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$a */
    public class C2242a extends ym2 {
        public C2242a() {
        }

        /* JADX INFO: renamed from: c */
        public void m7718c(String str, Throwable th) {
            super.c(str, th);
            PictureView.this.f5049x.call(Boolean.FALSE);
        }

        /* JADX INFO: renamed from: h */
        public void m7719h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            PictureView.this.f5049x.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$b */
    public class C2243b implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5054b;

        public C2243b(String str, int i) {
            this.f5053a = str;
            this.f5054b = i;
        }

        /* JADX INFO: renamed from: O */
        public void m7720O() {
            PictureView.this.f5045t = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public void m7721a() {
            fyx.c(PictureView.this.f5044s, System.currentTimeMillis(), this.f5053a, this.f5054b);
        }

        /* JADX INFO: renamed from: b */
        public void m7722b(int i, int i2) {
            fyx.e(i, i2, !Network.isConnected(FeedModule.f313a), this.f5053a, this.f5054b);
        }

        /* JADX INFO: renamed from: c */
        public void m7723c(long j) {
            if (PictureView.this.f5045t == -1 || !NullChecker.b(PictureView.this.f5037l)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PictureView.this.f5045t >= 200) {
                TrackMediaUploadUtil.h0(jCurrentTimeMillis - PictureView.this.f5045t, PictureView.this.f5038m ? "profile" : PictureView.this.f5043r, this.f5053a);
                fyx.b(PictureView.this.f5045t, jCurrentTimeMillis, this.f5053a, this.f5054b);
            }
            PictureView.this.f5045t = -1L;
        }
    }

    public PictureView(Context context) {
        super(context);
        this.f5042q = -1;
        this.f5044s = -1L;
        this.f5045t = -1L;
        this.f5048w = a.c(Boolean.FALSE);
        this.f5049x = new e30() { // from class: l.nh70
            public final void call(Object obj) {
                this.f10806a.m7705z((Boolean) obj);
            }
        };
        this.f5050y = b5c0.f6083q1;
        this.f5051z = 0.2f;
        this.f5024A = 2000;
        this.f5025B = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m7686A() {
        if (NullChecker.a(this.f5035j)) {
            this.f5035j.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m7687C(String str, int i, Integer num) {
        fyx.d(this.f5044s, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7688a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7689b(Object obj) {
        if (Network.isConnected(FeedModule.f313a)) {
            return;
        }
        lsi0.n(R$string.f442U);
    }

    /* JADX INFO: renamed from: p */
    private Act m7700p() {
        return getContext();
    }

    /* JADX INFO: renamed from: q */
    private void m7701q(int i) {
        this.f5050y = i;
        for (int i2 = 0; i2 < this.f5027b.getChildCount(); i2++) {
            int id = this.f5027b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f5027b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m7702s() {
        if (this.f5035j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f5035j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f5035j.setId(b5c0.f5997R1);
            if (getMeasuredHeight() > 0) {
                this.f5035j.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f5035j.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f5035j, 1, generateDefaultLayoutParams(), true);
            this.f5035j.getLayoutParams().height = -1;
            this.f5035j.getLayoutParams().width = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: t */
    private float m7703t(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.b(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(picture) || !NullChecker.a(picture.size)) {
                    dimension = null;
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = null;
                    }
                }
            }
        } else if (NullChecker.a(picture)) {
            dimension = null;
        } else {
            dimension = null;
        }
        if (NullChecker.a(dimension)) {
            return dimension.height / dimension.width;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m7704x() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f5023C;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f5023C = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m7705z(Boolean bool) {
        yni.n(TabName.Moment);
        this.f5048w.onNext(bool);
    }

    /* JADX INFO: renamed from: D */
    public void m7706D() {
        this.f5041p = false;
        if (NullChecker.a(this.f5035j)) {
            this.f5027b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f5035j.r();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m7707E() {
        this.f5041p = true;
        this.f5027b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f5037l;
        if (media instanceof Video) {
            Video videoMo17714clone = (Video) media;
            m7702s();
            if (videoMo17714clone.size == null && TEnum.equals(videoMo17714clone.status, MediaLocalStatus.raw)) {
                videoMo17714clone = videoMo17714clone.mo17714clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(videoMo17714clone.url)), this.f5039n, false);
                videoMo17714clone.mediaType = "video/mp4";
                videoMo17714clone.size = new Dimension(s5l0Var.m());
                videoMo17714clone.duration = s5l0Var.b;
            }
            float fM7703t = m7703t(videoMo17714clone);
            final String square = this.f5039n ? videoMo17714clone.formatSquare() : videoMo17714clone.formatAspectRatio();
            u2h.m14720e();
            this.f5044s = System.currentTimeMillis();
            final int i = fyx.a;
            boolean zM14720e = u2h.m14720e();
            this.f5035j.setIsInABGroup(zM14720e);
            this.f5035j.setOnBufferListener(new C2243b(square, i));
            this.f5035j.setNetErrorListener(new e30() { // from class: l.ph70
                public final void call(Object obj) {
                    PictureView.m7689b(obj);
                }
            });
            this.f5035j.w((VTexturePlayer.a) null, c.fromCallable(new Callable() { // from class: l.rh70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.n().u(square));
                }
            }).compose(mkd0.C()), videoMo17714clone.duration);
            this.f5035j.s(Uri.parse(qib0.d0(square)), fM7703t, square, (zM14720e || !videoMo17714clone.url.startsWith("http") || Network.isConnected(FeedModule.f313a)) ? false : true, R$string.f442U, R$string.f327A4);
            x1l0.n().q(square).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.th70
                public final void call(Object obj) {
                    this.f13300a.m7687C(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.vh70
                public final void call(Object obj) {
                    PictureView.m7688a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m7708F(Media media) {
        m7709G(media, -1);
    }

    /* JADX INFO: renamed from: G */
    public void m7709G(Media media, int i) {
        Picture.ImageUri imageUriProfileBig;
        this.f5042q = i;
        if (!media.equals(this.f5037l) && NullChecker.a(this.f5035j)) {
            this.f5035j.setVisibility(4);
            this.f5035j.i(false);
        }
        this.f5037l = media;
        if (!TEnum.equals(media.status, MediaLocalStatus.raw)) {
            boolean z = media instanceof Video;
            if (!z || this.f5038m) {
                imageUriProfileBig = this.f5038m ? this.f5037l.cover().profileBig() : null;
            } else {
                imageUriProfileBig = media.cover().aspectRatioBiggest();
            }
            if (imageUriProfileBig == null) {
                qkq0.a("not supported yet");
                return;
            } else if (i < 0 || i >= 100) {
                if (!z) {
                    boolean z2 = this.f5038m;
                }
                qib0.G.F0(this.f5026a, imageUriProfileBig, this.f5043r, new C2242a());
            } else {
                j760<Integer, Integer> j760VarM11471w = kjb0.m11471w(i);
                qib0.G.O(this.f5026a, imageUriProfileBig.formatted(), ((Integer) j760VarM11471w.a).intValue(), ((Integer) j760VarM11471w.b).intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                qkq0.a("not supported yet");
                return;
            }
            qib0.G.k0(this.f5026a, media.url);
        }
        boolean z3 = media instanceof Video;
        VFrame_ColorFilter vFrame_ColorFilter = this.f5027b;
        if (z3) {
            vFrame_ColorFilter.setVisibility(0);
        } else {
            vFrame_ColorFilter.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7710d() {
        this.f5027b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.a(this.f5035j) && this.f5035j.getAlpha() != 0.0f) {
            this.f5035j.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m7701q(b5c0.f6083q1);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.d();
        }
    }

    public String getFrom() {
        return this.f5043r;
    }

    public Bitmap getPictureBitmap() {
        if (this.f5026a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f5026a.getDrawable()).getBitmap();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m7711h() {
        m7701q(b5c0.f5966H0);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7712o(View view) {
        ai70.m8561a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m7704x()) {
            return;
        }
        int i = this.f5042q;
        if (i < 0 || i >= 100) {
            int i2 = this.f5050y;
            if (i2 == b5c0.f6083q1) {
                m7707E();
            } else if (i2 == b5c0.f6056i1) {
                m7706D();
            } else if (i2 == b5c0.f5966H0) {
                m7706D();
            }
        }
    }

    public void onComplete() {
        this.f5035j.v();
        this.f5027b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f5035j.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.xh70
            @Override // java.lang.Runnable
            public final void run() {
                this.f14897a.m7686A();
            }
        }, 400L);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.onComplete();
        }
    }

    public void onError(int i, int i2) {
        CrashHelper.d(new Throwable("play video error " + this.f5038m + " " + i + " " + i2), 100);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7712o(this);
        this.f5027b.setOnClickListener(this);
        if (NullChecker.a(this.f5032g)) {
            this.f5032g.setBackgroundDrawable(fce.b(m7700p().color(e1c0.f7139f0), t100.d(6.0f)));
        }
        if (NullChecker.a(this.f5033h)) {
            this.f5033h.setBackgroundDrawable(fce.b(m7700p().color(e1c0.f7139f0), t100.d(6.0f)));
        }
        if (NullChecker.a(this.f5034i)) {
            this.f5034i.setBackgroundDrawable(fce.b(m7700p().color(e1c0.f7139f0), t100.d(6.0f)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f5039n) {
            int iA = ikh0.a(i, i2);
            super.onMeasure(iA, iA);
        } else if (this.f5040o) {
            super.onMeasure(ffx.b(ffx.d(i)), ffx.b(ffx.d(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onPause() {
        m7701q(b5c0.f6083q1);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.onPause();
        }
    }

    public void onResume() {
        this.f5027b.animate().alpha(this.f5051z).setDuration(this.f5024A).start();
        m7701q(b5c0.f6056i1);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f5025B = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: r */
    public void m7713r(boolean z) {
        this.f5041p = false;
        if (NullChecker.a(this.f5035j)) {
            this.f5035j.i(z);
            this.f5035j.animate().cancel();
            this.f5035j.setAlpha(0.0f);
            this.f5035j.setVisibility(4);
        }
        qib0.G.o(this.f5026a);
        this.f5026a.setVisibility(0);
        m7701q(b5c0.f6083q1);
        this.f5027b.animate().cancel();
        this.f5027b.setAlpha(1.0f);
        this.f5035j = null;
        if (this.f5046u) {
            mkd0.z(this.f5047v);
            this.f5046u = false;
        }
    }

    public void setFrom(String str) {
        this.f5043r = str;
    }

    public void setPlayerListener(VTexturePlayer.b bVar) {
        this.f5036k = bVar;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.a(this.f5031f) && this.f5031f.getVisibility() == 0) {
            float f2 = -this.f5031f.getLeft();
            if (this.f5031f.getPivotX() != f2) {
                this.f5031f.setPivotX(f2);
            }
            this.f5031f.setScaleX(1.0f / f);
        }
        if (NullChecker.a(this.f5034i) && this.f5034i.getVisibility() == 0) {
            float width = getWidth() - this.f5034i.getLeft();
            if (this.f5034i.getPivotX() != width) {
                this.f5034i.setPivotX(width);
            }
            this.f5034i.setScaleX(1.0f / f);
        }
        if (NullChecker.a(this.f5027b) && this.f5027b.getVisibility() == 0) {
            float f3 = -this.f5027b.getLeft();
            if (this.f5027b.getPivotX() != f3) {
                this.f5027b.setPivotX(f3);
            }
            this.f5027b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.a(this.f5031f) && this.f5031f.getVisibility() == 0) {
            float height = this.f5031f.getHeight() - this.f5031f.getBottom();
            if (this.f5031f.getPivotY() != height) {
                this.f5031f.setPivotY(height);
            }
            this.f5031f.setScaleY(1.0f / f);
        }
        if (NullChecker.a(this.f5034i) && this.f5034i.getVisibility() == 0) {
            float height2 = this.f5034i.getHeight() - this.f5034i.getBottom();
            if (this.f5034i.getPivotY() != height2) {
                this.f5034i.setPivotY(height2);
            }
            this.f5034i.setScaleY(1.0f / f);
        }
        if (NullChecker.a(this.f5027b) && this.f5027b.getVisibility() == 0) {
            float height3 = getHeight() - this.f5027b.getTop();
            if (this.f5027b.getPivotY() != height3) {
                this.f5027b.setPivotY(height3);
            }
            this.f5027b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    public void setTopRadius(float f) {
        if (this.f5026a.getHierarchy() == null || this.f5026a.getHierarchy().p() == null) {
            return;
        }
        RoundingParams roundingParamsP = this.f5026a.getHierarchy().p();
        roundingParamsP.r(f, f, 0.0f, 0.0f);
        this.f5026a.getHierarchy().H(roundingParamsP);
    }

    /* JADX INFO: renamed from: u */
    public void m7714u(boolean z) {
        m7715v(z, z);
    }

    /* JADX INFO: renamed from: v */
    public void m7715v(boolean z, boolean z2) {
        m7716w(z, z2, false);
    }

    /* JADX INFO: renamed from: w */
    public void m7716w(boolean z, boolean z2, boolean z3) {
        this.f5038m = z;
        this.f5039n = z2;
        this.f5040o = z3;
    }

    /* JADX INFO: renamed from: y */
    public void m7717y() {
        this.f5035j.setVisibility(0);
        if (this.f5035j.getAlpha() < 1.0f) {
            this.f5035j.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f5027b.animate().alpha(this.f5051z).setDuration(this.f5024A).setInterpolator(new LinearInterpolator()).start();
        m7701q(b5c0.f6056i1);
        if (NullChecker.a(this.f5036k)) {
            this.f5036k.y();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5042q = -1;
        this.f5044s = -1L;
        this.f5045t = -1L;
        this.f5048w = a.c(Boolean.FALSE);
        this.f5049x = new e30() { // from class: l.nh70
            public final void call(Object obj) {
                this.f10806a.m7705z((Boolean) obj);
            }
        };
        this.f5050y = b5c0.f6083q1;
        this.f5051z = 0.2f;
        this.f5024A = 2000;
        this.f5025B = -1.0f;
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5042q = -1;
        this.f5044s = -1L;
        this.f5045t = -1L;
        this.f5048w = a.c(Boolean.FALSE);
        this.f5049x = new e30() { // from class: l.nh70
            public final void call(Object obj) {
                this.f10806a.m7705z((Boolean) obj);
            }
        };
        this.f5050y = b5c0.f6083q1;
        this.f5051z = 0.2f;
        this.f5024A = 2000;
        this.f5025B = -1.0f;
    }
}
