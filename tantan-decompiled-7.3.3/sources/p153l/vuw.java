package p153l;

import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vuw extends i6t<oo2, fuw> {

    /* JADX INFO: renamed from: i */
    public final String f185863i;

    /* JADX INFO: renamed from: j */
    public final String f185864j;

    /* JADX INFO: renamed from: k */
    public final String f185865k;

    /* JADX INFO: renamed from: l */
    public final String f185866l;

    /* JADX INFO: renamed from: m */
    public final String f185867m;

    /* JADX INFO: renamed from: n */
    public final String f185868n;

    /* JADX INFO: renamed from: o */
    public DialogInterfaceC0075a f185869o;

    /* JADX INFO: renamed from: p */
    public User f185870p;

    /* JADX INFO: renamed from: q */
    public String f185871q;

    public vuw(dum dumVar) {
        super(dumVar);
        this.f185863i = xau.m209910t(R$string.f48214lb);
        this.f185864j = xau.m209910t(R$string.f48390tb);
        this.f185865k = xau.m209910t(R$string.f48280ob);
        this.f185866l = xau.m209910t(R$string.f48388t9);
        this.f185867m = xau.m209910t(R$string.f47464Cf);
        this.f185868n = xau.m209910t(R$string.f47442Bf);
        this.f185871q = "";
        mo52715C(new fuw());
    }

    /* JADX INFO: renamed from: W3 */
    private void m202947W3() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f185869o;
        if (dialogInterfaceC0075a != null) {
            dialogInterfaceC0075a.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    private void m202948Z3(Throwable th, String str) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!TextUtils.isEmpty(str)) {
                o1j0.m165651y(str);
            }
            nsh0.m164608j("[live][voice]", str + " : " + th.getMessage());
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            o1j0.m165651y(xau.m209910t(R$string.f47724Oe));
        } else if (i == 41500 || i == 51041) {
            o1j0.m165651y(coreService.metaMessage);
        } else if (!TextUtils.isEmpty(str)) {
            o1j0.m165651y(str);
        }
        nsh0.m164608j("[live][voice]", str + " : " + coreService.metaMessage);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138861f3(m213811F2().ManagerPersonEvent.show()).m138881b(new y20() { // from class: l.guw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106589a.m202971t4((ManagerPersonBean) obj);
            }
        });
        m138861f3(m213811F2().ManagerPersonEvent.kickOff()).m138881b(new y20() { // from class: l.muw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138858a.m202966o4((nsv) obj);
            }
        });
        m138861f3(m213811F2().ManagerPersonEvent.forbiddenWords()).m138881b(new y20() { // from class: l.nuw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143750a.m202965n4((nsv) obj);
            }
        });
        m138874u3(new qcj() { // from class: l.ouw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((aj1) obj).m98325t();
            }
        }).m138881b(new y20() { // from class: l.puw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154250a.m202953b4((LongLinkLiveMessage.JailInRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final List<String> m202949V3(List<Integer> list) {
        return jyb.m147522n(jyb.m147486Q(list, new qcj() { // from class: l.tuw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176218a.m202956e4((Integer) obj);
            }
        }), new qcj() { // from class: l.uuw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.oo2] */
    /* JADX INFO: renamed from: X3 */
    public List<String> m202950X3(BLiveUserProfileConfig bLiveUserProfileConfig) {
        List<String> listM202949V3;
        boolean zM203477N6 = zrv.m221193k().m203477N6();
        if (m213810E2().mo146094F0() == 1) {
            if (m213810E2().m168454G0().contains(this.f185870p.f56859id)) {
                String str = this.f185864j;
                listM202949V3 = zM203477N6 ? jyb.m147507f0(str, this.f185867m, this.f185865k, this.f185866l) : jyb.m147507f0(str, this.f185865k, this.f185866l);
            } else {
                String str2 = this.f185863i;
                listM202949V3 = zM203477N6 ? jyb.m147507f0(str2, this.f185867m, this.f185865k, this.f185866l) : jyb.m147507f0(str2, this.f185865k, this.f185866l);
            }
            if (m202955d4()) {
                listM202949V3.remove(this.f185863i);
                listM202949V3.remove(this.f185864j);
            }
        } else {
            listM202949V3 = (m213810E2().mo146094F0() != 2 || jyb.m147479J(zrv.m221193k().m203435I4())) ? null : m202949V3(zrv.m221193k().m203435I4());
        }
        if (listM202949V3 == null) {
            listM202949V3 = jyb.m147507f0(new String[0]);
        }
        if (bLiveUserProfileConfig != null && !TextUtils.isEmpty(bLiveUserProfileConfig.blockStatus)) {
            listM202949V3.remove(this.f185867m);
            listM202949V3.add("unblock".equals(bLiveUserProfileConfig.blockStatus) ? this.f185867m : this.f185868n);
        }
        return listM202949V3;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m202951Y3(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return xau.m209912v(R$string.f47609J6, list.get(0), list.get(1));
        }
        return list.size() == 3 ? xau.m209912v(R$string.f48145i7, list.get(0), list.get(1), list.get(2)) : xau.m209912v(R$string.f48123h7, list.get(0), list.get(1), list.get(2));
    }

    /* JADX INFO: renamed from: a4 */
    public void m202952a4(CharSequence charSequence) {
        if (charSequence.equals(this.f185863i)) {
            m202970s4(true);
            return;
        }
        if (charSequence.equals(this.f185864j)) {
            m202970s4(false);
            return;
        }
        if (charSequence.equals(this.f185865k)) {
            m202966o4(null);
        } else if (charSequence.equals(this.f185866l)) {
            m202965n4(null);
        } else if (charSequence.equals(this.f185867m)) {
            m202964m4();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m202953b4(LongLinkLiveMessage.JailInRoom jailInRoom) {
        if (jailInRoom.hasUser() && TextUtils.equals(zrv.f205799a.m207631D0(), jailInRoom.getUser().getId())) {
            o1j0.m165651y(xau.m209911u(R$string.f48138i0, jailInRoom.getManager().getName()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m202954c4(nsv<User> nsvVar) {
        this.f185870p = nsvVar.m164643h();
        pyl pylVarM164642g = nsvVar.m164642g();
        if (pylVarM164642g instanceof e3t) {
            this.f185871q = ((e3t) pylVarM164642g).m119320b();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final boolean m202955d4() {
        return !TextUtils.isEmpty(this.f185871q);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ String m202956e4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f185866l;
        }
        return this.f185865k;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m202957f4() {
        m202968q4(this.f185870p);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m202958g4() {
        m202969r4(this.f185870p);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m202959h4(Throwable th) {
        m202948Z3(th, xau.m209910t(R$string.f48432v9));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m202960i4(uxj0 uxj0Var) {
        m202967p4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m202961j4(Throwable th) {
        m202948Z3(th, xau.m209910t(R$string.f47779R6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m202962k4(boolean z) {
        m213810E2().mo118374r1(m213810E2().m202194o(), this.f185870p.f56859id, z);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m202963l4(String str) {
        m202952a4(str);
        m202947W3();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m202964m4() {
        m213811F2().LiveBlackListEvent.addBlackListDialog().mo199273j(this.f185870p);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f185871q = "";
    }

    /* JADX INFO: renamed from: n4 */
    public void m202965n4(nsv<User> nsvVar) {
        if (nsvVar != null) {
            m202954c4(nsvVar);
        }
        act().dialog().m21506G0(xau.m209910t(R$string.f48388t9)).m21503F(xau.m209910t(R$string.f47693N4)).m21559v0(xau.m209910t(R$string.f48271o2), new Runnable() { // from class: l.ruw
            @Override // java.lang.Runnable
            public final void run() {
                this.f164946a.m202957f4();
            }
        }).m21542m0(xau.m209910t(R$string.f48192kb)).m21548q(true).m21567z0();
    }

    /* JADX INFO: renamed from: o4 */
    public void m202966o4(nsv<User> nsvVar) {
        if (nsvVar != null) {
            m202954c4(nsvVar);
        }
        act().dialog().m21506G0(xau.m209910t(R$string.f48302pb)).m21503F(xau.m209910t(R$string.f48324qb)).m21559v0(xau.m209910t(R$string.f48271o2), new Runnable() { // from class: l.quw
            @Override // java.lang.Runnable
            public final void run() {
                this.f159652a.m202958g4();
            }
        }).m21542m0(xau.m209910t(R$string.f48192kb)).m21548q(true).m21567z0();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m202967p4() {
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        m213811F2().MemberEvent.refresh().m199277p();
        o1j0.m165651y(xau.m209910t(R$string.f47800S6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: q4 */
    public kcg0 m202968q4(User user) {
        return LivingNormalApiProvider.m72736q4(m213810E2().m202194o(), user.f56859id, this.f185871q).subscribe(dhw.m115826e(new y20() { // from class: l.iuw
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(xau.m209910t(R$string.f48410u9));
            }
        }, new y20() { // from class: l.juw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122749a.m202959h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r4 */
    public void m202969r4(User user) {
        duringCreated(LivingNormalApiProvider.m72702m6(m213810E2().m202194o(), user.f56859id, this.f185871q)).subscribe(dhw.m115826e(new y20() { // from class: l.kuw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128927a.m202960i4((uxj0) obj);
            }
        }, new y20() { // from class: l.luw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133664a.m202961j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m202970s4(final boolean z) {
        String strM209911u;
        User user = this.f185870p;
        String str = "";
        if (z) {
            strM209911u = xau.m209911u(R$string.f48173je, user.name);
            List<String> listM202949V3 = !jyb.m147479J(zrv.m221193k().m203435I4()) ? m202949V3(zrv.m221193k().m203435I4()) : null;
            if (listM202949V3 != null && listM202949V3.size() != 0) {
                str = String.format(xau.m209911u(R$string.f48101g7, m202951Y3(listM202949V3)), new Object[0]);
            }
        } else {
            strM209911u = String.format(xau.m209911u(R$string.f47733P2, user.name), new Object[0]);
        }
        Dialog.C4460e c4460eM21542m0 = act().dialog().m21506G0(strM209911u).m21559v0(xau.m209910t(R$string.f48271o2), new Runnable() { // from class: l.huw
            @Override // java.lang.Runnable
            public final void run() {
                this.f111716a.m202962k4(z);
            }
        }).m21542m0(xau.m209910t(R$string.f48510z));
        if (!TextUtils.isEmpty(str)) {
            c4460eM21542m0.m21503F(str);
        }
        c4460eM21542m0.m21567z0();
    }

    /* JADX INFO: renamed from: t4 */
    public void m202971t4(ManagerPersonBean managerPersonBean) {
        m202954c4(managerPersonBean.livingUser);
        m202972u4(m202950X3(managerPersonBean.profileConfig));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m202972u4(List<String> list) {
        this.f185869o = d9k0.m115084d(this, list, new y20() { // from class: l.suw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170769a.m202963l4((String) obj);
            }
        });
    }
}
