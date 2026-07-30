package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationInstantChat;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m88121d2 = {"Ll/sd8;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "y3", "()V", "", "w3", "()Z", "", "otherUid", "needDeleteLocal", "Lrx/c;", "o3", "(Ljava/lang/String;Z)Lrx/c;", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/data/ConversationInstantChat;", "instantChat", "s3", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)V", "m3", "Lcom/p1/mobile/putong/core/data/Conversation;", "conversation", "x3", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "t3", "(Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)Ljava/lang/String;", "userId", "", "lastTime", "userType", xi5.API_VERSION_V3, "(Ljava/lang/String;JLjava/lang/String;)V", "conversationId", "n3", "(Ljava/lang/String;)V", "R", "Ljava/lang/String;", "INSTANT_CHAT_GUIDE_USER_TYPE_1", p7f.LATITUDE_SOUTH, "INSTANT_CHAT_GUIDE_USER_TYPE_2", p7f.GPS_DIRECTION_TRUE, "INSTANT_CHAT_GUIDE_USER_TYPE_3", "U", "J", "lastCallRefreshInstantChatGuideApiTime", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "I", "minute", "W", "secondDebug", "Ll/jxd0;", "X", "Ll/jxd0;", "u3", "()Ll/jxd0;", "needDelLocalInstantChatGuideConversation", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sd8 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final String INSTANT_CHAT_GUIDE_USER_TYPE_1;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final String INSTANT_CHAT_GUIDE_USER_TYPE_2;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final String INSTANT_CHAT_GUIDE_USER_TYPE_3;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public long lastCallRefreshInstantChatGuideApiTime;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final int minute;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final int secondDebug;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public final jxd0 needDelLocalInstantChatGuideConversation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd8(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.INSTANT_CHAT_GUIDE_USER_TYPE_1 = "1";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_2 = "2";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_3 = "3";
        this.minute = HuiYanResultSender.TIMEOUT_MS;
        this.secondDebug = 10000;
        this.needDelLocalInstantChatGuideConversation = new jxd0("need_del_local_instant_chat_guide_conversation_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Envelope m185429A3(sd8 sd8Var, Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        list.getClass();
        ConversationInstantChat conversationInstantChat = ((CoreData) envelope.getModuleData(CoreData.class)).instantChat;
        if (jyb.m147479J(list)) {
            sd8Var.m185447m3();
            return envelope;
        }
        sd8Var.f91137Q.m32495w3(envelope, null);
        sd8Var.m185450s3(list.get(0), conversationInstantChat);
        return envelope;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Envelope m185430B3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static void m185431a3(long j, String str, String str2) {
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = "fake_conversation_local_instant_chat_conversation";
        double d = j;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.otherUser = str;
        conversationNew_.localExtraInfo = str2;
        conversationNew_.convType = ConversationType.local_instant_chat_guide;
        CoreModule.f18264c.f20384f0.m34053mq(conversationNew_);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m185433c3(final sd8 sd8Var) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.kd8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sd8.m185446z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.ld8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sd8.m185429A3(this.f131422a, (Envelope) obj);
            }
        };
        return c22421cM176658e.map(new qcj() { // from class: l.md8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sd8.m185430B3(function1, obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: f3 */
    public static C22421c m185436f3(final boolean z, final sd8 sd8Var) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.od8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sd8.m185443p3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.pd8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sd8.m185444q3(z, sd8Var, (Envelope) obj);
            }
        };
        return c22421cM176658e.map(new qcj() { // from class: l.qd8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sd8.m185445r3(function1, obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: h3 */
    public static void m185438h3() {
        CoreModule.f18272k.f115545m.delete(Conversation.CONVTYPE.mo61359EQ(ConversationType.local_instant_chat_guide));
    }

    /* JADX INFO: renamed from: k3 */
    public static void m185441k3(sd8 sd8Var, User user) {
        String str = user.f56859id;
        str.getClass();
        sd8Var.m185449o3(str, false);
    }

    /* JADX INFO: renamed from: l3 */
    public static void m185442l3(String str) {
        CoreModule.f18272k.f115545m.delete(str);
    }

    /* JADX INFO: renamed from: p3 */
    public static final x1d0 m185443p3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32195E()).m209038l(z1d0.create(Network.JSON, "")).m209028b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Boolean m185444q3(boolean z, sd8 sd8Var, Envelope envelope) {
        if (z) {
            sd8Var.m185448n3("fake_conversation_local_instant_chat_conversation");
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Boolean m185445r3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final x1d0 m185446z3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32191D()).m209038l(z1d0.create(Network.JSON, "")).m209028b();
    }

    /* JADX INFO: renamed from: m3 */
    public final void m185447m3() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.gd8
            @Override // p153l.x20
            public final void call() {
                sd8.m185438h3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final void m185448n3(final String conversationId) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.hd8
            @Override // p153l.x20
            public final void call() {
                sd8.m185442l3(conversationId);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22421c<Boolean> m185449o3(@NotNull String otherUid, final boolean needDeleteLocal) {
        otherUid.getClass();
        C22421c<Boolean> c22421cScheduled = this.f91137Q.scheduled("delete_instantchat_guide_user_" + otherUid, -1, new pcj() { // from class: l.nd8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sd8.m185436f3(needDeleteLocal, this);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m185450s3(@Nullable final User user, @Nullable ConversationInstantChat instantChat) {
        if (user == null) {
            return;
        }
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_local_instant_chat_conversation");
        if (NullChecker.m82486a(CoreModule.f18272k.f115545m.query(user.f56859id))) {
            l51.m152893M(new Runnable() { // from class: l.rd8
                @Override // java.lang.Runnable
                public final void run() {
                    sd8.m185441k3(this.f162292a, user);
                }
            });
            if (NullChecker.m82486a(conversationQuery)) {
                conversationQuery.getClass();
                if (TextUtils.equals(conversationQuery.otherUser, user.f56859id)) {
                    m185447m3();
                    return;
                }
                return;
            }
            return;
        }
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.getClass();
            if (TextUtils.equals(conversationQuery.otherUser, user.f56859id)) {
                return;
            }
        }
        m185447m3();
        String str = user.f56859id;
        str.getClass();
        m185453v3(str, pzi0.m174454o(), m185451t3(instantChat));
    }

    /* JADX INFO: renamed from: t3 */
    public final String m185451t3(ConversationInstantChat instantChat) {
        int i = instantChat != null ? instantChat.userType : 1;
        if (i != 2) {
            return i != 3 ? this.INSTANT_CHAT_GUIDE_USER_TYPE_1 : this.INSTANT_CHAT_GUIDE_USER_TYPE_3;
        }
        return this.INSTANT_CHAT_GUIDE_USER_TYPE_2;
    }

    @NotNull
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final jxd0 getNeedDelLocalInstantChatGuideConversation() {
        return this.needDelLocalInstantChatGuideConversation;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m185453v3(final String userId, final long lastTime, final String userType) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.id8
            @Override // p153l.x20
            public final void call() {
                sd8.m185431a3(lastTime, userId, userType);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final boolean m185454w3() {
        return pzi0.m174454o() - this.lastCallRefreshInstantChatGuideApiTime > ((long) this.minute);
    }

    /* JADX INFO: renamed from: x3 */
    public final boolean m185455x3(@NotNull Conversation conversation) {
        conversation.getClass();
        return Intrinsics.m88377d(this.INSTANT_CHAT_GUIDE_USER_TYPE_3, conversation.localExtraInfo);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m185456y3() {
        this.lastCallRefreshInstantChatGuideApiTime = pzi0.m174454o();
        this.f91137Q.scheduled("refresh_and_get_instantchat_guide_user", -1, new pcj() { // from class: l.jd8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sd8.m185433c3(this.f120115a);
            }
        });
    }
}
