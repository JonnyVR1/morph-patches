package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CompanionObjectMapping {

    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<ClassId> f64444a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.m89156c((PrimitiveType) it.next()));
        }
        List listPlus = CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) arrayList, StandardNames.FqNames.f64568g.m91959m()), StandardNames.FqNames.f64572i.m91959m()), StandardNames.FqNames.f64590r.m91959m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.m91936c((FqName) it2.next()));
        }
        f64444a = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<ClassId> m89028a() {
        return f64444a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<ClassId> m89029b() {
        return f64444a;
    }
}
