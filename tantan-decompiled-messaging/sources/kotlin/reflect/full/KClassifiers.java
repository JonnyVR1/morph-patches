package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p149l.dkq;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lkotlin/reflect/KClassifier;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "b", "(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;)Lkotlin/reflect/KType;", "Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "a", "(Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class KClassifiers {

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63583a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63583a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final SimpleType m87635a(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<KTypeProjection> list, boolean z) {
        TypeProjectionBase starProjectionImpl;
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        parameters.getClass();
        List<KTypeProjection> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.m87611c();
            KotlinType kotlinTypeM87978A = kTypeImpl != null ? kTypeImpl.getType() : null;
            KVariance kVarianceM87612d = kTypeProjection.m87612d();
            int i3 = kVarianceM87612d == null ? -1 : WhenMappings.f63583a[kVarianceM87612d.ordinal()];
            if (i3 == -1) {
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i);
                typeParameterDescriptor.getClass();
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                kotlinTypeM87978A.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance, kotlinTypeM87978A);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                kotlinTypeM87978A.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance2, kotlinTypeM87978A);
            } else {
                if (i3 != 3) {
                    l9r.m149037a();
                    return null;
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                kotlinTypeM87978A.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance3, kotlinTypeM87978A);
            }
            arrayList.add(starProjectionImpl);
            i = i2;
        }
        return KotlinTypeFactory.m92634k(typeAttributes, typeConstructor, arrayList, z, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KType m87636b(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, boolean z, @NotNull List<? extends Annotation> list2) {
        ClassifierDescriptor classifierDescriptorMo87756e;
        kClassifier.getClass();
        list.getClass();
        list2.getClass();
        Function0 function0 = null;
        Object[] objArr = 0;
        KClassifierImpl kClassifierImpl = kClassifier instanceof KClassifierImpl ? (KClassifierImpl) kClassifier : null;
        if (kClassifierImpl == null || (classifierDescriptorMo87756e = kClassifierImpl.getDescriptor()) == null) {
            StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
            sb.append(kClassifier);
            Class<?> cls = kClassifier.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        TypeConstructor typeConstructorMo88305l = classifierDescriptorMo87756e.mo88305l();
        typeConstructorMo88305l.getClass();
        List<TypeParameterDescriptor> parameters = typeConstructorMo88305l.getParameters();
        parameters.getClass();
        if (parameters.size() == list.size()) {
            return new KTypeImpl(m87635a(list2.isEmpty() ? TypeAttributes.Companion.m92709k() : TypeAttributes.Companion.m92709k(), typeConstructorMo88305l, list, z), function0, 2, objArr == true ? 1 : 0);
        }
        dkq.m112270a("Class declares ", parameters.size(), " type parameters, but ", list.size(), " were provided.");
        return null;
    }
}
