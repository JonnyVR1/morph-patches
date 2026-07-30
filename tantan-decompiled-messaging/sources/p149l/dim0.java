package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class dim0 implements x7m {

    /* JADX INFO: renamed from: a */
    public C22393b<Boolean> f86403a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public v9j<Boolean> f86404b;

    /* JADX INFO: renamed from: c */
    public boolean f86405c;

    /* JADX INFO: renamed from: d */
    public boolean f86406d;

    @Override // p149l.x7m
    /* JADX INFO: renamed from: a */
    public boolean mo111890a() {
        v9j<Boolean> v9jVar = this.f86404b;
        return v9jVar != null && v9jVar.call().booleanValue();
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: b */
    public boolean mo111891b() {
        return this.f86405c || this.f86406d;
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: c */
    public void mo111892c(v9j<Boolean> v9jVar) {
        this.f86404b = v9jVar;
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: d */
    public void mo111893d(boolean z) {
        this.f86405c = z;
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: e */
    public C22306c<Boolean> mo111894e() {
        return this.f86403a.asObservable();
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: f */
    public void mo111895f(boolean z) {
        this.f86403a.onNext(Boolean.valueOf(z));
    }

    @Override // p149l.x7m
    /* JADX INFO: renamed from: g */
    public void mo111896g(boolean z) {
        this.f86406d = z;
    }
}
