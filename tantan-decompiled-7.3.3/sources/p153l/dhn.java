package p153l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class dhn {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m115804a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                ypg0.m217021a("duplicate element: ", obj);
                return null;
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
