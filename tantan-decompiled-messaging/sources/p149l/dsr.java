package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class dsr extends jq2<LiveActivitiesAct> {

    /* JADX INFO: renamed from: a */
    public final C22392a<qrr> f87784a;

    /* JADX INFO: renamed from: b */
    public final String f87785b;

    /* JADX INFO: renamed from: c */
    public qrr f87786c;

    public dsr(mcr mcrVar) {
        super(mcrVar);
        this.f87784a = C22392a.m221512b();
        this.f87785b = dsr.class.getSimpleName();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m113477h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m113483n0() {
        ((LiveActivitiesAct) this.viewModel).m68969s2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m113485o0(Throwable th) {
        ((LiveActivitiesAct) this.viewModel).m68970u2(th);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m113486p0(qrr qrrVar, qrr qrrVar2) {
        qrrVar.m176124r(qrrVar2);
        this.f87784a.onNext(qrrVar);
    }

    /* JADX INFO: renamed from: r */
    public void m113487r() {
        final qrr qrrVarM221515e = this.f87784a.m221515e();
        if (qrrVarM221515e == null || !qrrVarM221515e.m176119m()) {
            return;
        }
        duringCreated(LiveSquareApi.getNextPage(qrrVarM221515e.m176117k())).subscribe(ffw.m121194e(new e30() { // from class: l.zrr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204539a.m113486p0(qrrVarM221515e, (qrr) obj);
            }
        }, new e30() { // from class: l.asr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71471a.m113484q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m113488r0(fsr fsrVar, Followship followship) {
        qrr qrrVarM221515e = this.f87784a.m221515e();
        if (qrrVarM221515e != null) {
            qrrVarM221515e.m176130x(fsrVar);
            ((LiveActivitiesAct) this.viewModel).m68966p2(qrrVarM221515e);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m113489s0(qrr qrrVar) {
        this.f87786c = qrrVar;
        ((LiveActivitiesAct) this.viewModel).m68972w2(qrrVar);
    }

    /* JADX INFO: renamed from: t0 */
    public void m113490t0() {
        C22306c<qrr> c22306cDoOnSubscribe = LiveSquareApi.getLiveActivitiesInfo().doOnSubscribe(new d30() { // from class: l.vrr
            @Override // p149l.d30
            public final void call() {
                this.f182745a.m113483n0();
            }
        });
        final C22392a<qrr> c22392a = this.f87784a;
        Objects.requireNonNull(c22392a);
        c22306cDoOnSubscribe.subscribe(ffw.m121195f(new e30() { // from class: l.wrr
            @Override // p149l.e30
            public final void call(Object obj) {
                c22392a.onNext((qrr) obj);
            }
        }, new e30() { // from class: l.xrr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194168a.m113485o0((Throwable) obj);
            }
        }, new d30() { // from class: l.yrr
            @Override // p149l.d30
            public final void call() {
                dsr.m113477h0();
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m113491u0(fsr fsrVar, int i) {
        act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67593D(fsrVar.f99102d).m67604O("live-activity-suggested").m67611u()));
        adu.m96007c(h7d0.m129655x().m129663b(fsrVar.f99102d).m129668g(fsrVar.f99099a.f56011id).m129673l(i).m129684w("e_anchor_recommend").m129662a(), ((LiveActivitiesAct) this.viewModel).pageId());
    }

    /* JADX INFO: renamed from: x0 */
    public void m113492x0(final fsr fsrVar) {
        duringCreated(l9s.m149084k(l9s.m149093o0(), fsrVar.f99099a, true, "liveActivityAnchorSuggest", fsrVar.f99102d.f44323id, ((LiveActivitiesAct) this.viewModel).pageId(), "liveActivityAnchorSuggest")).subscribe(ffw.m121194e(new e30() { // from class: l.bsr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77117a.m113488r0(fsrVar, (Followship) obj);
            }
        }, new e30() { // from class: l.csr
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(s9s.f163227a.getString(R$string.f44121M));
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public void m113493y0() {
        zvf0.m220396r("e_live_follow_change", ((LiveActivitiesAct) this.viewModel).pageId());
        qrr qrrVarM221515e = this.f87784a.m221515e();
        if (qrrVarM221515e != null) {
            qrrVarM221515e.m176129w();
            ((LiveActivitiesAct) this.viewModel).m68967q2(qrrVarM221515e);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m113494z0() {
        duringCreated(this.f87784a.asObservable()).observeOn(jo0.m142408a()).skipWhile(new w9j() { // from class: l.trr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((qrr) obj) == null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.urr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177871a.m113489s0((qrr) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m113484q0(Throwable th) {
    }
}
