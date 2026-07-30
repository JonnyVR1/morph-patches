package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Companion.NameAndSignature> f65420a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f65421b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<String> f65422c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> f65423d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, TypeSafeBarrierDescription> f65424e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<Name> f65425f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Set<String> f65426g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion.NameAndSignature f65427h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Map<Companion.NameAndSignature, Name> f65428i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Map<String, Name> f65429j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Set<String> f65430k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Set<Name> f65431l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Map<Name, Name> f65432m;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final String f65433a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final Name f65434b;

            /* JADX INFO: renamed from: c */
            @NotNull
            public final String f65435c;

            /* JADX INFO: renamed from: d */
            @NotNull
            public final String f65436d;

            /* JADX INFO: renamed from: e */
            @NotNull
            public final String f65437e;

            public NameAndSignature(@NotNull String str, @NotNull Name name, @NotNull String str2, @NotNull String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                this.f65433a = str;
                this.f65434b = name;
                this.f65435c = str2;
                this.f65436d = str3;
                this.f65437e = SignatureBuildingComponents.INSTANCE.m91287m(str, name + '(' + str2 + ')' + str3);
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ NameAndSignature m90389b(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.f65433a;
                }
                if ((i & 2) != 0) {
                    name = nameAndSignature.f65434b;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.f65435c;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.f65436d;
                }
                return nameAndSignature.m90390a(str, name, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final NameAndSignature m90390a(@NotNull String str, @NotNull Name name, @NotNull String str2, @NotNull String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                return new NameAndSignature(str, name, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final Name m90391c() {
                return this.f65434b;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final String m90392d() {
                return this.f65437e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.m88377d(this.f65433a, nameAndSignature.f65433a) && Intrinsics.m88377d(this.f65434b, nameAndSignature.f65434b) && Intrinsics.m88377d(this.f65435c, nameAndSignature.f65435c) && Intrinsics.m88377d(this.f65436d, nameAndSignature.f65436d);
            }

            public int hashCode() {
                return (((((this.f65433a.hashCode() * 31) + this.f65434b.hashCode()) * 31) + this.f65435c.hashCode()) * 31) + this.f65436d.hashCode();
            }

            @NotNull
            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f65433a + ", name=" + this.f65434b + ", parameters=" + this.f65435c + ", returnType=" + this.f65436d + ')';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Name m90377b(@NotNull Name name) {
            name.getClass();
            return m90381f().get(name);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<String> m90378c() {
            return SpecialGenericSignatures.f65421b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Set<Name> m90379d() {
            return SpecialGenericSignatures.f65425f;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Set<String> m90380e() {
            return SpecialGenericSignatures.f65426g;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Map<Name, Name> m90381f() {
            return SpecialGenericSignatures.f65432m;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Set<Name> m90382g() {
            return SpecialGenericSignatures.f65431l;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final NameAndSignature m90383h() {
            return SpecialGenericSignatures.f65427h;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final Map<String, TypeSafeBarrierDescription> m90384i() {
            return SpecialGenericSignatures.f65424e;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final Map<String, Name> m90385j() {
            return SpecialGenericSignatures.f65429j;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m90386k(@NotNull Name name) {
            name.getClass();
            return m90382g().contains(name);
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final SpecialSignatureInfo m90387l(@NotNull String str) {
            str.getClass();
            if (m90378c().contains(str)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) MapsKt.getValue(m90384i(), str)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        /* JADX INFO: renamed from: m */
        public final NameAndSignature m90388m(String str, String str2, String str3, String str4) {
            Name nameM91970i = Name.m91970i(str2);
            nameM91970i.getClass();
            return new NameAndSignature(str, nameM91970i, str3, str4);
        }

        private Companion() {
        }
    }

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
        private final boolean isObjectReplacedWithTypeParameter;

        @Nullable
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    static {
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(of, 10));
        for (String str : of) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(companion.m90388m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f65420a = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it.next()).m90392d());
        }
        f65421b = arrayList3;
        List<Companion.NameAndSignature> list = f65420a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).m90391c().m91973b());
        }
        f65422c = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strM91284i = signatureBuildingComponents.m91284i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        Companion.NameAndSignature nameAndSignatureM90388m = companion2.m90388m(strM91284i, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pairM88129a = TuplesKt.m88129a(nameAndSignatureM90388m, typeSafeBarrierDescription);
        String strM91284i2 = signatureBuildingComponents.m91284i("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pairM88129a2 = TuplesKt.m88129a(companion2.m90388m(strM91284i2, Action.remove, "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strM91284i3 = signatureBuildingComponents.m91284i("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pairM88129a3 = TuplesKt.m88129a(companion2.m90388m(strM91284i3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strM91284i4 = signatureBuildingComponents.m91284i("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pairM88129a4 = TuplesKt.m88129a(companion2.m90388m(strM91284i4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strM91284i5 = signatureBuildingComponents.m91284i("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pairM88129a5 = TuplesKt.m88129a(companion2.m90388m(strM91284i5, Action.remove, "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pairM88129a6 = TuplesKt.m88129a(companion2.m90388m(signatureBuildingComponents.m91284i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureM90388m2 = companion2.m90388m(signatureBuildingComponents.m91284i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pairM88129a7 = TuplesKt.m88129a(nameAndSignatureM90388m2, typeSafeBarrierDescription2);
        Pair pairM88129a8 = TuplesKt.m88129a(companion2.m90388m(signatureBuildingComponents.m91284i("Map"), Action.remove, "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strM91284i6 = signatureBuildingComponents.m91284i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        Companion.NameAndSignature nameAndSignatureM90388m3 = companion2.m90388m(strM91284i6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pairM88129a9 = TuplesKt.m88129a(nameAndSignatureM90388m3, typeSafeBarrierDescription3);
        String strM91284i7 = signatureBuildingComponents.m91284i("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapMapOf = MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, pairM88129a4, pairM88129a5, pairM88129a6, pairM88129a7, pairM88129a8, pairM88129a9, TuplesKt.m88129a(companion2.m90388m(strM91284i7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f65423d = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf.size()));
        Iterator<T> it3 = mapMapOf.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).m90392d(), entry.getValue());
        }
        f65424e = linkedHashMap;
        Set setPlus = SetsKt.plus((Set) f65423d.keySet(), (Iterable) f65420a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it4 = setPlus.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it4.next()).m90391c());
        }
        f65425f = CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it5 = setPlus.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it5.next()).m90392d());
        }
        f65426g = CollectionsKt.toSet(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        Companion.NameAndSignature nameAndSignatureM90388m4 = companion3.m90388m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f65427h = nameAndSignatureM90388m4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strM91283h = signatureBuildingComponents2.m91283h("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pairM88129a10 = TuplesKt.m88129a(companion3.m90388m(strM91283h, "toByte", "", desc10), Name.m91970i("byteValue"));
        String strM91283h2 = signatureBuildingComponents2.m91283h("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pairM88129a11 = TuplesKt.m88129a(companion3.m90388m(strM91283h2, "toShort", "", desc11), Name.m91970i("shortValue"));
        String strM91283h3 = signatureBuildingComponents2.m91283h("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pairM88129a12 = TuplesKt.m88129a(companion3.m90388m(strM91283h3, "toInt", "", desc12), Name.m91970i("intValue"));
        String strM91283h4 = signatureBuildingComponents2.m91283h("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pairM88129a13 = TuplesKt.m88129a(companion3.m90388m(strM91283h4, "toLong", "", desc13), Name.m91970i("longValue"));
        String strM91283h5 = signatureBuildingComponents2.m91283h("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pairM88129a14 = TuplesKt.m88129a(companion3.m90388m(strM91283h5, "toFloat", "", desc14), Name.m91970i("floatValue"));
        String strM91283h6 = signatureBuildingComponents2.m91283h("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pairM88129a15 = TuplesKt.m88129a(companion3.m90388m(strM91283h6, "toDouble", "", desc15), Name.m91970i("doubleValue"));
        Pair pairM88129a16 = TuplesKt.m88129a(nameAndSignatureM90388m4, Name.m91970i(Action.remove));
        String strM91283h7 = signatureBuildingComponents2.m91283h("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map<Companion.NameAndSignature, Name> mapMapOf2 = MapsKt.mapOf(pairM88129a10, pairM88129a11, pairM88129a12, pairM88129a13, pairM88129a14, pairM88129a15, pairM88129a16, TuplesKt.m88129a(companion3.m90388m(strM91283h7, "get", desc16, desc17), Name.m91970i("charAt")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicInteger"), TrackLoadSettingsAtom.TYPE, "", "I"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicInteger"), PlaceTypes.STORE, "I", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicInteger"), "exchange", "I", "I"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.m91970i("getAndAdd")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicInteger"), "addAndFetch", "I", "I"), Name.m91970i("addAndGet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLong"), TrackLoadSettingsAtom.TYPE, "", "J"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLong"), PlaceTypes.STORE, "J", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLong"), "exchange", "J", "J"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLong"), "fetchAndAdd", "J", "J"), Name.m91970i("getAndAdd")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLong"), "addAndFetch", "J", "J"), Name.m91970i("addAndGet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicBoolean"), TrackLoadSettingsAtom.TYPE, "", "Z"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicBoolean"), PlaceTypes.STORE, "Z", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicBoolean"), "exchange", "Z", "Z"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReference"), TrackLoadSettingsAtom.TYPE, "", "Ljava/lang/Object;"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReference"), PlaceTypes.STORE, "Ljava/lang/Object;", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "loadAt", "I", "I"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "storeAt", "II", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.m91970i("compareAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.m91970i("getAndAdd")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.m91970i("addAndGet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "loadAt", "I", "J"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "storeAt", "IJ", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.m91970i("compareAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.m91970i("getAndAdd")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.m91970i("addAndGet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.m91970i("get")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", p7f.GPS_MEASUREMENT_INTERRUPTED), Name.m91970i("set")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.m91970i("getAndSet")), TuplesKt.m88129a(companion3.m90388m(signatureBuildingComponents2.m91285j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.m91970i("compareAndSet")));
        f65428i = mapMapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf2.size()));
        Iterator<T> it6 = mapMapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).m90392d(), entry2.getValue());
        }
        f65429j = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = f65428i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.m90389b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).m90392d());
        }
        f65430k = linkedHashSet;
        Set<Companion.NameAndSignature> setKeySet = f65428i.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it7.next()).m90391c());
        }
        f65431l = hashSet;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = f65428i.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).m90391c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((Name) pair.getSecond(), (Name) pair.getFirst());
        }
        f65432m = linkedHashMap3;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;

        @Nullable
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);

        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            public MAP_GET_OR_DEFAULT(String str, int i) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr$values = $values();
            $VALUES = typeSafeBarrierDescriptionArr$values;
            $ENTRIES = EnumEntriesKt.m88274a(typeSafeBarrierDescriptionArr$values);
        }

        private TypeSafeBarrierDescription(String str, int i, Object obj) {
            super(str, i);
            this.defaultValue = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }
    }
}
