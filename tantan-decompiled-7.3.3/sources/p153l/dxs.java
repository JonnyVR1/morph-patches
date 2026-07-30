package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class dxs extends dvs<sxs> {

    /* JADX INFO: renamed from: f */
    public String f91104f;

    /* JADX INFO: renamed from: g */
    public List<LiveSquareTabBean> f91105g;

    /* JADX INFO: renamed from: h */
    public long f91106h;

    /* JADX INFO: renamed from: i */
    public int f91107i;

    /* JADX INFO: renamed from: j */
    public int f91108j;

    /* JADX INFO: renamed from: k */
    public fk3.C16996b f91109k;

    public dxs(ner nerVar, nus nusVar, ViewPager viewPager, TabLayout tabLayout, ToolBarSkinView toolBarSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        super(nerVar, nusVar);
        this.f91104f = "";
        this.f91107i = -1;
        this.f91108j = -1;
        sxs sxsVar = new sxs(viewPager, tabLayout, toolBarSkinView, vDraweeView, vDraweeView2);
        this.viewModel = sxsVar;
        mo52715C(sxsVar);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m118524b3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m118536y3(Boolean bool) {
        if (bool.booleanValue()) {
            m118558X3();
            return;
        }
        this.f91106h = 0L;
        this.f91105g = null;
        m118554T3(true);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m118537B3(Boolean bool) {
        ((sxs) this.viewModel).m188502F(bool);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ String m118538C3(evs evsVar) {
        return m118564s3();
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ String m118539D3(sys sysVar) {
        return this.f91104f;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m118540E3(jcs jcsVar) {
        return Boolean.valueOf(this.f91108j >= 0);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m118541F3(uxj0 uxj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((sxs) v2).f171176d == null || ((sxs) v2).f171176d.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((sxs) v3).m188498A(((sxs) v3).m188517v(((sxs) v3).f171176d.getSelectedTabPosition()), true);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m118542G3(lc3 lc3Var) {
        ((sxs) this.viewModel).m188518x(lc3Var.f131269c);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m118543H3(String str) {
        if ("square-curated".equals(str)) {
            ((fm3) tbs.m190077m(itd0.f116823e)).m126180h(true);
            ((sxs) this.viewModel).m188519y(false);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m118544I3(fk3.C16996b c16996b) {
        this.f91109k = c16996b;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m118545J3(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        m160238F2().LiveHomeSummaryEvent.summary().mo199273j(liveSquareSummaryInfo);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ BaseLiveListBean m118546K3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean == null ? m118562q3() : baseLiveListBean;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m118547L3(Bundle bundle, BaseLiveListBean baseLiveListBean) {
        m118561p3(baseLiveListBean);
        m118565t3(bundle);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m118548M3(Throwable th) {
        try {
            m118561p3(m118562q3());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m118549N3() {
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        duringCreated(LiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(dhw.m115826e(new y20() { // from class: l.pws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154437a.m118545J3((LiveSquareSummaryInfo) obj);
            }
        }, new y20() { // from class: l.qws
            @Override // p153l.y20
            public final void call(Object obj) {
                dxs.m118524b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O3 */
    public final List<LiveSquareTabBean> m118550O3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            LiveSquareTabBean liveSquareTabBean2 = map.get(liveSquareTabBean.getTabId());
            if (liveSquareTabBean2 != null) {
                liveSquareTabBean.setDisplay(liveSquareTabBean2.isDisplay());
            }
        }
        return jyb.m147522n(baseLiveListBean.getList(), new uws());
    }

    /* JADX INFO: renamed from: P3 */
    public final void m118551P3(Boolean bool) {
        if (uqb0.f180396b0.f170325b.mo31836w8(getAct())) {
            tbs.f172993f.m143714p(false);
        }
        if (bool.booleanValue()) {
            mbs.m157835U(false);
        } else {
            m118556V3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m118552R3(int i) {
        if (this.viewModel == 0) {
            return;
        }
        if (mbs.m157815A(getAct())) {
            tbs.f172993f.m143714p(false);
        }
        this.f91104f = ((sxs) this.viewModel).m188517v(i);
        if (ppi0.m173207l().m173228x()) {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j("tab_teen");
        } else {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j(this.f91104f);
        }
        m118556V3();
    }

    /* JADX INFO: renamed from: S3 */
    public void m118553S3(Bundle bundle) {
        if (bundle == null) {
            CrashHelper.m82479c(new NullPointerException("LiveSquareAct start intent lost data"));
        } else {
            if (n4u.m161598j(bundle, getAct())) {
                return;
            }
            n4u.m161595g(bundle, bundle.getInt("from", 0), getAct());
            m118555U3(true, bundle);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((sxs) this.viewModel).m188514r();
        m113231o2(mbs.m157878u(TabName.Live).filter(new cws()), false).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.axs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73887a.m118569x3((Bundle) obj);
            }
        }));
        duringCreated(mbs.m157879v()).subscribe(dhw.m115825d(new y20() { // from class: l.bxs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78906a.m118566u3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).subscribe(dhw.m115825d(new y20() { // from class: l.cxs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84270a.m118536y3((Boolean) obj);
            }
        }));
        m160237E2(evs.class, new qcj() { // from class: l.dws
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91041a.m118538C3((evs) obj);
            }
        });
        m160237E2(sys.class, new qcj() { // from class: l.ews
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96191a.m118539D3((sys) obj);
            }
        });
        m160237E2(jcs.class, new qcj() { // from class: l.fws
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101201a.m118540E3((jcs) obj);
            }
        });
        itd0<fk3> itd0Var = itd0.f116820b;
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125934A()).subscribe(dhw.m115825d(new y20() { // from class: l.gws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106866a.m118541F3((uxj0) obj);
            }
        }));
        duringCreated(t4u.m189320i()).subscribe(dhw.m115829h(new y20() { // from class: l.hws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111918a.m118551P3((Boolean) obj);
            }
        }));
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125968s()).filter(new qcj() { // from class: l.iws
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((lc3) obj) != null);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.nws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144008a.m118542G3((lc3) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186167a.m118559Y3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).skip(1).subscribe(dhw.m115825d(new y20() { // from class: l.wws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191325a.m118543H3((String) obj);
            }
        }));
        m118554T3(true);
        m118549N3();
        if (!((fm3) tbs.m190077m(itd0.f116823e)).m126175c()) {
            ((sxs) this.viewModel).m188519y(true);
        }
        duringCreated(((fk3) tbs.m190077m(itd0Var)).m125974y()).subscribe(dhw.m115825d(new y20() { // from class: l.xws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196545a.m118544I3((fk3.C16996b) obj);
            }
        }));
        duringCreated(t4u.m189321j()).subscribe(dhw.m115825d(new y20() { // from class: l.yws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201858a.m118570z3((t4u.C20236a) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.onMenuDialogShow().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.zws
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206378a.m118537B3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m118554T3(boolean z) {
        m118555U3(z, null);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m118555U3(boolean z, final Bundle bundle) {
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        if (z || System.currentTimeMillis() - this.f91106h > Constants.ONE_MIN_IN_MILLIS) {
            this.f91106h = System.currentTimeMillis();
            duringCreated(LiveSquareApi.requestTab()).map(new qcj() { // from class: l.lws
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f133857a.m118546K3((BaseLiveListBean) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.mws
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139154a.m118547L3(bundle, (BaseLiveListBean) obj);
                }
            }, new y20() { // from class: l.ows
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149560a.m118548M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m118556V3() {
        if (t4u.m189319h()) {
            return;
        }
        LiveSquareBaseFrag liveSquareBaseFragM188515s = ((sxs) this.viewModel).m188515s();
        if (liveSquareBaseFragM188515s == null) {
            mbs.m157835U(false);
            return;
        }
        boolean zMo70234c5 = liveSquareBaseFragM188515s.mo70234c5();
        mbs.m157835U(zMo70234c5);
        if (zMo70234c5) {
            getAct().setStatusBarColor(getAct().getResources().getColor(m9c0.f135374H));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m118557W3(List<LiveSquareTabBean> list) {
        if (!jyb.m147479J(list)) {
            this.f91107i = jyb.m147476G(list, new qcj() { // from class: l.jws
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LiveSquareTabBean) obj).requestName.equals("square-curated"));
                }
            });
            this.f91108j = jyb.m147476G(list, new qcj() { // from class: l.kws
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    LiveSquareTabBean liveSquareTabBean = (LiveSquareTabBean) obj;
                    return Boolean.valueOf(liveSquareTabBean.requestName.equals("fakeLiveSquare") && liveSquareTabBean.isDisplay());
                }
            });
        }
        ((sxs) this.viewModel).m188501E(list);
        m160238F2().LiveHomePageEvent.onRenderTabSelectPageId().mo199273j(m118564s3());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m118558X3() {
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setTabId("-100");
        liveSquareTabBean.setName(tbs.f172988a.getString(R$string.f45742c0));
        liveSquareTabBean.setRequestName("square-teen-mode");
        liveSquareTabBean.setDisplay(true);
        m118557W3(jyb.m147507f0(liveSquareTabBean));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m118559Y3(boolean z) {
        ((sxs) this.viewModel).m188505I(Boolean.valueOf(z));
        ((sxs) this.viewModel).m188508L(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o3 */
    public final boolean m118560o3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            if (!map.containsKey(liveSquareTabBean.getTabId()) && liveSquareTabBean.isDisplay()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m118561p3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean) {
        boolean z;
        HashMap<String, LiveSquareTabBean> map = new HashMap<>();
        boolean z2 = true;
        if (this.f91105g != null) {
            z = false;
            for (int i = 0; i < this.f91105g.size(); i++) {
                LiveSquareTabBean liveSquareTabBean = this.f91105g.get(i);
                map.put(liveSquareTabBean.getTabId(), liveSquareTabBean);
                if (y6u.m214515s(liveSquareTabBean.getRequestName())) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean zM147520m = jyb.m147520m(baseLiveListBean.getList(), new qcj() { // from class: l.rws
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(y6u.m214515s(((LiveSquareTabBean) obj).getRequestName()));
            }
        });
        boolean zM147520m2 = jyb.m147520m(baseLiveListBean.getList(), new qcj() { // from class: l.sws
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
        } else if (m118560o3(baseLiveListBean, map)) {
            return;
        }
        List<LiveSquareTabBean> listM118550O3 = m118550O3(baseLiveListBean, map);
        this.f91105g = listM118550O3;
        m118557W3(listM118550O3);
    }

    /* JADX INFO: renamed from: q3 */
    public final BaseLiveListBean<LiveSquareTabBean> m118562q3() {
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

    /* JADX INFO: renamed from: r3 */
    public void m118563r3() {
        ViewPager viewPager = ((sxs) this.viewModel).f171175c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((n2u) viewPager.getAdapter()).getItem(viewPager.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo70115Y4();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public String m118564s3() {
        LiveSquareBaseFrag liveSquareBaseFragM188515s = ((sxs) this.viewModel).m188515s();
        return liveSquareBaseFragM188515s == null ? "p_live_recommend" : liveSquareBaseFragM188515s.pageId();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m118565t3(Bundle bundle) {
        fk3.C16996b c16996b = this.f91109k;
        if (c16996b != null) {
            ((sxs) this.viewModel).m188509M(this.f91105g, c16996b.f99480a);
            this.f91109k = null;
        } else {
            if (bundle == null) {
                return;
            }
            String string = bundle.getString("default_tab_id", null);
            String string2 = bundle.getString("action");
            String string3 = bundle.getString("userId");
            ((sxs) this.viewModel).m188509M(this.f91105g, string);
            if (jyb.m147520m(this.f91105g, new qcj() { // from class: l.tws
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(y6u.m214515s(((LiveSquareTabBean) obj).getRequestName()));
                }
            }) && TextUtils.equals(string2, "openVideoChatProfile") && !TextUtils.isEmpty(string3)) {
                mbs.m157866m0(getAct(), string3, false);
            }
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m118566u3(boolean z) {
        if (z) {
            m118563r3();
        } else {
            m118554T3(false);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m118567v3(int i) {
        Frag fragM188516u = ((sxs) this.viewModel).m188516u(i);
        if (fragM188516u instanceof LiveSquareBaseFrag) {
            return ((LiveSquareBaseFrag) fragM188516u).mo70235d5();
        }
        return false;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m118568w3() {
        return m160239H2().f143738b.isHidden();
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m118569x3(Bundle bundle) {
        if (t4u.m189319h() != m118568w3()) {
            t4u.m189324m(m118568w3());
        }
        m118553S3(bundle);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m118570z3(t4u.C20236a c20236a) {
        fk3.C16996b c16996b = this.f91109k;
        if (c16996b != null) {
            ((sxs) this.viewModel).m188509M(this.f91105g, c16996b.f99480a);
            this.f91109k = null;
        }
    }
}
