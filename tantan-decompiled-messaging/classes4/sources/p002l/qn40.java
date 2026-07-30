package p002l;

import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import l.ypv;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qn40 implements xml<BLive, BLiveRoom> {

    /* JADX INFO: renamed from: a */
    public a<BLive> f18098a = a.b();

    /* JADX INFO: renamed from: b */
    public a<BLiveRoom> f18099b = a.b();

    @Override // p002l.xml
    /* JADX INFO: renamed from: a */
    public void mo19684a() {
        this.f18098a = a.b();
        this.f18099b = a.b();
        ypv.f.b();
    }

    /* JADX INFO: renamed from: b */
    public final String m21481b() {
        return (!m26033m(this.f18098a) || ((BLiveAbsData) mo19690l()).anchor == null) ? "" : ((BLiveAbsData) mo19690l()).anchor.id;
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLive mo19690l() {
        return (BLive) this.f18098a.e();
    }

    /* JADX INFO: renamed from: d */
    public c<BLive> m21483d() {
        return this.f18098a;
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveRoom mo19689j() {
        return (BLiveRoom) this.f18099b.e();
    }

    /* JADX INFO: renamed from: f */
    public c<BLiveRoom> m21485f() {
        return this.f18099b;
    }

    @Override // p002l.xml
    public String getLiveId() {
        return m26033m(this.f18098a) ? ((BLiveAbsData) ((BLive) this.f18098a.e())).id : "";
    }

    @Override // p002l.xml
    public String getRoomId() {
        return m26033m(this.f18099b) ? ((BLiveAbsRoom) ((BLiveRoom) this.f18099b.e())).id : "";
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: n */
    public void mo19691n(BLiveAbsData bLiveAbsData) {
        this.f18098a.onNext((BLive) bLiveAbsData);
        ypv.f.a("X-TT-Live-AnchorID", m21481b());
        ypv.f.a("X-TT-Live-LiveID", getLiveId());
        ypv.f.a("X-TT-Live-RoomID", getRoomId());
        ypv.f.a("X-Android-UpgradeVersion-Time", xml.m26032k());
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: o */
    public void mo19692o(BLiveAbsRoom bLiveAbsRoom) {
        this.f18099b.onNext((BLiveRoom) bLiveAbsRoom);
        ypv.f.a("X-TT-Live-AnchorID", m21481b());
        ypv.f.a("X-TT-Live-LiveID", getLiveId());
        ypv.f.a("X-TT-Live-RoomID", getRoomId());
        ypv.f.a("X-Android-UpgradeVersion-Time", xml.m26032k());
    }
}
