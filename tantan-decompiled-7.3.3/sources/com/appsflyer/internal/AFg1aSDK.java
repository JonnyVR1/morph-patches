package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u001a\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, m88121d2 = {"Lcom/appsflyer/internal/AFg1aSDK;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "p1", "", "p2", "", Constants.INAPP_DATA_TAG, "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "Lcom/appsflyer/AFLogger$LogLevel;", "getRevenue", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMediationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", ResourceDirection.f39656v, "w", "getShouldExtendMsg", "()Z", "AFa1uSDK"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFg1aSDK extends AFh1ySDK {

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            getMonetizationNetwork = iArr;
        }
    }

    private static boolean getMediationNetwork(AFLogger.LogLevel p0) {
        return p0.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getRevenue(AFLogger.LogLevel p0, AFg1cSDK p1, String p2, Throwable p3) {
        if (getMediationNetwork(p0)) {
            String monetizationNetwork = getMonetizationNetwork(p2, p1);
            if (AFa1vSDK.getMonetizationNetwork[p0.ordinal()] != 5) {
                return;
            }
            Log.e("AppsFlyer_6.15.0", monetizationNetwork, p3);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: d */
    public final void mo5192d(@NotNull AFg1cSDK p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        getRevenue(AFLogger.LogLevel.DEBUG, p0, p1, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: e */
    public final void mo5193e(@NotNull AFg1cSDK p0, @NotNull String p1, @NotNull Throwable p2, boolean p3, boolean p4, boolean p5, boolean p6) {
        p0.getClass();
        p1.getClass();
        p2.getClass();
        if (p4) {
            getRevenue(AFLogger.LogLevel.ERROR, p0, p1, p2);
        } else if (p3) {
            getRevenue(AFLogger.LogLevel.DEBUG, p0, p1, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(@NotNull AFg1cSDK p0, @NotNull String p1) {
        p0.getClass();
        p1.getClass();
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        withTag$SDK_prodRelease(p1, p0);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    @JvmName
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: i */
    public final void mo5194i(@NotNull AFg1cSDK p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        getRevenue(AFLogger.LogLevel.INFO, p0, p1, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: v */
    public final void mo5195v(@NotNull AFg1cSDK p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        getRevenue(AFLogger.LogLevel.VERBOSE, p0, p1, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: w */
    public final void mo5196w(@NotNull AFg1cSDK p0, @NotNull String p1, boolean p2) {
        p0.getClass();
        p1.getClass();
        getRevenue(AFLogger.LogLevel.WARNING, p0, p1, null);
    }
}
