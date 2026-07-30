package p153l;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h7u0 extends kdu0 {

    /* JADX INFO: renamed from: b */
    public boolean f108163b;

    public h7u0(Set set) {
        super(set);
        this.f108163b = false;
    }

    public final synchronized void zza() {
        if (this.f108163b) {
            return;
        }
        m149285v0(new jdu0() { // from class: l.g7u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((j7u0) obj).mo106809a();
            }
        });
        this.f108163b = true;
    }
}
