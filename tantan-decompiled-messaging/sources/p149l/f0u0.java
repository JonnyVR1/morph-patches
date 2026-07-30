package p149l;

import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class f0u0 extends e4u0 implements dyt0, pzt0 {

    /* JADX INFO: renamed from: b */
    public final kxv0 f94009b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f94010c;

    public f0u0(Set set, kxv0 kxv0Var) {
        super(set);
        this.f94010c = new AtomicBoolean();
        this.f94009b = kxv0Var;
    }

    private final void zzb() {
        zzs zzsVar;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131936H7)).booleanValue() && this.f94010c.compareAndSet(false, true) && (zzsVar = this.f94009b.f125194f0) != null && zzsVar.zza == 3) {
            m114712v0(new d4u0() { // from class: l.e0u0
                @Override // p149l.d4u0
                public final void zza(Object obj) throws Exception {
                    this.f88678a.m119056w0((h0u0) obj);
                }
            });
        }
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        int i = this.f94009b.f125185b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m119056w0(h0u0 h0u0Var) throws Exception {
        h0u0Var.mo128978b(this.f94009b.f125194f0);
    }

    @Override // p149l.pzt0
    public final void zzg() {
        if (this.f94009b.f125185b == 1) {
            zzb();
        }
    }
}
