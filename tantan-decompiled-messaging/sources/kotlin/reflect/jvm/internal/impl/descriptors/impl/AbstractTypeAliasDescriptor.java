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
import p149l.C18414m8;
import p149l.C18631n8;
import p149l.C18868o8;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f64099j = {Reflection.m87514i(new PropertyReference1Impl(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final StorageManager f64100e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final DescriptorVisibility f64101f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64102g;

    /* JADX INFO: renamed from: h */
    public List<? extends TypeParameterDescriptor> f64103h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AbstractTypeAliasDescriptor$typeConstructor$1 f64104i;

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
        this.f64100e = storageManager;
        this.f64101f = descriptorVisibility;
        this.f64102g = storageManager.mo92446e(new C18414m8(this));
        this.f64104i = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: a */
            public TypeConstructor mo88677a(KotlinTypeRefiner kotlinTypeRefiner) {
                kotlinTypeRefiner.getClass();
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: c */
            public Collection<KotlinType> mo88678c() {
                Collection<KotlinType> collectionMo88678c = mo88316e().mo88598v0().mo91890G0().mo88678c();
                collectionMo88678c.getClass();
                return collectionMo88678c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: f */
            public KotlinBuiltIns mo88679f() {
                return DescriptorUtilsKt.m91980m(mo88316e());
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: g */
            public boolean mo88317g() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.f64105a.mo88673K0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public TypeAliasDescriptor mo88316e() {
                return this.f64105a;
            }

            public String toString() {
                return "[typealias " + mo88316e().getName().m91082b() + ']';
            }
        };
    }

    /* JADX INFO: renamed from: G0 */
    public static final SimpleType m88667G0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo92911f = kotlinTypeRefiner.mo92911f(abstractTypeAliasDescriptor);
        if (classifierDescriptorMo92911f != null) {
            return classifierDescriptorMo92911f.mo88458o();
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Collection m88668H0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        return abstractTypeAliasDescriptor.m88672J0();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX INFO: renamed from: M0 */
    public static final Boolean m88669M0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, UnwrappedType unwrappedType) {
        boolean z;
        unwrappedType.getClass();
        if (KotlinTypeKt.m92644a(unwrappedType)) {
            z = false;
        } else {
            ClassifierDescriptor classifierDescriptorMo88316e = unwrappedType.mo91890G0().mo88316e();
            if (!(classifierDescriptorMo88316e instanceof TypeParameterDescriptor) || Intrinsics.m87488d(((TypeParameterDescriptor) classifierDescriptorMo88316e).mo88299b(), abstractTypeAliasDescriptor)) {
                z = false;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public final SimpleType m88670F0() {
        MemberScope memberScopeMo88455D;
        ClassDescriptor classDescriptorMo88597j = mo88597j();
        if (classDescriptorMo88597j == null || (memberScopeMo88455D = classDescriptorMo88597j.mo88455D()) == null) {
            memberScopeMo88455D = MemberScope.Empty.INSTANCE;
        }
        SimpleType simpleTypeM92810u = TypeUtils.m92810u(this, memberScopeMo88455D, new C18868o8(this));
        simpleTypeM92810u.getClass();
        return simpleTypeM92810u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo88445a() {
        DeclarationDescriptorWithSource declarationDescriptorWithSourceMo88445a = super.mo88445a();
        declarationDescriptorWithSourceMo88445a.getClass();
        return (TypeAliasDescriptor) declarationDescriptorWithSourceMo88445a;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final Collection<TypeAliasConstructorDescriptor> m88672J0() {
        ClassDescriptor classDescriptorMo88597j = mo88597j();
        if (classDescriptorMo88597j == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptorMo88597j.getConstructors();
        constructors.getClass();
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = this.f64100e;
            classConstructorDescriptor.getClass();
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorM88914b = companion.m88914b(storageManager, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorM88914b != null) {
                arrayList.add(typeAliasConstructorDescriptorM88914b);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public abstract List<TypeParameterDescriptor> mo88673K0();

    /* JADX INFO: renamed from: L0 */
    public final void m88674L0(@NotNull List<? extends TypeParameterDescriptor> list) {
        list.getClass();
        this.f64103h = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo88471i(this, d);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final StorageManager m88675Z() {
        return this.f64100e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f64101f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        return this.f64104i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        List list = this.f64103h;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        return TypeUtils.m92792c(mo88598v0(), new C18631n8(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "typealias " + getName().m91082b();
    }
}
