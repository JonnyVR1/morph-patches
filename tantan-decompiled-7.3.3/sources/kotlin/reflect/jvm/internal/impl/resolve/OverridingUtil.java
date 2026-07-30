package kotlin.reflect.jvm.internal.impl.resolve;

import com.alibaba.fastjson.asm.Opcodes;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p153l.m5j;
import p153l.xtq0;
import p153l.yg3;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
public class OverridingUtil {

    /* JADX INFO: renamed from: e */
    public static final List<ExternalOverridabilityCondition> f66488e = CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final OverridingUtil f66489f;

    /* JADX INFO: renamed from: g */
    public static final KotlinTypeChecker.TypeConstructorEquality f66490g;

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f66491a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypePreparator f66492b;

    /* JADX INFO: renamed from: c */
    public final KotlinTypeChecker.TypeConstructorEquality f66493c;

    /* JADX INFO: renamed from: d */
    public final Function2<KotlinType, KotlinType, Boolean> f66494d;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: c */
        public static final OverrideCompatibilityInfo f66495c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        public final Result f66496a;

        /* JADX INFO: renamed from: b */
        public final String f66497b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(@NotNull Result result, @NotNull String str) {
            if (result == null) {
                m92733a(3);
            }
            if (str == null) {
                m92733a(4);
            }
            this.f66496a = result;
            this.f66497b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m92733a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i == 1 || i == 2) {
                objArr[0] = "debugMessage";
            } else if (i == 3) {
                objArr[0] = "success";
            } else if (i != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i == 1) {
                objArr[2] = "incompatible";
            } else if (i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static OverrideCompatibilityInfo m92734b(@NotNull String str) {
            if (str == null) {
                m92733a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static OverrideCompatibilityInfo m92735d(@NotNull String str) {
            if (str == null) {
                m92733a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static OverrideCompatibilityInfo m92736e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f66495c;
            if (overrideCompatibilityInfo == null) {
                m92733a(0);
            }
            return overrideCompatibilityInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public Result m92737c() {
            Result result = this.f66496a;
            if (result == null) {
                m92733a(5);
            }
            return result;
        }

        public String toString() {
            return this.f66496a + ": " + this.f66497b;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a */
    public static class C15413a implements KotlinTypeChecker.TypeConstructorEquality {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m92738b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        /* JADX INFO: renamed from: a */
        public boolean mo92739a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                m92738b(0);
            }
            if (typeConstructor2 == null) {
                m92738b(1);
            }
            return typeConstructor.equals(typeConstructor2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b */
    public static class C15414b<D> implements Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;>; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            return new Pair(callableDescriptor, callableDescriptor2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$c */
    public static class C15415c implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DeclarationDescriptor f66498a;

        public C15415c(DeclarationDescriptor declarationDescriptor) {
            this.f66498a = declarationDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return Boolean.valueOf(callableMemberDescriptor.mo89190b() == this.f66498a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$d */
    public static class C15416d implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$e */
    public static class C15417e implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ClassDescriptor f66499a;

        public C15417e(ClassDescriptor classDescriptor) {
            this.f66499a = classDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z = false;
            if (!DescriptorVisibilities.m89379g(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.m89380h(callableMemberDescriptor, this.f66499a, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$f */
    public static class C15418f implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$g */
    public static class C15419g implements Function1<CallableMemberDescriptor, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OverridingStrategy f66500a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CallableMemberDescriptor f66501b;

        public C15419g(OverridingStrategy overridingStrategy, CallableMemberDescriptor callableMemberDescriptor) {
            this.f66500a = overridingStrategy;
            this.f66501b = callableMemberDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f66500a.mo92693b(this.f66501b, callableMemberDescriptor);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$h */
    public static /* synthetic */ class C15420h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66502a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66503b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f66504c;

        static {
            int[] iArr = new int[Modality.values().length];
            f66504c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66504c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66504c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66504c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f66503b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66503b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66503b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f66502a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66502a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66502a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        C15413a c15413a = new C15413a();
        f66490g = c15413a;
        f66489f = new OverridingUtil(c15413a, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE, null);
    }

    public OverridingUtil(@NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator, @Nullable Function2<KotlinType, KotlinType, Boolean> function2) {
        if (typeConstructorEquality == null) {
            m92704a(5);
        }
        if (kotlinTypeRefiner == null) {
            m92704a(6);
        }
        if (kotlinTypePreparator == null) {
            m92704a(7);
        }
        this.f66493c = typeConstructorEquality;
        this.f66491a = kotlinTypeRefiner;
        this.f66492b = kotlinTypePreparator;
        this.f66494d = function2;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m92695A(@Nullable PropertyAccessorDescriptor propertyAccessorDescriptor, @Nullable PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return m92699H(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m92696B(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            m92704a(65);
        }
        if (callableDescriptor2 == null) {
            m92704a(66);
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!m92699H(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateM92730l = f66489f.m92730l(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return m92698G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM92730l);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            yg3.m215829a("Unexpected callable: ", callableDescriptor.getClass());
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        if (!m92695A(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
            return false;
        }
        if (propertyDescriptor.mo89511y() && propertyDescriptor2.mo89511y()) {
            return AbstractTypeChecker.INSTANCE.m93413m(typeCheckerStateM92730l, returnType.mo93516J0(), returnType2.mo93516J0());
        }
        return (propertyDescriptor.mo89511y() || !propertyDescriptor2.mo89511y()) && m92698G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM92730l);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m92697C(@NotNull CallableDescriptor callableDescriptor, @NotNull Collection<CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            m92704a(69);
        }
        if (collection == null) {
            m92704a(70);
        }
        Iterator<CallableDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (!m92696B(callableDescriptor, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m92698G(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @NotNull CallableDescriptor callableDescriptor2, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            m92704a(71);
        }
        if (kotlinType == null) {
            m92704a(72);
        }
        if (callableDescriptor2 == null) {
            m92704a(73);
        }
        if (kotlinType2 == null) {
            m92704a(74);
        }
        if (typeCheckerState == null) {
            m92704a(75);
        }
        return AbstractTypeChecker.INSTANCE.m93421u(typeCheckerState, kotlinType.mo93516J0(), kotlinType2.mo93516J0());
    }

    /* JADX INFO: renamed from: H */
    public static boolean m92699H(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            m92704a(67);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            m92704a(68);
        }
        Integer numM89376d = DescriptorVisibilities.m89376d(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return numM89376d == null || numM89376d.intValue() >= 0;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m92700I(@NotNull MemberDescriptor memberDescriptor, @NotNull MemberDescriptor memberDescriptor2, boolean z) {
        if (memberDescriptor == null) {
            m92704a(55);
        }
        if (memberDescriptor2 == null) {
            m92704a(56);
        }
        return !DescriptorVisibilities.m89379g(memberDescriptor2.getVisibility()) && DescriptorVisibilities.m89380h(memberDescriptor2, memberDescriptor, z);
    }

    /* JADX INFO: renamed from: J */
    public static <D extends CallableDescriptor> boolean m92701J(@NotNull D d, @NotNull D d2, boolean z, boolean z2) {
        if (d == null) {
            m92704a(13);
        }
        if (d2 == null) {
            m92704a(14);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.INSTANCE.m92615k(d.mo89336a(), d2.mo89336a(), z, z2)) {
            return true;
        }
        CallableDescriptor callableDescriptorMo89336a = d2.mo89336a();
        Iterator it = DescriptorUtils.m92654d(d).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.m92615k(callableDescriptorMo89336a, (CallableDescriptor) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static void m92702K(@NotNull CallableMemberDescriptor callableMemberDescriptor, @Nullable Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            m92704a(105);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.mo89338e()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.f64702g) {
                m92702K(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.f64702g) {
            return;
        }
        DescriptorVisibility descriptorVisibilityM92711h = m92711h(callableMemberDescriptor);
        if (descriptorVisibilityM92711h == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.f64700e;
        } else {
            descriptorVisibility = descriptorVisibilityM92711h;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).m89756W0(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).mo89475r().iterator();
            while (it.hasNext()) {
                m92702K(it.next(), descriptorVisibilityM92711h == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).m89651c1(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.m89735H0(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.mo89473d0().getVisibility()) {
            propertyAccessorDescriptorImpl.m89733F0(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public static <H> H m92703L(@NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1) {
        H h;
        if (collection == null) {
            m92704a(76);
        }
        if (function1 == null) {
            m92704a(77);
        }
        if (collection.size() == 1) {
            H h2 = (H) CollectionsKt.first(collection);
            if (h2 == null) {
                m92704a(78);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        List map = CollectionsKt.map(collection, function1);
        H h3 = (H) CollectionsKt.first(collection);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h3);
        for (H h4 : collection) {
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(h4);
            if (m92697C(callableDescriptorInvoke2, map)) {
                arrayList.add(h4);
            }
            if (m92696B(callableDescriptorInvoke2, callableDescriptorInvoke) && !m92696B(callableDescriptorInvoke, callableDescriptorInvoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m92704a(79);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) CollectionsKt.first((Iterable) arrayList);
            if (h5 == null) {
                m92704a(80);
            }
            return h5;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                h = null;
                break;
            }
            h = (H) it.next();
        } while (FlexibleTypesKt.m93497b(function1.invoke(h).getReturnType()));
        if (h != null) {
            return h;
        }
        H h6 = (H) CollectionsKt.first((Iterable) arrayList);
        if (h6 == null) {
            m92704a(82);
        }
        return h6;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92704a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case EACTags.FILE_REFERENCE /* 81 */:
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case EACTags.FILE_REFERENCE /* 81 */:
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case EACTags.FILE_REFERENCE /* 81 */:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case 88:
            case 89:
            case 90:
            case EACTags.HEADER_LIST /* 93 */:
            case Opcodes.IADD /* 96 */:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = LovePlanetStage.result;
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
            case 87:
            case EACTags.LOGIN_DATA /* 94 */:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case EACTags.NAME /* 91 */:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case EACTags.DISCRETIONARY_DATA /* 83 */:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case EACTags.TAG_LIST /* 92 */:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case 102:
                objArr[0] = "overrider";
                break;
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case EACTags.FILE_REFERENCE /* 81 */:
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = PushService.COMMAND_CREATE;
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case EACTags.FILE_REFERENCE /* 81 */:
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
            case 88:
            case 89:
            case 90:
            case EACTags.HEADER_LIST /* 93 */:
            case Opcodes.IADD /* 96 */:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case EACTags.DISCRETIONARY_DATA /* 83 */:
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case EACTags.TRACK1_APPLICATION /* 86 */:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case EACTags.NAME /* 91 */:
            case EACTags.TAG_LIST /* 92 */:
                objArr[2] = "getMinimalModality";
                break;
            case EACTags.LOGIN_DATA /* 94 */:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case EACTags.FCP_TEMPLATE /* 98 */:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case EACTags.FILE_REFERENCE /* 81 */:
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92705b(@NotNull Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            m92704a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt.all(collection, new C15415c(collection.iterator().next().mo89190b()));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m92706c(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, @NotNull TypeCheckerState typeCheckerState) {
        if (typeParameterDescriptor == null) {
            m92704a(47);
        }
        if (typeParameterDescriptor2 == null) {
            m92704a(48);
        }
        if (typeCheckerState == null) {
            m92704a(49);
        }
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (KotlinType kotlinType : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (m92707d(kotlinType, (KotlinType) listIterator.next(), typeCheckerState)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m92707d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            m92704a(44);
        }
        if (kotlinType2 == null) {
            m92704a(45);
        }
        if (typeCheckerState == null) {
            m92704a(46);
        }
        if (KotlinTypeKt.m93535a(kotlinType) && KotlinTypeKt.m93535a(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.m93413m(typeCheckerState, kotlinType.mo93516J0(), kotlinType2.mo93516J0());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static OverrideCompatibilityInfo m92708e(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if ((callableDescriptor.mo89337b0() == null) != (callableDescriptor2.mo89337b0() == null)) {
            return OverrideCompatibilityInfo.m92735d("Receiver presence mismatch");
        }
        if (callableDescriptor.mo89339g().size() != callableDescriptor2.mo89339g().size()) {
            return OverrideCompatibilityInfo.m92735d("Value parameter number mismatch");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m92709f(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            m92704a(17);
        }
        if (set == null) {
            m92704a(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else {
            if (callableMemberDescriptor.mo89338e().isEmpty()) {
                xtq0.m213103a("No overridden descriptors found for (fake override) ", callableMemberDescriptor);
                return;
            }
            Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.mo89338e().iterator();
            while (it.hasNext()) {
                m92709f(it.next(), set);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static List<KotlinType> m92710g(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableDescriptor.mo89337b0();
        ArrayList arrayList = new ArrayList();
        if (receiverParameterDescriptorMo89337b0 != null) {
            arrayList.add(receiverParameterDescriptorMo89337b0.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.mo89339g().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static DescriptorVisibility m92711h(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m92704a(106);
        }
        Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
        DescriptorVisibility descriptorVisibilityM92722u = m92722u(collectionMo89338e);
        if (descriptorVisibilityM92722u == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return descriptorVisibilityM92722u.mo89368f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionMo89338e) {
            if (callableMemberDescriptor2.mo89194i() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(descriptorVisibilityM92722u)) {
                return null;
            }
        }
        return descriptorVisibilityM92722u;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static OverridingUtil m92712i(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            m92704a(3);
        }
        if (typeConstructorEquality == null) {
            m92704a(4);
        }
        return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m92713j(@NotNull Collection<CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (collection == null) {
            m92704a(83);
        }
        if (classDescriptor == null) {
            m92704a(84);
        }
        if (overridingStrategy == null) {
            m92704a(85);
        }
        Collection<CallableMemberDescriptor> collectionM92721t = m92721t(classDescriptor, collection);
        boolean zIsEmpty = collectionM92721t.isEmpty();
        if (!zIsEmpty) {
            collection = collectionM92721t;
        }
        CallableMemberDescriptor callableMemberDescriptorMo89343a0 = ((CallableMemberDescriptor) m92703L(collection, new C15416d())).mo89343a0(classDescriptor, m92716n(collection, classDescriptor), zIsEmpty ? DescriptorVisibilities.f64703h : DescriptorVisibilities.f64702g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.mo90403d(callableMemberDescriptorMo89343a0, collection);
        overridingStrategy.mo89625a(callableMemberDescriptorMo89343a0);
    }

    /* JADX INFO: renamed from: k */
    public static void m92714k(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection, @NotNull OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            m92704a(62);
        }
        if (collection == null) {
            m92704a(63);
        }
        if (overridingStrategy == null) {
            m92704a(64);
        }
        if (m92705b(collection)) {
            Iterator<CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                m92713j(Collections.singleton(it.next()), classDescriptor, overridingStrategy);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m92713j(m92718q(VisibilityUtilKt.m92778a(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static OverridingUtil m92715m(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m92704a(0);
        }
        return new OverridingUtil(f66490g, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static Modality m92716n(@NotNull Collection<CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor) {
        if (collection == null) {
            m92704a(86);
        }
        if (classDescriptor == null) {
            m92704a(87);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = C15420h.f66504c[callableMemberDescriptor.mo89194i().ordinal()];
            if (i == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    m92704a(88);
                }
                return modality;
            }
            if (i == 2) {
                xtq0.m213103a("Member cannot have SEALED modality: ", callableMemberDescriptor);
                return null;
            }
            if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (classDescriptor.mo89198n0() && classDescriptor.mo89194i() != Modality.ABSTRACT && classDescriptor.mo89194i() != Modality.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                m92704a(89);
            }
            return modality2;
        }
        if (!z2 && z3) {
            Modality modalityMo89194i = z ? classDescriptor.mo89194i() : Modality.ABSTRACT;
            if (modalityMo89194i == null) {
                m92704a(90);
            }
            return modalityMo89194i;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m92726z(it.next()));
        }
        return m92725y(m92719r(hashSet), z, classDescriptor.mo89194i());
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static <H> Collection<H> m92717p(@NotNull H h, @NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1, @NotNull Function1<H, Unit> function2) {
        if (h == null) {
            m92704a(97);
        }
        if (collection == null) {
            m92704a(98);
        }
        if (function1 == null) {
            m92704a(99);
        }
        if (function2 == null) {
            m92704a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultM92724x = m92724x(callableDescriptorInvoke, callableDescriptorInvoke2);
                if (resultM92724x == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultM92724x == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static Collection<CallableMemberDescriptor> m92718q(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Queue<CallableMemberDescriptor> queue, @NotNull OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            m92704a(102);
        }
        if (queue == null) {
            m92704a(103);
        }
        if (overridingStrategy == null) {
            m92704a(104);
        }
        return m92717p(callableMemberDescriptor, queue, new C15418f(), new C15419g(overridingStrategy, callableMemberDescriptor));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static <D extends CallableDescriptor> Set<D> m92719r(@NotNull Set<D> set) {
        if (set == null) {
            m92704a(8);
        }
        return m92720s(set, !set.isEmpty() && DescriptorUtilsKt.m92883y(DescriptorUtilsKt.m92877s(set.iterator().next())), null, new C15414b());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static <D> Set<D> m92720s(@NotNull Set<D> set, boolean z, @Nullable Function0<?> function0, @NotNull Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            m92704a(9);
        }
        if (function2 == null) {
            m92704a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<CallableDescriptor, CallableDescriptor> pairInvoke = function2.invoke(obj, (Object) it.next());
                CallableDescriptor callableDescriptorComponent1 = pairInvoke.component1();
                CallableDescriptor callableDescriptorComponent2 = pairInvoke.component2();
                if (!m92701J(callableDescriptorComponent1, callableDescriptorComponent2, z, true)) {
                    if (m92701J(callableDescriptorComponent2, callableDescriptorComponent1, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static Collection<CallableMemberDescriptor> m92721t(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            m92704a(94);
        }
        if (collection == null) {
            m92704a(95);
        }
        List listFilter = CollectionsKt.filter(collection, new C15417e(classDescriptor));
        if (listFilter == null) {
            m92704a(96);
        }
        return listFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static DescriptorVisibility m92722u(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            m92704a(107);
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.f64707l;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer numM89376d = DescriptorVisibilities.m89376d(visibility, descriptorVisibility);
                    if (numM89376d == null) {
                        break;
                    }
                    if (numM89376d.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numM89376d2 = DescriptorVisibilities.m89376d(descriptorVisibility, it2.next().getVisibility());
            if (numM89376d2 == null || numM89376d2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static OverrideCompatibilityInfo m92723w(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            m92704a(38);
        }
        if (callableDescriptor2 == null) {
            m92704a(39);
        }
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.m92735d("Member kind mismatch");
        }
        if (!z2 && !z) {
            ypg0.m217021a("This type of CallableDescriptor cannot be checked for overridability: ", callableDescriptor);
            return null;
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.m92735d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92708e = m92708e(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoM92708e != null) {
            return overrideCompatibilityInfoM92708e;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static OverrideCompatibilityInfo.Result m92724x(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = f66489f;
        OverrideCompatibilityInfo.Result resultM92737c = overridingUtil.m92727D(callableDescriptor2, callableDescriptor, null).m92737c();
        OverrideCompatibilityInfo.Result resultM92737c2 = overridingUtil.m92727D(callableDescriptor, callableDescriptor2, null).m92737c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultM92737c == result && resultM92737c2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (resultM92737c == result2 || resultM92737c2 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static Modality m92725y(@NotNull Collection<CallableMemberDescriptor> collection, boolean z, @NotNull Modality modality) {
        if (collection == null) {
            m92704a(91);
        }
        if (modality == null) {
            m92704a(92);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality modalityMo89194i = (z && callableMemberDescriptor.mo89194i() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.mo89194i();
            if (modalityMo89194i.compareTo(modality2) < 0) {
                modality2 = modalityMo89194i;
            }
        }
        if (modality2 == null) {
            m92704a(93);
        }
        return modality2;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static Set<CallableMemberDescriptor> m92726z(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m92704a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m92709f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public OverrideCompatibilityInfo m92727D(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            m92704a(19);
        }
        if (callableDescriptor2 == null) {
            m92704a(20);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92728E = m92728E(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoM92728E == null) {
            m92704a(21);
        }
        return overrideCompatibilityInfoM92728E;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public OverrideCompatibilityInfo m92728E(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            m92704a(22);
        }
        if (callableDescriptor2 == null) {
            m92704a(23);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92729F = m92729F(callableDescriptor, callableDescriptor2, z);
        boolean z2 = overrideCompatibilityInfoM92729F.m92737c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f66488e) {
            if (externalOverridabilityCondition.mo90267a() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.mo90267a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = C15420h.f66502a[externalOverridabilityCondition.mo90268b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM92735d = OverrideCompatibilityInfo.m92735d("External condition");
                    if (overrideCompatibilityInfoM92735d == null) {
                        m92704a(24);
                    }
                    return overrideCompatibilityInfoM92735d;
                }
            }
        }
        if (!z2) {
            return overrideCompatibilityInfoM92729F;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f66488e) {
            if (externalOverridabilityCondition2.mo90267a() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = C15420h.f66502a[externalOverridabilityCondition2.mo90268b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    m5j.m157106a("Contract violation in ", externalOverridabilityCondition2.getClass().getName(), " condition. It's not supposed to end with success");
                    return null;
                }
                if (i2 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM92735d2 = OverrideCompatibilityInfo.m92735d("External condition");
                    if (overrideCompatibilityInfoM92735d2 == null) {
                        m92704a(26);
                    }
                    return overrideCompatibilityInfoM92735d2;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92736e = OverrideCompatibilityInfo.m92736e();
        if (overrideCompatibilityInfoM92736e == null) {
            m92704a(27);
        }
        return overrideCompatibilityInfoM92736e;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public OverrideCompatibilityInfo m92729F(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            m92704a(28);
        }
        if (callableDescriptor2 == null) {
            m92704a(29);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92723w = m92723w(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoM92723w != null) {
            return overrideCompatibilityInfoM92723w;
        }
        List<KotlinType> listM92710g = m92710g(callableDescriptor);
        List<KotlinType> listM92710g2 = m92710g(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < listM92710g.size()) {
                if (!KotlinTypeChecker.f66972a.mo93794a(listM92710g.get(i), listM92710g2.get(i))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM92735d = OverrideCompatibilityInfo.m92735d("Type parameter number mismatch");
                    if (overrideCompatibilityInfoM92735d == null) {
                        m92704a(31);
                    }
                    return overrideCompatibilityInfoM92735d;
                }
                i++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoM92734b = OverrideCompatibilityInfo.m92734b("Type parameter number mismatch");
            if (overrideCompatibilityInfoM92734b == null) {
                m92704a(32);
            }
            return overrideCompatibilityInfoM92734b;
        }
        TypeCheckerState typeCheckerStateM92730l = m92730l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m92706c(typeParameters.get(i2), typeParameters2.get(i2), typeCheckerStateM92730l)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM92735d2 = OverrideCompatibilityInfo.m92735d("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoM92735d2 == null) {
                    m92704a(33);
                }
                return overrideCompatibilityInfoM92735d2;
            }
        }
        while (i < listM92710g.size()) {
            if (!m92707d(listM92710g.get(i), listM92710g2.get(i), typeCheckerStateM92730l)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM92735d3 = OverrideCompatibilityInfo.m92735d("Value parameter type mismatch");
                if (overrideCompatibilityInfoM92735d3 == null) {
                    m92704a(34);
                }
                return overrideCompatibilityInfoM92735d3;
            }
            i++;
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            OverrideCompatibilityInfo overrideCompatibilityInfoM92734b2 = OverrideCompatibilityInfo.m92734b("Incompatible suspendability");
            if (overrideCompatibilityInfoM92734b2 == null) {
                m92704a(35);
            }
            return overrideCompatibilityInfoM92734b2;
        }
        if (z) {
            KotlinType returnType = callableDescriptor.getReturnType();
            KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!KotlinTypeKt.m93535a(returnType2) || !KotlinTypeKt.m93535a(returnType)) && !AbstractTypeChecker.INSTANCE.m93421u(typeCheckerStateM92730l, returnType2.mo93516J0(), returnType.mo93516J0()))) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM92734b3 = OverrideCompatibilityInfo.m92734b("Return type mismatch");
                if (overrideCompatibilityInfoM92734b3 == null) {
                    m92704a(36);
                }
                return overrideCompatibilityInfoM92734b3;
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM92736e = OverrideCompatibilityInfo.m92736e();
        if (overrideCompatibilityInfoM92736e == null) {
            m92704a(37);
        }
        return overrideCompatibilityInfoM92736e;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TypeCheckerState m92730l(@NotNull List<TypeParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            m92704a(40);
        }
        if (list2 == null) {
            m92704a(41);
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateMo91143e0 = new OverridingUtilTypeSystemContext(null, this.f66493c, this.f66491a, this.f66492b, this.f66494d).mo91143e0(true, true, false);
            if (typeCheckerStateMo91143e0 == null) {
                m92704a(42);
            }
            return typeCheckerStateMo91143e0;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).mo89196l(), list2.get(i).mo89196l());
        }
        TypeCheckerState typeCheckerStateMo91143e1 = new OverridingUtilTypeSystemContext(map, this.f66493c, this.f66491a, this.f66492b, this.f66494d).mo91143e0(true, true, false);
        if (typeCheckerStateMo91143e1 == null) {
            m92704a(43);
        }
        return typeCheckerStateMo91143e1;
    }

    /* JADX INFO: renamed from: o */
    public final Collection<CallableMemberDescriptor> m92731o(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            m92704a(57);
        }
        if (collection == null) {
            m92704a(58);
        }
        if (classDescriptor == null) {
            m92704a(59);
        }
        if (overridingStrategy == null) {
            m92704a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        SmartSet smartSetM94110a = SmartSet.m94110a();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result resultM92737c = m92727D(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).m92737c();
            boolean zM92700I = m92700I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i = C15420h.f66503b[resultM92737c.ordinal()];
            if (i == 1) {
                if (zM92700I) {
                    smartSetM94110a.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (zM92700I) {
                    overridingStrategy.mo92694c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.mo90403d(callableMemberDescriptor, smartSetM94110a);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public void m92732v(@NotNull Name name, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull Collection<? extends CallableMemberDescriptor> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (name == null) {
            m92704a(50);
        }
        if (collection == null) {
            m92704a(51);
        }
        if (collection2 == null) {
            m92704a(52);
        }
        if (classDescriptor == null) {
            m92704a(53);
        }
        if (overridingStrategy == null) {
            m92704a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(m92731o(it.next(), collection, classDescriptor, overridingStrategy));
        }
        m92714k(classDescriptor, linkedHashSet, overridingStrategy);
    }
}
