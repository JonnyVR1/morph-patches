package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KotlinTypeRefinerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleCapability<Ref<TypeRefinementSupport>> f66299a = new ModuleCapability<>("KotlinTypeRefiner");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ModuleCapability<Ref<TypeRefinementSupport>> m92915a() {
        return f66299a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<KotlinType> m92916b(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Iterable<? extends KotlinType> iterable) {
        kotlinTypeRefiner.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends KotlinType> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.mo92559a(it.next()));
        }
        return arrayList;
    }
}
