package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.mmkv.MMKV;
import java.security.SecureRandom;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0000\u0018\u0000 @2\u00020\u0001:\u00013B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u0004\u0018\u00010&¢\u0006\u0004\b,\u0010+J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020&¢\u0006\u0004\b.\u0010)J\u001d\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, m88121d2 = {"Ll/tk20;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Lkotlin/Function0;", "", "generateRandomDelay", "Ll/oa5;", "clock", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lkotlin/jvm/functions/Function0;Ll/oa5;)V", "e", "()I", "firstRequestTs", "", "m", "(I)V", "b", "()V", "lastRequestTs", "n", "c", "f", "", "k", "()Z", "", "h", "()J", RXScreenCaptureService.KEY_INDEX, BLiveButtonType.mute, "p", "(Z)V", "expiryMs", "o", "(J)V", "", "domainName", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "j", "spikyDomainName", "q", "currentDelay", "networkRetryCount", "g", "(II)I", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Lkotlin/jvm/functions/Function0;", "getGenerateRandomDelay", "()Lkotlin/jvm/functions/Function0;", "Ll/oa5;", "getClock", "()Ll/oa5;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tk20 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> generateRandomDelay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    public tk20(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull Function0<Integer> function0, @NotNull oa5 oa5Var) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        function0.getClass();
        oa5Var.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.generateRandomDelay = function0;
        this.clock = oa5Var;
    }

    /* JADX INFO: renamed from: a */
    public static int m191486a() {
        return (new SecureRandom().nextInt(10) + 1) * 1000;
    }

    /* JADX INFO: renamed from: b */
    public final void m191487b() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199861r(context, accountId, "comms_first_ts", 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m191488c() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199861r(context, accountId, "comms_last_ts", 0);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m191489d() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199857k(context, accountId, "comms_dmn", null);
    }

    /* JADX INFO: renamed from: e */
    public final int m191490e() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199852d(context, accountId, "comms_first_ts", 0);
    }

    /* JADX INFO: renamed from: f */
    public final int m191491f() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199852d(context, accountId, "comms_last_ts", 0);
    }

    /* JADX INFO: renamed from: g */
    public final int m191492g(int currentDelay, int networkRetryCount) {
        this.config.getLogger().debug(this.config.getAccountId(), "Network retry #" + networkRetryCount);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        if (networkRetryCount < 10) {
            cleverTapInstanceConfig.getLogger().debug(this.config.getAccountId(), "Failure count is " + networkRetryCount + ". Setting delay frequency to 1s");
            return 1000;
        }
        if (cleverTapInstanceConfig.getAccountRegion() == null) {
            this.config.getLogger().debug(this.config.getAccountId(), "Setting delay frequency to 1s");
            return 1000;
        }
        int iIntValue = this.generateRandomDelay.invoke().intValue() + currentDelay;
        if (iIntValue >= 600000) {
            return 1000;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "Setting delay frequency to " + currentDelay);
        return iIntValue;
    }

    /* JADX INFO: renamed from: h */
    public final long m191493h() {
        v5g0 v5g0Var = v5g0.INSTANCE;
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0Var.m199869f(context, accountId, Constants.KEY_MUTE_EXPIRY, 0L, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public final int m191494i() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199852d(context, accountId, Constants.KEY_MUTED, 0);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final String m191495j() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199857k(context, accountId, "comms_dmn_spiky", null);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m191496k() {
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        long jM191493h = m191493h();
        if (jM191493h > 0) {
            return jCurrentTimeMillis < jM191493h;
        }
        int iM191494i = m191494i();
        if (iM191494i > 0) {
            long j = ((long) (iM191494i + MMKV.ExpireInDay)) * 1000;
            if (jCurrentTimeMillis < j) {
                m191500o(j);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m191497l(@Nullable String domainName) {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199863w(context, accountId, "comms_dmn", domainName);
    }

    /* JADX INFO: renamed from: m */
    public final void m191498m(int firstRequestTs) {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199861r(context, accountId, "comms_first_ts", firstRequestTs);
    }

    /* JADX INFO: renamed from: n */
    public final void m191499n(int lastRequestTs) {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199861r(context, accountId, "comms_last_ts", lastRequestTs);
    }

    /* JADX INFO: renamed from: o */
    public final void m191500o(long expiryMs) {
        v5g0 v5g0Var = v5g0.INSTANCE;
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0Var.m199874t(context, v5g0Var.m199866B(accountId, Constants.KEY_MUTE_EXPIRY), expiryMs);
    }

    /* JADX INFO: renamed from: p */
    public final void m191501p(boolean mute) {
        if (mute) {
            m191500o(this.clock.currentTimeMillis() + 86400000);
        } else {
            m191500o(0L);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m191502q(@NotNull String spikyDomainName) {
        spikyDomainName.getClass();
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199863w(context, accountId, "comms_dmn_spiky", spikyDomainName);
    }

    public /* synthetic */ tk20(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Function0 function0, oa5 oa5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, (i & 4) != 0 ? new Function0() { // from class: l.sk20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(tk20.m191486a());
            }
        } : function0, (i & 8) != 0 ? oa5.f145660a : oa5Var);
    }
}
