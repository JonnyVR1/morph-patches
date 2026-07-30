package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class cvs extends cts<rvs> {

    /* JADX INFO: renamed from: f */
    public String f82672f;

    /* JADX INFO: renamed from: g */
    public List<LiveSquareTabBean> f82673g;

    /* JADX INFO: renamed from: h */
    public long f82674h;

    /* JADX INFO: renamed from: i */
    public int f82675i;

    /* JADX INFO: renamed from: j */
    public int f82676j;

    /* JADX INFO: renamed from: k */
    public nj3.C18705b f82677k;

    public cvs(mcr mcrVar, mss mssVar, ViewPager viewPager, TabLayout tabLayout, ToolBarSkinView toolBarSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        super(mcrVar, mssVar);
        this.f82672f = "";
        this.f82675i = -1;
        this.f82676j = -1;
        rvs rvsVar = new rvs(viewPager, tabLayout, toolBarSkinView, vDraweeView, vDraweeView2);
        this.viewModel = rvsVar;
        mo51532C(rvsVar);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m108908b3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m108920y3(Boolean bool) {
        if (bool.booleanValue()) {
            m108942X3();
            return;
        }
        this.f82674h = 0L;
        this.f82673g = null;
        m108938T3(true);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m108921B3(Boolean bool) {
        ((rvs) this.viewModel).m181345F(bool);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ String m108922C3(dts dtsVar) {
        return m108948s3();
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ String m108923D3(rws rwsVar) {
        return this.f82672f;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m108924E3(ias iasVar) {
        return Boolean.valueOf(this.f82676j >= 0);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m108925F3(roj0 roj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((rvs) v2).f161256d == null || ((rvs) v2).f161256d.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((rvs) v3).m181341A(((rvs) v3).m181360v(((rvs) v3).f161256d.getSelectedTabPosition()), true);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m108926G3(wb3 wb3Var) {
        ((rvs) this.viewModel).m181361x(wb3Var.f185548c);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m108927H3(String str) {
        if ("square-curated".equals(str)) {
            ((gl3) s9s.m182763m(gld0.f103315e)).m126745h(true);
            ((rvs) this.viewModel).m181362y(false);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m108928I3(nj3.C18705b c18705b) {
        this.f82677k = c18705b;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m108929J3(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        m151642F2().LiveHomeSummaryEvent.summary().mo172463j(liveSquareSummaryInfo);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ BaseLiveListBean m108930K3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean == null ? m108946q3() : baseLiveListBean;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m108931L3(Bundle bundle, BaseLiveListBean baseLiveListBean) {
        m108945p3(baseLiveListBean);
        m108949t3(bundle);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m108932M3(Throwable th) {
        try {
            m108945p3(m108946q3());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m108933N3() {
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        duringCreated(LiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(ffw.m121194e(new e30() { // from class: l.ous
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145727a.m108929J3((LiveSquareSummaryInfo) obj);
            }
        }, new e30() { // from class: l.pus
            @Override // p149l.e30
            public final void call(Object obj) {
                cvs.m108908b3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O3 */
    public final List<LiveSquareTabBean> m108934O3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            LiveSquareTabBean liveSquareTabBean2 = map.get(liveSquareTabBean.getTabId());
            if (liveSquareTabBean2 != null) {
                liveSquareTabBean.setDisplay(liveSquareTabBean2.isDisplay());
            }
        }
        return vwb.m200339n(baseLiveListBean.getList(), new tus());
    }

    /* JADX INFO: renamed from: P3 */
    public final void m108935P3(Boolean bool) {
        if (qib0.f154713b0.f139231b.mo30833w8(getAct())) {
            s9s.f163232f.m134383p(false);
        }
        if (bool.booleanValue()) {
            l9s.m149058U(false);
        } else {
            m108940V3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m108936R3(int i) {
        if (this.viewModel == 0) {
            return;
        }
        if (l9s.m149038A(getAct())) {
            s9s.f163232f.m134383p(false);
        }
        this.f82672f = ((rvs) this.viewModel).m181360v(i);
        if (pgi0.m168730l().m168751x()) {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j("tab_teen");
        } else {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j(this.f82672f);
        }
        m108940V3();
    }

    /* JADX INFO: renamed from: S3 */
    public void m108937S3(Bundle bundle) {
        if (bundle == null) {
            CrashHelper.m81296c(new NullPointerException("LiveSquareAct start intent lost data"));
        } else {
            if (m2u.m152713j(bundle, getAct())) {
                return;
            }
            m2u.m152710g(bundle, bundle.getInt("from", 0), getAct());
            m108939U3(true, bundle);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((rvs) this.viewModel).m181357r();
        m104250o2(l9s.m149101u(TabName.Live).filter(new bus()), false).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.zus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204885a.m108953x3((Bundle) obj);
            }
        }));
        duringCreated(l9s.m149102v()).subscribe(ffw.m121193d(new e30() { // from class: l.avs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71965a.m108950u3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).subscribe(ffw.m121193d(new e30() { // from class: l.bvs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77489a.m108920y3((Boolean) obj);
            }
        }));
        m151641E2(dts.class, new w9j() { // from class: l.cus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82591a.m108922C3((dts) obj);
            }
        });
        m151641E2(rws.class, new w9j() { // from class: l.dus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88012a.m108923D3((rws) obj);
            }
        });
        m151641E2(ias.class, new w9j() { // from class: l.eus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93272a.m108924E3((ias) obj);
            }
        });
        gld0<nj3> gld0Var = gld0.f103312b;
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159603A()).subscribe(ffw.m121193d(new e30() { // from class: l.fus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99356a.m108925F3((roj0) obj);
            }
        }));
        duringCreated(s2u.m182077i()).subscribe(ffw.m121197h(new e30() { // from class: l.gus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104463a.m108935P3((Boolean) obj);
            }
        }));
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159637s()).filter(new w9j() { // from class: l.hus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((wb3) obj) != null);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.mus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135843a.m108926G3((wb3) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.uus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178417a.m108943Y3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).skip(1).subscribe(ffw.m121193d(new e30() { // from class: l.vus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183119a.m108927H3((String) obj);
            }
        }));
        m108938T3(true);
        m108933N3();
        if (!((gl3) s9s.m182763m(gld0.f103315e)).m126740c()) {
            ((rvs) this.viewModel).m181362y(true);
        }
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159643y()).subscribe(ffw.m121193d(new e30() { // from class: l.wus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188165a.m108928I3((nj3.C18705b) obj);
            }
        }));
        duringCreated(s2u.m182078j()).subscribe(ffw.m121193d(new e30() { // from class: l.xus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194556a.m108954z3((s2u.C19834a) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.onMenuDialogShow().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.yus
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200120a.m108921B3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m108938T3(boolean z) {
        m108939U3(z, null);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m108939U3(boolean z, final Bundle bundle) {
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        if (z || System.currentTimeMillis() - this.f82674h > Constants.ONE_MIN_IN_MILLIS) {
            this.f82674h = System.currentTimeMillis();
            duringCreated(LiveSquareApi.requestTab()).map(new w9j() { // from class: l.kus
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f124711a.m108930K3((BaseLiveListBean) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.lus
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130086a.m108931L3(bundle, (BaseLiveListBean) obj);
                }
            }, new e30() { // from class: l.nus
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140650a.m108932M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m108940V3() {
        if (s2u.m182076h()) {
            return;
        }
        LiveSquareBaseFrag liveSquareBaseFragM181358s = ((rvs) this.viewModel).m181358s();
        if (liveSquareBaseFragM181358s == null) {
            l9s.m149058U(false);
            return;
        }
        boolean zMo69051c5 = liveSquareBaseFragM181358s.mo69051c5();
        l9s.m149058U(zMo69051c5);
        if (zMo69051c5) {
            getAct().setStatusBarColor(getAct().getResources().getColor(g1c0.f100144H));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m108941W3(List<LiveSquareTabBean> list) {
        if (!vwb.m200296J(list)) {
            this.f82675i = vwb.m200293G(list, new w9j() { // from class: l.ius
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LiveSquareTabBean) obj).requestName.equals("square-curated"));
                }
            });
            this.f82676j = vwb.m200293G(list, new w9j() { // from class: l.jus
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    LiveSquareTabBean liveSquareTabBean = (LiveSquareTabBean) obj;
                    return Boolean.valueOf(liveSquareTabBean.requestName.equals("fakeLiveSquare") && liveSquareTabBean.isDisplay());
                }
            });
        }
        ((rvs) this.viewModel).m181344E(list);
        m151642F2().LiveHomePageEvent.onRenderTabSelectPageId().mo172463j(m108948s3());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m108942X3() {
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setTabId("-100");
        liveSquareTabBean.setName(s9s.f163227a.getString(R$string.f44894c0));
        liveSquareTabBean.setRequestName("square-teen-mode");
        liveSquareTabBean.setDisplay(true);
        m108941W3(vwb.m200324f0(liveSquareTabBean));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m108943Y3(boolean z) {
        ((rvs) this.viewModel).m181348I(Boolean.valueOf(z));
        ((rvs) this.viewModel).m181351L(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o3 */
    public final boolean m108944o3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            if (!map.containsKey(liveSquareTabBean.getTabId()) && liveSquareTabBean.isDisplay()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m108945p3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean) {
        boolean z;
        HashMap<String, LiveSquareTabBean> map = new HashMap<>();
        boolean z2 = true;
        if (this.f82673g != null) {
            z = false;
            for (int i = 0; i < this.f82673g.size(); i++) {
                LiveSquareTabBean liveSquareTabBean = this.f82673g.get(i);
                map.put(liveSquareTabBean.getTabId(), liveSquareTabBean);
                if (x4u.m207033s(liveSquareTabBean.getRequestName())) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean zM200337m = vwb.m200337m(baseLiveListBean.getList(), new w9j() { // from class: l.qus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(x4u.m207033s(((LiveSquareTabBean) obj).getRequestName()));
            }
        });
        boolean zM200337m2 = vwb.m200337m(baseLiveListBean.getList(), new w9j() { // from class: l.rus
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LiveSquareTabBean liveSquareTabBean2 = (LiveSquareTabBean) obj;
                return Boolean.valueOf(x4u.m207033s(liveSquareTabBean2.getRequestName()) && !liveSquareTabBean2.isDisplay());
            }
        });
        if (zM200337m && !zM200337m2) {
            z2 = false;
        }
        if (z && z2) {
            map.clear();
        } else if (m108944o3(baseLiveListBean, map)) {
            return;
        }
        List<LiveSquareTabBean> listM108934O3 = m108934O3(baseLiveListBean, map);
        this.f82673g = listM108934O3;
        m108941W3(listM108934O3);
    }

    /* JADX INFO: renamed from: q3 */
    public final BaseLiveListBean<LiveSquareTabBean> m108946q3() {
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
    public void m108947r3() {
        ViewPager viewPager = ((rvs) this.viewModel).f161255c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((m0u) viewPager.getAdapter()).getItem(viewPager.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo68932Y4();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public String m108948s3() {
        LiveSquareBaseFrag liveSquareBaseFragM181358s = ((rvs) this.viewModel).m181358s();
        return liveSquareBaseFragM181358s == null ? "p_live_recommend" : liveSquareBaseFragM181358s.pageId();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m108949t3(Bundle bundle) {
        nj3.C18705b c18705b = this.f82677k;
        if (c18705b != null) {
            ((rvs) this.viewModel).m181352M(this.f82673g, c18705b.f139207a);
            this.f82677k = null;
        } else {
            if (bundle == null) {
                return;
            }
            String string = bundle.getString("default_tab_id", null);
            String string2 = bundle.getString("action");
            String string3 = bundle.getString("userId");
            ((rvs) this.viewModel).m181352M(this.f82673g, string);
            if (vwb.m200337m(this.f82673g, new w9j() { // from class: l.sus
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(x4u.m207033s(((LiveSquareTabBean) obj).getRequestName()));
                }
            }) && TextUtils.equals(string2, "openVideoChatProfile") && !TextUtils.isEmpty(string3)) {
                l9s.m149089m0(getAct(), string3, false);
            }
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m108950u3(boolean z) {
        if (z) {
            m108947r3();
        } else {
            m108938T3(false);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m108951v3(int i) {
        Frag fragM181359u = ((rvs) this.viewModel).m181359u(i);
        if (fragM181359u instanceof LiveSquareBaseFrag) {
            return ((LiveSquareBaseFrag) fragM181359u).mo69052d5();
        }
        return false;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m108952w3() {
        return m151643H2().f135531b.isHidden();
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m108953x3(Bundle bundle) {
        if (s2u.m182076h() != m108952w3()) {
            s2u.m182081m(m108952w3());
        }
        m108937S3(bundle);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m108954z3(s2u.C19834a c19834a) {
        nj3.C18705b c18705b = this.f82677k;
        if (c18705b != null) {
            ((rvs) this.viewModel).m181352M(this.f82673g, c18705b.f139207a);
            this.f82677k = null;
        }
    }
}
