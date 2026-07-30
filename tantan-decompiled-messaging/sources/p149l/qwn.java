package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class qwn extends cts<bxn> {

    /* JADX INFO: renamed from: f */
    public final List<BLiveSquareTab> f156741f;

    /* JADX INFO: renamed from: g */
    public final b6o f156742g;

    /* JADX INFO: renamed from: h */
    public String f156743h;

    /* JADX INFO: renamed from: i */
    public String f156744i;

    public qwn(mcr mcrVar, mss mssVar, ViewPager viewPager, TabLayout tabLayout, b6o b6oVar) {
        super(mcrVar, mssVar);
        this.f156741f = new ArrayList();
        this.f156744i = "";
        bxn bxnVar = new bxn(viewPager, tabLayout);
        this.viewModel = bxnVar;
        mo51532C(bxnVar);
        this.f156742g = b6oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public void m176828G3(Boolean bool) {
        if (((bxn) this.viewModel).m104342F()) {
            e51.m114743H(getAct(), new Runnable() { // from class: l.cwn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82801a.m176860E3();
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ List m176833T2(List list, C4319c c4319c) {
        return list;
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m176839Z2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public void m176850p3(boolean z) {
        if (z) {
            m176865k3();
        }
        e51.m114741F(getAct(), new Runnable() { // from class: l.bwn
            @Override // java.lang.Runnable
            public final void run() {
                this.f77632a.m176871y3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public /* synthetic */ void m176851s3(Bundle bundle) {
        if (s2u.m182076h() != m176870r3()) {
            s2u.m182081m(m176870r3());
        }
        this.f156742g.m100465x(bundle);
        if (bundle.getBoolean("voice-push-big-anchor", false)) {
            String string = bundle.getString("voice-suggest-scheme");
            if (!TextUtils.isEmpty(string)) {
                rwj0.m181412k(string, null);
            }
        }
        if (x4u.m207034t()) {
            m176868o3(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public /* synthetic */ String m176852t3(dts dtsVar) {
        return m176866m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public /* synthetic */ void m176853u3(String str) {
        ((bxn) this.viewModel).m104357V(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public /* synthetic */ void m176854v3(Boolean bool) {
        ((bxn) this.viewModel).m104349M(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public /* synthetic */ void m176855w3(roj0 roj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((bxn) v2).f77806c == null || ((bxn) v2).f77806c.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((bxn) v3).m104347K(m176867n3(((bxn) v3).f77806c.getSelectedTabPosition()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public /* synthetic */ void m176856x3(wb3 wb3Var) {
        View viewFindViewWithTag = ((bxn) this.viewModel).f77806c.findViewWithTag("square-intlFollowing");
        View viewFindViewWithTag2 = ((bxn) this.viewModel).f77806c.findViewWithTag("square-intlFollowing");
        if (viewFindViewWithTag == null && viewFindViewWithTag2 != null) {
            ((bxn) this.viewModel).m104345I(wb3Var.f185548c);
            return;
        }
        V v2 = this.viewModel;
        if (viewFindViewWithTag != null) {
            ((bxn) v2).m104353Q(wb3Var.f185548c);
        } else {
            ((bxn) v2).m104345I(wb3Var.f185548c);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m176857B3(Integer num) {
        m151642F2().LiveHomePageEvent.onTabClicked().mo172463j(num);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m176858C3() {
        if (TextUtils.isEmpty(this.f156744i)) {
            return;
        }
        int iM100451i = this.f156742g.m100451i(this.f156744i);
        if (iM100451i >= 0 && iM100451i < ((bxn) this.viewModel).f77805b.getChildCount()) {
            ((bxn) this.viewModel).m104352P(iM100451i);
        }
        this.f156744i = "";
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m176859D3(List list) {
        list.size();
        ((BLiveSquareTab) list.get(0)).toJson();
        ((bxn) this.viewModel).m104351O(new ArrayList(this.f156741f), list, this.f156742g.m100452j(), new e30() { // from class: l.gwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104748a.m176857B3((Integer) obj);
            }
        });
        this.f156741f.clear();
        this.f156741f.addAll(list);
        m151642F2().LiveHomePageEvent.onRenderTabSelectPageId().mo172463j(m176866m3());
        ((bxn) this.viewModel).f77805b.post(new Runnable() { // from class: l.hwn
            @Override // java.lang.Runnable
            public final void run() {
                this.f109774a.m176858C3();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m176860E3() {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((bxn) v2).m104362s();
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m176861F3(e5s e5sVar) {
        ((bxn) this.viewModel).m104340C("square-following");
        ((bxn) this.viewModel).m104341E();
        if (e5sVar.m114893a()) {
            String strValueOf = String.valueOf(e5sVar.f89468g);
            rdt.m179013h(s9s.f163228b.m195753V5() ? "red_dot_figure" : "red_dot_normal", strValueOf, this.f156742g.m100455m(((bxn) this.viewModel).m104367z()));
            ((bxn) this.viewModel).m104346J(strValueOf, "red_dot_figure");
        } else if (e5sVar.m114894b()) {
            rdt.m179013h("red_dot_word", "", this.f156742g.m100455m(((bxn) this.viewModel).m104367z()));
            ((bxn) this.viewModel).m104346J(e5sVar.f89464c.get(0), "red_dot_word");
        }
    }

    /* JADX INFO: renamed from: H3 */
    public void m176862H3(int i) {
        this.f156742g.m100466y(i);
        this.f156743h = m176867n3(i);
        m176867n3(i);
        if (BLiveAbsData.VOICE_LIVE.equals(m176867n3(i))) {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j("tab_voice");
            ((bxn) this.viewModel).m104360Z(TextUtils.isEmpty(this.f156743h) ? m176867n3(i) : this.f156743h);
            e5s e5sVarMo67261ce = l9s.m149044G().mo67261ce();
            if (e5sVarMo67261ce.m114894b() && !e5sVarMo67261ce.m114893a()) {
                m151642F2().LiveHomeVoiceSelectTopic.selectTopic().mo172463j(xvo0.f194658b);
            }
        } else if (pgi0.m168730l().m168751x()) {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j("tab_teen");
        } else {
            m151642F2().LiveHomePageEvent.tabSelected().mo172463j(this.f156743h);
        }
        if ("square-intlGame".equals(m176867n3(i))) {
            ((bxn) this.viewModel).m104354R(false, this.f156742g.m100450h());
        }
    }

    /* JADX INFO: renamed from: I3 */
    public void m176863I3(int i) {
        ViewPager viewPager = ((bxn) this.viewModel).f77805b;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        if (i != viewPager.getCurrentItem()) {
            viewPager.m4176T(i, true);
        } else if (s9s.f163228b.m195650I6()) {
            m176865k3();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m176864J3(final e5s e5sVar) {
        e51.m114741F(getAct(), new Runnable() { // from class: l.awn
            @Override // java.lang.Runnable
            public final void run() {
                this.f72066a.m176861F3(e5sVar);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((bxn) this.viewModel).m104361r();
        m104250o2(l9s.m149101u(TabName.Live).filter(new bus()), false).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.kwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125002a.m176851s3((Bundle) obj);
            }
        }));
        m176869q3();
        this.f156742g.m100456n();
        duringCreated(l9s.m149102v()).subscribe(ffw.m121193d(new e30() { // from class: l.lwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130278a.m176850p3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.onTabClicked().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136072a.m176863I3(((Integer) obj).intValue());
            }
        }));
        m151641E2(dts.class, new w9j() { // from class: l.nwn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140956a.m176852t3((dts) obj);
            }
        });
        duringCreated(m151642F2().LiveHomePageEvent.tabTextColorChanged().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.own
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146072a.m176853u3((String) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.removeDefaultSelectListener().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.pwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151585a.m176854v3((Boolean) obj);
            }
        }));
        if (x4u.m207034t()) {
            gld0<hl3> gld0Var = gld0.f103313c;
            duringCreated(((hl3) s9s.m182763m(gld0Var)).m131634h()).observeOn(jo0.m142408a()).map(new wlt()).subscribe(ffw.m121197h(new e30() { // from class: l.vvn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183244a.m176864J3((e5s) obj);
                }
            }));
            duringCreated(((hl3) s9s.m182763m(gld0Var)).m131633g()).subscribe(ffw.m121197h(new e30() { // from class: l.wvn
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
                }
            }));
        }
        gld0<nj3> gld0Var2 = gld0.f103312b;
        duringCreated(((nj3) s9s.m182763m(gld0Var2)).m159603A()).subscribe(ffw.m121193d(new e30() { // from class: l.uvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178548a.m176855w3((roj0) obj);
            }
        }));
        duringCreated(s2u.m182077i()).subscribe(ffw.m121197h(new e30() { // from class: l.fwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99666a.m176828G3((Boolean) obj);
            }
        }));
        duringCreated(((nj3) s9s.m182763m(gld0Var2)).m159637s()).filter(new w9j() { // from class: l.iwn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((wb3) obj) != null);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jwn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120100a.m176856x3((wb3) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m176865k3() {
        ViewPager viewPager = ((bxn) this.viewModel).f77805b;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((n3o) viewPager.getAdapter()).getItem(viewPager.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo68932Y4();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public String m176866m3() {
        Frag fragM104366y = ((bxn) this.viewModel).m104366y();
        return fragM104366y == null ? "p_live_recommend" : fragM104366y.pageId();
    }

    /* JADX INFO: renamed from: n3 */
    public String m176867n3(int i) {
        return this.f156742g.m100455m(i);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m176868o3(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("navigation_live_intent")) {
            return;
        }
        String string = bundle.getString("navigation_live_intent");
        if (!((bxn) this.viewModel).m104342F()) {
            this.f156744i = string;
        }
        int iM100451i = this.f156742g.m100451i(string);
        if (iM100451i < 0 || iM100451i >= ((bxn) this.viewModel).f77805b.getChildCount()) {
            return;
        }
        ((bxn) this.viewModel).m104352P(iM100451i);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m176869q3() {
        duringCreated((C22306c) this.f156742g.m100453k().distinctUntilChanged().flatMap(new w9j() { // from class: l.xvn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194655a.m176872z3((List) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.yvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200283a.m176859D3((List) obj);
            }
        }, new e30() { // from class: l.zvn
            @Override // p149l.e30
            public final void call(Object obj) {
                qwn.m176839Z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m176870r3() {
        return m151643H2().f135531b.isHidden();
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m176871y3() {
        String strM100452j = this.f156742g.m100452j();
        if (strM100452j != null) {
            if (lor.m150800e()) {
                String strM104365x = ((bxn) this.viewModel).m104365x();
                if (!TextUtils.isEmpty(strM104365x)) {
                    strM100452j = strM104365x;
                }
            }
            ((bxn) this.viewModel).m104359X(this.f156741f, strM100452j);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22306c m176872z3(final List list) {
        return lifecycle().takeFirst(new w9j() { // from class: l.dwn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).map(new w9j() { // from class: l.ewn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qwn.m176833T2(list, (C4319c) obj);
            }
        });
    }
}
