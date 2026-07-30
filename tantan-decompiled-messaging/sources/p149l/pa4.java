package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;
import com.immomo.moment.datadot.DataDotUtils;
import com.immomo.moment.mediautils.C3855l;
import com.immomo.moment.model.VideoFragment;
import com.immomo.moment.util.datadot.RecorderDataDotUtils;
import com.momo.mcamera.util.MDLogTag;
import com.momo.xengine.mestatistics.ReportType;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes7.dex */
public class pa4 implements oa4 {

    /* JADX INFO: renamed from: F */
    private byte[] f147849F;

    /* JADX INFO: renamed from: I */
    private j94 f147853I;

    /* JADX INFO: renamed from: d0 */
    private rlw f147878d0;

    /* JADX INFO: renamed from: f */
    private EGLContext f147881f;

    /* JADX INFO: renamed from: g */
    private n4c f147883g;

    /* JADX INFO: renamed from: h */
    private tlw f147885h;

    /* JADX INFO: renamed from: i */
    private String f147887i;

    /* JADX INFO: renamed from: i0 */
    private otf f147888i0;

    /* JADX INFO: renamed from: j */
    private String f147889j;

    /* JADX INFO: renamed from: o */
    private SurfaceTexture f147899o;

    /* JADX INFO: renamed from: p0 */
    private long f147902p0;

    /* JADX INFO: renamed from: q0 */
    private long f147904q0;

    /* JADX INFO: renamed from: r0 */
    private long f147906r0;

    /* JADX INFO: renamed from: s0 */
    private long f147908s0;

    /* JADX INFO: renamed from: t0 */
    private long f147910t0;

    /* JADX INFO: renamed from: u0 */
    private long f147912u0;

    /* JADX INFO: renamed from: v0 */
    private long f147914v0;

    /* JADX INFO: renamed from: w0 */
    private int f147916w0;

    /* JADX INFO: renamed from: x */
    protected xc1 f147917x;

    /* JADX INFO: renamed from: x0 */
    private long f147918x0;

    /* JADX INFO: renamed from: y0 */
    private long f147920y0;

    /* JADX INFO: renamed from: z0 */
    private long f147922z0;

    /* JADX INFO: renamed from: a */
    final int f147871a = 302;

    /* JADX INFO: renamed from: b */
    final int f147873b = 303;

    /* JADX INFO: renamed from: c */
    final int f147875c = HttpStatus.USE_PROXY_305;

    /* JADX INFO: renamed from: d */
    private final int f147877d = 1;

    /* JADX INFO: renamed from: e */
    private final int f147879e = 2;

    /* JADX INFO: renamed from: k */
    private float f147891k = 1.0f;

    /* JADX INFO: renamed from: l */
    private long f147893l = 0;

    /* JADX INFO: renamed from: m */
    private volatile boolean f147895m = false;

    /* JADX INFO: renamed from: n */
    private boolean f147897n = false;

    /* JADX INFO: renamed from: p */
    private qie f147901p = null;

    /* JADX INFO: renamed from: q */
    private Looper f147903q = null;

    /* JADX INFO: renamed from: r */
    private int f147905r = 0;

    /* JADX INFO: renamed from: s */
    protected C3855l f147907s = null;

    /* JADX INFO: renamed from: t */
    protected C3855l f147909t = null;

    /* JADX INFO: renamed from: u */
    protected ic1 f147911u = null;

    /* JADX INFO: renamed from: v */
    cmw f147913v = null;

    /* JADX INFO: renamed from: w */
    private boolean f147915w = false;

    /* JADX INFO: renamed from: y */
    protected fmw f147919y = null;

    /* JADX INFO: renamed from: z */
    private ylw f147921z = null;

    /* JADX INFO: renamed from: A */
    protected Surface f147839A = null;

    /* JADX INFO: renamed from: B */
    protected Surface f147841B = null;

    /* JADX INFO: renamed from: C */
    protected int f147843C = 20;

    /* JADX INFO: renamed from: D */
    protected int f147845D = 20;

    /* JADX INFO: renamed from: E */
    private boolean f147847E = false;

    /* JADX INFO: renamed from: G */
    private boolean f147851G = false;

    /* JADX INFO: renamed from: H */
    final Object f147852H = new Object();

    /* JADX INFO: renamed from: J */
    private boolean f147854J = false;

    /* JADX INFO: renamed from: K */
    private long f147855K = 0;

    /* JADX INFO: renamed from: L */
    protected long f147856L = 0;

    /* JADX INFO: renamed from: M */
    protected int f147857M = 0;

    /* JADX INFO: renamed from: N */
    private long f147858N = 0;

    /* JADX INFO: renamed from: O */
    private long f147859O = 0;

    /* JADX INFO: renamed from: P */
    protected Boolean f147860P = Boolean.FALSE;

    /* JADX INFO: renamed from: Q */
    private us2 f147861Q = null;

    /* JADX INFO: renamed from: R */
    private Object f147862R = null;

    /* JADX INFO: renamed from: S */
    private int f147863S = 0;

    /* JADX INFO: renamed from: T */
    private int f147864T = 0;

    /* JADX INFO: renamed from: U */
    private int f147865U = 0;

    /* JADX INFO: renamed from: V */
    private boolean f147866V = false;

    /* JADX INFO: renamed from: W */
    private int f147867W = 0;

    /* JADX INFO: renamed from: X */
    private int f147868X = 0;

    /* JADX INFO: renamed from: Y */
    private long f147869Y = 0;

    /* JADX INFO: renamed from: Z */
    private boolean f147870Z = false;

    /* JADX INFO: renamed from: a0 */
    private bmw f147872a0 = null;

    /* JADX INFO: renamed from: b0 */
    private int f147874b0 = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: c0 */
    private int f147876c0 = 0;

    /* JADX INFO: renamed from: e0 */
    private rmw f147880e0 = null;

    /* JADX INFO: renamed from: f0 */
    uuh0 f147882f0 = new uuh0();

    /* JADX INFO: renamed from: g0 */
    private int f147884g0 = 352;

    /* JADX INFO: renamed from: h0 */
    private int f147886h0 = 640;

    /* JADX INFO: renamed from: j0 */
    protected LinkedList<IProcessOutput> f147890j0 = new LinkedList<>();

    /* JADX INFO: renamed from: k0 */
    private boolean f147892k0 = false;

    /* JADX INFO: renamed from: l0 */
    private volatile boolean f147894l0 = true;

    /* JADX INFO: renamed from: m0 */
    private int f147896m0 = 0;

    /* JADX INFO: renamed from: n0 */
    private int f147898n0 = 0;

    /* JADX INFO: renamed from: o0 */
    private volatile boolean f147900o0 = false;

    /* JADX INFO: renamed from: A0 */
    private qmw f147840A0 = new C19169j();

    /* JADX INFO: renamed from: B0 */
    private snr f147842B0 = new C19174o();

    /* JADX INFO: renamed from: C0 */
    tnr f147844C0 = new C19160a();

    /* JADX INFO: renamed from: D0 */
    qnr f147846D0 = new C19161b();

    /* JADX INFO: renamed from: E0 */
    rnr f147848E0 = new C19162c();

    /* JADX INFO: renamed from: F0 */
    onr f147850F0 = new C19163d();

    /* JADX INFO: renamed from: l.pa4$a */
    public class C19160a implements tnr {
        public C19160a() {
        }

        @Override // p149l.tnr
        /* JADX INFO: renamed from: a */
        public boolean mo168074a() {
            return pa4.this.m167990D1();
        }
    }

    /* JADX INFO: renamed from: l.pa4$b */
    public class C19161b implements qnr {
        public C19161b() {
        }

        @Override // p149l.qnr
        /* JADX INFO: renamed from: a */
        public void mo123490a() {
            pa4.this.m168043n1();
            pa4.this.f147859O = System.currentTimeMillis() - pa4.this.f147858N;
        }

        @Override // p149l.qnr
        /* JADX INFO: renamed from: b */
        public Object mo123491b() {
            IProcessOutput iProcessOutputPollFirst;
            pa4.this.f147858N = System.currentTimeMillis();
            synchronized (pa4.this.f147852H) {
                try {
                    iProcessOutputPollFirst = pa4.this.f147890j0.size() > 0 ? pa4.this.f147890j0.pollFirst() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            pa4 pa4Var = pa4.this;
            if (iProcessOutputPollFirst == null) {
                pa4Var.f147902p0 = 0L;
                pa4.this.f147904q0 = 0L;
                return iProcessOutputPollFirst;
            }
            pa4Var.f147902p0 = iProcessOutputPollFirst.m18292c();
            pa4 pa4Var2 = pa4.this;
            pa4Var2.f147904q0 = pa4Var2.f147858N - pa4.this.f147902p0;
            return iProcessOutputPollFirst;
        }
    }

    /* JADX INFO: renamed from: l.pa4$c */
    public class C19162c implements rnr {
        public C19162c() {
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: a */
        public void mo168075a() {
            pa4.this.m168053s1();
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: b */
        public void mo168076b() {
            pa4.this.m168047p1();
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: c */
        public void mo168077c() {
            pa4.this.m168039k1(System.currentTimeMillis() - pa4.this.f147906r0);
            pa4.this.m168055t1();
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: d */
        public void mo168078d() {
            pa4.this.m168057u1();
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: e */
        public void mo168079e(String str, int i, String str2) {
            pa4.this.m168045o1(HttpStatus.USE_PROXY_305, 0);
        }

        @Override // p149l.rnr
        /* JADX INFO: renamed from: f */
        public void mo168080f(Object obj) {
            pa4.this.m168051r1(obj);
            pa4.this.f147906r0 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l.pa4$d */
    public class C19163d implements onr {

        /* JADX INFO: renamed from: l.pa4$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Message f147927a;

            public a(Message message) {
                this.f147927a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                Object[] objArr = (Object[]) this.f147927a.obj;
                if (objArr == null || (obj = objArr[0]) == null) {
                    return;
                }
                pa4.this.m168059v1((tif0) obj, (ylw) objArr[1]);
            }
        }

        public C19163d() {
        }

        @Override // p149l.onr
        /* JADX INFO: renamed from: a */
        public void mo165228a(Message message) {
            int i = message.what;
            if (i == 1) {
                ov00.m166150b(new a(message));
            } else {
                if (i != 2) {
                    return;
                }
                pa4.this.m168049q1(message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.pa4$e */
    public class RunnableC19164e implements Runnable {
        public RunnableC19164e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pa4.this.m168012Q1();
        }
    }

    /* JADX INFO: renamed from: l.pa4$f */
    public class C19165f implements tmw {
        public C19165f() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (pa4.this.f147872a0 != null) {
                pa4.this.f147872a0.onError(pa4.this.f147874b0 + i, str);
            }
            MDLog.m7391e("media", "[" + (pa4.this.f147874b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$g */
    public class RunnableC19166g implements Runnable {
        public RunnableC19166g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pa4.this.m168034h1();
        }
    }

    /* JADX INFO: renamed from: l.pa4$h */
    public class C19167h implements tmw {
        public C19167h() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (pa4.this.f147872a0 != null) {
                pa4.this.f147872a0.onError(pa4.this.f147874b0 + i, str);
            }
            MDLog.m7391e("media", "[" + (pa4.this.f147874b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$i */
    public class C19168i implements tmw {
        public C19168i() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (pa4.this.f147872a0 != null) {
                pa4.this.f147872a0.onError(pa4.this.f147874b0 + i, str);
            }
            MDLog.m7391e("media", "[" + (pa4.this.f147874b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$j */
    public class C19169j implements qmw {
        public C19169j() {
        }

        @Override // p149l.qmw
        /* JADX INFO: renamed from: a */
        public void mo168081a(Bitmap bitmap, Exception exc) {
            if (exc != null && pa4.this.f147880e0 != null) {
                pa4.this.f147880e0.mo108309a(-1, exc);
            }
            pa4.this.f147882f0.m195368e(bitmap);
            pa4.this.m167986B1();
        }
    }

    /* JADX INFO: renamed from: l.pa4$k */
    public class C19170k implements ic1.InterfaceC17517b {
        public C19170k() {
        }

        @Override // p149l.ic1.InterfaceC17517b
        /* JADX INFO: renamed from: a */
        public void mo135314a(u460 u460Var) {
            C3855l c3855l;
            C3855l c3855l2;
            pa4.m168008O0(pa4.this);
            pa4 pa4Var = pa4.this;
            if (pa4Var.f147907s == null && pa4Var.f147909t == null) {
                return;
            }
            xc1 xc1Var = pa4Var.f147917x;
            if (xc1Var != null) {
                u460Var = xc1Var.m208056e(u460Var, pa4Var.f147891k);
            }
            if (u460Var != null && pa4.this.f147866V) {
                u460Var.m191676e(ByteBuffer.allocate(u460Var.m191673b().size));
            }
            if (u460Var != null && (c3855l2 = pa4.this.f147907s) != null) {
                c3855l2.m18906E(u460Var);
            }
            if (u460Var == null || (c3855l = pa4.this.f147909t) == null) {
                return;
            }
            c3855l.m18906E(u460Var);
        }
    }

    /* JADX INFO: renamed from: l.pa4$l */
    public class RunnableC19171l implements Runnable {
        public RunnableC19171l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tif0 textureSize;
            if (pa4.this.f147853I != null) {
                pa4.m168013R0(pa4.this);
                pa4.this.f147853I.m140507h(0, pa4.this.f147878d0);
                pa4.this.f147883g.m157818O0(false);
                pa4.this.f147883g.m157825c1();
                boolean zM140516q = pa4.this.f147853I.m140516q(null);
                nnl nnlVarM140503d = pa4.this.f147853I.m140503d();
                if (!zM140516q || nnlVarM140503d == null || (textureSize = nnlVarM140503d.getTextureSize()) == null) {
                    return;
                }
                pa4.this.f147883g.m98684R(new tif0(textureSize.m189183a(), textureSize.m189184b()));
            }
        }
    }

    /* JADX INFO: renamed from: l.pa4$m */
    public class RunnableC19172m implements Runnable {
        public RunnableC19172m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (pa4.this.f147853I == null || pa4.this.f147885h == null) {
                return;
            }
            pa4.this.f147853I.m140504e(pa4.this.f147885h);
            pa4.this.f147853I.m140507h(pa4.this.f147876c0, pa4.this.f147878d0);
            pa4.this.f147883g.m98684R(new tif0(pa4.this.f147885h.m189632d(), pa4.this.f147885h.m189631c()));
            pa4.this.f147883g.m98669C(pa4.this.m168041m1());
            nnl nnlVarM140503d = pa4.this.f147853I.m140503d();
            if (nnlVarM140503d != null) {
                pa4.this.f147883g.mo111004x0(nnlVarM140503d.mo106826m());
                pa4.this.f147883g.m111003J0(nnlVarM140503d.mo106822i());
            }
            pa4.this.f147883g.m157818O0(pa4.this.f147885h.f171096g0);
            pa4.this.f147853I.m140516q(pa4.this.f147899o);
        }
    }

    /* JADX INFO: renamed from: l.pa4$n */
    public class C19173n implements amw {
        public C19173n() {
        }

        @Override // p149l.amw
        /* JADX INFO: renamed from: a */
        public boolean mo97695a(int i) {
            if (!pa4.this.f147900o0) {
                return true;
            }
            if (pa4.this.f147853I != null) {
                return pa4.this.f147853I.m140519t(i);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.pa4$p */
    public class C19175p implements tmw {
        public C19175p() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (pa4.this.f147872a0 != null) {
                pa4.this.f147872a0.onError(pa4.this.f147874b0 + i, str);
            }
            MDLog.m7391e("media", "[" + (pa4.this.f147874b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$q */
    public class C19176q implements tmw {
        public C19176q() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (pa4.this.f147872a0 != null) {
                pa4.this.f147872a0.onError(pa4.this.f147874b0 + i, str);
            }
            MDLog.m7391e("media", "[" + (pa4.this.f147874b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$r */
    public class C19177r implements fgw.InterfaceC16828h {
        public C19177r() {
        }

        @Override // p149l.fgw.InterfaceC16828h
        /* JADX INFO: renamed from: a */
        public void mo121316a(int i, String str) {
            pa4.this.m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, i);
            MDLog.m7391e("media", "[" + i + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.pa4$s */
    public class C19178s implements Camera.ErrorCallback {
        public C19178s() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            pa4.this.m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, i);
            pa4.this.f147915w = true;
            MDLog.m7391e("media", "The camera process failed !!! ");
        }
    }

    /* JADX INFO: renamed from: l.pa4$t */
    public class C19179t implements j94.InterfaceC17717b {
        public C19179t() {
        }

        @Override // p149l.j94.InterfaceC17717b
        /* JADX INFO: renamed from: D */
        public void mo140520D(byte[] bArr) {
            if (pa4.this.f147915w || bArr == null || pa4.this.f147883g == null || !pa4.this.f147883g.m157823a1()) {
                return;
            }
            pa4.m168035i(pa4.this);
            if (System.currentTimeMillis() - pa4.this.f147869Y > 1000) {
                pa4 pa4Var = pa4.this;
                pa4Var.f147845D = pa4Var.f147868X;
                pa4.this.f147868X = 0;
                pa4.this.f147869Y = System.currentTimeMillis();
            }
            boolean z = pa4.this.f147885h.f171076T;
            pa4 pa4Var2 = pa4.this;
            if (z) {
                byte[] bArrM168068E1 = pa4Var2.m168068E1(bArr);
                synchronized (pa4.this.f147852H) {
                    pa4.this.m168015S1(bArrM168068E1, pa4.this.m167988C1(bArrM168068E1));
                }
                return;
            }
            byte[] bArrM168068E2 = pa4Var2.m168068E1(bArr);
            synchronized (pa4.this.f147852H) {
                try {
                    IProcessOutput iProcessOutputM167988C1 = pa4.this.m167988C1(bArrM168068E2);
                    if (pa4.this.f147851G) {
                        pa4.this.m168027d1(iProcessOutputM167988C1);
                    }
                    pa4.this.m168015S1(bArrM168068E2, iProcessOutputM167988C1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.j94.InterfaceC17717b
        /* JADX INFO: renamed from: E */
        public void mo140521E(byte[] bArr) throws Throwable {
            try {
                pa4.this.f147882f0.m195370g(bArr);
                pa4.this.m167986B1();
            } catch (Exception e) {
                MDLog.printErrStackTrace("media", e);
            }
        }
    }

    public pa4(tlw tlwVar, EGLContext eGLContext) {
        if (tlwVar != null) {
            this.f147881f = eGLContext;
            m168063x1(tlwVar);
            this.f147883g.mo98682P();
        }
    }

    /* JADX INFO: renamed from: A1 */
    private void m167984A1() {
        tlw tlwVar = this.f147885h;
        if (tlwVar.f171096g0) {
            jdq0.C17755a c17755aM141055a = jdq0.m141055a(this.f147896m0, this.f147898n0, tlwVar.f171106p, tlwVar.f171105o);
            tlw tlwVar2 = this.f147885h;
            tlwVar2.f171089d = c17755aM141055a.f117429a;
            tlwVar2.f171091e = c17755aM141055a.f117430b;
            tlwVar2.f171093f = c17755aM141055a.f117431c;
            tlwVar2.f171095g = c17755aM141055a.f117432d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public void m167986B1() {
        Message message = new Message();
        message.what = 2;
        this.f147883g.m157827e1(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public IProcessOutput m167988C1(byte[] bArr) {
        epx.m117686a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public boolean m167990D1() {
        if (this.f147907s != null) {
            long j = this.f147855K + 1;
            this.f147855K = j;
            if (this.f147897n) {
                float f = this.f147891k;
                if (f < 0.5f && j % 2 == 0) {
                    return false;
                }
                if (f < 0.8f && j % 4 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F1 */
    private void m167993F1() {
        nnl nnlVarM140503d;
        j94 j94Var = this.f147853I;
        if (j94Var == null || (nnlVarM140503d = j94Var.m140503d()) == null) {
            return;
        }
        tif0 tif0VarMo106837x = nnlVarM140503d.mo106837x();
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSourceFps(nnlVarM140503d.mo106827n());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSizeWidth(tif0VarMo106837x.m189184b());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSizeHeight(tif0VarMo106837x.m189183a());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPreviewVideoWidth(this.f147885h.f171085b);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPreviewVideoHeight(this.f147885h.f171087c);
    }

    /* JADX INFO: renamed from: G1 */
    private void m167995G1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseSpeedvary(true);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoEncodeWidth(i);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoEncodeHeight(i2);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoEncodeFps(i3);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoBitrate(i4);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoGopSize(i5);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoRotation(i6);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioSampleRate(i7);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioBits(i8);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioChannel(i9);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioBitrate(i10);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioMediaformatInputSize(i11);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoEncode(YtVideoEncoder.MIME_TYPE);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoExtension("mp4");
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraVideoCq(false);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraAudioEncode("audio/mp4a-latm");
    }

    /* JADX INFO: renamed from: H1 */
    private void m167997H1() {
        int i = this.f147867W;
        if (i == 1) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(1);
        } else if (i == 16) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(2);
        } else if (i == 17) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(3);
        }
    }

    /* JADX INFO: renamed from: I1 */
    private void m167999I1() {
        int iM179922n = this.f147878d0.m179922n();
        if (iM179922n == 0) {
            int i = this.f147885h.f171097h;
            this.f147884g0 = i;
            this.f147886h0 = i;
        } else {
            if (iM179922n != 1) {
                if (iM179922n == 2) {
                    tlw tlwVar = this.f147885h;
                    this.f147884g0 = tlwVar.f171097h;
                    this.f147886h0 = tlwVar.f171099i;
                    return;
                }
                return;
            }
            int i2 = this.f147885h.f171097h;
            int i3 = (i2 * 4) / 3;
            if (i3 % 4 != 0) {
                i3 = (i3 >> 4) << 4;
            }
            this.f147884g0 = i2;
            this.f147886h0 = i3;
        }
    }

    /* JADX INFO: renamed from: K1 */
    private void m168002K1() {
        ov00.m166150b(new RunnableC19171l());
    }

    /* JADX INFO: renamed from: L1 */
    private void m168004L1() {
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140508i();
        }
        ov00.m166150b(new RunnableC19172m());
    }

    /* JADX INFO: renamed from: M1 */
    private void m168006M1(int i, int i2, int i3, int i4) {
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long j = i;
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-encode-width", j, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-height", i2, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-fps", i3, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-bitrate", i4, reportType);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ ea1 m168008O0(pa4 pa4Var) {
        pa4Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    private VideoFragment m168010P1(boolean z) {
        MDLog.m7389d("media", " Calling stoprecording withsync value=[" + z + Constants.AES_SUFFIX);
        if (!this.f147897n) {
            return null;
        }
        synchronized (this.f147852H) {
            try {
                n4c n4cVar = this.f147883g;
                if (n4cVar != null) {
                    n4cVar.m157828f1(this.f147839A);
                    Surface surface = this.f147841B;
                    if (surface != null) {
                        this.f147883g.m157829g1(surface);
                    }
                    if (z) {
                        m168057u1();
                    } else {
                        this.f147883g.m98681O();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m167997H1();
        MDLog.m7389d("media", "Stop recording , path is " + this.f147887i);
        VideoFragment videoFragment = new VideoFragment();
        videoFragment.setVideoPath(this.f147887i);
        videoFragment.setSpeed(this.f147891k);
        videoFragment.setDuration(SystemClock.uptimeMillis() - this.f147893l);
        return videoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public synchronized void m168012Q1() {
        try {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "Release SurfaceTexture in host looper !");
            SurfaceTexture surfaceTexture = this.f147899o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable th) {
            MDLog.m7392e(MDLogTag.MOMENT_RENDER_TAG, "SurfaceTexture release error !", th);
        }
        this.f147899o = null;
        if (this.f147901p != null) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "Release EglWrapper in host looper !");
            this.f147901p.m174873g();
            this.f147901p = null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ v0m m168013R0(pa4 pa4Var) {
        pa4Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public void m168015S1(byte[] bArr, IProcessOutput iProcessOutput) {
        j94 j94Var;
        if (bArr == null || bArr.length < ((this.f147905r * 3) >> 1) || this.f147883g == null) {
            return;
        }
        synchronized (this.f147852H) {
            try {
                if (this.f147860P.booleanValue() && (j94Var = this.f147853I) != null && j94Var.m140503d() != null) {
                    this.f147883g.mo111004x0(this.f147853I.m140503d().mo106826m());
                    this.f147883g.m111003J0(this.f147853I.m140503d().mo106822i());
                    this.f147860P = Boolean.FALSE;
                }
                this.f147890j0.addLast(iProcessOutput);
                this.f147883g.m157838r1(bArr, this.f147905r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public void m168027d1(IProcessOutput iProcessOutput) {
        otf otfVar;
        if (iProcessOutput == null || (otfVar = this.f147888i0) == null) {
            return;
        }
        otfVar.m165942a(iProcessOutput);
    }

    /* JADX INFO: renamed from: e1 */
    private void m168028e1() {
        if (this.f147907s != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f147907s.mo18754n();
            MDLog.m7395i("CameraPreviewManager", "stopEncoding cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f147907s = null;
        }
        if (this.f147909t != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f147909t.mo18754n();
            MDLog.m7395i("CameraPreviewManager", "stopEncoding origin cost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
            this.f147909t = null;
        }
        Surface surface = this.f147839A;
        if (surface != null) {
            surface.release();
            this.f147839A = null;
        }
        Surface surface2 = this.f147841B;
        if (surface2 != null) {
            surface2.release();
            this.f147841B = null;
        }
        this.f147897n = false;
        this.f147866V = false;
        MDLog.m7389d("media", "Handle stop recording finished !");
    }

    /* JADX INFO: renamed from: f1 */
    private void m168030f1() {
        pa4 pa4Var;
        int i = this.f147884g0;
        int i2 = this.f147886h0;
        tlw tlwVar = this.f147885h;
        int i3 = tlwVar.f171109s;
        int i4 = tlwVar.f171111u;
        int i5 = tlwVar.f171110t;
        int i6 = tlwVar.f171107q;
        float f = tlwVar.f171074R;
        int i7 = tlwVar.f171059C;
        int i8 = tlwVar.f171061E;
        int i9 = tlwVar.f171062F;
        int i10 = tlwVar.f171060D;
        int i11 = tlwVar.f171066J;
        boolean z = tlwVar.f171077U;
        if (i11 != 0) {
            i3 = this.f147843C;
            if (i3 < 10) {
                i3 = 10;
            }
        } else if (i3 == 0) {
            i3 = 30;
        }
        m168006M1(i, i2, i3, i4);
        MDLog.m7395i("media", "create media encoder videoWidth = " + i + " videoHeight = " + i2 + " videoFps = " + i3 + " videoBitrate = " + i4 + " videoGopSize = " + i5 + " videoRotation = " + i6 + " recordSpeed " + f + " audioSampleRate = " + i7 + " audioBits = 16 audioChannels = " + i8 + " audioBitrate = " + i9 + " audioBufferSize = " + i10 + " encoderGopMode = " + i11);
        C3855l c3855l = new C3855l();
        this.f147907s = c3855l;
        c3855l.m18911N(this.f147887i);
        this.f147907s.m18913P(f);
        C3855l c3855l2 = this.f147907s;
        if (c3855l2 != null) {
            c3855l2.m18910M(new C19167h());
        }
        if (this.f147889j != null) {
            C3855l c3855l3 = new C3855l();
            this.f147909t = c3855l3;
            c3855l3.m18911N(this.f147889j);
            this.f147909t.m18913P(f);
            C3855l c3855l4 = this.f147909t;
            if (c3855l4 != null) {
                c3855l4.m18910M(new C19168i());
            }
        }
        this.f147891k = f;
        xc1 xc1Var = new xc1();
        this.f147917x = xc1Var;
        xc1Var.mo192814d(i7, 16, i8);
        this.f147917x.mo192813a();
        this.f147907s.m18916S(i, i2, i3, i4, i5, i6, C3855l.f13477U, z);
        int i12 = i3;
        if (!this.f147878d0.m179917i()) {
            this.f147907s.m18908K(i7, 16, i8, i9, i10);
        }
        m167995G1(i, i2, i12, i4, i5, i6, i7, 16, i8, i9, i10);
        if (!this.f147907s.mo18753m()) {
            MDLog.m7391e("media", "Start encoding error !");
            this.f147907s.mo18754n();
            this.f147907s = null;
            return;
        }
        C3855l c3855l5 = this.f147909t;
        Surface surface = null;
        if (c3855l5 != null) {
            c3855l5.m18916S(i, i2, i12, i4, i5, i6, C3855l.f13477U, z);
            if (this.f147878d0.m179917i()) {
                pa4Var = this;
            } else {
                pa4Var = this;
                pa4Var.f147909t.m18908K(i7, 16, i8, i9, i10);
            }
            if (pa4Var.f147909t.mo18753m()) {
                surface = null;
            } else {
                MDLog.m7391e("media", "Start origin encoding error !");
                pa4Var.f147909t.mo18754n();
                surface = null;
                pa4Var.f147909t = null;
            }
        } else {
            pa4Var = this;
        }
        pa4Var.f147839A = pa4Var.f147907s.m18907H();
        C3855l c3855l6 = pa4Var.f147909t;
        pa4Var.f147841B = c3855l6 != null ? c3855l6.m18907H() : surface;
        ic1 ic1Var = pa4Var.f147911u;
        if (ic1Var != null) {
            ic1Var.m135311k(pa4Var.new C19170k());
        }
        pa4Var.f147897n = true;
        pa4Var.f147893l = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: g1 */
    private synchronized void m168032g1() {
        try {
            m168012Q1();
            if (this.f147901p == null) {
                qie qieVar = new qie();
                this.f147901p = qieVar;
                qieVar.m174868a();
            }
            if (this.f147899o == null) {
                this.f147901p.m174872f();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                int i = iArr[0];
                GLES20.glBindTexture(36197, i);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                this.f147899o = new SurfaceTexture(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m168034h1() {
        MDLog.m7389d("media", "Begining to  create media encoder !");
        if (this.f147897n) {
            return;
        }
        MDLog.m7389d("media", "Begining to  create media encoder !");
        m167999I1();
        if (this.f147911u == null && !this.f147878d0.m179917i()) {
            m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_ILLEGAL_STATE, 0);
            bmw bmwVar = this.f147872a0;
            if (bmwVar != null) {
                bmwVar.onError(this.f147874b0 + 1017, "AudioRecord is null !!!");
            }
            MDLog.m7391e("media", "[" + (this.f147874b0 + 1018) + "]AudioRecord is null !!!");
            return;
        }
        try {
            m168030f1();
            if (this.f147839A != null) {
                boolean zM179920l = this.f147878d0.m179920l();
                n4c n4cVar = this.f147883g;
                if (zM179920l) {
                    n4cVar.m157824b1(this.f147839A);
                    this.f147883g.m115722y0(this.f147839A, new tif0(this.f147884g0, this.f147886h0));
                } else {
                    n4cVar.m157815L0(this.f147839A, this.f147884g0, this.f147886h0);
                }
            }
            Surface surface = this.f147841B;
            if (surface != null) {
                this.f147883g.m157816M0(surface, this.f147884g0, this.f147886h0);
            }
            MDLog.m7389d("media", "Create media encoder is done !");
        } catch (Exception e) {
            m168045o1(3, 0);
            if (this.f147872a0 != null) {
                this.f147872a0.onError(this.f147874b0 + 1017, "create encoder failed !!!");
            }
            MDLog.m7391e("media", "[" + (this.f147874b0 + 1017) + "]create encoder failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m168035i(pa4 pa4Var) {
        int i = pa4Var.f147868X;
        pa4Var.f147868X = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i1 */
    private void m168036i1() {
        if (this.f147903q != null) {
            new Handler(this.f147903q).post(new RunnableC19164e());
        }
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m168038j1(int i, rlw rlwVar) {
        nnl nnlVarM140503d;
        try {
            MDLog.m7395i("media", "The cameraPreviewManager switchCamera !!!");
            j94 j94Var = this.f147853I;
            if (j94Var != null) {
                j94Var.m140518s(i, rlwVar);
            }
            m168072R1();
            n4c n4cVar = this.f147883g;
            Object obj = this.f147862R;
            tlw tlwVar = this.f147885h;
            n4cVar.m115722y0(obj, new tif0(tlwVar.f171105o, tlwVar.f171106p));
            this.f147883g.m98684R(new tif0(this.f147885h.m189632d(), this.f147885h.m189631c()));
            this.f147883g.m98669C(m168041m1());
            j94 j94Var2 = this.f147853I;
            if (j94Var2 != null && (nnlVarM140503d = j94Var2.m140503d()) != null) {
                this.f147883g.mo111004x0(nnlVarM140503d.mo106826m());
                this.f147883g.m111003J0(nnlVarM140503d.mo106822i());
            }
            this.f147905r = this.f147885h.m189630b();
            if (!this.f147853I.m140516q(this.f147899o)) {
                m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
                MDLog.m7391e("media", "The startPreview failed when switchCamera !!!");
                return false;
            }
            otf otfVar = this.f147888i0;
            if (otfVar != null) {
                otfVar.m165944c(false);
            }
            otf otfVar2 = this.f147888i0;
            if (otfVar2 != null) {
                otfVar2.m165943b(mo163257e());
            }
            this.f147860P = Boolean.TRUE;
            return true;
        } catch (Exception e) {
            MDLog.m7391e("media", "switchCamera is failed because of " + e.toString());
            m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public void m168039k1(long j) {
        if (j <= 0 || this.f147914v0 <= 0 || this.f147912u0 <= 0 || this.f147918x0 <= 0) {
            return;
        }
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        ReportType reportType = ReportType.DURATION;
        recorderDataDotUtils.report("sdk-camera-usage_duration", j, reportType);
        recorderDataDotUtils.report("sdk-camera-drop_frame", this.f147910t0, ReportType.COUNT);
        int i = this.f147916w0;
        if (i == 720) {
            recorderDataDotUtils.report("sdk-camera-720p_cv_avg", this.f147912u0 / this.f147914v0, reportType);
        } else if (i == 1080) {
            recorderDataDotUtils.report("sdk-camera-1080p_cv_avg", this.f147912u0 / this.f147914v0, reportType);
        }
        recorderDataDotUtils.report("sdk-camera-start_time", this.f147918x0, reportType);
        long j2 = this.f147920y0;
        if (j2 > 0) {
            long j3 = this.f147922z0;
            if (j3 - 4 > 0) {
                recorderDataDotUtils.report("sdk-camera-render_avg", j2 / (j3 - 4), reportType);
            }
        }
        recorderDataDotUtils.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public jdq0.C17755a m168041m1() {
        if (!this.f147885h.f171096g0) {
            jdq0.C17755a c17755a = new jdq0.C17755a();
            tlw tlwVar = this.f147885h;
            c17755a.f117433e = tlwVar.f171085b;
            c17755a.f117434f = tlwVar.f171087c;
            return c17755a;
        }
        jdq0.C17755a c17755a2 = new jdq0.C17755a();
        tlw tlwVar2 = this.f147885h;
        c17755a2.f117429a = tlwVar2.f171089d;
        c17755a2.f117430b = tlwVar2.f171091e;
        c17755a2.f117431c = tlwVar2.f171093f;
        c17755a2.f117432d = tlwVar2.f171095g;
        c17755a2.f117433e = tlwVar2.f171085b;
        c17755a2.f117434f = tlwVar2.f171087c;
        return c17755a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public void m168043n1() {
        long j = this.f147859O;
        m168073l1(j, j);
        long jCurrentTimeMillis = this.f147902p0 != 0 ? System.currentTimeMillis() - this.f147902p0 : 0L;
        if (jCurrentTimeMillis > 200) {
            this.f147910t0++;
        }
        long j2 = this.f147922z0;
        if (j2 > 3) {
            this.f147920y0 += jCurrentTimeMillis;
        }
        this.f147922z0 = j2 + 1;
        if (this.f147883g != null) {
            if (!this.f147854J) {
                this.f147854J = true;
                this.f147918x0 = System.currentTimeMillis() - this.f147908s0;
                fmw fmwVar = this.f147919y;
                if (fmwVar != null) {
                    fmwVar.onFirstFrameRendered();
                }
            }
            ylw ylwVar = this.f147921z;
            if (ylwVar != null) {
                ylwVar.m215310a();
                this.f147921z = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public void m168045o1(int i, int i2) {
        cmw cmwVar = this.f147913v;
        if (cmwVar != null) {
            cmwVar.onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public void m168047p1() {
        MDLog.m7395i("media", "The CameraPreviewManager release !!!");
        if (this.f147895m) {
            m168071O1();
        }
        if (this.f147897n) {
            m168010P1(true);
        }
        m168036i1();
        ic1 ic1Var = this.f147911u;
        if (ic1Var != null) {
            ic1Var.m135313m();
            this.f147911u.m135309i();
            this.f147911u = null;
        }
        if (this.f147919y != null) {
            this.f147919y = null;
        }
        if (this.f147921z != null) {
            this.f147921z = null;
        }
        if (this.f147846D0 != null) {
            this.f147846D0 = null;
        }
        if (this.f147848E0 != null) {
            this.f147848E0 = null;
        }
        if (this.f147850F0 != null) {
            this.f147850F0 = null;
        }
        if (this.f147844C0 != null) {
            this.f147844C0 = null;
        }
        if (this.f147883g != null) {
            this.f147883g = null;
        }
        this.f147882f0.m195366b();
        this.f147895m = false;
        this.f147878d0 = null;
        this.f147876c0 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public void m168049q1(int i) {
        this.f147882f0.m195367d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public void m168051r1(Object obj) {
        boolean zMo106828o;
        if (this.f147883g == null || obj == null || this.f147895m || this.f147853I == null || this.f147895m) {
            return;
        }
        this.f147862R = obj;
        m168072R1();
        this.f147883g.m157817N0(obj, this.f147885h.f171096g0);
        n4c n4cVar = this.f147883g;
        tlw tlwVar = this.f147885h;
        n4cVar.m115722y0(obj, new tif0(tlwVar.f171105o, tlwVar.f171106p));
        this.f147883g.m98680N();
        this.f147883g.m98684R(new tif0(this.f147885h.m189632d(), this.f147885h.m189631c()));
        this.f147883g.m98669C(m168041m1());
        m167993F1();
        nnl nnlVarM140503d = this.f147853I.m140503d();
        if (nnlVarM140503d != null) {
            this.f147883g.mo111004x0(nnlVarM140503d.mo106826m());
            this.f147883g.m111003J0(nnlVarM140503d.mo106822i());
        }
        us2 us2Var = this.f147861Q;
        if (us2Var != null) {
            this.f147883g.m98685S(us2Var);
        }
        this.f147905r = this.f147885h.m189630b();
        try {
            zMo106828o = this.f147853I.m140503d().mo106828o(this.f147899o, this.f147901p);
        } catch (Exception e) {
            MDLog.m7391e("media", "The camera startPreview failed !!!" + e.toString());
            zMo106828o = false;
        }
        if (!zMo106828o) {
            m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            MDLog.m7391e("media", "The camera startPreview failed !!!");
        } else {
            if (!this.f147878d0.m179917i()) {
                m168065y1();
            }
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-use-time", System.currentTimeMillis(), ReportType.COUNT);
            this.f147895m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public void m168053s1() {
        jpi0.m142740d(2, new RunnableC19166g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public void m168055t1() {
        MDLog.m7395i("media", "The CameraPreviewManager stopPreview !!!");
        if (this.f147895m) {
            j94 j94Var = this.f147853I;
            if (j94Var != null) {
                j94Var.m140517r();
            }
            ic1 ic1Var = this.f147911u;
            if (ic1Var != null) {
                ic1Var.m135313m();
                this.f147911u.m135309i();
                this.f147911u = null;
            }
            this.f147910t0 = 0L;
            this.f147914v0 = 0L;
            this.f147920y0 = 0L;
            this.f147922z0 = 0L;
            this.f147867W = 0;
            this.f147895m = false;
            this.f147854J = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public void m168057u1() {
        ic1 ic1Var = this.f147911u;
        if (ic1Var != null) {
            ic1Var.m135311k(null);
        }
        xc1 xc1Var = this.f147917x;
        if (xc1Var != null) {
            xc1Var.m208057f();
            this.f147917x = null;
        }
        MDLog.m7395i("CameraPreviewManager", "codec stop");
        m168028e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public void m168059v1(tif0 tif0Var, ylw ylwVar) {
        if (this.f147853I == null) {
            m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return;
        }
        int iM189184b = tif0Var.m189184b();
        int iM189183a = tif0Var.m189183a();
        MDLog.m7389d("media", "targetWidth = " + iM189184b + " targetHeight = " + iM189183a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        tlw tlwVar = this.f147885h;
        tlwVar.f171085b = iM189184b;
        tlwVar.f171087c = iM189183a;
        this.f147878d0.m179902R(tif0Var);
        this.f147853I.m140509j(this.f147876c0, this.f147878d0);
        MDLog.m7389d("media", "Reset camera cost time " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        tlw tlwVar2 = this.f147885h;
        this.f147896m0 = tlwVar2.f171085b;
        this.f147898n0 = tlwVar2.f171087c;
        m168072R1();
        n4c n4cVar = this.f147883g;
        Object obj = this.f147862R;
        tlw tlwVar3 = this.f147885h;
        n4cVar.m115722y0(obj, new tif0(tlwVar3.f171105o, tlwVar3.f171106p));
        this.f147883g.m98684R(new tif0(this.f147885h.m189632d(), this.f147885h.m189631c()));
        this.f147883g.m98669C(m168041m1());
        nnl nnlVarM140503d = this.f147853I.m140503d();
        if (nnlVarM140503d != null) {
            this.f147883g.mo111004x0(nnlVarM140503d.mo106826m());
            this.f147883g.m111003J0(nnlVarM140503d.mo106822i());
        }
        this.f147905r = this.f147885h.m189630b();
        if (!this.f147853I.m140516q(this.f147899o)) {
            m168045o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return;
        }
        MDLog.m7389d("media", "StartPreview  camera cost " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " ms");
        if (this.f147883g != null) {
            this.f147890j0.clear();
        }
        this.f147921z = ylwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public void m168061w1(Message message) {
        int i = message.arg1;
        if (i == 0) {
            m168004L1();
        } else {
            if (i != 2) {
                return;
            }
            m168002K1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m168063x1(tlw tlwVar) {
        n4c n4cVarM157806P0 = n4c.m157806P0("nv21RenThr", this.f147881f);
        this.f147883g = n4cVarM157806P0;
        n4cVarM157806P0.m157831j1(new C19173n());
        this.f147883g.m157835n1(tlwVar.f171088c0 == 1);
        StringBuilder sb = new StringBuilder("Is FixedFrameRate? ");
        sb.append(tlwVar.f171088c0 == 1);
        MDLog.m7395i("CameraPreviewManager", sb.toString());
        this.f147892k0 = tlwVar.f171094f0;
        MDLog.m7395i("CameraPreviewManager", "CodecStopAsync: " + tlwVar.f171094f0 + " isFaceSegment:" + tlwVar.f171090d0 + " isGetBeautyScore:" + tlwVar.f171092e0);
        this.f147883g.m98688V(this.f147848E0);
        this.f147883g.m115719u0(this.f147846D0);
        this.f147883g.m157836o1(this.f147844C0);
        this.f147883g.m157830i1(this.f147850F0);
        this.f147883g.m157833l1(this.f147880e0);
        this.f147883g.m157834m1(this.f147840A0);
        this.f147883g.m115723z0(this.f147842B0);
        this.f147885h = tlwVar;
        this.f147853I = new j94(tlwVar);
        mow.m155709j().m155715e();
        this.f147888i0 = new otf(this.f147853I);
        this.f147897n = false;
        this.f147895m = false;
    }

    /* JADX INFO: renamed from: y1 */
    private void m168065y1() {
        tlw tlwVar = this.f147885h;
        int i = tlwVar.f171059C;
        int i2 = tlwVar.f171061E;
        int i3 = tlwVar.f171060D;
        ic1 ic1Var = new ic1();
        this.f147911u = ic1Var;
        ic1Var.m135308h(i, 16, i2, i3);
        ic1 ic1Var2 = this.f147911u;
        if (ic1Var2 != null) {
            ic1Var2.m135310j(new C19165f());
        }
    }

    /* JADX INFO: renamed from: z1 */
    private boolean m168067z1(int i, rlw rlwVar) {
        MDLog.m7395i("media", "CameraPreviewManager prepare!!!");
        n4c n4cVar = this.f147883g;
        if (n4cVar != null) {
            n4cVar.m115718t0(new C19175p());
        }
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140512m(new C19176q());
        }
        this.f147876c0 = i;
        this.f147878d0 = rlwVar;
        if (this.f147885h.f171076T) {
            MDLog.m7395i("media", "The camera type is camera2");
            this.f147853I.m140513n(new C19177r());
        }
        this.f147853I.m140514o(new C19178s());
        m168032g1();
        if (!this.f147853I.m140507h(i, rlwVar)) {
            MDLog.m7391e("media", "Camera prepare failed !!!");
            return false;
        }
        tlw tlwVar = this.f147885h;
        this.f147896m0 = tlwVar.f171085b;
        this.f147898n0 = tlwVar.f171087c;
        this.f147853I.m140511l(new C19179t());
        j94 j94Var2 = this.f147853I;
        int iMo106826m = (j94Var2 == null || j94Var2.m140503d() == null) ? 90 : this.f147853I.m140503d().mo106826m();
        tlw tlwVar2 = this.f147885h;
        tif0 tif0Var = new tif0(tlwVar2.f171085b, tlwVar2.f171087c);
        tlw tlwVar3 = this.f147885h;
        tif0 tif0VarM101044e = bc4.m101044e(tif0Var, new tif0(tlwVar3.f171105o, tlwVar3.f171106p), iMo106826m);
        this.f147885h.f171103m = tif0VarM101044e.m189184b();
        this.f147885h.f171104n = tif0VarM101044e.m189183a();
        tlw tlwVar4 = this.f147885h;
        tlwVar4.f171108r = iMo106826m;
        this.f147884g0 = tlwVar4.f171097h;
        this.f147886h0 = tlwVar4.f171099i;
        otf otfVar = this.f147888i0;
        if (otfVar == null) {
            return true;
        }
        otfVar.m165943b(mo163257e());
        return true;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: A */
    public boolean mo163224A(int i, rlw rlwVar) {
        return m168038j1(i, rlwVar);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: C */
    public boolean mo163226C(int i, rlw rlwVar) throws Exception {
        Looper looperMyLooper = Looper.myLooper();
        this.f147903q = looperMyLooper;
        if (looperMyLooper != null) {
            return m168067z1(i, rlwVar);
        }
        whq0.m203241a("Should create Looper in your thread, we need loop to create and release egl info");
        return false;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: D */
    public void mo163227D(fmw fmwVar) {
        this.f147919y = fmwVar;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: E */
    public void mo163228E(String str) {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return;
        }
        j94 j94Var2 = this.f147853I;
        if (str != "on") {
            j94Var2.m140503d().mo106812E(str);
        } else {
            j94Var2.m140503d().mo106812E("torch");
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseFlash(true);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public byte[] m168068E1(byte[] bArr) {
        boolean z = this.f147847E;
        byte[] bArr2 = this.f147849F;
        if (z) {
            if (bArr2 == null) {
                this.f147849F = Arrays.copyOf(bArr, bArr.length);
            }
            return this.f147849F;
        }
        if (bArr2 != null) {
            this.f147849F = null;
        }
        return bArr;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: F */
    public boolean mo163229F() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return false;
        }
        return this.f147853I.m140503d().mo106813F();
    }

    /* JADX INFO: renamed from: J1 */
    public void m168069J1(tif0 tif0Var) {
        this.f147883g.m115722y0(this.f147862R, tif0Var);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: K */
    public synchronized void mo163234K(boolean z) {
        this.f147866V = z;
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseBgMusic(this.f147866V);
        MDLog.m7395i("media", "The recoder use the background music " + this.f147866V);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: M */
    public synchronized VideoFragment mo163236M(omw omwVar) {
        return m168010P1(omwVar == null);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: N */
    public synchronized void mo163237N(nmw nmwVar) {
        ic1 ic1Var;
        try {
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-record-video", System.currentTimeMillis(), ReportType.COUNT);
            if (!this.f147878d0.m179917i() && (ic1Var = this.f147911u) != null) {
                ic1Var.m135312l();
            }
            if (nmwVar == null) {
                MDLog.m7389d("media", "Calling startRecording with sync ");
                m168034h1();
            } else {
                MDLog.m7389d("media", "Calling startRecording with async ");
                n4c n4cVar = this.f147883g;
                if (n4cVar != null) {
                    n4cVar.m98679M();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m168070N1() {
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140508i();
            this.f147853I = null;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public synchronized void m168071O1() {
        n4c n4cVar = this.f147883g;
        if (n4cVar != null) {
            n4cVar.mo98682P();
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: P */
    public void mo163239P(boolean z) {
        this.f147851G = z;
        MDLog.m7395i("media", "Use adjust light " + z);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: R */
    public synchronized void mo163241R(Object obj) {
        this.f147908s0 = System.currentTimeMillis();
        this.f147883g.m98678L(obj);
    }

    /* JADX INFO: renamed from: R1 */
    public tif0 m168072R1() {
        if (this.f147853I.m140503d() == null) {
            this.f147853I.m140504e(this.f147885h);
        }
        tif0 tif0Var = new tif0(this.f147896m0, this.f147898n0);
        int iMo106826m = this.f147853I.m140503d().mo106826m();
        tlw tlwVar = this.f147885h;
        tif0 tif0VarM101045f = bc4.m101045f(tif0Var, iMo106826m, new tif0(tlwVar.f171105o, tlwVar.f171106p), false);
        this.f147885h.f171103m = tif0VarM101045f.m189184b();
        this.f147885h.f171104n = tif0VarM101045f.m189183a();
        m167984A1();
        return tif0VarM101045f;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: S */
    public void mo163242S(String str) {
        this.f147889j = str;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: U */
    public void mo163244U(String str, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        tlw tlwVar;
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-take-photo", System.currentTimeMillis(), ReportType.COUNT);
        this.f147882f0.m195371h(str);
        this.f147882f0.m195372i(z);
        this.f147882f0.m195373j(this.f147880e0);
        if (z) {
            j94 j94Var = this.f147853I;
            if (j94Var != null && j94Var.m140503d() != null) {
                this.f147853I.m140503d().mo106833t(str);
            }
            this.f147883g.m157834m1(this.f147840A0);
        } else {
            this.f147883g.m157834m1(null);
            this.f147883g.m157833l1(this.f147880e0);
        }
        n4c n4cVar = this.f147883g;
        if (n4cVar == null || (tlwVar = this.f147885h) == null) {
            return;
        }
        n4cVar.m157837q1(str, !tlwVar.f171077U ? 0 : tlwVar.f171107q, i, i2, i3, i4, z2);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraTakePhoto(true);
        m167997H1();
        MDLog.m7395i("media", "The picture path is " + str + " the video rotation is " + this.f147885h.f171107q);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: X */
    public boolean mo163247X() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return false;
        }
        return this.f147853I.m140503d().mo106835v();
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: Y */
    public String mo163248Y() {
        return this.f147887i;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: b */
    public void mo163251b(int i) {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return;
        }
        this.f147853I.m140503d().mo106817b(i);
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: c */
    public int mo163253c() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return 0;
        }
        return this.f147853I.m140503d().mo106818c();
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: d */
    public int mo163255d() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return 0;
        }
        return this.f147853I.m140503d().mo106819d();
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: e */
    public boolean mo163257e() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return false;
        }
        return this.f147853I.m140503d().mo106822i();
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: e0 */
    public void mo163258e0(boolean z) {
        this.f147894l0 = z;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: h0 */
    public void mo163261h0() {
        if (this.f147900o0) {
            this.f147900o0 = false;
            this.f147883g.m157826d1(0);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: i0 */
    public boolean mo163262i0() {
        return this.f147900o0;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: j0 */
    public void mo163263j0(float f) {
        tlw tlwVar = this.f147885h;
        if (tlwVar != null) {
            tlwVar.f171074R = f;
            MDLog.m7395i("media", "The recoder speed is " + this.f147885h.f171074R);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: k */
    public void mo163264k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140502c(rect, autoFocusCallback);
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseFocus(true);
            MDLog.m7395i("media", "The focus rect is rect.left = " + rect.left + " rect.top = " + rect.top + " rect.right = " + rect.right + " rect.bottom = " + rect.bottom);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: l */
    public void mo163266l(nnl.InterfaceC18741f interfaceC18741f) {
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140515p(interfaceC18741f);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: l0 */
    public void mo163267l0(rmw rmwVar) {
        this.f147880e0 = rmwVar;
    }

    /* JADX INFO: renamed from: l1 */
    public void m168073l1(long j, long j2) {
        if (this.f147856L == 0) {
            this.f147856L = System.currentTimeMillis();
        }
        this.f147857M++;
        if (System.currentTimeMillis() - this.f147856L > 1000) {
            this.f147843C = this.f147857M;
            this.f147857M = 0;
            this.f147856L = System.currentTimeMillis();
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: m0 */
    public void mo163268m0(bmw bmwVar) {
        this.f147872a0 = bmwVar;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: q0 */
    public void mo163272q0(String str) {
        this.f147887i = str;
    }

    @Override // p149l.oa4
    public synchronized void release() {
        m168070N1();
        n4c n4cVar = this.f147883g;
        if (n4cVar != null) {
            n4cVar.mo98673G();
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: s0 */
    public boolean mo163274s0() {
        return false;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: v0 */
    public synchronized void mo163277v0(us2 us2Var) {
        this.f147861Q = us2Var;
        n4c n4cVar = this.f147883g;
        if (n4cVar != null) {
            n4cVar.m98685S(us2Var);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: w0 */
    public void mo163278w0(Context context) {
        j94 j94Var = this.f147853I;
        if (j94Var != null) {
            j94Var.m140510k(context);
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: x */
    public tif0 mo163279x(int i, int i2) {
        if (this.f147853I.m140503d() == null) {
            this.f147853I.m140504e(this.f147885h);
        }
        tif0 tif0Var = new tif0(i, i2);
        int iMo106826m = this.f147853I.m140503d().mo106826m();
        tlw tlwVar = this.f147885h;
        tif0 tif0VarM101045f = bc4.m101045f(tif0Var, iMo106826m, new tif0(tlwVar.f171105o, tlwVar.f171106p), false);
        this.f147885h.f171103m = tif0VarM101045f.m189184b();
        this.f147885h.f171104n = tif0VarM101045f.m189183a();
        m167984A1();
        m168069J1(new tif0(i, i2));
        return tif0VarM101045f;
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: y */
    public boolean mo163280y() {
        j94 j94Var = this.f147853I;
        if (j94Var == null || j94Var.m140503d() == null) {
            return false;
        }
        return this.f147853I.m140503d().mo106838y();
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: z */
    public void mo163281z(cmw cmwVar) {
        this.f147913v = cmwVar;
    }

    /* JADX INFO: renamed from: l.pa4$o */
    public class C19174o implements snr {
        public C19174o() {
        }

        @Override // p149l.snr
        /* JADX INFO: renamed from: a */
        public void mo123489a(Message message) {
            if (message.what != 22) {
                return;
            }
            pa4.this.m168061w1(message);
        }

        @Override // p149l.snr
        public void onPause() {
        }

        @Override // p149l.snr
        public void onResume() {
        }
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: a0 */
    public void mo163250a0() {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: B */
    public void mo163225B(swf0.InterfaceC20050a interfaceC20050a) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: G */
    public void mo163230G(imw imwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: H */
    public void mo163231H(sam0 sam0Var) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: I */
    public void mo163232I(omw omwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: J */
    public void mo163233J(int i) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: L */
    public void mo163235L(ea1 ea1Var) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: O */
    public void mo163238O(sl10.InterfaceC19979e interfaceC19979e) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: Q */
    public void mo163240Q(nmw nmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: T */
    public void mo163243T(hmw hmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: V */
    public void mo163245V(ntb ntbVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: W */
    public void mo163246W(xlw xlwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: Z */
    public void mo163249Z(gmw gmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: b0 */
    public void mo163252b0(boolean z) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: c0 */
    public void mo163254c0(boolean z) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: d0 */
    public void mo163256d0(boolean z) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: f0 */
    public void mo163259f0(emw emwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: g0 */
    public void mo163260g0(HashMap<String, Object> map) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: k0 */
    public void mo163265k0(boolean z) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: n0 */
    public void mo163269n0(pmw pmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: o0 */
    public void mo163270o0(dmw dmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: p0 */
    public void mo163271p0(String str) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: r0 */
    public void mo163273r0(String str) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: t0 */
    public void mo163275t0(gmw gmwVar) {
    }

    @Override // p149l.oa4
    /* JADX INFO: renamed from: u0 */
    public void mo163276u0(zlw zlwVar) {
    }
}
