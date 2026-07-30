package p153l;

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
public abstract class uej extends Thread {

    /* JADX INFO: renamed from: a */
    private EGLConfig f178661a = null;

    /* JADX INFO: renamed from: b */
    private EGLDisplay f178662b = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c */
    private EGLContext f178663c = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: d */
    private ArrayBlockingQueue<C20552a> f178664d;

    /* JADX INFO: renamed from: e */
    private final List<afj> f178665e;

    /* JADX INFO: renamed from: f */
    private boolean f178666f;

    /* JADX INFO: renamed from: g */
    private boolean f178667g;

    /* JADX INFO: renamed from: l.uej$a */
    public static class C20552a {

        /* JADX INFO: renamed from: a */
        final int f178668a;

        /* JADX INFO: renamed from: b */
        Object f178669b;

        public C20552a(int i) {
            this.f178668a = i;
        }
    }

    public uej() {
        setName("GLRenderer-" + getId());
        this.f178665e = new ArrayList();
        this.f178666f = false;
        this.f178667g = false;
        this.f178664d = new ArrayBlockingQueue<>(100);
    }

    /* JADX INFO: renamed from: d */
    private boolean m195766d(afj afjVar) {
        try {
            int i = afjVar.f70909a;
            if (i == 0) {
                afjVar.f70911c = EGL14.eglCreateWindowSurface(this.f178662b, this.f178661a, afjVar.f70910b, new int[]{12344}, 0);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        MDLog.m7453w(MDLogTag.MOMENT_RENDER_TAG, "nonsupport pixmap surface");
                        return false;
                    }
                    MDLog.m7453w(MDLogTag.MOMENT_RENDER_TAG, "surface type error " + afjVar.f70909a);
                    return false;
                }
                afj.C15698a c15698a = afjVar.f70912d;
                afjVar.f70911c = EGL14.eglCreatePbufferSurface(this.f178662b, this.f178661a, new int[]{12375, c15698a.f70915c, 12374, c15698a.f70916d, 12344}, 0);
            }
            return true;
        } catch (Exception unused) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "can't create eglSurface");
            afjVar.f70911c = EGL14.EGL_NO_SURFACE;
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m195767j() {
        for (afj afjVar : this.f178665e) {
            if (afjVar.f70911c != EGL14.EGL_NO_SURFACE || m195766d(afjVar)) {
                EGLDisplay eGLDisplay = this.f178662b;
                EGLSurface eGLSurface = afjVar.f70911c;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f178663c);
                afj.C15698a c15698a = afjVar.f70912d;
                GLES20.glViewport(c15698a.f70913a, c15698a.f70914b, c15698a.f70915c, c15698a.f70916d);
                mo189620g(afjVar);
                EGL14.eglSwapBuffers(this.f178662b, afjVar.f70911c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m195768a(@NonNull afj afjVar) {
        C20552a c20552a = new C20552a(1);
        c20552a.f178669b = afjVar;
        if (this.f178664d.offer(c20552a)) {
            return;
        }
        MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "queue full");
    }

    /* JADX INFO: renamed from: b */
    public void m195769b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f178662b = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f178662b, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f178661a = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f178662b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f178663c = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        afj afjVar = new afj(512, 512);
        afj.C15698a c15698a = afjVar.f70912d;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f178662b, this.f178661a, new int[]{12375, c15698a.f70915c, 12374, c15698a.f70916d, 12344}, 0);
        afjVar.f70911c = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.f178662b, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.f178663c);
    }

    /* JADX INFO: renamed from: c */
    public void m195770c() {
        EGL14.eglDestroyContext(this.f178662b, this.f178663c);
        this.f178663c = EGL14.EGL_NO_CONTEXT;
        this.f178662b = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo189618e();

    /* JADX INFO: renamed from: f */
    public abstract void mo189619f();

    /* JADX INFO: renamed from: g */
    public abstract void mo189620g(afj afjVar);

    /* JADX INFO: renamed from: h */
    public abstract void mo189621h();

    /* JADX INFO: renamed from: i */
    public void m195771i() {
        if (this.f178664d.offer(new C20552a(7))) {
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
    public void m195772k() {
        this.f178664d.offer(new C20552a(4));
    }

    /* JADX INFO: renamed from: l */
    public void m195773l() {
        if (!this.f178664d.offer(new C20552a(3))) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "queue full");
        }
        if (getState() == Thread.State.NEW) {
            super.start();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, getName() + ": render create");
        m195769b();
        mo189618e();
        while (!this.f178667g) {
            try {
                C20552a c20552aTake = this.f178664d.take();
                switch (c20552aTake.f178668a) {
                    case 1:
                        afj afjVar = (afj) c20552aTake.f178669b;
                        MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, ShareConstants.RES_ADD_TITLE + afjVar);
                        m195766d(afjVar);
                        this.f178665e.add(afjVar);
                        break;
                    case 2:
                        afj afjVar2 = (afj) c20552aTake.f178669b;
                        MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "remove:" + afjVar2);
                        EGL14.eglDestroySurface(this.f178662b, afjVar2.f70911c);
                        this.f178665e.remove(afjVar2);
                        break;
                    case 3:
                        this.f178666f = true;
                        break;
                    case 4:
                        if (this.f178666f) {
                            mo189621h();
                            m195767j();
                        }
                        break;
                    case 5:
                        this.f178666f = false;
                        break;
                    case 6:
                        ((Runnable) c20552aTake.f178669b).run();
                        break;
                    case 7:
                        this.f178667g = true;
                        break;
                    default:
                        MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "event error: " + c20552aTake);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mo189619f();
        for (afj afjVar3 : this.f178665e) {
            EGL14.eglDestroySurface(this.f178662b, afjVar3.f70911c);
            afjVar3.f70911c = EGL14.EGL_NO_SURFACE;
        }
        m195770c();
        this.f178664d.clear();
        MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, getName() + ": render release");
    }

    @Override // java.lang.Thread
    public void start() {
        MDLog.m7453w(MDLogTag.MOMENT_RENDER_TAG, "Don't call this function");
    }
}
