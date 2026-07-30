package p153l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class v4x0 {

    /* JADX INFO: renamed from: a */
    public final Map f182441a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f182442b = new HashMap();

    public /* synthetic */ v4x0(u4x0 u4x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final v4x0 m199740a(Enum r2, Object obj) {
        this.f182441a.put(r2, obj);
        this.f182442b.put(obj, r2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final c5x0 m199741b() {
        return new c5x0(Collections.unmodifiableMap(this.f182441a), Collections.unmodifiableMap(this.f182442b), null);
    }
}
