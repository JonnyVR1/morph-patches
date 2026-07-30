package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p149l.j6f;
import p149l.npf;

/* JADX INFO: renamed from: com.google.protobuf.h */
/* JADX INFO: loaded from: classes7.dex */
public class C3410h {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f11589b = m17159c();

    /* JADX INFO: renamed from: c */
    public static final C3410h f11590c = new C3410h(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C3383e<?, ?>> f11591a;

    /* JADX INFO: renamed from: com.google.protobuf.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f11592a;

        /* JADX INFO: renamed from: b */
        public final int f11593b;

        public a(Object obj, int i) {
            this.f11592a = obj;
            this.f11593b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11592a == aVar.f11592a && this.f11593b == aVar.f11593b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f11592a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f11593b;
        }
    }

    public C3410h() {
        this.f11591a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C3410h m17158b() {
        return npf.m160475a();
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m17159c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC3419q> GeneratedMessageLite.C3383e<ContainingType, ?> m17160a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.C3383e) this.f11591a.get(new a(containingtype, i));
    }

    public C3410h(boolean z) {
        this.f11591a = Collections.EMPTY_MAP;
    }
}
