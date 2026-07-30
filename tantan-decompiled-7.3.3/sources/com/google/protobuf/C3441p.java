package com.google.protobuf;

import java.io.IOException;
import p153l.azk0;

/* JADX INFO: renamed from: com.google.protobuf.p */
/* JADX INFO: loaded from: classes7.dex */
public class C3441p<K, V> {

    /* JADX INFO: renamed from: a */
    public final b<K, V> f11660a;

    /* JADX INFO: renamed from: b */
    public final K f11661b;

    /* JADX INFO: renamed from: c */
    public final V f11662c;

    /* JADX INFO: renamed from: com.google.protobuf.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11663a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f11663a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11663a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11663a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.p$b */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a */
        public final WireFormat.FieldType f11664a;

        /* JADX INFO: renamed from: b */
        public final K f11665b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f11666c;

        /* JADX INFO: renamed from: d */
        public final V f11667d;

        public b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
            this.f11664a = fieldType;
            this.f11665b = k;
            this.f11666c = fieldType2;
            this.f11667d = v2;
        }
    }

    public C3441p(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        this.f11660a = new b<>(fieldType, k, fieldType2, v2);
        this.f11661b = k;
        this.f11662c = v2;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> int m17330b(b<K, V> bVar, K k, V v2) {
        return C3434i.m17217d(bVar.f11664a, 1, k) + C3434i.m17217d(bVar.f11666c, 2, v2);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> C3441p<K, V> m17331c(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        return new C3441p<>(fieldType, k, fieldType2, v2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m17332d(C3430e c3430e, C3433h c3433h, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = a.f11663a[fieldType.ordinal()];
        if (i == 1) {
            InterfaceC3442q.a builder = ((InterfaceC3442q) t).toBuilder();
            c3430e.m17199x(builder, c3433h);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(c3430e.m17191p());
        }
        if (i != 3) {
            return (T) C3434i.m17222w(c3430e, fieldType, true);
        }
        azk0.m101074a("Groups are not allowed in maps.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static <K, V> void m17333g(CodedOutputStream codedOutputStream, b<K, V> bVar, K k, V v2) throws IOException {
        C3434i.m17224z(codedOutputStream, bVar.f11664a, 1, k);
        C3434i.m17224z(codedOutputStream, bVar.f11666c, 2, v2);
    }

    /* JADX INFO: renamed from: a */
    public int m17334a(int i, K k, V v2) {
        return CodedOutputStream.m16958M(i) + CodedOutputStream.m16946A(m17330b(this.f11660a, k, v2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m17335e(MapFieldLite<K, V> mapFieldLite, C3430e c3430e, C3433h c3433h) throws IOException {
        int iM17187l = c3430e.m17187l(c3430e.m17162C());
        b<K, V> bVar = this.f11660a;
        Object objM17332d = bVar.f11665b;
        Object objM17332d2 = bVar.f11667d;
        while (true) {
            int iM17171M = c3430e.m17171M();
            if (iM17171M == 0) {
                break;
            }
            int iM17129c = WireFormat.m17129c(1, this.f11660a.f11664a.getWireType());
            b<K, V> bVar2 = this.f11660a;
            if (iM17171M == iM17129c) {
                objM17332d = m17332d(c3430e, c3433h, bVar2.f11664a, objM17332d);
            } else if (iM17171M == WireFormat.m17129c(2, bVar2.f11666c.getWireType())) {
                objM17332d2 = m17332d(c3430e, c3433h, this.f11660a.f11666c, objM17332d2);
            } else if (!c3430e.m17176R(iM17171M)) {
                break;
            }
        }
        c3430e.m17183a(0);
        c3430e.m17186k(iM17187l);
        mapFieldLite.put(objM17332d, objM17332d2);
    }

    /* JADX INFO: renamed from: f */
    public void m17336f(CodedOutputStream codedOutputStream, int i, K k, V v2) throws IOException {
        codedOutputStream.mo16996F0(i, 2);
        codedOutputStream.mo16998H0(m17330b(this.f11660a, k, v2));
        m17333g(codedOutputStream, this.f11660a, k, v2);
    }
}
