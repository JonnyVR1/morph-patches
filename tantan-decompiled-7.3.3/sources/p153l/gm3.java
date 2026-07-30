package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p051p1.mobile.putong.live.external.module.businessstore.data.RoomType;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class gm3 {

    /* JADX INFO: renamed from: f */
    public boolean f104916f;

    /* JADX INFO: renamed from: h */
    public boolean f104918h;

    /* JADX INFO: renamed from: a */
    public C22507a<LiveActivitiesEntry> f104911a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<qrr> f104912b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public C22507a<Long> f104913c = C22507a.m222759c(Long.valueOf(System.currentTimeMillis()));

    /* JADX INFO: renamed from: d */
    public C22507a<bkj0<RoomType, String, String>> f104914d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public C22507a<xys> f104915e = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public C22507a<Integer> f104917g = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public C22507a<Boolean> f104919i = C22507a.m222758b();

    /* JADX INFO: renamed from: j */
    public C22507a<Boolean> f104920j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public C22507a<BLiveCounter> f104921k = C22507a.m222759c(BLiveCounter.new_());

    /* JADX INFO: renamed from: l */
    public C22508b<uxj0> f104922l = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public C22421c<xys> m130726a() {
        return this.f104915e.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> m130727b() {
        return this.f104920j.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public Boolean m130728c() {
        return this.f104920j.m222761e();
    }

    /* JADX INFO: renamed from: d */
    public C22507a<Long> m130729d() {
        return this.f104913c;
    }

    /* JADX INFO: renamed from: e */
    public C22421c<Integer> m130730e() {
        return this.f104917g.asObservable();
    }

    /* JADX INFO: renamed from: f */
    public Integer m130731f() {
        if (this.f104917g.m222765i()) {
            return this.f104917g.m222761e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public C22421c<uxj0> m130732g() {
        return this.f104922l.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public C22507a<BLiveCounter> m130733h() {
        return this.f104921k;
    }

    /* JADX INFO: renamed from: i */
    public void m130734i(Boolean bool) {
        this.f104920j.onNext(bool);
    }

    /* JADX INFO: renamed from: j */
    public void m130735j() {
        ((gm3) tbs.m190077m(itd0.f116821c)).f104913c.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: k */
    public void m130736k(xys xysVar) {
        this.f104915e.onNext(xysVar);
    }
}
