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
    public static final Map<FqName, Name> f65317a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Name, List<Name>> f65318b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<FqName> f65319c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<FqName> f65320d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<Name> f65321e;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f64590r;
        Pair pairM88129a = TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90253d(fqNameUnsafe, AuthenticationTokenClaims.JSON_KEY_NAME), StandardNames.f64494l);
        Pair pairM88129a2 = TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90253d(fqNameUnsafe, "ordinal"), Name.m91970i("ordinal"));
        Pair pairM88129a3 = TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(StandardNames.FqNames.f64552W, "size"), Name.m91970i("size"));
        FqName fqName = StandardNames.FqNames.f64557a0;
        Map<FqName, Name> mapMapOf = MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(fqName, "size"), Name.m91970i("size")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90253d(StandardNames.FqNames.f64566f, "length"), Name.m91970i("length")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(fqName, UserMetadata.KEYDATA_FILENAME), Name.m91970i("keySet")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(fqName, "values"), Name.m91970i("values")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES), Name.m91970i("entrySet")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(StandardNames.FqNames.f64538O0, "size"), Name.m91970i("length")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(StandardNames.FqNames.f64540P0, "size"), Name.m91970i("length")), TuplesKt.m88129a(BuiltinSpecialPropertiesKt.m90252c(StandardNames.FqNames.f64542Q0, "size"), Name.m91970i("length")));
        f65317a = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).m91942f(), entry.getValue()));
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
        f65318b = linkedHashMap2;
        Map<FqName, Name> map = f65317a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            ClassId classIdM89247n = JavaToKotlinClassMap.INSTANCE.m89247n(entry3.getKey().m91940d().m91945i());
            classIdM89247n.getClass();
            linkedHashSet.add(classIdM89247n.m91925a().m91938b(entry3.getValue()));
        }
        f65319c = linkedHashSet;
        Set<FqName> setKeySet = f65317a.keySet();
        f65320d = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).m91942f());
        }
        f65321e = CollectionsKt.toSet(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<FqName, Name> m90246a() {
        return f65317a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<Name> m90247b(@NotNull Name name) {
        name.getClass();
        List<Name> list = f65318b.get(name);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<FqName> m90248c() {
        return f65320d;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<Name> m90249d() {
        return f65321e;
    }
}
