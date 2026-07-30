package p009l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.bbo0;
import l.bsm;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.ltc0;
import l.mqv;
import l.nnn0;
import l.p1k0;
import l.qib0;
import l.s7m;
import l.wxs;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uxo0<D extends nnn0> extends wjm0<sxo0<D>, D> {

    /* JADX INFO: renamed from: k */
    public mqv<User> f21365k;

    /* JADX INFO: renamed from: l */
    public ltc0 f21366l;

    /* JADX INFO: renamed from: m */
    public bbo0 f21367m;

    public uxo0(bsm<D> bsmVar, VImage vImage) {
        super(bsmVar);
        C(new sxo0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m23177m4() {
        ltc0 ltc0Var = this.f21366l;
        if (ltc0Var != null) {
            ltc0Var.h();
        }
        bbo0 bbo0Var = this.f21367m;
        if (bbo0Var != null) {
            bbo0Var.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m23178p4(ArrayList arrayList) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((sxo0) s7mVar).m22414f(this.f21365k);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m23179O3() {
        super.O3();
        m23177m4();
        this.f21365k = null;
    }

    /* JADX INFO: renamed from: P3 */
    public void m23180P3() {
        super.P3();
        mqv<User> mqvVar = mo21933h4() == null ? null : mo21933h4().c;
        this.f21365k = mqvVar;
        ((sxo0) ((bwr) this).viewModel).m22414f(mqvVar);
        N3(E2().T1()).subscribe(ffw.d(new e30() { // from class: l.txo0
            public final void call(Object obj) {
                this.f20911a.m23178p4((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m23181n() {
        super/*l.h4t*/.n();
        m23177m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m23182n4(String str) {
        return E2().S0(str);
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m23183o4() {
        p1k0 p1k0VarMo21933h4 = mo21933h4();
        if (p1k0VarMo21933h4 != null) {
            if (E2().P2().r().m23838G(((DbObject) p1k0VarMo21933h4.o().h()).id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    public void m23184q4(mqv<User> mqvVar) {
        User userH = mqvVar.h();
        if (E2().n0().isVoiceLive() && !TEnum.equals(qib0.h0, "indonesia")) {
            if (this.f21367m == null) {
                this.f21367m = new bbo0();
            }
            this.f21367m.p(((wxs) this).f, E2().P2().l(((DbObject) ((User) mqvVar.a)).id) != null, mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.f23200e.getString(R.string.Li), LongLinkChatMessage.RoomType.voice.getNumber(), ((BLiveAbsData) E2().V2()).liveMode);
        } else if (!m24304i0(((DbObject) mqvVar.h()).id) || TEnum.equals(qib0.h0, "indonesia")) {
            if (this.f21366l == null) {
                this.f21366l = new ltc0();
            }
            this.f21366l.q(act(), mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.m25490k().j5(), TextUtils.equals("live", E2().A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.v);
            intent.putExtra("title", ypv.f23200e.getString(R.string.ac));
            intent.putExtra("hideNavigationBar", true);
            C0().startActivity(intent);
            F2().OpenUserCardDialogEvent.dismiss().p();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m23185r4() {
        F2().VoiceUserCardEvent.openManageDialog().p();
    }
}
