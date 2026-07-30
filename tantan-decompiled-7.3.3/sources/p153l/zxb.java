package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/zxb;", "", "<init>", "()V", "Ll/tk20;", "networkRepo", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/uzd;", "deviceInfo", "Ll/yxb;", "a", "(Ll/tk20;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/uzd;)Ll/yxb;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class zxb {

    @NotNull
    public static final zxb INSTANCE = new zxb();

    private zxb() {
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: a */
    public final yxb m221980a(@NotNull tk20 networkRepo, @NotNull CleverTapInstanceConfig config, @NotNull uzd deviceInfo) {
        networkRepo.getClass();
        config.getClass();
        deviceInfo.getClass();
        boolean zIsSslPinningEnabled = config.isSslPinningEnabled();
        Logger logger = config.getLogger();
        logger.getClass();
        String accountId = config.getAccountId();
        accountId.getClass();
        m4k0 m4k0Var = new m4k0(zIsSslPinningEnabled, logger, accountId);
        String strM191489d = networkRepo.m191489d();
        String strM191495j = networkRepo.m191495j();
        String accountRegion = config.getAccountRegion();
        String proxyDomain = config.getProxyDomain();
        String spikyProxyDomain = config.getSpikyProxyDomain();
        String customHandshakeDomain = config.getCustomHandshakeDomain();
        String accountId2 = config.getAccountId();
        accountId2.getClass();
        String accountToken = config.getAccountToken();
        accountToken.getClass();
        String strValueOf = String.valueOf(deviceInfo.m198774V());
        Logger logger2 = config.getLogger();
        logger2.getClass();
        String accountId3 = config.getAccountId();
        accountId3.getClass();
        return new yxb(m4k0Var, Constants.PRIMARY_DOMAIN, strM191489d, strM191495j, accountRegion, proxyDomain, spikyProxyDomain, customHandshakeDomain, accountId2, accountToken, strValueOf, logger2, accountId3);
    }
}
