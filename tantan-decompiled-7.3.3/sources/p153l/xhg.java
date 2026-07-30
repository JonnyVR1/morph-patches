package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class xhg extends y8s<oo2, shg> {

    /* JADX INFO: renamed from: j */
    public String f194363j;

    public xhg(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new shg(dumVar.f90815a, this));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((shg) this.viewModel).m185866J();
        this.f194363j = "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: V3 */
    public void m211039V3(String str) {
        lig.m154371a(m213810E2().m168532l0().f56859id, m213810E2().m202191k());
        duringCreated(LivingNormalApiProvider.m72709n4(zrv.f205799a.m207631D0(), this.f194363j, str)).subscribe(dhw.m115826e(new y20() { // from class: l.vhg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184164a.m211040W3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.whg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189149a.m211041X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m211040W3(BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f48449w4);
        ((hiv) zrv.m221194l(htd0.f111521c)).m135144D(0);
        m213811F2().FansRecallEvent.hideFansRecallSelectPanel().mo199273j(Boolean.TRUE);
        ((shg) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m211041X3(Throwable th) {
        ((shg) this.viewModel).mo73021p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m211042Y3(kig kigVar) {
        lig.m154372b(m213810E2().m168532l0().f56859id, m213810E2().m202191k());
        this.f194363j = kigVar.m149870a();
        ((shg) this.viewModel).m185867K(kigVar.m149871b());
        ((shg) this.viewModel).m73017E();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansRecallEvent.showEditDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uhg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179026a.m211042Y3((kig) obj);
            }
        }));
    }
}
