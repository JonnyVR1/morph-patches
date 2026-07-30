package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class ssm0 extends i6t<oo2, z5o0> {

    /* JADX INFO: renamed from: i */
    public final String f170472i;

    /* JADX INFO: renamed from: j */
    public final String f170473j;

    /* JADX INFO: renamed from: k */
    public final String f170474k;

    /* JADX INFO: renamed from: l */
    public final String f170475l;

    /* JADX INFO: renamed from: m */
    public User f170476m;

    /* JADX INFO: renamed from: n */
    public String f170477n;

    public ssm0(dum dumVar) {
        super(dumVar);
        this.f170472i = zrv.f205803e.getString(R$string.f48214lb);
        this.f170473j = zrv.f205803e.getString(R$string.f48390tb);
        this.f170474k = zrv.f205803e.getString(R$string.f48280ob);
        this.f170475l = zrv.f205803e.getString(R$string.f48388t9);
        this.f170477n = "";
        mo52715C(new z5o0());
    }

    /* JADX INFO: renamed from: Y3 */
    private List<String> m187731Y3(List<Integer> list) {
        return jyb.m147522n(jyb.m147486Q(list, new qcj() { // from class: l.rsm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164703a.m187735n4((Integer) obj);
            }
        }), new qcj() { // from class: l.esm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    private String m187732c4(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return zrv.f205803e.getString(R$string.f47609J6, list.get(0), list.get(1));
        }
        return list.size() == 3 ? zrv.f205803e.getString(R$string.f48145i7, list.get(0), list.get(1), list.get(2)) : zrv.f205803e.getString(R$string.f48123h7, list.get(0), list.get(1), list.get(2));
    }

    /* JADX INFO: renamed from: h4 */
    private void m187733h4(nsv<User> nsvVar) {
        this.f170476m = nsvVar.m164643h();
        pyl pylVarM164642g = nsvVar.m164642g();
        if (pylVarM164642g instanceof e3t) {
            this.f170477n = ((e3t) pylVarM164642g).m119320b();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private boolean m187734i4() {
        return !TextUtils.isEmpty(this.f170477n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ String m187735n4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f170475l;
        }
        return this.f170474k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m187736s4(boolean z) {
        m213810E2().mo118374r1(m213810E2().m202194o(), this.f170476m.f56859id, z);
    }

    /* JADX INFO: renamed from: w4 */
    private void m187737w4() {
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        m213811F2().MemberEvent.refresh().m199277p();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().ManagerPersonEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.dsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90498a.m187748m4((ManagerPersonBean) obj);
            }
        }));
        duringCreated(m213811F2().ManagerPersonEvent.kickOff().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122478a.m187745j4((nsv) obj);
            }
        }));
        duringCreated(m213811F2().ManagerPersonEvent.forbiddenWords().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ksm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128592a.m187746k4((nsv) obj);
            }
        }));
        duringCreated(m213811F2().ManagerPersonEvent.unMuteWords().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133435a.m187747l4((nsv) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Z3 */
    public C22421c<uxj0> mo187738Z3(User user) {
        return LivingNormalApiProvider.m72736q4(m213810E2().m202194o(), user.f56859id, this.f170477n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a4 */
    public C22421c<uxj0> mo187739a4(User user) {
        return duringCreated(LivingNormalApiProvider.m72702m6(m213810E2().m202194o(), user.f56859id, this.f170477n));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: b4 */
    public List<String> m187740b4() {
        List<String> listM187731Y3;
        if (m213810E2().mo146094F0() == 1) {
            listM187731Y3 = m213810E2().m168454G0().contains(this.f170476m.f56859id) ? jyb.m147507f0(this.f170473j, this.f170474k, this.f170475l) : jyb.m147507f0(this.f170472i, this.f170474k, this.f170475l);
            if (m187734i4()) {
                listM187731Y3.remove(this.f170472i);
                listM187731Y3.remove(this.f170473j);
            }
        } else {
            listM187731Y3 = (m213810E2().mo146094F0() != 2 || jyb.m147479J(zrv.m221193k().m203435I4())) ? null : m187731Y3(zrv.m221193k().m203435I4());
        }
        return listM187731Y3 == null ? jyb.m147507f0(new String[0]) : listM187731Y3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    public C22421c<uxj0> m187741d4(User user) {
        return VoiceRoomApiProvider.unMuteWords(m213810E2().m202194o(), user.f56859id);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m187742e4(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 41500 || i == 51041)) {
            o1j0.m165651y(coreService.metaMessage);
        } else {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f48432v9));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m187743f4(CharSequence charSequence) {
        if (charSequence.equals(this.f170472i)) {
            m187756x4(true);
            return;
        }
        if (charSequence.equals(this.f170473j)) {
            m187756x4(false);
        } else if (charSequence.equals(this.f170474k)) {
            m187755v4();
        } else if (charSequence.equals(this.f170475l)) {
            m187754u4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo187744g4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47779R6));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47724Oe));
        } else if (i == 41500 || i == 51041) {
            o1j0.m165651y(coreService.metaMessage);
        } else {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47779R6));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m187745j4(nsv nsvVar) {
        m187733h4(nsvVar);
        m187755v4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m187746k4(nsv nsvVar) {
        m187733h4(nsvVar);
        m187754u4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m187747l4(nsv nsvVar) {
        m187758z4(nsvVar.m164643h());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m187748m4(ManagerPersonBean managerPersonBean) {
        m187757y4(act(), managerPersonBean.livingUser);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f170477n = "";
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m187749o4(String str, uxj0 uxj0Var) {
        m213811F2().VoiceUserCardEvent.setJailed().mo199273j(Boolean.TRUE);
        o1j0.m165651y(str + "已被禁言");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m187750p4() {
        mo187738Z3(this.f170476m).subscribe(dhw.m115826e(new y20() { // from class: l.hsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f48410u9));
            }
        }, new osm0(this)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m187751q4(boolean z, uxj0 uxj0Var) {
        if (z) {
            i4g0.m138523u("e_audio_room_pop_confirm_button", mo78457R2(), new pf60("anchorId", m213810E2().m168526j0()), new pf60("liveId", m213810E2().m202191k()), new pf60("confirm_type", "kick_user"), new pf60("user_type", i9o0.m139140l(this)));
        }
        m187737w4();
        o1j0.m165651y(z ? "已踢出该用户" : zrv.f205803e.getString(R$string.f47800S6));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m187752r4(final boolean z) {
        mo187739a4(this.f170476m).subscribe(dhw.m115826e(new y20() { // from class: l.fsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100663a.m187751q4(z, (uxj0) obj);
            }
        }, new y20() { // from class: l.gsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106314a.mo187744g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m187753t4(String str, uxj0 uxj0Var) {
        m213811F2().VoiceUserCardEvent.setJailed().mo199273j(Boolean.FALSE);
        o1j0.m165651y(str + "已被取消禁言");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: u4 */
    public void m187754u4() {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            egn0.m120793c(act(), new x20() { // from class: l.qsm0
                @Override // p153l.x20
                public final void call() {
                    this.f159340a.m187750p4();
                }
            });
            return;
        }
        User user = this.f170476m;
        final String str = user.name;
        mo187738Z3(user).subscribe(dhw.m115826e(new y20() { // from class: l.psm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153946a.m187749o4(str, (uxj0) obj);
            }
        }, new osm0(this)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: v4 */
    public void m187755v4() {
        final boolean zM214494b = y6s.m214494b(m213810E2().mo183435j().liveMode);
        lqn0.m155499c(act(), zM214494b, new x20() { // from class: l.msm0
            @Override // p153l.x20
            public final void call() {
                this.f138498a.m187752r4(zM214494b);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m187756x4(final boolean z) {
        String str;
        String str2 = "";
        if (z) {
            str = String.format(zrv.f205803e.getString(R$string.f48173je), this.f170476m.name);
            List<String> listM187731Y3 = !jyb.m147479J(zrv.m221193k().m203435I4()) ? m187731Y3(zrv.m221193k().m203435I4()) : null;
            if (listM187731Y3 != null && listM187731Y3.size() != 0) {
                str2 = String.format(zrv.f205803e.getString(R$string.f48101g7), m187732c4(listM187731Y3));
            }
        } else {
            str = String.format(zrv.f205803e.getString(R$string.f47733P2), this.f170476m.name);
        }
        Dialog.C4460e c4460eM21542m0 = act().dialog().m21506G0(str).m21559v0(zrv.f205803e.getString(R$string.f48271o2), new Runnable() { // from class: l.ism0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116683a.m187736s4(z);
            }
        }).m21542m0(zrv.f205803e.getString(R$string.f48510z));
        if (!TextUtils.isEmpty(str2)) {
            c4460eM21542m0.m21503F(str2);
        }
        c4460eM21542m0.m21567z0();
    }

    /* JADX INFO: renamed from: y4 */
    public void m187757y4(Act act, nsv<User> nsvVar) {
        m187733h4(nsvVar);
        ((z5o0) this.viewModel).m218723d(act, m187740b4());
    }

    /* JADX INFO: renamed from: z4 */
    public void m187758z4(User user) {
        final String str = user.name;
        duringCreated(m187741d4(user)).subscribe(dhw.m115826e(new y20() { // from class: l.nsm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143515a.m187753t4(str, (uxj0) obj);
            }
        }, new osm0(this)));
    }
}
