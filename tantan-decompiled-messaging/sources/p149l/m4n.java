package p149l;

import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.ChatBlockEnvelope;
import com.p046p1.mobile.putong.core.data.ChatBlockStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class m4n extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<HashMap<String, ChatBlockStatus>> f131309R = C22392a.m221513c(new HashMap());

    /* JADX INFO: renamed from: d3 */
    public C22306c<ChatBlockStatus> m153051d3(final String str) {
        return scheduled("chat_block_status_" + str, 0, new v9j() { // from class: l.j4n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f116206a.m153053f3(str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ ChatBlockStatus m153052e3(String str, ChatBlockEnvelope chatBlockEnvelope) {
        if (NullChecker.m81303a(chatBlockEnvelope)) {
            m153054g3(str, chatBlockEnvelope.data.status);
            return chatBlockEnvelope.data.status;
        }
        m153054g3(str, ChatBlockStatus.get(ChatBlockStatus.UNLOCKED));
        return ChatBlockStatus.get(ChatBlockStatus.UNLOCKED);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ C22306c m153053f3(final String str) {
        return ia20.m135119c(new v9j() { // from class: l.k4n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31323m(str)).m185883b();
            }
        }, ChatBlockEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.l4n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126044a.m153052e3(str, (ChatBlockEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public void m153054g3(String str, ChatBlockStatus chatBlockStatus) {
        HashMap<String, ChatBlockStatus> mapM221515e = this.f131309R.m221515e();
        if (!NullChecker.m81303a(mapM221515e)) {
            mapM221515e = new HashMap<>();
        }
        mapM221515e.put(str, chatBlockStatus);
        this.f131309R.m132487l(mapM221515e);
    }
}
