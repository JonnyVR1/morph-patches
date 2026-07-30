package p149l;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class ott0 extends zzt {

    /* JADX INFO: renamed from: a */
    public final okt0 f145625a;

    public ott0(okt0 okt0Var) {
        this.f145625a = okt0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public final ott0 m165971P2(ListenerHolder listenerHolder) {
        this.f145625a.mo145180a(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) {
        this.f145625a.zza().notifyListener(new yqt0(this, location));
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() {
        this.f145625a.zza().notifyListener(new gst0(this));
    }

    public final void zzg() {
        this.f145625a.zza().clear();
    }
}
