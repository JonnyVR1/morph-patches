package p149l;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class acj extends Thread {

    /* JADX INFO: renamed from: a */
    private EGLConfig f68851a = null;

    /* JADX INFO: renamed from: b */
    private EGLDisplay f68852b = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c */
    private EGLContext f68853c = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: d */
    private ArrayBlockingQueue<C15581a> f68854d;

    /* JADX INFO: renamed from: e */
    private final List<gcj> f68855e;

    /* JADX INFO: renamed from: f */
    private boolean f68856f;

    /* JADX INFO: renamed from: g */
    private boolean f68857g;

    /* JADX INFO: renamed from: l.acj$a */
    public static class C15581a {

        /* JADX INFO: renamed from: a */
        final int f68858a;

        /* JADX INFO: renamed from: b */
        Object f68859b;

        public C15581a(int i) {
            this.f68858a = i;
        }
    }

    public acj() {
        setName("GLRenderer-" + getId());
        this.f68855e = new ArrayList();
        this.f68856f = false;
        this.f68857g = false;
        this.f68854d = new ArrayBlockingQueue<>(100);
    }

    /* JADX INFO: renamed from: d */
    private boolean m95804d(gcj gcjVar) {
        try {
            int i = gcjVar.f102018a;
            if (i == 0) {
                gcjVar.f102020c = EGL14.eglCreateWindowSurface(this.f68852b, this.f68851a, gcjVar.f102019b, new int[]{12344}, 0);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        MDLog.m7399w(MDLogTag.MOMENT_RENDER_TAG, "nonsupport pixmap surface");
                        return false;
                    }
                    MDLog.m7399w(MDLogTag.MOMENT_RENDER_TAG, "surface type error " + gcjVar.f102018a);
                    return false;
                }
                gcj.C17058a c17058a = gcjVar.f102021d;
                gcjVar.f102020c = EGL14.eglCreatePbufferSurface(this.f68852b, this.f68851a, new int[]{12375, c17058a.f102024c, 12374, c17058a.f102025d, 12344}, 0);
            }
            return true;
        } catch (Exception unused) {
            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "can't create eglSurface");
            gcjVar.f102020c = EGL14.EGL_NO_SURFACE;
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m95805j() {
        for (gcj gcjVar : this.f68855e) {
            if (gcjVar.f102020c != EGL14.EGL_NO_SURFACE || m95804d(gcjVar)) {
                EGLDisplay eGLDisplay = this.f68852b;
                EGLSurface eGLSurface = gcjVar.f102020c;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f68853c);
                gcj.C17058a c17058a = gcjVar.f102021d;
                GLES20.glViewport(c17058a.f102022a, c17058a.f102023b, c17058a.f102024c, c17058a.f102025d);
                mo95811g(gcjVar);
                EGL14.eglSwapBuffers(this.f68852b, gcjVar.f102020c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m95806a(@NonNull gcj gcjVar) {
        C15581a c15581a = new C15581a(1);
        c15581a.f68859b = gcjVar;
        if (this.f68854d.offer(c15581a)) {
            return;
        }
        MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "queue full");
    }

    /* JADX INFO: renamed from: b */
    public void m95807b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f68852b = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f68852b, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f68851a = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f68852b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f68853c = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        gcj gcjVar = new gcj(512, 512);
        gcj.C17058a c17058a = gcjVar.f102021d;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f68852b, this.f68851a, new int[]{12375, c17058a.f102024c, 12374, c17058a.f102025d, 12344}, 0);
        gcjVar.f102020c = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.f68852b, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.f68853c);
    }

    /* JADX INFO: renamed from: c */
    public void m95808c() {
        EGL14.eglDestroyContext(this.f68852b, this.f68853c);
        this.f68853c = EGL14.EGL_NO_CONTEXT;
        this.f68852b = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo95809e();

    /* JADX INFO: renamed from: f */
    public abstract void mo95810f();

    /* JADX INFO: renamed from: g */
    public abstract void mo95811g(gcj gcjVar);

    /* JADX INFO: renamed from: h */
    public abstract void mo95812h();

    /* JADX INFO: renamed from: i */
    public void m95813i() {
        if (this.f68854d.offer(new C15581a(7))) {
            while (isAlive()) {
                try {
                    join(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m95814k() {
        this.f68854d.offer(new C15581a(4));
    }

    /* JADX INFO: renamed from: l */
    public void m95815l() {
        if (!this.f68854d.offer(new C15581a(3))) {
            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "queue full");
        }
        if (getState() == Thread.State.NEW) {
            super.start();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, getName() + ": render create");
        m95807b();
        mo95809e();
        while (!this.f68857g) {
            try {
                C15581a c15581aTake = this.f68854d.take();
                switch (c15581aTake.f68858a) {
                    case 1:
                        gcj gcjVar = (gcj) c15581aTake.f68859b;
                        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, ShareConstants.RES_ADD_TITLE + gcjVar);
                        m95804d(gcjVar);
                        this.f68855e.add(gcjVar);
                        break;
                    case 2:
                        gcj gcjVar2 = (gcj) c15581aTake.f68859b;
                        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "remove:" + gcjVar2);
                        EGL14.eglDestroySurface(this.f68852b, gcjVar2.f102020c);
                        this.f68855e.remove(gcjVar2);
                        break;
                    case 3:
                        this.f68856f = true;
                        break;
                    case 4:
                        if (this.f68856f) {
                            mo95812h();
                            m95805j();
                        }
                        break;
                    case 5:
                        this.f68856f = false;
                        break;
                    case 6:
                        ((Runnable) c15581aTake.f68859b).run();
                        break;
                    case 7:
                        this.f68857g = true;
                        break;
                    default:
                        MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "event error: " + c15581aTake);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mo95810f();
        for (gcj gcjVar3 : this.f68855e) {
            EGL14.eglDestroySurface(this.f68852b, gcjVar3.f102020c);
            gcjVar3.f102020c = EGL14.EGL_NO_SURFACE;
        }
        m95808c();
        this.f68854d.clear();
        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, getName() + ": render release");
    }

    @Override // java.lang.Thread
    public void start() {
        MDLog.m7399w(MDLogTag.MOMENT_RENDER_TAG, "Don't call this function");
    }
}
