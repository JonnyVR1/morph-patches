package kotlin.reflect.jvm.internal.impl.descriptors;

import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
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
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorVisibilities {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DescriptorVisibility f64696a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final DescriptorVisibility f64697b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final DescriptorVisibility f64698c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final DescriptorVisibility f64699d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final DescriptorVisibility f64700e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final DescriptorVisibility f64701f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final DescriptorVisibility f64702g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final DescriptorVisibility f64703h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final DescriptorVisibility f64704i;

    /* JADX INFO: renamed from: j */
    public static final Set<DescriptorVisibility> f64705j;

    /* JADX INFO: renamed from: k */
    public static final Map<DescriptorVisibility, Integer> f64706k;

    /* JADX INFO: renamed from: l */
    public static final DescriptorVisibility f64707l;

    /* JADX INFO: renamed from: m */
    public static final ReceiverValue f64708m;

    /* JADX INFO: renamed from: n */
    public static final ReceiverValue f64709n;

    /* JADX INFO: renamed from: o */
    @Deprecated
    public static final ReceiverValue f64710o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final ModuleVisibilityHelper f64711p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Map<Visibility, DescriptorVisibility> f64712q;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$a */
    public static class C15290a implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$b */
    public static class C15291b implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$c */
    public static class C15292c implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$d */
    public static class C15293d extends DelegatedDescriptorVisibility {
        public C15293d(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m89383g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == 0) {
                m89383g(1);
            }
            if (declarationDescriptor == null) {
                m89383g(2);
            }
            if (DescriptorUtils.m92647J(declarationDescriptorWithVisibility) && m89385h(declarationDescriptor)) {
                return DescriptorVisibilities.m89378f(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersMo89190b = ((ConstructorDescriptor) declarationDescriptorWithVisibility).mo89190b();
                if (z && DescriptorUtils.m92644G(classifierDescriptorWithTypeParametersMo89190b) && DescriptorUtils.m92647J(classifierDescriptorWithTypeParametersMo89190b) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.m92647J(declarationDescriptor.mo89190b()) && DescriptorVisibilities.m89378f(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.mo89190b();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.m92674x(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
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
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).mo89453d().equals(((PackageFragmentDescriptor) declarationDescriptor).mo89453d()) && DescriptorUtils.m92652b(declarationDescriptor, declarationDescriptorWithVisibility);
                }
                declarationDescriptor = declarationDescriptor.mo89190b();
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m89385h(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                m89383g(0);
            }
            return DescriptorUtils.m92660j(declarationDescriptor) != SourceFile.f64738a;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$e */
    public static class C15294e extends DelegatedDescriptorVisibility {
        public C15294e(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89386g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            DeclarationDescriptor declarationDescriptorM92667q;
            if (declarationDescriptorWithVisibility == null) {
                m89386g(0);
            }
            if (declarationDescriptor == null) {
                m89386g(1);
            }
            if (!DescriptorVisibilities.f64696a.mo89384e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                return false;
            }
            if (receiverValue == DescriptorVisibilities.f64709n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f64708m || (declarationDescriptorM92667q = DescriptorUtils.m92667q(declarationDescriptorWithVisibility, ClassDescriptor.class)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                return false;
            }
            return ((ThisClassReceiver) receiverValue).mo92988j().mo89336a().equals(declarationDescriptorM92667q.mo89336a());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$f */
    public static class C15295f extends DelegatedDescriptorVisibility {
        public C15295f(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89387g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptorWithVisibility == null) {
                m89387g(0);
            }
            if (declarationDescriptor == null) {
                m89387g(1);
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.m92667q(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.m92668r(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 == null) {
                return false;
            }
            if (classDescriptor2 != null && DescriptorUtils.m92674x(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.m92667q(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.m92645H(classDescriptor3, classDescriptor)) {
                return true;
            }
            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM92650M = DescriptorUtils.m92650M(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.m92667q(declarationDescriptorWithVisibilityM92650M, ClassDescriptor.class);
            if (classDescriptor4 == null) {
                return false;
            }
            if (DescriptorUtils.m92645H(classDescriptor3, classDescriptor4) && m89388h(receiverValue, declarationDescriptorWithVisibilityM92650M, classDescriptor3)) {
                return true;
            }
            return mo89384e(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.mo89190b(), z);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m89388h(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull ClassDescriptor classDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                m89387g(2);
            }
            if (classDescriptor == null) {
                m89387g(3);
            }
            if (receiverValue == DescriptorVisibilities.f64710o) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.f64709n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f64708m || receiverValue == null) {
                return false;
            }
            KotlinType kotlinTypeM92989b = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).m92989b() : receiverValue.getType();
            return DescriptorUtils.m92646I(kotlinTypeM92989b, classDescriptor) || DynamicTypesKt.m93480a(kotlinTypeM92989b);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$g */
    public static class C15296g extends DelegatedDescriptorVisibility {
        public C15296g(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89389g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89389g(0);
            }
            if (declarationDescriptor == null) {
                m89389g(1);
            }
            if (DescriptorUtils.m92657g(declarationDescriptor).mo89439x(DescriptorUtils.m92657g(declarationDescriptorWithVisibility))) {
                return DescriptorVisibilities.f64711p.mo94036a(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$h */
    public static class C15297h extends DelegatedDescriptorVisibility {
        public C15297h(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89390g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89390g(0);
            }
            if (declarationDescriptor == null) {
                m89390g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$i */
    public static class C15298i extends DelegatedDescriptorVisibility {
        public C15298i(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89391g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89391g(0);
            }
            if (declarationDescriptor == null) {
                m89391g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$j */
    public static class C15299j extends DelegatedDescriptorVisibility {
        public C15299j(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89392g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89392g(0);
            }
            if (declarationDescriptor == null) {
                m89392g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$k */
    public static class C15300k extends DelegatedDescriptorVisibility {
        public C15300k(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89393g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89393g(0);
            }
            if (declarationDescriptor == null) {
                m89393g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$l */
    public static class C15301l extends DelegatedDescriptorVisibility {
        public C15301l(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89394g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89394g(0);
            }
            if (declarationDescriptor == null) {
                m89394g(1);
            }
            return false;
        }
    }

    static {
        C15293d c15293d = new C15293d(Visibilities.Private.INSTANCE);
        f64696a = c15293d;
        C15294e c15294e = new C15294e(Visibilities.PrivateToThis.INSTANCE);
        f64697b = c15294e;
        C15295f c15295f = new C15295f(Visibilities.Protected.INSTANCE);
        f64698c = c15295f;
        C15296g c15296g = new C15296g(Visibilities.Internal.INSTANCE);
        f64699d = c15296g;
        C15297h c15297h = new C15297h(Visibilities.Public.INSTANCE);
        f64700e = c15297h;
        C15298i c15298i = new C15298i(Visibilities.Local.INSTANCE);
        f64701f = c15298i;
        C15299j c15299j = new C15299j(Visibilities.Inherited.INSTANCE);
        f64702g = c15299j;
        C15300k c15300k = new C15300k(Visibilities.InvisibleFake.INSTANCE);
        f64703h = c15300k;
        C15301l c15301l = new C15301l(Visibilities.Unknown.INSTANCE);
        f64704i = c15301l;
        f64705j = Collections.unmodifiableSet(SetsKt.setOf((Object[]) new DescriptorVisibility[]{c15293d, c15294e, c15296g, c15298i}));
        HashMap mapM94073e = CollectionsKt.m94073e(4);
        mapM94073e.put(c15294e, 0);
        mapM94073e.put(c15293d, 0);
        mapM94073e.put(c15296g, 1);
        mapM94073e.put(c15295f, 1);
        mapM94073e.put(c15297h, 2);
        f64706k = Collections.unmodifiableMap(mapM94073e);
        f64707l = c15297h;
        f64708m = new C15290a();
        f64709n = new C15291b();
        f64710o = new C15292c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f64711p = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        f64712q = new HashMap();
        m89381i(c15293d);
        m89381i(c15294e);
        m89381i(c15295f);
        m89381i(c15296g);
        m89381i(c15297h);
        m89381i(c15298i);
        m89381i(c15299j);
        m89381i(c15300k);
        m89381i(c15301l);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m89373a(int i) {
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
    public static Integer m89376d(@NotNull DescriptorVisibility descriptorVisibility, @NotNull DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            m89373a(12);
        }
        if (descriptorVisibility2 == null) {
            m89373a(13);
        }
        Integer numM89395a = descriptorVisibility.m89395a(descriptorVisibility2);
        if (numM89395a != null) {
            return numM89395a;
        }
        Integer numM89395a2 = descriptorVisibility2.m89395a(descriptorVisibility);
        if (numM89395a2 != null) {
            return Integer.valueOf(-numM89395a2.intValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static DeclarationDescriptorWithVisibility m89377e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM89377e;
        if (declarationDescriptorWithVisibility == null) {
            m89373a(8);
        }
        if (declarationDescriptor == null) {
            m89373a(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.mo89336a(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != f64701f; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.m92667q(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().mo89384e(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityM89377e = m89377e(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).mo89795B(), declarationDescriptor, z)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityM89377e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m89378f(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m89373a(6);
        }
        if (declarationDescriptor2 == null) {
            m89373a(7);
        }
        SourceFile sourceFileM92660j = DescriptorUtils.m92660j(declarationDescriptor2);
        if (sourceFileM92660j != SourceFile.f64738a) {
            return sourceFileM92660j.equals(DescriptorUtils.m92660j(declarationDescriptor));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m89379g(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            m89373a(14);
        }
        return descriptorVisibility == f64696a || descriptorVisibility == f64697b;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m89380h(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            m89373a(2);
        }
        if (declarationDescriptor == null) {
            m89373a(3);
        }
        return m89377e(f64709n, declarationDescriptorWithVisibility, declarationDescriptor, z) == null;
    }

    /* JADX INFO: renamed from: i */
    public static void m89381i(DescriptorVisibility descriptorVisibility) {
        f64712q.put(descriptorVisibility.mo89366b(), descriptorVisibility);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static DescriptorVisibility m89382j(@NotNull Visibility visibility) {
        if (visibility == null) {
            m89373a(15);
        }
        DescriptorVisibility descriptorVisibility = f64712q.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        ypg0.m217021a("Inapplicable visibility: ", visibility);
        return null;
    }
}
