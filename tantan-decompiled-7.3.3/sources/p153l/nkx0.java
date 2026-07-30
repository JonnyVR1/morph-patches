package p153l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class nkx0 {

    /* JADX INFO: renamed from: c */
    public static final nkx0 f142487c = new nkx0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f142489b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final vkx0 f142488a = new tjx0();

    /* JADX INFO: renamed from: a */
    public static nkx0 m163670a() {
        return f142487c;
    }

    /* JADX INFO: renamed from: b */
    public final ukx0 m163671b(Class cls) {
        gjx0.m130564c(cls, "messageType");
        ukx0 ukx0Var = (ukx0) this.f142489b.get(cls);
        if (ukx0Var != null) {
            return ukx0Var;
        }
        ukx0 ukx0VarZza = this.f142488a.zza(cls);
        gjx0.m130564c(cls, "messageType");
        ukx0 ukx0Var2 = (ukx0) this.f142489b.putIfAbsent(cls, ukx0VarZza);
        return ukx0Var2 == null ? ukx0VarZza : ukx0Var2;
    }
}
