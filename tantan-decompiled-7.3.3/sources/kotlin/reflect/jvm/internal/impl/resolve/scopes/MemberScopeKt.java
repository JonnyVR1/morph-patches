package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MemberScopeKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Set<Name> m92957a(@NotNull Iterable<? extends MemberScope> iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<Name> setMo89614e = it.next().mo89614e();
            if (setMo89614e == null) {
                return null;
            }
            CollectionsKt.addAll(hashSet, setMo89614e);
        }
        return hashSet;
    }
}
