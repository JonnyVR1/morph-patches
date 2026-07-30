package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationInstantChat;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e51;
import l.hpd0;
import l.jo0;
import l.mqi0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ll/oc8;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "y3", "()V", "", "w3", "()Z", "", "otherUid", "needDeleteLocal", "Lrx/c;", "o3", "(Ljava/lang/String;Z)Lrx/c;", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/data/ConversationInstantChat;", "instantChat", "s3", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)V", "m3", "Lcom/p1/mobile/putong/core/data/Conversation;", "conversation", "x3", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "t3", "(Lcom/p1/mobile/putong/core/data/ConversationInstantChat;)Ljava/lang/String;", "userId", "", "lastTime", "userType", xh5.API_VERSION_V3, "(Ljava/lang/String;JLjava/lang/String;)V", "conversationId", "n3", "(Ljava/lang/String;)V", "R", "Ljava/lang/String;", "INSTANT_CHAT_GUIDE_USER_TYPE_1", "S", "INSTANT_CHAT_GUIDE_USER_TYPE_2", "T", "INSTANT_CHAT_GUIDE_USER_TYPE_3", "U", "J", "lastCallRefreshInstantChatGuideApiTime", "", "V", "I", "minute", "W", "secondDebug", "Ll/hpd0;", "X", "Ll/hpd0;", "u3", "()Ll/hpd0;", "needDelLocalInstantChatGuideConversation", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public oc8(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.INSTANT_CHAT_GUIDE_USER_TYPE_1 = "1";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_2 = "2";
        this.INSTANT_CHAT_GUIDE_USER_TYPE_3 = "3";
        this.minute = 60000;
        this.secondDebug = 10000;
        this.needDelLocalInstantChatGuideConversation = new hpd0("need_del_local_instant_chat_guide_conversation_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Envelope m20498A3(oc8 oc8Var, Envelope envelope) {
        List list = envelope.getModuleData(CommonData.class).users;
        list.getClass();
        ConversationInstantChat conversationInstantChat = envelope.getModuleData(CoreData.class).instantChat;
        if (vwb.J(list)) {
            oc8Var.m20516m3();
            return envelope;
        }
        oc8Var.f8580Q.m3422w3(envelope, null);
        oc8Var.m20519s3((User) list.get(0), conversationInstantChat);
        return envelope;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Envelope m20499B3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static void m20500a3(long j, String str, String str2) {
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = "fake_conversation_local_instant_chat_conversation";
        double d = j;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.otherUser = str;
        conversationNew_.localExtraInfo = str2;
        conversationNew_.convType = "local_instant_chat_guide";
        CoreModule.f1534c.f3631f0.m4980mq(conversationNew_);
    }

    /* JADX INFO: renamed from: c3 */
    public static c m20502c3(final oc8 oc8Var) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.gc8
            public final Object call() {
                return oc8.m20515z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.hc8
            public final Object invoke(Object obj) {
                return oc8.m20498A3(this.f13811a, (Envelope) obj);
            }
        };
        return cVarM16571e.map(new w9j() { // from class: l.ic8
            public final Object call(Object obj) {
                return oc8.m20499B3(function1, obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: f3 */
    public static c m20505f3(final boolean z, final oc8 oc8Var) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.kc8
            public final Object call() {
                return oc8.m20512p3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.lc8
            public final Object invoke(Object obj) {
                return oc8.m20513q3(z, oc8Var, (Envelope) obj);
            }
        };
        return cVarM16571e.map(new w9j() { // from class: l.mc8
            public final Object call(Object obj) {
                return oc8.m20514r3(function1, obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: h3 */
    public static void m20507h3() {
        CoreModule.f1542k.f11205m.delete(Conversation.CONVTYPE.EQ("local_instant_chat_guide"));
    }

    /* JADX INFO: renamed from: k3 */
    public static void m20510k3(oc8 oc8Var, User user) {
        String str = ((DbObject) user).id;
        str.getClass();
        oc8Var.m20518o3(str, false);
    }

    /* JADX INFO: renamed from: l3 */
    public static void m20511l3(String str) {
        CoreModule.f1542k.f11205m.delete(str);
    }

    /* JADX INFO: renamed from: p3 */
    public static final stc0 m20512p3() {
        return C0154a.f3483P.auth().q(C0154a.m3122E()).l(utc0.create(Network.JSON, "")).b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Boolean m20513q3(boolean z, oc8 oc8Var, Envelope envelope) {
        if (z) {
            oc8Var.m20517n3("fake_conversation_local_instant_chat_conversation");
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Boolean m20514r3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final stc0 m20515z3() {
        return C0154a.f3483P.auth().q(C0154a.m3118D()).l(utc0.create(Network.JSON, "")).b();
    }

    /* JADX INFO: renamed from: m3 */
    public final void m20516m3() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.cc8
            public final void call() {
                oc8.m20507h3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final void m20517n3(final String conversationId) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.dc8
            public final void call() {
                oc8.m20511l3(conversationId);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final c<Boolean> m20518o3(@NotNull String otherUid, final boolean needDeleteLocal) {
        otherUid.getClass();
        c<Boolean> cVarScheduled = this.f8580Q.scheduled("delete_instantchat_guide_user_" + otherUid, -1, new v9j() { // from class: l.jc8
            public final Object call() {
                return oc8.m20505f3(needDeleteLocal, this);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m20519s3(@Nullable final User user, @Nullable ConversationInstantChat instantChat) {
        if (user == null) {
            return;
        }
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("fake_conversation_local_instant_chat_conversation");
        if (NullChecker.a(CoreModule.f1542k.f11205m.query(((DbObject) user).id))) {
            e51.M(new Runnable() { // from class: l.nc8
                @Override // java.lang.Runnable
                public final void run() {
                    oc8.m20510k3(this.f17588a, user);
                }
            });
            if (NullChecker.a(conversationQuery)) {
                conversationQuery.getClass();
                if (TextUtils.equals(conversationQuery.otherUser, ((DbObject) user).id)) {
                    m20516m3();
                    return;
                }
                return;
            }
            return;
        }
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.getClass();
            if (TextUtils.equals(conversationQuery.otherUser, ((DbObject) user).id)) {
                return;
            }
        }
        m20516m3();
        String str = ((DbObject) user).id;
        str.getClass();
        m20522v3(str, mqi0.o(), m20520t3(instantChat));
    }

    /* JADX INFO: renamed from: t3 */
    public final String m20520t3(ConversationInstantChat instantChat) {
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
    public final void m20522v3(final String userId, final long lastTime, final String userType) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ec8
            public final void call() {
                oc8.m20500a3(lastTime, userId, userType);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final boolean m20523w3() {
        return mqi0.o() - this.lastCallRefreshInstantChatGuideApiTime > ((long) this.minute);
    }

    /* JADX INFO: renamed from: x3 */
    public final boolean m20524x3(@NotNull Conversation conversation) {
        conversation.getClass();
        return Intrinsics.d(this.INSTANT_CHAT_GUIDE_USER_TYPE_3, conversation.localExtraInfo);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m20525y3() {
        this.lastCallRefreshInstantChatGuideApiTime = mqi0.o();
        this.f8580Q.scheduled("refresh_and_get_instantchat_guide_user", -1, new v9j() { // from class: l.fc8
            public final Object call() {
                return oc8.m20502c3(this.f12645a);
            }
        });
    }
}
