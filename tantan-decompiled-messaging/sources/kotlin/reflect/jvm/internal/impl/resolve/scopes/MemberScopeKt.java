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
    public static final Set<Name> m92066a(@NotNull Iterable<? extends MemberScope> iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<Name> setMo88723e = it.next().mo88723e();
            if (setMo88723e == null) {
                return null;
            }
            CollectionsKt.addAll(hashSet, setMo88723e);
        }
        return hashSet;
    }
}
