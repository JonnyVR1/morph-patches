package p153l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tku0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f174749a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f174750b;

    public tku0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f174749a = kqx0Var;
        this.f174750b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei zzceiVarM201659a = ((vlt0) this.f174749a).m201659a();
        bxy0.m106934r();
        return new v6s0(UUID.randomUUID().toString(), zzceiVarM201659a, "native", new JSONObject(), false, true);
    }
}
