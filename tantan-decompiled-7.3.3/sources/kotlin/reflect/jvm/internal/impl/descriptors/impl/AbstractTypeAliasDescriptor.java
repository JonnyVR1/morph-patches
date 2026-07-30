package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p153l.C17416h8;
import p153l.C17664i8;
import p153l.C17893j8;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f64773j = {Reflection.m88403i(new PropertyReference1Impl(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final StorageManager f64774e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final DescriptorVisibility f64775f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64776g;

    /* JADX INFO: renamed from: h */
    public List<? extends TypeParameterDescriptor> f64777h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AbstractTypeAliasDescriptor$typeConstructor$1 f64778i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull DescriptorVisibility descriptorVisibility) {
        super(declarationDescriptor, annotations, name, sourceElement);
        storageManager.getClass();
        declarationDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        sourceElement.getClass();
        descriptorVisibility.getClass();
        this.f64774e = storageManager;
        this.f64775f = descriptorVisibility;
        this.f64776g = storageManager.mo93337e(new C17416h8(this));
        this.f64778i = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: a */
            public TypeConstructor mo89568a(KotlinTypeRefiner kotlinTypeRefiner) {
                kotlinTypeRefiner.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: c */
            public Collection<KotlinType> mo89569c() {
                Collection<KotlinType> collectionMo89569c = mo89207e().mo89489v0().mo92781G0().mo89569c();
                collectionMo89569c.getClass();
                return collectionMo89569c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: f */
            public KotlinBuiltIns mo89570f() {
                return DescriptorUtilsKt.m92871m(mo89207e());
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: g */
            public boolean mo89208g() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.f64779a.mo89564K0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public TypeAliasDescriptor mo89207e() {
                return this.f64779a;
            }

            public String toString() {
                return "[typealias " + mo89207e().getName().m91973b() + ']';
            }
        };
    }

    /* JADX INFO: renamed from: G0 */
    public static final SimpleType m89558G0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo93802f = kotlinTypeRefiner.mo93802f(abstractTypeAliasDescriptor);
        if (classifierDescriptorMo93802f != null) {
            return classifierDescriptorMo93802f.mo89349o();
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Collection m89559H0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        return abstractTypeAliasDescriptor.m89563J0();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX INFO: renamed from: M0 */
    public static final Boolean m89560M0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, UnwrappedType unwrappedType) {
        boolean z;
        unwrappedType.getClass();
        if (KotlinTypeKt.m93535a(unwrappedType)) {
            z = false;
        } else {
            ClassifierDescriptor classifierDescriptorMo89207e = unwrappedType.mo92781G0().mo89207e();
            if (!(classifierDescriptorMo89207e instanceof TypeParameterDescriptor) || Intrinsics.m88377d(((TypeParameterDescriptor) classifierDescriptorMo89207e).mo89190b(), abstractTypeAliasDescriptor)) {
                z = false;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public final SimpleType m89561F0() {
        MemberScope memberScopeMo89346D;
        ClassDescriptor classDescriptorMo89488j = mo89488j();
        if (classDescriptorMo89488j == null || (memberScopeMo89346D = classDescriptorMo89488j.mo89346D()) == null) {
            memberScopeMo89346D = MemberScope.Empty.INSTANCE;
        }
        SimpleType simpleTypeM93701u = TypeUtils.m93701u(this, memberScopeMo89346D, new C17893j8(this));
        simpleTypeM93701u.getClass();
        return simpleTypeM93701u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo89336a() {
        DeclarationDescriptorWithSource declarationDescriptorWithSourceMo89336a = super.mo89336a();
        declarationDescriptorWithSourceMo89336a.getClass();
        return (TypeAliasDescriptor) declarationDescriptorWithSourceMo89336a;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final Collection<TypeAliasConstructorDescriptor> m89563J0() {
        ClassDescriptor classDescriptorMo89488j = mo89488j();
        if (classDescriptorMo89488j == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptorMo89488j.getConstructors();
        constructors.getClass();
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = this.f64774e;
            classConstructorDescriptor.getClass();
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorM89805b = companion.m89805b(storageManager, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorM89805b != null) {
                arrayList.add(typeAliasConstructorDescriptorM89805b);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public abstract List<TypeParameterDescriptor> mo89564K0();

    /* JADX INFO: renamed from: L0 */
    public final void m89565L0(@NotNull List<? extends TypeParameterDescriptor> list) {
        list.getClass();
        this.f64777h = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo89362i(this, d);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final StorageManager m89566Z() {
        return this.f64774e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f64775f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        return this.f64778i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo89200p() {
        List list = this.f64777h;
        if (list != null) {
            return list;
        }
        Intrinsics.m88391r("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo89203t() {
        return TypeUtils.m93683c(mo89489v0(), new C17664i8(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "typealias " + getName().m91973b();
    }
}
