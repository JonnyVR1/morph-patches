package p153l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class gxx0 {

    /* JADX INFO: renamed from: c */
    public static final gxx0 f107009c = new gxx0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f107011b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final zxx0 f107010a = new rux0();

    /* JADX INFO: renamed from: a */
    public static gxx0 m132928a() {
        return f107009c;
    }

    /* JADX INFO: renamed from: b */
    public final uxx0 m132929b(Class cls) {
        srx0.m187642c(cls, "messageType");
        uxx0 uxx0Var = (uxx0) this.f107011b.get(cls);
        if (uxx0Var != null) {
            return uxx0Var;
        }
        uxx0 uxx0VarZza = this.f107010a.zza(cls);
        srx0.m187642c(cls, "messageType");
        uxx0 uxx0Var2 = (uxx0) this.f107011b.putIfAbsent(cls, uxx0VarZza);
        return uxx0Var2 == null ? uxx0VarZza : uxx0Var2;
    }
}
