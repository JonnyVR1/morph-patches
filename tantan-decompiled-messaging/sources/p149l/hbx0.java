package p149l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class hbx0 {

    /* JADX INFO: renamed from: c */
    public static final hbx0 f106981c = new hbx0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f106983b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final pbx0 f106982a = new nax0();

    /* JADX INFO: renamed from: a */
    public static hbx0 m130351a() {
        return f106981c;
    }

    /* JADX INFO: renamed from: b */
    public final obx0 m130352b(Class cls) {
        aax0.m95575c(cls, "messageType");
        obx0 obx0Var = (obx0) this.f106983b.get(cls);
        if (obx0Var != null) {
            return obx0Var;
        }
        obx0 obx0VarZza = this.f106982a.zza(cls);
        aax0.m95575c(cls, "messageType");
        obx0 obx0Var2 = (obx0) this.f106983b.putIfAbsent(cls, obx0VarZza);
        return obx0Var2 == null ? obx0VarZza : obx0Var2;
    }
}
