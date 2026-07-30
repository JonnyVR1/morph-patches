package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ojm0 extends h4t<ho2, vwn0> {

    /* JADX INFO: renamed from: i */
    public final String f144315i;

    /* JADX INFO: renamed from: j */
    public final String f144316j;

    /* JADX INFO: renamed from: k */
    public final String f144317k;

    /* JADX INFO: renamed from: l */
    public final String f144318l;

    /* JADX INFO: renamed from: m */
    public User f144319m;

    /* JADX INFO: renamed from: n */
    public String f144320n;

    public ojm0(bsm bsmVar) {
        super(bsmVar);
        this.f144315i = ypv.f199497e.getString(R$string.f47366lb);
        this.f144316j = ypv.f199497e.getString(R$string.f47542tb);
        this.f144317k = ypv.f199497e.getString(R$string.f47432ob);
        this.f144318l = ypv.f199497e.getString(R$string.f47540t9);
        this.f144320n = "";
        mo51532C(new vwn0());
    }

    /* JADX INFO: renamed from: Y3 */
    private List<String> m164691Y3(List<Integer> list) {
        return vwb.m200339n(vwb.m200303Q(list, new w9j() { // from class: l.njm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139295a.m164695n4((Integer) obj);
            }
        }), new w9j() { // from class: l.ajm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    private String m164692c4(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return ypv.f199497e.getString(R$string.f46761J6, list.get(0), list.get(1));
        }
        return list.size() == 3 ? ypv.f199497e.getString(R$string.f47297i7, list.get(0), list.get(1), list.get(2)) : ypv.f199497e.getString(R$string.f47275h7, list.get(0), list.get(1), list.get(2));
    }

    /* JADX INFO: renamed from: h4 */
    private void m164693h4(mqv<User> mqvVar) {
        this.f144319m = mqvVar.m156005h();
        xvl xvlVarM156004g = mqvVar.m156004g();
        if (xvlVarM156004g instanceof d1t) {
            this.f144320n = ((d1t) xvlVarM156004g).m109679b();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private boolean m164694i4() {
        return !TextUtils.isEmpty(this.f144320n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ String m164695n4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f144318l;
        }
        return this.f144317k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m164696s4(boolean z) {
        m206027E2().mo132162r1(m206027E2().m149818o(), this.f144319m.f56011id, z);
    }

    /* JADX INFO: renamed from: w4 */
    private void m164697w4() {
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        m206028F2().MemberEvent.refresh().m172467p();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().ManagerPersonEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zim0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203344a.m164708m4((ManagerPersonBean) obj);
            }
        }));
        duringCreated(m206028F2().ManagerPersonEvent.kickOff().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.fjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97800a.m164705j4((mqv) obj);
            }
        }));
        duringCreated(m206028F2().ManagerPersonEvent.forbiddenWords().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103091a.m164706k4((mqv) obj);
            }
        }));
        duringCreated(m206028F2().ManagerPersonEvent.unMuteWords().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108096a.m164707l4((mqv) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public C22306c<roj0> mo164698Z3(User user) {
        return LivingNormalApiProvider.m71553q4(m206027E2().m149818o(), user.f56011id, this.f144320n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public C22306c<roj0> mo164699a4(User user) {
        return duringCreated(LivingNormalApiProvider.m71519m6(m206027E2().m149818o(), user.f56011id, this.f144320n));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: b4 */
    public List<String> m164700b4() {
        List<String> listM164691Y3;
        if (m206027E2().mo120451F0() == 1) {
            listM164691Y3 = m206027E2().m132065G0().contains(this.f144319m.f56011id) ? vwb.m200324f0(this.f144316j, this.f144317k, this.f144318l) : vwb.m200324f0(this.f144315i, this.f144317k, this.f144318l);
            if (m164694i4()) {
                listM164691Y3.remove(this.f144315i);
                listM164691Y3.remove(this.f144316j);
            }
        } else {
            listM164691Y3 = (m206027E2().mo120451F0() != 2 || vwb.m200296J(ypv.m215672k().m195648I4())) ? null : m164691Y3(ypv.m215672k().m195648I4());
        }
        return listM164691Y3 == null ? vwb.m200324f0(new String[0]) : listM164691Y3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public C22306c<roj0> m164701d4(User user) {
        return VoiceRoomApiProvider.unMuteWords(m206027E2().m149818o(), user.f56011id);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m164702e4(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 41500 || i == 51041)) {
            lsi0.m151595y(coreService.metaMessage);
        } else {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47584v9));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m164703f4(CharSequence charSequence) {
        if (charSequence.equals(this.f144315i)) {
            m164716x4(true);
            return;
        }
        if (charSequence.equals(this.f144316j)) {
            m164716x4(false);
        } else if (charSequence.equals(this.f144317k)) {
            m164715v4();
        } else if (charSequence.equals(this.f144318l)) {
            m164714u4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo164704g4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46931R6));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46876Oe));
        } else if (i == 41500 || i == 51041) {
            lsi0.m151595y(coreService.metaMessage);
        } else {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46931R6));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m164705j4(mqv mqvVar) {
        m164693h4(mqvVar);
        m164715v4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m164706k4(mqv mqvVar) {
        m164693h4(mqvVar);
        m164714u4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m164707l4(mqv mqvVar) {
        m164718z4(mqvVar.m156005h());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m164708m4(ManagerPersonBean managerPersonBean) {
        m164717y4(act(), managerPersonBean.livingUser);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f144320n = "";
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m164709o4(String str, roj0 roj0Var) {
        m206028F2().VoiceUserCardEvent.setJailed().mo172463j(Boolean.TRUE);
        lsi0.m151595y(str + "已被禁言");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m164710p4() {
        mo164698Z3(this.f144319m).subscribe(ffw.m121194e(new e30() { // from class: l.djm0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f47562u9));
            }
        }, new kjm0(this)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m164711q4(boolean z, roj0 roj0Var) {
        if (z) {
            zvf0.m220399u("e_audio_room_pop_confirm_button", mo77274R2(), new j760("anchorId", m206027E2().m132140j0()), new j760("liveId", m206027E2().m149814k()), new j760("confirm_type", "kick_user"), new j760("user_type", e0o0.m114325l(this)));
        }
        m164697w4();
        lsi0.m151595y(z ? "已踢出该用户" : ypv.f199497e.getString(R$string.f46952S6));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m164712r4(final boolean z) {
        mo164699a4(this.f144319m).subscribe(ffw.m121194e(new e30() { // from class: l.bjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75922a.m164711q4(z, (roj0) obj);
            }
        }, new e30() { // from class: l.cjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81208a.mo164704g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m164713t4(String str, roj0 roj0Var) {
        m206028F2().VoiceUserCardEvent.setJailed().mo172463j(Boolean.FALSE);
        lsi0.m151595y(str + "已被取消禁言");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: u4 */
    public void m164714u4() {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            a7n0.m95295c(act(), new d30() { // from class: l.mjm0
                @Override // p149l.d30
                public final void call() {
                    this.f134216a.m164710p4();
                }
            });
            return;
        }
        User user = this.f144319m;
        final String str = user.name;
        mo164698Z3(user).subscribe(ffw.m121194e(new e30() { // from class: l.ljm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128365a.m164709o4(str, (roj0) obj);
            }
        }, new kjm0(this)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v4 */
    public void m164715v4() {
        final boolean zM207012b = x4s.m207012b(m206027E2().mo149813j().liveMode);
        hhn0.m130974c(act(), zM207012b, new d30() { // from class: l.ijm0
            @Override // p149l.d30
            public final void call() {
                this.f113577a.m164712r4(zM207012b);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m164716x4(final boolean z) {
        String str;
        String str2 = "";
        if (z) {
            str = String.format(ypv.f199497e.getString(R$string.f47325je), this.f144319m.name);
            List<String> listM164691Y3 = !vwb.m200296J(ypv.m215672k().m195648I4()) ? m164691Y3(ypv.m215672k().m195648I4()) : null;
            if (listM164691Y3 != null && listM164691Y3.size() != 0) {
                str2 = String.format(ypv.f199497e.getString(R$string.f47253g7), m164692c4(listM164691Y3));
            }
        } else {
            str = String.format(ypv.f199497e.getString(R$string.f46885P2), this.f144319m.name);
        }
        Dialog.C4309e c4309eM20543m0 = act().dialog().m20507G0(str).m20560v0(ypv.f199497e.getString(R$string.f47423o2), new Runnable() { // from class: l.ejm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91767a.m164696s4(z);
            }
        }).m20543m0(ypv.f199497e.getString(R$string.f47662z));
        if (!TextUtils.isEmpty(str2)) {
            c4309eM20543m0.m20504F(str2);
        }
        c4309eM20543m0.m20568z0();
    }

    /* JADX INFO: renamed from: y4 */
    public void m164717y4(Act act, mqv<User> mqvVar) {
        m164693h4(mqvVar);
        ((vwn0) this.viewModel).m200435d(act, m164700b4());
    }

    /* JADX INFO: renamed from: z4 */
    public void m164718z4(User user) {
        final String str = user.name;
        duringCreated(m164701d4(user)).subscribe(ffw.m121194e(new e30() { // from class: l.jjm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118303a.m164713t4(str, (roj0) obj);
            }
        }, new kjm0(this)));
    }
}
