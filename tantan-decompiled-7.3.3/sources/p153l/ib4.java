package p153l;

import android.graphics.Rect;
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
import com.immomo.momomediaext.sei.BaseSei;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.videoprocessor.VideoProcessor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class ib4 extends gb20 implements xpl.InterfaceC21407a, xpl.InterfaceC21410d, hql {

    /* JADX INFO: renamed from: A */
    private VideoProcessor f113655A;

    /* JADX INFO: renamed from: D */
    private boolean f113658D;

    /* JADX INFO: renamed from: E */
    private v94 f113659E;

    /* JADX INFO: renamed from: F */
    private nx3 f113661F;

    /* JADX INFO: renamed from: G */
    private yuf f113662G;

    /* JADX INFO: renamed from: L */
    private int f113667L;

    /* JADX INFO: renamed from: M */
    private int f113668M;

    /* JADX INFO: renamed from: T */
    private long f113675T;

    /* JADX INFO: renamed from: Y */
    private byte[] f113680Y;

    /* JADX INFO: renamed from: Z */
    private BodyLandmarkPostInfo f113681Z;

    /* JADX INFO: renamed from: f */
    private xpl f113682f;

    /* JADX INFO: renamed from: g */
    private Camera f113683g;

    /* JADX INFO: renamed from: i */
    private tow f113684i;

    /* JADX INFO: renamed from: j */
    private g510 f113685j;

    /* JADX INFO: renamed from: l */
    private row f113688l;

    /* JADX INFO: renamed from: m */
    private xpl.InterfaceC21410d f113689m;

    /* JADX INFO: renamed from: o */
    q210.InterfaceC19500a f113691o;

    /* JADX INFO: renamed from: p0 */
    private byte[] f113693p0;

    /* JADX INFO: renamed from: x */
    private long f113700x;

    /* JADX INFO: renamed from: k */
    private boolean f113686k = false;

    /* JADX INFO: renamed from: n */
    private Object f113690n = new Object();

    /* JADX INFO: renamed from: p */
    private HandlerThread f113692p = null;

    /* JADX INFO: renamed from: q */
    private Handler f113694q = null;

    /* JADX INFO: renamed from: r */
    private int f113695r = 200;

    /* JADX INFO: renamed from: s */
    private boolean f113696s = false;

    /* JADX INFO: renamed from: t */
    private boolean f113697t = false;

    /* JADX INFO: renamed from: u */
    int f113698u = 0;

    /* JADX INFO: renamed from: v */
    private long f113699v = 0;

    /* JADX INFO: renamed from: y */
    int f113701y = 60;

    /* JADX INFO: renamed from: z */
    long f113702z = 0;

    /* JADX INFO: renamed from: B */
    private umw f113656B = new umw();

    /* JADX INFO: renamed from: C */
    private lnw f113657C = new lnw(1);

    /* JADX INFO: renamed from: H */
    C17688k f113663H = null;

    /* JADX INFO: renamed from: I */
    private int f113664I = 0;

    /* JADX INFO: renamed from: J */
    private SurfaceTexture f113665J = null;

    /* JADX INFO: renamed from: K */
    private InterfaceC17689l f113666K = null;

    /* JADX INFO: renamed from: N */
    boolean f113669N = false;

    /* JADX INFO: renamed from: O */
    Rect f113670O = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: P */
    int f113671P = 0;

    /* JADX INFO: renamed from: Q */
    int f113672Q = 0;

    /* JADX INFO: renamed from: R */
    int f113673R = 0;

    /* JADX INFO: renamed from: S */
    int f113674S = 0;

    /* JADX INFO: renamed from: U */
    private boolean f113676U = false;

    /* JADX INFO: renamed from: V */
    private Object f113677V = new Object();

    /* JADX INFO: renamed from: W */
    private long f113678W = 0;

    /* JADX INFO: renamed from: X */
    private int f113679X = 0;

    /* JADX INFO: renamed from: k0 */
    private lnw f113687k0 = new lnw(5);

    /* JADX INFO: renamed from: E0 */
    private AtomicBoolean f113660E0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l.ib4$a */
    public class RunnableC17678a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yuf f113703a;

        public RunnableC17678a(ylg ylgVar, yuf yufVar) {
            this.f113703a = yufVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ib4.m139249e2(ib4.this, null);
            ib4.this.f113662G = this.f113703a;
        }
    }

    /* JADX INFO: renamed from: l.ib4$b */
    public class C17679b implements u410 {
        public C17679b() {
        }

        @Override // p153l.u410
        /* JADX INFO: renamed from: a */
        public void mo139271a() {
            q210.InterfaceC19500a interfaceC19500a = ib4.this.f113691o;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(214, 1, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$c */
    public class C17680c implements Camera.ErrorCallback {
        public C17680c() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            if (ib4.this.f113691o != null) {
                b7y.m102882c().m102888g("line 391 error" + i);
                ib4.this.f113691o.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$d */
    public class C17681d implements xpl.InterfaceC21409c {
        public C17681d() {
        }

        @Override // p153l.xpl.InterfaceC21409c
        public void onFail(int i, String str) {
            if (i != 4005) {
                b7y.m102882c().m102888g("CameraNV21PreviewInput", "camera fail error code === " + i + " info === " + str);
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$e */
    public class C17682e implements Camera.ErrorCallback {
        public C17682e() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            if (ib4.this.f113691o != null) {
                b7y.m102882c().m102888g("line 468 error" + i);
                ib4.this.f113691o.mo165950g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$f */
    public class RunnableC17683f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f113709a;

        public RunnableC17683f(byte[] bArr) {
            this.f113709a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ib4.this.m139239D(this.f113709a);
        }
    }

    /* JADX INFO: renamed from: l.ib4$g */
    public class RunnableC17684g implements Runnable {
        public RunnableC17684g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ib4 ib4Var = ib4.this;
                ib4Var.m139254j2(ib4Var.f113693p0);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    ib4.this.f113660E0.set(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$h */
    public class RunnableC17685h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f113712a;

        public RunnableC17685h(byte[] bArr) {
            this.f113712a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ib4.this.f113682f == null) {
                    return;
                }
                ib4 ib4Var = ib4.this;
                ib4Var.f113698u++;
                ib4Var.setRenderSize(ib4Var.f113684i.f175478e, ib4.this.f113684i.f175480f);
                int i = ib4.this.f113684i.f175478e * ib4.this.f113684i.f175480f;
                oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", "camera preview width " + ib4.this.f113684i.f175478e + " height " + ib4.this.f113684i.f175480f + "planerSize:" + i + " data length:" + this.f113712a.length);
                ByteBuffer byteBuffer = ib4.this.f103039a;
                if (byteBuffer == null || byteBuffer.limit() < i) {
                    ib4.this.f103039a = ByteBuffer.allocateDirect(i);
                }
                ByteBuffer byteBuffer2 = ib4.this.f103040b;
                if (byteBuffer2 == null || byteBuffer2.limit() < i / 2) {
                    ib4.this.f103040b = ByteBuffer.allocateDirect(i / 2);
                }
                ib4.this.f103039a.put(this.f113712a, 0, i);
                ib4.this.f103040b.put(this.f113712a, i, i / 2);
                ib4.this.f103039a.position(0);
                ib4.this.f103040b.position(0);
                ib4.this.f113697t = false;
            } catch (Exception unused) {
                ib4.this.f113697t = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$i */
    public class RunnableC17686i implements Runnable {
        public RunnableC17686i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ib4.this.f113697t = true;
        }
    }

    /* JADX INFO: renamed from: l.ib4$j */
    public static class HandlerC17687j extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<C17688k> f113715a;

        public HandlerC17687j(C17688k c17688k) {
            this.f113715a = new WeakReference<>(c17688k);
        }

        /* JADX INFO: renamed from: a */
        public void m139272a() {
            sendMessage(obtainMessage(3));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            C17688k c17688k = this.f113715a.get();
            if (c17688k != null && i == 3) {
                c17688k.m139274e();
            }
        }
    }

    /* JADX INFO: renamed from: l.ib4$k */
    public class C17688k extends Thread {

        /* JADX INFO: renamed from: a */
        private Object f113716a;

        /* JADX INFO: renamed from: b */
        private boolean f113717b;

        /* JADX INFO: renamed from: c */
        private HandlerC17687j f113718c;

        /* JADX INFO: renamed from: d */
        private wje f113719d;

        public C17688k() {
            super("CameraEGLThread");
            this.f113716a = new Object();
            this.f113717b = false;
            this.f113718c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m139274e() {
            Looper.myLooper().quit();
        }

        /* JADX INFO: renamed from: b */
        public SurfaceTexture m139275b() {
            if (ib4.this.f113665J == null) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                ib4.this.f113664I = iArr[0];
                GLES20.glBindTexture(36197, ib4.this.f113664I);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                ib4.this.f113665J = new SurfaceTexture(ib4.this.f113664I);
                Log.e("CameraNV21PreviewInput", "createTexture: mTextureID:" + ib4.this.f113664I + ", mCameraTexture:" + ib4.this.f113665J);
            }
            return ib4.this.f113665J;
        }

        /* JADX INFO: renamed from: c */
        public HandlerC17687j m139276c() {
            return this.f113718c;
        }

        /* JADX INFO: renamed from: d */
        public void m139277d() {
            if (ib4.this.f113665J != null) {
                ib4.this.f113665J.release();
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture mCameraTexture: " + ib4.this.f113665J);
                ib4.this.f113665J = null;
            }
            if (ib4.this.f113664I != 0) {
                GLES20.glDeleteTextures(1, new int[]{ib4.this.f113664I}, 0);
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture glDeleteTextures: " + ib4.this.f113664I);
                ib4.this.f113664I = 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m139278f() {
            synchronized (this.f113716a) {
                while (!this.f113717b) {
                    try {
                        this.f113716a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f113718c = new HandlerC17687j(this);
            wje wjeVar = new wje();
            this.f113719d = wjeVar;
            wjeVar.m206631b();
            Log.e("CameraNV21PreviewInput", "run: Start");
            this.f113719d.m206637i();
            m139275b();
            synchronized (this.f113716a) {
                this.f113717b = true;
                this.f113716a.notify();
            }
            Looper.loop();
            m139277d();
            this.f113719d.m206638j();
            this.f113718c = null;
            synchronized (this.f113716a) {
                this.f113717b = false;
            }
            Log.e("CameraNV21PreviewInput", "run: Exit");
        }
    }

    /* JADX INFO: renamed from: l.ib4$l */
    public interface InterfaceC17689l {
        /* JADX INFO: renamed from: K */
        void mo20146K(byte[] bArr, int i, int i2);
    }

    public ib4(uow uowVar, q210.InterfaceC19500a interfaceC19500a) {
        this.f113700x = 15L;
        this.f113691o = interfaceC19500a;
        if (uowVar == null) {
            this.f113684i = new tow();
        } else {
            this.f113684i = uowVar;
        }
        this.f113700x = uowVar.f180159D0;
        this.f113682f = new biw(this.f113684i);
        this.useNewViewPort = true;
        this.f113659E = new v94();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m139239D(byte[] bArr) {
        long jM182470h;
        if (bArr == null) {
            return;
        }
        InterfaceC17689l interfaceC17689l = this.f113666K;
        if (interfaceC17689l != null) {
            tow towVar = this.f113684i;
            interfaceC17689l.mo20146K(bArr, towVar.f175478e, towVar.f175480f);
        }
        synchronized (this.f113690n) {
            try {
                if (this.f113682f != null && !this.f113697t) {
                    if (System.currentTimeMillis() - this.f113675T > 1000 && this.f113676U) {
                        this.f113676U = false;
                        this.f113669N = false;
                        m139258n2();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = this.f113667L;
                    if (i == 0) {
                        jM182470h = this.f113688l.m182470h() != 0 ? 1000 / ((long) this.f113688l.m182470h()) : 66L;
                    } else {
                        jM182470h = 1000 / ((long) i);
                    }
                    long j = this.f113699v;
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 >= jM182470h && !this.f113696s) {
                        if (j == 0 || j2 > 5 * jM182470h) {
                            this.f113699v = System.currentTimeMillis();
                        } else {
                            this.f113699v = j + jM182470h;
                        }
                        this.f113678W = SystemClock.elapsedRealtime();
                        omw omwVar = new omw();
                        boolean zM200389m = this.f113659E.m200389m();
                        byte[] bArr2 = this.f113680Y;
                        if (bArr2 == null || bArr2.length != bArr.length) {
                            this.f113680Y = new byte[bArr.length];
                        }
                        System.arraycopy(bArr, 0, this.f113680Y, 0, bArr.length);
                        if (zM200389m) {
                            m139256l2(this.f113680Y, omwVar);
                        } else if (FacerigHelper.isUseFacerig()) {
                            m139257m2(this.f113680Y, omwVar);
                        }
                        this.f113702z = SystemClock.elapsedRealtime() - this.f113678W;
                        u6y.m194722F().m194757e0(this.f113702z);
                        if (BodyLandHelper.isUseBodyLand() && this.f113660E0.get()) {
                            byte[] bArr3 = this.f113693p0;
                            if (bArr3 == null || bArr3.length < bArr.length) {
                                this.f113693p0 = new byte[bArr.length];
                            }
                            System.arraycopy(bArr, 0, this.f113693p0, 0, bArr.length);
                            this.f113660E0.set(false);
                            C3949c.m19427d(2, new RunnableC17684g());
                        }
                        m139264v2(omwVar, this.f113680Y);
                        if (omwVar.m168299n() > 0) {
                            u6y.m194722F().m194771l0(true);
                            float[] fArrM164785p = omwVar.m168295j(0).m164785p();
                            u6y u6yVarM194722F = u6y.m194722F();
                            float f = fArrM164785p[0];
                            int i2 = omwVar.f148018e;
                            float f2 = fArrM164785p[1];
                            int i3 = omwVar.f148019f;
                            u6yVarM194722F.m194761g0(f / i2, f2 / i3, fArrM164785p[2] / i2, fArrM164785p[3] / i3);
                            float[] fArrM164775c = omwVar.m168295j(0).m164775c();
                            u6y.m194722F().m194759f0(fArrM164775c[2], fArrM164775c[1], fArrM164775c[0]);
                        } else {
                            u6y.m194722F().m194771l0(false);
                        }
                        if (this.f113659E.m200377a() > 0) {
                            m139253i2(omwVar);
                        }
                        if (this.f113659E.m200392p()) {
                            m139255k2(omwVar);
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m139263u2(omwVar, this.f113680Y);
                        u6y.m194722F().m194751b0(System.currentTimeMillis() - jCurrentTimeMillis2);
                        if (this.f113662G != null && omwVar.m168297l() != null) {
                            this.f113662G.mo20145a(omwVar.m168297l());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ ylg m139249e2(ib4 ib4Var, ylg ylgVar) {
        ib4Var.getClass();
        return ylgVar;
    }

    /* JADX INFO: renamed from: i2 */
    private void m139253i2(omw omwVar) {
        ib4 ib4Var;
        if (omwVar.m168299n() <= 0) {
            int i = this.f113672Q + 1;
            this.f113672Q = i;
            if (i == this.f113695r) {
                this.f113672Q = 0;
                if (mo99507e()) {
                    m139258n2();
                    return;
                }
                return;
            }
            return;
        }
        oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("hasFace"));
        if (this.f113671P % this.f113659E.m200377a() == 0) {
            this.f113671P = 0;
            float[] fArrM164785p = omwVar.m168295j(0).m164785p();
            float f = omwVar.f148018e;
            float f2 = omwVar.f148019f;
            float f3 = fArrM164785p[0];
            float f4 = fArrM164785p[1];
            ib4Var = this;
            ib4Var.m139259o2(f, f2, f3, f4, f3, f4, 1.0f);
            u6y.m194722F().m194744W((((fArrM164785p[0] * 2.0f) + fArrM164785p[2]) * 0.5f) / omwVar.f148018e, (((fArrM164785p[1] * 2.0f) + fArrM164785p[3]) * 0.5f) / omwVar.f148019f);
        } else {
            ib4Var = this;
        }
        ib4Var.f113671P++;
        ib4Var.f113672Q = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public void m139254j2(byte[] bArr) {
        MMJoint[][] mMJointArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f113656B.m196802h(17);
        this.f113656B.m196807m(this.f113684i.f175478e);
        this.f113656B.m196804j(this.f113684i.f175480f);
        this.f113656B.m196801g(bArr);
        this.f113656B.m196800f(bArr.length);
        this.f113656B.m196806l(this.f113684i.f175478e);
        this.f113687k0.m154993A(m139260r2());
        this.f113687k0.m155031z(this.f113682f.mo104571m());
        this.f113687k0.m155021p(this.f113682f.mo104568i());
        this.f113687k0.m155000H(true);
        if (this.f113681Z == null) {
            this.f113681Z = new BodyLandmarkPostInfo();
        }
        if (!this.f113658D && !TextUtils.isEmpty(this.f113659E.m200379c())) {
            BodyLandHelper.setModelTypeAndPath(this.f113659E.m200388l(), this.f113659E.m200379c());
            this.f113658D = true;
        }
        BodyLandHelper.process(this.f113656B, this.f113687k0, this.f113681Z);
        u6y.m194722F().m194743V(SystemClock.elapsedRealtime() - jElapsedRealtime);
        BodyLandHelper.setBodyInfos(this.f113681Z);
        if (!im80.f115710a || (mMJointArr = this.f113681Z.multi_person_) == null || mMJointArr.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (MMJoint[] mMJointArr2 : this.f113681Z.multi_person_) {
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
    private void m139255k2(omw omwVar) {
        if (this.f113702z <= 65) {
            this.f113679X = 0;
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "faceDetectUse A " + this.f113702z + " mMMCVInfo[0]" + omwVar.m168299n());
        int i = this.f113679X + 1;
        this.f113679X = i;
        if (i > 10) {
            this.f113659E.m200397u(false);
            this.f113679X = 0;
        }
    }

    /* JADX INFO: renamed from: l2 */
    private void m139256l2(byte[] bArr, omw omwVar) {
        tow towVar = this.f113684i;
        if (towVar != null) {
            SegmentHelper.setWidth(towVar.f175478e);
            SegmentHelper.setHeight(this.f113684i.f175480f);
            SegmentHelper.setRotateDegree(m139260r2());
            SegmentHelper.setRestoreDegree(this.f113682f.mo104571m());
            SegmentHelper.setIsFrontCamera(this.f113682f.mo104568i());
        }
        m139265w2(bArr);
        evf evfVarProcess = FacerigHelper.isUseFacerig() ? FacerigHelper.process(this.f113656B, this.f113657C) : null;
        omwVar.m168287D(evfVarProcess);
        v94 v94Var = this.f113659E;
        if (evfVarProcess == null) {
            List<String> listM200381e = v94Var.m200381e();
            if (this.f113655A == null && listM200381e != null) {
                this.f113655A = new VideoProcessor();
                t9c.m189747e("live_mmcv", "VideoProcessor.Create" + listM200381e.size());
                if (listM200381e.size() >= 2) {
                    this.f113655A.LoadModel(listM200381e.get(0), listM200381e.get(1));
                }
            }
            VideoProcessor videoProcessor = this.f113655A;
            if (videoProcessor != null) {
                videoProcessor.ProcessFrame(this.f113656B.m196796b(), this.f113657C.m155011f(), omwVar.m168304s());
                omwVar.m168290b(v94Var.m200386j());
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m139257m2(byte[] bArr, omw omwVar) {
        m139265w2(bArr);
        omwVar.m168287D(FacerigHelper.process(this.f113656B, this.f113657C));
    }

    /* JADX INFO: renamed from: n2 */
    private void m139258n2() {
        if (this.f113682f != null && !this.f113669N) {
            int i = this.f113701y;
            m139268p2(new Rect(-i, -i, i, i), null);
            this.f113669N = true;
        }
        u6y.m194722F().m194744W(0.5f, 0.5f);
    }

    /* JADX INFO: renamed from: o2 */
    private void m139259o2(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        if (f4 <= 0.0f) {
            f4 = 0.0f;
        }
        if (f5 > f) {
            f5 = f;
        }
        if (f6 > f2) {
            f6 = f2;
        }
        m139268p2(new Rect((int) (((f3 * 2000.0f) / f) - 1000.0f), (int) (((f4 * 2000.0f) / f2) - 1000.0f), (int) (((f5 * 2000.0f) / f) - 1000.0f), (int) (((f6 * 2000.0f) / f2) - 1000.0f)), null);
    }

    /* JADX INFO: renamed from: r2 */
    private final int m139260r2() {
        int i = this.f113684i.f175447D;
        return i == 0 ? this.f113682f.mo104571m() : 270 - i;
    }

    /* JADX INFO: renamed from: s2 */
    private boolean m139261s2(Rect rect, Rect rect2) {
        return Math.abs(((float) rect2.width()) - ((float) rect.width())) > ((float) this.f113701y) || Math.abs(((float) rect2.height()) - ((float) rect.height())) > ((float) this.f113701y) || Math.abs(rect.left - rect2.left) > this.f113701y || Math.abs(rect.right - rect2.right) > this.f113701y || Math.abs(rect.top - rect2.top) > this.f113701y || Math.abs(rect.bottom - rect2.bottom) > this.f113701y;
    }

    /* JADX INFO: renamed from: t2 */
    private void m139262t2() {
        C17688k c17688k = this.f113663H;
        if (c17688k == null || c17688k.m139276c() == null) {
            return;
        }
        this.f113663H.m139276c().m139272a();
        try {
            this.f113663H.join();
        } catch (InterruptedException unused) {
        }
        this.f113663H = null;
    }

    /* JADX INFO: renamed from: u2 */
    private void m139263u2(omw omwVar, byte[] bArr) {
        g510 g510Var = this.f113685j;
        if (g510Var != null) {
            g510Var.m128974A(omwVar, new RunnableC17685h(bArr), new RunnableC17686i());
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m139264v2(omw omwVar, byte[] bArr) {
        omwVar.m168311z(this.f113682f.mo104568i());
        omwVar.m168308w(m139260r2());
        omwVar.m168286C(this.f113682f.mo104571m());
        omwVar.m168310y(bArr);
        omwVar.m168288E(this.f113684i.f175478e);
        omwVar.m168284A(this.f113684i.f175480f);
        omwVar.m168309x(this.f113684i.f175447D);
    }

    /* JADX INFO: renamed from: w2 */
    private void m139265w2(byte[] bArr) {
        v94 v94Var = this.f113659E;
        this.f113656B.m196802h(17);
        this.f113656B.m196807m(this.f113684i.f175478e);
        this.f113656B.m196804j(this.f113684i.f175480f);
        this.f113656B.m196801g(ByteBuffer.wrap(bArr).array());
        this.f113656B.m196800f(bArr.length);
        this.f113656B.m196806l(this.f113684i.f175478e);
        this.f113657C.m154993A(m139260r2());
        this.f113657C.m155031z(this.f113682f.mo104571m());
        this.f113657C.m155021p(this.f113682f.mo104568i());
        this.f113657C.m155005M(v94Var.m200386j());
        this.f113657C.m155003K(v94Var.m200385i());
        this.f113657C.m155004L(v94Var.m200378b());
        this.f113657C.m154995C(v94Var.m200384h());
        this.f113657C.m154996D(v94Var.m200383g());
        this.f113657C.m155022q(v94Var.m200382f());
        this.f113657C.m154999G(v94Var.m200393q());
        this.f113657C.m155013h(true);
        this.f113657C.m155023r(v94Var.m200380d());
        nx3 nx3Var = this.f113661F;
        lnw lnwVar = this.f113657C;
        if (nx3Var == null) {
            lnwVar.m155016k(v94Var.m200390n());
            this.f113657C.m155017l(v94Var.m200391o());
            int iM200386j = v94Var.m200386j();
            lnw lnwVar2 = this.f113657C;
            if (iM200386j == 104) {
                lnwVar2.m154998F(false);
                this.f113657C.m155014i(false);
            } else {
                lnwVar2.m155014i(v94Var.m200387k());
                this.f113657C.m154998F(true);
            }
            this.f113657C.m155019n(false);
            this.f113657C.m155028w(1);
            this.f113657C.m155015j(2);
        } else {
            lnwVar.m155015j(nx3Var.m165059a());
            this.f113657C.m155018m(nx3Var.m165060b());
            this.f113657C.m155024s(nx3Var.m165062d());
            this.f113657C.m155029x(nx3Var.m165063e());
            this.f113657C.m155030y(nx3Var.m165064f());
            this.f113657C.m155025t(nx3Var.m165069k());
            this.f113657C.m155002J(nx3Var.m165072n());
            this.f113657C.m155001I(nx3Var.m165071m());
            this.f113657C.m155016k(nx3Var.m165066h() & v94Var.m200390n());
            this.f113657C.m155017l(nx3Var.m165067i() & v94Var.m200391o());
            int iM200386j2 = v94Var.m200386j();
            lnw lnwVar3 = this.f113657C;
            if (iM200386j2 == 104) {
                lnwVar3.m154998F(false);
                this.f113657C.m155014i(false);
            } else {
                lnwVar3.m154998F(nx3Var.m165070l());
                this.f113657C.m155014i(nx3Var.m165065g());
            }
            this.f113657C.m155019n(nx3Var.m165068j());
            this.f113657C.m155020o(nx3Var.m165061c());
        }
        this.f113657C.m154994B(false);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: B */
    public void mo99490B(row rowVar) {
        q210.InterfaceC19500a interfaceC19500a;
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resetCamera");
        this.f113688l = rowVar;
        g510 g510Var = this.f113685j;
        if (g510Var != null) {
            g510Var.m128990i(new C17679b());
            this.f113685j.m128977D();
        }
        if (this.f113682f != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "resetCamera\r\nvideoWidth:" + this.f113684i.f175506s + ",videoHeight:" + this.f113684i.f175508t + ",visualWidth:" + this.f113684i.f175510u + ",visualHeight:" + this.f113684i.f175511v + ",encodeWidth:" + this.f113684i.f175494m + ",encodeHeight:" + this.f113684i.f175496n + ",videoBitrate:" + this.f113684i.f175451H + ",audioBitrate:" + this.f113684i.f175462S + ",videoFPS:" + this.f113684i.f175449F + ",targetWidth" + this.f113688l.m182468f().m122180b() + ",targetHeight" + this.f113688l.m182468f().m122179a() + ", renderFps" + this.f113688l.m182470h() + ", degree" + this.f113668M);
            xpl xplVar = this.f113682f;
            if (xplVar != null) {
                xplVar.mo104553F(this.f113668M, this.f113688l);
                this.f113682f.mo104565e(new C17680c());
            }
        }
        this.f113697t = false;
        m139269q2();
        xpl xplVar2 = this.f113682f;
        if (xplVar2 == null || xplVar2.mo104569j(this.f113665J) || (interfaceC19500a = this.f113691o) == null) {
            return;
        }
        interfaceC19500a.mo165950g(16640, -1, 0, this);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E */
    public void mo99491E(int i, row rowVar) {
        q210.InterfaceC19500a interfaceC19500a;
        q210.InterfaceC19500a interfaceC19500a2;
        this.f113688l = rowVar;
        this.f113696s = false;
        this.f113676U = true;
        this.f113668M = i;
        try {
            if (this.f113682f.mo104552E(i, rowVar) && (interfaceC19500a2 = this.f113691o) != null) {
                interfaceC19500a2.mo165950g(16640, -5, 0, this);
            }
        } catch (Error | Exception unused) {
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "startPreview degree:" + i);
        this.f113688l = rowVar;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "switchCamera line: 551 videoWidth:" + this.f113684i.f175506s + ",videoHeight:" + this.f113684i.f175508t + ",visualWidth:" + this.f113684i.f175510u + ",visualHeight:" + this.f113684i.f175511v + ",encodeWidth:" + this.f113684i.f175494m + ",encodeHeight:" + this.f113684i.f175496n + ",videoBitrate:" + this.f113684i.f175451H + ",audioBitrate:" + this.f113684i.f175462S + ",videoFPS:" + this.f113684i.f175449F + ",targetWidth" + rowVar.m182468f().m122180b() + ",targetHeight" + rowVar.m182468f().m122179a() + ", mCurrentDegree" + i + ", renderFps" + this.f113688l.m182470h());
        if (this.f113682f != null) {
            tow towVar = this.f113684i;
            CameraUtil.reScaleSize(new erf0(towVar.f175478e, towVar.f175480f), new erf0(9, 16), this.f113682f.mo104571m());
        }
        if (this.f113692p != null) {
            Handler handler = this.f113694q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f113692p.quit();
            HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
            this.f113692p = handlerThread;
            handlerThread.start();
            this.f113694q = new Handler(this.f113692p.getLooper());
        }
        this.f113701y = this.f113684i.f175506s / 12;
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            boolean zMo104568i = xplVar.mo104568i();
            xpl xplVar2 = this.f113682f;
            if (zMo104568i) {
                changeCurRotation(360 - xplVar2.mo104571m());
                flipPosition(2);
            } else {
                changeCurRotation(xplVar2.mo104571m());
                flipPosition(1);
            }
        }
        this.f113697t = false;
        xpl xplVar3 = this.f113682f;
        if (xplVar3 != null && !xplVar3.mo104569j(this.f113665J) && (interfaceC19500a = this.f113691o) != null) {
            interfaceC19500a.mo165950g(16640, -1, 0, this);
        }
        if (this.f113682f != null) {
            u6y.m194722F().m194745X(this.f113682f.mo104568i() ? 1 : 0);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: E1 */
    public boolean mo99492E1(int i, row rowVar) {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "startPreview");
        this.f113696s = false;
        if (this.f113682f == null) {
            this.f113682f = new biw(this.f113684i);
        }
        this.f113688l = rowVar;
        this.f113682f.mo104556I(this);
        b7y.m102882c().m102888g("CameraNV21PreviewInput", "startPreview = " + rowVar.m182468f().m122180b() + BaseSei.f14624X + rowVar.m182468f().m122179a());
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "startPreview(int degree, MRConfig mrConfig)\r\nvideoWidth:" + this.f113684i.f175506s + ",videoHeight:" + this.f113684i.f175508t + ",visualWidth:" + this.f113684i.f175510u + ",visualHeight:" + this.f113684i.f175511v + ",encodeWidth:" + this.f113684i.f175494m + ",encodeHeight:" + this.f113684i.f175496n + ",videoBitrate:" + this.f113684i.f175451H + ",audioBitrate:" + this.f113684i.f175462S + ",videoFPS:" + this.f113684i.f175449F + ",targetWidth" + rowVar.m182468f().m122180b() + ",targetHeight" + rowVar.m182468f().m122179a() + ", mCurrentDegree" + i + ", renderFps" + this.f113688l.m182470h());
        this.f113668M = i;
        oq70 oq70VarM168791d = oq70.m168791d();
        StringBuilder sb = new StringBuilder("startPreview degree:");
        sb.append(i);
        oq70VarM168791d.m168793a("Pipeline_Normal_pip->PIPLINE", sb.toString());
        this.f113682f.mo104557J(new C17681d());
        if (!this.f113682f.mo104554G(i, rowVar)) {
            Log4Cam.m7376e("Camera prepare Failed!");
            if (this.f113691o != null) {
                b7y.m102882c().m102888g("line 460 prepare error");
                this.f113691o.mo165950g(16640, -4, 0, this);
            }
            return false;
        }
        this.f113682f.mo104565e(new C17682e());
        if (this.f113692p != null) {
            Handler handler = this.f113694q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f113692p.quit();
        }
        HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
        this.f113692p = handlerThread;
        handlerThread.start();
        this.f113694q = new Handler(this.f113692p.getLooper());
        this.f113682f.mo104558K(this);
        this.f113701y = this.f113684i.f175506s / 12;
        m139269q2();
        tow towVar = this.f113684i;
        CameraUtil.reScaleSize(new erf0(towVar.f175478e, towVar.f175480f), new erf0(9, 16), this.f113682f.mo104571m());
        boolean zMo104568i = this.f113682f.mo104568i();
        xpl xplVar = this.f113682f;
        if (zMo104568i) {
            changeCurRotation(360 - xplVar.mo104571m());
            flipPosition(2);
        } else {
            changeCurRotation(xplVar.mo104571m());
            flipPosition(1);
        }
        this.f113697t = false;
        this.f113682f.mo104569j(this.f113665J);
        u6y.m194722F().m194745X(this.f113682f.mo104568i() ? 1 : 0);
        u6y.m194722F().m194746Y(this.f113684i.f175491k0);
        u6y u6yVarM194722F = u6y.m194722F();
        tow towVar2 = this.f113684i;
        u6yVarM194722F.m194777o0(towVar2.f175464U, towVar2.f175463T);
        u6y.m194722F().m194781q0(this.f113684i.f175483g0 ? 1 : 0);
        u6y.m194722F().m194749a0(this.f113684i.f175499o0);
        u6y.m194722F().m194769k0(true);
        u6y u6yVarM194722F2 = u6y.m194722F();
        tow towVar3 = this.f113684i;
        u6yVarM194722F2.m194747Z(towVar3.f175478e, towVar3.f175480f);
        return true;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: I */
    public void mo99493I(boolean z) {
        this.f113659E.m200402z(z);
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: I0 */
    public long mo121925I0() {
        return this.f113698u;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: J1 */
    public void mo99494J1(v94 v94Var) {
        this.f113659E = v94Var;
    }

    @Override // p153l.aql, p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        this.f113685j = g510Var;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: N */
    public void mo99496N() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 1");
        if (this.f113682f != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 2");
            b7y.m102882c().m102888g("CameraNV21PreviewInput", "pauseCamera");
            this.f113682f.mo104559L();
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Q */
    public void mo99497Q(InterfaceC17689l interfaceC17689l) {
        this.f113666K = interfaceC17689l;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: R */
    public void mo99498R(nx3 nx3Var) {
        this.f113661F = nx3Var;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: S */
    public void mo99499S(boolean z) {
        this.f113659E.m200372B(z);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: T */
    public void mo99500T(boolean z) {
        this.f113659E.m200397u(z);
    }

    @Override // p153l.xpl.InterfaceC21410d
    /* JADX INFO: renamed from: V */
    public void mo139267V(Camera camera) {
        this.f113683g = camera;
        xpl.InterfaceC21410d interfaceC21410d = this.f113689m;
        if (interfaceC21410d != null) {
            interfaceC21410d.mo139267V(camera);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: Z */
    public void mo99501Z(int i) {
        this.f113667L = i;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a */
    public void mo99502a() {
        if (this.f113682f != null) {
            synchronized (this.f113690n) {
                try {
                    oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "stopPreview");
                    this.f113682f.mo104558K(null);
                    this.f113682f.mo104561a();
                    u6y.m194722F().m194769k0(false);
                    b7y.m102882c().m102888g("CameraNV21PreviewInput", "stopPreview：" + this.f113682f + " this === " + this + " time === " + System.currentTimeMillis());
                    this.f113682f = null;
                    this.f113698u = 0;
                    if (this.f113692p != null) {
                        Handler handler = this.f113694q;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            this.f113694q = null;
                        }
                        this.f113692p.quit();
                        this.f113692p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VideoProcessor videoProcessor = this.f113655A;
        if (videoProcessor != null) {
            videoProcessor.Release();
            t9c.m189747e("live_mmcv", "stopPreview: VideoProcessor.Release");
            this.f113655A = null;
        }
        BodyLandHelper.release();
        this.f113658D = false;
        m139262t2();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: a1 */
    public v94 mo99503a1() {
        return this.f113659E;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: b */
    public void mo99504b(int i) {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            xplVar.mo104562b(i);
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: c */
    public int mo99505c() {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            return xplVar.mo104563c();
        }
        return 0;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: d */
    public int mo99506d() {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            return xplVar.mo104564d();
        }
        return 0;
    }

    @Override // p153l.gb20, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: e */
    public boolean mo99507e() {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            return xplVar.mo104568i();
        }
        return false;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: g */
    public int mo99508g() {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            return xplVar.mo104566g();
        }
        return 0;
    }

    @Override // p153l.gb20, p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){vec3 rgb;vec3 yuv;yuv.r = texture2D(SamplerY, coordinate).r - (16.0/255.0);\nyuv.g = texture2D(SamplerUV, coordinate).a - 0.5;\nyuv.b = texture2D(SamplerUV, coordinate).r - 0.5;\n mat3 colorConvertion = mat3(1.164, 1.164, 1.164,\n                             0.0, -0.392, 2.017,\n                             1.596, -0.813, 0.0);\n rgb = colorConvertion * yuv;   gl_FragColor = vec4(rgb, 1.0);\n}";
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: h */
    public int mo99509h() {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            return xplVar.mo104567h();
        }
        return 0;
    }

    @Override // p153l.gb20, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: k */
    public void mo99510k(boolean z) {
        this.f113659E.m200398v(z);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: l */
    public void mo99511l(List<String> list) {
        this.f113659E.m200401y(list);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: m */
    public void mo99512m(int i) {
        if (i < 0) {
            return;
        }
        this.f113659E.m200394r(i);
    }

    @Override // p153l.xpl.InterfaceC21407a
    public void onData(byte[] bArr) {
        Handler handler;
        if (this.f113682f == null || bArr == null) {
            return;
        }
        u6y.m194722F().m194735N();
        if (this.f113692p == null || (handler = this.f113694q) == null) {
            return;
        }
        handler.post(new RunnableC17683f(bArr));
    }

    @Override // p153l.gb20, p153l.wej
    public void onDrawFrame() {
        markAsDirty();
        super.onDrawFrame();
    }

    /* JADX INFO: renamed from: p2 */
    public void m139268p2(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f113682f == null || !m139261s2(this.f113670O, rect)) {
            return;
        }
        this.f113670O.set(rect);
        this.f113682f.mo104570k(rect, autoFocusCallback);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: q */
    public void mo99513q(float f) {
        this.f113659E.m200375E(f);
    }

    /* JADX INFO: renamed from: q2 */
    public SurfaceTexture m139269q2() {
        SurfaceTexture surfaceTexture;
        if (this.f113663H != null && this.f113664I > 0 && (surfaceTexture = this.f113665J) != null) {
            return surfaceTexture;
        }
        C17688k c17688k = new C17688k();
        this.f113663H = c17688k;
        c17688k.start();
        this.f113663H.m139278f();
        return this.f113665J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.aql
    /* JADX INFO: renamed from: r */
    public void mo99514r() {
        String str = "releaseCamera2：";
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 1");
        b7y.m102882c().m102888g("CameraNV21PreviewInput", "releaseCamera");
        synchronized (this.f113690n) {
            try {
                if (this.f113692p != null) {
                    Handler handler = this.f113694q;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f113694q = null;
                    }
                    this.f113692p.quit();
                    this.f113692p = null;
                }
                try {
                    if (this.f113682f != null) {
                        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 2");
                        this.f113682f.release();
                        b7y.m102882c().m102888g("CameraNV21PreviewInput", "releaseCamera1：" + this.f113682f + " this === " + this + " time === " + System.currentTimeMillis());
                        this.f113682f = null;
                        b7y b7yVarM102882c = b7y.m102882c();
                        b7yVarM102882c.m102888g("CameraNV21PreviewInput", "releaseCamera2：" + this.f113682f + " this === " + this + " time === " + System.currentTimeMillis());
                        str = b7yVarM102882c;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    b7y b7yVarM102882c2 = b7y.m102882c();
                    b7yVarM102882c2.m102888g("CameraNV21PreviewInput", "releaseCamera2：" + this.f113682f + " this === " + this + " time === " + System.currentTimeMillis());
                    str = b7yVarM102882c2;
                } finally {
                    b7y.m102882c().m102888g("CameraNV21PreviewInput", str + this.f113682f + " this === " + this + " time === " + System.currentTimeMillis());
                    this.f113682f = null;
                }
                m139262t2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: s */
    public void mo99515s(int i) {
        this.f113659E.m200400x(i);
    }

    @Override // p153l.itl
    /* JADX INFO: renamed from: s1 */
    public void mo139270s1(ylg ylgVar, yuf yufVar) {
        if (this.f113692p == null || Looper.myLooper() == this.f113692p.getLooper()) {
            this.f113662G = yufVar;
        } else {
            this.f113694q.post(new RunnableC17678a(ylgVar, yufVar));
        }
    }

    @Override // p153l.aql
    public void setExposureCompensation(int i) {
        xpl xplVar = this.f113682f;
        if (xplVar != null) {
            xplVar.setExposureCompensation(i);
        }
    }

    @Override // p153l.aql
    public void setWarpType(int i) {
        this.f113659E.m200376F(i);
        if (i < 5 || i > 8) {
            return;
        }
        this.f113659E.m200374D(true);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: u */
    public void mo99516u(int i) {
        this.f113659E.m200371A(i);
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: v */
    public void mo99517v(float f) {
        this.f113659E.m200396t(f);
    }

    @Override // p153l.eql
    /* JADX INFO: renamed from: v1 */
    public long mo121926v1() {
        return 0L;
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: w */
    public void mo99518w(boolean z) {
        this.f113659E.m200399w(z);
    }

    @Override // p153l.hql
    /* JADX INFO: renamed from: x */
    public erf0 mo136684x(int i, int i2) {
        if (this.f113682f == null) {
            return new erf0(i, i2);
        }
        tow towVar = this.f113684i;
        return CameraUtil.rescalAspectRatio(new erf0(towVar.f175478e, towVar.f175480f), this.f113682f.mo104571m(), new erf0(i, i2));
    }

    @Override // p153l.aql
    /* JADX INFO: renamed from: z */
    public void mo99519z() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "resumePreview line 628:videoWidth:" + this.f113684i.f175506s + ",videoHeight:" + this.f113684i.f175508t + ",visualWidth:" + this.f113684i.f175510u + ",visualHeight:" + this.f113684i.f175511v + ",encodeWidth:" + this.f113684i.f175494m + ",encodeHeight:" + this.f113684i.f175496n + ",videoBitrate:" + this.f113684i.f175451H + ",audioBitrate:" + this.f113684i.f175462S + ",videoFPS:" + this.f113684i.f175449F + ",targetWidth" + this.f113688l.m182468f().m122180b() + ",targetHeight" + this.f113688l.m182468f().m122179a() + ", renderFps" + this.f113688l.m182470h() + ", degree" + this.f113668M);
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview");
        b7y b7yVarM102882c = b7y.m102882c();
        StringBuilder sb = new StringBuilder("resumePreview：");
        sb.append(this.f113682f);
        sb.append(" this === ");
        sb.append(this);
        sb.append(" time === ");
        sb.append(System.currentTimeMillis());
        b7yVarM102882c.m102888g("CameraNV21PreviewInput", sb.toString());
        if (this.f113682f == null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 2");
            mo99492E1(this.f113668M, this.f113688l);
            return;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 1");
        try {
            this.f113682f.mo104555H();
        } catch (RuntimeException e) {
            b7y.m102882c().m102888g("CameraNV21PreviewInput", "resumePreview：" + e.getMessage());
            mo99492E1(this.f113668M, this.f113688l);
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
}
