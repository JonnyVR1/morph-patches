package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class hti<T extends oo2> {

    /* JADX INFO: renamed from: a */
    public C22507a<Boolean> f111542a;

    /* JADX INFO: renamed from: b */
    public T f111543b;

    /* JADX INFO: renamed from: c */
    public float f111544c;

    /* JADX INFO: renamed from: d */
    public String f111545d;

    /* JADX INFO: renamed from: e */
    public String f111546e;

    /* JADX INFO: renamed from: f */
    public String f111547f;

    /* JADX INFO: renamed from: g */
    public qwl f111548g;

    public hti(T t, String str, String str2, float f, String str3) {
        this.f111542a = C22507a.m222758b();
        this.f111543b = t;
        this.f111545d = str;
        this.f111546e = str2;
        this.f111544c = f;
        this.f111547f = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m137076a() {
        return this.f111546e;
    }

    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> m137077b() {
        return this.f111542a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public String m137078c() {
        return this.f111545d;
    }

    /* JADX INFO: renamed from: d */
    public qwl m137079d() {
        return this.f111548g;
    }

    /* JADX INFO: renamed from: e */
    public T m137080e() {
        return this.f111543b;
    }

    /* JADX INFO: renamed from: f */
    public String m137081f() {
        return this.f111547f;
    }

    /* JADX INFO: renamed from: g */
    public float m137082g() {
        return this.f111544c;
    }

    /* JADX INFO: renamed from: h */
    public void m137083h(boolean z) {
        this.f111542a.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public void m137084i(qwl qwlVar) {
        this.f111548g = qwlVar;
    }

    public hti(T t, String str, String str2, float f) {
        this(t, str, str2, f, "");
    }

    public hti(T t, String str, String str2, String str3) {
        this(t, str, str2, 0.0f, str3);
    }
}
