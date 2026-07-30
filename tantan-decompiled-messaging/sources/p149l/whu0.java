package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class whu0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final fds0 f186466a;

    /* JADX INFO: renamed from: b */
    public final kiu0 f186467b;

    /* JADX INFO: renamed from: c */
    public final egx0 f186468c;

    public whu0(zcu0 zcu0Var, ocu0 ocu0Var, kiu0 kiu0Var, egx0 egx0Var) {
        this.f186466a = zcu0Var.m218104c(ocu0Var.m163584a());
        this.f186467b = kiu0Var;
        this.f186468c = egx0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f186466a.mo111059T7((vcs0) this.f186468c.zzb(), str);
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m203243b() {
        if (this.f186466a == null) {
            return;
        }
        this.f186467b.m146144i("/nativeAdCustomClick", this);
    }
}
