package p153l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lvt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f133732a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f133733b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f133734c;

    public lvt0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f133732a = kqx0Var;
        this.f133733b = kqx0Var2;
        this.f133734c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei zzceiVarM201659a = ((vlt0) this.f133732a).m201659a();
        JSONObject jSONObject = (JSONObject) this.f133733b.zzb();
        String str = (String) this.f133734c.zzb();
        boolean zEquals = "native".equals(str);
        bxy0.m106934r();
        return new v6s0(UUID.randomUUID().toString(), zzceiVarM201659a, str, jSONObject, false, zEquals);
    }
}
