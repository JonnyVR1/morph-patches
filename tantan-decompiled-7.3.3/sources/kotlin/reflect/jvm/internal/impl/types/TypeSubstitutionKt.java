package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;
import p153l.mpq;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSubstitutionKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SimpleType m93651a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        SimpleType simpleType = unwrappedTypeMo93516J0 instanceof SimpleType ? (SimpleType) unwrappedTypeMo93516J0 : null;
        if (simpleType != null) {
            return simpleType;
        }
        mpq.m159379a("This is should be simple type: ", kotlinType);
        return null;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KotlinType m93652b(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        return m93655e(kotlinType, list, annotations, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KotlinType m93653c(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> list, @NotNull Annotations annotations, @NotNull List<? extends TypeProjection> list2) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        list2.getClass();
        if ((list.isEmpty() || list == kotlinType.mo92779E0()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes typeAttributesMo92780F0 = kotlinType.mo92780F0();
        if ((annotations instanceof FilteredAnnotations) && ((FilteredAnnotations) annotations).isEmpty()) {
            annotations = Annotations.Companion.m89532b();
        }
        TypeAttributes typeAttributesM93601a = TypeAttributesKt.m93601a(typeAttributesMo92780F0, annotations);
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo93516J0;
            return KotlinTypeFactory.m93520e(m93654d(flexibleType.m93488O0(), list, typeAttributesM93601a), m93654d(flexibleType.m93489P0(), list2, typeAttributesM93601a));
        }
        if (unwrappedTypeMo93516J0 instanceof SimpleType) {
            return m93654d((SimpleType) unwrappedTypeMo93516J0, list, typeAttributesM93601a);
        }
        nbr.m162172a();
        return null;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SimpleType m93654d(@NotNull SimpleType simpleType, @NotNull List<? extends TypeProjection> list, @NotNull TypeAttributes typeAttributes) {
        simpleType.getClass();
        list.getClass();
        typeAttributes.getClass();
        if (list.isEmpty() && typeAttributes == simpleType.mo92780F0()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.mo90785M0(typeAttributes);
        }
        return simpleType instanceof ErrorType ? ((ErrorType) simpleType).m93888S0(list) : KotlinTypeFactory.m93525k(typeAttributes, simpleType.mo92781G0(), list, simpleType.mo90857H0(), null, 16, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ KotlinType m93655e(KotlinType kotlinType, List list, Annotations annotations, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.mo92779E0();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m93653c(kotlinType, list, annotations, list2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ SimpleType m93656f(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.mo92779E0();
        }
        if ((i & 2) != 0) {
            typeAttributes = simpleType.mo92780F0();
        }
        return m93654d(simpleType, list, typeAttributes);
    }
}
