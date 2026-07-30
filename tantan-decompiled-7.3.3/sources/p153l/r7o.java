package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareMenuItemView;

/* JADX INFO: loaded from: classes9.dex */
public class r7o extends d3q<IntlLiveSquareMenuItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BLiveMenuItem f161626a;

    /* JADX INFO: renamed from: b */
    public final int f161627b;

    public r7o(@NonNull BLiveMenuItem bLiveMenuItem, int i) {
        this.f161626a = bLiveMenuItem;
        this.f161627b = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareMenuItemView intlLiveSquareMenuItemView) {
        super.mo71749u(intlLiveSquareMenuItemView);
        intlLiveSquareMenuItemView.m71535c(this.f161626a, this.f161627b);
        bnl0.m105525M0(intlLiveSquareMenuItemView.f46674a, this.f161626a.isShowRedDots());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193814R;
    }
}
