package p149l;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wvw0 {

    /* JADX INFO: renamed from: a */
    public final Map f188294a;

    /* JADX INFO: renamed from: b */
    public final Map f188295b;

    public /* synthetic */ wvw0(Map map, Map map2, qvw0 qvw0Var) {
        this.f188294a = map;
        this.f188295b = map2;
    }

    /* JADX INFO: renamed from: a */
    public static pvw0 m205784a() {
        return new pvw0(null);
    }

    /* JADX INFO: renamed from: b */
    public final Enum m205785b(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.f188295b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: c */
    public final Object m205786c(Enum r2) throws GeneralSecurityException {
        Object obj = this.f188294a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }
}
