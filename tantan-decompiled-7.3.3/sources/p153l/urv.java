package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class urv {

    /* JADX INFO: renamed from: a */
    public C22508b<Boolean> f180703a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public C22508b<BLiveRoom> f180704b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public C22508b<crp0> f180705c = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public C22421c<crp0> m197665a() {
        return this.f180705c.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public C22421c<BLiveRoom> m197666b() {
        return this.f180704b.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public C22421c<Boolean> m197667c() {
        return this.f180703a.asObservable();
    }

    /* JADX INFO: renamed from: d */
    public void m197668d(boolean z) {
        this.f180703a.onNext(Boolean.valueOf(z));
    }
}
