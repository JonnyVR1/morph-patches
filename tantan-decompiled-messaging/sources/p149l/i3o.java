package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveActivitiesApi;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class i3o extends lss<IntlLiveSquareFollowFrag> {

    /* JADX INFO: renamed from: f */
    public final C22392a<mtn> f111357f;

    /* JADX INFO: renamed from: g */
    public final String f111358g;

    /* JADX INFO: renamed from: h */
    public mtn f111359h;

    public i3o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f111357f = C22392a.m221512b();
        this.f111358g = i3o.class.getSimpleName();
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m134281U2() {
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m134286Z2() {
        ((IntlLiveSquareFollowFrag) this.viewModel).m70108I5();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m134287a3(mtn mtnVar) {
        this.f111357f.onNext(mtnVar);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m134288b3(Throwable th) {
        ((IntlLiveSquareFollowFrag) this.viewModel).m70109J5(th);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m134289c3(mtn mtnVar, mtn mtnVar2) {
        mtnVar.m156326r(mtnVar2);
        this.f111357f.onNext(mtnVar);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m134291e3(ntn ntnVar, Followship followship) {
        mtn mtnVarM221515e = this.f111357f.m221515e();
        if (mtnVarM221515e != null) {
            mtnVarM221515e.m156332x(ntnVar);
            ((IntlLiveSquareFollowFrag) this.viewModel).m70106F5(mtnVarM221515e);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m134292f3(mtn mtnVar) {
        this.f111359h = mtnVar;
        ((IntlLiveSquareFollowFrag) this.viewModel).m70111N5(mtnVar);
    }

    /* JADX INFO: renamed from: g3 */
    public void m134293g3() {
        duringCreated(IntlLiveActivitiesApi.getLiveActivitiesInfo()).doOnSubscribe(new d30() { // from class: l.y2o
            @Override // p149l.d30
            public final void call() {
                this.f195660a.m134286Z2();
            }
        }).subscribe(ffw.m121195f(new e30() { // from class: l.z2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201264a.m134287a3((mtn) obj);
            }
        }, new e30() { // from class: l.a3o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67405a.m134288b3((Throwable) obj);
            }
        }, new d30() { // from class: l.b3o
            @Override // p149l.d30
            public final void call() {
                i3o.m134281U2();
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m134294h3() {
        final mtn mtnVarM221515e = this.f111357f.m221515e();
        if (mtnVarM221515e == null || !mtnVarM221515e.m156321m()) {
            return;
        }
        duringCreated(IntlLiveActivitiesApi.getNextPage(mtnVarM221515e.m156319k())).subscribe(ffw.m121194e(new e30() { // from class: l.e3o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89200a.m134289c3(mtnVarM221515e, (mtn) obj);
            }
        }, new e30() { // from class: l.f3o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94700a.m134290d3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public void m134295i3(ntn ntnVar, int i) {
        getAct().startActivity(s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67593D(ntnVar.f140496d).m67604O("live-activity-suggested").m67611u()));
        adu.m96007c(h7d0.m129655x().m129663b(ntnVar.f140496d).m129668g(ntnVar.f140493a.f56011id).m129673l(i).m129684w("e_anchor_recommend").m129662a(), ((IntlLiveSquareFollowFrag) this.viewModel).pageId());
    }

    /* JADX INFO: renamed from: j3 */
    public void m134296j3(final ntn ntnVar) {
        duringCreated(l9s.m149084k(l9s.m149093o0(), ntnVar.f140493a, true, "liveActivityAnchorSuggest", ntnVar.f140496d.f44323id, ((IntlLiveSquareFollowFrag) this.viewModel).pageId(), "liveActivityAnchorSuggest")).subscribe(ffw.m121194e(new e30() { // from class: l.g3o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100486a.m134291e3(ntnVar, (Followship) obj);
            }
        }, new e30() { // from class: l.h3o
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(s9s.f163227a.getString(R$string.f44121M));
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m134297k3() {
        zvf0.m220396r("e_live_follow_change", ((IntlLiveSquareFollowFrag) this.viewModel).pageId());
        mtn mtnVarM221515e = this.f111357f.m221515e();
        if (mtnVarM221515e != null) {
            mtnVarM221515e.m156331w();
            ((IntlLiveSquareFollowFrag) this.viewModel).m70107G5(mtnVarM221515e);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m134298m3() {
        duringCreated(this.f111357f.asObservable()).observeOn(jo0.m142408a()).skipWhile(new w9j() { // from class: l.c3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((mtn) obj) == null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.d3o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84242a.m134292f3((mtn) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m134290d3(Throwable th) {
    }
}
