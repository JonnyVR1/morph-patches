package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ClassDescriptorImpl extends ClassDescriptorBase {

    /* JADX INFO: renamed from: h */
    public final Modality f64124h;

    /* JADX INFO: renamed from: i */
    public final ClassKind f64125i;

    /* JADX INFO: renamed from: j */
    public final TypeConstructor f64126j;

    /* JADX INFO: renamed from: k */
    public MemberScope f64127k;

    /* JADX INFO: renamed from: l */
    public Set<ClassConstructorDescriptor> f64128l;

    /* JADX INFO: renamed from: m */
    public ClassConstructorDescriptor f64129m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, @NotNull Modality modality, @NotNull ClassKind classKind, @NotNull Collection<KotlinType> collection, @NotNull SourceElement sourceElement, boolean z, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z);
        if (declarationDescriptor == null) {
            m88704m0(0);
        }
        if (name == null) {
            m88704m0(1);
        }
        if (modality == null) {
            m88704m0(2);
        }
        if (classKind == null) {
            m88704m0(3);
        }
        if (collection == null) {
            m88704m0(4);
        }
        if (sourceElement == null) {
            m88704m0(5);
        }
        if (storageManager == null) {
            m88704m0(6);
        }
        this.f64124h = modality;
        this.f64125i = classKind;
        this.f64126j = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, collection, storageManager);
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m88704m0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m88705D0(@NotNull MemberScope memberScope, @NotNull Set<ClassConstructorDescriptor> set, @Nullable ClassConstructorDescriptor classConstructorDescriptor) {
        if (memberScope == null) {
            m88704m0(7);
        }
        if (set == null) {
            m88704m0(8);
        }
        this.f64127k = memberScope;
        this.f64128l = set;
        this.f64129m = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo88300c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotationsM88641b = Annotations.Companion.m88641b();
        if (annotationsM88641b == null) {
            m88704m0(9);
        }
        return annotationsM88641b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Set<ClassConstructorDescriptor> set = this.f64128l;
        if (set == null) {
            m88704m0(11);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = this.f64125i;
        if (classKind == null) {
            m88704m0(15);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64026e;
        if (descriptorVisibility == null) {
            m88704m0(17);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo88302h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        Modality modality = this.f64124h;
        if (modality == null) {
            m88704m0(16);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo88304j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        TypeConstructor typeConstructor = this.f64126j;
        if (typeConstructor == null) {
            m88704m0(10);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m88704m0(12);
        }
        MemberScope memberScope = this.f64127k;
        if (memberScope == null) {
            m88704m0(13);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public MemberScope mo88308o0() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            m88704m0(14);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88704m0(18);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo88310p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo88311q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return this.f64129m;
    }
}
