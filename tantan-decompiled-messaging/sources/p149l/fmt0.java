package p149l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fmt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f98373a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f98374b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f98375c;

    public fmt0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f98373a = ehx0Var;
        this.f98374b = ehx0Var2;
        this.f98375c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei zzceiVarM168371a = ((pct0) this.f98373a).m168371a();
        JSONObject jSONObject = (JSONObject) this.f98374b.zzb();
        String str = (String) this.f98375c.zzb();
        boolean zEquals = "native".equals(str);
        vny0.m199080r();
        return new pxr0(UUID.randomUUID().toString(), zzceiVarM168371a, str, jSONObject, false, zEquals);
    }
}
