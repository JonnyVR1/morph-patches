package p149l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pvw0 {

    /* JADX INFO: renamed from: a */
    public final Map f151518a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f151519b = new HashMap();

    public /* synthetic */ pvw0(ovw0 ovw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final pvw0 m171694a(Enum r2, Object obj) {
        this.f151518a.put(r2, obj);
        this.f151519b.put(obj, r2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final wvw0 m171695b() {
        return new wvw0(Collections.unmodifiableMap(this.f151518a), Collections.unmodifiableMap(this.f151519b), null);
    }
}
