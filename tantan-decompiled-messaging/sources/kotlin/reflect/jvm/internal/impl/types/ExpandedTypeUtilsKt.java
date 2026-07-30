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
        public static final /* synthetic */ int[] f66219a;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66219a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TypeParameterMarker m92591a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        return typeSystemCommonBackendContext.mo90270n0(typeSystemCommonBackendContext.mo90225O(kotlinTypeMarker));
    }

    /* JADX INFO: renamed from: b */
    public static final TypeParameterMarker m92592b(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        KotlinTypeMarker kotlinTypeMarkerMo90254f0;
        TypeParameterMarker typeParameterMarkerM92591a = m92591a(typeSystemCommonBackendContext, kotlinTypeMarker);
        if (typeParameterMarkerM92591a != null) {
            return typeParameterMarkerM92591a;
        }
        if (typeSystemCommonBackendContext.mo90279s(kotlinTypeMarker) && (kotlinTypeMarkerMo90254f0 = typeSystemCommonBackendContext.mo90254f0((TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.mo90278r0(kotlinTypeMarker)))) != null) {
            return m92592b(typeSystemCommonBackendContext, kotlinTypeMarkerMo90254f0);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final KotlinTypeMarker m92593c(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        return m92594d(typeSystemCommonBackendContext, kotlinTypeMarker, new HashSet());
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinTypeMarker m92594d(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerM92594d;
        TypeConstructorMarker typeConstructorMarkerMo90225O = typeSystemCommonBackendContext.mo90225O(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerMo90225O)) {
            return null;
        }
        TypeParameterMarker typeParameterMarkerMo90270n0 = typeSystemCommonBackendContext.mo90270n0(typeConstructorMarkerMo90225O);
        if (typeParameterMarkerMo90270n0 != null) {
            KotlinTypeMarker kotlinTypeMarkerMo90215J = typeSystemCommonBackendContext.mo90215J(typeParameterMarkerMo90270n0);
            KotlinTypeMarker kotlinTypeMarkerM92594d2 = m92594d(typeSystemCommonBackendContext, kotlinTypeMarkerMo90215J, hashSet);
            if (kotlinTypeMarkerM92594d2 == null) {
                return null;
            }
            boolean z = typeSystemCommonBackendContext.mo90280s0(typeSystemCommonBackendContext.mo90225O(kotlinTypeMarkerMo90215J)) || ((kotlinTypeMarkerMo90215J instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.mo90200B0((SimpleTypeMarker) kotlinTypeMarkerMo90215J));
            if ((kotlinTypeMarkerM92594d2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.mo90200B0((SimpleTypeMarker) kotlinTypeMarkerM92594d2) && typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarker) && z) {
                return typeSystemCommonBackendContext.mo90256g0(kotlinTypeMarkerMo90215J);
            }
            return (typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarkerM92594d2) || !typeSystemCommonBackendContext.mo90228P0(kotlinTypeMarker)) ? kotlinTypeMarkerM92594d2 : typeSystemCommonBackendContext.mo90256g0(kotlinTypeMarkerM92594d2);
        }
        if (typeSystemCommonBackendContext.mo90280s0(typeConstructorMarkerMo90225O)) {
            KotlinTypeMarker kotlinTypeMarkerM92595e = m92595e(typeSystemCommonBackendContext, kotlinTypeMarker);
            if (kotlinTypeMarkerM92595e == null || (kotlinTypeMarkerM92594d = m92594d(typeSystemCommonBackendContext, kotlinTypeMarkerM92595e, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarker)) {
                return kotlinTypeMarkerM92594d;
            }
            if (!typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarkerM92594d) && (!(kotlinTypeMarkerM92594d instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.mo90200B0((SimpleTypeMarker) kotlinTypeMarkerM92594d))) {
                return typeSystemCommonBackendContext.mo90256g0(kotlinTypeMarkerM92594d);
            }
        }
        return kotlinTypeMarker;
    }

    /* JADX INFO: renamed from: e */
    public static final KotlinTypeMarker m92595e(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        List<TypeParameterMarker> listMo90222M0 = typeSystemCommonBackendContext.mo90222M0(typeSystemCommonBackendContext.mo90225O(kotlinTypeMarker));
        List<TypeArgumentMarker> listMo90278r0 = typeSystemCommonBackendContext.mo90278r0(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo90278r0, 10));
        int i = 0;
        for (Object obj : listMo90278r0) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KotlinTypeMarker kotlinTypeMarkerMo90254f0 = typeSystemCommonBackendContext.mo90254f0((TypeArgumentMarker) obj);
            if (kotlinTypeMarkerMo90254f0 == null) {
                kotlinTypeMarkerMo90254f0 = typeSystemCommonBackendContext.mo90215J(listMo90222M0.get(i));
            }
            arrayList.add(kotlinTypeMarkerMo90254f0);
            i = i2;
        }
        List<TypeParameterMarker> list = listMo90222M0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeSystemCommonBackendContext.mo90207F((TypeParameterMarker) it.next()));
        }
        TypeSubstitutorMarker typeSubstitutorMarkerMo90288w0 = typeSystemCommonBackendContext.mo90288w0(MapsKt.toMap(CollectionsKt.zip(arrayList2, arrayList)));
        KotlinTypeMarker kotlinTypeMarkerMo90220L0 = typeSystemCommonBackendContext.mo90220L0(kotlinTypeMarker);
        if (kotlinTypeMarkerMo90220L0 == null) {
            return null;
        }
        TypeParameterMarker typeParameterMarkerM92592b = m92592b(typeSystemCommonBackendContext, kotlinTypeMarkerMo90220L0);
        return typeParameterMarkerM92592b == null ? typeSystemCommonBackendContext.mo90205E(typeSubstitutorMarkerMo90288w0, kotlinTypeMarkerMo90220L0) : m92596f(typeSystemCommonBackendContext, kotlinTypeMarkerMo90220L0, typeSystemCommonBackendContext.mo90205E(typeSubstitutorMarkerMo90288w0, typeSystemCommonBackendContext.mo90215J(typeParameterMarkerM92592b)));
    }

    /* JADX INFO: renamed from: f */
    public static final KotlinTypeMarker m92596f(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerM92596f;
        if (m92591a(typeSystemCommonBackendContext, kotlinTypeMarker) != null) {
            return typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarker) ? typeSystemCommonBackendContext.mo90256g0(kotlinTypeMarker2) : kotlinTypeMarker2;
        }
        TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.mo90278r0(kotlinTypeMarker));
        if (WhenMappings.f66219a[typeSystemCommonBackendContext.mo90246b0(typeArgumentMarker).ordinal()] == 1) {
            kotlinTypeMarkerM92596f = typeSystemCommonBackendContext.mo90206E0();
        } else {
            KotlinTypeMarker kotlinTypeMarkerMo90254f0 = typeSystemCommonBackendContext.mo90254f0(typeArgumentMarker);
            kotlinTypeMarkerMo90254f0.getClass();
            kotlinTypeMarkerM92596f = m92596f(typeSystemCommonBackendContext, kotlinTypeMarkerMo90254f0, kotlinTypeMarker2);
        }
        SimpleTypeMarker simpleTypeMarkerMo90242Z = typeSystemCommonBackendContext.mo90242Z(kotlinTypeMarkerM92596f);
        return typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarker) ? typeSystemCommonBackendContext.mo90256g0(simpleTypeMarkerMo90242Z) : simpleTypeMarkerMo90242Z;
    }
}
