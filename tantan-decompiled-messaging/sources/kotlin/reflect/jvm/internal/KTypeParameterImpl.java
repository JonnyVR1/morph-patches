package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;
import p149l.xwq;
import p149l.ywq;
import p149l.ztq;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0004\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "j", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "Ljava/lang/Class;", "g", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;)Ljava/lang/Class;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lkotlin/reflect/KType;", "b", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "c", "f", "()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlin/reflect/KVariance;", "h", "()Lkotlin/reflect/KVariance;", "variance", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f63713d = {Reflection.m87514i(new PropertyReference1Impl(KTypeParameterImpl.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(KTypeParameterImpl.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TypeParameterDescriptor descriptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal upperBounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal container;

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63717a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63717a = iArr;
        }
    }

    public KTypeParameterImpl(@Nullable KTypeParameterOwnerImpl kTypeParameterOwnerImpl, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        this.descriptor = typeParameterDescriptor;
        this.upperBounds = ReflectProperties.m87994c(new xwq(this));
        this.container = ReflectProperties.m87994c(new ywq(kTypeParameterOwnerImpl, this));
    }

    /* JADX INFO: renamed from: d */
    public static final KTypeParameterOwnerImpl m87982d(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, KTypeParameterImpl kTypeParameterImpl) {
        KClassImpl<?> kClassImplM87987j;
        Object objMo88464S;
        if (kTypeParameterOwnerImpl != null) {
            return kTypeParameterOwnerImpl;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = kTypeParameterImpl.mo87756e().mo88299b();
        declarationDescriptorMo88299b.getClass();
        if (declarationDescriptorMo88299b instanceof ClassDescriptor) {
            objMo88464S = kTypeParameterImpl.m87987j((ClassDescriptor) declarationDescriptorMo88299b);
        } else {
            if (!(declarationDescriptorMo88299b instanceof CallableMemberDescriptor)) {
                zwq.m220685a("Unknown type parameter container: ", declarationDescriptorMo88299b);
                return null;
            }
            DeclarationDescriptor declarationDescriptorMo88299b2 = ((CallableMemberDescriptor) declarationDescriptorMo88299b).mo88299b();
            declarationDescriptorMo88299b2.getClass();
            if (declarationDescriptorMo88299b2 instanceof ClassDescriptor) {
                kClassImplM87987j = kTypeParameterImpl.m87987j((ClassDescriptor) declarationDescriptorMo88299b2);
            } else {
                DeserializedMemberDescriptor deserializedMemberDescriptor = declarationDescriptorMo88299b instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) declarationDescriptorMo88299b : null;
                if (deserializedMemberDescriptor == null) {
                    zwq.m220685a("Non-class callable descriptor must be deserialized: ", declarationDescriptorMo88299b);
                    return null;
                }
                KClass kClassM87455e = JvmClassMappingKt.m87455e(kTypeParameterImpl.m87985g(deserializedMemberDescriptor));
                kClassM87455e.getClass();
                kClassImplM87987j = (KClassImpl) kClassM87455e;
            }
            objMo88464S = declarationDescriptorMo88299b.mo88464S(new CreateKCallableVisitor(kClassImplM87987j), Unit.INSTANCE);
        }
        return (KTypeParameterOwnerImpl) objMo88464S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final List m87983k(KTypeParameterImpl kTypeParameterImpl) {
        List<KotlinType> upperBounds = kTypeParameterImpl.mo87756e().getUpperBounds();
        upperBounds.getClass();
        List<KotlinType> list = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeImpl((KotlinType) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
        return Intrinsics.m87488d(m87984f(), kTypeParameterImpl.m87984f()) && Intrinsics.m87488d(getName(), kTypeParameterImpl.getName());
    }

    /* JADX INFO: renamed from: f */
    public final KTypeParameterOwnerImpl m87984f() {
        T tM87997b = this.container.m87997b(this, f63713d[1]);
        tM87997b.getClass();
        return (KTypeParameterOwnerImpl) tM87997b;
    }

    /* JADX INFO: renamed from: g */
    public final Class<?> m87985g(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        Class<?> clsM88948d;
        DeserializedContainerSource deserializedContainerSourceMo92288X = deserializedMemberDescriptor.mo92288X();
        JvmPackagePartSource jvmPackagePartSource = deserializedContainerSourceMo92288X instanceof JvmPackagePartSource ? (JvmPackagePartSource) deserializedContainerSourceMo92288X : null;
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90330g = jvmPackagePartSource != null ? jvmPackagePartSource.m90330g() : null;
        ReflectKotlinClass reflectKotlinClass = kotlinJvmBinaryClassM90330g instanceof ReflectKotlinClass ? (ReflectKotlinClass) kotlinJvmBinaryClassM90330g : null;
        if (reflectKotlinClass != null && (clsM88948d = reflectKotlinClass.m88948d()) != null) {
            return clsM88948d;
        }
        zwq.m220685a("Container of deserialized member is not resolved: ", deserializedMemberDescriptor);
        return null;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        String strM91082b = mo87756e().getName().m91082b();
        strM91082b.getClass();
        return strM91082b;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        T tM87997b = this.upperBounds.m87997b(this, f63713d[0]);
        tM87997b.getClass();
        return (List) tM87997b;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    /* JADX INFO: renamed from: h */
    public KVariance getVariance() {
        int i = WhenMappings.f63717a[mo87756e().mo88601h().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i == 3) {
            return KVariance.OUT;
        }
        l9r.m149037a();
        return null;
    }

    public int hashCode() {
        return (m87984f().hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter and merged with bridge method [inline-methods] */
    public TypeParameterDescriptor mo87756e() {
        return this.descriptor;
    }

    /* JADX INFO: renamed from: j */
    public final KClassImpl<?> m87987j(ClassDescriptor classDescriptor) {
        Class<?> clsM88054q = UtilKt.m88054q(classDescriptor);
        KClassImpl<?> kClassImpl = (KClassImpl) (clsM88054q != null ? JvmClassMappingKt.m87455e(clsM88054q) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        ztq.m220129a("Type parameter container is not resolved: ", classDescriptor.mo88299b());
        return null;
    }

    @NotNull
    public String toString() {
        return TypeParameterReference.INSTANCE.m87554a(this);
    }
}
