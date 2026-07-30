package p153l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class dov0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Set f90014a;

    public dov0(Set set) {
        this.f90014a = set;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 8;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f90014a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return pvw0.m173981h(new vuv0() { // from class: l.xnv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
