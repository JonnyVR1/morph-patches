package p149l;

import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class mvx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f136005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f136006b;

    public mvx0(C2458g c2458g, boolean z) {
        this.f136005a = z;
        this.f136006b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM194118k = this.f136006b.f165891a.m194118k();
        boolean zM194117j = this.f136006b.f165891a.m194117j();
        this.f136006b.f165891a.m194115h(this.f136005a);
        if (zM194117j == this.f136005a) {
            this.f136006b.f165891a.zzj().m211416E().m123937b("Default data collection state already set to", Boolean.valueOf(this.f136005a));
        }
        if (this.f136006b.f165891a.m194118k() == zM194118k || this.f136006b.f165891a.m194118k() != this.f136006b.f165891a.m194117j()) {
            this.f136006b.f165891a.zzj().m211418G().m123938c("Default data collection is different than actual status", Boolean.valueOf(this.f136005a), Boolean.valueOf(zM194118k));
        }
        this.f136006b.m15173E0();
    }
}
