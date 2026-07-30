package p153l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.immomo.moment.mediautils.AbstractC3991e;
import com.immomo.moment.mediautils.AbstractC3999m;
import com.immomo.moment.mediautils.C3990d;
import com.immomo.moment.mediautils.C3993g;
import com.immomo.moment.mediautils.C3995i;
import com.immomo.moment.mediautils.C3997k;
import com.immomo.moment.mediautils.C3998l;
import com.immomo.moment.mediautils.C4000n;
import com.immomo.moment.mediautils.C4001o;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.immomo.moment.mediautils.cmds.AudioBackground;
import com.immomo.moment.mediautils.cmds.AudioEffects;
import com.immomo.moment.mediautils.cmds.EffectModel;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import com.immomo.moment.util.datadot.RecorderDataDotUtils;
import com.imomo.momo.mediaencoder.FFBgChanger;
import com.momo.mcamera.util.MDLogTag;
import com.momo.xengine.mestatistics.ReportType;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class n410 implements ka1.InterfaceC18125a, C3990d.d {

    /* JADX INFO: renamed from: E0 */
    private crf0 f140063E0;

    /* JADX INFO: renamed from: F0 */
    private boolean f140065F0;

    /* JADX INFO: renamed from: I0 */
    private n4b0 f140071I0;

    /* JADX INFO: renamed from: Z */
    private uje f140091Z;

    /* JADX INFO: renamed from: b */
    C4001o f140094b;

    /* JADX INFO: renamed from: c */
    C4000n f140096c;

    /* JADX INFO: renamed from: d */
    C3990d f140098d;

    /* JADX INFO: renamed from: e */
    ed1 f140100e;

    /* JADX INFO: renamed from: f */
    ob1 f140102f;

    /* JADX INFO: renamed from: f0 */
    private Object f140103f0;

    /* JADX INFO: renamed from: g */
    rd1 f140104g;

    /* JADX INFO: renamed from: g0 */
    private kpw f140105g0;

    /* JADX INFO: renamed from: h */
    qvf0 f140106h;

    /* JADX INFO: renamed from: h0 */
    private jpw f140107h0;

    /* JADX INFO: renamed from: i */
    xcl0 f140108i;

    /* JADX INFO: renamed from: j */
    ka1 f140110j;

    /* JADX INFO: renamed from: k */
    eli0 f140112k;

    /* JADX INFO: renamed from: l */
    oej f140114l;

    /* JADX INFO: renamed from: m */
    FFBgChanger f140116m;

    /* JADX INFO: renamed from: n */
    AbstractC3991e f140118n;

    /* JADX INFO: renamed from: n0 */
    private String f140119n0;

    /* JADX INFO: renamed from: o */
    C3998l f140120o;

    /* JADX INFO: renamed from: p */
    C3997k f140122p;

    /* JADX INFO: renamed from: q */
    private kt2 f140124q;

    /* JADX INFO: renamed from: q0 */
    private ipw f140125q0;

    /* JADX INFO: renamed from: r0 */
    private rpw f140127r0;

    /* JADX INFO: renamed from: s0 */
    private i3f0 f140129s0;

    /* JADX INFO: renamed from: u0 */
    rb1 f140133u0;

    /* JADX INFO: renamed from: w */
    private WeakReference<SurfaceHolder> f140136w;

    /* JADX INFO: renamed from: x */
    private Object f140138x;

    /* JADX INFO: renamed from: y */
    private Handler f140140y;

    /* JADX INFO: renamed from: a */
    private String f140092a = "MomoProcess";

    /* JADX INFO: renamed from: r */
    private boolean f140126r = false;

    /* JADX INFO: renamed from: s */
    private boolean f140128s = true;

    /* JADX INFO: renamed from: t */
    private volatile boolean f140130t = false;

    /* JADX INFO: renamed from: u */
    private boolean f140132u = false;

    /* JADX INFO: renamed from: v */
    private boolean f140134v = false;

    /* JADX INFO: renamed from: z */
    private boolean f140142z = false;

    /* JADX INFO: renamed from: A */
    private int f140054A = 0;

    /* JADX INFO: renamed from: B */
    private int f140056B = 0;

    /* JADX INFO: renamed from: C */
    private int f140058C = 0;

    /* JADX INFO: renamed from: D */
    private int f140060D = 0;

    /* JADX INFO: renamed from: E */
    private int f140062E = 0;

    /* JADX INFO: renamed from: F */
    private int f140064F = 0;

    /* JADX INFO: renamed from: G */
    private int f140066G = 0;

    /* JADX INFO: renamed from: H */
    private int f140068H = 1;

    /* JADX INFO: renamed from: I */
    private int f140070I = 0;

    /* JADX INFO: renamed from: J */
    private int f140072J = 0;

    /* JADX INFO: renamed from: K */
    private int f140074K = 16;

    /* JADX INFO: renamed from: L */
    private int f140076L = 20;

    /* JADX INFO: renamed from: M */
    private int f140078M = 3000000;

    /* JADX INFO: renamed from: N */
    private int f140079N = 0;

    /* JADX INFO: renamed from: O */
    private int f140080O = 65536;

    /* JADX INFO: renamed from: P */
    private boolean f140081P = true;

    /* JADX INFO: renamed from: Q */
    private boolean f140082Q = false;

    /* JADX INFO: renamed from: R */
    private int f140083R = 2;

    /* JADX INFO: renamed from: S */
    private int f140084S = 23;

    /* JADX INFO: renamed from: T */
    private long f140085T = 0;

    /* JADX INFO: renamed from: U */
    private boolean f140086U = false;

    /* JADX INFO: renamed from: V */
    private boolean f140087V = false;

    /* JADX INFO: renamed from: W */
    private long f140088W = 0;

    /* JADX INFO: renamed from: X */
    private Object f140089X = new Object();

    /* JADX INFO: renamed from: Y */
    private long f140090Y = 0;

    /* JADX INFO: renamed from: a0 */
    private boolean f140093a0 = false;

    /* JADX INFO: renamed from: b0 */
    private Bundle f140095b0 = new Bundle();

    /* JADX INFO: renamed from: c0 */
    private boolean f140097c0 = false;

    /* JADX INFO: renamed from: d0 */
    private int f140099d0 = 1;

    /* JADX INFO: renamed from: e0 */
    private Object f140101e0 = new Object();

    /* JADX INFO: renamed from: i0 */
    private apw f140109i0 = null;

    /* JADX INFO: renamed from: j0 */
    private final int f140111j0 = -1;

    /* JADX INFO: renamed from: k0 */
    private final int f140113k0 = 0;

    /* JADX INFO: renamed from: l0 */
    private final int f140115l0 = 1;

    /* JADX INFO: renamed from: m0 */
    private int f140117m0 = -1;

    /* JADX INFO: renamed from: o0 */
    private EffectModel f140121o0 = null;

    /* JADX INFO: renamed from: p0 */
    private Object f140123p0 = new Object();

    /* JADX INFO: renamed from: t0 */
    private String f140131t0 = null;

    /* JADX INFO: renamed from: v0 */
    private int f140135v0 = 6;

    /* JADX INFO: renamed from: w0 */
    private long f140137w0 = 0;

    /* JADX INFO: renamed from: x0 */
    private int f140139x0 = 200000;

    /* JADX INFO: renamed from: y0 */
    private boolean f140141y0 = false;

    /* JADX INFO: renamed from: z0 */
    private boolean f140143z0 = false;

    /* JADX INFO: renamed from: A0 */
    private boolean f140055A0 = false;

    /* JADX INFO: renamed from: B0 */
    private boolean f140057B0 = false;

    /* JADX INFO: renamed from: C0 */
    Object f140059C0 = new Object();

    /* JADX INFO: renamed from: D0 */
    private int f140061D0 = 0;

    /* JADX INFO: renamed from: G0 */
    private int f140067G0 = 0;

    /* JADX INFO: renamed from: H0 */
    private float[] f140069H0 = new float[16];

    /* JADX INFO: renamed from: J0 */
    private boolean f140073J0 = true;

    /* JADX INFO: renamed from: K0 */
    tpr f140075K0 = new C18784j();

    /* JADX INFO: renamed from: L0 */
    private C4001o.d f140077L0 = new C18785k();

    /* JADX INFO: renamed from: l.n410$a */
    public class C18775a implements AbstractC3991e.b {
        public C18775a() {
        }
    }

    /* JADX INFO: renamed from: l.n410$b */
    public class C18776b implements AbstractC3991e.a {
        public C18776b() {
        }
    }

    /* JADX INFO: renamed from: l.n410$c */
    public class C18777c implements spw {
        public C18777c() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140107h0 != null) {
                n410.this.f140107h0.mo115360a(n410.this.f140139x0 + i, i, "encoder error!!!");
            }
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str);
            }
            MDLog.m7445e("media", "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$d */
    public class C18778d implements C3998l.e {
        public C18778d() {
        }

        @Override // com.immomo.moment.mediautils.C3998l.e
        /* JADX INFO: renamed from: a */
        public long mo19897a() {
            return n410.this.m161456p0();
        }
    }

    /* JADX INFO: renamed from: l.n410$e */
    public class C18779e implements C3998l.f {
        public C18779e() {
        }

        @Override // com.immomo.moment.mediautils.C3998l.f
        /* JADX INFO: renamed from: a */
        public void mo19898a() {
            xcl0 xcl0Var = n410.this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210172o();
            }
        }
    }

    /* JADX INFO: renamed from: l.n410$f */
    public class C18780f implements FFBgChanger.OnBgChangerListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f140149a;

        public C18780f(long j) {
            this.f140149a = j;
        }

        @Override // com.imomo.momo.mediaencoder.FFBgChanger.OnBgChangerListener
        public void onError(int i) {
            if (n410.this.f140107h0 != null) {
                n410.this.f140107h0.mo115360a(n410.this.f140139x0 + ErrorCode.BGMIX_RUNNING_FAILED, ErrorCode.BGMIX_RUNNING_FAILED, "BgChanger running error");
            }
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + ErrorCode.BGMIX_RUNNING_FAILED, "BgChanger running error");
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "BgChanger running error");
        }

        @Override // com.imomo.momo.mediaencoder.FFBgChanger.OnBgChangerListener
        public void onProgress(int i) throws IOException {
            if (n410.this.f140105g0 != null) {
                n410.this.f140105g0.onProcessProgress(i);
            }
            if (i != 100 || n410.this.f140105g0 == null || n410.this.f140105g0 == null) {
                return;
            }
            n410.this.m161454o0(this.f140149a);
            n410.this.f140105g0.mo62200a();
        }
    }

    /* JADX INFO: renamed from: l.n410$g */
    public class C18781g implements qpr {
        public C18781g() {
        }

        @Override // p153l.qpr
        /* JADX INFO: renamed from: a */
        public void mo161501a(ByteBuffer byteBuffer, int i, long j) {
            synchronized (n410.this.f140101e0) {
                try {
                    ad60 ad60Var = new ad60(byteBuffer);
                    ad60Var.m97018d(i, 0, 0, j, 0);
                    AbstractC3991e abstractC3991e = n410.this.f140118n;
                    if (abstractC3991e != null) {
                        abstractC3991e.mo19723c(ad60Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.n410$h */
    public class C18782h implements spw {
        public C18782h() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str + " OutSampleRate:" + n410.this.f140070I + " OutBits:" + n410.this.f140074K + " OutChannels:" + n410.this.f140072J + " IsUseSoft:" + n410.this.f140055A0);
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$i */
    public class C18783i implements C4001o.f {
        public C18783i() {
        }

        @Override // com.immomo.moment.mediautils.C4001o.f
        /* JADX INFO: renamed from: a */
        public void mo19989a() {
            if (n410.this.f140125q0 != null) {
                n410.this.f140125q0.mo63633l0();
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager onPauseComplete !!!");
        }

        @Override // com.immomo.moment.mediautils.C4001o.f
        /* JADX INFO: renamed from: b */
        public void mo19990b() {
            n410 n410Var = n410.this;
            if (n410Var.f140098d != null && n410Var.f140128s) {
                n410.this.f140098d.m19713q();
            }
            n410 n410Var2 = n410.this;
            xcl0 xcl0Var = n410Var2.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210178v(n410Var2.f140128s);
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager onSeekComplete !!!");
        }
    }

    /* JADX INFO: renamed from: l.n410$j */
    public class C18784j implements tpr {
        public C18784j() {
        }

        @Override // p153l.tpr
        /* JADX INFO: renamed from: a */
        public void mo161502a(Message message) throws Throwable {
            int i = message.what;
            if (i == 272) {
                n410.this.m161390B0();
                return;
            }
            switch (i) {
                case 257:
                    n410.this.m161459r0();
                    break;
                case 258:
                    n410.this.m161469w0(((Boolean) message.obj).booleanValue());
                    break;
                case 259:
                    n410.this.m161388A0();
                    break;
                case 260:
                    n410.this.m161475z0();
                    break;
                case 261:
                    n410.this.m161392C0((EffectModel) message.obj);
                    break;
                case 262:
                    n410.this.m161467v0((EffectModel) message.obj);
                    break;
                case 263:
                    n410.this.m161463t0((String) message.obj);
                    break;
                case 264:
                    n410.this.m161461s0();
                    break;
                case 265:
                    n410.this.m161471x0();
                    break;
            }
        }

        @Override // p153l.tpr
        public void onPause() {
            n410.this.m161465u0();
        }

        @Override // p153l.tpr
        public void onResume() throws Throwable {
            n410.this.m161473y0();
        }
    }

    /* JADX INFO: renamed from: l.n410$l */
    public class C18786l implements rpr {
        public C18786l() {
        }

        @Override // p153l.rpr
        /* JADX INFO: renamed from: a */
        public void mo161503a() {
            xcl0 xcl0Var = n410.this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210173p();
            }
        }

        @Override // p153l.rpr
        /* JADX INFO: renamed from: b */
        public Object mo161504b() {
            return lrw.m155653j().m155662h();
        }
    }

    /* JADX INFO: renamed from: l.n410$m */
    public class C18787m implements spw {
        public C18787m() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140107h0 != null) {
                n410.this.f140107h0.mo115360a(n410.this.f140139x0 + i, i, "render failed：" + str);
            }
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str);
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$n */
    public class C18788n implements InterfaceC18792r {
        public C18788n() {
        }

        @Override // p153l.n410.InterfaceC18792r
        /* JADX INFO: renamed from: a */
        public void mo161505a() {
            C4001o c4001o = n410.this.f140094b;
            if (c4001o != null) {
                c4001o.m19979x(16);
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess video cut finished !!!");
        }

        @Override // p153l.n410.InterfaceC18792r
        /* JADX INFO: renamed from: b */
        public void mo161506b(boolean z) {
            eli0 eli0Var = n410.this.f140112k;
            if (eli0Var != null) {
                eli0Var.m121208n0(258, Boolean.valueOf(z));
            }
        }

        @Override // p153l.n410.InterfaceC18792r
        /* JADX INFO: renamed from: c */
        public void mo161507c(long j) {
            n410 n410Var;
            eli0 eli0Var;
            C3990d c3990d = n410.this.f140098d;
            if (c3990d != null) {
                c3990d.m19718v(j);
            }
            if (n410.this.f140117m0 == 1) {
                float f = (((j * 1000) + n410.this.f140090Y) * 1.0f) / n410.this.f140085T;
                if (n410.this.f140125q0 != null && n410.this.f140085T != 0 && j != 0 && n410.this.m161476H0()) {
                    n410.this.f140125q0.mo63626W(f);
                }
            }
            if (n410.this.f140082Q || (eli0Var = (n410Var = n410.this).f140112k) == null) {
                return;
            }
            eli0Var.m121186F0(j + (n410Var.f140090Y / 1000));
        }

        @Override // p153l.n410.InterfaceC18792r
        /* JADX INFO: renamed from: d */
        public void mo161508d() {
            n410 n410Var = n410.this;
            if (n410Var.f140112k != null) {
                boolean z = n410Var.f140057B0;
                n410 n410Var2 = n410.this;
                if (z) {
                    ((v5c) n410Var2.f140112k).m150363I0();
                } else {
                    n410Var2.m161415R0();
                    ((abh0) n410.this.f140112k).onFrameAvailable(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.n410$o */
    public class C18789o implements spw {
        public C18789o() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str);
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$p */
    public class C18790p implements spw {
        public C18790p() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str);
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$q */
    public class C18791q implements spw {
        public C18791q() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (n410.this.f140107h0 != null) {
                n410.this.f140107h0.mo115360a(n410.this.f140139x0 + i, i, "source error!!!");
            }
            if (n410.this.f140109i0 != null) {
                n410.this.f140109i0.onError(n410.this.f140139x0 + i, str);
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (n410.this.f140139x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.n410$r */
    public interface InterfaceC18792r {
        /* JADX INFO: renamed from: a */
        void mo161505a();

        /* JADX INFO: renamed from: b */
        void mo161506b(boolean z);

        /* JADX INFO: renamed from: c */
        void mo161507c(long j);

        /* JADX INFO: renamed from: d */
        void mo161508d();
    }

    public n410() {
        m161394D0(this.f140055A0, this.f140057B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m161388A0() throws Throwable {
        ipw ipwVar;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startPreview()");
        if (this.f140094b == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Invalid mSourceManager");
            jpw jpwVar = this.f140107h0;
            if (jpwVar != null) {
                jpwVar.mo115360a(this.f140139x0 + ErrorCode.EDIT_STARTPREVIEW_FAILED, ErrorCode.EDIT_STARTPREVIEW_FAILED, "make video path is empty !!!");
            }
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + ErrorCode.EDIT_STARTPREVIEW_FAILED, "make video path is empty !!!");
                return;
            }
            return;
        }
        eli0 eli0Var = this.f140112k;
        Object obj = this.f140138x;
        crf0 crf0Var = this.f140063E0;
        if (crf0Var == null) {
            crf0Var = new crf0(this.f140058C, this.f140060D);
        }
        eli0Var.m121223y0(obj, crf0Var);
        if (this.f140098d == null) {
            C3990d c3990d = new C3990d(false);
            this.f140098d = c3990d;
            c3990d.m19715s(this);
            this.f140098d.m19717u(new C18789o());
            if (!this.f140098d.m19710n(this.f140070I, this.f140074K, this.f140072J)) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "mAudioPlayer prepare failed");
                return;
            }
        }
        m161412P0();
        this.f140094b.m19975O(this.f140086U);
        this.f140094b.m19974N(true);
        if (this.f140134v) {
            this.f140094b.m19977Q();
            this.f140134v = false;
            this.f140087V = true;
            xcl0 xcl0Var = this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210177u();
            }
        } else {
            m161475z0();
        }
        long j = this.f140085T;
        if (j == 0 || (ipwVar = this.f140125q0) == null) {
            return;
        }
        ipwVar.mo63626W((this.f140090Y * 1.0f) / j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m161390B0() {
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19711o();
            this.f140098d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m161392C0(EffectModel effectModel) throws Throwable {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "updateEffect()");
        this.f140132u = true;
        this.f140121o0 = effectModel;
        m161452n0();
        m161473y0();
    }

    /* JADX INFO: renamed from: D0 */
    private void m161394D0(boolean z, boolean z2) {
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-video-adapter-use-count", System.currentTimeMillis(), ReportType.COUNT);
        String str = this.f140092a;
        StringBuilder sb = new StringBuilder("server DecoderType audio: ");
        sb.append(z ? "Soft" : "Hard");
        sb.append(" video:");
        sb.append(z2 ? "Soft" : "Hard");
        MDLog.m7443d(str, sb.toString());
        this.f140057B0 = z2;
        this.f140055A0 = z;
        String str2 = this.f140092a;
        StringBuilder sb2 = new StringBuilder("real DecoderType audio: ");
        sb2.append(this.f140055A0 ? "Soft" : "Hard");
        sb2.append(" video:");
        sb2.append(this.f140057B0 ? "Soft" : "Hard");
        MDLog.m7443d(str2, sb2.toString());
        this.f140140y = new Handler(Looper.getMainLooper());
        if (this.f140057B0) {
            v5c v5cVar = new v5c("DataRenThr");
            this.f140112k = v5cVar;
            v5cVar.m199828k1(1);
        } else {
            this.f140112k = new abh0("textureRenThr");
        }
        this.f140112k.m121225z0(this.f140075K0);
        this.f140112k.m121217u0(new C18786l());
        this.f140112k.m121216t0(new C18787m());
        lrw.m155653j().m155663i();
        this.f140114l = new oej();
        xcl0 xcl0Var = new xcl0();
        this.f140108i = xcl0Var;
        xcl0Var.m210180x(new C18788n());
        ka1 ka1Var = new ka1();
        this.f140110j = ka1Var;
        ka1Var.m148921d(this);
    }

    /* JADX INFO: renamed from: E0 */
    private boolean m161396E0() {
        float fM19693a;
        boolean z;
        long j;
        String str;
        long j2;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initBgChanger !!!");
        long jCurrentTimeMillis = System.currentTimeMillis();
        EffectModel effectModel = this.f140121o0;
        if (effectModel == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "no EffectModel");
            return false;
        }
        String mediaPath = effectModel.getMediaPath();
        if (!kki.m150100c(mediaPath)) {
            return false;
        }
        AudioEffects audioEffects = this.f140121o0.getAudioEffects();
        if (audioEffects == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "no Audio Effects");
            return false;
        }
        List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
        if (audioBackgrounds == null || audioBackgrounds.size() <= 0) {
            fM19693a = audioEffects.getAudioSource() != null ? audioEffects.getAudioSource().m19693a() : 1.0f;
            z = false;
            j = 0;
            str = "";
            j2 = 0;
        } else {
            AudioBackground audioBackground = audioBackgrounds.get(0);
            String bgPath = audioBackground.getBgPath();
            long start = audioBackground.getStart();
            long end = audioBackground.getEnd();
            fM19693a = audioBackground.getRatio();
            j = end;
            j2 = start;
            str = bgPath;
            z = true;
        }
        FFBgChanger fFBgChanger = new FFBgChanger();
        this.f140116m = fFBgChanger;
        if (!fFBgChanger.initBgChanger()) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "initBgChanger error");
            jpw jpwVar = this.f140107h0;
            if (jpwVar != null) {
                jpwVar.mo115360a(this.f140139x0 + 8001, 8001, "initBgChanger error");
            }
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + 8001, "initBgChanger error");
            }
            return false;
        }
        if (!this.f140116m.setOutputFileName(this.f140119n0)) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "setOutputFileName error");
            jpw jpwVar2 = this.f140107h0;
            if (jpwVar2 != null) {
                jpwVar2.mo115360a(this.f140139x0 + 8002, 8002, "setOutputFileName error");
            }
            apw apwVar2 = this.f140109i0;
            if (apwVar2 != null) {
                apwVar2.onError(this.f140139x0 + 8002, "setOutputFileName error");
            }
            return false;
        }
        this.f140116m.setMixModeAndRatio(Boolean.valueOf(z), fM19693a);
        if (!this.f140116m.initVideoSource(mediaPath)) {
            jpw jpwVar3 = this.f140107h0;
            if (jpwVar3 != null) {
                jpwVar3.mo115360a(this.f140139x0 + 8003, 8003, "bgChange init video source error");
            }
            apw apwVar3 = this.f140109i0;
            if (apwVar3 != null) {
                apwVar3.onError(this.f140139x0 + 8003, "bgChange init video source error");
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "bgChange init video source error");
            return false;
        }
        if (!z || this.f140116m.initAudioSource(str, j2, j)) {
            this.f140116m.setBgChangerListener(new C18780f(jCurrentTimeMillis));
            return true;
        }
        MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "bgChange init audio source error");
        jpw jpwVar4 = this.f140107h0;
        if (jpwVar4 != null) {
            jpwVar4.mo115360a(this.f140139x0 + ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, "bgChange init audio source error");
        }
        apw apwVar4 = this.f140109i0;
        if (apwVar4 != null) {
            apwVar4.onError(this.f140139x0 + ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, "bgChange init audio source error");
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m161398F0(String str) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initEncoder !!!  mediaEncoderMode = " + this.f140099d0 + " outPath:" + str);
        if (this.f140099d0 == 0) {
            C3997k c3997k = new C3997k();
            this.f140122p = c3997k;
            c3997k.m19729i(0);
            this.f140122p.m19861B(this.f140085T - this.f140090Y);
            this.f140122p.m19727g(new C18775a());
            this.f140122p.m19726f(new C18776b());
            this.f140122p.m19862C(this.f140084S);
            this.f140122p.m19863D(this.f140083R);
            this.f140122p.m19730j(this.f140068H);
            this.f140122p.m19731k(this.f140079N);
            this.f140122p.mo19732l(this.f140054A, this.f140056B, this.f140076L, this.f140078M);
            this.f140122p.m19724d(this.f140070I, this.f140072J, this.f140080O);
            this.f140118n = this.f140122p;
            m161419U0();
        } else {
            C3998l c3998l = new C3998l();
            this.f140120o = c3998l;
            c3998l.m19890M(new C18777c());
            this.f140120o.m19896S(this.f140054A, this.f140056B, this.f140076L, this.f140078M, this.f140068H, this.f140079N, C3998l.f14171U, this.f140065F0);
            this.f140120o.m19888K(this.f140070I, this.f140074K, this.f140072J, this.f140080O, 8192);
            m161419U0();
            if (this.f140081P) {
                this.f140120o.m19889L();
            }
            if (this.f140106h != null) {
                this.f140120o.m19895R(new C18778d());
            }
            this.f140120o.m19894Q(new C18779e());
            this.f140118n = this.f140120o;
        }
        this.f140118n.m19728h(str);
        if (this.f140118n.mo19733m()) {
            if (this.f140099d0 == 1) {
                this.f140103f0 = this.f140120o.m19887H();
            }
            return true;
        }
        this.f140118n = null;
        MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "startEncoding error");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, l.ob1, l.rd1] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38, types: [l.ed1] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [int] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.immomo.moment.mediautils.n, com.immomo.moment.mediautils.o] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: G0 */
    private boolean m161400G0() throws Throwable {
        boolean z;
        long j;
        ?? r12;
        boolean z2;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initSource !!!");
        boolean z3 = false;
        if (this.f140121o0 == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Invalid model");
            jpw jpwVar = this.f140107h0;
            if (jpwVar != null) {
                jpwVar.mo115360a(this.f140139x0 + ErrorCode.BGMIX_RUNNING_FAILED, ErrorCode.BGMIX_RUNNING_FAILED, "Invalid model");
            }
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + 5001, " mInputEffectModel is null!!!");
            }
            return false;
        }
        C4001o c4001o = this.f140094b;
        if (c4001o != null) {
            c4001o.m19967B();
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210171n();
        }
        C4000n c4000n = this.f140096c;
        if (c4000n != null) {
            c4000n.m19933d();
        }
        long length = 0;
        this.f140085T = 0L;
        ?? r7 = 0;
        List<VideoCut> videoCuts = this.f140121o0.getVideoEffects() != null ? this.f140121o0.getVideoEffects().getVideoCuts() : null;
        String str = "Fail to create new source!!!";
        if (videoCuts == null || videoCuts.size() <= 0) {
            z = false;
            j = 1000;
            String mediaPath = this.f140121o0.getMediaPath();
            if (mediaPath == null) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "No source");
                jpw jpwVar2 = this.f140107h0;
                if (jpwVar2 != null) {
                    jpwVar2.mo115360a(this.f140139x0 + 5001, 5001, "No source");
                }
                apw apwVar2 = this.f140109i0;
                if (apwVar2 == null) {
                    return false;
                }
                apwVar2.onError(this.f140139x0 + 5001, " The media source is empty !!!");
                return false;
            }
            C4000n c4000n2 = this.f140096c;
            AbstractC3999m abstractC3999mM161450m0 = (c4000n2 == null || c4000n2.m19935f() == null) ? null : this.f140096c.m19935f().get(this.f140121o0.getMediaPath());
            if (abstractC3999mM161450m0 == null) {
                m161448l0();
                abstractC3999mM161450m0 = m161450m0(this.f140121o0.getMediaPath());
                if (abstractC3999mM161450m0 == null) {
                    MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source");
                    jpw jpwVar3 = this.f140107h0;
                    if (jpwVar3 != null) {
                        jpwVar3.mo115360a(this.f140139x0 + 5001, 5001, "Fail to create new source!!!");
                    }
                    return false;
                }
                MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Success to create new source media:" + this.f140121o0.getMediaPath());
                if (this.f140096c == null) {
                    this.f140096c = new C4000n();
                }
                this.f140096c.m19932c(this.f140121o0.getMediaPath(), abstractC3999mM161450m0);
            }
            this.f140096c.m19930a(this.f140121o0.getMediaPath(), 0L, -1L);
            this.f140085T = abstractC3999mM161450m0.m19907h();
            File file = new File(mediaPath);
            if (file.exists() && file.isFile()) {
                length = file.length();
            }
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginSize(length);
        } else {
            if (videoCuts.size() > 1) {
                int i = 0;
                ?? r14 = 0;
                while (i < videoCuts.size()) {
                    ?? media = videoCuts.get(i).getMedia();
                    if (media == 0) {
                        r14 = r14;
                    } else {
                        if (r14 == 0) {
                            r14 = media;
                        }
                        if (!media.equals(r14)) {
                            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, " Surface Texture does not support switching between two different video sources!!!");
                            jpw jpwVar4 = this.f140107h0;
                            if (jpwVar4 != null) {
                                jpwVar4.mo115360a(this.f140139x0 + 5001, 5001, "Surface Texture does not support switching between two different video sources!!!");
                            }
                            apw apwVar3 = this.f140109i0;
                            if (apwVar3 != null) {
                                apwVar3.onError(this.f140139x0 + 5001, " Surface Texture does not support switching between two different video sources!!!");
                            }
                            return false;
                        }
                    }
                    i++;
                    r14 = r14;
                }
            }
            int i2 = 0;
            int i3 = 0;
            AbstractC3999m abstractC3999mM161450m1 = null;
            for (VideoCut videoCut : videoCuts) {
                if (videoCut.getMedia() != null) {
                    C4000n c4000n3 = this.f140096c;
                    if (c4000n3 != null && c4000n3.m19935f() != null) {
                        abstractC3999mM161450m1 = this.f140096c.m19935f().get(videoCut.getMedia());
                    }
                    if (abstractC3999mM161450m1 == null) {
                        C4001o c4001o2 = this.f140094b;
                        if (c4001o2 != null) {
                            c4001o2.m19970F();
                            this.f140094b = r7;
                            this.f140096c = r7;
                        }
                        i2++;
                        abstractC3999mM161450m1 = m161450m0(videoCut.getMedia());
                        if (abstractC3999mM161450m1 == null) {
                            MDLog.m7453w(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source createSuccessNum:" + i3 + " createAllNum:" + i2 + " media:" + videoCut.getMedia());
                            z3 = z3;
                            r7 = r7;
                        } else {
                            z2 = z3;
                            i3++;
                            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Success to create new source createSuccessNum:" + i3 + " createAllNum:" + i2 + " media:" + videoCut.getMedia());
                            if (this.f140096c == null) {
                                this.f140096c = new C4000n();
                            }
                            this.f140096c.m19932c(videoCut.getMedia(), abstractC3999mM161450m1);
                            File file2 = new File(videoCut.getMedia());
                            if (file2.exists() && file2.isFile()) {
                                length += file2.length();
                            }
                        }
                    } else {
                        z2 = z3;
                    }
                    this.f140096c.m19931b(videoCut.getMedia(), videoCut.getStart() * 1000, videoCut.getEnd() * 1000, videoCut.isReverse());
                    long jM19907h = abstractC3999mM161450m1.m19907h();
                    long end = videoCut.getEnd() * 1000;
                    String str2 = str;
                    long j2 = this.f140085T;
                    if (end > jM19907h) {
                        this.f140085T = j2 + (jM19907h - (videoCut.getStart() * 1000));
                    } else {
                        this.f140085T = j2 + ((videoCut.getEnd() - videoCut.getStart()) * 1000);
                    }
                    z3 = z2;
                    str = str2;
                    r7 = 0;
                }
            }
            z = z3;
            String str3 = str;
            j = 1000;
            if (i2 != 0 && i3 == 0) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source");
                jpw jpwVar5 = this.f140107h0;
                if (jpwVar5 != null) {
                    jpwVar5.mo115360a(this.f140139x0 + 5001, 5001, str3);
                }
                apw apwVar4 = this.f140109i0;
                if (apwVar4 != null) {
                    apwVar4.onError(this.f140139x0 + 5001, " Fail to create new source!!!");
                }
                return z;
            }
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginSize(length);
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginDuration(this.f140085T);
        VideoEffects videoEffects = this.f140121o0.getVideoEffects();
        AudioEffects audioEffects = this.f140121o0.getAudioEffects();
        qvf0 qvf0Var = this.f140106h;
        if (qvf0Var != null) {
            qvf0Var.mo178283a();
            r12 = 0;
            this.f140106h.m178289g(null);
        } else {
            r12 = 0;
        }
        ed1 ed1Var = this.f140100e;
        if (ed1Var != null) {
            ed1Var.mo103473c();
            this.f140100e.m120419g(r12);
        }
        ob1 ob1Var = this.f140102f;
        if (ob1Var != null) {
            ob1Var.m166909j();
            this.f140102f = r12;
        }
        rd1 rd1Var = this.f140104g;
        if (rd1Var != null) {
            rd1Var.m180836f();
            this.f140104g = r12;
        }
        if (videoEffects != null) {
            List<TimeRangeScale> listM161444j0 = m161444j0(videoEffects.getTimeRangeScales(), this.f140090Y / j);
            this.f140085T = m161446k0(this.f140085T, listM161444j0);
            if (this.f140106h == null) {
                this.f140106h = new qvf0();
            }
            this.f140106h.m178289g(listM161444j0);
            if (listM161444j0 != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoUseSpeedvary(true);
                ArrayList arrayList = new ArrayList();
                for (?? r5 = z; r5 < listM161444j0.size(); r5++) {
                    arrayList.add(Float.valueOf(listM161444j0.get(r5).getSpeed()));
                }
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoSpeedvaryValue((Float[]) arrayList.toArray(new Float[arrayList.size()]));
                MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "The speed value is " + arrayList.toArray().toString());
            }
            if (listM161444j0 != null && listM161444j0.size() > 0) {
                if (listM161444j0.size() == 1) {
                    TimeRangeScale timeRangeScale = listM161444j0.get(z ? 1 : 0);
                    long end2 = timeRangeScale.getEnd() - timeRangeScale.getStart();
                    float speed = timeRangeScale.getSpeed();
                    if (end2 >= j || speed == 5.0f || speed == 0.25f) {
                        if (this.f140100e == null) {
                            ed1 ed1Var2 = new ed1();
                            this.f140100e = ed1Var2;
                            ed1Var2.mo103474d(this.f140070I, this.f140074K, this.f140072J);
                            this.f140100e.mo103471a();
                        }
                        this.f140100e.m120419g(listM161444j0);
                    }
                } else {
                    if (this.f140100e == null) {
                        ed1 ed1Var3 = new ed1();
                        this.f140100e = ed1Var3;
                        ed1Var3.mo103474d(this.f140070I, this.f140074K, this.f140072J);
                        this.f140100e.mo103471a();
                    }
                    this.f140100e.m120419g(listM161444j0);
                }
            }
        }
        if (audioEffects != null) {
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            AudioEffects.C3989a audioSource = audioEffects.getAudioSource();
            if (audioBackgrounds != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoUseBgMusic(true);
                float fM19693a = audioSource == null ? 1.0f : audioSource.m19693a();
                for (AudioBackground audioBackground : audioBackgrounds) {
                    if (audioBackground.getBgPath() != null) {
                        ob1 ob1Var2 = new ob1();
                        this.f140102f = ob1Var2;
                        ob1Var2.m166914o(this.f140055A0);
                        this.f140102f.m166911l(new C18782h());
                        this.f140102f.mo103474d(this.f140070I, this.f140074K, this.f140072J);
                        if (!this.f140102f.m166907h(audioBackground.getBgPath(), audioBackground.getStart(), audioBackground.getEnd())) {
                            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Init Audio Mixer error !! Audio File [" + audioBackground.getBgPath() + "] maybe not exist !!");
                            return false;
                        }
                        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "bgPath:" + audioBackground.getBgPath() + " start:" + audioBackground.getStart() + "-end:" + audioBackground.getEnd());
                        this.f140102f.m166912m(fM19693a, audioBackground.getRatio());
                        break;
                    }
                }
            } else {
                rd1 rd1Var2 = new rd1();
                this.f140104g = rd1Var2;
                if (audioSource != null) {
                    rd1Var2.m180837g(audioSource.m19693a());
                }
            }
        }
        ob1 ob1Var3 = this.f140102f;
        if (ob1Var3 != null) {
            ob1Var3.m166910k(this.f140090Y / j);
        }
        m161412P0();
        if (this.f140094b == null) {
            this.f140134v = true;
            C4001o c4001o3 = new C4001o();
            this.f140094b = c4001o3;
            c4001o3.m19975O(this.f140086U);
            this.f140094b.m19972L(this.f140077L0);
            this.f140094b.m19976P(new C18783i());
        }
        this.f140094b.m19978w(this.f140096c);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public void m161407M0() {
        m161409N0(false);
    }

    /* JADX INFO: renamed from: N0 */
    private void m161409N0(boolean z) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess releaseEncoder !!! isCanceled " + z);
        AbstractC3991e abstractC3991e = this.f140118n;
        if (abstractC3991e != null) {
            abstractC3991e.m19725e(true);
            AbstractC3991e abstractC3991e2 = this.f140118n;
            if (z) {
                abstractC3991e2.mo19721a();
            } else {
                abstractC3991e2.mo19734n();
            }
            this.f140118n = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m161412P0() throws Throwable {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess resetAudioPlayer !!!");
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19712p();
            rb1 rb1Var = this.f140133u0;
            if (rb1Var != null) {
                rb1Var.mo103473c();
                this.f140098d.m19707j(this.f140133u0);
            }
            ed1 ed1Var = this.f140100e;
            if (ed1Var != null) {
                ed1Var.mo103473c();
                this.f140098d.m19707j(this.f140100e);
            }
            ob1 ob1Var = this.f140102f;
            if (ob1Var != null) {
                ob1Var.mo103473c();
                this.f140098d.m19707j(this.f140102f);
            } else {
                rd1 rd1Var = this.f140104g;
                if (rd1Var != null) {
                    this.f140098d.m19707j(rd1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m161415R0() {
        AbstractC3991e abstractC3991e;
        if (this.f140097c0 && this.f140117m0 == 0 && (abstractC3991e = this.f140118n) != null && (abstractC3991e instanceof C3998l)) {
            ((C3998l) abstractC3991e).m19892O(this.f140095b0);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m161419U0() {
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioSampleRate(this.f140070I);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioChannels(this.f140072J);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioBitrate(this.f140080O);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioEncode("audio/mp4a-latm");
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditCq(this.f140081P);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoEncode(YtVideoEncoder.MIME_TYPE);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoExtension("mp4");
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoWidth(this.f140054A);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoHeight(this.f140056B);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoBitrate(this.f140078M);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoRotation(this.f140079N);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoFrameRate(this.f140076L);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoGopSize(this.f140068H);
    }

    /* JADX INFO: renamed from: W0 */
    private void m161422W0(String str) {
        if (str == null) {
            return;
        }
        if (!new File(str).exists()) {
            MDLog.m7445e(this.f140092a, "mediaPath does not exist!");
            return;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            mediaMetadataRetriever.release();
            VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
            videoDataRetrieverBySoft.init(str);
            int frameRate = videoDataRetrieverBySoft.getFrameRate();
            videoDataRetrieverBySoft.release();
            if (strExtractMetadata2 != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginalNaturalWidth(Integer.parseInt(strExtractMetadata2));
            }
            if (strExtractMetadata3 != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginalNaturalHeight(Integer.parseInt(strExtractMetadata3));
            }
            if (strExtractMetadata != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginBitrate(Integer.parseInt(strExtractMetadata));
            }
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginVideoFps(frameRate);
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginAudioSamplerate(this.f140070I);
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginAudioChannels(this.f140072J);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g1 */
    private boolean m161439g1() throws Throwable {
        Object obj;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startEncoder !!!");
        if (this.f140094b == null && !m161452n0()) {
            return false;
        }
        C4001o c4001o = this.f140094b;
        if (c4001o == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "source error");
            return false;
        }
        c4001o.m19974N(false);
        this.f140094b.m19975O(false);
        this.f140094b.m19973M(1);
        rb1 rb1Var = this.f140133u0;
        if (rb1Var != null) {
            rb1Var.mo103473c();
            this.f140110j.m148918a(this.f140133u0);
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoSourcePitchShift(true);
        }
        ed1 ed1Var = this.f140100e;
        if (ed1Var != null) {
            ed1Var.mo103473c();
            this.f140110j.m148918a(this.f140100e);
        }
        ob1 ob1Var = this.f140102f;
        if (ob1Var != null) {
            ob1Var.mo103473c();
            this.f140110j.m148918a(this.f140102f);
        } else {
            rd1 rd1Var = this.f140104g;
            if (rd1Var != null) {
                this.f140110j.m148918a(rd1Var);
            }
        }
        if (!m161398F0(this.f140119n0)) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "initEncoder failed");
            return false;
        }
        if (this.f140099d0 == 0) {
            this.f140112k.m121219v0(new C18781g());
            this.f140112k.m121196e0();
            this.f140112k.m121223y0(null, new crf0(this.f140054A, this.f140056B));
        } else if ((this.f140118n instanceof C3998l) && (obj = this.f140103f0) != null) {
            this.f140112k.m121189Z(obj);
            this.f140112k.m121223y0(this.f140103f0, new crf0(this.f140054A, this.f140056B));
        }
        boolean z = this.f140134v;
        C4001o c4001o2 = this.f140094b;
        if (z) {
            if (!c4001o2.m19977Q()) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "mSourceManager start failed");
                return false;
            }
            this.f140134v = false;
        } else if (!c4001o2.m19971J(0L)) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "mSourceManager seek failed");
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    private void m161442i1(int i, int i2, int i3, int i4) {
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long j = i;
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-encode-file-width", j, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-height", i2, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-fps", i3, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-bitrate", i4, reportType);
    }

    /* JADX INFO: renamed from: j0 */
    private List<TimeRangeScale> m161444j0(List<TimeRangeScale> list, long j) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Adjust time range scale !!!");
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TimeRangeScale timeRangeScale : list) {
            long start = timeRangeScale.getStart() - j;
            long end = timeRangeScale.getEnd() - j;
            arrayList.add(new TimeRangeScale(start >= 0 ? start : 0L, end >= 0 ? end : 0L, timeRangeScale.getSpeed()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    private long m161446k0(long j, List<TimeRangeScale> list) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess calculateRealDuration !!!");
        if (list != null && list.size() > 0) {
            for (TimeRangeScale timeRangeScale : list) {
                float speed = timeRangeScale.getSpeed();
                long end = timeRangeScale.getEnd() - timeRangeScale.getStart();
                j += (((long) (end * speed)) - end) * 1000;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: l0 */
    private void m161448l0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess clearPreviousSource !!!");
        this.f140087V = false;
        C4001o c4001o = this.f140094b;
        if (c4001o != null) {
            c4001o.m19970F();
            this.f140094b = null;
        }
        C4000n c4000n = this.f140096c;
        if (c4000n != null) {
            c4000n.m19936g();
            this.f140096c = null;
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210171n();
        }
        ka1 ka1Var = this.f140110j;
        if (ka1Var != null) {
            ka1Var.m148919b();
        }
        qvf0 qvf0Var = this.f140106h;
        if (qvf0Var != null) {
            qvf0Var.m178288f();
            this.f140106h = null;
        }
        eli0 eli0Var = this.f140112k;
        if (eli0Var == null || this.f140057B0) {
            return;
        }
        ((abh0) eli0Var).m96755G0();
    }

    /* JADX INFO: renamed from: m0 */
    private AbstractC3999m m161450m0(String str) {
        int i;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess createNewMediaSource !!! mediaPath:" + str);
        if (str == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Invalid mediaPath");
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + 5001, " Fail to create new source, mediaPath is null!");
            }
            return null;
        }
        if (!new File(str).exists()) {
            MDLog.m7445e(this.f140092a, "mediaPath does not exist!");
            apw apwVar2 = this.f140109i0;
            if (apwVar2 != null) {
                apwVar2.onError(this.f140139x0 + 5001, " Fail to create new source, mediaPath does not exist! mediaPath:".concat(str));
            }
            return null;
        }
        AbstractC3999m c3993g = this.f140057B0 ? new C3993g() : new C3995i();
        c3993g.m19915v(this.f140070I, this.f140074K, this.f140072J);
        c3993g.m19902A(this.f140091Z);
        c3993g.m19916w(new C18791q());
        eli0 eli0Var = this.f140112k;
        if (eli0Var != null && !this.f140057B0) {
            if (((abh0) eli0Var).mo96763j0() == null) {
                ((abh0) this.f140112k).m96759K0();
            }
            c3993g.m19918y(((abh0) this.f140112k).mo96763j0(), ((abh0) this.f140112k).m96758J0(), ((abh0) this.f140112k).m96757I0());
        }
        if (!c3993g.mo19770p(str, 17)) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "init Source Error");
            return null;
        }
        c3993g.m19917x(false);
        if (this.f140117m0 == 1 || this.f140072J <= 0) {
            int iM19905f = c3993g.m19905f();
            this.f140072J = iM19905f;
            if (iM19905f <= 0) {
                iM19905f = 1;
            }
            this.f140072J = iM19905f;
        }
        if (this.f140117m0 == 1 || this.f140070I <= 0) {
            int iM19906g = c3993g.m19906g();
            this.f140070I = iM19906g;
            if (iM19906g <= 0) {
                iM19906g = 44100;
            }
            this.f140070I = iM19906g;
        }
        int iM19910k = c3993g.m19910k();
        if (iM19910k == 90 || iM19910k == 270) {
            this.f140058C = c3993g.m19908i();
            this.f140060D = c3993g.m19913n();
            eli0 eli0Var2 = this.f140112k;
            if (eli0Var2 != null) {
                eli0Var2.mo96768x0(this.f140062E);
                boolean z = this.f140057B0;
                eli0 eli0Var3 = this.f140112k;
                if (z) {
                    eli0Var3.m177858R(new crf0(this.f140060D, this.f140058C));
                } else {
                    eli0Var3.m177858R(new crf0(this.f140058C, this.f140060D));
                }
            }
        } else {
            this.f140058C = c3993g.m19913n();
            this.f140060D = c3993g.m19908i();
            eli0 eli0Var4 = this.f140112k;
            if (eli0Var4 != null) {
                eli0Var4.mo96768x0(this.f140062E);
                this.f140112k.m177858R(new crf0(this.f140058C, this.f140060D));
            }
        }
        int i2 = this.f140058C;
        if (i2 > 0 && (i = this.f140060D) > 0) {
            this.f140064F = i2;
            this.f140066G = i;
            this.f140062E = iM19910k;
            m161422W0(str);
            return c3993g;
        }
        MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Analyse souce error");
        apw apwVar3 = this.f140109i0;
        if (apwVar3 != null) {
            apwVar3.onError(this.f140139x0 + 5001, " Fail to create new source, Analyse souce error! mOutWidth:" + this.f140058C + " mOutHeight:" + this.f140060D);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m161452n0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess doUpdateEffectModel !!!");
        this.f140141y0 = true;
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210174q();
            this.f140108i.m210171n();
        }
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19709m();
            this.f140098d.m19708l();
        }
        if (!m161400G0()) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "init Source Error");
            return false;
        }
        qvf0 qvf0Var = this.f140106h;
        if (qvf0Var != null) {
            qvf0Var.mo178283a();
        }
        xcl0 xcl0Var2 = this.f140108i;
        if (xcl0Var2 != null) {
            xcl0Var2.m210182z(this.f140106h);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m161454o0(long j) throws IOException {
        if (this.f140119n0 == null) {
            MDLog.m7445e(this.f140092a, "mediaPath is null!");
            return;
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoProcessTime(System.currentTimeMillis() - j);
        File file = new File(this.f140119n0);
        if (!file.exists() || !file.isFile()) {
            MDLog.m7445e(this.f140092a, "mediaPath does not exist!");
            return;
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileSize(file.length());
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f140119n0);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        videoDataRetrieverBySoft.init(this.f140119n0);
        int frameRate = videoDataRetrieverBySoft.getFrameRate();
        videoDataRetrieverBySoft.release();
        if (strExtractMetadata != null) {
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileBitrate(Integer.parseInt(strExtractMetadata));
        }
        if (strExtractMetadata2 != null) {
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileWidth(Integer.parseInt(strExtractMetadata2));
        }
        if (strExtractMetadata3 != null) {
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileHeight(Integer.parseInt(strExtractMetadata3));
        }
        if (strExtractMetadata4 != null) {
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileDuration(Long.parseLong(strExtractMetadata4));
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileFps(frameRate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public long m161456p0() {
        qvf0 qvf0Var = this.f140106h;
        if (qvf0Var != null) {
            return qvf0Var.m178285c();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public void m161459r0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess handleChangeToPreviewMode !!!");
        this.f140087V = false;
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210175r();
        }
        C4001o c4001o = this.f140094b;
        if (c4001o != null) {
            c4001o.m19967B();
        }
        m161409N0(true);
        m161448l0();
        if (this.f140098d == null) {
            C3990d c3990d = new C3990d(false);
            this.f140098d = c3990d;
            c3990d.m19715s(this);
            this.f140098d.m19717u(new C18790p());
            if (!this.f140098d.m19710n(this.f140070I, this.f140074K, this.f140072J)) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "mAudioPlayer prepare failed");
                return;
            }
        }
        this.f140117m0 = 1;
        xcl0 xcl0Var2 = this.f140108i;
        if (xcl0Var2 != null) {
            xcl0Var2.m210181y(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m161461s0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess handleClearCodec !!!");
        m161448l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m161463t0(String str) throws Throwable {
        boolean zM161439g1;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "makevideo() path:" + str);
        this.f140119n0 = str;
        if (this.f140054A <= 0) {
            this.f140054A = (this.f140058C >> 4) << 4;
        }
        if (this.f140056B <= 0) {
            this.f140056B = (this.f140060D >> 4) << 4;
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210174q();
            this.f140108i.m210181y(1);
        }
        m161448l0();
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19711o();
            this.f140098d = null;
        }
        this.f140126r = true;
        if (this.f140093a0) {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess use bgChanger !!!");
            FFBgChanger fFBgChanger = this.f140116m;
            if (fFBgChanger != null) {
                fFBgChanger.release();
                this.f140116m = null;
            }
            if (m161396E0()) {
                this.f140093a0 = false;
                this.f140116m.startProcess();
                zM161439g1 = true;
            } else {
                zM161439g1 = m161439g1();
            }
        } else {
            zM161439g1 = m161439g1();
        }
        if (!zM161439g1) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "startEncoder error");
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoIsEdited(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m161465u0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "pause preview");
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19709m();
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210174q();
        }
        ipw ipwVar = this.f140125q0;
        if (ipwVar != null) {
            ipwVar.mo63633l0();
        }
        this.f140087V = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public void m161467v0(EffectModel effectModel) {
        i3f0 i3f0Var;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess prepare");
        if (effectModel == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Invalid model");
            jpw jpwVar = this.f140107h0;
            if (jpwVar != null) {
                jpwVar.mo115360a(this.f140139x0 + 5001, 5001, "Invalid model !!!");
            }
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + 5001, "Invalid model !!!");
                return;
            }
            return;
        }
        if (this.f140140y == null) {
            this.f140140y = new Handler(Looper.getMainLooper());
        }
        if (this.f140129s0 == null) {
            this.f140129s0 = new i3f0();
        }
        if (this.f140091Z == null && (i3f0Var = this.f140129s0) != null) {
            this.f140091Z = i3f0Var.m138283a(null);
        }
        this.f140095b0.putInt("request-sync", 1);
        this.f140121o0 = effectModel;
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210168A();
        }
        m161452n0();
        rpw rpwVar = this.f140127r0;
        if (rpwVar != null) {
            rpwVar.mo154011l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public void m161469w0(boolean z) {
        C4001o c4001o = this.f140094b;
        if (c4001o != null) {
            if (!this.f140087V && !this.f140142z) {
                c4001o.m19969E(false);
            } else {
                c4001o.m19969E(z);
                this.f140142z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m161471x0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess release !!!");
        m161407M0();
        C4001o c4001o = this.f140094b;
        if (c4001o != null && this.f140117m0 == 1) {
            c4001o.m19975O(false);
            this.f140094b.m19974N(false);
            this.f140094b.m19967B();
        }
        C4001o c4001o2 = this.f140094b;
        if (c4001o2 != null) {
            c4001o2.m19970F();
            this.f140094b = null;
        }
        C4000n c4000n = this.f140096c;
        if (c4000n != null) {
            c4000n.m19936g();
            this.f140096c = null;
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210176s();
        }
        ob1 ob1Var = this.f140102f;
        if (ob1Var != null) {
            ob1Var.m166909j();
            this.f140102f = null;
        }
        qvf0 qvf0Var = this.f140106h;
        if (qvf0Var != null) {
            qvf0Var.m178288f();
            this.f140106h = null;
        }
        ed1 ed1Var = this.f140100e;
        if (ed1Var != null) {
            ed1Var.m120418f();
            this.f140100e = null;
        }
        rb1 rb1Var = this.f140133u0;
        if (rb1Var != null) {
            rb1Var.m180722f();
            this.f140133u0 = null;
        }
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19711o();
            this.f140098d = null;
        }
        if (this.f140140y != null) {
            this.f140140y = null;
        }
        FFBgChanger fFBgChanger = this.f140116m;
        if (fFBgChanger != null) {
            fFBgChanger.release();
            this.f140116m = null;
        }
        n4b0 n4b0Var = this.f140071I0;
        if (n4b0Var != null) {
            n4b0Var.m161557a();
            this.f140071I0 = null;
        }
        oej oejVar = this.f140114l;
        if (oejVar != null) {
            oejVar.m167368a();
            this.f140114l = null;
        }
        i3f0 i3f0Var = this.f140129s0;
        if (i3f0Var != null) {
            i3f0Var.m138284b();
            this.f140129s0 = null;
            this.f140091Z = null;
        }
        if (this.f140109i0 != null) {
            this.f140109i0 = null;
        }
        this.f140136w = null;
        this.f140117m0 = -1;
        this.f140121o0 = null;
        this.f140143z0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m161473y0() throws Throwable {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "resume mIsUpdate = " + this.f140132u);
        if (this.f140094b == null && !m161452n0()) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "doUpdateEffectModel failed!!!");
            return;
        }
        C4001o c4001o = this.f140094b;
        if (c4001o == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "Invalid SourceManager");
            jpw jpwVar = this.f140107h0;
            if (jpwVar != null) {
                jpwVar.mo115360a(this.f140139x0 + ErrorCode.EDIT_RESUME_FAILED, ErrorCode.EDIT_RESUME_FAILED, "Invalid SourceManager");
            }
            apw apwVar = this.f140109i0;
            if (apwVar != null) {
                apwVar.onError(this.f140139x0 + ErrorCode.EDIT_RESUME_FAILED, "Invalid SourceManager");
                return;
            }
            return;
        }
        if (this.f140132u) {
            if (this.f140134v) {
                c4001o.m19974N(true);
                this.f140094b.m19977Q();
                this.f140134v = false;
                if (this.f140143z0) {
                    m161475z0();
                }
            } else {
                m161475z0();
            }
            this.f140132u = false;
        }
        int i = this.f140117m0;
        C4001o c4001o2 = this.f140094b;
        if (i == 1) {
            c4001o2.m19975O(this.f140086U);
        } else {
            c4001o2.m19975O(false);
        }
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19713q();
        }
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210177u();
        }
        this.f140087V = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m161475z0() throws Throwable {
        long j;
        ipw ipwVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f140090Y;
        boolean z = this.f140128s;
        long j3 = j2 / 1000;
        MDLog.m7449i("SeekDiag", "handleSeek START targetMs=" + j3 + " play=" + z + " thread=" + Thread.currentThread().getName());
        StringBuilder sb = new StringBuilder("seek isPlay = ");
        sb.append(z);
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, sb.toString());
        if (this.f140094b != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f140094b.m19967B();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            xcl0 xcl0Var = this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210174q();
                this.f140108i.m210171n();
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            this.f140142z = true;
            C3990d c3990d = this.f140098d;
            if (c3990d != null) {
                c3990d.m19709m();
                this.f140098d.m19712p();
            }
            this.f140087V = z;
            EffectModel effectModel = this.f140121o0;
            if (effectModel == null || effectModel.getVideoEffects() == null) {
                j = 1000;
            } else {
                List<TimeRangeScale> listM161444j0 = m161444j0(this.f140121o0.getVideoEffects().getTimeRangeScales(), j3);
                j = 1000;
                ed1 ed1Var = this.f140100e;
                if (ed1Var != null) {
                    ed1Var.m120419g(listM161444j0);
                }
                qvf0 qvf0Var = this.f140106h;
                if (qvf0Var != null) {
                    qvf0Var.m178289g(listM161444j0);
                }
            }
            qvf0 qvf0Var2 = this.f140106h;
            if (qvf0Var2 != null) {
                qvf0Var2.mo178283a();
            }
            ob1 ob1Var = this.f140102f;
            if (ob1Var != null) {
                ob1Var.m166910k(j3);
            }
            ed1 ed1Var2 = this.f140100e;
            if (ed1Var2 != null) {
                ed1Var2.mo103473c();
            }
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            this.f140094b.m19971J(j2);
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            rb1 rb1Var = this.f140133u0;
            if (rb1Var != null) {
                rb1Var.m180723g(j2, this.f140085T);
            }
            long j4 = this.f140085T;
            if (j4 != 0 && (ipwVar = this.f140125q0) != null) {
                ipwVar.mo63626W((j2 * 1.0f) / j4);
            }
            MDLog.m7449i("SeekDiag", "handleSeek END total=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms srcPause=" + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms vcpPause=" + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms srcSeek=" + (jCurrentTimeMillis6 - jCurrentTimeMillis5) + "ms mIsPlaying=" + this.f140087V);
        } else {
            j = 1000;
            MDLog.m7453w("SeekDiag", "handleSeek mSourceManager is NULL!");
        }
        boolean z2 = (this.f140090Y == j2 && this.f140128s == z) ? false : true;
        this.f140130t = false;
        if (!z2 || this.f140112k == null) {
            return;
        }
        this.f140130t = true;
        MDLog.m7449i("SeekDiag", "handleSeek REPOST newTargetMs=" + (this.f140090Y / j) + " newPlay=" + this.f140128s);
        this.f140112k.m121206m0(260);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m161476H0() {
        if (this.f140117m0 == 1) {
            return this.f140087V;
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public synchronized void m161477I0(String str) {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess makeVideo !!! path:" + str);
            if (str == null) {
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "make video path error");
                jpw jpwVar = this.f140107h0;
                if (jpwVar != null) {
                    jpwVar.mo115360a(this.f140139x0 + 5002, 5002, "make video path is empty !!!");
                }
                apw apwVar = this.f140109i0;
                if (apwVar != null) {
                    apwVar.onError(this.f140139x0 + 5002, "make video path is empty !!!");
                }
                return;
            }
            this.f140087V = false;
            xcl0 xcl0Var = this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210174q();
            }
            eli0 eli0Var = this.f140112k;
            if (eli0Var != null) {
                if (this.f140117m0 != -1) {
                    eli0Var.mo121188P();
                    this.f140112k.m177844B();
                }
                this.f140117m0 = 0;
                this.f140126r = false;
                this.f140112k.m121208n0(263, str);
                if (!this.f140093a0) {
                    this.f140112k.m177855N();
                    this.f140112k.m177859S(this.f140124q);
                    this.f140112k.m177851J();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m161478J0() {
        eli0 eli0Var;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "pause()");
        if (this.f140117m0 != 1 || (eli0Var = this.f140112k) == null) {
            return;
        }
        eli0Var.m177847E();
    }

    /* JADX INFO: renamed from: K0 */
    public synchronized boolean m161479K0(String str) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "prepare()");
        if (str == null) {
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "json is null");
            return false;
        }
        eli0 eli0Var = this.f140112k;
        if (eli0Var != null) {
            eli0Var.m121208n0(262, EffectModel.getEffectModel(str));
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public synchronized void m161480L0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess release() ");
        eli0 eli0Var = this.f140112k;
        if (eli0Var != null) {
            eli0Var.mo121187G();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public synchronized void m161481O0() {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "removeSurface()");
            xcl0 xcl0Var = this.f140108i;
            if (xcl0Var != null && this.f140117m0 == 1) {
                xcl0Var.m210174q();
            }
            eli0 eli0Var = this.f140112k;
            if (eli0Var != null && this.f140117m0 == 1) {
                eli0Var.mo121188P();
                this.f140112k.m177849H(this.f140138x);
            }
            this.f140136w = null;
            this.f140138x = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m161482Q0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "resume()");
        MDLog.m7449i("SeekDiag", "resume() mIsPlaying=" + this.f140087V + " mSeekPending=" + this.f140130t + " thread=" + Thread.currentThread().getName());
        eli0 eli0Var = this.f140112k;
        if (eli0Var != null) {
            eli0Var.m177851J();
        }
        if (this.f140117m0 == 1) {
            eli0 eli0Var2 = this.f140112k;
            Object obj = this.f140138x;
            crf0 crf0Var = this.f140063E0;
            if (crf0Var == null) {
                crf0Var = new crf0(this.f140058C, this.f140060D);
            }
            eli0Var2.m121223y0(obj, crf0Var);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public synchronized void m161484T0(EffectModel effectModel) {
        this.f140121o0 = effectModel;
    }

    /* JADX INFO: renamed from: V0 */
    public void m161485V0(boolean z) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "setLoopBack()    isLoopBack = " + z);
        this.f140086U = z;
        C4001o c4001o = this.f140094b;
        if (c4001o != null) {
            c4001o.m19975O(z);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m161486X0(apw apwVar) {
        this.f140109i0 = apwVar;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m161487Y0(rpw rpwVar) {
        synchronized (this.f140123p0) {
            this.f140127r0 = rpwVar;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m161488Z0(jpw jpwVar) {
        synchronized (this.f140123p0) {
            this.f140107h0 = jpwVar;
        }
    }

    @Override // p153l.ka1.InterfaceC18125a
    /* JADX INFO: renamed from: a */
    public void mo148923a(ByteBuffer byteBuffer, int i, long j) {
        ad60 ad60Var = new ad60(i);
        byteBuffer.position(0);
        ad60Var.m97015a().position(0);
        byteBuffer.get(ad60Var.m97015a().array());
        ad60Var.m97018d(i, 0, 0, j, 0);
        ad60Var.m97015a().position(0);
        byteBuffer.position(0);
        C3990d c3990d = this.f140098d;
        if (c3990d != null) {
            c3990d.m19719x(ad60Var);
        }
        ad60Var.m97015a().position(0);
        AbstractC3991e abstractC3991e = this.f140118n;
        if (abstractC3991e != null) {
            abstractC3991e.mo19722b(ad60Var);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m161489a1(kpw kpwVar) {
        synchronized (this.f140123p0) {
            this.f140105g0 = kpwVar;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m161490b1(int i, int i2, int i3, int i4, boolean z) {
        m161442i1(i, i2, i3, i4);
        synchronized (this.f140123p0) {
            try {
                this.f140054A = (i >> 4) << 4;
                this.f140056B = (i2 >> 4) << 4;
                this.f140078M = i4;
                if (i3 > 3) {
                    this.f140076L = i3;
                } else {
                    this.f140076L = 4;
                }
                this.f140079N = 0;
                this.f140081P = z;
                MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "setOutMediaVideoInfo mEncodeWidth = " + this.f140054A + " mEncodeHeight = " + this.f140056B + " mOutVideoBitrate = " + this.f140078M + " mOutVideoFps = " + this.f140076L + " mOutVideoRotation = " + this.f140079N + " mOutVideoUseCQ = " + this.f140081P);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m161491c1(float f) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess setPlayingMusicAudioRatio ratio = " + f);
        ob1 ob1Var = this.f140102f;
        if (ob1Var != null) {
            ob1Var.m166913n(f);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m161492d1(float f) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess setPlayingSrcAudioRatio ratio = " + f);
        ob1 ob1Var = this.f140102f;
        if (ob1Var != null) {
            ob1Var.m166915p(f);
        }
        rd1 rd1Var = this.f140104g;
        if (rd1Var != null) {
            rd1Var.m180837g(f);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m161493e1(ipw ipwVar) {
        synchronized (this.f140123p0) {
            this.f140125q0 = ipwVar;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m161494f1(boolean z) {
        MDLog.m7443d(this.f140092a, "AudioDecoderType:".concat(z ? "Soft" : "Hard"));
        this.f140055A0 = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m161495h0(kt2 kt2Var) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "addFilters()");
        this.f140124q = kt2Var;
    }

    /* JADX INFO: renamed from: h1 */
    public synchronized void m161496h1() {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startPreview !!!");
            eli0 eli0Var = this.f140112k;
            if (eli0Var != null) {
                this.f140117m0 = 1;
                Object obj = this.f140138x;
                if (obj == null) {
                    jpw jpwVar = this.f140107h0;
                    if (jpwVar != null) {
                        jpwVar.mo115360a(this.f140139x0 + ErrorCode.EDIT_PREVIEW_FAILED, ErrorCode.EDIT_PREVIEW_FAILED, "The Screen surface is invalid !!!");
                    }
                    apw apwVar = this.f140109i0;
                    if (apwVar != null) {
                        apwVar.onError(this.f140139x0 + ErrorCode.EDIT_PREVIEW_FAILED, "The Screen surface is invalid !!!");
                    }
                    MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (this.f140139x0 + ErrorCode.EDIT_PREVIEW_FAILED) + "]The Screen surface is invalid !!!");
                    return;
                }
                eli0Var.m121190a0(obj);
                this.f140112k.m121206m0(259);
                this.f140112k.m177855N();
                this.f140112k.m177859S(this.f140124q);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public synchronized void m161497i0(SurfaceTexture surfaceTexture) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "addSurfaceTexture() ");
        this.f140138x = surfaceTexture;
    }

    /* JADX INFO: renamed from: j1 */
    public synchronized void m161498j1() {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "stopPreview() holder ");
            eli0 eli0Var = this.f140112k;
            if (eli0Var != null && this.f140117m0 == 1) {
                eli0Var.mo121188P();
            }
            this.f140112k.m121206m0(272);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k1 */
    public synchronized void m161499k1(String str, long j, boolean z) {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess updateEffect!!!");
            if (str == null) {
                jpw jpwVar = this.f140107h0;
                if (jpwVar != null) {
                    jpwVar.mo115360a(this.f140139x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, ErrorCode.EDIT_UPDATEEFFECT_FAILED, "effect error!!!");
                }
                apw apwVar = this.f140109i0;
                if (apwVar != null) {
                    apwVar.onError(this.f140139x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, " json is null!!!");
                }
                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "[" + (this.f140139x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED) + "]json is null!!!");
                return;
            }
            this.f140143z0 = false;
            if (j > 0) {
                this.f140143z0 = true;
            }
            this.f140128s = z;
            this.f140090Y = j * 1000;
            EffectModel effectModel = EffectModel.getEffectModel(str);
            if (effectModel != null) {
                eli0 eli0Var = this.f140112k;
                if (eli0Var != null) {
                    eli0Var.m121208n0(261, effectModel);
                }
                return;
            }
            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "updateEffect model error");
            jpw jpwVar2 = this.f140107h0;
            if (jpwVar2 != null) {
                jpwVar2.mo115360a(this.f140139x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, ErrorCode.EDIT_UPDATEEFFECT_FAILED, "effect error!!!");
            }
            apw apwVar2 = this.f140109i0;
            if (apwVar2 != null) {
                apwVar2.onError(this.f140139x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, " mInputEffectModel is null!!!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.C3990d.d
    public void onAudioPlayingPosition(long j) {
        xcl0 xcl0Var = this.f140108i;
        if (xcl0Var != null) {
            xcl0Var.m210179w(j);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public synchronized boolean m161500q0() {
        return this.f140117m0 == 1;
    }

    /* JADX INFO: renamed from: l.n410$k */
    public class C18785k implements C4001o.d {

        /* JADX INFO: renamed from: l.n410$k$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SurfaceHolder surfaceHolder;
                if (n410.this.f140136w == null || (surfaceHolder = (SurfaceHolder) n410.this.f140136w.get()) == null) {
                    return;
                }
                surfaceHolder.setFixedSize(n410.this.f140058C, n410.this.f140060D);
            }
        }

        public C18785k() {
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: a */
        public void mo19980a() throws Throwable {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "loop back again !!!");
            qvf0 qvf0Var = n410.this.f140106h;
            if (qvf0Var != null) {
                qvf0Var.mo178283a();
            }
            ed1 ed1Var = n410.this.f140100e;
            if (ed1Var != null) {
                ed1Var.mo103473c();
            }
            ob1 ob1Var = n410.this.f140102f;
            if (ob1Var != null) {
                ob1Var.mo103473c();
            }
            rb1 rb1Var = n410.this.f140133u0;
            if (rb1Var != null) {
                rb1Var.mo103473c();
            }
            C3990d c3990d = n410.this.f140098d;
            if (c3990d != null) {
                c3990d.m19712p();
            }
            n410.this.f140088W = 0L;
            n410.this.f140090Y = 0L;
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: b */
        public void mo19981b(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                return;
            }
            n410.this.m161415R0();
            crf0 crf0Var = n410.this.f140063E0;
            n410 n410Var = n410.this;
            crf0 crf0Var2 = crf0Var == null ? new crf0(n410Var.f140058C, n410.this.f140060D) : n410Var.f140063E0;
            if (n410.this.f140073J0) {
                n410.this.getClass();
            }
            eli0 eli0Var = n410.this.f140112k;
            if (eli0Var != null) {
                ((v5c) eli0Var).m199834r1(byteBuffer.array(), byteBuffer.limit());
                if (n410.this.f140117m0 == 1 && n410.this.f140141y0) {
                    n410 n410Var2 = n410.this;
                    n410Var2.f140112k.m121223y0(n410Var2.f140138x, crf0Var2);
                    n410.this.f140141y0 = false;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: c */
        public void mo19982c(long j) {
            if (j == -1) {
                MDLog.m7443d(n410.this.f140092a, "Pts is -1");
            }
            xcl0 xcl0Var = n410.this.f140108i;
            if (xcl0Var != null) {
                xcl0Var.m210169l(j);
            }
            if (j == -1) {
                return;
            }
            if (n410.this.f140105g0 != null && n410.this.f140117m0 == 0 && n410.this.f140126r) {
                n410.this.f140137w0 = System.currentTimeMillis();
                if (n410.this.f140085T != 0) {
                    long j2 = n410.this.f140090Y + j;
                    long j3 = n410.this.f140085T;
                    n410 n410Var = n410.this;
                    if (j2 > j3) {
                        n410Var.f140105g0.onProcessProgress((j * 1.0f) / n410.this.f140085T);
                    } else {
                        n410Var.f140105g0.onProcessProgress(((n410.this.f140090Y + j) * 1.0f) / n410.this.f140085T);
                    }
                }
            }
            synchronized (n410.this.f140089X) {
                try {
                    long j4 = j + n410.this.f140090Y;
                    if (n410.this.f140125q0 != null && n410.this.f140117m0 == 1) {
                        n410.this.f140125q0.mo63634n(j4 / 1000);
                    }
                    n410 n410Var2 = n410.this;
                    if (n410Var2.f140088W >= j4) {
                        j4 = n410.this.f140088W;
                    }
                    n410Var2.f140088W = j4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: d */
        public void mo19983d(MediaFormat mediaFormat) {
            ka1 ka1Var = n410.this.f140110j;
            if (ka1Var != null) {
                ka1Var.m148922e(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: f */
        public void mo19985f() {
            n410.this.f140087V = false;
            MDLog.m7449i("SeekDiag", "onPreviewFinished mIsLoopbackMode=" + n410.this.f140086U + " mSeekPending=" + n410.this.f140130t + " thread=" + Thread.currentThread().getName());
            if (n410.this.f140125q0 != null) {
                n410.this.f140125q0.mo63626W(1.0f);
                n410.this.f140125q0.mo63635z();
                n410.this.f140125q0.mo63633l0();
                n410.this.f140125q0.mo63634n(n410.this.f140088W / 1000);
                n410.this.f140088W = 0L;
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess onPreviewFinished !!!");
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: g */
        public void mo19986g(ByteBuffer byteBuffer, int i, long j) {
            ka1 ka1Var = n410.this.f140110j;
            if (ka1Var != null) {
                ka1Var.m148920c(byteBuffer, i, j);
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: h */
        public void mo19987h(MediaFormat mediaFormat) {
            boolean z;
            if (mediaFormat == null) {
                return;
            }
            if (n410.this.f140136w != null) {
                n410.this.f140140y.post(new a());
            }
            int integer = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
            if (integer != n410.this.f140062E) {
                if (mediaFormat.containsKey("width")) {
                    n410.this.f140064F = mediaFormat.getInteger("width");
                }
                if (mediaFormat.containsKey("height")) {
                    n410.this.f140066G = mediaFormat.getInteger("height");
                }
                z = true;
            } else {
                z = false;
            }
            boolean z2 = n410.this.f140057B0;
            n410 n410Var = n410.this;
            if (!z2) {
                eli0 eli0Var = n410Var.f140112k;
                if (eli0Var != null) {
                    if (z) {
                        eli0Var.mo96768x0(n410Var.f140062E);
                    } else {
                        eli0Var.mo96768x0(0);
                    }
                    n410 n410Var2 = n410.this;
                    n410Var2.f140112k.m177858R(new crf0(n410Var2.f140064F, n410.this.f140066G));
                    return;
                }
                return;
            }
            eli0 eli0Var2 = n410Var.f140112k;
            if (eli0Var2 != null) {
                eli0Var2.mo96768x0(n410Var.f140062E);
                if (integer == 90 || integer == 270) {
                    n410 n410Var3 = n410.this;
                    n410Var3.f140112k.m177858R(new crf0(n410Var3.f140066G, n410.this.f140064F));
                } else {
                    n410 n410Var4 = n410.this;
                    n410Var4.f140112k.m177858R(new crf0(n410Var4.f140064F, n410.this.f140066G));
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: i */
        public void mo19988i(SurfaceTexture surfaceTexture) {
            n410.this.m161415R0();
            n410 n410Var = n410.this;
            if (n410Var.f140112k != null) {
                if (n410Var.f140061D0 > 0 && n410.this.f140061D0 <= 15) {
                    synchronized (n410.this.f140059C0) {
                        try {
                            n410 n410Var2 = n410.this;
                            n410Var2.f140059C0.wait(n410Var2.f140061D0);
                        } catch (InterruptedException e) {
                            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, e.toString());
                        }
                    }
                }
                crf0 crf0Var = n410.this.f140063E0;
                n410 n410Var3 = n410.this;
                crf0 crf0Var2 = crf0Var == null ? new crf0(n410Var3.f140058C, n410.this.f140060D) : n410Var3.f140063E0;
                if (n410.this.f140073J0 && ((abh0) n410.this.f140112k).mo96763j0() != null) {
                    try {
                        ((abh0) n410.this.f140112k).m96760M0();
                    } catch (RuntimeException unused) {
                        MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "SurfaceTexture updateTexImage failed!!");
                    }
                }
                n410.this.getClass();
                ((abh0) n410.this.f140112k).onFrameAvailable(surfaceTexture);
                if (n410.this.f140117m0 == 1 && n410.this.f140141y0) {
                    n410 n410Var4 = n410.this;
                    n410Var4.f140112k.m121223y0(n410Var4.f140138x, crf0Var2);
                    n410.this.f140141y0 = false;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        public void onFinished() throws IOException {
            if (n410.this.f140117m0 == 0) {
                n410.this.m161407M0();
            }
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "On process Finished");
            MDLog.m7449i("SeekDiag", "onFinished mMode=" + n410.this.f140117m0 + " mIsLoopbackMode=" + n410.this.f140086U + " mSeekPending=" + n410.this.f140130t + " thread=" + Thread.currentThread().getName());
            n410.this.f140087V = false;
            int i = n410.this.f140117m0;
            n410 n410Var = n410.this;
            if (i != 1) {
                if (n410Var.f140105g0 != null) {
                    n410.this.f140105g0.onProcessProgress(1.0f);
                    n410.this.f140105g0.mo62200a();
                    n410 n410Var2 = n410.this;
                    n410Var2.m161454o0(n410Var2.f140137w0);
                    return;
                }
                return;
            }
            if (n410Var.f140125q0 != null) {
                n410.this.f140125q0.mo63635z();
                n410.this.f140125q0.mo63633l0();
                n410.this.f140125q0.mo63626W(1.0f);
                n410.this.f140125q0.mo63634n(n410.this.f140088W / 1000);
                n410.this.f140088W = 0L;
            }
        }

        @Override // com.immomo.moment.mediautils.C4001o.d
        /* JADX INFO: renamed from: e */
        public void mo19984e(int i) {
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m161483S0(bvb bvbVar) {
    }
}
