package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {

    /* JADX INFO: renamed from: h */
    public final TypeConstructor f64135h;

    /* JADX INFO: renamed from: i */
    public final MemberScope f64136i;

    /* JADX INFO: renamed from: j */
    public final NotNullLazyValue<Set<Name>> f64137j;

    /* JADX INFO: renamed from: k */
    public final Annotations f64138k;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a */
    public class C15205a extends MemberScopeImpl {

        /* JADX INFO: renamed from: a */
        public final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> f64139a;

        /* JADX INFO: renamed from: b */
        public final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> f64140b;

        /* JADX INFO: renamed from: c */
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f64141c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ EnumEntrySyntheticClassDescriptor f64142d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$a */
        public class a implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ EnumEntrySyntheticClassDescriptor f64143a;

            public a(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f64143a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                return C15205a.this.m88726m(name);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$b */
        public class b implements Function1<Name, Collection<? extends PropertyDescriptor>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ EnumEntrySyntheticClassDescriptor f64145a;

            public b(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f64145a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends PropertyDescriptor> invoke(Name name) {
                return C15205a.this.m88727n(name);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$c */
        public class c implements Function0<Collection<DeclarationDescriptor>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ EnumEntrySyntheticClassDescriptor f64147a;

            public c(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f64147a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<DeclarationDescriptor> invoke() {
                return C15205a.this.m88725l();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$d */
        public class d extends NonReportingOverrideStrategy {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Set f64149a;

            public d(Set set) {
                this.f64149a = set;
            }

            /* JADX INFO: renamed from: f */
            public static /* synthetic */ void m88733f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            /* JADX INFO: renamed from: a */
            public void mo88734a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    m88733f(0);
                }
                OverridingUtil.m91811K(callableMemberDescriptor, null);
                this.f64149a.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            /* JADX INFO: renamed from: e */
            public void mo88735e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    m88733f(1);
                }
                if (callableMemberDescriptor2 == null) {
                    m88733f(2);
                }
            }
        }

        public C15205a(@NotNull EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                m88715h(0);
            }
            this.f64142d = enumEntrySyntheticClassDescriptor;
            this.f64139a = storageManager.mo92450i(new a(enumEntrySyntheticClassDescriptor));
            this.f64140b = storageManager.mo92450i(new b(enumEntrySyntheticClassDescriptor));
            this.f64141c = storageManager.mo92446e(new c(enumEntrySyntheticClassDescriptor));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m88715h(int i) {
            String str;
            int i2;
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo88719a() {
            Set<Name> set = (Set) this.f64142d.f64137j.invoke();
            if (set == null) {
                m88715h(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<? extends SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                m88715h(5);
            }
            if (lookupLocation == null) {
                m88715h(6);
            }
            Collection<? extends SimpleFunctionDescriptor> collectionInvoke = this.f64139a.invoke(name);
            if (collectionInvoke == null) {
                m88715h(7);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<? extends PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                m88715h(1);
            }
            if (lookupLocation == null) {
                m88715h(2);
            }
            Collection<? extends PropertyDescriptor> collectionInvoke = this.f64140b.invoke(name);
            if (collectionInvoke == null) {
                m88715h(3);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo88722d() {
            Set<Name> set = (Set) this.f64142d.f64137j.invoke();
            if (set == null) {
                m88715h(19);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: e */
        public Set<Name> mo88723e() {
            Set<Name> set = Collections.EMPTY_SET;
            if (set == null) {
                m88715h(18);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* JADX INFO: renamed from: g */
        public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                m88715h(13);
            }
            if (function1 == null) {
                m88715h(14);
            }
            Collection<DeclarationDescriptor> collectionInvoke = this.f64141c.invoke();
            if (collectionInvoke == null) {
                m88715h(15);
            }
            return collectionInvoke;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final Collection<DeclarationDescriptor> m88725l() {
            HashSet hashSet = new HashSet();
            for (Name name : (Set) this.f64142d.f64137j.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo88720b(name, noLookupLocation));
                hashSet.addAll(mo88721c(name, noLookupLocation));
            }
            return hashSet;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Collection<? extends SimpleFunctionDescriptor> m88726m(@NotNull Name name) {
            if (name == null) {
                m88715h(8);
            }
            return m88729p(name, m88728o().mo88720b(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final Collection<? extends PropertyDescriptor> m88727n(@NotNull Name name) {
            if (name == null) {
                m88715h(4);
            }
            return m88729p(name, m88728o().mo88721c(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final MemberScope m88728o() {
            MemberScope memberScopeMo89900n = this.f64142d.mo88305l().mo88678c().iterator().next().mo89900n();
            if (memberScopeMo89900n == null) {
                m88715h(9);
            }
            return memberScopeMo89900n;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final <D extends CallableMemberDescriptor> Collection<? extends D> m88729p(@NotNull Name name, @NotNull Collection<? extends D> collection) {
            if (name == null) {
                m88715h(10);
            }
            if (collection == null) {
                m88715h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f65815f.m91841v(name, collection, Collections.EMPTY_SET, this.f64142d, new d(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntrySyntheticClassDescriptor(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            m88714m0(6);
        }
        if (classDescriptor == null) {
            m88714m0(7);
        }
        if (kotlinType == null) {
            m88714m0(8);
        }
        if (name == null) {
            m88714m0(9);
        }
        if (notNullLazyValue == null) {
            m88714m0(10);
        }
        if (annotations == null) {
            m88714m0(11);
        }
        if (sourceElement == null) {
            m88714m0(12);
        }
        this.f64138k = annotations;
        this.f64135h = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(kotlinType), storageManager);
        this.f64136i = new C15205a(this, storageManager);
        this.f64137j = notNullLazyValue;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public static EnumEntrySyntheticClassDescriptor m88713E0(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (storageManager == null) {
            m88714m0(0);
        }
        if (classDescriptor == null) {
            m88714m0(1);
        }
        if (name == null) {
            m88714m0(2);
        }
        if (notNullLazyValue == null) {
            m88714m0(3);
        }
        if (annotations == null) {
            m88714m0(4);
        }
        if (sourceElement == null) {
            m88714m0(5);
        }
        return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.mo88458o(), name, notNullLazyValue, annotations, sourceElement);
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m88714m0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        return false;
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
        Annotations annotations = this.f64138k;
        if (annotations == null) {
            m88714m0(21);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m88714m0(16);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            m88714m0(18);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64026e;
        if (descriptorVisibility == null) {
            m88714m0(20);
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
        Modality modality = Modality.FINAL;
        if (modality == null) {
            m88714m0(19);
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
        TypeConstructor typeConstructor = this.f64135h;
        if (typeConstructor == null) {
            m88714m0(17);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m88714m0(13);
        }
        MemberScope memberScope = this.f64136i;
        if (memberScope == null) {
            m88714m0(14);
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
            m88714m0(15);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            m88714m0(22);
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
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return null;
    }
}
