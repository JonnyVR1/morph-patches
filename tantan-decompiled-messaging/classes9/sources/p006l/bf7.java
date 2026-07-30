package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import java.util.List;
import l.hpd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bf7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f8858R;

    /* JADX INFO: renamed from: S */
    public b<Boolean> f8859S;

    public bf7(C0158c c0158c) {
        super(c0158c);
        this.f8859S = b.b();
        this.f8858R = new hpd0("CHAT_HELPER_CLICKED_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g3 */
    public c<roj0> m12618g3(final ChatAssistantQuestionPostBody chatAssistantQuestionPostBody) {
        return ((Boolean) CoreModule.f1534c.f3628e0.f19079s2.get()).booleanValue() ? c.just(roj0.a) : scheduled("chat-assistant-questions", -1, new v9j() { // from class: l.ye7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ze7
                    public final Object call() {
                        return qib0.f19784H.auth().q(C0154a.m3141I2("/chat-assistant-questions")).l(utc0.create(Network.JSON, chatAssistantQuestionPostBody.toJson())).b();
                    }
                }).map(new w9j() { // from class: l.af7
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public c<List<ChatAssistantQuestion>> m12619h3(String str) {
        return m12620i3(str, "");
    }

    /* JADX INFO: renamed from: i3 */
    public c<List<ChatAssistantQuestion>> m12620i3(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return c.just((Object) null);
        }
        final String str3 = C0154a.m3141I2("/chat-assistant-questions?scene=") + str;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "&ids=" + str2;
        }
        return this.f8580Q.scheduled(str3, 0, new v9j() { // from class: l.ve7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.we7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.xe7
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).chatAssistantQuestions;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }
}
