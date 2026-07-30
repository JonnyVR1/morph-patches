package p153l;

import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class ew40 implements ipl<BLive, BLiveRoom> {

    /* JADX INFO: renamed from: a */
    public C22507a<BLive> f96091a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<BLiveRoom> f96092b = C22507a.m222758b();

    @Override // p153l.ipl
    /* JADX INFO: renamed from: a */
    public void mo122885a() {
        this.f96091a = C22507a.m222758b();
        this.f96092b = C22507a.m222758b();
        zrv.f205804f.m123608b();
    }

    /* JADX INFO: renamed from: b */
    public final String m122886b() {
        return (!m141532m(this.f96091a) || mo122892l().anchor == null) ? "" : mo122892l().anchor.f45267id;
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLive mo122892l() {
        return this.f96091a.m222761e();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<BLive> m122888d() {
        return this.f96091a;
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveRoom mo122891j() {
        return this.f96092b.m222761e();
    }

    /* JADX INFO: renamed from: f */
    public C22421c<BLiveRoom> m122890f() {
        return this.f96092b;
    }

    @Override // p153l.ipl
    public String getLiveId() {
        return m141532m(this.f96091a) ? this.f96091a.m222761e().f45171id : "";
    }

    @Override // p153l.ipl
    public String getRoomId() {
        return m141532m(this.f96092b) ? this.f96092b.m222761e().f45172id : "";
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: n */
    public void mo122893n(BLiveAbsData bLiveAbsData) {
        this.f96091a.onNext((BLive) bLiveAbsData);
        zrv.f205804f.m123607a("X-TT-Live-AnchorID", m122886b());
        zrv.f205804f.m123607a("X-TT-Live-LiveID", getLiveId());
        zrv.f205804f.m123607a("X-TT-Live-RoomID", getRoomId());
        zrv.f205804f.m123607a("X-Android-UpgradeVersion-Time", ipl.m141531k());
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: o */
    public void mo122894o(BLiveAbsRoom bLiveAbsRoom) {
        this.f96092b.onNext((BLiveRoom) bLiveAbsRoom);
        zrv.f205804f.m123607a("X-TT-Live-AnchorID", m122886b());
        zrv.f205804f.m123607a("X-TT-Live-LiveID", getLiveId());
        zrv.f205804f.m123607a("X-TT-Live-RoomID", getRoomId());
        zrv.f205804f.m123607a("X-Android-UpgradeVersion-Time", ipl.m141531k());
    }
}
