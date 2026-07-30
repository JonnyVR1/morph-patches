package com.appsflyer.internal;

import android.util.Base64;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.messaging.Constants;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, m87232d2 = {"Lcom/appsflyer/internal/AFd1gSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "AFAdRevenueData", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "I", "getCurrencyIso4217Code", "getRevenue", "Ljava/lang/String;", "getMediationNetwork", "getMonetizationNetwork", "AFa1vSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final /* data */ class AFd1gSDK {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    int getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final String getMonetizationNetwork;

    @NotNull
    public final String getMediationNetwork;

    @NotNull
    final String getRevenue;

    public AFd1gSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.getMediationNetwork = str;
        this.getRevenue = str2;
        this.getMonetizationNetwork = str3;
        this.getCurrencyIso4217Code = i;
    }

    @NotNull
    public final JSONObject AFAdRevenueData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.getMediationNetwork);
        jSONObject.put("hash_name", this.getRevenue);
        jSONObject.put("st", this.getMonetizationNetwork);
        jSONObject.put("c", String.valueOf(this.getCurrencyIso4217Code));
        return jSONObject;
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFd1gSDK)) {
            return false;
        }
        AFd1gSDK aFd1gSDK = (AFd1gSDK) p0;
        return Intrinsics.m87488d(this.getMediationNetwork, aFd1gSDK.getMediationNetwork) && Intrinsics.m87488d(this.getRevenue, aFd1gSDK.getRevenue) && Intrinsics.m87488d(this.getMonetizationNetwork, aFd1gSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code == aFd1gSDK.getCurrencyIso4217Code;
    }

    public final int hashCode() {
        return (((((this.getMediationNetwork.hashCode() * 31) + this.getRevenue.hashCode()) * 31) + this.getMonetizationNetwork.hashCode()) * 31) + Integer.hashCode(this.getCurrencyIso4217Code);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AFd1gSDK(getMediationNetwork=");
        sb.append(this.getMediationNetwork);
        sb.append(", getRevenue=");
        sb.append(this.getRevenue);
        sb.append(", getMonetizationNetwork=");
        sb.append(this.getMonetizationNetwork);
        sb.append(", getCurrencyIso4217Code=");
        sb.append(this.getCurrencyIso4217Code);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1gSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000f"}, m87232d2 = {"Lcom/appsflyer/internal/AFd1gSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "AFAdRevenueData", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1gSDK;", "getMediationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1gSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static String AFAdRevenueData(String str, String str2) {
            String string = StringsKt.m93433Z0(str.substring(str2.length())).toString();
            string.getClass();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            bytes.getClass();
            bytes.getClass();
            byte[] bArrDecode = Base64.decode(bytes, 2);
            bArrDecode.getClass();
            return new String(bArrDecode, charset);
        }

        @Nullable
        public static AFd1gSDK getMediationNetwork(@NotNull String p0) {
            p0.getClass();
            List<String> listSplit$default = StringsKt.split$default(p0, new String[]{SignParameters.NEW_LINE}, false, 0, 6, null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String strAFAdRevenueData = null;
            String strAFAdRevenueData2 = null;
            String strAFAdRevenueData3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (C15386d.m93483J(str, "label=", false, 2, null)) {
                    strAFAdRevenueData = AFAdRevenueData(str, "label=");
                } else if (C15386d.m93483J(str, "hashName=", false, 2, null)) {
                    strAFAdRevenueData2 = AFAdRevenueData(str, "hashName=");
                } else if (!C15386d.m93483J(str, "stackTrace=", false, 2, null)) {
                    if (!C15386d.m93483J(str, "c=", false, 2, null)) {
                        break;
                    }
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.m93433Z0(str.substring(2)).toString()));
                } else {
                    strAFAdRevenueData3 = AFAdRevenueData(str, "stackTrace=");
                }
            }
            if (AFAdRevenueData(numValueOf, strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3)) {
                return null;
            }
            strAFAdRevenueData.getClass();
            strAFAdRevenueData2.getClass();
            strAFAdRevenueData3.getClass();
            numValueOf.getClass();
            return new AFd1gSDK(strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3, numValueOf.intValue());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFAdRevenueData(Integer p0, String... p1) {
            boolean z = p0 == null;
            int length = p1.length;
            for (int i = 0; i < 3; i++) {
                String str = p1[i];
                z = z || str == null || str.length() == 0;
            }
            return z;
        }
    }

    public /* synthetic */ AFd1gSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }
}
