package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cru0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final lms0 f83363a;

    /* JADX INFO: renamed from: b */
    public final qru0 f83364b;

    /* JADX INFO: renamed from: c */
    public final kpx0 f83365c;

    public cru0(fmu0 fmu0Var, ulu0 ulu0Var, qru0 qru0Var, kpx0 kpx0Var) {
        this.f83363a = fmu0Var.m126327c(ulu0Var.m196591a());
        this.f83364b = qru0Var;
        this.f83365c = kpx0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f83363a.mo146168T7((bms0) this.f83365c.zzb(), str);
        } catch (RemoteException e) {
            dct0.m115299h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m112086b() {
        if (this.f83363a == null) {
            return;
        }
        this.f83364b.m177707i("/nativeAdCustomClick", this);
    }
}
