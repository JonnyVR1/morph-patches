package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tantan.eventbus.EventBusException;

/* JADX INFO: loaded from: classes11.dex */
public class pxk<T> extends Handler implements dm80<T> {

    /* JADX INFO: renamed from: a */
    private final dr60<T> f154574a;

    /* JADX INFO: renamed from: b */
    private final int f154575b;

    /* JADX INFO: renamed from: c */
    private final v3f.C20734b<T, ?> f154576c;

    /* JADX INFO: renamed from: d */
    private boolean f154577d;

    public pxk(v3f.C20734b<T, ?> c20734b, Looper looper, int i) {
        super(looper);
        this.f154576c = c20734b;
        this.f154575b = i;
        this.f154574a = new dr60<>();
    }

    @Override // p153l.dm80
    /* JADX INFO: renamed from: a */
    public void mo116941a(jcg0<T> jcg0Var, T t) {
        cr60<T> cr60Var = new cr60<>(t, jcg0Var);
        synchronized (this) {
            try {
                this.f154574a.m117684a(cr60Var);
                if (!this.f154577d) {
                    this.f154577d = true;
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
                cr60<T> cr60VarM117685b = this.f154574a.m117685b();
                if (cr60VarM117685b == null) {
                    synchronized (this) {
                        cr60VarM117685b = this.f154574a.m117685b();
                        if (cr60VarM117685b == null) {
                            this.f154577d = false;
                            return;
                        }
                    }
                }
                this.f154576c.m199268e(cr60VarM117685b);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f154575b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f154577d = true;
        } catch (Throwable th) {
            this.f154577d = false;
            throw th;
        }
    }
}
