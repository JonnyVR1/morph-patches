package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class g0k0<D extends ho2> extends wr2<c0k0<D>, D> {

    /* JADX INFO: renamed from: k */
    public ltc0 f100052k;

    /* JADX INFO: renamed from: l */
    public bbo0 f100053l;

    /* JADX INFO: renamed from: m */
    public String f100054m;

    /* JADX INFO: renamed from: n */
    public String f100055n;

    /* JADX INFO: renamed from: o */
    public DialogInterfaceC0074a f100056o;

    /* JADX INFO: renamed from: p */
    public final String f100057p;

    /* JADX INFO: renamed from: q */
    public final String f100058q;

    /* JADX INFO: renamed from: r */
    public final String f100059r;

    /* JADX INFO: renamed from: s */
    public mqv<User> f100060s;

    public g0k0(bsm<D> bsmVar, VText vText, VImage vImage) {
        super(bsmVar);
        this.f100054m = ypv.f199497e.getString(R$string.f47432ob);
        this.f100055n = ypv.f199497e.getString(R$string.f47540t9);
        this.f100057p = ypv.f199497e.getString(R$string.f47362l7);
        this.f100058q = ypv.f199497e.getString(R$string.f47126ac);
        this.f100059r = ypv.f199497e.getString(R$string.f47652yb);
        mo51532C(new c0k0(vText, vImage));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        m123978n4();
        this.f100060s = null;
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        mqv<User> mqvVar = mo157426g4() == null ? null : mo157426g4().f146688c;
        this.f100060s = mqvVar;
        ((c0k0) this.viewModel).m104770l(mqvVar);
        m207199N3(m206027E2().m132095T1()).subscribe(ffw.m121193d(new e30() { // from class: l.d0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83191a.m123982r4((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public final void m123983s4() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f100056o;
        if (dialogInterfaceC0074a != null) {
            dialogInterfaceC0074a.dismiss();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m123978n4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m123978n4() {
        ltc0 ltc0Var = this.f100052k;
        if (ltc0Var != null) {
            ltc0Var.m151679h();
        }
        bbo0 bbo0Var = this.f100053l;
        if (bbo0Var != null) {
            bbo0Var.m101004j();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m123979o4(String str) {
        return m206027E2().m132091S0(str) && m123980p4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m123980p4(String str) {
        BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(this, str);
        if (ve10.m198128b(bLiveMultiCallM177970E)) {
            return false;
        }
        return (!ve10.m198132f(bLiveMultiCallM177970E) || r610.m177978M(m205084d4())) && !ve10.m198136j(bLiveMultiCallM177970E);
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m123981q4(String str) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2;
        if ((m206027E2() instanceof x350) && (bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2()) != null) {
            return TextUtils.equals(bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorId, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m123982r4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((c0k0) v2).m104770l(this.f100060s);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m123984t4(mqv mqvVar, String str) {
        if (this.f100057p.equals(str)) {
            m123985u4(mqvVar);
            e51.m114743H(act(), new Runnable() { // from class: l.f0k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93986a.m123983s4();
                }
            }, 200L);
        } else if (this.f100058q.equals(str) || this.f100059r.equals(str)) {
            m123986v4(mqvVar);
            m123983s4();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public void m123985u4(mqv<User> mqvVar) {
        if (mqvVar == null || mqvVar.m156005h() == null) {
            return;
        }
        m206028F2().ManagerPersonEvent.show().mo172463j(new ManagerPersonBean(mqvVar, mo157426g4() == null ? null : mo157426g4().m167093m()));
    }

    /* JADX INFO: renamed from: v4 */
    public void m123986v4(mqv<User> mqvVar) {
        User userM156005h = mqvVar.m156005h();
        if (m206027E2().m132152n0().isVoiceLive() && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            if (this.f100053l == null) {
                this.f100053l = new bbo0();
            }
            this.f100053l.m101010p(this.f188513f, ((nnn0) m206027E2()).m160249P2().m102063l(mqvVar.f135304a.f56011id) != null, mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m205086f4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.f199497e.getString(R$string.f46817Li), LongLinkChatMessage.RoomType.voice.getNumber(), m206027E2().mo149813j().liveMode);
            return;
        }
        if ((!m205087i0(mqvVar.m156005h().f56011id) && !m123981q4(mqvVar.m156005h().f56011id)) || ypv.f199493a.m199316I()) {
            if (this.f100052k == null) {
                this.f100052k = new ltc0();
            }
            this.f100052k.m151688q(act(), mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m205086f4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.m215672k().m195864j5(), TextUtils.equals("live", m206027E2().mo132054A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
            return;
        }
        Intent intent = new Intent(m104249C0(), (Class<?>) MkWebViewAct.class);
        String str = ddv.f85672v;
        if (m123981q4(mqvVar.m156005h().f56011id)) {
            str = str + "?officialShowAnchorId=" + mqvVar.m156005h().f56011id;
        }
        intent.putExtra("url", str);
        intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
        intent.putExtra("hideNavigationBar", true);
        m104249C0().startActivity(intent);
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: w4 */
    public void m123987w4(mqv<User> mqvVar) {
        if (act() == null) {
            return;
        }
        this.f100060s = mqvVar;
        ArrayList arrayList = new ArrayList();
        if (!w220.m201015b()) {
            arrayList.add(this.f100057p);
        }
        if (((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0()).hierarchy.grade < ypv.m215672k().m195721R5()) {
            arrayList.add(this.f100059r);
        } else {
            arrayList.add(this.f100058q);
        }
        m123988x4(mqvVar, arrayList);
        mo162152Y3();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m123988x4(final mqv<User> mqvVar, List<String> list) {
        this.f100056o = xzj0.m211999d(this, list, new e30() { // from class: l.e0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88651a.m123984t4(mqvVar, (String) obj);
            }
        });
    }
}
