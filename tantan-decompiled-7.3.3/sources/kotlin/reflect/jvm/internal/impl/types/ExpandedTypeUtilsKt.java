package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ExpandedTypeUtilsKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66893a;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66893a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TypeParameterMarker m93482a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        return typeSystemCommonBackendContext.mo91161n0(typeSystemCommonBackendContext.mo91116O(kotlinTypeMarker));
    }

    /* JADX INFO: renamed from: b */
    public static final TypeParameterMarker m93483b(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        KotlinTypeMarker kotlinTypeMarkerMo91145f0;
        TypeParameterMarker typeParameterMarkerM93482a = m93482a(typeSystemCommonBackendContext, kotlinTypeMarker);
        if (typeParameterMarkerM93482a != null) {
            return typeParameterMarkerM93482a;
        }
        if (typeSystemCommonBackendContext.mo91170s(kotlinTypeMarker) && (kotlinTypeMarkerMo91145f0 = typeSystemCommonBackendContext.mo91145f0((TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.mo91169r0(kotlinTypeMarker)))) != null) {
            return m93483b(typeSystemCommonBackendContext, kotlinTypeMarkerMo91145f0);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final KotlinTypeMarker m93484c(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        return m93485d(typeSystemCommonBackendContext, kotlinTypeMarker, new HashSet());
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinTypeMarker m93485d(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerM93485d;
        TypeConstructorMarker typeConstructorMarkerMo91116O = typeSystemCommonBackendContext.mo91116O(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerMo91116O)) {
            return null;
        }
        TypeParameterMarker typeParameterMarkerMo91161n0 = typeSystemCommonBackendContext.mo91161n0(typeConstructorMarkerMo91116O);
        if (typeParameterMarkerMo91161n0 != null) {
            KotlinTypeMarker kotlinTypeMarkerMo91106J = typeSystemCommonBackendContext.mo91106J(typeParameterMarkerMo91161n0);
            KotlinTypeMarker kotlinTypeMarkerM93485d2 = m93485d(typeSystemCommonBackendContext, kotlinTypeMarkerMo91106J, hashSet);
            if (kotlinTypeMarkerM93485d2 == null) {
                return null;
            }
            boolean z = typeSystemCommonBackendContext.mo91171s0(typeSystemCommonBackendContext.mo91116O(kotlinTypeMarkerMo91106J)) || ((kotlinTypeMarkerMo91106J instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.mo91091B0((SimpleTypeMarker) kotlinTypeMarkerMo91106J));
            if ((kotlinTypeMarkerM93485d2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.mo91091B0((SimpleTypeMarker) kotlinTypeMarkerM93485d2) && typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarker) && z) {
                return typeSystemCommonBackendContext.mo91147g0(kotlinTypeMarkerMo91106J);
            }
            return (typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarkerM93485d2) || !typeSystemCommonBackendContext.mo91119P0(kotlinTypeMarker)) ? kotlinTypeMarkerM93485d2 : typeSystemCommonBackendContext.mo91147g0(kotlinTypeMarkerM93485d2);
        }
        if (typeSystemCommonBackendContext.mo91171s0(typeConstructorMarkerMo91116O)) {
            KotlinTypeMarker kotlinTypeMarkerM93486e = m93486e(typeSystemCommonBackendContext, kotlinTypeMarker);
            if (kotlinTypeMarkerM93486e == null || (kotlinTypeMarkerM93485d = m93485d(typeSystemCommonBackendContext, kotlinTypeMarkerM93486e, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarker)) {
                return kotlinTypeMarkerM93485d;
            }
            if (!typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarkerM93485d) && (!(kotlinTypeMarkerM93485d instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.mo91091B0((SimpleTypeMarker) kotlinTypeMarkerM93485d))) {
                return typeSystemCommonBackendContext.mo91147g0(kotlinTypeMarkerM93485d);
            }
        }
        return kotlinTypeMarker;
    }

    /* JADX INFO: renamed from: e */
    public static final KotlinTypeMarker m93486e(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        List<TypeParameterMarker> listMo91113M0 = typeSystemCommonBackendContext.mo91113M0(typeSystemCommonBackendContext.mo91116O(kotlinTypeMarker));
        List<TypeArgumentMarker> listMo91169r0 = typeSystemCommonBackendContext.mo91169r0(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo91169r0, 10));
        int i = 0;
        for (Object obj : listMo91169r0) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KotlinTypeMarker kotlinTypeMarkerMo91145f0 = typeSystemCommonBackendContext.mo91145f0((TypeArgumentMarker) obj);
            if (kotlinTypeMarkerMo91145f0 == null) {
                kotlinTypeMarkerMo91145f0 = typeSystemCommonBackendContext.mo91106J(listMo91113M0.get(i));
            }
            arrayList.add(kotlinTypeMarkerMo91145f0);
            i = i2;
        }
        List<TypeParameterMarker> list = listMo91113M0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeSystemCommonBackendContext.mo91098F((TypeParameterMarker) it.next()));
        }
        TypeSubstitutorMarker typeSubstitutorMarkerMo91179w0 = typeSystemCommonBackendContext.mo91179w0(MapsKt.toMap(CollectionsKt.zip(arrayList2, arrayList)));
        KotlinTypeMarker kotlinTypeMarkerMo91111L0 = typeSystemCommonBackendContext.mo91111L0(kotlinTypeMarker);
        if (kotlinTypeMarkerMo91111L0 == null) {
            return null;
        }
        TypeParameterMarker typeParameterMarkerM93483b = m93483b(typeSystemCommonBackendContext, kotlinTypeMarkerMo91111L0);
        return typeParameterMarkerM93483b == null ? typeSystemCommonBackendContext.mo91096E(typeSubstitutorMarkerMo91179w0, kotlinTypeMarkerMo91111L0) : m93487f(typeSystemCommonBackendContext, kotlinTypeMarkerMo91111L0, typeSystemCommonBackendContext.mo91096E(typeSubstitutorMarkerMo91179w0, typeSystemCommonBackendContext.mo91106J(typeParameterMarkerM93483b)));
    }

    /* JADX INFO: renamed from: f */
    public static final KotlinTypeMarker m93487f(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerM93487f;
        if (m93482a(typeSystemCommonBackendContext, kotlinTypeMarker) != null) {
            return typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarker) ? typeSystemCommonBackendContext.mo91147g0(kotlinTypeMarker2) : kotlinTypeMarker2;
        }
        TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.mo91169r0(kotlinTypeMarker));
        if (WhenMappings.f66893a[typeSystemCommonBackendContext.mo91137b0(typeArgumentMarker).ordinal()] == 1) {
            kotlinTypeMarkerM93487f = typeSystemCommonBackendContext.mo91097E0();
        } else {
            KotlinTypeMarker kotlinTypeMarkerMo91145f0 = typeSystemCommonBackendContext.mo91145f0(typeArgumentMarker);
            kotlinTypeMarkerMo91145f0.getClass();
            kotlinTypeMarkerM93487f = m93487f(typeSystemCommonBackendContext, kotlinTypeMarkerMo91145f0, kotlinTypeMarker2);
        }
        SimpleTypeMarker simpleTypeMarkerMo91133Z = typeSystemCommonBackendContext.mo91133Z(kotlinTypeMarkerM93487f);
        return typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarker) ? typeSystemCommonBackendContext.mo91147g0(simpleTypeMarkerMo91133Z) : simpleTypeMarkerMo91133Z;
    }
}
