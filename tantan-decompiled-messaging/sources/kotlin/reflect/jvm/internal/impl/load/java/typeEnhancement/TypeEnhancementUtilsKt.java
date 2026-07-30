package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeEnhancementUtilsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JavaTypeQualifiers m90114a(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> collection, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifierM90119f;
        javaTypeQualifiers.getClass();
        collection.getClass();
        Collection<JavaTypeQualifiers> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierM90115b = m90115b((JavaTypeQualifiers) it.next());
            if (nullabilityQualifierM90115b != null) {
                arrayList.add(nullabilityQualifierM90115b);
            }
        }
        NullabilityQualifier nullabilityQualifierM90119f2 = m90119f(CollectionsKt.toSet(arrayList), m90115b(javaTypeQualifiers), z);
        if (nullabilityQualifierM90119f2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierM89962f = ((JavaTypeQualifiers) it2.next()).m89962f();
                if (nullabilityQualifierM89962f != null) {
                    arrayList2.add(nullabilityQualifierM89962f);
                }
            }
            nullabilityQualifierM90119f = m90119f(CollectionsKt.toSet(arrayList2), javaTypeQualifiers.m89962f(), z);
        } else {
            nullabilityQualifierM90119f = nullabilityQualifierM90119f2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierM89961e = ((JavaTypeQualifiers) it3.next()).m89961e();
            if (mutabilityQualifierM89961e != null) {
                arrayList3.add(mutabilityQualifierM89961e);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) m90118e(CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.m89961e(), z);
        if (nullabilityQualifierM90119f == null || z3 || (z2 && nullabilityQualifierM90119f == NullabilityQualifier.NULLABLE)) {
            nullabilityQualifierM90119f = null;
        }
        boolean z4 = false;
        boolean z5 = nullabilityQualifierM90119f != null && nullabilityQualifierM90119f2 == null;
        if (nullabilityQualifierM90119f == NullabilityQualifier.NOT_NULL) {
            if (m90117d(javaTypeQualifiers, z5)) {
                z4 = true;
                break;
            }
            if (!collection2.isEmpty()) {
                Iterator<T> it4 = collection2.iterator();
                while (it4.hasNext()) {
                    if (m90117d((JavaTypeQualifiers) it4.next(), z5)) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return new JavaTypeQualifiers(nullabilityQualifierM90119f, mutabilityQualifier, z4, z5);
    }

    /* JADX INFO: renamed from: b */
    public static final NullabilityQualifier m90115b(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.m89963g()) {
            return null;
        }
        return javaTypeQualifiers.m89962f();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90116c(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        FqName fqName = JvmAnnotationNames.f64714v;
        fqName.getClass();
        return typeSystemCommonBackendContext.mo90248c0(kotlinTypeMarker, fqName);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m90117d(JavaTypeQualifiers javaTypeQualifiers, boolean z) {
        return javaTypeQualifiers.m89963g() == z && javaTypeQualifiers.m89960d();
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m90118e(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> set2;
        T t4;
        if (!z) {
            if (t3 != null && (set2 = CollectionsKt.toSet(SetsKt.plus(set, t3))) != null) {
                set = set2;
            }
            return (T) CollectionsKt.singleOrNull(set);
        }
        if (set.contains(t)) {
            t4 = t;
        } else {
            t4 = set.contains(t2) ? t2 : null;
        }
        if (Intrinsics.m87488d(t4, t) && Intrinsics.m87488d(t3, t2)) {
            return null;
        }
        return t3 == null ? t4 : t3;
    }

    /* JADX INFO: renamed from: f */
    public static final NullabilityQualifier m90119f(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) m90118e(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
