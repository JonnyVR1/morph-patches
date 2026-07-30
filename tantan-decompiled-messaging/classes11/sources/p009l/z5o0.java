package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import java.util.List;
import l.cll;
import l.w9j;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class z5o0 {
    /* JADX INFO: renamed from: b */
    public static c<List<BLiveVoiceCampaign>> m25614b(@NonNull String str) {
        return upv.m23155w(cll.l(ytr.b("/intl-voicelive/live-campaigns")).p().c("source", "voice-room").c("anchorUserID", str).d(), "voice-campaign").map(new w9j() { // from class: l.y5o0
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.intlVoiceLiveCampaigns;
            }
        });
    }
}
