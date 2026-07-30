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
    public final Name f64765a;

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue<SimpleType> f64766b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue<MemberScope> f64767c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue<ReceiverParameterDescriptor> f64768d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a */
    public class C15306a implements Function0<SimpleType> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a$a */
        public class a implements Function1<KotlinTypeRefiner, SimpleType> {
            public a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                ClassifierDescriptor classifierDescriptorMo93802f = kotlinTypeRefiner.mo93802f(AbstractClassDescriptor.this);
                if (classifierDescriptorMo93802f == null) {
                    return AbstractClassDescriptor.this.f64766b.invoke();
                }
                if (classifierDescriptorMo93802f instanceof TypeAliasDescriptor) {
                    return KotlinTypeFactory.m93519c((TypeAliasDescriptor) classifierDescriptorMo93802f, TypeUtils.m93687g(classifierDescriptorMo93802f.mo89196l().getParameters()));
                }
                return classifierDescriptorMo93802f instanceof ModuleAwareClassDescriptor ? TypeUtils.m93702v(classifierDescriptorMo93802f.mo89196l().mo89568a(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorMo93802f).mo89197l0(kotlinTypeRefiner), this) : classifierDescriptorMo93802f.mo89349o();
            }
        }

        public C15306a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
            return TypeUtils.m93701u(abstractClassDescriptor, abstractClassDescriptor.mo89346D(), new a());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$b */
    public class C15307b implements Function0<MemberScope> {
        public C15307b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.mo89346D());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$c */
    public class C15308c implements Function0<ReceiverParameterDescriptor> {
        public C15308c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        if (storageManager == null) {
            m89545m0(0);
        }
        if (name == null) {
            m89545m0(1);
        }
        this.f64765a = name;
        this.f64766b = storageManager.mo93337e(new C15306a());
        this.f64767c = storageManager.mo93337e(new C15307b());
        this.f64768d = storageManager.mo93337e(new C15308c());
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m89545m0(int i) {
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
    public ClassDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m89545m0(18);
        }
        return typeSubstitutor.m93670l() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: C */
    public MemberScope mo89345C() {
        MemberScope memberScopeInvoke = this.f64767c.invoke();
        if (memberScopeInvoke == null) {
            m89545m0(4);
        }
        return memberScopeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: D */
    public MemberScope mo89346D() {
        MemberScope memberScopeMo89197l0 = mo89197l0(DescriptorUtilsKt.m92876r(DescriptorUtils.m92657g(this)));
        if (memberScopeMo89197l0 == null) {
            m89545m0(17);
        }
        return memberScopeMo89197l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P */
    public MemberScope mo89547P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            m89545m0(10);
        }
        if (kotlinTypeRefiner == null) {
            m89545m0(11);
        }
        if (!typeSubstitution.mo90773f()) {
            return new SubstitutingScope(mo89197l0(kotlinTypeRefiner), TypeSubstitutor.m93664h(typeSubstitution));
        }
        MemberScope memberScopeMo89197l0 = mo89197l0(kotlinTypeRefiner);
        if (memberScopeMo89197l0 == null) {
            m89545m0(12);
        }
        return memberScopeMo89197l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: R */
    public ReceiverParameterDescriptor mo89347R() {
        ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.f64768d.invoke();
        if (receiverParameterDescriptorInvoke == null) {
            m89545m0(5);
        }
        return receiverParameterDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo89356a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo89348f0() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m89545m0(6);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f64765a;
        if (name == null) {
            m89545m0(2);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo89349o() {
        SimpleType simpleTypeInvoke = this.f64766b.invoke();
        if (simpleTypeInvoke == null) {
            m89545m0(20);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public MemberScope mo89350s0(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m89545m0(15);
        }
        MemberScope memberScopeMo89547P = mo89547P(typeSubstitution, DescriptorUtilsKt.m92876r(DescriptorUtils.m92657g(this)));
        if (memberScopeMo89547P == null) {
            m89545m0(16);
        }
        return memberScopeMo89547P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public ClassDescriptor mo89336a() {
        return this;
    }
}
