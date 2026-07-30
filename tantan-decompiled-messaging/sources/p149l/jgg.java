package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class jgg extends x6s<ho2, egg> {

    /* JADX INFO: renamed from: j */
    public String f117775j;

    public jgg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new egg(bsmVar.f77095a, this));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((egg) this.viewModel).m116279J();
        this.f117775j = "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public void m141286V3(String str) {
        xgg.m208673a(m206027E2().m132146l0().f56011id, m206027E2().m149814k());
        duringCreated(LivingNormalApiProvider.m71526n4(ypv.f199493a.m199309D0(), this.f117775j, str)).subscribe(ffw.m121194e(new e30() { // from class: l.hgg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107598a.m141287W3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.igg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113111a.m141288X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m141287W3(BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f47601w4);
        ((ggv) ypv.m215673l(fld0.f98148c)).m126010D(0);
        m206028F2().FansRecallEvent.hideFansRecallSelectPanel().mo172463j(Boolean.TRUE);
        ((egg) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m141288X3(Throwable th) {
        ((egg) this.viewModel).mo71838p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m141289Y3(wgg wggVar) {
        xgg.m208674b(m206027E2().m132146l0().f56011id, m206027E2().m149814k());
        this.f117775j = wggVar.m203053a();
        ((egg) this.viewModel).m116280K(wggVar.m203054b());
        ((egg) this.viewModel).m71834E();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansRecallEvent.showEditDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ggg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102496a.m141289Y3((wgg) obj);
            }
        }));
    }
}
