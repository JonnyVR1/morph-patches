package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;
import p149l.twq;
import p149l.uwq;
import p149l.vwq;
import p149l.wwq;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010(\u001a\u0004\u0018\u00010\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'R!\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010/R\u0014\u00103\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u00105R\u0014\u00107\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u00102R\u0014\u00109\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00102R\u0014\u0010;\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102¨\u0006=²\u0006\u0012\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050)8\nX\u008a\u0084\u0002"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/jvm/internal/AbstractKType;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "", "isAbbreviation", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;Z)V", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/reflect/KClassifier;", BaseSei.f13932Z, "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/KClassifier;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lkotlin/reflect/jvm/internal/AbstractKType;", "m", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "b", "Z", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "c", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", Constants.INAPP_DATA_TAG, RXScreenCaptureService.KEY_INDEX, "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "e", "j", "()Ljava/util/List;", "arguments", "()Ljava/lang/reflect/Type;", "javaType", "k", "()Z", "isMarkedNullable", "Lkotlin/reflect/KType;", "()Lkotlin/reflect/KType;", "abbreviation", "isDefinitelyNotNullType", "h", "isNothingType", "g", "isMutableCollectionType", "parameterizedTypeArguments", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KTypeImpl extends AbstractKType {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f63706f = {Reflection.m87514i(new PropertyReference1Impl(KTypeImpl.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), Reflection.m87514i(new PropertyReference1Impl(KTypeImpl.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KotlinType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isAbbreviation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final ReflectProperties.LazySoftVal<Type> computeJavaType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal classifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal arguments;

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63712a;

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
            f63712a = iArr;
        }
    }

    public KTypeImpl(@NotNull KotlinType kotlinType, @Nullable Function0<? extends Type> function0, boolean z) {
        kotlinType.getClass();
        this.type = kotlinType;
        this.isAbbreviation = z;
        ReflectProperties.LazySoftVal<Type> lazySoftValM87994c = null;
        ReflectProperties.LazySoftVal<Type> lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        if (lazySoftVal != null) {
            lazySoftValM87994c = lazySoftVal;
        } else if (function0 != null) {
            lazySoftValM87994c = ReflectProperties.m87994c(function0);
        }
        this.computeJavaType = lazySoftValM87994c;
        this.classifier = ReflectProperties.m87994c(new twq(this));
        this.arguments = ReflectProperties.m87994c(new uwq(this, function0));
    }

    /* JADX INFO: renamed from: u */
    public static final List m87973u(KTypeImpl kTypeImpl, Function0 function0) {
        KTypeProjection kTypeProjectionM87616d;
        List<TypeProjection> listMo91888E0 = kTypeImpl.type.mo91888E0();
        if (listMo91888E0.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Lazy lazyM87228a = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new vwq(kTypeImpl));
        List<TypeProjection> list = listMo91888E0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.mo92666b()) {
                kTypeProjectionM87616d = KTypeProjection.INSTANCE.m87615c();
            } else {
                KotlinType type = typeProjection.getType();
                type.getClass();
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new wwq(kTypeImpl, i, lazyM87228a));
                int i3 = WhenMappings.f63712a[typeProjection.mo92667c().ordinal()];
                if (i3 == 1) {
                    kTypeProjectionM87616d = KTypeProjection.INSTANCE.m87616d(kTypeImpl2);
                } else if (i3 == 2) {
                    kTypeProjectionM87616d = KTypeProjection.INSTANCE.m87613a(kTypeImpl2);
                } else {
                    if (i3 != 3) {
                        l9r.m149037a();
                        return null;
                    }
                    kTypeProjectionM87616d = KTypeProjection.INSTANCE.m87614b(kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjectionM87616d);
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public static final List m87974v(KTypeImpl kTypeImpl) {
        Type typeMo87503b = kTypeImpl.mo87503b();
        typeMo87503b.getClass();
        return ReflectClassUtilKt.m88994h(typeMo87503b);
    }

    /* JADX INFO: renamed from: w */
    public static final List<Type> m87975w(Lazy<? extends List<? extends Type>> lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: renamed from: x */
    public static final Type m87976x(KTypeImpl kTypeImpl, int i, Lazy<? extends List<? extends Type>> lazy) {
        Type typeMo87503b = kTypeImpl.mo87503b();
        if (typeMo87503b instanceof Class) {
            Class cls = (Class) typeMo87503b;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        if (typeMo87503b instanceof GenericArrayType) {
            if (i != 0) {
                zwq.m220685a("Array type has been queried for a non-0th argument: ", kTypeImpl);
                return null;
            }
            Type genericComponentType = ((GenericArrayType) typeMo87503b).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(typeMo87503b instanceof ParameterizedType)) {
            zwq.m220685a("Non-generic type has been queried for arguments: ", kTypeImpl);
            return null;
        }
        Type type = m87975w(lazy).get(i);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        lowerBounds.getClass();
        Type type2 = (Type) ArraysKt.firstOrNull(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            upperBounds.getClass();
            type2 = (Type) ArraysKt.first(upperBounds);
        }
        type2.getClass();
        return type2;
    }

    /* JADX INFO: renamed from: y */
    public static final KClassifier m87977y(KTypeImpl kTypeImpl) {
        return kTypeImpl.m87979z(kTypeImpl.type);
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final KotlinType getType() {
        return this.type;
    }

    @Override // kotlin.jvm.internal.KTypeBase
    @Nullable
    /* JADX INFO: renamed from: b */
    public Type mo87503b() {
        ReflectProperties.LazySoftVal<Type> lazySoftVal = this.computeJavaType;
        if (lazySoftVal != null) {
            return lazySoftVal.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractKType
    @Nullable
    /* JADX INFO: renamed from: d */
    public KType mo87648d() {
        SimpleType simpleTypeM92655b = SpecialTypesKt.m92655b(this.type);
        if (simpleTypeM92655b != null) {
            return new KTypeImpl(simpleTypeM92655b, this.computeJavaType, true);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractKType
    /* JADX INFO: renamed from: e */
    public boolean mo87649e() {
        return SpecialTypesKt.m92656c(this.type);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) other;
        return Intrinsics.m87488d(this.type, kTypeImpl.type) && Intrinsics.m87488d(mo87559i(), kTypeImpl.mo87559i()) && Intrinsics.m87488d(mo87560j(), kTypeImpl.mo87560j());
    }

    @Override // kotlin.reflect.jvm.internal.AbstractKType
    /* JADX INFO: renamed from: g */
    public boolean mo87650g() {
        ClassifierDescriptor classifierDescriptorMo88316e = this.type.mo91890G0().mo88316e();
        ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
        return classDescriptor != null && JavaToKotlinClassMapper.INSTANCE.m88366c(classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractKType
    /* JADX INFO: renamed from: h */
    public boolean mo87651h() {
        return KotlinBuiltIns.m88194p0(this.type);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        KClassifier kClassifierMo87559i = mo87559i();
        return ((iHashCode + (kClassifierMo87559i != null ? kClassifierMo87559i.hashCode() : 0)) * 31) + mo87560j().hashCode();
    }

    @Override // kotlin.reflect.KType
    @Nullable
    /* JADX INFO: renamed from: i */
    public KClassifier mo87559i() {
        return (KClassifier) this.classifier.m87997b(this, f63706f[0]);
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<KTypeProjection> mo87560j() {
        T tM87997b = this.arguments.m87997b(this, f63706f[1]);
        tM87997b.getClass();
        return (List) tM87997b;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: k */
    public boolean mo87561k() {
        return this.type.mo89966H0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.AbstractKType
    @Nullable
    /* JADX INFO: renamed from: l */
    public AbstractKType mo87652l() {
        UnwrappedType unwrappedTypeMo92625J0 = this.type.mo92625J0();
        Function0 function0 = null;
        Object[] objArr = 0;
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            return new KTypeImpl(((FlexibleType) unwrappedTypeMo92625J0).m92597O0(), function0, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.AbstractKType
    @Nullable
    /* JADX INFO: renamed from: m */
    public AbstractKType mo87653m() {
        UnwrappedType unwrappedTypeMo92625J0 = this.type.mo92625J0();
        Function0 function0 = null;
        Object[] objArr = 0;
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            return new KTypeImpl(((FlexibleType) unwrappedTypeMo92625J0).m92598P0(), function0, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.m88026y(this);
    }

    /* JADX INFO: renamed from: z */
    public final KClassifier m87979z(KotlinType type) {
        KotlinType type2;
        if (this.isAbbreviation) {
            ClassifierDescriptor classifierDescriptorMo88316e = type.mo91890G0().mo88316e();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo88316e instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo88316e : null;
            if (mockClassDescriptor != null) {
                return new KTypeAliasImpl(DescriptorUtilsKt.m91982o(mockClassDescriptor));
            }
        }
        ClassifierDescriptor classifierDescriptorMo88316e2 = type.mo91890G0().mo88316e();
        if (!(classifierDescriptorMo88316e2 instanceof ClassDescriptor)) {
            if (classifierDescriptorMo88316e2 instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorMo88316e2);
            }
            return null;
        }
        Class<?> clsM88054q = UtilKt.m88054q((ClassDescriptor) classifierDescriptorMo88316e2);
        if (clsM88054q == null) {
            return null;
        }
        if (!KotlinBuiltIns.m88181d0(type)) {
            if (TypeUtils.m92801l(type)) {
                return new KClassImpl(clsM88054q);
            }
            Class<?> clsM88995i = ReflectClassUtilKt.m88995i(clsM88054q);
            if (clsM88995i != null) {
                clsM88054q = clsM88995i;
            }
            return new KClassImpl(clsM88054q);
        }
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.singleOrNull((List) type.mo91888E0());
        if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
            return new KClassImpl(clsM88054q);
        }
        KClassifier kClassifierM87979z = m87979z(TypeUtilsKt.m93076B(type2));
        if (kClassifierM87979z != null) {
            return new KClassImpl(UtilKt.m88043f(JvmClassMappingKt.m87452b(KTypesJvm.m87639a(kClassifierM87979z))));
        }
        zwq.m220685a("Cannot determine classifier for array element type: ", this);
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KTypeImpl(@NotNull KotlinType kotlinType, @Nullable Function0<? extends Type> function0) {
        this(kotlinType, function0, false);
        kotlinType.getClass();
    }

    public /* synthetic */ KTypeImpl(KotlinType kotlinType, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i & 2) != 0 ? null : function0);
    }
}
