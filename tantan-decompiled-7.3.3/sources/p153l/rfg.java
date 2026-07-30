package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class rfg extends y8s<oo2, efg> {

    /* JADX INFO: renamed from: j */
    public boolean f162781j;

    /* JADX INFO: renamed from: k */
    public boolean f162782k;

    public rfg(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new efg(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m181185X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m181189b4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f48009c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m181191p4(Boolean bool) {
        this.f162782k = bool.booleanValue();
        ((efg) this.viewModel).m73017E();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        if (this.f162782k) {
            m181205r4();
        } else {
            m181206s4();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m181192d4(final int i, String str, String str2, final boolean z) {
        duringCreated(LivingNormalApiProvider.m72357A3(str, str2, z)).subscribe(dhw.m115826e(new y20() { // from class: l.kfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126390a.m181196h4(z, i, (BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.lfg
            @Override // p153l.y20
            public final void call(Object obj) {
                rfg.m181189b4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: e4 */
    public void m181193e4() {
        duringCreated(LivingNormalApiProvider.m72628e4(m213810E2().m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.mfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136646a.m181197i4((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.nfg
            @Override // p153l.y20
            public final void call(Object obj) {
                rfg.m181185X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: f4 */
    public void m181194f4() {
        m214779N3(LivingNormalApiProvider.m72394E4(m213810E2().m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.qfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157300a.m181198j4((FanbaseGroupCountBean) obj);
            }
        }, new y20() { // from class: l.hfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109283a.m181199k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m181195g4() {
        return this.f162781j;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m181196h4(boolean z, int i, BaseLiveBean baseLiveBean) {
        V v2 = this.viewModel;
        if (z) {
            ((efg) v2).m120682Q(i, "approved");
            o1j0.m165649w(R$string.f48206l3);
        } else {
            ((efg) v2).m120682Q(i, "rejected");
            o1j0.m165649w(R$string.f48426v3);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m181197i4(BaseLiveBean baseLiveBean) {
        o1j0.m165649w(R$string.f48316q3);
        m181205r4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m181198j4(FanbaseGroupCountBean fanbaseGroupCountBean) {
        ((efg) this.viewModel).m120681P(fanbaseGroupCountBean.getCount() >= 100 ? "99+" : String.valueOf(fanbaseGroupCountBean.getCount()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m181199k4(Throwable th) {
        ((efg) this.viewModel).m120681P("0");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m181200l4(String str, BaseLiveListBean baseLiveListBean) {
        this.f162781j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((efg) v2).m120680O(baseLiveListBean);
        } else {
            ((efg) v2).m120677L(baseLiveListBean);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m181201m4(String str, Throwable th) {
        this.f162781j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((efg) v2).m120680O(null);
        } else {
            ((efg) v2).m120678M();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m181202n4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((efg) this.viewModel).m120679N(m213810E2().mo118373p(), fanbaseGroupsBean);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m181203o4(Throwable th) {
        ((efg) this.viewModel).m120679N(m213810E2().mo118373p(), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: q4 */
    public void m181204q4(final String str) {
        this.f162781j = true;
        duringCreated(LivingNormalApiProvider.m72359A5(m213810E2().m168532l0().f56859id, str)).subscribe(dhw.m115826e(new y20() { // from class: l.gfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103903a.m181200l4(str, (BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.ifg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114660a.m181201m4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public void m181205r4() {
        m214779N3(LivingNormalApiProvider.m72493P4(m213810E2().m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.ofg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147072a.m181202n4((FanbaseGroupsBean) obj);
            }
        }, new y20() { // from class: l.pfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152173a.m181203o4((Throwable) obj);
            }
        }));
        m181194f4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m181206s4() {
        m181204q4("");
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansGroupEvent.showFansGroupPanel().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jfg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120586a.m181191p4((Boolean) obj);
            }
        }));
    }
}
