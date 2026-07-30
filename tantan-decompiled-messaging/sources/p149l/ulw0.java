package p149l;

import com.google.android.gms.internal.ads.AbstractC2212o3;
import com.google.android.gms.internal.ads.C2299z2;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ulw0 extends AbstractC2212o3 {

    /* JADX INFO: renamed from: p */
    public List f177174p;

    public ulw0(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z, true);
        List listM13513a = zzfzvVar.isEmpty() ? Collections.EMPTY_LIST : C2299z2.m13513a(zzfzvVar.size());
        for (int i = 0; i < zzfzvVar.size(); i++) {
            listM13513a.add(null);
        }
        this.f177174p = listM13513a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: P */
    public final void mo13081P(int i, Object obj) {
        List list = this.f177174p;
        if (list != null) {
            list.set(i, new tlw0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: Q */
    public final void mo13082Q() {
        List list = this.f177174p;
        if (list != null) {
            mo13021e(mo184897V(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: U */
    public final void mo13086U(int i) {
        super.mo13086U(i);
        this.f177174p = null;
    }

    /* JADX INFO: renamed from: V */
    public abstract Object mo184897V(List list);
}
