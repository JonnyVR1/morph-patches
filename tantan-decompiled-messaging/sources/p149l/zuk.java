package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tantan.eventbus.EventBusException;

/* JADX INFO: loaded from: classes13.dex */
public class zuk<T> extends Handler implements wd80<T> {

    /* JADX INFO: renamed from: a */
    private final yi60<T> f204857a;

    /* JADX INFO: renamed from: b */
    private final int f204858b;

    /* JADX INFO: renamed from: c */
    private final q2f.C19395b<T, ?> f204859c;

    /* JADX INFO: renamed from: d */
    private boolean f204860d;

    public zuk(q2f.C19395b<T, ?> c19395b, Looper looper, int i) {
        super(looper);
        this.f204859c = c19395b;
        this.f204858b = i;
        this.f204857a = new yi60<>();
    }

    @Override // p149l.wd80
    /* JADX INFO: renamed from: a */
    public void mo95707a(b4g0<T> b4g0Var, T t) {
        xi60<T> xi60Var = new xi60<>(t, b4g0Var);
        synchronized (this) {
            try {
                this.f204857a.m214882a(xi60Var);
                if (!this.f204860d) {
                    this.f204860d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                xi60<T> xi60VarM214883b = this.f204857a.m214883b();
                if (xi60VarM214883b == null) {
                    synchronized (this) {
                        xi60VarM214883b = this.f204857a.m214883b();
                        if (xi60VarM214883b == null) {
                            this.f204860d = false;
                            return;
                        }
                    }
                }
                this.f204859c.m172458e(xi60VarM214883b);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f204858b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f204860d = true;
        } catch (Throwable th) {
            this.f204860d = false;
            throw th;
        }
    }
}
