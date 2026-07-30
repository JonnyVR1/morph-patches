package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: e */
    public final Variance f64780e;

    /* JADX INFO: renamed from: f */
    public final boolean f64781f;

    /* JADX INFO: renamed from: g */
    public final int f64782g;

    /* JADX INFO: renamed from: h */
    public final NotNullLazyValue<TypeConstructor> f64783h;

    /* JADX INFO: renamed from: i */
    public final NotNullLazyValue<SimpleType> f64784i;

    /* JADX INFO: renamed from: j */
    public final StorageManager f64785j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$a */
    public class C15309a implements Function0<TypeConstructor> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StorageManager f64786a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SupertypeLoopChecker f64787b;

        public C15309a(StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            this.f64786a = storageManager;
            this.f64787b = supertypeLoopChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TypeConstructor invoke() {
            return new C15311c(AbstractTypeParameterDescriptor.this, this.f64786a, this.f64787b);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$b */
    public class C15310b implements Function0<SimpleType> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Name f64789a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$b$a */
        public class a implements Function0<MemberScope> {
            public a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberScope invoke() {
                return TypeIntersectionScope.m92978m("Scope for type parameter " + C15310b.this.f64789a.m91973b(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            }
        }

        public C15310b(Name name) {
            this.f64789a = name;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            return KotlinTypeFactory.m93527m(TypeAttributes.Companion.m93600k(), AbstractTypeParameterDescriptor.this.mo89196l(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new a()));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor$c */
    public class C15311c extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: d */
        public final SupertypeLoopChecker f64792d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractTypeParameterDescriptor f64793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15311c(@NotNull AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                m89579I(0);
            }
            this.f64793e = abstractTypeParameterDescriptor;
            this.f64792d = supertypeLoopChecker;
        }

        /* JADX INFO: renamed from: I */
        public static /* synthetic */ void m89579I(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: A */
        public void mo89580A(@NotNull KotlinType kotlinType) {
            if (kotlinType == null) {
                m89579I(6);
            }
            this.f64793e.mo89574D0(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: e */
        public ClassifierDescriptor mo89207e() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f64793e;
            if (abstractTypeParameterDescriptor == null) {
                m89579I(3);
            }
            return abstractTypeParameterDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: f */
        public KotlinBuiltIns mo89570f() {
            KotlinBuiltIns kotlinBuiltInsM92871m = DescriptorUtilsKt.m92871m(this.f64793e);
            if (kotlinBuiltInsM92871m == null) {
                m89579I(4);
            }
            return kotlinBuiltInsM92871m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo89208g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
            if (list == null) {
                m89579I(2);
            }
            return list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        /* JADX INFO: renamed from: j */
        public boolean mo89581j(@NotNull ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor == null) {
                m89579I(9);
            }
            return (classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.INSTANCE.m92616m(this.f64793e, (TypeParameterDescriptor) classifierDescriptor, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo89209s() {
            List<KotlinType> listMo89575E0 = this.f64793e.mo89575E0();
            if (listMo89575E0 == null) {
                m89579I(1);
            }
            return listMo89575E0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @Nullable
        /* JADX INFO: renamed from: t */
        public KotlinType mo89582t() {
            return ErrorUtils.m93893d(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        public String toString() {
            return this.f64793e.getName().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo89210w() {
            SupertypeLoopChecker supertypeLoopChecker = this.f64792d;
            if (supertypeLoopChecker == null) {
                m89579I(5);
            }
            return supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: y */
        public List<KotlinType> mo89583y(@NotNull List<KotlinType> list) {
            if (list == null) {
                m89579I(7);
            }
            List<KotlinType> listMo89573B0 = this.f64793e.mo89573B0(list);
            if (listMo89573B0 == null) {
                m89579I(8);
            }
            return listMo89573B0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Variance variance, boolean z, int i, @NotNull SourceElement sourceElement, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            m89572P(0);
        }
        if (declarationDescriptor == null) {
            m89572P(1);
        }
        if (annotations == null) {
            m89572P(2);
        }
        if (name == null) {
            m89572P(3);
        }
        if (variance == null) {
            m89572P(4);
        }
        if (sourceElement == null) {
            m89572P(5);
        }
        if (supertypeLoopChecker == null) {
            m89572P(6);
        }
        this.f64780e = variance;
        this.f64781f = z;
        this.f64782g = i;
        this.f64783h = storageManager.mo93337e(new C15309a(storageManager, supertypeLoopChecker));
        this.f64784i = storageManager.mo93337e(new C15310b(name));
        this.f64785j = storageManager;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89572P(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: A */
    public boolean mo89490A() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public List<KotlinType> mo89573B0(@NotNull List<KotlinType> list) {
        if (list == null) {
            m89572P(12);
        }
        if (list == null) {
            m89572P(13);
        }
        return list;
    }

    /* JADX INFO: renamed from: D0 */
    public abstract void mo89574D0(@NotNull KotlinType kotlinType);

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public abstract List<KotlinType> mo89575E0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.mo89361h(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: Z */
    public StorageManager mo89491Z() {
        StorageManager storageManager = this.f64785j;
        if (storageManager == null) {
            m89572P(14);
        }
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeParameterDescriptor mo89336a() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.mo89336a();
        if (typeParameterDescriptor == null) {
            m89572P(11);
        }
        return typeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f64782g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> listMo89569c = ((C15311c) mo89196l()).mo89569c();
        if (listMo89569c == null) {
            m89572P(8);
        }
        return listMo89569c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: h */
    public Variance mo89492h() {
        Variance variance = this.f64780e;
        if (variance == null) {
            m89572P(7);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public final TypeConstructor mo89196l() {
        TypeConstructor typeConstructorInvoke = this.f64783h.invoke();
        if (typeConstructorInvoke == null) {
            m89572P(9);
        }
        return typeConstructorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo89349o() {
        SimpleType simpleTypeInvoke = this.f64784i.invoke();
        if (simpleTypeInvoke == null) {
            m89572P(10);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: s */
    public boolean mo89493s() {
        return this.f64781f;
    }
}
