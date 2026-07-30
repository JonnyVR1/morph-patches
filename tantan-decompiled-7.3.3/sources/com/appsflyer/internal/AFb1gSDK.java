package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\f"}, m88121d2 = {"Lcom/appsflyer/internal/AFb1gSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "Lcom/appsflyer/internal/AFd1rSDK;", "p1", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/internal/AFd1rSDK;)V", "", "()Ljava/lang/String;", "getRevenue"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFb1gSDK {

    @NotNull
    public static final AFb1gSDK INSTANCE = new AFb1gSDK();

    private AFb1gSDK() {
    }

    @JvmStatic
    public static final void getCurrencyIso4217Code(@NotNull AFd1kSDK p0, @NotNull AFd1rSDK p1) {
        p0.getClass();
        p1.getClass();
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1vSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
        }
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getCurrencyIso4217Code);
        if (aFKeystoreWrapper.getMediationNetwork()) {
            String currencyIso4217Code = aFKeystoreWrapper.getCurrencyIso4217Code();
            synchronized (aFKeystoreWrapper.getRevenue) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(currencyIso4217Code)));
                try {
                    synchronized (aFKeystoreWrapper.getRevenue) {
                        aFKeystoreWrapper.getMediationNetwork.deleteEntry(currencyIso4217Code);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e);
                }
            }
            aFKeystoreWrapper.getCurrencyIso4217Code(aFKeystoreWrapper.getCurrencyIso4217Code());
        } else {
            aFKeystoreWrapper.getCurrencyIso4217Code = AFb1lSDK.AFAdRevenueData(p0, p1);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getCurrencyIso4217Code(aFKeystoreWrapper.getCurrencyIso4217Code());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getRevenue()));
    }

    @Nullable
    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    @Nullable
    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }
}
