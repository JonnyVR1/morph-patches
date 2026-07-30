package p149l;

import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class x5t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final zzcfz f191187a;

    /* JADX INFO: renamed from: b */
    public boolean f191188b = false;

    public x5t0(zzcfz zzcfzVar) {
        this.f191187a = zzcfzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m207143a() {
        this.f191188b = true;
        this.f191187a.m13617w();
    }

    /* JADX INFO: renamed from: b */
    public final void m207144b() {
        this.f191188b = false;
        m207145c();
    }

    /* JADX INFO: renamed from: c */
    public final void m207145c() {
        obw0 obw0Var = C2075b.f9714l;
        obw0Var.removeCallbacks(this);
        obw0Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f191188b) {
            return;
        }
        this.f191187a.m13617w();
        m207145c();
    }
}
