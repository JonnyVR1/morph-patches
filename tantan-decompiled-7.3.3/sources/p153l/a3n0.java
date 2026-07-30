package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveUserRightResource;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class a3n0 extends ixm0<jqm0> {

    /* JADX INFO: renamed from: l */
    public long f68300l;

    public a3n0(dum dumVar, sam samVar) {
        super(dumVar, samVar);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ List m95829M4(List list, hrk0.C17564a c17564a) {
        return list;
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m95830N4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            r35.m179578c(th);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m95831O4(BLiveVoiceCall bLiveVoiceCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public void m95833S4(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        V v2 = this.viewModel;
        if (iM146875a == 4) {
            ((sam) v2).setVisible(false);
        } else {
            ((sam) v2).setVisible(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ixm0
    /* JADX INFO: renamed from: A4 */
    public void mo95834A4(Integer num) {
        if (!m95835Q4()) {
            o1j0.m165651y(xau.m209910t(R$string.f48486xj));
            return;
        }
        this.f68300l = pzi0.m174454o();
        v1n0.m199026d();
        BLiveVoiceCall bLiveVoiceCallM136873l = ((jqm0) m213810E2()).m183411P2().m136873l(zrv.f205799a.m207631D0());
        if (bLiveVoiceCallM136873l != null) {
            m95836R4(bLiveVoiceCallM136873l.f45333id, num.intValue());
            return;
        }
        bzm0 bzm0Var = new bzm0();
        bzm0Var.m107186g(num.intValue());
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(bzm0Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m95835Q4() {
        return pzi0.m174454o() - this.f68300l >= 500;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m95836R4(String str, int i) {
        duringCreated(VCallApiProvider.requestChangeCallPosition(str, i)).subscribe(dhw.m115826e(new y20() { // from class: l.y2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                a3n0.m95831O4((BLiveVoiceCall) obj);
            }
        }, new y20() { // from class: l.z2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                a3n0.m95830N4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m95837T4(BLiveUserRightResource bLiveUserRightResource) {
        m142565D4(bLiveUserRightResource.userId, bLiveUserRightResource.avatarConfig.connectorImage);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m95838U4(List<BLiveUserRightResource> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.x2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192162a.m95837T4((BLiveUserRightResource) obj);
            }
        });
    }

    @Override // p153l.ixm0
    /* JADX INFO: renamed from: m4 */
    public void mo95839m4(hrk0.C17564a c17564a) {
        super.mo95839m4(c17564a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ixm0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.t2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171775a.m95833S4((jsv) obj);
            }
        }));
        duringCreated(C22421c.zip(VCallApiProvider.getEnterRoomEffect(((jqm0) m213810E2()).m202194o(), ((jqm0) m213810E2()).m202191k()), ((jqm0) m213810E2()).m183413Q2().filter(new qcj() { // from class: l.u2n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hrk0.C17564a) obj).f111360b == 1);
            }
        }), new rcj() { // from class: l.v2n0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return a3n0.m95829M4((List) obj, (hrk0.C17564a) obj2);
            }
        })).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.w2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186918a.m95838U4((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ixm0
    /* JADX INFO: renamed from: z4 */
    public void mo95840z4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        String str = ((jqm0) m213810E2()).m168532l0().f56859id;
        h64 h64Var = nsvVar.f143542a;
        if (NullChecker.m82486a(h64Var)) {
            ydn0.m215258k(this, str, h64Var.f107997a);
        }
    }
}
