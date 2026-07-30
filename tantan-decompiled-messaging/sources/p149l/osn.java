package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class osn extends cts<IntlLiveActivitiesEntryView> {

    /* JADX INFO: renamed from: f */
    public final String f145475f;

    /* JADX INFO: renamed from: g */
    public uqd0 f145476g;

    /* JADX INFO: renamed from: h */
    public final boolean f145477h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final a7j0 f145478i;

    /* JADX INFO: renamed from: j */
    public final bs5 f145479j;

    public osn(mcr mcrVar, mss mssVar, boolean z, @NonNull a7j0 a7j0Var) {
        super(mcrVar, mssVar);
        this.f145475f = getClass().getSimpleName();
        this.f145476g = new uqd0("intl_live_active_start_live_times" + l9s.m149093o0(), "");
        this.f145479j = new bs5();
        this.f145477h = z;
        this.f145478i = a7j0Var;
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m165828G3() {
        if (mqi0.m155929D(((gl3) s9s.m182763m(gld0.f103315e)).m126739b())) {
            return !s2u.m182071c().m221515e().booleanValue();
        }
        s2u.m182079k(false);
        return true;
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m165837X2(d30 d30Var, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i3 */
    private C22392a<ppr> m165848i3() {
        return ((hl3) s9s.m182763m(gld0.f103313c)).f108309b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public /* synthetic */ void m165850q3(Boolean bool) {
        ((IntlLiveActivitiesEntryView) this.viewModel).m70310A(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public /* synthetic */ void m165851r3(C4319c c4319c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((IntlLiveActivitiesEntryView) v2).m70330z();
        }
        m165852B3(false);
    }

    /* JADX INFO: renamed from: B3 */
    public void m165852B3(boolean z) {
        m165853C3(z, true);
    }

    /* JADX INFO: renamed from: C3 */
    public void m165853C3(final boolean z, final boolean z2) {
        duringCreated(IntlLiveSquareApi.getLiveActivitySummaryInSquare()).subscribe(ffw.m121194e(new e30() { // from class: l.asn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71463a.m165869u3(z2, z, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.bsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77110a.m165870v3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m165855E3() {
        duringCreated(pgi0.m168730l().m168752y()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.zrn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204530a.m165871w3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F3 */
    public void m165856F3(final boolean z, boolean z2) {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126742e();
        ((hl3) s9s.m182763m(gld0.f103313c)).m131636j();
        if (z2 && m165848i3().m221515e() != null) {
            m165848i3().m132487l(m165848i3().m221515e().m170759a());
        }
        String strM149093o0 = l9s.m149093o0();
        final ppr pprVarM221515e = m165848i3().m221515e();
        if (TextUtils.isEmpty(strM149093o0) || pprVarM221515e == null || !pprVarM221515e.m170768j()) {
            return;
        }
        this.f145479j.m103655a(IntlLiveCounterApi.patchReddot("clearActivitySquareDetailUnread").onErrorReturn(new w9j() { // from class: l.vrn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BLiveCounter.new_();
            }
        }).flatMap(new w9j() { // from class: l.fsn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareApi.getLiveActivitySummaryInSquare();
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.gsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104190a.m165872x3(z, pprVarM221515e, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109332a.m165873y3(z, pprVarM221515e, (Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: H3 */
    public void m165857H3(ppr pprVar) {
        vsn.m199874b(pprVar, this.f145478i.mo68945v());
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(m165848i3().asObservable()).subscribe(ffw.m121194e(new e30() { // from class: l.isn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114782a.m165866o3((ppr) obj);
            }
        }, new e30() { // from class: l.jsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119526a.m165849p3((Throwable) obj);
            }
        }));
        duringCreated(s2u.m182077i()).map(new w9j() { // from class: l.ksn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.lsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129885a.m165850q3((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.msn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.nsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140281a.m165851r3((C4319c) obj);
            }
        }));
        m165855E3();
    }

    /* JADX INFO: renamed from: I3 */
    public void m165858I3(ppr pprVar) {
        vsn.m199875c(pprVar, this.f145478i.mo68945v());
    }

    /* JADX INFO: renamed from: J3 */
    public void m165859J3() {
        vsn.m199877e(this.f145478i.mo68945v());
    }

    /* JADX INFO: renamed from: K3 */
    public void m165860K3() {
        String str;
        long jM155943n = mqi0.m155943n();
        try {
            if (TextUtils.isEmpty(this.f145476g.get())) {
                str = jM155943n + ":1";
            } else {
                String[] strArrSplit = this.f145476g.get().split(":");
                if (Long.parseLong(strArrSplit[0]) == jM155943n) {
                    str = strArrSplit[0] + ":" + strArrSplit[1] + 1;
                } else {
                    str = jM155943n + ":1";
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            str = jM155943n + ":1";
        }
        this.f145476g.put(str);
        vsn.m199878f(this.f145478i.mo68945v());
    }

    /* JADX INFO: renamed from: L3 */
    public void m165861L3() {
        if (TextUtils.equals("p_live_recommend", this.f145478i.mo68945v()) || TextUtils.equals("p_live_nearby", this.f145478i.mo68945v())) {
            vsn.m199879g(this.f145478i.mo68945v());
        }
    }

    /* JADX INFO: renamed from: j3 */
    public String m165862j3() {
        return this.f145478i.mo68945v();
    }

    /* JADX INFO: renamed from: k3 */
    public final int m165863k3() {
        String str = this.f145476g.get();
        long jM155943n = mqi0.m155943n();
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            String[] strArrSplit = str.split(":");
            if (Long.parseLong(strArrSplit[0]) == jM155943n) {
                return Integer.parseInt(strArrSplit[1]);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m165864m3(String str) {
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1 || !"tantanapp://live/audience/suggest".equals(strArrSplit[0])) {
            s2u.m182082n(2);
        } else {
            duringCreated(IntlLiveSquareApi.getLiveActivitySignInRecommendRoom(strArrSplit[1])).subscribe(ffw.m121194e(new e30() { // from class: l.wrn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187809a.m165865n3((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.xrn
                @Override // p149l.e30
                public final void call(Object obj) {
                    s2u.m182082n(2);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f145479j.m103657c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m165865n3(final BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.lives) || vwb.m200296J(bLiveEnvelope.data.rooms)) {
            s2u.m182082n(2);
            return;
        }
        s2u.m182082n(3);
        Intent intentM134373f = s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67593D(bLiveEnvelope.data.lives.get(0)).m67602M(true).m67604O("sign-in-suggested").m67611u());
        vsn.m199876d(this.f145478i.mo68945v(), bLiveEnvelope.data.users.get(0).f56011id, bLiveEnvelope.data.lives.get(0).f44323id);
        if (!vwb.m200296J(bLiveEnvelope.data.followships)) {
            ArrayList arrayListM200339n = vwb.m200339n(bLiveEnvelope.data.followships, new w9j() { // from class: l.yrn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, bLiveEnvelope.data.lives.get(0).anchor.f44419id));
                }
            });
            if (!vwb.m200296J(arrayListM200339n) && Followship.isFollowed((Followship) arrayListM200339n.get(0))) {
                getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
            }
        }
        getAct().startActivity(intentM134373f);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m165866o3(ppr pprVar) {
        ((IntlLiveActivitiesEntryView) this.viewModel).m70313E(pprVar);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m165867s3(d30 d30Var, BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.squareEntranceSummary) && bLiveEnvelope.data.squareEntranceSummary.size() != 0) {
            ppr pprVar = new ppr(bLiveEnvelope);
            if (TextUtils.equals("sign-in", pprVar.m170763e().type)) {
                ((gl3) s9s.m182763m(gld0.f103315e)).m126744g(System.currentTimeMillis());
                pprVar.m170760b(3);
                if (m165828G3()) {
                    m165848i3().m132487l(pprVar);
                    return;
                }
            } else if (TextUtils.equals("start-live", pprVar.m170763e().type) && m165863k3() < pprVar.m170763e().displayTime && !TextUtils.isEmpty(pprVar.m170763e().title)) {
                pprVar.m170760b(4);
                m165848i3().m132487l(pprVar);
                return;
            }
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m165868t3(boolean z, boolean z2, ppr pprVar, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            IntlLiveCounterApi.refreshLiveCounter(true);
        }
        ppr pprVarM221515e = m165848i3().m221515e();
        if (pprVarM221515e == null || !z2) {
            m165848i3().m132487l(pprVar);
        } else {
            m165848i3().m132487l(pprVarM221515e.m170770l(new ppr(bLiveEnvelope)).m170759a());
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m165869u3(final boolean z, final boolean z2, final BLiveEnvelope bLiveEnvelope) {
        final ppr pprVarM170759a = new ppr(bLiveEnvelope).m170759a();
        d30 d30Var = new d30() { // from class: l.csn
            @Override // p149l.d30
            public final void call() {
                this.f82363a.m165868t3(z, z2, pprVarM170759a, bLiveEnvelope);
            }
        };
        if (((IntlLiveActivitiesEntryView) this.viewModel).m70320m(pprVarM170759a)) {
            d30Var.call();
        } else {
            m165874z3(d30Var);
            IntlLiveCounterApi.refreshLiveCounter(true);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m165870v3(Throwable th) {
        if (this.f145477h) {
            m165848i3().m132487l(new ppr(th).m170759a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m165871w3(Boolean bool) {
        if (!bool.booleanValue() && !xdl0.m208349O0((View) this.viewModel)) {
            m165852B3(false);
        }
        if ("p_audio_explore_recommend".equals(this.f145478i.mo68945v())) {
            return;
        }
        xdl0.m208345M0((View) this.viewModel, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m165872x3(boolean z, ppr pprVar, BLiveEnvelope bLiveEnvelope) {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159611I("live_activities_entry");
        if (z) {
            m165848i3().m132487l(pprVar.m170760b(1));
        } else {
            m165848i3().m132487l(new ppr(bLiveEnvelope).m170759a());
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m165873y3(boolean z, ppr pprVar, Throwable th) {
        if (z) {
            m165848i3().m132487l(pprVar.m170760b(1));
        } else {
            m165848i3().m132487l(new ppr(th).m170759a());
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final void m165874z3(final d30 d30Var) {
        duringCreated(IntlLiveSquareApi.getLiveActivityEntranceInfo()).subscribe(ffw.m121194e(new e30() { // from class: l.dsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87775a.m165867s3(d30Var, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.esn
            @Override // p149l.e30
            public final void call(Object obj) {
                osn.m165837X2(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m165849p3(Throwable th) {
    }

    /* JADX INFO: renamed from: D3 */
    public void m165854D3(BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
    }
}
