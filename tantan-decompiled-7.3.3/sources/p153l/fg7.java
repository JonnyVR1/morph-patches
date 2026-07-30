package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class fg7 extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f98890R;

    /* JADX INFO: renamed from: S */
    public C22508b<Boolean> f98891S;

    public fg7(C4883c c4883c) {
        super(c4883c);
        this.f98891S = C22508b.m222767b();
        this.f98890R = new jxd0("CHAT_HELPER_CLICKED_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<uxj0> m125488g3(final ChatAssistantQuestionPostBody chatAssistantQuestionPostBody) {
        return CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue() ? C22421c.just(uxj0.f181467a) : scheduled("chat-assistant-questions", -1, new pcj() { // from class: l.cg7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.dg7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(C4879a.m32214I2("/chat-assistant-questions")).m209038l(z1d0.create(Network.JSON, chatAssistantQuestionPostBody.toJson())).m209028b();
                    }
                }).map(new qcj() { // from class: l.eg7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<List<ChatAssistantQuestion>> m125489h3(String str) {
        return m125490i3(str, "");
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<List<ChatAssistantQuestion>> m125490i3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(null);
        }
        final String str3 = C4879a.m32214I2("/chat-assistant-questions?scene=") + str;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "&ids=" + str2;
        }
        return this.f91137Q.scheduled(str3, 0, new pcj() { // from class: l.zf7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ag7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.bg7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).chatAssistantQuestions;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }
}
