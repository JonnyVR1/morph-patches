package cn.shuzilm.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.RangingResultCallback;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p153l.pyq0;
import p153l.vyq0;
import p153l.wyq0;
import p153l.xyq0;

/* JADX INFO: renamed from: cn.shuzilm.core.dl */
/* JADX INFO: loaded from: classes.dex */
public class C0816dl {

    /* JADX INFO: renamed from: b */
    private static Context f3773b;

    /* JADX INFO: renamed from: c */
    private static NsdManager f3774c;

    /* JADX INFO: renamed from: d */
    private static LinkedList f3775d = new LinkedList();

    /* JADX INFO: renamed from: e */
    private static JSONObject f3776e = new JSONObject();

    /* JADX INFO: renamed from: f */
    private static JSONObject f3777f = null;

    /* JADX INFO: renamed from: g */
    private static Timer f3778g = null;

    /* JADX INFO: renamed from: h */
    private static int f3779h = 0;

    /* JADX INFO: renamed from: i */
    private static int f3780i = 0;

    /* JADX INFO: renamed from: j */
    private static String f3781j = "";

    /* JADX INFO: renamed from: k */
    private static String f3782k = "";

    /* JADX INFO: renamed from: l */
    private static String f3783l = "";

    /* JADX INFO: renamed from: m */
    private static int f3784m = 0;

    /* JADX INFO: renamed from: n */
    private static String f3785n = "";

    /* JADX INFO: renamed from: o */
    private static int f3786o = 0;

    /* JADX INFO: renamed from: p */
    private static int f3787p = -1;

    /* JADX INFO: renamed from: q */
    private static int f3788q = -1;

    /* JADX INFO: renamed from: r */
    private static int f3789r = -1;

    /* JADX INFO: renamed from: s */
    private static int f3790s = -1;

    /* JADX INFO: renamed from: t */
    private static String f3791t = null;

    /* JADX INFO: renamed from: u */
    private static String f3792u = null;

    /* JADX INFO: renamed from: v */
    private static int f3793v = 0;

    /* JADX INFO: renamed from: w */
    private static String f3794w = "";

    /* JADX INFO: renamed from: x */
    private static final Object f3795x = new Object();

    /* JADX INFO: renamed from: a */
    static int f3772a = 0;

    /* JADX INFO: renamed from: cn.shuzilm.core.dl$NsdDiscoverySubJson */
    class NsdDiscoverySubJson {

        /* JADX INFO: renamed from: a */
        String f3803a;

        /* JADX INFO: renamed from: b */
        int f3804b;

        /* JADX INFO: renamed from: c */
        JSONObject f3805c;

        public NsdDiscoverySubJson(String str, int i) {
            this.f3805c = null;
            this.f3803a = str;
            this.f3804b = i;
            if (i != 1) {
                this.f3805c = new JSONObject();
            }
        }

        public void discoverySubType() {
            try {
                NsdManager.DiscoveryListener discoveryListener = new NsdManager.DiscoveryListener() { // from class: cn.shuzilm.core.dl.NsdDiscoverySubJson.1
                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onDiscoveryStarted(String str) {
                    }

                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onDiscoveryStopped(String str) {
                    }

                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
                        try {
                            String serviceName = nsdServiceInfo.getServiceName();
                            String serviceType = nsdServiceInfo.getServiceType();
                            if (NsdDiscoverySubJson.this.f3804b == 1) {
                                C0816dl.m4777b(serviceName, serviceType);
                            }
                            NsdDiscoverySubJson nsdDiscoverySubJson = NsdDiscoverySubJson.this;
                            if (nsdDiscoverySubJson.f3804b == 2) {
                                C0816dl.m4776b(nsdServiceInfo, serviceName, serviceType, nsdDiscoverySubJson.f3805c);
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
                    }

                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onStartDiscoveryFailed(String str, int i) {
                        C0816dl.m4775b(C0816dl.f3774c, this);
                    }

                    @Override // android.net.nsd.NsdManager.DiscoveryListener
                    public void onStopDiscoveryFailed(String str, int i) {
                        C0816dl.m4775b(C0816dl.f3774c, this);
                    }
                };
                C0816dl.f3774c.discoverServices(this.f3803a, 1, discoveryListener);
                if (C0816dl.f3778g == null) {
                    Timer unused = C0816dl.f3778g = new Timer();
                }
                C0816dl.f3778g.schedule(new sd(C0816dl.f3774c, discoveryListener, this.f3804b, this.f3803a, this.f3805c), this.f3804b == 2 ? 600 : 800);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: cn.shuzilm.core.dl$ResolveListenerAddress */
    public class ResolveListenerAddress implements NsdManager.ResolveListener {

        /* JADX INFO: renamed from: a */
        private String f3807a;

        /* JADX INFO: renamed from: b */
        private String f3808b;

        /* JADX INFO: renamed from: c */
        private JSONObject f3809c;

        public ResolveListenerAddress(String str, String str2, JSONObject jSONObject) {
            this.f3807a = str;
            this.f3808b = str2;
            this.f3809c = jSONObject;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            try {
                String strValueOf = String.valueOf(this.f3809c.length());
                this.f3809c.put(strValueOf, this.f3807a + ",f:" + i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            try {
                this.f3807a += Constants.SEPARATOR_COMMA + nsdServiceInfo.getHost().getHostAddress() + ":" + nsdServiceInfo.getPort();
                this.f3809c.put(String.valueOf(this.f3809c.length()), this.f3807a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.shuzilm.core.dl$sd */
    class sd extends TimerTask {

        /* JADX INFO: renamed from: a */
        NsdManager.DiscoveryListener f3810a;

        /* JADX INFO: renamed from: b */
        NsdManager f3811b;

        /* JADX INFO: renamed from: c */
        int f3812c;

        /* JADX INFO: renamed from: d */
        String f3813d;

        /* JADX INFO: renamed from: e */
        JSONObject f3814e;

        public sd(NsdManager nsdManager, NsdManager.DiscoveryListener discoveryListener, int i, String str, JSONObject jSONObject) {
            this.f3810a = discoveryListener;
            this.f3811b = nsdManager;
            this.f3812c = i;
            this.f3813d = str;
            this.f3814e = jSONObject;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str;
            JSONObject jSONObject;
            try {
                C0816dl.m4775b(this.f3811b, this.f3810a);
                if (this.f3812c == 2 && (jSONObject = this.f3814e) != null) {
                    int length = jSONObject.toString().length();
                    if (C0816dl.f3776e.toString().length() + length < 4096 && length > 5) {
                        C0816dl.f3776e.put(this.f3813d, this.f3814e);
                    }
                }
                if (C0816dl.f3784m <= 20 && C0816dl.f3775d != null && C0816dl.f3775d.size() > 0 && (str = (String) C0816dl.f3775d.poll()) != null) {
                    new NsdDiscoverySubJson(str, 2).discoverySubType();
                    C0816dl.m4782d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m4768a(String str, int i) {
        new NsdDiscoverySubJson(str, 1).discoverySubType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4774b(Network network) {
        List<LinkAddress> linkAddresses;
        if (network == null) {
            return;
        }
        try {
            LinkProperties linkProperties = ((ConnectivityManager) f3773b.getSystemService("connectivity")).getLinkProperties(network);
            if (linkProperties != null && (linkAddresses = linkProperties.getLinkAddresses()) != null) {
                Iterator<LinkAddress> it = linkAddresses.iterator();
                while (it.hasNext()) {
                    String hostAddress = it.next().getAddress().getHostAddress();
                    if (hostAddress != null && hostAddress.contains(":") && !hostAddress.startsWith("fe80")) {
                        DUHelper.m4730c(f3773b, 204, hostAddress);
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #5 {all -> 0x00cd, blocks: (B:9:0x001e, B:11:0x0022, B:21:0x0036, B:14:0x0028, B:16:0x002c, B:19:0x0032, B:24:0x0051), top: B:76:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #4 {all -> 0x00ca, blocks: (B:27:0x0060, B:29:0x0064, B:34:0x006e, B:39:0x0097, B:41:0x009b, B:45:0x00b7, B:44:0x00ad, B:43:0x00a9, B:32:0x006a, B:38:0x008b), top: B:74:0x0060, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:27:0x0060, B:29:0x0064, B:34:0x006e, B:39:0x0097, B:41:0x009b, B:45:0x00b7, B:44:0x00ad, B:43:0x00a9, B:32:0x006a, B:38:0x008b), top: B:74:0x0060, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private static void m4781c(final int i) {
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager.NetworkCallback networkCallback2;
        ConnectivityManager connectivityManager;
        ConnectivityManager.NetworkCallback networkCallback3;
        if (f3788q != 0) {
            return;
        }
        ConnectivityManager connectivityManager2 = null;
        networkCallback = null;
        networkCallback = null;
        ConnectivityManager.NetworkCallback networkCallback4 = null;
        try {
            try {
                final CountDownLatch countDownLatch = new CountDownLatch(3);
                connectivityManager = (ConnectivityManager) f3773b.getSystemService("connectivity");
                if (i == 0) {
                    try {
                        if (f3789r == 0 && f3790s == 0) {
                            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
                            networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: cn.shuzilm.core.dl.2
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onAvailable(Network network) {
                                    try {
                                        super.onAvailable(network);
                                        String strM4783d = null;
                                        if (network != null) {
                                            C0816dl.m4774b(network);
                                            strM4783d = C0816dl.m4783d(network, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                        }
                                        String unused = C0816dl.f3791t = strM4783d;
                                        String str = "0";
                                        if (strM4783d == null) {
                                            strM4783d = "0";
                                        }
                                        if (strM4783d.length() <= 64) {
                                            str = strM4783d;
                                        }
                                        if (i == 1) {
                                            DUHelper.m4730c(C0816dl.f3773b, 201, str);
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                    countDownLatch.countDown();
                                }

                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onUnavailable() {
                                    super.onUnavailable();
                                    countDownLatch.countDown();
                                }
                            };
                            connectivityManager.requestNetwork(networkRequestBuild, networkCallback2);
                        } else if ((i != 0 && f3789r == 0 && f3787p == 0) || (i == 1 && f3789r == 0)) {
                            NetworkRequest networkRequestBuild2 = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
                            networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: cn.shuzilm.core.dl.2
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onAvailable(Network network) {
                                    try {
                                        super.onAvailable(network);
                                        String strM4783d = null;
                                        if (network != null) {
                                            C0816dl.m4774b(network);
                                            strM4783d = C0816dl.m4783d(network, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                        }
                                        String unused = C0816dl.f3791t = strM4783d;
                                        String str = "0";
                                        if (strM4783d == null) {
                                            strM4783d = "0";
                                        }
                                        if (strM4783d.length() <= 64) {
                                            str = strM4783d;
                                        }
                                        if (i == 1) {
                                            DUHelper.m4730c(C0816dl.f3773b, 201, str);
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                    countDownLatch.countDown();
                                }

                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onUnavailable() {
                                    super.onUnavailable();
                                    countDownLatch.countDown();
                                }
                            };
                            try {
                                connectivityManager.requestNetwork(networkRequestBuild2, networkCallback2);
                            } catch (Throwable unused) {
                                if (connectivityManager != null && networkCallback2 != null) {
                                    connectivityManager.unregisterNetworkCallback(networkCallback2);
                                }
                                if (connectivityManager != null || networkCallback4 == null) {
                                    return;
                                }
                                connectivityManager.unregisterNetworkCallback(networkCallback4);
                            }
                        } else {
                            countDownLatch.countDown();
                            DUHelper.m4730c(f3773b, 201, "0");
                            f3791t = "0";
                            networkCallback2 = null;
                        }
                    } catch (Throwable unused2) {
                        networkCallback = null;
                        networkCallback2 = null;
                        connectivityManager2 = connectivityManager;
                        connectivityManager = connectivityManager2;
                        networkCallback4 = networkCallback;
                        if (connectivityManager != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback2);
                        }
                        if (connectivityManager != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    connectivityManager.unregisterNetworkCallback(networkCallback4);
                }
                if (i != 0) {
                    countDownLatch.countDown();
                    DUHelper.m4730c(f3773b, 201, "0");
                    f3791t = "0";
                    networkCallback2 = null;
                } else {
                    countDownLatch.countDown();
                    DUHelper.m4730c(f3773b, 201, "0");
                    f3791t = "0";
                    networkCallback2 = null;
                }
                if (i != 0) {
                    if (i == 1) {
                    }
                    countDownLatch.countDown();
                    DUHelper.m4730c(f3773b, 202, "0");
                    f3792u = "0";
                    if (f3787p == 0) {
                        new Thread(new Runnable() { // from class: cn.shuzilm.core.dl.4
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String strM4778c = C0816dl.m4778c(null, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                    String str = "0";
                                    if (strM4778c == null) {
                                        strM4778c = "0";
                                    }
                                    if (strM4778c.length() <= 64) {
                                        str = strM4778c;
                                    }
                                    if (i == 1) {
                                        DUHelper.m4730c(C0816dl.f3773b, 203, str);
                                    }
                                } catch (Throwable unused3) {
                                }
                                countDownLatch.countDown();
                            }
                        }).start();
                    } else {
                        DUHelper.m4730c(f3773b, 203, "0");
                        countDownLatch.countDown();
                    }
                    countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(networkCallback2);
                    }
                    if (connectivityManager != null) {
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    if (f3787p == 0 && f3790s == 0) {
                        NetworkRequest networkRequestBuild3 = new NetworkRequest.Builder().addCapability(12).addTransportType(1).build();
                        networkCallback3 = new ConnectivityManager.NetworkCallback() { // from class: cn.shuzilm.core.dl.3
                            /* JADX WARN: Code duplicated, block: B:11:0x0025  */
                            /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                            /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0006, B:5:0x0015, B:9:0x001d, B:13:0x0027, B:15:0x002c), top: B:19:0x0006 }] */
                            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                String str;
                                super.onAvailable(network);
                                String strM4778c = null;
                                if (network != null) {
                                    try {
                                        strM4778c = C0816dl.m4778c(network, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                        String unused3 = C0816dl.f3792u = strM4778c;
                                        str = "0";
                                        if (strM4778c == null) {
                                            strM4778c = "0";
                                        }
                                        if (strM4778c.length() > 64) {
                                            str = strM4778c;
                                        }
                                        if (i == 1) {
                                            DUHelper.m4730c(C0816dl.f3773b, 202, str);
                                        }
                                    } catch (Throwable unused4) {
                                    }
                                } else {
                                    String unused5 = C0816dl.f3792u = strM4778c;
                                    str = "0";
                                    if (strM4778c == null) {
                                        strM4778c = "0";
                                    }
                                    if (strM4778c.length() > 64) {
                                        str = strM4778c;
                                    }
                                    if (i == 1) {
                                        DUHelper.m4730c(C0816dl.f3773b, 202, str);
                                    }
                                }
                                countDownLatch.countDown();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onUnavailable() {
                                super.onUnavailable();
                                countDownLatch.countDown();
                            }
                        };
                        connectivityManager.requestNetwork(networkRequestBuild3, networkCallback3);
                        networkCallback4 = networkCallback3;
                    } else if (i == 1 || f3790s != 0) {
                        countDownLatch.countDown();
                        DUHelper.m4730c(f3773b, 202, "0");
                        f3792u = "0";
                    } else {
                        NetworkRequest networkRequestBuild4 = new NetworkRequest.Builder().addCapability(12).addTransportType(1).build();
                        networkCallback3 = new ConnectivityManager.NetworkCallback() { // from class: cn.shuzilm.core.dl.3
                            /* JADX WARN: Code duplicated, block: B:11:0x0025  */
                            /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                            /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0006, B:5:0x0015, B:9:0x001d, B:13:0x0027, B:15:0x002c), top: B:19:0x0006 }] */
                            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onAvailable(Network network) {
                                String str;
                                super.onAvailable(network);
                                String strM4778c = null;
                                if (network != null) {
                                    try {
                                        strM4778c = C0816dl.m4778c(network, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                        String unused5 = C0816dl.f3792u = strM4778c;
                                        str = "0";
                                        if (strM4778c == null) {
                                            strM4778c = "0";
                                        }
                                        if (strM4778c.length() > 64) {
                                            str = strM4778c;
                                        }
                                        if (i == 1) {
                                            DUHelper.m4730c(C0816dl.f3773b, 202, str);
                                        }
                                    } catch (Throwable unused4) {
                                    }
                                } else {
                                    String unused6 = C0816dl.f3792u = strM4778c;
                                    str = "0";
                                    if (strM4778c == null) {
                                        strM4778c = "0";
                                    }
                                    if (strM4778c.length() > 64) {
                                        str = strM4778c;
                                    }
                                    if (i == 1) {
                                        DUHelper.m4730c(C0816dl.f3773b, 202, str);
                                    }
                                }
                                countDownLatch.countDown();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public void onUnavailable() {
                                super.onUnavailable();
                                countDownLatch.countDown();
                            }
                        };
                        try {
                            connectivityManager.requestNetwork(networkRequestBuild4, networkCallback3);
                            networkCallback4 = networkCallback3;
                        } catch (Throwable unused3) {
                            networkCallback4 = networkCallback3;
                            if (connectivityManager != null) {
                                connectivityManager.unregisterNetworkCallback(networkCallback2);
                            }
                            if (connectivityManager != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    if (f3787p == 0) {
                        try {
                            new Thread(new Runnable() { // from class: cn.shuzilm.core.dl.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        String strM4778c = C0816dl.m4778c(null, DUHelper.m4730c(C0816dl.f3773b, 101, (String) null), 0);
                                        String str = "0";
                                        if (strM4778c == null) {
                                            strM4778c = "0";
                                        }
                                        if (strM4778c.length() <= 64) {
                                            str = strM4778c;
                                        }
                                        if (i == 1) {
                                            DUHelper.m4730c(C0816dl.f3773b, 203, str);
                                        }
                                    } catch (Throwable unused4) {
                                    }
                                    countDownLatch.countDown();
                                }
                            }).start();
                        } catch (Exception unused4) {
                            countDownLatch.countDown();
                        }
                    } else {
                        DUHelper.m4730c(f3773b, 203, "0");
                        countDownLatch.countDown();
                    }
                    countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                    if (connectivityManager != null && networkCallback2 != null) {
                        connectivityManager.unregisterNetworkCallback(networkCallback2);
                    }
                    if (connectivityManager != null || networkCallback4 == null) {
                        return;
                    }
                } catch (Throwable unused5) {
                    networkCallback = networkCallback4;
                    connectivityManager2 = connectivityManager;
                    connectivityManager = connectivityManager2;
                    networkCallback4 = networkCallback;
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(networkCallback2);
                    }
                    if (connectivityManager != null) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (Throwable unused6) {
                networkCallback = null;
                networkCallback2 = null;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback4);
        } catch (Exception unused7) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX INFO: renamed from: d */
    public static String m4783d(Network network, String str, int i) {
        InputStream inputStream;
        String str2;
        synchronized (f3795x) {
            String str3 = null;
            InputStream inputStream2 = null;
            if (str != null) {
                if (!str.isEmpty()) {
                    try {
                        URLConnection uRLConnectionOpenConnection = network != null ? network.openConnection(new URL(str)) : (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (uRLConnectionOpenConnection == null) {
                                return null;
                            }
                            uRLConnectionOpenConnection.setConnectTimeout(5000);
                            uRLConnectionOpenConnection.setReadTimeout(5000);
                            uRLConnectionOpenConnection.setDoInput(true);
                            uRLConnectionOpenConnection.connect();
                            if (((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode() == 200) {
                                inputStream = uRLConnectionOpenConnection.getInputStream();
                                try {
                                    str2 = new String(C0833u.m4808a(inputStream));
                                    inputStream2 = inputStream;
                                } catch (Throwable unused) {
                                    Log.e("shuzilm", "[20007] network connect error.");
                                    if (inputStream != null) {
                                        str2 = null;
                                        inputStream2 = inputStream;
                                    }
                                    return str3;
                                }
                            } else {
                                str2 = null;
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception unused2) {
                                }
                            }
                            str3 = str2;
                            return str3;
                            Log.e("shuzilm", "[20007] network connect error.");
                            if (inputStream != null) {
                                str2 = null;
                                inputStream2 = inputStream;
                                inputStream2.close();
                                str3 = str2;
                            }
                            return str3;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable unused4) {
                        inputStream = null;
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m4788e(String str) {
        LinkedList linkedList;
        try {
            f3784m = 0;
            f3783l = m4789f("TV^geaVn#TiXe#");
            JSONObject jSONObject = f3776e;
            if (jSONObject != null && jSONObject.length() <= 0 && (linkedList = f3775d) != null && linkedList.size() <= 0) {
                f3774c = (NsdManager) f3773b.getSystemService("servicediscovery");
                m4768a("_service" + str + ".", 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static String m4789f(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] + 11);
        }
        return new String(bytes);
    }

    /* JADX INFO: renamed from: ia */
    public static synchronized void m4794ia(Context context) {
        try {
            f3773b = context;
            if (f3786o == 0) {
                f3788q = 0;
                f3785n = "";
            }
            m4784d(1);
            f3786o++;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    private static int m4798m() {
        int iHashCode = (Build.DISPLAY + String.valueOf(new Random().nextInt())).hashCode() % 227;
        if (iHashCode < 0) {
            iHashCode = -iHashCode;
        }
        return iHashCode + 29;
    }

    /* JADX INFO: renamed from: n */
    private static void m4799n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static void m4800o() {
        DUHelper.m4726bm(f3773b, f3776e.toString());
    }

    /* JADX INFO: renamed from: p */
    private static String m4801p() {
        String interfaceName;
        String strSubstring = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f3773b.getSystemService("connectivity");
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            if (linkProperties != null && (interfaceName = linkProperties.getInterfaceName()) != null && interfaceName.contains("wlan")) {
                List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
                int size = linkAddresses.size();
                for (int i = 0; i < size; i++) {
                    String string = linkAddresses.get(i).toString();
                    if (string != null && string.contains(".") && !string.contains(":")) {
                        strSubstring = string.substring(0, string.lastIndexOf(".") + 1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static void m4802q() {
        int iM4809b;
        int iM4798m = m4798m();
        try {
            if ((System.currentTimeMillis() / 1000) - (f3773b.getPackageManager().getPackageInfo(f3773b.getPackageName(), 0).lastUpdateTime / 1000) < 100000) {
                iM4798m = 2;
            }
        } catch (Throwable unused) {
        }
        try {
            String strM4801p = m4801p();
            if ((strM4801p == null || strM4801p != "") && (iM4809b = C0833u.m4809b(f3773b)) != 0) {
                strM4801p = (iM4809b & 255) + "." + ((iM4809b >> 8) & 255) + "." + ((iM4809b >> 16) & 255) + ".";
            }
            if (strM4801p == null || strM4801p == "") {
                return;
            }
            if (strM4801p.lastIndexOf(".") == strM4801p.length() - 1) {
                for (int i = 1; i < iM4798m; i++) {
                    InetAddress.getByName(strM4801p + String.valueOf(i)).isReachable(60);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static int m4803r() {
        int size;
        try {
            if (DUHelper.mPopu == 10001) {
                return -6;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                return -1;
            }
            PackageManager packageManager = f3773b.getPackageManager();
            String packageName = f3773b.getPackageName();
            int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", packageName);
            int iCheckPermission2 = packageManager.checkPermission("android.permission.CHANGE_WIFI_STATE", packageName);
            int iCheckPermission3 = packageManager.checkPermission("android.permission.ACCESS_WIFI_STATE", packageName);
            if (iCheckPermission == 0 && iCheckPermission2 == 0 && iCheckPermission3 == 0) {
                if (i > 32 && packageManager.checkPermission("android.permission.NEARBY_WIFI_DEVICES", packageName) != 0) {
                    return -2;
                }
                int maxPeers = RangingRequest.getMaxPeers();
                if (maxPeers <= 0) {
                    return -1;
                }
                if (maxPeers > 2) {
                    maxPeers--;
                }
                WifiRttManager wifiRttManagerM174322a = pyq0.m174322a(f3773b.getSystemService("wifirtt"));
                if (!wifiRttManagerM174322a.isAvailable() || !f3773b.getPackageManager().hasSystemFeature("android.hardware.wifi.rtt")) {
                    return -3;
                }
                WifiManager wifiManager = (WifiManager) f3773b.getSystemService("wifi");
                if (wifiManager.getWifiState() != 3) {
                    return -3;
                }
                wyq0.m208623a();
                RangingRequest.Builder builderM204034a = vyq0.m204034a();
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults == null || (size = scanResults.size()) <= 0) {
                    return -4;
                }
                if (size < maxPeers) {
                    maxPeers = size;
                }
                for (int i2 = 0; i2 < maxPeers; i2++) {
                    builderM204034a.addAccessPoint(scanResults.get(i2));
                }
                wifiRttManagerM174322a.startRanging(builderM204034a.build(), f3773b.getMainExecutor(), new RangingResultCallback() { // from class: cn.shuzilm.core.dl.1
                    public void onRangingFailure(int i3) {
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C0816dl.f3776e.put("wr", jCurrentTimeMillis + ";err_" + i3 + com.meituan.robust.Constants.PACKNAME_END);
                        } catch (Exception unused) {
                        }
                    }

                    public void onRangingResults(List list) {
                        if (list == null) {
                            return;
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(System.currentTimeMillis() + com.meituan.robust.Constants.PACKNAME_END);
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                RangingResult rangingResultM213635a = xyq0.m213635a(list.get(i3));
                                if (rangingResultM213635a.getStatus() == 0) {
                                    try {
                                        Object objInvoke = rangingResultM213635a.getClass().getMethod(C0816dl.m4789f("\\ZiBVX6YYgZhh"), null).invoke(rangingResultM213635a, null);
                                        if (objInvoke != null) {
                                            sb.append(objInvoke.toString().replace(":", ""));
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    sb.append(Constants.SEPARATOR_COMMA);
                                    sb.append(rangingResultM213635a.getDistanceMm() + Constants.SEPARATOR_COMMA + rangingResultM213635a.getRssi());
                                    sb.append(com.meituan.robust.Constants.PACKNAME_END);
                                    if (sb.length() > 1024) {
                                        break;
                                    }
                                }
                            }
                            C0816dl.f3776e.put("wr", sb.toString());
                        } catch (Throwable unused2) {
                        }
                    }
                });
            }
            return -2;
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m4804s() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f3773b.getSystemService("connectivity");
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: t */
    private static void m4805t() {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) f3773b.getSystemService("phone");
        String simOperator = telephonyManager.getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        try {
            if (telephonyManager.getSimState() == 5 && m4804s()) {
                f3789r = 0;
            } else {
                f3789r = 1;
            }
        } catch (Exception unused) {
        }
        int iM4809b = C0833u.m4809b(f3773b);
        if (iM4809b != 0) {
            f3790s = 0;
        } else {
            f3790s = 1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f3773b.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                f3788q = 1;
                f3791t = "0";
                f3792u = "0";
                DUHelper.m4730c(f3773b, 201, "0");
                DUHelper.m4730c(f3773b, 202, "0");
                return;
            }
            LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
            if (linkProperties == null) {
                return;
            }
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            if (linkAddresses.isEmpty()) {
                f3788q = 1;
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator<LinkAddress> it = linkAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String hostAddress = it.next().getAddress().getHostAddress();
                    sb.append(hostAddress);
                    if (!f3785n.isEmpty() && f3785n.contains(hostAddress)) {
                        f3788q = 1;
                        z = true;
                        break;
                    }
                }
                if (f3785n.isEmpty()) {
                    f3785n = sb.toString();
                    f3788q = 0;
                }
                if (!z && !f3785n.isEmpty()) {
                    f3785n = sb.toString();
                    f3788q = 0;
                }
            }
            ProxyInfo httpProxy = linkProperties.getHttpProxy();
            if (httpProxy == null || httpProxy.getHost() == null) {
                f3787p = 1;
            } else {
                f3787p = 0;
            }
            String interfaceName = linkProperties.getInterfaceName();
            if (interfaceName != null && !interfaceName.isEmpty() && (interfaceName.contains("tun") || interfaceName.contains("ppp"))) {
                f3787p = 0;
            }
            if (!f3794w.isEmpty() && (!f3794w.equals(simOperator) || f3791t == null)) {
                f3788q = 0;
            }
            f3794w = simOperator;
            int i = f3793v;
            if (i != 0 && (i != iM4809b || f3792u == null)) {
                f3788q = 0;
            }
            f3793v = iM4809b;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static synchronized void m4777b(String str, String str2) {
        try {
            if (str2.contains(".")) {
                f3775d.add(str + "." + str2.split("\\.")[0] + ".");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static synchronized void m4776b(NsdServiceInfo nsdServiceInfo, String str, String str2, JSONObject jSONObject) {
        if (str != null) {
            try {
                if (!str.isEmpty() && nsdServiceInfo != null && jSONObject != null) {
                    f3774c.resolveService(nsdServiceInfo, new ResolveListenerAddress(str, str2, jSONObject));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static synchronized void m4775b(NsdManager nsdManager, NsdManager.DiscoveryListener discoveryListener) {
        try {
            nsdManager.stopServiceDiscovery(discoveryListener);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m4782d() {
        int i = f3784m;
        f3784m = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static synchronized void m4784d(int i) {
        if (C0833u.m4807a(f3773b, "android.permission.CHANGE_NETWORK_STATE")) {
            m4805t();
            m4781c(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4785d(Context context, String str, final boolean z) {
        if (f3772a > 0) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            f3773b = applicationContext;
            if (applicationContext == null) {
                return;
            } else {
                new Thread(new Runnable() { // from class: cn.shuzilm.core.dl.5
                    @Override // java.lang.Runnable
                    public synchronized void run() {
                        try {
                            C0816dl.f3772a++;
                            if (z) {
                                C0816dl.m4802q();
                                return;
                            }
                            int iM4803r = C0816dl.m4803r();
                            if (C0833u.m4806a(C0816dl.f3773b)) {
                                int unused = C0816dl.f3780i = 1;
                                C0816dl.m4788e(C0816dl.m4789f("h#TYch\"hY#TjYe"));
                                C0816dl.m4802q();
                            }
                            if ((System.currentTimeMillis() / 1000) - (C0816dl.f3773b.getPackageManager().getPackageInfo(C0816dl.f3773b.getPackageName(), 0).lastUpdateTime / 1000) < 70000) {
                                C0816dl.m4784d(1);
                            }
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception unused2) {
                            }
                            if (C0816dl.f3776e.toString().length() > 0) {
                                C0816dl.f3776e.put("wrs", "" + iM4803r);
                            }
                            if (C0816dl.f3776e != null) {
                                C0816dl.f3776e.put(RXScreenCaptureService.KEY_INDEX, C0816dl.f3791t + Constants.SEPARATOR_COMMA + C0816dl.f3792u + com.meituan.robust.Constants.PACKNAME_END);
                            }
                            C0816dl.m4800o();
                        } catch (Throwable unused3) {
                        }
                    }
                }).start();
            }
        } catch (Throwable unused) {
        }
        f3772a++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX INFO: renamed from: c */
    public static synchronized String m4778c(Network network, String str, int i) {
        InputStream inputStream;
        String str2;
        URLConnection uRLConnectionOpenConnection;
        String str3 = null;
        InputStream inputStream2 = null;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    if (network != null) {
                        uRLConnectionOpenConnection = network.openConnection(new URL(str));
                    } else {
                        uRLConnectionOpenConnection = (HttpURLConnection) new URL(str).openConnection();
                    }
                    try {
                        if (uRLConnectionOpenConnection == null) {
                            return null;
                        }
                        uRLConnectionOpenConnection.setConnectTimeout(5000);
                        uRLConnectionOpenConnection.setReadTimeout(5000);
                        uRLConnectionOpenConnection.setDoInput(true);
                        uRLConnectionOpenConnection.connect();
                        if (((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode() == 200) {
                            inputStream = uRLConnectionOpenConnection.getInputStream();
                            try {
                                str2 = new String(C0833u.m4808a(inputStream));
                                inputStream2 = inputStream;
                            } catch (Throwable unused) {
                                Log.e("shuzilm", "[20001] network connect error.");
                                if (inputStream != null) {
                                    str2 = null;
                                    inputStream2 = inputStream;
                                }
                                return str3;
                            }
                        } else {
                            str2 = null;
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception unused2) {
                            }
                        }
                        str3 = str2;
                        return str3;
                        Log.e("shuzilm", "[20001] network connect error.");
                        if (inputStream != null) {
                            str2 = null;
                            inputStream2 = inputStream;
                            inputStream2.close();
                            str3 = str2;
                        }
                        return str3;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused4) {
                    inputStream = null;
                }
            }
        }
        return null;
    }
}
