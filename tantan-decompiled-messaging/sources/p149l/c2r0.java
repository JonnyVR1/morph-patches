package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzet;

/* JADX INFO: loaded from: classes6.dex */
public final class c2r0 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public mdv0 f78379a;

    /* JADX INFO: renamed from: b */
    public Handler f78380b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Error f78381c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public RuntimeException f78382d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public zzaak f78383e;

    public c2r0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX INFO: renamed from: a */
    public final zzaak m104918a(int i) {
        boolean z;
        start();
        this.f78380b = new Handler(getLooper(), this);
        this.f78379a = new mdv0(this.f78380b, null);
        synchronized (this) {
            z = false;
            this.f78380b.obtainMessage(1, i, 0).sendToTarget();
            while (this.f78383e == null && this.f78382d == null && this.f78381c == null) {
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
        RuntimeException runtimeException = this.f78382d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f78381c;
        if (error != null) {
            throw error;
        }
        zzaak zzaakVar = this.f78383e;
        zzaakVar.getClass();
        return zzaakVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m104919b() {
        Handler handler = this.f78380b;
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
                    mdv0 mdv0Var = this.f78379a;
                    if (mdv0Var == null) {
                        throw null;
                    }
                    mdv0Var.m154108b(i2);
                    this.f78383e = new zzaak(this, this.f78379a.m154107a(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzet e) {
                    svv0.m186109d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f78382d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    svv0.m186109d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f78381c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    svv0.m186109d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f78382d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    mdv0 mdv0Var2 = this.f78379a;
                    if (mdv0Var2 == null) {
                        throw null;
                    }
                    mdv0Var2.m154109c();
                    return true;
                } catch (Throwable th) {
                    try {
                        svv0.m186109d("PlaceholderSurface", "Failed to release placeholder surface", th);
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
