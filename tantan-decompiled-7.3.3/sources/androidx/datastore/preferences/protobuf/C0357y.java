package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y */
/* JADX INFO: loaded from: classes.dex */
public class C0357y<K, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f1759a;

    /* JADX INFO: renamed from: b */
    public final K f1760b;

    /* JADX INFO: renamed from: c */
    public final V f1761c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final WireFormat.FieldType f1762a;

        /* JADX INFO: renamed from: b */
        public final K f1763b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f1764c;

        /* JADX INFO: renamed from: d */
        public final V f1765d;

        public a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
            this.f1762a = fieldType;
            this.f1763b = k;
            this.f1764c = fieldType2;
            this.f1765d = v2;
        }
    }

    public C0357y(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        this.f1759a = new a<>(fieldType, k, fieldType2, v2);
        this.f1760b = k;
        this.f1761c = v2;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> int m2385b(a<K, V> aVar, K k, V v2) {
        return C0348p.m2295d(aVar.f1762a, 1, k) + C0348p.m2295d(aVar.f1764c, 2, v2);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> C0357y<K, V> m2386d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        return new C0357y<>(fieldType, k, fieldType2, v2);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> void m2387e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v2) throws IOException {
        C0348p.m2303z(codedOutputStream, aVar.f1762a, 1, k);
        C0348p.m2303z(codedOutputStream, aVar.f1764c, 2, v2);
    }

    /* JADX INFO: renamed from: a */
    public int m2388a(int i, K k, V v2) {
        return CodedOutputStream.m1519W(i) + CodedOutputStream.m1500D(m2385b(this.f1759a, k, v2));
    }

    /* JADX INFO: renamed from: c */
    public a<K, V> m2389c() {
        return this.f1759a;
    }
}
