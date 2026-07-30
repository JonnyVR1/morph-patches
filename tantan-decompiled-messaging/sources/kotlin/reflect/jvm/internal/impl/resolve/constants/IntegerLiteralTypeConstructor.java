package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;
import p149l.pwm;
import p149l.qq3;
import p149l.qwm;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final long f65853a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f65854b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Set<KotlinType> f65855c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SimpleType f65856d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f65857e;

    @SourceDebugExtension
    public static final class Companion {

        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
        }

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f65858a;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f65858a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SimpleType m91942a(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                qq3.m175877a("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = IntegerLiteralTypeConstructor.Companion.m91946e((SimpleType) next, simpleType, mode);
            }
            return (SimpleType) next;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final SimpleType m91943b(@NotNull Collection<? extends SimpleType> collection) {
            collection.getClass();
            return m91942a(collection, Mode.INTERSECTION_TYPE);
        }

        /* JADX INFO: renamed from: c */
        public final SimpleType m91944c(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set setIntersect;
            int i = WhenMappings.f65858a[mode.ordinal()];
            if (i == 1) {
                setIntersect = CollectionsKt.intersect(integerLiteralTypeConstructor.m91939l(), integerLiteralTypeConstructor2.m91939l());
            } else {
                if (i != 2) {
                    l9r.m149037a();
                    return null;
                }
                setIntersect = CollectionsKt.union(integerLiteralTypeConstructor.m91939l(), integerLiteralTypeConstructor2.m91939l());
            }
            return KotlinTypeFactory.m92630f(TypeAttributes.Companion.m92709k(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f65853a, integerLiteralTypeConstructor.f65854b, setIntersect, null), false);
        }

        /* JADX INFO: renamed from: d */
        public final SimpleType m91945d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.m91939l().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final SimpleType m91946e(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType != null && simpleType2 != null) {
                TypeConstructor typeConstructorMo91890G0 = simpleType.mo91890G0();
                TypeConstructor typeConstructorMo91890G1 = simpleType2.mo91890G0();
                boolean z = typeConstructorMo91890G0 instanceof IntegerLiteralTypeConstructor;
                if (z && (typeConstructorMo91890G1 instanceof IntegerLiteralTypeConstructor)) {
                    return m91944c((IntegerLiteralTypeConstructor) typeConstructorMo91890G0, (IntegerLiteralTypeConstructor) typeConstructorMo91890G1, mode);
                }
                if (z) {
                    return m91945d((IntegerLiteralTypeConstructor) typeConstructorMo91890G0, simpleType2);
                }
                if (typeConstructorMo91890G1 instanceof IntegerLiteralTypeConstructor) {
                    return m91945d((IntegerLiteralTypeConstructor) typeConstructorMo91890G1, simpleType);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.f65856d = KotlinTypeFactory.m92630f(TypeAttributes.Companion.m92709k(), this, false);
        this.f65857e = LazyKt__LazyJVMKt.m87229b(new pwm(this));
        this.f65853a = j;
        this.f65854b = moduleDescriptor;
        this.f65855c = set;
    }

    /* JADX INFO: renamed from: m */
    private final List<KotlinType> m91936m() {
        return (List) this.f65857e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static final List m91937o(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        SimpleType simpleTypeMo88458o = integerLiteralTypeConstructor.mo88679f().m88248y().mo88458o();
        simpleTypeMo88458o.getClass();
        List listMutableListOf = CollectionsKt.mutableListOf(TypeSubstitutionKt.m92765f(simpleTypeMo88458o, CollectionsKt.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f65856d)), null, 2, null));
        if (!integerLiteralTypeConstructor.m91940n()) {
            listMutableListOf.add(integerLiteralTypeConstructor.mo88679f().m88217M());
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: q */
    public static final CharSequence m91938q(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo88678c() {
        return m91936m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo88316e() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88679f() {
        return this.f65854b.mo88546f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Set<KotlinType> m91939l() {
        return this.f65855c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m91940n() {
        Collection<KotlinType> collectionM91956a = PrimitiveTypeUtilKt.m91956a(this.f65854b);
        if ((collectionM91956a instanceof Collection) && collectionM91956a.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionM91956a.iterator();
        while (it.hasNext()) {
            if (this.f65855c.contains((KotlinType) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final String m91941p() {
        return "[" + CollectionsKt.joinToString$default(this.f65855c, Constants.SEPARATOR_COMMA, null, null, 0, null, qwm.INSTANCE, 30, null) + ']';
    }

    @NotNull
    public String toString() {
        return "IntegerLiteralType" + m91941p();
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }
}
