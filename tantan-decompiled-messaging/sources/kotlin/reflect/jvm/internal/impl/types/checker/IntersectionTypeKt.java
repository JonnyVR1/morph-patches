package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntersectionTypeKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final UnwrappedType m92902a(@NotNull Collection<? extends UnwrappedType> collection) {
        SimpleType simpleTypeM92597O0;
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            qkq0.m175383a("Expected some types");
            return null;
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.single(collection);
        }
        Collection<? extends UnwrappedType> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        boolean z = false;
        boolean z2 = false;
        for (UnwrappedType unwrappedType : collection2) {
            z = z || KotlinTypeKt.m92644a(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                simpleTypeM92597O0 = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    l9r.m149037a();
                    return null;
                }
                if (DynamicTypesKt.m92589a(unwrappedType)) {
                    return unwrappedType;
                }
                simpleTypeM92597O0 = ((FlexibleType) unwrappedType).m92597O0();
                z2 = true;
            }
            arrayList.add(simpleTypeM92597O0);
        }
        if (z) {
            return ErrorUtils.m93002d(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, collection.toString());
        }
        if (!z2) {
            return TypeIntersector.INSTANCE.m92978d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.m92608d((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
        return KotlinTypeFactory.m92629e(typeIntersector.m92978d(arrayList), typeIntersector.m92978d(arrayList2));
    }
}
