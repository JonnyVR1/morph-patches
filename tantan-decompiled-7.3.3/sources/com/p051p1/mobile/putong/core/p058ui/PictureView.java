package com.p051p1.mobile.putong.core.p058ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VTexturePlayer;
import p153l.adc0;
import p153l.bnl0;
import p153l.c7y;
import p153l.c9c0;
import p153l.cbl0;
import p153l.d79;
import p153l.dbc0;
import p153l.dox;
import p153l.eam;
import p153l.fn2;
import p153l.g4a;
import p153l.ga1;
import p153l.gra;
import p153l.gt0;
import p153l.h1e0;
import p153l.hq70;
import p153l.ix60;
import p153l.jde;
import p153l.nwb;
import p153l.o1j0;
import p153l.oki;
import p153l.pb1;
import p153l.pf60;
import p153l.psd0;
import p153l.psh0;
import p153l.qa00;
import p153l.qim;
import p153l.r1j0;
import p153l.rc80;
import p153l.uqb0;
import p153l.uqi;
import p153l.vel0;
import p153l.wcl0;
import p153l.wel0;
import p153l.wlj;
import p153l.wtq0;
import p153l.y20;
import p153l.yti0;

/* JADX INFO: loaded from: classes6.dex */
public class PictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22698b, eam {

    /* JADX INFO: renamed from: T0 */
    public static long f28879T0;

    /* JADX INFO: renamed from: A */
    public LinearLayout f28880A;

    /* JADX INFO: renamed from: B */
    public View f28881B;

    /* JADX INFO: renamed from: C */
    public ImageView f28882C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f28883D;

    /* JADX INFO: renamed from: E */
    public VTexturePlayer f28884E;

    /* JADX INFO: renamed from: E0 */
    public boolean f28885E0;

    /* JADX INFO: renamed from: F */
    public VTexturePlayer.InterfaceC22698b f28886F;

    /* JADX INFO: renamed from: F0 */
    public boolean f28887F0;

    /* JADX INFO: renamed from: G */
    public Media f28888G;

    /* JADX INFO: renamed from: G0 */
    public boolean f28889G0;

    /* JADX INFO: renamed from: H */
    public boolean f28890H;

    /* JADX INFO: renamed from: H0 */
    public int f28891H0;

    /* JADX INFO: renamed from: I */
    public boolean f28892I;

    /* JADX INFO: renamed from: I0 */
    public C22507a<Boolean> f28893I0;

    /* JADX INFO: renamed from: J */
    public boolean f28894J;

    /* JADX INFO: renamed from: J0 */
    public C22507a<Boolean> f28895J0;

    /* JADX INFO: renamed from: K */
    public boolean f28896K;

    /* JADX INFO: renamed from: K0 */
    public y20<Boolean> f28897K0;

    /* JADX INFO: renamed from: L */
    public boolean f28898L;

    /* JADX INFO: renamed from: L0 */
    public y20<Boolean> f28899L0;

    /* JADX INFO: renamed from: M */
    public boolean f28900M;

    /* JADX INFO: renamed from: M0 */
    public Boolean f28901M0;

    /* JADX INFO: renamed from: N */
    public boolean f28902N;

    /* JADX INFO: renamed from: N0 */
    public boolean f28903N0;

    /* JADX INFO: renamed from: O */
    public boolean f28904O;

    /* JADX INFO: renamed from: O0 */
    public int f28905O0;

    /* JADX INFO: renamed from: P */
    public boolean f28906P;

    /* JADX INFO: renamed from: P0 */
    public float f28907P0;

    /* JADX INFO: renamed from: Q */
    public float f28908Q;

    /* JADX INFO: renamed from: Q0 */
    public int f28909Q0;

    /* JADX INFO: renamed from: R */
    public boolean f28910R;

    /* JADX INFO: renamed from: R0 */
    public final ga1 f28911R0;

    /* JADX INFO: renamed from: S */
    public boolean f28912S;

    /* JADX INFO: renamed from: S0 */
    public float f28913S0;

    /* JADX INFO: renamed from: T */
    public int f28914T;

    /* JADX INFO: renamed from: U */
    public String f28915U;

    /* JADX INFO: renamed from: V */
    public long f28916V;

    /* JADX INFO: renamed from: W */
    public long f28917W;

    /* JADX INFO: renamed from: a */
    public VDraweeView f28918a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28919b;

    /* JADX INFO: renamed from: c */
    public View f28920c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28921d;

    /* JADX INFO: renamed from: e */
    public VImage f28922e;

    /* JADX INFO: renamed from: f */
    public VText f28923f;

    /* JADX INFO: renamed from: g */
    public VFrame_ColorFilter f28924g;

    /* JADX INFO: renamed from: h */
    public VImage f28925h;

    /* JADX INFO: renamed from: i */
    public VProgressBar f28926i;

    /* JADX INFO: renamed from: j */
    public VImage f28927j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f28928k;

    /* JADX INFO: renamed from: k0 */
    public boolean f28929k0;

    /* JADX INFO: renamed from: l */
    public VText f28930l;

    /* JADX INFO: renamed from: m */
    public VText f28931m;

    /* JADX INFO: renamed from: n */
    public VImage f28932n;

    /* JADX INFO: renamed from: o */
    public VText f28933o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f28934p;

    /* JADX INFO: renamed from: p0 */
    public boolean f28935p0;

    /* JADX INFO: renamed from: q */
    public VText f28936q;

    /* JADX INFO: renamed from: r */
    public VText f28937r;

    /* JADX INFO: renamed from: s */
    public VLinear f28938s;

    /* JADX INFO: renamed from: t */
    public VImage f28939t;

    /* JADX INFO: renamed from: u */
    public VText f28940u;

    /* JADX INFO: renamed from: v */
    public VText f28941v;

    /* JADX INFO: renamed from: w */
    public VImage f28942w;

    /* JADX INFO: renamed from: x */
    public VText f28943x;

    /* JADX INFO: renamed from: y */
    public RelativeLayout f28944y;

    /* JADX INFO: renamed from: z */
    public VButton f28945z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$a */
    public class C8427a extends fn2 {
        public C8427a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            y20 y20Var = PictureView.this.f28899L0;
            Boolean bool = Boolean.FALSE;
            y20Var.call(bool);
            PictureView.this.f28897K0.call(bool);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            y20 y20Var = PictureView.this.f28899L0;
            Boolean bool = Boolean.TRUE;
            y20Var.call(bool);
            PictureView.this.f28897K0.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$b */
    public class C8428b extends fn2 {
        public C8428b() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            y20 y20Var = PictureView.this.f28899L0;
            Boolean bool = Boolean.FALSE;
            y20Var.call(bool);
            PictureView.this.f28897K0.call(bool);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            y20 y20Var = PictureView.this.f28899L0;
            Boolean bool = Boolean.TRUE;
            y20Var.call(bool);
            PictureView.this.f28897K0.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$c */
    public class C8429c implements ga1 {
        public C8429c() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            PictureView.this.mo37119d();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                PictureView.this.m45134C();
            }
        }

        @Override // p153l.ga1
        public void success() {
            PictureView.this.m45134C();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$d */
    public class C8430d implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f28949a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28950b;

        public C8430d(String str, int i) {
            this.f28949a = str;
            this.f28950b = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            PictureView.this.f28916V = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(PictureView.this.f28917W, System.currentTimeMillis(), this.f28949a, this.f28950b);
            PictureView.this.f28884E.setLooping(PictureView.this.f28898L || PictureView.this.f28887F0);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(CoreModule.f18263b), this.f28949a, this.f28950b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (PictureView.this.f28916V == -1 || !NullChecker.m82486a(PictureView.this.f28888G)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PictureView.this.f28916V >= 200) {
                TrackMediaUploadUtil.m81493h0(jCurrentTimeMillis - PictureView.this.f28916V, PictureView.this.f28890H ? "profile" : PictureView.this.f28915U, this.f28949a);
                c7y.m108343b(PictureView.this.f28916V, jCurrentTimeMillis, this.f28949a, this.f28950b);
            }
            PictureView.this.f28916V = -1L;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$e */
    public class C8431e extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f28952a;

        public C8431e(boolean z) {
            this.f28952a = z;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, this.f28952a ? (view.getHeight() - PictureView.this.getMeasuredHeight()) / 2 : 0, this.f28952a ? PictureView.this.getMeasuredWidth() : view.getWidth(), this.f28952a ? PictureView.this.getMeasuredHeight() : view.getHeight(), this.f28952a ? qa00.m175859d(PictureView.this.f28891H0) : 0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$f */
    public class C8432f extends ViewOutlineProvider {
        public C8432f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PictureView.this.f28935p0 ? 0.0f : qa00.m175859d(20.0f));
        }
    }

    public PictureView(Context context) {
        super(context);
        this.f28914T = -1;
        this.f28916V = -1L;
        this.f28917W = -1L;
        this.f28889G0 = false;
        this.f28891H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28893I0 = C22507a.m222759c(bool);
        this.f28895J0 = C22507a.m222759c(bool);
        this.f28897K0 = new y20() { // from class: l.up70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180228a.m45138Q((Boolean) obj);
            }
        };
        this.f28899L0 = new y20() { // from class: l.wp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190263a.m45139R((Boolean) obj);
            }
        };
        this.f28901M0 = null;
        this.f28903N0 = false;
        this.f28905O0 = adc0.f70524qa;
        this.f28907P0 = 0.2f;
        this.f28909Q0 = 2000;
        this.f28911R0 = new C8429c();
        this.f28913S0 = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m45134C() {
        float fM45136G;
        String square;
        CoreModule.m30934Q().mo68436Zo().mo136902f(true);
        Video videoMo225055clone = (Video) this.f28888G;
        if (videoMo225055clone.size == null && TEnum.equals(videoMo225055clone.status, "raw")) {
            videoMo225055clone = videoMo225055clone.mo225055clone();
            wel0 wel0Var = new wel0(new vel0(oki.m168038z(videoMo225055clone.url)), this.f28892I, false);
            videoMo225055clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            videoMo225055clone.size = new Dimension(wel0Var.m206021m());
            videoMo225055clone.duration = wel0Var.f188702b;
        }
        if (this.f28898L) {
            m45161D(videoMo225055clone);
            fM45136G = m45162F(videoMo225055clone);
        } else {
            m45135E();
            fM45136G = m45136G(videoMo225055clone);
        }
        if (this.f28889G0) {
            square = videoMo225055clone.formatOriginal();
        } else {
            square = this.f28892I ? videoMo225055clone.formatSquare() : videoMo225055clone.formatAspectRatio();
        }
        final String str = square;
        wcl0.m205822c();
        this.f28917W = System.currentTimeMillis();
        final int i = c7y.f80160a;
        boolean zM205822c = wcl0.m205822c();
        this.f28884E.setIsInABGroup(zM205822c);
        this.f28884E.setOnBufferListener(new C8430d(str, i));
        this.f28884E.setNetErrorListener(new y20() { // from class: l.aq70
            @Override // p153l.y20
            public final void call(Object obj) {
                PictureView.m45140a(obj);
            }
        });
        this.f28884E.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.cq70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cbl0.m108642n().m108651u(str));
            }
        }).compose(psd0.m173592C()), videoMo225055clone.duration);
        this.f28884E.m224554s(Uri.parse(uqb0.m197266d0(str)), fM45136G, str, (zM205822c || !videoMo225055clone.url.startsWith("http") || Network.isConnected(CoreModule.f18263b)) ? false : true, R$string.f19605r4, R$string.f19714uk);
        cbl0.m108642n().m108649q(str).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.eq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95311a.m45170P(str, i, (Integer) obj);
            }
        }, new y20() { // from class: l.fq70
            @Override // p153l.y20
            public final void call(Object obj) {
                PictureView.m45143f((Throwable) obj);
            }
        }));
        m45145h0();
    }

    /* JADX INFO: renamed from: E */
    private void m45135E() {
        if (this.f28884E == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f28884E = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f28884E.m224546k(this.f28890H);
            this.f28884E.setId(adc0.f70240Zd);
            if (getMeasuredHeight() > 0) {
                this.f28884E.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f28884E.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f28884E, indexOfChild(this.f28918a) + 1, generateDefaultLayoutParams(), true);
            this.f28884E.getLayoutParams().height = -1;
            this.f28884E.getLayoutParams().width = -1;
            if (NullChecker.m82486a(this.f28884E)) {
                this.f28884E.setOutlineProvider(new C8432f());
                this.f28884E.setClipToOutline(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: G */
    private float m45136G(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m82486a(video.size)) {
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

    /* JADX INFO: renamed from: N */
    private static boolean m45137N() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f28879T0;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f28879T0 = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m45138Q(Boolean bool) {
        this.f28895J0.onNext(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m45139R(Boolean bool) {
        uqi.m197347n(TabName.Card);
        this.f28893I0.onNext(bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45140a(Object obj) {
        if (Network.isConnected(CoreModule.f18263b)) {
            return;
        }
        o1j0.m165635i(R$string.f19605r4, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m45143f(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    private void m45145h0() {
        AudioManager audioManager = (AudioManager) CoreModule.f18263b.getSystemService("audio");
        if (NullChecker.m82486a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: v */
    private Act m45158v() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: w */
    private void m45159w(int i) {
        this.f28905O0 = i;
        for (int i2 = 0; i2 < this.f28924g.getChildCount(); i2++) {
            int id = this.f28924g.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f28924g;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m45160A(boolean z) {
        this.f28912S = false;
        if (NullChecker.m82486a(this.f28884E)) {
            this.f28884E.m224544i(z);
            this.f28884E.animate().cancel();
            this.f28884E.setAlpha(0.0f);
            this.f28884E.setVisibility(4);
            this.f28884E = null;
        }
        m45159w(adc0.f70524qa);
        this.f28924g.animate().cancel();
        this.f28924g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: D */
    public final void m45161D(Video video) {
        Dimension dimensionM45163H = m45163H(video.cover);
        if (this.f28884E == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f28884E = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f28884E.setId(adc0.f70240Zd);
            int i = dimensionM45163H.height;
            int measuredHeight = getMeasuredHeight();
            VTexturePlayer vTexturePlayer2 = this.f28884E;
            boolean z = false;
            if (i >= measuredHeight) {
                vTexturePlayer2.measure(View.MeasureSpec.makeMeasureSpec(dimensionM45163H.width, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionM45163H.height, 1073741824));
                VTexturePlayer vTexturePlayer3 = this.f28884E;
                int measuredHeight2 = getMeasuredHeight();
                int i2 = dimensionM45163H.height;
                vTexturePlayer3.layout(0, (measuredHeight2 - i2) / 2, dimensionM45163H.width, (i2 + getMeasuredHeight()) / 2);
                z = true;
            } else {
                vTexturePlayer2.measure(View.MeasureSpec.makeMeasureSpec(dimensionM45163H.width, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionM45163H.height, 1073741824));
                VTexturePlayer vTexturePlayer4 = this.f28884E;
                int measuredHeight3 = (getMeasuredHeight() - dimensionM45163H.height) / 2;
                int i3 = dimensionM45163H.width;
                int measuredHeight4 = getMeasuredHeight();
                int i4 = dimensionM45163H.height;
                vTexturePlayer4.layout(0, measuredHeight3, i3, ((measuredHeight4 - i4) / 2) + i4);
            }
            addViewInLayout(this.f28884E, indexOfChild(this.f28918a) + 1, generateDefaultLayoutParams(), true);
            this.f28884E.getLayoutParams().height = -1;
            this.f28884E.getLayoutParams().width = -1;
            if (NullChecker.m82486a(this.f28884E)) {
                this.f28884E.setOutlineProvider(new C8431e(z));
                this.f28884E.setClipToOutline(true);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final float m45162F(Video video) {
        Dimension dimensionM45163H = m45163H(video.cover);
        int i = dimensionM45163H.width;
        if (i > 0) {
            return dimensionM45163H.height / i;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Dimension m45163H(Picture picture) {
        Dimension dimension;
        int iM105592y0 = bnl0.m105592y0();
        if (NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM105592y0, iM105592y0);
            }
        } else {
            dimension = new Dimension(iM105592y0, iM105592y0);
        }
        float f = dimension.width / dimension.height;
        m45169O(picture);
        return new Dimension(iM105592y0, (int) (iM105592y0 / f));
    }

    /* JADX INFO: renamed from: I */
    public void m45164I(boolean z) {
        m45165J(z, z);
    }

    /* JADX INFO: renamed from: J */
    public void m45165J(boolean z, boolean z2) {
        m45166K(z, z2, false);
    }

    /* JADX INFO: renamed from: K */
    public void m45166K(boolean z, boolean z2, boolean z3) {
        m45167L(z, z2, z3, false);
    }

    /* JADX INFO: renamed from: L */
    public void m45167L(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28890H = z;
        this.f28892I = z2;
        this.f28894J = z3;
        this.f28896K = z4;
    }

    /* JADX INFO: renamed from: M */
    public void m45168M() {
        this.f28918a.getHierarchy().m207062w(h1e0.f107448e);
        this.f28918a.getHierarchy().m207045H(RoundingParams.m8303c(0.0f));
        this.f28924g.setDescendantFocusability(393216);
        this.f28924g.setClickable(true);
        this.f28924g.setFocusable(true);
        this.f28927j.setAlpha(0.0f);
        this.f28909Q0 = 200;
        this.f28907P0 = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    public final boolean m45169O(Picture picture) {
        Dimension dimension;
        int iM105592y0 = bnl0.m105592y0();
        if (NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM105592y0, iM105592y0);
            }
        } else {
            dimension = new Dimension(iM105592y0, iM105592y0);
        }
        return ((float) dimension.width) / ((float) dimension.height) >= 1.0f;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m45170P(String str, int i, Integer num) {
        c7y.m108345d(this.f28917W, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m45171S() {
        if (NullChecker.m82486a(this.f28884E)) {
            this.f28884E.m224557v();
        }
    }

    /* JADX INFO: renamed from: T */
    public int m45172T() {
        float f = this.f28913S0;
        if (f == -1.0f || f >= getWidth() / 8) {
            return ((double) this.f28913S0) > ((double) (getWidth() * 5)) / 5.7d ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public void m45173U() {
        this.f28912S = false;
        if (NullChecker.m82486a(this.f28884E)) {
            this.f28924g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f28884E.m224553r();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m45174V() {
        if (gra.m131756u2() && bnl0.m105529O0(this.f28938s)) {
            return;
        }
        this.f28912S = true;
        this.f28924g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (this.f28888G instanceof Video) {
            pb1.m171472b().mo171477f("PlayerView", AudioBusinessType.NORMAL, this.f28911R0);
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m45175W() {
        VTexturePlayer vTexturePlayer = this.f28884E;
        return vTexturePlayer != null && vTexturePlayer.m224556u();
    }

    /* JADX INFO: renamed from: X */
    public void m45176X(Media media) {
        m45177Y(media, -1);
    }

    /* JADX INFO: renamed from: Y */
    public void m45177Y(Media media, int i) {
        m45178Z(media, i, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m45178Z(Media media, int i, boolean z) {
        m45179a0(media, i, z, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m45179a0(Media media, int i, boolean z, boolean z2) {
        m45180b0(media, i, z, z2, false);
    }

    @Override // p153l.eam
    /* JADX INFO: renamed from: b */
    public void mo37118b(boolean z) {
        if (z) {
            m45194x(true);
        } else {
            m45173U();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m45180b0(Media media, int i, boolean z, boolean z2, boolean z3) {
        Picture.ImageUri imageUriM164968f;
        bnl0.m105524M(this.f28918a, true);
        bnl0.m105524M(this.f28919b, false);
        if (this.f28901M0 != null && this.f28903N0) {
            ix60 ix60Var = ix60.INSTANCE;
            if (ix60Var.m142480k() > 0) {
                List<MediaLabel> list = media.labels;
                m45191n0(this.f28901M0.booleanValue(), NullChecker.m82486a(list) && ix60Var.m142484o(list));
            }
        }
        this.f28914T = i;
        if (!media.equals(this.f28888G) && NullChecker.m82486a(this.f28884E)) {
            this.f28884E.setVisibility(4);
            this.f28884E.m224544i(false);
        }
        this.f28887F0 = z2;
        this.f28888G = media;
        boolean z4 = this.f28898L;
        this.f28898L = false;
        this.f28906P = z2;
        if (!TEnum.equals(media.status, "raw")) {
            boolean z5 = media instanceof Video;
            if (!z5 || this.f28890H) {
                imageUriM164968f = this.f28890H ? nwb.m164968f(this.f28888G) : null;
            } else {
                imageUriM164968f = media.cover().aspectRatioBiggest();
            }
            if (imageUriM164968f == null) {
                wtq0.m207906a("not supported yet");
                return;
            }
            C8428b c8428b = new C8428b();
            if (i >= 0 && i < 100) {
                pf60<Integer, Integer> pf60VarM51467z = C8772a.m51467z(i);
                uqb0.f180374G.m127120O(this.f28918a, imageUriM164968f.formatted(), pf60VarM51467z.f152156a.intValue(), pf60VarM51467z.f152157b.intValue());
            } else if (z) {
                uqb0.f180374G.m127124Q(this.f28918a, imageUriM164968f.formatted(), 2, z3 ? 16 : 32, Color.parseColor("#4c000000"), c8428b);
            } else {
                uqb0.f180374G.m127103F0(this.f28918a, imageUriM164968f, (z5 || !this.f28890H) ? this.f28915U : "profile", c8428b);
            }
        } else {
            if (!(media instanceof Video)) {
                wtq0.m207906a("not supported yet");
                return;
            }
            uqb0.f180374G.m127148k0(this.f28918a, media.url);
        }
        if (!(media instanceof Video) || z || z2) {
            this.f28924g.setVisibility(4);
        } else {
            this.f28924g.setVisibility(0);
        }
        if (z4) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m45181c0(Media media, boolean z) {
        m45178Z(media, -1, z);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        this.f28924g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m82486a(this.f28884E) && this.f28884E.getAlpha() != 0.0f) {
            this.f28884E.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m45159w(adc0.f70524qa);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.mo37119d();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m45182d0(Media media, boolean z) {
        m45183e0(media, z, false);
    }

    /* JADX INFO: renamed from: e0 */
    public void m45183e0(Media media, boolean z, boolean z2) {
        if (media == null) {
            return;
        }
        this.f28906P = z;
        boolean z3 = this.f28898L;
        this.f28898L = true;
        bnl0.m105524M(this.f28918a, true);
        bnl0.m105524M(this.f28919b, false);
        this.f28914T = -1;
        if (!media.equals(this.f28888G) && NullChecker.m82486a(this.f28884E)) {
            this.f28884E.setVisibility(4);
            this.f28884E.m224544i(false);
        }
        this.f28888G = media;
        m45184f0(media, z2);
        boolean z4 = media instanceof Video;
        VFrame_ColorFilter vFrame_ColorFilter = this.f28924g;
        if (z4) {
            vFrame_ColorFilter.setVisibility(0);
        } else {
            vFrame_ColorFilter.setVisibility(4);
        }
        if (z3) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m45184f0(Media media, boolean z) {
        Picture picture;
        int iM175859d = 0;
        m45187j0(true, false);
        boolean z2 = media instanceof Picture;
        boolean z3 = media instanceof Video;
        if (z2) {
            picture = (Picture) media;
        } else {
            picture = z3 ? ((Video) media).cover : null;
        }
        if (picture == null) {
            return;
        }
        if (TEnum.equals(media.status, "raw")) {
            if (media instanceof Video) {
                uqb0.f180374G.m127148k0(this.f28918a, media.url);
                return;
            } else {
                wtq0.m207906a("not supported yet");
                return;
            }
        }
        C8427a c8427a = new C8427a();
        String str = ((media instanceof Video) || !this.f28890H) ? this.f28915U : "profile";
        Dimension dimensionM45163H = m45163H(picture);
        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(picture.size.width);
        if (z) {
            uqb0.f180374G.m127124Q(this.f28918a, imageUriCalculatedWidth.formatted(), 2, 32, Color.parseColor("#4c000000"), c8427a);
            return;
        }
        int i = dimensionM45163H.height;
        int measuredHeight = getMeasuredHeight();
        VDraweeView vDraweeView = this.f28919b;
        if (i >= measuredHeight) {
            bnl0.m105524M(vDraweeView, false);
            uqb0.f180374G.m127103F0(this.f28918a, imageUriCalculatedWidth, str, c8427a);
            iM175859d = qa00.m175859d(20.0f);
        } else {
            bnl0.m105524M(vDraweeView, true);
            if (z2) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28919b.getLayoutParams();
                layoutParams.width = dimensionM45163H.width;
                layoutParams.height = dimensionM45163H.height;
                if (m45169O(picture)) {
                    if (NullChecker.m82487b(picture.size)) {
                        Dimension dimension = picture.size;
                        int i2 = dimension.height;
                        int i3 = dimension.width;
                    }
                    layoutParams.gravity = 48;
                    layoutParams.topMargin = (Math.abs(layoutParams.width - layoutParams.height) / 2) + qa00.m175859d(30.0f);
                } else {
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = 16;
                }
                this.f28919b.setLayoutParams(layoutParams);
                uqb0.f180374G.m127124Q(this.f28918a, imageUriCalculatedWidth.formatted(), 2, 15, getResources().getColor(c9c0.f80431k0), c8427a);
            } else if (z3) {
                bnl0.m105524M(this.f28919b, false);
                uqb0.f180374G.m127138Y0(this.f28918a, dbc0.f86024Bf);
            }
            uqb0.f180374G.m127103F0(this.f28919b, imageUriCalculatedWidth, str, c8427a);
        }
        RoundingParams roundingParamsM207055p = this.f28919b.getHierarchy().m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = new RoundingParams();
        }
        roundingParamsM207055p.m8319s(iM175859d);
        this.f28919b.getHierarchy().m207045H(roundingParamsM207055p);
    }

    /* JADX INFO: renamed from: g0 */
    public void m45185g0(Media media) {
        m45180b0(media, -1, true, false, true);
    }

    public String getFrom() {
        return this.f28915U;
    }

    public Bitmap getPictureBitmap() {
        if (this.f28918a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f28918a.getDrawable()).getBitmap();
        }
        return null;
    }

    public View getVideoDisplayView() {
        return this.f28884E;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m45159w(adc0.f69897F7);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.mo37120h();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m45186i0() {
        C22507a<Boolean> c22507a = this.f28893I0;
        Boolean bool = Boolean.FALSE;
        c22507a.onNext(bool);
        this.f28895J0.onNext(bool);
    }

    /* JADX INFO: renamed from: j0 */
    public void m45187j0(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        rc80 rc80Var;
        RoundingParams roundingParamsM207055p = this.f28918a.getHierarchy().m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = new RoundingParams();
        }
        int i4 = qa00.f156328o;
        boolean z3 = yti0.m217322b().m217331h() && z2;
        if (z3) {
            i = qa00.f156323j;
            i2 = qa00.f156327n;
        } else {
            i = i4;
            i2 = i;
        }
        if (z) {
            float f = i;
            float f2 = i2;
            roundingParamsM207055p.m8318r(f, f, f2, f2);
        } else {
            float f3 = i;
            roundingParamsM207055p.m8318r(f3, f3, 0.0f, 0.0f);
        }
        this.f28918a.getHierarchy().m207045H(roundingParamsM207055p);
        wlj hierarchy = this.f28918a.getHierarchy();
        if (z3) {
            i3 = dbc0.f87237n2;
        } else {
            i3 = z ? dbc0.f87561x : dbc0.f87270o2;
        }
        hierarchy.m207065z(i3);
        wlj hierarchy2 = this.f28918a.getHierarchy();
        if (z) {
            rc80Var = new rc80(z3 ? qa00.f156323j : i4);
        } else {
            rc80Var = new rc80(z3 ? qa00.f156323j : i4, 3);
        }
        hierarchy2.m207042E(rc80Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m45188k0() {
        this.f28935p0 = true;
    }

    /* JADX INFO: renamed from: l0 */
    public void m45189l0() {
        RoundingParams roundingParamsM207055p = this.f28918a.getHierarchy().m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = new RoundingParams();
        }
        roundingParamsM207055p.m8319s(0.0f);
        this.f28918a.getHierarchy().m207045H(roundingParamsM207055p);
        this.f28918a.getHierarchy().m207065z(dbc0.f87204m2);
        this.f28918a.getHierarchy().m207042E(new rc80(0.0f));
    }

    /* JADX INFO: renamed from: m0 */
    public void m45190m0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            bnl0.m105524M(childAt, childAt == this.f28918a);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m45191n0(boolean z, boolean z2) {
        if (!z2) {
            bnl0.m105524M(this.f28883D, false);
            return;
        }
        ix60 ix60Var = ix60.INSTANCE;
        ix60Var.m142438A();
        bnl0.m105524M(this.f28883D, true);
        ix60Var.m142447J(this.f28883D, z, false);
    }

    /* JADX INFO: renamed from: o0 */
    public void m45192o0() {
        Animator animatorM132168n = gt0.m132168n(this.f28883D, gt0.f106354i, 1.2f, 1.0f);
        animatorM132168n.setDuration(800L);
        animatorM132168n.setStartDelay(300L);
        animatorM132168n.start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m45137N()) {
            return;
        }
        int i = this.f28914T;
        if (i < 0 || i >= 100) {
            int i2 = this.f28905O0;
            if (i2 == adc0.f70524qa) {
                m45174V();
            } else if (i2 == adc0.f70574t9) {
                m45173U();
            } else if (i2 == adc0.f69897F7) {
                m45173U();
            }
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        this.f28884E.m224557v();
        this.f28924g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f28884E.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.yp70
            @Override // java.lang.Runnable
            public final void run() {
                this.f201047a.m45171S();
            }
        }, 400L);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.onComplete();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("play video error " + this.f28890H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45193u(this);
        this.f28924g.setOnClickListener(this);
        if (NullChecker.m82486a(this.f28931m)) {
            this.f28931m.setBackgroundDrawable(jde.m144406b(m45158v().color(c9c0.f80326C1), qa00.m175859d(6.0f)));
        }
        if (NullChecker.m82486a(this.f28932n)) {
            this.f28932n.setBackgroundDrawable(jde.m144406b(m45158v().color(c9c0.f80326C1), qa00.m175859d(6.0f)));
        }
        if (NullChecker.m82486a(this.f28933o)) {
            this.f28933o.setBackgroundDrawable(jde.m144406b(m45158v().color(c9c0.f80326C1), qa00.m175859d(6.0f)));
        }
        this.f28918a.getHierarchy().m207042E(new rc80(qa00.f156328o));
        this.f28919b.setAspectRatio(1.0f);
        if (d79.m114675e0()) {
            this.f28923f.setGravity(1);
            VText vText = this.f28923f;
            int i = qa00.f156321h;
            vText.setPadding(i, 0, i, 0);
            this.f28923f.setText(m45158v().getString(R$string.f19672t9));
            this.f28922e.setBackgroundResource(dbc0.f86274J9);
        }
        if (gra.m131778z()) {
            this.f28925h.setImageDrawable(getResources().getDrawable(dbc0.f86581Ss));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        int iM164966d;
        if (this.f28892I) {
            int iM173642a = psh0.m173642a(i, i2);
            super.onMeasure(iM173642a, iM173642a);
            return;
        }
        if (this.f28904O) {
            int iM117366d = dox.m117366d(i);
            int iM117366d2 = dox.m117366d(i2);
            int i3 = (int) (((double) iM117366d) / 0.67d);
            if (i3 < iM117366d2) {
                super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(Math.min(i3, iM117366d2 - qa00.f156328o)));
                return;
            } else {
                super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(iM117366d2));
                return;
            }
        }
        if (this.f28898L || this.f28900M || this.f28902N) {
            super.onMeasure(dox.m117364b(dox.m117366d(i)), dox.m117364b(dox.m117366d(i2)));
            return;
        }
        if (!this.f28894J) {
            super.onMeasure(i, i2);
            return;
        }
        int iM117366d3 = dox.m117366d(i);
        int iM117366d4 = dox.m117366d(i2);
        if (gra.m131550C2() && this.f28896K) {
            iM117366d4 = Math.max(iM117366d4 - qa00.f156294G, 0);
            iM164966d = (int) (((double) iM117366d3) / nwb.m164966d());
        } else {
            if (this.f28885E0) {
                f = iM117366d3;
                f2 = 0.5f;
            } else {
                f = iM117366d3;
                f2 = 0.6f;
            }
            iM164966d = (int) (f / f2);
        }
        if (iM164966d < iM117366d4) {
            super.onMeasure(dox.m117364b(iM117366d3), dox.m117364b(Math.min(iM164966d, iM117366d4 - qa00.f156328o)));
        } else {
            super.onMeasure(dox.m117364b(iM117366d3), dox.m117364b(iM117366d4));
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        CoreModule.m30934Q().mo68436Zo().mo136902f(false);
        if (g4a.m128859c() || IntlCountryCodeController.m29125v()) {
            bnl0.m105525M0(this.f28884E, false);
        }
        m45159w(adc0.f70524qa);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.onPause();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        this.f28924g.animate().alpha(this.f28907P0).setDuration(this.f28909Q0).start();
        m45159w(adc0.f70574t9);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f28913S0 = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdjustAspectRateByPictureSize(boolean z) {
        this.f28910R = z;
    }

    public void setAspectRateFitWidth(float f) {
        this.f28908Q = f;
    }

    public void setFrom(String str) {
        this.f28915U = str;
    }

    public void setIsFemale(boolean z) {
        this.f28901M0 = Boolean.valueOf(z);
    }

    public void setMomentCardSilent(boolean z) {
        this.f28906P = z;
        this.f28884E.setVolume(z);
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22698b interfaceC22698b) {
        this.f28886F = interfaceC22698b;
    }

    public void setRadius(float f) {
        if (this.f28918a.getHierarchy() == null || this.f28918a.getHierarchy().m207055p() == null) {
            return;
        }
        RoundingParams roundingParamsM207055p = this.f28918a.getHierarchy().m207055p();
        roundingParamsM207055p.m8318r(f, f, f, f);
        this.f28918a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f28928k) && this.f28928k.getVisibility() == 0) {
            float f2 = -this.f28928k.getLeft();
            if (this.f28928k.getPivotX() != f2) {
                this.f28928k.setPivotX(f2);
            }
            this.f28928k.setScaleX(1.0f / f);
        }
        if (NullChecker.m82486a(this.f28924g) && this.f28924g.getVisibility() == 0) {
            float f3 = -this.f28924g.getLeft();
            if (this.f28924g.getPivotX() != f3) {
                this.f28924g.setPivotX(f3);
            }
            this.f28924g.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f28928k) && this.f28928k.getVisibility() == 0) {
            float height = this.f28928k.getHeight() - this.f28928k.getBottom();
            if (this.f28928k.getPivotY() != height) {
                this.f28928k.setPivotY(height);
            }
            this.f28928k.setScaleY(1.0f / f);
        }
        if (NullChecker.m82486a(this.f28924g) && this.f28924g.getVisibility() == 0) {
            float height2 = getHeight() - this.f28924g.getTop();
            if (this.f28924g.getPivotY() != height2) {
                this.f28924g.setPivotY(height2);
            }
            this.f28924g.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    public void setShowPetTag(boolean z) {
        this.f28903N0 = z;
    }

    public void setTopRadius(float f) {
        if (this.f28918a.getHierarchy() == null || this.f28918a.getHierarchy().m207055p() == null) {
            return;
        }
        RoundingParams roundingParamsM207055p = this.f28918a.getHierarchy().m207055p();
        roundingParamsM207055p.m8318r(f, f, 0.0f, 0.0f);
        this.f28918a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    public void setVideoViewRadius(int i) {
        this.f28891H0 = i;
    }

    /* JADX INFO: renamed from: u */
    public final void m45193u(View view) {
        hq70.m136603a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public void m45194x(boolean z) {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        this.f28912S = false;
        if (NullChecker.m82486a(this.f28884E)) {
            this.f28884E.m224544i(z);
            this.f28884E.animate().cancel();
            this.f28884E.setAlpha(0.0f);
            this.f28884E.setVisibility(4);
        }
        bnl0.m105524M(this.f28883D, false);
        this.f28901M0 = null;
        this.f28903N0 = false;
        uqb0.f180374G.m98798o(this.f28918a);
        this.f28918a.setVisibility(0);
        m45159w(adc0.f70524qa);
        this.f28924g.animate().cancel();
        this.f28924g.setAlpha(1.0f);
        this.f28884E = null;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        if (this.f28898L || this.f28887F0) {
            this.f28884E.setVolume(this.f28906P);
        }
        this.f28884E.setVisibility(0);
        if (this.f28884E.getAlpha() < 1.0f) {
            this.f28884E.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f28924g.animate().alpha(this.f28907P0).setDuration(this.f28909Q0).setInterpolator(new LinearInterpolator()).start();
        m45159w(adc0.f70574t9);
        if (NullChecker.m82486a(this.f28886F)) {
            this.f28886F.mo37130y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m45195z() {
        this.f28912S = false;
        if (NullChecker.m82486a(this.f28884E)) {
            this.f28884E.m224545j();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28914T = -1;
        this.f28916V = -1L;
        this.f28917W = -1L;
        this.f28889G0 = false;
        this.f28891H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28893I0 = C22507a.m222759c(bool);
        this.f28895J0 = C22507a.m222759c(bool);
        this.f28897K0 = new y20() { // from class: l.up70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180228a.m45138Q((Boolean) obj);
            }
        };
        this.f28899L0 = new y20() { // from class: l.wp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190263a.m45139R((Boolean) obj);
            }
        };
        this.f28901M0 = null;
        this.f28903N0 = false;
        this.f28905O0 = adc0.f70524qa;
        this.f28907P0 = 0.2f;
        this.f28909Q0 = 2000;
        this.f28911R0 = new C8429c();
        this.f28913S0 = -1.0f;
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28914T = -1;
        this.f28916V = -1L;
        this.f28917W = -1L;
        this.f28889G0 = false;
        this.f28891H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28893I0 = C22507a.m222759c(bool);
        this.f28895J0 = C22507a.m222759c(bool);
        this.f28897K0 = new y20() { // from class: l.up70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180228a.m45138Q((Boolean) obj);
            }
        };
        this.f28899L0 = new y20() { // from class: l.wp70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190263a.m45139R((Boolean) obj);
            }
        };
        this.f28901M0 = null;
        this.f28903N0 = false;
        this.f28905O0 = adc0.f70524qa;
        this.f28907P0 = 0.2f;
        this.f28909Q0 = 2000;
        this.f28911R0 = new C8429c();
        this.f28913S0 = -1.0f;
    }
}
