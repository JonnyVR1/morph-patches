package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x350 extends am40 {
    public x350(qn40 qn40Var, zgt zgtVar, aht ahtVar) {
        super(qn40Var, zgtVar, ahtVar);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m25673R2(ho2 ho2Var, String str) {
        if (ho2Var instanceof x350) {
            x350 x350Var = (x350) ho2Var;
            if (x350Var.m25674S2() != null) {
                BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2 = x350Var.m25674S2();
                Objects.requireNonNull(bLiveOfficialShowCurrentAnchorInfoM25674S2);
                return bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorId;
            }
        }
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: S2 */
    public BLiveOfficialShowCurrentAnchorInfo m25674S2() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo;
        BLive bLiveMo19690l = m20501A2().mo19690l();
        if (bLiveMo19690l == null || (bLiveOfficialShowCurrentAnchorInfo = bLiveMo19690l.officialShowCurrentAnchorInfo) == null || TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.anchorId)) {
            return null;
        }
        return bLiveMo19690l.officialShowCurrentAnchorInfo;
    }

    /* JADX INFO: renamed from: T2 */
    public void m25675T2(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        BLive bLiveMo19690l = m20501A2().mo19690l();
        if (bLiveMo19690l != null) {
            bLiveMo19690l.officialShowCurrentAnchorInfo = bLiveOfficialShowCurrentAnchorInfo;
        }
        m17232g(bLiveMo19690l);
    }
}
