package p009l;

import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.bbo0;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.j760;
import l.mqv;
import l.nnn0;
import l.s7m;
import l.wxs;
import l.zvf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rwl0<D extends nnn0> extends wjm0<pwl0<D>, D> {

    /* JADX INFO: renamed from: k */
    public mqv<User> f20010k;

    /* JADX INFO: renamed from: l */
    public bbo0 f20011l;

    public rwl0(bsm<D> bsmVar, VImage vImage) {
        super(bsmVar);
        C(new pwl0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m21847m4() {
        bbo0 bbo0Var = this.f20011l;
        if (bbo0Var != null) {
            bbo0Var.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m21848o4(ArrayList arrayList) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((pwl0) s7mVar).m20750f(this.f20010k);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m21849O3() {
        super.O3();
        m21847m4();
        this.f20010k = null;
    }

    /* JADX INFO: renamed from: P3 */
    public void m21850P3() {
        super.P3();
        mqv<User> mqvVar = mo21933h4() == null ? null : mo21933h4().c;
        this.f20010k = mqvVar;
        ((pwl0) ((bwr) this).viewModel).m20750f(mqvVar);
        N3(E2().T1()).subscribe(ffw.d(new e30() { // from class: l.qwl0
            public final void call(Object obj) {
                this.f19568a.m21848o4((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m21851n() {
        super/*l.h4t*/.n();
        m21847m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m21852n4(String str) {
        return E2().S0(str);
    }

    /* JADX INFO: renamed from: p4 */
    public void m21853p4(mqv<User> mqvVar) {
        User userH = mqvVar.h();
        if (this.f20011l == null) {
            this.f20011l = new bbo0();
        }
        this.f20011l.p(((wxs) this).f, E2().P2().l(((DbObject) ((User) mqvVar.a)).id) != null, mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.f23200e.getString(R.string.Li), LongLinkChatMessage.RoomType.voice.getNumber(), ((BLiveAbsData) E2().V2()).liveMode);
    }

    /* JADX INFO: renamed from: q4 */
    public void m21854q4(String str) {
        zvf0.u("e_audio_user_managment_button", "p_audio_profile", new j760[]{new j760("anchorId", E2().j0()), new j760("liveId", E2().k())});
        F2().VoiceUserCardEvent.openManageDialogWithSource().j(str);
    }
}
