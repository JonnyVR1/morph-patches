package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BoostResultEntry;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\fR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%RP\u0010+\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 (*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013 (*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 (*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0013\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R8\u0010,\u001a&\u0012\f\u0012\n (*\u0004\u0018\u00010\n0\n (*\u0012\u0012\f\u0012\n (*\u0004\u0018\u00010\n0\n\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010.\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%¨\u00060"}, m88121d2 = {"Ll/ric0;", "", "<init>", "()V", "", "o", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Z", "show", "p", "(Z)V", "Lrx/c;", "g", "()Lrx/c;", "Lcom/google/common/base/Optional;", "Lcom/p1/mobile/putong/core/data/BoostResultEntry;", "h", "Landroid/content/Context;", "context", "acceleratePairingResultID", "j", "(Landroid/content/Context;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "n", Constants.INAPP_DATA_TAG, "Ll/jxd0;", "a", "Ll/jxd0;", "hasPreLoadBoostRefactorSvga", "Ll/byd0;", "b", "Ll/byd0;", "acceleratePairingActiveLastMillis", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lrx/subjects/a;", "acceleratePairingViewContentBs", "acceleratePairingDefaultBs", "e", "accelerate_pairing_new_user_guide_show_time", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ric0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile ric0 f163352f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public jxd0 hasPreLoadBoostRefactorSvga;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public byd0 acceleratePairingActiveLastMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C22507a<Optional<BoostResultEntry>> acceleratePairingViewContentBs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C22507a<Boolean> acceleratePairingDefaultBs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final byd0 accelerate_pairing_new_user_guide_show_time;

    public ric0() {
        Boolean bool = Boolean.FALSE;
        this.hasPreLoadBoostRefactorSvga = new jxd0("has_pre_load_boost_refactor_svga", bool);
        this.acceleratePairingActiveLastMillis = new byd0("accelerate_pairing_refactor_active_last_show_" + CoreModule.m30929H().userId(), 0L);
        this.acceleratePairingViewContentBs = C22507a.m222759c(Optional.absent());
        this.acceleratePairingDefaultBs = C22507a.m222759c(bool);
        this.accelerate_pairing_new_user_guide_show_time = new byd0("accelerate_pairing_new_user_guide_show_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static void m181576a(ric0 ric0Var) {
        ric0Var.m181590o();
    }

    /* JADX INFO: renamed from: b */
    public static void m181577b(ric0 ric0Var, BoostResultEntry boostResultEntry) {
        Optional<BoostResultEntry> optionalAbsent;
        C22507a<Optional<BoostResultEntry>> c22507a = ric0Var.acceleratePairingViewContentBs;
        if (boostResultEntry == null || (optionalAbsent = Optional.m15467of(boostResultEntry)) == null) {
            optionalAbsent = Optional.absent();
        }
        c22507a.onNext(optionalAbsent);
    }

    /* JADX INFO: renamed from: c */
    public static void m181578c(ric0 ric0Var, Throwable th) {
        ric0Var.acceleratePairingViewContentBs.onNext(Optional.absent());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final ric0 m181581i() {
        return INSTANCE.m181593a();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m181582k(ric0 ric0Var, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        ric0Var.m181587j(context, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m181583m() {
        return INSTANCE.m181594b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m181584d(Act act, String from) {
        if (!m181589n()) {
            return false;
        }
        this.accelerate_pairing_new_user_guide_show_time.put(Long.valueOf(pzi0.m174453n()));
        new m93(act, from).show();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C22421c<Boolean> m181585g() {
        C22421c<Boolean> c22421cAsObservable = this.acceleratePairingDefaultBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C22421c<Optional<BoostResultEntry>> m181586h() {
        C22421c<Optional<BoostResultEntry>> c22421cAsObservable = this.acceleratePairingViewContentBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: j */
    public final void m181587j(@NotNull Context context, @NotNull String acceleratePairingResultID) {
        context.getClass();
        acceleratePairingResultID.getClass();
        if (acceleratePairingResultID.length() == 0) {
            this.acceleratePairingActiveLastMillis.put(Long.valueOf(pzi0.m174454o() / 1000));
            l51.m152888H(context, new Runnable() { // from class: l.qic0
                @Override // java.lang.Runnable
                public final void run() {
                    ric0.m181576a(this.f157815a);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m181588l() {
        return this.accelerate_pairing_new_user_guide_show_time.get().longValue() > 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m181589n() {
        return INSTANCE.m181594b() && this.accelerate_pairing_new_user_guide_show_time.get().longValue() <= 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m181590o() {
        if (!CoreModule.f18264c.f20377c2.m118408t3()) {
            this.acceleratePairingViewContentBs.onNext(Optional.absent());
            return;
        }
        dw6 dw6Var = CoreModule.f18264c.f20377c2;
        Long l2 = this.acceleratePairingActiveLastMillis.get();
        l2.getClass();
        dw6Var.m118409u3(l2.longValue()).subscribe(psd0.m173597H(new y20() { // from class: l.oic0
            @Override // p153l.y20
            public final void call(Object obj) {
                ric0.m181577b(this.f147523a, (BoostResultEntry) obj);
            }
        }, new y20() { // from class: l.pic0
            @Override // p153l.y20
            public final void call(Object obj) {
                ric0.m181578c(this.f152526a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m181591p(boolean show) {
        this.acceleratePairingDefaultBs.onNext(Boolean.valueOf(show));
    }

    /* JADX INFO: renamed from: q */
    public final boolean m181592q(@NotNull Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        return m181584d(act, from);
    }

    /* JADX INFO: renamed from: l.ric0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/ric0$a;", "", "<init>", "()V", "Ll/ric0;", "a", "()Ll/ric0;", "", "b", "()Z", "instance", "Ll/ric0;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ric0 m181593a() {
            ric0 ric0Var;
            ric0 ric0Var2 = ric0.f163352f;
            if (ric0Var2 != null) {
                return ric0Var2;
            }
            synchronized (this) {
                ric0Var = ric0.f163352f;
                if (ric0Var == null) {
                    ric0Var = new ric0();
                    ric0.f163352f = ric0Var;
                }
            }
            return ric0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m181594b() {
            return false;
        }

        public Companion() {
        }
    }
}
