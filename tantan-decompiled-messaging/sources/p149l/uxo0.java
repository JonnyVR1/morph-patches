package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import p147v.VImage;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class uxo0<D extends nnn0> extends wjm0<sxo0<D>, D> {

    /* JADX INFO: renamed from: k */
    public mqv<User> f178752k;

    /* JADX INFO: renamed from: l */
    public ltc0 f178753l;

    /* JADX INFO: renamed from: m */
    public bbo0 f178754m;

    public uxo0(bsm<D> bsmVar, VImage vImage) {
        super(bsmVar);
        mo51532C(new sxo0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m196187m4() {
        ltc0 ltc0Var = this.f178753l;
        if (ltc0Var != null) {
            ltc0Var.m151679h();
        }
        bbo0 bbo0Var = this.f178754m;
        if (bbo0Var != null) {
            bbo0Var.m101004j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m196188p4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((sxo0) v2).m186532f(this.f178752k);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        m196187m4();
        this.f178752k = null;
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        mqv<User> mqvVar = mo181707h4() == null ? null : mo181707h4().f146688c;
        this.f178752k = mqvVar;
        ((sxo0) this.viewModel).m186532f(mqvVar);
        m207199N3(m206027E2().m132095T1()).subscribe(ffw.m121193d(new e30() { // from class: l.txo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172517a.m196188p4((ArrayList) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m196187m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m196189n4(String str) {
        return m206027E2().m132091S0(str);
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m196190o4() {
        p1k0 p1k0VarMo181707h4 = mo181707h4();
        if (p1k0VarMo181707h4 != null) {
            if (m206027E2().m160249P2().m102069r().m201354G(p1k0VarMo181707h4.m167095o().m156005h().f56011id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    public void m196191q4(mqv<User> mqvVar) {
        User userM156005h = mqvVar.m156005h();
        if (m206027E2().m132152n0().isVoiceLive() && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            if (this.f178754m == null) {
                this.f178754m = new bbo0();
            }
            this.f178754m.m101010p(this.f188513f, m206027E2().m160249P2().m102063l(mqvVar.f135304a.f56011id) != null, mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.f199497e.getString(R$string.f46817Li), LongLinkChatMessage.RoomType.voice.getNumber(), m206027E2().mo149813j().liveMode);
        } else if (!m203477i0(mqvVar.m156005h().f56011id) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            if (this.f178753l == null) {
                this.f178753l = new ltc0();
            }
            this.f178753l.m151688q(act(), mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.m215672k().m195864j5(), TextUtils.equals("live", m206027E2().mo132054A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m104249C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.f85672v);
            intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
            intent.putExtra("hideNavigationBar", true);
            m104249C0().startActivity(intent);
            m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m196192r4() {
        m206028F2().VoiceUserCardEvent.openManageDialog().m172467p();
    }
}
