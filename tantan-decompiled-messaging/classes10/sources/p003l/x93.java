package p003l;

import com.p000p1.mobile.putong.core.data.Condition;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.lsi0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/x93;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class x93 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final d30 f8425a = new d30() { // from class: l.w93
        public final void call() {
            x93.m10700a();
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m10700a() {
        lsi0.y(CoreModule.b.getString(R$string.f257K1));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final d30 m10702c() {
        return INSTANCE.m10710a();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public static final void m10703d(@Nullable Act act, boolean z) {
        INSTANCE.m10711b(act, z);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public static final void m10704e(@Nullable Act act, boolean z, @Nullable d30 d30Var, boolean z2) {
        INSTANCE.m10712c(act, z, d30Var, z2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public static final void m10705f(@Nullable Act act, boolean z, @Nullable d30 d30Var, boolean z2, @NotNull Privilege privilege) {
        INSTANCE.m10713d(act, z, d30Var, z2, privilege);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public static final void m10706g(@Nullable Act act, @Nullable d30 d30Var, @Nullable v9j<Boolean> v9jVar) {
        INSTANCE.m10714f(act, d30Var, v9jVar);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public static final void m10707h(@Nullable Act act, boolean z, @Nullable d30 d30Var, boolean z2, @NotNull String str) {
        INSTANCE.m10715g(act, z, d30Var, z2, str);
    }

    /* JADX INFO: renamed from: l.x93$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0013\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0018\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Ll/x93$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "again", "Ll/d30;", "showActiveBubble", "ignoreConfirm", "", "from", "", "g", "(Lcom/p1/mobile/android/app/Act;ZLl/d30;ZLjava/lang/String;)V", "reRunBoost", "Ll/v9j;", Condition.TYPE, "f", "(Lcom/p1/mobile/android/app/Act;Ll/d30;Ll/v9j;)V", "fromConfirmDialog", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "d", "(Lcom/p1/mobile/android/app/Act;ZLl/d30;ZLcom/p1/mobile/putong/core/data/Privilege;)V", "defaultShowActiveBubble", "Ll/d30;", "a", "()Ll/d30;", "getDefaultShowActiveBubble$annotations", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m10708e(Companion companion, Act act, boolean z, d30 d30Var, boolean z2, Privilege privilege, int i, Object obj) {
            if ((i & 4) != 0) {
                d30Var = companion.m10710a();
            }
            d30 d30Var2 = d30Var;
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                privilege = Privilege.boost;
            }
            companion.m10713d(act, z, d30Var2, z3, privilege);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m10709h(Companion companion, Act act, boolean z, d30 d30Var, boolean z2, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                d30Var = null;
            }
            d30 d30Var2 = d30Var;
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                str = "";
            }
            companion.m10715g(act, z, d30Var2, z3, str);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final d30 m10710a() {
            return x93.f8425a;
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: b */
        public final void m10711b(@Nullable Act act, boolean z) {
            m10708e(this, act, z, null, false, null, 28, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: c */
        public final void m10712c(@Nullable Act act, boolean z, @Nullable d30 d30Var, boolean z2) {
            m10708e(this, act, z, d30Var, z2, null, 16, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: d */
        public final void m10713d(@Nullable Act act, boolean fromConfirmDialog, @Nullable d30 showActiveBubble, boolean again, @NotNull Privilege firstPrivilege) {
            firstPrivilege.getClass();
            if (showActiveBubble == null) {
                showActiveBubble = m10710a();
            }
            CoreModule.c.J0.W.put(Boolean.FALSE);
            if (act != null) {
                v73.m9854k(new v73.C3448a(act).m9861c(fromConfirmDialog).m9866h(showActiveBubble).m9859a(again).m9860b(firstPrivilege));
            } else {
                CrashHelper.c(new RuntimeException("rawStartBoost Act ==null"));
            }
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: f */
        public final void m10714f(@Nullable Act act, @Nullable d30 reRunBoost, @Nullable v9j<Boolean> condition) {
            if (act != null) {
                v73.m9855l(act, reRunBoost, condition);
            } else {
                CrashHelper.c(new RuntimeException("showBoostResult Act ==null"));
            }
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: g */
        public final void m10715g(@Nullable Act act, boolean again, @Nullable d30 showActiveBubble, boolean ignoreConfirm, @NotNull String from) {
            from.getClass();
            if (act != null) {
                v73.m9857n(act, again, showActiveBubble, ignoreConfirm, from);
            } else {
                CrashHelper.c(new RuntimeException("tryBoost Act ==null"));
            }
        }

        public Companion() {
        }
    }
}
