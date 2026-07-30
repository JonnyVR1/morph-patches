package p153l;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class u2u0 extends zzt {

    /* JADX INFO: renamed from: a */
    public final utt0 f177245a;

    public u2u0(utt0 utt0Var) {
        this.f177245a = utt0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public final u2u0 m194305P2(ListenerHolder listenerHolder) {
        this.f177245a.mo176883a(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) {
        this.f177245a.zza().notifyListener(new e0u0(this, location));
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() {
        this.f177245a.zza().notifyListener(new m1u0(this));
    }

    public final void zzg() {
        this.f177245a.zza().clear();
    }
}
