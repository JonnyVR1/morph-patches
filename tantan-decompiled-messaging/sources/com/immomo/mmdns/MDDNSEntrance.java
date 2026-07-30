package com.immomo.mmdns;

import android.content.Context;
import android.net.SSLSessionCache;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.mdlog.XLogImpl;
import com.immomo.motracing.GlobalTracer;
import com.immomo.motracing.Span;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.h3e0;
import p149l.upk0;

/* JADX INFO: loaded from: classes7.dex */
public class MDDNSEntrance {
    private static final String MT_TRACER = "mmdns";
    private static LibraryLoader libraryLoader = null;
    public static Context sContext = null;
    private static boolean setMainServerRequestAllEnable = true;
    private static SSLSessionCache sslSessionCache;
    private String appId;
    private int currentEnv;
    private ForegroundGetter foregroundGetter;
    private boolean inited;
    private IPV6Callback ipv6Callback;
    private boolean openAll;
    private boolean stackDebug;

    @Deprecated
    public static Map<String, String> ipHostMap = new ConcurrentHashMap(20);
    private static MDDNSEntrance instance = null;
    private boolean syncMode = false;
    private final Set<String> whiteHostSet = new HashSet();
    private boolean openDNS = false;
    private DNSLogger dnsLogger = new DNSLogger();

    public interface ForegroundGetter {
        boolean isForeGround();
    }

    public interface ILogger {
        void upload(String str, JSONArray jSONArray);

        void upload(String str, JSONObject jSONObject);
    }

    public interface IPV6Callback {
        void onToggleChanged(int i);
    }

    public interface LibraryLoader {
        void loadLibrary(String str) throws UnsatisfiedLinkError;
    }

    private void checkInited() {
        if (this.inited) {
            return;
        }
        upk0.m194883a("please call com.immomo.mmdns.DNSManager.init(android.content.Context, com.immomo.mmdns.IMDDNSConfig) first");
    }

    public static MDDNSEntrance getInstance() {
        synchronized (MDDNSEntrance.class) {
            try {
                if (instance == null) {
                    instance = new MDDNSEntrance();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    public static SSLSessionCache getSslSessionCache() {
        return sslSessionCache;
    }

    private void loadSharedLibs() {
        LibraryLoader libraryLoader2 = libraryLoader;
        if (libraryLoader2 != null) {
            try {
                libraryLoader2.loadLibrary(MT_TRACER);
                this.inited = true;
                return;
            } catch (UnsatisfiedLinkError e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
                return;
            }
        }
        try {
            System.loadLibrary(MT_TRACER);
            this.inited = true;
        } catch (UnsatisfiedLinkError e2) {
            MDLog.printErrStackTrace(LogTag.DNS, e2);
        }
    }

    private native void nativeDestroy(String str);

    private native String[] nativeGetAPList(String str, int i, boolean z, String str2, boolean z2);

    private native String nativeGetImUsableAP(String str);

    private native String nativeGetImUsableAPV6First(String str);

    private native String nativeGetUsableHost(String str, String str2, boolean z, boolean z2);

    private native String[] nativeGetUsableHostList(String str, String str2, boolean z, boolean z2);

    private native int nativeGetV6Toggle(String str);

    private native void nativeImConnectFailed(String str, int i, String str2);

    private native void nativeImConnectSuccessed(String str, int i, String str2);

    private native void nativeInitDNSConfig(IMDDNSConfig iMDDNSConfig, String str, String str2);

    private native void nativeRequestFailedForDomain(String str, String str2, String str3);

    private native void nativeRequestSucceedForDomain(String str, String str2, String str3);

    private native void nativeSetEnv(int i, String str);

    private native void nativeSetMainServerRequestAllEnable(boolean z);

    private native void nativeSwitchClearHttpDNSCache(boolean z, String str);

    public static void setLibraryLoader(LibraryLoader libraryLoader2) {
        libraryLoader = libraryLoader2;
    }

    public static void setMainServerRequestAllEnable(boolean z) {
        setMainServerRequestAllEnable = z;
    }

    public void addWhiteHostList(Set<String> set) {
        if (set != null) {
            synchronized (this.whiteHostSet) {
                this.whiteHostSet.clear();
                this.whiteHostSet.addAll(set);
            }
        }
    }

    public void closeDebug() {
        MDLog.setConsoleLogOpen(false);
        MDLog.setLevel(7);
    }

    public void destroy() {
        checkInited();
        nativeDestroy(this.appId);
    }

    public String[] getIMAps(String str, int i, boolean z, boolean z2) {
        return nativeGetAPList(str, i, z, this.appId, z2);
    }

    public String getIMUsableAP() {
        checkInited();
        String strNativeGetImUsableAP = nativeGetImUsableAP(this.appId);
        return TextUtils.isEmpty(strNativeGetImUsableAP) ? "ap.immomo.com:443" : strNativeGetImUsableAP;
    }

    public String getIMV6AP() {
        checkInited();
        String strNativeGetImUsableAPV6First = nativeGetImUsableAPV6First(this.appId);
        return TextUtils.isEmpty(strNativeGetImUsableAPV6First) ? "ap.immomo.com:443" : strNativeGetImUsableAPV6First;
    }

    public synchronized String getUsableHost(String str, boolean z) {
        Span spanM131723b = GlobalTracer.m19339b(MT_TRACER).mo19337a("getUsableHost").m131722a("domain", str).m131722a("findV6", String.valueOf(z)).m131723b();
        h3e0 h3e0VarMo19334e = spanM131723b.mo19334e();
        try {
            if (this.openDNS && !TextUtils.isEmpty(str)) {
                checkInited();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strNativeGetUsableHost = nativeGetUsableHost(str, this.appId, z, this.syncMode);
                MDLog.m7396i(LogTag.DNS, "replace %s ——> %s", str, strNativeGetUsableHost);
                ipHostMap.put(strNativeGetUsableHost, str);
                this.dnsLogger.recordDnsResult(System.currentTimeMillis() - jCurrentTimeMillis, str, strNativeGetUsableHost);
                spanM131723b.mo19333d(String.format("replace %s ——> %s", str, strNativeGetUsableHost));
                if (h3e0VarMo19334e != null) {
                    h3e0VarMo19334e.close();
                }
                return strNativeGetUsableHost;
            }
            if (h3e0VarMo19334e != null) {
                h3e0VarMo19334e.close();
            }
            return str;
        } catch (Throwable th) {
            if (h3e0VarMo19334e != null) {
                try {
                    h3e0VarMo19334e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public synchronized String getUsableHostFromUrl(String str, boolean z) {
        if (this.openDNS && !TextUtils.isEmpty(str)) {
            checkInited();
            String host = null;
            try {
                host = new URL(str).getHost();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strNativeGetUsableHost = nativeGetUsableHost(host, this.appId, z, this.syncMode);
                MDLog.m7396i(LogTag.DNS, "replace %s ——> %s", host, strNativeGetUsableHost);
                ipHostMap.put(strNativeGetUsableHost, host);
                this.dnsLogger.recordDnsResult(System.currentTimeMillis() - jCurrentTimeMillis, host, strNativeGetUsableHost);
                return strNativeGetUsableHost;
            } catch (Exception unused) {
                return host;
            }
        }
        return str;
    }

    public synchronized String[] getUsableHostList(String str, boolean z) {
        h3e0 h3e0VarMo19334e = GlobalTracer.m19339b(MT_TRACER).mo19337a("getUsableHostList").m131722a("domain", str).m131722a("findV6", String.valueOf(z)).m131723b().mo19334e();
        try {
            if (this.openDNS && !TextUtils.isEmpty(str)) {
                checkInited();
                String[] strArrNativeGetUsableHostList = nativeGetUsableHostList(str, this.appId, z, this.syncMode);
                if (strArrNativeGetUsableHostList == null) {
                    strArrNativeGetUsableHostList = new String[0];
                }
                if (h3e0VarMo19334e != null) {
                    h3e0VarMo19334e.close();
                }
                return strArrNativeGetUsableHostList;
            }
            String[] strArr = {str};
            if (h3e0VarMo19334e != null) {
                h3e0VarMo19334e.close();
            }
            return strArr;
        } catch (Throwable th) {
            if (h3e0VarMo19334e != null) {
                try {
                    h3e0VarMo19334e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public synchronized String getUseableURL(String str, boolean z) {
        if (this.openDNS && !TextUtils.isEmpty(str)) {
            checkInited();
            try {
                String host = new URL(str).getHost();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strNativeGetUsableHost = nativeGetUsableHost(host, this.appId, z, this.syncMode);
                if (!TextUtils.equals(host, strNativeGetUsableHost)) {
                    String strReplaceFirst = str.replaceFirst(host, strNativeGetUsableHost);
                    MDLog.m7396i(LogTag.DNS, "replace %s ——> %s", str, strReplaceFirst);
                    ipHostMap.put(strNativeGetUsableHost, host);
                    this.dnsLogger.recordDnsResult(System.currentTimeMillis() - jCurrentTimeMillis, host, strNativeGetUsableHost);
                    return strReplaceFirst;
                }
            } catch (Exception unused) {
            }
            return str;
        }
        return str;
    }

    public boolean getV6Toggle() {
        checkInited();
        return nativeGetV6Toggle(this.appId) == 1;
    }

    public void initDNSConfig(Context context, IMDDNSConfig iMDDNSConfig, String str) {
        iMDDNSConfig.setDnsLogger(this.dnsLogger);
        this.appId = iMDDNSConfig.getAppId();
        loadSharedLibs();
        sContext = context;
        sslSessionCache = new SSLSessionCache(context);
        nativeSetMainServerRequestAllEnable(setMainServerRequestAllEnable);
        NetUtil.init(context);
        DNSManager.init(iMDDNSConfig, this);
        nativeInitDNSConfig(iMDDNSConfig, str, this.appId);
        this.openDNS = true;
    }

    public boolean isForeGround() {
        ForegroundGetter foregroundGetter = this.foregroundGetter;
        if (foregroundGetter != null) {
            return foregroundGetter.isForeGround();
        }
        return true;
    }

    public void onIMConnectSuccess(String str, int i) {
        checkInited();
        nativeImConnectSuccessed(str, i, this.appId);
    }

    public void onImConnectFailed(String str, int i) {
        checkInited();
        nativeImConnectFailed(str, i, this.appId);
    }

    public void onToggleChanged(int i) {
        IPV6Callback iPV6Callback = this.ipv6Callback;
        if (iPV6Callback != null) {
            iPV6Callback.onToggleChanged(i);
        }
    }

    public void openAll(boolean z) {
        this.openAll = z;
    }

    public void openDNS(boolean z) {
        this.openDNS = z;
    }

    public void openDebug(String str) {
        XLogImpl.open(true, 0, str, str, "mdlog_");
        MDLog.setLogImp(new XLogImpl());
        MDLog.setConsoleLogOpen(true);
        MDLog.setLevel(0);
    }

    public void openStackDebug(boolean z) {
        this.stackDebug = z;
        MDLog.setOpenStackInfo(true);
    }

    public void requestFailedForDomain(String str, String str2) {
        if (!this.openDNS || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.stackDebug) {
            MDLog.printErrStackTrace(LogTag.DNS, new Exception());
        }
        if (this.currentEnv == 11) {
            return;
        }
        checkInited();
        MDLog.m7392e(LogTag.DNS, "Failed For Domain %s ——> %s", str, str2);
        nativeRequestFailedForDomain(str, str2, this.appId);
    }

    public void requestFailedForOriURL(String str, String str2) {
        if (!this.openDNS || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.stackDebug) {
            MDLog.printErrStackTrace(LogTag.DNS, new Exception());
        }
        checkInited();
        try {
            String host = new URL(str).getHost();
            MDLog.m7392e(LogTag.DNS, "Failed For Domain %s ——> %s", host, str2);
            requestFailedForDomain(host, str2);
        } catch (Exception unused) {
        }
    }

    public void requestSucceedForDomain(String str, String str2) {
        if (!this.openDNS || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        checkInited();
        MDLog.m7396i(LogTag.DNS, "Success For Domain %s ——> %s", str, str2);
        if (this.currentEnv == 11) {
            return;
        }
        nativeRequestSucceedForDomain(str, str2, this.appId);
    }

    public void requestSucceedForOriURL(String str, String str2) {
        if (!this.openDNS || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        checkInited();
        try {
            requestSucceedForDomain(new URL(str).getHost(), str2);
        } catch (Exception unused) {
        }
    }

    public void setClearHttpDNSCacheSwitch(boolean z) {
        checkInited();
        nativeSwitchClearHttpDNSCache(z, this.appId);
    }

    public void setForegroundGetter(ForegroundGetter foregroundGetter) {
        this.foregroundGetter = foregroundGetter;
    }

    public void setIpv6Callback(IPV6Callback iPV6Callback) {
        this.ipv6Callback = iPV6Callback;
    }

    public void setRequestEnv(int i) {
        checkInited();
        this.currentEnv = i;
        nativeSetEnv(i, this.appId);
    }

    public void setSyncMode(boolean z) {
        this.syncMode = z;
    }

    public void setUploadLogger(final ILogger iLogger) {
        this.dnsLogger.setLogCallback(new DNSLogger.LogCallback() { // from class: com.immomo.mmdns.MDDNSEntrance.1
            @Override // com.immomo.mmdns.DNSLogger.LogCallback
            public void onLog(String str, JSONObject jSONObject) {
                iLogger.upload(str, jSONObject);
            }

            @Override // com.immomo.mmdns.DNSLogger.LogCallback
            public void onLogOverflow(String str, JSONArray jSONArray) {
                iLogger.upload(str, jSONArray);
            }
        });
    }

    public boolean useDNS(String str) {
        boolean zContains;
        if (this.openAll) {
            return true;
        }
        if (!this.openDNS) {
            return false;
        }
        synchronized (this.whiteHostSet) {
            zContains = this.whiteHostSet.contains(str);
        }
        return zContains;
    }

    public void initDNSConfig(Context context, IMDDNSConfig iMDDNSConfig) {
        initDNSConfig(context, iMDDNSConfig, DNSUtils.getCurrentProcessName(context));
    }

    public synchronized String getUsableHostFromUrl(String str) {
        return getUsableHostFromUrl(str, false);
    }

    public synchronized String getUseableURL(String str) {
        return getUseableURL(str, false);
    }

    public String getUsableHost(String str) {
        return getUsableHost(str, false);
    }
}
