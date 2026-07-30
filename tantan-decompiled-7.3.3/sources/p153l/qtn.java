package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class qtn extends txs {

    /* JADX INFO: renamed from: f */
    public oun f159468f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f159469g;

    /* JADX INFO: renamed from: h */
    public IntlLiveActivitiesEntryView f159470h;

    /* JADX INFO: renamed from: i */
    public boolean f159471i;

    public qtn(ner nerVar, nus nusVar, VFrame vFrame) {
        super(nerVar, nusVar);
        this.f159469g = vFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ String m178066W2() {
        return (String) m160243N2(new evs());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m178067V2(this.f159469g, new egj0() { // from class: l.ltn
            @Override // p153l.egj0
            /* JADX INFO: renamed from: v */
            public final String mo70128v() {
                return this.f133555a.m178066W2();
            }
        });
        duringCreated(m160238F2().IntlGameOperationEvent.gameEntranceViewVisibility().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.mtn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138642a.m178068X2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m178067V2(ViewGroup viewGroup, egj0 egj0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, qa00.f156321h, qa00.m175859d(9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        IntlLiveActivitiesEntryView intlLiveActivitiesEntryView = (IntlLiveActivitiesEntryView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193796L, viewGroup, false);
        this.f159470h = intlLiveActivitiesEntryView;
        intlLiveActivitiesEntryView.setLayoutParams(layoutParams);
        viewGroup.addView(this.f159470h);
        oun ounVar = new oun(this.lifecycleProviderImpl, m160239H2(), true, egj0Var);
        this.f159468f = ounVar;
        ounVar.mo52715C(this.f159470h);
        this.f159468f.mo70284I2();
        bnl0.m105524M(this.f159470h, (tbs.f172989b.m203541V6() || this.f159471i || ppi0.m173207l().m173228x() || "p_audio_explore_recommend".equals(egj0Var.mo70128v())) ? false : true);
        if (this.f159468f != null && !ppi0.m173207l().m173228x()) {
            this.f159468f.m169346B3(true);
        }
        m113231o2(t4u.f172135e, false).onBackpressureLatest().subscribe(dhw.m115829h(new y20() { // from class: l.ntn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143617a.m178069Y2((Boolean) obj);
            }
        }));
        m113231o2(((fk3) tbs.m190077m(itd0.f116820b)).m125975z(), false).onBackpressureLatest().subscribe(dhw.m115829h(new y20() { // from class: l.otn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148993a.m178070Z2((String) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ptn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154096a.m178071a3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m178068X2(Boolean bool) {
        if (bool.booleanValue()) {
            this.f159471i = true;
            if (NullChecker.m82486a(this.f159470h)) {
                bnl0.m105524M(this.f159470h, false);
            }
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m178069Y2(Boolean bool) {
        this.f159468f.m169346B3(bool.booleanValue());
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m178070Z2(String str) {
        this.f159468f.m169347C3(false, !TextUtils.equals(str, "live_tab_red_dot"));
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m178071a3(String str) {
        bnl0.m105524M(this.f159470h, (tbs.f172989b.m203541V6() || this.f159471i || !y6u.m214511o(str) || TextUtils.equals(str, "square-live-circle") || "square-intlGame".equals(str)) ? false : true);
    }
}
