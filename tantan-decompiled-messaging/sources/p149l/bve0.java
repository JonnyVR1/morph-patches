package p149l;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class bve0 {

    /* JADX INFO: renamed from: a */
    qie f77429a;

    /* JADX INFO: renamed from: b */
    HandlerThread f77430b;

    /* JADX INFO: renamed from: c */
    HandlerC15980a f77431c;

    /* JADX INFO: renamed from: d */
    EGLContext f77432d;

    /* JADX INFO: renamed from: e */
    Object f77433e = new Object();

    /* JADX INFO: renamed from: f */
    boolean f77434f = false;

    /* JADX INFO: renamed from: g */
    boolean f77435g = true;

    /* JADX INFO: renamed from: l.bve0$a */
    public class HandlerC15980a extends Handler {
        public HandlerC15980a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                synchronized (bve0.this.f77433e) {
                    try {
                        bve0 bve0Var = bve0.this;
                        if (bve0Var.f77429a == null) {
                            bve0Var.f77429a = new qie();
                            bve0 bve0Var2 = bve0.this;
                            bve0Var2.f77429a.m174869b(bve0Var2.f77432d);
                        }
                        bve0 bve0Var3 = bve0.this;
                        bve0Var3.f77434f = true;
                        bve0Var3.f77433e.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (i != 2) {
                return;
            }
            synchronized (bve0.this.f77433e) {
                try {
                    qie qieVar = bve0.this.f77429a;
                    if (qieVar != null) {
                        qieVar.m174873g();
                        bve0.this.f77429a = null;
                    }
                    bve0 bve0Var4 = bve0.this;
                    bve0Var4.f77434f = false;
                    bve0Var4.f77433e.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public qie m104021a(EGLContext eGLContext) {
        HandlerC15980a handlerC15980a;
        qie qieVar;
        if (this.f77430b == null) {
            HandlerThread handlerThread = new HandlerThread("ShareEglContexHandler" + System.currentTimeMillis());
            this.f77430b = handlerThread;
            handlerThread.start();
        }
        if (this.f77431c == null) {
            this.f77431c = new HandlerC15980a(this.f77430b.getLooper());
        }
        this.f77432d = eGLContext;
        if (this.f77430b == null || (handlerC15980a = this.f77431c) == null) {
            return this.f77429a;
        }
        handlerC15980a.sendMessage(handlerC15980a.obtainMessage(1));
        synchronized (this.f77433e) {
            while (!this.f77434f && this.f77435g) {
                try {
                    this.f77433e.wait(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            qieVar = this.f77429a;
        }
        return qieVar;
    }

    /* JADX INFO: renamed from: b */
    public void m104022b() {
        HandlerC15980a handlerC15980a;
        if (this.f77430b == null || (handlerC15980a = this.f77431c) == null) {
            return;
        }
        this.f77435g = false;
        handlerC15980a.sendMessage(handlerC15980a.obtainMessage(2));
        synchronized (this.f77433e) {
            while (this.f77434f) {
                try {
                    this.f77433e.wait(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.f77430b.quit();
        this.f77431c = null;
        this.f77430b = null;
    }
}
