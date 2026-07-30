package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.p046p1.mobile.putong.core.data.Action;
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
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Companion.NameAndSignature> f64746a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f64747b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<String> f64748c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> f64749d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, TypeSafeBarrierDescription> f64750e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<Name> f64751f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Set<String> f64752g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion.NameAndSignature f64753h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Map<Companion.NameAndSignature, Name> f64754i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Map<String, Name> f64755j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Set<String> f64756k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Set<Name> f64757l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Map<Name, Name> f64758m;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final String f64759a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final Name f64760b;

            /* JADX INFO: renamed from: c */
            @NotNull
            public final String f64761c;

            /* JADX INFO: renamed from: d */
            @NotNull
            public final String f64762d;

            /* JADX INFO: renamed from: e */
            @NotNull
            public final String f64763e;

            public NameAndSignature(@NotNull String str, @NotNull Name name, @NotNull String str2, @NotNull String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                this.f64759a = str;
                this.f64760b = name;
                this.f64761c = str2;
                this.f64762d = str3;
                this.f64763e = SignatureBuildingComponents.INSTANCE.m90396m(str, name + '(' + str2 + ')' + str3);
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ NameAndSignature m89498b(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.f64759a;
                }
                if ((i & 2) != 0) {
                    name = nameAndSignature.f64760b;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.f64761c;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.f64762d;
                }
                return nameAndSignature.m89499a(str, name, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final NameAndSignature m89499a(@NotNull String str, @NotNull Name name, @NotNull String str2, @NotNull String str3) {
                str.getClass();
                name.getClass();
                str2.getClass();
                str3.getClass();
                return new NameAndSignature(str, name, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final Name m89500c() {
                return this.f64760b;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final String m89501d() {
                return this.f64763e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.m87488d(this.f64759a, nameAndSignature.f64759a) && Intrinsics.m87488d(this.f64760b, nameAndSignature.f64760b) && Intrinsics.m87488d(this.f64761c, nameAndSignature.f64761c) && Intrinsics.m87488d(this.f64762d, nameAndSignature.f64762d);
            }

            public int hashCode() {
                return (((((this.f64759a.hashCode() * 31) + this.f64760b.hashCode()) * 31) + this.f64761c.hashCode()) * 31) + this.f64762d.hashCode();
            }

            @NotNull
            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f64759a + ", name=" + this.f64760b + ", parameters=" + this.f64761c + ", returnType=" + this.f64762d + ')';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Name m89486b(@NotNull Name name) {
            name.getClass();
            return m89490f().get(name);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<String> m89487c() {
            return SpecialGenericSignatures.f64747b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Set<Name> m89488d() {
            return SpecialGenericSignatures.f64751f;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Set<String> m89489e() {
            return SpecialGenericSignatures.f64752g;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Map<Name, Name> m89490f() {
            return SpecialGenericSignatures.f64758m;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Set<Name> m89491g() {
            return SpecialGenericSignatures.f64757l;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final NameAndSignature m89492h() {
            return SpecialGenericSignatures.f64753h;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final Map<String, TypeSafeBarrierDescription> m89493i() {
            return SpecialGenericSignatures.f64750e;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final Map<String, Name> m89494j() {
            return SpecialGenericSignatures.f64755j;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m89495k(@NotNull Name name) {
            name.getClass();
            return m89491g().contains(name);
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final SpecialSignatureInfo m89496l(@NotNull String str) {
            str.getClass();
            if (m89487c().contains(str)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) MapsKt.getValue(m89493i(), str)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        /* JADX INFO: renamed from: m */
        public final NameAndSignature m89497m(String str, String str2, String str3, String str4) {
            Name nameM91079i = Name.m91079i(str2);
            nameM91079i.getClass();
            return new NameAndSignature(str, nameM91079i, str3, str4);
        }

        private Companion() {
        }
    }

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
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
            arrayList.add(companion.m89497m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f64746a = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it.next()).m89501d());
        }
        f64747b = arrayList3;
        List<Companion.NameAndSignature> list = f64746a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).m89500c().m91082b());
        }
        f64748c = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strM90393i = signatureBuildingComponents.m90393i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        Companion.NameAndSignature nameAndSignatureM89497m = companion2.m89497m(strM90393i, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pairM87240a = TuplesKt.m87240a(nameAndSignatureM89497m, typeSafeBarrierDescription);
        String strM90393i2 = signatureBuildingComponents.m90393i("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pairM87240a2 = TuplesKt.m87240a(companion2.m89497m(strM90393i2, Action.remove, "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strM90393i3 = signatureBuildingComponents.m90393i("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pairM87240a3 = TuplesKt.m87240a(companion2.m89497m(strM90393i3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strM90393i4 = signatureBuildingComponents.m90393i("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pairM87240a4 = TuplesKt.m87240a(companion2.m89497m(strM90393i4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strM90393i5 = signatureBuildingComponents.m90393i("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pairM87240a5 = TuplesKt.m87240a(companion2.m89497m(strM90393i5, Action.remove, "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pairM87240a6 = TuplesKt.m87240a(companion2.m89497m(signatureBuildingComponents.m90393i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureM89497m2 = companion2.m89497m(signatureBuildingComponents.m90393i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pairM87240a7 = TuplesKt.m87240a(nameAndSignatureM89497m2, typeSafeBarrierDescription2);
        Pair pairM87240a8 = TuplesKt.m87240a(companion2.m89497m(signatureBuildingComponents.m90393i("Map"), Action.remove, "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strM90393i6 = signatureBuildingComponents.m90393i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        Companion.NameAndSignature nameAndSignatureM89497m3 = companion2.m89497m(strM90393i6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pairM87240a9 = TuplesKt.m87240a(nameAndSignatureM89497m3, typeSafeBarrierDescription3);
        String strM90393i7 = signatureBuildingComponents.m90393i("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapMapOf = MapsKt.mapOf(pairM87240a, pairM87240a2, pairM87240a3, pairM87240a4, pairM87240a5, pairM87240a6, pairM87240a7, pairM87240a8, pairM87240a9, TuplesKt.m87240a(companion2.m89497m(strM90393i7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f64749d = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf.size()));
        Iterator<T> it3 = mapMapOf.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).m89501d(), entry.getValue());
        }
        f64750e = linkedHashMap;
        Set setPlus = SetsKt.plus((Set) f64749d.keySet(), (Iterable) f64746a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it4 = setPlus.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it4.next()).m89500c());
        }
        f64751f = CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it5 = setPlus.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it5.next()).m89501d());
        }
        f64752g = CollectionsKt.toSet(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        Companion.NameAndSignature nameAndSignatureM89497m4 = companion3.m89497m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f64753h = nameAndSignatureM89497m4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strM90392h = signatureBuildingComponents2.m90392h("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pairM87240a10 = TuplesKt.m87240a(companion3.m89497m(strM90392h, "toByte", "", desc10), Name.m91079i("byteValue"));
        String strM90392h2 = signatureBuildingComponents2.m90392h("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pairM87240a11 = TuplesKt.m87240a(companion3.m89497m(strM90392h2, "toShort", "", desc11), Name.m91079i("shortValue"));
        String strM90392h3 = signatureBuildingComponents2.m90392h("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pairM87240a12 = TuplesKt.m87240a(companion3.m89497m(strM90392h3, "toInt", "", desc12), Name.m91079i("intValue"));
        String strM90392h4 = signatureBuildingComponents2.m90392h("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pairM87240a13 = TuplesKt.m87240a(companion3.m89497m(strM90392h4, "toLong", "", desc13), Name.m91079i("longValue"));
        String strM90392h5 = signatureBuildingComponents2.m90392h("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pairM87240a14 = TuplesKt.m87240a(companion3.m89497m(strM90392h5, "toFloat", "", desc14), Name.m91079i("floatValue"));
        String strM90392h6 = signatureBuildingComponents2.m90392h("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pairM87240a15 = TuplesKt.m87240a(companion3.m89497m(strM90392h6, "toDouble", "", desc15), Name.m91079i("doubleValue"));
        Pair pairM87240a16 = TuplesKt.m87240a(nameAndSignatureM89497m4, Name.m91079i(Action.remove));
        String strM90392h7 = signatureBuildingComponents2.m90392h("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map<Companion.NameAndSignature, Name> mapMapOf2 = MapsKt.mapOf(pairM87240a10, pairM87240a11, pairM87240a12, pairM87240a13, pairM87240a14, pairM87240a15, pairM87240a16, TuplesKt.m87240a(companion3.m89497m(strM90392h7, "get", desc16, desc17), Name.m91079i("charAt")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicInteger"), TrackLoadSettingsAtom.TYPE, "", "I"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicInteger"), PlaceTypes.STORE, "I", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicInteger"), "exchange", "I", "I"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.m91079i("getAndAdd")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicInteger"), "addAndFetch", "I", "I"), Name.m91079i("addAndGet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLong"), TrackLoadSettingsAtom.TYPE, "", "J"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLong"), PlaceTypes.STORE, "J", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLong"), "exchange", "J", "J"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLong"), "fetchAndAdd", "J", "J"), Name.m91079i("getAndAdd")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLong"), "addAndFetch", "J", "J"), Name.m91079i("addAndGet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicBoolean"), TrackLoadSettingsAtom.TYPE, "", "Z"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicBoolean"), PlaceTypes.STORE, "Z", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicBoolean"), "exchange", "Z", "Z"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReference"), TrackLoadSettingsAtom.TYPE, "", "Ljava/lang/Object;"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReference"), PlaceTypes.STORE, "Ljava/lang/Object;", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "loadAt", "I", "I"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "storeAt", "II", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.m91079i("compareAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.m91079i("getAndAdd")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.m91079i("addAndGet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "loadAt", "I", "J"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "storeAt", "IJ", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.m91079i("compareAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.m91079i("getAndAdd")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.m91079i("addAndGet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.m91079i("get")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", j6f.GPS_MEASUREMENT_INTERRUPTED), Name.m91079i("set")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.m91079i("getAndSet")), TuplesKt.m87240a(companion3.m89497m(signatureBuildingComponents2.m90394j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.m91079i("compareAndSet")));
        f64754i = mapMapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf2.size()));
        Iterator<T> it6 = mapMapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).m89501d(), entry2.getValue());
        }
        f64755j = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = f64754i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.m89498b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).m89501d());
        }
        f64756k = linkedHashSet;
        Set<Companion.NameAndSignature> setKeySet = f64754i.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it7.next()).m89500c());
        }
        f64757l = hashSet;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = f64754i.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).m89500c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((Name) pair.getSecond(), (Name) pair.getFirst());
        }
        f64758m = linkedHashMap3;
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
            $ENTRIES = EnumEntriesKt.m87385a(typeSafeBarrierDescriptionArr$values);
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
