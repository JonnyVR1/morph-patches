package p149l;

import com.google.android.gms.internal.ads.C2299z2;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class slw0 extends ulw0 {
    public slw0(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z);
        m13083R();
    }

    @Override // p149l.ulw0
    /* JADX INFO: renamed from: V */
    public final /* bridge */ /* synthetic */ Object mo184897V(List list) {
        ArrayList arrayListM13513a = C2299z2.m13513a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tlw0 tlw0Var = (tlw0) it.next();
            arrayListM13513a.add(tlw0Var != null ? tlw0Var.f171117a : null);
        }
        return Collections.unmodifiableList(arrayListM13513a);
    }
}
