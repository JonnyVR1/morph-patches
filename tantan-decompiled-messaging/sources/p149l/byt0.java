package p149l;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class byt0 extends e4u0 {

    /* JADX INFO: renamed from: b */
    public boolean f77965b;

    public byt0(Set set) {
        super(set);
        this.f77965b = false;
    }

    public final synchronized void zza() {
        if (this.f77965b) {
            return;
        }
        m114712v0(new d4u0() { // from class: l.ayt0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((dyt0) obj).mo95459a();
            }
        });
        this.f77965b = true;
    }
}
