package p149l;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class f1x0 {

    /* JADX INFO: renamed from: a */
    public HashMap f94122a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final h1x0 m119145a() {
        if (this.f94122a == null) {
            qkq0.m175383a("cannot call build() twice");
            return null;
        }
        h1x0 h1x0Var = new h1x0(Collections.unmodifiableMap(this.f94122a), null);
        this.f94122a = null;
        return h1x0Var;
    }
}
