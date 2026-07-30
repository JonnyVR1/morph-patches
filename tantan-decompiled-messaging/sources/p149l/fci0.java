package p149l;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fci0 implements hcr {

    /* JADX INFO: renamed from: a */
    private final Set<cci0<?>> f96800a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public void m120427b() {
        this.f96800a.clear();
    }

    @Override // p149l.hcr
    /* JADX INFO: renamed from: d */
    public void mo5559d() {
        Iterator it = sck0.m183410j(this.f96800a).iterator();
        while (it.hasNext()) {
            ((cci0) it.next()).mo5559d();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<cci0<?>> m120428f() {
        return sck0.m183410j(this.f96800a);
    }

    /* JADX INFO: renamed from: h */
    public void m120429h(@NonNull cci0<?> cci0Var) {
        this.f96800a.add(cci0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m120430m(@NonNull cci0<?> cci0Var) {
        this.f96800a.remove(cci0Var);
    }

    @Override // p149l.hcr
    public void onDestroy() {
        Iterator it = sck0.m183410j(this.f96800a).iterator();
        while (it.hasNext()) {
            ((cci0) it.next()).onDestroy();
        }
    }

    @Override // p149l.hcr
    public void onStart() {
        Iterator it = sck0.m183410j(this.f96800a).iterator();
        while (it.hasNext()) {
            ((cci0) it.next()).onStart();
        }
    }
}
