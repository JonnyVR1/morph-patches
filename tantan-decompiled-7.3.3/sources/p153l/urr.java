package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class urr extends txs {

    /* JADX INFO: renamed from: f */
    public msr f180676f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f180677g;

    public urr(ner nerVar, nus nusVar, VFrame vFrame) {
        super(nerVar, nusVar);
        this.f180677g = vFrame;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m197654T2(this.f180677g, new egj0() { // from class: l.rrr
            @Override // p153l.egj0
            /* JADX INFO: renamed from: v */
            public final String mo70128v() {
                return this.f164601a.m197655U2();
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m197654T2(ViewGroup viewGroup, egj0 egj0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, qa00.f156321h, qa00.m175859d(mbs.m157865m().mo192251h() ? 40.0f : 9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        final LiveActivitiesEntryView liveActivitiesEntryView = (LiveActivitiesEntryView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193870h0, viewGroup, false);
        liveActivitiesEntryView.setLayoutParams(layoutParams);
        viewGroup.addView(liveActivitiesEntryView);
        msr msrVar = new msr(this.lifecycleProviderImpl, m160239H2(), egj0Var);
        this.f180676f = msrVar;
        msrVar.mo52715C(liveActivitiesEntryView);
        this.f180676f.mo70284I2();
        bnl0.m105524M(liveActivitiesEntryView, (ppi0.m173207l().m173228x() || "p_audio_explore_recommend".equals(egj0Var.mo70128v())) ? false : true);
        if (this.f180676f != null && !ppi0.m173207l().m173228x()) {
            this.f180676f.m159932z3();
        }
        m113231o2(t4u.f172135e, false).onBackpressureLatest().subscribe(dhw.m115829h(new y20() { // from class: l.srr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170365a.m197656V2((Boolean) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.trr
            @Override // p153l.y20
            public final void call(Object obj) {
                String str = (String) obj;
                bnl0.m105524M(liveActivitiesEntryView, (!y6u.m214510n(str) || TextUtils.equals(str, "square-live-circle") || TextUtils.equals(str, "fakePlayground") || TextUtils.equals(str, "square-curated")) ? false : true);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ String m197655U2() {
        return (String) m160243N2(new evs());
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m197656V2(Boolean bool) {
        this.f180676f.m159932z3();
    }
}
