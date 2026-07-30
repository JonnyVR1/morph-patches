package p149l;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class y7u0 extends e4u0 {

    /* JADX INFO: renamed from: b */
    public boolean f196734b;

    public y7u0(Set set) {
        super(set);
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m213319w0() {
        m114712v0(w7u0.f185099a);
        this.f196734b = true;
    }

    public final void zza() {
        m114712v0(new d4u0() { // from class: l.v7u0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((q3l0.AbstractC19424a) obj).mo172885a();
            }
        });
    }

    public final void zzb() {
        m114712v0(new d4u0() { // from class: l.u7u0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((q3l0.AbstractC19424a) obj).mo172887c();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.f196734b) {
                m114712v0(w7u0.f185099a);
                this.f196734b = true;
            }
            m114712v0(new d4u0() { // from class: l.x7u0
                @Override // p149l.d4u0
                public final void zza(Object obj) {
                    ((q3l0.AbstractC19424a) obj).m172888d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }
}
