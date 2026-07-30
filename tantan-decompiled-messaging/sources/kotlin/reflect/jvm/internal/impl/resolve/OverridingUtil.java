package kotlin.reflect.jvm.internal.impl.resolve;

import com.alibaba.fastjson.asm.Opcodes;
import com.cosmos.photon.push.service.PushService;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
import p149l.kg3;
import p149l.qhg0;
import p149l.r2j;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public class OverridingUtil {

    /* JADX INFO: renamed from: e */
    public static final List<ExternalOverridabilityCondition> f65814e = CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final OverridingUtil f65815f;

    /* JADX INFO: renamed from: g */
    public static final KotlinTypeChecker.TypeConstructorEquality f65816g;

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f65817a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypePreparator f65818b;

    /* JADX INFO: renamed from: c */
    public final KotlinTypeChecker.TypeConstructorEquality f65819c;

    /* JADX INFO: renamed from: d */
    public final Function2<KotlinType, KotlinType, Boolean> f65820d;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: c */
        public static final OverrideCompatibilityInfo f65821c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        public final Result f65822a;

        /* JADX INFO: renamed from: b */
        public final String f65823b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(@NotNull Result result, @NotNull String str) {
            if (result == null) {
                m91842a(3);
            }
            if (str == null) {
                m91842a(4);
            }
            this.f65822a = result;
            this.f65823b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m91842a(int i) {
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
        public static OverrideCompatibilityInfo m91843b(@NotNull String str) {
            if (str == null) {
                m91842a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static OverrideCompatibilityInfo m91844d(@NotNull String str) {
            if (str == null) {
                m91842a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static OverrideCompatibilityInfo m91845e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f65821c;
            if (overrideCompatibilityInfo == null) {
                m91842a(0);
            }
            return overrideCompatibilityInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public Result m91846c() {
            Result result = this.f65822a;
            if (result == null) {
                m91842a(5);
            }
            return result;
        }

        public String toString() {
            return this.f65822a + ": " + this.f65823b;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a */
    public static class C15306a implements KotlinTypeChecker.TypeConstructorEquality {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m91847b(int i) {
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
        public boolean mo91848a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                m91847b(0);
            }
            if (typeConstructor2 == null) {
                m91847b(1);
            }
            return typeConstructor.equals(typeConstructor2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b */
    public static class C15307b<D> implements Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;>; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            return new Pair(callableDescriptor, callableDescriptor2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$c */
    public static class C15308c implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DeclarationDescriptor f65824a;

        public C15308c(DeclarationDescriptor declarationDescriptor) {
            this.f65824a = declarationDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return Boolean.valueOf(callableMemberDescriptor.mo88299b() == this.f65824a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$d */
    public static class C15309d implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$e */
    public static class C15310e implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ClassDescriptor f65825a;

        public C15310e(ClassDescriptor classDescriptor) {
            this.f65825a = classDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z = false;
            if (!DescriptorVisibilities.m88488g(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.m88489h(callableMemberDescriptor, this.f65825a, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$f */
    public static class C15311f implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$g */
    public static class C15312g implements Function1<CallableMemberDescriptor, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OverridingStrategy f65826a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CallableMemberDescriptor f65827b;

        public C15312g(OverridingStrategy overridingStrategy, CallableMemberDescriptor callableMemberDescriptor) {
            this.f65826a = overridingStrategy;
            this.f65827b = callableMemberDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f65826a.mo91802b(this.f65827b, callableMemberDescriptor);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$h */
    public static /* synthetic */ class C15313h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65828a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f65829b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f65830c;

        static {
            int[] iArr = new int[Modality.values().length];
            f65830c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65830c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65830c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65830c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f65829b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65829b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65829b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f65828a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65828a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f65828a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        C15306a c15306a = new C15306a();
        f65816g = c15306a;
        f65815f = new OverridingUtil(c15306a, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE, null);
    }

    public OverridingUtil(@NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator, @Nullable Function2<KotlinType, KotlinType, Boolean> function2) {
        if (typeConstructorEquality == null) {
            m91813a(5);
        }
        if (kotlinTypeRefiner == null) {
            m91813a(6);
        }
        if (kotlinTypePreparator == null) {
            m91813a(7);
        }
        this.f65819c = typeConstructorEquality;
        this.f65817a = kotlinTypeRefiner;
        this.f65818b = kotlinTypePreparator;
        this.f65820d = function2;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m91804A(@Nullable PropertyAccessorDescriptor propertyAccessorDescriptor, @Nullable PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return m91808H(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m91805B(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            m91813a(65);
        }
        if (callableDescriptor2 == null) {
            m91813a(66);
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!m91808H(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateM91839l = f65815f.m91839l(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return m91807G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM91839l);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            kg3.m145878a("Unexpected callable: ", callableDescriptor.getClass());
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        if (!m91804A(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
            return false;
        }
        if (propertyDescriptor.mo88620y() && propertyDescriptor2.mo88620y()) {
            return AbstractTypeChecker.INSTANCE.m92522m(typeCheckerStateM91839l, returnType.mo92625J0(), returnType2.mo92625J0());
        }
        return (propertyDescriptor.mo88620y() || !propertyDescriptor2.mo88620y()) && m91807G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM91839l);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m91806C(@NotNull CallableDescriptor callableDescriptor, @NotNull Collection<CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            m91813a(69);
        }
        if (collection == null) {
            m91813a(70);
        }
        Iterator<CallableDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (!m91805B(callableDescriptor, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m91807G(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @NotNull CallableDescriptor callableDescriptor2, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            m91813a(71);
        }
        if (kotlinType == null) {
            m91813a(72);
        }
        if (callableDescriptor2 == null) {
            m91813a(73);
        }
        if (kotlinType2 == null) {
            m91813a(74);
        }
        if (typeCheckerState == null) {
            m91813a(75);
        }
        return AbstractTypeChecker.INSTANCE.m92530u(typeCheckerState, kotlinType.mo92625J0(), kotlinType2.mo92625J0());
    }

    /* JADX INFO: renamed from: H */
    public static boolean m91808H(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            m91813a(67);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            m91813a(68);
        }
        Integer numM88485d = DescriptorVisibilities.m88485d(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return numM88485d == null || numM88485d.intValue() >= 0;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m91809I(@NotNull MemberDescriptor memberDescriptor, @NotNull MemberDescriptor memberDescriptor2, boolean z) {
        if (memberDescriptor == null) {
            m91813a(55);
        }
        if (memberDescriptor2 == null) {
            m91813a(56);
        }
        return !DescriptorVisibilities.m88488g(memberDescriptor2.getVisibility()) && DescriptorVisibilities.m88489h(memberDescriptor2, memberDescriptor, z);
    }

    /* JADX INFO: renamed from: J */
    public static <D extends CallableDescriptor> boolean m91810J(@NotNull D d, @NotNull D d2, boolean z, boolean z2) {
        if (d == null) {
            m91813a(13);
        }
        if (d2 == null) {
            m91813a(14);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.INSTANCE.m91724k(d.mo88445a(), d2.mo88445a(), z, z2)) {
            return true;
        }
        CallableDescriptor callableDescriptorMo88445a = d2.mo88445a();
        Iterator it = DescriptorUtils.m91763d(d).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.m91724k(callableDescriptorMo88445a, (CallableDescriptor) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static void m91811K(@NotNull CallableMemberDescriptor callableMemberDescriptor, @Nullable Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            m91813a(105);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.mo88447e()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.f64028g) {
                m91811K(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.f64028g) {
            return;
        }
        DescriptorVisibility descriptorVisibilityM91820h = m91820h(callableMemberDescriptor);
        if (descriptorVisibilityM91820h == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.f64026e;
        } else {
            descriptorVisibility = descriptorVisibilityM91820h;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).m88865W0(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).mo88584r().iterator();
            while (it.hasNext()) {
                m91811K(it.next(), descriptorVisibilityM91820h == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).m88760c1(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.m88844H0(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.mo88582d0().getVisibility()) {
            propertyAccessorDescriptorImpl.m88842F0(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public static <H> H m91812L(@NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1) {
        H h;
        if (collection == null) {
            m91813a(76);
        }
        if (function1 == null) {
            m91813a(77);
        }
        if (collection.size() == 1) {
            H h2 = (H) CollectionsKt.first(collection);
            if (h2 == null) {
                m91813a(78);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        List map = CollectionsKt.map(collection, function1);
        H h3 = (H) CollectionsKt.first(collection);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h3);
        for (H h4 : collection) {
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(h4);
            if (m91806C(callableDescriptorInvoke2, map)) {
                arrayList.add(h4);
            }
            if (m91805B(callableDescriptorInvoke2, callableDescriptorInvoke) && !m91805B(callableDescriptorInvoke, callableDescriptorInvoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m91813a(79);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) CollectionsKt.first((Iterable) arrayList);
            if (h5 == null) {
                m91813a(80);
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
        } while (FlexibleTypesKt.m92606b(function1.invoke(h).getReturnType()));
        if (h != null) {
            return h;
        }
        H h6 = (H) CollectionsKt.first((Iterable) arrayList);
        if (h6 == null) {
            m91813a(82);
        }
        return h6;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m91813a(int i) {
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
    public static boolean m91814b(@NotNull Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            m91813a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt.all(collection, new C15308c(collection.iterator().next().mo88299b()));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m91815c(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, @NotNull TypeCheckerState typeCheckerState) {
        if (typeParameterDescriptor == null) {
            m91813a(47);
        }
        if (typeParameterDescriptor2 == null) {
            m91813a(48);
        }
        if (typeCheckerState == null) {
            m91813a(49);
        }
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (KotlinType kotlinType : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (m91816d(kotlinType, (KotlinType) listIterator.next(), typeCheckerState)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m91816d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            m91813a(44);
        }
        if (kotlinType2 == null) {
            m91813a(45);
        }
        if (typeCheckerState == null) {
            m91813a(46);
        }
        if (KotlinTypeKt.m92644a(kotlinType) && KotlinTypeKt.m92644a(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.m92522m(typeCheckerState, kotlinType.mo92625J0(), kotlinType2.mo92625J0());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static OverrideCompatibilityInfo m91817e(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if ((callableDescriptor.mo88446b0() == null) != (callableDescriptor2.mo88446b0() == null)) {
            return OverrideCompatibilityInfo.m91844d("Receiver presence mismatch");
        }
        if (callableDescriptor.mo88448g().size() != callableDescriptor2.mo88448g().size()) {
            return OverrideCompatibilityInfo.m91844d("Value parameter number mismatch");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m91818f(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            m91813a(17);
        }
        if (set == null) {
            m91813a(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else {
            if (callableMemberDescriptor.mo88447e().isEmpty()) {
                rkq0.m179764a("No overridden descriptors found for (fake override) ", callableMemberDescriptor);
                return;
            }
            Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.mo88447e().iterator();
            while (it.hasNext()) {
                m91818f(it.next(), set);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static List<KotlinType> m91819g(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableDescriptor.mo88446b0();
        ArrayList arrayList = new ArrayList();
        if (receiverParameterDescriptorMo88446b0 != null) {
            arrayList.add(receiverParameterDescriptorMo88446b0.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.mo88448g().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static DescriptorVisibility m91820h(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m91813a(106);
        }
        Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
        DescriptorVisibility descriptorVisibilityM91831u = m91831u(collectionMo88447e);
        if (descriptorVisibilityM91831u == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return descriptorVisibilityM91831u.mo88477f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionMo88447e) {
            if (callableMemberDescriptor2.mo88303i() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(descriptorVisibilityM91831u)) {
                return null;
            }
        }
        return descriptorVisibilityM91831u;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static OverridingUtil m91821i(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            m91813a(3);
        }
        if (typeConstructorEquality == null) {
            m91813a(4);
        }
        return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m91822j(@NotNull Collection<CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (collection == null) {
            m91813a(83);
        }
        if (classDescriptor == null) {
            m91813a(84);
        }
        if (overridingStrategy == null) {
            m91813a(85);
        }
        Collection<CallableMemberDescriptor> collectionM91830t = m91830t(classDescriptor, collection);
        boolean zIsEmpty = collectionM91830t.isEmpty();
        if (!zIsEmpty) {
            collection = collectionM91830t;
        }
        CallableMemberDescriptor callableMemberDescriptorMo88452a0 = ((CallableMemberDescriptor) m91812L(collection, new C15309d())).mo88452a0(classDescriptor, m91825n(collection, classDescriptor), zIsEmpty ? DescriptorVisibilities.f64029h : DescriptorVisibilities.f64028g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.mo89512d(callableMemberDescriptorMo88452a0, collection);
        overridingStrategy.mo88734a(callableMemberDescriptorMo88452a0);
    }

    /* JADX INFO: renamed from: k */
    public static void m91823k(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection, @NotNull OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            m91813a(62);
        }
        if (collection == null) {
            m91813a(63);
        }
        if (overridingStrategy == null) {
            m91813a(64);
        }
        if (m91814b(collection)) {
            Iterator<CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                m91822j(Collections.singleton(it.next()), classDescriptor, overridingStrategy);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m91822j(m91827q(VisibilityUtilKt.m91887a(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static OverridingUtil m91824m(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m91813a(0);
        }
        return new OverridingUtil(f65816g, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static Modality m91825n(@NotNull Collection<CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor) {
        if (collection == null) {
            m91813a(86);
        }
        if (classDescriptor == null) {
            m91813a(87);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = C15313h.f65830c[callableMemberDescriptor.mo88303i().ordinal()];
            if (i == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    m91813a(88);
                }
                return modality;
            }
            if (i == 2) {
                rkq0.m179764a("Member cannot have SEALED modality: ", callableMemberDescriptor);
                return null;
            }
            if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (classDescriptor.mo88307n0() && classDescriptor.mo88303i() != Modality.ABSTRACT && classDescriptor.mo88303i() != Modality.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                m91813a(89);
            }
            return modality2;
        }
        if (!z2 && z3) {
            Modality modalityMo88303i = z ? classDescriptor.mo88303i() : Modality.ABSTRACT;
            if (modalityMo88303i == null) {
                m91813a(90);
            }
            return modalityMo88303i;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m91835z(it.next()));
        }
        return m91834y(m91828r(hashSet), z, classDescriptor.mo88303i());
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static <H> Collection<H> m91826p(@NotNull H h, @NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1, @NotNull Function1<H, Unit> function2) {
        if (h == null) {
            m91813a(97);
        }
        if (collection == null) {
            m91813a(98);
        }
        if (function1 == null) {
            m91813a(99);
        }
        if (function2 == null) {
            m91813a(100);
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
                OverrideCompatibilityInfo.Result resultM91833x = m91833x(callableDescriptorInvoke, callableDescriptorInvoke2);
                if (resultM91833x == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultM91833x == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static Collection<CallableMemberDescriptor> m91827q(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Queue<CallableMemberDescriptor> queue, @NotNull OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            m91813a(102);
        }
        if (queue == null) {
            m91813a(103);
        }
        if (overridingStrategy == null) {
            m91813a(104);
        }
        return m91826p(callableMemberDescriptor, queue, new C15311f(), new C15312g(overridingStrategy, callableMemberDescriptor));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static <D extends CallableDescriptor> Set<D> m91828r(@NotNull Set<D> set) {
        if (set == null) {
            m91813a(8);
        }
        return m91829s(set, !set.isEmpty() && DescriptorUtilsKt.m91992y(DescriptorUtilsKt.m91986s(set.iterator().next())), null, new C15307b());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static <D> Set<D> m91829s(@NotNull Set<D> set, boolean z, @Nullable Function0<?> function0, @NotNull Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            m91813a(9);
        }
        if (function2 == null) {
            m91813a(10);
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
                if (!m91810J(callableDescriptorComponent1, callableDescriptorComponent2, z, true)) {
                    if (m91810J(callableDescriptorComponent2, callableDescriptorComponent1, z, true)) {
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
    public static Collection<CallableMemberDescriptor> m91830t(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            m91813a(94);
        }
        if (collection == null) {
            m91813a(95);
        }
        List listFilter = CollectionsKt.filter(collection, new C15310e(classDescriptor));
        if (listFilter == null) {
            m91813a(96);
        }
        return listFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static DescriptorVisibility m91831u(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            m91813a(107);
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.f64033l;
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
                    Integer numM88485d = DescriptorVisibilities.m88485d(visibility, descriptorVisibility);
                    if (numM88485d == null) {
                        break;
                    }
                    if (numM88485d.intValue() > 0) {
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
            Integer numM88485d2 = DescriptorVisibilities.m88485d(descriptorVisibility, it2.next().getVisibility());
            if (numM88485d2 == null || numM88485d2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static OverrideCompatibilityInfo m91832w(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            m91813a(38);
        }
        if (callableDescriptor2 == null) {
            m91813a(39);
        }
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.m91844d("Member kind mismatch");
        }
        if (!z2 && !z) {
            qhg0.m174539a("This type of CallableDescriptor cannot be checked for overridability: ", callableDescriptor);
            return null;
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.m91844d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91817e = m91817e(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoM91817e != null) {
            return overrideCompatibilityInfoM91817e;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static OverrideCompatibilityInfo.Result m91833x(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = f65815f;
        OverrideCompatibilityInfo.Result resultM91846c = overridingUtil.m91836D(callableDescriptor2, callableDescriptor, null).m91846c();
        OverrideCompatibilityInfo.Result resultM91846c2 = overridingUtil.m91836D(callableDescriptor, callableDescriptor2, null).m91846c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultM91846c == result && resultM91846c2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (resultM91846c == result2 || resultM91846c2 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static Modality m91834y(@NotNull Collection<CallableMemberDescriptor> collection, boolean z, @NotNull Modality modality) {
        if (collection == null) {
            m91813a(91);
        }
        if (modality == null) {
            m91813a(92);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality modalityMo88303i = (z && callableMemberDescriptor.mo88303i() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.mo88303i();
            if (modalityMo88303i.compareTo(modality2) < 0) {
                modality2 = modalityMo88303i;
            }
        }
        if (modality2 == null) {
            m91813a(93);
        }
        return modality2;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static Set<CallableMemberDescriptor> m91835z(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m91813a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m91818f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public OverrideCompatibilityInfo m91836D(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            m91813a(19);
        }
        if (callableDescriptor2 == null) {
            m91813a(20);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91837E = m91837E(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoM91837E == null) {
            m91813a(21);
        }
        return overrideCompatibilityInfoM91837E;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public OverrideCompatibilityInfo m91837E(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            m91813a(22);
        }
        if (callableDescriptor2 == null) {
            m91813a(23);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91838F = m91838F(callableDescriptor, callableDescriptor2, z);
        boolean z2 = overrideCompatibilityInfoM91838F.m91846c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f65814e) {
            if (externalOverridabilityCondition.mo89376a() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.mo89376a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = C15313h.f65828a[externalOverridabilityCondition.mo89377b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM91844d = OverrideCompatibilityInfo.m91844d("External condition");
                    if (overrideCompatibilityInfoM91844d == null) {
                        m91813a(24);
                    }
                    return overrideCompatibilityInfoM91844d;
                }
            }
        }
        if (!z2) {
            return overrideCompatibilityInfoM91838F;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f65814e) {
            if (externalOverridabilityCondition2.mo89376a() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = C15313h.f65828a[externalOverridabilityCondition2.mo89377b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    r2j.m177608a("Contract violation in ", externalOverridabilityCondition2.getClass().getName(), " condition. It's not supposed to end with success");
                    return null;
                }
                if (i2 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM91844d2 = OverrideCompatibilityInfo.m91844d("External condition");
                    if (overrideCompatibilityInfoM91844d2 == null) {
                        m91813a(26);
                    }
                    return overrideCompatibilityInfoM91844d2;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91845e = OverrideCompatibilityInfo.m91845e();
        if (overrideCompatibilityInfoM91845e == null) {
            m91813a(27);
        }
        return overrideCompatibilityInfoM91845e;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public OverrideCompatibilityInfo m91838F(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            m91813a(28);
        }
        if (callableDescriptor2 == null) {
            m91813a(29);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91832w = m91832w(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoM91832w != null) {
            return overrideCompatibilityInfoM91832w;
        }
        List<KotlinType> listM91819g = m91819g(callableDescriptor);
        List<KotlinType> listM91819g2 = m91819g(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < listM91819g.size()) {
                if (!KotlinTypeChecker.f66298a.mo92903a(listM91819g.get(i), listM91819g2.get(i))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoM91844d = OverrideCompatibilityInfo.m91844d("Type parameter number mismatch");
                    if (overrideCompatibilityInfoM91844d == null) {
                        m91813a(31);
                    }
                    return overrideCompatibilityInfoM91844d;
                }
                i++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoM91843b = OverrideCompatibilityInfo.m91843b("Type parameter number mismatch");
            if (overrideCompatibilityInfoM91843b == null) {
                m91813a(32);
            }
            return overrideCompatibilityInfoM91843b;
        }
        TypeCheckerState typeCheckerStateM91839l = m91839l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m91815c(typeParameters.get(i2), typeParameters2.get(i2), typeCheckerStateM91839l)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM91844d2 = OverrideCompatibilityInfo.m91844d("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoM91844d2 == null) {
                    m91813a(33);
                }
                return overrideCompatibilityInfoM91844d2;
            }
        }
        while (i < listM91819g.size()) {
            if (!m91816d(listM91819g.get(i), listM91819g2.get(i), typeCheckerStateM91839l)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM91844d3 = OverrideCompatibilityInfo.m91844d("Value parameter type mismatch");
                if (overrideCompatibilityInfoM91844d3 == null) {
                    m91813a(34);
                }
                return overrideCompatibilityInfoM91844d3;
            }
            i++;
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            OverrideCompatibilityInfo overrideCompatibilityInfoM91843b2 = OverrideCompatibilityInfo.m91843b("Incompatible suspendability");
            if (overrideCompatibilityInfoM91843b2 == null) {
                m91813a(35);
            }
            return overrideCompatibilityInfoM91843b2;
        }
        if (z) {
            KotlinType returnType = callableDescriptor.getReturnType();
            KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!KotlinTypeKt.m92644a(returnType2) || !KotlinTypeKt.m92644a(returnType)) && !AbstractTypeChecker.INSTANCE.m92530u(typeCheckerStateM91839l, returnType2.mo92625J0(), returnType.mo92625J0()))) {
                OverrideCompatibilityInfo overrideCompatibilityInfoM91843b3 = OverrideCompatibilityInfo.m91843b("Return type mismatch");
                if (overrideCompatibilityInfoM91843b3 == null) {
                    m91813a(36);
                }
                return overrideCompatibilityInfoM91843b3;
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM91845e = OverrideCompatibilityInfo.m91845e();
        if (overrideCompatibilityInfoM91845e == null) {
            m91813a(37);
        }
        return overrideCompatibilityInfoM91845e;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TypeCheckerState m91839l(@NotNull List<TypeParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            m91813a(40);
        }
        if (list2 == null) {
            m91813a(41);
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateMo90252e0 = new OverridingUtilTypeSystemContext(null, this.f65819c, this.f65817a, this.f65818b, this.f65820d).mo90252e0(true, true, false);
            if (typeCheckerStateMo90252e0 == null) {
                m91813a(42);
            }
            return typeCheckerStateMo90252e0;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).mo88305l(), list2.get(i).mo88305l());
        }
        TypeCheckerState typeCheckerStateMo90252e1 = new OverridingUtilTypeSystemContext(map, this.f65819c, this.f65817a, this.f65818b, this.f65820d).mo90252e0(true, true, false);
        if (typeCheckerStateMo90252e1 == null) {
            m91813a(43);
        }
        return typeCheckerStateMo90252e1;
    }

    /* JADX INFO: renamed from: o */
    public final Collection<CallableMemberDescriptor> m91840o(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            m91813a(57);
        }
        if (collection == null) {
            m91813a(58);
        }
        if (classDescriptor == null) {
            m91813a(59);
        }
        if (overridingStrategy == null) {
            m91813a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        SmartSet smartSetM93219a = SmartSet.m93219a();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result resultM91846c = m91836D(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).m91846c();
            boolean zM91809I = m91809I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i = C15313h.f65829b[resultM91846c.ordinal()];
            if (i == 1) {
                if (zM91809I) {
                    smartSetM93219a.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (zM91809I) {
                    overridingStrategy.mo91803c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.mo89512d(callableMemberDescriptor, smartSetM93219a);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public void m91841v(@NotNull Name name, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull Collection<? extends CallableMemberDescriptor> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (name == null) {
            m91813a(50);
        }
        if (collection == null) {
            m91813a(51);
        }
        if (collection2 == null) {
            m91813a(52);
        }
        if (classDescriptor == null) {
            m91813a(53);
        }
        if (overridingStrategy == null) {
            m91813a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(m91840o(it.next(), collection, classDescriptor, overridingStrategy));
        }
        m91823k(classDescriptor, linkedHashSet, overridingStrategy);
    }
}
