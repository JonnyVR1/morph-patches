package p153l;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class fg4 {

    /* JADX INFO: renamed from: a */
    public boolean f98881a;

    /* JADX INFO: renamed from: b */
    public InterfaceC16973a f98882b;

    /* JADX INFO: renamed from: c */
    public Object f98883c;

    /* JADX INFO: renamed from: d */
    public boolean f98884d;

    /* JADX INFO: renamed from: l.fg4$a */
    public interface InterfaceC16973a {
        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public void m125475a() {
        synchronized (this) {
            try {
                if (this.f98881a) {
                    return;
                }
                this.f98881a = true;
                this.f98884d = true;
                InterfaceC16973a interfaceC16973a = this.f98882b;
                Object obj = this.f98883c;
                if (interfaceC16973a != null) {
                    try {
                        interfaceC16973a.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f98884d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f98884d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Object m125476b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f98883c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f98883c = cancellationSignal;
                    if (this.f98881a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f98883c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public boolean m125477c() {
        boolean z;
        synchronized (this) {
            z = this.f98881a;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public void m125478d(@Nullable InterfaceC16973a interfaceC16973a) {
        synchronized (this) {
            try {
                m125480f();
                if (this.f98882b == interfaceC16973a) {
                    return;
                }
                this.f98882b = interfaceC16973a;
                if (this.f98881a && interfaceC16973a != null) {
                    interfaceC16973a.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m125479e() {
        if (m125477c()) {
            throw new OperationCanceledException();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m125480f() {
        while (this.f98884d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
