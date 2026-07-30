package com.core.glcore.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import p149l.h1k;

/* JADX INFO: loaded from: classes.dex */
public abstract class GLRenderer extends Thread {
    private static final String TAG = "mediaRender";
    private ArrayBlockingQueue<Event> eventQueue;
    private boolean isRelease;
    private final List<GLSurface> outputSurfaces;
    private boolean rendering;
    private EGLConfig eglConfig = null;
    private EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext eglContext = EGL14.EGL_NO_CONTEXT;

    public static class Event {
        static final int ADD_SURFACE = 1;
        static final int RELEASE = 7;
        static final int REMOVE_SURFACE = 2;
        static final int REQ_RENDER = 4;
        static final int RUNNABLE = 6;
        static final int START_RENDER = 3;
        static final int STOP_RENDER = 5;
        final int event;
        Object param;

        public Event(int i) {
            this.event = i;
        }
    }

    public GLRenderer() {
        setName("GLRenderer-" + getId());
        this.outputSurfaces = new ArrayList();
        this.rendering = false;
        this.isRelease = false;
        this.eventQueue = new ArrayBlockingQueue<>(100);
    }

    private static String getEGLErrorString() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    private boolean makeOutputSurface(GLSurface gLSurface) {
        try {
            int i = gLSurface.type;
            if (i == 0) {
                gLSurface.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, gLSurface.surface, new int[]{12344}, 0);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        MDLog.m7399w("mediaRender", "nonsupport pixmap surface");
                        return false;
                    }
                    MDLog.m7399w("mediaRender", "surface type error " + gLSurface.type);
                    return false;
                }
                GLSurface.Viewport viewport = gLSurface.viewport;
                gLSurface.eglSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, viewport.width, 12374, viewport.height, 12344}, 0);
            }
            return true;
        } catch (Exception unused) {
            MDLog.m7391e("mediaRender", "can't create eglSurface");
            gLSurface.eglSurface = EGL14.EGL_NO_SURFACE;
            return false;
        }
    }

    private void render() {
        for (GLSurface gLSurface : this.outputSurfaces) {
            if (gLSurface.eglSurface != EGL14.EGL_NO_SURFACE || makeOutputSurface(gLSurface)) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = gLSurface.eglSurface;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                GLSurface.Viewport viewport = gLSurface.viewport;
                GLES20.glViewport(viewport.f5733x, viewport.f5734y, viewport.width, viewport.height);
                onDrawFrame(gLSurface);
                EGL14.eglSwapBuffers(this.eglDisplay, gLSurface.eglSurface);
            }
        }
    }

    public void addSurface(@NonNull GLSurface gLSurface) {
        Event event = new Event(1);
        event.param = gLSurface;
        if (this.eventQueue.offer(event)) {
            return;
        }
        MDLog.m7391e("mediaRender", "queue full");
    }

    public void createGL() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.eglConfig = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.eglContext = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        GLSurface gLSurface = new GLSurface(512, 512);
        GLSurface.Viewport viewport = gLSurface.viewport;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, viewport.width, 12374, viewport.height, 12344}, 0);
        gLSurface.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.eglContext);
    }

    public void destroyGL() {
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
    }

    public abstract void onCreated();

    public abstract void onDestroy();

    public abstract void onDrawFrame(GLSurface gLSurface);

    public abstract void onUpdate();

    public boolean postRunnable(@NonNull Runnable runnable) {
        Event event = new Event(6);
        event.param = runnable;
        if (this.eventQueue.offer(event)) {
            return true;
        }
        MDLog.m7391e("mediaRender", "queue full");
        return false;
    }

    public void release() {
        if (this.eventQueue.offer(new Event(7))) {
            while (isAlive()) {
                try {
                    join(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void removeSurface(@NonNull GLSurface gLSurface) {
        Event event = new Event(2);
        event.param = gLSurface;
        if (this.eventQueue.offer(event)) {
            return;
        }
        MDLog.m7391e("mediaRender", "queue full");
    }

    public void requestRender() {
        this.eventQueue.offer(new Event(4));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        MDLog.m7389d("mediaRender", getName() + ": render create");
        createGL();
        onCreated();
        while (!this.isRelease) {
            try {
                Event eventTake = this.eventQueue.take();
                switch (eventTake.event) {
                    case 1:
                        GLSurface gLSurface = (GLSurface) eventTake.param;
                        MDLog.m7389d("mediaRender", ShareConstants.RES_ADD_TITLE + gLSurface);
                        makeOutputSurface(gLSurface);
                        this.outputSurfaces.add(gLSurface);
                        break;
                    case 2:
                        GLSurface gLSurface2 = (GLSurface) eventTake.param;
                        MDLog.m7389d("mediaRender", "remove:" + gLSurface2);
                        EGL14.eglDestroySurface(this.eglDisplay, gLSurface2.eglSurface);
                        this.outputSurfaces.remove(gLSurface2);
                        break;
                    case 3:
                        this.rendering = true;
                        break;
                    case 4:
                        if (this.rendering) {
                            onUpdate();
                            render();
                        }
                        break;
                    case 5:
                        this.rendering = false;
                        break;
                    case 6:
                        ((Runnable) eventTake.param).run();
                        break;
                    case 7:
                        this.isRelease = true;
                        break;
                    default:
                        MDLog.m7391e("mediaRender", "event error: " + eventTake);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        onDestroy();
        for (GLSurface gLSurface3 : this.outputSurfaces) {
            EGL14.eglDestroySurface(this.eglDisplay, gLSurface3.eglSurface);
            gLSurface3.eglSurface = EGL14.EGL_NO_SURFACE;
        }
        destroyGL();
        this.eventQueue.clear();
        MDLog.m7389d("mediaRender", getName() + ": render release");
    }

    @Override // java.lang.Thread
    public void start() {
        MDLog.m7399w("mediaRender", "Don't call this function");
    }

    public void startRender() {
        if (!this.eventQueue.offer(new Event(3))) {
            MDLog.m7391e("mediaRender", "queue full");
        }
        if (getState() == Thread.State.NEW) {
            super.start();
        }
    }

    public void stopRender() {
        if (this.eventQueue.offer(new Event(5))) {
            return;
        }
        MDLog.m7391e("mediaRender", "queue full");
    }
}
