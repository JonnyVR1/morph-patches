package com.google.protobuf;

import java.io.IOException;
import p149l.upk0;

/* JADX INFO: renamed from: com.google.protobuf.p */
/* JADX INFO: loaded from: classes7.dex */
public class C3418p<K, V> {

    /* JADX INFO: renamed from: a */
    public final b<K, V> f11623a;

    /* JADX INFO: renamed from: b */
    public final K f11624b;

    /* JADX INFO: renamed from: c */
    public final V f11625c;

    /* JADX INFO: renamed from: com.google.protobuf.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11626a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f11626a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11626a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11626a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p$b */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a */
        public final WireFormat.FieldType f11627a;

        /* JADX INFO: renamed from: b */
        public final K f11628b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f11629c;

        /* JADX INFO: renamed from: d */
        public final V f11630d;

        public b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
            this.f11627a = fieldType;
            this.f11628b = k;
            this.f11629c = fieldType2;
            this.f11630d = v2;
        }
    }

    public C3418p(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        this.f11623a = new b<>(fieldType, k, fieldType2, v2);
        this.f11624b = k;
        this.f11625c = v2;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> int m17275b(b<K, V> bVar, K k, V v2) {
        return C3411i.m17162d(bVar.f11627a, 1, k) + C3411i.m17162d(bVar.f11629c, 2, v2);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> C3418p<K, V> m17276c(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        return new C3418p<>(fieldType, k, fieldType2, v2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m17277d(C3407e c3407e, C3410h c3410h, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = a.f11626a[fieldType.ordinal()];
        if (i == 1) {
            InterfaceC3419q.a builder = ((InterfaceC3419q) t).toBuilder();
            c3407e.m17144x(builder, c3410h);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(c3407e.m17136p());
        }
        if (i != 3) {
            return (T) C3411i.m17167w(c3407e, fieldType, true);
        }
        upk0.m194883a("Groups are not allowed in maps.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static <K, V> void m17278g(CodedOutputStream codedOutputStream, b<K, V> bVar, K k, V v2) throws IOException {
        C3411i.m17169z(codedOutputStream, bVar.f11627a, 1, k);
        C3411i.m17169z(codedOutputStream, bVar.f11629c, 2, v2);
    }

    /* JADX INFO: renamed from: a */
    public int m17279a(int i, K k, V v2) {
        return CodedOutputStream.m16903M(i) + CodedOutputStream.m16891A(m17275b(this.f11623a, k, v2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m17280e(MapFieldLite<K, V> mapFieldLite, C3407e c3407e, C3410h c3410h) throws IOException {
        int iM17132l = c3407e.m17132l(c3407e.m17107C());
        b<K, V> bVar = this.f11623a;
        Object objM17277d = bVar.f11628b;
        Object objM17277d2 = bVar.f11630d;
        while (true) {
            int iM17116M = c3407e.m17116M();
            if (iM17116M == 0) {
                break;
            }
            int iM17074c = WireFormat.m17074c(1, this.f11623a.f11627a.getWireType());
            b<K, V> bVar2 = this.f11623a;
            if (iM17116M == iM17074c) {
                objM17277d = m17277d(c3407e, c3410h, bVar2.f11627a, objM17277d);
            } else if (iM17116M == WireFormat.m17074c(2, bVar2.f11629c.getWireType())) {
                objM17277d2 = m17277d(c3407e, c3410h, this.f11623a.f11629c, objM17277d2);
            } else if (!c3407e.m17121R(iM17116M)) {
                break;
            }
        }
        c3407e.m17128a(0);
        c3407e.m17131k(iM17132l);
        mapFieldLite.put(objM17277d, objM17277d2);
    }

    /* JADX INFO: renamed from: f */
    public void m17281f(CodedOutputStream codedOutputStream, int i, K k, V v2) throws IOException {
        codedOutputStream.mo16941F0(i, 2);
        codedOutputStream.mo16943H0(m17275b(this.f11623a, k, v2));
        m17278g(codedOutputStream, this.f11623a, k, v2);
    }
}
