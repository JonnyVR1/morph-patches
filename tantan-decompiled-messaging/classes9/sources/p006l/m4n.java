package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.ChatBlockEnvelope;
import com.p1.mobile.putong.core.data.ChatBlockStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class m4n extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<HashMap<String, ChatBlockStatus>> f16796R = a.c(new HashMap());

    /* JADX INFO: renamed from: d3 */
    public c<ChatBlockStatus> m19120d3(final String str) {
        return scheduled("chat_block_status_" + str, 0, new v9j() { // from class: l.j4n
            public final Object call() {
                return this.f14996a.m19122f3(str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ ChatBlockStatus m19121e3(String str, ChatBlockEnvelope chatBlockEnvelope) {
        if (NullChecker.a(chatBlockEnvelope)) {
            m19123g3(str, chatBlockEnvelope.data.status);
            return chatBlockEnvelope.data.status;
        }
        m19123g3(str, ChatBlockStatus.get("UNLOCKED"));
        return ChatBlockStatus.get("UNLOCKED");
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ c m19122f3(final String str) {
        return ia20.m16569c(new v9j() { // from class: l.k4n
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3253m(str)).b();
            }
        }, ChatBlockEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.l4n
            public final Object call(Object obj) {
                return this.f16227a.m19121e3(str, (ChatBlockEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public void m19123g3(String str, ChatBlockStatus chatBlockStatus) {
        HashMap map = (HashMap) this.f16796R.e();
        if (!NullChecker.a(map)) {
            map = new HashMap();
        }
        map.put(str, chatBlockStatus);
        this.f16796R.onNext(map);
    }
}
