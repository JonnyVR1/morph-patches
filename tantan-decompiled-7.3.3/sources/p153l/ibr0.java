package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzet;

/* JADX INFO: loaded from: classes6.dex */
public final class ibr0 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public smv0 f114241a;

    /* JADX INFO: renamed from: b */
    public Handler f114242b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Error f114243c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public RuntimeException f114244d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public zzaak f114245e;

    public ibr0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX INFO: renamed from: a */
    public final zzaak m139398a(int i) {
        boolean z;
        start();
        this.f114242b = new Handler(getLooper(), this);
        this.f114241a = new smv0(this.f114242b, null);
        synchronized (this) {
            z = false;
            this.f114242b.obtainMessage(1, i, 0).sendToTarget();
            while (this.f114245e == null && this.f114244d == null && this.f114243c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f114244d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f114243c;
        if (error != null) {
            throw error;
        }
        zzaak zzaakVar = this.f114245e;
        zzaakVar.getClass();
        return zzaakVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m139399b() {
        Handler handler = this.f114242b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    smv0 smv0Var = this.f114241a;
                    if (smv0Var == null) {
                        throw null;
                    }
                    smv0Var.m186844b(i2);
                    this.f114245e = new zzaak(this, this.f114241a.m186843a(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzet e) {
                    y4w0.m214276d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f114244d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    y4w0.m214276d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f114243c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    y4w0.m214276d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f114244d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    smv0 smv0Var2 = this.f114241a;
                    if (smv0Var2 == null) {
                        throw null;
                    }
                    smv0Var2.m186845c();
                    return true;
                } catch (Throwable th) {
                    try {
                        y4w0.m214276d("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
