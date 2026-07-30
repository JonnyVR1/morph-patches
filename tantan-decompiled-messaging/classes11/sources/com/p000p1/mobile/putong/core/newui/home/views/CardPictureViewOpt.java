package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import com.p000p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p000p1.mobile.putong.util.audio.AudioBusinessType;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.e30;
import l.ffx;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ngm;
import l.o7m;
import l.osi0;
import l.qib0;
import l.qkq0;
import l.r3l0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v2a;
import l.wl4;
import l.x1l0;
import l.x2c0;
import l.xdl0;
import l.ym2;
import p009l.fyx;
import p009l.ib1;
import p009l.l480;
import p009l.yni;
import p009l.z91;
import p009l.zub;
import rx.c;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VImage;
import v.VProgressBar;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardPictureViewOpt extends FrameLayout implements View.OnClickListener, VTexturePlayer.b, o7m {

    /* JADX INFO: renamed from: u */
    public static long f2522u;

    /* JADX INFO: renamed from: a */
    public CardDraweeViewOpt f2523a;

    /* JADX INFO: renamed from: b */
    public CardDraweeViewOpt f2524b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f2525c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f2526d;

    /* JADX INFO: renamed from: e */
    public VImage f2527e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f2528f;

    /* JADX INFO: renamed from: g */
    public VImage f2529g;

    /* JADX INFO: renamed from: h */
    public LayoutStyle f2530h;

    /* JADX INFO: renamed from: i */
    public VTexturePlayer f2531i;

    /* JADX INFO: renamed from: j */
    public Media f2532j;

    /* JADX INFO: renamed from: k */
    public long f2533k;

    /* JADX INFO: renamed from: l */
    public int f2534l;

    /* JADX INFO: renamed from: m */
    public a<Boolean> f2535m;

    /* JADX INFO: renamed from: n */
    public a<Boolean> f2536n;

    /* JADX INFO: renamed from: o */
    public e30<Boolean> f2537o;

    /* JADX INFO: renamed from: p */
    public e30<Boolean> f2538p;

    /* JADX INFO: renamed from: q */
    public final z91 f2539q;

    /* JADX INFO: renamed from: r */
    public int f2540r;

    /* JADX INFO: renamed from: s */
    public float f2541s;

    /* JADX INFO: renamed from: t */
    public int f2542t;

    public enum LayoutStyle {
        HOME_CARD("头图"),
        LIFE_PHOTO("生活照");

        private String desc;

        LayoutStyle(String str) {
            this.desc = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$a */
    public class C0217a implements z91 {
        public C0217a() {
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: b */
        public void mo3116b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            CardPictureViewOpt.this.m3109d();
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: d */
        public void mo3117d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m16307b().mo16313g(str, audioBusinessType, z91Var);
                CardPictureViewOpt.this.m3113s();
            }
        }

        @Override // p009l.z91
        public void success() {
            CardPictureViewOpt.this.m3113s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$b */
    public class C0218b extends ym2 {
        public C0218b() {
        }

        /* JADX INFO: renamed from: c */
        public void m3118c(String str, Throwable th) {
            super.c(str, th);
            e30 e30Var = CardPictureViewOpt.this.f2538p;
            Boolean bool = Boolean.FALSE;
            e30Var.call(bool);
            CardPictureViewOpt.this.f2537o.call(bool);
        }

        /* JADX INFO: renamed from: h */
        public void m3119h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            e30 e30Var = CardPictureViewOpt.this.f2538p;
            Boolean bool = Boolean.TRUE;
            e30Var.call(bool);
            CardPictureViewOpt.this.f2537o.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$c */
    public class C0219c implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public long f2545a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f2546b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f2547c;

        public C0219c(String str, int i) {
            this.f2546b = str;
            this.f2547c = i;
        }

        /* JADX INFO: renamed from: O */
        public void m3120O() {
            this.f2545a = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public void m3121a() {
            fyx.m14674c(CardPictureViewOpt.this.f2533k, System.currentTimeMillis(), this.f2546b, this.f2547c);
            CardPictureViewOpt.this.f2531i.setLooping(false);
        }

        /* JADX INFO: renamed from: b */
        public void m3122b(int i, int i2) {
            fyx.m14676e(i, i2, !Network.isConnected(CoreModule.b), this.f2546b, this.f2547c);
        }

        /* JADX INFO: renamed from: c */
        public void m3123c(long j) {
            if (this.f2545a == -1 || !NullChecker.a(CardPictureViewOpt.this.f2532j)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f2545a;
            if (jCurrentTimeMillis - j2 >= 200) {
                TrackMediaUploadUtil.m10661h0(jCurrentTimeMillis - j2, "profile", this.f2546b);
                fyx.m14673b(this.f2545a, jCurrentTimeMillis, this.f2546b, this.f2547c);
            }
            this.f2545a = -1L;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$d */
    public class C0220d extends ViewOutlineProvider {
        public C0220d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.d(20.0f));
        }
    }

    public CardPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f2530h = LayoutStyle.HOME_CARD;
        this.f2533k = -1L;
        this.f2534l = -1;
        Boolean bool = Boolean.FALSE;
        this.f2535m = a.c(bool);
        this.f2536n = a.c(bool);
        this.f2537o = new e30() { // from class: l.pl4
            public final void call(Object obj) {
                this.f18779a.m3098x((Boolean) obj);
            }
        };
        this.f2538p = new e30() { // from class: l.ql4
            public final void call(Object obj) {
                this.f19376a.m3099z((Boolean) obj);
            }
        };
        this.f2539q = new C0217a();
        this.f2540r = u4c0.oa;
        this.f2541s = 0.2f;
        this.f2542t = 2000;
    }

    /* JADX INFO: renamed from: J */
    private void m3081J() {
        AudioManager audioManager = (AudioManager) CoreModule.b.getSystemService("audio");
        if (NullChecker.a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3085f(Object obj) {
        if (Network.isConnected(CoreModule.b)) {
            return;
        }
        lsi0.i(R.string.p4, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3086g(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    private void m3094q(int i) {
        this.f2540r = i;
        for (int i2 = 0; i2 < this.f2526d.getChildCount(); i2++) {
            int id = this.f2526d.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f2526d;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m3095t() {
        if (this.f2531i == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f2531i = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f2531i.k(true);
            this.f2531i.setId(u4c0.Wd);
            if (getMeasuredHeight() > 0) {
                this.f2531i.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2531i.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f2531i, indexOfChild(this.f2523a) + 1, generateDefaultLayoutParams(), true);
            this.f2531i.getLayoutParams().height = -1;
            this.f2531i.getLayoutParams().width = -1;
            if (NullChecker.a(this.f2531i)) {
                this.f2531i.setOutlineProvider(new C0220d());
                this.f2531i.setClipToOutline(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: u */
    private float m3096u(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.a(video.size)) {
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

    /* JADX INFO: renamed from: v */
    private static boolean m3097v() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f2522u;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f2522u = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m3098x(Boolean bool) {
        this.f2536n.onNext(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m3099z(Boolean bool) {
        yni.m25482n(TabName.Card);
        this.f2535m.onNext(bool);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m3100A() {
        if (NullChecker.a(this.f2531i)) {
            this.f2531i.v();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3101C() {
        if (NullChecker.a(this.f2531i)) {
            this.f2526d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f2531i.r();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3102D() {
        this.f2526d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (this.f2532j instanceof Video) {
            ib1.m16307b().mo16312f("PlayerView", AudioBusinessType.NORMAL, this.f2539q);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m3103E(Media media) {
        m3104F(media, -1);
    }

    /* JADX INFO: renamed from: F */
    public void m3104F(Media media, int i) {
        m3105G(media, i, false);
    }

    /* JADX INFO: renamed from: G */
    public void m3105G(Media media, int i, boolean z) {
        m3106H(media, i, z, false);
    }

    /* JADX INFO: renamed from: H */
    public void m3106H(Media media, int i, boolean z, boolean z2) {
        m3107I(media, i, z, z2, false);
    }

    /* JADX INFO: renamed from: I */
    public void m3107I(Media media, int i, boolean z, boolean z2, boolean z3) {
        xdl0.M(this.f2523a, true);
        xdl0.M(this.f2525c, false);
        this.f2534l = i;
        if (!media.equals(this.f2532j) && NullChecker.a(this.f2531i)) {
            this.f2531i.setVisibility(4);
            this.f2531i.i(false);
        }
        this.f2532j = media;
        if (!TEnum.equals(media.status, "raw")) {
            Picture.ImageUri imageUriM25966f = zub.m25966f(this.f2532j);
            if (imageUriM25966f == null) {
                qkq0.a("not supported yet");
                return;
            }
            C0218b c0218b = new C0218b();
            if (i < 0 || i >= 100) {
                if (z) {
                    int color = Color.parseColor("#4c000000");
                    if (z3) {
                        qib0.G.Q(this.f2523a, imageUriM25966f.formatted(), 2, 16, color, c0218b);
                    } else {
                        String str = media instanceof Video ? "" : "profile";
                        imageUriM25966f.formatType = 3;
                        qib0.G.F0(this.f2523a, imageUriM25966f, str, c0218b);
                    }
                } else {
                    qib0.G.F0(this.f2523a, imageUriM25966f, media instanceof Video ? "" : "profile", c0218b);
                }
            } else {
                j760 j760VarZ = com.p1.mobile.putong.core.ui.onlinematch.a.z(i);
                qib0.G.O(this.f2523a, imageUriM25966f.formatted(), ((Integer) j760VarZ.a).intValue(), ((Integer) j760VarZ.b).intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                qkq0.a("not supported yet");
                return;
            }
            qib0.G.k0(this.f2523a, media.url);
        }
        if (!(media instanceof Video) || z || z2) {
            this.f2526d.setVisibility(4);
        } else {
            this.f2526d.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3108b(boolean z) {
        if (z) {
            m3112r(true);
        } else {
            m3101C();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3109d() {
        ib1.m16307b().mo16308a("PlayerView");
        ib1.m16307b().mo16311e("PlayerView");
        this.f2526d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.a(this.f2531i) && this.f2531i.getAlpha() != 0.0f) {
            this.f2531i.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m3094q(u4c0.oa);
    }

    /* JADX INFO: renamed from: h */
    public void m3110h() {
        m3094q(u4c0.D7);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m3097v()) {
            return;
        }
        int i = this.f2534l;
        if (i < 0 || i >= 100) {
            int i2 = this.f2540r;
            if (i2 == u4c0.oa) {
                m3102D();
            } else if (i2 == u4c0.r9) {
                m3101C();
            } else if (i2 == u4c0.D7) {
                m3101C();
            }
        }
    }

    public void onComplete() {
        this.f2531i.v();
        this.f2526d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f2531i.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.rl4
            @Override // java.lang.Runnable
            public final void run() {
                this.f19901a.m3100A();
            }
        }, 400L);
    }

    public void onError(int i, int i2) {
        CrashHelper.d(new Throwable("play video error true " + i + " " + i2), 100);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3111p(this);
        if (upa.z()) {
            this.f2527e.setImageDrawable(getResources().getDrawable(x2c0.es));
        }
        this.f2526d.setOnClickListener(this);
        CardDraweeViewOpt cardDraweeViewOpt = this.f2523a;
        int i = t100.o;
        cardDraweeViewOpt.m2199w(i, i, i, i);
        this.f2523a.getHierarchy().E(new l480(0.0f));
        this.f2524b.m2199w(i, i, i, i);
        this.f2524b.getHierarchy().E(new l480(0.0f));
        this.f2525c.setAspectRatio(1.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        int iD2 = ffx.d(i2);
        LayoutStyle layoutStyle = this.f2530h;
        if (layoutStyle != LayoutStyle.HOME_CARD) {
            if (layoutStyle == LayoutStyle.LIFE_PHOTO) {
                super.onMeasure(ffx.b(iD), ffx.b(iD2));
                return;
            } else {
                super.onMeasure(ffx.b(iD), ffx.b(iD2));
                return;
            }
        }
        int i3 = (int) (((double) iD) / 0.67d);
        if (upa.N3()) {
            super.onMeasure(ffx.b(iD), ffx.b(Math.min(i3, iD2)));
        } else if (i3 < iD2) {
            super.onMeasure(ffx.b(iD), ffx.b(Math.min(i3, iD2 - t100.o)));
        } else {
            super.onMeasure(ffx.b(iD), ffx.b(iD2 - t100.o));
        }
    }

    public void onPause() {
        ib1.m16307b().mo16308a("PlayerView");
        ib1.m16307b().mo16311e("PlayerView");
        CoreModule.Q().m9038Zo().m24733f(false);
        if (v2a.c() || IntlCountryCodeController.v()) {
            xdl0.M0(this.f2531i, false);
        }
        m3094q(u4c0.oa);
    }

    public void onResume() {
        this.f2526d.animate().alpha(this.f2541s).setDuration(this.f2542t).start();
        m3094q(u4c0.r9);
    }

    /* JADX INFO: renamed from: p */
    public final void m3111p(View view) {
        wl4.a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m3112r(boolean z) {
        ib1.m16307b().mo16308a("PlayerView");
        ib1.m16307b().mo16311e("PlayerView");
        if (NullChecker.a(this.f2531i)) {
            this.f2531i.i(z);
            this.f2531i.animate().cancel();
            this.f2531i.setAlpha(0.0f);
            this.f2531i.setVisibility(4);
        }
        qib0.G.o(this.f2523a);
        qib0.G.o(this.f2524b);
        this.f2523a.setVisibility(0);
        m3094q(u4c0.oa);
        this.f2526d.animate().cancel();
        this.f2526d.setAlpha(1.0f);
        this.f2531i = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m3113s() {
        CoreModule.Q().m9038Zo().m24733f(true);
        Video videoClone = (Video) this.f2532j;
        if (videoClone.size == null && TEnum.equals(((Media) videoClone).status, "raw")) {
            videoClone = videoClone.clone();
            s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(((Media) videoClone).url)), false, false);
            ((Media) videoClone).mediaType = "video/mp4";
            videoClone.size = new Dimension(s5l0Var.m());
            videoClone.duration = s5l0Var.b;
        }
        m3095t();
        float fM3096u = m3096u(videoClone);
        final String aspectRatio = videoClone.formatAspectRatio();
        r3l0.c();
        this.f2533k = System.currentTimeMillis();
        final int i = fyx.f13233a;
        boolean zC = r3l0.c();
        this.f2531i.setIsInABGroup(zC);
        this.f2531i.setOnBufferListener(new C0219c(aspectRatio, i));
        this.f2531i.setNetErrorListener(new e30() { // from class: l.sl4
            public final void call(Object obj) {
                CardPictureViewOpt.m3085f(obj);
            }
        });
        this.f2531i.w((VTexturePlayer.a) null, c.fromCallable(new Callable() { // from class: l.tl4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(x1l0.n().u(aspectRatio));
            }
        }).compose(mkd0.C()), videoClone.duration);
        this.f2531i.s(Uri.parse(qib0.d0(aspectRatio)), fM3096u, aspectRatio, (zC || !((Media) videoClone).url.startsWith("http") || Network.isConnected(CoreModule.b)) ? false : true, R.string.p4, R.string.Yj);
        x1l0.n().q(aspectRatio).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.ul4
            public final void call(Object obj) {
                this.f21238a.m3114w(aspectRatio, i, (Integer) obj);
            }
        }, new e30() { // from class: l.vl4
            public final void call(Object obj) {
                CardPictureViewOpt.m3086g((Throwable) obj);
            }
        }));
        m3081J();
    }

    public void setBlurBackground(Drawable drawable) {
    }

    public void setBottomRoundCorner(boolean z) {
        int i = t100.o;
        if (upa.N3()) {
            this.f2523a.m2199w(i, i, i, i);
            this.f2524b.m2199w(i, i, i, i);
            return;
        }
        CardDraweeViewOpt cardDraweeViewOpt = this.f2523a;
        if (z) {
            cardDraweeViewOpt.m2199w(i, i, i, i);
            this.f2524b.m2199w(i, i, i, i);
        } else {
            cardDraweeViewOpt.m2199w(i, i, 0, 0);
            this.f2524b.m2199w(i, i, 0, 0);
        }
    }

    public void setStyle(LayoutStyle layoutStyle) {
        this.f2530h = layoutStyle;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m3114w(String str, int i, Integer num) {
        fyx.m14675d(this.f2533k, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: y */
    public void m3115y() {
        this.f2531i.setVisibility(0);
        if (this.f2531i.getAlpha() < 1.0f) {
            this.f2531i.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f2526d.animate().alpha(this.f2541s).setDuration(this.f2542t).setInterpolator(new LinearInterpolator()).start();
        m3094q(u4c0.r9);
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2530h = LayoutStyle.HOME_CARD;
        this.f2533k = -1L;
        this.f2534l = -1;
        Boolean bool = Boolean.FALSE;
        this.f2535m = a.c(bool);
        this.f2536n = a.c(bool);
        this.f2537o = new e30() { // from class: l.pl4
            public final void call(Object obj) {
                this.f18779a.m3098x((Boolean) obj);
            }
        };
        this.f2538p = new e30() { // from class: l.ql4
            public final void call(Object obj) {
                this.f19376a.m3099z((Boolean) obj);
            }
        };
        this.f2539q = new C0217a();
        this.f2540r = u4c0.oa;
        this.f2541s = 0.2f;
        this.f2542t = 2000;
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2530h = LayoutStyle.HOME_CARD;
        this.f2533k = -1L;
        this.f2534l = -1;
        Boolean bool = Boolean.FALSE;
        this.f2535m = a.c(bool);
        this.f2536n = a.c(bool);
        this.f2537o = new e30() { // from class: l.pl4
            public final void call(Object obj) {
                this.f18779a.m3098x((Boolean) obj);
            }
        };
        this.f2538p = new e30() { // from class: l.ql4
            public final void call(Object obj) {
                this.f19376a.m3099z((Boolean) obj);
            }
        };
        this.f2539q = new C0217a();
        this.f2540r = u4c0.oa;
        this.f2541s = 0.2f;
        this.f2542t = 2000;
    }
}
