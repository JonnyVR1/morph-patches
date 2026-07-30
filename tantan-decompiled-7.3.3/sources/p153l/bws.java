package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class bws extends dvs<kxs> {

    /* JADX INFO: renamed from: f */
    public String f78775f;

    /* JADX INFO: renamed from: g */
    public List<LiveSquareTabBean> f78776g;

    /* JADX INFO: renamed from: h */
    public long f78777h;

    /* JADX INFO: renamed from: i */
    public int f78778i;

    /* JADX INFO: renamed from: j */
    public int f78779j;

    /* JADX INFO: renamed from: k */
    public fk3.C16996b f78780k;

    public bws(ner nerVar, nus nusVar, ViewPager viewPager, TabLayout tabLayout, View view) {
        super(nerVar, nusVar);
        this.f78775f = "";
        this.f78778i = -1;
        this.f78779j = -1;
        kxs kxsVar = new kxs(viewPager, tabLayout, view);
        this.viewModel = kxsVar;
        mo52715C(kxsVar);
    }

    /* JADX INFO: renamed from: H3 */
    private List<LiveSquareTabBean> m106758H3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            LiveSquareTabBean liveSquareTabBean2 = map.get(liveSquareTabBean.getTabId());
            if (liveSquareTabBean2 != null) {
                liveSquareTabBean.setDisplay(liveSquareTabBean2.isDisplay());
            }
        }
        return jyb.m147522n(baseLiveListBean.getList(), new uws());
    }

    /* JADX INFO: renamed from: K3 */
    private void m106759K3(boolean z) {
        m106760L3(z, null);
    }

    /* JADX INFO: renamed from: L3 */
    private void m106760L3(boolean z, final Bundle bundle) {
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        if (z || System.currentTimeMillis() - this.f78777h > Constants.ONE_MIN_IN_MILLIS) {
            this.f78777h = System.currentTimeMillis();
            duringCreated(LiveSquareApi.requestTab()).map(new qcj() { // from class: l.mvs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f138944a.m106791D3((BaseLiveListBean) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.nvs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143855a.m106792E3(bundle, (BaseLiveListBean) obj);
                }
            }, new y20() { // from class: l.ovs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149305a.m106793F3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M3 */
    private void m106761M3(List<LiveSquareTabBean> list) {
        if (!jyb.m147479J(list)) {
            this.f78778i = jyb.m147476G(list, new qcj() { // from class: l.ivs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LiveSquareTabBean) obj).requestName.equals("square-curated"));
                }
            });
            this.f78779j = jyb.m147476G(list, new qcj() { // from class: l.jvs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    LiveSquareTabBean liveSquareTabBean = (LiveSquareTabBean) obj;
                    return Boolean.valueOf(liveSquareTabBean.requestName.equals("fakeLiveSquare") && liveSquareTabBean.isDisplay());
                }
            });
        }
        ((kxs) this.viewModel).m151880E(list);
        m160238F2().LiveHomePageEvent.onRenderTabSelectPageId().mo199273j(m106797o3());
    }

    /* JADX INFO: renamed from: N3 */
    private void m106762N3() {
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setTabId("-100");
        liveSquareTabBean.setName(tbs.f172988a.getString(R$string.f45742c0));
        liveSquareTabBean.setRequestName("square-teen-mode");
        liveSquareTabBean.setDisplay(true);
        m106761M3(jyb.m147507f0(liveSquareTabBean));
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m106765R2(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    private boolean m106784k3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            if (!map.containsKey(liveSquareTabBean.getTabId()) && liveSquareTabBean.isDisplay()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m3 */
    private void m106785m3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean) {
        boolean z;
        HashMap<String, LiveSquareTabBean> map = new HashMap<>();
        boolean z2 = true;
        if (this.f78776g != null) {
            z = false;
            for (int i = 0; i < this.f78776g.size(); i++) {
                LiveSquareTabBean liveSquareTabBean = this.f78776g.get(i);
                map.put(liveSquareTabBean.getTabId(), liveSquareTabBean);
                if (y6u.m214515s(liveSquareTabBean.getRequestName())) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean zM147520m = jyb.m147520m(baseLiveListBean.getList(), new qcj() { // from class: l.pvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(y6u.m214515s(((LiveSquareTabBean) obj).getRequestName()));
            }
        });
        boolean zM147520m2 = jyb.m147520m(baseLiveListBean.getList(), new qcj() { // from class: l.rvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LiveSquareTabBean liveSquareTabBean2 = (LiveSquareTabBean) obj;
                return Boolean.valueOf(y6u.m214515s(liveSquareTabBean2.getRequestName()) && !liveSquareTabBean2.isDisplay());
            }
        });
        if (zM147520m && !zM147520m2) {
            z2 = false;
        }
        if (z && z2) {
            map.clear();
        } else if (m106784k3(baseLiveListBean, map)) {
            return;
        }
        List<LiveSquareTabBean> listM106758H3 = m106758H3(baseLiveListBean, map);
        this.f78776g = listM106758H3;
        m106761M3(listM106758H3);
    }

    /* JADX INFO: renamed from: n3 */
    private BaseLiveListBean<LiveSquareTabBean> m106786n3() {
        BaseLiveListBean<LiveSquareTabBean> baseLiveListBean = new BaseLiveListBean<>();
        ArrayList arrayList = new ArrayList();
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setName("推荐");
        liveSquareTabBean.setDefault(true);
        liveSquareTabBean.setTabId("2");
        liveSquareTabBean.setRequestName("square-suggested");
        liveSquareTabBean.setPageId("p_live_recommend");
        liveSquareTabBean.setDisplay(true);
        arrayList.add(liveSquareTabBean);
        LiveSquareTabBean liveSquareTabBean2 = new LiveSquareTabBean();
        liveSquareTabBean2.setName("附近");
        liveSquareTabBean2.setDefault(false);
        liveSquareTabBean2.setTabId("1");
        liveSquareTabBean2.setRequestName("square-nearby");
        liveSquareTabBean2.setPageId("p_live_nearby");
        liveSquareTabBean2.setDisplay(true);
        arrayList.add(liveSquareTabBean2);
        baseLiveListBean.setList(arrayList);
        return baseLiveListBean;
    }

    /* JADX INFO: renamed from: p3 */
    private void m106787p3(Bundle bundle) {
        fk3.C16996b c16996b = this.f78780k;
        if (c16996b != null) {
            ((kxs) this.viewModel).m151884K(this.f78776g, c16996b.f99480a);
            this.f78780k = null;
        } else {
            if (bundle == null) {
                return;
            }
            String string = bundle.getString("default_tab_id", null);
            String string2 = bundle.getString("action");
            String string3 = bundle.getString("userId");
            ((kxs) this.viewModel).m151884K(this.f78776g, string);
            if (jyb.m147520m(this.f78776g, new qcj() { // from class: l.svs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(y6u.m214515s(((LiveSquareTabBean) obj).getRequestName()));
                }
            }) && TextUtils.equals(string2, "openVideoChatProfile") && !TextUtils.isEmpty(string3)) {
                mbs.m157866m0(getAct(), string3, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public /* synthetic */ void m106788r3(Boolean bool) {
        if (bool.booleanValue()) {
            m106762N3();
            return;
        }
        this.f78777h = 0L;
        this.f78776g = null;
        m106759K3(true);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m106789B3(t4u.C20236a c20236a) {
        fk3.C16996b c16996b = this.f78780k;
        if (c16996b != null) {
            ((kxs) this.viewModel).m151884K(this.f78776g, c16996b.f99480a);
            this.f78780k = null;
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m106790C3(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        m160238F2().LiveHomeSummaryEvent.summary().mo199273j(liveSquareSummaryInfo);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ BaseLiveListBean m106791D3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean == null ? m106786n3() : baseLiveListBean;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m106792E3(Bundle bundle, BaseLiveListBean baseLiveListBean) {
        m106785m3(baseLiveListBean);
        m106787p3(bundle);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m106793F3(Throwable th) {
        try {
            m106785m3(m106786n3());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public void m106794G3() {
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        duringCreated(LiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(dhw.m115826e(new y20() { // from class: l.kvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128994a.m106790C3((LiveSquareSummaryInfo) obj);
            }
        }, new y20() { // from class: l.lvs
            @Override // p153l.y20
            public final void call(Object obj) {
                bws.m106765R2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public void m106795I3(int i) {
        if (this.viewModel == 0) {
            return;
        }
        if (mbs.m157815A(getAct())) {
            tbs.f172993f.m143714p(false);
        }
        this.f78775f = ((kxs) this.viewModel).m151891v(i);
        if (ppi0.m173207l().m173228x()) {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j("tab_teen");
        } else {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j(this.f78775f);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m106796J3(Bundle bundle) {
        if (bundle == null || n4u.m161598j(bundle, getAct())) {
            return;
        }
        n4u.m161595g(bundle, bundle.getInt("from", 0), getAct());
        m106760L3(true, bundle);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((kxs) this.viewModel).m151888r();
        m106796J3(m160239H2().f143738b.getArguments());
        duringCreated(ppi0.m173207l().m173229y()).subscribe(dhw.m115825d(new y20() { // from class: l.fvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101086a.m106788r3((Boolean) obj);
            }
        }));
        m160237E2(evs.class, new qcj() { // from class: l.uvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181166a.m106799s3((evs) obj);
            }
        });
        m160237E2(sys.class, new qcj() { // from class: l.vvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185984a.m106801u3((sys) obj);
            }
        });
        m160237E2(jcs.class, new qcj() { // from class: l.wvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190987a.m106802v3((jcs) obj);
            }
        });
        itd0<fk3> itd0Var = itd0.f116820b;
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125934A()).subscribe(dhw.m115825d(new y20() { // from class: l.xvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196427a.m106803w3((uxj0) obj);
            }
        }));
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125968s()).filter(new qcj() { // from class: l.yvs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((lc3) obj) != null);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.zvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206282a.m106804x3((lc3) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).skip(1).subscribe(dhw.m115825d(new y20() { // from class: l.aws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73789a.m106805y3((String) obj);
            }
        }));
        m106759K3(true);
        m106794G3();
        if (!((fm3) tbs.m190077m(itd0.f116823e)).m126175c()) {
            ((kxs) this.viewModel).m151877y(true);
        }
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125974y()).subscribe(dhw.m115825d(new y20() { // from class: l.gvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106679a.m106806z3((fk3.C16996b) obj);
            }
        }));
        duringCreated(t4u.m189321j()).subscribe(dhw.m115825d(new y20() { // from class: l.hvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111807a.m106789B3((t4u.C20236a) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159804a.m106800t3((Boolean) obj);
            }
        }));
        tbs.f172993f.m143714p(false);
        m113231o2(m160238F2().LiveHomePageEvent.processBundle().m199270g(), false).subscribe(dhw.m115829h(new y20() { // from class: l.tvs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176292a.m106796J3((Bundle) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o3 */
    public String m106797o3() {
        LiveSquareBaseFrag liveSquareBaseFragM151889s = ((kxs) this.viewModel).m151889s();
        return liveSquareBaseFragM151889s == null ? "p_live_recommend" : liveSquareBaseFragM151889s.pageId();
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m106798q3(int i) {
        Frag fragM151890u = ((kxs) this.viewModel).m151890u(i);
        if (fragM151890u instanceof LiveSquareBaseFrag) {
            return ((LiveSquareBaseFrag) fragM151890u).mo70235d5();
        }
        return false;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ String m106799s3(evs evsVar) {
        return m106797o3();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m106800t3(Boolean bool) {
        ((kxs) this.viewModel).m151883J(bool);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ String m106801u3(sys sysVar) {
        return this.f78775f;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m106802v3(jcs jcsVar) {
        return Boolean.valueOf(this.f78779j >= 0);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m106803w3(uxj0 uxj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((kxs) v2).f129234c == null || ((kxs) v2).f129234c.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((kxs) v3).m151879A(((kxs) v3).m151891v(((kxs) v3).f129234c.getSelectedTabPosition()), true);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m106804x3(lc3 lc3Var) {
        ((kxs) this.viewModel).m151876x(lc3Var.f131269c);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m106805y3(String str) {
        if ("square-curated".equals(str)) {
            ((fm3) tbs.m190077m(itd0.f116823e)).m126180h(true);
            ((kxs) this.viewModel).m151877y(false);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m106806z3(fk3.C16996b c16996b) {
        this.f78780k = c16996b;
    }
}
