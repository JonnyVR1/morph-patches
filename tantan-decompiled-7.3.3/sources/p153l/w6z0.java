package p153l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzzj;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"HandlerLeak"})
public final class w6z0 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final x6z0 f187668a;

    /* JADX INFO: renamed from: b */
    public final long f187669b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public t6z0 f187670c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public IOException f187671d;

    /* JADX INFO: renamed from: e */
    public int f187672e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Thread f187673f;

    /* JADX INFO: renamed from: g */
    public boolean f187674g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f187675h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ a7z0 f187676i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6z0(a7z0 a7z0Var, Looper looper, x6z0 x6z0Var, t6z0 t6z0Var, int i, long j) {
        super(looper);
        this.f187676i = a7z0Var;
        this.f187668a = x6z0Var;
        this.f187670c = t6z0Var;
        this.f187669b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m205201a(boolean z) {
        this.f187675h = z;
        this.f187671d = null;
        if (hasMessages(0)) {
            this.f187674g = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f187674g = true;
                    this.f187668a.zzg();
                    Thread thread = this.f187673f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f187676i.f68869b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            t6z0 t6z0Var = this.f187670c;
            t6z0Var.getClass();
            t6z0Var.mo101545d(this.f187668a, jElapsedRealtime, jElapsedRealtime - this.f187669b, true);
            this.f187670c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m205202b(int i) throws IOException {
        IOException iOException = this.f187671d;
        if (iOException != null && this.f187672e > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m205203c(long j) {
        lev0.m153958f(this.f187676i.f68869b == null);
        this.f187676i.f68869b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m205204d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m205204d() {
        this.f187671d = null;
        a7z0 a7z0Var = this.f187676i;
        ExecutorService executorService = a7z0Var.f68868a;
        w6z0 w6z0Var = a7z0Var.f68869b;
        w6z0Var.getClass();
        executorService.execute(w6z0Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f187675h) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            m205204d();
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.f187676i.f68869b = null;
        long j = this.f187669b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        t6z0 t6z0Var = this.f187670c;
        t6z0Var.getClass();
        if (this.f187674g) {
            t6z0Var.mo101545d(this.f187668a, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                t6z0Var.mo101554m(this.f187668a, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                y4w0.m214276d("LoadTask", "Unexpected exception handling load completed", e);
                this.f187676i.f68870c = new zzzj(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f187671d = iOException;
        int i3 = this.f187672e + 1;
        this.f187672e = i3;
        v6z0 v6z0VarMo101549h = t6z0Var.mo101549h(this.f187668a, jElapsedRealtime, j2, iOException, i3);
        if (v6z0VarMo101549h.f182710a == 3) {
            this.f187676i.f68870c = this.f187671d;
        } else if (v6z0VarMo101549h.f182710a != 2) {
            if (v6z0VarMo101549h.f182710a == 1) {
                this.f187672e = 1;
            }
            m205203c(v6z0VarMo101549h.f182711b != -9223372036854775807L ? v6z0VarMo101549h.f182711b : Math.min((this.f187672e - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f187674g;
                this.f187673f = Thread.currentThread();
            }
            if (!z) {
                String strConcat = "load:".concat(this.f187668a.getClass().getSimpleName());
                int i = mpw0.f137957a;
                Trace.beginSection(strConcat);
                try {
                    this.f187668a.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f187673f = null;
                Thread.interrupted();
            }
            if (this.f187675h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.f187675h) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f187675h) {
                return;
            }
            y4w0.m214276d("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(2, new zzzj(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f187675h) {
                y4w0.m214276d("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f187675h) {
                return;
            }
            y4w0.m214276d("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new zzzj(e4)).sendToTarget();
        }
    }
}
