package p149l;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class n8r0<T> implements b7r0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f137674a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f137675b;

    /* JADX INFO: renamed from: c */
    public final gsy0 f137676c;

    /* JADX INFO: renamed from: d */
    public int f137677d;

    /* JADX INFO: renamed from: e */
    public int f137678e;

    /* JADX INFO: renamed from: f */
    public int f137679f;

    /* JADX INFO: renamed from: g */
    public Exception f137680g;

    /* JADX INFO: renamed from: h */
    public boolean f137681h;

    public n8r0(int i, gsy0 gsy0Var) {
        this.f137675b = i;
        this.f137676c = gsy0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m158505a() {
        int i = this.f137677d;
        int i2 = this.f137678e;
        int i3 = i + i2 + this.f137679f;
        int i4 = this.f137675b;
        if (i3 == i4) {
            if (this.f137680g == null) {
                boolean z = this.f137681h;
                gsy0 gsy0Var = this.f137676c;
                if (z) {
                    gsy0Var.m127861u();
                    return;
                } else {
                    gsy0Var.m127860t(null);
                    return;
                }
            }
            this.f137676c.m127859s(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.f137680g));
        }
    }

    @Override // p149l.hd50
    public final void onCanceled() {
        synchronized (this.f137674a) {
            this.f137679f++;
            this.f137681h = true;
            m158505a();
        }
    }

    @Override // p149l.yd50
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f137674a) {
            this.f137678e++;
            this.f137680g = exc;
            m158505a();
        }
    }

    @Override // p149l.ng50
    public final void onSuccess(T t) {
        synchronized (this.f137674a) {
            this.f137677d++;
            m158505a();
        }
    }
}
