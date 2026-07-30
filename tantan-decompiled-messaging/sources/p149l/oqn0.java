package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class oqn0 implements xml<BLiveVoice, BLiveVoiceRoom> {

    /* JADX INFO: renamed from: a */
    public C22392a<BLiveVoice> f145169a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<BLiveVoiceRoom> f145170b = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    private String m165463b() {
        return (!m210144m(this.f145169a) || mo165470l().anchor == null) ? "" : mo165470l().anchor.f44419id;
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: a */
    public void mo165464a() {
        this.f145169a = C22392a.m221512b();
        this.f145170b = C22392a.m221512b();
        ypv.f199498f.m108746b();
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveVoice mo165470l() {
        return this.f145169a.m221515e();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<BLiveVoice> m165466d() {
        return this.f145169a;
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoom mo165469j() {
        return this.f145170b.m221515e();
    }

    /* JADX INFO: renamed from: f */
    public C22306c<BLiveVoiceRoom> m165468f() {
        return this.f145170b;
    }

    @Override // p149l.xml
    public String getLiveId() {
        return m210144m(this.f145169a) ? this.f145169a.m221515e().f44323id : "";
    }

    @Override // p149l.xml
    public String getRoomId() {
        return m210144m(this.f145170b) ? this.f145170b.m221515e().f44324id : "";
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: n */
    public void mo165471n(BLiveAbsData bLiveAbsData) {
        this.f145169a.onNext((BLiveVoice) bLiveAbsData);
        ypv.f199498f.m108745a("X-TT-Live-AnchorID", m165463b());
        ypv.f199498f.m108745a("X-TT-Live-LiveID", getLiveId());
        ypv.f199498f.m108745a("X-TT-Live-RoomID", getRoomId());
        ypv.f199498f.m108745a("X-Android-UpgradeVersion-Time", xml.m210143k());
    }

    @Override // p149l.xml
    /* JADX INFO: renamed from: o */
    public void mo165472o(BLiveAbsRoom bLiveAbsRoom) {
        this.f145170b.onNext((BLiveVoiceRoom) bLiveAbsRoom);
        ypv.f199498f.m108745a("X-TT-Live-AnchorID", m165463b());
        ypv.f199498f.m108745a("X-TT-Live-LiveID", getLiveId());
        ypv.f199498f.m108745a("X-TT-Live-RoomID", getRoomId());
        ypv.f199498f.m108745a("X-Android-UpgradeVersion-Time", xml.m210143k());
    }
}
