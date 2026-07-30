package p002l;

import l.cul;
import p002l.ho2;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lqi<T extends ho2> {

    /* JADX INFO: renamed from: a */
    public a<Boolean> f14998a;

    /* JADX INFO: renamed from: b */
    public T f14999b;

    /* JADX INFO: renamed from: c */
    public float f15000c;

    /* JADX INFO: renamed from: d */
    public String f15001d;

    /* JADX INFO: renamed from: e */
    public String f15002e;

    /* JADX INFO: renamed from: f */
    public String f15003f;

    /* JADX INFO: renamed from: g */
    public cul f15004g;

    public lqi(T t, String str, String str2, float f, String str3) {
        this.f14998a = a.b();
        this.f14999b = t;
        this.f15001d = str;
        this.f15002e = str2;
        this.f15000c = f;
        this.f15003f = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m17376a() {
        return this.f15002e;
    }

    /* JADX INFO: renamed from: b */
    public c<Boolean> m17377b() {
        return this.f14998a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public String m17378c() {
        return this.f15001d;
    }

    /* JADX INFO: renamed from: d */
    public cul m17379d() {
        return this.f15004g;
    }

    /* JADX INFO: renamed from: e */
    public T m17380e() {
        return this.f14999b;
    }

    /* JADX INFO: renamed from: f */
    public String m17381f() {
        return this.f15003f;
    }

    /* JADX INFO: renamed from: g */
    public float m17382g() {
        return this.f15000c;
    }

    /* JADX INFO: renamed from: h */
    public void m17383h(boolean z) {
        this.f14998a.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public void m17384i(cul culVar) {
        this.f15004g = culVar;
    }

    public lqi(T t, String str, String str2, float f) {
        this(t, str, str2, f, "");
    }

    public lqi(T t, String str, String str2, String str3) {
        this(t, str, str2, 0.0f, str3);
    }
}
