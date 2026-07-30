package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class jn10 extends td10<ou40> {

    /* JADX INFO: renamed from: m */
    public boolean f121736m;

    /* JADX INFO: renamed from: n */
    public boolean f121737n;

    /* JADX INFO: renamed from: o */
    public boolean f121738o;

    public jn10(dum<ou40> dumVar, dj10 dj10Var) {
        super(dumVar, dj10Var);
        this.f121737n = true;
        this.f121738o = false;
        this.f173297l = (en10) m153103z2(new eo10(dumVar, dj10Var.f88771b, this));
        m153103z2(new hcs(dumVar));
        m153103z2(new jo10(dumVar, dj10Var.f88770a, this));
        m153103z2(new nv2(dumVar));
        m153103z2(new cq10(dumVar));
        m153103z2(new dc10(dumVar));
    }

    /* JADX INFO: renamed from: B4 */
    public final void m146209B4(List<BLiveMultiCall> list) {
        m190605w4(list);
        if (!this.f121738o) {
            this.f121738o = true;
            m213811F2().MultiCallEvent.hasGetMultiCallList().mo199274m(Boolean.TRUE);
        }
        if (jyb.m147479J(list)) {
            return;
        }
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
        m213811F2().MultiCallEvent.showAudienceApplyIcon().mo199274m(Boolean.TRUE);
        BLiveMultiCall bLiveMultiCall = list.get(0);
        m190584b4().m153846n(bLiveMultiCall.ownerMultiCallOrder);
        m146212E4();
        duringCreated(LivingNormalApiProvider.m72358A4(bLiveMultiCall.ownerUserId, bLiveMultiCall.f45248id)).subscribe(dhw.m115829h(new y20() { // from class: l.in10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115858a.m146210C4((BLiveMultiCallAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m146210C4(BLiveMultiCallAsset bLiveMultiCallAsset) {
        m190584b4().f131691b = bLiveMultiCallAsset.freeCall;
        m213811F2().MultiCallEvent.refreshCallView().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m146211D4(Boolean bool) {
        m146213F4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m146212E4() {
        BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(this, ((ou40) m213810E2()).m168532l0().f56859id);
        ve10.m201029i(this, NullChecker.m82486a(bLiveMultiCallM103799E) ? ve10.m201027g(bLiveMultiCallM103799E) : "live");
    }

    /* JADX INFO: renamed from: F4 */
    public void m146213F4() {
        uwl uwlVar = this.f173297l;
        if (uwlVar instanceof eo10) {
            ((eo10) uwlVar).m121713L4();
        }
    }

    @Override // p153l.td10, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.td10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72368B5(((ou40) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.gn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105054a.m146209B4((List) obj);
            }
        }, new r5k()));
        m138863h3(m213811F2().MultiCallEvent.switchToVideo(), new y20() { // from class: l.hn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110689a.m146211D4((Boolean) obj);
            }
        });
    }
}
