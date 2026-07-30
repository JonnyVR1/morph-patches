package p149l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class aox0 {

    /* JADX INFO: renamed from: c */
    public static final aox0 f70954c = new aox0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f70956b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final tox0 f70955a = new llx0();

    /* JADX INFO: renamed from: a */
    public static aox0 m98001a() {
        return f70954c;
    }

    /* JADX INFO: renamed from: b */
    public final oox0 m98002b(Class cls) {
        mix0.m154767c(cls, "messageType");
        oox0 oox0Var = (oox0) this.f70956b.get(cls);
        if (oox0Var != null) {
            return oox0Var;
        }
        oox0 oox0VarZza = this.f70955a.zza(cls);
        mix0.m154767c(cls, "messageType");
        oox0 oox0Var2 = (oox0) this.f70956b.putIfAbsent(cls, oox0VarZza);
        return oox0Var2 == null ? oox0VarZza : oox0Var2;
    }
}
