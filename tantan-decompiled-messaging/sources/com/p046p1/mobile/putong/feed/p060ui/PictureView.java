package com.p046p1.mobile.putong.feed.p060ui;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.p060ui.PictureView;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VTexturePlayer;
import p149l.ai70;
import p149l.b5c0;
import p149l.c4g0;
import p149l.e1c0;
import p149l.e30;
import p149l.fce;
import p149l.ffx;
import p149l.fyx;
import p149l.ikh0;
import p149l.j760;
import p149l.kjb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ngm;
import p149l.qib0;
import p149l.qkq0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.t100;
import p149l.u2h;
import p149l.x1l0;
import p149l.xdl0;
import p149l.ym2;
import p149l.yni;

/* JADX INFO: loaded from: classes12.dex */
public class PictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22583b {

    /* JADX INFO: renamed from: C */
    public static long f43562C;

    /* JADX INFO: renamed from: A */
    public int f43563A;

    /* JADX INFO: renamed from: B */
    public float f43564B;

    /* JADX INFO: renamed from: a */
    public VDraweeView f43565a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f43566b;

    /* JADX INFO: renamed from: c */
    public ImageView f43567c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f43568d;

    /* JADX INFO: renamed from: e */
    public ImageView f43569e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f43570f;

    /* JADX INFO: renamed from: g */
    public VText f43571g;

    /* JADX INFO: renamed from: h */
    public VImage f43572h;

    /* JADX INFO: renamed from: i */
    public VText f43573i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f43574j;

    /* JADX INFO: renamed from: k */
    public VTexturePlayer.InterfaceC22583b f43575k;

    /* JADX INFO: renamed from: l */
    public Media f43576l;

    /* JADX INFO: renamed from: m */
    public boolean f43577m;

    /* JADX INFO: renamed from: n */
    public boolean f43578n;

    /* JADX INFO: renamed from: o */
    public boolean f43579o;

    /* JADX INFO: renamed from: p */
    public boolean f43580p;

    /* JADX INFO: renamed from: q */
    public int f43581q;

    /* JADX INFO: renamed from: r */
    public String f43582r;

    /* JADX INFO: renamed from: s */
    public long f43583s;

    /* JADX INFO: renamed from: t */
    public long f43584t;

    /* JADX INFO: renamed from: u */
    public boolean f43585u;

    /* JADX INFO: renamed from: v */
    public c4g0 f43586v;

    /* JADX INFO: renamed from: w */
    public C22392a<Boolean> f43587w;

    /* JADX INFO: renamed from: x */
    public e30<Boolean> f43588x;

    /* JADX INFO: renamed from: y */
    public int f43589y;

    /* JADX INFO: renamed from: z */
    public float f43590z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$a */
    public class C11398a extends ym2 {
        public C11398a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            PictureView.this.f43588x.call(Boolean.FALSE);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            PictureView.this.f43588x.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$b */
    public class C11399b implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f43592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f43593b;

        public C11399b(String str, int i) {
            this.f43592a = str;
            this.f43593b = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            PictureView.this.f43584t = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(PictureView.this.f43583s, System.currentTimeMillis(), this.f43592a, this.f43593b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(FeedModule.f38852a), this.f43592a, this.f43593b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (PictureView.this.f43584t == -1 || !NullChecker.m81304b(PictureView.this.f43576l)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PictureView.this.f43584t >= 200) {
                TrackMediaUploadUtil.m80310h0(jCurrentTimeMillis - PictureView.this.f43584t, PictureView.this.f43577m ? "profile" : PictureView.this.f43582r, this.f43592a);
                fyx.m123808b(PictureView.this.f43584t, jCurrentTimeMillis, this.f43592a, this.f43593b);
            }
            PictureView.this.f43584t = -1L;
        }
    }

    public PictureView(Context context) {
        super(context);
        this.f43581q = -1;
        this.f43583s = -1L;
        this.f43584t = -1L;
        this.f43587w = C22392a.m221513c(Boolean.FALSE);
        this.f43588x = new e30() { // from class: l.nh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138954a.m66530z((Boolean) obj);
            }
        };
        this.f43589y = b5c0.f73602q1;
        this.f43590z = 0.2f;
        this.f43563A = 2000;
        this.f43564B = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m66511A() {
        if (NullChecker.m81303a(this.f43574j)) {
            this.f43574j.m223311v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m66512C(String str, int i, Integer num) {
        fyx.m123810d(this.f43583s, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m66513a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66514b(Object obj) {
        if (Network.isConnected(FeedModule.f38852a)) {
            return;
        }
        lsi0.m151584n(R$string.f38981U);
    }

    /* JADX INFO: renamed from: p */
    private Act m66525p() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: q */
    private void m66526q(int i) {
        this.f43589y = i;
        for (int i2 = 0; i2 < this.f43566b.getChildCount(); i2++) {
            int id = this.f43566b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f43566b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m66527s() {
        if (this.f43574j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f43574j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f43574j.setId(b5c0.f73516R1);
            if (getMeasuredHeight() > 0) {
                this.f43574j.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f43574j.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f43574j, 1, generateDefaultLayoutParams(), true);
            this.f43574j.getLayoutParams().height = -1;
            this.f43574j.getLayoutParams().width = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: t */
    private float m66528t(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m81304b(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(picture) || !NullChecker.m81303a(picture.size)) {
                    dimension = null;
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = null;
                    }
                }
            }
        } else if (NullChecker.m81303a(picture)) {
            dimension = null;
        } else {
            dimension = null;
        }
        if (NullChecker.m81303a(dimension)) {
            return dimension.height / dimension.width;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m66529x() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f43562C;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f43562C = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m66530z(Boolean bool) {
        yni.m215425n(TabName.Moment);
        this.f43587w.onNext(bool);
    }

    /* JADX INFO: renamed from: D */
    public void m66531D() {
        this.f43580p = false;
        if (NullChecker.m81303a(this.f43574j)) {
            this.f43566b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f43574j.m223307r();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m66532E() {
        this.f43580p = true;
        this.f43566b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f43576l;
        if (media instanceof Video) {
            Video videoMo223809clone = (Video) media;
            m66527s();
            if (videoMo223809clone.size == null && TEnum.equals(videoMo223809clone.status, "raw")) {
                videoMo223809clone = videoMo223809clone.mo223809clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(videoMo223809clone.url)), this.f43578n, false);
                videoMo223809clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo223809clone.size = new Dimension(s5l0Var.m182364m());
                videoMo223809clone.duration = s5l0Var.f162561b;
            }
            float fM66528t = m66528t(videoMo223809clone);
            final String square = this.f43578n ? videoMo223809clone.formatSquare() : videoMo223809clone.formatAspectRatio();
            u2h.m191496e();
            this.f43583s = System.currentTimeMillis();
            final int i = fyx.f99914a;
            boolean zM191496e = u2h.m191496e();
            this.f43574j.setIsInABGroup(zM191496e);
            this.f43574j.setOnBufferListener(new C11399b(square, i));
            this.f43574j.setNetErrorListener(new e30() { // from class: l.ph70
                @Override // p149l.e30
                public final void call(Object obj) {
                    PictureView.m66514b(obj);
                }
            });
            this.f43574j.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.rh70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.m206744n().m206753u(square));
                }
            }).compose(mkd0.m154951C()), videoMo223809clone.duration);
            this.f43574j.m223308s(Uri.parse(qib0.m174812d0(square)), fM66528t, square, (zM191496e || !videoMo223809clone.url.startsWith("http") || Network.isConnected(FeedModule.f38852a)) ? false : true, R$string.f38981U, R$string.f38866A4);
            x1l0.m206744n().m206751q(square).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.th70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170208a.m66512C(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.vh70
                @Override // p149l.e30
                public final void call(Object obj) {
                    PictureView.m66513a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m66533F(Media media) {
        m66534G(media, -1);
    }

    /* JADX INFO: renamed from: G */
    public void m66534G(Media media, int i) {
        Picture.ImageUri imageUriProfileBig;
        this.f43581q = i;
        if (!media.equals(this.f43576l) && NullChecker.m81303a(this.f43574j)) {
            this.f43574j.setVisibility(4);
            this.f43574j.m223298i(false);
        }
        this.f43576l = media;
        if (!TEnum.equals(media.status, "raw")) {
            boolean z = media instanceof Video;
            if (!z || this.f43577m) {
                imageUriProfileBig = this.f43577m ? this.f43576l.cover().profileBig() : null;
            } else {
                imageUriProfileBig = media.cover().aspectRatioBiggest();
            }
            if (imageUriProfileBig == null) {
                qkq0.m175383a("not supported yet");
                return;
            } else if (i < 0 || i >= 100) {
                if (!z) {
                    boolean z2 = this.f43577m;
                }
                qib0.f154691G.m102319F0(this.f43565a, imageUriProfileBig, this.f43582r, new C11398a());
            } else {
                j760<Integer, Integer> j760VarM146212w = kjb0.m146212w(i);
                qib0.f154691G.m102336O(this.f43565a, imageUriProfileBig.formatted(), j760VarM146212w.f116564a.intValue(), j760VarM146212w.f116565b.intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                qkq0.m175383a("not supported yet");
                return;
            }
            qib0.f154691G.m102365k0(this.f43565a, media.url);
        }
        boolean z3 = media instanceof Video;
        VFrame_ColorFilter vFrame_ColorFilter = this.f43566b;
        if (z3) {
            vFrame_ColorFilter.setVisibility(0);
        } else {
            vFrame_ColorFilter.setVisibility(4);
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        this.f43566b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m81303a(this.f43574j) && this.f43574j.getAlpha() != 0.0f) {
            this.f43574j.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m66526q(b5c0.f73602q1);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.mo36116d();
        }
    }

    public String getFrom() {
        return this.f43582r;
    }

    public Bitmap getPictureBitmap() {
        if (this.f43565a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f43565a.getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m66526q(b5c0.f73485H0);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.mo36117h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m66535o(View view) {
        ai70.m96791a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m66529x()) {
            return;
        }
        int i = this.f43581q;
        if (i < 0 || i >= 100) {
            int i2 = this.f43589y;
            if (i2 == b5c0.f73602q1) {
                m66532E();
            } else if (i2 == b5c0.f73575i1) {
                m66531D();
            } else if (i2 == b5c0.f73485H0) {
                m66531D();
            }
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        this.f43574j.m223311v();
        this.f43566b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f43574j.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.xh70
            @Override // java.lang.Runnable
            public final void run() {
                this.f192864a.m66511A();
            }
        }, 400L);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.onComplete();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("play video error " + this.f43577m + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66535o(this);
        this.f43566b.setOnClickListener(this);
        if (NullChecker.m81303a(this.f43571g)) {
            this.f43571g.setBackgroundDrawable(fce.m120425b(m66525p().color(e1c0.f88783f0), t100.m186890d(6.0f)));
        }
        if (NullChecker.m81303a(this.f43572h)) {
            this.f43572h.setBackgroundDrawable(fce.m120425b(m66525p().color(e1c0.f88783f0), t100.m186890d(6.0f)));
        }
        if (NullChecker.m81303a(this.f43573i)) {
            this.f43573i.setBackgroundDrawable(fce.m120425b(m66525p().color(e1c0.f88783f0), t100.m186890d(6.0f)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f43578n) {
            int iM136799a = ikh0.m136799a(i, i2);
            super.onMeasure(iM136799a, iM136799a);
        } else if (this.f43579o) {
            super.onMeasure(ffx.m121199b(ffx.m121201d(i)), ffx.m121199b(ffx.m121201d(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        m66526q(b5c0.f73602q1);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.onPause();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        this.f43566b.animate().alpha(this.f43590z).setDuration(this.f43563A).start();
        m66526q(b5c0.f73575i1);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f43564B = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: r */
    public void m66536r(boolean z) {
        this.f43580p = false;
        if (NullChecker.m81303a(this.f43574j)) {
            this.f43574j.m223298i(z);
            this.f43574j.animate().cancel();
            this.f43574j.setAlpha(0.0f);
            this.f43574j.setVisibility(4);
        }
        qib0.f154691G.m184725o(this.f43565a);
        this.f43565a.setVisibility(0);
        m66526q(b5c0.f73602q1);
        this.f43566b.animate().cancel();
        this.f43566b.setAlpha(1.0f);
        this.f43574j = null;
        if (this.f43585u) {
            mkd0.m154992z(this.f43586v);
            this.f43585u = false;
        }
    }

    public void setFrom(String str) {
        this.f43582r = str;
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22583b interfaceC22583b) {
        this.f43575k = interfaceC22583b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f43570f) && this.f43570f.getVisibility() == 0) {
            float f2 = -this.f43570f.getLeft();
            if (this.f43570f.getPivotX() != f2) {
                this.f43570f.setPivotX(f2);
            }
            this.f43570f.setScaleX(1.0f / f);
        }
        if (NullChecker.m81303a(this.f43573i) && this.f43573i.getVisibility() == 0) {
            float width = getWidth() - this.f43573i.getLeft();
            if (this.f43573i.getPivotX() != width) {
                this.f43573i.setPivotX(width);
            }
            this.f43573i.setScaleX(1.0f / f);
        }
        if (NullChecker.m81303a(this.f43566b) && this.f43566b.getVisibility() == 0) {
            float f3 = -this.f43566b.getLeft();
            if (this.f43566b.getPivotX() != f3) {
                this.f43566b.setPivotX(f3);
            }
            this.f43566b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f43570f) && this.f43570f.getVisibility() == 0) {
            float height = this.f43570f.getHeight() - this.f43570f.getBottom();
            if (this.f43570f.getPivotY() != height) {
                this.f43570f.setPivotY(height);
            }
            this.f43570f.setScaleY(1.0f / f);
        }
        if (NullChecker.m81303a(this.f43573i) && this.f43573i.getVisibility() == 0) {
            float height2 = this.f43573i.getHeight() - this.f43573i.getBottom();
            if (this.f43573i.getPivotY() != height2) {
                this.f43573i.setPivotY(height2);
            }
            this.f43573i.setScaleY(1.0f / f);
        }
        if (NullChecker.m81303a(this.f43566b) && this.f43566b.getVisibility() == 0) {
            float height3 = getHeight() - this.f43566b.getTop();
            if (this.f43566b.getPivotY() != height3) {
                this.f43566b.setPivotY(height3);
            }
            this.f43566b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    public void setTopRadius(float f) {
        if (this.f43565a.getHierarchy() == null || this.f43565a.getHierarchy().m112069p() == null) {
            return;
        }
        RoundingParams roundingParamsM112069p = this.f43565a.getHierarchy().m112069p();
        roundingParamsM112069p.m8264r(f, f, 0.0f, 0.0f);
        this.f43565a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    /* JADX INFO: renamed from: u */
    public void m66537u(boolean z) {
        m66538v(z, z);
    }

    /* JADX INFO: renamed from: v */
    public void m66538v(boolean z, boolean z2) {
        m66539w(z, z2, false);
    }

    /* JADX INFO: renamed from: w */
    public void m66539w(boolean z, boolean z2, boolean z3) {
        this.f43577m = z;
        this.f43578n = z2;
        this.f43579o = z3;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        this.f43574j.setVisibility(0);
        if (this.f43574j.getAlpha() < 1.0f) {
            this.f43574j.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f43566b.animate().alpha(this.f43590z).setDuration(this.f43563A).setInterpolator(new LinearInterpolator()).start();
        m66526q(b5c0.f73575i1);
        if (NullChecker.m81303a(this.f43575k)) {
            this.f43575k.mo36127y();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43581q = -1;
        this.f43583s = -1L;
        this.f43584t = -1L;
        this.f43587w = C22392a.m221513c(Boolean.FALSE);
        this.f43588x = new e30() { // from class: l.nh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138954a.m66530z((Boolean) obj);
            }
        };
        this.f43589y = b5c0.f73602q1;
        this.f43590z = 0.2f;
        this.f43563A = 2000;
        this.f43564B = -1.0f;
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43581q = -1;
        this.f43583s = -1L;
        this.f43584t = -1L;
        this.f43587w = C22392a.m221513c(Boolean.FALSE);
        this.f43588x = new e30() { // from class: l.nh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138954a.m66530z((Boolean) obj);
            }
        };
        this.f43589y = b5c0.f73602q1;
        this.f43590z = 0.2f;
        this.f43563A = 2000;
        this.f43564B = -1.0f;
    }
}
