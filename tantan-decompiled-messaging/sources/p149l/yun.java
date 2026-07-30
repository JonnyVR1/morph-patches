package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class yun extends svs {

    /* JADX INFO: renamed from: f */
    public rin f200102f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f200103g;

    public yun(mcr mcrVar, mss mssVar, VFrame vFrame) {
        super(mcrVar, mssVar);
        this.f200103g = vFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ String m216131S2() {
        return (String) m151646N2(new dts());
    }

    /* JADX INFO: renamed from: R2 */
    public void m216132R2(ViewGroup viewGroup, a7j0 a7j0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, t100.f167259h, t100.m186890d(9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        IntlGameOperationView intlGameOperationView = (IntlGameOperationView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162676J, viewGroup, false);
        intlGameOperationView.setLayoutParams(layoutParams);
        viewGroup.addView(intlGameOperationView);
        rin rinVar = new rin(this.lifecycleProviderImpl, m151643H2(), true);
        this.f200102f = rinVar;
        rinVar.mo51532C(intlGameOperationView);
        this.f200102f.mo69101I2();
        this.f200102f.m179524U2();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m216132R2(this.f200103g, new a7j0() { // from class: l.xun
            @Override // p149l.a7j0
            /* JADX INFO: renamed from: v */
            public final String mo68945v() {
                return this.f194532a.m216131S2();
            }
        });
    }
}
