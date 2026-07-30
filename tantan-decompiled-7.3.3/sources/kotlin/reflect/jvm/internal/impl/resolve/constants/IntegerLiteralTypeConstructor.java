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
import p153l.nbr;
import p153l.pr3;
import p153l.qym;
import p153l.rym;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final long f66527a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f66528b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Set<KotlinType> f66529c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SimpleType f66530d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f66531e;

    @SourceDebugExtension
    public static final class Companion {

        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
        }

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f66532a;

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
                f66532a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SimpleType m92833a(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                pr3.m173429a("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = IntegerLiteralTypeConstructor.Companion.m92837e((SimpleType) next, simpleType, mode);
            }
            return (SimpleType) next;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final SimpleType m92834b(@NotNull Collection<? extends SimpleType> collection) {
            collection.getClass();
            return m92833a(collection, Mode.INTERSECTION_TYPE);
        }

        /* JADX INFO: renamed from: c */
        public final SimpleType m92835c(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set setIntersect;
            int i = WhenMappings.f66532a[mode.ordinal()];
            if (i == 1) {
                setIntersect = CollectionsKt.intersect(integerLiteralTypeConstructor.m92830l(), integerLiteralTypeConstructor2.m92830l());
            } else {
                if (i != 2) {
                    nbr.m162172a();
                    return null;
                }
                setIntersect = CollectionsKt.union(integerLiteralTypeConstructor.m92830l(), integerLiteralTypeConstructor2.m92830l());
            }
            return KotlinTypeFactory.m93521f(TypeAttributes.Companion.m93600k(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f66527a, integerLiteralTypeConstructor.f66528b, setIntersect, null), false);
        }

        /* JADX INFO: renamed from: d */
        public final SimpleType m92836d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.m92830l().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final SimpleType m92837e(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType != null && simpleType2 != null) {
                TypeConstructor typeConstructorMo92781G0 = simpleType.mo92781G0();
                TypeConstructor typeConstructorMo92781G1 = simpleType2.mo92781G0();
                boolean z = typeConstructorMo92781G0 instanceof IntegerLiteralTypeConstructor;
                if (z && (typeConstructorMo92781G1 instanceof IntegerLiteralTypeConstructor)) {
                    return m92835c((IntegerLiteralTypeConstructor) typeConstructorMo92781G0, (IntegerLiteralTypeConstructor) typeConstructorMo92781G1, mode);
                }
                if (z) {
                    return m92836d((IntegerLiteralTypeConstructor) typeConstructorMo92781G0, simpleType2);
                }
                if (typeConstructorMo92781G1 instanceof IntegerLiteralTypeConstructor) {
                    return m92836d((IntegerLiteralTypeConstructor) typeConstructorMo92781G1, simpleType);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.f66530d = KotlinTypeFactory.m93521f(TypeAttributes.Companion.m93600k(), this, false);
        this.f66531e = LazyKt__LazyJVMKt.m88118b(new qym(this));
        this.f66527a = j;
        this.f66528b = moduleDescriptor;
        this.f66529c = set;
    }

    /* JADX INFO: renamed from: m */
    private final List<KotlinType> m92827m() {
        return (List) this.f66531e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static final List m92828o(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        SimpleType simpleTypeMo89349o = integerLiteralTypeConstructor.mo89570f().m89139y().mo89349o();
        simpleTypeMo89349o.getClass();
        List listMutableListOf = CollectionsKt.mutableListOf(TypeSubstitutionKt.m93656f(simpleTypeMo89349o, CollectionsKt.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f66530d)), null, 2, null));
        if (!integerLiteralTypeConstructor.m92831n()) {
            listMutableListOf.add(integerLiteralTypeConstructor.mo89570f().m89108M());
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: q */
    public static final CharSequence m92829q(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89569c() {
        return m92827m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo89207e() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        return this.f66528b.mo89437f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo89208g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Set<KotlinType> m92830l() {
        return this.f66529c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m92831n() {
        Collection<KotlinType> collectionM92847a = PrimitiveTypeUtilKt.m92847a(this.f66528b);
        if ((collectionM92847a instanceof Collection) && collectionM92847a.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionM92847a.iterator();
        while (it.hasNext()) {
            if (this.f66529c.contains((KotlinType) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final String m92832p() {
        return "[" + CollectionsKt.joinToString$default(this.f66529c, Constants.SEPARATOR_COMMA, null, null, 0, null, rym.INSTANCE, 30, null) + ']';
    }

    @NotNull
    public String toString() {
        return "IntegerLiteralType" + m92832p();
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }
}
