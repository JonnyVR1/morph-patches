package p149l;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class gf4 {

    /* JADX INFO: renamed from: a */
    public boolean f102327a;

    /* JADX INFO: renamed from: b */
    public InterfaceC17068a f102328b;

    /* JADX INFO: renamed from: c */
    public Object f102329c;

    /* JADX INFO: renamed from: d */
    public boolean f102330d;

    /* JADX INFO: renamed from: l.gf4$a */
    public interface InterfaceC17068a {
        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public void m125873a() {
        synchronized (this) {
            try {
                if (this.f102327a) {
                    return;
                }
                this.f102327a = true;
                this.f102330d = true;
                InterfaceC17068a interfaceC17068a = this.f102328b;
                Object obj = this.f102329c;
                if (interfaceC17068a != null) {
                    try {
                        interfaceC17068a.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f102330d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f102330d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Object m125874b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f102329c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f102329c = cancellationSignal;
                    if (this.f102327a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f102329c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public boolean m125875c() {
        boolean z;
        synchronized (this) {
            z = this.f102327a;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public void m125876d(@Nullable InterfaceC17068a interfaceC17068a) {
        synchronized (this) {
            try {
                m125878f();
                if (this.f102328b == interfaceC17068a) {
                    return;
                }
                this.f102328b = interfaceC17068a;
                if (this.f102327a && interfaceC17068a != null) {
                    interfaceC17068a.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m125877e() {
        if (m125875c()) {
            throw new OperationCanceledException();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m125878f() {
        while (this.f102330d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
