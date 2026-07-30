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
    public static final Set<ClassId> f63770a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.m88265c((PrimitiveType) it.next()));
        }
        List listPlus = CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) arrayList, StandardNames.FqNames.f63894g.m91068m()), StandardNames.FqNames.f63898i.m91068m()), StandardNames.FqNames.f63916r.m91068m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.m91045c((FqName) it2.next()));
        }
        f63770a = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<ClassId> m88137a() {
        return f63770a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<ClassId> m88138b() {
        return f63770a;
    }
}
