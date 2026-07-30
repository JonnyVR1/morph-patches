package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareNearbyItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class q7o extends z0u<IntlLiveSquareNearbyItemView> implements p4u {

    /* JADX INFO: renamed from: j */
    public final BLiveSuggestLabel f155996j;

    public q7o(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, BLiveSuggestLabel bLiveSuggestLabel, int i2) {
        super(bLiveSuggestLive, bLiveSettings, i, i2);
        this.f155996j = bLiveSuggestLabel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[DONT_GENERATE, SYNTHETIC] */
    @Override // p153l.z0u
    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo103115K() {
        String strM209914x = xau.m209914x(this.f202383a.anchor.location);
        if (strM209914x == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.distance = strM209914x;
        BLiveSuggestLive bLiveSuggestLive = this.f202383a;
        bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
        bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
        if (NullChecker.m82486a(this.f155996j)) {
            bLiveTrackShowLabelNew_.label_name = this.f155996j.value;
        }
        if (!jyb.m147479J(this.f202383a.coverLabelsV2)) {
            int i = 0;
            while (true) {
                int size = this.f202383a.coverLabelsV2.size();
                BLiveSuggestLive bLiveSuggestLive2 = this.f202383a;
                if (i < size) {
                    String str = bLiveSuggestLive2.coverLabelsV2.get(i).type;
                    str.getClass();
                    byte b = -1;
                    switch (str) {
                        case "A":
                            b = 0;
                        case "B":
                            b = 1;
                        case "C":
                            b = 2;
                        default:
                            switch (b) {
                                case 0:
                                    bLiveTrackShowLabelNew_.label_name = this.f202383a.coverLabelsV2.get(i).name;
                                    break;
                                case 1:
                                    bLiveTrackShowLabelNew_.label_name_custom = this.f202383a.coverLabelsV2.get(i).name;
                                    break;
                                case 2:
                                    bLiveTrackShowLabelNew_.label_name_fixed = this.f202383a.coverLabelsV2.get(i).name;
                                    break;
                            }
                    }
                } else {
                    bLiveTrackShowLabelNew_.have_red_packet = dwn.m118418e(bLiveSuggestLive2.coverLabelsV2);
                }
            }
        }
        return bLiveTrackShowLabelNew_;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo72182m(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        bnl0.m105505C0(intlLiveSquareNearbyItemView.f46677a, this.f202389g);
        wlj hierarchy = intlLiveSquareNearbyItemView.f46677a.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m207041D(nbc0.f141188p0);
        }
        intlLiveSquareNearbyItemView.f46677a.setRadius(qa00.f156322i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        BLiveSettings bLiveSettings;
        super.mo71749u(intlLiveSquareNearbyItemView);
        if (this.f202383a.room != null) {
            SimpleDraweeView simpleDraweeView = intlLiveSquareNearbyItemView.f46677a.getSimpleDraweeView();
            String str = this.f202383a.room.coverUrl;
            int i = this.f202389g;
            izs.m142870u("context_square", simpleDraweeView, str, i, i);
        }
        intlLiveSquareNearbyItemView.m71538c(this.f202383a.memberCount);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.f202383a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            intlLiveSquareNearbyItemView.setDistance(bLiveSuggestLiveAnchor.location);
            intlLiveSquareNearbyItemView.setLiveName(this.f202383a.anchor.name);
        }
        BLiveSuggestLabel bLiveSuggestLabel = this.f202383a.basicLabel;
        if (bLiveSuggestLabel == null || (bLiveSettings = this.f202384b) == null) {
            intlLiveSquareNearbyItemView.m71540e(null, this.f202384b);
        } else {
            intlLiveSquareNearbyItemView.m71540e(bLiveSuggestLabel, bLiveSettings);
        }
        intlLiveSquareNearbyItemView.m71541f(!this.f202383a.isOnLive());
        if (this.f155996j == null || !jyb.m147479J(this.f202383a.coverLabelsV2)) {
            intlLiveSquareNearbyItemView.f46679c.m71525c();
        } else {
            intlLiveSquareNearbyItemView.f46679c.m71526d(this.f155996j, this.f202384b);
        }
        bnl0.m105524M(intlLiveSquareNearbyItemView.f46680d, !jyb.m147479J(this.f202383a.coverLabelsV2));
        if (jyb.m147479J(this.f202383a.coverLabelsV2)) {
            return;
        }
        intlLiveSquareNearbyItemView.f46680d.m69940O(this.f202383a.coverLabelsV2);
    }

    @Override // p153l.z0u, p153l.d3q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo72183w(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        super.mo72183w(intlLiveSquareNearbyItemView);
        intlLiveSquareNearbyItemView.f46677a.m69958q();
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo175699N(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        intlLiveSquareNearbyItemView.f46677a.m69955n(this.f202383a.videoCaptureUrl);
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo175700O(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        intlLiveSquareNearbyItemView.f46677a.m69958q();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193838Z;
    }
}
