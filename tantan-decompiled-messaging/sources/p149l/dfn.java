package p149l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class dfn {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m111496a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                qhg0.m174539a("duplicate element: ", obj);
                return null;
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
