package p149l;

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
import com.immomo.mmutil.task.C3804c;
import com.immomo.momomediaext.sei.BaseSei;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.videoprocessor.VideoProcessor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class ja4 extends y220 implements mnl.InterfaceC18510a, mnl.InterfaceC18513d, wnl {

    /* JADX INFO: renamed from: A */
    private VideoProcessor f116999A;

    /* JADX INFO: renamed from: D */
    private boolean f117002D;

    /* JADX INFO: renamed from: E */
    private w84 f117003E;

    /* JADX INFO: renamed from: F */
    private ow3 f117005F;

    /* JADX INFO: renamed from: G */
    private ktf f117006G;

    /* JADX INFO: renamed from: L */
    private int f117011L;

    /* JADX INFO: renamed from: M */
    private int f117012M;

    /* JADX INFO: renamed from: T */
    private long f117019T;

    /* JADX INFO: renamed from: Y */
    private byte[] f117024Y;

    /* JADX INFO: renamed from: Z */
    private BodyLandmarkPostInfo f117025Z;

    /* JADX INFO: renamed from: f */
    private mnl f117026f;

    /* JADX INFO: renamed from: g */
    private Camera f117027g;

    /* JADX INFO: renamed from: i */
    private ulw f117028i;

    /* JADX INFO: renamed from: j */
    private yw00 f117029j;

    /* JADX INFO: renamed from: l */
    private slw f117032l;

    /* JADX INFO: renamed from: m */
    private mnl.InterfaceC18513d f117033m;

    /* JADX INFO: renamed from: o */
    hu00.InterfaceC17392a f117035o;

    /* JADX INFO: renamed from: p0 */
    private byte[] f117037p0;

    /* JADX INFO: renamed from: x */
    private long f117044x;

    /* JADX INFO: renamed from: k */
    private boolean f117030k = false;

    /* JADX INFO: renamed from: n */
    private Object f117034n = new Object();

    /* JADX INFO: renamed from: p */
    private HandlerThread f117036p = null;

    /* JADX INFO: renamed from: q */
    private Handler f117038q = null;

    /* JADX INFO: renamed from: r */
    private int f117039r = 200;

    /* JADX INFO: renamed from: s */
    private boolean f117040s = false;

    /* JADX INFO: renamed from: t */
    private boolean f117041t = false;

    /* JADX INFO: renamed from: u */
    int f117042u = 0;

    /* JADX INFO: renamed from: v */
    private long f117043v = 0;

    /* JADX INFO: renamed from: y */
    int f117045y = 60;

    /* JADX INFO: renamed from: z */
    long f117046z = 0;

    /* JADX INFO: renamed from: B */
    private vjw f117000B = new vjw();

    /* JADX INFO: renamed from: C */
    private mkw f117001C = new mkw(1);

    /* JADX INFO: renamed from: H */
    C17733k f117007H = null;

    /* JADX INFO: renamed from: I */
    private int f117008I = 0;

    /* JADX INFO: renamed from: J */
    private SurfaceTexture f117009J = null;

    /* JADX INFO: renamed from: K */
    private InterfaceC17734l f117010K = null;

    /* JADX INFO: renamed from: N */
    boolean f117013N = false;

    /* JADX INFO: renamed from: O */
    Rect f117014O = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: P */
    int f117015P = 0;

    /* JADX INFO: renamed from: Q */
    int f117016Q = 0;

    /* JADX INFO: renamed from: R */
    int f117017R = 0;

    /* JADX INFO: renamed from: S */
    int f117018S = 0;

    /* JADX INFO: renamed from: U */
    private boolean f117020U = false;

    /* JADX INFO: renamed from: V */
    private Object f117021V = new Object();

    /* JADX INFO: renamed from: W */
    private long f117022W = 0;

    /* JADX INFO: renamed from: X */
    private int f117023X = 0;

    /* JADX INFO: renamed from: k0 */
    private mkw f117031k0 = new mkw(5);

    /* JADX INFO: renamed from: E0 */
    private AtomicBoolean f117004E0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l.ja4$a */
    public class RunnableC17723a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ktf f117047a;

        public RunnableC17723a(jkg jkgVar, ktf ktfVar) {
            this.f117047a = ktfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ja4.m140622e2(ja4.this, null);
            ja4.this.f117006G = this.f117047a;
        }
    }

    /* JADX INFO: renamed from: l.ja4$b */
    public class C17724b implements mw00 {
        public C17724b() {
        }

        @Override // p149l.mw00
        /* JADX INFO: renamed from: a */
        public void mo140677a() {
            hu00.InterfaceC17392a interfaceC17392a = ja4.this.f117035o;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(214, 1, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$c */
    public class C17725c implements Camera.ErrorCallback {
        public C17725c() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            if (ja4.this.f117035o != null) {
                eyx.m118802c().m118808g("line 391 error" + i);
                ja4.this.f117035o.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$d */
    public class C17726d implements mnl.InterfaceC18512c {
        public C17726d() {
        }

        @Override // p149l.mnl.InterfaceC18512c
        public void onFail(int i, String str) {
            if (i != 4005) {
                eyx.m118802c().m118808g("CameraNV21PreviewInput", "camera fail error code === " + i + " info === " + str);
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$e */
    public class C17727e implements Camera.ErrorCallback {
        public C17727e() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            if (ja4.this.f117035o != null) {
                eyx.m118802c().m118808g("line 468 error" + i);
                ja4.this.f117035o.mo128349g(16640, i, 0, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$f */
    public class RunnableC17728f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f117053a;

        public RunnableC17728f(byte[] bArr) {
            this.f117053a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ja4.this.m140612D(this.f117053a);
        }
    }

    /* JADX INFO: renamed from: l.ja4$g */
    public class RunnableC17729g implements Runnable {
        public RunnableC17729g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ja4 ja4Var = ja4.this;
                ja4Var.m140627j2(ja4Var.f117037p0);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    ja4.this.f117004E0.set(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$h */
    public class RunnableC17730h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f117056a;

        public RunnableC17730h(byte[] bArr) {
            this.f117056a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ja4.this.f117026f == null) {
                    return;
                }
                ja4 ja4Var = ja4.this;
                ja4Var.f117042u++;
                ja4Var.setRenderSize(ja4Var.f117028i.f177136e, ja4.this.f117028i.f177138f);
                int i = ja4.this.f117028i.f177136e * ja4.this.f117028i.f177138f;
                ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", "camera preview width " + ja4.this.f117028i.f177136e + " height " + ja4.this.f117028i.f177138f + "planerSize:" + i + " data length:" + this.f117056a.length);
                ByteBuffer byteBuffer = ja4.this.f195484a;
                if (byteBuffer == null || byteBuffer.limit() < i) {
                    ja4.this.f195484a = ByteBuffer.allocateDirect(i);
                }
                ByteBuffer byteBuffer2 = ja4.this.f195485b;
                if (byteBuffer2 == null || byteBuffer2.limit() < i / 2) {
                    ja4.this.f195485b = ByteBuffer.allocateDirect(i / 2);
                }
                ja4.this.f195484a.put(this.f117056a, 0, i);
                ja4.this.f195485b.put(this.f117056a, i, i / 2);
                ja4.this.f195484a.position(0);
                ja4.this.f195485b.position(0);
                ja4.this.f117041t = false;
            } catch (Exception unused) {
                ja4.this.f117041t = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$i */
    public class RunnableC17731i implements Runnable {
        public RunnableC17731i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ja4.this.f117041t = true;
        }
    }

    /* JADX INFO: renamed from: l.ja4$j */
    public static class HandlerC17732j extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<C17733k> f117059a;

        public HandlerC17732j(C17733k c17733k) {
            this.f117059a = new WeakReference<>(c17733k);
        }

        /* JADX INFO: renamed from: a */
        public void m140678a() {
            sendMessage(obtainMessage(3));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            C17733k c17733k = this.f117059a.get();
            if (c17733k != null && i == 3) {
                c17733k.m140680e();
            }
        }
    }

    /* JADX INFO: renamed from: l.ja4$k */
    public class C17733k extends Thread {

        /* JADX INFO: renamed from: a */
        private Object f117060a;

        /* JADX INFO: renamed from: b */
        private boolean f117061b;

        /* JADX INFO: renamed from: c */
        private HandlerC17732j f117062c;

        /* JADX INFO: renamed from: d */
        private sie f117063d;

        public C17733k() {
            super("CameraEGLThread");
            this.f117060a = new Object();
            this.f117061b = false;
            this.f117062c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m140680e() {
            Looper.myLooper().quit();
        }

        /* JADX INFO: renamed from: b */
        public SurfaceTexture m140681b() {
            if (ja4.this.f117009J == null) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                ja4.this.f117008I = iArr[0];
                GLES20.glBindTexture(36197, ja4.this.f117008I);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                ja4.this.f117009J = new SurfaceTexture(ja4.this.f117008I);
                Log.e("CameraNV21PreviewInput", "createTexture: mTextureID:" + ja4.this.f117008I + ", mCameraTexture:" + ja4.this.f117009J);
            }
            return ja4.this.f117009J;
        }

        /* JADX INFO: renamed from: c */
        public HandlerC17732j m140682c() {
            return this.f117062c;
        }

        /* JADX INFO: renamed from: d */
        public void m140683d() {
            if (ja4.this.f117009J != null) {
                ja4.this.f117009J.release();
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture mCameraTexture: " + ja4.this.f117009J);
                ja4.this.f117009J = null;
            }
            if (ja4.this.f117008I != 0) {
                GLES20.glDeleteTextures(1, new int[]{ja4.this.f117008I}, 0);
                Log.e("CameraNV21PreviewInput", "releaseCameraTexture glDeleteTextures: " + ja4.this.f117008I);
                ja4.this.f117008I = 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m140684f() {
            synchronized (this.f117060a) {
                while (!this.f117061b) {
                    try {
                        this.f117060a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f117062c = new HandlerC17732j(this);
            sie sieVar = new sie();
            this.f117063d = sieVar;
            sieVar.m184327b();
            Log.e("CameraNV21PreviewInput", "run: Start");
            this.f117063d.m184333i();
            m140681b();
            synchronized (this.f117060a) {
                this.f117061b = true;
                this.f117060a.notify();
            }
            Looper.loop();
            m140683d();
            this.f117063d.m184334j();
            this.f117062c = null;
            synchronized (this.f117060a) {
                this.f117061b = false;
            }
            Log.e("CameraNV21PreviewInput", "run: Exit");
        }
    }

    /* JADX INFO: renamed from: l.ja4$l */
    public interface InterfaceC17734l {
        /* JADX INFO: renamed from: K */
        void mo19166K(byte[] bArr, int i, int i2);
    }

    public ja4(vlw vlwVar, hu00.InterfaceC17392a interfaceC17392a) {
        this.f117044x = 15L;
        this.f117035o = interfaceC17392a;
        if (vlwVar == null) {
            this.f117028i = new ulw();
        } else {
            this.f117028i = vlwVar;
        }
        this.f117044x = vlwVar.f182015D0;
        this.f117026f = new dgw(this.f117028i);
        this.useNewViewPort = true;
        this.f117003E = new w84();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m140612D(byte[] bArr) {
        long jM184879h;
        if (bArr == null) {
            return;
        }
        InterfaceC17734l interfaceC17734l = this.f117010K;
        if (interfaceC17734l != null) {
            ulw ulwVar = this.f117028i;
            interfaceC17734l.mo19166K(bArr, ulwVar.f177136e, ulwVar.f177138f);
        }
        synchronized (this.f117034n) {
            try {
                if (this.f117026f != null && !this.f117041t) {
                    if (System.currentTimeMillis() - this.f117019T > 1000 && this.f117020U) {
                        this.f117020U = false;
                        this.f117013N = false;
                        m140631n2();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = this.f117011L;
                    if (i == 0) {
                        jM184879h = this.f117032l.m184879h() != 0 ? 1000 / ((long) this.f117032l.m184879h()) : 66L;
                    } else {
                        jM184879h = 1000 / ((long) i);
                    }
                    long j = this.f117043v;
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 >= jM184879h && !this.f117040s) {
                        if (j == 0 || j2 > 5 * jM184879h) {
                            this.f117043v = System.currentTimeMillis();
                        } else {
                            this.f117043v = j + jM184879h;
                        }
                        this.f117022W = SystemClock.elapsedRealtime();
                        pjw pjwVar = new pjw();
                        boolean zM202118m = this.f117003E.m202118m();
                        byte[] bArr2 = this.f117024Y;
                        if (bArr2 == null || bArr2.length != bArr.length) {
                            this.f117024Y = new byte[bArr.length];
                        }
                        System.arraycopy(bArr, 0, this.f117024Y, 0, bArr.length);
                        if (zM202118m) {
                            m140629l2(this.f117024Y, pjwVar);
                        } else if (FacerigHelper.isUseFacerig()) {
                            m140630m2(this.f117024Y, pjwVar);
                        }
                        this.f117046z = SystemClock.elapsedRealtime() - this.f117022W;
                        xxx.m211572F().m211607e0(this.f117046z);
                        if (BodyLandHelper.isUseBodyLand() && this.f117004E0.get()) {
                            byte[] bArr3 = this.f117037p0;
                            if (bArr3 == null || bArr3.length < bArr.length) {
                                this.f117037p0 = new byte[bArr.length];
                            }
                            System.arraycopy(bArr, 0, this.f117037p0, 0, bArr.length);
                            this.f117004E0.set(false);
                            C3804c.m18444d(2, new RunnableC17729g());
                        }
                        m140637v2(pjwVar, this.f117024Y);
                        if (pjwVar.m169950n() > 0) {
                            xxx.m211572F().m211621l0(true);
                            float[] fArrM220022p = pjwVar.m169946j(0).m220022p();
                            xxx xxxVarM211572F = xxx.m211572F();
                            float f = fArrM220022p[0];
                            int i2 = pjwVar.f149898e;
                            float f2 = fArrM220022p[1];
                            int i3 = pjwVar.f149899f;
                            xxxVarM211572F.m211611g0(f / i2, f2 / i3, fArrM220022p[2] / i2, fArrM220022p[3] / i3);
                            float[] fArrM220012c = pjwVar.m169946j(0).m220012c();
                            xxx.m211572F().m211609f0(fArrM220012c[2], fArrM220012c[1], fArrM220012c[0]);
                        } else {
                            xxx.m211572F().m211621l0(false);
                        }
                        if (this.f117003E.m202106a() > 0) {
                            m140626i2(pjwVar);
                        }
                        if (this.f117003E.m202121p()) {
                            m140628k2(pjwVar);
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m140636u2(pjwVar, this.f117024Y);
                        xxx.m211572F().m211601b0(System.currentTimeMillis() - jCurrentTimeMillis2);
                        if (this.f117006G != null && pjwVar.m169948l() != null) {
                            this.f117006G.mo19165a(pjwVar.m169948l());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ jkg m140622e2(ja4 ja4Var, jkg jkgVar) {
        ja4Var.getClass();
        return jkgVar;
    }

    /* JADX INFO: renamed from: i2 */
    private void m140626i2(pjw pjwVar) {
        ja4 ja4Var;
        if (pjwVar.m169950n() <= 0) {
            int i = this.f117016Q + 1;
            this.f117016Q = i;
            if (i == this.f117039r) {
                this.f117016Q = 0;
                if (mo140659e()) {
                    m140631n2();
                    return;
                }
                return;
            }
            return;
        }
        ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("hasFace"));
        if (this.f117015P % this.f117003E.m202106a() == 0) {
            this.f117015P = 0;
            float[] fArrM220022p = pjwVar.m169946j(0).m220022p();
            float f = pjwVar.f149898e;
            float f2 = pjwVar.f149899f;
            float f3 = fArrM220022p[0];
            float f4 = fArrM220022p[1];
            ja4Var = this;
            ja4Var.m140632o2(f, f2, f3, f4, f3, f4, 1.0f);
            xxx.m211572F().m211594W((((fArrM220022p[0] * 2.0f) + fArrM220022p[2]) * 0.5f) / pjwVar.f149898e, (((fArrM220022p[1] * 2.0f) + fArrM220022p[3]) * 0.5f) / pjwVar.f149899f);
        } else {
            ja4Var = this;
        }
        ja4Var.f117015P++;
        ja4Var.f117016Q = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public void m140627j2(byte[] bArr) {
        MMJoint[][] mMJointArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f117000B.m198695h(17);
        this.f117000B.m198700m(this.f117028i.f177136e);
        this.f117000B.m198697j(this.f117028i.f177138f);
        this.f117000B.m198694g(bArr);
        this.f117000B.m198693f(bArr.length);
        this.f117000B.m198699l(this.f117028i.f177136e);
        this.f117031k0.m155066A(m140633r2());
        this.f117031k0.m155104z(this.f117026f.mo111774m());
        this.f117031k0.m155094p(this.f117026f.mo111771i());
        this.f117031k0.m155073H(true);
        if (this.f117025Z == null) {
            this.f117025Z = new BodyLandmarkPostInfo();
        }
        if (!this.f117002D && !TextUtils.isEmpty(this.f117003E.m202108c())) {
            BodyLandHelper.setModelTypeAndPath(this.f117003E.m202117l(), this.f117003E.m202108c());
            this.f117002D = true;
        }
        BodyLandHelper.process(this.f117000B, this.f117031k0, this.f117025Z);
        xxx.m211572F().m211593V(SystemClock.elapsedRealtime() - jElapsedRealtime);
        BodyLandHelper.setBodyInfos(this.f117025Z);
        if (!be80.f75125a || (mMJointArr = this.f117025Z.multi_person_) == null || mMJointArr.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (MMJoint[] mMJointArr2 : this.f117025Z.multi_person_) {
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
    private void m140628k2(pjw pjwVar) {
        if (this.f117046z <= 65) {
            this.f117023X = 0;
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "faceDetectUse A " + this.f117046z + " mMMCVInfo[0]" + pjwVar.m169950n());
        int i = this.f117023X + 1;
        this.f117023X = i;
        if (i > 10) {
            this.f117003E.m202126u(false);
            this.f117023X = 0;
        }
    }

    /* JADX INFO: renamed from: l2 */
    private void m140629l2(byte[] bArr, pjw pjwVar) {
        ulw ulwVar = this.f117028i;
        if (ulwVar != null) {
            SegmentHelper.setWidth(ulwVar.f177136e);
            SegmentHelper.setHeight(this.f117028i.f177138f);
            SegmentHelper.setRotateDegree(m140633r2());
            SegmentHelper.setRestoreDegree(this.f117026f.mo111774m());
            SegmentHelper.setIsFrontCamera(this.f117026f.mo111771i());
        }
        m140638w2(bArr);
        qtf qtfVarProcess = FacerigHelper.isUseFacerig() ? FacerigHelper.process(this.f117000B, this.f117001C) : null;
        pjwVar.m169938D(qtfVarProcess);
        w84 w84Var = this.f117003E;
        if (qtfVarProcess == null) {
            List<String> listM202110e = w84Var.m202110e();
            if (this.f116999A == null && listM202110e != null) {
                this.f116999A = new VideoProcessor();
                n8c.m158487e("live_mmcv", "VideoProcessor.Create" + listM202110e.size());
                if (listM202110e.size() >= 2) {
                    this.f116999A.LoadModel(listM202110e.get(0), listM202110e.get(1));
                }
            }
            VideoProcessor videoProcessor = this.f116999A;
            if (videoProcessor != null) {
                videoProcessor.ProcessFrame(this.f117000B.m198689b(), this.f117001C.m155084f(), pjwVar.m169955s());
                pjwVar.m169941b(w84Var.m202115j());
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m140630m2(byte[] bArr, pjw pjwVar) {
        m140638w2(bArr);
        pjwVar.m169938D(FacerigHelper.process(this.f117000B, this.f117001C));
    }

    /* JADX INFO: renamed from: n2 */
    private void m140631n2() {
        if (this.f117026f != null && !this.f117013N) {
            int i = this.f117045y;
            m140665p2(new Rect(-i, -i, i, i), null);
            this.f117013N = true;
        }
        xxx.m211572F().m211594W(0.5f, 0.5f);
    }

    /* JADX INFO: renamed from: o2 */
    private void m140632o2(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
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
        m140665p2(new Rect((int) (((f3 * 2000.0f) / f) - 1000.0f), (int) (((f4 * 2000.0f) / f2) - 1000.0f), (int) (((f5 * 2000.0f) / f) - 1000.0f), (int) (((f6 * 2000.0f) / f2) - 1000.0f)), null);
    }

    /* JADX INFO: renamed from: r2 */
    private final int m140633r2() {
        int i = this.f117028i.f177105D;
        return i == 0 ? this.f117026f.mo111774m() : 270 - i;
    }

    /* JADX INFO: renamed from: s2 */
    private boolean m140634s2(Rect rect, Rect rect2) {
        return Math.abs(((float) rect2.width()) - ((float) rect.width())) > ((float) this.f117045y) || Math.abs(((float) rect2.height()) - ((float) rect.height())) > ((float) this.f117045y) || Math.abs(rect.left - rect2.left) > this.f117045y || Math.abs(rect.right - rect2.right) > this.f117045y || Math.abs(rect.top - rect2.top) > this.f117045y || Math.abs(rect.bottom - rect2.bottom) > this.f117045y;
    }

    /* JADX INFO: renamed from: t2 */
    private void m140635t2() {
        C17733k c17733k = this.f117007H;
        if (c17733k == null || c17733k.m140682c() == null) {
            return;
        }
        this.f117007H.m140682c().m140678a();
        try {
            this.f117007H.join();
        } catch (InterruptedException unused) {
        }
        this.f117007H = null;
    }

    /* JADX INFO: renamed from: u2 */
    private void m140636u2(pjw pjwVar, byte[] bArr) {
        yw00 yw00Var = this.f117029j;
        if (yw00Var != null) {
            yw00Var.m216259A(pjwVar, new RunnableC17730h(bArr), new RunnableC17731i());
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m140637v2(pjw pjwVar, byte[] bArr) {
        pjwVar.m169962z(this.f117026f.mo111771i());
        pjwVar.m169959w(m140633r2());
        pjwVar.m169937C(this.f117026f.mo111774m());
        pjwVar.m169961y(bArr);
        pjwVar.m169939E(this.f117028i.f177136e);
        pjwVar.m169935A(this.f117028i.f177138f);
        pjwVar.m169960x(this.f117028i.f177105D);
    }

    /* JADX INFO: renamed from: w2 */
    private void m140638w2(byte[] bArr) {
        w84 w84Var = this.f117003E;
        this.f117000B.m198695h(17);
        this.f117000B.m198700m(this.f117028i.f177136e);
        this.f117000B.m198697j(this.f117028i.f177138f);
        this.f117000B.m198694g(ByteBuffer.wrap(bArr).array());
        this.f117000B.m198693f(bArr.length);
        this.f117000B.m198699l(this.f117028i.f177136e);
        this.f117001C.m155066A(m140633r2());
        this.f117001C.m155104z(this.f117026f.mo111774m());
        this.f117001C.m155094p(this.f117026f.mo111771i());
        this.f117001C.m155078M(w84Var.m202115j());
        this.f117001C.m155076K(w84Var.m202114i());
        this.f117001C.m155077L(w84Var.m202107b());
        this.f117001C.m155068C(w84Var.m202113h());
        this.f117001C.m155069D(w84Var.m202112g());
        this.f117001C.m155095q(w84Var.m202111f());
        this.f117001C.m155072G(w84Var.m202122q());
        this.f117001C.m155086h(true);
        this.f117001C.m155096r(w84Var.m202109d());
        ow3 ow3Var = this.f117005F;
        mkw mkwVar = this.f117001C;
        if (ow3Var == null) {
            mkwVar.m155089k(w84Var.m202119n());
            this.f117001C.m155090l(w84Var.m202120o());
            int iM202115j = w84Var.m202115j();
            mkw mkwVar2 = this.f117001C;
            if (iM202115j == 104) {
                mkwVar2.m155071F(false);
                this.f117001C.m155087i(false);
            } else {
                mkwVar2.m155087i(w84Var.m202116k());
                this.f117001C.m155071F(true);
            }
            this.f117001C.m155092n(false);
            this.f117001C.m155101w(1);
            this.f117001C.m155088j(2);
        } else {
            mkwVar.m155088j(ow3Var.m166233a());
            this.f117001C.m155091m(ow3Var.m166234b());
            this.f117001C.m155097s(ow3Var.m166236d());
            this.f117001C.m155102x(ow3Var.m166237e());
            this.f117001C.m155103y(ow3Var.m166238f());
            this.f117001C.m155098t(ow3Var.m166243k());
            this.f117001C.m155075J(ow3Var.m166246n());
            this.f117001C.m155074I(ow3Var.m166245m());
            this.f117001C.m155089k(ow3Var.m166240h() & w84Var.m202119n());
            this.f117001C.m155090l(ow3Var.m166241i() & w84Var.m202120o());
            int iM202115j2 = w84Var.m202115j();
            mkw mkwVar3 = this.f117001C;
            if (iM202115j2 == 104) {
                mkwVar3.m155071F(false);
                this.f117001C.m155087i(false);
            } else {
                mkwVar3.m155071F(ow3Var.m166244l());
                this.f117001C.m155087i(ow3Var.m166239g());
            }
            this.f117001C.m155092n(ow3Var.m166242j());
            this.f117001C.m155093o(ow3Var.m166235c());
        }
        this.f117001C.m155067B(false);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: B */
    public void mo140639B(slw slwVar) {
        hu00.InterfaceC17392a interfaceC17392a;
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resetCamera");
        this.f117032l = slwVar;
        yw00 yw00Var = this.f117029j;
        if (yw00Var != null) {
            yw00Var.m216275i(new C17724b());
            this.f117029j.m216262D();
        }
        if (this.f117026f != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "resetCamera\r\nvideoWidth:" + this.f117028i.f177164s + ",videoHeight:" + this.f117028i.f177166t + ",visualWidth:" + this.f117028i.f177168u + ",visualHeight:" + this.f117028i.f177169v + ",encodeWidth:" + this.f117028i.f177152m + ",encodeHeight:" + this.f117028i.f177154n + ",videoBitrate:" + this.f117028i.f177109H + ",audioBitrate:" + this.f117028i.f177120S + ",videoFPS:" + this.f117028i.f177107F + ",targetWidth" + this.f117032l.m184877f().m198562b() + ",targetHeight" + this.f117032l.m184877f().m198561a() + ", renderFps" + this.f117032l.m184879h() + ", degree" + this.f117012M);
            mnl mnlVar = this.f117026f;
            if (mnlVar != null) {
                mnlVar.mo111756F(this.f117012M, this.f117032l);
                this.f117026f.mo111768e(new C17725c());
            }
        }
        this.f117041t = false;
        m140667q2();
        mnl mnlVar2 = this.f117026f;
        if (mnlVar2 == null || mnlVar2.mo111772j(this.f117009J) || (interfaceC17392a = this.f117035o) == null) {
            return;
        }
        interfaceC17392a.mo128349g(16640, -1, 0, this);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E */
    public void mo140640E(int i, slw slwVar) {
        hu00.InterfaceC17392a interfaceC17392a;
        hu00.InterfaceC17392a interfaceC17392a2;
        this.f117032l = slwVar;
        this.f117040s = false;
        this.f117020U = true;
        this.f117012M = i;
        try {
            if (this.f117026f.mo111755E(i, slwVar) && (interfaceC17392a2 = this.f117035o) != null) {
                interfaceC17392a2.mo128349g(16640, -5, 0, this);
            }
        } catch (Error | Exception unused) {
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "startPreview degree:" + i);
        this.f117032l = slwVar;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "switchCamera line: 551 videoWidth:" + this.f117028i.f177164s + ",videoHeight:" + this.f117028i.f177166t + ",visualWidth:" + this.f117028i.f177168u + ",visualHeight:" + this.f117028i.f177169v + ",encodeWidth:" + this.f117028i.f177152m + ",encodeHeight:" + this.f117028i.f177154n + ",videoBitrate:" + this.f117028i.f177109H + ",audioBitrate:" + this.f117028i.f177120S + ",videoFPS:" + this.f117028i.f177107F + ",targetWidth" + slwVar.m184877f().m198562b() + ",targetHeight" + slwVar.m184877f().m198561a() + ", mCurrentDegree" + i + ", renderFps" + this.f117032l.m184879h());
        if (this.f117026f != null) {
            ulw ulwVar = this.f117028i;
            CameraUtil.reScaleSize(new vif0(ulwVar.f177136e, ulwVar.f177138f), new vif0(9, 16), this.f117026f.mo111774m());
        }
        if (this.f117036p != null) {
            Handler handler = this.f117038q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f117036p.quit();
            HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
            this.f117036p = handlerThread;
            handlerThread.start();
            this.f117038q = new Handler(this.f117036p.getLooper());
        }
        this.f117045y = this.f117028i.f177164s / 12;
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            boolean zMo111771i = mnlVar.mo111771i();
            mnl mnlVar2 = this.f117026f;
            if (zMo111771i) {
                changeCurRotation(360 - mnlVar2.mo111774m());
                flipPosition(2);
            } else {
                changeCurRotation(mnlVar2.mo111774m());
                flipPosition(1);
            }
        }
        this.f117041t = false;
        mnl mnlVar3 = this.f117026f;
        if (mnlVar3 != null && !mnlVar3.mo111772j(this.f117009J) && (interfaceC17392a = this.f117035o) != null) {
            interfaceC17392a.mo128349g(16640, -1, 0, this);
        }
        if (this.f117026f != null) {
            xxx.m211572F().m211595X(this.f117026f.mo111771i() ? 1 : 0);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: E1 */
    public boolean mo140641E1(int i, slw slwVar) {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "startPreview");
        this.f117040s = false;
        if (this.f117026f == null) {
            this.f117026f = new dgw(this.f117028i);
        }
        this.f117032l = slwVar;
        this.f117026f.mo111759I(this);
        eyx.m118802c().m118808g("CameraNV21PreviewInput", "startPreview = " + slwVar.m184877f().m198562b() + BaseSei.f13930X + slwVar.m184877f().m198561a());
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "startPreview(int degree, MRConfig mrConfig)\r\nvideoWidth:" + this.f117028i.f177164s + ",videoHeight:" + this.f117028i.f177166t + ",visualWidth:" + this.f117028i.f177168u + ",visualHeight:" + this.f117028i.f177169v + ",encodeWidth:" + this.f117028i.f177152m + ",encodeHeight:" + this.f117028i.f177154n + ",videoBitrate:" + this.f117028i.f177109H + ",audioBitrate:" + this.f117028i.f177120S + ",videoFPS:" + this.f117028i.f177107F + ",targetWidth" + slwVar.m184877f().m198562b() + ",targetHeight" + slwVar.m184877f().m198561a() + ", mCurrentDegree" + i + ", renderFps" + this.f117032l.m184879h());
        this.f117012M = i;
        ii70 ii70VarM136344d = ii70.m136344d();
        StringBuilder sb = new StringBuilder("startPreview degree:");
        sb.append(i);
        ii70VarM136344d.m136346a("Pipeline_Normal_pip->PIPLINE", sb.toString());
        this.f117026f.mo111760J(new C17726d());
        if (!this.f117026f.mo111757G(i, slwVar)) {
            Log4Cam.m7322e("Camera prepare Failed!");
            if (this.f117035o != null) {
                eyx.m118802c().m118808g("line 460 prepare error");
                this.f117035o.mo128349g(16640, -4, 0, this);
            }
            return false;
        }
        this.f117026f.mo111768e(new C17727e());
        if (this.f117036p != null) {
            Handler handler = this.f117038q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f117036p.quit();
        }
        HandlerThread handlerThread = new HandlerThread("HaniPreviewDataProcess");
        this.f117036p = handlerThread;
        handlerThread.start();
        this.f117038q = new Handler(this.f117036p.getLooper());
        this.f117026f.mo111761K(this);
        this.f117045y = this.f117028i.f177164s / 12;
        m140667q2();
        ulw ulwVar = this.f117028i;
        CameraUtil.reScaleSize(new vif0(ulwVar.f177136e, ulwVar.f177138f), new vif0(9, 16), this.f117026f.mo111774m());
        boolean zMo111771i = this.f117026f.mo111771i();
        mnl mnlVar = this.f117026f;
        if (zMo111771i) {
            changeCurRotation(360 - mnlVar.mo111774m());
            flipPosition(2);
        } else {
            changeCurRotation(mnlVar.mo111774m());
            flipPosition(1);
        }
        this.f117041t = false;
        this.f117026f.mo111772j(this.f117009J);
        xxx.m211572F().m211595X(this.f117026f.mo111771i() ? 1 : 0);
        xxx.m211572F().m211596Y(this.f117028i.f177149k0);
        xxx xxxVarM211572F = xxx.m211572F();
        ulw ulwVar2 = this.f117028i;
        xxxVarM211572F.m211627o0(ulwVar2.f177122U, ulwVar2.f177121T);
        xxx.m211572F().m211631q0(this.f117028i.f177141g0 ? 1 : 0);
        xxx.m211572F().m211599a0(this.f117028i.f177157o0);
        xxx.m211572F().m211619k0(true);
        xxx xxxVarM211572F2 = xxx.m211572F();
        ulw ulwVar3 = this.f117028i;
        xxxVarM211572F2.m211597Z(ulwVar3.f177136e, ulwVar3.f177138f);
        return true;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: I */
    public void mo140643I(boolean z) {
        this.f117003E.m202131z(z);
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: I0 */
    public long mo140644I0() {
        return this.f117042u;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: J1 */
    public void mo140645J1(w84 w84Var) {
        this.f117003E = w84Var;
    }

    @Override // p149l.pnl, p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        this.f117029j = yw00Var;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: N */
    public void mo140647N() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 1");
        if (this.f117026f != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "pausePreview >>>> 2");
            eyx.m118802c().m118808g("CameraNV21PreviewInput", "pauseCamera");
            this.f117026f.mo111762L();
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Q */
    public void mo140648Q(InterfaceC17734l interfaceC17734l) {
        this.f117010K = interfaceC17734l;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: R */
    public void mo140649R(ow3 ow3Var) {
        this.f117005F = ow3Var;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: S */
    public void mo140650S(boolean z) {
        this.f117003E.m202101B(z);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: T */
    public void mo140651T(boolean z) {
        this.f117003E.m202126u(z);
    }

    @Override // p149l.mnl.InterfaceC18513d
    /* JADX INFO: renamed from: V */
    public void mo140652V(Camera camera) {
        this.f117027g = camera;
        mnl.InterfaceC18513d interfaceC18513d = this.f117033m;
        if (interfaceC18513d != null) {
            interfaceC18513d.mo140652V(camera);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: Z */
    public void mo140653Z(int i) {
        this.f117011L = i;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a */
    public void mo140654a() {
        if (this.f117026f != null) {
            synchronized (this.f117034n) {
                try {
                    ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "stopPreview");
                    this.f117026f.mo111761K(null);
                    this.f117026f.mo111764a();
                    xxx.m211572F().m211619k0(false);
                    eyx.m118802c().m118808g("CameraNV21PreviewInput", "stopPreview：" + this.f117026f + " this === " + this + " time === " + System.currentTimeMillis());
                    this.f117026f = null;
                    this.f117042u = 0;
                    if (this.f117036p != null) {
                        Handler handler = this.f117038q;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            this.f117038q = null;
                        }
                        this.f117036p.quit();
                        this.f117036p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VideoProcessor videoProcessor = this.f116999A;
        if (videoProcessor != null) {
            videoProcessor.Release();
            n8c.m158487e("live_mmcv", "stopPreview: VideoProcessor.Release");
            this.f116999A = null;
        }
        BodyLandHelper.release();
        this.f117002D = false;
        m140635t2();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: a1 */
    public w84 mo140655a1() {
        return this.f117003E;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: b */
    public void mo140656b(int i) {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            mnlVar.mo111765b(i);
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: c */
    public int mo140657c() {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            return mnlVar.mo111766c();
        }
        return 0;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: d */
    public int mo140658d() {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            return mnlVar.mo111767d();
        }
        return 0;
    }

    @Override // p149l.y220, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: e */
    public boolean mo140659e() {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            return mnlVar.mo111771i();
        }
        return false;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: g */
    public int mo140660g() {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            return mnlVar.mo111769g();
        }
        return 0;
    }

    @Override // p149l.y220, p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){vec3 rgb;vec3 yuv;yuv.r = texture2D(SamplerY, coordinate).r - (16.0/255.0);\nyuv.g = texture2D(SamplerUV, coordinate).a - 0.5;\nyuv.b = texture2D(SamplerUV, coordinate).r - 0.5;\n mat3 colorConvertion = mat3(1.164, 1.164, 1.164,\n                             0.0, -0.392, 2.017,\n                             1.596, -0.813, 0.0);\n rgb = colorConvertion * yuv;   gl_FragColor = vec4(rgb, 1.0);\n}";
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: h */
    public int mo140661h() {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            return mnlVar.mo111770h();
        }
        return 0;
    }

    @Override // p149l.y220, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: k */
    public void mo140662k(boolean z) {
        this.f117003E.m202127v(z);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: l */
    public void mo140663l(List<String> list) {
        this.f117003E.m202130y(list);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: m */
    public void mo140664m(int i) {
        if (i < 0) {
            return;
        }
        this.f117003E.m202123r(i);
    }

    @Override // p149l.mnl.InterfaceC18510a
    public void onData(byte[] bArr) {
        Handler handler;
        if (this.f117026f == null || bArr == null) {
            return;
        }
        xxx.m211572F().m211585N();
        if (this.f117036p == null || (handler = this.f117038q) == null) {
            return;
        }
        handler.post(new RunnableC17728f(bArr));
    }

    @Override // p149l.y220, p149l.ccj
    public void onDrawFrame() {
        markAsDirty();
        super.onDrawFrame();
    }

    /* JADX INFO: renamed from: p2 */
    public void m140665p2(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f117026f == null || !m140634s2(this.f117014O, rect)) {
            return;
        }
        this.f117014O.set(rect);
        this.f117026f.mo111773k(rect, autoFocusCallback);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: q */
    public void mo140666q(float f) {
        this.f117003E.m202104E(f);
    }

    /* JADX INFO: renamed from: q2 */
    public SurfaceTexture m140667q2() {
        SurfaceTexture surfaceTexture;
        if (this.f117007H != null && this.f117008I > 0 && (surfaceTexture = this.f117009J) != null) {
            return surfaceTexture;
        }
        C17733k c17733k = new C17733k();
        this.f117007H = c17733k;
        c17733k.start();
        this.f117007H.m140684f();
        return this.f117009J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.pnl
    /* JADX INFO: renamed from: r */
    public void mo140668r() {
        String str = "releaseCamera2：";
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 1");
        eyx.m118802c().m118808g("CameraNV21PreviewInput", "releaseCamera");
        synchronized (this.f117034n) {
            try {
                if (this.f117036p != null) {
                    Handler handler = this.f117038q;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f117038q = null;
                    }
                    this.f117036p.quit();
                    this.f117036p = null;
                }
                try {
                    if (this.f117026f != null) {
                        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "releaseCamera >>>> 2");
                        this.f117026f.release();
                        eyx.m118802c().m118808g("CameraNV21PreviewInput", "releaseCamera1：" + this.f117026f + " this === " + this + " time === " + System.currentTimeMillis());
                        this.f117026f = null;
                        eyx eyxVarM118802c = eyx.m118802c();
                        eyxVarM118802c.m118808g("CameraNV21PreviewInput", "releaseCamera2：" + this.f117026f + " this === " + this + " time === " + System.currentTimeMillis());
                        str = eyxVarM118802c;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    eyx eyxVarM118802c2 = eyx.m118802c();
                    eyxVarM118802c2.m118808g("CameraNV21PreviewInput", "releaseCamera2：" + this.f117026f + " this === " + this + " time === " + System.currentTimeMillis());
                    str = eyxVarM118802c2;
                } finally {
                    eyx.m118802c().m118808g("CameraNV21PreviewInput", str + this.f117026f + " this === " + this + " time === " + System.currentTimeMillis());
                    this.f117026f = null;
                }
                m140635t2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: s */
    public void mo140669s(int i) {
        this.f117003E.m202129x(i);
    }

    @Override // p149l.vql
    /* JADX INFO: renamed from: s1 */
    public void mo140670s1(jkg jkgVar, ktf ktfVar) {
        if (this.f117036p == null || Looper.myLooper() == this.f117036p.getLooper()) {
            this.f117006G = ktfVar;
        } else {
            this.f117038q.post(new RunnableC17723a(jkgVar, ktfVar));
        }
    }

    @Override // p149l.pnl
    public void setExposureCompensation(int i) {
        mnl mnlVar = this.f117026f;
        if (mnlVar != null) {
            mnlVar.setExposureCompensation(i);
        }
    }

    @Override // p149l.pnl
    public void setWarpType(int i) {
        this.f117003E.m202105F(i);
        if (i < 5 || i > 8) {
            return;
        }
        this.f117003E.m202103D(true);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: u */
    public void mo140671u(int i) {
        this.f117003E.m202100A(i);
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: v */
    public void mo140672v(float f) {
        this.f117003E.m202125t(f);
    }

    @Override // p149l.tnl
    /* JADX INFO: renamed from: v1 */
    public long mo140673v1() {
        return 0L;
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: w */
    public void mo140674w(boolean z) {
        this.f117003E.m202128w(z);
    }

    @Override // p149l.wnl
    /* JADX INFO: renamed from: x */
    public vif0 mo140675x(int i, int i2) {
        if (this.f117026f == null) {
            return new vif0(i, i2);
        }
        ulw ulwVar = this.f117028i;
        return CameraUtil.rescalAspectRatio(new vif0(ulwVar.f177136e, ulwVar.f177138f), this.f117026f.mo111774m(), new vif0(i, i2));
    }

    @Override // p149l.pnl
    /* JADX INFO: renamed from: z */
    public void mo140676z() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "resumePreview line 628:videoWidth:" + this.f117028i.f177164s + ",videoHeight:" + this.f117028i.f177166t + ",visualWidth:" + this.f117028i.f177168u + ",visualHeight:" + this.f117028i.f177169v + ",encodeWidth:" + this.f117028i.f177152m + ",encodeHeight:" + this.f117028i.f177154n + ",videoBitrate:" + this.f117028i.f177109H + ",audioBitrate:" + this.f117028i.f177120S + ",videoFPS:" + this.f117028i.f177107F + ",targetWidth" + this.f117032l.m184877f().m198562b() + ",targetHeight" + this.f117032l.m184877f().m198561a() + ", renderFps" + this.f117032l.m184879h() + ", degree" + this.f117012M);
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview");
        eyx eyxVarM118802c = eyx.m118802c();
        StringBuilder sb = new StringBuilder("resumePreview：");
        sb.append(this.f117026f);
        sb.append(" this === ");
        sb.append(this);
        sb.append(" time === ");
        sb.append(System.currentTimeMillis());
        eyxVarM118802c.m118808g("CameraNV21PreviewInput", sb.toString());
        if (this.f117026f == null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 2");
            mo140641E1(this.f117012M, this.f117032l);
            return;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "resumePreview >>>> 1");
        try {
            this.f117026f.mo111758H();
        } catch (RuntimeException e) {
            eyx.m118802c().m118808g("CameraNV21PreviewInput", "resumePreview：" + e.getMessage());
            mo140641E1(this.f117012M, this.f117032l);
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
}
