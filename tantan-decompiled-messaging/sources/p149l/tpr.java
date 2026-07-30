package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class tpr extends svs {

    /* JADX INFO: renamed from: f */
    public lqr f171503f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f171504g;

    public tpr(mcr mcrVar, mss mssVar, VFrame vFrame) {
        super(mcrVar, mssVar);
        this.f171504g = vFrame;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m190004T2(this.f171504g, new a7j0() { // from class: l.qpr
            @Override // p149l.a7j0
            /* JADX INFO: renamed from: v */
            public final String mo68945v() {
                return this.f155795a.m190005U2();
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m190004T2(ViewGroup viewGroup, a7j0 a7j0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, t100.f167259h, t100.m186890d(l9s.m149088m().mo165308h() ? 40.0f : 9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        final LiveActivitiesEntryView liveActivitiesEntryView = (LiveActivitiesEntryView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162756h0, viewGroup, false);
        liveActivitiesEntryView.setLayoutParams(layoutParams);
        viewGroup.addView(liveActivitiesEntryView);
        lqr lqrVar = new lqr(this.lifecycleProviderImpl, m151643H2(), a7j0Var);
        this.f171503f = lqrVar;
        lqrVar.mo51532C(liveActivitiesEntryView);
        this.f171503f.mo69101I2();
        xdl0.m208344M(liveActivitiesEntryView, (pgi0.m168730l().m168751x() || "p_audio_explore_recommend".equals(a7j0Var.mo68945v())) ? false : true);
        if (this.f171503f != null && !pgi0.m168730l().m168751x()) {
            this.f171503f.m151090z3();
        }
        m104250o2(s2u.f162012e, false).onBackpressureLatest().subscribe(ffw.m121197h(new e30() { // from class: l.rpr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160555a.m190006V2((Boolean) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.spr
            @Override // p149l.e30
            public final void call(Object obj) {
                String str = (String) obj;
                xdl0.m208344M(liveActivitiesEntryView, (!x4u.m207028n(str) || TextUtils.equals(str, "square-live-circle") || TextUtils.equals(str, "fakePlayground") || TextUtils.equals(str, "square-curated")) ? false : true);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ String m190005U2() {
        return (String) m151646N2(new dts());
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m190006V2(Boolean bool) {
        this.f171503f.m151090z3();
    }
}
