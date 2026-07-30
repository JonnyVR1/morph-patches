package p149l;

import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import p147v.VImage;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class rwl0<D extends nnn0> extends wjm0<pwl0<D>, D> {

    /* JADX INFO: renamed from: k */
    public mqv<User> f161357k;

    /* JADX INFO: renamed from: l */
    public bbo0 f161358l;

    public rwl0(bsm<D> bsmVar, VImage vImage) {
        super(bsmVar);
        mo51532C(new pwl0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m181432m4() {
        bbo0 bbo0Var = this.f161358l;
        if (bbo0Var != null) {
            bbo0Var.m101004j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m181433o4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((pwl0) v2).m171759f(this.f161357k);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        m181432m4();
        this.f161357k = null;
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        mqv<User> mqvVar = mo181707h4() == null ? null : mo181707h4().f146688c;
        this.f161357k = mqvVar;
        ((pwl0) this.viewModel).m171759f(mqvVar);
        m207199N3(m206027E2().m132095T1()).subscribe(ffw.m121193d(new e30() { // from class: l.qwl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156739a.m181433o4((ArrayList) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m181432m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m181434n4(String str) {
        return m206027E2().m132091S0(str);
    }

    /* JADX INFO: renamed from: p4 */
    public void m181435p4(mqv<User> mqvVar) {
        User userM156005h = mqvVar.m156005h();
        if (this.f161358l == null) {
            this.f161358l = new bbo0();
        }
        this.f161358l.m101010p(this.f188513f, m206027E2().m160249P2().m102063l(mqvVar.f135304a.f56011id) != null, mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.f199497e.getString(R$string.f46817Li), LongLinkChatMessage.RoomType.voice.getNumber(), m206027E2().mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: q4 */
    public void m181436q4(String str) {
        zvf0.m220399u("e_audio_user_managment_button", "p_audio_profile", new j760("anchorId", m206027E2().m132140j0()), new j760("liveId", m206027E2().m149814k()));
        m206028F2().VoiceUserCardEvent.openManageDialogWithSource().mo172463j(str);
    }
}
