package p153l;

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
import com.immomo.moment.mediautils.C3998l;
import com.immomo.moment.model.VideoFragment;
import com.immomo.moment.util.datadot.RecorderDataDotUtils;
import com.momo.mcamera.util.MDLogTag;
import com.momo.xengine.mestatistics.ReportType;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes7.dex */
public class ob4 implements nb4 {

    /* JADX INFO: renamed from: F */
    private byte[] f145837F;

    /* JADX INFO: renamed from: I */
    private ia4 f145841I;

    /* JADX INFO: renamed from: d0 */
    private qow f145866d0;

    /* JADX INFO: renamed from: f */
    private EGLContext f145869f;

    /* JADX INFO: renamed from: g */
    private v5c f145871g;

    /* JADX INFO: renamed from: h */
    private sow f145873h;

    /* JADX INFO: renamed from: i */
    private String f145875i;

    /* JADX INFO: renamed from: i0 */
    private cvf f145876i0;

    /* JADX INFO: renamed from: j */
    private String f145877j;

    /* JADX INFO: renamed from: o */
    private SurfaceTexture f145887o;

    /* JADX INFO: renamed from: p0 */
    private long f145890p0;

    /* JADX INFO: renamed from: q0 */
    private long f145892q0;

    /* JADX INFO: renamed from: r0 */
    private long f145894r0;

    /* JADX INFO: renamed from: s0 */
    private long f145896s0;

    /* JADX INFO: renamed from: t0 */
    private long f145898t0;

    /* JADX INFO: renamed from: u0 */
    private long f145900u0;

    /* JADX INFO: renamed from: v0 */
    private long f145902v0;

    /* JADX INFO: renamed from: w0 */
    private int f145904w0;

    /* JADX INFO: renamed from: x */
    protected ed1 f145905x;

    /* JADX INFO: renamed from: x0 */
    private long f145906x0;

    /* JADX INFO: renamed from: y0 */
    private long f145908y0;

    /* JADX INFO: renamed from: z0 */
    private long f145910z0;

    /* JADX INFO: renamed from: a */
    final int f145859a = 302;

    /* JADX INFO: renamed from: b */
    final int f145861b = 303;

    /* JADX INFO: renamed from: c */
    final int f145863c = HttpStatus.USE_PROXY_305;

    /* JADX INFO: renamed from: d */
    private final int f145865d = 1;

    /* JADX INFO: renamed from: e */
    private final int f145867e = 2;

    /* JADX INFO: renamed from: k */
    private float f145879k = 1.0f;

    /* JADX INFO: renamed from: l */
    private long f145881l = 0;

    /* JADX INFO: renamed from: m */
    private volatile boolean f145883m = false;

    /* JADX INFO: renamed from: n */
    private boolean f145885n = false;

    /* JADX INFO: renamed from: p */
    private uje f145889p = null;

    /* JADX INFO: renamed from: q */
    private Looper f145891q = null;

    /* JADX INFO: renamed from: r */
    private int f145893r = 0;

    /* JADX INFO: renamed from: s */
    protected C3998l f145895s = null;

    /* JADX INFO: renamed from: t */
    protected C3998l f145897t = null;

    /* JADX INFO: renamed from: u */
    protected pc1 f145899u = null;

    /* JADX INFO: renamed from: v */
    bpw f145901v = null;

    /* JADX INFO: renamed from: w */
    private boolean f145903w = false;

    /* JADX INFO: renamed from: y */
    protected epw f145907y = null;

    /* JADX INFO: renamed from: z */
    private xow f145909z = null;

    /* JADX INFO: renamed from: A */
    protected Surface f145827A = null;

    /* JADX INFO: renamed from: B */
    protected Surface f145829B = null;

    /* JADX INFO: renamed from: C */
    protected int f145831C = 20;

    /* JADX INFO: renamed from: D */
    protected int f145833D = 20;

    /* JADX INFO: renamed from: E */
    private boolean f145835E = false;

    /* JADX INFO: renamed from: G */
    private boolean f145839G = false;

    /* JADX INFO: renamed from: H */
    final Object f145840H = new Object();

    /* JADX INFO: renamed from: J */
    private boolean f145842J = false;

    /* JADX INFO: renamed from: K */
    private long f145843K = 0;

    /* JADX INFO: renamed from: L */
    protected long f145844L = 0;

    /* JADX INFO: renamed from: M */
    protected int f145845M = 0;

    /* JADX INFO: renamed from: N */
    private long f145846N = 0;

    /* JADX INFO: renamed from: O */
    private long f145847O = 0;

    /* JADX INFO: renamed from: P */
    protected Boolean f145848P = Boolean.FALSE;

    /* JADX INFO: renamed from: Q */
    private kt2 f145849Q = null;

    /* JADX INFO: renamed from: R */
    private Object f145850R = null;

    /* JADX INFO: renamed from: S */
    private int f145851S = 0;

    /* JADX INFO: renamed from: T */
    private int f145852T = 0;

    /* JADX INFO: renamed from: U */
    private int f145853U = 0;

    /* JADX INFO: renamed from: V */
    private boolean f145854V = false;

    /* JADX INFO: renamed from: W */
    private int f145855W = 0;

    /* JADX INFO: renamed from: X */
    private int f145856X = 0;

    /* JADX INFO: renamed from: Y */
    private long f145857Y = 0;

    /* JADX INFO: renamed from: Z */
    private boolean f145858Z = false;

    /* JADX INFO: renamed from: a0 */
    private apw f145860a0 = null;

    /* JADX INFO: renamed from: b0 */
    private int f145862b0 = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: c0 */
    private int f145864c0 = 0;

    /* JADX INFO: renamed from: e0 */
    private qpw f145868e0 = null;

    /* JADX INFO: renamed from: f0 */
    c3i0 f145870f0 = new c3i0();

    /* JADX INFO: renamed from: g0 */
    private int f145872g0 = 352;

    /* JADX INFO: renamed from: h0 */
    private int f145874h0 = 640;

    /* JADX INFO: renamed from: j0 */
    protected LinkedList<IProcessOutput> f145878j0 = new LinkedList<>();

    /* JADX INFO: renamed from: k0 */
    private boolean f145880k0 = false;

    /* JADX INFO: renamed from: l0 */
    private volatile boolean f145882l0 = true;

    /* JADX INFO: renamed from: m0 */
    private int f145884m0 = 0;

    /* JADX INFO: renamed from: n0 */
    private int f145886n0 = 0;

    /* JADX INFO: renamed from: o0 */
    private volatile boolean f145888o0 = false;

    /* JADX INFO: renamed from: A0 */
    private ppw f145828A0 = new C19081j();

    /* JADX INFO: renamed from: B0 */
    private tpr f145830B0 = new C19086o();

    /* JADX INFO: renamed from: C0 */
    upr f145832C0 = new C19072a();

    /* JADX INFO: renamed from: D0 */
    rpr f145834D0 = new C19073b();

    /* JADX INFO: renamed from: E0 */
    spr f145836E0 = new C19074c();

    /* JADX INFO: renamed from: F0 */
    ppr f145838F0 = new C19075d();

    /* JADX INFO: renamed from: l.ob4$a */
    public class C19072a implements upr {
        public C19072a() {
        }

        @Override // p153l.upr
        /* JADX INFO: renamed from: a */
        public boolean mo167010a() {
            return ob4.this.m166926D1();
        }
    }

    /* JADX INFO: renamed from: l.ob4$b */
    public class C19073b implements rpr {
        public C19073b() {
        }

        @Override // p153l.rpr
        /* JADX INFO: renamed from: a */
        public void mo161503a() {
            ob4.this.m166979n1();
            ob4.this.f145847O = System.currentTimeMillis() - ob4.this.f145846N;
        }

        @Override // p153l.rpr
        /* JADX INFO: renamed from: b */
        public Object mo161504b() {
            IProcessOutput iProcessOutputPollFirst;
            ob4.this.f145846N = System.currentTimeMillis();
            synchronized (ob4.this.f145840H) {
                try {
                    iProcessOutputPollFirst = ob4.this.f145878j0.size() > 0 ? ob4.this.f145878j0.pollFirst() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ob4 ob4Var = ob4.this;
            if (iProcessOutputPollFirst == null) {
                ob4Var.f145890p0 = 0L;
                ob4.this.f145892q0 = 0L;
                return iProcessOutputPollFirst;
            }
            ob4Var.f145890p0 = iProcessOutputPollFirst.m19369c();
            ob4 ob4Var2 = ob4.this;
            ob4Var2.f145892q0 = ob4Var2.f145846N - ob4.this.f145890p0;
            return iProcessOutputPollFirst;
        }
    }

    /* JADX INFO: renamed from: l.ob4$c */
    public class C19074c implements spr {
        public C19074c() {
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: a */
        public void mo167011a() {
            ob4.this.m166989s1();
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: b */
        public void mo167012b() {
            ob4.this.m166983p1();
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: c */
        public void mo167013c() {
            ob4.this.m166975k1(System.currentTimeMillis() - ob4.this.f145894r0);
            ob4.this.m166991t1();
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: d */
        public void mo167014d() {
            ob4.this.m166993u1();
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: e */
        public void mo167015e(String str, int i, String str2) {
            ob4.this.m166981o1(HttpStatus.USE_PROXY_305, 0);
        }

        @Override // p153l.spr
        /* JADX INFO: renamed from: f */
        public void mo167016f(Object obj) {
            ob4.this.m166987r1(obj);
            ob4.this.f145894r0 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l.ob4$d */
    public class C19075d implements ppr {

        /* JADX INFO: renamed from: l.ob4$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Message f145915a;

            public a(Message message) {
                this.f145915a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                Object[] objArr = (Object[]) this.f145915a.obj;
                if (objArr == null || (obj = objArr[0]) == null) {
                    return;
                }
                ob4.this.m166995v1((crf0) obj, (xow) objArr[1]);
            }
        }

        public C19075d() {
        }

        @Override // p153l.ppr
        /* JADX INFO: renamed from: a */
        public void mo167017a(Message message) {
            int i = message.what;
            if (i == 1) {
                w310.m204675b(new a(message));
            } else {
                if (i != 2) {
                    return;
                }
                ob4.this.m166985q1(message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.ob4$e */
    public class RunnableC19076e implements Runnable {
        public RunnableC19076e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ob4.this.m166948Q1();
        }
    }

    /* JADX INFO: renamed from: l.ob4$f */
    public class C19077f implements spw {
        public C19077f() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (ob4.this.f145860a0 != null) {
                ob4.this.f145860a0.onError(ob4.this.f145862b0 + i, str);
            }
            MDLog.m7445e("media", "[" + (ob4.this.f145862b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$g */
    public class RunnableC19078g implements Runnable {
        public RunnableC19078g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ob4.this.m166970h1();
        }
    }

    /* JADX INFO: renamed from: l.ob4$h */
    public class C19079h implements spw {
        public C19079h() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (ob4.this.f145860a0 != null) {
                ob4.this.f145860a0.onError(ob4.this.f145862b0 + i, str);
            }
            MDLog.m7445e("media", "[" + (ob4.this.f145862b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$i */
    public class C19080i implements spw {
        public C19080i() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (ob4.this.f145860a0 != null) {
                ob4.this.f145860a0.onError(ob4.this.f145862b0 + i, str);
            }
            MDLog.m7445e("media", "[" + (ob4.this.f145862b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$j */
    public class C19081j implements ppw {
        public C19081j() {
        }

        @Override // p153l.ppw
        /* JADX INFO: renamed from: a */
        public void mo167018a(Bitmap bitmap, Exception exc) {
            if (exc != null && ob4.this.f145868e0 != null) {
                ob4.this.f145868e0.mo118030a(-1, exc);
            }
            ob4.this.f145870f0.m107798e(bitmap);
            ob4.this.m166922B1();
        }
    }

    /* JADX INFO: renamed from: l.ob4$k */
    public class C19082k implements pc1.InterfaceC19341b {
        public C19082k() {
        }

        @Override // p153l.pc1.InterfaceC19341b
        /* JADX INFO: renamed from: a */
        public void mo167019a(ad60 ad60Var) {
            C3998l c3998l;
            C3998l c3998l2;
            ob4.m166944O0(ob4.this);
            ob4 ob4Var = ob4.this;
            if (ob4Var.f145895s == null && ob4Var.f145897t == null) {
                return;
            }
            ed1 ed1Var = ob4Var.f145905x;
            if (ed1Var != null) {
                ad60Var = ed1Var.m120417e(ad60Var, ob4Var.f145879k);
            }
            if (ad60Var != null && ob4.this.f145854V) {
                ad60Var.m97019e(ByteBuffer.allocate(ad60Var.m97016b().size));
            }
            if (ad60Var != null && (c3998l2 = ob4.this.f145895s) != null) {
                c3998l2.m19886E(ad60Var);
            }
            if (ad60Var == null || (c3998l = ob4.this.f145897t) == null) {
                return;
            }
            c3998l.m19886E(ad60Var);
        }
    }

    /* JADX INFO: renamed from: l.ob4$l */
    public class RunnableC19083l implements Runnable {
        public RunnableC19083l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            crf0 textureSize;
            if (ob4.this.f145841I != null) {
                ob4.m166949R0(ob4.this);
                ob4.this.f145841I.m139166h(0, ob4.this.f145866d0);
                ob4.this.f145871g.m199814O0(false);
                ob4.this.f145871g.m199821c1();
                boolean zM139175q = ob4.this.f145841I.m139175q(null);
                ypl yplVarM139162d = ob4.this.f145841I.m139162d();
                if (!zM139175q || yplVarM139162d == null || (textureSize = yplVarM139162d.getTextureSize()) == null) {
                    return;
                }
                ob4.this.f145871g.m177858R(new crf0(textureSize.m112049a(), textureSize.m112050b()));
            }
        }
    }

    /* JADX INFO: renamed from: l.ob4$m */
    public class RunnableC19084m implements Runnable {
        public RunnableC19084m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ob4.this.f145841I == null || ob4.this.f145873h == null) {
                return;
            }
            ob4.this.f145841I.m139163e(ob4.this.f145873h);
            ob4.this.f145841I.m139166h(ob4.this.f145864c0, ob4.this.f145866d0);
            ob4.this.f145871g.m177858R(new crf0(ob4.this.f145873h.m187283d(), ob4.this.f145873h.m187282c()));
            ob4.this.f145871g.m177845C(ob4.this.m166977m1());
            ypl yplVarM139162d = ob4.this.f145841I.m139162d();
            if (yplVarM139162d != null) {
                ob4.this.f145871g.mo96768x0(yplVarM139162d.mo98197m());
                ob4.this.f145871g.m150364J0(yplVarM139162d.mo98193i());
            }
            ob4.this.f145871g.m199814O0(ob4.this.f145873h.f169966g0);
            ob4.this.f145841I.m139175q(ob4.this.f145887o);
        }
    }

    /* JADX INFO: renamed from: l.ob4$n */
    public class C19085n implements zow {
        public C19085n() {
        }

        @Override // p153l.zow
        /* JADX INFO: renamed from: a */
        public boolean mo167020a(int i) {
            if (!ob4.this.f145888o0) {
                return true;
            }
            if (ob4.this.f145841I != null) {
                return ob4.this.f145841I.m139178t(i);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ob4$p */
    public class C19087p implements spw {
        public C19087p() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (ob4.this.f145860a0 != null) {
                ob4.this.f145860a0.onError(ob4.this.f145862b0 + i, str);
            }
            MDLog.m7445e("media", "[" + (ob4.this.f145862b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$q */
    public class C19088q implements spw {
        public C19088q() {
        }

        @Override // p153l.spw
        public void onFail(int i, String str) {
            if (ob4.this.f145860a0 != null) {
                ob4.this.f145860a0.onError(ob4.this.f145862b0 + i, str);
            }
            MDLog.m7445e("media", "[" + (ob4.this.f145862b0 + i) + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$r */
    public class C19089r implements diw.InterfaceC16546h {
        public C19089r() {
        }

        @Override // p153l.diw.InterfaceC16546h
        /* JADX INFO: renamed from: a */
        public void mo116004a(int i, String str) {
            ob4.this.m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, i);
            MDLog.m7445e("media", "[" + i + Constants.AES_SUFFIX + str);
        }
    }

    /* JADX INFO: renamed from: l.ob4$s */
    public class C19090s implements Camera.ErrorCallback {
        public C19090s() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            ob4.this.m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, i);
            ob4.this.f145903w = true;
            MDLog.m7445e("media", "The camera process failed !!! ");
        }
    }

    /* JADX INFO: renamed from: l.ob4$t */
    public class C19091t implements ia4.InterfaceC17676b {
        public C19091t() {
        }

        @Override // p153l.ia4.InterfaceC17676b
        /* JADX INFO: renamed from: D */
        public void mo139179D(byte[] bArr) {
            if (ob4.this.f145903w || bArr == null || ob4.this.f145871g == null || !ob4.this.f145871g.m199819a1()) {
                return;
            }
            ob4.m166971i(ob4.this);
            if (System.currentTimeMillis() - ob4.this.f145857Y > 1000) {
                ob4 ob4Var = ob4.this;
                ob4Var.f145833D = ob4Var.f145856X;
                ob4.this.f145856X = 0;
                ob4.this.f145857Y = System.currentTimeMillis();
            }
            boolean z = ob4.this.f145873h.f169946T;
            ob4 ob4Var2 = ob4.this;
            if (z) {
                byte[] bArrM167004E1 = ob4Var2.m167004E1(bArr);
                synchronized (ob4.this.f145840H) {
                    ob4.this.m166951S1(bArrM167004E1, ob4.this.m166924C1(bArrM167004E1));
                }
                return;
            }
            byte[] bArrM167004E2 = ob4Var2.m167004E1(bArr);
            synchronized (ob4.this.f145840H) {
                try {
                    IProcessOutput iProcessOutputM166924C1 = ob4.this.m166924C1(bArrM167004E2);
                    if (ob4.this.f145839G) {
                        ob4.this.m166963d1(iProcessOutputM166924C1);
                    }
                    ob4.this.m166951S1(bArrM167004E2, iProcessOutputM166924C1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.ia4.InterfaceC17676b
        /* JADX INFO: renamed from: E */
        public void mo139180E(byte[] bArr) throws Throwable {
            try {
                ob4.this.f145870f0.m107800g(bArr);
                ob4.this.m166922B1();
            } catch (Exception e) {
                MDLog.printErrStackTrace("media", e);
            }
        }
    }

    public ob4(sow sowVar, EGLContext eGLContext) {
        if (sowVar != null) {
            this.f145869f = eGLContext;
            m166999x1(sowVar);
            this.f145871g.mo121188P();
        }
    }

    /* JADX INFO: renamed from: A1 */
    private void m166920A1() {
        sow sowVar = this.f145873h;
        if (sowVar.f169966g0) {
            omq0.C19167a c19167aM168280a = omq0.m168280a(this.f145884m0, this.f145886n0, sowVar.f169976p, sowVar.f169975o);
            sow sowVar2 = this.f145873h;
            sowVar2.f169959d = c19167aM168280a.f147988a;
            sowVar2.f169961e = c19167aM168280a.f147989b;
            sowVar2.f169963f = c19167aM168280a.f147990c;
            sowVar2.f169965g = c19167aM168280a.f147991d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public void m166922B1() {
        Message message = new Message();
        message.what = 2;
        this.f145871g.m199823e1(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public IProcessOutput m166924C1(byte[] bArr) {
        byx.m107100a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public boolean m166926D1() {
        if (this.f145895s != null) {
            long j = this.f145843K + 1;
            this.f145843K = j;
            if (this.f145885n) {
                float f = this.f145879k;
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
    private void m166929F1() {
        ypl yplVarM139162d;
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || (yplVarM139162d = ia4Var.m139162d()) == null) {
            return;
        }
        crf0 crf0VarMo98208x = yplVarM139162d.mo98208x();
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSourceFps(yplVarM139162d.mo98198n());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSizeWidth(crf0VarMo98208x.m112050b());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraSizeHeight(crf0VarMo98208x.m112049a());
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPreviewVideoWidth(this.f145873h.f169955b);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPreviewVideoHeight(this.f145873h.f169957c);
    }

    /* JADX INFO: renamed from: G1 */
    private void m166931G1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
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
    private void m166933H1() {
        int i = this.f145855W;
        if (i == 1) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(1);
        } else if (i == 16) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(2);
        } else if (i == 17) {
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraPositionState(3);
        }
    }

    /* JADX INFO: renamed from: I1 */
    private void m166935I1() {
        int iM177362n = this.f145866d0.m177362n();
        if (iM177362n == 0) {
            int i = this.f145873h.f169967h;
            this.f145872g0 = i;
            this.f145874h0 = i;
        } else {
            if (iM177362n != 1) {
                if (iM177362n == 2) {
                    sow sowVar = this.f145873h;
                    this.f145872g0 = sowVar.f169967h;
                    this.f145874h0 = sowVar.f169969i;
                    return;
                }
                return;
            }
            int i2 = this.f145873h.f169967h;
            int i3 = (i2 * 4) / 3;
            if (i3 % 4 != 0) {
                i3 = (i3 >> 4) << 4;
            }
            this.f145872g0 = i2;
            this.f145874h0 = i3;
        }
    }

    /* JADX INFO: renamed from: K1 */
    private void m166938K1() {
        w310.m204675b(new RunnableC19083l());
    }

    /* JADX INFO: renamed from: L1 */
    private void m166940L1() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139167i();
        }
        w310.m204675b(new RunnableC19084m());
    }

    /* JADX INFO: renamed from: M1 */
    private void m166942M1(int i, int i2, int i3, int i4) {
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        long j = i;
        ReportType reportType = ReportType.COUNT;
        recorderDataDotUtils.realTimeReport("sdk-camera-engine-encode-width", j, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-height", i2, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-fps", i3, reportType);
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-encode-bitrate", i4, reportType);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ la1 m166944O0(ob4 ob4Var) {
        ob4Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    private VideoFragment m166946P1(boolean z) {
        MDLog.m7443d("media", " Calling stoprecording withsync value=[" + z + Constants.AES_SUFFIX);
        if (!this.f145885n) {
            return null;
        }
        synchronized (this.f145840H) {
            try {
                v5c v5cVar = this.f145871g;
                if (v5cVar != null) {
                    v5cVar.m199824f1(this.f145827A);
                    Surface surface = this.f145829B;
                    if (surface != null) {
                        this.f145871g.m199825g1(surface);
                    }
                    if (z) {
                        m166993u1();
                    } else {
                        this.f145871g.m177856O();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m166933H1();
        MDLog.m7443d("media", "Stop recording , path is " + this.f145875i);
        VideoFragment videoFragment = new VideoFragment();
        videoFragment.setVideoPath(this.f145875i);
        videoFragment.setSpeed(this.f145879k);
        videoFragment.setDuration(SystemClock.uptimeMillis() - this.f145881l);
        return videoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public synchronized void m166948Q1() {
        try {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "Release SurfaceTexture in host looper !");
            SurfaceTexture surfaceTexture = this.f145887o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable th) {
            MDLog.m7446e(MDLogTag.MOMENT_RENDER_TAG, "SurfaceTexture release error !", th);
        }
        this.f145887o = null;
        if (this.f145889p != null) {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "Release EglWrapper in host looper !");
            this.f145889p.m196328g();
            this.f145889p = null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ p3m m166949R0(ob4 ob4Var) {
        ob4Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public void m166951S1(byte[] bArr, IProcessOutput iProcessOutput) {
        ia4 ia4Var;
        if (bArr == null || bArr.length < ((this.f145893r * 3) >> 1) || this.f145871g == null) {
            return;
        }
        synchronized (this.f145840H) {
            try {
                if (this.f145848P.booleanValue() && (ia4Var = this.f145841I) != null && ia4Var.m139162d() != null) {
                    this.f145871g.mo96768x0(this.f145841I.m139162d().mo98197m());
                    this.f145871g.m150364J0(this.f145841I.m139162d().mo98193i());
                    this.f145848P = Boolean.FALSE;
                }
                this.f145878j0.addLast(iProcessOutput);
                this.f145871g.m199834r1(bArr, this.f145893r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public void m166963d1(IProcessOutput iProcessOutput) {
        cvf cvfVar;
        if (iProcessOutput == null || (cvfVar = this.f145876i0) == null) {
            return;
        }
        cvfVar.m112806a(iProcessOutput);
    }

    /* JADX INFO: renamed from: e1 */
    private void m166964e1() {
        if (this.f145895s != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f145895s.mo19734n();
            MDLog.m7449i("CameraPreviewManager", "stopEncoding cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f145895s = null;
        }
        if (this.f145897t != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f145897t.mo19734n();
            MDLog.m7449i("CameraPreviewManager", "stopEncoding origin cost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
            this.f145897t = null;
        }
        Surface surface = this.f145827A;
        if (surface != null) {
            surface.release();
            this.f145827A = null;
        }
        Surface surface2 = this.f145829B;
        if (surface2 != null) {
            surface2.release();
            this.f145829B = null;
        }
        this.f145885n = false;
        this.f145854V = false;
        MDLog.m7443d("media", "Handle stop recording finished !");
    }

    /* JADX INFO: renamed from: f1 */
    private void m166966f1() {
        ob4 ob4Var;
        int i = this.f145872g0;
        int i2 = this.f145874h0;
        sow sowVar = this.f145873h;
        int i3 = sowVar.f169979s;
        int i4 = sowVar.f169981u;
        int i5 = sowVar.f169980t;
        int i6 = sowVar.f169977q;
        float f = sowVar.f169944R;
        int i7 = sowVar.f169929C;
        int i8 = sowVar.f169931E;
        int i9 = sowVar.f169932F;
        int i10 = sowVar.f169930D;
        int i11 = sowVar.f169936J;
        boolean z = sowVar.f169947U;
        if (i11 != 0) {
            i3 = this.f145831C;
            if (i3 < 10) {
                i3 = 10;
            }
        } else if (i3 == 0) {
            i3 = 30;
        }
        m166942M1(i, i2, i3, i4);
        MDLog.m7449i("media", "create media encoder videoWidth = " + i + " videoHeight = " + i2 + " videoFps = " + i3 + " videoBitrate = " + i4 + " videoGopSize = " + i5 + " videoRotation = " + i6 + " recordSpeed " + f + " audioSampleRate = " + i7 + " audioBits = 16 audioChannels = " + i8 + " audioBitrate = " + i9 + " audioBufferSize = " + i10 + " encoderGopMode = " + i11);
        C3998l c3998l = new C3998l();
        this.f145895s = c3998l;
        c3998l.m19891N(this.f145875i);
        this.f145895s.m19893P(f);
        C3998l c3998l2 = this.f145895s;
        if (c3998l2 != null) {
            c3998l2.m19890M(new C19079h());
        }
        if (this.f145877j != null) {
            C3998l c3998l3 = new C3998l();
            this.f145897t = c3998l3;
            c3998l3.m19891N(this.f145877j);
            this.f145897t.m19893P(f);
            C3998l c3998l4 = this.f145897t;
            if (c3998l4 != null) {
                c3998l4.m19890M(new C19080i());
            }
        }
        this.f145879k = f;
        ed1 ed1Var = new ed1();
        this.f145905x = ed1Var;
        ed1Var.mo103474d(i7, 16, i8);
        this.f145905x.mo103471a();
        this.f145895s.m19896S(i, i2, i3, i4, i5, i6, C3998l.f14171U, z);
        int i12 = i3;
        if (!this.f145866d0.m177357i()) {
            this.f145895s.m19888K(i7, 16, i8, i9, i10);
        }
        m166931G1(i, i2, i12, i4, i5, i6, i7, 16, i8, i9, i10);
        if (!this.f145895s.mo19733m()) {
            MDLog.m7445e("media", "Start encoding error !");
            this.f145895s.mo19734n();
            this.f145895s = null;
            return;
        }
        C3998l c3998l5 = this.f145897t;
        Surface surface = null;
        if (c3998l5 != null) {
            c3998l5.m19896S(i, i2, i12, i4, i5, i6, C3998l.f14171U, z);
            if (this.f145866d0.m177357i()) {
                ob4Var = this;
            } else {
                ob4Var = this;
                ob4Var.f145897t.m19888K(i7, 16, i8, i9, i10);
            }
            if (ob4Var.f145897t.mo19733m()) {
                surface = null;
            } else {
                MDLog.m7445e("media", "Start origin encoding error !");
                ob4Var.f145897t.mo19734n();
                surface = null;
                ob4Var.f145897t = null;
            }
        } else {
            ob4Var = this;
        }
        ob4Var.f145827A = ob4Var.f145895s.m19887H();
        C3998l c3998l6 = ob4Var.f145897t;
        ob4Var.f145829B = c3998l6 != null ? c3998l6.m19887H() : surface;
        pc1 pc1Var = ob4Var.f145899u;
        if (pc1Var != null) {
            pc1Var.m171616k(ob4Var.new C19082k());
        }
        ob4Var.f145885n = true;
        ob4Var.f145881l = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: g1 */
    private synchronized void m166968g1() {
        try {
            m166948Q1();
            if (this.f145889p == null) {
                uje ujeVar = new uje();
                this.f145889p = ujeVar;
                ujeVar.m196323a();
            }
            if (this.f145887o == null) {
                this.f145889p.m196327f();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                int i = iArr[0];
                GLES20.glBindTexture(36197, i);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                this.f145887o = new SurfaceTexture(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m166970h1() {
        MDLog.m7443d("media", "Begining to  create media encoder !");
        if (this.f145885n) {
            return;
        }
        MDLog.m7443d("media", "Begining to  create media encoder !");
        m166935I1();
        if (this.f145899u == null && !this.f145866d0.m177357i()) {
            m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_ILLEGAL_STATE, 0);
            apw apwVar = this.f145860a0;
            if (apwVar != null) {
                apwVar.onError(this.f145862b0 + 1017, "AudioRecord is null !!!");
            }
            MDLog.m7445e("media", "[" + (this.f145862b0 + 1018) + "]AudioRecord is null !!!");
            return;
        }
        try {
            m166966f1();
            if (this.f145827A != null) {
                boolean zM177360l = this.f145866d0.m177360l();
                v5c v5cVar = this.f145871g;
                if (zM177360l) {
                    v5cVar.m199820b1(this.f145827A);
                    this.f145871g.m121223y0(this.f145827A, new crf0(this.f145872g0, this.f145874h0));
                } else {
                    v5cVar.m199811L0(this.f145827A, this.f145872g0, this.f145874h0);
                }
            }
            Surface surface = this.f145829B;
            if (surface != null) {
                this.f145871g.m199812M0(surface, this.f145872g0, this.f145874h0);
            }
            MDLog.m7443d("media", "Create media encoder is done !");
        } catch (Exception e) {
            m166981o1(3, 0);
            if (this.f145860a0 != null) {
                this.f145860a0.onError(this.f145862b0 + 1017, "create encoder failed !!!");
            }
            MDLog.m7445e("media", "[" + (this.f145862b0 + 1017) + "]create encoder failed !!!" + e.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m166971i(ob4 ob4Var) {
        int i = ob4Var.f145856X;
        ob4Var.f145856X = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i1 */
    private void m166972i1() {
        if (this.f145891q != null) {
            new Handler(this.f145891q).post(new RunnableC19076e());
        }
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m166974j1(int i, qow qowVar) {
        ypl yplVarM139162d;
        try {
            MDLog.m7449i("media", "The cameraPreviewManager switchCamera !!!");
            ia4 ia4Var = this.f145841I;
            if (ia4Var != null) {
                ia4Var.m139177s(i, qowVar);
            }
            m167008R1();
            v5c v5cVar = this.f145871g;
            Object obj = this.f145850R;
            sow sowVar = this.f145873h;
            v5cVar.m121223y0(obj, new crf0(sowVar.f169975o, sowVar.f169976p));
            this.f145871g.m177858R(new crf0(this.f145873h.m187283d(), this.f145873h.m187282c()));
            this.f145871g.m177845C(m166977m1());
            ia4 ia4Var2 = this.f145841I;
            if (ia4Var2 != null && (yplVarM139162d = ia4Var2.m139162d()) != null) {
                this.f145871g.mo96768x0(yplVarM139162d.mo98197m());
                this.f145871g.m150364J0(yplVarM139162d.mo98193i());
            }
            this.f145893r = this.f145873h.m187281b();
            if (!this.f145841I.m139175q(this.f145887o)) {
                m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
                MDLog.m7445e("media", "The startPreview failed when switchCamera !!!");
                return false;
            }
            cvf cvfVar = this.f145876i0;
            if (cvfVar != null) {
                cvfVar.m112808c(false);
            }
            cvf cvfVar2 = this.f145876i0;
            if (cvfVar2 != null) {
                cvfVar2.m112807b(mo162143e());
            }
            this.f145848P = Boolean.TRUE;
            return true;
        } catch (Exception e) {
            MDLog.m7445e("media", "switchCamera is failed because of " + e.toString());
            m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public void m166975k1(long j) {
        if (j <= 0 || this.f145902v0 <= 0 || this.f145900u0 <= 0 || this.f145906x0 <= 0) {
            return;
        }
        RecorderDataDotUtils recorderDataDotUtils = RecorderDataDotUtils.getInstance();
        ReportType reportType = ReportType.DURATION;
        recorderDataDotUtils.report("sdk-camera-usage_duration", j, reportType);
        recorderDataDotUtils.report("sdk-camera-drop_frame", this.f145898t0, ReportType.COUNT);
        int i = this.f145904w0;
        if (i == 720) {
            recorderDataDotUtils.report("sdk-camera-720p_cv_avg", this.f145900u0 / this.f145902v0, reportType);
        } else if (i == 1080) {
            recorderDataDotUtils.report("sdk-camera-1080p_cv_avg", this.f145900u0 / this.f145902v0, reportType);
        }
        recorderDataDotUtils.report("sdk-camera-start_time", this.f145906x0, reportType);
        long j2 = this.f145908y0;
        if (j2 > 0) {
            long j3 = this.f145910z0;
            if (j3 - 4 > 0) {
                recorderDataDotUtils.report("sdk-camera-render_avg", j2 / (j3 - 4), reportType);
            }
        }
        recorderDataDotUtils.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public omq0.C19167a m166977m1() {
        if (!this.f145873h.f169966g0) {
            omq0.C19167a c19167a = new omq0.C19167a();
            sow sowVar = this.f145873h;
            c19167a.f147992e = sowVar.f169955b;
            c19167a.f147993f = sowVar.f169957c;
            return c19167a;
        }
        omq0.C19167a c19167a2 = new omq0.C19167a();
        sow sowVar2 = this.f145873h;
        c19167a2.f147988a = sowVar2.f169959d;
        c19167a2.f147989b = sowVar2.f169961e;
        c19167a2.f147990c = sowVar2.f169963f;
        c19167a2.f147991d = sowVar2.f169965g;
        c19167a2.f147992e = sowVar2.f169955b;
        c19167a2.f147993f = sowVar2.f169957c;
        return c19167a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public void m166979n1() {
        long j = this.f145847O;
        m167009l1(j, j);
        long jCurrentTimeMillis = this.f145890p0 != 0 ? System.currentTimeMillis() - this.f145890p0 : 0L;
        if (jCurrentTimeMillis > 200) {
            this.f145898t0++;
        }
        long j2 = this.f145910z0;
        if (j2 > 3) {
            this.f145908y0 += jCurrentTimeMillis;
        }
        this.f145910z0 = j2 + 1;
        if (this.f145871g != null) {
            if (!this.f145842J) {
                this.f145842J = true;
                this.f145906x0 = System.currentTimeMillis() - this.f145896s0;
                epw epwVar = this.f145907y;
                if (epwVar != null) {
                    epwVar.onFirstFrameRendered();
                }
            }
            xow xowVar = this.f145909z;
            if (xowVar != null) {
                xowVar.m212484a();
                this.f145909z = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public void m166981o1(int i, int i2) {
        bpw bpwVar = this.f145901v;
        if (bpwVar != null) {
            bpwVar.onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public void m166983p1() {
        MDLog.m7449i("media", "The CameraPreviewManager release !!!");
        if (this.f145883m) {
            m167007O1();
        }
        if (this.f145885n) {
            m166946P1(true);
        }
        m166972i1();
        pc1 pc1Var = this.f145899u;
        if (pc1Var != null) {
            pc1Var.m171618m();
            this.f145899u.m171614i();
            this.f145899u = null;
        }
        if (this.f145907y != null) {
            this.f145907y = null;
        }
        if (this.f145909z != null) {
            this.f145909z = null;
        }
        if (this.f145834D0 != null) {
            this.f145834D0 = null;
        }
        if (this.f145836E0 != null) {
            this.f145836E0 = null;
        }
        if (this.f145838F0 != null) {
            this.f145838F0 = null;
        }
        if (this.f145832C0 != null) {
            this.f145832C0 = null;
        }
        if (this.f145871g != null) {
            this.f145871g = null;
        }
        this.f145870f0.m107796b();
        this.f145883m = false;
        this.f145866d0 = null;
        this.f145864c0 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public void m166985q1(int i) {
        this.f145870f0.m107797d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public void m166987r1(Object obj) {
        boolean zMo98199o;
        if (this.f145871g == null || obj == null || this.f145883m || this.f145841I == null || this.f145883m) {
            return;
        }
        this.f145850R = obj;
        m167008R1();
        this.f145871g.m199813N0(obj, this.f145873h.f169966g0);
        v5c v5cVar = this.f145871g;
        sow sowVar = this.f145873h;
        v5cVar.m121223y0(obj, new crf0(sowVar.f169975o, sowVar.f169976p));
        this.f145871g.m177855N();
        this.f145871g.m177858R(new crf0(this.f145873h.m187283d(), this.f145873h.m187282c()));
        this.f145871g.m177845C(m166977m1());
        m166929F1();
        ypl yplVarM139162d = this.f145841I.m139162d();
        if (yplVarM139162d != null) {
            this.f145871g.mo96768x0(yplVarM139162d.mo98197m());
            this.f145871g.m150364J0(yplVarM139162d.mo98193i());
        }
        kt2 kt2Var = this.f145849Q;
        if (kt2Var != null) {
            this.f145871g.m177859S(kt2Var);
        }
        this.f145893r = this.f145873h.m187281b();
        try {
            zMo98199o = this.f145841I.m139162d().mo98199o(this.f145887o, this.f145889p);
        } catch (Exception e) {
            MDLog.m7445e("media", "The camera startPreview failed !!!" + e.toString());
            zMo98199o = false;
        }
        if (!zMo98199o) {
            m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            MDLog.m7445e("media", "The camera startPreview failed !!!");
        } else {
            if (!this.f145866d0.m177357i()) {
                m167001y1();
            }
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-use-time", System.currentTimeMillis(), ReportType.COUNT);
            this.f145883m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public void m166989s1() {
        lyi0.m156289d(2, new RunnableC19078g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public void m166991t1() {
        MDLog.m7449i("media", "The CameraPreviewManager stopPreview !!!");
        if (this.f145883m) {
            ia4 ia4Var = this.f145841I;
            if (ia4Var != null) {
                ia4Var.m139176r();
            }
            pc1 pc1Var = this.f145899u;
            if (pc1Var != null) {
                pc1Var.m171618m();
                this.f145899u.m171614i();
                this.f145899u = null;
            }
            this.f145898t0 = 0L;
            this.f145902v0 = 0L;
            this.f145908y0 = 0L;
            this.f145910z0 = 0L;
            this.f145855W = 0;
            this.f145883m = false;
            this.f145842J = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public void m166993u1() {
        pc1 pc1Var = this.f145899u;
        if (pc1Var != null) {
            pc1Var.m171616k(null);
        }
        ed1 ed1Var = this.f145905x;
        if (ed1Var != null) {
            ed1Var.m120418f();
            this.f145905x = null;
        }
        MDLog.m7449i("CameraPreviewManager", "codec stop");
        m166964e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public void m166995v1(crf0 crf0Var, xow xowVar) {
        if (this.f145841I == null) {
            m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return;
        }
        int iM112050b = crf0Var.m112050b();
        int iM112049a = crf0Var.m112049a();
        MDLog.m7443d("media", "targetWidth = " + iM112050b + " targetHeight = " + iM112049a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        sow sowVar = this.f145873h;
        sowVar.f169955b = iM112050b;
        sowVar.f169957c = iM112049a;
        this.f145866d0.m177342R(crf0Var);
        this.f145841I.m139168j(this.f145864c0, this.f145866d0);
        MDLog.m7443d("media", "Reset camera cost time " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        sow sowVar2 = this.f145873h;
        this.f145884m0 = sowVar2.f169955b;
        this.f145886n0 = sowVar2.f169957c;
        m167008R1();
        v5c v5cVar = this.f145871g;
        Object obj = this.f145850R;
        sow sowVar3 = this.f145873h;
        v5cVar.m121223y0(obj, new crf0(sowVar3.f169975o, sowVar3.f169976p));
        this.f145871g.m177858R(new crf0(this.f145873h.m187283d(), this.f145873h.m187282c()));
        this.f145871g.m177845C(m166977m1());
        ypl yplVarM139162d = this.f145841I.m139162d();
        if (yplVarM139162d != null) {
            this.f145871g.mo96768x0(yplVarM139162d.mo98197m());
            this.f145871g.m150364J0(yplVarM139162d.mo98193i());
        }
        this.f145893r = this.f145873h.m187281b();
        if (!this.f145841I.m139175q(this.f145887o)) {
            m166981o1(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 0);
            return;
        }
        MDLog.m7443d("media", "StartPreview  camera cost " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " ms");
        if (this.f145871g != null) {
            this.f145878j0.clear();
        }
        this.f145909z = xowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public void m166997w1(Message message) {
        int i = message.arg1;
        if (i == 0) {
            m166940L1();
        } else {
            if (i != 2) {
                return;
            }
            m166938K1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m166999x1(sow sowVar) {
        v5c v5cVarM199802P0 = v5c.m199802P0("nv21RenThr", this.f145869f);
        this.f145871g = v5cVarM199802P0;
        v5cVarM199802P0.m199827j1(new C19085n());
        this.f145871g.m199831n1(sowVar.f169958c0 == 1);
        StringBuilder sb = new StringBuilder("Is FixedFrameRate? ");
        sb.append(sowVar.f169958c0 == 1);
        MDLog.m7449i("CameraPreviewManager", sb.toString());
        this.f145880k0 = sowVar.f169964f0;
        MDLog.m7449i("CameraPreviewManager", "CodecStopAsync: " + sowVar.f169964f0 + " isFaceSegment:" + sowVar.f169960d0 + " isGetBeautyScore:" + sowVar.f169962e0);
        this.f145871g.m177862V(this.f145836E0);
        this.f145871g.m121217u0(this.f145834D0);
        this.f145871g.m199832o1(this.f145832C0);
        this.f145871g.m199826i1(this.f145838F0);
        this.f145871g.m199829l1(this.f145868e0);
        this.f145871g.m199830m1(this.f145828A0);
        this.f145871g.m121225z0(this.f145830B0);
        this.f145873h = sowVar;
        this.f145841I = new ia4(sowVar);
        lrw.m155653j().m155659e();
        this.f145876i0 = new cvf(this.f145841I);
        this.f145885n = false;
        this.f145883m = false;
    }

    /* JADX INFO: renamed from: y1 */
    private void m167001y1() {
        sow sowVar = this.f145873h;
        int i = sowVar.f169929C;
        int i2 = sowVar.f169931E;
        int i3 = sowVar.f169930D;
        pc1 pc1Var = new pc1();
        this.f145899u = pc1Var;
        pc1Var.m171613h(i, 16, i2, i3);
        pc1 pc1Var2 = this.f145899u;
        if (pc1Var2 != null) {
            pc1Var2.m171615j(new C19077f());
        }
    }

    /* JADX INFO: renamed from: z1 */
    private boolean m167003z1(int i, qow qowVar) {
        MDLog.m7449i("media", "CameraPreviewManager prepare!!!");
        v5c v5cVar = this.f145871g;
        if (v5cVar != null) {
            v5cVar.m121216t0(new C19087p());
        }
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139171m(new C19088q());
        }
        this.f145864c0 = i;
        this.f145866d0 = qowVar;
        if (this.f145873h.f169946T) {
            MDLog.m7449i("media", "The camera type is camera2");
            this.f145841I.m139172n(new C19089r());
        }
        this.f145841I.m139173o(new C19090s());
        m166968g1();
        if (!this.f145841I.m139166h(i, qowVar)) {
            MDLog.m7445e("media", "Camera prepare failed !!!");
            return false;
        }
        sow sowVar = this.f145873h;
        this.f145884m0 = sowVar.f169955b;
        this.f145886n0 = sowVar.f169957c;
        this.f145841I.m139170l(new C19091t());
        ia4 ia4Var2 = this.f145841I;
        int iMo98197m = (ia4Var2 == null || ia4Var2.m139162d() == null) ? 90 : this.f145841I.m139162d().mo98197m();
        sow sowVar2 = this.f145873h;
        crf0 crf0Var = new crf0(sowVar2.f169955b, sowVar2.f169957c);
        sow sowVar3 = this.f145873h;
        crf0 crf0VarM97013e = ad4.m97013e(crf0Var, new crf0(sowVar3.f169975o, sowVar3.f169976p), iMo98197m);
        this.f145873h.f169973m = crf0VarM97013e.m112050b();
        this.f145873h.f169974n = crf0VarM97013e.m112049a();
        sow sowVar4 = this.f145873h;
        sowVar4.f169978r = iMo98197m;
        this.f145872g0 = sowVar4.f169967h;
        this.f145874h0 = sowVar4.f169969i;
        cvf cvfVar = this.f145876i0;
        if (cvfVar == null) {
            return true;
        }
        cvfVar.m112807b(mo162143e());
        return true;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: A */
    public boolean mo162110A(int i, qow qowVar) {
        return m166974j1(i, qowVar);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: C */
    public boolean mo162112C(int i, qow qowVar) throws Exception {
        Looper looperMyLooper = Looper.myLooper();
        this.f145891q = looperMyLooper;
        if (looperMyLooper != null) {
            return m167003z1(i, qowVar);
        }
        brq0.m106161a("Should create Looper in your thread, we need loop to create and release egl info");
        return false;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: D */
    public void mo162113D(epw epwVar) {
        this.f145907y = epwVar;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: E */
    public void mo162114E(String str) {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return;
        }
        ia4 ia4Var2 = this.f145841I;
        if (str != "on") {
            ia4Var2.m139162d().mo98183E(str);
        } else {
            ia4Var2.m139162d().mo98183E("torch");
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseFlash(true);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public byte[] m167004E1(byte[] bArr) {
        boolean z = this.f145835E;
        byte[] bArr2 = this.f145837F;
        if (z) {
            if (bArr2 == null) {
                this.f145837F = Arrays.copyOf(bArr, bArr.length);
            }
            return this.f145837F;
        }
        if (bArr2 != null) {
            this.f145837F = null;
        }
        return bArr;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: F */
    public boolean mo162115F() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return false;
        }
        return this.f145841I.m139162d().mo98184F();
    }

    /* JADX INFO: renamed from: J1 */
    public void m167005J1(crf0 crf0Var) {
        this.f145871g.m121223y0(this.f145850R, crf0Var);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: K */
    public synchronized void mo162120K(boolean z) {
        this.f145854V = z;
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseBgMusic(this.f145854V);
        MDLog.m7449i("media", "The recoder use the background music " + this.f145854V);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: M */
    public synchronized VideoFragment mo162122M(npw npwVar) {
        return m166946P1(npwVar == null);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: N */
    public synchronized void mo162123N(mpw mpwVar) {
        pc1 pc1Var;
        try {
            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-record-video", System.currentTimeMillis(), ReportType.COUNT);
            if (!this.f145866d0.m177357i() && (pc1Var = this.f145899u) != null) {
                pc1Var.m171617l();
            }
            if (mpwVar == null) {
                MDLog.m7443d("media", "Calling startRecording with sync ");
                m166970h1();
            } else {
                MDLog.m7443d("media", "Calling startRecording with async ");
                v5c v5cVar = this.f145871g;
                if (v5cVar != null) {
                    v5cVar.m177854M();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m167006N1() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139167i();
            this.f145841I = null;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public synchronized void m167007O1() {
        v5c v5cVar = this.f145871g;
        if (v5cVar != null) {
            v5cVar.mo121188P();
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: P */
    public void mo162125P(boolean z) {
        this.f145839G = z;
        MDLog.m7449i("media", "Use adjust light " + z);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: R */
    public synchronized void mo162127R(Object obj) {
        this.f145896s0 = System.currentTimeMillis();
        this.f145871g.m177853L(obj);
    }

    /* JADX INFO: renamed from: R1 */
    public crf0 m167008R1() {
        if (this.f145841I.m139162d() == null) {
            this.f145841I.m139163e(this.f145873h);
        }
        crf0 crf0Var = new crf0(this.f145884m0, this.f145886n0);
        int iMo98197m = this.f145841I.m139162d().mo98197m();
        sow sowVar = this.f145873h;
        crf0 crf0VarM97014f = ad4.m97014f(crf0Var, iMo98197m, new crf0(sowVar.f169975o, sowVar.f169976p), false);
        this.f145873h.f169973m = crf0VarM97014f.m112050b();
        this.f145873h.f169974n = crf0VarM97014f.m112049a();
        m166920A1();
        return crf0VarM97014f;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: S */
    public void mo162128S(String str) {
        this.f145877j = str;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: U */
    public void mo162130U(String str, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        sow sowVar;
        RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-take-photo", System.currentTimeMillis(), ReportType.COUNT);
        this.f145870f0.m107801h(str);
        this.f145870f0.m107802i(z);
        this.f145870f0.m107803j(this.f145868e0);
        if (z) {
            ia4 ia4Var = this.f145841I;
            if (ia4Var != null && ia4Var.m139162d() != null) {
                this.f145841I.m139162d().mo98204t(str);
            }
            this.f145871g.m199830m1(this.f145828A0);
        } else {
            this.f145871g.m199830m1(null);
            this.f145871g.m199829l1(this.f145868e0);
        }
        v5c v5cVar = this.f145871g;
        if (v5cVar == null || (sowVar = this.f145873h) == null) {
            return;
        }
        v5cVar.m199833q1(str, !sowVar.f169947U ? 0 : sowVar.f169977q, i, i2, i3, i4, z2);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraTakePhoto(true);
        m166933H1();
        MDLog.m7449i("media", "The picture path is " + str + " the video rotation is " + this.f145873h.f169977q);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: X */
    public boolean mo162133X() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return false;
        }
        return this.f145841I.m139162d().mo98206v();
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: Y */
    public String mo162134Y() {
        return this.f145875i;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: b */
    public void mo162137b(int i) {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return;
        }
        this.f145841I.m139162d().mo98188b(i);
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: c */
    public int mo162139c() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return 0;
        }
        return this.f145841I.m139162d().mo98189c();
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: d */
    public int mo162141d() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return 0;
        }
        return this.f145841I.m139162d().mo98190d();
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: e */
    public boolean mo162143e() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return false;
        }
        return this.f145841I.m139162d().mo98193i();
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: e0 */
    public void mo162144e0(boolean z) {
        this.f145882l0 = z;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: h0 */
    public void mo162147h0() {
        if (this.f145888o0) {
            this.f145888o0 = false;
            this.f145871g.m199822d1(0);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: i0 */
    public boolean mo162148i0() {
        return this.f145888o0;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: j0 */
    public void mo162149j0(float f) {
        sow sowVar = this.f145873h;
        if (sowVar != null) {
            sowVar.f169944R = f;
            MDLog.m7449i("media", "The recoder speed is " + this.f145873h.f169944R);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: k */
    public void mo162150k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139161c(rect, autoFocusCallback);
            DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseFocus(true);
            MDLog.m7449i("media", "The focus rect is rect.left = " + rect.left + " rect.top = " + rect.top + " rect.right = " + rect.right + " rect.bottom = " + rect.bottom);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: l */
    public void mo162152l(ypl.InterfaceC21661f interfaceC21661f) {
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139174p(interfaceC21661f);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: l0 */
    public void mo162153l0(qpw qpwVar) {
        this.f145868e0 = qpwVar;
    }

    /* JADX INFO: renamed from: l1 */
    public void m167009l1(long j, long j2) {
        if (this.f145844L == 0) {
            this.f145844L = System.currentTimeMillis();
        }
        this.f145845M++;
        if (System.currentTimeMillis() - this.f145844L > 1000) {
            this.f145831C = this.f145845M;
            this.f145845M = 0;
            this.f145844L = System.currentTimeMillis();
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: m0 */
    public void mo162154m0(apw apwVar) {
        this.f145860a0 = apwVar;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: q0 */
    public void mo162158q0(String str) {
        this.f145875i = str;
    }

    @Override // p153l.nb4
    public synchronized void release() {
        m167006N1();
        v5c v5cVar = this.f145871g;
        if (v5cVar != null) {
            v5cVar.mo121187G();
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: s0 */
    public boolean mo162160s0() {
        return false;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: v0 */
    public synchronized void mo162163v0(kt2 kt2Var) {
        this.f145849Q = kt2Var;
        v5c v5cVar = this.f145871g;
        if (v5cVar != null) {
            v5cVar.m177859S(kt2Var);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: w0 */
    public void mo162164w0(Context context) {
        ia4 ia4Var = this.f145841I;
        if (ia4Var != null) {
            ia4Var.m139169k(context);
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: x */
    public crf0 mo162165x(int i, int i2) {
        if (this.f145841I.m139162d() == null) {
            this.f145841I.m139163e(this.f145873h);
        }
        crf0 crf0Var = new crf0(i, i2);
        int iMo98197m = this.f145841I.m139162d().mo98197m();
        sow sowVar = this.f145873h;
        crf0 crf0VarM97014f = ad4.m97014f(crf0Var, iMo98197m, new crf0(sowVar.f169975o, sowVar.f169976p), false);
        this.f145873h.f169973m = crf0VarM97014f.m112050b();
        this.f145873h.f169974n = crf0VarM97014f.m112049a();
        m166920A1();
        m167005J1(new crf0(i, i2));
        return crf0VarM97014f;
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: y */
    public boolean mo162166y() {
        ia4 ia4Var = this.f145841I;
        if (ia4Var == null || ia4Var.m139162d() == null) {
            return false;
        }
        return this.f145841I.m139162d().mo98209y();
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: z */
    public void mo162167z(bpw bpwVar) {
        this.f145901v = bpwVar;
    }

    /* JADX INFO: renamed from: l.ob4$o */
    public class C19086o implements tpr {
        public C19086o() {
        }

        @Override // p153l.tpr
        /* JADX INFO: renamed from: a */
        public void mo161502a(Message message) {
            if (message.what != 22) {
                return;
            }
            ob4.this.m166997w1(message);
        }

        @Override // p153l.tpr
        public void onPause() {
        }

        @Override // p153l.tpr
        public void onResume() {
        }
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: a0 */
    public void mo162136a0() {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: B */
    public void mo162111B(c5g0.InterfaceC16197a interfaceC16197a) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: G */
    public void mo162116G(hpw hpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: H */
    public void mo162117H(wjm0 wjm0Var) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: I */
    public void mo162118I(npw npwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: J */
    public void mo162119J(int i) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: L */
    public void mo162121L(la1 la1Var) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: O */
    public void mo162124O(cu10.InterfaceC16366e interfaceC16366e) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: Q */
    public void mo162126Q(mpw mpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: T */
    public void mo162129T(gpw gpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: V */
    public void mo162131V(bvb bvbVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: W */
    public void mo162132W(wow wowVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: Z */
    public void mo162135Z(fpw fpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: b0 */
    public void mo162138b0(boolean z) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: c0 */
    public void mo162140c0(boolean z) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: d0 */
    public void mo162142d0(boolean z) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: f0 */
    public void mo162145f0(dpw dpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: g0 */
    public void mo162146g0(HashMap<String, Object> map) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: k0 */
    public void mo162151k0(boolean z) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: n0 */
    public void mo162155n0(opw opwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: o0 */
    public void mo162156o0(cpw cpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: p0 */
    public void mo162157p0(String str) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: r0 */
    public void mo162159r0(String str) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: t0 */
    public void mo162161t0(fpw fpwVar) {
    }

    @Override // p153l.nb4
    /* JADX INFO: renamed from: u0 */
    public void mo162162u0(yow yowVar) {
    }
}
