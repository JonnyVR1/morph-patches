package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationInstantChat;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m87232d2 = {"Ll/oc8;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "y3", "()V", "", "w3", "()Z", "", "otherUid", "needDeleteLocal", "Lrx/c;", "o3", "(Ljava/lang/String;Z)Lrx/c;", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/data/ConversationInstantChat;", "instantChat", "s3", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)V", "m3", "Lcom/p1/mobile/putong/core/data/Conversation;", "conversation", "x3", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "t3", "(Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)Ljava/lang/String;", "userId", "", "lastTime", "userType", xh5.API_VERSION_V3, "(Ljava/lang/String;JLjava/lang/String;)V", "conversationId", "n3", "(Ljava/lang/String;)V", "R", "Ljava/lang/String;", "INSTANT_CHAT_GUIDE_USER_TYPE_1", j6f.LATITUDE_SOUTH, "INSTANT_CHAT_GUIDE_USER_TYPE_2", j6f.GPS_DIRECTION_TRUE, "INSTANT_CHAT_GUIDE_USER_TYPE_3", "U", "J", "lastCallRefreshInstantChatGuideApiTime", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "I", "minute", "W", "secondDebug", "Ll/hpd0;", "X", "Ll/hpd0;", "u3", "()Ll/hpd0;", "needDelLocalInstantChatGuideConversation", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class oc8 extends ax6 {

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
    public final hpd0 needDelLocalInstantChatGuideConversation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc8(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.INSTANT_CHAT_GUIDE_USER_TYPE_1 = "1";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_2 = "2";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_3 = "3";
        this.minute = HuiYanResultSender.TIMEOUT_MS;
        this.secondDebug = 10000;
        this.needDelLocalInstantChatGuideConversation = new hpd0("need_del_local_instant_chat_guide_conversation_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Envelope m163482A3(oc8 oc8Var, Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        list.getClass();
        ConversationInstantChat conversationInstantChat = ((CoreData) envelope.getModuleData(CoreData.class)).instantChat;
        if (vwb.m200296J(list)) {
            oc8Var.m163500m3();
            return envelope;
        }
        oc8Var.f72126Q.m31492w3(envelope, null);
        oc8Var.m163503s3(list.get(0), conversationInstantChat);
        return envelope;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Envelope m163483B3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static void m163484a3(long j, String str, String str2) {
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = "fake_conversation_local_instant_chat_conversation";
        double d = j;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.otherUser = str;
        conversationNew_.localExtraInfo = str2;
        conversationNew_.convType = ConversationType.local_instant_chat_guide;
        CoreModule.f17545c.f19642f0.m33050mq(conversationNew_);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c m163486c3(final oc8 oc8Var) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.gc8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return oc8.m163499z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.hc8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oc8.m163482A3(this.f107033a, (Envelope) obj);
            }
        };
        return c22306cM135121e.map(new w9j() { // from class: l.ic8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oc8.m163483B3(function1, obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: f3 */
    public static C22306c m163489f3(final boolean z, final oc8 oc8Var) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.kc8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return oc8.m163496p3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.lc8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oc8.m163497q3(z, oc8Var, (Envelope) obj);
            }
        };
        return c22306cM135121e.map(new w9j() { // from class: l.mc8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oc8.m163498r3(function1, obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: h3 */
    public static void m163491h3() {
        CoreModule.f17553k.f91950m.delete(Conversation.CONVTYPE.mo60175EQ(ConversationType.local_instant_chat_guide));
    }

    /* JADX INFO: renamed from: k3 */
    public static void m163494k3(oc8 oc8Var, User user) {
        String str = user.f56011id;
        str.getClass();
        oc8Var.m163502o3(str, false);
    }

    /* JADX INFO: renamed from: l3 */
    public static void m163495l3(String str) {
        CoreModule.f17553k.f91950m.delete(str);
    }

    /* JADX INFO: renamed from: p3 */
    public static final stc0 m163496p3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31192E()).m185893l(utc0.create(Network.JSON, "")).m185883b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Boolean m163497q3(boolean z, oc8 oc8Var, Envelope envelope) {
        if (z) {
            oc8Var.m163501n3("fake_conversation_local_instant_chat_conversation");
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Boolean m163498r3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final stc0 m163499z3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31188D()).m185893l(utc0.create(Network.JSON, "")).m185883b();
    }

    /* JADX INFO: renamed from: m3 */
    public final void m163500m3() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.cc8
            @Override // p149l.d30
            public final void call() {
                oc8.m163491h3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final void m163501n3(final String conversationId) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.dc8
            @Override // p149l.d30
            public final void call() {
                oc8.m163495l3(conversationId);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22306c<Boolean> m163502o3(@NotNull String otherUid, final boolean needDeleteLocal) {
        otherUid.getClass();
        C22306c<Boolean> c22306cScheduled = this.f72126Q.scheduled("delete_instantchat_guide_user_" + otherUid, -1, new v9j() { // from class: l.jc8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return oc8.m163489f3(needDeleteLocal, this);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m163503s3(@Nullable final User user, @Nullable ConversationInstantChat instantChat) {
        if (user == null) {
            return;
        }
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_local_instant_chat_conversation");
        if (NullChecker.m81303a(CoreModule.f17553k.f91950m.query(user.f56011id))) {
            e51.m114748M(new Runnable() { // from class: l.nc8
                @Override // java.lang.Runnable
                public final void run() {
                    oc8.m163494k3(this.f138135a, user);
                }
            });
            if (NullChecker.m81303a(conversationQuery)) {
                conversationQuery.getClass();
                if (TextUtils.equals(conversationQuery.otherUser, user.f56011id)) {
                    m163500m3();
                    return;
                }
                return;
            }
            return;
        }
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.getClass();
            if (TextUtils.equals(conversationQuery.otherUser, user.f56011id)) {
                return;
            }
        }
        m163500m3();
        String str = user.f56011id;
        str.getClass();
        m163506v3(str, mqi0.m155944o(), m163504t3(instantChat));
    }

    /* JADX INFO: renamed from: t3 */
    public final String m163504t3(ConversationInstantChat instantChat) {
        int i = instantChat != null ? instantChat.userType : 1;
        if (i != 2) {
            return i != 3 ? this.INSTANT_CHAT_GUIDE_USER_TYPE_1 : this.INSTANT_CHAT_GUIDE_USER_TYPE_3;
        }
        return this.INSTANT_CHAT_GUIDE_USER_TYPE_2;
    }

    @NotNull
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final hpd0 getNeedDelLocalInstantChatGuideConversation() {
        return this.needDelLocalInstantChatGuideConversation;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m163506v3(final String userId, final long lastTime, final String userType) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ec8
            @Override // p149l.d30
            public final void call() {
                oc8.m163484a3(lastTime, userId, userType);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final boolean m163507w3() {
        return mqi0.m155944o() - this.lastCallRefreshInstantChatGuideApiTime > ((long) this.minute);
    }

    /* JADX INFO: renamed from: x3 */
    public final boolean m163508x3(@NotNull Conversation conversation) {
        conversation.getClass();
        return Intrinsics.m87488d(this.INSTANT_CHAT_GUIDE_USER_TYPE_3, conversation.localExtraInfo);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m163509y3() {
        this.lastCallRefreshInstantChatGuideApiTime = mqi0.m155944o();
        this.f72126Q.scheduled("refresh_and_get_instantchat_guide_user", -1, new v9j() { // from class: l.fc8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return oc8.m163486c3(this.f96777a);
            }
        });
    }
}
