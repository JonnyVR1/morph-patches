package p002l;

import android.text.TextUtils;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.c4g0;
import l.d1t;
import l.e30;
import l.ffw;
import l.gkh0;
import l.lsi0;
import l.mqv;
import l.roj0;
import l.ti1;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wrw extends h4t<ho2, grw> {

    /* JADX INFO: renamed from: i */
    public final String f21954i;

    /* JADX INFO: renamed from: j */
    public final String f21955j;

    /* JADX INFO: renamed from: k */
    public final String f21956k;

    /* JADX INFO: renamed from: l */
    public final String f21957l;

    /* JADX INFO: renamed from: m */
    public final String f21958m;

    /* JADX INFO: renamed from: n */
    public final String f21959n;

    /* JADX INFO: renamed from: o */
    public a f21960o;

    /* JADX INFO: renamed from: p */
    public User f21961p;

    /* JADX INFO: renamed from: q */
    public String f21962q;

    public wrw(bsm bsmVar) {
        super(bsmVar);
        this.f21954i = w8u.t(R$string.f3408lb);
        this.f21955j = w8u.t(R$string.f3584tb);
        this.f21956k = w8u.t(R$string.f3474ob);
        this.f21957l = w8u.t(R$string.f3582t9);
        this.f21958m = w8u.t(R$string.f2658Cf);
        this.f21959n = w8u.t(R$string.f2636Bf);
        this.f21962q = "";
        C(new grw());
    }

    /* JADX INFO: renamed from: W3 */
    private void m25445W3() {
        a aVar = this.f21960o;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    private void m25446Z3(Throwable th, String str) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!TextUtils.isEmpty(str)) {
                lsi0.y(str);
            }
            gkh0.j("[live][voice]", str + " : " + th.getMessage());
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            lsi0.y(w8u.t(R$string.f2918Oe));
        } else if (i == 41500 || i == 51041) {
            lsi0.y(coreService.metaMessage);
        } else if (!TextUtils.isEmpty(str)) {
            lsi0.y(str);
        }
        gkh0.j("[live][voice]", str + " : " + coreService.metaMessage);
    }

    /* JADX INFO: renamed from: T */
    public void m25447T() {
        super.T();
        m14189f3(m25548F2().ManagerPersonEvent.show()).m14209b(new e30() { // from class: l.hrw
            public final void call(Object obj) {
                this.f12253a.m25470t4((ManagerPersonBean) obj);
            }
        });
        m14189f3(m25548F2().ManagerPersonEvent.kickOff()).m14209b(new e30() { // from class: l.nrw
            public final void call(Object obj) {
                this.f16173a.m25465o4((mqv) obj);
            }
        });
        m14189f3(m25548F2().ManagerPersonEvent.forbiddenWords()).m14209b(new e30() { // from class: l.orw
            public final void call(Object obj) {
                this.f16766a.m25464n4((mqv) obj);
            }
        });
        m14202u3(new w9j() { // from class: l.prw
            public final Object call(Object obj) {
                return ((ti1) obj).t();
            }
        }).m14209b(new e30() { // from class: l.qrw
            public final void call(Object obj) {
                this.f18198a.m25452b4((LongLinkLiveMessage.JailInRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final List<String> m25448V3(List<Integer> list) {
        return vwb.n(vwb.Q(list, new w9j() { // from class: l.urw
            public final Object call(Object obj) {
                return this.f20771a.m25455e4((Integer) obj);
            }
        }), new w9j() { // from class: l.vrw
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public List<String> m25449X3(BLiveUserProfileConfig bLiveUserProfileConfig) {
        List<String> listM25448V3;
        boolean zN6 = ypv.k().N6();
        if (m25547E2().mo14499F0() == 1) {
            if (m25547E2().m14501G0().contains(((DbObject) this.f21961p).id)) {
                String str = this.f21955j;
                listM25448V3 = zN6 ? vwb.f0(new String[]{str, this.f21958m, this.f21956k, this.f21957l}) : vwb.f0(new String[]{str, this.f21956k, this.f21957l});
            } else {
                String str2 = this.f21954i;
                listM25448V3 = zN6 ? vwb.f0(new String[]{str2, this.f21958m, this.f21956k, this.f21957l}) : vwb.f0(new String[]{str2, this.f21956k, this.f21957l});
            }
            if (m25454d4()) {
                listM25448V3.remove(this.f21954i);
                listM25448V3.remove(this.f21955j);
            }
        } else {
            listM25448V3 = (m25547E2().mo14499F0() != 2 || vwb.J(ypv.k().I4())) ? null : m25448V3(ypv.k().I4());
        }
        if (listM25448V3 == null) {
            listM25448V3 = vwb.f0(new String[0]);
        }
        if (bLiveUserProfileConfig != null && !TextUtils.isEmpty(bLiveUserProfileConfig.blockStatus)) {
            listM25448V3.remove(this.f21958m);
            listM25448V3.add("unblock".equals(bLiveUserProfileConfig.blockStatus) ? this.f21958m : this.f21959n);
        }
        return listM25448V3;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m25450Y3(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return w8u.v(R$string.f2803J6, new Object[]{list.get(0), list.get(1)});
        }
        return list.size() == 3 ? w8u.v(R$string.f3339i7, new Object[]{list.get(0), list.get(1), list.get(2)}) : w8u.v(R$string.f3317h7, new Object[]{list.get(0), list.get(1), list.get(2)});
    }

    /* JADX INFO: renamed from: a4 */
    public void m25451a4(CharSequence charSequence) {
        if (charSequence.equals(this.f21954i)) {
            m25469s4(true);
            return;
        }
        if (charSequence.equals(this.f21955j)) {
            m25469s4(false);
            return;
        }
        if (charSequence.equals(this.f21956k)) {
            m25465o4(null);
        } else if (charSequence.equals(this.f21957l)) {
            m25464n4(null);
        } else if (charSequence.equals(this.f21958m)) {
            m25463m4();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m25452b4(LongLinkLiveMessage.JailInRoom jailInRoom) {
        if (jailInRoom.hasUser() && TextUtils.equals(ypv.a.D0(), jailInRoom.getUser().getId())) {
            lsi0.y(w8u.u(R$string.f3332i0, jailInRoom.getManager().getName()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m25453c4(mqv<User> mqvVar) {
        this.f21961p = mqvVar.h();
        d1t d1tVarG = mqvVar.g();
        if (d1tVarG instanceof d1t) {
            this.f21962q = d1tVarG.b();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final boolean m25454d4() {
        return !TextUtils.isEmpty(this.f21962q);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ String m25455e4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f21957l;
        }
        return this.f21956k;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m25456f4() {
        m25467q4(this.f21961p);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m25457g4() {
        m25468r4(this.f21961p);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m25458h4(Throwable th) {
        m25446Z3(th, w8u.t(R$string.f3626v9));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m25459i4(roj0 roj0Var) {
        m25466p4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m25460j4(Throwable th) {
        m25446Z3(th, w8u.t(R$string.f2973R6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m25461k4(boolean z) {
        m25547E2().mo14598r1(m25547E2().m17239o(), ((DbObject) this.f21961p).id, z);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m25462l4(String str) {
        m25451a4(str);
        m25445W3();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m25463m4() {
        m25548F2().LiveBlackListEvent.addBlackListDialog().j(this.f21961p);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f21962q = "";
    }

    /* JADX INFO: renamed from: n4 */
    public void m25464n4(mqv<User> mqvVar) {
        if (mqvVar != null) {
            m25453c4(mqvVar);
        }
        act().dialog().G0(w8u.t(R$string.f3582t9)).F(w8u.t(R$string.f2887N4)).v0(w8u.t(R$string.f3465o2), new Runnable() { // from class: l.srw
            @Override // java.lang.Runnable
            public final void run() {
                this.f19258a.m25456f4();
            }
        }).m0(w8u.t(R$string.f3386kb)).q(true).z0();
    }

    /* JADX INFO: renamed from: o4 */
    public void m25465o4(mqv<User> mqvVar) {
        if (mqvVar != null) {
            m25453c4(mqvVar);
        }
        act().dialog().G0(w8u.t(R$string.f3496pb)).F(w8u.t(R$string.f3518qb)).v0(w8u.t(R$string.f3465o2), new Runnable() { // from class: l.rrw
            @Override // java.lang.Runnable
            public final void run() {
                this.f18664a.m25457g4();
            }
        }).m0(w8u.t(R$string.f3386kb)).q(true).z0();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m25466p4() {
        m25548F2().OpenUserCardDialogEvent.dismiss().p();
        m25548F2().MemberEvent.refresh().p();
        lsi0.y(w8u.t(R$string.f2994S6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: q4 */
    public c4g0 m25467q4(User user) {
        return LivingNormalApiProvider.m4919q4(m25547E2().m17239o(), ((DbObject) user).id, this.f21962q).subscribe(ffw.e(new e30() { // from class: l.jrw
            public final void call(Object obj) {
                lsi0.y(w8u.t(R$string.f3604u9));
            }
        }, new e30() { // from class: l.krw
            public final void call(Object obj) {
                this.f14488a.m25458h4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public void m25468r4(User user) {
        duringCreated(LivingNormalApiProvider.m4885m6(m25547E2().m17239o(), ((DbObject) user).id, this.f21962q)).subscribe(ffw.e(new e30() { // from class: l.lrw
            public final void call(Object obj) {
                this.f15012a.m25459i4((roj0) obj);
            }
        }, new e30() { // from class: l.mrw
            public final void call(Object obj) {
                this.f15608a.m25460j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m25469s4(final boolean z) {
        String strU;
        User user = this.f21961p;
        String str = "";
        if (z) {
            strU = w8u.u(R$string.f3367je, user.name);
            List<String> listM25448V3 = !vwb.J(ypv.k().I4()) ? m25448V3(ypv.k().I4()) : null;
            if (listM25448V3 != null && listM25448V3.size() != 0) {
                str = String.format(w8u.u(R$string.f3295g7, m25450Y3(listM25448V3)), new Object[0]);
            }
        } else {
            strU = String.format(w8u.u(R$string.f2927P2, user.name), new Object[0]);
        }
        Dialog.e eVarM0 = act().dialog().G0(strU).v0(w8u.t(R$string.f3465o2), new Runnable() { // from class: l.irw
            @Override // java.lang.Runnable
            public final void run() {
                this.f13384a.m25461k4(z);
            }
        }).m0(w8u.t(R$string.f3704z));
        if (!TextUtils.isEmpty(str)) {
            eVarM0.F(str);
        }
        eVarM0.z0();
    }

    /* JADX INFO: renamed from: t4 */
    public void m25470t4(ManagerPersonBean managerPersonBean) {
        m25453c4(managerPersonBean.livingUser);
        m25471u4(m25449X3(managerPersonBean.profileConfig));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m25471u4(List<String> list) {
        this.f21960o = xzj0.m26279d(this, list, new e30() { // from class: l.trw
            public final void call(Object obj) {
                this.f20363a.m25462l4((String) obj);
            }
        });
    }
}
