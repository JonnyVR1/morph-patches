package p153l;

import com.google.android.gms.internal.ads.C2322z2;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yuw0 extends avw0 {
    public yuw0(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z);
        m13137R();
    }

    @Override // p153l.avw0
    /* JADX INFO: renamed from: V */
    public final /* bridge */ /* synthetic */ Object mo100525V(List list) {
        ArrayList arrayListM13567a = C2322z2.m13567a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zuw0 zuw0Var = (zuw0) it.next();
            arrayListM13567a.add(zuw0Var != null ? zuw0Var.f206169a : null);
        }
        return Collections.unmodifiableList(arrayListM13567a);
    }
}
