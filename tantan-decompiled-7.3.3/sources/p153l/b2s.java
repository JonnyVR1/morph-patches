package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class b2s extends y8s<oo2, v1s> {

    /* JADX INFO: renamed from: j */
    public hx50 f74668j;

    public b2s(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new v1s(act(), this));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f74668j = null;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m102243W3(uxj0 uxj0Var) {
        ((v1s) this.viewModel).m199081Y(false);
        ((v1s) this.viewModel).mo73021p();
        r1j0.m179420g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m102244X3(Throwable th) {
        ((v1s) this.viewModel).mo73021p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m102245Y3(hx50 hx50Var, BLiveSuperChatDetail bLiveSuperChatDetail) {
        this.f74668j = hx50Var;
        ((v1s) this.viewModel).m199082Z(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Z3 */
    public void m102246Z3(String str) {
        duringCreated(geu.m130029b(false, m213810E2().m168526j0(), this.f74668j.getGiftId(), eb20.m120148a(), str, m213810E2().m202194o(), m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.y1s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197129a.m102243W3((uxj0) obj);
            }
        }, new y20() { // from class: l.z1s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202590a.m102244X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a4 */
    public final void m102247a4(final hx50 hx50Var) {
        duringCreated(LivingNormalApiProvider.m72603b6(false, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.a2s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68024a.m102245Y3(hx50Var, (BLiveSuperChatDetail) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallCardEventGroup.openCallCardDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.x1s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192091a.m102247a4((hx50) obj);
            }
        }));
    }
}
