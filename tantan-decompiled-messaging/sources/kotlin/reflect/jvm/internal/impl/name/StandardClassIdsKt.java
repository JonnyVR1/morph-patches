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
import kotlin.ranges.C15167a;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StandardClassIdsKt {
    /* JADX INFO: renamed from: l */
    public static final ClassId m91116l(String str) {
        FqName fqNameM91091b = StandardClassIds.INSTANCE.m91091b();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91091b, nameM91079i);
    }

    /* JADX INFO: renamed from: m */
    public static final ClassId m91117m(String str) {
        FqName fqNameM91093d = StandardClassIds.INSTANCE.m91093d();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91093d, nameM91079i);
    }

    /* JADX INFO: renamed from: n */
    public static final ClassId m91118n(String str) {
        FqName fqNameM91096g = StandardClassIds.INSTANCE.m91096g();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91096g, nameM91079i);
    }

    /* JADX INFO: renamed from: o */
    public static final ClassId m91119o(String str) {
        FqName fqNameM91092c = StandardClassIds.INSTANCE.m91092c();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91092c, nameM91079i);
    }

    /* JADX INFO: renamed from: p */
    public static final ClassId m91120p(String str) {
        FqName fqNameM91094e = StandardClassIds.INSTANCE.m91094e();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91094e, nameM91079i);
    }

    /* JADX INFO: renamed from: q */
    public static final ClassId m91121q(String str) {
        FqName fqNameM91095f = StandardClassIds.INSTANCE.m91095f();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91095f, nameM91079i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final <K, V> Map<V, K> m91122r(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM87240a = TuplesKt.m87240a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairM87240a.getFirst(), pairM87240a.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: s */
    public static final ClassId m91123s(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName fqNameM91038f = standardClassIds.m91090a().m91038f();
        Name nameM91079i = Name.m91079i(name.m91084g() + standardClassIds.m91090a().m91040h().m91084g());
        nameM91079i.getClass();
        return new ClassId(fqNameM91038f, nameM91079i);
    }

    /* JADX INFO: renamed from: t */
    public static final ClassId m91124t(String str) {
        FqName fqNameM91097h = StandardClassIds.INSTANCE.m91097h();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91097h, nameM91079i);
    }

    /* JADX INFO: renamed from: u */
    public static final ClassId m91125u(String str) {
        FqName fqNameM91098i = StandardClassIds.INSTANCE.m91098i();
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return new ClassId(fqNameM91098i, nameM91079i);
    }

    /* JADX INFO: renamed from: v */
    public static final ClassId m91126v(ClassId classId) {
        FqName fqNameM91096g = StandardClassIds.INSTANCE.m91096g();
        Name nameM91079i = Name.m91079i("U" + classId.m91040h().m91084g());
        nameM91079i.getClass();
        return new ClassId(fqNameM91096g, nameM91079i);
    }
}
