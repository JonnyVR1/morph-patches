package com.p046p1.mobile.putong.core.p053ui;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VTexturePlayer;
import p149l.bi70;
import p149l.bt0;
import p149l.cp60;
import p149l.djj;
import p149l.e30;
import p149l.fce;
import p149l.ffx;
import p149l.ftd0;
import p149l.fyx;
import p149l.ib1;
import p149l.ikh0;
import p149l.j760;
import p149l.l480;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ngm;
import p149l.o7m;
import p149l.osi0;
import p149l.qib0;
import p149l.qkq0;
import p149l.r3l0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.t100;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.v2a;
import p149l.w0c0;
import p149l.x1l0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yki0;
import p149l.ym2;
import p149l.yni;
import p149l.z91;
import p149l.zub;

/* JADX INFO: loaded from: classes6.dex */
public class PictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22583b, o7m {

    /* JADX INFO: renamed from: T0 */
    public static long f28031T0;

    /* JADX INFO: renamed from: A */
    public LinearLayout f28032A;

    /* JADX INFO: renamed from: B */
    public View f28033B;

    /* JADX INFO: renamed from: C */
    public ImageView f28034C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f28035D;

    /* JADX INFO: renamed from: E */
    public VTexturePlayer f28036E;

    /* JADX INFO: renamed from: E0 */
    public boolean f28037E0;

    /* JADX INFO: renamed from: F */
    public VTexturePlayer.InterfaceC22583b f28038F;

    /* JADX INFO: renamed from: F0 */
    public boolean f28039F0;

    /* JADX INFO: renamed from: G */
    public Media f28040G;

    /* JADX INFO: renamed from: G0 */
    public boolean f28041G0;

    /* JADX INFO: renamed from: H */
    public boolean f28042H;

    /* JADX INFO: renamed from: H0 */
    public int f28043H0;

    /* JADX INFO: renamed from: I */
    public boolean f28044I;

    /* JADX INFO: renamed from: I0 */
    public C22392a<Boolean> f28045I0;

    /* JADX INFO: renamed from: J */
    public boolean f28046J;

    /* JADX INFO: renamed from: J0 */
    public C22392a<Boolean> f28047J0;

    /* JADX INFO: renamed from: K */
    public boolean f28048K;

    /* JADX INFO: renamed from: K0 */
    public e30<Boolean> f28049K0;

    /* JADX INFO: renamed from: L */
    public boolean f28050L;

    /* JADX INFO: renamed from: L0 */
    public e30<Boolean> f28051L0;

    /* JADX INFO: renamed from: M */
    public boolean f28052M;

    /* JADX INFO: renamed from: M0 */
    public Boolean f28053M0;

    /* JADX INFO: renamed from: N */
    public boolean f28054N;

    /* JADX INFO: renamed from: N0 */
    public boolean f28055N0;

    /* JADX INFO: renamed from: O */
    public boolean f28056O;

    /* JADX INFO: renamed from: O0 */
    public int f28057O0;

    /* JADX INFO: renamed from: P */
    public boolean f28058P;

    /* JADX INFO: renamed from: P0 */
    public float f28059P0;

    /* JADX INFO: renamed from: Q */
    public float f28060Q;

    /* JADX INFO: renamed from: Q0 */
    public int f28061Q0;

    /* JADX INFO: renamed from: R */
    public boolean f28062R;

    /* JADX INFO: renamed from: R0 */
    public final z91 f28063R0;

    /* JADX INFO: renamed from: S */
    public boolean f28064S;

    /* JADX INFO: renamed from: S0 */
    public float f28065S0;

    /* JADX INFO: renamed from: T */
    public int f28066T;

    /* JADX INFO: renamed from: U */
    public String f28067U;

    /* JADX INFO: renamed from: V */
    public long f28068V;

    /* JADX INFO: renamed from: W */
    public long f28069W;

    /* JADX INFO: renamed from: a */
    public VDraweeView f28070a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28071b;

    /* JADX INFO: renamed from: c */
    public View f28072c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28073d;

    /* JADX INFO: renamed from: e */
    public VImage f28074e;

    /* JADX INFO: renamed from: f */
    public VText f28075f;

    /* JADX INFO: renamed from: g */
    public VFrame_ColorFilter f28076g;

    /* JADX INFO: renamed from: h */
    public VImage f28077h;

    /* JADX INFO: renamed from: i */
    public VProgressBar f28078i;

    /* JADX INFO: renamed from: j */
    public VImage f28079j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f28080k;

    /* JADX INFO: renamed from: k0 */
    public boolean f28081k0;

    /* JADX INFO: renamed from: l */
    public VText f28082l;

    /* JADX INFO: renamed from: m */
    public VText f28083m;

    /* JADX INFO: renamed from: n */
    public VImage f28084n;

    /* JADX INFO: renamed from: o */
    public VText f28085o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f28086p;

    /* JADX INFO: renamed from: p0 */
    public boolean f28087p0;

    /* JADX INFO: renamed from: q */
    public VText f28088q;

    /* JADX INFO: renamed from: r */
    public VText f28089r;

    /* JADX INFO: renamed from: s */
    public VLinear f28090s;

    /* JADX INFO: renamed from: t */
    public VImage f28091t;

    /* JADX INFO: renamed from: u */
    public VText f28092u;

    /* JADX INFO: renamed from: v */
    public VText f28093v;

    /* JADX INFO: renamed from: w */
    public VImage f28094w;

    /* JADX INFO: renamed from: x */
    public VText f28095x;

    /* JADX INFO: renamed from: y */
    public RelativeLayout f28096y;

    /* JADX INFO: renamed from: z */
    public VButton f28097z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$a */
    public class C8264a extends ym2 {
        public C8264a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            e30 e30Var = PictureView.this.f28051L0;
            Boolean bool = Boolean.FALSE;
            e30Var.call(bool);
            PictureView.this.f28049K0.call(bool);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            e30 e30Var = PictureView.this.f28051L0;
            Boolean bool = Boolean.TRUE;
            e30Var.call(bool);
            PictureView.this.f28049K0.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$b */
    public class C8265b extends ym2 {
        public C8265b() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            e30 e30Var = PictureView.this.f28051L0;
            Boolean bool = Boolean.FALSE;
            e30Var.call(bool);
            PictureView.this.f28049K0.call(bool);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            e30 e30Var = PictureView.this.f28051L0;
            Boolean bool = Boolean.TRUE;
            e30Var.call(bool);
            PictureView.this.f28049K0.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$c */
    public class C8266c implements z91 {
        public C8266c() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            PictureView.this.mo36116d();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                PictureView.this.m43951C();
            }
        }

        @Override // p149l.z91
        public void success() {
            PictureView.this.m43951C();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$d */
    public class C8267d implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f28101a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28102b;

        public C8267d(String str, int i) {
            this.f28101a = str;
            this.f28102b = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            PictureView.this.f28068V = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(PictureView.this.f28069W, System.currentTimeMillis(), this.f28101a, this.f28102b);
            PictureView.this.f28036E.setLooping(PictureView.this.f28050L || PictureView.this.f28039F0);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(CoreModule.f17544b), this.f28101a, this.f28102b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (PictureView.this.f28068V == -1 || !NullChecker.m81303a(PictureView.this.f28040G)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PictureView.this.f28068V >= 200) {
                TrackMediaUploadUtil.m80310h0(jCurrentTimeMillis - PictureView.this.f28068V, PictureView.this.f28042H ? "profile" : PictureView.this.f28067U, this.f28101a);
                fyx.m123808b(PictureView.this.f28068V, jCurrentTimeMillis, this.f28101a, this.f28102b);
            }
            PictureView.this.f28068V = -1L;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$e */
    public class C8268e extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f28104a;

        public C8268e(boolean z) {
            this.f28104a = z;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, this.f28104a ? (view.getHeight() - PictureView.this.getMeasuredHeight()) / 2 : 0, this.f28104a ? PictureView.this.getMeasuredWidth() : view.getWidth(), this.f28104a ? PictureView.this.getMeasuredHeight() : view.getHeight(), this.f28104a ? t100.m186890d(PictureView.this.f28043H0) : 0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PictureView$f */
    public class C8269f extends ViewOutlineProvider {
        public C8269f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PictureView.this.f28087p0 ? 0.0f : t100.m186890d(20.0f));
        }
    }

    public PictureView(Context context) {
        super(context);
        this.f28066T = -1;
        this.f28068V = -1L;
        this.f28069W = -1L;
        this.f28041G0 = false;
        this.f28043H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28045I0 = C22392a.m221513c(bool);
        this.f28047J0 = C22392a.m221513c(bool);
        this.f28049K0 = new e30() { // from class: l.oh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143958a.m43955Q((Boolean) obj);
            }
        };
        this.f28051L0 = new e30() { // from class: l.qh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154433a.m43956R((Boolean) obj);
            }
        };
        this.f28053M0 = null;
        this.f28055N0 = false;
        this.f28057O0 = u4c0.f174399oa;
        this.f28059P0 = 0.2f;
        this.f28061Q0 = 2000;
        this.f28063R0 = new C8266c();
        this.f28065S0 = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m43951C() {
        float fM43953G;
        String square;
        CoreModule.m29936Q().mo67253Zo().mo111895f(true);
        Video videoMo223809clone = (Video) this.f28040G;
        if (videoMo223809clone.size == null && TEnum.equals(videoMo223809clone.status, "raw")) {
            videoMo223809clone = videoMo223809clone.mo223809clone();
            s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(videoMo223809clone.url)), this.f28044I, false);
            videoMo223809clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            videoMo223809clone.size = new Dimension(s5l0Var.m182364m());
            videoMo223809clone.duration = s5l0Var.f162561b;
        }
        if (this.f28050L) {
            m43978D(videoMo223809clone);
            fM43953G = m43979F(videoMo223809clone);
        } else {
            m43952E();
            fM43953G = m43953G(videoMo223809clone);
        }
        if (this.f28041G0) {
            square = videoMo223809clone.formatOriginal();
        } else {
            square = this.f28044I ? videoMo223809clone.formatSquare() : videoMo223809clone.formatAspectRatio();
        }
        final String str = square;
        r3l0.m177674c();
        this.f28069W = System.currentTimeMillis();
        final int i = fyx.f99914a;
        boolean zM177674c = r3l0.m177674c();
        this.f28036E.setIsInABGroup(zM177674c);
        this.f28036E.setOnBufferListener(new C8267d(str, i));
        this.f28036E.setNetErrorListener(new e30() { // from class: l.uh70
            @Override // p149l.e30
            public final void call(Object obj) {
                PictureView.m43957a(obj);
            }
        });
        this.f28036E.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.wh70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(x1l0.m206744n().m206753u(str));
            }
        }).compose(mkd0.m154951C()), videoMo223809clone.duration);
        this.f28036E.m223308s(Uri.parse(qib0.m174812d0(str)), fM43953G, str, (zM177674c || !videoMo223809clone.url.startsWith("http") || Network.isConnected(CoreModule.f17544b)) ? false : true, R$string.f18813p4, R$string.f18306Yj);
        x1l0.m206744n().m206751q(str).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.yh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198279a.m43987P(str, i, (Integer) obj);
            }
        }, new e30() { // from class: l.zh70
            @Override // p149l.e30
            public final void call(Object obj) {
                PictureView.m43960f((Throwable) obj);
            }
        }));
        m43962h0();
    }

    /* JADX INFO: renamed from: E */
    private void m43952E() {
        if (this.f28036E == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f28036E = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f28036E.m223300k(this.f28042H);
            this.f28036E.setId(u4c0.f174101Wd);
            if (getMeasuredHeight() > 0) {
                this.f28036E.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f28036E.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f28036E, indexOfChild(this.f28070a) + 1, generateDefaultLayoutParams(), true);
            this.f28036E.getLayoutParams().height = -1;
            this.f28036E.getLayoutParams().width = -1;
            if (NullChecker.m81303a(this.f28036E)) {
                this.f28036E.setOutlineProvider(new C8269f());
                this.f28036E.setClipToOutline(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: G */
    private float m43953G(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m81303a(video.size)) {
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

    /* JADX INFO: renamed from: N */
    private static boolean m43954N() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f28031T0;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f28031T0 = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m43955Q(Boolean bool) {
        this.f28047J0.onNext(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m43956R(Boolean bool) {
        yni.m215425n(TabName.Card);
        this.f28045I0.onNext(bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43957a(Object obj) {
        if (Network.isConnected(CoreModule.f17544b)) {
            return;
        }
        lsi0.m151579i(R$string.f18813p4, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m43960f(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    private void m43962h0() {
        AudioManager audioManager = (AudioManager) CoreModule.f17544b.getSystemService("audio");
        if (NullChecker.m81303a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: v */
    private Act m43975v() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: w */
    private void m43976w(int i) {
        this.f28057O0 = i;
        for (int i2 = 0; i2 < this.f28076g.getChildCount(); i2++) {
            int id = this.f28076g.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f28076g;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m43977A(boolean z) {
        this.f28064S = false;
        if (NullChecker.m81303a(this.f28036E)) {
            this.f28036E.m223298i(z);
            this.f28036E.animate().cancel();
            this.f28036E.setAlpha(0.0f);
            this.f28036E.setVisibility(4);
            this.f28036E = null;
        }
        m43976w(u4c0.f174399oa);
        this.f28076g.animate().cancel();
        this.f28076g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: D */
    public final void m43978D(Video video) {
        Dimension dimensionM43980H = m43980H(video.cover);
        if (this.f28036E == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f28036E = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f28036E.setId(u4c0.f174101Wd);
            int i = dimensionM43980H.height;
            int measuredHeight = getMeasuredHeight();
            VTexturePlayer vTexturePlayer2 = this.f28036E;
            boolean z = false;
            if (i >= measuredHeight) {
                vTexturePlayer2.measure(View.MeasureSpec.makeMeasureSpec(dimensionM43980H.width, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionM43980H.height, 1073741824));
                VTexturePlayer vTexturePlayer3 = this.f28036E;
                int measuredHeight2 = getMeasuredHeight();
                int i2 = dimensionM43980H.height;
                vTexturePlayer3.layout(0, (measuredHeight2 - i2) / 2, dimensionM43980H.width, (i2 + getMeasuredHeight()) / 2);
                z = true;
            } else {
                vTexturePlayer2.measure(View.MeasureSpec.makeMeasureSpec(dimensionM43980H.width, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionM43980H.height, 1073741824));
                VTexturePlayer vTexturePlayer4 = this.f28036E;
                int measuredHeight3 = (getMeasuredHeight() - dimensionM43980H.height) / 2;
                int i3 = dimensionM43980H.width;
                int measuredHeight4 = getMeasuredHeight();
                int i4 = dimensionM43980H.height;
                vTexturePlayer4.layout(0, measuredHeight3, i3, ((measuredHeight4 - i4) / 2) + i4);
            }
            addViewInLayout(this.f28036E, indexOfChild(this.f28070a) + 1, generateDefaultLayoutParams(), true);
            this.f28036E.getLayoutParams().height = -1;
            this.f28036E.getLayoutParams().width = -1;
            if (NullChecker.m81303a(this.f28036E)) {
                this.f28036E.setOutlineProvider(new C8268e(z));
                this.f28036E.setClipToOutline(true);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final float m43979F(Video video) {
        Dimension dimensionM43980H = m43980H(video.cover);
        int i = dimensionM43980H.width;
        if (i > 0) {
            return dimensionM43980H.height / i;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Dimension m43980H(Picture picture) {
        Dimension dimension;
        int iM208412y0 = xdl0.m208412y0();
        if (NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM208412y0, iM208412y0);
            }
        } else {
            dimension = new Dimension(iM208412y0, iM208412y0);
        }
        float f = dimension.width / dimension.height;
        m43986O(picture);
        return new Dimension(iM208412y0, (int) (iM208412y0 / f));
    }

    /* JADX INFO: renamed from: I */
    public void m43981I(boolean z) {
        m43982J(z, z);
    }

    /* JADX INFO: renamed from: J */
    public void m43982J(boolean z, boolean z2) {
        m43983K(z, z2, false);
    }

    /* JADX INFO: renamed from: K */
    public void m43983K(boolean z, boolean z2, boolean z3) {
        m43984L(z, z2, z3, false);
    }

    /* JADX INFO: renamed from: L */
    public void m43984L(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28042H = z;
        this.f28044I = z2;
        this.f28046J = z3;
        this.f28048K = z4;
    }

    /* JADX INFO: renamed from: M */
    public void m43985M() {
        this.f28070a.getHierarchy().m112076w(ftd0.f99181e);
        this.f28070a.getHierarchy().m112053H(RoundingParams.m8249c(0.0f));
        this.f28076g.setDescendantFocusability(393216);
        this.f28076g.setClickable(true);
        this.f28076g.setFocusable(true);
        this.f28079j.setAlpha(0.0f);
        this.f28061Q0 = 200;
        this.f28059P0 = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    public final boolean m43986O(Picture picture) {
        Dimension dimension;
        int iM208412y0 = xdl0.m208412y0();
        if (NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM208412y0, iM208412y0);
            }
        } else {
            dimension = new Dimension(iM208412y0, iM208412y0);
        }
        return ((float) dimension.width) / ((float) dimension.height) >= 1.0f;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m43987P(String str, int i, Integer num) {
        fyx.m123810d(this.f28069W, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m43988S() {
        if (NullChecker.m81303a(this.f28036E)) {
            this.f28036E.m223311v();
        }
    }

    /* JADX INFO: renamed from: T */
    public int m43989T() {
        float f = this.f28065S0;
        if (f == -1.0f || f >= getWidth() / 8) {
            return ((double) this.f28065S0) > ((double) (getWidth() * 5)) / 5.7d ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public void m43990U() {
        this.f28064S = false;
        if (NullChecker.m81303a(this.f28036E)) {
            this.f28076g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f28036E.m223307r();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m43991V() {
        if (upa.m194825u2() && xdl0.m208349O0(this.f28090s)) {
            return;
        }
        this.f28064S = true;
        this.f28076g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (this.f28040G instanceof Video) {
            ib1.m135233b().mo135238f("PlayerView", AudioBusinessType.NORMAL, this.f28063R0);
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m43992W() {
        VTexturePlayer vTexturePlayer = this.f28036E;
        return vTexturePlayer != null && vTexturePlayer.m223310u();
    }

    /* JADX INFO: renamed from: X */
    public void m43993X(Media media) {
        m43994Y(media, -1);
    }

    /* JADX INFO: renamed from: Y */
    public void m43994Y(Media media, int i) {
        m43995Z(media, i, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m43995Z(Media media, int i, boolean z) {
        m43996a0(media, i, z, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m43996a0(Media media, int i, boolean z, boolean z2) {
        m43997b0(media, i, z, z2, false);
    }

    @Override // p149l.o7m
    /* JADX INFO: renamed from: b */
    public void mo36115b(boolean z) {
        if (z) {
            m44011x(true);
        } else {
            m43990U();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m43997b0(Media media, int i, boolean z, boolean z2, boolean z3) {
        Picture.ImageUri imageUriM220207f;
        xdl0.m208344M(this.f28070a, true);
        xdl0.m208344M(this.f28071b, false);
        if (this.f28053M0 != null && this.f28055N0) {
            cp60 cp60Var = cp60.INSTANCE;
            if (cp60Var.m108097k() > 0) {
                List<MediaLabel> list = media.labels;
                m44008n0(this.f28053M0.booleanValue(), NullChecker.m81303a(list) && cp60Var.m108101o(list));
            }
        }
        this.f28066T = i;
        if (!media.equals(this.f28040G) && NullChecker.m81303a(this.f28036E)) {
            this.f28036E.setVisibility(4);
            this.f28036E.m223298i(false);
        }
        this.f28039F0 = z2;
        this.f28040G = media;
        boolean z4 = this.f28050L;
        this.f28050L = false;
        this.f28058P = z2;
        if (!TEnum.equals(media.status, "raw")) {
            boolean z5 = media instanceof Video;
            if (!z5 || this.f28042H) {
                imageUriM220207f = this.f28042H ? zub.m220207f(this.f28040G) : null;
            } else {
                imageUriM220207f = media.cover().aspectRatioBiggest();
            }
            if (imageUriM220207f == null) {
                qkq0.m175383a("not supported yet");
                return;
            }
            C8265b c8265b = new C8265b();
            if (i >= 0 && i < 100) {
                j760<Integer, Integer> j760VarM50284z = C8609a.m50284z(i);
                qib0.f154691G.m102336O(this.f28070a, imageUriM220207f.formatted(), j760VarM50284z.f116564a.intValue(), j760VarM50284z.f116565b.intValue());
            } else if (z) {
                qib0.f154691G.m102340Q(this.f28070a, imageUriM220207f.formatted(), 2, z3 ? 16 : 32, Color.parseColor("#4c000000"), c8265b);
            } else {
                qib0.f154691G.m102319F0(this.f28070a, imageUriM220207f, (z5 || !this.f28042H) ? this.f28067U : "profile", c8265b);
            }
        } else {
            if (!(media instanceof Video)) {
                qkq0.m175383a("not supported yet");
                return;
            }
            qib0.f154691G.m102365k0(this.f28070a, media.url);
        }
        if (!(media instanceof Video) || z || z2) {
            this.f28076g.setVisibility(4);
        } else {
            this.f28076g.setVisibility(0);
        }
        if (z4) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m43998c0(Media media, boolean z) {
        m43995Z(media, -1, z);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        this.f28076g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m81303a(this.f28036E) && this.f28036E.getAlpha() != 0.0f) {
            this.f28036E.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m43976w(u4c0.f174399oa);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.mo36116d();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m43999d0(Media media, boolean z) {
        m44000e0(media, z, false);
    }

    /* JADX INFO: renamed from: e0 */
    public void m44000e0(Media media, boolean z, boolean z2) {
        if (media == null) {
            return;
        }
        this.f28058P = z;
        boolean z3 = this.f28050L;
        this.f28050L = true;
        xdl0.m208344M(this.f28070a, true);
        xdl0.m208344M(this.f28071b, false);
        this.f28066T = -1;
        if (!media.equals(this.f28040G) && NullChecker.m81303a(this.f28036E)) {
            this.f28036E.setVisibility(4);
            this.f28036E.m223298i(false);
        }
        this.f28040G = media;
        m44001f0(media, z2);
        boolean z4 = media instanceof Video;
        VFrame_ColorFilter vFrame_ColorFilter = this.f28076g;
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
    public final void m44001f0(Media media, boolean z) {
        Picture picture;
        int iM186890d = 0;
        m44004j0(true, false);
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
                qib0.f154691G.m102365k0(this.f28070a, media.url);
                return;
            } else {
                qkq0.m175383a("not supported yet");
                return;
            }
        }
        C8264a c8264a = new C8264a();
        String str = ((media instanceof Video) || !this.f28042H) ? this.f28067U : "profile";
        Dimension dimensionM43980H = m43980H(picture);
        Picture.ImageUri imageUriCalculatedWidth = picture.calculatedWidth(picture.size.width);
        if (z) {
            qib0.f154691G.m102340Q(this.f28070a, imageUriCalculatedWidth.formatted(), 2, 32, Color.parseColor("#4c000000"), c8264a);
            return;
        }
        int i = dimensionM43980H.height;
        int measuredHeight = getMeasuredHeight();
        VDraweeView vDraweeView = this.f28071b;
        if (i >= measuredHeight) {
            xdl0.m208344M(vDraweeView, false);
            qib0.f154691G.m102319F0(this.f28070a, imageUriCalculatedWidth, str, c8264a);
            iM186890d = t100.m186890d(20.0f);
        } else {
            xdl0.m208344M(vDraweeView, true);
            if (z2) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28071b.getLayoutParams();
                layoutParams.width = dimensionM43980H.width;
                layoutParams.height = dimensionM43980H.height;
                if (m43986O(picture)) {
                    if (NullChecker.m81304b(picture.size)) {
                        Dimension dimension = picture.size;
                        int i2 = dimension.height;
                        int i3 = dimension.width;
                    }
                    layoutParams.gravity = 48;
                    layoutParams.topMargin = (Math.abs(layoutParams.width - layoutParams.height) / 2) + t100.m186890d(30.0f);
                } else {
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = 16;
                }
                this.f28071b.setLayoutParams(layoutParams);
                qib0.f154691G.m102340Q(this.f28070a, imageUriCalculatedWidth.formatted(), 2, 15, getResources().getColor(w0c0.f183858j0), c8264a);
            } else if (z3) {
                xdl0.m208344M(this.f28071b, false);
                qib0.f154691G.m102354Y0(this.f28070a, x2c0.f189546Me);
            }
            qib0.f154691G.m102319F0(this.f28071b, imageUriCalculatedWidth, str, c8264a);
        }
        RoundingParams roundingParamsM112069p = this.f28071b.getHierarchy().m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = new RoundingParams();
        }
        roundingParamsM112069p.m8265s(iM186890d);
        this.f28071b.getHierarchy().m112053H(roundingParamsM112069p);
    }

    /* JADX INFO: renamed from: g0 */
    public void m44002g0(Media media) {
        m43997b0(media, -1, true, false, true);
    }

    public String getFrom() {
        return this.f28067U;
    }

    public Bitmap getPictureBitmap() {
        if (this.f28070a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f28070a.getDrawable()).getBitmap();
        }
        return null;
    }

    public View getVideoDisplayView() {
        return this.f28036E;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m43976w(u4c0.f173775D7);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.mo36117h();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m44003i0() {
        C22392a<Boolean> c22392a = this.f28045I0;
        Boolean bool = Boolean.FALSE;
        c22392a.onNext(bool);
        this.f28047J0.onNext(bool);
    }

    /* JADX INFO: renamed from: j0 */
    public void m44004j0(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        l480 l480Var;
        RoundingParams roundingParamsM112069p = this.f28070a.getHierarchy().m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = new RoundingParams();
        }
        int i4 = t100.f167266o;
        boolean z3 = yki0.m215127b().m215136h() && z2;
        if (z3) {
            i = t100.f167261j;
            i2 = t100.f167265n;
        } else {
            i = i4;
            i2 = i;
        }
        if (z) {
            float f = i;
            float f2 = i2;
            roundingParamsM112069p.m8264r(f, f, f2, f2);
        } else {
            float f3 = i;
            roundingParamsM112069p.m8264r(f3, f3, 0.0f, 0.0f);
        }
        this.f28070a.getHierarchy().m112053H(roundingParamsM112069p);
        djj hierarchy = this.f28070a.getHierarchy();
        if (z3) {
            i3 = x2c0.f190349m2;
        } else {
            i3 = z ? x2c0.f190666w : x2c0.f190381n2;
        }
        hierarchy.m112079z(i3);
        djj hierarchy2 = this.f28070a.getHierarchy();
        if (z) {
            l480Var = new l480(z3 ? t100.f167261j : i4);
        } else {
            l480Var = new l480(z3 ? t100.f167261j : i4, 3);
        }
        hierarchy2.m112050E(l480Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m44005k0() {
        this.f28087p0 = true;
    }

    /* JADX INFO: renamed from: l0 */
    public void m44006l0() {
        RoundingParams roundingParamsM112069p = this.f28070a.getHierarchy().m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = new RoundingParams();
        }
        roundingParamsM112069p.m8265s(0.0f);
        this.f28070a.getHierarchy().m112053H(roundingParamsM112069p);
        this.f28070a.getHierarchy().m112079z(x2c0.f190317l2);
        this.f28070a.getHierarchy().m112050E(new l480(0.0f));
    }

    /* JADX INFO: renamed from: m0 */
    public void m44007m0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            xdl0.m208344M(childAt, childAt == this.f28070a);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m44008n0(boolean z, boolean z2) {
        if (!z2) {
            xdl0.m208344M(this.f28035D, false);
            return;
        }
        cp60 cp60Var = cp60.INSTANCE;
        cp60Var.m108055A();
        xdl0.m208344M(this.f28035D, true);
        cp60Var.m108064J(this.f28035D, z, false);
    }

    /* JADX INFO: renamed from: o0 */
    public void m44009o0() {
        Animator animatorM103741n = bt0.m103741n(this.f28035D, bt0.f77162i, 1.2f, 1.0f);
        animatorM103741n.setDuration(800L);
        animatorM103741n.setStartDelay(300L);
        animatorM103741n.start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m43954N()) {
            return;
        }
        int i = this.f28066T;
        if (i < 0 || i >= 100) {
            int i2 = this.f28057O0;
            if (i2 == u4c0.f174399oa) {
                m43991V();
            } else if (i2 == u4c0.f174449r9) {
                m43990U();
            } else if (i2 == u4c0.f173775D7) {
                m43990U();
            }
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        this.f28036E.m223311v();
        this.f28076g.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f28036E.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.sh70
            @Override // java.lang.Runnable
            public final void run() {
                this.f164521a.m43988S();
            }
        }, 400L);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.onComplete();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("play video error " + this.f28042H + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44010u(this);
        this.f28076g.setOnClickListener(this);
        if (NullChecker.m81303a(this.f28083m)) {
            this.f28083m.setBackgroundDrawable(fce.m120425b(m43975v().color(w0c0.f183754B1), t100.m186890d(6.0f)));
        }
        if (NullChecker.m81303a(this.f28084n)) {
            this.f28084n.setBackgroundDrawable(fce.m120425b(m43975v().color(w0c0.f183754B1), t100.m186890d(6.0f)));
        }
        if (NullChecker.m81303a(this.f28085o)) {
            this.f28085o.setBackgroundDrawable(fce.m120425b(m43975v().color(w0c0.f183754B1), t100.m186890d(6.0f)));
        }
        this.f28070a.getHierarchy().m112050E(new l480(t100.f167266o));
        this.f28071b.setAspectRatio(1.0f);
        if (u59.m191823d0()) {
            this.f28075f.setGravity(1);
            VText vText = this.f28075f;
            int i = t100.f167259h;
            vText.setPadding(i, 0, i, 0);
            this.f28075f.setText(m43975v().getString(R$string.f18756n9));
            this.f28074e.setBackgroundResource(x2c0.f189417I9);
        }
        if (upa.m194847z()) {
            this.f28077h.setImageDrawable(getResources().getDrawable(x2c0.f190121es));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        int iM220205d;
        if (this.f28044I) {
            int iM136799a = ikh0.m136799a(i, i2);
            super.onMeasure(iM136799a, iM136799a);
            return;
        }
        if (this.f28056O) {
            int iM121201d = ffx.m121201d(i);
            int iM121201d2 = ffx.m121201d(i2);
            int i3 = (int) (((double) iM121201d) / 0.67d);
            if (i3 < iM121201d2) {
                super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(Math.min(i3, iM121201d2 - t100.f167266o)));
                return;
            } else {
                super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(iM121201d2));
                return;
            }
        }
        if (this.f28050L || this.f28052M || this.f28054N) {
            super.onMeasure(ffx.m121199b(ffx.m121201d(i)), ffx.m121199b(ffx.m121201d(i2)));
            return;
        }
        if (!this.f28046J) {
            super.onMeasure(i, i2);
            return;
        }
        int iM121201d3 = ffx.m121201d(i);
        int iM121201d4 = ffx.m121201d(i2);
        if (upa.m194619C2() && this.f28048K) {
            iM121201d4 = Math.max(iM121201d4 - t100.f167232G, 0);
            iM220205d = (int) (((double) iM121201d3) / zub.m220205d());
        } else {
            if (this.f28037E0) {
                f = iM121201d3;
                f2 = 0.5f;
            } else {
                f = iM121201d3;
                f2 = 0.6f;
            }
            iM220205d = (int) (f / f2);
        }
        if (iM220205d < iM121201d4) {
            super.onMeasure(ffx.m121199b(iM121201d3), ffx.m121199b(Math.min(iM220205d, iM121201d4 - t100.f167266o)));
        } else {
            super.onMeasure(ffx.m121199b(iM121201d3), ffx.m121199b(iM121201d4));
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        CoreModule.m29936Q().mo67253Zo().mo111895f(false);
        if (v2a.m196754c() || IntlCountryCodeController.m28126v()) {
            xdl0.m208345M0(this.f28036E, false);
        }
        m43976w(u4c0.f174399oa);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.onPause();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        this.f28076g.animate().alpha(this.f28059P0).setDuration(this.f28061Q0).start();
        m43976w(u4c0.f174449r9);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f28065S0 = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdjustAspectRateByPictureSize(boolean z) {
        this.f28062R = z;
    }

    public void setAspectRateFitWidth(float f) {
        this.f28060Q = f;
    }

    public void setFrom(String str) {
        this.f28067U = str;
    }

    public void setIsFemale(boolean z) {
        this.f28053M0 = Boolean.valueOf(z);
    }

    public void setMomentCardSilent(boolean z) {
        this.f28058P = z;
        this.f28036E.setVolume(z);
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22583b interfaceC22583b) {
        this.f28038F = interfaceC22583b;
    }

    public void setRadius(float f) {
        if (this.f28070a.getHierarchy() == null || this.f28070a.getHierarchy().m112069p() == null) {
            return;
        }
        RoundingParams roundingParamsM112069p = this.f28070a.getHierarchy().m112069p();
        roundingParamsM112069p.m8264r(f, f, f, f);
        this.f28070a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f28080k) && this.f28080k.getVisibility() == 0) {
            float f2 = -this.f28080k.getLeft();
            if (this.f28080k.getPivotX() != f2) {
                this.f28080k.setPivotX(f2);
            }
            this.f28080k.setScaleX(1.0f / f);
        }
        if (NullChecker.m81303a(this.f28076g) && this.f28076g.getVisibility() == 0) {
            float f3 = -this.f28076g.getLeft();
            if (this.f28076g.getPivotX() != f3) {
                this.f28076g.setPivotX(f3);
            }
            this.f28076g.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f28080k) && this.f28080k.getVisibility() == 0) {
            float height = this.f28080k.getHeight() - this.f28080k.getBottom();
            if (this.f28080k.getPivotY() != height) {
                this.f28080k.setPivotY(height);
            }
            this.f28080k.setScaleY(1.0f / f);
        }
        if (NullChecker.m81303a(this.f28076g) && this.f28076g.getVisibility() == 0) {
            float height2 = getHeight() - this.f28076g.getTop();
            if (this.f28076g.getPivotY() != height2) {
                this.f28076g.setPivotY(height2);
            }
            this.f28076g.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    public void setShowPetTag(boolean z) {
        this.f28055N0 = z;
    }

    public void setTopRadius(float f) {
        if (this.f28070a.getHierarchy() == null || this.f28070a.getHierarchy().m112069p() == null) {
            return;
        }
        RoundingParams roundingParamsM112069p = this.f28070a.getHierarchy().m112069p();
        roundingParamsM112069p.m8264r(f, f, 0.0f, 0.0f);
        this.f28070a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    public void setVideoViewRadius(int i) {
        this.f28043H0 = i;
    }

    /* JADX INFO: renamed from: u */
    public final void m44010u(View view) {
        bi70.m101987a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public void m44011x(boolean z) {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        this.f28064S = false;
        if (NullChecker.m81303a(this.f28036E)) {
            this.f28036E.m223298i(z);
            this.f28036E.animate().cancel();
            this.f28036E.setAlpha(0.0f);
            this.f28036E.setVisibility(4);
        }
        xdl0.m208344M(this.f28035D, false);
        this.f28053M0 = null;
        this.f28055N0 = false;
        qib0.f154691G.m184725o(this.f28070a);
        this.f28070a.setVisibility(0);
        m43976w(u4c0.f174399oa);
        this.f28076g.animate().cancel();
        this.f28076g.setAlpha(1.0f);
        this.f28036E = null;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        if (this.f28050L || this.f28039F0) {
            this.f28036E.setVolume(this.f28058P);
        }
        this.f28036E.setVisibility(0);
        if (this.f28036E.getAlpha() < 1.0f) {
            this.f28036E.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f28076g.animate().alpha(this.f28059P0).setDuration(this.f28061Q0).setInterpolator(new LinearInterpolator()).start();
        m43976w(u4c0.f174449r9);
        if (NullChecker.m81303a(this.f28038F)) {
            this.f28038F.mo36127y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m44012z() {
        this.f28064S = false;
        if (NullChecker.m81303a(this.f28036E)) {
            this.f28036E.m223299j();
        }
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28066T = -1;
        this.f28068V = -1L;
        this.f28069W = -1L;
        this.f28041G0 = false;
        this.f28043H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28045I0 = C22392a.m221513c(bool);
        this.f28047J0 = C22392a.m221513c(bool);
        this.f28049K0 = new e30() { // from class: l.oh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143958a.m43955Q((Boolean) obj);
            }
        };
        this.f28051L0 = new e30() { // from class: l.qh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154433a.m43956R((Boolean) obj);
            }
        };
        this.f28053M0 = null;
        this.f28055N0 = false;
        this.f28057O0 = u4c0.f174399oa;
        this.f28059P0 = 0.2f;
        this.f28061Q0 = 2000;
        this.f28063R0 = new C8266c();
        this.f28065S0 = -1.0f;
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28066T = -1;
        this.f28068V = -1L;
        this.f28069W = -1L;
        this.f28041G0 = false;
        this.f28043H0 = 20;
        Boolean bool = Boolean.FALSE;
        this.f28045I0 = C22392a.m221513c(bool);
        this.f28047J0 = C22392a.m221513c(bool);
        this.f28049K0 = new e30() { // from class: l.oh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143958a.m43955Q((Boolean) obj);
            }
        };
        this.f28051L0 = new e30() { // from class: l.qh70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154433a.m43956R((Boolean) obj);
            }
        };
        this.f28053M0 = null;
        this.f28055N0 = false;
        this.f28057O0 = u4c0.f174399oa;
        this.f28059P0 = 0.2f;
        this.f28061Q0 = 2000;
        this.f28063R0 = new C8266c();
        this.f28065S0 = -1.0f;
    }
}
