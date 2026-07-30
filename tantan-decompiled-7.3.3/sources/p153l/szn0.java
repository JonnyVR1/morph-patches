package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class szn0 implements ipl<BLiveVoice, BLiveVoiceRoom> {

    /* JADX INFO: renamed from: a */
    public C22507a<BLiveVoice> f171407a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<BLiveVoiceRoom> f171408b = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    private String m188656b() {
        return (!m141532m(this.f171407a) || mo122892l().anchor == null) ? "" : mo122892l().anchor.f45267id;
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: a */
    public void mo122885a() {
        this.f171407a = C22507a.m222758b();
        this.f171408b = C22507a.m222758b();
        zrv.f205804f.m123608b();
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveVoice mo122892l() {
        return this.f171407a.m222761e();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<BLiveVoice> m188658d() {
        return this.f171407a;
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoom mo122891j() {
        return this.f171408b.m222761e();
    }

    /* JADX INFO: renamed from: f */
    public C22421c<BLiveVoiceRoom> m188660f() {
        return this.f171408b;
    }

    @Override // p153l.ipl
    public String getLiveId() {
        return m141532m(this.f171407a) ? this.f171407a.m222761e().f45171id : "";
    }

    @Override // p153l.ipl
    public String getRoomId() {
        return m141532m(this.f171408b) ? this.f171408b.m222761e().f45172id : "";
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: n */
    public void mo122893n(BLiveAbsData bLiveAbsData) {
        this.f171407a.onNext((BLiveVoice) bLiveAbsData);
        zrv.f205804f.m123607a("X-TT-Live-AnchorID", m188656b());
        zrv.f205804f.m123607a("X-TT-Live-LiveID", getLiveId());
        zrv.f205804f.m123607a("X-TT-Live-RoomID", getRoomId());
        zrv.f205804f.m123607a("X-Android-UpgradeVersion-Time", ipl.m141531k());
    }

    @Override // p153l.ipl
    /* JADX INFO: renamed from: o */
    public void mo122894o(BLiveAbsRoom bLiveAbsRoom) {
        this.f171408b.onNext((BLiveVoiceRoom) bLiveAbsRoom);
        zrv.f205804f.m123607a("X-TT-Live-AnchorID", m188656b());
        zrv.f205804f.m123607a("X-TT-Live-LiveID", getLiveId());
        zrv.f205804f.m123607a("X-TT-Live-RoomID", getRoomId());
        zrv.f205804f.m123607a("X-Android-UpgradeVersion-Time", ipl.m141531k());
    }
}
