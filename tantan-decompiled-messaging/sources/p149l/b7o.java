package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b7o<V extends View> extends yyt<V> implements o2u {
    public b7o(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, int i2) {
        super(bLiveSuggestLive, bLiveSettings, i, i2);
    }

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
        BLiveSuggestLive bLiveSuggestLive2 = this.f200806a;
        BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive2.specialLabel;
        bLiveTrackShowLabelNew_.label_name = bLiveSuggestLabel == null ? "" : bLiveSuggestLabel.value;
        bLiveTrackShowLabelNew_.have_red_packet = "0";
        if (vwb.m200296J(bLiveSuggestLive2.coverLabelsV2)) {
            List<BLiveCoverLabel> list = this.f200806a.coverLabels;
            if (list != null && list.size() > 0) {
                int i = 0;
                while (true) {
                    int size = this.f200806a.coverLabels.size();
                    BLiveSuggestLive bLiveSuggestLive3 = this.f200806a;
                    if (i < size) {
                        String str = bLiveSuggestLive3.coverLabels.get(i).type;
                        str.getClass();
                        switch (str) {
                            case "A":
                                bLiveTrackShowLabelNew_.label_name = this.f200806a.coverLabels.get(i).name;
                                break;
                            case "B":
                                bLiveTrackShowLabelNew_.label_name_top = this.f200806a.coverLabels.get(i).name;
                                break;
                            case "C":
                                bLiveTrackShowLabelNew_.label_name_sp = this.f200806a.coverLabels.get(i).name;
                                break;
                            case "D":
                                bLiveTrackShowLabelNew_.label_name_tool = this.f200806a.coverLabels.get(i).name;
                                break;
                            case "E":
                                bLiveTrackShowLabelNew_.state_label = this.f200806a.coverLabels.get(i).name;
                                break;
                        }
                        i++;
                    } else {
                        bLiveTrackShowLabelNew_.have_red_packet = dun.m113739e(bLiveSuggestLive3.coverLabels);
                    }
                }
            }
            return bLiveTrackShowLabelNew_;
        }
        int i2 = 0;
        while (true) {
            int size2 = this.f200806a.coverLabelsV2.size();
            BLiveSuggestLive bLiveSuggestLive4 = this.f200806a;
            if (i2 >= size2) {
                bLiveTrackShowLabelNew_.have_red_packet = dun.m113739e(bLiveSuggestLive4.coverLabelsV2);
                return bLiveTrackShowLabelNew_;
            }
            String str2 = bLiveSuggestLive4.coverLabelsV2.get(i2).type;
            str2.getClass();
            switch (str2) {
                case "A":
                    bLiveTrackShowLabelNew_.label_name = this.f200806a.coverLabelsV2.get(i2).name;
                    break;
                case "B":
                    bLiveTrackShowLabelNew_.label_name_custom = this.f200806a.coverLabelsV2.get(i2).name;
                    break;
                case "C":
                    bLiveTrackShowLabelNew_.label_name_fixed = this.f200806a.coverLabelsV2.get(i2).name;
                    break;
            }
            i2++;
        }
    }
}
