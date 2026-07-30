package kotlin.reflect.full;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"kotlin/reflect/full/KClasses$allSupertypes$2", "Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandlerWithListResult;", "Lkotlin/reflect/KType;", "current", "", "e", "(Lkotlin/reflect/KType;)Z", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class KClasses$allSupertypes$2 extends DFS.NodeHandlerWithListResult<KType, KType> {
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo87633a(KType current) {
        current.getClass();
        ((LinkedList) this.f66437a).add(current);
        return true;
    }
}
