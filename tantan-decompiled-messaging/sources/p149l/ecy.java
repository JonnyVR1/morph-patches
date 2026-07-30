package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p149l.fcy;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class ecy<D extends nnn0, VM extends fcy> extends gay<D, VM> {
    public ecy(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        mo51532C(vm);
    }

    /* JADX INFO: renamed from: i4 */
    private void m115765i4() {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        m206027E2().mo132080N1(bLiveVoiceMo149813j.room.f44419id);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo115766S3() {
        return new vay("在线", ((fcy) this.viewModel).m120504b(), 0);
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo115767T3() {
        return 0;
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: U3 */
    public void mo115768U3() {
        super.mo115768U3();
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        m206027E2().m160233D3(bLiveVoiceMo149813j.room.f44419id);
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo115769V3() {
        m115765i4();
    }

    /* JADX INFO: renamed from: c4, reason: merged with bridge method [inline-methods] */
    public final void m115775h4(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        lsi0.m151595y(w8u.m202217t(R$string.f47546tf));
        ((fcy) this.viewModel).m120506d(str, bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: d4 */
    public void m115771d4(final String str) {
        hby.m130354b(m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k(), "management_host");
        m207199N3(VCallApiProvider.callInvite(m206027E2().m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.dcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85517a.m115775h4(str, (BLiveVoiceCallInvite) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m115772e4(lyn0 lyn0Var) {
        ((fcy) this.viewModel).m120505c(lyn0Var);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m115773f4(bik0.C15867a c15867a) {
        mo115769V3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m115774g4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        mo115769V3();
    }

    public void init() {
        ((fcy) this.viewModel).init();
        m207199N3(m206027E2().m160255S3()).filter(new w9j() { // from class: l.zby
            @Override // p149l.w9j
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.m200296J(lyn0Var.f130587a)) ? false : true);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.acy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68887a.m115772e4((lyn0) obj);
            }
        }));
        m207199N3(m206027E2().m160251Q2()).filter(new krm0()).subscribe(ffw.m121193d(new e30() { // from class: l.bcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74981a.m115773f4((bik0.C15867a) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170434c0).subscribe(ffw.m121197h(new e30() { // from class: l.ccy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80335a.m115774g4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        m115765i4();
    }
}
