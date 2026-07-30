package com.appsflyer.internal;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, m87232d2 = {"Lcom/appsflyer/internal/AFe1qSDK;", "Lcom/appsflyer/internal/AFe1jSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1vSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFe1qSDK extends AFe1jSDK {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ AFe1qSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? "GET" : str2, (i & 16) != 0 ? false : z);
    }

    @JvmStatic
    @NotNull
    public static final AFe1qSDK getMonetizationNetwork(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        String monetizationNetwork = Companion.getMonetizationNetwork(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFe1qSDK aFe1qSDK = new AFe1qSDK(monetizationNetwork, MapsKt.mapOf(TuplesKt.m87240a("Connection", "close"), TuplesKt.m87240a("af_request_epoch_ms", strValueOf), TuplesKt.m87240a("af_sig", Companion.getMediationNetwork(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFe1qSDK.component1 = 10000;
        return aFe1qSDK;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1qSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, m87232d2 = {"Lcom/appsflyer/internal/AFe1qSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static String getMediationNetwork(@NotNull String p0, @NotNull String p1, @Nullable String p2, @NotNull String p3, @NotNull String p4) {
            p0.getClass();
            p1.getClass();
            p3.getClass();
            p4.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(p1);
            return AFb1iSDK.getMediationNetwork(TextUtils.join("\u2063", new String[]{p4, p2, sb.toString()}), p3);
        }

        public static String getMonetizationNetwork(String p0, String p1, String p2) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFe1sSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
            sb.append(p0);
            sb.append(p2);
            sb.append("?device_id=");
            sb.append(p1);
            return sb.toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFe1qSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }
}
