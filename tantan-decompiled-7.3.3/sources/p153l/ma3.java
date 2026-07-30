package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Condition;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/ma3;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ma3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final x20 f135466a = new x20() { // from class: l.la3
        @Override // p153l.x20
        public final void call() {
            ma3.m157618a();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m157618a() {
        o1j0.m165651y(CoreModule.f18263b.getString(R$string.f21337K1));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final x20 m157620c() {
        return INSTANCE.m157628a();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public static final void m157621d(@Nullable Act act, boolean z) {
        INSTANCE.m157629b(act, z);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public static final void m157622e(@Nullable Act act, boolean z, @Nullable x20 x20Var, boolean z2) {
        INSTANCE.m157630c(act, z, x20Var, z2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public static final void m157623f(@Nullable Act act, boolean z, @Nullable x20 x20Var, boolean z2, @NotNull Privilege privilege) {
        INSTANCE.m157631d(act, z, x20Var, z2, privilege);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public static final void m157624g(@Nullable Act act, @Nullable x20 x20Var, @Nullable pcj<Boolean> pcjVar) {
        INSTANCE.m157632f(act, x20Var, pcjVar);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public static final void m157625h(@Nullable Act act, boolean z, @Nullable x20 x20Var, boolean z2, @NotNull String str) {
        INSTANCE.m157633g(act, z, x20Var, z2, str);
    }

    /* JADX INFO: renamed from: l.ma3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0013\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0018\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/ma3$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "again", "Ll/x20;", "showActiveBubble", "ignoreConfirm", "", "from", "", "g", "(Lcom/p1/mobile/android/app/Act;ZLl/x20;ZLjava/lang/String;)V", "reRunBoost", "Ll/pcj;", Condition.TYPE, "f", "(Lcom/p1/mobile/android/app/Act;Ll/x20;Ll/pcj;)V", "fromConfirmDialog", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;ZLl/x20;ZLcom/p1/mobile/putong/core/data/Privilege;)V", "defaultShowActiveBubble", "Ll/x20;", "a", "()Ll/x20;", "getDefaultShowActiveBubble$annotations", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m157626e(Companion companion, Act act, boolean z, x20 x20Var, boolean z2, Privilege privilege, int i, Object obj) {
            if ((i & 4) != 0) {
                x20Var = companion.m157628a();
            }
            x20 x20Var2 = x20Var;
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                privilege = Privilege.boost;
            }
            companion.m157631d(act, z, x20Var2, z3, privilege);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m157627h(Companion companion, Act act, boolean z, x20 x20Var, boolean z2, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                x20Var = null;
            }
            x20 x20Var2 = x20Var;
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                str = "";
            }
            companion.m157633g(act, z, x20Var2, z3, str);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final x20 m157628a() {
            return ma3.f135466a;
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: b */
        public final void m157629b(@Nullable Act act, boolean z) {
            m157626e(this, act, z, null, false, null, 28, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: c */
        public final void m157630c(@Nullable Act act, boolean z, @Nullable x20 x20Var, boolean z2) {
            m157626e(this, act, z, x20Var, z2, null, 16, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: d */
        public final void m157631d(@Nullable Act act, boolean fromConfirmDialog, @Nullable x20 showActiveBubble, boolean again, @NotNull Privilege firstPrivilege) {
            firstPrivilege.getClass();
            if (showActiveBubble == null) {
                showActiveBubble = m157628a();
            }
            CoreModule.f18264c.f20318J0.f134507W.put(Boolean.FALSE);
            if (act != null) {
                k83.m148673k(new k83.C18118a(act).m148680c(fromConfirmDialog).m148685h(showActiveBubble).m148678a(again).m148679b(firstPrivilege));
            } else {
                CrashHelper.m82479c(new RuntimeException("rawStartBoost Act ==null"));
            }
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: f */
        public final void m157632f(@Nullable Act act, @Nullable x20 reRunBoost, @Nullable pcj<Boolean> condition) {
            if (act != null) {
                k83.m148674l(act, reRunBoost, condition);
            } else {
                CrashHelper.m82479c(new RuntimeException("showBoostResult Act ==null"));
            }
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: g */
        public final void m157633g(@Nullable Act act, boolean again, @Nullable x20 showActiveBubble, boolean ignoreConfirm, @NotNull String from) {
            from.getClass();
            if (act != null) {
                k83.m148676n(act, again, showActiveBubble, ignoreConfirm, from);
            } else {
                CrashHelper.m82479c(new RuntimeException("tryBoost Act ==null"));
            }
        }

        public Companion() {
        }
    }
}
