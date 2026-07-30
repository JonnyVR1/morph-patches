package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class tpv {

    /* JADX INFO: renamed from: a */
    public C22393b<Boolean> f171526a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public C22393b<BLiveRoom> f171527b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public C22393b<zhp0> f171528c = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public C22306c<zhp0> m190062a() {
        return this.f171528c.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public C22306c<BLiveRoom> m190063b() {
        return this.f171527b.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public C22306c<Boolean> m190064c() {
        return this.f171526a.asObservable();
    }

    /* JADX INFO: renamed from: d */
    public void m190065d(boolean z) {
        this.f171526a.onNext(Boolean.valueOf(z));
    }
}
