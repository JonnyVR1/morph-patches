package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class aus extends cts<jvs> {

    /* JADX INFO: renamed from: f */
    public String f71853f;

    /* JADX INFO: renamed from: g */
    public List<LiveSquareTabBean> f71854g;

    /* JADX INFO: renamed from: h */
    public long f71855h;

    /* JADX INFO: renamed from: i */
    public int f71856i;

    /* JADX INFO: renamed from: j */
    public int f71857j;

    /* JADX INFO: renamed from: k */
    public nj3.C18705b f71858k;

    public aus(mcr mcrVar, mss mssVar, ViewPager viewPager, TabLayout tabLayout, View view) {
        super(mcrVar, mssVar);
        this.f71853f = "";
        this.f71856i = -1;
        this.f71857j = -1;
        jvs jvsVar = new jvs(viewPager, tabLayout, view);
        this.viewModel = jvsVar;
        mo51532C(jvsVar);
    }

    /* JADX INFO: renamed from: H3 */
    private List<LiveSquareTabBean> m99038H3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            LiveSquareTabBean liveSquareTabBean2 = map.get(liveSquareTabBean.getTabId());
            if (liveSquareTabBean2 != null) {
                liveSquareTabBean.setDisplay(liveSquareTabBean2.isDisplay());
            }
        }
        return vwb.m200339n(baseLiveListBean.getList(), new tus());
    }

    /* JADX INFO: renamed from: K3 */
    private void m99039K3(boolean z) {
        m99040L3(z, null);
    }

    /* JADX INFO: renamed from: L3 */
    private void m99040L3(boolean z, final Bundle bundle) {
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        if (z || System.currentTimeMillis() - this.f71855h > Constants.ONE_MIN_IN_MILLIS) {
            this.f71855h = System.currentTimeMillis();
            duringCreated(LiveSquareApi.requestTab()).map(new w9j() { // from class: l.lts
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f129990a.m99071D3((BaseLiveListBean) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.mts
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135693a.m99072E3(bundle, (BaseLiveListBean) obj);
                }
            }, new e30() { // from class: l.nts
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140528a.m99073F3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M3 */
    private void m99041M3(List<LiveSquareTabBean> list) {
        if (!vwb.m200296J(list)) {
            this.f71856i = vwb.m200293G(list, new w9j() { // from class: l.hts
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LiveSquareTabBean) obj).requestName.equals("square-curated"));
                }
            });
            this.f71857j = vwb.m200293G(list, new w9j() { // from class: l.its
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    LiveSquareTabBean liveSquareTabBean = (LiveSquareTabBean) obj;
                    return Boolean.valueOf(liveSquareTabBean.requestName.equals("fakeLiveSquare") && liveSquareTabBean.isDisplay());
                }
            });
        }
        ((jvs) this.viewModel).m143562E(list);
        m151642F2().LiveHomePageEvent.onRenderTabSelectPageId().mo172463j(m99077o3());
    }

    /* JADX INFO: renamed from: N3 */
    private void m99042N3() {
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setTabId("-100");
        liveSquareTabBean.setName(s9s.f163227a.getString(R$string.f44894c0));
        liveSquareTabBean.setRequestName("square-teen-mode");
        liveSquareTabBean.setDisplay(true);
        m99041M3(vwb.m200324f0(liveSquareTabBean));
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m99045R2(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    private boolean m99064k3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean, HashMap<String, LiveSquareTabBean> map) {
        for (int i = 0; i < baseLiveListBean.getList().size(); i++) {
            LiveSquareTabBean liveSquareTabBean = baseLiveListBean.getList().get(i);
            if (!map.containsKey(liveSquareTabBean.getTabId()) && liveSquareTabBean.isDisplay()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m3 */
    private void m99065m3(BaseLiveListBean<LiveSquareTabBean> baseLiveListBean) {
        boolean z;
        HashMap<String, LiveSquareTabBean> map = new HashMap<>();
        boolean z2 = true;
        if (this.f71854g != null) {
            z = false;
            for (int i = 0; i < this.f71854g.size(); i++) {
                LiveSquareTabBean liveSquareTabBean = this.f71854g.get(i);
                map.put(liveSquareTabBean.getTabId(), liveSquareTabBean);
                if (x4u.m207033s(liveSquareTabBean.getRequestName())) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean zM200337m = vwb.m200337m(baseLiveListBean.getList(), new w9j() { // from class: l.ots
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(x4u.m207033s(((LiveSquareTabBean) obj).getRequestName()));
            }
        });
        boolean zM200337m2 = vwb.m200337m(baseLiveListBean.getList(), new w9j() { // from class: l.qts
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
        } else if (m99064k3(baseLiveListBean, map)) {
            return;
        }
        List<LiveSquareTabBean> listM99038H3 = m99038H3(baseLiveListBean, map);
        this.f71854g = listM99038H3;
        m99041M3(listM99038H3);
    }

    /* JADX INFO: renamed from: n3 */
    private BaseLiveListBean<LiveSquareTabBean> m99066n3() {
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
    private void m99067p3(Bundle bundle) {
        nj3.C18705b c18705b = this.f71858k;
        if (c18705b != null) {
            ((jvs) this.viewModel).m143566K(this.f71854g, c18705b.f139207a);
            this.f71858k = null;
        } else {
            if (bundle == null) {
                return;
            }
            String string = bundle.getString("default_tab_id", null);
            String string2 = bundle.getString("action");
            String string3 = bundle.getString("userId");
            ((jvs) this.viewModel).m143566K(this.f71854g, string);
            if (vwb.m200337m(this.f71854g, new w9j() { // from class: l.rts
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(x4u.m207033s(((LiveSquareTabBean) obj).getRequestName()));
                }
            }) && TextUtils.equals(string2, "openVideoChatProfile") && !TextUtils.isEmpty(string3)) {
                l9s.m149089m0(getAct(), string3, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public /* synthetic */ void m99068r3(Boolean bool) {
        if (bool.booleanValue()) {
            m99042N3();
            return;
        }
        this.f71855h = 0L;
        this.f71854g = null;
        m99039K3(true);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m99069B3(s2u.C19834a c19834a) {
        nj3.C18705b c18705b = this.f71858k;
        if (c18705b != null) {
            ((jvs) this.viewModel).m143566K(this.f71854g, c18705b.f139207a);
            this.f71858k = null;
        }
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m99070C3(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        m151642F2().LiveHomeSummaryEvent.summary().mo172463j(liveSquareSummaryInfo);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ BaseLiveListBean m99071D3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean == null ? m99066n3() : baseLiveListBean;
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m99072E3(Bundle bundle, BaseLiveListBean baseLiveListBean) {
        m99065m3(baseLiveListBean);
        m99067p3(bundle);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m99073F3(Throwable th) {
        try {
            m99065m3(m99066n3());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public void m99074G3() {
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        duringCreated(LiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(ffw.m121194e(new e30() { // from class: l.jts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119672a.m99070C3((LiveSquareSummaryInfo) obj);
            }
        }, new e30() { // from class: l.kts
            @Override // p149l.e30
            public final void call(Object obj) {
                aus.m99045R2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public void m99075I3(int i) {
        if (this.viewModel == 0) {
            return;
        }
        if (l9s.m149038A(getAct())) {
            s9s.f163232f.m134383p(false);
        }
        this.f71853f = ((jvs) this.viewModel).m143573v(i);
        if (pgi0.m168730l().m168751x()) {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j("tab_teen");
        } else {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j(this.f71853f);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m99076J3(Bundle bundle) {
        if (bundle == null || m2u.m152713j(bundle, getAct())) {
            return;
        }
        m2u.m152710g(bundle, bundle.getInt("from", 0), getAct());
        m99040L3(true, bundle);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((jvs) this.viewModel).m143570r();
        m99076J3(m151643H2().f135531b.getArguments());
        duringCreated(pgi0.m168730l().m168752y()).subscribe(ffw.m121193d(new e30() { // from class: l.ets
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93170a.m99068r3((Boolean) obj);
            }
        }));
        m151641E2(dts.class, new w9j() { // from class: l.tts
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172060a.m99079s3((dts) obj);
            }
        });
        m151641E2(rws.class, new w9j() { // from class: l.uts
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f178286a.m99081u3((rws) obj);
            }
        });
        m151641E2(ias.class, new w9j() { // from class: l.vts
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183001a.m99082v3((ias) obj);
            }
        });
        gld0<nj3> gld0Var = gld0.f103312b;
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159603A()).subscribe(ffw.m121193d(new e30() { // from class: l.wts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188051a.m99083w3((roj0) obj);
            }
        }));
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159637s()).filter(new w9j() { // from class: l.xts
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((wb3) obj) != null);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.yts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200012a.m99084x3((wb3) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).skip(1).subscribe(ffw.m121193d(new e30() { // from class: l.zts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204753a.m99085y3((String) obj);
            }
        }));
        m99039K3(true);
        m99074G3();
        if (!((gl3) s9s.m182763m(gld0.f103315e)).m126740c()) {
            ((jvs) this.viewModel).m143559y(true);
        }
        duringCreated(((nj3) s9s.m182763m(gld0Var)).m159643y()).subscribe(ffw.m121193d(new e30() { // from class: l.fts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99260a.m99086z3((nj3.C18705b) obj);
            }
        }));
        duringCreated(s2u.m182078j()).subscribe(ffw.m121193d(new e30() { // from class: l.gts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104349a.m99069B3((s2u.C19834a) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.pts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151211a.m99080t3((Boolean) obj);
            }
        }));
        s9s.f163232f.m134383p(false);
        m104250o2(m151642F2().LiveHomePageEvent.processBundle().m172460g(), false).subscribe(ffw.m121197h(new e30() { // from class: l.sts
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166385a.m99076J3((Bundle) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o3 */
    public String m99077o3() {
        LiveSquareBaseFrag liveSquareBaseFragM143571s = ((jvs) this.viewModel).m143571s();
        return liveSquareBaseFragM143571s == null ? "p_live_recommend" : liveSquareBaseFragM143571s.pageId();
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m99078q3(int i) {
        Frag fragM143572u = ((jvs) this.viewModel).m143572u(i);
        if (fragM143572u instanceof LiveSquareBaseFrag) {
            return ((LiveSquareBaseFrag) fragM143572u).mo69052d5();
        }
        return false;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ String m99079s3(dts dtsVar) {
        return m99077o3();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m99080t3(Boolean bool) {
        ((jvs) this.viewModel).m143565J(bool);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ String m99081u3(rws rwsVar) {
        return this.f71853f;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m99082v3(ias iasVar) {
        return Boolean.valueOf(this.f71857j >= 0);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m99083w3(roj0 roj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((jvs) v2).f119975c == null || ((jvs) v2).f119975c.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((jvs) v3).m143561A(((jvs) v3).m143573v(((jvs) v3).f119975c.getSelectedTabPosition()), true);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m99084x3(wb3 wb3Var) {
        ((jvs) this.viewModel).m143558x(wb3Var.f185548c);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m99085y3(String str) {
        if ("square-curated".equals(str)) {
            ((gl3) s9s.m182763m(gld0.f103315e)).m126745h(true);
            ((jvs) this.viewModel).m143559y(false);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m99086z3(nj3.C18705b c18705b) {
        this.f71858k = c18705b;
    }
}
