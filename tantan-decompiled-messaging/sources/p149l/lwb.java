package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/lwb;", "", "<init>", "()V", "Ll/jc20;", "networkRepo", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/hyd;", "deviceInfo", "Ll/kwb;", "a", "(Ll/jc20;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/hyd;)Ll/kwb;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lwb {

    @NotNull
    public static final lwb INSTANCE = new lwb();

    private lwb() {
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: a */
    public final kwb m151967a(@NotNull jc20 networkRepo, @NotNull CleverTapInstanceConfig config, @NotNull hyd deviceInfo) {
        networkRepo.getClass();
        config.getClass();
        deviceInfo.getClass();
        boolean zIsSslPinningEnabled = config.isSslPinningEnabled();
        Logger logger = config.getLogger();
        logger.getClass();
        String accountId = config.getAccountId();
        accountId.getClass();
        jvj0 jvj0Var = new jvj0(zIsSslPinningEnabled, logger, accountId);
        String strM140853d = networkRepo.m140853d();
        String strM140859j = networkRepo.m140859j();
        String accountRegion = config.getAccountRegion();
        String proxyDomain = config.getProxyDomain();
        String spikyProxyDomain = config.getSpikyProxyDomain();
        String customHandshakeDomain = config.getCustomHandshakeDomain();
        String accountId2 = config.getAccountId();
        accountId2.getClass();
        String accountToken = config.getAccountToken();
        accountToken.getClass();
        String strValueOf = String.valueOf(deviceInfo.m133551V());
        Logger logger2 = config.getLogger();
        logger2.getClass();
        String accountId3 = config.getAccountId();
        accountId3.getClass();
        return new kwb(jvj0Var, Constants.PRIMARY_DOMAIN, strM140853d, strM140859j, accountRegion, proxyDomain, spikyProxyDomain, customHandshakeDomain, accountId2, accountToken, strValueOf, logger2, accountId3);
    }
}
