package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class lqi<T extends ho2> {

    /* JADX INFO: renamed from: a */
    public C22392a<Boolean> f129343a;

    /* JADX INFO: renamed from: b */
    public T f129344b;

    /* JADX INFO: renamed from: c */
    public float f129345c;

    /* JADX INFO: renamed from: d */
    public String f129346d;

    /* JADX INFO: renamed from: e */
    public String f129347e;

    /* JADX INFO: renamed from: f */
    public String f129348f;

    /* JADX INFO: renamed from: g */
    public cul f129349g;

    public lqi(T t, String str, String str2, float f, String str3) {
        this.f129343a = C22392a.m221512b();
        this.f129344b = t;
        this.f129346d = str;
        this.f129347e = str2;
        this.f129345c = f;
        this.f129348f = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m151020a() {
        return this.f129347e;
    }

    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> m151021b() {
        return this.f129343a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public String m151022c() {
        return this.f129346d;
    }

    /* JADX INFO: renamed from: d */
    public cul m151023d() {
        return this.f129349g;
    }

    /* JADX INFO: renamed from: e */
    public T m151024e() {
        return this.f129344b;
    }

    /* JADX INFO: renamed from: f */
    public String m151025f() {
        return this.f129348f;
    }

    /* JADX INFO: renamed from: g */
    public float m151026g() {
        return this.f129345c;
    }

    /* JADX INFO: renamed from: h */
    public void m151027h(boolean z) {
        this.f129343a.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public void m151028i(cul culVar) {
        this.f129349g = culVar;
    }

    public lqi(T t, String str, String str2, float f) {
        this(t, str, str2, f, "");
    }

    public lqi(T t, String str, String str2, String str3) {
        this(t, str, str2, 0.0f, str3);
    }
}
