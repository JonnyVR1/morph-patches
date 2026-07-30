package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;
import p149l.nnq;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSubstitutionKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SimpleType m92760a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        SimpleType simpleType = unwrappedTypeMo92625J0 instanceof SimpleType ? (SimpleType) unwrappedTypeMo92625J0 : null;
        if (simpleType != null) {
            return simpleType;
        }
        nnq.m160357a("This is should be simple type: ", kotlinType);
        return null;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KotlinType m92761b(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        return m92764e(kotlinType, list, annotations, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KotlinType m92762c(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations, @NotNull List<? extends TypeProjection> list2) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        list2.getClass();
        if ((list.isEmpty() || list == kotlinType.mo91888E0()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes typeAttributesMo91889F0 = kotlinType.mo91889F0();
        if ((annotations instanceof FilteredAnnotations) && ((FilteredAnnotations) annotations).isEmpty()) {
            annotations = Annotations.Companion.m88641b();
        }
        TypeAttributes typeAttributesM92710a = TypeAttributesKt.m92710a(typeAttributesMo91889F0, annotations);
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo92625J0;
            return KotlinTypeFactory.m92629e(m92763d(flexibleType.m92597O0(), list, typeAttributesM92710a), m92763d(flexibleType.m92598P0(), list2, typeAttributesM92710a));
        }
        if (unwrappedTypeMo92625J0 instanceof SimpleType) {
            return m92763d((SimpleType) unwrappedTypeMo92625J0, list, typeAttributesM92710a);
        }
        l9r.m149037a();
        return null;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SimpleType m92763d(@NotNull SimpleType simpleType, @NotNull List<? extends TypeProjection> list, @NotNull TypeAttributes typeAttributes) {
        simpleType.getClass();
        list.getClass();
        typeAttributes.getClass();
        if (list.isEmpty() && typeAttributes == simpleType.mo91889F0()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.mo89894M0(typeAttributes);
        }
        return simpleType instanceof ErrorType ? ((ErrorType) simpleType).m92997S0(list) : KotlinTypeFactory.m92634k(typeAttributes, simpleType.mo91890G0(), list, simpleType.mo89966H0(), null, 16, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ KotlinType m92764e(KotlinType kotlinType, List list, Annotations annotations, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.mo91888E0();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m92762c(kotlinType, list, annotations, list2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ SimpleType m92765f(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.mo91888E0();
        }
        if ((i & 2) != 0) {
            typeAttributes = simpleType.mo91889F0();
        }
        return m92763d(simpleType, list, typeAttributes);
    }
}
