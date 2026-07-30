package p002l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bbo0;
import l.bwr;
import l.ddv;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.idv;
import l.ltc0;
import l.mqv;
import l.qib0;
import l.r610;
import l.s7m;
import l.ve10;
import l.ypv;
import p002l.ho2;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g0k0<D extends ho2> extends wr2<c0k0<D>, D> {

    /* JADX INFO: renamed from: k */
    public ltc0 f10706k;

    /* JADX INFO: renamed from: l */
    public bbo0 f10707l;

    /* JADX INFO: renamed from: m */
    public String f10708m;

    /* JADX INFO: renamed from: n */
    public String f10709n;

    /* JADX INFO: renamed from: o */
    public a f10710o;

    /* JADX INFO: renamed from: p */
    public final String f10711p;

    /* JADX INFO: renamed from: q */
    public final String f10712q;

    /* JADX INFO: renamed from: r */
    public final String f10713r;

    /* JADX INFO: renamed from: s */
    public mqv<User> f10714s;

    public g0k0(bsm<D> bsmVar, VText vText, VImage vImage) {
        super(bsmVar);
        this.f10708m = ypv.e.getString(R$string.f3474ob);
        this.f10709n = ypv.e.getString(R$string.f3582t9);
        this.f10711p = ypv.e.getString(R$string.f3404l7);
        this.f10712q = ypv.e.getString(R$string.f3168ac);
        this.f10713r = ypv.e.getString(R$string.f3694yb);
        C(new c0k0(vText, vImage));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        m13521n4();
        this.f10714s = null;
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        mqv<User> mqvVar = mo18414g4() == null ? null : mo18414g4().f16959c;
        this.f10714s = mqvVar;
        ((c0k0) ((bwr) this).viewModel).m10704l(mqvVar);
        m25707N3(m25547E2().m14531T1()).subscribe(ffw.d(new e30() { // from class: l.d0k0
            public final void call(Object obj) {
                this.f9011a.m13525r4((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public final void m13526s4() {
        a aVar = this.f10710o;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m13521n4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m13521n4() {
        ltc0 ltc0Var = this.f10706k;
        if (ltc0Var != null) {
            ltc0Var.h();
        }
        bbo0 bbo0Var = this.f10707l;
        if (bbo0Var != null) {
            bbo0Var.j();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m13522o4(String str) {
        return m25547E2().m14527S0(str) && m13523p4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m13523p4(String str) {
        BLiveMultiCall bLiveMultiCallE = r610.E(this, str);
        if (ve10.b(bLiveMultiCallE)) {
            return false;
        }
        return (!ve10.f(bLiveMultiCallE) || r610.M(m25334d4())) && !ve10.j(bLiveMultiCallE);
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m13524q4(String str) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2;
        if ((m25547E2() instanceof x350) && (bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2()) != null) {
            return TextUtils.equals(bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorId, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m13525r4(ArrayList arrayList) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((c0k0) s7mVar).m10704l(this.f10714s);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m13527t4(mqv mqvVar, String str) {
        if (this.f10711p.equals(str)) {
            m13528u4(mqvVar);
            e51.H(act(), new Runnable() { // from class: l.f0k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10079a.m13526s4();
                }
            }, 200L);
        } else if (this.f10712q.equals(str) || this.f10713r.equals(str)) {
            m13529v4(mqvVar);
            m13526s4();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public void m13528u4(mqv<User> mqvVar) {
        if (mqvVar == null || mqvVar.h() == null) {
            return;
        }
        m25548F2().ManagerPersonEvent.show().j(new ManagerPersonBean(mqvVar, mo18414g4() == null ? null : mo18414g4().m19973m()));
    }

    /* JADX INFO: renamed from: v4 */
    public void m13529v4(mqv<User> mqvVar) {
        User userH = mqvVar.h();
        if (m25547E2().m14588n0().isVoiceLive() && !TEnum.equals(qib0.h0, "indonesia")) {
            if (this.f10707l == null) {
                this.f10707l = new bbo0();
            }
            this.f10707l.p(this.f22037f, m25547E2().P2().l(((DbObject) ((User) mqvVar.a)).id) != null, mqvVar, m25547E2().m17235k(), m25547E2().m17239o(), m25336f4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) m25547E2().m14582l0()).id), ypv.e.getString(R$string.f2859Li), LongLinkChatMessage.RoomType.voice.getNumber(), m25547E2().m17234j().liveMode);
            return;
        }
        if ((!m25337i0(((DbObject) mqvVar.h()).id) && !m13524q4(((DbObject) mqvVar.h()).id)) || ypv.a.I()) {
            if (this.f10706k == null) {
                this.f10706k = new ltc0();
            }
            this.f10706k.q(act(), mqvVar, m25547E2().m17235k(), m25547E2().m17239o(), m25336f4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) m25547E2().m14582l0()).id), ypv.k().j5(), TextUtils.equals("live", m25547E2().mo14489A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
            return;
        }
        Intent intent = new Intent(C0(), (Class<?>) MkWebViewAct.class);
        String str = ddv.v;
        if (m13524q4(((DbObject) mqvVar.h()).id)) {
            str = str + "?officialShowAnchorId=" + ((DbObject) mqvVar.h()).id;
        }
        intent.putExtra("url", str);
        intent.putExtra("title", ypv.e.getString(R$string.f3168ac));
        intent.putExtra("hideNavigationBar", true);
        C0().startActivity(intent);
        m25548F2().OpenUserCardDialogEvent.dismiss().p();
    }

    /* JADX INFO: renamed from: w4 */
    public void m13530w4(mqv<User> mqvVar) {
        if (act() == null) {
            return;
        }
        this.f10714s = mqvVar;
        ArrayList arrayList = new ArrayList();
        if (!w220.m24291b()) {
            arrayList.add(this.f10711p);
        }
        if (((idv) ypv.l(fld0.b)).i(ypv.a.D0()).hierarchy.grade < ypv.k().R5()) {
            arrayList.add(this.f10713r);
        } else {
            arrayList.add(this.f10712q);
        }
        m13531x4(mqvVar, arrayList);
        mo19187Y3();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m13531x4(final mqv<User> mqvVar, List<String> list) {
        this.f10710o = xzj0.m26279d(this, list, new e30() { // from class: l.e0k0
            public final void call(Object obj) {
                this.f9510a.m13527t4(mqvVar, (String) obj);
            }
        });
    }
}
