package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes5.dex */
public class fhm0 extends nnn0 implements o91 {

    /* JADX INFO: renamed from: e0 */
    public JumpRoomData f97521e0;

    /* JADX INFO: renamed from: f0 */
    public AudienceStartData f97522f0;

    /* JADX INFO: renamed from: g0 */
    public long f97523g0;

    /* JADX INFO: renamed from: h0 */
    public final C22393b<Throwable> f97524h0;

    public fhm0(oqn0 oqn0Var, zgt zgtVar) {
        super(oqn0Var, zgtVar);
        this.f97524h0 = C22393b.m221521b();
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: F0 */
    public int mo120451F0() {
        if (mo97490p()) {
            return 1;
        }
        return super.mo120451F0();
    }

    @Override // p149l.nnn0
    /* JADX INFO: renamed from: I3 */
    public void mo121369I3(boolean z) {
        this.f97522f0.autoJoinGame = z;
    }

    @Override // p149l.nnn0
    /* JADX INFO: renamed from: L2 */
    public boolean mo121370L2() {
        AudienceStartData audienceStartData = this.f97522f0;
        if (!audienceStartData.needAutoApplySettle) {
            return false;
        }
        audienceStartData.needAutoApplySettle = false;
        return true;
    }

    @Override // p149l.nnn0
    /* JADX INFO: renamed from: M2 */
    public boolean mo121371M2() {
        AudienceStartData audienceStartData = this.f97522f0;
        if (!audienceStartData.needShowRoomInfoDialog) {
            return false;
        }
        audienceStartData.needShowRoomInfoDialog = false;
        return true;
    }

    @Override // p149l.nnn0
    /* JADX INFO: renamed from: N2 */
    public boolean mo121372N2() {
        return this.f97522f0.autoJoinGame;
    }

    @Override // p149l.nnn0
    /* JADX INFO: renamed from: R2 */
    public String mo121373R2() {
        return this.f97522f0.source;
    }

    /* JADX INFO: renamed from: U3 */
    public String m121374U3() {
        return this.f97522f0.getVoiceBusinessType();
    }

    /* JADX INFO: renamed from: V3 */
    public String m121375V3() {
        return this.f97522f0.getVoiceBusinessProvider();
    }

    /* JADX INFO: renamed from: W3 */
    public C22393b<Throwable> m121376W3() {
        return this.f97524h0;
    }

    /* JADX INFO: renamed from: X3 */
    public String m121377X3() {
        return this.f97522f0.getVoicePushUrl();
    }

    /* JADX INFO: renamed from: Y3 */
    public String m121378Y3() {
        return this.f97522f0.getRoomId();
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<r8d0> m121379Z3(BLiveAbsData bLiveAbsData) {
        r8d0 r8d0Var = this.f108768y;
        return (r8d0Var == null || !TextUtils.equals(r8d0Var.f187610c.f44323id, bLiveAbsData.f44323id)) ? VoiceRoomApiProvider.getLiveInfo(bLiveAbsData) : C22306c.just(this.f108768y).observeOn(jo0.m142408a());
    }

    @Override // p149l.o91
    /* JADX INFO: renamed from: a */
    public void mo97486a(boolean z) {
        this.f139747Q = z;
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m121380a4() {
        AudienceStartData audienceStartData = this.f97522f0;
        if (audienceStartData != null) {
            return audienceStartData.simpleChat;
        }
        return false;
    }

    @Override // p149l.o91
    /* JADX INFO: renamed from: b */
    public aht mo97487b() {
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public AudienceStartData m121381b4() {
        if (this.f97522f0 == null) {
            this.f97522f0 = new AudienceStartData.C11430a().m67611u();
        }
        return this.f97522f0;
    }

    @Override // p149l.nnn0, p149l.ho2
    /* JADX INFO: renamed from: c0 */
    public void mo97488c0(boolean z) {
        super.mo97488c0(z);
        this.f97521e0 = null;
        if (this.f97522f0 == null || vdt.m198092b(3)) {
            return;
        }
        this.f97522f0.clearQuickInfo();
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m121382c4() {
        return (vdt.m198092b(3) || !ypv.m215672k().m195976w7() || TextUtils.isEmpty(m121378Y3()) || TextUtils.isEmpty(m121375V3()) || TextUtils.isEmpty(m121374U3()) || TextUtils.isEmpty(m121377X3())) ? false : true;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m121383d4(r8d0 r8d0Var) {
        this.f108768y = r8d0Var;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: e2 */
    public void mo97489e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f108765v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f44323id, bLiveAbsData2.f44323id)) {
            super.mo97489e2(z, bLiveAbsData);
        } else if (this.f139747Q && this.f139749S) {
            mo132082O1(z, bLiveAbsData.f44323id, bLiveAbsData.room.f44419id);
            this.f139749S = false;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m121384e4(Act act, BLiveAbsData bLiveAbsData) {
        act.duringCreated(m121379Z3(bLiveAbsData)).subscribe(ffw.m121197h(new e30() { // from class: l.ehm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91359a.m121383d4((r8d0) obj);
            }
        }));
    }

    @Override // p149l.o91
    public void exit() {
        if (!m160274l3() && ypv.f199493a != null) {
            VoiceRoomApiProvider.getOutRoom(m149818o(), ypv.f199493a.m199309D0(), m149826x());
        }
        mo149812h(pdu.f148371b);
        m132132g2(mo149813j());
        mo97488c0(false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m121385f4(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null || !jumpRoomData.isOldDataValid()) {
            this.f97521e0 = null;
        } else {
            this.f97521e0 = jumpRoomData;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m121386g4(AudienceStartData audienceStartData) {
        this.f97522f0 = audienceStartData;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo97491y0() {
        return this.f97521e0;
    }
}
