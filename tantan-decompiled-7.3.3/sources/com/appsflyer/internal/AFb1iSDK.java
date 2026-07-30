package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1iSDK {
    public static String getCurrencyIso4217Code(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return getRevenue(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e);
            return null;
        }
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFd1pSDK aFd1pSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String strComponent3 = AFd1pSDK.component3();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(strComponent3);
        return getMediationNetwork(sb.toString(), AFb1lSDK.AFAdRevenueData(aFd1pSDK.AFAdRevenueData, aFd1pSDK.getRevenue)).equals(str2);
    }

    @Nullable
    public static byte[] getMonetizationNetwork(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e);
            return null;
        }
    }

    private static String getRevenue(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String getMediationNetwork(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return getRevenue(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }
}
