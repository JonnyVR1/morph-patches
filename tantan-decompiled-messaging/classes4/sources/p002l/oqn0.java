package p002l;

import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import l.ypv;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oqn0 implements xml<BLiveVoice, BLiveVoiceRoom> {

    /* JADX INFO: renamed from: a */
    public a<BLiveVoice> f16751a = a.b();

    /* JADX INFO: renamed from: b */
    public a<BLiveVoiceRoom> f16752b = a.b();

    /* JADX INFO: renamed from: b */
    private String m19683b() {
        return (!m26033m(this.f16751a) || ((BLiveAbsData) mo19690l()).anchor == null) ? "" : ((BLiveAbsData) mo19690l()).anchor.id;
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: a */
    public void mo19684a() {
        this.f16751a = a.b();
        this.f16752b = a.b();
        ypv.f.b();
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveVoice mo19690l() {
        return (BLiveVoice) this.f16751a.e();
    }

    /* JADX INFO: renamed from: d */
    public c<BLiveVoice> m19686d() {
        return this.f16751a;
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceRoom mo19689j() {
        return (BLiveVoiceRoom) this.f16752b.e();
    }

    /* JADX INFO: renamed from: f */
    public c<BLiveVoiceRoom> m19688f() {
        return this.f16752b;
    }

    @Override // p002l.xml
    public String getLiveId() {
        return m26033m(this.f16751a) ? ((BLiveAbsData) ((BLiveVoice) this.f16751a.e())).id : "";
    }

    @Override // p002l.xml
    public String getRoomId() {
        return m26033m(this.f16752b) ? ((BLiveAbsRoom) ((BLiveVoiceRoom) this.f16752b.e())).id : "";
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: n */
    public void mo19691n(BLiveAbsData bLiveAbsData) {
        this.f16751a.onNext((BLiveVoice) bLiveAbsData);
        ypv.f.a("X-TT-Live-AnchorID", m19683b());
        ypv.f.a("X-TT-Live-LiveID", getLiveId());
        ypv.f.a("X-TT-Live-RoomID", getRoomId());
        ypv.f.a("X-Android-UpgradeVersion-Time", xml.m26032k());
    }

    @Override // p002l.xml
    /* JADX INFO: renamed from: o */
    public void mo19692o(BLiveAbsRoom bLiveAbsRoom) {
        this.f16752b.onNext((BLiveVoiceRoom) bLiveAbsRoom);
        ypv.f.a("X-TT-Live-AnchorID", m19683b());
        ypv.f.a("X-TT-Live-LiveID", getLiveId());
        ypv.f.a("X-TT-Live-RoomID", getRoomId());
        ypv.f.a("X-Android-UpgradeVersion-Time", xml.m26032k());
    }
}
