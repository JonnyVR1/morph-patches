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
import p153l.awq;
import p153l.azq;
import p153l.nbr;
import p153l.yyq;
import p153l.zyq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0004\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "j", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "Ljava/lang/Class;", "g", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;)Ljava/lang/Class;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lkotlin/reflect/KType;", "b", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "c", "f", "()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlin/reflect/KVariance;", "h", "()Lkotlin/reflect/KVariance;", "variance", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f64387d = {Reflection.m88403i(new PropertyReference1Impl(KTypeParameterImpl.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(KTypeParameterImpl.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TypeParameterDescriptor descriptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal upperBounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal container;

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64391a;

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
            f64391a = iArr;
        }
    }

    public KTypeParameterImpl(@Nullable KTypeParameterOwnerImpl kTypeParameterOwnerImpl, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        this.descriptor = typeParameterDescriptor;
        this.upperBounds = ReflectProperties.m88885c(new yyq(this));
        this.container = ReflectProperties.m88885c(new zyq(kTypeParameterOwnerImpl, this));
    }

    /* JADX INFO: renamed from: d */
    public static final KTypeParameterOwnerImpl m88873d(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, KTypeParameterImpl kTypeParameterImpl) {
        KClassImpl<?> kClassImplM88878j;
        Object objMo89355S;
        if (kTypeParameterOwnerImpl != null) {
            return kTypeParameterOwnerImpl;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = kTypeParameterImpl.mo88647e().mo89190b();
        declarationDescriptorMo89190b.getClass();
        if (declarationDescriptorMo89190b instanceof ClassDescriptor) {
            objMo89355S = kTypeParameterImpl.m88878j((ClassDescriptor) declarationDescriptorMo89190b);
        } else {
            if (!(declarationDescriptorMo89190b instanceof CallableMemberDescriptor)) {
                azq.m101080a("Unknown type parameter container: ", declarationDescriptorMo89190b);
                return null;
            }
            DeclarationDescriptor declarationDescriptorMo89190b2 = ((CallableMemberDescriptor) declarationDescriptorMo89190b).mo89190b();
            declarationDescriptorMo89190b2.getClass();
            if (declarationDescriptorMo89190b2 instanceof ClassDescriptor) {
                kClassImplM88878j = kTypeParameterImpl.m88878j((ClassDescriptor) declarationDescriptorMo89190b2);
            } else {
                DeserializedMemberDescriptor deserializedMemberDescriptor = declarationDescriptorMo89190b instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) declarationDescriptorMo89190b : null;
                if (deserializedMemberDescriptor == null) {
                    azq.m101080a("Non-class callable descriptor must be deserialized: ", declarationDescriptorMo89190b);
                    return null;
                }
                KClass kClassM88344e = JvmClassMappingKt.m88344e(kTypeParameterImpl.m88876g(deserializedMemberDescriptor));
                kClassM88344e.getClass();
                kClassImplM88878j = (KClassImpl) kClassM88344e;
            }
            objMo89355S = declarationDescriptorMo89190b.mo89355S(new CreateKCallableVisitor(kClassImplM88878j), Unit.INSTANCE);
        }
        return (KTypeParameterOwnerImpl) objMo89355S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final List m88874k(KTypeParameterImpl kTypeParameterImpl) {
        List<KotlinType> upperBounds = kTypeParameterImpl.mo88647e().getUpperBounds();
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
        return Intrinsics.m88377d(m88875f(), kTypeParameterImpl.m88875f()) && Intrinsics.m88377d(getName(), kTypeParameterImpl.getName());
    }

    /* JADX INFO: renamed from: f */
    public final KTypeParameterOwnerImpl m88875f() {
        T tM88888b = this.container.m88888b(this, f64387d[1]);
        tM88888b.getClass();
        return (KTypeParameterOwnerImpl) tM88888b;
    }

    /* JADX INFO: renamed from: g */
    public final Class<?> m88876g(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        Class<?> clsM89839d;
        DeserializedContainerSource deserializedContainerSourceMo93179X = deserializedMemberDescriptor.mo93179X();
        JvmPackagePartSource jvmPackagePartSource = deserializedContainerSourceMo93179X instanceof JvmPackagePartSource ? (JvmPackagePartSource) deserializedContainerSourceMo93179X : null;
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91221g = jvmPackagePartSource != null ? jvmPackagePartSource.m91221g() : null;
        ReflectKotlinClass reflectKotlinClass = kotlinJvmBinaryClassM91221g instanceof ReflectKotlinClass ? (ReflectKotlinClass) kotlinJvmBinaryClassM91221g : null;
        if (reflectKotlinClass != null && (clsM89839d = reflectKotlinClass.m89839d()) != null) {
            return clsM89839d;
        }
        azq.m101080a("Container of deserialized member is not resolved: ", deserializedMemberDescriptor);
        return null;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        String strM91973b = mo88647e().getName().m91973b();
        strM91973b.getClass();
        return strM91973b;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        T tM88888b = this.upperBounds.m88888b(this, f64387d[0]);
        tM88888b.getClass();
        return (List) tM88888b;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    /* JADX INFO: renamed from: h */
    public KVariance getVariance() {
        int i = WhenMappings.f64391a[mo88647e().mo89492h().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i == 3) {
            return KVariance.OUT;
        }
        nbr.m162172a();
        return null;
    }

    public int hashCode() {
        return (m88875f().hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter and merged with bridge method [inline-methods] */
    public TypeParameterDescriptor mo88647e() {
        return this.descriptor;
    }

    /* JADX INFO: renamed from: j */
    public final KClassImpl<?> m88878j(ClassDescriptor classDescriptor) {
        Class<?> clsM88945q = UtilKt.m88945q(classDescriptor);
        KClassImpl<?> kClassImpl = (KClassImpl) (clsM88945q != null ? JvmClassMappingKt.m88344e(clsM88945q) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        awq.m100706a("Type parameter container is not resolved: ", classDescriptor.mo89190b());
        return null;
    }

    @NotNull
    public String toString() {
        return TypeParameterReference.INSTANCE.m88444a(this);
    }
}
