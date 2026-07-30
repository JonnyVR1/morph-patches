package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class deg extends x6s<ho2, qdg> {

    /* JADX INFO: renamed from: j */
    public boolean f85791j;

    /* JADX INFO: renamed from: k */
    public boolean f85792k;

    public deg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new qdg(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m111235X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m111239b4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f47161c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m111241p4(Boolean bool) {
        this.f85792k = bool.booleanValue();
        ((qdg) this.viewModel).m71834E();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        if (this.f85792k) {
            m111255r4();
        } else {
            m111256s4();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m111242d4(final int i, String str, String str2, final boolean z) {
        duringCreated(LivingNormalApiProvider.m71174A3(str, str2, z)).subscribe(ffw.m121194e(new e30() { // from class: l.wdg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185798a.m111246h4(z, i, (BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.xdg
            @Override // p149l.e30
            public final void call(Object obj) {
                deg.m111239b4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m111243e4() {
        duringCreated(LivingNormalApiProvider.m71445e4(m206027E2().m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.ydg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197561a.m111247i4((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.zdg
            @Override // p149l.e30
            public final void call(Object obj) {
                deg.m111235X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    public void m111244f4() {
        m207199N3(LivingNormalApiProvider.m71211E4(m206027E2().m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.ceg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80459a.m111248j4((FanbaseGroupCountBean) obj);
            }
        }, new e30() { // from class: l.tdg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169549a.m111249k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m111245g4() {
        return this.f85791j;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m111246h4(boolean z, int i, BaseLiveBean baseLiveBean) {
        V v2 = this.viewModel;
        if (z) {
            ((qdg) v2).m174042Q(i, "approved");
            lsi0.m151593w(R$string.f47358l3);
        } else {
            ((qdg) v2).m174042Q(i, "rejected");
            lsi0.m151593w(R$string.f47578v3);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m111247i4(BaseLiveBean baseLiveBean) {
        lsi0.m151593w(R$string.f47468q3);
        m111255r4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m111248j4(FanbaseGroupCountBean fanbaseGroupCountBean) {
        ((qdg) this.viewModel).m174041P(fanbaseGroupCountBean.getCount() >= 100 ? "99+" : String.valueOf(fanbaseGroupCountBean.getCount()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m111249k4(Throwable th) {
        ((qdg) this.viewModel).m174041P("0");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m111250l4(String str, BaseLiveListBean baseLiveListBean) {
        this.f85791j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((qdg) v2).m174040O(baseLiveListBean);
        } else {
            ((qdg) v2).m174037L(baseLiveListBean);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m111251m4(String str, Throwable th) {
        this.f85791j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((qdg) v2).m174040O(null);
        } else {
            ((qdg) v2).m174038M();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m111252n4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((qdg) this.viewModel).m174039N(m206027E2().mo97490p(), fanbaseGroupsBean);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m111253o4(Throwable th) {
        ((qdg) this.viewModel).m174039N(m206027E2().mo97490p(), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public void m111254q4(final String str) {
        this.f85791j = true;
        duringCreated(LivingNormalApiProvider.m71176A5(m206027E2().m132146l0().f56011id, str)).subscribe(ffw.m121194e(new e30() { // from class: l.sdg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163839a.m111250l4(str, (BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.udg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175917a.m111251m4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public void m111255r4() {
        m207199N3(LivingNormalApiProvider.m71310P4(m206027E2().m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.aeg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69039a.m111252n4((FanbaseGroupsBean) obj);
            }
        }, new e30() { // from class: l.beg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75156a.m111253o4((Throwable) obj);
            }
        }));
        m111244f4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m111256s4() {
        m111254q4("");
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansGroupEvent.showFansGroupPanel().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vdg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181084a.m111241p4((Boolean) obj);
            }
        }));
    }
}
