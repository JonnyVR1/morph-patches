package p149l;

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
public final class t5t0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, r5t0 {

    /* JADX INFO: renamed from: B */
    public static final float[] f167849B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: A */
    public volatile boolean f167850A;

    /* JADX INFO: renamed from: a */
    public final s5t0 f167851a;

    /* JADX INFO: renamed from: b */
    public final float[] f167852b;

    /* JADX INFO: renamed from: c */
    public final float[] f167853c;

    /* JADX INFO: renamed from: d */
    public final float[] f167854d;

    /* JADX INFO: renamed from: e */
    public final float[] f167855e;

    /* JADX INFO: renamed from: f */
    public final float[] f167856f;

    /* JADX INFO: renamed from: g */
    public final float[] f167857g;

    /* JADX INFO: renamed from: h */
    public final float[] f167858h;

    /* JADX INFO: renamed from: i */
    public float f167859i;

    /* JADX INFO: renamed from: j */
    public float f167860j;

    /* JADX INFO: renamed from: k */
    public float f167861k;

    /* JADX INFO: renamed from: l */
    public int f167862l;

    /* JADX INFO: renamed from: m */
    public int f167863m;

    /* JADX INFO: renamed from: n */
    public SurfaceTexture f167864n;

    /* JADX INFO: renamed from: o */
    public SurfaceTexture f167865o;

    /* JADX INFO: renamed from: p */
    public int f167866p;

    /* JADX INFO: renamed from: q */
    public int f167867q;

    /* JADX INFO: renamed from: r */
    public int f167868r;

    /* JADX INFO: renamed from: s */
    public final FloatBuffer f167869s;

    /* JADX INFO: renamed from: t */
    public final CountDownLatch f167870t;

    /* JADX INFO: renamed from: u */
    public final Object f167871u;

    /* JADX INFO: renamed from: v */
    public EGL10 f167872v;

    /* JADX INFO: renamed from: w */
    public EGLDisplay f167873w;

    /* JADX INFO: renamed from: x */
    public EGLContext f167874x;

    /* JADX INFO: renamed from: y */
    public EGLSurface f167875y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f167876z;

    public t5t0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f167849B;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f167869s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f167852b = new float[9];
        this.f167853c = new float[9];
        this.f167854d = new float[9];
        this.f167855e = new float[9];
        this.f167856f = new float[9];
        this.f167857g = new float[9];
        this.f167858h = new float[9];
        this.f167859i = Float.NaN;
        s5t0 s5t0Var = new s5t0(context);
        this.f167851a = s5t0Var;
        s5t0Var.m182374b(this);
        this.f167870t = new CountDownLatch(1);
        this.f167871u = new Object();
    }

    /* JADX INFO: renamed from: g */
    public static final void m187339g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m187340h(float[] fArr, float[] fArr2, float[] fArr3) {
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
    public static final void m187341i(float[] fArr, float f) {
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
    public static final void m187342j(float[] fArr, float f) {
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
    public static final int m187343k(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m187339g("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            m187339g("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            m187339g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            m187339g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                m187339g("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m187344a() {
        if (this.f167865o == null) {
            return null;
        }
        try {
            this.f167870t.await();
        } catch (InterruptedException unused) {
        }
        return this.f167864n;
    }

    /* JADX INFO: renamed from: b */
    public final void m187345b(int i, int i2) {
        synchronized (this.f167871u) {
            this.f167863m = i;
            this.f167862l = i2;
            this.f167876z = true;
            this.f167871u.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m187346c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f167863m = i;
        this.f167862l = i2;
        this.f167865o = surfaceTexture;
    }

    /* JADX INFO: renamed from: d */
    public final void m187347d() {
        synchronized (this.f167871u) {
            this.f167850A = true;
            this.f167865o = null;
            this.f167871u.notifyAll();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m187348e(float f, float f2) {
        int i = this.f167863m;
        int i2 = this.f167862l;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.f167860j -= (f * 1.7453293f) / f3;
        float f4 = this.f167861k - ((f2 * 1.7453293f) / f3);
        this.f167861k = f4;
        if (f4 < -1.5707964f) {
            this.f167861k = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f167861k = 1.5707964f;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final boolean m187349f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f167875y;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f167872v.eglDestroySurface(this.f167873w, this.f167875y) | this.f167872v.eglMakeCurrent(this.f167873w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f167875y = null;
        }
        EGLContext eGLContext = this.f167874x;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f167872v.eglDestroyContext(this.f167873w, eGLContext);
            this.f167874x = null;
        }
        EGLDisplay eGLDisplay = this.f167873w;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f167872v.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f167873w = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f167868r++;
        synchronized (this.f167871u) {
            this.f167871u.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.f167865o == null) {
            x2t0.m206866d("SphericalVideoProcessor started with no output texture.");
            this.f167870t.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f167872v = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f167873w = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f167872v.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f167872v.eglChooseConfig(this.f167873w, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGL10 egl11 = this.f167872v;
                EGLDisplay eGLDisplay = this.f167873w;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.f167874x = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.f167872v.eglCreateWindowSurface(this.f167873w, eGLConfig, this.f167865o, null);
                    this.f167875y = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.f167872v.eglMakeCurrent(this.f167873w, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f167874x)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        x6s0 x6s0Var = m7s0.f132275j1;
        int iM187343k = m187343k(35633, !((String) d1s0.m109677c().m144697a(x6s0Var)).equals(x6s0Var.m207208m()) ? (String) d1s0.m109677c().m144697a(x6s0Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iM187343k == 0) {
            iGlCreateProgram = 0;
        } else {
            x6s0 x6s0Var2 = m7s0.f132288k1;
            int iM187343k2 = m187343k(35632, !((String) d1s0.m109677c().m144697a(x6s0Var2)).equals(x6s0Var2.m207208m()) ? (String) d1s0.m109677c().m144697a(x6s0Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iM187343k2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                m187339g("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM187343k);
                    m187339g("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM187343k2);
                    m187339g("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    m187339g("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    m187339g("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        m187339g("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        m187339g("validateProgram");
                    }
                }
            }
        }
        this.f167866p = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        m187339g("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f167866p, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f167869s);
        m187339g("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        m187339g("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m187339g("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        m187339g("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m187339g("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m187339g("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m187339g("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m187339g("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f167866p, "uVMat");
        this.f167867q = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.f167866p;
        if (!z || i2 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f167872v.eglGetError())));
            x2t0.m206866d(strConcat);
            vny0.m199079q().m212290w(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            m187349f();
            this.f167870t.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.f167864n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f167870t.countDown();
        this.f167851a.m182375c();
        try {
            try {
                try {
                    this.f167876z = true;
                    while (!this.f167850A) {
                        while (this.f167868r > 0) {
                            this.f167864n.updateTexImage();
                            this.f167868r--;
                        }
                        if (this.f167851a.m182377e(this.f167852b)) {
                            if (Float.isNaN(this.f167859i)) {
                                float[] fArr = this.f167852b;
                                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                float f = fArr[0];
                                float f2 = fArr2[0];
                                float f3 = fArr[1];
                                float f4 = fArr2[1];
                                float[] fArr3 = {(f * f2) + (f3 * f4) + (fArr[2] * 0.0f), (fArr[3] * f2) + (fArr[4] * f4) + (fArr[5] * 0.0f), (fArr[6] * f2) + (fArr[7] * f4) + (fArr[8] * 0.0f)};
                                this.f167859i = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                            }
                            m187342j(this.f167857g, this.f167859i + this.f167860j);
                        } else {
                            m187341i(this.f167852b, -1.5707964f);
                            m187342j(this.f167857g, this.f167860j);
                        }
                        m187341i(this.f167853c, 1.5707964f);
                        m187340h(this.f167854d, this.f167857g, this.f167853c);
                        m187340h(this.f167855e, this.f167852b, this.f167854d);
                        m187341i(this.f167856f, this.f167861k);
                        m187340h(this.f167858h, this.f167856f, this.f167855e);
                        GLES20.glUniformMatrix3fv(this.f167867q, 1, false, this.f167858h, 0);
                        GLES20.glDrawArrays(5, 0, 4);
                        m187339g("drawArrays");
                        GLES20.glFinish();
                        this.f167872v.eglSwapBuffers(this.f167873w, this.f167875y);
                        if (this.f167876z) {
                            GLES20.glViewport(0, 0, this.f167863m, this.f167862l);
                            m187339g("viewport");
                            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f167866p, "uFOVx");
                            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f167866p, "uFOVy");
                            int i3 = this.f167863m;
                            int i4 = this.f167862l;
                            if (i3 > i4) {
                                GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                                GLES20.glUniform1f(iGlGetUniformLocation3, (this.f167862l * 0.87266463f) / this.f167863m);
                            } else {
                                GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                                GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                            }
                            this.f167876z = false;
                        }
                        try {
                            synchronized (this.f167871u) {
                                try {
                                    if (!this.f167850A && !this.f167876z && this.f167868r == 0) {
                                        this.f167871u.wait();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    x2t0.m206867e("SphericalVideoProcessor died.", th2);
                    vny0.m199079q().m212290w(th2, "SphericalVideoProcessor.run.2");
                }
            } catch (IllegalStateException unused2) {
                x2t0.m206869g("SphericalVideoProcessor halted unexpectedly.");
            }
            this.f167851a.m182376d();
            this.f167864n.setOnFrameAvailableListener(null);
            this.f167864n = null;
            m187349f();
        } catch (Throwable th3) {
            this.f167851a.m182376d();
            this.f167864n.setOnFrameAvailableListener(null);
            this.f167864n = null;
            m187349f();
            throw th3;
        }
    }

    @Override // p149l.r5t0
    public final void zza() {
        synchronized (this.f167871u) {
            this.f167871u.notifyAll();
        }
    }
}
