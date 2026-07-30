package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class iin {
    /* JADX INFO: renamed from: b */
    public static C22306c<List<BLiveGameOperationConfig>> m136425b(@NonNull String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/intl-game-operation/configs")).m107524p().m107536c("liveType", str).m107537d(), "intl-game-operation").map(new w9j() { // from class: l.hin
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.gameOperationPositions;
            }
        });
    }
}
