package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.facebook.AuthenticationTokenClaims;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorResolverUtils {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a */
    public static class C15321a extends NonReportingOverrideStrategy {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ErrorReporter f65438a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f65439b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f65440c;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a$a */
        public class a implements Function1<CallableMemberDescriptor, Unit> {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            private static /* synthetic */ void m90404a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Unit invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    m90404a(0);
                }
                C15321a.this.f65438a.mo89849a(callableMemberDescriptor);
                return Unit.INSTANCE;
            }
        }

        public C15321a(ErrorReporter errorReporter, Set set, boolean z) {
            this.f65438a = errorReporter;
            this.f65439b = set;
            this.f65440c = z;
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m90402f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        /* JADX INFO: renamed from: a */
        public void mo89625a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m90402f(0);
            }
            OverridingUtil.m92702K(callableMemberDescriptor, new a());
            this.f65439b.add(callableMemberDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        /* JADX INFO: renamed from: d */
        public void mo90403d(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                m90402f(3);
            }
            if (collection == null) {
                m90402f(4);
            }
            if (!this.f65440c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.mo90403d(callableMemberDescriptor, collection);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
        /* JADX INFO: renamed from: e */
        public void mo89626e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                m90402f(1);
            }
            if (callableMemberDescriptor2 == null) {
                m90402f(2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m90397a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ValueParameterDescriptor m90398b(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        if (name == null) {
            m90397a(19);
        }
        if (classDescriptor == null) {
            m90397a(20);
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().mo89339g()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static <D extends CallableMemberDescriptor> Collection<D> m90399c(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil, boolean z) {
        if (name == null) {
            m90397a(12);
        }
        if (collection == null) {
            m90397a(13);
        }
        if (collection2 == null) {
            m90397a(14);
        }
        if (classDescriptor == null) {
            m90397a(15);
        }
        if (errorReporter == null) {
            m90397a(16);
        }
        if (overridingUtil == null) {
            m90397a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.m92732v(name, collection, collection2, classDescriptor, new C15321a(errorReporter, linkedHashSet, z));
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static <D extends CallableMemberDescriptor> Collection<D> m90400d(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            m90397a(0);
        }
        if (collection == null) {
            m90397a(1);
        }
        if (collection2 == null) {
            m90397a(2);
        }
        if (classDescriptor == null) {
            m90397a(3);
        }
        if (errorReporter == null) {
            m90397a(4);
        }
        if (overridingUtil == null) {
            m90397a(5);
        }
        return m90399c(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static <D extends CallableMemberDescriptor> Collection<D> m90401e(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            m90397a(6);
        }
        if (collection == null) {
            m90397a(7);
        }
        if (collection2 == null) {
            m90397a(8);
        }
        if (classDescriptor == null) {
            m90397a(9);
        }
        if (errorReporter == null) {
            m90397a(10);
        }
        if (overridingUtil == null) {
            m90397a(11);
        }
        return m90399c(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
    }
}
