package p153l;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c5x0 {

    /* JADX INFO: renamed from: a */
    public final Map f79907a;

    /* JADX INFO: renamed from: b */
    public final Map f79908b;

    public /* synthetic */ c5x0(Map map, Map map2, w4x0 w4x0Var) {
        this.f79907a = map;
        this.f79908b = map2;
    }

    /* JADX INFO: renamed from: a */
    public static v4x0 m108082a() {
        return new v4x0(null);
    }

    /* JADX INFO: renamed from: b */
    public final Enum m108083b(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.f79908b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: c */
    public final Object m108084c(Enum r2) throws GeneralSecurityException {
        Object obj = this.f79907a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }
}
