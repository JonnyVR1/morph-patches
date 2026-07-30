package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes5.dex */
public class jqm0 extends rwn0 implements v91 {

    /* JADX INFO: renamed from: e0 */
    public JumpRoomData f122229e0;

    /* JADX INFO: renamed from: f0 */
    public AudienceStartData f122230f0;

    /* JADX INFO: renamed from: g0 */
    public long f122231g0;

    /* JADX INFO: renamed from: h0 */
    public final C22508b<Throwable> f122232h0;

    public jqm0(szn0 szn0Var, ajt ajtVar) {
        super(szn0Var, ajtVar);
        this.f122232h0 = C22508b.m222767b();
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: F0 */
    public int mo146094F0() {
        if (mo118373p()) {
            return 1;
        }
        return super.mo146094F0();
    }

    @Override // p153l.rwn0
    /* JADX INFO: renamed from: I3 */
    public void mo146595I3(boolean z) {
        this.f122230f0.autoJoinGame = z;
    }

    @Override // p153l.rwn0
    /* JADX INFO: renamed from: L2 */
    public boolean mo146596L2() {
        AudienceStartData audienceStartData = this.f122230f0;
        if (!audienceStartData.needAutoApplySettle) {
            return false;
        }
        audienceStartData.needAutoApplySettle = false;
        return true;
    }

    @Override // p153l.rwn0
    /* JADX INFO: renamed from: M2 */
    public boolean mo146597M2() {
        AudienceStartData audienceStartData = this.f122230f0;
        if (!audienceStartData.needShowRoomInfoDialog) {
            return false;
        }
        audienceStartData.needShowRoomInfoDialog = false;
        return true;
    }

    @Override // p153l.rwn0
    /* JADX INFO: renamed from: N2 */
    public boolean mo146598N2() {
        return this.f122230f0.autoJoinGame;
    }

    @Override // p153l.rwn0
    /* JADX INFO: renamed from: R2 */
    public String mo146599R2() {
        return this.f122230f0.source;
    }

    /* JADX INFO: renamed from: U3 */
    public String m146600U3() {
        return this.f122230f0.getVoiceBusinessType();
    }

    /* JADX INFO: renamed from: V3 */
    public String m146601V3() {
        return this.f122230f0.getVoiceBusinessProvider();
    }

    /* JADX INFO: renamed from: W3 */
    public C22508b<Throwable> m146602W3() {
        return this.f122232h0;
    }

    /* JADX INFO: renamed from: X3 */
    public String m146603X3() {
        return this.f122230f0.getVoicePushUrl();
    }

    /* JADX INFO: renamed from: Y3 */
    public String m146604Y3() {
        return this.f122230f0.getRoomId();
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<ugd0> m146605Z3(BLiveAbsData bLiveAbsData) {
        ugd0 ugd0Var = this.f148281y;
        return (ugd0Var == null || !TextUtils.equals(ugd0Var.f138293c.f45171id, bLiveAbsData.f45171id)) ? VoiceRoomApiProvider.getLiveInfo(bLiveAbsData) : C22421c.just(this.f148281y).observeOn(fo0.m126432a());
    }

    @Override // p153l.v91
    /* JADX INFO: renamed from: a */
    public void mo146606a(boolean z) {
        this.f165194Q = z;
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m146607a4() {
        AudienceStartData audienceStartData = this.f122230f0;
        if (audienceStartData != null) {
            return audienceStartData.simpleChat;
        }
        return false;
    }

    @Override // p153l.v91
    /* JADX INFO: renamed from: b */
    public bjt mo146608b() {
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public AudienceStartData m146609b4() {
        if (this.f122230f0 == null) {
            this.f122230f0 = new AudienceStartData.C11593a().m68794u();
        }
        return this.f122230f0;
    }

    @Override // p153l.rwn0, p153l.oo2
    /* JADX INFO: renamed from: c0 */
    public void mo146610c0(boolean z) {
        super.mo146610c0(z);
        this.f122229e0 = null;
        if (this.f122230f0 == null || wft.m206159b(3)) {
            return;
        }
        this.f122230f0.clearQuickInfo();
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m146611c4() {
        return (wft.m206159b(3) || !zrv.m221193k().m203763w7() || TextUtils.isEmpty(m146604Y3()) || TextUtils.isEmpty(m146601V3()) || TextUtils.isEmpty(m146600U3()) || TextUtils.isEmpty(m146603X3())) ? false : true;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m146612d4(ugd0 ugd0Var) {
        this.f148281y = ugd0Var;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: e2 */
    public void mo146096e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f148278v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f45171id, bLiveAbsData2.f45171id)) {
            super.mo146096e2(z, bLiveAbsData);
        } else if (this.f165194Q && this.f165196S) {
            mo118372O1(z, bLiveAbsData.f45171id, bLiveAbsData.room.f45267id);
            this.f165196S = false;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m146613e4(Act act, BLiveAbsData bLiveAbsData) {
        act.duringCreated(m146605Z3(bLiveAbsData)).subscribe(dhw.m115829h(new y20() { // from class: l.iqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116425a.m146612d4((ugd0) obj);
            }
        }));
    }

    @Override // p153l.v91
    public void exit() {
        if (!m183438l3() && zrv.f205799a != null) {
            VoiceRoomApiProvider.getOutRoom(m202194o(), zrv.f205799a.m207631D0(), m202200x());
        }
        mo160116h(qfu.f157341b);
        m168518g2(mo183435j());
        mo146610c0(false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m146614f4(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null || !jumpRoomData.isOldDataValid()) {
            this.f122229e0 = null;
        } else {
            this.f122229e0 = jumpRoomData;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m146615g4(AudienceStartData audienceStartData) {
        this.f122230f0 = audienceStartData;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: y0 */
    public JumpRoomData mo146616y0() {
        return this.f122229e0;
    }
}
