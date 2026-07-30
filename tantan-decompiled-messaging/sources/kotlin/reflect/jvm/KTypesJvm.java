package kotlin.reflect.jvm;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.p120km.ClassKind;
import org.jetbrains.annotations.NotNull;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "b", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "jvmErasure", "Lkotlin/reflect/KClassifier;", "a", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class KTypesJvm {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final KClass<?> m87639a(@NotNull KClassifier kClassifier) {
        KClass<?> kClassM87640b;
        kClassifier.getClass();
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        Object obj = null;
        if (!(kClassifier instanceof KTypeParameter)) {
            zwq.m220685a("Cannot calculate JVM erasure for type: ", kClassifier);
            return null;
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        for (Object obj2 : upperBounds) {
            KClassifier kClassifierMo87559i = ((KType) obj2).getClassifier();
            KClassImpl kClassImpl = kClassifierMo87559i instanceof KClassImpl ? (KClassImpl) kClassifierMo87559i : null;
            if (kClassImpl != null && kClassImpl.m87750X() != ClassKind.INTERFACE && kClassImpl.m87750X() != ClassKind.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        KType kType = (KType) obj;
        if (kType == null) {
            kType = (KType) CollectionsKt.firstOrNull((List) upperBounds);
        }
        return (kType == null || (kClassM87640b = m87640b(kType)) == null) ? Reflection.m87507b(Object.class) : kClassM87640b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KClass<?> m87640b(@NotNull KType kType) {
        KClass<?> kClassM87639a;
        kType.getClass();
        KClassifier kClassifierMo87559i = kType.getClassifier();
        if (kClassifierMo87559i != null && (kClassM87639a = m87639a(kClassifierMo87559i)) != null) {
            return kClassM87639a;
        }
        zwq.m220685a("Cannot calculate JVM erasure for type: ", kType);
        return null;
    }
}
