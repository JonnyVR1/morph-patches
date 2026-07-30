package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class eur extends ar2<LiveActivitiesAct> {

    /* JADX INFO: renamed from: a */
    public final C22507a<rtr> f95947a;

    /* JADX INFO: renamed from: b */
    public final String f95948b;

    /* JADX INFO: renamed from: c */
    public rtr f95949c;

    public eur(ner nerVar) {
        super(nerVar);
        this.f95947a = C22507a.m222758b();
        this.f95948b = eur.class.getSimpleName();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m122739h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m122745n0() {
        ((LiveActivitiesAct) this.viewModel).m70152u2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m122747o0(Throwable th) {
        ((LiveActivitiesAct) this.viewModel).m70153v2(th);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m122748p0(rtr rtrVar, rtr rtrVar2) {
        rtrVar.m183158r(rtrVar2);
        this.f95947a.onNext(rtrVar);
    }

    /* JADX INFO: renamed from: r */
    public void m122749r() {
        final rtr rtrVarM222761e = this.f95947a.m222761e();
        if (rtrVarM222761e == null || !rtrVarM222761e.m183153m()) {
            return;
        }
        duringCreated(LiveSquareApi.getNextPage(rtrVarM222761e.m183151k())).subscribe(dhw.m115826e(new y20() { // from class: l.aur
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73539a.m122748p0(rtrVarM222761e, (rtr) obj);
            }
        }, new y20() { // from class: l.bur
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78534a.m122746q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m122750r0(gur gurVar, Followship followship) {
        rtr rtrVarM222761e = this.f95947a.m222761e();
        if (rtrVarM222761e != null) {
            rtrVarM222761e.m183164x(gurVar);
            ((LiveActivitiesAct) this.viewModel).m70149q2(rtrVarM222761e);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m122751s0(rtr rtrVar) {
        this.f95949c = rtrVar;
        ((LiveActivitiesAct) this.viewModel).m70155y2(rtrVar);
    }

    /* JADX INFO: renamed from: t0 */
    public void m122752t0() {
        C22421c<rtr> c22421cDoOnSubscribe = LiveSquareApi.getLiveActivitiesInfo().doOnSubscribe(new x20() { // from class: l.wtr
            @Override // p153l.x20
            public final void call() {
                this.f190803a.m122745n0();
            }
        });
        final C22507a<rtr> c22507a = this.f95947a;
        Objects.requireNonNull(c22507a);
        c22421cDoOnSubscribe.subscribe(dhw.m115827f(new y20() { // from class: l.xtr
            @Override // p153l.y20
            public final void call(Object obj) {
                c22507a.onNext((rtr) obj);
            }
        }, new y20() { // from class: l.ytr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201532a.m122747o0((Throwable) obj);
            }
        }, new x20() { // from class: l.ztr
            @Override // p153l.x20
            public final void call() {
                eur.m122739h0();
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m122753u0(gur gurVar, int i) {
        act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68776D(gurVar.f106565d).m68787O("live-activity-suggested").m68794u()));
        bfu.m104071c(kfd0.m149385x().m149393b(gurVar.f106565d).m149398g(gurVar.f106562a.f56859id).m149403l(i).m149414w("e_anchor_recommend").m149392a(), ((LiveActivitiesAct) this.viewModel).pageId());
    }

    /* JADX INFO: renamed from: x0 */
    public void m122754x0(final gur gurVar) {
        duringCreated(mbs.m157861k(mbs.m157870o0(), gurVar.f106562a, true, "liveActivityAnchorSuggest", gurVar.f106565d.f45171id, ((LiveActivitiesAct) this.viewModel).pageId(), "liveActivityAnchorSuggest")).subscribe(dhw.m115826e(new y20() { // from class: l.cur
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83870a.m122750r0(gurVar, (Followship) obj);
            }
        }, new y20() { // from class: l.dur
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(tbs.f172988a.getString(R$string.f44969M));
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public void m122755y0() {
        i4g0.m138520r("e_live_follow_change", ((LiveActivitiesAct) this.viewModel).pageId());
        rtr rtrVarM222761e = this.f95947a.m222761e();
        if (rtrVarM222761e != null) {
            rtrVarM222761e.m183163w();
            ((LiveActivitiesAct) this.viewModel).m70150r2(rtrVarM222761e);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m122756z0() {
        duringCreated(this.f95947a.asObservable()).observeOn(fo0.m126432a()).skipWhile(new qcj() { // from class: l.utr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((rtr) obj) == null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.vtr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185737a.m122751s0((rtr) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m122746q0(Throwable th) {
    }
}
