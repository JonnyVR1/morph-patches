package p153l;

import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class c5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f79909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f79910b;

    public c5y0(C2481g c2481g, long j) {
        this.f79909a = j;
        this.f79910b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79910b.mo15142d().f71906m.m219991b(this.f79909a);
        this.f79910b.zzj().m114570z().m153301b("Session timeout duration set", Long.valueOf(this.f79909a));
    }
}
