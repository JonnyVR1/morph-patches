package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveActivitiesApi;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class i5o extends mus<IntlLiveSquareFollowFrag> {

    /* JADX INFO: renamed from: f */
    public final C22507a<mvn> f113083f;

    /* JADX INFO: renamed from: g */
    public final String f113084g;

    /* JADX INFO: renamed from: h */
    public mvn f113085h;

    public i5o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f113083f = C22507a.m222758b();
        this.f113084g = i5o.class.getSimpleName();
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m138733U2() {
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m138738Z2() {
        ((IntlLiveSquareFollowFrag) this.viewModel).m71291I5();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m138739a3(mvn mvnVar) {
        this.f113083f.onNext(mvnVar);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m138740b3(Throwable th) {
        ((IntlLiveSquareFollowFrag) this.viewModel).m71292J5(th);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m138741c3(mvn mvnVar, mvn mvnVar2) {
        mvnVar.m160298r(mvnVar2);
        this.f113083f.onNext(mvnVar);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m138743e3(nvn nvnVar, Followship followship) {
        mvn mvnVarM222761e = this.f113083f.m222761e();
        if (mvnVarM222761e != null) {
            mvnVarM222761e.m160304x(nvnVar);
            ((IntlLiveSquareFollowFrag) this.viewModel).m71289F5(mvnVarM222761e);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m138744f3(mvn mvnVar) {
        this.f113085h = mvnVar;
        ((IntlLiveSquareFollowFrag) this.viewModel).m71294N5(mvnVar);
    }

    /* JADX INFO: renamed from: g3 */
    public void m138745g3() {
        duringCreated(IntlLiveActivitiesApi.getLiveActivitiesInfo()).doOnSubscribe(new x20() { // from class: l.y4o
            @Override // p153l.x20
            public final void call() {
                this.f197510a.m138738Z2();
            }
        }).subscribe(dhw.m115827f(new y20() { // from class: l.z4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202969a.m138739a3((mvn) obj);
            }
        }, new y20() { // from class: l.a5o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68629a.m138740b3((Throwable) obj);
            }
        }, new x20() { // from class: l.b5o
            @Override // p153l.x20
            public final void call() {
                i5o.m138733U2();
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m138746h3() {
        final mvn mvnVarM222761e = this.f113083f.m222761e();
        if (mvnVarM222761e == null || !mvnVarM222761e.m160293m()) {
            return;
        }
        duringCreated(IntlLiveActivitiesApi.getNextPage(mvnVarM222761e.m160291k())).subscribe(dhw.m115826e(new y20() { // from class: l.e5o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92224a.m138741c3(mvnVarM222761e, (mvn) obj);
            }
        }, new y20() { // from class: l.f5o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97273a.m138742d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public void m138747i3(nvn nvnVar, int i) {
        getAct().startActivity(tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68776D(nvnVar.f143824d).m68787O("live-activity-suggested").m68794u()));
        bfu.m104071c(kfd0.m149385x().m149393b(nvnVar.f143824d).m149398g(nvnVar.f143821a.f56859id).m149403l(i).m149414w("e_anchor_recommend").m149392a(), ((IntlLiveSquareFollowFrag) this.viewModel).pageId());
    }

    /* JADX INFO: renamed from: j3 */
    public void m138748j3(final nvn nvnVar) {
        duringCreated(mbs.m157861k(mbs.m157870o0(), nvnVar.f143821a, true, "liveActivityAnchorSuggest", nvnVar.f143824d.f45171id, ((IntlLiveSquareFollowFrag) this.viewModel).pageId(), "liveActivityAnchorSuggest")).subscribe(dhw.m115826e(new y20() { // from class: l.g5o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102340a.m138743e3(nvnVar, (Followship) obj);
            }
        }, new y20() { // from class: l.h5o
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(tbs.f172988a.getString(R$string.f44969M));
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m138749k3() {
        i4g0.m138520r("e_live_follow_change", ((IntlLiveSquareFollowFrag) this.viewModel).pageId());
        mvn mvnVarM222761e = this.f113083f.m222761e();
        if (mvnVarM222761e != null) {
            mvnVarM222761e.m160303w();
            ((IntlLiveSquareFollowFrag) this.viewModel).m71290G5(mvnVarM222761e);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m138750m3() {
        duringCreated(this.f113083f.asObservable()).observeOn(fo0.m126432a()).skipWhile(new qcj() { // from class: l.c5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mvn) obj) == null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.d5o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85178a.m138744f3((mvn) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m138742d3(Throwable th) {
    }
}
