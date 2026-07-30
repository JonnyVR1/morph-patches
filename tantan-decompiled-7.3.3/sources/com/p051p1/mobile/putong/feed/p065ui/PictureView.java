package com.p051p1.mobile.putong.feed.p065ui;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.p065ui.PictureView;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VTexturePlayer;
import p153l.bnl0;
import p153l.c7y;
import p153l.cbl0;
import p153l.dox;
import p153l.fn2;
import p153l.gq70;
import p153l.hdc0;
import p153l.j4h;
import p153l.jde;
import p153l.k9c0;
import p153l.kcg0;
import p153l.o1j0;
import p153l.oki;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.psh0;
import p153l.qa00;
import p153l.qim;
import p153l.uqb0;
import p153l.uqi;
import p153l.vel0;
import p153l.wel0;
import p153l.wtq0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22698b {

    /* JADX INFO: renamed from: C */
    public static long f44410C;

    /* JADX INFO: renamed from: A */
    public int f44411A;

    /* JADX INFO: renamed from: B */
    public float f44412B;

    /* JADX INFO: renamed from: a */
    public VDraweeView f44413a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f44414b;

    /* JADX INFO: renamed from: c */
    public ImageView f44415c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f44416d;

    /* JADX INFO: renamed from: e */
    public ImageView f44417e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f44418f;

    /* JADX INFO: renamed from: g */
    public VText f44419g;

    /* JADX INFO: renamed from: h */
    public VImage f44420h;

    /* JADX INFO: renamed from: i */
    public VText f44421i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f44422j;

    /* JADX INFO: renamed from: k */
    public VTexturePlayer.InterfaceC22698b f44423k;

    /* JADX INFO: renamed from: l */
    public Media f44424l;

    /* JADX INFO: renamed from: m */
    public boolean f44425m;

    /* JADX INFO: renamed from: n */
    public boolean f44426n;

    /* JADX INFO: renamed from: o */
    public boolean f44427o;

    /* JADX INFO: renamed from: p */
    public boolean f44428p;

    /* JADX INFO: renamed from: q */
    public int f44429q;

    /* JADX INFO: renamed from: r */
    public String f44430r;

    /* JADX INFO: renamed from: s */
    public long f44431s;

    /* JADX INFO: renamed from: t */
    public long f44432t;

    /* JADX INFO: renamed from: u */
    public boolean f44433u;

    /* JADX INFO: renamed from: v */
    public kcg0 f44434v;

    /* JADX INFO: renamed from: w */
    public C22507a<Boolean> f44435w;

    /* JADX INFO: renamed from: x */
    public y20<Boolean> f44436x;

    /* JADX INFO: renamed from: y */
    public int f44437y;

    /* JADX INFO: renamed from: z */
    public float f44438z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$a */
    public class C11561a extends fn2 {
        public C11561a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            PictureView.this.f44436x.call(Boolean.FALSE);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            PictureView.this.f44436x.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PictureView$b */
    public class C11562b implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f44440a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f44441b;

        public C11562b(String str, int i) {
            this.f44440a = str;
            this.f44441b = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            PictureView.this.f44432t = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(PictureView.this.f44431s, System.currentTimeMillis(), this.f44440a, this.f44441b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(FeedModule.f39700a), this.f44440a, this.f44441b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (PictureView.this.f44432t == -1 || !NullChecker.m82487b(PictureView.this.f44424l)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PictureView.this.f44432t >= 200) {
                TrackMediaUploadUtil.m81493h0(jCurrentTimeMillis - PictureView.this.f44432t, PictureView.this.f44425m ? "profile" : PictureView.this.f44430r, this.f44440a);
                c7y.m108343b(PictureView.this.f44432t, jCurrentTimeMillis, this.f44440a, this.f44441b);
            }
            PictureView.this.f44432t = -1L;
        }
    }

    public PictureView(Context context) {
        super(context);
        this.f44429q = -1;
        this.f44431s = -1L;
        this.f44432t = -1L;
        this.f44435w = C22507a.m222759c(Boolean.FALSE);
        this.f44436x = new y20() { // from class: l.tp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175559a.m67713z((Boolean) obj);
            }
        };
        this.f44437y = hdc0.f108955q1;
        this.f44438z = 0.2f;
        this.f44411A = 2000;
        this.f44412B = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m67694A() {
        if (NullChecker.m82486a(this.f44422j)) {
            this.f44422j.m224557v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m67695C(String str, int i, Integer num) {
        c7y.m108345d(this.f44431s, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m67696a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67697b(Object obj) {
        if (Network.isConnected(FeedModule.f39700a)) {
            return;
        }
        o1j0.m165640n(R$string.f39829U);
    }

    /* JADX INFO: renamed from: p */
    private Act m67708p() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: q */
    private void m67709q(int i) {
        this.f44437y = i;
        for (int i2 = 0; i2 < this.f44414b.getChildCount(); i2++) {
            int id = this.f44414b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f44414b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m67710s() {
        if (this.f44422j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f44422j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f44422j.setId(hdc0.f108869R1);
            if (getMeasuredHeight() > 0) {
                this.f44422j.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f44422j.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f44422j, 1, generateDefaultLayoutParams(), true);
            this.f44422j.getLayoutParams().height = -1;
            this.f44422j.getLayoutParams().width = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: t */
    private float m67711t(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m82487b(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(picture) || !NullChecker.m82486a(picture.size)) {
                    dimension = null;
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = null;
                    }
                }
            }
        } else if (NullChecker.m82486a(picture)) {
            dimension = null;
        } else {
            dimension = null;
        }
        if (NullChecker.m82486a(dimension)) {
            return dimension.height / dimension.width;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m67712x() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f44410C;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f44410C = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m67713z(Boolean bool) {
        uqi.m197347n(TabName.Moment);
        this.f44435w.onNext(bool);
    }

    /* JADX INFO: renamed from: D */
    public void m67714D() {
        this.f44428p = false;
        if (NullChecker.m82486a(this.f44422j)) {
            this.f44414b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f44422j.m224553r();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m67715E() {
        this.f44428p = true;
        this.f44414b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f44424l;
        if (media instanceof Video) {
            Video videoMo225055clone = (Video) media;
            m67710s();
            if (videoMo225055clone.size == null && TEnum.equals(videoMo225055clone.status, "raw")) {
                videoMo225055clone = videoMo225055clone.mo225055clone();
                wel0 wel0Var = new wel0(new vel0(oki.m168038z(videoMo225055clone.url)), this.f44426n, false);
                videoMo225055clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo225055clone.size = new Dimension(wel0Var.m206021m());
                videoMo225055clone.duration = wel0Var.f188702b;
            }
            float fM67711t = m67711t(videoMo225055clone);
            final String square = this.f44426n ? videoMo225055clone.formatSquare() : videoMo225055clone.formatAspectRatio();
            j4h.m143421e();
            this.f44431s = System.currentTimeMillis();
            final int i = c7y.f80160a;
            boolean zM143421e = j4h.m143421e();
            this.f44422j.setIsInABGroup(zM143421e);
            this.f44422j.setOnBufferListener(new C11562b(square, i));
            this.f44422j.setNetErrorListener(new y20() { // from class: l.vp70
                @Override // p153l.y20
                public final void call(Object obj) {
                    PictureView.m67697b(obj);
                }
            });
            this.f44422j.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.xp70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(cbl0.m108642n().m108651u(square));
                }
            }).compose(psd0.m173592C()), videoMo225055clone.duration);
            this.f44422j.m224554s(Uri.parse(uqb0.m197266d0(square)), fM67711t, square, (zM143421e || !videoMo225055clone.url.startsWith("http") || Network.isConnected(FeedModule.f39700a)) ? false : true, R$string.f39829U, R$string.f39714A4);
            cbl0.m108642n().m108649q(square).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.zp70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205429a.m67695C(square, i, (Integer) obj);
                }
            }, new y20() { // from class: l.bq70
                @Override // p153l.y20
                public final void call(Object obj) {
                    PictureView.m67696a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m67716F(Media media) {
        m67717G(media, -1);
    }

    /* JADX INFO: renamed from: G */
    public void m67717G(Media media, int i) {
        Picture.ImageUri imageUriProfileBig;
        this.f44429q = i;
        if (!media.equals(this.f44424l) && NullChecker.m82486a(this.f44422j)) {
            this.f44422j.setVisibility(4);
            this.f44422j.m224544i(false);
        }
        this.f44424l = media;
        if (!TEnum.equals(media.status, "raw")) {
            boolean z = media instanceof Video;
            if (!z || this.f44425m) {
                imageUriProfileBig = this.f44425m ? this.f44424l.cover().profileBig() : null;
            } else {
                imageUriProfileBig = media.cover().aspectRatioBiggest();
            }
            if (imageUriProfileBig == null) {
                wtq0.m207906a("not supported yet");
                return;
            } else if (i < 0 || i >= 100) {
                if (!z) {
                    boolean z2 = this.f44425m;
                }
                uqb0.f180374G.m127103F0(this.f44413a, imageUriProfileBig, this.f44430r, new C11561a());
            } else {
                pf60<Integer, Integer> pf60VarM168906w = orb0.m168906w(i);
                uqb0.f180374G.m127120O(this.f44413a, imageUriProfileBig.formatted(), pf60VarM168906w.f152156a.intValue(), pf60VarM168906w.f152157b.intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                wtq0.m207906a("not supported yet");
                return;
            }
            uqb0.f180374G.m127148k0(this.f44413a, media.url);
        }
        boolean z3 = media instanceof Video;
        VFrame_ColorFilter vFrame_ColorFilter = this.f44414b;
        if (z3) {
            vFrame_ColorFilter.setVisibility(0);
        } else {
            vFrame_ColorFilter.setVisibility(4);
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        this.f44414b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m82486a(this.f44422j) && this.f44422j.getAlpha() != 0.0f) {
            this.f44422j.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m67709q(hdc0.f108955q1);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.mo37119d();
        }
    }

    public String getFrom() {
        return this.f44430r;
    }

    public Bitmap getPictureBitmap() {
        if (this.f44413a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f44413a.getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m67709q(hdc0.f108838H0);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.mo37120h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67718o(View view) {
        gq70.m131358a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m67712x()) {
            return;
        }
        int i = this.f44429q;
        if (i < 0 || i >= 100) {
            int i2 = this.f44437y;
            if (i2 == hdc0.f108955q1) {
                m67715E();
            } else if (i2 == hdc0.f108928i1) {
                m67714D();
            } else if (i2 == hdc0.f108838H0) {
                m67714D();
            }
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        this.f44422j.m224557v();
        this.f44414b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f44422j.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.dq70
            @Override // java.lang.Runnable
            public final void run() {
                this.f90178a.m67694A();
            }
        }, 400L);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.onComplete();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("play video error " + this.f44425m + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67718o(this);
        this.f44414b.setOnClickListener(this);
        if (NullChecker.m82486a(this.f44419g)) {
            this.f44419g.setBackgroundDrawable(jde.m144406b(m67708p().color(k9c0.f124506f0), qa00.m175859d(6.0f)));
        }
        if (NullChecker.m82486a(this.f44420h)) {
            this.f44420h.setBackgroundDrawable(jde.m144406b(m67708p().color(k9c0.f124506f0), qa00.m175859d(6.0f)));
        }
        if (NullChecker.m82486a(this.f44421i)) {
            this.f44421i.setBackgroundDrawable(jde.m144406b(m67708p().color(k9c0.f124506f0), qa00.m175859d(6.0f)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f44426n) {
            int iM173642a = psh0.m173642a(i, i2);
            super.onMeasure(iM173642a, iM173642a);
        } else if (this.f44427o) {
            super.onMeasure(dox.m117364b(dox.m117366d(i)), dox.m117364b(dox.m117366d(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        m67709q(hdc0.f108955q1);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.onPause();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        this.f44414b.animate().alpha(this.f44438z).setDuration(this.f44411A).start();
        m67709q(hdc0.f108928i1);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f44412B = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: r */
    public void m67719r(boolean z) {
        this.f44428p = false;
        if (NullChecker.m82486a(this.f44422j)) {
            this.f44422j.m224544i(z);
            this.f44422j.animate().cancel();
            this.f44422j.setAlpha(0.0f);
            this.f44422j.setVisibility(4);
        }
        uqb0.f180374G.m98798o(this.f44413a);
        this.f44413a.setVisibility(0);
        m67709q(hdc0.f108955q1);
        this.f44414b.animate().cancel();
        this.f44414b.setAlpha(1.0f);
        this.f44422j = null;
        if (this.f44433u) {
            psd0.m173633z(this.f44434v);
            this.f44433u = false;
        }
    }

    public void setFrom(String str) {
        this.f44430r = str;
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22698b interfaceC22698b) {
        this.f44423k = interfaceC22698b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f44418f) && this.f44418f.getVisibility() == 0) {
            float f2 = -this.f44418f.getLeft();
            if (this.f44418f.getPivotX() != f2) {
                this.f44418f.setPivotX(f2);
            }
            this.f44418f.setScaleX(1.0f / f);
        }
        if (NullChecker.m82486a(this.f44421i) && this.f44421i.getVisibility() == 0) {
            float width = getWidth() - this.f44421i.getLeft();
            if (this.f44421i.getPivotX() != width) {
                this.f44421i.setPivotX(width);
            }
            this.f44421i.setScaleX(1.0f / f);
        }
        if (NullChecker.m82486a(this.f44414b) && this.f44414b.getVisibility() == 0) {
            float f3 = -this.f44414b.getLeft();
            if (this.f44414b.getPivotX() != f3) {
                this.f44414b.setPivotX(f3);
            }
            this.f44414b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f44418f) && this.f44418f.getVisibility() == 0) {
            float height = this.f44418f.getHeight() - this.f44418f.getBottom();
            if (this.f44418f.getPivotY() != height) {
                this.f44418f.setPivotY(height);
            }
            this.f44418f.setScaleY(1.0f / f);
        }
        if (NullChecker.m82486a(this.f44421i) && this.f44421i.getVisibility() == 0) {
            float height2 = this.f44421i.getHeight() - this.f44421i.getBottom();
            if (this.f44421i.getPivotY() != height2) {
                this.f44421i.setPivotY(height2);
            }
            this.f44421i.setScaleY(1.0f / f);
        }
        if (NullChecker.m82486a(this.f44414b) && this.f44414b.getVisibility() == 0) {
            float height3 = getHeight() - this.f44414b.getTop();
            if (this.f44414b.getPivotY() != height3) {
                this.f44414b.setPivotY(height3);
            }
            this.f44414b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    public void setTopRadius(float f) {
        if (this.f44413a.getHierarchy() == null || this.f44413a.getHierarchy().m207055p() == null) {
            return;
        }
        RoundingParams roundingParamsM207055p = this.f44413a.getHierarchy().m207055p();
        roundingParamsM207055p.m8318r(f, f, 0.0f, 0.0f);
        this.f44413a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    /* JADX INFO: renamed from: u */
    public void m67720u(boolean z) {
        m67721v(z, z);
    }

    /* JADX INFO: renamed from: v */
    public void m67721v(boolean z, boolean z2) {
        m67722w(z, z2, false);
    }

    /* JADX INFO: renamed from: w */
    public void m67722w(boolean z, boolean z2, boolean z3) {
        this.f44425m = z;
        this.f44426n = z2;
        this.f44427o = z3;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        this.f44422j.setVisibility(0);
        if (this.f44422j.getAlpha() < 1.0f) {
            this.f44422j.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f44414b.animate().alpha(this.f44438z).setDuration(this.f44411A).setInterpolator(new LinearInterpolator()).start();
        m67709q(hdc0.f108928i1);
        if (NullChecker.m82486a(this.f44423k)) {
            this.f44423k.mo37130y();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44429q = -1;
        this.f44431s = -1L;
        this.f44432t = -1L;
        this.f44435w = C22507a.m222759c(Boolean.FALSE);
        this.f44436x = new y20() { // from class: l.tp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175559a.m67713z((Boolean) obj);
            }
        };
        this.f44437y = hdc0.f108955q1;
        this.f44438z = 0.2f;
        this.f44411A = 2000;
        this.f44412B = -1.0f;
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44429q = -1;
        this.f44431s = -1L;
        this.f44432t = -1L;
        this.f44435w = C22507a.m222759c(Boolean.FALSE);
        this.f44436x = new y20() { // from class: l.tp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175559a.m67713z((Boolean) obj);
            }
        };
        this.f44437y = hdc0.f108955q1;
        this.f44438z = 0.2f;
        this.f44411A = 2000;
        this.f44412B = -1.0f;
    }
}
