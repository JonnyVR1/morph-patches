package p153l;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nvt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f143858a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f143859b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f143860c;

    public nvt0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f143858a = kqx0Var;
        this.f143859b = kqx0Var2;
        this.f143860c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        hvt0 hvt0Var = (hvt0) this.f143858a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Set setSingleton = ((JSONObject) this.f143860c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new yfu0(hvt0Var, xvw0Var));
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
