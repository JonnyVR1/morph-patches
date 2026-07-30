package p149l;

import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class qn40 implements xml<BLive, BLiveRoom> {

    /* JADX INFO: renamed from: a */
    public C22392a<BLive> f155382a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<BLiveRoom> f155383b = C22392a.m221512b();

    @Override // p149l.xml
    /* JADX INFO: renamed from: a */
    public void mo165464a() {
        this.f155382a = C22392a.m221512b();
        this.f155383b = C22392a.m221512b();
        ypv.f199498f.m108746b();
    }

    /* JADX INFO: renamed from: b */
    public final String m175584b() {
        return (!m210144m(this.f155382a) || mo165470l().anchor == null) ? "" : mo165470l().anchor.f44419id;
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLive mo165470l() {
        return this.f155382a.m221515e();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<BLive> m175586d() {
        return this.f155382a;
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveRoom mo165469j() {
        return this.f155383b.m221515e();
    }

    /* JADX INFO: renamed from: f */
    public C22306c<BLiveRoom> m175588f() {
        return this.f155383b;
    }

    @Override // p149l.xml
    public String getLiveId() {
        return m210144m(this.f155382a) ? this.f155382a.m221515e().f44323id : "";
    }

    @Override // p149l.xml
    public String getRoomId() {
        return m210144m(this.f155383b) ? this.f155383b.m221515e().f44324id : "";
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: n */
    public void mo165471n(BLiveAbsData bLiveAbsData) {
        this.f155382a.onNext((BLive) bLiveAbsData);
        ypv.f199498f.m108745a("X-TT-Live-AnchorID", m175584b());
        ypv.f199498f.m108745a("X-TT-Live-LiveID", getLiveId());
        ypv.f199498f.m108745a("X-TT-Live-RoomID", getRoomId());
        ypv.f199498f.m108745a("X-Android-UpgradeVersion-Time", xml.m210143k());
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: o */
    public void mo165472o(BLiveAbsRoom bLiveAbsRoom) {
        this.f155383b.onNext((BLiveRoom) bLiveAbsRoom);
        ypv.f199498f.m108745a("X-TT-Live-AnchorID", m175584b());
        ypv.f199498f.m108745a("X-TT-Live-LiveID", getLiveId());
        ypv.f199498f.m108745a("X-TT-Live-RoomID", getRoomId());
        ypv.f199498f.m108745a("X-Android-UpgradeVersion-Time", xml.m210143k());
    }
}
