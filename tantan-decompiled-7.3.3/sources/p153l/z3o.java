package p153l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.external.intl.livesquare.admob.IntlLiveSquareFeedBannerAdView;

/* JADX INFO: loaded from: classes9.dex */
public class z3o extends d8o<IntlLiveSquareFeedBannerAdView> implements d6m {

    /* JADX INFO: renamed from: b */
    public View f202845b;

    /* JADX INFO: renamed from: c */
    public int f202846c;

    public z3o(View view, int i) {
        this.f202845b = view;
        this.f202846c = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareFeedBannerAdView intlLiveSquareFeedBannerAdView) {
        super.mo71749u(intlLiveSquareFeedBannerAdView);
        intlLiveSquareFeedBannerAdView.m71146b(this.f202845b);
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        c0595c.m3577i(true);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193829W;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return this.f202846c;
    }
}
