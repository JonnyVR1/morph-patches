package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1qSDK {

    @Nullable
    public AFf1zSDK AFAdRevenueData;
    public String getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    String getMonetizationNetwork;
    public String getRevenue;

    public AFb1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.getRevenue = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.getMonetizationNetwork = strNextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.getMonetizationNetwork);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (strNextLine.startsWith("data=")) {
                String strTrim = strNextLine.substring(5).trim();
                this.getMediationNetwork = (i > 4 || i2 >= 11) ? Base64.decode(strTrim, 2) : strTrim.getBytes(Charset.defaultCharset());
            } else if (strNextLine.startsWith("type=")) {
                String strTrim2 = strNextLine.substring(5).trim();
                try {
                    this.AFAdRevenueData = AFf1zSDK.valueOf(strTrim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(strTrim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1qSDK.class == obj.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj;
            String str = this.getMonetizationNetwork;
            String str2 = aFb1qSDK.getMonetizationNetwork;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (!Arrays.equals(this.getMediationNetwork, aFb1qSDK.getMediationNetwork)) {
                return false;
            }
            String str3 = this.getRevenue;
            String str4 = aFb1qSDK.getRevenue;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.getCurrencyIso4217Code;
            String str6 = aFb1qSDK.getCurrencyIso4217Code;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            if (this.AFAdRevenueData == aFb1qSDK.AFAdRevenueData) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.getMediationNetwork;
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.getMediationNetwork)) * 31;
        String str2 = this.getRevenue;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getCurrencyIso4217Code;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1zSDK aFf1zSDK = this.AFAdRevenueData;
        return iHashCode3 + (aFf1zSDK != null ? aFf1zSDK.hashCode() : 0);
    }

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        this.getRevenue = str;
        this.getMediationNetwork = bArr;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = aFf1zSDK;
    }
}
