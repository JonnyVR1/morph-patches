package p153l;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class i3f0 {

    /* JADX INFO: renamed from: a */
    uje f112717a;

    /* JADX INFO: renamed from: b */
    HandlerThread f112718b;

    /* JADX INFO: renamed from: c */
    HandlerC17630a f112719c;

    /* JADX INFO: renamed from: d */
    EGLContext f112720d;

    /* JADX INFO: renamed from: e */
    Object f112721e = new Object();

    /* JADX INFO: renamed from: f */
    boolean f112722f = false;

    /* JADX INFO: renamed from: g */
    boolean f112723g = true;

    /* JADX INFO: renamed from: l.i3f0$a */
    public class HandlerC17630a extends Handler {
        public HandlerC17630a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                synchronized (i3f0.this.f112721e) {
                    try {
                        i3f0 i3f0Var = i3f0.this;
                        if (i3f0Var.f112717a == null) {
                            i3f0Var.f112717a = new uje();
                            i3f0 i3f0Var2 = i3f0.this;
                            i3f0Var2.f112717a.m196324b(i3f0Var2.f112720d);
                        }
                        i3f0 i3f0Var3 = i3f0.this;
                        i3f0Var3.f112722f = true;
                        i3f0Var3.f112721e.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (i != 2) {
                return;
            }
            synchronized (i3f0.this.f112721e) {
                try {
                    uje ujeVar = i3f0.this.f112717a;
                    if (ujeVar != null) {
                        ujeVar.m196328g();
                        i3f0.this.f112717a = null;
                    }
                    i3f0 i3f0Var4 = i3f0.this;
                    i3f0Var4.f112722f = false;
                    i3f0Var4.f112721e.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public uje m138283a(EGLContext eGLContext) {
        HandlerC17630a handlerC17630a;
        uje ujeVar;
        if (this.f112718b == null) {
            HandlerThread handlerThread = new HandlerThread("ShareEglContexHandler" + System.currentTimeMillis());
            this.f112718b = handlerThread;
            handlerThread.start();
        }
        if (this.f112719c == null) {
            this.f112719c = new HandlerC17630a(this.f112718b.getLooper());
        }
        this.f112720d = eGLContext;
        if (this.f112718b == null || (handlerC17630a = this.f112719c) == null) {
            return this.f112717a;
        }
        handlerC17630a.sendMessage(handlerC17630a.obtainMessage(1));
        synchronized (this.f112721e) {
            while (!this.f112722f && this.f112723g) {
                try {
                    this.f112721e.wait(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ujeVar = this.f112717a;
        }
        return ujeVar;
    }

    /* JADX INFO: renamed from: b */
    public void m138284b() {
        HandlerC17630a handlerC17630a;
        if (this.f112718b == null || (handlerC17630a = this.f112719c) == null) {
            return;
        }
        this.f112723g = false;
        handlerC17630a.sendMessage(handlerC17630a.obtainMessage(2));
        synchronized (this.f112721e) {
            while (this.f112722f) {
                try {
                    this.f112721e.wait(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.f112718b.quit();
        this.f112719c = null;
        this.f112718b = null;
    }
}
