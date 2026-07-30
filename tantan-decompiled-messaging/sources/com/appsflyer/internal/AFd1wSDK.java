package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0003\u0010\nJ\u000f\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f"}, m87232d2 = {"Lcom/appsflyer/internal/AFd1wSDK;", "", "", "getCurrencyIso4217Code", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFd1wSDK$AFa1zSDK;", "p1", "", "(Landroid/content/Context;Lcom/appsflyer/internal/AFd1wSDK$AFa1zSDK;)V", "AFAdRevenueData", "()V", "AFa1uSDK", "AFa1zSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public interface AFd1wSDK {

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion getCurrencyIso4217Code = new Companion();
        private static long AFAdRevenueData = 500;

        private Companion() {
        }

        public static long getCurrencyIso4217Code() {
            return AFAdRevenueData;
        }
    }

    public interface AFa1zSDK {
        void getMediationNetwork(@NotNull AFh1sSDK aFh1sSDK);

        void getMonetizationNetwork();
    }

    void AFAdRevenueData();

    void getCurrencyIso4217Code(@NotNull Context p0, @NotNull AFa1zSDK p1);

    boolean getCurrencyIso4217Code();
}
