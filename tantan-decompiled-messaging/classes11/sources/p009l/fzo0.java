package p009l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bbo0;
import l.bsm;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.j760;
import l.ltc0;
import l.mqv;
import l.nnn0;
import l.p1k0;
import l.qib0;
import l.r610;
import l.soj0;
import l.u4n0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.wxs;
import l.x4s;
import l.xh0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fzo0<D extends nnn0> extends wjm0<xyo0<D>, D> {

    /* JADX INFO: renamed from: k */
    public ltc0 f13247k;

    /* JADX INFO: renamed from: l */
    public bbo0 f13248l;

    /* JADX INFO: renamed from: m */
    public mqv<User> f13249m;

    /* JADX INFO: renamed from: n */
    public p1k0 f13250n;

    public fzo0(bsm<D> bsmVar) {
        super(bsmVar);
        C(new xyo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m14678F4(soj0 soj0Var) {
        ((xyo0) ((bwr) this).viewModel).m25085k(m14708v4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m14679G4(Boolean bool) {
        p1k0 p1k0Var = this.f13250n;
        if (p1k0Var != null) {
            p1k0Var.r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: H4 */
    private gzo0 m14680H4() {
        String strT;
        if (this.f13249m == null || this.f13250n == null) {
            return null;
        }
        boolean z = true;
        if (E2().P2().l(((DbObject) ((User) this.f13249m.a)).id) != null) {
            strT = w8u.t(R.string.qi);
        } else if (this.f13250n.c(((DbObject) ((User) this.f13249m.a)).id)) {
            strT = w8u.t(R.string.Gh);
            z = false;
        } else {
            strT = w8u.t(R.string.D8);
        }
        gzo0 gzo0Var = new gzo0(strT);
        gzo0Var.m15370d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: I4 */
    private void m14681I4() {
        if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            F2().ManagerPersonEvent.forbiddenWords().j(this.f13249m);
        } else if (this.f13250n.r().isJailed) {
            F2().ManagerPersonEvent.unMuteWords().j(this.f13249m);
        } else {
            F2().ManagerPersonEvent.forbiddenWords().j(this.f13249m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public void m14695C4(List<gzo0> list, String str) {
        gzo0 gzo0Var;
        str.getClass();
        switch (str) {
            case "sayHello":
                gzo0Var = new gzo0("打招呼");
                break;
            case "managerInvite":
                gzo0Var = m14691w4();
                break;
            case "report":
                gzo0Var = m14692x4();
                break;
            case "kickRoom":
                gzo0Var = new gzo0(w8u.t(R.string.ob));
                break;
            case "unblock":
                gzo0Var = new gzo0(w8u.t(R.string.Cf));
                break;
            case "blocked":
                gzo0Var = new gzo0(w8u.t(R.string.Bf));
                break;
            case "call":
                gzo0Var = m14680H4();
                break;
            case "jail":
                if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
                    gzo0Var = new gzo0(w8u.t(R.string.t9));
                    break;
                } else {
                    gzo0Var = new gzo0(w8u.t(this.f13250n.r().isJailed ? R.string.U1 : R.string.t9));
                    break;
                }
                break;
            case "voice":
                gzo0Var = m14690u4();
                break;
            default:
                gzo0Var = null;
                break;
        }
        if (gzo0Var != null) {
            list.add(gzo0Var);
            gzo0Var.m15371e(str);
        }
    }

    /* JADX INFO: renamed from: t4 */
    private void m14689t4() {
        ltc0 ltc0Var = this.f13247k;
        if (ltc0Var != null) {
            ltc0Var.h();
        }
        bbo0 bbo0Var = this.f13248l;
        if (bbo0Var != null) {
            bbo0Var.j();
        }
    }

    /* JADX INFO: renamed from: u4 */
    private gzo0 m14690u4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(((DbObject) ((User) mo21933h4().c.a)).id);
        if (bLiveVoiceCallL == null) {
            return null;
        }
        if (m24304i0(bLiveVoiceCallL.user) && !L2()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallL.mutedByUser || bLiveVoiceCallL.mutedByAnchor) {
            int i2 = R.string.oi;
            z = (m14710z4() || L2()) && bLiveVoiceCallL.mutedByAnchor;
            i = i2;
        } else {
            i = R.string.oj;
        }
        gzo0 gzo0Var = new gzo0(w8u.t(i));
        gzo0Var.m15370d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: w4 */
    private gzo0 m14691w4() {
        List list = (List) F3(new twn0(3800));
        return new gzo0((list == null || !vwb.m(list, new w9j() { // from class: l.dzo0
            public final Object call(Object obj) {
                return this.f12076a.m14696D4((BLiveVoiceManager) obj);
            }
        })) ? w8u.t(R.string.Ih) : w8u.t(R.string.Nf));
    }

    /* JADX INFO: renamed from: x4 */
    private gzo0 m14692x4() {
        return new gzo0(ypv.f23200e.getString(((idv) ypv.m25491l(fld0.f13076b)).m16499i(ypv.f23196a.m23619D0()).hierarchy.grade < ypv.m25490k().R5() ? R.string.ac : R.string.yb));
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m14693A4() {
        p1k0 p1k0Var = this.f13250n;
        return (p1k0Var == null || p1k0Var.r() == null || this.f13250n.r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m14694B4(View view) {
        F2().VoiceLiveManagerEvent.onCancelManager().j((User) mo21933h4().o().a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m14696D4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(((DbObject) ((User) this.f13249m.a)).id));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ Boolean m14697E4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(((DbObject) ((User) this.f13249m.a)).id));
    }

    /* JADX INFO: renamed from: J4 */
    public void m14698J4(String str) {
        ((xyo0) ((bwr) this).viewModel).m25080e();
        if (this.f13249m == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "sayHello":
                zvf0.u("e_audio_greeting", "p_audio_profile", new j760[]{j760.a("anchorId", j3()), j760.a("liveId", E2().k()), j760.a("receiver_user_id", ((DbObject) ((User) this.f13249m.a)).id)});
                ypv.f23196a.m23645a0(((wxs) this).f, ((DbObject) ((User) this.f13249m.a)).id);
                break;
            case "managerInvite":
                m14699K4();
                break;
            case "report":
                m14701M4(this.f13249m);
                break;
            case "kickRoom":
                F2().ManagerPersonEvent.kickOff().j(this.f13249m);
                break;
            case "unblock":
                if (this.f13249m != null) {
                    F2().VoiceBlackListEvent.addBlackList().j((User) this.f13249m.a);
                    break;
                }
                break;
            case "jail":
                m14681I4();
                break;
            case "voice":
                m14702N4();
                break;
            case "realNamePrivateChat":
                mqv<User> mqvVar = this.f13249m;
                if (mqvVar != null) {
                    m14700L4(((DbObject) ((User) mqvVar.a)).id);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m14699K4() {
        if (vwb.m((List) F3(new twn0(3800)), new w9j() { // from class: l.bzo0
            public final Object call(Object obj) {
                return this.f10367a.m14697E4((BLiveVoiceManager) obj);
            }
        })) {
            m14706s4();
        } else {
            m14709y4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m14700L4(String str) {
        act().startActivity(ypv.f23196a.m23695z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: M4 */
    public void m14701M4(mqv<User> mqvVar) {
        User userH = mqvVar.h();
        if (E2().n0().isVoiceLive() && !TEnum.equals(qib0.h0, "indonesia")) {
            boolean z = E2().P2().l(((DbObject) ((User) mqvVar.a)).id) != null;
            if (this.f13248l == null) {
                this.f13248l = new bbo0();
            }
            this.f13248l.p(((wxs) this).f, z, mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.f23200e.getString(R.string.Li), LongLinkChatMessage.RoomType.voice.getNumber(), ((BLiveAbsData) E2().V2()).liveMode);
            return;
        }
        if (!m24304i0(((DbObject) mqvVar.h()).id) || TEnum.equals(qib0.h0, "indonesia")) {
            if (this.f13247k == null) {
                this.f13247k = new ltc0();
            }
            this.f13247k.q(act(), mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.m25490k().j5(), TextUtils.equals("live", E2().A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.v);
            intent.putExtra("title", ypv.f23200e.getString(R.string.ac));
            intent.putExtra("hideNavigationBar", true);
            C0().startActivity(intent);
            F2().OpenUserCardDialogEvent.dismiss().p();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m14702N4() {
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(((DbObject) ((User) mo21933h4().c.a)).id);
        if (bLiveVoiceCallL != null) {
            if (!bLiveVoiceCallL.mutedByAnchor || L2() || m14710z4()) {
                if (bLiveVoiceCallL.mutedByUser && L2()) {
                    return;
                }
                u4n0.p(this, bLiveVoiceCallL.id, (bLiveVoiceCallL.mutedByUser || bLiveVoiceCallL.mutedByAnchor) ? false : true, E2().S0(((DbObject) ((User) mo21933h4().c.a)).id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m14703O4(String str) {
        p1k0 p1k0Var;
        int iIndexOf;
        mqv<User> mqvVar = this.f13249m;
        if (mqvVar == null || mqvVar.a == null || (p1k0Var = this.f13250n) == null || p1k0Var.r() == null || !TextUtils.equals(((DbObject) ((User) this.f13249m.a)).id, str) || !this.f13250n.r().manageButtons.contains("unblock") || (iIndexOf = this.f13250n.r().manageButtons.indexOf("unblock")) >= this.f13250n.r().manageButtons.size() || iIndexOf < 0) {
            return;
        }
        this.f13250n.r().manageButtons.set(iIndexOf, "blocked");
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo14704j4(p1k0 p1k0Var) {
        if (p1k0Var == null) {
            return;
        }
        this.f13250n = p1k0Var;
        this.f13249m = p1k0Var.c;
        if (((xyo0) ((bwr) this).viewModel).isShowing()) {
            ((xyo0) ((bwr) this).viewModel).m25084j(m14708v4());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14705n() {
        super/*l.h4t*/.n();
        m14689t4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m14706s4() {
        if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            F2().VoiceLiveManagerEvent.onCancelManager().j((User) mo21933h4().o().a);
            return;
        }
        String strW = r610.w(((User) mo21933h4().o().a).name, 5);
        String strU = w8u.u(R.string.af, strW);
        int iIndexOf = strU.indexOf(strW);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strU);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strW.length() + iIndexOf, 33);
        }
        new xh0.a(act()).j(spannableStringBuilder).q(R.string.cf).o(new View.OnClickListener() { // from class: l.ezo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12741a.m14694B4(view);
            }
        }).e(R.string.bf).a().g();
    }

    /* JADX INFO: renamed from: t */
    public void m14707t() {
        super/*l.k4t*/.t();
        h3(F2().VoiceUserCardEvent.openManageDialog(), new e30() { // from class: l.yyo0
            public final void call(Object obj) {
                this.f23294a.m14678F4((soj0) obj);
            }
        });
        duringCreated((c) F2().VoiceUserCardEvent.setJailed().g()).subscribe(ffw.h(new e30() { // from class: l.zyo0
            public final void call(Object obj) {
                this.f24053a.m14679G4((Boolean) obj);
            }
        }));
        duringCreated((c) F2().VoiceBlackListEvent.updateBlackStatus().g()).subscribe(ffw.h(new e30() { // from class: l.azo0
            public final void call(Object obj) {
                this.f9777a.m14703O4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public List<gzo0> m14708v4() {
        final ArrayList arrayList = new ArrayList();
        if (m14693A4()) {
            vwb.z(this.f13250n.r().manageButtons, new e30() { // from class: l.czo0
                public final void call(Object obj) {
                    this.f10830a.m14695C4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y4 */
    public void m14709y4() {
        F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().j(((DbObject) ((User) mo21933h4().o().a)).id);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m14710z4() {
        return E2().S0("");
    }
}
