package p153l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes6.dex */
public final class zet0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, xet0 {

    /* JADX INFO: renamed from: B */
    public static final float[] f204046B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: A */
    public volatile boolean f204047A;

    /* JADX INFO: renamed from: a */
    public final yet0 f204048a;

    /* JADX INFO: renamed from: b */
    public final float[] f204049b;

    /* JADX INFO: renamed from: c */
    public final float[] f204050c;

    /* JADX INFO: renamed from: d */
    public final float[] f204051d;

    /* JADX INFO: renamed from: e */
    public final float[] f204052e;

    /* JADX INFO: renamed from: f */
    public final float[] f204053f;

    /* JADX INFO: renamed from: g */
    public final float[] f204054g;

    /* JADX INFO: renamed from: h */
    public final float[] f204055h;

    /* JADX INFO: renamed from: i */
    public float f204056i;

    /* JADX INFO: renamed from: j */
    public float f204057j;

    /* JADX INFO: renamed from: k */
    public float f204058k;

    /* JADX INFO: renamed from: l */
    public int f204059l;

    /* JADX INFO: renamed from: m */
    public int f204060m;

    /* JADX INFO: renamed from: n */
    public SurfaceTexture f204061n;

    /* JADX INFO: renamed from: o */
    public SurfaceTexture f204062o;

    /* JADX INFO: renamed from: p */
    public int f204063p;

    /* JADX INFO: renamed from: q */
    public int f204064q;

    /* JADX INFO: renamed from: r */
    public int f204065r;

    /* JADX INFO: renamed from: s */
    public final FloatBuffer f204066s;

    /* JADX INFO: renamed from: t */
    public final CountDownLatch f204067t;

    /* JADX INFO: renamed from: u */
    public final Object f204068u;

    /* JADX INFO: renamed from: v */
    public EGL10 f204069v;

    /* JADX INFO: renamed from: w */
    public EGLDisplay f204070w;

    /* JADX INFO: renamed from: x */
    public EGLContext f204071x;

    /* JADX INFO: renamed from: y */
    public EGLSurface f204072y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f204073z;

    public zet0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f204046B;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f204066s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f204049b = new float[9];
        this.f204050c = new float[9];
        this.f204051d = new float[9];
        this.f204052e = new float[9];
        this.f204053f = new float[9];
        this.f204054g = new float[9];
        this.f204055h = new float[9];
        this.f204056i = Float.NaN;
        yet0 yet0Var = new yet0(context);
        this.f204048a = yet0Var;
        yet0Var.m215448b(this);
        this.f204067t = new CountDownLatch(1);
        this.f204068u = new Object();
    }

    /* JADX INFO: renamed from: g */
    public static final void m219505g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m219506h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        fArr[7] = (f19 * f25) + (f22 * fArr3[4]) + (f9 * f24);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    /* JADX INFO: renamed from: i */
    public static final void m219507i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: j */
    public static final void m219508j(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: k */
    public static final int m219509k(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m219505g("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            m219505g("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            m219505g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            m219505g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                m219505g("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m219510a() {
        if (this.f204062o == null) {
            return null;
        }
        try {
            this.f204067t.await();
        } catch (InterruptedException unused) {
        }
        return this.f204061n;
    }

    /* JADX INFO: renamed from: b */
    public final void m219511b(int i, int i2) {
        synchronized (this.f204068u) {
            this.f204060m = i;
            this.f204059l = i2;
            this.f204073z = true;
            this.f204068u.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m219512c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f204060m = i;
        this.f204059l = i2;
        this.f204062o = surfaceTexture;
    }

    /* JADX INFO: renamed from: d */
    public final void m219513d() {
        synchronized (this.f204068u) {
            this.f204047A = true;
            this.f204062o = null;
            this.f204068u.notifyAll();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m219514e(float f, float f2) {
        int i = this.f204060m;
        int i2 = this.f204059l;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.f204057j -= (f * 1.7453293f) / f3;
        float f4 = this.f204058k - ((f2 * 1.7453293f) / f3);
        this.f204058k = f4;
        if (f4 < -1.5707964f) {
            this.f204058k = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f204058k = 1.5707964f;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final boolean m219515f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f204072y;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f204069v.eglDestroySurface(this.f204070w, this.f204072y) | this.f204069v.eglMakeCurrent(this.f204070w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f204072y = null;
        }
        EGLContext eGLContext = this.f204071x;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f204069v.eglDestroyContext(this.f204070w, eGLContext);
            this.f204071x = null;
        }
        EGLDisplay eGLDisplay = this.f204070w;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f204069v.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f204070w = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f204065r++;
        synchronized (this.f204068u) {
            this.f204068u.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.f204062o == null) {
            dct0.m115295d("SphericalVideoProcessor started with no output texture.");
            this.f204067t.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f204069v = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f204070w = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f204069v.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f204069v.eglChooseConfig(this.f204070w, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGL10 egl11 = this.f204069v;
                EGLDisplay eGLDisplay = this.f204070w;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.f204071x = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.f204069v.eglCreateWindowSurface(this.f204070w, eGLConfig, this.f204062o, null);
                    this.f204072y = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.f204069v.eglMakeCurrent(this.f204070w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f204071x)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        dgs0 dgs0Var = sgs0.f168346j1;
        int iM219509k = m219509k(35633, !((String) jas0.m144075c().m176505a(dgs0Var)).equals(dgs0Var.m115749m()) ? (String) jas0.m144075c().m176505a(dgs0Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iM219509k == 0) {
            iGlCreateProgram = 0;
        } else {
            dgs0 dgs0Var2 = sgs0.f168359k1;
            int iM219509k2 = m219509k(35632, !((String) jas0.m144075c().m176505a(dgs0Var2)).equals(dgs0Var2.m115749m()) ? (String) jas0.m144075c().m176505a(dgs0Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iM219509k2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                m219505g("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM219509k);
                    m219505g("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM219509k2);
                    m219505g("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    m219505g("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    m219505g("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        m219505g("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        m219505g("validateProgram");
                    }
                }
            }
        }
        this.f204063p = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        m219505g("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f204063p, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f204066s);
        m219505g("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        m219505g("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m219505g("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        m219505g("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m219505g("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m219505g("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m219505g("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m219505g("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f204063p, "uVMat");
        this.f204064q = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.f204063p;
        if (!z || i2 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f204069v.eglGetError())));
            dct0.m115295d(strConcat);
            bxy0.m106933q().m120275w(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            m219515f();
            this.f204067t.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.f204061n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f204067t.countDown();
        this.f204048a.m215449c();
        try {
            try {
                try {
                    this.f204073z = true;
                    while (!this.f204047A) {
                        while (this.f204065r > 0) {
                            this.f204061n.updateTexImage();
                            this.f204065r--;
                        }
                        if (this.f204048a.m215451e(this.f204049b)) {
                            if (Float.isNaN(this.f204056i)) {
                                float[] fArr = this.f204049b;
                                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                float f = fArr[0];
                                float f2 = fArr2[0];
                                float f3 = fArr[1];
                                float f4 = fArr2[1];
                                float[] fArr3 = {(f * f2) + (f3 * f4) + (fArr[2] * 0.0f), (fArr[3] * f2) + (fArr[4] * f4) + (fArr[5] * 0.0f), (fArr[6] * f2) + (fArr[7] * f4) + (fArr[8] * 0.0f)};
                                this.f204056i = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                            }
                            m219508j(this.f204054g, this.f204056i + this.f204057j);
                        } else {
                            m219507i(this.f204049b, -1.5707964f);
                            m219508j(this.f204054g, this.f204057j);
                        }
                        m219507i(this.f204050c, 1.5707964f);
                        m219506h(this.f204051d, this.f204054g, this.f204050c);
                        m219506h(this.f204052e, this.f204049b, this.f204051d);
                        m219507i(this.f204053f, this.f204058k);
                        m219506h(this.f204055h, this.f204053f, this.f204052e);
                        GLES20.glUniformMatrix3fv(this.f204064q, 1, false, this.f204055h, 0);
                        GLES20.glDrawArrays(5, 0, 4);
                        m219505g("drawArrays");
                        GLES20.glFinish();
                        this.f204069v.eglSwapBuffers(this.f204070w, this.f204072y);
                        if (this.f204073z) {
                            GLES20.glViewport(0, 0, this.f204060m, this.f204059l);
                            m219505g("viewport");
                            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f204063p, "uFOVx");
                            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f204063p, "uFOVy");
                            int i3 = this.f204060m;
                            int i4 = this.f204059l;
                            if (i3 > i4) {
                                GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                                GLES20.glUniform1f(iGlGetUniformLocation3, (this.f204059l * 0.87266463f) / this.f204060m);
                            } else {
                                GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                                GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                            }
                            this.f204073z = false;
                        }
                        try {
                            synchronized (this.f204068u) {
                                try {
                                    if (!this.f204047A && !this.f204073z && this.f204065r == 0) {
                                        this.f204068u.wait();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    dct0.m115296e("SphericalVideoProcessor died.", th2);
                    bxy0.m106933q().m120275w(th2, "SphericalVideoProcessor.run.2");
                }
            } catch (IllegalStateException unused2) {
                dct0.m115298g("SphericalVideoProcessor halted unexpectedly.");
            }
            this.f204048a.m215450d();
            this.f204061n.setOnFrameAvailableListener(null);
            this.f204061n = null;
            m219515f();
        } catch (Throwable th3) {
            this.f204048a.m215450d();
            this.f204061n.setOnFrameAvailableListener(null);
            this.f204061n = null;
            m219515f();
            throw th3;
        }
    }

    @Override // p153l.xet0
    public final void zza() {
        synchronized (this.f204068u) {
            this.f204068u.notifyAll();
        }
    }
}
