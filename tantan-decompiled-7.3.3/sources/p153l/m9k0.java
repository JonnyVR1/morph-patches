package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class m9k0<D extends oo2> extends ms2<i9k0<D>, D> {

    /* JADX INFO: renamed from: k */
    public q1d0 f135415k;

    /* JADX INFO: renamed from: l */
    public fko0 f135416l;

    /* JADX INFO: renamed from: m */
    public String f135417m;

    /* JADX INFO: renamed from: n */
    public String f135418n;

    /* JADX INFO: renamed from: o */
    public DialogInterfaceC0075a f135419o;

    /* JADX INFO: renamed from: p */
    public final String f135420p;

    /* JADX INFO: renamed from: q */
    public final String f135421q;

    /* JADX INFO: renamed from: r */
    public final String f135422r;

    /* JADX INFO: renamed from: s */
    public nsv<User> f135423s;

    public m9k0(dum<D> dumVar, VText vText, VImage vImage) {
        super(dumVar);
        this.f135417m = zrv.f205803e.getString(R$string.f48280ob);
        this.f135418n = zrv.f205803e.getString(R$string.f48388t9);
        this.f135420p = zrv.f205803e.getString(R$string.f48210l7);
        this.f135421q = zrv.f205803e.getString(R$string.f47974ac);
        this.f135422r = zrv.f205803e.getString(R$string.f48500yb);
        mo52715C(new i9k0(vText, vImage));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        m157583n4();
        this.f135423s = null;
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        nsv<User> nsvVar = mo159733g4() == null ? null : mo159733g4().f183108c;
        this.f135423s = nsvVar;
        ((i9k0) this.viewModel).m139113l(nsvVar);
        m214779N3(m213810E2().m168481T1()).subscribe(dhw.m115825d(new y20() { // from class: l.j9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118887a.m157587r4((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public final void m157588s4() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f135419o;
        if (dialogInterfaceC0075a != null) {
            dialogInterfaceC0075a.dismiss();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m157583n4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m157583n4() {
        q1d0 q1d0Var = this.f135415k;
        if (q1d0Var != null) {
            q1d0Var.m174859h();
        }
        fko0 fko0Var = this.f135416l;
        if (fko0Var != null) {
            fko0Var.m126046j();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m157584o4(String str) {
        return m213810E2().m168477S0(str) && m157585p4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m157585p4(String str) {
        BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(this, str);
        if (fn10.m126334b(bLiveMultiCallM103799E)) {
            return false;
        }
        return (!fn10.m126338f(bLiveMultiCallM103799E) || bf10.m103807M(m159730d4())) && !fn10.m126342j(bLiveMultiCallM103799E);
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m157586q4(String str) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2;
        if ((m213810E2() instanceof mc50) && (bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2()) != null) {
            return TextUtils.equals(bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorId, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m157587r4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((i9k0) v2).m139113l(this.f135423s);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m157589t4(nsv nsvVar, String str) {
        if (this.f135420p.equals(str)) {
            m157590u4(nsvVar);
            l51.m152888H(act(), new Runnable() { // from class: l.l9k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130612a.m157588s4();
                }
            }, 200L);
        } else if (this.f135421q.equals(str) || this.f135422r.equals(str)) {
            m157591v4(nsvVar);
            m157588s4();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public void m157590u4(nsv<User> nsvVar) {
        if (nsvVar == null || nsvVar.m164643h() == null) {
            return;
        }
        m213811F2().ManagerPersonEvent.show().mo199273j(new ManagerPersonBean(nsvVar, mo159733g4() == null ? null : mo159733g4().m200538m()));
    }

    /* JADX INFO: renamed from: v4 */
    public void m157591v4(nsv<User> nsvVar) {
        User userM164643h = nsvVar.m164643h();
        if (m213810E2().m168538n0().isVoiceLive() && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            if (this.f135416l == null) {
                this.f135416l = new fko0();
            }
            this.f135416l.m126052p(this.f196919f, ((rwn0) m213810E2()).m183411P2().m136873l(nsvVar.f143542a.f56859id) != null, nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m159732f4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.f205803e.getString(R$string.f47665Li), LongLinkChatMessage.RoomType.voice.getNumber(), m213810E2().mo183435j().liveMode);
            return;
        }
        if ((!m159735i0(nsvVar.m164643h().f56859id) && !m157586q4(nsvVar.m164643h().f56859id)) || zrv.f205799a.m207638I()) {
            if (this.f135415k == null) {
                this.f135415k = new q1d0();
            }
            this.f135415k.m174868q(act(), nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m159732f4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.m221193k().m203651j5(), TextUtils.equals("live", m213810E2().mo118362A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
            return;
        }
        Intent intent = new Intent(m113230C0(), (Class<?>) MkWebViewAct.class);
        String str = efv.f93865v;
        if (m157586q4(nsvVar.m164643h().f56859id)) {
            str = str + "?officialShowAnchorId=" + nsvVar.m164643h().f56859id;
        }
        intent.putExtra("url", str);
        intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
        intent.putExtra("hideNavigationBar", true);
        m113230C0().startActivity(intent);
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: w4 */
    public void m157592w4(nsv<User> nsvVar) {
        if (act() == null) {
            return;
        }
        this.f135423s = nsvVar;
        ArrayList arrayList = new ArrayList();
        if (!eb20.m120149b()) {
            arrayList.add(this.f135420p);
        }
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0()).hierarchy.grade < zrv.m221193k().m203508R5()) {
            arrayList.add(this.f135422r);
        } else {
            arrayList.add(this.f135421q);
        }
        m157593x4(nsvVar, arrayList);
        mo159725Y3();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m157593x4(final nsv<User> nsvVar, List<String> list) {
        this.f135419o = d9k0.m115084d(this, list, new y20() { // from class: l.k9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124554a.m157589t4(nsvVar, (String) obj);
            }
        });
    }
}
