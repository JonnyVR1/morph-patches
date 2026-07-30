package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class wya0 {

    /* JADX INFO: renamed from: b */
    public static wya0 f191582b = new wya0();

    /* JADX INFO: renamed from: a */
    public C22508b<Boolean> f191583a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public static wya0 m208478b() {
        return f191582b;
    }

    /* JADX INFO: renamed from: a */
    public C22421c<Boolean> m208479a() {
        return this.f191583a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public void m208480c(boolean z) {
        this.f191583a.onNext(Boolean.valueOf(z));
    }
}
