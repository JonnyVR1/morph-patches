package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bqf0;
import p153l.d2r;
import p153l.e2r;
import p153l.krd0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<KotlinTypeRefiner, SimpleType> f66908a = C15448a.INSTANCE;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$a */
    public static final class C15448a implements Function1 {
        public static final C15448a INSTANCE = new C15448a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$b */
    public static final class C15449b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final SimpleType f66909a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final TypeConstructor f66910b;

        public C15449b(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.f66909a = simpleType;
            this.f66910b = typeConstructor;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final SimpleType m93533a() {
            return this.f66909a;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final TypeConstructor m93534b() {
            return this.f66910b;
        }
    }

    private KotlinTypeFactory() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SimpleType m93519c(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAliasDescriptor.getClass();
        list.getClass();
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).m93573i(TypeAliasExpansion.Companion.m93584a(null, typeAliasDescriptor, list), TypeAttributes.Companion.m93600k());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final UnwrappedType m93520e(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return Intrinsics.m88377d(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final SimpleType m93521f(@NotNull TypeAttributes typeAttributes, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        typeAttributes.getClass();
        integerLiteralTypeConstructor.getClass();
        return m93527m(typeAttributes, integerLiteralTypeConstructor, CollectionsKt.emptyList(), z, ErrorUtils.m93891a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final SimpleType m93522h(@NotNull TypeAttributes typeAttributes, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAttributes.getClass();
        classDescriptor.getClass();
        list.getClass();
        TypeConstructor typeConstructorMo89196l = classDescriptor.mo89196l();
        typeConstructorMo89196l.getClass();
        return m93525k(typeAttributes, typeConstructorMo89196l, list, false, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final SimpleType m93523i(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return m93525k(typeAttributes, typeConstructor, list, z, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final SimpleType m93524j(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        if (!typeAttributes.isEmpty() || !list.isEmpty() || z || typeConstructor.mo89207e() == null) {
            return m93528n(typeAttributes, typeConstructor, list, z, INSTANCE.m93530d(typeConstructor, list, kotlinTypeRefiner), new d2r(typeConstructor, list, typeAttributes, z));
        }
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        classifierDescriptorMo89207e.getClass();
        SimpleType simpleTypeMo89349o = classifierDescriptorMo89207e.mo89349o();
        simpleTypeMo89349o.getClass();
        return simpleTypeMo89349o;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ SimpleType m93525k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return m93524j(typeAttributes, typeConstructor, list, z, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: l */
    public static final SimpleType m93526l(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        C15449b c15449bM93531g = INSTANCE.m93531g(typeConstructor, kotlinTypeRefiner, list);
        if (c15449bM93531g == null) {
            return null;
        }
        SimpleType simpleTypeM93533a = c15449bM93531g.m93533a();
        if (simpleTypeM93533a != null) {
            return simpleTypeM93533a;
        }
        TypeConstructor typeConstructorM93534b = c15449bM93531g.m93534b();
        typeConstructorM93534b.getClass();
        return m93524j(typeAttributes, typeConstructorM93534b, list, z, kotlinTypeRefiner);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final SimpleType m93527m(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        C15453a c15453a = new C15453a(typeConstructor, list, z, memberScope, new e2r(typeConstructor, list, typeAttributes, z, memberScope));
        return typeAttributes.isEmpty() ? c15453a : new bqf0(c15453a, typeAttributes);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final SimpleType m93528n(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        C15453a c15453a = new C15453a(typeConstructor, list, z, memberScope, function1);
        return typeAttributes.isEmpty() ? c15453a : new bqf0(c15453a, typeAttributes);
    }

    /* JADX INFO: renamed from: o */
    public static final SimpleType m93529o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, MemberScope memberScope, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        C15449b c15449bM93531g = INSTANCE.m93531g(typeConstructor, kotlinTypeRefiner, list);
        if (c15449bM93531g == null) {
            return null;
        }
        SimpleType simpleTypeM93533a = c15449bM93531g.m93533a();
        if (simpleTypeM93533a != null) {
            return simpleTypeM93533a;
        }
        TypeConstructor typeConstructorM93534b = c15449bM93531g.m93534b();
        typeConstructorM93534b.getClass();
        return m93527m(typeAttributes, typeConstructorM93534b, list, z, memberScope);
    }

    /* JADX INFO: renamed from: d */
    public final MemberScope m93530d(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo89207e).mo89349o().mo90791n();
        }
        if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.m92876r(DescriptorUtilsKt.m92877s(classifierDescriptorMo89207e));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.m89702b((ClassDescriptor) classifierDescriptorMo89207e, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.m89701a((ClassDescriptor) classifierDescriptorMo89207e, TypeConstructorSubstitution.Companion.m93630b(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo89207e instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((TypeAliasDescriptor) classifierDescriptorMo89207e).getName().toString();
            string.getClass();
            return ErrorUtils.m93891a(errorScopeKind, true, string);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).m93509k();
        }
        krd0.m151025a("Unsupported classifier: ", classifierDescriptorMo89207e, " for constructor: ", typeConstructor);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C15449b m93531g(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorMo93802f;
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        if (classifierDescriptorMo89207e == null || (classifierDescriptorMo93802f = kotlinTypeRefiner.mo93802f(classifierDescriptorMo89207e)) == null) {
            return null;
        }
        if (classifierDescriptorMo93802f instanceof TypeAliasDescriptor) {
            return new C15449b(m93519c((TypeAliasDescriptor) classifierDescriptorMo93802f, list), null);
        }
        TypeConstructor typeConstructorMo89568a = classifierDescriptorMo93802f.mo89196l().mo89568a(kotlinTypeRefiner);
        typeConstructorMo89568a.getClass();
        return new C15449b(null, typeConstructorMo89568a);
    }
}
