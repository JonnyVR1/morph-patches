package p153l;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kvt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f128996a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f128997b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f128998c;

    public kvt0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f128996a = kqx0Var;
        this.f128997b = kqx0Var2;
        this.f128998c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        hvt0 hvt0Var = (hvt0) this.f128996a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Set setSingleton = ((JSONObject) this.f128998c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new yfu0(hvt0Var, xvw0Var));
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
