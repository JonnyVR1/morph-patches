package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class z5o0 {
    /* JADX INFO: renamed from: b */
    public static C22306c<List<BLiveVoiceCampaign>> m217367b(@NonNull String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/intl-voicelive/live-campaigns")).m107524p().m107536c("source", "voice-room").m107536c("anchorUserID", str).m107537d(), "voice-campaign").map(new w9j() { // from class: l.y5o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.intlVoiceLiveCampaigns;
            }
        });
    }
}
