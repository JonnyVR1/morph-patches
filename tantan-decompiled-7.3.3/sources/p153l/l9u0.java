package p153l;

import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class l9u0 extends kdu0 implements j7u0, v8u0 {

    /* JADX INFO: renamed from: b */
    public final q6w0 f130631b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f130632c;

    public l9u0(Set set, q6w0 q6w0Var) {
        super(set);
        this.f130632c = new AtomicBoolean();
        this.f130631b = q6w0Var;
    }

    private final void zzb() {
        zzs zzsVar;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168007H7)).booleanValue() && this.f130632c.compareAndSet(false, true) && (zzsVar = this.f130631b.f155884f0) != null && zzsVar.zza == 3) {
            m149285v0(new jdu0() { // from class: l.k9u0
                @Override // p153l.jdu0
                public final void zza(Object obj) throws Exception {
                    this.f124577a.m153460w0((n9u0) obj);
                }
            });
        }
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        int i = this.f130631b.f155875b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m153460w0(n9u0 n9u0Var) throws Exception {
        n9u0Var.mo162050b(this.f130631b.f155884f0);
    }

    @Override // p153l.v8u0
    public final void zzg() {
        if (this.f130631b.f155875b == 1) {
            zzb();
        }
    }
}
