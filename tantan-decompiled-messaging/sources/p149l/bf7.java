package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class bf7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f75277R;

    /* JADX INFO: renamed from: S */
    public C22393b<Boolean> f75278S;

    public bf7(C4732c c4732c) {
        super(c4732c);
        this.f75278S = C22393b.m221521b();
        this.f75277R = new hpd0("CHAT_HELPER_CLICKED_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<roj0> m101521g3(final ChatAssistantQuestionPostBody chatAssistantQuestionPostBody) {
        return CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue() ? C22306c.just(roj0.f160388a) : scheduled("chat-assistant-questions", -1, new v9j() { // from class: l.ye7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ze7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(C4728a.m31211I2("/chat-assistant-questions")).m185893l(utc0.create(Network.JSON, chatAssistantQuestionPostBody.toJson())).m185883b();
                    }
                }).map(new w9j() { // from class: l.af7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<List<ChatAssistantQuestion>> m101522h3(String str) {
        return m101523i3(str, "");
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<List<ChatAssistantQuestion>> m101523i3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(null);
        }
        final String str3 = C4728a.m31211I2("/chat-assistant-questions?scene=") + str;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "&ids=" + str2;
        }
        return this.f72126Q.scheduled(str3, 0, new v9j() { // from class: l.ve7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.we7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.xe7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).chatAssistantQuestions;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }
}
