package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.lsi0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jgg extends x6s<ho2, egg> {

    /* JADX INFO: renamed from: j */
    public String f13766j;

    public jgg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new egg(bsmVar.f8332a, this));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((egg) ((bwr) this).viewModel).m12515J();
        this.f13766j = "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public void m15905V3(String str) {
        xgg.m25926a(((DbObject) m25547E2().m14582l0()).id, m25547E2().m17235k());
        duringCreated(LivingNormalApiProvider.m4892n4(ypv.a.D0(), this.f13766j, str)).subscribe(ffw.e(new e30() { // from class: l.hgg
            public final void call(Object obj) {
                this.f12025a.m15906W3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.igg
            public final void call(Object obj) {
                this.f13232a.m15907X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m15906W3(BLiveEnvelope bLiveEnvelope) {
        lsi0.w(R$string.f3643w4);
        ((ggv) ypv.l(fld0.c)).D(0);
        m25548F2().FansRecallEvent.hideFansRecallSelectPanel().j(Boolean.TRUE);
        ((egg) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m15907X3(Throwable th) {
        ((egg) ((bwr) this).viewModel).mo5216p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.w(R$string.f3203c3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m15908Y3(wgg wggVar) {
        xgg.m25927b(((DbObject) m25547E2().m14582l0()).id, m25547E2().m17235k());
        this.f13766j = wggVar.m24595a();
        ((egg) ((bwr) this).viewModel).m12516K(wggVar.m24596b());
        ((egg) ((bwr) this).viewModel).m5211E();
    }

    /* JADX INFO: renamed from: t */
    public void m15909t() {
        super.t();
        duringCreated((c) m25548F2().FansRecallEvent.showEditDialog().g()).subscribe(ffw.d(new e30() { // from class: l.ggg
            public final void call(Object obj) {
                this.f11405a.m15908Y3((wgg) obj);
            }
        }));
    }
}
