package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.ManagerPersonBean;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bsm;
import l.bwr;
import l.d1t;
import l.d30;
import l.e30;
import l.ffw;
import l.h4t;
import l.ho2;
import l.j760;
import l.lsi0;
import l.mqv;
import l.roj0;
import l.vwb;
import l.w9j;
import l.x4s;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ojm0 extends h4t<ho2, vwn0> {

    /* JADX INFO: renamed from: i */
    public final String f18119i;

    /* JADX INFO: renamed from: j */
    public final String f18120j;

    /* JADX INFO: renamed from: k */
    public final String f18121k;

    /* JADX INFO: renamed from: l */
    public final String f18122l;

    /* JADX INFO: renamed from: m */
    public User f18123m;

    /* JADX INFO: renamed from: n */
    public String f18124n;

    public ojm0(bsm bsmVar) {
        super(bsmVar);
        this.f18119i = ypv.f23200e.getString(R.string.lb);
        this.f18120j = ypv.f23200e.getString(R.string.tb);
        this.f18121k = ypv.f23200e.getString(R.string.ob);
        this.f18122l = ypv.f23200e.getString(R.string.t9);
        this.f18124n = "";
        C(new vwn0());
    }

    /* JADX INFO: renamed from: Y3 */
    private List<String> m19871Y3(List<Integer> list) {
        return vwb.n(vwb.Q(list, new w9j() { // from class: l.njm0
            public final Object call(Object obj) {
                return this.f17543a.m19875n4((Integer) obj);
            }
        }), new w9j() { // from class: l.ajm0
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).length() > 0);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    private String m19872c4(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return ypv.f23200e.getString(R.string.J6, list.get(0), list.get(1));
        }
        return list.size() == 3 ? ypv.f23200e.getString(R.string.i7, list.get(0), list.get(1), list.get(2)) : ypv.f23200e.getString(R.string.h7, list.get(0), list.get(1), list.get(2));
    }

    /* JADX INFO: renamed from: h4 */
    private void m19873h4(mqv<User> mqvVar) {
        this.f18123m = mqvVar.h();
        d1t d1tVarG = mqvVar.g();
        if (d1tVarG instanceof d1t) {
            this.f18124n = d1tVarG.b();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private boolean m19874i4() {
        return !TextUtils.isEmpty(this.f18124n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ String m19875n4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            return iIntValue != 2 ? "" : this.f18122l;
        }
        return this.f18121k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m19876s4(boolean z) {
        E2().r1(E2().o(), ((DbObject) this.f18123m).id, z);
    }

    /* JADX INFO: renamed from: w4 */
    private void m19877w4() {
        F2().OpenUserCardDialogEvent.dismiss().p();
        F2().MemberEvent.refresh().p();
    }

    /* JADX INFO: renamed from: T */
    public void m19878T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().ManagerPersonEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.zim0
            public final void call(Object obj) {
                this.f23700a.m19889m4((ManagerPersonBean) obj);
            }
        }));
        duringCreated((c) F2().ManagerPersonEvent.kickOff().g()).subscribe(ffw.d(new e30() { // from class: l.fjm0
            public final void call(Object obj) {
                this.f13066a.m19886j4((mqv) obj);
            }
        }));
        duringCreated((c) F2().ManagerPersonEvent.forbiddenWords().g()).subscribe(ffw.d(new e30() { // from class: l.gjm0
            public final void call(Object obj) {
                this.f13609a.m19887k4((mqv) obj);
            }
        }));
        duringCreated((c) F2().ManagerPersonEvent.unMuteWords().g()).subscribe(ffw.h(new e30() { // from class: l.hjm0
            public final void call(Object obj) {
                this.f14155a.m19888l4((mqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public c<roj0> mo19879Z3(User user) {
        return LivingNormalApiProvider.q4(E2().o(), ((DbObject) user).id, this.f18124n);
    }

    /* JADX INFO: renamed from: a4 */
    public c<roj0> mo19880a4(User user) {
        return duringCreated(LivingNormalApiProvider.m6(E2().o(), ((DbObject) user).id, this.f18124n));
    }

    /* JADX INFO: renamed from: b4 */
    public List<String> m19881b4() {
        List<String> listM19871Y3;
        if (E2().F0() == 1) {
            listM19871Y3 = E2().G0().contains(((DbObject) this.f18123m).id) ? vwb.f0(new String[]{this.f18120j, this.f18121k, this.f18122l}) : vwb.f0(new String[]{this.f18119i, this.f18121k, this.f18122l});
            if (m19874i4()) {
                listM19871Y3.remove(this.f18119i);
                listM19871Y3.remove(this.f18120j);
            }
        } else {
            listM19871Y3 = (E2().F0() != 2 || vwb.J(ypv.m25490k().I4())) ? null : m19871Y3(ypv.m25490k().I4());
        }
        return listM19871Y3 == null ? vwb.f0(new String[0]) : listM19871Y3;
    }

    /* JADX INFO: renamed from: d4 */
    public c<roj0> m19882d4(User user) {
        return VoiceRoomApiProvider.unMuteWords(E2().o(), ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m19883e4(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 41500 || i == 51041)) {
            lsi0.y(coreService.metaMessage);
        } else {
            lsi0.y(ypv.f23200e.getString(R.string.v9));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m19884f4(CharSequence charSequence) {
        if (charSequence.equals(this.f18119i)) {
            m19898x4(true);
            return;
        }
        if (charSequence.equals(this.f18120j)) {
            m19898x4(false);
        } else if (charSequence.equals(this.f18121k)) {
            m19897v4();
        } else if (charSequence.equals(this.f18122l)) {
            m19896u4();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo19885g4(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.y(ypv.f23200e.getString(R.string.R6));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 41004) {
            lsi0.y(ypv.f23200e.getString(R.string.Oe));
        } else if (i == 41500 || i == 51041) {
            lsi0.y(coreService.metaMessage);
        } else {
            lsi0.y(ypv.f23200e.getString(R.string.R6));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m19886j4(mqv mqvVar) {
        m19873h4(mqvVar);
        m19897v4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m19887k4(mqv mqvVar) {
        m19873h4(mqvVar);
        m19896u4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m19888l4(mqv mqvVar) {
        m19900z4(mqvVar.h());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m19889m4(ManagerPersonBean managerPersonBean) {
        m19899y4(act(), managerPersonBean.livingUser);
    }

    /* JADX INFO: renamed from: n */
    public void m19890n() {
        super.n();
        this.f18124n = "";
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m19891o4(String str, roj0 roj0Var) {
        F2().VoiceUserCardEvent.setJailed().j(Boolean.TRUE);
        lsi0.y(str + "已被禁言");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m19892p4() {
        mo19879Z3(this.f18123m).subscribe(ffw.e(new e30() { // from class: l.djm0
            public final void call(Object obj) {
                lsi0.y(ypv.f23200e.getString(R.string.u9));
            }
        }, new kjm0(this)));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m19893q4(boolean z, roj0 roj0Var) {
        if (z) {
            zvf0.u("e_audio_room_pop_confirm_button", R2(), new j760[]{new j760("anchorId", E2().j0()), new j760("liveId", E2().k()), new j760("confirm_type", "kick_user"), new j760("user_type", e0o0.m13622l(this))});
        }
        m19877w4();
        lsi0.y(z ? "已踢出该用户" : ypv.f23200e.getString(R.string.S6));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m19894r4(final boolean z) {
        mo19880a4(this.f18123m).subscribe(ffw.e(new e30() { // from class: l.bjm0
            public final void call(Object obj) {
                this.f10140a.m19893q4(z, (roj0) obj);
            }
        }, new e30() { // from class: l.cjm0
            public final void call(Object obj) {
                this.f10637a.mo19885g4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m19895t4(String str, roj0 roj0Var) {
        F2().VoiceUserCardEvent.setJailed().j(Boolean.FALSE);
        lsi0.y(str + "已被取消禁言");
    }

    /* JADX INFO: renamed from: u4 */
    public void m19896u4() {
        if (!x4s.b(E2().j().liveMode)) {
            a7n0.m11261c(act(), new d30() { // from class: l.mjm0
                public final void call() {
                    this.f16977a.m19892p4();
                }
            });
            return;
        }
        User user = this.f18123m;
        final String str = user.name;
        mo19879Z3(user).subscribe(ffw.e(new e30() { // from class: l.ljm0
            public final void call(Object obj) {
                this.f16191a.m19891o4(str, (roj0) obj);
            }
        }, new kjm0(this)));
    }

    /* JADX INFO: renamed from: v4 */
    public void m19897v4() {
        final boolean zB = x4s.b(E2().j().liveMode);
        hhn0.m15716c(act(), zB, new d30() { // from class: l.ijm0
            public final void call() {
                this.f14671a.m19894r4(zB);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public void m19898x4(final boolean z) {
        String str;
        String str2 = "";
        if (z) {
            str = String.format(ypv.f23200e.getString(R.string.je), this.f18123m.name);
            List<String> listM19871Y3 = !vwb.J(ypv.m25490k().I4()) ? m19871Y3(ypv.m25490k().I4()) : null;
            if (listM19871Y3 != null && listM19871Y3.size() != 0) {
                str2 = String.format(ypv.f23200e.getString(R.string.g7), m19872c4(listM19871Y3));
            }
        } else {
            str = String.format(ypv.f23200e.getString(R.string.P2), this.f18123m.name);
        }
        Dialog.e eVarM0 = act().dialog().G0(str).v0(ypv.f23200e.getString(R.string.o2), new Runnable() { // from class: l.ejm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12586a.m19876s4(z);
            }
        }).m0(ypv.f23200e.getString(R.string.z));
        if (!TextUtils.isEmpty(str2)) {
            eVarM0.F(str2);
        }
        eVarM0.z0();
    }

    /* JADX INFO: renamed from: y4 */
    public void m19899y4(Act act, mqv<User> mqvVar) {
        m19873h4(mqvVar);
        ((vwn0) ((bwr) this).viewModel).m23742d(act, m19881b4());
    }

    /* JADX INFO: renamed from: z4 */
    public void m19900z4(User user) {
        final String str = user.name;
        duringCreated(m19882d4(user)).subscribe(ffw.e(new e30() { // from class: l.jjm0
            public final void call(Object obj) {
                this.f15210a.m19895t4(str, (roj0) obj);
            }
        }, new kjm0(this)));
    }
}
