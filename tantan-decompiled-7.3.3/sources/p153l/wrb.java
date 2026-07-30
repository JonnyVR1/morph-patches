package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class wrb implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private int f190494a;

    /* JADX INFO: renamed from: b */
    private InterfaceC21171a f190495b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f190496c = false;

    /* JADX INFO: renamed from: d */
    private HandlerThread f190497d;

    /* JADX INFO: renamed from: e */
    private Handler f190498e;

    /* JADX INFO: renamed from: l.wrb$a */
    public interface InterfaceC21171a {
        /* JADX INFO: renamed from: a */
        void mo18775a();

        /* JADX INFO: renamed from: b */
        void mo18776b(int i);
    }

    private wrb(int i, InterfaceC21171a interfaceC21171a) {
        this.f190494a = i;
        this.f190495b = interfaceC21171a;
        HandlerThread handlerThread = new HandlerThread("CountdownUpdater");
        this.f190497d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f190497d.getLooper(), this);
        this.f190498e = handler;
        handleMessage(handler.obtainMessage());
    }

    /* JADX INFO: renamed from: c */
    private void m207577c() {
        HandlerThread handlerThread = this.f190497d;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f190495b = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static wrb m207578e(int i, InterfaceC21171a interfaceC21171a) {
        return new wrb(i, interfaceC21171a);
    }

    /* JADX INFO: renamed from: a */
    public void m207579a() {
        this.f190496c = true;
        this.f190498e.removeMessages(0);
        this.f190498e.removeCallbacks(null);
        m207577c();
    }

    /* JADX INFO: renamed from: b */
    public void m207580b() {
        this.f190498e.removeMessages(0);
        this.f190498e.removeCallbacks(null);
    }

    /* JADX INFO: renamed from: d */
    public void m207581d() {
        handleMessage(this.f190498e.obtainMessage());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f190496c) {
            return false;
        }
        InterfaceC21171a interfaceC21171a = this.f190495b;
        if (interfaceC21171a != null) {
            interfaceC21171a.mo18776b(this.f190494a);
        }
        int i = this.f190494a - 1;
        this.f190494a = i;
        if (i >= 0) {
            this.f190498e.sendEmptyMessageDelayed(0, 1000L);
        } else {
            this.f190496c = true;
            synchronized (this) {
                try {
                    InterfaceC21171a interfaceC21171a2 = this.f190495b;
                    if (interfaceC21171a2 != null) {
                        interfaceC21171a2.mo18775a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m207577c();
        }
        return false;
    }
}
