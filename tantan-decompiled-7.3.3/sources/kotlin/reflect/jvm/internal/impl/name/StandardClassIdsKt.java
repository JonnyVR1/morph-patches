package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StandardClassIdsKt {
    /* JADX INFO: renamed from: l */
    public static final ClassId m92007l(String str) {
        FqName fqNameM91982b = StandardClassIds.INSTANCE.m91982b();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91982b, nameM91970i);
    }

    /* JADX INFO: renamed from: m */
    public static final ClassId m92008m(String str) {
        FqName fqNameM91984d = StandardClassIds.INSTANCE.m91984d();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91984d, nameM91970i);
    }

    /* JADX INFO: renamed from: n */
    public static final ClassId m92009n(String str) {
        FqName fqNameM91987g = StandardClassIds.INSTANCE.m91987g();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91987g, nameM91970i);
    }

    /* JADX INFO: renamed from: o */
    public static final ClassId m92010o(String str) {
        FqName fqNameM91983c = StandardClassIds.INSTANCE.m91983c();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91983c, nameM91970i);
    }

    /* JADX INFO: renamed from: p */
    public static final ClassId m92011p(String str) {
        FqName fqNameM91985e = StandardClassIds.INSTANCE.m91985e();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91985e, nameM91970i);
    }

    /* JADX INFO: renamed from: q */
    public static final ClassId m92012q(String str) {
        FqName fqNameM91986f = StandardClassIds.INSTANCE.m91986f();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91986f, nameM91970i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final <K, V> Map<V, K> m92013r(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM88129a = TuplesKt.m88129a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairM88129a.getFirst(), pairM88129a.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: s */
    public static final ClassId m92014s(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName fqNameM91929f = standardClassIds.m91981a().m91929f();
        Name nameM91970i = Name.m91970i(name.m91975g() + standardClassIds.m91981a().m91931h().m91975g());
        nameM91970i.getClass();
        return new ClassId(fqNameM91929f, nameM91970i);
    }

    /* JADX INFO: renamed from: t */
    public static final ClassId m92015t(String str) {
        FqName fqNameM91988h = StandardClassIds.INSTANCE.m91988h();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91988h, nameM91970i);
    }

    /* JADX INFO: renamed from: u */
    public static final ClassId m92016u(String str) {
        FqName fqNameM91989i = StandardClassIds.INSTANCE.m91989i();
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return new ClassId(fqNameM91989i, nameM91970i);
    }

    /* JADX INFO: renamed from: v */
    public static final ClassId m92017v(ClassId classId) {
        FqName fqNameM91987g = StandardClassIds.INSTANCE.m91987g();
        Name nameM91970i = Name.m91970i("U" + classId.m91931h().m91975g());
        nameM91970i.getClass();
        return new ClassId(fqNameM91987g, nameM91970i);
    }
}
