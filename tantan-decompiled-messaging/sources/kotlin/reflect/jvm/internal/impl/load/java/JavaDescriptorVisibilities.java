package kotlin.reflect.jvm.internal.impl.load.java;

import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JavaDescriptorVisibilities {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DescriptorVisibility f64664a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final DescriptorVisibility f64665b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final DescriptorVisibility f64666c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Visibility, DescriptorVisibility> f64667d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$a */
    public static class C15211a extends DelegatedDescriptorVisibility {
        public C15211a(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89398g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "fromPackage";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i == 2 || i == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89398g(0);
            }
            if (declarationDescriptor == null) {
                m89398g(1);
            }
            return JavaDescriptorVisibilities.m89394d(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$b */
    public static class C15212b extends DelegatedDescriptorVisibility {
        public C15212b(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89399g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89399g(0);
            }
            if (declarationDescriptor == null) {
                m89399g(1);
            }
            return JavaDescriptorVisibilities.m89395e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$c */
    public static class C15213c extends DelegatedDescriptorVisibility {
        public C15213c(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m89400g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: e */
        public boolean mo88493e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m89400g(0);
            }
            if (declarationDescriptor == null) {
                m89400g(1);
            }
            return JavaDescriptorVisibilities.m89395e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static {
        C15211a c15211a = new C15211a(JavaVisibilities.PackageVisibility.INSTANCE);
        f64664a = c15211a;
        C15212b c15212b = new C15212b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        f64665b = c15212b;
        C15213c c15213c = new C15213c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        f64666c = c15213c;
        f64667d = new HashMap();
        m89396f(c15211a);
        m89396f(c15212b);
        m89396f(c15213c);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m89391a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = MerchandiseTimeUnit.second;
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m89394d(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m89391a(2);
        }
        if (declarationDescriptor2 == null) {
            m89391a(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.m91777r(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.m91777r(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.mo88562d().equals(packageFragmentDescriptor2.mo88562d())) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m89395e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m89391a(0);
        }
        if (declarationDescriptor == null) {
            m89391a(1);
        }
        if (m89394d(DescriptorUtils.m91759M(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.f64024c.mo88493e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m89396f(DescriptorVisibility descriptorVisibility) {
        f64667d.put(descriptorVisibility.mo88475b(), descriptorVisibility);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static DescriptorVisibility m89397g(@NotNull Visibility visibility) {
        if (visibility == null) {
            m89391a(4);
        }
        DescriptorVisibility descriptorVisibility = f64667d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibilityM88491j = DescriptorVisibilities.m88491j(visibility);
        if (descriptorVisibilityM88491j == null) {
            m89391a(5);
        }
        return descriptorVisibilityM88491j;
    }
}
