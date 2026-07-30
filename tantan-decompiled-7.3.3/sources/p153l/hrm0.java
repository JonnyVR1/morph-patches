package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class hrm0 implements nam {

    /* JADX INFO: renamed from: a */
    public C22508b<Boolean> f111365a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public pcj<Boolean> f111366b;

    /* JADX INFO: renamed from: c */
    public boolean f111367c;

    /* JADX INFO: renamed from: d */
    public boolean f111368d;

    @Override // p153l.nam
    /* JADX INFO: renamed from: a */
    public boolean mo136897a() {
        pcj<Boolean> pcjVar = this.f111366b;
        return pcjVar != null && pcjVar.call().booleanValue();
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: b */
    public boolean mo136898b() {
        return this.f111367c || this.f111368d;
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: c */
    public void mo136899c(pcj<Boolean> pcjVar) {
        this.f111366b = pcjVar;
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: d */
    public void mo136900d(boolean z) {
        this.f111367c = z;
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: e */
    public C22421c<Boolean> mo136901e() {
        return this.f111365a.asObservable();
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: f */
    public void mo136902f(boolean z) {
        this.f111365a.onNext(Boolean.valueOf(z));
    }

    @Override // p153l.nam
    /* JADX INFO: renamed from: g */
    public void mo136903g(boolean z) {
        this.f111368d = z;
    }
}
