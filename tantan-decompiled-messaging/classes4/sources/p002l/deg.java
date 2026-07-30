package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.s7m;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class deg extends x6s<ho2, qdg> {

    /* JADX INFO: renamed from: j */
    public boolean f9185j;

    /* JADX INFO: renamed from: k */
    public boolean f9186k;

    public deg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new qdg(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m11775X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.C(R$string.f3203c3);
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m11779b4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.C(R$string.f3203c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m11781p4(Boolean bool) {
        this.f9186k = bool.booleanValue();
        ((qdg) ((bwr) this).viewModel).m5211E();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        if (this.f9186k) {
            m11795r4();
        } else {
            m11796s4();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m11782d4(final int i, String str, String str2, final boolean z) {
        duringCreated(LivingNormalApiProvider.m4540A3(str, str2, z)).subscribe(ffw.e(new e30() { // from class: l.wdg
            public final void call(Object obj) {
                this.f21659a.m11786h4(z, i, (BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.xdg
            public final void call(Object obj) {
                deg.m11779b4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m11783e4() {
        duringCreated(LivingNormalApiProvider.m4811e4(((DbObject) m25547E2().m14582l0()).id)).subscribe(ffw.e(new e30() { // from class: l.ydg
            public final void call(Object obj) {
                this.f22811a.m11787i4((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.zdg
            public final void call(Object obj) {
                deg.m11775X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    public void m11784f4() {
        m25707N3(LivingNormalApiProvider.m4577E4(((DbObject) m25547E2().m14582l0()).id)).subscribe(ffw.e(new e30() { // from class: l.ceg
            public final void call(Object obj) {
                this.f8616a.m11788j4((FanbaseGroupCountBean) obj);
            }
        }, new e30() { // from class: l.tdg
            public final void call(Object obj) {
                this.f20191a.m11789k4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m11785g4() {
        return this.f9185j;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m11786h4(boolean z, int i, BaseLiveBean baseLiveBean) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (z) {
            ((qdg) s7mVar).m21233Q(i, "approved");
            lsi0.w(R$string.f3400l3);
        } else {
            ((qdg) s7mVar).m21233Q(i, "rejected");
            lsi0.w(R$string.f3620v3);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m11787i4(BaseLiveBean baseLiveBean) {
        lsi0.w(R$string.f3510q3);
        m11795r4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m11788j4(FanbaseGroupCountBean fanbaseGroupCountBean) {
        ((qdg) ((bwr) this).viewModel).m21232P(fanbaseGroupCountBean.getCount() >= 100 ? "99+" : String.valueOf(fanbaseGroupCountBean.getCount()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m11789k4(Throwable th) {
        ((qdg) ((bwr) this).viewModel).m21232P("0");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m11790l4(String str, BaseLiveListBean baseLiveListBean) {
        this.f9185j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        s7m s7mVar = ((bwr) this).viewModel;
        if (zIsEmpty) {
            ((qdg) s7mVar).m21231O(baseLiveListBean);
        } else {
            ((qdg) s7mVar).m21228L(baseLiveListBean);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m11791m4(String str, Throwable th) {
        this.f9185j = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        s7m s7mVar = ((bwr) this).viewModel;
        if (zIsEmpty) {
            ((qdg) s7mVar).m21231O(null);
        } else {
            ((qdg) s7mVar).m21229M();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m11792n4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((qdg) ((bwr) this).viewModel).m21230N(m25547E2().mo9893p(), fanbaseGroupsBean);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m11793o4(Throwable th) {
        ((qdg) ((bwr) this).viewModel).m21230N(m25547E2().mo9893p(), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public void m11794q4(final String str) {
        this.f9185j = true;
        duringCreated(LivingNormalApiProvider.m4542A5(((DbObject) m25547E2().m14582l0()).id, str)).subscribe(ffw.e(new e30() { // from class: l.sdg
            public final void call(Object obj) {
                this.f18935a.m11790l4(str, (BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.udg
            public final void call(Object obj) {
                this.f20596a.m11791m4(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public void m11795r4() {
        m25707N3(LivingNormalApiProvider.m4676P4(((DbObject) m25547E2().m14582l0()).id)).subscribe(ffw.e(new e30() { // from class: l.aeg
            public final void call(Object obj) {
                this.f7522a.m11792n4((FanbaseGroupsBean) obj);
            }
        }, new e30() { // from class: l.beg
            public final void call(Object obj) {
                this.f8095a.m11793o4((Throwable) obj);
            }
        }));
        m11784f4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m11796s4() {
        m11794q4("");
    }

    /* JADX INFO: renamed from: t */
    public void m11797t() {
        super.t();
        duringCreated((c) m25548F2().FansGroupEvent.showFansGroupPanel().g()).subscribe(ffw.d(new e30() { // from class: l.vdg
            public final void call(Object obj) {
                this.f21092a.m11781p4((Boolean) obj);
            }
        }));
    }
}
