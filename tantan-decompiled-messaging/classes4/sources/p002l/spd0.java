package p002l;

import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.hpd0;
import l.mqi0;
import l.tpd0;
import l.uqd0;
import l.ypv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b \u0010\u0019¨\u0006#"}, d2 = {"Ll/spd0;", "", "", "isAnchor", "<init>", "(Z)V", "", "type", "i", "(Ljava/lang/String;)Z", "", "j", "(Ljava/lang/String;)V", "a", "Z", "()Z", "Ll/hpd0;", "b", "Lkotlin/Lazy;", "e", "()Ll/hpd0;", "rewardSavedBoolean", "Ll/tpd0;", "c", "f", "()Ll/tpd0;", "startCountSavedInt", "Ll/uqd0;", "d", "g", "()Ll/uqd0;", "startDaySavedString", "h", "startSendGiftSavedInt", "Companion", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class spd0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isAnchor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy rewardSavedBoolean = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.opd0
        public final Object invoke() {
            return spd0.m22591b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy startCountSavedInt = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.ppd0
        public final Object invoke() {
            return spd0.m22593d();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy startDaySavedString = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.qpd0
        public final Object invoke() {
            return spd0.m22590a();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy startSendGiftSavedInt = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.rpd0
        public final Object invoke() {
            return spd0.m22592c();
        }
    });

    public spd0(boolean z) {
        this.isAnchor = z;
    }

    /* JADX INFO: renamed from: a */
    public static uqd0 m22590a() {
        return new uqd0("dynamic_bubble_startCount" + ypv.a.D0(), "", false);
    }

    /* JADX INFO: renamed from: b */
    public static hpd0 m22591b() {
        return new hpd0("dynamic_bubble_reward" + ypv.a.D0(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: c */
    public static tpd0 m22592c() {
        return new tpd0("dynamic_bubble_startCount" + ypv.a.D0(), 0, false);
    }

    /* JADX INFO: renamed from: d */
    public static tpd0 m22593d() {
        return new tpd0("dynamic_bubble_startCount" + ypv.a.D0(), 0, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final hpd0 m22594e() {
        return (hpd0) this.rewardSavedBoolean.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final tpd0 m22595f() {
        return (tpd0) this.startCountSavedInt.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final uqd0 m22596g() {
        return (uqd0) this.startDaySavedString.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final tpd0 m22597h() {
        return (tpd0) this.startSendGiftSavedInt.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22598i(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -934326481) {
            if (!type.equals("reward") || this.isAnchor) {
                return false;
            }
            Object obj = m22594e().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }
        if (iHashCode == 3172656) {
            return type.equals("gift") && ((Number) m22597h().get()).intValue() > 3;
        }
        if (iHashCode == 109757538 && type.equals("start")) {
            return ((Number) m22595f().get()).intValue() > 3 || Intrinsics.d(INSTANCE.m22600a(), m22596g().get());
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m22599j(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -934326481) {
            if (type.equals("reward")) {
                m22594e().put(Boolean.TRUE);
            }
        } else if (iHashCode == 3172656) {
            if (type.equals("gift")) {
                m22597h().put(Integer.valueOf(((Number) m22597h().get()).intValue() + 1));
            }
        } else if (iHashCode == 109757538 && type.equals("start")) {
            Companion companion = INSTANCE;
            if (Intrinsics.d(companion.m22600a(), m22596g().get())) {
                return;
            }
            m22596g().put(companion.m22600a());
            m22595f().put(Integer.valueOf(((Number) m22595f().get()).intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: l.spd0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/spd0$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "SAVED_KEY", "Ljava/lang/String;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m22600a() {
            String str = mqi0.d.format(new Date(mqi0.o()));
            str.getClass();
            return str;
        }

        public Companion() {
        }
    }
}
