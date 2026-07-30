package p153l;

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
import com.immomo.mmutil.task.C3949c;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.videoprocessor.VideoProcessor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class wc4 extends gb20 implements xpl.InterfaceC21407a, xpl.InterfaceC21410d, hql, ja4.InterfaceC17902a {

    /* JADX INFO: renamed from: B */
    private boolean f188319B;

    /* JADX INFO: renamed from: C */
    private v94 f188320C;

    /* JADX INFO: renamed from: D */
    private nx3 f188321D;

    /* JADX INFO: renamed from: E */
    private yuf f188322E;

    /* JADX INFO: renamed from: I */
    private int f188327I;

    /* JADX INFO: renamed from: J */
    private int f188328J;

    /* JADX INFO: renamed from: P */
    private long f188334P;

    /* JADX INFO: renamed from: Y */
    private byte[] f188343Y;

    /* JADX INFO: renamed from: Z */
    private BodyLandmarkPostInfo f188344Z;

    /* JADX INFO: renamed from: f */
    private ja4 f188345f;

    /* JADX INFO: renamed from: g */
    private tow f188346g;

    /* JADX INFO: renamed from: i */
    private g510 f188347i;

    /* JADX INFO: renamed from: k */
    private row f188349k;

    /* JADX INFO: renamed from: m */
    q210.InterfaceC19500a f188352m;

    /* JADX INFO: renamed from: p0 */
    private byte[] f188356p0;

    /* JADX INFO: renamed from: u */
    private long f188361u;

    /* JADX INFO: renamed from: y */
    private VideoProcessor f188364y;

    /* JADX INFO: renamed from: j */
    private boolean f188348j = false;

    /* JADX INFO: renamed from: l */
    private Object f188351l = new Object();

    /* JADX INFO: renamed from: n */
    private HandlerThread f188353n = null;

    /* JADX INFO: renamed from: o */
    private Handler f188354o = null;

    /* JADX INFO: renamed from: p */
    private int f188355p = 200;

    /* JADX INFO: renamed from: q */
    private boolean f188357q = false;

    /* JADX INFO: renamed from: r */
    private boolean f188358r = false;

    /* JADX INFO: renamed from: s */
    int f188359s = 0;

    /* JADX INFO: renamed from: t */
    private long f188360t = 0;

    /* JADX INFO: renamed from: v */
    int f188362v = 60;

    /* JADX INFO: renamed from: x */
    long f188363x = 0;

    /* JADX INFO: renamed from: z */
    private umw f188365z = new umw();

    /* JADX INFO: renamed from: A */
    private lnw f188318A = new lnw(1);

    /* JADX INFO: renamed from: F */
    C21073l f188324F = null;

    /* JADX INFO: renamed from: G */
    private int f188325G = 0;

    /* JADX INFO: renamed from: H */
    private SurfaceTexture f188326H = null;

    /* JADX INFO: renamed from: K */
    boolean f188329K = false;

    /* JADX INFO: renamed from: L */
    int f188330L = 0;

    /* JADX INFO: renamed from: M */
    int f188331M = 0;

    /* JADX INFO: renamed from: N */
    int f188332N = 0;

    /* JADX INFO: renamed from: O */
    int f188333O = 0;

    /* JADX INFO: renamed from: Q */
    private boolean f188335Q = false;

    /* JADX INFO: renamed from: R */
    private Object f188336R = new Object();

    /* JADX INFO: renamed from: S */
    private long f188337S = 0;

    /* JADX INFO: renamed from: T */
    private int f188338T = 0;

    /* JADX INFO: renamed from: U */
    protected long f188339U = 0;

    /* JADX INFO: renamed from: V */
    protected int f188340V = 0;

    /* JADX INFO: renamed from: W */
    protected int f188341W = 0;

    /* JADX INFO: renamed from: X */
    public int f188342X = 30;

    /* JADX INFO: renamed from: k0 */
    private lnw f188350k0 = new lnw(5);

    /* JADX INFO: renamed from: E0 */
    private AtomicBoolean f188323E0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l.wc4$a */
    public class RunnableC21062a implements Runnable {
        public RunnableC21062a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wc4.this.f188358r = true;
        }
    }

    /* JADX INFO: renamed from: l.wc4$b */
    public class RunnableC21063b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yuf f188367a;

        public RunnableC21063b(ylg ylgVar, yuf yufVar) {
            this.f188367a = yufVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wc4.m205759e2(wc4.this, null);
            wc4.this.f188322E = this.f188367a;
        }
    }

    /* JADX INFO: renamed from: l.wc4$c */
    public class C21064c implements u410 {
        public C21064c() {
        }

        @Override // p153l.u410
        /* JADX INFO: renamed from: a */
        public void mo139271a() {
            q210.InterfaceC19500a interfaceC19500a = wc4.this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(214, 1, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$d */
    public class C21065d implements ciw.InterfaceC16270h {
        public C21065d() {
        }

        @Override // p153l.ciw.InterfaceC16270h
        /* JADX INFO: renamed from: a */
        public void mo110027a(int i, String str) {
            q210.InterfaceC19500a interfaceC19500a = wc4.this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$e */
    public class C21066e implements Camera.ErrorCallback {
        public C21066e() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            q210.InterfaceC19500a interfaceC19500a = wc4.this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$f */
    public class C21067f implements ciw.InterfaceC16270h {
        public C21067f() {
        }

        @Override // p153l.ciw.InterfaceC16270h
        /* JADX INFO: renamed from: a */
        public void mo110027a(int i, String str) {
            q210.InterfaceC19500a interfaceC19500a = wc4.this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$g */
    public class C21068g implements Camera.ErrorCallback {
        public C21068g() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            q210.InterfaceC19500a interfaceC19500a = wc4.this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$h */
    public class RunnableC21069h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f188374a;

        public RunnableC21069h(byte[] bArr) {
            this.f188374a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            wc4.this.m205770q2(this.f188374a);
        }
    }

    /* JADX INFO: renamed from: l.wc4$i */
    public class RunnableC21070i implements Runnable {
        public RunnableC21070i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                wc4 wc4Var = wc4.this;
                wc4Var.m205764j2(wc4Var.f188356p0);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    wc4.this.f188323E0.set(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$j */
    public class RunnableC21071j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f188377a;

        public RunnableC21071j(byte[] bArr) {
            this.f188377a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wc4.this.f188345f.m143971f() == null) {
                return;
            }
            wc4 wc4Var = wc4.this;
            wc4Var.f188359s++;
            wc4Var.setRenderSize(wc4Var.f188346g.f175478e, wc4.this.f188346g.f175480f);
            int i = wc4.this.f188346g.f175478e * wc4.this.f188346g.f175480f;
            oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", "camera preview width " + wc4.this.f188346g.f175478e + " height " + wc4.this.f188346g.f175480f + "planerSize:" + i + " data length:" + this.f188377a.length);
            ByteBuffer byteBuffer = wc4.this.f103039a;
            if (byteBuffer == null || byteBuffer.limit() < i) {
                wc4.this.f103039a = ByteBuffer.allocateDirect(i);
            }
            ByteBuffer byteBuffer2 = wc4.this.f103040b;
            if (byteBuffer2 == null || byteBuffer2.limit() < i / 2) {
                wc4.this.f103040b = ByteBuffer.allocateDirect(i / 2);
            }
            wc4.this.f103039a.put(this.f188377a, 0, i);
            wc4.this.f103040b.put(this.f188377a, i, i / 2);
            wc4.this.f103039a.position(0);
            wc4.this.f103040b.position(0);
            wc4.this.f188358r = false;
        }
    }

    /* JADX INFO: renamed from: l.wc4$k */
    public static class HandlerC21072k extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<C21073l> f188379a;

        public HandlerC21072k(C21073l c21073l) {
            this.f188379a = new WeakReference<>(c21073l);
        }

        /* JADX INFO: renamed from: a */
        public void m205776a() {
            sendMessage(obtainMessage(3));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            C21073l c21073l = this.f188379a.get();
            if (c21073l != null && i == 3) {
                c21073l.m205778e();
            }
        }
    }

    /* JADX INFO: renamed from: l.wc4$l */
    public class C21073l extends Thread {

        /* JADX INFO: renamed from: a */
        private Object f188380a;

        /* JADX INFO: renamed from: b */
        private boolean f188381b;

        /* JADX INFO: renamed from: c */
        private HandlerC21072k f188382c;

        /* JADX INFO: renamed from: d */
        private wje f188383d;

        public C21073l() {
            super("CameraEGLThread");
            this.f188380a = new Object();
            this.f188381b = false;
            this.f188382c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m205778e() {
            Looper.myLooper().quit();
        }

        /* JADX INFO: renamed from: b */
        public SurfaceTexture m205779b() {
            if (wc4.this.f188326H == null) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                wc4.this.f188325G = iArr[0];
                GLES20.glBindTexture(36197, wc4.this.f188325G);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                wc4.this.f188326H = new SurfaceTexture(wc4.this.f188325G);
                Log.e("CameraNV21PreviewInput", "createTexture: mTextureID:" + wc4.this.f188325G + ", mCameraTexture:" + wc4.this.f188326H);
            }
            return wc4.this.f188326H;
        }

        /* JADX INFO: renamed from: c */
        public HandlerC21072k m205780c() {
            return this.f188382c;
        }

        /* JADX INFO: renamed from: d */
        public void m205781d() {
            if (wc4.this.f188326H != null) {
                wc4.this.f188326H.release();
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture mCameraTexture: " + wc4.this.f188326H);
                wc4.this.f188326H = null;
            }
            if (wc4.this.f188325G != 0) {
                GLES20.glDeleteTextures(1, new int[]{wc4.this.f188325G}, 0);
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture glDeleteTextures: " + wc4.this.f188325G);
                wc4.this.f188325G = 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m205782f() {
            synchronized (this.f188380a) {
                while (!this.f188381b) {
                    try {
                        this.f188380a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f188382c = new HandlerC21072k(this);
            wje wjeVar = new wje();
            this.f188383d = wjeVar;
            wjeVar.m206631b();
            Log.e("CameraNV21PreviewInput", "run: Start");
            this.f188383d.m206637i();
            m205779b();
            synchronized (this.f188380a) {
                this.f188381b = true;
                this.f188380a.notify();
            }
            Looper.loop();
            m205781d();
            this.f188383d.m206638j();
            this.f188382c = null;
            synchronized (this.f188380a) {
                this.f188381b = false;
            }
            Log.e("CameraNV21PreviewInput", "run: Exit");
        }
    }

    public wc4(uow uowVar, q210.InterfaceC19500a interfaceC19500a) {
        this.f188361u = 15L;
        this.f188352m = interfaceC19500a;
        if (uowVar == null) {
            this.f188346g = new tow();
        } else {
            this.f188346g = uowVar;
        }
        this.f188361u = uowVar.f180159D0;
        this.f188345f = new ja4(uowVar, false);
        this.useNewViewPort = true;
        this.f188320C = new v94();
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ ylg m205759e2(wc4 wc4Var, ylg ylgVar) {
        wc4Var.getClass();
        return ylgVar;
    }

    /* JADX INFO: renamed from: i2 */
    private void m205763i2(omw omwVar) {
        if (omwVar.m168299n() <= 0) {
            int i = this.f188331M + 1;
            this.f188331M = i;
            if (i == this.f188355p) {
                this.f188331M = 0;
                if (mo99507e()) {
                    m205768n2();
                    return;
                }
                return;
            }
            return;
        }
        oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("hasFace"));
        if (this.f188330L % this.f188320C.m200377a() == 0) {
            this.f188330L = 0;
            float[] fArrM164785p = omwVar.m168295j(0).m164785p();
            this.f188345f.m143969d(omwVar.f148018e, omwVar.f148019f, fArrM164785p[0], fArrM164785p[1], fArrM164785p[2], fArrM164785p[3], 1.0f);
            u6y.m194722F().m194744W(((fArrM164785p[1] + fArrM164785p[3]) * 0.5f) / omwVar.f148019f, ((fArrM164785p[0] + fArrM164785p[2]) * 0.5f) / omwVar.f148018e);
        }
        this.f188330L++;
        this.f188331M = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public void m205764j2(byte[] bArr) {
        MMJoint[][] mMJointArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f188365z.m196802h(17);
        this.f188365z.m196807m(this.f188346g.f175478e);
        this.f188365z.m196804j(this.f188346g.f175480f);
        this.f188365z.m196801g(bArr);
        this.f188365z.m196800f(bArr.length);
        this.f188365z.m196806l(this.f188346g.f175478e);
        this.f188350k0.m154993A(m205769p2());
        this.f188350k0.m155031z(this.f188345f.m143972g());
        this.f188350k0.m155021p(this.f188345f.m143978m());
        this.f188350k0.m155000H(true);
        if (this.f188344Z == null) {
            this.f188344Z = new BodyLandmarkPostInfo();
        }
        if (!this.f188319B && !TextUtils.isEmpty(this.f188320C.m200379c())) {
            BodyLandHelper.setModelTypeAndPath(this.f188320C.m200388l(), this.f188320C.m200379c());
            this.f188319B = true;
        }
        BodyLandHelper.process(this.f188365z, this.f188350k0, this.f188344Z);
        u6y.m194722F().m194743V(SystemClock.elapsedRealtime() - jElapsedRealtime);
        BodyLandHelper.setBodyInfos(this.f188344Z);
        if (!im80.f115710a || (mMJointArr = this.f188344Z.multi_person_) == null || mMJointArr.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (MMJoint[] mMJointArr2 : this.f188344Z.multi_person_) {
            sb.append("[");
            for (MMJoint mMJoint : mMJointArr2) {
                sb.append("[x = ");
                sb.append(mMJoint.f15478x_);
                sb.append(", y = ");
                sb.append(mMJoint.f15479y_);
                sb.append(", score = ");
                sb.append(mMJoint.score_);
                sb.append("], ");
            }
            sb.append(Constants.AES_SUFFIX);
        }
        t9c.m189745c("mao", sb.toString());
    }

    /* JADX INFO: renamed from: k2 */
    private void m205765k2(omw omwVar) {
        if (this.f188363x <= 65) {
            this.f188338T = 0;
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "faceDetectUse A " + this.f188363x + " mMMCVInfo[0]" + omwVar.m168299n());
        int i = this.f188338T + 1;
        this.f188338T = i;
        if (i > 10) {
            this.f188320C.m200397u(false);
            this.f188338T = 0;
        }
    }

    /* JADX INFO: renamed from: l2 */
    private void m205766l2(byte[] bArr, omw omwVar) {
        tow towVar = this.f188346g;
        if (towVar != null) {
            SegmentHelper.setWidth(towVar.f175478e);
            SegmentHelper.setHeight(this.f188346g.f175480f);
            SegmentHelper.setRotateDegree(m205769p2());
            SegmentHelper.setRestoreDegree(this.f188345f.m143972g());
            SegmentHelper.setIsFrontCamera(this.f188345f.m143978m());
        }
        m205774u2(bArr);
        evf evfVarProcess = FacerigHelper.isUseFacerig() ? FacerigHelper.process(this.f188365z, this.f188318A) : null;
        omwVar.m168287D(evfVarProcess);
        v94 v94Var = this.f188320C;
        if (evfVarProcess == null) {
            List<String> listM200381e = v94Var.m200381e();
            if (this.f188364y == null && listM200381e != null) {
                this.f188364y = new VideoProcessor();
                t9c.m189747e("live_mmcv", "VideoProcessor.Create");
                if (listM200381e.size() >= 2) {
                    this.f188364y.LoadModel(listM200381e.get(0), listM200381e.get(1));
                }
            }
            VideoProcessor videoProcessor = this.f188364y;
            if (videoProcessor != null) {
                videoProcessor.ProcessFrame(this.f188365z.m196796b(), this.f188318A.m155011f(), omwVar.m168304s());
                omwVar.m168290b(v94Var.m200386j());
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m205767m2(byte[] bArr, omw omwVar) {
        m205774u2(bArr);
        omwVar.m168287D(FacerigHelper.process(this.f188365z, this.f188318A));
    }

    /* JADX INFO: renamed from: n2 */
    private void m205768n2() {
        this.f188345f.m143968c();
        u6y.m194722F().m194744W(0.5f, 0.5f);
    }

    /* JADX INFO: renamed from: p2 */
    private final int m205769p2() {
        int i = this.f188346g.f175447D;
        return i == 0 ? this.f188345f.m143972g() : 270 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public void m205770q2(byte[] bArr) {
        long jM182470h;
        if (bArr == null) {
            return;
        }
        synchronized (this.f188351l) {
            try {
                omw omwVar = new omw();
                if (this.f188345f.m143971f() != null && !this.f188358r) {
                    if (System.currentTimeMillis() - this.f188334P > 1000 && this.f188335Q) {
                        this.f188335Q = false;
                        this.f188329K = false;
                        m205768n2();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = this.f188327I;
                    if (i == 0) {
                        jM182470h = this.f188349k.m182470h() != 0 ? 1000 / ((long) this.f188349k.m182470h()) : 66L;
                    } else {
                        jM182470h = 1000 / ((long) i);
                    }
                    long j = this.f188360t;
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 >= jM182470h && !this.f188357q) {
                        if (j == 0 || j2 > 5 * jM182470h) {
                            this.f188360t = System.currentTimeMillis();
                        } else {
                            this.f188360t = j + jM182470h;
                        }
                        this.f188337S = SystemClock.elapsedRealtime();
                        boolean zM200389m = this.f188320C.m200389m();
                        byte[] bArr2 = this.f188343Y;
                        if (bArr2 == null || bArr2.length != bArr.length) {
                            this.f188343Y = new byte[bArr.length];
                        }
                        System.arraycopy(bArr, 0, this.f188343Y, 0, bArr.length);
                        if (zM200389m) {
                            m205766l2(this.f188343Y, omwVar);
                        } else if (FacerigHelper.isUseFacerig()) {
                            m205767m2(this.f188343Y, omwVar);
                        }
                        this.f188363x = SystemClock.elapsedRealtime() - this.f188337S;
                        u6y.m194722F().m194757e0(this.f188363x);
                        if (BodyLandHelper.isUseBodyLand() && this.f188323E0.get()) {
                            byte[] bArr3 = this.f188356p0;
                            if (bArr3 == null || bArr3.length < bArr.length) {
                                this.f188356p0 = new byte[bArr.length];
                            }
                            System.arraycopy(bArr, 0, this.f188356p0, 0, bArr.length);
                            this.f188323E0.set(false);
                            C3949c.m19427d(2, new RunnableC21070i());
                        }
                        m205773t2(omwVar, this.f188343Y);
                        if (omwVar.m168299n() > 0) {
                            u6y.m194722F().m194771l0(true);
                            float[] fArrM164785p = omwVar.m168295j(0).m164785p();
                            u6y u6yVarM194722F = u6y.m194722F();
                            float f = fArrM164785p[0];
                            int i2 = omwVar.f148018e;
                            float f2 = fArrM164785p[1];
                            int i3 = omwVar.f148019f;
                            u6yVarM194722F.m194761g0(f / i2, f2 / i3, fArrM164785p[2] / i2, fArrM164785p[3] / i3);
                        } else {
                            u6y.m194722F().m194771l0(false);
                        }
                        if (this.f188320C.m200377a() > 0) {
                            m205763i2(omwVar);
                        }
                        if (this.f188320C.m200392p()) {
                            m205765k2(omwVar);
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m205772s2(omwVar, this.f188343Y);
                        u6y.m194722F().m194751b0(System.currentTimeMillis() - jCurrentTimeMillis2);
                        if (this.f188322E != null && omwVar.m168297l() != null) {
                            this.f188322E.mo20145a(omwVar.m168297l());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m205771r2() {
        C21073l c21073l = this.f188324F;
        if (c21073l == null || c21073l.m205780c() == null) {
            return;
        }
        this.f188324F.m205780c().m205776a();
        try {
            this.f188324F.join();
        } catch (InterruptedException unused) {
        }
        this.f188324F = null;
    }

    /* JADX INFO: renamed from: s2 */
    private void m205772s2(omw omwVar, byte[] bArr) {
        g510 g510Var = this.f188347i;
        if (g510Var != null) {
            g510Var.m128974A(omwVar, new RunnableC21071j(bArr), new RunnableC21062a());
        }
    }

    /* JADX INFO: renamed from: t2 */
    private void m205773t2(omw omwVar, byte[] bArr) {
        omwVar.m168311z(this.f188345f.m143978m());
        omwVar.m168308w(m205769p2());
        omwVar.m168286C(this.f188345f.m143972g());
        omwVar.m168310y(bArr);
        omwVar.m168288E(this.f188346g.f175478e);
        omwVar.m168284A(this.f188346g.f175480f);
        omwVar.m168309x(this.f188346g.f175447D);
    }

    /* JADX INFO: renamed from: u2 */
    private void m205774u2(byte[] bArr) {
        v94 v94Var = this.f188320C;
        this.f188365z.m196802h(17);
        this.f188365z.m196807m(this.f188346g.f175478e);
        this.f188365z.m196804j(this.f188346g.f175480f);
        this.f188365z.m196801g(ByteBuffer.wrap(bArr).array());
        this.f188365z.m196800f(bArr.length);
        this.f188365z.m196806l(this.f188346g.f175478e);
        this.f188318A.m154993A(m205769p2());
        this.f188318A.m155031z(this.f188345f.m143972g());
        this.f188318A.m155021p(this.f188345f.m143978m());
        this.f188318A.m155005M(v94Var.m200386j());
        this.f188318A.m155003K(v94Var.m200385i());
        this.f188318A.m155004L(v94Var.m200378b());
        this.f188318A.m154995C(v94Var.m200384h());
        this.f188318A.m154996D(v94Var.m200383g());
        this.f188318A.m155022q(v94Var.m200382f());
        this.f188318A.m154999G(v94Var.m200393q());
        this.f188318A.m155013h(true);
        this.f188318A.m155023r(v94Var.m200380d());
        nx3 nx3Var = this.f188321D;
        lnw lnwVar = this.f188318A;
        if (nx3Var == null) {
            lnwVar.m155016k(v94Var.m200390n());
            this.f188318A.m155017l(v94Var.m200391o());
            int iM200386j = v94Var.m200386j();
            lnw lnwVar2 = this.f188318A;
            if (iM200386j == 104) {
                lnwVar2.m154998F(false);
                this.f188318A.m155014i(false);
            } else {
                lnwVar2.m155014i(v94Var.m200387k());
                this.f188318A.m154998F(true);
            }
            this.f188318A.m155019n(false);
            this.f188318A.m155028w(1);
            this.f188318A.m155015j(2);
        } else {
            lnwVar.m155015j(nx3Var.m165059a());
            this.f188318A.m155018m(nx3Var.m165060b());
            this.f188318A.m155024s(nx3Var.m165062d());
            this.f188318A.m155029x(nx3Var.m165063e());
            this.f188318A.m155030y(nx3Var.m165064f());
            this.f188318A.m155025t(nx3Var.m165069k());
            this.f188318A.m155002J(nx3Var.m165072n());
            this.f188318A.m155001I(nx3Var.m165071m());
            this.f188318A.m155016k(nx3Var.m165066h() & v94Var.m200390n());
            this.f188318A.m155017l(nx3Var.m165067i() & v94Var.m200391o());
            int iM200386j2 = v94Var.m200386j();
            lnw lnwVar3 = this.f188318A;
            if (iM200386j2 == 104) {
                lnwVar3.m154998F(false);
                this.f188318A.m155014i(false);
            } else {
                lnwVar3.m154998F(nx3Var.m165070l());
                this.f188318A.m155014i(nx3Var.m165065g());
            }
            this.f188318A.m155019n(nx3Var.m165068j());
            this.f188318A.m155020o(nx3Var.m165061c());
        }
        this.f188318A.m154994B(false);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: B */
    public void mo99490B(row rowVar) {
        q210.InterfaceC19500a interfaceC19500a;
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resetCamera");
        this.f188349k = rowVar;
        g510 g510Var = this.f188347i;
        if (g510Var != null) {
            g510Var.m128990i(new C21064c());
            this.f188347i.m128977D();
        }
        if (this.f188345f != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "resetCamera\r\nvideoWidth:" + this.f188346g.f175506s + ",videoHeight:" + this.f188346g.f175508t + ",visualWidth:" + this.f188346g.f175510u + ",visualHeight:" + this.f188346g.f175511v + ",encodeWidth:" + this.f188346g.f175494m + ",encodeHeight:" + this.f188346g.f175496n + ",videoBitrate:" + this.f188346g.f175451H + ",audioBitrate:" + this.f188346g.f175462S + ",videoFPS:" + this.f188346g.f175449F + ",targetWidth" + this.f188349k.m182468f().m122180b() + ",targetHeight" + this.f188349k.m182468f().m122179a() + ", renderFps" + this.f188349k.m182470h() + ", degree" + this.f188328J);
            this.f188345f.m143982s(this.f188328J, this.f188349k);
            this.f188345f.m143987x(new C21065d());
            this.f188345f.m143988y(new C21066e());
        }
        this.f188358r = false;
        m205775o2();
        if (this.f188345f.m143965B(this.f188326H) || (interfaceC19500a = this.f188352m) == null) {
            return;
        }
        interfaceC19500a.mo165950g(16640, -1, 0, this);
    }

    @Override // p153l.ja4.InterfaceC17902a
    /* JADX INFO: renamed from: D */
    public void mo143990D(byte[] bArr) {
        u6y.m194722F().m194735N();
        if (this.f188346g.f175483g0) {
            m205770q2(bArr);
        } else {
            m205770q2(bArr);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E */
    public void mo99491E(int i, row rowVar) {
        q210.InterfaceC19500a interfaceC19500a;
        q210.InterfaceC19500a interfaceC19500a2;
        this.f188349k = rowVar;
        this.f188357q = false;
        this.f188335Q = true;
        this.f188328J = i;
        try {
            if (this.f188345f.m143966C(i, rowVar) && (interfaceC19500a2 = this.f188352m) != null) {
                interfaceC19500a2.mo165950g(16640, -5, 0, this);
            }
        } catch (Error unused) {
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "startPreview degree:" + i);
        this.f188349k = rowVar;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "switchCamera line: 551 videoWidth:" + this.f188346g.f175506s + ",videoHeight:" + this.f188346g.f175508t + ",visualWidth:" + this.f188346g.f175510u + ",visualHeight:" + this.f188346g.f175511v + ",encodeWidth:" + this.f188346g.f175494m + ",encodeHeight:" + this.f188346g.f175496n + ",videoBitrate:" + this.f188346g.f175451H + ",audioBitrate:" + this.f188346g.f175462S + ",videoFPS:" + this.f188346g.f175449F + ",targetWidth" + rowVar.m182468f().m122180b() + ",targetHeight" + rowVar.m182468f().m122179a() + ", mCurrentDegree" + i + ", renderFps" + this.f188349k.m182470h());
        tow towVar = this.f188346g;
        CameraUtil.reScaleSize(new erf0(towVar.f175478e, towVar.f175480f), new erf0(9, 16), this.f188345f.m143972g());
        if (this.f188353n != null) {
            Handler handler = this.f188354o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f188353n.quit();
            HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
            this.f188353n = handlerThread;
            handlerThread.start();
            this.f188354o = new Handler(this.f188353n.getLooper());
        }
        this.f188362v = this.f188346g.f175506s / 12;
        boolean zM143978m = this.f188345f.m143978m();
        ja4 ja4Var = this.f188345f;
        if (zM143978m) {
            changeCurRotation(360 - ja4Var.m143972g());
            flipPosition(2);
        } else {
            changeCurRotation(ja4Var.m143972g());
            flipPosition(1);
        }
        this.f188358r = false;
        if (!this.f188345f.m143965B(this.f188326H) && (interfaceC19500a = this.f188352m) != null) {
            interfaceC19500a.mo165950g(16640, -1, 0, this);
        }
        u6y.m194722F().m194745X(this.f188345f.m143978m() ? 1 : 0);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E1 */
    public boolean mo99492E1(int i, row rowVar) {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "startPreview");
        this.f188357q = false;
        this.f188349k = rowVar;
        if (this.f188345f.m143971f() == null) {
            this.f188345f.m143977l(this.f188346g, false);
        }
        this.f188345f.m143989z(this);
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startPreview(int degree, MRConfig mrConfig)\r\nvideoWidth:" + this.f188346g.f175506s + ",videoHeight:" + this.f188346g.f175508t + ",visualWidth:" + this.f188346g.f175510u + ",visualHeight:" + this.f188346g.f175511v + ",encodeWidth:" + this.f188346g.f175494m + ",encodeHeight:" + this.f188346g.f175496n + ",videoBitrate:" + this.f188346g.f175451H + ",audioBitrate:" + this.f188346g.f175462S + ",videoFPS:" + this.f188346g.f175449F + ",targetWidth" + rowVar.m182468f().m122180b() + ",targetHeight" + rowVar.m182468f().m122179a() + ", mCurrentDegree" + i + ", renderFps" + this.f188349k.m182470h());
        this.f188328J = i;
        oq70 oq70VarM168791d = oq70.m168791d();
        StringBuilder sb = new StringBuilder("startPreview degree:");
        sb.append(i);
        oq70VarM168791d.m168793a("Pipeline_Normal_pip->PIPLINE", sb.toString());
        this.f188345f.m143984u(l26.f129743a);
        if (!this.f188345f.m143980p(i, rowVar)) {
            Log4Cam.m7376e("Camera prepare Failed!");
            q210.InterfaceC19500a interfaceC19500a = this.f188352m;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(16640, -4, 0, this);
            }
            return false;
        }
        this.f188345f.m143987x(new C21067f());
        this.f188345f.m143988y(new C21068g());
        if (this.f188353n != null) {
            Handler handler = this.f188354o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f188353n.quit();
        }
        HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
        this.f188353n = handlerThread;
        handlerThread.start();
        this.f188354o = new Handler(this.f188353n.getLooper());
        this.f188345f.m143985v(this);
        this.f188362v = this.f188346g.f175506s / 12;
        m205775o2();
        tow towVar = this.f188346g;
        CameraUtil.reScaleSize(new erf0(towVar.f175478e, towVar.f175480f), new erf0(9, 16), this.f188345f.m143972g());
        boolean zM143978m = this.f188345f.m143978m();
        ja4 ja4Var = this.f188345f;
        if (zM143978m) {
            changeCurRotation(360 - ja4Var.m143972g());
            flipPosition(2);
        } else {
            changeCurRotation(ja4Var.m143972g());
            flipPosition(1);
        }
        this.f188358r = false;
        this.f188345f.m143965B(this.f188326H);
        u6y.m194722F().m194745X(this.f188345f.m143978m() ? 1 : 0);
        u6y.m194722F().m194746Y(this.f188346g.f175491k0);
        u6y u6yVarM194722F = u6y.m194722F();
        tow towVar2 = this.f188346g;
        u6yVarM194722F.m194777o0(towVar2.f175464U, towVar2.f175463T);
        u6y.m194722F().m194781q0(this.f188346g.f175483g0 ? 1 : 0);
        return true;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: I */
    public void mo99493I(boolean z) {
        this.f188320C.m200402z(z);
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: I0 */
    public long mo121925I0() {
        return this.f188359s;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: J1 */
    public void mo99494J1(v94 v94Var) {
        this.f188320C = v94Var;
    }

    @Override // p153l.aql, p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        this.f188347i = g510Var;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: N */
    public void mo99496N() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 1");
        this.f188345f.m143979o();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: R */
    public void mo99498R(nx3 nx3Var) {
        this.f188321D = nx3Var;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: S */
    public void mo99499S(boolean z) {
        this.f188320C.m200372B(z);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: T */
    public void mo99500T(boolean z) {
        this.f188320C.m200397u(z);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Z */
    public void mo99501Z(int i) {
        this.f188327I = i;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a */
    public void mo99502a() {
        if (this.f188345f != null) {
            synchronized (this.f188351l) {
                try {
                    oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "stopPreview");
                    this.f188345f.m143981r();
                    this.f188359s = 0;
                    if (this.f188353n != null) {
                        Handler handler = this.f188354o;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            this.f188354o = null;
                        }
                        this.f188353n.quit();
                        this.f188353n = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VideoProcessor videoProcessor = this.f188364y;
        if (videoProcessor != null) {
            videoProcessor.Release();
            t9c.m189747e("live_mmcv", "stopPreview: VideoProcessor.Release");
            this.f188364y = null;
        }
        BodyLandHelper.release();
        this.f188319B = false;
        m205771r2();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a1 */
    public v94 mo99503a1() {
        return this.f188320C;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: b */
    public void mo99504b(int i) {
        this.f188345f.m143964A(i);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: c */
    public int mo99505c() {
        return this.f188345f.m143975j();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: d */
    public int mo99506d() {
        return this.f188345f.m143973h();
    }

    @Override // p153l.gb20, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: e */
    public boolean mo99507e() {
        return this.f188345f.m143978m();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: g */
    public int mo99508g() {
        return this.f188345f.m143976k();
    }

    @Override // p153l.gb20, p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){vec3 rgb;vec3 yuv;yuv.r = texture2D(SamplerY, coordinate).r - (16.0/255.0);\nyuv.g = texture2D(SamplerUV, coordinate).a - 0.5;\nyuv.b = texture2D(SamplerUV, coordinate).r - 0.5;\n mat3 colorConvertion = mat3(1.164, 1.164, 1.164,\n                             0.0, -0.392, 2.017,\n                             1.596, -0.813, 0.0);\n rgb = colorConvertion * yuv;   gl_FragColor = vec4(rgb, 1.0);\n}";
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: h */
    public int mo99509h() {
        return this.f188345f.m143974i();
    }

    @Override // p153l.gb20, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: k */
    public void mo99510k(boolean z) {
        this.f188320C.m200398v(z);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: l */
    public void mo99511l(List<String> list) {
        this.f188320C.m200401y(list);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: m */
    public void mo99512m(int i) {
        if (i < 0) {
            return;
        }
        this.f188320C.m200394r(i);
    }

    /* JADX INFO: renamed from: o2 */
    public SurfaceTexture m205775o2() {
        SurfaceTexture surfaceTexture;
        if (this.f188324F != null && this.f188325G > 0 && (surfaceTexture = this.f188326H) != null) {
            return surfaceTexture;
        }
        C21073l c21073l = new C21073l();
        this.f188324F = c21073l;
        c21073l.start();
        this.f188324F.m205782f();
        return this.f188326H;
    }

    @Override // p153l.xpl.InterfaceC21407a
    public void onData(byte[] bArr) {
        Handler handler;
        if (this.f188345f.m143971f() == null || bArr == null) {
            return;
        }
        u6y.m194722F().m194735N();
        if (this.f188353n == null || (handler = this.f188354o) == null) {
            return;
        }
        handler.post(new RunnableC21069h(bArr));
    }

    @Override // p153l.gb20, p153l.wej
    public void onDrawFrame() {
        markAsDirty();
        super.onDrawFrame();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: q */
    public void mo99513q(float f) {
        this.f188320C.m200375E(f);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: r */
    public void mo99514r() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 1");
        synchronized (this.f188351l) {
            try {
                if (this.f188353n != null) {
                    Handler handler = this.f188354o;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f188354o = null;
                    }
                    this.f188353n.quit();
                    this.f188353n = null;
                }
                this.f188345f.m143981r();
                m205771r2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: s */
    public void mo99515s(int i) {
        this.f188320C.m200400x(i);
    }

    @Override // p153l.itl
    /* JADX INFO: renamed from: s1 */
    public void mo139270s1(ylg ylgVar, yuf yufVar) {
        if (this.f188353n == null || Looper.myLooper() == this.f188353n.getLooper()) {
            this.f188322E = yufVar;
        } else {
            this.f188354o.post(new RunnableC21063b(ylgVar, yufVar));
        }
    }

    @Override // p153l.aql
    public void setExposureCompensation(int i) {
        this.f188345f.m143986w(i);
    }

    @Override // p153l.aql
    public void setWarpType(int i) {
        this.f188320C.m200376F(i);
        if (i < 5 || i > 8) {
            return;
        }
        this.f188320C.m200374D(true);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: u */
    public void mo99516u(int i) {
        this.f188320C.m200371A(i);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: v */
    public void mo99517v(float f) {
        this.f188320C.m200396t(f);
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: v1 */
    public long mo121926v1() {
        return 0L;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: w */
    public void mo99518w(boolean z) {
        this.f188320C.m200399w(z);
    }

    @Override // p153l.hql
    /* JADX INFO: renamed from: x */
    public erf0 mo136684x(int i, int i2) {
        tow towVar = this.f188346g;
        return CameraUtil.rescalAspectRatio(new erf0(towVar.f175478e, towVar.f175480f), this.f188345f.m143972g(), new erf0(i, i2));
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: z */
    public void mo99519z() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "resumePreview line 628:videoWidth:" + this.f188346g.f175506s + ",videoHeight:" + this.f188346g.f175508t + ",visualWidth:" + this.f188346g.f175510u + ",visualHeight:" + this.f188346g.f175511v + ",encodeWidth:" + this.f188346g.f175494m + ",encodeHeight:" + this.f188346g.f175496n + ",videoBitrate:" + this.f188346g.f175451H + ",audioBitrate:" + this.f188346g.f175462S + ",videoFPS:" + this.f188346g.f175449F + ",targetWidth" + this.f188349k.m182468f().m122180b() + ",targetHeight" + this.f188349k.m182468f().m122179a() + ", renderFps" + this.f188349k.m182470h() + ", degree" + this.f188328J);
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview");
        if (this.f188345f.m143971f() != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 1");
            this.f188345f.m143983t();
        } else {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 2");
            mo99492E1(this.f188328J, this.f188349k);
        }
    }

    @Override // p153l.xpl.InterfaceC21410d
    /* JADX INFO: renamed from: G */
    public void mo139266G() {
    }

    @Override // p153l.hql
    /* JADX INFO: renamed from: M */
    public void mo136683M() {
    }

    @Override // p153l.z5m
    public gfj getInput() {
        return this;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Q */
    public void mo99497Q(ib4.InterfaceC17689l interfaceC17689l) {
    }

    @Override // p153l.xpl.InterfaceC21410d
    /* JADX INFO: renamed from: V */
    public void mo139267V(Camera camera) {
    }
}
