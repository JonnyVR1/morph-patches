package p153l;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ehu0 extends kdu0 {

    /* JADX INFO: renamed from: b */
    public boolean f94078b;

    public ehu0(Set set) {
        super(set);
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m120854w0() {
        m149285v0(chu0.f81864a);
        this.f94078b = true;
    }

    public final void zza() {
        m149285v0(new jdu0() { // from class: l.bhu0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((vcl0.AbstractC20809a) obj).mo127260a();
            }
        });
    }

    public final void zzb() {
        m149285v0(new jdu0() { // from class: l.ahu0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((vcl0.AbstractC20809a) obj).mo127261c();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.f94078b) {
                m149285v0(chu0.f81864a);
                this.f94078b = true;
            }
            m149285v0(new jdu0() { // from class: l.dhu0
                @Override // p153l.jdu0
                public final void zza(Object obj) {
                    ((vcl0.AbstractC20809a) obj).m200831d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }
}
