package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.BodyLandHelper;
import com.core.glcore.util.CameraUtil;
import com.core.glcore.util.FacerigHelper;
import com.core.glcore.util.Log4Cam;
import com.core.glcore.util.SegmentHelper;
import com.immomo.mmutil.task.C3804c;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.videoprocessor.VideoProcessor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class xb4 extends y220 implements mnl.InterfaceC18510a, mnl.InterfaceC18513d, wnl, k94.InterfaceC17958a {

    /* JADX INFO: renamed from: B */
    private boolean f191864B;

    /* JADX INFO: renamed from: C */
    private w84 f191865C;

    /* JADX INFO: renamed from: D */
    private ow3 f191866D;

    /* JADX INFO: renamed from: E */
    private ktf f191867E;

    /* JADX INFO: renamed from: I */
    private int f191872I;

    /* JADX INFO: renamed from: J */
    private int f191873J;

    /* JADX INFO: renamed from: P */
    private long f191879P;

    /* JADX INFO: renamed from: Y */
    private byte[] f191888Y;

    /* JADX INFO: renamed from: Z */
    private BodyLandmarkPostInfo f191889Z;

    /* JADX INFO: renamed from: f */
    private k94 f191890f;

    /* JADX INFO: renamed from: g */
    private ulw f191891g;

    /* JADX INFO: renamed from: i */
    private yw00 f191892i;

    /* JADX INFO: renamed from: k */
    private slw f191894k;

    /* JADX INFO: renamed from: m */
    hu00.InterfaceC17392a f191897m;

    /* JADX INFO: renamed from: p0 */
    private byte[] f191901p0;

    /* JADX INFO: renamed from: u */
    private long f191906u;

    /* JADX INFO: renamed from: y */
    private VideoProcessor f191909y;

    /* JADX INFO: renamed from: j */
    private boolean f191893j = false;

    /* JADX INFO: renamed from: l */
    private Object f191896l = new Object();

    /* JADX INFO: renamed from: n */
    private HandlerThread f191898n = null;

    /* JADX INFO: renamed from: o */
    private Handler f191899o = null;

    /* JADX INFO: renamed from: p */
    private int f191900p = 200;

    /* JADX INFO: renamed from: q */
    private boolean f191902q = false;

    /* JADX INFO: renamed from: r */
    private boolean f191903r = false;

    /* JADX INFO: renamed from: s */
    int f191904s = 0;

    /* JADX INFO: renamed from: t */
    private long f191905t = 0;

    /* JADX INFO: renamed from: v */
    int f191907v = 60;

    /* JADX INFO: renamed from: x */
    long f191908x = 0;

    /* JADX INFO: renamed from: z */
    private vjw f191910z = new vjw();

    /* JADX INFO: renamed from: A */
    private mkw f191863A = new mkw(1);

    /* JADX INFO: renamed from: F */
    C21067l f191869F = null;

    /* JADX INFO: renamed from: G */
    private int f191870G = 0;

    /* JADX INFO: renamed from: H */
    private SurfaceTexture f191871H = null;

    /* JADX INFO: renamed from: K */
    boolean f191874K = false;

    /* JADX INFO: renamed from: L */
    int f191875L = 0;

    /* JADX INFO: renamed from: M */
    int f191876M = 0;

    /* JADX INFO: renamed from: N */
    int f191877N = 0;

    /* JADX INFO: renamed from: O */
    int f191878O = 0;

    /* JADX INFO: renamed from: Q */
    private boolean f191880Q = false;

    /* JADX INFO: renamed from: R */
    private Object f191881R = new Object();

    /* JADX INFO: renamed from: S */
    private long f191882S = 0;

    /* JADX INFO: renamed from: T */
    private int f191883T = 0;

    /* JADX INFO: renamed from: U */
    protected long f191884U = 0;

    /* JADX INFO: renamed from: V */
    protected int f191885V = 0;

    /* JADX INFO: renamed from: W */
    protected int f191886W = 0;

    /* JADX INFO: renamed from: X */
    public int f191887X = 30;

    /* JADX INFO: renamed from: k0 */
    private mkw f191895k0 = new mkw(5);

    /* JADX INFO: renamed from: E0 */
    private AtomicBoolean f191868E0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l.xb4$a */
    public class RunnableC21056a implements Runnable {
        public RunnableC21056a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xb4.this.f191903r = true;
        }
    }

    /* JADX INFO: renamed from: l.xb4$b */
    public class RunnableC21057b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ktf f191912a;

        public RunnableC21057b(jkg jkgVar, ktf ktfVar) {
            this.f191912a = ktfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            xb4.m207697e2(xb4.this, null);
            xb4.this.f191867E = this.f191912a;
        }
    }

    /* JADX INFO: renamed from: l.xb4$c */
    public class C21058c implements mw00 {
        public C21058c() {
        }

        @Override // p149l.mw00
        /* JADX INFO: renamed from: a */
        public void mo140677a() {
            hu00.InterfaceC17392a interfaceC17392a = xb4.this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(214, 1, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$d */
    public class C21059d implements egw.InterfaceC16606h {
        public C21059d() {
        }

        @Override // p149l.egw.InterfaceC16606h
        /* JADX INFO: renamed from: a */
        public void mo116412a(int i, String str) {
            hu00.InterfaceC17392a interfaceC17392a = xb4.this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$e */
    public class C21060e implements Camera.ErrorCallback {
        public C21060e() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            hu00.InterfaceC17392a interfaceC17392a = xb4.this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$f */
    public class C21061f implements egw.InterfaceC16606h {
        public C21061f() {
        }

        @Override // p149l.egw.InterfaceC16606h
        /* JADX INFO: renamed from: a */
        public void mo116412a(int i, String str) {
            hu00.InterfaceC17392a interfaceC17392a = xb4.this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$g */
    public class C21062g implements Camera.ErrorCallback {
        public C21062g() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            hu00.InterfaceC17392a interfaceC17392a = xb4.this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$h */
    public class RunnableC21063h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f191919a;

        public RunnableC21063h(byte[] bArr) {
            this.f191919a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            xb4.this.m207708q2(this.f191919a);
        }
    }

    /* JADX INFO: renamed from: l.xb4$i */
    public class RunnableC21064i implements Runnable {
        public RunnableC21064i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                xb4 xb4Var = xb4.this;
                xb4Var.m207702j2(xb4Var.f191901p0);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    xb4.this.f191868E0.set(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$j */
    public class RunnableC21065j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f191922a;

        public RunnableC21065j(byte[] bArr) {
            this.f191922a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xb4.this.f191890f.m145006f() == null) {
                return;
            }
            xb4 xb4Var = xb4.this;
            xb4Var.f191904s++;
            xb4Var.setRenderSize(xb4Var.f191891g.f177136e, xb4.this.f191891g.f177138f);
            int i = xb4.this.f191891g.f177136e * xb4.this.f191891g.f177138f;
            ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", "camera preview width " + xb4.this.f191891g.f177136e + " height " + xb4.this.f191891g.f177138f + "planerSize:" + i + " data length:" + this.f191922a.length);
            ByteBuffer byteBuffer = xb4.this.f195484a;
            if (byteBuffer == null || byteBuffer.limit() < i) {
                xb4.this.f195484a = ByteBuffer.allocateDirect(i);
            }
            ByteBuffer byteBuffer2 = xb4.this.f195485b;
            if (byteBuffer2 == null || byteBuffer2.limit() < i / 2) {
                xb4.this.f195485b = ByteBuffer.allocateDirect(i / 2);
            }
            xb4.this.f195484a.put(this.f191922a, 0, i);
            xb4.this.f195485b.put(this.f191922a, i, i / 2);
            xb4.this.f195484a.position(0);
            xb4.this.f195485b.position(0);
            xb4.this.f191903r = false;
        }
    }

    /* JADX INFO: renamed from: l.xb4$k */
    public static class HandlerC21066k extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<C21067l> f191924a;

        public HandlerC21066k(C21067l c21067l) {
            this.f191924a = new WeakReference<>(c21067l);
        }

        /* JADX INFO: renamed from: a */
        public void m207714a() {
            sendMessage(obtainMessage(3));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            C21067l c21067l = this.f191924a.get();
            if (c21067l != null && i == 3) {
                c21067l.m207716e();
            }
        }
    }

    /* JADX INFO: renamed from: l.xb4$l */
    public class C21067l extends Thread {

        /* JADX INFO: renamed from: a */
        private Object f191925a;

        /* JADX INFO: renamed from: b */
        private boolean f191926b;

        /* JADX INFO: renamed from: c */
        private HandlerC21066k f191927c;

        /* JADX INFO: renamed from: d */
        private sie f191928d;

        public C21067l() {
            super("CameraEGLThread");
            this.f191925a = new Object();
            this.f191926b = false;
            this.f191927c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m207716e() {
            Looper.myLooper().quit();
        }

        /* JADX INFO: renamed from: b */
        public SurfaceTexture m207717b() {
            if (xb4.this.f191871H == null) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                xb4.this.f191870G = iArr[0];
                GLES20.glBindTexture(36197, xb4.this.f191870G);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                xb4.this.f191871H = new SurfaceTexture(xb4.this.f191870G);
                Log.e("CameraNV21PreviewInput", "createTexture: mTextureID:" + xb4.this.f191870G + ", mCameraTexture:" + xb4.this.f191871H);
            }
            return xb4.this.f191871H;
        }

        /* JADX INFO: renamed from: c */
        public HandlerC21066k m207718c() {
            return this.f191927c;
        }

        /* JADX INFO: renamed from: d */
        public void m207719d() {
            if (xb4.this.f191871H != null) {
                xb4.this.f191871H.release();
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture mCameraTexture: " + xb4.this.f191871H);
                xb4.this.f191871H = null;
            }
            if (xb4.this.f191870G != 0) {
                GLES20.glDeleteTextures(1, new int[]{xb4.this.f191870G}, 0);
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture glDeleteTextures: " + xb4.this.f191870G);
                xb4.this.f191870G = 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m207720f() {
            synchronized (this.f191925a) {
                while (!this.f191926b) {
                    try {
                        this.f191925a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f191927c = new HandlerC21066k(this);
            sie sieVar = new sie();
            this.f191928d = sieVar;
            sieVar.m184327b();
            Log.e("CameraNV21PreviewInput", "run: Start");
            this.f191928d.m184333i();
            m207717b();
            synchronized (this.f191925a) {
                this.f191926b = true;
                this.f191925a.notify();
            }
            Looper.loop();
            m207719d();
            this.f191928d.m184334j();
            this.f191927c = null;
            synchronized (this.f191925a) {
                this.f191926b = false;
            }
            Log.e("CameraNV21PreviewInput", "run: Exit");
        }
    }

    public xb4(vlw vlwVar, hu00.InterfaceC17392a interfaceC17392a) {
        this.f191906u = 15L;
        this.f191897m = interfaceC17392a;
        if (vlwVar == null) {
            this.f191891g = new ulw();
        } else {
            this.f191891g = vlwVar;
        }
        this.f191906u = vlwVar.f182015D0;
        this.f191890f = new k94(vlwVar, false);
        this.useNewViewPort = true;
        this.f191865C = new w84();
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ jkg m207697e2(xb4 xb4Var, jkg jkgVar) {
        xb4Var.getClass();
        return jkgVar;
    }

    /* JADX INFO: renamed from: i2 */
    private void m207701i2(pjw pjwVar) {
        if (pjwVar.m169950n() <= 0) {
            int i = this.f191876M + 1;
            this.f191876M = i;
            if (i == this.f191900p) {
                this.f191876M = 0;
                if (mo140659e()) {
                    m207706n2();
                    return;
                }
                return;
            }
            return;
        }
        ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("hasFace"));
        if (this.f191875L % this.f191865C.m202106a() == 0) {
            this.f191875L = 0;
            float[] fArrM220022p = pjwVar.m169946j(0).m220022p();
            this.f191890f.m145004d(pjwVar.f149898e, pjwVar.f149899f, fArrM220022p[0], fArrM220022p[1], fArrM220022p[2], fArrM220022p[3], 1.0f);
            xxx.m211572F().m211594W(((fArrM220022p[1] + fArrM220022p[3]) * 0.5f) / pjwVar.f149899f, ((fArrM220022p[0] + fArrM220022p[2]) * 0.5f) / pjwVar.f149898e);
        }
        this.f191875L++;
        this.f191876M = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public void m207702j2(byte[] bArr) {
        MMJoint[][] mMJointArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f191910z.m198695h(17);
        this.f191910z.m198700m(this.f191891g.f177136e);
        this.f191910z.m198697j(this.f191891g.f177138f);
        this.f191910z.m198694g(bArr);
        this.f191910z.m198693f(bArr.length);
        this.f191910z.m198699l(this.f191891g.f177136e);
        this.f191895k0.m155066A(m207707p2());
        this.f191895k0.m155104z(this.f191890f.m145007g());
        this.f191895k0.m155094p(this.f191890f.m145013m());
        this.f191895k0.m155073H(true);
        if (this.f191889Z == null) {
            this.f191889Z = new BodyLandmarkPostInfo();
        }
        if (!this.f191864B && !TextUtils.isEmpty(this.f191865C.m202108c())) {
            BodyLandHelper.setModelTypeAndPath(this.f191865C.m202117l(), this.f191865C.m202108c());
            this.f191864B = true;
        }
        BodyLandHelper.process(this.f191910z, this.f191895k0, this.f191889Z);
        xxx.m211572F().m211593V(SystemClock.elapsedRealtime() - jElapsedRealtime);
        BodyLandHelper.setBodyInfos(this.f191889Z);
        if (!be80.f75125a || (mMJointArr = this.f191889Z.multi_person_) == null || mMJointArr.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (MMJoint[] mMJointArr2 : this.f191889Z.multi_person_) {
            sb.append("[");
            for (MMJoint mMJoint : mMJointArr2) {
                sb.append("[x = ");
                sb.append(mMJoint.f14759x_);
                sb.append(", y = ");
                sb.append(mMJoint.f14760y_);
                sb.append(", score = ");
                sb.append(mMJoint.score_);
                sb.append("], ");
            }
            sb.append(Constants.AES_SUFFIX);
        }
        n8c.m158485c("mao", sb.toString());
    }

    /* JADX INFO: renamed from: k2 */
    private void m207703k2(pjw pjwVar) {
        if (this.f191908x <= 65) {
            this.f191883T = 0;
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "faceDetectUse A " + this.f191908x + " mMMCVInfo[0]" + pjwVar.m169950n());
        int i = this.f191883T + 1;
        this.f191883T = i;
        if (i > 10) {
            this.f191865C.m202126u(false);
            this.f191883T = 0;
        }
    }

    /* JADX INFO: renamed from: l2 */
    private void m207704l2(byte[] bArr, pjw pjwVar) {
        ulw ulwVar = this.f191891g;
        if (ulwVar != null) {
            SegmentHelper.setWidth(ulwVar.f177136e);
            SegmentHelper.setHeight(this.f191891g.f177138f);
            SegmentHelper.setRotateDegree(m207707p2());
            SegmentHelper.setRestoreDegree(this.f191890f.m145007g());
            SegmentHelper.setIsFrontCamera(this.f191890f.m145013m());
        }
        m207712u2(bArr);
        qtf qtfVarProcess = FacerigHelper.isUseFacerig() ? FacerigHelper.process(this.f191910z, this.f191863A) : null;
        pjwVar.m169938D(qtfVarProcess);
        w84 w84Var = this.f191865C;
        if (qtfVarProcess == null) {
            List<String> listM202110e = w84Var.m202110e();
            if (this.f191909y == null && listM202110e != null) {
                this.f191909y = new VideoProcessor();
                n8c.m158487e("live_mmcv", "VideoProcessor.Create");
                if (listM202110e.size() >= 2) {
                    this.f191909y.LoadModel(listM202110e.get(0), listM202110e.get(1));
                }
            }
            VideoProcessor videoProcessor = this.f191909y;
            if (videoProcessor != null) {
                videoProcessor.ProcessFrame(this.f191910z.m198689b(), this.f191863A.m155084f(), pjwVar.m169955s());
                pjwVar.m169941b(w84Var.m202115j());
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m207705m2(byte[] bArr, pjw pjwVar) {
        m207712u2(bArr);
        pjwVar.m169938D(FacerigHelper.process(this.f191910z, this.f191863A));
    }

    /* JADX INFO: renamed from: n2 */
    private void m207706n2() {
        this.f191890f.m145003c();
        xxx.m211572F().m211594W(0.5f, 0.5f);
    }

    /* JADX INFO: renamed from: p2 */
    private final int m207707p2() {
        int i = this.f191891g.f177105D;
        return i == 0 ? this.f191890f.m145007g() : 270 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public void m207708q2(byte[] bArr) {
        long jM184879h;
        if (bArr == null) {
            return;
        }
        synchronized (this.f191896l) {
            try {
                pjw pjwVar = new pjw();
                if (this.f191890f.m145006f() != null && !this.f191903r) {
                    if (System.currentTimeMillis() - this.f191879P > 1000 && this.f191880Q) {
                        this.f191880Q = false;
                        this.f191874K = false;
                        m207706n2();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = this.f191872I;
                    if (i == 0) {
                        jM184879h = this.f191894k.m184879h() != 0 ? 1000 / ((long) this.f191894k.m184879h()) : 66L;
                    } else {
                        jM184879h = 1000 / ((long) i);
                    }
                    long j = this.f191905t;
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 >= jM184879h && !this.f191902q) {
                        if (j == 0 || j2 > 5 * jM184879h) {
                            this.f191905t = System.currentTimeMillis();
                        } else {
                            this.f191905t = j + jM184879h;
                        }
                        this.f191882S = SystemClock.elapsedRealtime();
                        boolean zM202118m = this.f191865C.m202118m();
                        byte[] bArr2 = this.f191888Y;
                        if (bArr2 == null || bArr2.length != bArr.length) {
                            this.f191888Y = new byte[bArr.length];
                        }
                        System.arraycopy(bArr, 0, this.f191888Y, 0, bArr.length);
                        if (zM202118m) {
                            m207704l2(this.f191888Y, pjwVar);
                        } else if (FacerigHelper.isUseFacerig()) {
                            m207705m2(this.f191888Y, pjwVar);
                        }
                        this.f191908x = SystemClock.elapsedRealtime() - this.f191882S;
                        xxx.m211572F().m211607e0(this.f191908x);
                        if (BodyLandHelper.isUseBodyLand() && this.f191868E0.get()) {
                            byte[] bArr3 = this.f191901p0;
                            if (bArr3 == null || bArr3.length < bArr.length) {
                                this.f191901p0 = new byte[bArr.length];
                            }
                            System.arraycopy(bArr, 0, this.f191901p0, 0, bArr.length);
                            this.f191868E0.set(false);
                            C3804c.m18444d(2, new RunnableC21064i());
                        }
                        m207711t2(pjwVar, this.f191888Y);
                        if (pjwVar.m169950n() > 0) {
                            xxx.m211572F().m211621l0(true);
                            float[] fArrM220022p = pjwVar.m169946j(0).m220022p();
                            xxx xxxVarM211572F = xxx.m211572F();
                            float f = fArrM220022p[0];
                            int i2 = pjwVar.f149898e;
                            float f2 = fArrM220022p[1];
                            int i3 = pjwVar.f149899f;
                            xxxVarM211572F.m211611g0(f / i2, f2 / i3, fArrM220022p[2] / i2, fArrM220022p[3] / i3);
                        } else {
                            xxx.m211572F().m211621l0(false);
                        }
                        if (this.f191865C.m202106a() > 0) {
                            m207701i2(pjwVar);
                        }
                        if (this.f191865C.m202121p()) {
                            m207703k2(pjwVar);
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m207710s2(pjwVar, this.f191888Y);
                        xxx.m211572F().m211601b0(System.currentTimeMillis() - jCurrentTimeMillis2);
                        if (this.f191867E != null && pjwVar.m169948l() != null) {
                            this.f191867E.mo19165a(pjwVar.m169948l());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m207709r2() {
        C21067l c21067l = this.f191869F;
        if (c21067l == null || c21067l.m207718c() == null) {
            return;
        }
        this.f191869F.m207718c().m207714a();
        try {
            this.f191869F.join();
        } catch (InterruptedException unused) {
        }
        this.f191869F = null;
    }

    /* JADX INFO: renamed from: s2 */
    private void m207710s2(pjw pjwVar, byte[] bArr) {
        yw00 yw00Var = this.f191892i;
        if (yw00Var != null) {
            yw00Var.m216259A(pjwVar, new RunnableC21065j(bArr), new RunnableC21056a());
        }
    }

    /* JADX INFO: renamed from: t2 */
    private void m207711t2(pjw pjwVar, byte[] bArr) {
        pjwVar.m169962z(this.f191890f.m145013m());
        pjwVar.m169959w(m207707p2());
        pjwVar.m169937C(this.f191890f.m145007g());
        pjwVar.m169961y(bArr);
        pjwVar.m169939E(this.f191891g.f177136e);
        pjwVar.m169935A(this.f191891g.f177138f);
        pjwVar.m169960x(this.f191891g.f177105D);
    }

    /* JADX INFO: renamed from: u2 */
    private void m207712u2(byte[] bArr) {
        w84 w84Var = this.f191865C;
        this.f191910z.m198695h(17);
        this.f191910z.m198700m(this.f191891g.f177136e);
        this.f191910z.m198697j(this.f191891g.f177138f);
        this.f191910z.m198694g(ByteBuffer.wrap(bArr).array());
        this.f191910z.m198693f(bArr.length);
        this.f191910z.m198699l(this.f191891g.f177136e);
        this.f191863A.m155066A(m207707p2());
        this.f191863A.m155104z(this.f191890f.m145007g());
        this.f191863A.m155094p(this.f191890f.m145013m());
        this.f191863A.m155078M(w84Var.m202115j());
        this.f191863A.m155076K(w84Var.m202114i());
        this.f191863A.m155077L(w84Var.m202107b());
        this.f191863A.m155068C(w84Var.m202113h());
        this.f191863A.m155069D(w84Var.m202112g());
        this.f191863A.m155095q(w84Var.m202111f());
        this.f191863A.m155072G(w84Var.m202122q());
        this.f191863A.m155086h(true);
        this.f191863A.m155096r(w84Var.m202109d());
        ow3 ow3Var = this.f191866D;
        mkw mkwVar = this.f191863A;
        if (ow3Var == null) {
            mkwVar.m155089k(w84Var.m202119n());
            this.f191863A.m155090l(w84Var.m202120o());
            int iM202115j = w84Var.m202115j();
            mkw mkwVar2 = this.f191863A;
            if (iM202115j == 104) {
                mkwVar2.m155071F(false);
                this.f191863A.m155087i(false);
            } else {
                mkwVar2.m155087i(w84Var.m202116k());
                this.f191863A.m155071F(true);
            }
            this.f191863A.m155092n(false);
            this.f191863A.m155101w(1);
            this.f191863A.m155088j(2);
        } else {
            mkwVar.m155088j(ow3Var.m166233a());
            this.f191863A.m155091m(ow3Var.m166234b());
            this.f191863A.m155097s(ow3Var.m166236d());
            this.f191863A.m155102x(ow3Var.m166237e());
            this.f191863A.m155103y(ow3Var.m166238f());
            this.f191863A.m155098t(ow3Var.m166243k());
            this.f191863A.m155075J(ow3Var.m166246n());
            this.f191863A.m155074I(ow3Var.m166245m());
            this.f191863A.m155089k(ow3Var.m166240h() & w84Var.m202119n());
            this.f191863A.m155090l(ow3Var.m166241i() & w84Var.m202120o());
            int iM202115j2 = w84Var.m202115j();
            mkw mkwVar3 = this.f191863A;
            if (iM202115j2 == 104) {
                mkwVar3.m155071F(false);
                this.f191863A.m155087i(false);
            } else {
                mkwVar3.m155071F(ow3Var.m166244l());
                this.f191863A.m155087i(ow3Var.m166239g());
            }
            this.f191863A.m155092n(ow3Var.m166242j());
            this.f191863A.m155093o(ow3Var.m166235c());
        }
        this.f191863A.m155067B(false);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: B */
    public void mo140639B(slw slwVar) {
        hu00.InterfaceC17392a interfaceC17392a;
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resetCamera");
        this.f191894k = slwVar;
        yw00 yw00Var = this.f191892i;
        if (yw00Var != null) {
            yw00Var.m216275i(new C21058c());
            this.f191892i.m216262D();
        }
        if (this.f191890f != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "resetCamera\r\nvideoWidth:" + this.f191891g.f177164s + ",videoHeight:" + this.f191891g.f177166t + ",visualWidth:" + this.f191891g.f177168u + ",visualHeight:" + this.f191891g.f177169v + ",encodeWidth:" + this.f191891g.f177152m + ",encodeHeight:" + this.f191891g.f177154n + ",videoBitrate:" + this.f191891g.f177109H + ",audioBitrate:" + this.f191891g.f177120S + ",videoFPS:" + this.f191891g.f177107F + ",targetWidth" + this.f191894k.m184877f().m198562b() + ",targetHeight" + this.f191894k.m184877f().m198561a() + ", renderFps" + this.f191894k.m184879h() + ", degree" + this.f191873J);
            this.f191890f.m145017s(this.f191873J, this.f191894k);
            this.f191890f.m145022x(new C21059d());
            this.f191890f.m145023y(new C21060e());
        }
        this.f191903r = false;
        m207713o2();
        if (this.f191890f.m145000B(this.f191871H) || (interfaceC17392a = this.f191897m) == null) {
            return;
        }
        interfaceC17392a.mo128349g(16640, -1, 0, this);
    }

    @Override // p149l.k94.InterfaceC17958a
    /* JADX INFO: renamed from: D */
    public void mo145025D(byte[] bArr) {
        xxx.m211572F().m211585N();
        if (this.f191891g.f177141g0) {
            m207708q2(bArr);
        } else {
            m207708q2(bArr);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E */
    public void mo140640E(int i, slw slwVar) {
        hu00.InterfaceC17392a interfaceC17392a;
        hu00.InterfaceC17392a interfaceC17392a2;
        this.f191894k = slwVar;
        this.f191902q = false;
        this.f191880Q = true;
        this.f191873J = i;
        try {
            if (this.f191890f.m145001C(i, slwVar) && (interfaceC17392a2 = this.f191897m) != null) {
                interfaceC17392a2.mo128349g(16640, -5, 0, this);
            }
        } catch (Error unused) {
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "startPreview degree:" + i);
        this.f191894k = slwVar;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "switchCamera line: 551 videoWidth:" + this.f191891g.f177164s + ",videoHeight:" + this.f191891g.f177166t + ",visualWidth:" + this.f191891g.f177168u + ",visualHeight:" + this.f191891g.f177169v + ",encodeWidth:" + this.f191891g.f177152m + ",encodeHeight:" + this.f191891g.f177154n + ",videoBitrate:" + this.f191891g.f177109H + ",audioBitrate:" + this.f191891g.f177120S + ",videoFPS:" + this.f191891g.f177107F + ",targetWidth" + slwVar.m184877f().m198562b() + ",targetHeight" + slwVar.m184877f().m198561a() + ", mCurrentDegree" + i + ", renderFps" + this.f191894k.m184879h());
        ulw ulwVar = this.f191891g;
        CameraUtil.reScaleSize(new vif0(ulwVar.f177136e, ulwVar.f177138f), new vif0(9, 16), this.f191890f.m145007g());
        if (this.f191898n != null) {
            Handler handler = this.f191899o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f191898n.quit();
            HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
            this.f191898n = handlerThread;
            handlerThread.start();
            this.f191899o = new Handler(this.f191898n.getLooper());
        }
        this.f191907v = this.f191891g.f177164s / 12;
        boolean zM145013m = this.f191890f.m145013m();
        k94 k94Var = this.f191890f;
        if (zM145013m) {
            changeCurRotation(360 - k94Var.m145007g());
            flipPosition(2);
        } else {
            changeCurRotation(k94Var.m145007g());
            flipPosition(1);
        }
        this.f191903r = false;
        if (!this.f191890f.m145000B(this.f191871H) && (interfaceC17392a = this.f191897m) != null) {
            interfaceC17392a.mo128349g(16640, -1, 0, this);
        }
        xxx.m211572F().m211595X(this.f191890f.m145013m() ? 1 : 0);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E1 */
    public boolean mo140641E1(int i, slw slwVar) {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "startPreview");
        this.f191902q = false;
        this.f191894k = slwVar;
        if (this.f191890f.m145006f() == null) {
            this.f191890f.m145012l(this.f191891g, false);
        }
        this.f191890f.m145024z(this);
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startPreview(int degree, MRConfig mrConfig)\r\nvideoWidth:" + this.f191891g.f177164s + ",videoHeight:" + this.f191891g.f177166t + ",visualWidth:" + this.f191891g.f177168u + ",visualHeight:" + this.f191891g.f177169v + ",encodeWidth:" + this.f191891g.f177152m + ",encodeHeight:" + this.f191891g.f177154n + ",videoBitrate:" + this.f191891g.f177109H + ",audioBitrate:" + this.f191891g.f177120S + ",videoFPS:" + this.f191891g.f177107F + ",targetWidth" + slwVar.m184877f().m198562b() + ",targetHeight" + slwVar.m184877f().m198561a() + ", mCurrentDegree" + i + ", renderFps" + this.f191894k.m184879h());
        this.f191873J = i;
        ii70 ii70VarM136344d = ii70.m136344d();
        StringBuilder sb = new StringBuilder("startPreview degree:");
        sb.append(i);
        ii70VarM136344d.m136346a("Pipeline_Normal_pip->PIPLINE", sb.toString());
        this.f191890f.m145019u(g16.f100119a);
        if (!this.f191890f.m145015p(i, slwVar)) {
            Log4Cam.m7322e("Camera prepare Failed!");
            hu00.InterfaceC17392a interfaceC17392a = this.f191897m;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(16640, -4, 0, this);
            }
            return false;
        }
        this.f191890f.m145022x(new C21061f());
        this.f191890f.m145023y(new C21062g());
        if (this.f191898n != null) {
            Handler handler = this.f191899o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f191898n.quit();
        }
        HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
        this.f191898n = handlerThread;
        handlerThread.start();
        this.f191899o = new Handler(this.f191898n.getLooper());
        this.f191890f.m145020v(this);
        this.f191907v = this.f191891g.f177164s / 12;
        m207713o2();
        ulw ulwVar = this.f191891g;
        CameraUtil.reScaleSize(new vif0(ulwVar.f177136e, ulwVar.f177138f), new vif0(9, 16), this.f191890f.m145007g());
        boolean zM145013m = this.f191890f.m145013m();
        k94 k94Var = this.f191890f;
        if (zM145013m) {
            changeCurRotation(360 - k94Var.m145007g());
            flipPosition(2);
        } else {
            changeCurRotation(k94Var.m145007g());
            flipPosition(1);
        }
        this.f191903r = false;
        this.f191890f.m145000B(this.f191871H);
        xxx.m211572F().m211595X(this.f191890f.m145013m() ? 1 : 0);
        xxx.m211572F().m211596Y(this.f191891g.f177149k0);
        xxx xxxVarM211572F = xxx.m211572F();
        ulw ulwVar2 = this.f191891g;
        xxxVarM211572F.m211627o0(ulwVar2.f177122U, ulwVar2.f177121T);
        xxx.m211572F().m211631q0(this.f191891g.f177141g0 ? 1 : 0);
        return true;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: I */
    public void mo140643I(boolean z) {
        this.f191865C.m202131z(z);
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: I0 */
    public long mo140644I0() {
        return this.f191904s;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: J1 */
    public void mo140645J1(w84 w84Var) {
        this.f191865C = w84Var;
    }

    @Override // p149l.pnl, p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        this.f191892i = yw00Var;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: N */
    public void mo140647N() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 1");
        this.f191890f.m145014o();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: R */
    public void mo140649R(ow3 ow3Var) {
        this.f191866D = ow3Var;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: S */
    public void mo140650S(boolean z) {
        this.f191865C.m202101B(z);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: T */
    public void mo140651T(boolean z) {
        this.f191865C.m202126u(z);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Z */
    public void mo140653Z(int i) {
        this.f191872I = i;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a */
    public void mo140654a() {
        if (this.f191890f != null) {
            synchronized (this.f191896l) {
                try {
                    ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "stopPreview");
                    this.f191890f.m145016r();
                    this.f191904s = 0;
                    if (this.f191898n != null) {
                        Handler handler = this.f191899o;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            this.f191899o = null;
                        }
                        this.f191898n.quit();
                        this.f191898n = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VideoProcessor videoProcessor = this.f191909y;
        if (videoProcessor != null) {
            videoProcessor.Release();
            n8c.m158487e("live_mmcv", "stopPreview: VideoProcessor.Release");
            this.f191909y = null;
        }
        BodyLandHelper.release();
        this.f191864B = false;
        m207709r2();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a1 */
    public w84 mo140655a1() {
        return this.f191865C;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: b */
    public void mo140656b(int i) {
        this.f191890f.m144999A(i);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: c */
    public int mo140657c() {
        return this.f191890f.m145010j();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: d */
    public int mo140658d() {
        return this.f191890f.m145008h();
    }

    @Override // p149l.y220, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: e */
    public boolean mo140659e() {
        return this.f191890f.m145013m();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: g */
    public int mo140660g() {
        return this.f191890f.m145011k();
    }

    @Override // p149l.y220, p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){vec3 rgb;vec3 yuv;yuv.r = texture2D(SamplerY, coordinate).r - (16.0/255.0);\nyuv.g = texture2D(SamplerUV, coordinate).a - 0.5;\nyuv.b = texture2D(SamplerUV, coordinate).r - 0.5;\n mat3 colorConvertion = mat3(1.164, 1.164, 1.164,\n                             0.0, -0.392, 2.017,\n                             1.596, -0.813, 0.0);\n rgb = colorConvertion * yuv;   gl_FragColor = vec4(rgb, 1.0);\n}";
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: h */
    public int mo140661h() {
        return this.f191890f.m145009i();
    }

    @Override // p149l.y220, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: k */
    public void mo140662k(boolean z) {
        this.f191865C.m202127v(z);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: l */
    public void mo140663l(List<String> list) {
        this.f191865C.m202130y(list);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: m */
    public void mo140664m(int i) {
        if (i < 0) {
            return;
        }
        this.f191865C.m202123r(i);
    }

    /* JADX INFO: renamed from: o2 */
    public SurfaceTexture m207713o2() {
        SurfaceTexture surfaceTexture;
        if (this.f191869F != null && this.f191870G > 0 && (surfaceTexture = this.f191871H) != null) {
            return surfaceTexture;
        }
        C21067l c21067l = new C21067l();
        this.f191869F = c21067l;
        c21067l.start();
        this.f191869F.m207720f();
        return this.f191871H;
    }

    @Override // p149l.mnl.InterfaceC18510a
    public void onData(byte[] bArr) {
        Handler handler;
        if (this.f191890f.m145006f() == null || bArr == null) {
            return;
        }
        xxx.m211572F().m211585N();
        if (this.f191898n == null || (handler = this.f191899o) == null) {
            return;
        }
        handler.post(new RunnableC21063h(bArr));
    }

    @Override // p149l.y220, p149l.ccj
    public void onDrawFrame() {
        markAsDirty();
        super.onDrawFrame();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: q */
    public void mo140666q(float f) {
        this.f191865C.m202104E(f);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: r */
    public void mo140668r() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 1");
        synchronized (this.f191896l) {
            try {
                if (this.f191898n != null) {
                    Handler handler = this.f191899o;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f191899o = null;
                    }
                    this.f191898n.quit();
                    this.f191898n = null;
                }
                this.f191890f.m145016r();
                m207709r2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: s */
    public void mo140669s(int i) {
        this.f191865C.m202129x(i);
    }

    @Override // p149l.vql
    /* JADX INFO: renamed from: s1 */
    public void mo140670s1(jkg jkgVar, ktf ktfVar) {
        if (this.f191898n == null || Looper.myLooper() == this.f191898n.getLooper()) {
            this.f191867E = ktfVar;
        } else {
            this.f191899o.post(new RunnableC21057b(jkgVar, ktfVar));
        }
    }

    @Override // p149l.pnl
    public void setExposureCompensation(int i) {
        this.f191890f.m145021w(i);
    }

    @Override // p149l.pnl
    public void setWarpType(int i) {
        this.f191865C.m202105F(i);
        if (i < 5 || i > 8) {
            return;
        }
        this.f191865C.m202103D(true);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: u */
    public void mo140671u(int i) {
        this.f191865C.m202100A(i);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: v */
    public void mo140672v(float f) {
        this.f191865C.m202125t(f);
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: v1 */
    public long mo140673v1() {
        return 0L;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: w */
    public void mo140674w(boolean z) {
        this.f191865C.m202128w(z);
    }

    @Override // p149l.wnl
    /* JADX INFO: renamed from: x */
    public vif0 mo140675x(int i, int i2) {
        ulw ulwVar = this.f191891g;
        return CameraUtil.rescalAspectRatio(new vif0(ulwVar.f177136e, ulwVar.f177138f), this.f191890f.m145007g(), new vif0(i, i2));
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: z */
    public void mo140676z() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "resumePreview line 628:videoWidth:" + this.f191891g.f177164s + ",videoHeight:" + this.f191891g.f177166t + ",visualWidth:" + this.f191891g.f177168u + ",visualHeight:" + this.f191891g.f177169v + ",encodeWidth:" + this.f191891g.f177152m + ",encodeHeight:" + this.f191891g.f177154n + ",videoBitrate:" + this.f191891g.f177109H + ",audioBitrate:" + this.f191891g.f177120S + ",videoFPS:" + this.f191891g.f177107F + ",targetWidth" + this.f191894k.m184877f().m198562b() + ",targetHeight" + this.f191894k.m184877f().m198561a() + ", renderFps" + this.f191894k.m184879h() + ", degree" + this.f191873J);
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview");
        if (this.f191890f.m145006f() != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 1");
            this.f191890f.m145018t();
        } else {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 2");
            mo140641E1(this.f191873J, this.f191894k);
        }
    }

    @Override // p149l.mnl.InterfaceC18513d
    /* JADX INFO: renamed from: G */
    public void mo140642G() {
    }

    @Override // p149l.wnl
    /* JADX INFO: renamed from: M */
    public void mo140646M() {
    }

    @Override // p149l.i3m
    public mcj getInput() {
        return this;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Q */
    public void mo140648Q(ja4.InterfaceC17734l interfaceC17734l) {
    }

    @Override // p149l.mnl.InterfaceC18513d
    /* JADX INFO: renamed from: V */
    public void mo140652V(Camera camera) {
    }
}
