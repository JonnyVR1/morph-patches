package p153l;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ovt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f149310a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f149311b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f149312c;

    public ovt0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f149310a = kqx0Var;
        this.f149311b = kqx0Var2;
        this.f149312c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        hvt0 hvt0Var = (hvt0) this.f149310a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Set setSingleton = ((JSONObject) this.f149312c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new yfu0(hvt0Var, xvw0Var));
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
