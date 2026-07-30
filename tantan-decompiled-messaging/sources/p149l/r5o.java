package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareMenuItemView;

/* JADX INFO: loaded from: classes13.dex */
public class r5o extends d1q<IntlLiveSquareMenuItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BLiveMenuItem f157859a;

    /* JADX INFO: renamed from: b */
    public final int f157860b;

    public r5o(@NonNull BLiveMenuItem bLiveMenuItem, int i) {
        this.f157859a = bLiveMenuItem;
        this.f157860b = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareMenuItemView intlLiveSquareMenuItemView) {
        super.mo70566u(intlLiveSquareMenuItemView);
        intlLiveSquareMenuItemView.m70352c(this.f157859a, this.f157860b);
        xdl0.m208345M0(intlLiveSquareMenuItemView.f45826a, this.f157859a.isShowRedDots());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162700R;
    }
}
