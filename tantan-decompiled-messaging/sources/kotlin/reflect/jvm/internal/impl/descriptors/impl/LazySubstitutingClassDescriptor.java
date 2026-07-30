package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {

    /* JADX INFO: renamed from: a */
    public final ModuleAwareClassDescriptor f64213a;

    /* JADX INFO: renamed from: b */
    public final TypeSubstitutor f64214b;

    /* JADX INFO: renamed from: c */
    public TypeSubstitutor f64215c;

    /* JADX INFO: renamed from: d */
    public List<TypeParameterDescriptor> f64216d;

    /* JADX INFO: renamed from: e */
    public List<TypeParameterDescriptor> f64217e;

    /* JADX INFO: renamed from: f */
    public TypeConstructor f64218f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$a */
    public class C15208a implements Function1<TypeParameterDescriptor, Boolean> {
        public C15208a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
            return Boolean.valueOf(!typeParameterDescriptor.mo88599A());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$b */
    public class C15209b implements Function1<SimpleType, SimpleType> {
        public C15209b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke(SimpleType simpleType) {
            return LazySubstitutingClassDescriptor.this.m88805F0(simpleType);
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f64213a = moduleAwareClassDescriptor;
        this.f64214b = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m88802m0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: C */
    public MemberScope mo88454C() {
        MemberScope memberScopeMo88454C = this.f64213a.mo88454C();
        if (memberScopeMo88454C == null) {
            m88802m0(28);
        }
        return memberScopeMo88454C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        return this.f64213a.mo88290C0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: D */
    public MemberScope mo88455D() {
        MemberScope memberScopeMo88306l0 = mo88306l0(DescriptorUtilsKt.m91985r(DescriptorUtils.m91766g(this.f64213a)));
        if (memberScopeMo88306l0 == null) {
            m88802m0(12);
        }
        return memberScopeMo88306l0;
    }

    /* JADX INFO: renamed from: D0 */
    public final TypeSubstitutor m88803D0() {
        if (this.f64215c == null) {
            if (this.f64214b.m92779l()) {
                this.f64215c = this.f64214b;
            } else {
                List<TypeParameterDescriptor> parameters = this.f64213a.mo88305l().getParameters();
                this.f64216d = new ArrayList(parameters.size());
                this.f64215c = DescriptorSubstitutor.m92582b(parameters, this.f64214b.m92778k(), this, this.f64216d);
                this.f64217e = CollectionsKt.filter(this.f64216d, new C15208a());
            }
        }
        return this.f64215c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88802m0(23);
        }
        return typeSubstitutor.m92779l() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.m92774i(typeSubstitutor.m92778k(), m88803D0().m92778k()));
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final SimpleType m88805F0(@Nullable SimpleType simpleType) {
        return (simpleType == null || this.f64214b.m92779l()) ? simpleType : (SimpleType) m88803D0().m92782q(simpleType, Variance.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P */
    public MemberScope mo88656P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            m88802m0(5);
        }
        if (kotlinTypeRefiner == null) {
            m88802m0(6);
        }
        MemberScope memberScopeMo88656P = this.f64213a.mo88656P(typeSubstitution, kotlinTypeRefiner);
        if (!this.f64214b.m92779l()) {
            return new SubstitutingScope(memberScopeMo88656P, m88803D0());
        }
        if (memberScopeMo88656P == null) {
            m88802m0(7);
        }
        return memberScopeMo88656P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: R */
    public ReceiverParameterDescriptor mo88456R() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo88465a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo88445a() {
        ClassDescriptor classDescriptorMo88445a = this.f64213a.mo88445a();
        if (classDescriptorMo88445a == null) {
            m88802m0(21);
        }
        return classDescriptorMo88445a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo88299b() {
        DeclarationDescriptor declarationDescriptorMo88299b = this.f64213a.mo88299b();
        if (declarationDescriptorMo88299b == null) {
            m88802m0(22);
        }
        return declarationDescriptorMo88299b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo88300c0() {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo88300c0 = this.f64213a.mo88300c0();
        if (valueClassRepresentationMo88300c0 == null) {
            return null;
        }
        return valueClassRepresentationMo88300c0.m88613b(new C15209b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return this.f64213a.mo88301e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo88457f0() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88802m0(17);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f64213a.getAnnotations();
        if (annotations == null) {
            m88802m0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.f64213a.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.mo88514k().mo88524i(classConstructorDescriptor.mo88445a()).mo88532q(classConstructorDescriptor.mo88303i()).mo88531p(classConstructorDescriptor.getVisibility()).mo88534s(classConstructorDescriptor.getKind()).mo88525j(false).build()).mo88453c(m88803D0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind kind = this.f64213a.getKind();
        if (kind == null) {
            m88802m0(25);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f64213a.getName();
        if (name == null) {
            m88802m0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64063a;
        if (sourceElement == null) {
            m88802m0(29);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f64213a.getVisibility();
        if (visibility == null) {
            m88802m0(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo88302h0() {
        return this.f64213a.mo88302h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        Modality modalityMo88303i = this.f64213a.mo88303i();
        if (modalityMo88303i == null) {
            m88802m0(26);
        }
        return modalityMo88303i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f64213a.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f64213a.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo88304j0() {
        return this.f64213a.mo88304j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        TypeConstructor typeConstructorMo88305l = this.f64213a.mo88305l();
        if (this.f64214b.m92779l()) {
            if (typeConstructorMo88305l == null) {
                m88802m0(0);
            }
            return typeConstructorMo88305l;
        }
        if (this.f64218f == null) {
            TypeSubstitutor typeSubstitutorM88803D0 = m88803D0();
            Collection<KotlinType> collectionMo88678c = typeConstructorMo88305l.mo88678c();
            ArrayList arrayList = new ArrayList(collectionMo88678c.size());
            Iterator<KotlinType> it = collectionMo88678c.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorM88803D0.m92782q(it.next(), Variance.INVARIANT));
            }
            this.f64218f = new ClassTypeConstructorImpl(this, this.f64216d, arrayList, LockBasedStorageManager.f66165e);
        }
        TypeConstructor typeConstructor = this.f64218f;
        if (typeConstructor == null) {
            m88802m0(1);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m88802m0(13);
        }
        MemberScope memberScopeMo88306l0 = this.f64213a.mo88306l0(kotlinTypeRefiner);
        if (!this.f64214b.m92779l()) {
            return new SubstitutingScope(memberScopeMo88306l0, m88803D0());
        }
        if (memberScopeMo88306l0 == null) {
            m88802m0(14);
        }
        return memberScopeMo88306l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return this.f64213a.mo88307n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo88458o() {
        SimpleType simpleTypeM92636m = KotlinTypeFactory.m92636m(DefaultTypeAttributeTranslator.INSTANCE.mo92571a(getAnnotations(), null, null), mo88305l(), TypeUtils.m92796g(mo88305l().getParameters()), false, mo88455D());
        if (simpleTypeM92636m == null) {
            m88802m0(16);
        }
        return simpleTypeM92636m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public MemberScope mo88308o0() {
        MemberScope memberScopeMo88308o0 = this.f64213a.mo88308o0();
        if (memberScopeMo88308o0 == null) {
            m88802m0(15);
        }
        return memberScopeMo88308o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        m88803D0();
        List<TypeParameterDescriptor> list = this.f64217e;
        if (list == null) {
            m88802m0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo88310p0() {
        return this.f64213a.mo88310p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo88311q() {
        return this.f64213a.mo88311q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public MemberScope mo88459s0(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m88802m0(10);
        }
        MemberScope memberScopeMo88656P = mo88656P(typeSubstitution, DescriptorUtilsKt.m91985r(DescriptorUtils.m91766g(this)));
        if (memberScopeMo88656P == null) {
            m88802m0(11);
        }
        return memberScopeMo88656P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        return this.f64213a.mo88312t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return this.f64213a.mo88313v();
    }
}
