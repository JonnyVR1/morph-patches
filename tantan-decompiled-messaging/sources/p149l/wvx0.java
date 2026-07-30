package p149l;

import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class wvx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f188297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f188298b;

    public wvx0(C2458g c2458g, long j) {
        this.f188297a = j;
        this.f188298b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f188298b.mo15088d().f175525m.m187783b(this.f188297a);
        this.f188298b.zzj().m211424z().m123937b("Session timeout duration set", Long.valueOf(this.f188297a));
    }
}
