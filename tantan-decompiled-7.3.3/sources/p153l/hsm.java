package p153l;

import androidx.lifecycle.C0486o;
import com.clevertap.android.sdk.inapp.delay.C1252a;
import com.clevertap.android.sdk.inapp.delay.DelayedInAppResult;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.delay.InAppTimerManager;
import kotlin.Metadata;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/hsm;", "", "<init>", "()V", "", "accountId", "Ll/axl;", "logger", "Ll/nud;", "delayedLegacyInAppStore", "Ll/oa5;", "clock", "Ll/ker;", "lifecycleOwner", "Ll/drb;", "scope", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "a", "(Ljava/lang/String;Ll/axl;Ll/nud;Ll/oa5;Ll/ker;Ll/drb;)Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Ll/zpm;", "c", "(Ljava/lang/String;Ll/axl;Ll/oa5;Ll/ker;Ll/drb;)Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class hsm {

    @NotNull
    public static final hsm INSTANCE = new hsm();

    private hsm() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InAppScheduler m136986b(hsm hsmVar, String str, axl axlVar, nud nudVar, oa5 oa5Var, ker kerVar, drb drbVar, int i, Object obj) {
        if ((i & 4) != 0) {
            nudVar = null;
        }
        nud nudVar2 = nudVar;
        if ((i & 8) != 0) {
            oa5Var = oa5.f145660a;
        }
        oa5 oa5Var2 = oa5Var;
        if ((i & 16) != 0) {
            kerVar = C0486o.INSTANCE.m3058a();
        }
        ker kerVar2 = kerVar;
        if ((i & 32) != 0) {
            drbVar = C15531f.m94954h(ler.m153935a(kerVar2), r5e.m179860a().limitedParallelism(20));
        }
        return hsmVar.m136988a(str, axlVar, nudVar2, oa5Var2, kerVar2, drbVar);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InAppScheduler m136987d(hsm hsmVar, String str, axl axlVar, oa5 oa5Var, ker kerVar, drb drbVar, int i, Object obj) {
        if ((i & 4) != 0) {
            oa5Var = oa5.f145660a;
        }
        oa5 oa5Var2 = oa5Var;
        if ((i & 8) != 0) {
            kerVar = C0486o.INSTANCE.m3058a();
        }
        ker kerVar2 = kerVar;
        if ((i & 16) != 0) {
            drbVar = C15531f.m94954h(ler.m153935a(kerVar2), r5e.m179860a().limitedParallelism(20));
        }
        return hsmVar.m136989c(str, axlVar, oa5Var2, kerVar2, drbVar);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InAppScheduler<DelayedInAppResult> m136988a(@NotNull String accountId, @NotNull axl logger, @Nullable nud delayedLegacyInAppStore, @NotNull oa5 clock, @NotNull ker lifecycleOwner, @NotNull drb scope) {
        accountId.getClass();
        logger.getClass();
        clock.getClass();
        lifecycleOwner.getClass();
        scope.getClass();
        return new InAppScheduler<>(new InAppTimerManager(accountId, logger, clock, scope, lifecycleOwner, "Delayed"), new jud(accountId, logger, delayedLegacyInAppStore), new C1252a(), logger, accountId);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InAppScheduler<zpm> m136989c(@NotNull String accountId, @NotNull axl logger, @NotNull oa5 clock, @NotNull ker lifecycleOwner, @NotNull drb scope) {
        accountId.getClass();
        logger.getClass();
        clock.getClass();
        lifecycleOwner.getClass();
        scope.getClass();
        return new InAppScheduler<>(new InAppTimerManager(accountId, logger, clock, scope, lifecycleOwner, "InAction"), new aqm(logger, accountId), new ypm(), logger, accountId);
    }
}
