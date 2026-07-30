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
    public final ModuleAwareClassDescriptor f64887a;

    /* JADX INFO: renamed from: b */
    public final TypeSubstitutor f64888b;

    /* JADX INFO: renamed from: c */
    public TypeSubstitutor f64889c;

    /* JADX INFO: renamed from: d */
    public List<TypeParameterDescriptor> f64890d;

    /* JADX INFO: renamed from: e */
    public List<TypeParameterDescriptor> f64891e;

    /* JADX INFO: renamed from: f */
    public TypeConstructor f64892f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$a */
    public class C15315a implements Function1<TypeParameterDescriptor, Boolean> {
        public C15315a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
            return Boolean.valueOf(!typeParameterDescriptor.mo89490A());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$b */
    public class C15316b implements Function1<SimpleType, SimpleType> {
        public C15316b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke(SimpleType simpleType) {
            return LazySubstitutingClassDescriptor.this.m89696F0(simpleType);
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f64887a = moduleAwareClassDescriptor;
        this.f64888b = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m89693m0(int i) {
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
    public MemberScope mo89345C() {
        MemberScope memberScopeMo89345C = this.f64887a.mo89345C();
        if (memberScopeMo89345C == null) {
            m89693m0(28);
        }
        return memberScopeMo89345C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo89181C0() {
        return this.f64887a.mo89181C0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: D */
    public MemberScope mo89346D() {
        MemberScope memberScopeMo89197l0 = mo89197l0(DescriptorUtilsKt.m92876r(DescriptorUtils.m92657g(this.f64887a)));
        if (memberScopeMo89197l0 == null) {
            m89693m0(12);
        }
        return memberScopeMo89197l0;
    }

    /* JADX INFO: renamed from: D0 */
    public final TypeSubstitutor m89694D0() {
        if (this.f64889c == null) {
            if (this.f64888b.m93670l()) {
                this.f64889c = this.f64888b;
            } else {
                List<TypeParameterDescriptor> parameters = this.f64887a.mo89196l().getParameters();
                this.f64890d = new ArrayList(parameters.size());
                this.f64889c = DescriptorSubstitutor.m93473b(parameters, this.f64888b.m93669k(), this, this.f64890d);
                this.f64891e = CollectionsKt.filter(this.f64890d, new C15315a());
            }
        }
        return this.f64889c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m89693m0(23);
        }
        return typeSubstitutor.m93670l() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.m93665i(typeSubstitutor.m93669k(), m89694D0().m93669k()));
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final SimpleType m89696F0(@Nullable SimpleType simpleType) {
        return (simpleType == null || this.f64888b.m93670l()) ? simpleType : (SimpleType) m89694D0().m93673q(simpleType, Variance.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P */
    public MemberScope mo89547P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            m89693m0(5);
        }
        if (kotlinTypeRefiner == null) {
            m89693m0(6);
        }
        MemberScope memberScopeMo89547P = this.f64887a.mo89547P(typeSubstitution, kotlinTypeRefiner);
        if (!this.f64888b.m93670l()) {
            return new SubstitutingScope(memberScopeMo89547P, m89694D0());
        }
        if (memberScopeMo89547P == null) {
            m89693m0(7);
        }
        return memberScopeMo89547P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: R */
    public ReceiverParameterDescriptor mo89347R() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo89356a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo89336a() {
        ClassDescriptor classDescriptorMo89336a = this.f64887a.mo89336a();
        if (classDescriptorMo89336a == null) {
            m89693m0(21);
        }
        return classDescriptorMo89336a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptorMo89190b = this.f64887a.mo89190b();
        if (declarationDescriptorMo89190b == null) {
            m89693m0(22);
        }
        return declarationDescriptorMo89190b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo89191c0() {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo89191c0 = this.f64887a.mo89191c0();
        if (valueClassRepresentationMo89191c0 == null) {
            return null;
        }
        return valueClassRepresentationMo89191c0.m89504b(new C15316b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return this.f64887a.mo89192e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo89348f0() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m89693m0(17);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f64887a.getAnnotations();
        if (annotations == null) {
            m89693m0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.f64887a.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.mo89405k().mo89415i(classConstructorDescriptor.mo89336a()).mo89423q(classConstructorDescriptor.mo89194i()).mo89422p(classConstructorDescriptor.getVisibility()).mo89425s(classConstructorDescriptor.getKind()).mo89416j(false).build()).mo89344c(m89694D0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind kind = this.f64887a.getKind();
        if (kind == null) {
            m89693m0(25);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f64887a.getName();
        if (name == null) {
            m89693m0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64737a;
        if (sourceElement == null) {
            m89693m0(29);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f64887a.getVisibility();
        if (visibility == null) {
            m89693m0(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo89193h0() {
        return this.f64887a.mo89193h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        Modality modalityMo89194i = this.f64887a.mo89194i();
        if (modalityMo89194i == null) {
            m89693m0(26);
        }
        return modalityMo89194i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f64887a.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f64887a.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo89195j0() {
        return this.f64887a.mo89195j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        TypeConstructor typeConstructorMo89196l = this.f64887a.mo89196l();
        if (this.f64888b.m93670l()) {
            if (typeConstructorMo89196l == null) {
                m89693m0(0);
            }
            return typeConstructorMo89196l;
        }
        if (this.f64892f == null) {
            TypeSubstitutor typeSubstitutorM89694D0 = m89694D0();
            Collection<KotlinType> collectionMo89569c = typeConstructorMo89196l.mo89569c();
            ArrayList arrayList = new ArrayList(collectionMo89569c.size());
            Iterator<KotlinType> it = collectionMo89569c.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorM89694D0.m93673q(it.next(), Variance.INVARIANT));
            }
            this.f64892f = new ClassTypeConstructorImpl(this, this.f64890d, arrayList, LockBasedStorageManager.f66839e);
        }
        TypeConstructor typeConstructor = this.f64892f;
        if (typeConstructor == null) {
            m89693m0(1);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m89693m0(13);
        }
        MemberScope memberScopeMo89197l0 = this.f64887a.mo89197l0(kotlinTypeRefiner);
        if (!this.f64888b.m93670l()) {
            return new SubstitutingScope(memberScopeMo89197l0, m89694D0());
        }
        if (memberScopeMo89197l0 == null) {
            m89693m0(14);
        }
        return memberScopeMo89197l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return this.f64887a.mo89198n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo89349o() {
        SimpleType simpleTypeM93527m = KotlinTypeFactory.m93527m(DefaultTypeAttributeTranslator.INSTANCE.mo93462a(getAnnotations(), null, null), mo89196l(), TypeUtils.m93687g(mo89196l().getParameters()), false, mo89346D());
        if (simpleTypeM93527m == null) {
            m89693m0(16);
        }
        return simpleTypeM93527m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public MemberScope mo89199o0() {
        MemberScope memberScopeMo89199o0 = this.f64887a.mo89199o0();
        if (memberScopeMo89199o0 == null) {
            m89693m0(15);
        }
        return memberScopeMo89199o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo89200p() {
        m89694D0();
        List<TypeParameterDescriptor> list = this.f64891e;
        if (list == null) {
            m89693m0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo89201p0() {
        return this.f64887a.mo89201p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo89202q() {
        return this.f64887a.mo89202q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public MemberScope mo89350s0(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m89693m0(10);
        }
        MemberScope memberScopeMo89547P = mo89547P(typeSubstitution, DescriptorUtilsKt.m92876r(DescriptorUtils.m92657g(this)));
        if (memberScopeMo89547P == null) {
            m89693m0(11);
        }
        return memberScopeMo89547P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo89203t() {
        return this.f64887a.mo89203t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo89204v() {
        return this.f64887a.mo89204v();
    }
}
