package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.C8472a;
import com.p051p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/ly5;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ly5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m156256a(@NotNull Act act) {
        INSTANCE.m156257a(act);
    }

    /* JADX INFO: renamed from: l.ly5$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/ly5$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "a", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/User;", "user", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "b", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m156257a(@NotNull Act act) {
            act.getClass();
            new ry5(act).m183596n();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m156258b(@NotNull Act act, @NotNull User user) {
            act.getClass();
            user.getClass();
            if (user.profile.zodiac.isUnknownType()) {
                return;
            }
            new C8472a(act, user).m46002V();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m156259c(@NotNull Act act, @NotNull User user) {
            act.getClass();
            user.getClass();
            new yy5(act).m217926e(user);
        }

        public Companion() {
        }
    }
}
