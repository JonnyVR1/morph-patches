package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
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
import p149l.j850;

/* JADX INFO: loaded from: classes2.dex */
public class MutableClassDescriptor extends ClassDescriptorBase {

    /* JADX INFO: renamed from: h */
    public final ClassKind f64236h;

    /* JADX INFO: renamed from: i */
    public final boolean f64237i;

    /* JADX INFO: renamed from: j */
    public Modality f64238j;

    /* JADX INFO: renamed from: k */
    public DescriptorVisibility f64239k;

    /* JADX INFO: renamed from: l */
    public TypeConstructor f64240l;

    /* JADX INFO: renamed from: m */
    public List<TypeParameterDescriptor> f64241m;

    /* JADX INFO: renamed from: n */
    public final Collection<KotlinType> f64242n;

    /* JADX INFO: renamed from: o */
    public final StorageManager f64243o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind, boolean z, boolean z2, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z2);
        if (declarationDescriptor == null) {
            m88830m0(0);
        }
        if (classKind == null) {
            m88830m0(1);
        }
        if (name == null) {
            m88830m0(2);
        }
        if (sourceElement == null) {
            m88830m0(3);
        }
        if (storageManager == null) {
            m88830m0(4);
        }
        this.f64242n = new ArrayList();
        this.f64243o = storageManager;
        this.f64236h = classKind;
        this.f64237i = z;
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m88830m0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
    public void m88831D0() {
        this.f64240l = new ClassTypeConstructorImpl(this, this.f64241m, this.f64242n, this.f64243o);
        Iterator<ClassConstructorDescriptor> it = getConstructors().iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) it.next()).m88757Z0(mo88458o());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public Set<ClassConstructorDescriptor> getConstructors() {
        Set<ClassConstructorDescriptor> set = Collections.EMPTY_SET;
        if (set == null) {
            m88830m0(13);
        }
        return set;
    }

    /* JADX INFO: renamed from: F0 */
    public void m88833F0(@NotNull Modality modality) {
        if (modality == null) {
            m88830m0(6);
        }
        this.f64238j = modality;
    }

    /* JADX INFO: renamed from: G0 */
    public void m88834G0(@NotNull List<TypeParameterDescriptor> list) {
        if (list == null) {
            m88830m0(14);
        }
        if (this.f64241m == null) {
            this.f64241m = new ArrayList(list);
        } else {
            j850.m140190a("Type parameters are already set for ", getName());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m88835H0(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m88830m0(9);
        }
        this.f64239k = descriptorVisibility;
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
            m88830m0(5);
        }
        return annotationsM88641b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = this.f64236h;
        if (classKind == null) {
            m88830m0(8);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f64239k;
        if (descriptorVisibility == null) {
            m88830m0(10);
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
        Modality modality = this.f64238j;
        if (modality == null) {
            m88830m0(7);
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
        TypeConstructor typeConstructor = this.f64240l;
        if (typeConstructor == null) {
            m88830m0(11);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m88830m0(16);
        }
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            m88830m0(17);
        }
        return empty;
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
            m88830m0(18);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        List<TypeParameterDescriptor> list = this.f64241m;
        if (list == null) {
            m88830m0(15);
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
        return this.f64237i;
    }

    public String toString() {
        return DeclarationDescriptorImpl.m88707l0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return null;
    }
}
