package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class dfo0 {
    /* JADX INFO: renamed from: b */
    public static C22421c<List<BLiveVoiceCampaign>> m115531b(@NonNull String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/intl-voicelive/live-campaigns")).m182288p().m182300c("source", "voice-room").m182300c("anchorUserID", str).m182301d(), "voice-campaign").map(new qcj() { // from class: l.cfo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.intlVoiceLiveCampaigns;
            }
        });
    }
}
