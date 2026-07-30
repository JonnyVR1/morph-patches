package p009l;

import com.p1.mobile.putong.live.base.data.BLiveRoom;
import l.zhp0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tpv {

    /* JADX INFO: renamed from: a */
    public b<Boolean> f20820a = b.b();

    /* JADX INFO: renamed from: b */
    public b<BLiveRoom> f20821b = b.b();

    /* JADX INFO: renamed from: c */
    public b<zhp0> f20822c = b.b();

    /* JADX INFO: renamed from: a */
    public c<zhp0> m22616a() {
        return this.f20822c.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public c<BLiveRoom> m22617b() {
        return this.f20821b.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public c<Boolean> m22618c() {
        return this.f20820a.asObservable();
    }

    /* JADX INFO: renamed from: d */
    public void m22619d(boolean z) {
        this.f20820a.onNext(Boolean.valueOf(z));
    }
}
