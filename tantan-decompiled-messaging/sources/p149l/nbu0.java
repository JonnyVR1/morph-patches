package p149l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nbu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f138068a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f138069b;

    public nbu0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f138068a = ehx0Var;
        this.f138069b = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei zzceiVarM168371a = ((pct0) this.f138068a).m168371a();
        vny0.m199080r();
        return new pxr0(UUID.randomUUID().toString(), zzceiVarM168371a, "native", new JSONObject(), false, true);
    }
}
