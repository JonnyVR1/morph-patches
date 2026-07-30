package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.intl.livesquare.admob.IntlLiveSquareFeedNativeAdView;

/* JADX INFO: loaded from: classes9.dex */
public class n4o extends d3q<IntlLiveSquareFeedNativeAdView> {

    /* JADX INFO: renamed from: a */
    public View f140246a;

    /* JADX INFO: renamed from: b */
    public int f140247b;

    /* JADX INFO: renamed from: c */
    public Act f140248c;

    public n4o(View view, int i, Act act) {
        this.f140246a = view;
        this.f140248c = act;
        this.f140247b = m161565J(i);
    }

    /* JADX INFO: renamed from: J */
    public static int m161565J(int i) {
        int i2 = qa00.f156321h;
        return i <= 0 ? bnl0.m105592y0() - i2 : ((bnl0.m105592y0() - ((i + 1) * i2)) / i) + i2;
    }

    /* JADX INFO: renamed from: H */
    public void m161566H(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        bnl0.m105505C0(intlLiveSquareFeedNativeAdView, this.f140247b);
        bnl0.m105507D0(this.f140247b, intlLiveSquareFeedNativeAdView);
        ynp0.m216936m(intlLiveSquareFeedNativeAdView, qa00.f156322i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        super.mo72182m(intlLiveSquareFeedNativeAdView);
        m161566H(intlLiveSquareFeedNativeAdView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareFeedNativeAdView intlLiveSquareFeedNativeAdView) {
        super.mo71749u(intlLiveSquareFeedNativeAdView);
        intlLiveSquareFeedNativeAdView.m71148b(this.f140246a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193832X;
    }
}
