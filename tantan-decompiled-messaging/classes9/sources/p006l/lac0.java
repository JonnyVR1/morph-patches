package p006l;

import android.content.Context;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.BoostResultEntry;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.e51;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.x83;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\fR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%RP\u0010+\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 (*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013 (*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 (*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R8\u0010,\u001a&\u0012\f\u0012\n (*\u0004\u0018\u00010\n0\n (*\u0012\u0012\f\u0012\n (*\u0004\u0018\u00010\n0\n\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010.\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%¨\u00060"}, d2 = {"Ll/lac0;", "", "<init>", "()V", "", "o", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Z", "show", "p", "(Z)V", "Lrx/c;", "g", "()Lrx/c;", "Lcom/google/common/base/Optional;", "Lcom/p1/mobile/putong/core/data/BoostResultEntry;", "h", "Landroid/content/Context;", "context", "acceleratePairingResultID", "j", "(Landroid/content/Context;Ljava/lang/String;)V", "l", "()Z", "n", "d", "Ll/hpd0;", "a", "Ll/hpd0;", "hasPreLoadBoostRefactorSvga", "Ll/zpd0;", "b", "Ll/zpd0;", "acceleratePairingActiveLastMillis", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lrx/subjects/a;", "acceleratePairingViewContentBs", "acceleratePairingDefaultBs", "e", "accelerate_pairing_new_user_guide_show_time", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class lac0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile lac0 f16305f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public hpd0 hasPreLoadBoostRefactorSvga;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public zpd0 acceleratePairingActiveLastMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final a<Optional<BoostResultEntry>> acceleratePairingViewContentBs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final a<Boolean> acceleratePairingDefaultBs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final zpd0 accelerate_pairing_new_user_guide_show_time;

    public lac0() {
        Boolean bool = Boolean.FALSE;
        this.hasPreLoadBoostRefactorSvga = new hpd0("has_pre_load_boost_refactor_svga", bool);
        this.acceleratePairingActiveLastMillis = new zpd0("accelerate_pairing_refactor_active_last_show_" + CoreModule.m1850H().userId(), 0L);
        this.acceleratePairingViewContentBs = a.c(Optional.absent());
        this.acceleratePairingDefaultBs = a.c(bool);
        this.accelerate_pairing_new_user_guide_show_time = new zpd0("accelerate_pairing_new_user_guide_show_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static void m18628a(lac0 lac0Var) {
        lac0Var.m18642o();
    }

    /* JADX INFO: renamed from: b */
    public static void m18629b(lac0 lac0Var, BoostResultEntry boostResultEntry) {
        Optional optionalAbsent;
        a<Optional<BoostResultEntry>> aVar = lac0Var.acceleratePairingViewContentBs;
        if (boostResultEntry == null || (optionalAbsent = Optional.of(boostResultEntry)) == null) {
            optionalAbsent = Optional.absent();
        }
        aVar.onNext(optionalAbsent);
    }

    /* JADX INFO: renamed from: c */
    public static void m18630c(lac0 lac0Var, Throwable th) {
        lac0Var.acceleratePairingViewContentBs.onNext(Optional.absent());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final lac0 m18633i() {
        return INSTANCE.m18645a();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m18634k(lac0 lac0Var, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        lac0Var.m18639j(context, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m18635m() {
        return INSTANCE.m18646b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18636d(Act act, String from) {
        if (!m18641n()) {
            return false;
        }
        this.accelerate_pairing_new_user_guide_show_time.put(Long.valueOf(mqi0.n()));
        new x83(act, from).show();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final c<Boolean> m18637g() {
        c<Boolean> cVarAsObservable = this.acceleratePairingDefaultBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final c<Optional<BoostResultEntry>> m18638h() {
        c<Optional<BoostResultEntry>> cVarAsObservable = this.acceleratePairingViewContentBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: j */
    public final void m18639j(@NotNull Context context, @NotNull String acceleratePairingResultID) {
        context.getClass();
        acceleratePairingResultID.getClass();
        if (acceleratePairingResultID.length() == 0) {
            this.acceleratePairingActiveLastMillis.put(Long.valueOf(mqi0.o() / 1000));
            e51.H(context, new Runnable() { // from class: l.kac0
                @Override // java.lang.Runnable
                public final void run() {
                    lac0.m18628a(this.f15680a);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m18640l() {
        return ((Number) this.accelerate_pairing_new_user_guide_show_time.get()).longValue() > 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m18641n() {
        return INSTANCE.m18646b() && ((Number) this.accelerate_pairing_new_user_guide_show_time.get()).longValue() <= 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m18642o() {
        if (!CoreModule.f1534c.f3624c2.m12284t3()) {
            this.acceleratePairingViewContentBs.onNext(Optional.absent());
            return;
        }
        av6 av6Var = CoreModule.f1534c.f3624c2;
        Object obj = this.acceleratePairingActiveLastMillis.get();
        obj.getClass();
        av6Var.m12285u3(((Number) obj).longValue()).subscribe(mkd0.H(new e30() { // from class: l.iac0
            public final void call(Object obj2) {
                lac0.m18629b(this.f14345a, (BoostResultEntry) obj2);
            }
        }, new e30() { // from class: l.jac0
            public final void call(Object obj2) {
                lac0.m18630c(this.f15092a, (Throwable) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m18643p(boolean show) {
        this.acceleratePairingDefaultBs.onNext(Boolean.valueOf(show));
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18644q(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        return m18636d(act, from);
    }

    /* JADX INFO: renamed from: l.lac0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/lac0$a;", "", "<init>", "()V", "Ll/lac0;", "a", "()Ll/lac0;", "", "b", "()Z", "instance", "Ll/lac0;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final lac0 m18645a() {
            lac0 lac0Var;
            lac0 lac0Var2 = lac0.f16305f;
            if (lac0Var2 != null) {
                return lac0Var2;
            }
            synchronized (this) {
                lac0Var = lac0.f16305f;
                if (lac0Var == null) {
                    lac0Var = new lac0();
                    lac0.f16305f = lac0Var;
                }
            }
            return lac0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m18646b() {
            return false;
        }

        public Companion() {
        }
    }
}
