package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import p149l.iej0;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeIntersector {

    @NotNull
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultNullability {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultNullability[] $VALUES;
        public static final ResultNullability START = new START("START", 0);
        public static final ResultNullability ACCEPT_NULL = new ACCEPT_NULL("ACCEPT_NULL", 1);
        public static final ResultNullability UNKNOWN = new UNKNOWN("UNKNOWN", 2);
        public static final ResultNullability NOT_NULL = new NOT_NULL("NOT_NULL", 3);

        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return getResultNullability(unwrappedType);
            }
        }

        public static final class START extends ResultNullability {
            public START(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return getResultNullability(unwrappedType);
            }
        }

        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            public ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                ResultNullability resultNullability = getResultNullability(unwrappedType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ ResultNullability[] $values() {
            return new ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        static {
            ResultNullability[] resultNullabilityArr$values = $values();
            $VALUES = resultNullabilityArr$values;
            $ENTRIES = EnumEntriesKt.m87385a(resultNullabilityArr$values);
        }

        public /* synthetic */ ResultNullability(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) $VALUES.clone();
        }

        @NotNull
        public abstract ResultNullability combine(@NotNull UnwrappedType unwrappedType);

        @NotNull
        public final ResultNullability getResultNullability(@NotNull UnwrappedType unwrappedType) {
            unwrappedType.getClass();
            if (unwrappedType.mo89966H0()) {
                return ACCEPT_NULL;
            }
            if ((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).m92572S0() instanceof StubTypeForBuilderInference)) {
                return NOT_NULL;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return UNKNOWN;
            }
            return NullabilityChecker.INSTANCE.m92945a(unwrappedType) ? NOT_NULL : UNKNOWN;
        }

        private ResultNullability(String str, int i) {
            super(str, i);
        }

        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @NotNull
            public NOT_NULL combine(@NotNull UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return this;
            }
        }
    }

    private TypeIntersector() {
    }

    /* JADX INFO: renamed from: f */
    public static final String m92976f(Set set) {
        return "This collections cannot be empty! input types: " + CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: renamed from: c */
    public final Collection<SimpleType> m92977c(Collection<? extends SimpleType> collection, Function2<? super SimpleType, ? super SimpleType, Boolean> function2) {
        ArrayList<SimpleType> arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                for (SimpleType simpleType2 : arrayList) {
                    if (simpleType2 != simpleType) {
                        simpleType2.getClass();
                        simpleType.getClass();
                        if (function2.invoke(simpleType2, simpleType).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final SimpleType m92978d(@NotNull List<? extends SimpleType> list) {
        list.getClass();
        list.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : list) {
            if (simpleType.mo91890G0() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> collectionMo88678c = simpleType.mo91890G0().mo88678c();
                collectionMo88678c.getClass();
                Collection<KotlinType> collection = collectionMo88678c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                for (KotlinType kotlinType : collection) {
                    kotlinType.getClass();
                    SimpleType simpleTypeM92608d = FlexibleTypesKt.m92608d(kotlinType);
                    if (simpleType.mo89966H0()) {
                        simpleTypeM92608d = simpleTypeM92608d.mo89967N0(true);
                    }
                    arrayList2.add(simpleTypeM92608d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        ResultNullability resultNullabilityCombine = ResultNullability.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeM92662i : arrayList) {
            if (resultNullabilityCombine == ResultNullability.NOT_NULL) {
                if (simpleTypeM92662i instanceof NewCapturedType) {
                    simpleTypeM92662i = SpecialTypesKt.m92664k((NewCapturedType) simpleTypeM92662i);
                }
                simpleTypeM92662i = SpecialTypesKt.m92662i(simpleTypeM92662i, false, 1, null);
            }
            linkedHashSet.add(simpleTypeM92662i);
        }
        List<? extends SimpleType> list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SimpleType) it2.next()).mo91889F0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            qq3.m175877a("Empty collection can't be reduced.");
            return null;
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).m92703o((TypeAttributes) it3.next());
        }
        return m92979e(linkedHashSet).mo89894M0((TypeAttributes) next);
    }

    /* JADX INFO: renamed from: e */
    public final SimpleType m92979e(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) CollectionsKt.single(set);
        }
        new iej0(set);
        Set<? extends SimpleType> set2 = set;
        Collection<SimpleType> collectionM92977c = m92977c(set2, new C15347x702eebb8(this));
        collectionM92977c.isEmpty();
        SimpleType simpleTypeM91943b = IntegerLiteralTypeConstructor.Companion.m91943b(collectionM92977c);
        if (simpleTypeM91943b != null) {
            return simpleTypeM91943b;
        }
        Collection<SimpleType> collectionM92977c2 = m92977c(collectionM92977c, new C15348xc97d8c34(NewKotlinTypeChecker.Companion.m92940a()));
        collectionM92977c2.isEmpty();
        return collectionM92977c2.size() < 2 ? (SimpleType) CollectionsKt.single(collectionM92977c2) : new IntersectionTypeConstructor(set2).m92619l();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m92980g(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImplM92940a = NewKotlinTypeChecker.Companion.m92940a();
        return newKotlinTypeCheckerImplM92940a.mo92904d(kotlinType, kotlinType2) && !newKotlinTypeCheckerImplM92940a.mo92904d(kotlinType2, kotlinType);
    }
}
