package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class ywn extends txs {

    /* JADX INFO: renamed from: f */
    public rkn f201848f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f201849g;

    public ywn(ner nerVar, nus nusVar, VFrame vFrame) {
        super(nerVar, nusVar);
        this.f201849g = vFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ String m217622S2() {
        return (String) m160243N2(new evs());
    }

    /* JADX INFO: renamed from: R2 */
    public void m217623R2(ViewGroup viewGroup, egj0 egj0Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, qa00.f156321h, qa00.m175859d(9.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        IntlGameOperationView intlGameOperationView = (IntlGameOperationView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193790J, viewGroup, false);
        intlGameOperationView.setLayoutParams(layoutParams);
        viewGroup.addView(intlGameOperationView);
        rkn rknVar = new rkn(this.lifecycleProviderImpl, m160239H2(), true);
        this.f201848f = rknVar;
        rknVar.mo52715C(intlGameOperationView);
        this.f201848f.mo70284I2();
        this.f201848f.m181869U2();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m217623R2(this.f201849g, new egj0() { // from class: l.xwn
            @Override // p153l.egj0
            /* JADX INFO: renamed from: v */
            public final String mo70128v() {
                return this.f196514a.m217622S2();
            }
        });
    }
}
