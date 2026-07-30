package p149l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class xev0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Set f192636a;

    public xev0(Set set) {
        this.f192636a = set;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 8;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f192636a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return jmw0.m142235h(new plv0() { // from class: l.rev0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
