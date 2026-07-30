package p153l;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class lax0 {

    /* JADX INFO: renamed from: a */
    public HashMap f130745a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final nax0 m153542a() {
        if (this.f130745a == null) {
            wtq0.m207906a("cannot call build() twice");
            return null;
        }
        nax0 nax0Var = new nax0(Collections.unmodifiableMap(this.f130745a), null);
        this.f130745a = null;
        return nax0Var;
    }
}
