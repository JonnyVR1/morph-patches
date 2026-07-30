package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class x350 extends am40 {
    public x350(qn40 qn40Var, zgt zgtVar, aht ahtVar) {
        super(qn40Var, zgtVar, ahtVar);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m206896R2(ho2 ho2Var, String str) {
        if (ho2Var instanceof x350) {
            x350 x350Var = (x350) ho2Var;
            if (x350Var.m206897S2() != null) {
                BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2 = x350Var.m206897S2();
                Objects.requireNonNull(bLiveOfficialShowCurrentAnchorInfoM206897S2);
                return bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorId;
            }
        }
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: S2 */
    public BLiveOfficialShowCurrentAnchorInfo m206897S2() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo;
        BLive bLiveM175585c = m170393A2().mo165470l();
        if (bLiveM175585c == null || (bLiveOfficialShowCurrentAnchorInfo = bLiveM175585c.officialShowCurrentAnchorInfo) == null || TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.anchorId)) {
            return null;
        }
        return bLiveM175585c.officialShowCurrentAnchorInfo;
    }

    /* JADX INFO: renamed from: T2 */
    public void m206898T2(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        BLive bLiveM175585c = m170393A2().mo165470l();
        if (bLiveM175585c != null) {
            bLiveM175585c.officialShowCurrentAnchorInfo = bLiveOfficialShowCurrentAnchorInfo;
        }
        mo149811g(bLiveM175585c);
    }
}
