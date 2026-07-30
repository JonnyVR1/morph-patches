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
import p149l.c0r;
import p149l.d0r;
import p149l.hjd0;
import p149l.shf0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<KotlinTypeRefiner, SimpleType> f66234a = C15341a.INSTANCE;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$a */
    public static final class C15341a implements Function1 {
        public static final C15341a INSTANCE = new C15341a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$b */
    public static final class C15342b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final SimpleType f66235a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final TypeConstructor f66236b;

        public C15342b(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.f66235a = simpleType;
            this.f66236b = typeConstructor;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final SimpleType m92642a() {
            return this.f66235a;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final TypeConstructor m92643b() {
            return this.f66236b;
        }
    }

    private KotlinTypeFactory() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SimpleType m92628c(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAliasDescriptor.getClass();
        list.getClass();
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).m92682i(TypeAliasExpansion.Companion.m92693a(null, typeAliasDescriptor, list), TypeAttributes.Companion.m92709k());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final UnwrappedType m92629e(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return Intrinsics.m87488d(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final SimpleType m92630f(@NotNull TypeAttributes typeAttributes, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        typeAttributes.getClass();
        integerLiteralTypeConstructor.getClass();
        return m92636m(typeAttributes, integerLiteralTypeConstructor, CollectionsKt.emptyList(), z, ErrorUtils.m93000a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final SimpleType m92631h(@NotNull TypeAttributes typeAttributes, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAttributes.getClass();
        classDescriptor.getClass();
        list.getClass();
        TypeConstructor typeConstructorMo88305l = classDescriptor.mo88305l();
        typeConstructorMo88305l.getClass();
        return m92634k(typeAttributes, typeConstructorMo88305l, list, false, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final SimpleType m92632i(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return m92634k(typeAttributes, typeConstructor, list, z, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final SimpleType m92633j(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        if (!typeAttributes.isEmpty() || !list.isEmpty() || z || typeConstructor.mo88316e() == null) {
            return m92637n(typeAttributes, typeConstructor, list, z, INSTANCE.m92639d(typeConstructor, list, kotlinTypeRefiner), new c0r(typeConstructor, list, typeAttributes, z));
        }
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        classifierDescriptorMo88316e.getClass();
        SimpleType simpleTypeMo88458o = classifierDescriptorMo88316e.mo88458o();
        simpleTypeMo88458o.getClass();
        return simpleTypeMo88458o;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ SimpleType m92634k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return m92633j(typeAttributes, typeConstructor, list, z, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: l */
    public static final SimpleType m92635l(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        C15342b c15342bM92640g = INSTANCE.m92640g(typeConstructor, kotlinTypeRefiner, list);
        if (c15342bM92640g == null) {
            return null;
        }
        SimpleType simpleTypeM92642a = c15342bM92640g.m92642a();
        if (simpleTypeM92642a != null) {
            return simpleTypeM92642a;
        }
        TypeConstructor typeConstructorM92643b = c15342bM92640g.m92643b();
        typeConstructorM92643b.getClass();
        return m92633j(typeAttributes, typeConstructorM92643b, list, z, kotlinTypeRefiner);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final SimpleType m92636m(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        C15346a c15346a = new C15346a(typeConstructor, list, z, memberScope, new d0r(typeConstructor, list, typeAttributes, z, memberScope));
        return typeAttributes.isEmpty() ? c15346a : new shf0(c15346a, typeAttributes);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final SimpleType m92637n(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        C15346a c15346a = new C15346a(typeConstructor, list, z, memberScope, function1);
        return typeAttributes.isEmpty() ? c15346a : new shf0(c15346a, typeAttributes);
    }

    /* JADX INFO: renamed from: o */
    public static final SimpleType m92638o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z, MemberScope memberScope, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        C15342b c15342bM92640g = INSTANCE.m92640g(typeConstructor, kotlinTypeRefiner, list);
        if (c15342bM92640g == null) {
            return null;
        }
        SimpleType simpleTypeM92642a = c15342bM92640g.m92642a();
        if (simpleTypeM92642a != null) {
            return simpleTypeM92642a;
        }
        TypeConstructor typeConstructorM92643b = c15342bM92640g.m92643b();
        typeConstructorM92643b.getClass();
        return m92636m(typeAttributes, typeConstructorM92643b, list, z, memberScope);
    }

    /* JADX INFO: renamed from: d */
    public final MemberScope m92639d(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo88316e).mo88458o().mo89900n();
        }
        if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.m91985r(DescriptorUtilsKt.m91986s(classifierDescriptorMo88316e));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.m88811b((ClassDescriptor) classifierDescriptorMo88316e, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.m88810a((ClassDescriptor) classifierDescriptorMo88316e, TypeConstructorSubstitution.Companion.m92739b(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo88316e instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((TypeAliasDescriptor) classifierDescriptorMo88316e).getName().toString();
            string.getClass();
            return ErrorUtils.m93000a(errorScopeKind, true, string);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).m92618k();
        }
        hjd0.m131368a("Unsupported classifier: ", classifierDescriptorMo88316e, " for constructor: ", typeConstructor);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C15342b m92640g(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorMo92911f;
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        if (classifierDescriptorMo88316e == null || (classifierDescriptorMo92911f = kotlinTypeRefiner.mo92911f(classifierDescriptorMo88316e)) == null) {
            return null;
        }
        if (classifierDescriptorMo92911f instanceof TypeAliasDescriptor) {
            return new C15342b(m92628c((TypeAliasDescriptor) classifierDescriptorMo92911f, list), null);
        }
        TypeConstructor typeConstructorMo88677a = classifierDescriptorMo92911f.mo88305l().mo88677a(kotlinTypeRefiner);
        typeConstructorMo88677a.getClass();
        return new C15342b(null, typeConstructorMo88677a);
    }
}
