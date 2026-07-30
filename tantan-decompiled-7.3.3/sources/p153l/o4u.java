package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareMenuItemView;

/* JADX INFO: loaded from: classes9.dex */
public class o4u extends d3q<LiveSquareMenuItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BLiveMenuItem f145010a;

    /* JADX INFO: renamed from: b */
    public final int f145011b;

    public o4u(@NonNull BLiveMenuItem bLiveMenuItem, int i) {
        this.f145010a = bLiveMenuItem;
        this.f145011b = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveSquareMenuItemView liveSquareMenuItemView) {
        super.mo71749u(liveSquareMenuItemView);
        liveSquareMenuItemView.m72094c(this.f145010a, this.f145011b);
        bnl0.m105525M0(liveSquareMenuItemView.f47191a, this.f145010a.isShowRedDots());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193785H0;
    }
}
