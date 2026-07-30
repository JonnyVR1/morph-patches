package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1lSDK {
    private static String getMonetizationNetwork;

    public static synchronized String AFAdRevenueData(AFd1kSDK aFd1kSDK, AFd1rSDK aFd1rSDK) {
        if (aFd1kSDK.getCurrencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        if (getMonetizationNetwork == null) {
            String currencyIso4217Code = aFd1rSDK.getCurrencyIso4217Code("AF_INSTALLATION", null);
            if (currencyIso4217Code != null) {
                getMonetizationNetwork = currencyIso4217Code;
            } else {
                try {
                    File file = new File(aFd1kSDK.getCurrencyIso4217Code.getFilesDir(), "AF_INSTALLATION");
                    if (file.exists()) {
                        getMonetizationNetwork = getMonetizationNetwork(file);
                        file.delete();
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append("-");
                        sb.append(Math.abs(new SecureRandom().nextLong()));
                        getMonetizationNetwork = sb.toString();
                    }
                    aFd1rSDK.getRevenue("AF_INSTALLATION", getMonetizationNetwork);
                } catch (Exception e) {
                    AFLogger.afErrorLog("Error getting AF unique ID", e);
                }
            }
            if (getMonetizationNetwork != null) {
                AppsFlyerProperties.getInstance().set(Oauth2AccessToken.KEY_UID, getMonetizationNetwork);
            }
        }
        return getMonetizationNetwork;
    }

    private static String getMonetizationNetwork(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile = null;
        byte[] bArr2 = null;
        randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    bArr2 = new byte[(int) randomAccessFile2.length()];
                    randomAccessFile2.readFully(bArr2);
                    randomAccessFile2.close();
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e) {
                        AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = bArr2;
                    randomAccessFile = randomAccessFile2;
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e3);
                        }
                    }
                    bArr2 = bArr;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                bArr = null;
            }
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
