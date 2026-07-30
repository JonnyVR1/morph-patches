package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareNearbyItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class q5o extends yyt<IntlLiveSquareNearbyItemView> implements o2u {

    /* JADX INFO: renamed from: j */
    public final BLiveSuggestLabel f152816j;

    public q5o(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, BLiveSuggestLabel bLiveSuggestLabel, int i2) {
        super(bLiveSuggestLive, bLiveSettings, i, i2);
        this.f152816j = bLiveSuggestLabel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[DONT_GENERATE, SYNTHETIC] */
    @Override // p149l.yyt
    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo100692K() {
        String strM202221x = w8u.m202221x(this.f200806a.anchor.location);
        if (strM202221x == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.distance = strM202221x;
        BLiveSuggestLive bLiveSuggestLive = this.f200806a;
        bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
        bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
        if (NullChecker.m81303a(this.f152816j)) {
            bLiveTrackShowLabelNew_.label_name = this.f152816j.value;
        }
        if (!vwb.m200296J(this.f200806a.coverLabelsV2)) {
            int i = 0;
            while (true) {
                int size = this.f200806a.coverLabelsV2.size();
                BLiveSuggestLive bLiveSuggestLive2 = this.f200806a;
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
                                    bLiveTrackShowLabelNew_.label_name = this.f200806a.coverLabelsV2.get(i).name;
                                    break;
                                case 1:
                                    bLiveTrackShowLabelNew_.label_name_custom = this.f200806a.coverLabelsV2.get(i).name;
                                    break;
                                case 2:
                                    bLiveTrackShowLabelNew_.label_name_fixed = this.f200806a.coverLabelsV2.get(i).name;
                                    break;
                            }
                    }
                } else {
                    bLiveTrackShowLabelNew_.have_red_packet = dun.m113739e(bLiveSuggestLive2.coverLabelsV2);
                }
            }
        }
        return bLiveTrackShowLabelNew_;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo70999m(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        xdl0.m208325C0(intlLiveSquareNearbyItemView.f45829a, this.f200812g);
        djj hierarchy = intlLiveSquareNearbyItemView.f45829a.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m112049D(h3c0.f105697p0);
        }
        intlLiveSquareNearbyItemView.f45829a.setRadius(t100.f167260i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        BLiveSettings bLiveSettings;
        super.mo70566u(intlLiveSquareNearbyItemView);
        if (this.f200806a.room != null) {
            SimpleDraweeView simpleDraweeView = intlLiveSquareNearbyItemView.f45829a.getSimpleDraweeView();
            String str = this.f200806a.room.coverUrl;
            int i = this.f200812g;
            hxs.m133408u("context_square", simpleDraweeView, str, i, i);
        }
        intlLiveSquareNearbyItemView.m70355c(this.f200806a.memberCount);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.f200806a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            intlLiveSquareNearbyItemView.setDistance(bLiveSuggestLiveAnchor.location);
            intlLiveSquareNearbyItemView.setLiveName(this.f200806a.anchor.name);
        }
        BLiveSuggestLabel bLiveSuggestLabel = this.f200806a.basicLabel;
        if (bLiveSuggestLabel == null || (bLiveSettings = this.f200807b) == null) {
            intlLiveSquareNearbyItemView.m70357e(null, this.f200807b);
        } else {
            intlLiveSquareNearbyItemView.m70357e(bLiveSuggestLabel, bLiveSettings);
        }
        intlLiveSquareNearbyItemView.m70358f(!this.f200806a.isOnLive());
        if (this.f152816j == null || !vwb.m200296J(this.f200806a.coverLabelsV2)) {
            intlLiveSquareNearbyItemView.f45831c.m70342c();
        } else {
            intlLiveSquareNearbyItemView.f45831c.m70343d(this.f152816j, this.f200807b);
        }
        xdl0.m208344M(intlLiveSquareNearbyItemView.f45832d, !vwb.m200296J(this.f200806a.coverLabelsV2));
        if (vwb.m200296J(this.f200806a.coverLabelsV2)) {
            return;
        }
        intlLiveSquareNearbyItemView.f45832d.m68757O(this.f200806a.coverLabelsV2);
    }

    @Override // p149l.yyt, p149l.d1q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo71000w(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        super.mo71000w(intlLiveSquareNearbyItemView);
        intlLiveSquareNearbyItemView.f45829a.m68775q();
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo173091N(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        intlLiveSquareNearbyItemView.f45829a.m68772n(this.f200806a.videoCaptureUrl);
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo173092O(IntlLiveSquareNearbyItemView intlLiveSquareNearbyItemView) {
        intlLiveSquareNearbyItemView.f45829a.m68775q();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162724Z;
    }
}
