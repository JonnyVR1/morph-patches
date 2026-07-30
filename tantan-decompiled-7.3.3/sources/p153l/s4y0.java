package p153l;

import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class s4y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f166296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f166297b;

    public s4y0(C2481g c2481g, boolean z) {
        this.f166296a = z;
        this.f166297b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM100298k = this.f166297b.f202159a.m100298k();
        boolean zM100297j = this.f166297b.f202159a.m100297j();
        this.f166297b.f202159a.m100295h(this.f166296a);
        if (zM100297j == this.f166296a) {
            this.f166297b.f202159a.zzj().m114562E().m153301b("Default data collection state already set to", Boolean.valueOf(this.f166296a));
        }
        if (this.f166297b.f202159a.m100298k() == zM100298k || this.f166297b.f202159a.m100298k() != this.f166297b.f202159a.m100297j()) {
            this.f166297b.f202159a.zzj().m114564G().m153302c("Default data collection is different than actual status", Boolean.valueOf(this.f166296a), Boolean.valueOf(zM100298k));
        }
        this.f166297b.m15227E0();
    }
}
