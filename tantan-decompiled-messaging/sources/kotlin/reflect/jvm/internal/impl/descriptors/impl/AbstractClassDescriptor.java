package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {

    /* JADX INFO: renamed from: a */
    public final Name f64091a;

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue<SimpleType> f64092b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue<MemberScope> f64093c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue<ReceiverParameterDescriptor> f64094d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a */
    public class C15199a implements Function0<SimpleType> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a$a */
        public class a implements Function1<KotlinTypeRefiner, SimpleType> {
            public a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                ClassifierDescriptor classifierDescriptorMo92911f = kotlinTypeRefiner.mo92911f(AbstractClassDescriptor.this);
                if (classifierDescriptorMo92911f == null) {
                    return AbstractClassDescriptor.this.f64092b.invoke();
                }
                if (classifierDescriptorMo92911f instanceof TypeAliasDescriptor) {
                    return KotlinTypeFactory.m92628c((TypeAliasDescriptor) classifierDescriptorMo92911f, TypeUtils.m92796g(classifierDescriptorMo92911f.mo88305l().getParameters()));
                }
                return classifierDescriptorMo92911f instanceof ModuleAwareClassDescriptor ? TypeUtils.m92811v(classifierDescriptorMo92911f.mo88305l().mo88677a(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorMo92911f).mo88306l0(kotlinTypeRefiner), this) : classifierDescriptorMo92911f.mo88458o();
            }
        }

        public C15199a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
            return TypeUtils.m92810u(abstractClassDescriptor, abstractClassDescriptor.mo88455D(), new a());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$b */
    public class C15200b implements Function0<MemberScope> {
        public C15200b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.mo88455D());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$c */
    public class C15201c implements Function0<ReceiverParameterDescriptor> {
        public C15201c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        if (storageManager == null) {
            m88654m0(0);
        }
        if (name == null) {
            m88654m0(1);
        }
        this.f64091a = name;
        this.f64092b = storageManager.mo92446e(new C15199a());
        this.f64093c = storageManager.mo92446e(new C15200b());
        this.f64094d = storageManager.mo92446e(new C15201c());
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m88654m0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m88654m0(18);
        }
        return typeSubstitutor.m92779l() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: C */
    public MemberScope mo88454C() {
        MemberScope memberScopeInvoke = this.f64093c.invoke();
        if (memberScopeInvoke == null) {
            m88654m0(4);
        }
        return memberScopeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: D */
    public MemberScope mo88455D() {
        MemberScope memberScopeMo88306l0 = mo88306l0(DescriptorUtilsKt.m91985r(DescriptorUtils.m91766g(this)));
        if (memberScopeMo88306l0 == null) {
            m88654m0(17);
        }
        return memberScopeMo88306l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P */
    public MemberScope mo88656P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            m88654m0(10);
        }
        if (kotlinTypeRefiner == null) {
            m88654m0(11);
        }
        if (!typeSubstitution.mo89882f()) {
            return new SubstitutingScope(mo88306l0(kotlinTypeRefiner), TypeSubstitutor.m92773h(typeSubstitution));
        }
        MemberScope memberScopeMo88306l0 = mo88306l0(kotlinTypeRefiner);
        if (memberScopeMo88306l0 == null) {
            m88654m0(12);
        }
        return memberScopeMo88306l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: R */
    public ReceiverParameterDescriptor mo88456R() {
        ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.f64094d.invoke();
        if (receiverParameterDescriptorInvoke == null) {
            m88654m0(5);
        }
        return receiverParameterDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo88465a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo88457f0() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88654m0(6);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f64091a;
        if (name == null) {
            m88654m0(2);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo88458o() {
        SimpleType simpleTypeInvoke = this.f64092b.invoke();
        if (simpleTypeInvoke == null) {
            m88654m0(20);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public MemberScope mo88459s0(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m88654m0(15);
        }
        MemberScope memberScopeMo88656P = mo88656P(typeSubstitution, DescriptorUtilsKt.m91985r(DescriptorUtils.m91766g(this)));
        if (memberScopeMo88656P == null) {
            m88654m0(16);
        }
        return memberScopeMo88656P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo88445a() {
        return this;
    }
}
