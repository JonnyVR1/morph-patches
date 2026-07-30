package p153l;

import com.google.android.gms.internal.ads.AbstractC2235o3;
import com.google.android.gms.internal.ads.C2322z2;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class avw0 extends AbstractC2235o3 {

    /* JADX INFO: renamed from: p */
    public List f73667p;

    public avw0(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z, true);
        List listM13567a = zzfzvVar.isEmpty() ? Collections.EMPTY_LIST : C2322z2.m13567a(zzfzvVar.size());
        for (int i = 0; i < zzfzvVar.size(); i++) {
            listM13567a.add(null);
        }
        this.f73667p = listM13567a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: P */
    public final void mo13135P(int i, Object obj) {
        List list = this.f73667p;
        if (list != null) {
            list.set(i, new zuw0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: Q */
    public final void mo13136Q() {
        List list = this.f73667p;
        if (list != null) {
            mo13075e(mo100525V(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: U */
    public final void mo13140U(int i) {
        super.mo13140U(i);
        this.f73667p = null;
    }

    /* JADX INFO: renamed from: V */
    public abstract Object mo100525V(List list);
}
