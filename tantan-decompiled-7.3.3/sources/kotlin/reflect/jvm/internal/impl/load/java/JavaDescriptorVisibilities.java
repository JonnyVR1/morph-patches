package kotlin.reflect.jvm.internal.impl.load.java;

import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
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
    public static final DescriptorVisibility f65338a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final DescriptorVisibility f65339b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final DescriptorVisibility f65340c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Visibility, DescriptorVisibility> f65341d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$a */
    public static class C15318a extends DelegatedDescriptorVisibility {
        public C15318a(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m90289g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m90289g(0);
            }
            if (declarationDescriptor == null) {
                m90289g(1);
            }
            return JavaDescriptorVisibilities.m90285d(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$b */
    public static class C15319b extends DelegatedDescriptorVisibility {
        public C15319b(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m90290g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m90290g(0);
            }
            if (declarationDescriptor == null) {
                m90290g(1);
            }
            return JavaDescriptorVisibilities.m90286e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$c */
    public static class C15320c extends DelegatedDescriptorVisibility {
        public C15320c(Visibility visibility) {
            super(visibility);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m90291g(int i) {
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
        public boolean mo89384e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
            if (declarationDescriptorWithVisibility == null) {
                m90291g(0);
            }
            if (declarationDescriptor == null) {
                m90291g(1);
            }
            return JavaDescriptorVisibilities.m90286e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static {
        C15318a c15318a = new C15318a(JavaVisibilities.PackageVisibility.INSTANCE);
        f65338a = c15318a;
        C15319b c15319b = new C15319b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        f65339b = c15319b;
        C15320c c15320c = new C15320c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        f65340c = c15320c;
        f65341d = new HashMap();
        m90287f(c15318a);
        m90287f(c15319b);
        m90287f(c15320c);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m90282a(int i) {
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
    public static boolean m90285d(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m90282a(2);
        }
        if (declarationDescriptor2 == null) {
            m90282a(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.m92668r(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.m92668r(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.mo89453d().equals(packageFragmentDescriptor2.mo89453d())) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m90286e(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m90282a(0);
        }
        if (declarationDescriptor == null) {
            m90282a(1);
        }
        if (m90285d(DescriptorUtils.m92650M(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.f64698c.mo89384e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m90287f(DescriptorVisibility descriptorVisibility) {
        f65341d.put(descriptorVisibility.mo89366b(), descriptorVisibility);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static DescriptorVisibility m90288g(@NotNull Visibility visibility) {
        if (visibility == null) {
            m90282a(4);
        }
        DescriptorVisibility descriptorVisibility = f65341d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibilityM89382j = DescriptorVisibilities.m89382j(visibility);
        if (descriptorVisibilityM89382j == null) {
            m90282a(5);
        }
        return descriptorVisibilityM89382j;
    }
}
