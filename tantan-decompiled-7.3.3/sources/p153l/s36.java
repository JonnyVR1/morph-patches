package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class s36 extends i6t<oo2, f36> {
    public s36(dum dumVar) {
        super(dumVar);
        mo52715C(new f36());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m184214L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    private void m184218P3() {
        ((f36) this.viewModel).m123712d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public final void m184219R3(String str, String str2, int i, int i2, String str3) {
        duringCreated(LivingNormalApiProvider.m72791w5(str, str2, i, i2, m213810E2().mo168489W0(), str3)).map(new qcj() { // from class: l.n36
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139934a.m184220S3((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.o36
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144818a.m184221T3((d36) obj);
            }
        }, new y20() { // from class: l.p36
            @Override // p153l.y20
            public final void call(Object obj) {
                s36.m184214L3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ d36 m184220S3(BLiveEnvelope bLiveEnvelope) {
        return new d36.C16428a().m113795d(bLiveEnvelope).m113796e(m213810E2().mo168489W0()).m113794c();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ d3q m184222U3(nsv nsvVar) {
        return new j36(nsvVar).m143337P(new y20() { // from class: l.r36
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160997a.m184225X3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m184223V3(qh80 qh80Var) {
        m184227Z3(qh80Var.f157517b, qh80Var.f157516a, qh80Var.f157519d);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m184224W3(Integer num) {
        m184218P3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2] */
    /* JADX INFO: renamed from: X3 */
    public void m184225X3(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(m213810E2().mo118362A0())) {
            ydn0.m215258k(this, m213810E2().m168532l0().f56859id, str);
        } else {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(4402).userId(str).setSource("contribution").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 4402)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 4402)).setScene("call").build());
        }
    }

    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public final void m184221T3(d36 d36Var) {
        ((f36) this.viewModel).m123713f(jyb.m147486Q(d36Var.m113790e(), new qcj() { // from class: l.q36
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155424a.m184222U3((nsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m184227Z3(String str, String str2, String str3) {
        m184219R3(str, str2, 0, 20, str3);
        ((f36) this.viewModel).m123714i();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().PlugPubEvent.openContributeDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.l36
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129842a.m184223V3((qh80) obj);
            }
        }));
        duringCreated(m213811F2().PlugPubEvent.dismissContributeDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.m36
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134641a.m184224W3((Integer) obj);
            }
        }));
    }
}
