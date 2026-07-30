package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class ikn {
    /* JADX INFO: renamed from: b */
    public static C22421c<List<BLiveGameOperationConfig>> m140413b(@NonNull String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/intl-game-operation/configs")).m182288p().m182300c("liveType", str).m182301d(), "intl-game-operation").map(new qcj() { // from class: l.hkn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.gameOperationPositions;
            }
        });
    }
}
