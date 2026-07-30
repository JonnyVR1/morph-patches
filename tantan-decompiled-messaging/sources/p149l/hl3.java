package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p046p1.mobile.putong.live.external.module.businessstore.data.RoomType;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class hl3 {

    /* JADX INFO: renamed from: f */
    public boolean f108313f;

    /* JADX INFO: renamed from: h */
    public boolean f108315h;

    /* JADX INFO: renamed from: a */
    public C22392a<LiveActivitiesEntry> f108308a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<ppr> f108309b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public C22392a<Long> f108310c = C22392a.m221513c(Long.valueOf(System.currentTimeMillis()));

    /* JADX INFO: renamed from: d */
    public C22392a<xaj0<RoomType, String, String>> f108311d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public C22392a<wws> f108312e = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public C22392a<Integer> f108314g = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public C22392a<Boolean> f108316i = C22392a.m221512b();

    /* JADX INFO: renamed from: j */
    public C22392a<Boolean> f108317j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public C22392a<BLiveCounter> f108318k = C22392a.m221513c(BLiveCounter.new_());

    /* JADX INFO: renamed from: l */
    public C22393b<roj0> f108319l = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public C22306c<wws> m131627a() {
        return this.f108312e.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> m131628b() {
        return this.f108317j.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public Boolean m131629c() {
        return this.f108317j.m221515e();
    }

    /* JADX INFO: renamed from: d */
    public C22392a<Long> m131630d() {
        return this.f108310c;
    }

    /* JADX INFO: renamed from: e */
    public C22306c<Integer> m131631e() {
        return this.f108314g.asObservable();
    }

    /* JADX INFO: renamed from: f */
    public Integer m131632f() {
        if (this.f108314g.m221519i()) {
            return this.f108314g.m221515e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public C22306c<roj0> m131633g() {
        return this.f108319l.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public C22392a<BLiveCounter> m131634h() {
        return this.f108318k;
    }

    /* JADX INFO: renamed from: i */
    public void m131635i(Boolean bool) {
        this.f108317j.onNext(bool);
    }

    /* JADX INFO: renamed from: j */
    public void m131636j() {
        ((hl3) s9s.m182763m(gld0.f103313c)).f108310c.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: k */
    public void m131637k(wws wwsVar) {
        this.f108312e.onNext(wwsVar);
    }
}
