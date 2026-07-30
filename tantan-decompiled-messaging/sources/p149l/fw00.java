package p149l;

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
import com.immomo.moment.mediautils.AbstractC3848e;
import com.immomo.moment.mediautils.AbstractC3856m;
import com.immomo.moment.mediautils.C3847d;
import com.immomo.moment.mediautils.C3850g;
import com.immomo.moment.mediautils.C3852i;
import com.immomo.moment.mediautils.C3854k;
import com.immomo.moment.mediautils.C3855l;
import com.immomo.moment.mediautils.C3857n;
import com.immomo.moment.mediautils.C3858o;
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
public class fw00 implements da1.InterfaceC16320a, C3847d.d {

    /* JADX INFO: renamed from: E0 */
    private tif0 f99497E0;

    /* JADX INFO: renamed from: F0 */
    private boolean f99499F0;

    /* JADX INFO: renamed from: I0 */
    private jwa0 f99505I0;

    /* JADX INFO: renamed from: Z */
    private qie f99525Z;

    /* JADX INFO: renamed from: b */
    C3858o f99528b;

    /* JADX INFO: renamed from: c */
    C3857n f99530c;

    /* JADX INFO: renamed from: d */
    C3847d f99532d;

    /* JADX INFO: renamed from: e */
    xc1 f99534e;

    /* JADX INFO: renamed from: f */
    hb1 f99536f;

    /* JADX INFO: renamed from: f0 */
    private Object f99537f0;

    /* JADX INFO: renamed from: g */
    kd1 f99538g;

    /* JADX INFO: renamed from: g0 */
    private lmw f99539g0;

    /* JADX INFO: renamed from: h */
    hnf0 f99540h;

    /* JADX INFO: renamed from: h0 */
    private kmw f99541h0;

    /* JADX INFO: renamed from: i */
    s3l0 f99542i;

    /* JADX INFO: renamed from: j */
    da1 f99544j;

    /* JADX INFO: renamed from: k */
    eci0 f99546k;

    /* JADX INFO: renamed from: l */
    ubj f99548l;

    /* JADX INFO: renamed from: m */
    FFBgChanger f99550m;

    /* JADX INFO: renamed from: n */
    AbstractC3848e f99552n;

    /* JADX INFO: renamed from: n0 */
    private String f99553n0;

    /* JADX INFO: renamed from: o */
    C3855l f99554o;

    /* JADX INFO: renamed from: p */
    C3854k f99556p;

    /* JADX INFO: renamed from: q */
    private us2 f99558q;

    /* JADX INFO: renamed from: q0 */
    private jmw f99559q0;

    /* JADX INFO: renamed from: r0 */
    private smw f99561r0;

    /* JADX INFO: renamed from: s0 */
    private bve0 f99563s0;

    /* JADX INFO: renamed from: u0 */
    kb1 f99567u0;

    /* JADX INFO: renamed from: w */
    private WeakReference<SurfaceHolder> f99570w;

    /* JADX INFO: renamed from: x */
    private Object f99572x;

    /* JADX INFO: renamed from: y */
    private Handler f99574y;

    /* JADX INFO: renamed from: a */
    private String f99526a = "MomoProcess";

    /* JADX INFO: renamed from: r */
    private boolean f99560r = false;

    /* JADX INFO: renamed from: s */
    private boolean f99562s = true;

    /* JADX INFO: renamed from: t */
    private volatile boolean f99564t = false;

    /* JADX INFO: renamed from: u */
    private boolean f99566u = false;

    /* JADX INFO: renamed from: v */
    private boolean f99568v = false;

    /* JADX INFO: renamed from: z */
    private boolean f99576z = false;

    /* JADX INFO: renamed from: A */
    private int f99488A = 0;

    /* JADX INFO: renamed from: B */
    private int f99490B = 0;

    /* JADX INFO: renamed from: C */
    private int f99492C = 0;

    /* JADX INFO: renamed from: D */
    private int f99494D = 0;

    /* JADX INFO: renamed from: E */
    private int f99496E = 0;

    /* JADX INFO: renamed from: F */
    private int f99498F = 0;

    /* JADX INFO: renamed from: G */
    private int f99500G = 0;

    /* JADX INFO: renamed from: H */
    private int f99502H = 1;

    /* JADX INFO: renamed from: I */
    private int f99504I = 0;

    /* JADX INFO: renamed from: J */
    private int f99506J = 0;

    /* JADX INFO: renamed from: K */
    private int f99508K = 16;

    /* JADX INFO: renamed from: L */
    private int f99510L = 20;

    /* JADX INFO: renamed from: M */
    private int f99512M = 3000000;

    /* JADX INFO: renamed from: N */
    private int f99513N = 0;

    /* JADX INFO: renamed from: O */
    private int f99514O = 65536;

    /* JADX INFO: renamed from: P */
    private boolean f99515P = true;

    /* JADX INFO: renamed from: Q */
    private boolean f99516Q = false;

    /* JADX INFO: renamed from: R */
    private int f99517R = 2;

    /* JADX INFO: renamed from: S */
    private int f99518S = 23;

    /* JADX INFO: renamed from: T */
    private long f99519T = 0;

    /* JADX INFO: renamed from: U */
    private boolean f99520U = false;

    /* JADX INFO: renamed from: V */
    private boolean f99521V = false;

    /* JADX INFO: renamed from: W */
    private long f99522W = 0;

    /* JADX INFO: renamed from: X */
    private Object f99523X = new Object();

    /* JADX INFO: renamed from: Y */
    private long f99524Y = 0;

    /* JADX INFO: renamed from: a0 */
    private boolean f99527a0 = false;

    /* JADX INFO: renamed from: b0 */
    private Bundle f99529b0 = new Bundle();

    /* JADX INFO: renamed from: c0 */
    private boolean f99531c0 = false;

    /* JADX INFO: renamed from: d0 */
    private int f99533d0 = 1;

    /* JADX INFO: renamed from: e0 */
    private Object f99535e0 = new Object();

    /* JADX INFO: renamed from: i0 */
    private bmw f99543i0 = null;

    /* JADX INFO: renamed from: j0 */
    private final int f99545j0 = -1;

    /* JADX INFO: renamed from: k0 */
    private final int f99547k0 = 0;

    /* JADX INFO: renamed from: l0 */
    private final int f99549l0 = 1;

    /* JADX INFO: renamed from: m0 */
    private int f99551m0 = -1;

    /* JADX INFO: renamed from: o0 */
    private EffectModel f99555o0 = null;

    /* JADX INFO: renamed from: p0 */
    private Object f99557p0 = new Object();

    /* JADX INFO: renamed from: t0 */
    private String f99565t0 = null;

    /* JADX INFO: renamed from: v0 */
    private int f99569v0 = 6;

    /* JADX INFO: renamed from: w0 */
    private long f99571w0 = 0;

    /* JADX INFO: renamed from: x0 */
    private int f99573x0 = 200000;

    /* JADX INFO: renamed from: y0 */
    private boolean f99575y0 = false;

    /* JADX INFO: renamed from: z0 */
    private boolean f99577z0 = false;

    /* JADX INFO: renamed from: A0 */
    private boolean f99489A0 = false;

    /* JADX INFO: renamed from: B0 */
    private boolean f99491B0 = false;

    /* JADX INFO: renamed from: C0 */
    Object f99493C0 = new Object();

    /* JADX INFO: renamed from: D0 */
    private int f99495D0 = 0;

    /* JADX INFO: renamed from: G0 */
    private int f99501G0 = 0;

    /* JADX INFO: renamed from: H0 */
    private float[] f99503H0 = new float[16];

    /* JADX INFO: renamed from: J0 */
    private boolean f99507J0 = true;

    /* JADX INFO: renamed from: K0 */
    snr f99509K0 = new C16941j();

    /* JADX INFO: renamed from: L0 */
    private C3858o.d f99511L0 = new C16942k();

    /* JADX INFO: renamed from: l.fw00$a */
    public class C16932a implements AbstractC3848e.b {
        public C16932a() {
        }
    }

    /* JADX INFO: renamed from: l.fw00$b */
    public class C16933b implements AbstractC3848e.a {
        public C16933b() {
        }
    }

    /* JADX INFO: renamed from: l.fw00$c */
    public class C16934c implements tmw {
        public C16934c() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99541h0 != null) {
                fw00.this.f99541h0.mo130269a(fw00.this.f99573x0 + i, i, "encoder error!!!");
            }
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str);
            }
            MDLog.m7391e("media", "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$d */
    public class C16935d implements C3855l.e {
        public C16935d() {
        }

        @Override // com.immomo.moment.mediautils.C3855l.e
        /* JADX INFO: renamed from: a */
        public long mo18917a() {
            return fw00.this.m123443p0();
        }
    }

    /* JADX INFO: renamed from: l.fw00$e */
    public class C16936e implements C3855l.f {
        public C16936e() {
        }

        @Override // com.immomo.moment.mediautils.C3855l.f
        /* JADX INFO: renamed from: a */
        public void mo18918a() {
            s3l0 s3l0Var = fw00.this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182184o();
            }
        }
    }

    /* JADX INFO: renamed from: l.fw00$f */
    public class C16937f implements FFBgChanger.OnBgChangerListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f99583a;

        public C16937f(long j) {
            this.f99583a = j;
        }

        @Override // com.imomo.momo.mediaencoder.FFBgChanger.OnBgChangerListener
        public void onError(int i) {
            if (fw00.this.f99541h0 != null) {
                fw00.this.f99541h0.mo130269a(fw00.this.f99573x0 + ErrorCode.BGMIX_RUNNING_FAILED, ErrorCode.BGMIX_RUNNING_FAILED, "BgChanger running error");
            }
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + ErrorCode.BGMIX_RUNNING_FAILED, "BgChanger running error");
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "BgChanger running error");
        }

        @Override // com.imomo.momo.mediaencoder.FFBgChanger.OnBgChangerListener
        public void onProgress(int i) throws IOException {
            if (fw00.this.f99539g0 != null) {
                fw00.this.f99539g0.onProcessProgress(i);
            }
            if (i != 100 || fw00.this.f99539g0 == null || fw00.this.f99539g0 == null) {
                return;
            }
            fw00.this.m123441o0(this.f99583a);
            fw00.this.f99539g0.mo61016a();
        }
    }

    /* JADX INFO: renamed from: l.fw00$g */
    public class C16938g implements pnr {
        public C16938g() {
        }

        @Override // p149l.pnr
        /* JADX INFO: renamed from: a */
        public void mo123488a(ByteBuffer byteBuffer, int i, long j) {
            synchronized (fw00.this.f99535e0) {
                try {
                    u460 u460Var = new u460(byteBuffer);
                    u460Var.m191675d(i, 0, 0, j, 0);
                    AbstractC3848e abstractC3848e = fw00.this.f99552n;
                    if (abstractC3848e != null) {
                        abstractC3848e.mo18743c(u460Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fw00$h */
    public class C16939h implements tmw {
        public C16939h() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str + " OutSampleRate:" + fw00.this.f99504I + " OutBits:" + fw00.this.f99508K + " OutChannels:" + fw00.this.f99506J + " IsUseSoft:" + fw00.this.f99489A0);
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$i */
    public class C16940i implements C3858o.f {
        public C16940i() {
        }

        @Override // com.immomo.moment.mediautils.C3858o.f
        /* JADX INFO: renamed from: a */
        public void mo19009a() {
            if (fw00.this.f99559q0 != null) {
                fw00.this.f99559q0.mo62450k0();
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager onPauseComplete !!!");
        }

        @Override // com.immomo.moment.mediautils.C3858o.f
        /* JADX INFO: renamed from: b */
        public void mo19010b() {
            fw00 fw00Var = fw00.this;
            if (fw00Var.f99532d != null && fw00Var.f99562s) {
                fw00.this.f99532d.m18733q();
            }
            fw00 fw00Var2 = fw00.this;
            s3l0 s3l0Var = fw00Var2.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182190v(fw00Var2.f99562s);
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager onSeekComplete !!!");
        }
    }

    /* JADX INFO: renamed from: l.fw00$j */
    public class C16941j implements snr {
        public C16941j() {
        }

        @Override // p149l.snr
        /* JADX INFO: renamed from: a */
        public void mo123489a(Message message) throws Throwable {
            int i = message.what;
            if (i == 272) {
                fw00.this.m123377B0();
                return;
            }
            switch (i) {
                case 257:
                    fw00.this.m123446r0();
                    break;
                case 258:
                    fw00.this.m123456w0(((Boolean) message.obj).booleanValue());
                    break;
                case 259:
                    fw00.this.m123375A0();
                    break;
                case 260:
                    fw00.this.m123462z0();
                    break;
                case 261:
                    fw00.this.m123379C0((EffectModel) message.obj);
                    break;
                case 262:
                    fw00.this.m123454v0((EffectModel) message.obj);
                    break;
                case 263:
                    fw00.this.m123450t0((String) message.obj);
                    break;
                case 264:
                    fw00.this.m123448s0();
                    break;
                case 265:
                    fw00.this.m123458x0();
                    break;
            }
        }

        @Override // p149l.snr
        public void onPause() {
            fw00.this.m123452u0();
        }

        @Override // p149l.snr
        public void onResume() throws Throwable {
            fw00.this.m123460y0();
        }
    }

    /* JADX INFO: renamed from: l.fw00$l */
    public class C16943l implements qnr {
        public C16943l() {
        }

        @Override // p149l.qnr
        /* JADX INFO: renamed from: a */
        public void mo123490a() {
            s3l0 s3l0Var = fw00.this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182185p();
            }
        }

        @Override // p149l.qnr
        /* JADX INFO: renamed from: b */
        public Object mo123491b() {
            return mow.m155709j().m155718h();
        }
    }

    /* JADX INFO: renamed from: l.fw00$m */
    public class C16944m implements tmw {
        public C16944m() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99541h0 != null) {
                fw00.this.f99541h0.mo130269a(fw00.this.f99573x0 + i, i, "render failed：" + str);
            }
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str);
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$n */
    public class C16945n implements InterfaceC16949r {
        public C16945n() {
        }

        @Override // p149l.fw00.InterfaceC16949r
        /* JADX INFO: renamed from: a */
        public void mo123492a() {
            C3858o c3858o = fw00.this.f99528b;
            if (c3858o != null) {
                c3858o.m18999x(16);
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess video cut finished !!!");
        }

        @Override // p149l.fw00.InterfaceC16949r
        /* JADX INFO: renamed from: b */
        public void mo123493b(boolean z) {
            eci0 eci0Var = fw00.this.f99546k;
            if (eci0Var != null) {
                eci0Var.m115712n0(258, Boolean.valueOf(z));
            }
        }

        @Override // p149l.fw00.InterfaceC16949r
        /* JADX INFO: renamed from: c */
        public void mo123494c(long j) {
            fw00 fw00Var;
            eci0 eci0Var;
            C3847d c3847d = fw00.this.f99532d;
            if (c3847d != null) {
                c3847d.m18738v(j);
            }
            if (fw00.this.f99551m0 == 1) {
                float f = (((j * 1000) + fw00.this.f99524Y) * 1.0f) / fw00.this.f99519T;
                if (fw00.this.f99559q0 != null && fw00.this.f99519T != 0 && j != 0 && fw00.this.m123463H0()) {
                    fw00.this.f99559q0.mo62443V(f);
                }
            }
            if (fw00.this.f99516Q || (eci0Var = (fw00Var = fw00.this).f99546k) == null) {
                return;
            }
            eci0Var.m115699F0(j + (fw00Var.f99524Y / 1000));
        }

        @Override // p149l.fw00.InterfaceC16949r
        /* JADX INFO: renamed from: d */
        public void mo123495d() {
            fw00 fw00Var = fw00.this;
            if (fw00Var.f99546k != null) {
                boolean z = fw00Var.f99491B0;
                fw00 fw00Var2 = fw00.this;
                if (z) {
                    ((n4c) fw00Var2.f99546k).m111002I0();
                } else {
                    fw00Var2.m123402R0();
                    ((s2h0) fw00.this.f99546k).onFrameAvailable(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.fw00$o */
    public class C16946o implements tmw {
        public C16946o() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str);
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$p */
    public class C16947p implements tmw {
        public C16947p() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str);
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$q */
    public class C16948q implements tmw {
        public C16948q() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (fw00.this.f99541h0 != null) {
                fw00.this.f99541h0.mo130269a(fw00.this.f99573x0 + i, i, "source error!!!");
            }
            if (fw00.this.f99543i0 != null) {
                fw00.this.f99543i0.onError(fw00.this.f99573x0 + i, str);
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (fw00.this.f99573x0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.fw00$r */
    public interface InterfaceC16949r {
        /* JADX INFO: renamed from: a */
        void mo123492a();

        /* JADX INFO: renamed from: b */
        void mo123493b(boolean z);

        /* JADX INFO: renamed from: c */
        void mo123494c(long j);

        /* JADX INFO: renamed from: d */
        void mo123495d();
    }

    public fw00() {
        m123381D0(this.f99489A0, this.f99491B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m123375A0() throws Throwable {
        jmw jmwVar;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startPreview()");
        if (this.f99528b == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Invalid mSourceManager");
            kmw kmwVar = this.f99541h0;
            if (kmwVar != null) {
                kmwVar.mo130269a(this.f99573x0 + ErrorCode.EDIT_STARTPREVIEW_FAILED, ErrorCode.EDIT_STARTPREVIEW_FAILED, "make video path is empty !!!");
            }
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + ErrorCode.EDIT_STARTPREVIEW_FAILED, "make video path is empty !!!");
                return;
            }
            return;
        }
        eci0 eci0Var = this.f99546k;
        Object obj = this.f99572x;
        tif0 tif0Var = this.f99497E0;
        if (tif0Var == null) {
            tif0Var = new tif0(this.f99492C, this.f99494D);
        }
        eci0Var.m115722y0(obj, tif0Var);
        if (this.f99532d == null) {
            C3847d c3847d = new C3847d(false);
            this.f99532d = c3847d;
            c3847d.m18735s(this);
            this.f99532d.m18737u(new C16946o());
            if (!this.f99532d.m18730n(this.f99504I, this.f99508K, this.f99506J)) {
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "mAudioPlayer prepare failed");
                return;
            }
        }
        m123399P0();
        this.f99528b.m18995O(this.f99520U);
        this.f99528b.m18994N(true);
        if (this.f99568v) {
            this.f99528b.m18997Q();
            this.f99568v = false;
            this.f99521V = true;
            s3l0 s3l0Var = this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182189u();
            }
        } else {
            m123462z0();
        }
        long j = this.f99519T;
        if (j == 0 || (jmwVar = this.f99559q0) == null) {
            return;
        }
        jmwVar.mo62443V((this.f99524Y * 1.0f) / j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m123377B0() {
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18731o();
            this.f99532d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m123379C0(EffectModel effectModel) throws Throwable {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "updateEffect()");
        this.f99566u = true;
        this.f99555o0 = effectModel;
        m123439n0();
        m123460y0();
    }

    /* JADX INFO: renamed from: D0 */
    private void m123381D0(boolean z, boolean z2) {
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-video-adapter-use-count", System.currentTimeMillis(), ReportType.COUNT);
        String str = this.f99526a;
        StringBuilder sb = new StringBuilder("server DecoderType audio: ");
        sb.append(z ? "Soft" : "Hard");
        sb.append(" video:");
        sb.append(z2 ? "Soft" : "Hard");
        MDLog.m7389d(str, sb.toString());
        this.f99491B0 = z2;
        this.f99489A0 = z;
        String str2 = this.f99526a;
        StringBuilder sb2 = new StringBuilder("real DecoderType audio: ");
        sb2.append(this.f99489A0 ? "Soft" : "Hard");
        sb2.append(" video:");
        sb2.append(this.f99491B0 ? "Soft" : "Hard");
        MDLog.m7389d(str2, sb2.toString());
        this.f99574y = new Handler(Looper.getMainLooper());
        if (this.f99491B0) {
            n4c n4cVar = new n4c("DataRenThr");
            this.f99546k = n4cVar;
            n4cVar.m157832k1(1);
        } else {
            this.f99546k = new s2h0("textureRenThr");
        }
        this.f99546k.m115723z0(this.f99509K0);
        this.f99546k.m115719u0(new C16943l());
        this.f99546k.m115718t0(new C16944m());
        mow.m155709j().m155719i();
        this.f99548l = new ubj();
        s3l0 s3l0Var = new s3l0();
        this.f99542i = s3l0Var;
        s3l0Var.m182192x(new C16945n());
        da1 da1Var = new da1();
        this.f99544j = da1Var;
        da1Var.m110527d(this);
    }

    /* JADX INFO: renamed from: E0 */
    private boolean m123383E0() {
        float fM18713a;
        boolean z;
        long j;
        String str;
        long j2;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initBgChanger !!!");
        long jCurrentTimeMillis = System.currentTimeMillis();
        EffectModel effectModel = this.f99555o0;
        if (effectModel == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "no EffectModel");
            return false;
        }
        String mediaPath = effectModel.getMediaPath();
        if (!nhi.m159403c(mediaPath)) {
            return false;
        }
        AudioEffects audioEffects = this.f99555o0.getAudioEffects();
        if (audioEffects == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "no Audio Effects");
            return false;
        }
        List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
        if (audioBackgrounds == null || audioBackgrounds.size() <= 0) {
            fM18713a = audioEffects.getAudioSource() != null ? audioEffects.getAudioSource().m18713a() : 1.0f;
            z = false;
            j = 0;
            str = "";
            j2 = 0;
        } else {
            AudioBackground audioBackground = audioBackgrounds.get(0);
            String bgPath = audioBackground.getBgPath();
            long start = audioBackground.getStart();
            long end = audioBackground.getEnd();
            fM18713a = audioBackground.getRatio();
            j = end;
            j2 = start;
            str = bgPath;
            z = true;
        }
        FFBgChanger fFBgChanger = new FFBgChanger();
        this.f99550m = fFBgChanger;
        if (!fFBgChanger.initBgChanger()) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "initBgChanger error");
            kmw kmwVar = this.f99541h0;
            if (kmwVar != null) {
                kmwVar.mo130269a(this.f99573x0 + 8001, 8001, "initBgChanger error");
            }
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + 8001, "initBgChanger error");
            }
            return false;
        }
        if (!this.f99550m.setOutputFileName(this.f99553n0)) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "setOutputFileName error");
            kmw kmwVar2 = this.f99541h0;
            if (kmwVar2 != null) {
                kmwVar2.mo130269a(this.f99573x0 + 8002, 8002, "setOutputFileName error");
            }
            bmw bmwVar2 = this.f99543i0;
            if (bmwVar2 != null) {
                bmwVar2.onError(this.f99573x0 + 8002, "setOutputFileName error");
            }
            return false;
        }
        this.f99550m.setMixModeAndRatio(Boolean.valueOf(z), fM18713a);
        if (!this.f99550m.initVideoSource(mediaPath)) {
            kmw kmwVar3 = this.f99541h0;
            if (kmwVar3 != null) {
                kmwVar3.mo130269a(this.f99573x0 + 8003, 8003, "bgChange init video source error");
            }
            bmw bmwVar3 = this.f99543i0;
            if (bmwVar3 != null) {
                bmwVar3.onError(this.f99573x0 + 8003, "bgChange init video source error");
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "bgChange init video source error");
            return false;
        }
        if (!z || this.f99550m.initAudioSource(str, j2, j)) {
            this.f99550m.setBgChangerListener(new C16937f(jCurrentTimeMillis));
            return true;
        }
        MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "bgChange init audio source error");
        kmw kmwVar4 = this.f99541h0;
        if (kmwVar4 != null) {
            kmwVar4.mo130269a(this.f99573x0 + ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, "bgChange init audio source error");
        }
        bmw bmwVar4 = this.f99543i0;
        if (bmwVar4 != null) {
            bmwVar4.onError(this.f99573x0 + ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, "bgChange init audio source error");
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m123385F0(String str) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initEncoder !!!  mediaEncoderMode = " + this.f99533d0 + " outPath:" + str);
        if (this.f99533d0 == 0) {
            C3854k c3854k = new C3854k();
            this.f99556p = c3854k;
            c3854k.m18749i(0);
            this.f99556p.m18881B(this.f99519T - this.f99524Y);
            this.f99556p.m18747g(new C16932a());
            this.f99556p.m18746f(new C16933b());
            this.f99556p.m18882C(this.f99518S);
            this.f99556p.m18883D(this.f99517R);
            this.f99556p.m18750j(this.f99502H);
            this.f99556p.m18751k(this.f99513N);
            this.f99556p.mo18752l(this.f99488A, this.f99490B, this.f99510L, this.f99512M);
            this.f99556p.m18744d(this.f99504I, this.f99506J, this.f99514O);
            this.f99552n = this.f99556p;
            m123406U0();
        } else {
            C3855l c3855l = new C3855l();
            this.f99554o = c3855l;
            c3855l.m18910M(new C16934c());
            this.f99554o.m18916S(this.f99488A, this.f99490B, this.f99510L, this.f99512M, this.f99502H, this.f99513N, C3855l.f13477U, this.f99499F0);
            this.f99554o.m18908K(this.f99504I, this.f99508K, this.f99506J, this.f99514O, 8192);
            m123406U0();
            if (this.f99515P) {
                this.f99554o.m18909L();
            }
            if (this.f99540h != null) {
                this.f99554o.m18915R(new C16935d());
            }
            this.f99554o.m18914Q(new C16936e());
            this.f99552n = this.f99554o;
        }
        this.f99552n.m18748h(str);
        if (this.f99552n.mo18753m()) {
            if (this.f99533d0 == 1) {
                this.f99537f0 = this.f99554o.m18907H();
            }
            return true;
        }
        this.f99552n = null;
        MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "startEncoding error");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, l.hb1, l.kd1] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38, types: [l.xc1] */
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
    private boolean m123387G0() throws Throwable {
        boolean z;
        long j;
        ?? r12;
        boolean z2;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess initSource !!!");
        boolean z3 = false;
        if (this.f99555o0 == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Invalid model");
            kmw kmwVar = this.f99541h0;
            if (kmwVar != null) {
                kmwVar.mo130269a(this.f99573x0 + ErrorCode.BGMIX_RUNNING_FAILED, ErrorCode.BGMIX_RUNNING_FAILED, "Invalid model");
            }
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + 5001, " mInputEffectModel is null!!!");
            }
            return false;
        }
        C3858o c3858o = this.f99528b;
        if (c3858o != null) {
            c3858o.m18987B();
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182183n();
        }
        C3857n c3857n = this.f99530c;
        if (c3857n != null) {
            c3857n.m18953d();
        }
        long length = 0;
        this.f99519T = 0L;
        ?? r7 = 0;
        List<VideoCut> videoCuts = this.f99555o0.getVideoEffects() != null ? this.f99555o0.getVideoEffects().getVideoCuts() : null;
        String str = "Fail to create new source!!!";
        if (videoCuts == null || videoCuts.size() <= 0) {
            z = false;
            j = 1000;
            String mediaPath = this.f99555o0.getMediaPath();
            if (mediaPath == null) {
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "No source");
                kmw kmwVar2 = this.f99541h0;
                if (kmwVar2 != null) {
                    kmwVar2.mo130269a(this.f99573x0 + 5001, 5001, "No source");
                }
                bmw bmwVar2 = this.f99543i0;
                if (bmwVar2 == null) {
                    return false;
                }
                bmwVar2.onError(this.f99573x0 + 5001, " The media source is empty !!!");
                return false;
            }
            C3857n c3857n2 = this.f99530c;
            AbstractC3856m abstractC3856mM123437m0 = (c3857n2 == null || c3857n2.m18955f() == null) ? null : this.f99530c.m18955f().get(this.f99555o0.getMediaPath());
            if (abstractC3856mM123437m0 == null) {
                m123435l0();
                abstractC3856mM123437m0 = m123437m0(this.f99555o0.getMediaPath());
                if (abstractC3856mM123437m0 == null) {
                    MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source");
                    kmw kmwVar3 = this.f99541h0;
                    if (kmwVar3 != null) {
                        kmwVar3.mo130269a(this.f99573x0 + 5001, 5001, "Fail to create new source!!!");
                    }
                    return false;
                }
                MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Success to create new source media:" + this.f99555o0.getMediaPath());
                if (this.f99530c == null) {
                    this.f99530c = new C3857n();
                }
                this.f99530c.m18952c(this.f99555o0.getMediaPath(), abstractC3856mM123437m0);
            }
            this.f99530c.m18950a(this.f99555o0.getMediaPath(), 0L, -1L);
            this.f99519T = abstractC3856mM123437m0.m18927h();
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
                            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, " Surface Texture does not support switching between two different video sources!!!");
                            kmw kmwVar4 = this.f99541h0;
                            if (kmwVar4 != null) {
                                kmwVar4.mo130269a(this.f99573x0 + 5001, 5001, "Surface Texture does not support switching between two different video sources!!!");
                            }
                            bmw bmwVar3 = this.f99543i0;
                            if (bmwVar3 != null) {
                                bmwVar3.onError(this.f99573x0 + 5001, " Surface Texture does not support switching between two different video sources!!!");
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
            AbstractC3856m abstractC3856mM123437m1 = null;
            for (VideoCut videoCut : videoCuts) {
                if (videoCut.getMedia() != null) {
                    C3857n c3857n3 = this.f99530c;
                    if (c3857n3 != null && c3857n3.m18955f() != null) {
                        abstractC3856mM123437m1 = this.f99530c.m18955f().get(videoCut.getMedia());
                    }
                    if (abstractC3856mM123437m1 == null) {
                        C3858o c3858o2 = this.f99528b;
                        if (c3858o2 != null) {
                            c3858o2.m18990F();
                            this.f99528b = r7;
                            this.f99530c = r7;
                        }
                        i2++;
                        abstractC3856mM123437m1 = m123437m0(videoCut.getMedia());
                        if (abstractC3856mM123437m1 == null) {
                            MDLog.m7399w(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source createSuccessNum:" + i3 + " createAllNum:" + i2 + " media:" + videoCut.getMedia());
                            z3 = z3;
                            r7 = r7;
                        } else {
                            z2 = z3;
                            i3++;
                            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Success to create new source createSuccessNum:" + i3 + " createAllNum:" + i2 + " media:" + videoCut.getMedia());
                            if (this.f99530c == null) {
                                this.f99530c = new C3857n();
                            }
                            this.f99530c.m18952c(videoCut.getMedia(), abstractC3856mM123437m1);
                            File file2 = new File(videoCut.getMedia());
                            if (file2.exists() && file2.isFile()) {
                                length += file2.length();
                            }
                        }
                    } else {
                        z2 = z3;
                    }
                    this.f99530c.m18951b(videoCut.getMedia(), videoCut.getStart() * 1000, videoCut.getEnd() * 1000, videoCut.isReverse());
                    long jM18927h = abstractC3856mM123437m1.m18927h();
                    long end = videoCut.getEnd() * 1000;
                    String str2 = str;
                    long j2 = this.f99519T;
                    if (end > jM18927h) {
                        this.f99519T = j2 + (jM18927h - (videoCut.getStart() * 1000));
                    } else {
                        this.f99519T = j2 + ((videoCut.getEnd() - videoCut.getStart()) * 1000);
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
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Fail to create new source");
                kmw kmwVar5 = this.f99541h0;
                if (kmwVar5 != null) {
                    kmwVar5.mo130269a(this.f99573x0 + 5001, 5001, str3);
                }
                bmw bmwVar4 = this.f99543i0;
                if (bmwVar4 != null) {
                    bmwVar4.onError(this.f99573x0 + 5001, " Fail to create new source!!!");
                }
                return z;
            }
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginSize(length);
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginDuration(this.f99519T);
        VideoEffects videoEffects = this.f99555o0.getVideoEffects();
        AudioEffects audioEffects = this.f99555o0.getAudioEffects();
        hnf0 hnf0Var = this.f99540h;
        if (hnf0Var != null) {
            hnf0Var.mo131917a();
            r12 = 0;
            this.f99540h.m131923g(null);
        } else {
            r12 = 0;
        }
        xc1 xc1Var = this.f99534e;
        if (xc1Var != null) {
            xc1Var.mo130259c();
            this.f99534e.m208058g(r12);
        }
        hb1 hb1Var = this.f99536f;
        if (hb1Var != null) {
            hb1Var.m130262j();
            this.f99536f = r12;
        }
        kd1 kd1Var = this.f99538g;
        if (kd1Var != null) {
            kd1Var.m145612f();
            this.f99538g = r12;
        }
        if (videoEffects != null) {
            List<TimeRangeScale> listM123431j0 = m123431j0(videoEffects.getTimeRangeScales(), this.f99524Y / j);
            this.f99519T = m123433k0(this.f99519T, listM123431j0);
            if (this.f99540h == null) {
                this.f99540h = new hnf0();
            }
            this.f99540h.m131923g(listM123431j0);
            if (listM123431j0 != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoUseSpeedvary(true);
                ArrayList arrayList = new ArrayList();
                for (?? r5 = z; r5 < listM123431j0.size(); r5++) {
                    arrayList.add(Float.valueOf(listM123431j0.get(r5).getSpeed()));
                }
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoSpeedvaryValue((Float[]) arrayList.toArray(new Float[arrayList.size()]));
                MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "The speed value is " + arrayList.toArray().toString());
            }
            if (listM123431j0 != null && listM123431j0.size() > 0) {
                if (listM123431j0.size() == 1) {
                    TimeRangeScale timeRangeScale = listM123431j0.get(z ? 1 : 0);
                    long end2 = timeRangeScale.getEnd() - timeRangeScale.getStart();
                    float speed = timeRangeScale.getSpeed();
                    if (end2 >= j || speed == 5.0f || speed == 0.25f) {
                        if (this.f99534e == null) {
                            xc1 xc1Var2 = new xc1();
                            this.f99534e = xc1Var2;
                            xc1Var2.mo192814d(this.f99504I, this.f99508K, this.f99506J);
                            this.f99534e.mo192813a();
                        }
                        this.f99534e.m208058g(listM123431j0);
                    }
                } else {
                    if (this.f99534e == null) {
                        xc1 xc1Var3 = new xc1();
                        this.f99534e = xc1Var3;
                        xc1Var3.mo192814d(this.f99504I, this.f99508K, this.f99506J);
                        this.f99534e.mo192813a();
                    }
                    this.f99534e.m208058g(listM123431j0);
                }
            }
        }
        if (audioEffects != null) {
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            AudioEffects.C3846a audioSource = audioEffects.getAudioSource();
            if (audioBackgrounds != null) {
                DataDotUtils.getInstance().getEditDataDotInfo().setVideoUseBgMusic(true);
                float fM18713a = audioSource == null ? 1.0f : audioSource.m18713a();
                for (AudioBackground audioBackground : audioBackgrounds) {
                    if (audioBackground.getBgPath() != null) {
                        hb1 hb1Var2 = new hb1();
                        this.f99536f = hb1Var2;
                        hb1Var2.m130267o(this.f99489A0);
                        this.f99536f.m130264l(new C16939h());
                        this.f99536f.mo192814d(this.f99504I, this.f99508K, this.f99506J);
                        if (!this.f99536f.m130260h(audioBackground.getBgPath(), audioBackground.getStart(), audioBackground.getEnd())) {
                            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Init Audio Mixer error !! Audio File [" + audioBackground.getBgPath() + "] maybe not exist !!");
                            return false;
                        }
                        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "bgPath:" + audioBackground.getBgPath() + " start:" + audioBackground.getStart() + "-end:" + audioBackground.getEnd());
                        this.f99536f.m130265m(fM18713a, audioBackground.getRatio());
                        break;
                    }
                }
            } else {
                kd1 kd1Var2 = new kd1();
                this.f99538g = kd1Var2;
                if (audioSource != null) {
                    kd1Var2.m145613g(audioSource.m18713a());
                }
            }
        }
        hb1 hb1Var3 = this.f99536f;
        if (hb1Var3 != null) {
            hb1Var3.m130263k(this.f99524Y / j);
        }
        m123399P0();
        if (this.f99528b == null) {
            this.f99568v = true;
            C3858o c3858o3 = new C3858o();
            this.f99528b = c3858o3;
            c3858o3.m18995O(this.f99520U);
            this.f99528b.m18992L(this.f99511L0);
            this.f99528b.m18996P(new C16940i());
        }
        this.f99528b.m18998w(this.f99530c);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public void m123394M0() {
        m123396N0(false);
    }

    /* JADX INFO: renamed from: N0 */
    private void m123396N0(boolean z) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess releaseEncoder !!! isCanceled " + z);
        AbstractC3848e abstractC3848e = this.f99552n;
        if (abstractC3848e != null) {
            abstractC3848e.m18745e(true);
            AbstractC3848e abstractC3848e2 = this.f99552n;
            if (z) {
                abstractC3848e2.mo18741a();
            } else {
                abstractC3848e2.mo18754n();
            }
            this.f99552n = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m123399P0() throws Throwable {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess resetAudioPlayer !!!");
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18732p();
            kb1 kb1Var = this.f99567u0;
            if (kb1Var != null) {
                kb1Var.mo130259c();
                this.f99532d.m18727j(this.f99567u0);
            }
            xc1 xc1Var = this.f99534e;
            if (xc1Var != null) {
                xc1Var.mo130259c();
                this.f99532d.m18727j(this.f99534e);
            }
            hb1 hb1Var = this.f99536f;
            if (hb1Var != null) {
                hb1Var.mo130259c();
                this.f99532d.m18727j(this.f99536f);
            } else {
                kd1 kd1Var = this.f99538g;
                if (kd1Var != null) {
                    this.f99532d.m18727j(kd1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m123402R0() {
        AbstractC3848e abstractC3848e;
        if (this.f99531c0 && this.f99551m0 == 0 && (abstractC3848e = this.f99552n) != null && (abstractC3848e instanceof C3855l)) {
            ((C3855l) abstractC3848e).m18912O(this.f99529b0);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m123406U0() {
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioSampleRate(this.f99504I);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioChannels(this.f99506J);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioBitrate(this.f99514O);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditAudioEncode("audio/mp4a-latm");
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditCq(this.f99515P);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoEncode(YtVideoEncoder.MIME_TYPE);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoExtension("mp4");
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoWidth(this.f99488A);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoHeight(this.f99490B);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoBitrate(this.f99512M);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoRotation(this.f99513N);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoFrameRate(this.f99510L);
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoEditVideoGopSize(this.f99502H);
    }

    /* JADX INFO: renamed from: W0 */
    private void m123409W0(String str) {
        if (str == null) {
            return;
        }
        if (!new File(str).exists()) {
            MDLog.m7391e(this.f99526a, "mediaPath does not exist!");
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
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginAudioSamplerate(this.f99504I);
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoOriginAudioChannels(this.f99506J);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g1 */
    private boolean m123426g1() throws Throwable {
        Object obj;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startEncoder !!!");
        if (this.f99528b == null && !m123439n0()) {
            return false;
        }
        C3858o c3858o = this.f99528b;
        if (c3858o == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "source error");
            return false;
        }
        c3858o.m18994N(false);
        this.f99528b.m18995O(false);
        this.f99528b.m18993M(1);
        kb1 kb1Var = this.f99567u0;
        if (kb1Var != null) {
            kb1Var.mo130259c();
            this.f99544j.m110524a(this.f99567u0);
            DataDotUtils.getInstance().getEditDataDotInfo().setVideoSourcePitchShift(true);
        }
        xc1 xc1Var = this.f99534e;
        if (xc1Var != null) {
            xc1Var.mo130259c();
            this.f99544j.m110524a(this.f99534e);
        }
        hb1 hb1Var = this.f99536f;
        if (hb1Var != null) {
            hb1Var.mo130259c();
            this.f99544j.m110524a(this.f99536f);
        } else {
            kd1 kd1Var = this.f99538g;
            if (kd1Var != null) {
                this.f99544j.m110524a(kd1Var);
            }
        }
        if (!m123385F0(this.f99553n0)) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "initEncoder failed");
            return false;
        }
        if (this.f99533d0 == 0) {
            this.f99546k.m115720v0(new C16938g());
            this.f99546k.m115704e0();
            this.f99546k.m115722y0(null, new tif0(this.f99488A, this.f99490B));
        } else if ((this.f99552n instanceof C3855l) && (obj = this.f99537f0) != null) {
            this.f99546k.m115700Z(obj);
            this.f99546k.m115722y0(this.f99537f0, new tif0(this.f99488A, this.f99490B));
        }
        boolean z = this.f99568v;
        C3858o c3858o2 = this.f99528b;
        if (z) {
            if (!c3858o2.m18997Q()) {
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "mSourceManager start failed");
                return false;
            }
            this.f99568v = false;
        } else if (!c3858o2.m18991J(0L)) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "mSourceManager seek failed");
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    private void m123429i1(int i, int i2, int i3, int i4) {
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long j = i;
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-encode-file-width", j, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-height", i2, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-fps", i3, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-file-bitrate", i4, reportType);
    }

    /* JADX INFO: renamed from: j0 */
    private List<TimeRangeScale> m123431j0(List<TimeRangeScale> list, long j) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Adjust time range scale !!!");
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
    private long m123433k0(long j, List<TimeRangeScale> list) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess calculateRealDuration !!!");
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
    private void m123435l0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess clearPreviousSource !!!");
        this.f99521V = false;
        C3858o c3858o = this.f99528b;
        if (c3858o != null) {
            c3858o.m18990F();
            this.f99528b = null;
        }
        C3857n c3857n = this.f99530c;
        if (c3857n != null) {
            c3857n.m18956g();
            this.f99530c = null;
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182183n();
        }
        da1 da1Var = this.f99544j;
        if (da1Var != null) {
            da1Var.m110525b();
        }
        hnf0 hnf0Var = this.f99540h;
        if (hnf0Var != null) {
            hnf0Var.m131922f();
            this.f99540h = null;
        }
        eci0 eci0Var = this.f99546k;
        if (eci0Var == null || this.f99491B0) {
            return;
        }
        ((s2h0) eci0Var).m182060G0();
    }

    /* JADX INFO: renamed from: m0 */
    private AbstractC3856m m123437m0(String str) {
        int i;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess createNewMediaSource !!! mediaPath:" + str);
        if (str == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Invalid mediaPath");
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + 5001, " Fail to create new source, mediaPath is null!");
            }
            return null;
        }
        if (!new File(str).exists()) {
            MDLog.m7391e(this.f99526a, "mediaPath does not exist!");
            bmw bmwVar2 = this.f99543i0;
            if (bmwVar2 != null) {
                bmwVar2.onError(this.f99573x0 + 5001, " Fail to create new source, mediaPath does not exist! mediaPath:".concat(str));
            }
            return null;
        }
        AbstractC3856m c3850g = this.f99491B0 ? new C3850g() : new C3852i();
        c3850g.m18935v(this.f99504I, this.f99508K, this.f99506J);
        c3850g.m18922A(this.f99525Z);
        c3850g.m18936w(new C16948q());
        eci0 eci0Var = this.f99546k;
        if (eci0Var != null && !this.f99491B0) {
            if (((s2h0) eci0Var).mo115708j0() == null) {
                ((s2h0) this.f99546k).m182064K0();
            }
            c3850g.m18938y(((s2h0) this.f99546k).mo115708j0(), ((s2h0) this.f99546k).m182063J0(), ((s2h0) this.f99546k).m182062I0());
        }
        if (!c3850g.mo18790p(str, 17)) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "init Source Error");
            return null;
        }
        c3850g.m18937x(false);
        if (this.f99551m0 == 1 || this.f99506J <= 0) {
            int iM18925f = c3850g.m18925f();
            this.f99506J = iM18925f;
            if (iM18925f <= 0) {
                iM18925f = 1;
            }
            this.f99506J = iM18925f;
        }
        if (this.f99551m0 == 1 || this.f99504I <= 0) {
            int iM18926g = c3850g.m18926g();
            this.f99504I = iM18926g;
            if (iM18926g <= 0) {
                iM18926g = 44100;
            }
            this.f99504I = iM18926g;
        }
        int iM18930k = c3850g.m18930k();
        if (iM18930k == 90 || iM18930k == 270) {
            this.f99492C = c3850g.m18928i();
            this.f99494D = c3850g.m18933n();
            eci0 eci0Var2 = this.f99546k;
            if (eci0Var2 != null) {
                eci0Var2.mo111004x0(this.f99496E);
                boolean z = this.f99491B0;
                eci0 eci0Var3 = this.f99546k;
                if (z) {
                    eci0Var3.m98684R(new tif0(this.f99494D, this.f99492C));
                } else {
                    eci0Var3.m98684R(new tif0(this.f99492C, this.f99494D));
                }
            }
        } else {
            this.f99492C = c3850g.m18933n();
            this.f99494D = c3850g.m18928i();
            eci0 eci0Var4 = this.f99546k;
            if (eci0Var4 != null) {
                eci0Var4.mo111004x0(this.f99496E);
                this.f99546k.m98684R(new tif0(this.f99492C, this.f99494D));
            }
        }
        int i2 = this.f99492C;
        if (i2 > 0 && (i = this.f99494D) > 0) {
            this.f99498F = i2;
            this.f99500G = i;
            this.f99496E = iM18930k;
            m123409W0(str);
            return c3850g;
        }
        MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Analyse souce error");
        bmw bmwVar3 = this.f99543i0;
        if (bmwVar3 != null) {
            bmwVar3.onError(this.f99573x0 + 5001, " Fail to create new source, Analyse souce error! mOutWidth:" + this.f99492C + " mOutHeight:" + this.f99494D);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m123439n0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess doUpdateEffectModel !!!");
        this.f99575y0 = true;
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182186q();
            this.f99542i.m182183n();
        }
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18729m();
            this.f99532d.m18728l();
        }
        if (!m123387G0()) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "init Source Error");
            return false;
        }
        hnf0 hnf0Var = this.f99540h;
        if (hnf0Var != null) {
            hnf0Var.mo131917a();
        }
        s3l0 s3l0Var2 = this.f99542i;
        if (s3l0Var2 != null) {
            s3l0Var2.m182194z(this.f99540h);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m123441o0(long j) throws IOException {
        if (this.f99553n0 == null) {
            MDLog.m7391e(this.f99526a, "mediaPath is null!");
            return;
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoProcessTime(System.currentTimeMillis() - j);
        File file = new File(this.f99553n0);
        if (!file.exists() || !file.isFile()) {
            MDLog.m7391e(this.f99526a, "mediaPath does not exist!");
            return;
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoFileSize(file.length());
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f99553n0);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        videoDataRetrieverBySoft.init(this.f99553n0);
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
    public long m123443p0() {
        hnf0 hnf0Var = this.f99540h;
        if (hnf0Var != null) {
            return hnf0Var.m131919c();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public void m123446r0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess handleChangeToPreviewMode !!!");
        this.f99521V = false;
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182187r();
        }
        C3858o c3858o = this.f99528b;
        if (c3858o != null) {
            c3858o.m18987B();
        }
        m123396N0(true);
        m123435l0();
        if (this.f99532d == null) {
            C3847d c3847d = new C3847d(false);
            this.f99532d = c3847d;
            c3847d.m18735s(this);
            this.f99532d.m18737u(new C16947p());
            if (!this.f99532d.m18730n(this.f99504I, this.f99508K, this.f99506J)) {
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "mAudioPlayer prepare failed");
                return;
            }
        }
        this.f99551m0 = 1;
        s3l0 s3l0Var2 = this.f99542i;
        if (s3l0Var2 != null) {
            s3l0Var2.m182193y(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m123448s0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess handleClearCodec !!!");
        m123435l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m123450t0(String str) throws Throwable {
        boolean zM123426g1;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "makevideo() path:" + str);
        this.f99553n0 = str;
        if (this.f99488A <= 0) {
            this.f99488A = (this.f99492C >> 4) << 4;
        }
        if (this.f99490B <= 0) {
            this.f99490B = (this.f99494D >> 4) << 4;
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182186q();
            this.f99542i.m182193y(1);
        }
        m123435l0();
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18731o();
            this.f99532d = null;
        }
        this.f99560r = true;
        if (this.f99527a0) {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess use bgChanger !!!");
            FFBgChanger fFBgChanger = this.f99550m;
            if (fFBgChanger != null) {
                fFBgChanger.release();
                this.f99550m = null;
            }
            if (m123383E0()) {
                this.f99527a0 = false;
                this.f99550m.startProcess();
                zM123426g1 = true;
            } else {
                zM123426g1 = m123426g1();
            }
        } else {
            zM123426g1 = m123426g1();
        }
        if (!zM123426g1) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "startEncoder error");
        }
        DataDotUtils.getInstance().getEditDataDotInfo().setVideoIsEdited(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m123452u0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "pause preview");
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18729m();
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182186q();
        }
        jmw jmwVar = this.f99559q0;
        if (jmwVar != null) {
            jmwVar.mo62450k0();
        }
        this.f99521V = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public void m123454v0(EffectModel effectModel) {
        bve0 bve0Var;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess prepare");
        if (effectModel == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Invalid model");
            kmw kmwVar = this.f99541h0;
            if (kmwVar != null) {
                kmwVar.mo130269a(this.f99573x0 + 5001, 5001, "Invalid model !!!");
            }
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + 5001, "Invalid model !!!");
                return;
            }
            return;
        }
        if (this.f99574y == null) {
            this.f99574y = new Handler(Looper.getMainLooper());
        }
        if (this.f99563s0 == null) {
            this.f99563s0 = new bve0();
        }
        if (this.f99525Z == null && (bve0Var = this.f99563s0) != null) {
            this.f99525Z = bve0Var.m104021a(null);
        }
        this.f99529b0.putInt("request-sync", 1);
        this.f99555o0 = effectModel;
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182180A();
        }
        m123439n0();
        smw smwVar = this.f99561r0;
        if (smwVar != null) {
            smwVar.mo129506l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public void m123456w0(boolean z) {
        C3858o c3858o = this.f99528b;
        if (c3858o != null) {
            if (!this.f99521V && !this.f99576z) {
                c3858o.m18989E(false);
            } else {
                c3858o.m18989E(z);
                this.f99576z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m123458x0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess release !!!");
        m123394M0();
        C3858o c3858o = this.f99528b;
        if (c3858o != null && this.f99551m0 == 1) {
            c3858o.m18995O(false);
            this.f99528b.m18994N(false);
            this.f99528b.m18987B();
        }
        C3858o c3858o2 = this.f99528b;
        if (c3858o2 != null) {
            c3858o2.m18990F();
            this.f99528b = null;
        }
        C3857n c3857n = this.f99530c;
        if (c3857n != null) {
            c3857n.m18956g();
            this.f99530c = null;
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182188s();
        }
        hb1 hb1Var = this.f99536f;
        if (hb1Var != null) {
            hb1Var.m130262j();
            this.f99536f = null;
        }
        hnf0 hnf0Var = this.f99540h;
        if (hnf0Var != null) {
            hnf0Var.m131922f();
            this.f99540h = null;
        }
        xc1 xc1Var = this.f99534e;
        if (xc1Var != null) {
            xc1Var.m208057f();
            this.f99534e = null;
        }
        kb1 kb1Var = this.f99567u0;
        if (kb1Var != null) {
            kb1Var.m145195f();
            this.f99567u0 = null;
        }
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18731o();
            this.f99532d = null;
        }
        if (this.f99574y != null) {
            this.f99574y = null;
        }
        FFBgChanger fFBgChanger = this.f99550m;
        if (fFBgChanger != null) {
            fFBgChanger.release();
            this.f99550m = null;
        }
        jwa0 jwa0Var = this.f99505I0;
        if (jwa0Var != null) {
            jwa0Var.m143651a();
            this.f99505I0 = null;
        }
        ubj ubjVar = this.f99548l;
        if (ubjVar != null) {
            ubjVar.m192834a();
            this.f99548l = null;
        }
        bve0 bve0Var = this.f99563s0;
        if (bve0Var != null) {
            bve0Var.m104022b();
            this.f99563s0 = null;
            this.f99525Z = null;
        }
        if (this.f99543i0 != null) {
            this.f99543i0 = null;
        }
        this.f99570w = null;
        this.f99551m0 = -1;
        this.f99555o0 = null;
        this.f99577z0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m123460y0() throws Throwable {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "resume mIsUpdate = " + this.f99566u);
        if (this.f99528b == null && !m123439n0()) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "doUpdateEffectModel failed!!!");
            return;
        }
        C3858o c3858o = this.f99528b;
        if (c3858o == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "Invalid SourceManager");
            kmw kmwVar = this.f99541h0;
            if (kmwVar != null) {
                kmwVar.mo130269a(this.f99573x0 + ErrorCode.EDIT_RESUME_FAILED, ErrorCode.EDIT_RESUME_FAILED, "Invalid SourceManager");
            }
            bmw bmwVar = this.f99543i0;
            if (bmwVar != null) {
                bmwVar.onError(this.f99573x0 + ErrorCode.EDIT_RESUME_FAILED, "Invalid SourceManager");
                return;
            }
            return;
        }
        if (this.f99566u) {
            if (this.f99568v) {
                c3858o.m18994N(true);
                this.f99528b.m18997Q();
                this.f99568v = false;
                if (this.f99577z0) {
                    m123462z0();
                }
            } else {
                m123462z0();
            }
            this.f99566u = false;
        }
        int i = this.f99551m0;
        C3858o c3858o2 = this.f99528b;
        if (i == 1) {
            c3858o2.m18995O(this.f99520U);
        } else {
            c3858o2.m18995O(false);
        }
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18733q();
        }
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182189u();
        }
        this.f99521V = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m123462z0() throws Throwable {
        long j;
        jmw jmwVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f99524Y;
        boolean z = this.f99562s;
        long j3 = j2 / 1000;
        MDLog.m7395i("SeekDiag", "handleSeek START targetMs=" + j3 + " play=" + z + " thread=" + Thread.currentThread().getName());
        StringBuilder sb = new StringBuilder("seek isPlay = ");
        sb.append(z);
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, sb.toString());
        if (this.f99528b != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f99528b.m18987B();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            s3l0 s3l0Var = this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182186q();
                this.f99542i.m182183n();
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            this.f99576z = true;
            C3847d c3847d = this.f99532d;
            if (c3847d != null) {
                c3847d.m18729m();
                this.f99532d.m18732p();
            }
            this.f99521V = z;
            EffectModel effectModel = this.f99555o0;
            if (effectModel == null || effectModel.getVideoEffects() == null) {
                j = 1000;
            } else {
                List<TimeRangeScale> listM123431j0 = m123431j0(this.f99555o0.getVideoEffects().getTimeRangeScales(), j3);
                j = 1000;
                xc1 xc1Var = this.f99534e;
                if (xc1Var != null) {
                    xc1Var.m208058g(listM123431j0);
                }
                hnf0 hnf0Var = this.f99540h;
                if (hnf0Var != null) {
                    hnf0Var.m131923g(listM123431j0);
                }
            }
            hnf0 hnf0Var2 = this.f99540h;
            if (hnf0Var2 != null) {
                hnf0Var2.mo131917a();
            }
            hb1 hb1Var = this.f99536f;
            if (hb1Var != null) {
                hb1Var.m130263k(j3);
            }
            xc1 xc1Var2 = this.f99534e;
            if (xc1Var2 != null) {
                xc1Var2.mo130259c();
            }
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            this.f99528b.m18991J(j2);
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            kb1 kb1Var = this.f99567u0;
            if (kb1Var != null) {
                kb1Var.m145196g(j2, this.f99519T);
            }
            long j4 = this.f99519T;
            if (j4 != 0 && (jmwVar = this.f99559q0) != null) {
                jmwVar.mo62443V((j2 * 1.0f) / j4);
            }
            MDLog.m7395i("SeekDiag", "handleSeek END total=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms srcPause=" + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms vcpPause=" + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms srcSeek=" + (jCurrentTimeMillis6 - jCurrentTimeMillis5) + "ms mIsPlaying=" + this.f99521V);
        } else {
            j = 1000;
            MDLog.m7399w("SeekDiag", "handleSeek mSourceManager is NULL!");
        }
        boolean z2 = (this.f99524Y == j2 && this.f99562s == z) ? false : true;
        this.f99564t = false;
        if (!z2 || this.f99546k == null) {
            return;
        }
        this.f99564t = true;
        MDLog.m7395i("SeekDiag", "handleSeek REPOST newTargetMs=" + (this.f99524Y / j) + " newPlay=" + this.f99562s);
        this.f99546k.m115711m0(260);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m123463H0() {
        if (this.f99551m0 == 1) {
            return this.f99521V;
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public synchronized void m123464I0(String str) {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess makeVideo !!! path:" + str);
            if (str == null) {
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "make video path error");
                kmw kmwVar = this.f99541h0;
                if (kmwVar != null) {
                    kmwVar.mo130269a(this.f99573x0 + 5002, 5002, "make video path is empty !!!");
                }
                bmw bmwVar = this.f99543i0;
                if (bmwVar != null) {
                    bmwVar.onError(this.f99573x0 + 5002, "make video path is empty !!!");
                }
                return;
            }
            this.f99521V = false;
            s3l0 s3l0Var = this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182186q();
            }
            eci0 eci0Var = this.f99546k;
            if (eci0Var != null) {
                if (this.f99551m0 != -1) {
                    eci0Var.mo98682P();
                    this.f99546k.m98668B();
                }
                this.f99551m0 = 0;
                this.f99560r = false;
                this.f99546k.m115712n0(263, str);
                if (!this.f99527a0) {
                    this.f99546k.m98680N();
                    this.f99546k.m98685S(this.f99558q);
                    this.f99546k.m98676J();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m123465J0() {
        eci0 eci0Var;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "pause()");
        if (this.f99551m0 != 1 || (eci0Var = this.f99546k) == null) {
            return;
        }
        eci0Var.m98671E();
    }

    /* JADX INFO: renamed from: K0 */
    public synchronized boolean m123466K0(String str) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "prepare()");
        if (str == null) {
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "json is null");
            return false;
        }
        eci0 eci0Var = this.f99546k;
        if (eci0Var != null) {
            eci0Var.m115712n0(262, EffectModel.getEffectModel(str));
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public synchronized void m123467L0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "Momoprocess release() ");
        eci0 eci0Var = this.f99546k;
        if (eci0Var != null) {
            eci0Var.mo98673G();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public synchronized void m123468O0() {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "removeSurface()");
            s3l0 s3l0Var = this.f99542i;
            if (s3l0Var != null && this.f99551m0 == 1) {
                s3l0Var.m182186q();
            }
            eci0 eci0Var = this.f99546k;
            if (eci0Var != null && this.f99551m0 == 1) {
                eci0Var.mo98682P();
                this.f99546k.m98674H(this.f99572x);
            }
            this.f99570w = null;
            this.f99572x = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m123469Q0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "resume()");
        MDLog.m7395i("SeekDiag", "resume() mIsPlaying=" + this.f99521V + " mSeekPending=" + this.f99564t + " thread=" + Thread.currentThread().getName());
        eci0 eci0Var = this.f99546k;
        if (eci0Var != null) {
            eci0Var.m98676J();
        }
        if (this.f99551m0 == 1) {
            eci0 eci0Var2 = this.f99546k;
            Object obj = this.f99572x;
            tif0 tif0Var = this.f99497E0;
            if (tif0Var == null) {
                tif0Var = new tif0(this.f99492C, this.f99494D);
            }
            eci0Var2.m115722y0(obj, tif0Var);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public synchronized void m123471T0(EffectModel effectModel) {
        this.f99555o0 = effectModel;
    }

    /* JADX INFO: renamed from: V0 */
    public void m123472V0(boolean z) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "setLoopBack()    isLoopBack = " + z);
        this.f99520U = z;
        C3858o c3858o = this.f99528b;
        if (c3858o != null) {
            c3858o.m18995O(z);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m123473X0(bmw bmwVar) {
        this.f99543i0 = bmwVar;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m123474Y0(smw smwVar) {
        synchronized (this.f99557p0) {
            this.f99561r0 = smwVar;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m123475Z0(kmw kmwVar) {
        synchronized (this.f99557p0) {
            this.f99541h0 = kmwVar;
        }
    }

    @Override // p149l.da1.InterfaceC16320a
    /* JADX INFO: renamed from: a */
    public void mo110529a(ByteBuffer byteBuffer, int i, long j) {
        u460 u460Var = new u460(i);
        byteBuffer.position(0);
        u460Var.m191672a().position(0);
        byteBuffer.get(u460Var.m191672a().array());
        u460Var.m191675d(i, 0, 0, j, 0);
        u460Var.m191672a().position(0);
        byteBuffer.position(0);
        C3847d c3847d = this.f99532d;
        if (c3847d != null) {
            c3847d.m18739x(u460Var);
        }
        u460Var.m191672a().position(0);
        AbstractC3848e abstractC3848e = this.f99552n;
        if (abstractC3848e != null) {
            abstractC3848e.mo18742b(u460Var);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m123476a1(lmw lmwVar) {
        synchronized (this.f99557p0) {
            this.f99539g0 = lmwVar;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m123477b1(int i, int i2, int i3, int i4, boolean z) {
        m123429i1(i, i2, i3, i4);
        synchronized (this.f99557p0) {
            try {
                this.f99488A = (i >> 4) << 4;
                this.f99490B = (i2 >> 4) << 4;
                this.f99512M = i4;
                if (i3 > 3) {
                    this.f99510L = i3;
                } else {
                    this.f99510L = 4;
                }
                this.f99513N = 0;
                this.f99515P = z;
                MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "setOutMediaVideoInfo mEncodeWidth = " + this.f99488A + " mEncodeHeight = " + this.f99490B + " mOutVideoBitrate = " + this.f99512M + " mOutVideoFps = " + this.f99510L + " mOutVideoRotation = " + this.f99513N + " mOutVideoUseCQ = " + this.f99515P);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m123478c1(float f) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess setPlayingMusicAudioRatio ratio = " + f);
        hb1 hb1Var = this.f99536f;
        if (hb1Var != null) {
            hb1Var.m130266n(f);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m123479d1(float f) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess setPlayingSrcAudioRatio ratio = " + f);
        hb1 hb1Var = this.f99536f;
        if (hb1Var != null) {
            hb1Var.m130268p(f);
        }
        kd1 kd1Var = this.f99538g;
        if (kd1Var != null) {
            kd1Var.m145613g(f);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m123480e1(jmw jmwVar) {
        synchronized (this.f99557p0) {
            this.f99559q0 = jmwVar;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m123481f1(boolean z) {
        MDLog.m7389d(this.f99526a, "AudioDecoderType:".concat(z ? "Soft" : "Hard"));
        this.f99489A0 = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m123482h0(us2 us2Var) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "addFilters()");
        this.f99558q = us2Var;
    }

    /* JADX INFO: renamed from: h1 */
    public synchronized void m123483h1() {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess startPreview !!!");
            eci0 eci0Var = this.f99546k;
            if (eci0Var != null) {
                this.f99551m0 = 1;
                Object obj = this.f99572x;
                if (obj == null) {
                    kmw kmwVar = this.f99541h0;
                    if (kmwVar != null) {
                        kmwVar.mo130269a(this.f99573x0 + ErrorCode.EDIT_PREVIEW_FAILED, ErrorCode.EDIT_PREVIEW_FAILED, "The Screen surface is invalid !!!");
                    }
                    bmw bmwVar = this.f99543i0;
                    if (bmwVar != null) {
                        bmwVar.onError(this.f99573x0 + ErrorCode.EDIT_PREVIEW_FAILED, "The Screen surface is invalid !!!");
                    }
                    MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (this.f99573x0 + ErrorCode.EDIT_PREVIEW_FAILED) + "]The Screen surface is invalid !!!");
                    return;
                }
                eci0Var.m115701a0(obj);
                this.f99546k.m115711m0(259);
                this.f99546k.m98680N();
                this.f99546k.m98685S(this.f99558q);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public synchronized void m123484i0(SurfaceTexture surfaceTexture) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "addSurfaceTexture() ");
        this.f99572x = surfaceTexture;
    }

    /* JADX INFO: renamed from: j1 */
    public synchronized void m123485j1() {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "stopPreview() holder ");
            eci0 eci0Var = this.f99546k;
            if (eci0Var != null && this.f99551m0 == 1) {
                eci0Var.mo98682P();
            }
            this.f99546k.m115711m0(272);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k1 */
    public synchronized void m123486k1(String str, long j, boolean z) {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess updateEffect!!!");
            if (str == null) {
                kmw kmwVar = this.f99541h0;
                if (kmwVar != null) {
                    kmwVar.mo130269a(this.f99573x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, ErrorCode.EDIT_UPDATEEFFECT_FAILED, "effect error!!!");
                }
                bmw bmwVar = this.f99543i0;
                if (bmwVar != null) {
                    bmwVar.onError(this.f99573x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, " json is null!!!");
                }
                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "[" + (this.f99573x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED) + "]json is null!!!");
                return;
            }
            this.f99577z0 = false;
            if (j > 0) {
                this.f99577z0 = true;
            }
            this.f99562s = z;
            this.f99524Y = j * 1000;
            EffectModel effectModel = EffectModel.getEffectModel(str);
            if (effectModel != null) {
                eci0 eci0Var = this.f99546k;
                if (eci0Var != null) {
                    eci0Var.m115712n0(261, effectModel);
                }
                return;
            }
            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "updateEffect model error");
            kmw kmwVar2 = this.f99541h0;
            if (kmwVar2 != null) {
                kmwVar2.mo130269a(this.f99573x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, ErrorCode.EDIT_UPDATEEFFECT_FAILED, "effect error!!!");
            }
            bmw bmwVar2 = this.f99543i0;
            if (bmwVar2 != null) {
                bmwVar2.onError(this.f99573x0 + ErrorCode.EDIT_UPDATEEFFECT_FAILED, " mInputEffectModel is null!!!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.C3847d.d
    public void onAudioPlayingPosition(long j) {
        s3l0 s3l0Var = this.f99542i;
        if (s3l0Var != null) {
            s3l0Var.m182191w(j);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public synchronized boolean m123487q0() {
        return this.f99551m0 == 1;
    }

    /* JADX INFO: renamed from: l.fw00$k */
    public class C16942k implements C3858o.d {

        /* JADX INFO: renamed from: l.fw00$k$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SurfaceHolder surfaceHolder;
                if (fw00.this.f99570w == null || (surfaceHolder = (SurfaceHolder) fw00.this.f99570w.get()) == null) {
                    return;
                }
                surfaceHolder.setFixedSize(fw00.this.f99492C, fw00.this.f99494D);
            }
        }

        public C16942k() {
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: a */
        public void mo19000a() throws Throwable {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "loop back again !!!");
            hnf0 hnf0Var = fw00.this.f99540h;
            if (hnf0Var != null) {
                hnf0Var.mo131917a();
            }
            xc1 xc1Var = fw00.this.f99534e;
            if (xc1Var != null) {
                xc1Var.mo130259c();
            }
            hb1 hb1Var = fw00.this.f99536f;
            if (hb1Var != null) {
                hb1Var.mo130259c();
            }
            kb1 kb1Var = fw00.this.f99567u0;
            if (kb1Var != null) {
                kb1Var.mo130259c();
            }
            C3847d c3847d = fw00.this.f99532d;
            if (c3847d != null) {
                c3847d.m18732p();
            }
            fw00.this.f99522W = 0L;
            fw00.this.f99524Y = 0L;
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: b */
        public void mo19001b(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                return;
            }
            fw00.this.m123402R0();
            tif0 tif0Var = fw00.this.f99497E0;
            fw00 fw00Var = fw00.this;
            tif0 tif0Var2 = tif0Var == null ? new tif0(fw00Var.f99492C, fw00.this.f99494D) : fw00Var.f99497E0;
            if (fw00.this.f99507J0) {
                fw00.this.getClass();
            }
            eci0 eci0Var = fw00.this.f99546k;
            if (eci0Var != null) {
                ((n4c) eci0Var).m157838r1(byteBuffer.array(), byteBuffer.limit());
                if (fw00.this.f99551m0 == 1 && fw00.this.f99575y0) {
                    fw00 fw00Var2 = fw00.this;
                    fw00Var2.f99546k.m115722y0(fw00Var2.f99572x, tif0Var2);
                    fw00.this.f99575y0 = false;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: c */
        public void mo19002c(long j) {
            if (j == -1) {
                MDLog.m7389d(fw00.this.f99526a, "Pts is -1");
            }
            s3l0 s3l0Var = fw00.this.f99542i;
            if (s3l0Var != null) {
                s3l0Var.m182181l(j);
            }
            if (j == -1) {
                return;
            }
            if (fw00.this.f99539g0 != null && fw00.this.f99551m0 == 0 && fw00.this.f99560r) {
                fw00.this.f99571w0 = System.currentTimeMillis();
                if (fw00.this.f99519T != 0) {
                    long j2 = fw00.this.f99524Y + j;
                    long j3 = fw00.this.f99519T;
                    fw00 fw00Var = fw00.this;
                    if (j2 > j3) {
                        fw00Var.f99539g0.onProcessProgress((j * 1.0f) / fw00.this.f99519T);
                    } else {
                        fw00Var.f99539g0.onProcessProgress(((fw00.this.f99524Y + j) * 1.0f) / fw00.this.f99519T);
                    }
                }
            }
            synchronized (fw00.this.f99523X) {
                try {
                    long j4 = j + fw00.this.f99524Y;
                    if (fw00.this.f99559q0 != null && fw00.this.f99551m0 == 1) {
                        fw00.this.f99559q0.mo62451n(j4 / 1000);
                    }
                    fw00 fw00Var2 = fw00.this;
                    if (fw00Var2.f99522W >= j4) {
                        j4 = fw00.this.f99522W;
                    }
                    fw00Var2.f99522W = j4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: d */
        public void mo19003d(MediaFormat mediaFormat) {
            da1 da1Var = fw00.this.f99544j;
            if (da1Var != null) {
                da1Var.m110528e(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: f */
        public void mo19005f() {
            fw00.this.f99521V = false;
            MDLog.m7395i("SeekDiag", "onPreviewFinished mIsLoopbackMode=" + fw00.this.f99520U + " mSeekPending=" + fw00.this.f99564t + " thread=" + Thread.currentThread().getName());
            if (fw00.this.f99559q0 != null) {
                fw00.this.f99559q0.mo62443V(1.0f);
                fw00.this.f99559q0.mo62452z();
                fw00.this.f99559q0.mo62450k0();
                fw00.this.f99559q0.mo62451n(fw00.this.f99522W / 1000);
                fw00.this.f99522W = 0L;
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MomoProcess onPreviewFinished !!!");
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: g */
        public void mo19006g(ByteBuffer byteBuffer, int i, long j) {
            da1 da1Var = fw00.this.f99544j;
            if (da1Var != null) {
                da1Var.m110526c(byteBuffer, i, j);
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: h */
        public void mo19007h(MediaFormat mediaFormat) {
            boolean z;
            if (mediaFormat == null) {
                return;
            }
            if (fw00.this.f99570w != null) {
                fw00.this.f99574y.post(new a());
            }
            int integer = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
            if (integer != fw00.this.f99496E) {
                if (mediaFormat.containsKey("width")) {
                    fw00.this.f99498F = mediaFormat.getInteger("width");
                }
                if (mediaFormat.containsKey("height")) {
                    fw00.this.f99500G = mediaFormat.getInteger("height");
                }
                z = true;
            } else {
                z = false;
            }
            boolean z2 = fw00.this.f99491B0;
            fw00 fw00Var = fw00.this;
            if (!z2) {
                eci0 eci0Var = fw00Var.f99546k;
                if (eci0Var != null) {
                    if (z) {
                        eci0Var.mo111004x0(fw00Var.f99496E);
                    } else {
                        eci0Var.mo111004x0(0);
                    }
                    fw00 fw00Var2 = fw00.this;
                    fw00Var2.f99546k.m98684R(new tif0(fw00Var2.f99498F, fw00.this.f99500G));
                    return;
                }
                return;
            }
            eci0 eci0Var2 = fw00Var.f99546k;
            if (eci0Var2 != null) {
                eci0Var2.mo111004x0(fw00Var.f99496E);
                if (integer == 90 || integer == 270) {
                    fw00 fw00Var3 = fw00.this;
                    fw00Var3.f99546k.m98684R(new tif0(fw00Var3.f99500G, fw00.this.f99498F));
                } else {
                    fw00 fw00Var4 = fw00.this;
                    fw00Var4.f99546k.m98684R(new tif0(fw00Var4.f99498F, fw00.this.f99500G));
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: i */
        public void mo19008i(SurfaceTexture surfaceTexture) {
            fw00.this.m123402R0();
            fw00 fw00Var = fw00.this;
            if (fw00Var.f99546k != null) {
                if (fw00Var.f99495D0 > 0 && fw00.this.f99495D0 <= 15) {
                    synchronized (fw00.this.f99493C0) {
                        try {
                            fw00 fw00Var2 = fw00.this;
                            fw00Var2.f99493C0.wait(fw00Var2.f99495D0);
                        } catch (InterruptedException e) {
                            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, e.toString());
                        }
                    }
                }
                tif0 tif0Var = fw00.this.f99497E0;
                fw00 fw00Var3 = fw00.this;
                tif0 tif0Var2 = tif0Var == null ? new tif0(fw00Var3.f99492C, fw00.this.f99494D) : fw00Var3.f99497E0;
                if (fw00.this.f99507J0 && ((s2h0) fw00.this.f99546k).mo115708j0() != null) {
                    try {
                        ((s2h0) fw00.this.f99546k).m182065M0();
                    } catch (RuntimeException unused) {
                        MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "SurfaceTexture updateTexImage failed!!");
                    }
                }
                fw00.this.getClass();
                ((s2h0) fw00.this.f99546k).onFrameAvailable(surfaceTexture);
                if (fw00.this.f99551m0 == 1 && fw00.this.f99575y0) {
                    fw00 fw00Var4 = fw00.this;
                    fw00Var4.f99546k.m115722y0(fw00Var4.f99572x, tif0Var2);
                    fw00.this.f99575y0 = false;
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        public void onFinished() throws IOException {
            if (fw00.this.f99551m0 == 0) {
                fw00.this.m123394M0();
            }
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "On process Finished");
            MDLog.m7395i("SeekDiag", "onFinished mMode=" + fw00.this.f99551m0 + " mIsLoopbackMode=" + fw00.this.f99520U + " mSeekPending=" + fw00.this.f99564t + " thread=" + Thread.currentThread().getName());
            fw00.this.f99521V = false;
            int i = fw00.this.f99551m0;
            fw00 fw00Var = fw00.this;
            if (i != 1) {
                if (fw00Var.f99539g0 != null) {
                    fw00.this.f99539g0.onProcessProgress(1.0f);
                    fw00.this.f99539g0.mo61016a();
                    fw00 fw00Var2 = fw00.this;
                    fw00Var2.m123441o0(fw00Var2.f99571w0);
                    return;
                }
                return;
            }
            if (fw00Var.f99559q0 != null) {
                fw00.this.f99559q0.mo62452z();
                fw00.this.f99559q0.mo62450k0();
                fw00.this.f99559q0.mo62443V(1.0f);
                fw00.this.f99559q0.mo62451n(fw00.this.f99522W / 1000);
                fw00.this.f99522W = 0L;
            }
        }

        @Override // com.immomo.moment.mediautils.C3858o.d
        /* JADX INFO: renamed from: e */
        public void mo19004e(int i) {
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m123470S0(ntb ntbVar) {
    }
}
