package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153l.p7f;
import p153l.uqf;

/* JADX INFO: renamed from: com.google.protobuf.h */
/* JADX INFO: loaded from: classes7.dex */
public class C3433h {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f11626b = m17214c();

    /* JADX INFO: renamed from: c */
    public static final C3433h f11627c = new C3433h(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, GeneratedMessageLite.C3406e<?, ?>> f11628a;

    /* JADX INFO: renamed from: com.google.protobuf.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f11629a;

        /* JADX INFO: renamed from: b */
        public final int f11630b;

        public a(Object obj, int i) {
            this.f11629a = obj;
            this.f11630b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11629a == aVar.f11629a && this.f11630b == aVar.f11630b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f11629a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f11630b;
        }
    }

    public C3433h() {
        this.f11628a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C3433h m17213b() {
        return uqf.m197330a();
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m17214c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC3442q> GeneratedMessageLite.C3406e<ContainingType, ?> m17215a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.C3406e) this.f11628a.get(new a(containingtype, i));
    }

    public C3433h(boolean z) {
        this.f11628a = Collections.EMPTY_MAP;
    }
}
