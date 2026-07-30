package p149l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.external.intl.livesquare.admob.IntlLiveSquareFeedBannerAdView;

/* JADX INFO: loaded from: classes13.dex */
public class z1o extends d6o<IntlLiveSquareFeedBannerAdView> implements m3m {

    /* JADX INFO: renamed from: b */
    public View f201086b;

    /* JADX INFO: renamed from: c */
    public int f201087c;

    public z1o(View view, int i) {
        this.f201086b = view;
        this.f201087c = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareFeedBannerAdView intlLiveSquareFeedBannerAdView) {
        super.mo70566u(intlLiveSquareFeedBannerAdView);
        intlLiveSquareFeedBannerAdView.m69963b(this.f201086b);
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        c0593c.m3576i(true);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162715W;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return this.f201087c;
    }
}
