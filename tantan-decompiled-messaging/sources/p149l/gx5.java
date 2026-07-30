package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.constellationmatch.C8309a;
import com.p046p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/gx5;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gx5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m128532a(@NotNull Act act) {
        INSTANCE.m128533a(act);
    }

    /* JADX INFO: renamed from: l.gx5$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/gx5$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "a", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/User;", "user", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "b", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m128533a(@NotNull Act act) {
            act.getClass();
            new mx5(act).m156845n();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m128534b(@NotNull Act act, @NotNull User user) {
            act.getClass();
            user.getClass();
            if (user.profile.zodiac.isUnknownType()) {
                return;
            }
            new C8309a(act, user).m44819V();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m128535c(@NotNull Act act, @NotNull User user) {
            act.getClass();
            user.getClass();
            new tx5(act).m190947e(user);
        }

        public Companion() {
        }
    }
}
