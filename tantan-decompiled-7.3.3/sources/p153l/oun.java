package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class oun extends dvs<IntlLiveActivitiesEntryView> {

    /* JADX INFO: renamed from: f */
    public final String f149175f;

    /* JADX INFO: renamed from: g */
    public wyd0 f149176g;

    /* JADX INFO: renamed from: h */
    public final boolean f149177h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final egj0 f149178i;

    /* JADX INFO: renamed from: j */
    public final ft5 f149179j;

    public oun(ner nerVar, nus nusVar, boolean z, @NonNull egj0 egj0Var) {
        super(nerVar, nusVar);
        this.f149175f = getClass().getSimpleName();
        this.f149176g = new wyd0("intl_live_active_start_live_times" + mbs.m157870o0(), "");
        this.f149179j = new ft5();
        this.f149177h = z;
        this.f149178i = egj0Var;
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m169322G3() {
        if (pzi0.m174439D(((fm3) tbs.m190077m(itd0.f116823e)).m126174b())) {
            return !t4u.m189314c().m222761e().booleanValue();
        }
        t4u.m189322k(false);
        return true;
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m169331X2(x20 x20Var, Throwable th) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i3 */
    private C22507a<qrr> m169342i3() {
        return ((gm3) tbs.m190077m(itd0.f116821c)).f104912b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public /* synthetic */ void m169344q3(Boolean bool) {
        ((IntlLiveActivitiesEntryView) this.viewModel).m71493A(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public /* synthetic */ void m169345r3(C4470c c4470c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((IntlLiveActivitiesEntryView) v2).m71513z();
        }
        m169346B3(false);
    }

    /* JADX INFO: renamed from: B3 */
    public void m169346B3(boolean z) {
        m169347C3(z, true);
    }

    /* JADX INFO: renamed from: C3 */
    public void m169347C3(final boolean z, final boolean z2) {
        duringCreated(IntlLiveSquareApi.getLiveActivitySummaryInSquare()).subscribe(dhw.m115826e(new y20() { // from class: l.aun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73530a.m169363u3(z2, z, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.bun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78530a.m169364v3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m169349E3() {
        duringCreated(ppi0.m173207l().m173229y()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ztn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206029a.m169365w3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F3 */
    public void m169350F3(final boolean z, boolean z2) {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126177e();
        ((gm3) tbs.m190077m(itd0.f116821c)).m130735j();
        if (z2 && m169342i3().m222761e() != null) {
            m169342i3().m137019l(m169342i3().m222761e().m177595a());
        }
        String strM157870o0 = mbs.m157870o0();
        final qrr qrrVarM222761e = m169342i3().m222761e();
        if (TextUtils.isEmpty(strM157870o0) || qrrVarM222761e == null || !qrrVarM222761e.m177604j()) {
            return;
        }
        this.f149179j.m127297a(IntlLiveCounterApi.patchReddot("clearActivitySquareDetailUnread").onErrorReturn(new qcj() { // from class: l.vtn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BLiveCounter.new_();
            }
        }).flatMap(new qcj() { // from class: l.fun
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareApi.getLiveActivitySummaryInSquare();
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.gun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106523a.m169366x3(z, qrrVarM222761e, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.hun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111681a.m169367y3(z, qrrVarM222761e, (Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: H3 */
    public void m169351H3(qrr qrrVar) {
        vun.m202809b(qrrVar, this.f149178i.mo70128v());
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(m169342i3().asObservable()).subscribe(dhw.m115826e(new y20() { // from class: l.iun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116962a.m169360o3((qrr) obj);
            }
        }, new y20() { // from class: l.jun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122728a.m169343p3((Throwable) obj);
            }
        }));
        duringCreated(t4u.m189320i()).map(new qcj() { // from class: l.kun
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.lun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133637a.m169344q3((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.mun
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143720a.m169345r3((C4470c) obj);
            }
        }));
        m169349E3();
    }

    /* JADX INFO: renamed from: I3 */
    public void m169352I3(qrr qrrVar) {
        vun.m202810c(qrrVar, this.f149178i.mo70128v());
    }

    /* JADX INFO: renamed from: J3 */
    public void m169353J3() {
        vun.m202812e(this.f149178i.mo70128v());
    }

    /* JADX INFO: renamed from: K3 */
    public void m169354K3() {
        String str;
        long jM174453n = pzi0.m174453n();
        try {
            if (TextUtils.isEmpty(this.f149176g.get())) {
                str = jM174453n + ":1";
            } else {
                String[] strArrSplit = this.f149176g.get().split(":");
                if (Long.parseLong(strArrSplit[0]) == jM174453n) {
                    str = strArrSplit[0] + ":" + strArrSplit[1] + 1;
                } else {
                    str = jM174453n + ":1";
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            str = jM174453n + ":1";
        }
        this.f149176g.put(str);
        vun.m202813f(this.f149178i.mo70128v());
    }

    /* JADX INFO: renamed from: L3 */
    public void m169355L3() {
        if (TextUtils.equals("p_live_recommend", this.f149178i.mo70128v()) || TextUtils.equals("p_live_nearby", this.f149178i.mo70128v())) {
            vun.m202814g(this.f149178i.mo70128v());
        }
    }

    /* JADX INFO: renamed from: j3 */
    public String m169356j3() {
        return this.f149178i.mo70128v();
    }

    /* JADX INFO: renamed from: k3 */
    public final int m169357k3() {
        String str = this.f149176g.get();
        long jM174453n = pzi0.m174453n();
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            String[] strArrSplit = str.split(":");
            if (Long.parseLong(strArrSplit[0]) == jM174453n) {
                return Integer.parseInt(strArrSplit[1]);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m169358m3(String str) {
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1 || !"tantanapp://live/audience/suggest".equals(strArrSplit[0])) {
            t4u.m189325n(2);
        } else {
            duringCreated(IntlLiveSquareApi.getLiveActivitySignInRecommendRoom(strArrSplit[1])).subscribe(dhw.m115826e(new y20() { // from class: l.wtn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190797a.m169359n3((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.xtn
                @Override // p153l.y20
                public final void call(Object obj) {
                    t4u.m189325n(2);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f149179j.m127299c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m169359n3(final BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.lives) || jyb.m147479J(bLiveEnvelope.data.rooms)) {
            t4u.m189325n(2);
            return;
        }
        t4u.m189325n(3);
        Intent intentM143704f = tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68776D(bLiveEnvelope.data.lives.get(0)).m68785M(true).m68787O("sign-in-suggested").m68794u());
        vun.m202811d(this.f149178i.mo70128v(), bLiveEnvelope.data.users.get(0).f56859id, bLiveEnvelope.data.lives.get(0).f45171id);
        if (!jyb.m147479J(bLiveEnvelope.data.followships)) {
            ArrayList arrayListM147522n = jyb.m147522n(bLiveEnvelope.data.followships, new qcj() { // from class: l.ytn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, bLiveEnvelope.data.lives.get(0).anchor.f45267id));
                }
            });
            if (!jyb.m147479J(arrayListM147522n) && Followship.isFollowed((Followship) arrayListM147522n.get(0))) {
                getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
            }
        }
        getAct().startActivity(intentM143704f);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m169360o3(qrr qrrVar) {
        ((IntlLiveActivitiesEntryView) this.viewModel).m71496E(qrrVar);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m169361s3(x20 x20Var, BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.squareEntranceSummary) && bLiveEnvelope.data.squareEntranceSummary.size() != 0) {
            qrr qrrVar = new qrr(bLiveEnvelope);
            if (TextUtils.equals("sign-in", qrrVar.m177599e().type)) {
                ((fm3) tbs.m190077m(itd0.f116823e)).m126179g(System.currentTimeMillis());
                qrrVar.m177596b(3);
                if (m169322G3()) {
                    m169342i3().m137019l(qrrVar);
                    return;
                }
            } else if (TextUtils.equals("start-live", qrrVar.m177599e().type) && m169357k3() < qrrVar.m177599e().displayTime && !TextUtils.isEmpty(qrrVar.m177599e().title)) {
                qrrVar.m177596b(4);
                m169342i3().m137019l(qrrVar);
                return;
            }
        }
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m169362t3(boolean z, boolean z2, qrr qrrVar, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            IntlLiveCounterApi.refreshLiveCounter(true);
        }
        qrr qrrVarM222761e = m169342i3().m222761e();
        if (qrrVarM222761e == null || !z2) {
            m169342i3().m137019l(qrrVar);
        } else {
            m169342i3().m137019l(qrrVarM222761e.m177606l(new qrr(bLiveEnvelope)).m177595a());
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m169363u3(final boolean z, final boolean z2, final BLiveEnvelope bLiveEnvelope) {
        final qrr qrrVarM177595a = new qrr(bLiveEnvelope).m177595a();
        x20 x20Var = new x20() { // from class: l.cun
            @Override // p153l.x20
            public final void call() {
                this.f83855a.m169362t3(z, z2, qrrVarM177595a, bLiveEnvelope);
            }
        };
        if (((IntlLiveActivitiesEntryView) this.viewModel).m71503m(qrrVarM177595a)) {
            x20Var.call();
        } else {
            m169368z3(x20Var);
            IntlLiveCounterApi.refreshLiveCounter(true);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m169364v3(Throwable th) {
        if (this.f149177h) {
            m169342i3().m137019l(new qrr(th).m177595a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m169365w3(Boolean bool) {
        if (!bool.booleanValue() && !bnl0.m105529O0((View) this.viewModel)) {
            m169346B3(false);
        }
        if ("p_audio_explore_recommend".equals(this.f149178i.mo70128v())) {
            return;
        }
        bnl0.m105525M0((View) this.viewModel, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m169366x3(boolean z, qrr qrrVar, BLiveEnvelope bLiveEnvelope) {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125942I("live_activities_entry");
        if (z) {
            m169342i3().m137019l(qrrVar.m177596b(1));
        } else {
            m169342i3().m137019l(new qrr(bLiveEnvelope).m177595a());
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m169367y3(boolean z, qrr qrrVar, Throwable th) {
        if (z) {
            m169342i3().m137019l(qrrVar.m177596b(1));
        } else {
            m169342i3().m137019l(new qrr(th).m177595a());
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final void m169368z3(final x20 x20Var) {
        duringCreated(IntlLiveSquareApi.getLiveActivityEntranceInfo()).subscribe(dhw.m115826e(new y20() { // from class: l.dun
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90829a.m169361s3(x20Var, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.eun
            @Override // p153l.y20
            public final void call(Object obj) {
                oun.m169331X2(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m169343p3(Throwable th) {
    }

    /* JADX INFO: renamed from: D3 */
    public void m169348D3(BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
    }
}
