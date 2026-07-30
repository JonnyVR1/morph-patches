package p153l;

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
public class e4m implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    private static volatile e4m f92128f;

    /* JADX INFO: renamed from: a */
    private final AtomicReference<CheckerStatus> f92129a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f92130b;

    /* JADX INFO: renamed from: c */
    private final boolean f92131c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference<HandlerThread> f92132d;

    /* JADX INFO: renamed from: e */
    private final AtomicReference<Handler> f92133e;

    private e4m() {
        CheckerStatus checkerStatus = CheckerStatus.UNKNOWN;
        AtomicReference<CheckerStatus> atomicReference = new AtomicReference<>(checkerStatus);
        this.f92129a = atomicReference;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f92130b = atomicBoolean;
        AtomicReference<HandlerThread> atomicReference2 = new AtomicReference<>();
        this.f92132d = atomicReference2;
        AtomicReference<Handler> atomicReference3 = new AtomicReference<>();
        this.f92133e = atomicReference3;
        this.f92131c = mmd0.m159059a();
        atomicBoolean.set(false);
        atomicReference.set(checkerStatus);
        atomicReference2.set(new HandlerThread("ipv6-detect-thread"));
        atomicReference2.get().start();
        atomicReference3.set(new Handler(atomicReference2.get().getLooper(), this));
    }

    /* JADX INFO: renamed from: b */
    private boolean m119449b() {
        if (this.f92131c) {
            return csx.m112235R().m112254G() != 0;
        }
        return csx.m112235R().m112248E() != 0;
    }

    /* JADX INFO: renamed from: c */
    public static e4m m119450c() {
        if (f92128f == null) {
            synchronized (e4m.class) {
                try {
                    if (f92128f == null) {
                        f92128f = new e4m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f92128f;
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m119451g() {
        try {
            this.f92130b.set(true);
            if (this.f92133e.get() != null) {
                this.f92133e.get().removeCallbacksAndMessages(null);
                this.f92133e.set(null);
            }
            if (this.f92132d.get() != null) {
                this.f92132d.get().quitSafely();
                this.f92132d.set(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public CheckerStatus m119452a() {
        Handler handler;
        if (m0e.m156510a() && m119449b() && this.f92129a.get() == CheckerStatus.UNKNOWN && (handler = this.f92133e.get()) != null) {
            handler.sendEmptyMessage(0);
        }
        return this.f92129a.get();
    }

    /* JADX INFO: renamed from: d */
    public void m119453d() {
        m119451g();
        this.f92129a.set(CheckerStatus.UNKNOWN);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m119454e() {
        try {
            if (this.f92132d.get() == null) {
                this.f92132d.set(new HandlerThread("ipv6-detect-thread"));
                this.f92132d.get().start();
                this.f92133e.set(new Handler(this.f92132d.get().getLooper(), this));
            }
            this.f92130b.set(false);
            if (m119449b()) {
                this.f92133e.get().removeMessages(0);
                this.f92133e.get().sendEmptyMessage(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m119455f() {
        m119451g();
        this.f92129a.set(CheckerStatus.AVAILABLE);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f92130b.get()) {
            return true;
        }
        String[] strArrSplit = csx.m112235R().m112399y().split(Constants.SEPARATOR_COMMA);
        if (strArrSplit.length > 0) {
            String str = strArrSplit[new Random().nextInt(strArrSplit.length)];
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(new URL(str).getHost(), 80), 5000);
                this.f92129a.set(socket.isConnected() ? CheckerStatus.AVAILABLE : CheckerStatus.UNAVAILABLE);
                socket.close();
            } catch (Exception unused) {
                this.f92129a.set(CheckerStatus.UNAVAILABLE);
            }
            if (this.f92129a.get() == CheckerStatus.AVAILABLE) {
                rj20.m181628b(true, str);
                m119451g();
            } else {
                rj20.m181628b(false, str);
                try {
                    Handler handler = this.f92133e.get();
                    if (handler != null) {
                        handler.removeMessages(0);
                        handler.sendEmptyMessageDelayed(0, csx.m112235R().m112396x() * 1000);
                    }
                } catch (Exception e) {
                    b7y.m102882c().m102888g("IPv6Checker", "exception === " + e);
                }
            }
        } else {
            rj20.m181628b(false, "");
            this.f92129a.set(CheckerStatus.UNAVAILABLE);
            m119451g();
        }
        return true;
    }
}
