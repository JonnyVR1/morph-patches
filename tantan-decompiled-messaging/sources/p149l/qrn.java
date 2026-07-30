package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class qrn extends svs {

    /* JADX INFO: renamed from: f */
    public osn f156007f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f156008g;

    /* JADX INFO: renamed from: h */
    public IntlLiveActivitiesEntryView f156009h;

    /* JADX INFO: renamed from: i */
    public boolean f156010i;

    public qrn(mcr mcrVar, mss mssVar, VFrame vFrame) {
        super(mcrVar, mssVar);
        this.f156008g = vFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ String m176055W2() {
        return (String) m151646N2(new dts());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m176056V2(this.f156008g, new a7j0() { // from class: l.lrn
            @Override // p149l.a7j0
            /* JADX INFO: renamed from: v */
            public final String mo68945v() {
                return this.f129737a.m176055W2();
            }
        });
        duringCreated(m151642F2().IntlGameOperationEvent.gameEntranceViewVisibility().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mrn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135390a.m176057X2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public void m176056V2(ViewGroup viewGroup, a7j0 a7j0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, t100.f167259h, t100.m186890d(9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        IntlLiveActivitiesEntryView intlLiveActivitiesEntryView = (IntlLiveActivitiesEntryView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162682L, viewGroup, false);
        this.f156009h = intlLiveActivitiesEntryView;
        intlLiveActivitiesEntryView.setLayoutParams(layoutParams);
        viewGroup.addView(this.f156009h);
        osn osnVar = new osn(this.lifecycleProviderImpl, m151643H2(), true, a7j0Var);
        this.f156007f = osnVar;
        osnVar.mo51532C(this.f156009h);
        this.f156007f.mo69101I2();
        xdl0.m208344M(this.f156009h, (s9s.f163228b.m195754V6() || this.f156010i || pgi0.m168730l().m168751x() || "p_audio_explore_recommend".equals(a7j0Var.mo68945v())) ? false : true);
        if (this.f156007f != null && !pgi0.m168730l().m168751x()) {
            this.f156007f.m165852B3(true);
        }
        m104250o2(s2u.f162012e, false).onBackpressureLatest().subscribe(ffw.m121197h(new e30() { // from class: l.nrn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140207a.m176058Y2((Boolean) obj);
            }
        }));
        m104250o2(((nj3) s9s.m182763m(gld0.f103312b)).m159644z(), false).onBackpressureLatest().subscribe(ffw.m121197h(new e30() { // from class: l.orn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145341a.m176059Z2((String) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.prn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150936a.m176060a3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m176057X2(Boolean bool) {
        if (bool.booleanValue()) {
            this.f156010i = true;
            if (NullChecker.m81303a(this.f156009h)) {
                xdl0.m208344M(this.f156009h, false);
            }
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m176058Y2(Boolean bool) {
        this.f156007f.m165852B3(bool.booleanValue());
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m176059Z2(String str) {
        this.f156007f.m165853C3(false, !TextUtils.equals(str, "live_tab_red_dot"));
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m176060a3(String str) {
        xdl0.m208344M(this.f156009h, (s9s.f163228b.m195754V6() || this.f156010i || !x4u.m207029o(str) || TextUtils.equals(str, "square-live-circle") || "square-intlGame".equals(str)) ? false : true);
    }
}
