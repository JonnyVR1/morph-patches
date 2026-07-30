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
import p153l.nbr;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntersectionTypeKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final UnwrappedType m93793a(@NotNull Collection<? extends UnwrappedType> collection) {
        SimpleType simpleTypeM93488O0;
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            wtq0.m207906a("Expected some types");
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
            z = z || KotlinTypeKt.m93535a(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                simpleTypeM93488O0 = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    nbr.m162172a();
                    return null;
                }
                if (DynamicTypesKt.m93480a(unwrappedType)) {
                    return unwrappedType;
                }
                simpleTypeM93488O0 = ((FlexibleType) unwrappedType).m93488O0();
                z2 = true;
            }
            arrayList.add(simpleTypeM93488O0);
        }
        if (z) {
            return ErrorUtils.m93893d(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, collection.toString());
        }
        if (!z2) {
            return TypeIntersector.INSTANCE.m93869d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.m93499d((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
        return KotlinTypeFactory.m93520e(typeIntersector.m93869d(arrayList), typeIntersector.m93869d(arrayList2));
    }
}
