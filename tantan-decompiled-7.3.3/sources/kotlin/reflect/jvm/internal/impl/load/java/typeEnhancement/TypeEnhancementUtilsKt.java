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
    public static final JavaTypeQualifiers m91005a(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> collection, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifierM91010f;
        javaTypeQualifiers.getClass();
        collection.getClass();
        Collection<JavaTypeQualifiers> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierM91006b = m91006b((JavaTypeQualifiers) it.next());
            if (nullabilityQualifierM91006b != null) {
                arrayList.add(nullabilityQualifierM91006b);
            }
        }
        NullabilityQualifier nullabilityQualifierM91010f2 = m91010f(CollectionsKt.toSet(arrayList), m91006b(javaTypeQualifiers), z);
        if (nullabilityQualifierM91010f2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierM90853f = ((JavaTypeQualifiers) it2.next()).m90853f();
                if (nullabilityQualifierM90853f != null) {
                    arrayList2.add(nullabilityQualifierM90853f);
                }
            }
            nullabilityQualifierM91010f = m91010f(CollectionsKt.toSet(arrayList2), javaTypeQualifiers.m90853f(), z);
        } else {
            nullabilityQualifierM91010f = nullabilityQualifierM91010f2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierM90852e = ((JavaTypeQualifiers) it3.next()).m90852e();
            if (mutabilityQualifierM90852e != null) {
                arrayList3.add(mutabilityQualifierM90852e);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) m91009e(CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.m90852e(), z);
        if (nullabilityQualifierM91010f == null || z3 || (z2 && nullabilityQualifierM91010f == NullabilityQualifier.NULLABLE)) {
            nullabilityQualifierM91010f = null;
        }
        boolean z4 = false;
        boolean z5 = nullabilityQualifierM91010f != null && nullabilityQualifierM91010f2 == null;
        if (nullabilityQualifierM91010f == NullabilityQualifier.NOT_NULL) {
            if (m91008d(javaTypeQualifiers, z5)) {
                z4 = true;
                break;
            }
            if (!collection2.isEmpty()) {
                Iterator<T> it4 = collection2.iterator();
                while (it4.hasNext()) {
                    if (m91008d((JavaTypeQualifiers) it4.next(), z5)) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return new JavaTypeQualifiers(nullabilityQualifierM91010f, mutabilityQualifier, z4, z5);
    }

    /* JADX INFO: renamed from: b */
    public static final NullabilityQualifier m91006b(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.m90854g()) {
            return null;
        }
        return javaTypeQualifiers.m90853f();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91007c(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        FqName fqName = JvmAnnotationNames.f65388v;
        fqName.getClass();
        return typeSystemCommonBackendContext.mo91139c0(kotlinTypeMarker, fqName);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m91008d(JavaTypeQualifiers javaTypeQualifiers, boolean z) {
        return javaTypeQualifiers.m90854g() == z && javaTypeQualifiers.m90851d();
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m91009e(Set<? extends T> set, T t, T t2, T t3, boolean z) {
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
        if (Intrinsics.m88377d(t4, t) && Intrinsics.m88377d(t3, t2)) {
            return null;
        }
        return t3 == null ? t4 : t3;
    }

    /* JADX INFO: renamed from: f */
    public static final NullabilityQualifier m91010f(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) m91009e(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
