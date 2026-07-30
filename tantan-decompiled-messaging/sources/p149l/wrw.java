package p149l;

import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wrw extends h4t<ho2, grw> {

    /* JADX INFO: renamed from: i */
    public final String f187838i;

    /* JADX INFO: renamed from: j */
    public final String f187839j;

    /* JADX INFO: renamed from: k */
    public final String f187840k;

    /* JADX INFO: renamed from: l */
    public final String f187841l;

    /* JADX INFO: renamed from: m */
    public final String f187842m;

    /* JADX INFO: renamed from: n */
    public final String f187843n;

    /* JADX INFO: renamed from: o */
    public DialogInterfaceC0074a f187844o;

    /* JADX INFO: renamed from: p */
    public User f187845p;

    /* JADX INFO: renamed from: q */
    public String f187846q;

    public wrw(bsm bsmVar) {
        super(bsmVar);
        this.f187838i = w8u.m202217t(R$string.f47366lb);
        this.f187839j = w8u.m202217t(R$string.f47542tb);
        this.f187840k = w8u.m202217t(R$string.f47432ob);
        this.f187841l = w8u.m202217t(R$string.f47540t9);
        this.f187842m = w8u.m202217t(R$string.f46616Cf);
        this.f187843n = w8u.m202217t(R$string.f46594Bf);
        this.f187846q = "";
        mo51532C(new grw());
    }

    /* JADX INFO: renamed from: W3 */
    private void m205309W3() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f187844o;
        if (dialogInterfaceC0074a != null) {
            dialogInterfaceC0074a.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    private void m205310Z3(Throwable th, String str) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!TextUtils.isEmpty(str)) {
                lsi0.m151595y(str);
            }
            gkh0.m126627j("[live][voice]", str + " : " + th.getMessage());
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            lsi0.m151595y(w8u.m202217t(R$string.f46876Oe));
        } else if (i == 41500 || i == 51041) {
            lsi0.m151595y(coreService.metaMessage);
        } else if (!TextUtils.isEmpty(str)) {
            lsi0.m151595y(str);
        }
        gkh0.m126627j("[live][voice]", str + " : " + coreService.metaMessage);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129302f3(m206028F2().ManagerPersonEvent.show()).m129322b(new e30() { // from class: l.hrw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109273a.m205333t4((ManagerPersonBean) obj);
            }
        });
        m129302f3(m206028F2().ManagerPersonEvent.kickOff()).m129322b(new e30() { // from class: l.nrw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140226a.m205328o4((mqv) obj);
            }
        });
        m129302f3(m206028F2().ManagerPersonEvent.forbiddenWords()).m129322b(new e30() { // from class: l.orw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145360a.m205327n4((mqv) obj);
            }
        });
        m129315u3(new w9j() { // from class: l.prw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ti1) obj).m189143t();
            }
        }).m129322b(new e30() { // from class: l.qrw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156053a.m205315b4((LongLinkLiveMessage.JailInRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final List<String> m205311V3(List<Integer> list) {
        return vwb.m200339n(vwb.m200303Q(list, new w9j() { // from class: l.urw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177906a.m205318e4((Integer) obj);
            }
        }), new w9j() { // from class: l.vrw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public List<String> m205312X3(BLiveUserProfileConfig bLiveUserProfileConfig) {
        List<String> listM205311V3;
        boolean zM195690N6 = ypv.m215672k().m195690N6();
        if (m206027E2().mo120451F0() == 1) {
            if (m206027E2().m132065G0().contains(this.f187845p.f56011id)) {
                String str = this.f187839j;
                listM205311V3 = zM195690N6 ? vwb.m200324f0(str, this.f187842m, this.f187840k, this.f187841l) : vwb.m200324f0(str, this.f187840k, this.f187841l);
            } else {
                String str2 = this.f187838i;
                listM205311V3 = zM195690N6 ? vwb.m200324f0(str2, this.f187842m, this.f187840k, this.f187841l) : vwb.m200324f0(str2, this.f187840k, this.f187841l);
            }
            if (m205317d4()) {
                listM205311V3.remove(this.f187838i);
                listM205311V3.remove(this.f187839j);
            }
        } else {
            listM205311V3 = (m206027E2().mo120451F0() != 2 || vwb.m200296J(ypv.m215672k().m195648I4())) ? null : m205311V3(ypv.m215672k().m195648I4());
        }
        if (listM205311V3 == null) {
            listM205311V3 = vwb.m200324f0(new String[0]);
        }
        if (bLiveUserProfileConfig != null && !TextUtils.isEmpty(bLiveUserProfileConfig.blockStatus)) {
            listM205311V3.remove(this.f187842m);
            listM205311V3.add("unblock".equals(bLiveUserProfileConfig.blockStatus) ? this.f187842m : this.f187843n);
        }
        return listM205311V3;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m205313Y3(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return w8u.m202219v(R$string.f46761J6, list.get(0), list.get(1));
        }
        return list.size() == 3 ? w8u.m202219v(R$string.f47297i7, list.get(0), list.get(1), list.get(2)) : w8u.m202219v(R$string.f47275h7, list.get(0), list.get(1), list.get(2));
    }

    /* JADX INFO: renamed from: a4 */
    public void m205314a4(CharSequence charSequence) {
        if (charSequence.equals(this.f187838i)) {
            m205332s4(true);
            return;
        }
        if (charSequence.equals(this.f187839j)) {
            m205332s4(false);
            return;
        }
        if (charSequence.equals(this.f187840k)) {
            m205328o4(null);
        } else if (charSequence.equals(this.f187841l)) {
            m205327n4(null);
        } else if (charSequence.equals(this.f187842m)) {
            m205326m4();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m205315b4(LongLinkLiveMessage.JailInRoom jailInRoom) {
        if (jailInRoom.hasUser() && TextUtils.equals(ypv.f199493a.m199309D0(), jailInRoom.getUser().getId())) {
            lsi0.m151595y(w8u.m202218u(R$string.f47290i0, jailInRoom.getManager().getName()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m205316c4(mqv<User> mqvVar) {
        this.f187845p = mqvVar.m156005h();
        xvl xvlVarM156004g = mqvVar.m156004g();
        if (xvlVarM156004g instanceof d1t) {
            this.f187846q = ((d1t) xvlVarM156004g).m109679b();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final boolean m205317d4() {
        return !TextUtils.isEmpty(this.f187846q);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ String m205318e4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f187841l;
        }
        return this.f187840k;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m205319f4() {
        m205330q4(this.f187845p);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m205320g4() {
        m205331r4(this.f187845p);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m205321h4(Throwable th) {
        m205310Z3(th, w8u.m202217t(R$string.f47584v9));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m205322i4(roj0 roj0Var) {
        m205329p4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m205323j4(Throwable th) {
        m205310Z3(th, w8u.m202217t(R$string.f46931R6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m205324k4(boolean z) {
        m206027E2().mo132162r1(m206027E2().m149818o(), this.f187845p.f56011id, z);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m205325l4(String str) {
        m205314a4(str);
        m205309W3();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m205326m4() {
        m206028F2().LiveBlackListEvent.addBlackListDialog().mo172463j(this.f187845p);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f187846q = "";
    }

    /* JADX INFO: renamed from: n4 */
    public void m205327n4(mqv<User> mqvVar) {
        if (mqvVar != null) {
            m205316c4(mqvVar);
        }
        act().dialog().m20507G0(w8u.m202217t(R$string.f47540t9)).m20504F(w8u.m202217t(R$string.f46845N4)).m20560v0(w8u.m202217t(R$string.f47423o2), new Runnable() { // from class: l.srw
            @Override // java.lang.Runnable
            public final void run() {
                this.f166141a.m205319f4();
            }
        }).m20543m0(w8u.m202217t(R$string.f47344kb)).m20549q(true).m20568z0();
    }

    /* JADX INFO: renamed from: o4 */
    public void m205328o4(mqv<User> mqvVar) {
        if (mqvVar != null) {
            m205316c4(mqvVar);
        }
        act().dialog().m20507G0(w8u.m202217t(R$string.f47454pb)).m20504F(w8u.m202217t(R$string.f47476qb)).m20560v0(w8u.m202217t(R$string.f47423o2), new Runnable() { // from class: l.rrw
            @Override // java.lang.Runnable
            public final void run() {
                this.f160795a.m205320g4();
            }
        }).m20543m0(w8u.m202217t(R$string.f47344kb)).m20549q(true).m20568z0();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m205329p4() {
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        m206028F2().MemberEvent.refresh().m172467p();
        lsi0.m151595y(w8u.m202217t(R$string.f46952S6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: q4 */
    public c4g0 m205330q4(User user) {
        return LivingNormalApiProvider.m71553q4(m206027E2().m149818o(), user.f56011id, this.f187846q).subscribe(ffw.m121194e(new e30() { // from class: l.jrw
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(w8u.m202217t(R$string.f47562u9));
            }
        }, new e30() { // from class: l.krw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124400a.m205321h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public void m205331r4(User user) {
        duringCreated(LivingNormalApiProvider.m71519m6(m206027E2().m149818o(), user.f56011id, this.f187846q)).subscribe(ffw.m121194e(new e30() { // from class: l.lrw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129786a.m205322i4((roj0) obj);
            }
        }, new e30() { // from class: l.mrw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135422a.m205323j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m205332s4(final boolean z) {
        String strM202218u;
        User user = this.f187845p;
        String str = "";
        if (z) {
            strM202218u = w8u.m202218u(R$string.f47325je, user.name);
            List<String> listM205311V3 = !vwb.m200296J(ypv.m215672k().m195648I4()) ? m205311V3(ypv.m215672k().m195648I4()) : null;
            if (listM205311V3 != null && listM205311V3.size() != 0) {
                str = String.format(w8u.m202218u(R$string.f47253g7, m205313Y3(listM205311V3)), new Object[0]);
            }
        } else {
            strM202218u = String.format(w8u.m202218u(R$string.f46885P2, user.name), new Object[0]);
        }
        Dialog.C4309e c4309eM20543m0 = act().dialog().m20507G0(strM202218u).m20560v0(w8u.m202217t(R$string.f47423o2), new Runnable() { // from class: l.irw
            @Override // java.lang.Runnable
            public final void run() {
                this.f114691a.m205324k4(z);
            }
        }).m20543m0(w8u.m202217t(R$string.f47662z));
        if (!TextUtils.isEmpty(str)) {
            c4309eM20543m0.m20504F(str);
        }
        c4309eM20543m0.m20568z0();
    }

    /* JADX INFO: renamed from: t4 */
    public void m205333t4(ManagerPersonBean managerPersonBean) {
        m205316c4(managerPersonBean.livingUser);
        m205334u4(m205312X3(managerPersonBean.profileConfig));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m205334u4(List<String> list) {
        this.f187844o = xzj0.m211999d(this, list, new e30() { // from class: l.trw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171874a.m205325l4((String) obj);
            }
        });
    }
}
