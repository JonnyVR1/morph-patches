package p149l;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jmt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f118712a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f118713b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f118714c;

    public jmt0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f118712a = ehx0Var;
        this.f118713b = ehx0Var2;
        this.f118714c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        bmt0 bmt0Var = (bmt0) this.f118712a.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        Set setSingleton = ((JSONObject) this.f118714c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new s6u0(bmt0Var, rmw0Var));
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
