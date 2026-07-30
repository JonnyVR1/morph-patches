package p153l;

import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.ChatBlockEnvelope;
import com.p051p1.mobile.putong.core.data.ChatBlockStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class m6n extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<HashMap<String, ChatBlockStatus>> f135016R = C22507a.m222759c(new HashMap());

    /* JADX INFO: renamed from: d3 */
    public C22421c<ChatBlockStatus> m157239d3(final String str) {
        return scheduled("chat_block_status_" + str, 0, new pcj() { // from class: l.j6n
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118572a.m157241f3(str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ ChatBlockStatus m157240e3(String str, ChatBlockEnvelope chatBlockEnvelope) {
        if (NullChecker.m82486a(chatBlockEnvelope)) {
            m157242g3(str, chatBlockEnvelope.data.status);
            return chatBlockEnvelope.data.status;
        }
        m157242g3(str, ChatBlockStatus.get(ChatBlockStatus.UNLOCKED));
        return ChatBlockStatus.get(ChatBlockStatus.UNLOCKED);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ C22421c m157241f3(final String str) {
        return qi20.m176656c(new pcj() { // from class: l.k6n
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32326m(str)).m209028b();
            }
        }, ChatBlockEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.l6n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130269a.m157240e3(str, (ChatBlockEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public void m157242g3(String str, ChatBlockStatus chatBlockStatus) {
        HashMap<String, ChatBlockStatus> mapM222761e = this.f135016R.m222761e();
        if (!NullChecker.m82486a(mapM222761e)) {
            mapM222761e = new HashMap<>();
        }
        mapM222761e.put(str, chatBlockStatus);
        this.f135016R.onNext(mapM222761e);
    }
}
