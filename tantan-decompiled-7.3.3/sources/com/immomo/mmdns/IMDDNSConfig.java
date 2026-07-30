package com.immomo.mmdns;

import android.content.pm.PackageManager;
import com.cosmos.mdlog.MDLog;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IMDDNSConfig {
    private DNSLogger logger;

    public abstract String getAppId();

    public abstract String getDefaultLocalDNSConfigs();

    public String getDocumentBasePath() {
        File file = new File(MDDNSEntrance.sContext.getFilesDir(), "mmdns_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public String getErrorLogDomain() {
        return "";
    }

    public String getHttpDnsDomain() {
        return "";
    }

    public String getIMDefaultHost() {
        return "";
    }

    public int getIMDefaultPort() {
        return 0;
    }

    public String getKeyStoreSha1() {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(MDDNSEntrance.sContext.getPackageManager().getPackageInfo(MDDNSEntrance.sContext.getPackageName(), 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase);
                sb.append(":");
            }
            String string = sb.toString();
            return string.substring(0, string.length() - 1);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public abstract String getLat();

    public abstract String getLng();

    public abstract String getNetworkType();

    public String getPreHosts() {
        return "";
    }

    public abstract String getUid();

    public abstract String getUserAgent();

    public abstract String getVersion();

    public abstract boolean isNetworkAvailable();

    public void setDnsLogger(DNSLogger dNSLogger) {
        this.logger = dNSLogger;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void triggerEventLog(String str, Map<String, String> map) {
        MDLog.m7446e(LogTag.DNS, "eventName:%s eventInfo:%s", str, map);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1341207525:
                if (str.equals("ipv6Toggle")) {
                    b = 0;
                }
                break;
            case -1031321895:
                if (str.equals("fetch-global-config")) {
                    b = 1;
                }
                break;
            case 1535910760:
                if (str.equals("main-server-measure")) {
                    b = 2;
                }
                break;
            case 1892062502:
                if (str.equals("dnsRequest")) {
                    b = 3;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                    DNSManager.getInstance(getAppId()).onToggleChanged(Integer.valueOf(map.get("toggle")).intValue());
                    break;
                case 1:
                case 2:
                    DNSLogger dNSLogger = this.logger;
                    if (dNSLogger != null) {
                        dNSLogger.recordSingleLog(str, map);
                    }
                    break;
                case 3:
                    if (this.logger != null) {
                        this.logger.recordRequestLog(map.get("dn"), map.get("requestIp"), Long.parseLong(map.get("time")));
                    }
                    break;
            }
        } catch (NumberFormatException unused) {
        }
    }
}
