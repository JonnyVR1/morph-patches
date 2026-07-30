package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class qyn extends dvs<bzn> {

    /* JADX INFO: renamed from: f */
    public final List<BLiveSquareTab> f160167f;

    /* JADX INFO: renamed from: g */
    public final b8o f160168g;

    /* JADX INFO: renamed from: h */
    public String f160169h;

    /* JADX INFO: renamed from: i */
    public String f160170i;

    public qyn(ner nerVar, nus nusVar, ViewPager viewPager, TabLayout tabLayout, b8o b8oVar) {
        super(nerVar, nusVar);
        this.f160167f = new ArrayList();
        this.f160170i = "";
        bzn bznVar = new bzn(viewPager, tabLayout);
        this.viewModel = bznVar;
        mo52715C(bznVar);
        this.f160168g = b8oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public void m178670G3(Boolean bool) {
        if (((bzn) this.viewModel).m107211F()) {
            l51.m152888H(getAct(), new Runnable() { // from class: l.cyn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84393a.m178702E3();
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ List m178675T2(List list, C4470c c4470c) {
        return list;
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m178681Z2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public void m178692p3(boolean z) {
        if (z) {
            m178707k3();
        }
        l51.m152886F(getAct(), new Runnable() { // from class: l.byn
            @Override // java.lang.Runnable
            public final void run() {
                this.f79034a.m178713y3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public /* synthetic */ void m178693s3(Bundle bundle) {
        if (t4u.m189319h() != m178712r3()) {
            t4u.m189324m(m178712r3());
        }
        this.f160168g.m103023x(bundle);
        if (bundle.getBoolean("voice-push-big-anchor", false)) {
            String string = bundle.getString("voice-suggest-scheme");
            if (!TextUtils.isEmpty(string)) {
                v5k0.m199899k(string, null);
            }
        }
        if (y6u.m214516t()) {
            m178710o3(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public /* synthetic */ String m178694t3(evs evsVar) {
        return m178708m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public /* synthetic */ void m178695u3(String str) {
        ((bzn) this.viewModel).m107226V(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public /* synthetic */ void m178696v3(Boolean bool) {
        ((bzn) this.viewModel).m107218M(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public /* synthetic */ void m178697w3(uxj0 uxj0Var) {
        V v2 = this.viewModel;
        if (v2 == 0 || ((bzn) v2).f79159c == null || ((bzn) v2).f79159c.getSelectedTabPosition() == -1) {
            return;
        }
        V v3 = this.viewModel;
        ((bzn) v3).m107216K(m178709n3(((bzn) v3).f79159c.getSelectedTabPosition()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public /* synthetic */ void m178698x3(lc3 lc3Var) {
        View viewFindViewWithTag = ((bzn) this.viewModel).f79159c.findViewWithTag("square-intlFollowing");
        View viewFindViewWithTag2 = ((bzn) this.viewModel).f79159c.findViewWithTag("square-intlFollowing");
        if (viewFindViewWithTag == null && viewFindViewWithTag2 != null) {
            ((bzn) this.viewModel).m107214I(lc3Var.f131269c);
            return;
        }
        V v2 = this.viewModel;
        if (viewFindViewWithTag != null) {
            ((bzn) v2).m107222Q(lc3Var.f131269c);
        } else {
            ((bzn) v2).m107214I(lc3Var.f131269c);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m178699B3(Integer num) {
        m160238F2().LiveHomePageEvent.onTabClicked().mo199273j(num);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m178700C3() {
        if (TextUtils.isEmpty(this.f160170i)) {
            return;
        }
        int iM103009i = this.f160168g.m103009i(this.f160170i);
        if (iM103009i >= 0 && iM103009i < ((bzn) this.viewModel).f79158b.getChildCount()) {
            ((bzn) this.viewModel).m107221P(iM103009i);
        }
        this.f160170i = "";
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m178701D3(List list) {
        list.size();
        ((BLiveSquareTab) list.get(0)).toJson();
        ((bzn) this.viewModel).m107220O(new ArrayList(this.f160167f), list, this.f160168g.m103010j(), new y20() { // from class: l.gyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107077a.m178699B3((Integer) obj);
            }
        });
        this.f160167f.clear();
        this.f160167f.addAll(list);
        m160238F2().LiveHomePageEvent.onRenderTabSelectPageId().mo199273j(m178708m3());
        ((bzn) this.viewModel).f79158b.post(new Runnable() { // from class: l.hyn
            @Override // java.lang.Runnable
            public final void run() {
                this.f112144a.m178700C3();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m178702E3() {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((bzn) v2).m107231s();
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m178703F3(f7s f7sVar) {
        ((bzn) this.viewModel).m107209C("square-following");
        ((bzn) this.viewModel).m107210E();
        if (f7sVar.m124477a()) {
            String strValueOf = String.valueOf(f7sVar.f97594g);
            sft.m185670h(tbs.f172989b.m203540V5() ? "red_dot_figure" : "red_dot_normal", strValueOf, this.f160168g.m103013m(((bzn) this.viewModel).m107236z()));
            ((bzn) this.viewModel).m107215J(strValueOf, "red_dot_figure");
        } else if (f7sVar.m124478b()) {
            sft.m185670h("red_dot_word", "", this.f160168g.m103013m(((bzn) this.viewModel).m107236z()));
            ((bzn) this.viewModel).m107215J(f7sVar.f97590c.get(0), "red_dot_word");
        }
    }

    /* JADX INFO: renamed from: H3 */
    public void m178704H3(int i) {
        this.f160168g.m103024y(i);
        this.f160169h = m178709n3(i);
        m178709n3(i);
        if (BLiveAbsData.VOICE_LIVE.equals(m178709n3(i))) {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j("tab_voice");
            ((bzn) this.viewModel).m107229Z(TextUtils.isEmpty(this.f160169h) ? m178709n3(i) : this.f160169h);
            f7s f7sVarMo68444ce = mbs.m157821G().mo68444ce();
            if (f7sVarMo68444ce.m124478b() && !f7sVarMo68444ce.m124477a()) {
                m160238F2().LiveHomeVoiceSelectTopic.selectTopic().mo199273j(b5p0.f75081b);
            }
        } else if (ppi0.m173207l().m173228x()) {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j("tab_teen");
        } else {
            m160238F2().LiveHomePageEvent.tabSelected().mo199273j(this.f160169h);
        }
        if ("square-intlGame".equals(m178709n3(i))) {
            ((bzn) this.viewModel).m107223R(false, this.f160168g.m103008h());
        }
    }

    /* JADX INFO: renamed from: I3 */
    public void m178705I3(int i) {
        ViewPager viewPager = ((bzn) this.viewModel).f79158b;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        if (i != viewPager.getCurrentItem()) {
            viewPager.m4178T(i, true);
        } else if (tbs.f172989b.m203437I6()) {
            m178707k3();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m178706J3(final f7s f7sVar) {
        l51.m152886F(getAct(), new Runnable() { // from class: l.ayn
            @Override // java.lang.Runnable
            public final void run() {
                this.f73983a.m178703F3(f7sVar);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((bzn) this.viewModel).m107230r();
        m113231o2(mbs.m157878u(TabName.Live).filter(new cws()), false).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.kyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129331a.m178693s3((Bundle) obj);
            }
        }));
        m178711q3();
        this.f160168g.m103014n();
        duringCreated(mbs.m157879v()).subscribe(dhw.m115825d(new y20() { // from class: l.lyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134121a.m178692p3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.onTabClicked().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.myn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139419a.m178705I3(((Integer) obj).intValue());
            }
        }));
        m160237E2(evs.class, new qcj() { // from class: l.nyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144341a.m178694t3((evs) obj);
            }
        });
        duringCreated(m160238F2().LiveHomePageEvent.tabTextColorChanged().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.oyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149812a.m178695u3((String) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.removeDefaultSelectListener().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.pyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154671a.m178696v3((Boolean) obj);
            }
        }));
        if (y6u.m214516t()) {
            itd0<gm3> itd0Var = itd0.f116821c;
            duringCreated(((gm3) tbs.m190077m(itd0Var)).m130733h()).observeOn(fo0.m126432a()).map(new ynt()).subscribe(dhw.m115829h(new y20() { // from class: l.vxn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f186284a.m178706J3((f7s) obj);
                }
            }));
            duringCreated(((gm3) tbs.m190077m(itd0Var)).m130732g()).subscribe(dhw.m115829h(new y20() { // from class: l.wxn
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
                }
            }));
        }
        itd0<fk3> itd0Var2 = itd0.f116820b;
        duringCreated(((fk3) tbs.m190077m(itd0Var2)).m125934A()).subscribe(dhw.m115825d(new y20() { // from class: l.uxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181484a.m178697w3((uxj0) obj);
            }
        }));
        duringCreated(t4u.m189320i()).subscribe(dhw.m115829h(new y20() { // from class: l.fyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101401a.m178670G3((Boolean) obj);
            }
        }));
        duringCreated(((fk3) tbs.m190077m(itd0Var2)).m125968s()).filter(new qcj() { // from class: l.iyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((lc3) obj) != null);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.jyn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123180a.m178698x3((lc3) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public void m178707k3() {
        ViewPager viewPager = ((bzn) this.viewModel).f79158b;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((n5o) viewPager.getAdapter()).getItem(viewPager.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo70115Y4();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public String m178708m3() {
        Frag fragM107235y = ((bzn) this.viewModel).m107235y();
        return fragM107235y == null ? "p_live_recommend" : fragM107235y.pageId();
    }

    /* JADX INFO: renamed from: n3 */
    public String m178709n3(int i) {
        return this.f160168g.m103013m(i);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m178710o3(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("navigation_live_intent")) {
            return;
        }
        String string = bundle.getString("navigation_live_intent");
        if (!((bzn) this.viewModel).m107211F()) {
            this.f160170i = string;
        }
        int iM103009i = this.f160168g.m103009i(string);
        if (iM103009i < 0 || iM103009i >= ((bzn) this.viewModel).f79158b.getChildCount()) {
            return;
        }
        ((bzn) this.viewModel).m107221P(iM103009i);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m178711q3() {
        duringCreated((C22421c) this.f160168g.m103011k().distinctUntilChanged().flatMap(new qcj() { // from class: l.xxn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196667a.m178714z3((List) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.yxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201995a.m178701D3((List) obj);
            }
        }, new y20() { // from class: l.zxn
            @Override // p153l.y20
            public final void call(Object obj) {
                qyn.m178681Z2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m178712r3() {
        return m160239H2().f143738b.isHidden();
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m178713y3() {
        String strM103010j = this.f160168g.m103010j();
        if (strM103010j != null) {
            if (mqr.m159585e()) {
                String strM107234x = ((bzn) this.viewModel).m107234x();
                if (!TextUtils.isEmpty(strM107234x)) {
                    strM103010j = strM107234x;
                }
            }
            ((bzn) this.viewModel).m107228X(this.f160167f, strM103010j);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22421c m178714z3(final List list) {
        return lifecycle().takeFirst(new qcj() { // from class: l.dyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).map(new qcj() { // from class: l.eyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qyn.m178675T2(list, (C4470c) obj);
            }
        });
    }
}
