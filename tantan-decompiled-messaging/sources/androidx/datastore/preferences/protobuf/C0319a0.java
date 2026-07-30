package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0319a0 implements InterfaceC0357z {
    /* JADX INFO: renamed from: i */
    public static <K, V> int m1803i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C0356y c0356y = (C0356y) obj2;
        int iM2387a = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iM2387a += c0356y.m2387a(i, entry.getKey(), entry.getValue());
        }
        return iM2387a;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> MapFieldLite<K, V> m1804j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteMutableCopy = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: a */
    public Object mo1805a(Object obj, Object obj2) {
        return m1804j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: b */
    public C0356y.a<?, ?> mo1806b(Object obj) {
        return ((C0356y) obj).m2388c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: c */
    public Object mo1807c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: d */
    public int mo1808d(int i, Object obj, Object obj2) {
        return m1803i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: e */
    public Map<?, ?> mo1809e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: f */
    public Object mo1810f(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: g */
    public Map<?, ?> mo1811g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0357z
    /* JADX INFO: renamed from: h */
    public boolean mo1812h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
