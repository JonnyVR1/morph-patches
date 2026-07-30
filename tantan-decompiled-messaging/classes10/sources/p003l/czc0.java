package p003l;

import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.j760;
import l.vwb;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/czc0;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class czc0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m6023a(@NotNull String str) {
        INSTANCE.m6024a(str);
    }

    /* JADX INFO: renamed from: l.czc0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/czc0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "", "b", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "a", "(Ljava/lang/String;)V", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m6024a(@NotNull String userId) {
            userId.getClass();
            zvf0.u("e_superlikeButton", "p_navigation_view", new j760[]{vwb.Y("moments_user_id", userId), vwb.Y("is_privileged", Boolean.valueOf(!xma.e4())), vwb.Y("showfrom_superlike", "ilike")});
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m6025b(@NotNull User user) {
            user.getClass();
            zvf0.u("e_see_who_likes_me_like", "p_navigation_view", new j760[]{vwb.Y("see_card_source", CoreModule.c.u0.y5(user) ? Conversation.INSTANT_CHAT : "see")});
        }

        public Companion() {
        }
    }
}
