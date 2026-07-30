package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.intl.livesquare.admob.IntlLiveSquareFeedNativeAdView;

/* JADX INFO: loaded from: classes13.dex */
public class n2o extends d1q<IntlLiveSquareFeedNativeAdView> {

    /* JADX INFO: renamed from: a */
    public View f136862a;

    /* JADX INFO: renamed from: b */
    public int f136863b;

    /* JADX INFO: renamed from: c */
    public Act f136864c;

    public n2o(View view, int i, Act act) {
        this.f136862a = view;
        this.f136864c = act;
        this.f136863b = m157673J(i);
    }

    /* JADX INFO: renamed from: J */
    public static int m157673J(int i) {
        int i2 = t100.f167259h;
        return i <= 0 ? xdl0.m208412y0() - i2 : ((xdl0.m208412y0() - ((i + 1) * i2)) / i) + i2;
    }

    /* JADX INFO: renamed from: H */
    public void m157674H(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        xdl0.m208325C0(intlLiveSquareFeedNativeAdView, this.f136863b);
        xdl0.m208327D0(this.f136863b, intlLiveSquareFeedNativeAdView);
        uep0.m193326m(intlLiveSquareFeedNativeAdView, t100.f167260i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        super.mo70999m(intlLiveSquareFeedNativeAdView);
        m157674H(intlLiveSquareFeedNativeAdView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        super.mo70566u(intlLiveSquareFeedNativeAdView);
        intlLiveSquareFeedNativeAdView.m69965b(this.f136862a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162718X;
    }
}
