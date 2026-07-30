package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class n26 extends h4t<ho2, a26> {
    public n26(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new a26());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m157550L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    private void m157554P3() {
        ((a26) this.viewModel).m94596d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public final void m157555R3(String str, String str2, int i, int i2, String str3) {
        duringCreated(LivingNormalApiProvider.m71608w5(str, str2, i, i2, m206027E2().mo132103W0(), str3)).map(new w9j() { // from class: l.i26
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110536a.m157556S3((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.j26
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115882a.m157557T3((y16) obj);
            }
        }, new e30() { // from class: l.k26
            @Override // p149l.e30
            public final void call(Object obj) {
                n26.m157550L3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ y16 m157556S3(BLiveEnvelope bLiveEnvelope) {
        return new y16.C21277a().m212139d(bLiveEnvelope).m212140e(m206027E2().mo132103W0()).m212138c();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ d1q m157558U3(mqv mqvVar) {
        return new e26(mqvVar).m114495P(new e30() { // from class: l.m26
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130887a.m157561X3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m157559V3(k980 k980Var) {
        m157563Z3(k980Var.f121919b, k980Var.f121918a, k980Var.f121921d);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m157560W3(Integer num) {
        m157554P3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public void m157561X3(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(m206027E2().mo132054A0())) {
            u4n0.m191752k(this, m206027E2().m132146l0().f56011id, str);
        } else {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(4402).userId(str).setSource("contribution").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 4402)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 4402)).setScene("call").build());
        }
    }

    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public final void m157557T3(y16 y16Var) {
        ((a26) this.viewModel).m94597f(vwb.m200303Q(y16Var.m212134e(), new w9j() { // from class: l.l26
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125746a.m157558U3((mqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m157563Z3(String str, String str2, String str3) {
        m157555R3(str, str2, 0, 20, str3);
        ((a26) this.viewModel).m94598i();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().PlugPubEvent.openContributeDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.g26
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100235a.m157559V3((k980) obj);
            }
        }));
        duringCreated(m206028F2().PlugPubEvent.dismissContributeDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.h26
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105492a.m157560W3((Integer) obj);
            }
        }));
    }
}
