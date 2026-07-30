package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class iqb implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private int f114457a;

    /* JADX INFO: renamed from: b */
    private InterfaceC17607a f114458b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f114459c = false;

    /* JADX INFO: renamed from: d */
    private HandlerThread f114460d;

    /* JADX INFO: renamed from: e */
    private Handler f114461e;

    /* JADX INFO: renamed from: l.iqb$a */
    public interface InterfaceC17607a {
        /* JADX INFO: renamed from: a */
        void mo17698a();

        /* JADX INFO: renamed from: b */
        void mo17699b(int i);
    }

    private iqb(int i, InterfaceC17607a interfaceC17607a) {
        this.f114457a = i;
        this.f114458b = interfaceC17607a;
        HandlerThread handlerThread = new HandlerThread("CountdownUpdater");
        this.f114460d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f114460d.getLooper(), this);
        this.f114461e = handler;
        handleMessage(handler.obtainMessage());
    }

    /* JADX INFO: renamed from: c */
    private void m137728c() {
        HandlerThread handlerThread = this.f114460d;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f114458b = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static iqb m137729e(int i, InterfaceC17607a interfaceC17607a) {
        return new iqb(i, interfaceC17607a);
    }

    /* JADX INFO: renamed from: a */
    public void m137730a() {
        this.f114459c = true;
        this.f114461e.removeMessages(0);
        this.f114461e.removeCallbacks(null);
        m137728c();
    }

    /* JADX INFO: renamed from: b */
    public void m137731b() {
        this.f114461e.removeMessages(0);
        this.f114461e.removeCallbacks(null);
    }

    /* JADX INFO: renamed from: d */
    public void m137732d() {
        handleMessage(this.f114461e.obtainMessage());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f114459c) {
            return false;
        }
        InterfaceC17607a interfaceC17607a = this.f114458b;
        if (interfaceC17607a != null) {
            interfaceC17607a.mo17699b(this.f114457a);
        }
        int i = this.f114457a - 1;
        this.f114457a = i;
        if (i >= 0) {
            this.f114461e.sendEmptyMessageDelayed(0, 1000L);
        } else {
            this.f114459c = true;
            synchronized (this) {
                try {
                    InterfaceC17607a interfaceC17607a2 = this.f114458b;
                    if (interfaceC17607a2 != null) {
                        interfaceC17607a2.mo17698a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m137728c();
        }
        return false;
    }
}
