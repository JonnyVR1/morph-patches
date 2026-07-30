package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0320a0 implements InterfaceC0358z {
    /* JADX INFO: renamed from: i */
    public static <K, V> int m1804i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C0357y c0357y = (C0357y) obj2;
        int iM2388a = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iM2388a += c0357y.m2388a(i, entry.getKey(), entry.getValue());
        }
        return iM2388a;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> MapFieldLite<K, V> m1805j(Object obj, Object obj2) {
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

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: a */
    public Object mo1806a(Object obj, Object obj2) {
        return m1805j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: b */
    public C0357y.a<?, ?> mo1807b(Object obj) {
        return ((C0357y) obj).m2389c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: c */
    public Object mo1808c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: d */
    public int mo1809d(int i, Object obj, Object obj2) {
        return m1804i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: e */
    public Map<?, ?> mo1810e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: f */
    public Object mo1811f(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: g */
    public Map<?, ?> mo1812g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0358z
    /* JADX INFO: renamed from: h */
    public boolean mo1813h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
