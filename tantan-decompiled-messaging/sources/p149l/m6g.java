package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;

/* JADX INFO: loaded from: classes4.dex */
public class m6g {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveFanBaseDetail f131680a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BLiveFanBaseHierarchy f131681b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BLiveFanBaseMedal f131682c;

    public m6g(BLiveEnvelope bLiveEnvelope, final String str) {
        this.f131680a = (BLiveFanBaseDetail) vwb.m200346r(bLiveEnvelope.data.fanbaseDetails, new w9j() { // from class: l.k6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseDetail) obj).f44364id.equals(str));
            }
        });
        this.f131681b = (BLiveFanBaseHierarchy) vwb.m200346r(bLiveEnvelope.data.fanbaseHierarchies, new w9j() { // from class: l.l6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseHierarchy) obj).fanbaseId.equals(str));
            }
        });
        if (vwb.m200296J(bLiveEnvelope.data.fanbaseMedals)) {
            this.f131682c = null;
        } else {
            this.f131682c = bLiveEnvelope.data.fanbaseMedals.get(0);
        }
    }
}
