package p149l;

import androidx.lifecycle.C0485o;
import com.clevertap.android.sdk.inapp.delay.C1229a;
import com.clevertap.android.sdk.inapp.delay.DelayedInAppResult;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.delay.InAppTimerManager;
import kotlin.Metadata;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/fqm;", "", "<init>", "()V", "", "accountId", "Ll/nul;", "logger", "Ll/zsd;", "delayedLegacyInAppStore", "Ll/n95;", "clock", "Ll/jcr;", "lifecycleOwner", "Ll/ppb;", "scope", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "a", "(Ljava/lang/String;Ll/nul;Ll/zsd;Ll/n95;Ll/jcr;Ll/ppb;)Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Ll/xnm;", "c", "(Ljava/lang/String;Ll/nul;Ll/n95;Ll/jcr;Ll/ppb;)Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class fqm {

    @NotNull
    public static final fqm INSTANCE = new fqm();

    private fqm() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InAppScheduler m122726b(fqm fqmVar, String str, nul nulVar, zsd zsdVar, n95 n95Var, jcr jcrVar, ppb ppbVar, int i, Object obj) {
        if ((i & 4) != 0) {
            zsdVar = null;
        }
        zsd zsdVar2 = zsdVar;
        if ((i & 8) != 0) {
            n95Var = n95.f137721a;
        }
        n95 n95Var2 = n95Var;
        if ((i & 16) != 0) {
            jcrVar = C0485o.INSTANCE.m3057a();
        }
        jcr jcrVar2 = jcrVar;
        if ((i & 32) != 0) {
            ppbVar = C15424f.m94061g(kcr.m145604a(jcrVar2), d4e.m109980a().limitedParallelism(20));
        }
        return fqmVar.m122728a(str, nulVar, zsdVar2, n95Var2, jcrVar2, ppbVar);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InAppScheduler m122727d(fqm fqmVar, String str, nul nulVar, n95 n95Var, jcr jcrVar, ppb ppbVar, int i, Object obj) {
        if ((i & 4) != 0) {
            n95Var = n95.f137721a;
        }
        n95 n95Var2 = n95Var;
        if ((i & 8) != 0) {
            jcrVar = C0485o.INSTANCE.m3057a();
        }
        jcr jcrVar2 = jcrVar;
        if ((i & 16) != 0) {
            ppbVar = C15424f.m94061g(kcr.m145604a(jcrVar2), d4e.m109980a().limitedParallelism(20));
        }
        return fqmVar.m122729c(str, nulVar, n95Var2, jcrVar2, ppbVar);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InAppScheduler<DelayedInAppResult> m122728a(@NotNull String accountId, @NotNull nul logger, @Nullable zsd delayedLegacyInAppStore, @NotNull n95 clock, @NotNull jcr lifecycleOwner, @NotNull ppb scope) {
        accountId.getClass();
        logger.getClass();
        clock.getClass();
        lifecycleOwner.getClass();
        scope.getClass();
        return new InAppScheduler<>(new InAppTimerManager(accountId, logger, clock, scope, lifecycleOwner, "Delayed"), new vsd(accountId, logger, delayedLegacyInAppStore), new C1229a(), logger, accountId);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InAppScheduler<xnm> m122729c(@NotNull String accountId, @NotNull nul logger, @NotNull n95 clock, @NotNull jcr lifecycleOwner, @NotNull ppb scope) {
        accountId.getClass();
        logger.getClass();
        clock.getClass();
        lifecycleOwner.getClass();
        scope.getClass();
        return new InAppScheduler<>(new InAppTimerManager(accountId, logger, clock, scope, lifecycleOwner, "InAction"), new ynm(logger, accountId), new wnm(), logger, accountId);
    }
}
