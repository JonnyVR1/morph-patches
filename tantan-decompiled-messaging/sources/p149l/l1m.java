package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.immomo.network.bean.CheckerStatus;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class l1m implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    private static volatile l1m f125664f;

    /* JADX INFO: renamed from: a */
    private final AtomicReference<CheckerStatus> f125665a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f125666b;

    /* JADX INFO: renamed from: c */
    private final boolean f125667c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference<HandlerThread> f125668d;

    /* JADX INFO: renamed from: e */
    private final AtomicReference<Handler> f125669e;

    private l1m() {
        CheckerStatus checkerStatus = CheckerStatus.UNKNOWN;
        AtomicReference<CheckerStatus> atomicReference = new AtomicReference<>(checkerStatus);
        this.f125665a = atomicReference;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f125666b = atomicBoolean;
        AtomicReference<HandlerThread> atomicReference2 = new AtomicReference<>();
        this.f125668d = atomicReference2;
        AtomicReference<Handler> atomicReference3 = new AtomicReference<>();
        this.f125669e = atomicReference3;
        this.f125667c = ked0.m145761a();
        atomicBoolean.set(false);
        atomicReference.set(checkerStatus);
        atomicReference2.set(new HandlerThread("ipv6-detect-thread"));
        atomicReference2.get().start();
        atomicReference3.set(new Handler(atomicReference2.get().getLooper(), this));
    }

    /* JADX INFO: renamed from: b */
    private boolean m148195b() {
        if (this.f125667c) {
            return fjx.m121638R().m121657G() != 0;
        }
        return fjx.m121638R().m121651E() != 0;
    }

    /* JADX INFO: renamed from: c */
    public static l1m m148196c() {
        if (f125664f == null) {
            synchronized (l1m.class) {
                try {
                    if (f125664f == null) {
                        f125664f = new l1m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f125664f;
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m148197g() {
        try {
            this.f125666b.set(true);
            if (this.f125669e.get() != null) {
                this.f125669e.get().removeCallbacksAndMessages(null);
                this.f125669e.set(null);
            }
            if (this.f125668d.get() != null) {
                this.f125668d.get().quitSafely();
                this.f125668d.set(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public CheckerStatus m148198a() {
        Handler handler;
        if (zyd.m220920a() && m148195b() && this.f125665a.get() == CheckerStatus.UNKNOWN && (handler = this.f125669e.get()) != null) {
            handler.sendEmptyMessage(0);
        }
        return this.f125665a.get();
    }

    /* JADX INFO: renamed from: d */
    public void m148199d() {
        m148197g();
        this.f125665a.set(CheckerStatus.UNKNOWN);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m148200e() {
        try {
            if (this.f125668d.get() == null) {
                this.f125668d.set(new HandlerThread("ipv6-detect-thread"));
                this.f125668d.get().start();
                this.f125669e.set(new Handler(this.f125668d.get().getLooper(), this));
            }
            this.f125666b.set(false);
            if (m148195b()) {
                this.f125669e.get().removeMessages(0);
                this.f125669e.get().sendEmptyMessage(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m148201f() {
        m148197g();
        this.f125665a.set(CheckerStatus.AVAILABLE);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f125666b.get()) {
            return true;
        }
        String[] strArrSplit = fjx.m121638R().m121802y().split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length > 0) {
            String str = strArrSplit[new Random().nextInt(strArrSplit.length)];
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(new URL(str).getHost(), 80), 5000);
                this.f125665a.set(socket.isConnected() ? CheckerStatus.AVAILABLE : CheckerStatus.UNAVAILABLE);
                socket.close();
            } catch (Exception unused) {
                this.f125665a.set(CheckerStatus.UNAVAILABLE);
            }
            if (this.f125665a.get() == CheckerStatus.AVAILABLE) {
                ib20.m135241b(true, str);
                m148197g();
            } else {
                ib20.m135241b(false, str);
                try {
                    Handler handler = this.f125669e.get();
                    if (handler != null) {
                        handler.removeMessages(0);
                        handler.sendEmptyMessageDelayed(0, fjx.m121638R().m121799x() * 1000);
                    }
                } catch (Exception e) {
                    eyx.m118802c().m118808g("IPv6Checker", "exception === " + e);
                }
            }
        } else {
            ib20.m135241b(false, "");
            this.f125665a.set(CheckerStatus.UNAVAILABLE);
            m148197g();
        }
        return true;
    }
}
