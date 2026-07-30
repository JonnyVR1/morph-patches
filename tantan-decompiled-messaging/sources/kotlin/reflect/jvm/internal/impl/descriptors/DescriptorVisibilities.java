package kotlin.reflect.jvm.internal.impl.descriptors;

import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorVisibilities {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DescriptorVisibility f64022a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final DescriptorVisibility f64023b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final DescriptorVisibility f64024c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final DescriptorVisibility f64025d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final DescriptorVisibility f64026e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final DescriptorVisibility f64027f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final DescriptorVisibility f64028g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final DescriptorVisibility f64029h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final DescriptorVisibility f64030i;

    /* JADX INFO: renamed from: j */
    public static final Set<DescriptorVisibility> f64031j;

    /* JADX INFO: renamed from: k */
    public static final Map<DescriptorVisibility, Integer> f64032k;

    /* JADX INFO: renamed from: l */
    public static final DescriptorVisibility f64033l;

    /* JADX INFO: renamed from: m */
    public static final ReceiverValue f64034m;

    /* JADX INFO: renamed from: n */
    public static final ReceiverValue f64035n;

    /* JADX INFO: renamed from: o */
    @Deprecated
    public static final ReceiverValue f64036o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final ModuleVisibilityHelper f64037p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Map<Visibility, DescriptorVisibility> f64038q;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$a */
    public static class C15183a implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$b */
    public static class C15184b implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$c */
    public static class C15185c implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$d */
    public static class C15186d extends DelegatedDescriptorVisibility {
        public C15186d(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m88492g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == 0) {
                m88492g(1);
            }
            if (declarationDescriptor == null) {
                m88492g(2);
            }
            if (DescriptorUtils.m91756J(declarationDescriptorWithVisibility) && m88494h(declarationDescriptor)) {
                return DescriptorVisibilities.m88487f(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo88299b = ((ConstructorDescriptor) declarationDescriptorWithVisibility).mo88299b();
                if (z && DescriptorUtils.m91753G(classifierDescriptorWithTypeParametersMo88299b) && DescriptorUtils.m91756J(classifierDescriptorWithTypeParametersMo88299b) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.m91756J(declarationDescriptor.mo88299b()) && DescriptorVisibilities.m88487f(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.mo88299b();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.m91783x(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).mo88562d().equals(((PackageFragmentDescriptor) declarationDescriptor).mo88562d()) && DescriptorUtils.m91761b(declarationDescriptor, declarationDescriptorWithVisibility);
                }
                declarationDescriptor = declarationDescriptor.mo88299b();
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m88494h(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m88492g(0);
            }
            return DescriptorUtils.m91769j(declarationDescriptor) != SourceFile.f64064a;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$e */
    public static class C15187e extends DelegatedDescriptorVisibility {
        public C15187e(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88495g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            DeclarationDescriptor declarationDescriptorM91776q;
            if (declarationDescriptorWithVisibility == null) {
                m88495g(0);
            }
            if (declarationDescriptor == null) {
                m88495g(1);
            }
            if (!DescriptorVisibilities.f64022a.mo88493e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                return false;
            }
            if (receiverValue == DescriptorVisibilities.f64035n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f64034m || (declarationDescriptorM91776q = DescriptorUtils.m91776q(declarationDescriptorWithVisibility, ClassDescriptor.class)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                return false;
            }
            return ((ThisClassReceiver) receiverValue).mo92097j().mo88445a().equals(declarationDescriptorM91776q.mo88445a());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$f */
    public static class C15188f extends DelegatedDescriptorVisibility {
        public C15188f(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88496g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptorWithVisibility == null) {
                m88496g(0);
            }
            if (declarationDescriptor == null) {
                m88496g(1);
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.m91776q(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.m91777r(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 == null) {
                return false;
            }
            if (classDescriptor2 != null && DescriptorUtils.m91783x(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.m91776q(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.m91754H(classDescriptor3, classDescriptor)) {
                return true;
            }
            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM91759M = DescriptorUtils.m91759M(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.m91776q(declarationDescriptorWithVisibilityM91759M, ClassDescriptor.class);
            if (classDescriptor4 == null) {
                return false;
            }
            if (DescriptorUtils.m91754H(classDescriptor3, classDescriptor4) && m88497h(receiverValue, declarationDescriptorWithVisibilityM91759M, classDescriptor3)) {
                return true;
            }
            return mo88493e(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.mo88299b(), z);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m88497h(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull ClassDescriptor classDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                m88496g(2);
            }
            if (classDescriptor == null) {
                m88496g(3);
            }
            if (receiverValue == DescriptorVisibilities.f64036o) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.f64035n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f64034m || receiverValue == null) {
                return false;
            }
            KotlinType kotlinTypeM92098b = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).m92098b() : receiverValue.getType();
            return DescriptorUtils.m91755I(kotlinTypeM92098b, classDescriptor) || DynamicTypesKt.m92589a(kotlinTypeM92098b);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$g */
    public static class C15189g extends DelegatedDescriptorVisibility {
        public C15189g(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88498g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88498g(0);
            }
            if (declarationDescriptor == null) {
                m88498g(1);
            }
            if (DescriptorUtils.m91766g(declarationDescriptor).mo88548x(DescriptorUtils.m91766g(declarationDescriptorWithVisibility))) {
                return DescriptorVisibilities.f64037p.mo93145a(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$h */
    public static class C15190h extends DelegatedDescriptorVisibility {
        public C15190h(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88499g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88499g(0);
            }
            if (declarationDescriptor == null) {
                m88499g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$i */
    public static class C15191i extends DelegatedDescriptorVisibility {
        public C15191i(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88500g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88500g(0);
            }
            if (declarationDescriptor == null) {
                m88500g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$j */
    public static class C15192j extends DelegatedDescriptorVisibility {
        public C15192j(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88501g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88501g(0);
            }
            if (declarationDescriptor == null) {
                m88501g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$k */
    public static class C15193k extends DelegatedDescriptorVisibility {
        public C15193k(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88502g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88502g(0);
            }
            if (declarationDescriptor == null) {
                m88502g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$l */
    public static class C15194l extends DelegatedDescriptorVisibility {
        public C15194l(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m88503g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m88503g(0);
            }
            if (declarationDescriptor == null) {
                m88503g(1);
            }
            return false;
        }
    }

    static {
        C15186d c15186d = new C15186d(Visibilities.Private.INSTANCE);
        f64022a = c15186d;
        C15187e c15187e = new C15187e(Visibilities.PrivateToThis.INSTANCE);
        f64023b = c15187e;
        C15188f c15188f = new C15188f(Visibilities.Protected.INSTANCE);
        f64024c = c15188f;
        C15189g c15189g = new C15189g(Visibilities.Internal.INSTANCE);
        f64025d = c15189g;
        C15190h c15190h = new C15190h(Visibilities.Public.INSTANCE);
        f64026e = c15190h;
        C15191i c15191i = new C15191i(Visibilities.Local.INSTANCE);
        f64027f = c15191i;
        C15192j c15192j = new C15192j(Visibilities.Inherited.INSTANCE);
        f64028g = c15192j;
        C15193k c15193k = new C15193k(Visibilities.InvisibleFake.INSTANCE);
        f64029h = c15193k;
        C15194l c15194l = new C15194l(Visibilities.Unknown.INSTANCE);
        f64030i = c15194l;
        f64031j = Collections.unmodifiableSet(SetsKt.setOf((Object[]) new DescriptorVisibility[]{c15186d, c15187e, c15189g, c15191i}));
        HashMap mapM93182e = CollectionsKt.m93182e(4);
        mapM93182e.put(c15187e, 0);
        mapM93182e.put(c15186d, 0);
        mapM93182e.put(c15189g, 1);
        mapM93182e.put(c15188f, 1);
        mapM93182e.put(c15190h, 2);
        f64032k = Collections.unmodifiableMap(mapM93182e);
        f64033l = c15190h;
        f64034m = new C15183a();
        f64035n = new C15184b();
        f64036o = new C15185c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f64037p = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        f64038q = new HashMap();
        m88490i(c15186d);
        m88490i(c15187e);
        m88490i(c15188f);
        m88490i(c15189g);
        m88490i(c15190h);
        m88490i(c15191i);
        m88490i(c15192j);
        m88490i(c15193k);
        m88490i(c15194l);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m88482a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = MerchandiseTimeUnit.second;
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Integer m88485d(@NotNull DescriptorVisibility descriptorVisibility, @NotNull DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            m88482a(12);
        }
        if (descriptorVisibility2 == null) {
            m88482a(13);
        }
        Integer numM88504a = descriptorVisibility.m88504a(descriptorVisibility2);
        if (numM88504a != null) {
            return numM88504a;
        }
        Integer numM88504a2 = descriptorVisibility2.m88504a(descriptorVisibility);
        if (numM88504a2 != null) {
            return Integer.valueOf(-numM88504a2.intValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static DeclarationDescriptorWithVisibility m88486e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM88486e;
        if (declarationDescriptorWithVisibility == null) {
            m88482a(8);
        }
        if (declarationDescriptor == null) {
            m88482a(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.mo88445a(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != f64027f; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.m91776q(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().mo88493e(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityM88486e = m88486e(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).mo88904B(), declarationDescriptor, z)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityM88486e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m88487f(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m88482a(6);
        }
        if (declarationDescriptor2 == null) {
            m88482a(7);
        }
        SourceFile sourceFileM91769j = DescriptorUtils.m91769j(declarationDescriptor2);
        if (sourceFileM91769j != SourceFile.f64064a) {
            return sourceFileM91769j.equals(DescriptorUtils.m91769j(declarationDescriptor));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m88488g(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m88482a(14);
        }
        return descriptorVisibility == f64022a || descriptorVisibility == f64023b;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88489h(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            m88482a(2);
        }
        if (declarationDescriptor == null) {
            m88482a(3);
        }
        return m88486e(f64035n, declarationDescriptorWithVisibility, declarationDescriptor, z) == null;
    }

    /* JADX INFO: renamed from: i */
    public static void m88490i(DescriptorVisibility descriptorVisibility) {
        f64038q.put(descriptorVisibility.mo88475b(), descriptorVisibility);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static DescriptorVisibility m88491j(@NotNull Visibility visibility) {
        if (visibility == null) {
            m88482a(15);
        }
        DescriptorVisibility descriptorVisibility = f64038q.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        qhg0.m174539a("Inapplicable visibility: ", visibility);
        return null;
    }
}
