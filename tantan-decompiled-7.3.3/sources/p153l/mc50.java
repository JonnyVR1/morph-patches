package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class mc50 extends ou40 {
    public mc50(ew40 ew40Var, ajt ajtVar, bjt bjtVar) {
        super(ew40Var, ajtVar, bjtVar);
    }

    /* JADX INFO: renamed from: R2 */
    public static String m157912R2(oo2 oo2Var, String str) {
        if (oo2Var instanceof mc50) {
            mc50 mc50Var = (mc50) oo2Var;
            if (mc50Var.m157913S2() != null) {
                BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2 = mc50Var.m157913S2();
                Objects.requireNonNull(bLiveOfficialShowCurrentAnchorInfoM157913S2);
                return bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorId;
            }
        }
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: S2 */
    public BLiveOfficialShowCurrentAnchorInfo m157913S2() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo;
        BLive bLiveM122887c = m118363A2().mo122892l();
        if (bLiveM122887c == null || (bLiveOfficialShowCurrentAnchorInfo = bLiveM122887c.officialShowCurrentAnchorInfo) == null || TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.anchorId)) {
            return null;
        }
        return bLiveM122887c.officialShowCurrentAnchorInfo;
    }

    /* JADX INFO: renamed from: T2 */
    public void m157914T2(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        BLive bLiveM122887c = m118363A2().mo122892l();
        if (bLiveM122887c != null) {
            bLiveM122887c.officialShowCurrentAnchorInfo = bLiveOfficialShowCurrentAnchorInfo;
        }
        mo183431g(bLiveM122887c);
    }
}
