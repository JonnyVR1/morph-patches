package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/f7d0;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f7d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m124434a(@NotNull String str) {
        INSTANCE.m124435a(str);
    }

    /* JADX INFO: renamed from: l.f7d0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/f7d0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "", "b", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "a", "(Ljava/lang/String;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m124435a(@NotNull String userId) {
            userId.getClass();
            i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, OMSDialogPositon.p_navigation_view, jyb.m147494Y("moments_user_id", userId), jyb.m147494Y("is_privileged", Boolean.valueOf(!joa.m146386f4())), jyb.m147494Y("showfrom_superlike", "ilike"));
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m124436b(@NotNull User user) {
            user.getClass();
            i4g0.m138523u("e_see_who_likes_me_like", OMSDialogPositon.p_navigation_view, jyb.m147494Y("see_card_source", CoreModule.f18264c.f20429u0.m31381C5(user) ? "instant_chat" : "see"));
        }

        public Companion() {
        }
    }
}
