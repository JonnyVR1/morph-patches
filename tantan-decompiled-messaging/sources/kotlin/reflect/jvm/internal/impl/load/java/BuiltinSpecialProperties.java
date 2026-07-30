package kotlin.reflect.jvm.internal.impl.load.java;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltinSpecialProperties {

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<FqName, Name> f64643a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Name, List<Name>> f64644b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<FqName> f64645c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<FqName> f64646d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<Name> f64647e;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f63916r;
        Pair pairM87240a = TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89362d(fqNameUnsafe, AuthenticationTokenClaims.JSON_KEY_NAME), StandardNames.f63820l);
        Pair pairM87240a2 = TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89362d(fqNameUnsafe, "ordinal"), Name.m91079i("ordinal"));
        Pair pairM87240a3 = TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(StandardNames.FqNames.f63878W, "size"), Name.m91079i("size"));
        FqName fqName = StandardNames.FqNames.f63883a0;
        Map<FqName, Name> mapMapOf = MapsKt.mapOf(pairM87240a, pairM87240a2, pairM87240a3, TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(fqName, "size"), Name.m91079i("size")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89362d(StandardNames.FqNames.f63892f, "length"), Name.m91079i("length")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(fqName, UserMetadata.KEYDATA_FILENAME), Name.m91079i("keySet")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(fqName, "values"), Name.m91079i("values")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES), Name.m91079i("entrySet")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(StandardNames.FqNames.f63864O0, "size"), Name.m91079i("length")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(StandardNames.FqNames.f63866P0, "size"), Name.m91079i("length")), TuplesKt.m87240a(BuiltinSpecialPropertiesKt.m89361c(StandardNames.FqNames.f63868Q0, "size"), Name.m91079i("length")));
        f64643a = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).m91051f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.getSecond();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        f64644b = linkedHashMap2;
        Map<FqName, Name> map = f64643a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            ClassId classIdM88356n = JavaToKotlinClassMap.INSTANCE.m88356n(entry3.getKey().m91049d().m91054i());
            classIdM88356n.getClass();
            linkedHashSet.add(classIdM88356n.m91034a().m91047b(entry3.getValue()));
        }
        f64645c = linkedHashSet;
        Set<FqName> setKeySet = f64643a.keySet();
        f64646d = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).m91051f());
        }
        f64647e = CollectionsKt.toSet(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<FqName, Name> m89355a() {
        return f64643a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<Name> m89356b(@NotNull Name name) {
        name.getClass();
        List<Name> list = f64644b.get(name);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<FqName> m89357c() {
        return f64646d;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<Name> m89358d() {
        return f64647e;
    }
}
