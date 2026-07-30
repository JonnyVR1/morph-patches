package p009l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import l.qhg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final /* synthetic */ class dfn {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m13315a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                qhg0.a("duplicate element: ", obj);
                return null;
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
