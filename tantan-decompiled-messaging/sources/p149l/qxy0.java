package p149l;

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
public final class qxy0 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final rxy0 f156885a;

    /* JADX INFO: renamed from: b */
    public final long f156886b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public nxy0 f156887c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public IOException f156888d;

    /* JADX INFO: renamed from: e */
    public int f156889e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Thread f156890f;

    /* JADX INFO: renamed from: g */
    public boolean f156891g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f156892h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ uxy0 f156893i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxy0(uxy0 uxy0Var, Looper looper, rxy0 rxy0Var, nxy0 nxy0Var, int i, long j) {
        super(looper);
        this.f156893i = uxy0Var;
        this.f156885a = rxy0Var;
        this.f156887c = nxy0Var;
        this.f156886b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m177013a(boolean z) {
        this.f156892h = z;
        this.f156888d = null;
        if (hasMessages(0)) {
            this.f156891g = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f156891g = true;
                    this.f156885a.zzg();
                    Thread thread = this.f156890f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f156893i.f178788b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            nxy0 nxy0Var = this.f156887c;
            nxy0Var.getClass();
            nxy0Var.mo161957d(this.f156885a, jElapsedRealtime, jElapsedRealtime - this.f156886b, true);
            this.f156887c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m177014b(int i) throws IOException {
        IOException iOException = this.f156888d;
        if (iOException != null && this.f156889e > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m177015c(long j) {
        f5v0.m119535f(this.f156893i.f178788b == null);
        this.f156893i.f178788b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m177016d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m177016d() {
        this.f156888d = null;
        uxy0 uxy0Var = this.f156893i;
        ExecutorService executorService = uxy0Var.f178787a;
        qxy0 qxy0Var = uxy0Var.f178788b;
        qxy0Var.getClass();
        executorService.execute(qxy0Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f156892h) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            m177016d();
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.f156893i.f178788b = null;
        long j = this.f156886b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        nxy0 nxy0Var = this.f156887c;
        nxy0Var.getClass();
        if (this.f156891g) {
            nxy0Var.mo161957d(this.f156885a, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                nxy0Var.mo161959m(this.f156885a, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                svv0.m186109d("LoadTask", "Unexpected exception handling load completed", e);
                this.f156893i.f178789c = new zzzj(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f156888d = iOException;
        int i3 = this.f156889e + 1;
        this.f156889e = i3;
        pxy0 pxy0VarMo161958h = nxy0Var.mo161958h(this.f156885a, jElapsedRealtime, j2, iOException, i3);
        if (pxy0VarMo161958h.f151741a == 3) {
            this.f156893i.f178789c = this.f156888d;
        } else if (pxy0VarMo161958h.f151741a != 2) {
            if (pxy0VarMo161958h.f151741a == 1) {
                this.f156889e = 1;
            }
            m177015c(pxy0VarMo161958h.f151742b != -9223372036854775807L ? pxy0VarMo161958h.f151742b : Math.min((this.f156889e - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f156891g;
                this.f156890f = Thread.currentThread();
            }
            if (!z) {
                String strConcat = "load:".concat(this.f156885a.getClass().getSimpleName());
                int i = ggw0.f102568a;
                Trace.beginSection(strConcat);
                try {
                    this.f156885a.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f156890f = null;
                Thread.interrupted();
            }
            if (this.f156892h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.f156892h) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f156892h) {
                return;
            }
            svv0.m186109d("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(2, new zzzj(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f156892h) {
                svv0.m186109d("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f156892h) {
                return;
            }
            svv0.m186109d("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new zzzj(e4)).sendToTarget();
        }
    }
}
