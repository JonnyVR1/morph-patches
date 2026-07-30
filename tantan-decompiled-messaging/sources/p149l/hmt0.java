package p149l;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hmt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f108474a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f108475b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f108476c;

    public hmt0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f108474a = ehx0Var;
        this.f108475b = ehx0Var2;
        this.f108476c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        bmt0 bmt0Var = (bmt0) this.f108474a.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        Set setSingleton = ((JSONObject) this.f108476c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new s6u0(bmt0Var, rmw0Var));
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
