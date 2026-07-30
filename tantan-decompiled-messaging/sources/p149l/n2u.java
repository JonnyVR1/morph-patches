package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareMenuItemView;

/* JADX INFO: loaded from: classes13.dex */
public class n2u extends d1q<LiveSquareMenuItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BLiveMenuItem f136873a;

    /* JADX INFO: renamed from: b */
    public final int f136874b;

    public n2u(@NonNull BLiveMenuItem bLiveMenuItem, int i) {
        this.f136873a = bLiveMenuItem;
        this.f136874b = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSquareMenuItemView liveSquareMenuItemView) {
        super.mo70566u(liveSquareMenuItemView);
        liveSquareMenuItemView.m70911c(this.f136873a, this.f136874b);
        xdl0.m208345M0(liveSquareMenuItemView.f46343a, this.f136873a.isShowRedDots());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162671H0;
    }
}
