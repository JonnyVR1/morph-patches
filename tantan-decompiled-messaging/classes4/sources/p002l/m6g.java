package p002l;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m6g {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveFanBaseDetail f15251a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BLiveFanBaseHierarchy f15252b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BLiveFanBaseMedal f15253c;

    public m6g(BLiveEnvelope bLiveEnvelope, final String str) {
        this.f15251a = (BLiveFanBaseDetail) vwb.r(bLiveEnvelope.data.fanbaseDetails, new w9j() { // from class: l.k6g
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseDetail) obj).id.equals(str));
            }
        });
        this.f15252b = (BLiveFanBaseHierarchy) vwb.r(bLiveEnvelope.data.fanbaseHierarchies, new w9j() { // from class: l.l6g
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseHierarchy) obj).fanbaseId.equals(str));
            }
        });
        if (vwb.J(bLiveEnvelope.data.fanbaseMedals)) {
            this.f15253c = null;
        } else {
            this.f15253c = (BLiveFanBaseMedal) bLiveEnvelope.data.fanbaseMedals.get(0);
        }
    }
}
