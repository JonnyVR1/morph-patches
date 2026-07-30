package com.p046p1.mobile.putong.api.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.ishumei.smantifraud.SmAntiFraud;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.CachedBuildInfoHash;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.ExceptionChecker;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.network.NetReporter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.avc0;
import p149l.b0f;
import p149l.cll;
import p149l.du2;
import p149l.dyd;
import p149l.e30;
import p149l.exc0;
import p149l.f51;
import p149l.gxc0;
import p149l.h500;
import p149l.hyx;
import p149l.j95;
import p149l.k850;
import p149l.k8c;
import p149l.kgw;
import p149l.le2;
import p149l.mkd0;
import p149l.mu5;
import p149l.n11;
import p149l.oa20;
import p149l.puk0;
import p149l.qib0;
import p149l.qjw;
import p149l.rb20;
import p149l.stc0;
import p149l.t95;
import p149l.ua20;
import p149l.uqd0;
import p149l.utc0;
import p149l.ux40;
import p149l.vjf0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xgj;
import p149l.xh5;
import p149l.yp4;
import p149l.z3g0;

/* JADX INFO: loaded from: classes9.dex */
public final class Network {
    public static final String AUTH = "Authorization";
    public static final String AUTH_ACCOUNT = "aa";
    public static final String AUTH_BEFORE_SIGN_UP = "abs";
    public static final String AUTH_CORE = "ac";
    public static final boolean DEBUG_BUILDINFO_CACHE = false;
    public static final String LANGUAGE_ZH_HANS = "zh-Hans";
    public static final String LANGUAGE_ZH_HANT = "zh-Hant";
    public static final String MAC = "MAC";
    private static final String TAG = "Network";
    private static Location previousLocation;
    private k850 cloudHttp;
    private k850 downloadHttp;
    private volatile String hashAccount;
    private k850 http;
    private ux40 httpProxy;
    private xaj0<TreeMap<String, String>, Boolean, List<String>> xmpNodes;
    public static final hyx JSON = hyx.m133628d("application/json; charset=utf-8");
    static uqd0 debug_proxyString = new uqd0("debug_proxy_string", "proxy.p1staff.com");
    private static ThreadLocal<SimpleDateFormat> dateHeaderFormat = new C4694a();
    private static String formattedLocation = "";
    public static boolean debug_fakeServerUnavailable = false;
    private static uqd0 savedBuildInfoHash = new uqd0("buildinfo_hash", null);
    private volatile long updateTimeInSinceDeviceBootRealMillis = 0;
    private C22392a<String> hash = C22392a.m221512b();
    private volatile boolean hasRequestAb = false;
    private Set<String> lastPins = new HashSet();
    public long lastElapsedRealtime = -1;
    public long lastServerTime = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$a */
    public class C4694a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$b */
    public class RunnableC4695b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Thread f17158a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Handler f17159b;

        public RunnableC4695b(Thread thread, Handler handler) {
            this.f17158a = thread;
            this.f17159b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17158a.interrupt();
            this.f17159b.postDelayed(this, 100L);
        }
    }

    @SuppressLint({"LogUseError"})
    public Network(k850.C17954b c17954b) {
        du2.m113670a("[common][network]", "Network before call init");
        init(c17954b);
        du2.m113670a("[common][network]", "Network after call init");
    }

    public static stc0 addHMC(stc0 stc0Var) throws IOException {
        return rb20.m178552a(stc0Var.m185878h()).m185889h("Authorization", "MAC " + basicToken(stc0Var.m185881k().toString(), String.valueOf(TimeConverter.switchTime(System.currentTimeMillis())), stc0Var.m185871a())).m185883b();
    }

    public static stc0.C20027a addLocationHeader(stc0.C20027a c20027a, String str) {
        Location locationM78865q;
        AbstractC13063a abstractC13063a = qib0.f154687E;
        if (abstractC13063a != null && (locationM78865q = abstractC13063a.m78865q()) != null) {
            try {
                c20027a.m185889h("Geolocation", b0f.m99756f(formatLocation(locationM78865q), str));
                return c20027a;
            } catch (Exception e) {
                c20027a.m185889h("Geolocation", formatLocation(locationM78865q));
                CrashHelper.m81296c(e);
            }
        }
        return c20027a;
    }

    private String authToken(String str, String str2, String str3, utc0 utc0Var) throws IOException {
        return getNewToken(Constants.VIA_REPORT_TYPE_WPA_STATE, "android4.9.8", new String[]{str, str2, qib0.f154714c0.accessToken(), getUA(), str3}, utc0Var);
    }

    private static String basicToken(String str, String str2, utc0 utc0Var) throws IOException {
        return getNewToken(Constants.VIA_REPORT_TYPE_START_WAP, "android4.9.8", new String[]{str, str2, dyd.m114055a(), getUA(), null}, utc0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m29549c(String str) {
        return str;
    }

    private static boolean cacheBuildInfoHash(String str, String str2) {
        if (str == null) {
            return false;
        }
        CachedBuildInfoHash cachedBuildInfoHashNew_ = CachedBuildInfoHash.new_();
        cachedBuildInfoHashNew_.update_time = System.currentTimeMillis();
        cachedBuildInfoHashNew_.hash = str2;
        cachedBuildInfoHashNew_.accessToken = str;
        cachedBuildInfoHashNew_.f38731ua = getUA();
        return savedBuildInfoHash.put(CachedBuildInfoHash.JSON_ADAPTER.serialize(cachedBuildInfoHashNew_));
    }

    private C22306c<String> createSmAntiFraudInit() {
        return C22306c.create(new C22306c.a() { // from class: l.sa20
            @Override // p149l.e30
            public final void call(Object obj) {
                Network.m29552f((z3g0) obj);
            }
        }).map(new w9j() { // from class: l.ta20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Network.lambda$createSmAntiFraudInit$8((Boolean) obj);
            }
        }).timeout(10L, TimeUnit.SECONDS, C22306c.just(""));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m29552f(z3g0 z3g0Var) {
        z3g0Var.onNext(Boolean.FALSE);
        z3g0Var.onCompleted();
    }

    public static String formatLocation(Location location) {
        String str;
        Location location2 = previousLocation;
        if (location2 != null && location2.m78829s() == location.m78829s() && previousLocation.m78830t() == location.m78830t() && previousLocation.m78831u() == location.m78831u()) {
            return formattedLocation;
        }
        previousLocation = location;
        try {
            String str2 = String.format(Locale.US, "geo:%1$.4f,%2$.4f;u=%3$.0f", Double.valueOf(location.m78831u()), Double.valueOf(location.m78833x()), Float.valueOf(location.m78829s()));
            formattedLocation = str2;
            return str2;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("Network formatLocation:");
            sb.append(e.getMessage());
            if (location == null) {
                str = "currentLocation is null";
            } else {
                str = "getLatitude:" + location.m78831u() + " getLongitude:" + location.m78833x() + " getAccuracy:" + location.m78829s();
            }
            sb.append(str);
            CrashHelper.m81296c(new Exception(sb.toString(), e));
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m29553g(Throwable th) {
    }

    public static String getFormattedLocation() {
        return formattedLocation;
    }

    private static String getMac(String[] strArr, byte[] bArr) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[1]);
        arrayList.add(strArr[2]);
        arrayList.add(strArr[4]);
        arrayList.add(cll.m107501r(strArr[0]).m107518h());
        arrayList.add(strArr[3]);
        byte[] bytes = ("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh" + mkString2(arrayList)).getBytes("UTF-8");
        kgw kgwVar = new kgw();
        kgwVar.m145945i();
        kgwVar.m145947n(bytes);
        if (bArr != null) {
            kgwVar.m145947n(bArr);
        }
        return le2.m149477c(kgwVar.m145944g(), 2);
    }

    private static String getNewToken(String str, String str2, String[] strArr, utc0 utc0Var) throws IOException {
        byte[] byteArray;
        if (utc0Var == null || !JSON.equals(utc0Var.contentType())) {
            byteArray = null;
        } else {
            Buffer buffer = new Buffer();
            utc0Var.writeTo(buffer);
            byteArray = buffer.readByteArray();
        }
        return JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200321e(vwb.m200324f0(str, str2), vwb.m200324f0(strArr[1], strArr[2], strArr[4]), vwb.m200324f0(getMac(strArr, byteArray))));
    }

    public static String getUA() {
        return rb20.m178555d();
    }

    private static String getValidDiskHashForCurrentAccessToken() {
        String str;
        du2.m113670a("[putong-common][upload]", "s1...");
        String strAccessToken = qib0.f154714c0.accessToken();
        if (strAccessToken == null) {
            du2.m113670a("[putong-common][upload]", "s2");
            return null;
        }
        String str2 = savedBuildInfoHash.get();
        if (str2 == null) {
            du2.m113670a("[putong-common][upload]", "s3");
            return null;
        }
        try {
            CachedBuildInfoHash cachedBuildInfoHash = CachedBuildInfoHash.JSON_ADAPTER.parse(str2);
            if (cachedBuildInfoHash.f38731ua == null || (str = cachedBuildInfoHash.accessToken) == null || cachedBuildInfoHash.hash == null) {
                throw new Exception("has null value in parsed data");
            }
            if (!TextUtils.equals(strAccessToken, str)) {
                du2.m113670a("[putong-common][upload]", "s5");
                return null;
            }
            if (System.currentTimeMillis() - cachedBuildInfoHash.update_time >= 43200000) {
                du2.m113670a("[putong-common][upload]", "s6");
                return null;
            }
            if (TextUtils.isEmpty(cachedBuildInfoHash.hash)) {
                du2.m113670a("[putong-common][upload]", "s7");
                return null;
            }
            du2.m113670a("[putong-common][upload]", "s8");
            return cachedBuildInfoHash.hash;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            du2.m113670a("[putong-common][upload]", "s4");
            return null;
        }
    }

    private xaj0<TreeMap<String, String>, Boolean, List<String>> getXmpNodes() {
        xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var = this.xmpNodes;
        return xaj0Var == null ? prepareXmpXml() : xaj0Var;
    }

    private TreeMap<String, String> getXmpXmlWhenGetCore(TreeMap<String, String> treeMap, boolean z) {
        du2.m113670a("[putong-common][upload]", "start gxx");
        du2.m113670a("[putong-common][upload]", "gx2");
        if (z) {
            try {
                String strM114064j = dyd.m114064j();
                if (!TextUtils.isEmpty(strM114064j)) {
                    treeMap.put(".ssn", strM114064j);
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            try {
                File parentFile = App.f15369e.getDatabasePath("core_v2_" + qib0.f154714c0.userId()).getParentFile();
                if (parentFile.exists()) {
                    ArrayList arrayListM200339n = vwb.m200339n(vwb.m200304R(parentFile.list(), new w9j() { // from class: l.ab20
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Network.m29549c((String) obj);
                        }
                    }), new w9j() { // from class: l.qa20
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                        }
                    });
                    vwb.m200295I(arrayListM200339n, new Comparator() { // from class: l.ra20
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ((String) obj).compareTo((String) obj2);
                        }
                    });
                    treeMap.put(".fs", vwb.m200307U(arrayListM200339n, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
                    treeMap.put(".fs_count", String.valueOf(arrayListM200339n.size()));
                }
            } catch (Exception e2) {
                CrashHelper.m81296c(new Exception("Network exception:" + e2));
            }
            du2.m113670a("[putong-common][upload]", "gx3");
        }
        return treeMap;
    }

    public static String getXttClientInfo() {
        return "{\"deviceToken\": \"" + dyd.m114055a() + "\"}";
    }

    public static boolean hasInvalidHash() {
        return qib0.f154693H.hash.m221515e() == null || SystemClock.elapsedRealtime() - qib0.f154693H.updateTimeInSinceDeviceBootRealMillis > 86400000;
    }

    public static C22392a<String> hash() {
        return qib0.f154693H.hash;
    }

    @SuppressLint({"LogUseError"})
    private void init(k850.C17954b c17954b) {
        du2.m113670a("[common][network]", "Network during call init first");
        Log.e("[common][network]", "Network during call init first");
        c17954b.m144880a(new j95());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c17954b.m144885f(10L, timeUnit);
        c17954b.m144899t(40L, timeUnit);
        String strReplace = mu5.f135738f.replace("https://", "");
        String strReplace2 = mu5.f135737e.replace("https://", "");
        this.lastPins.add("sha1/1S4TwavjSdrotJWU73w4Q2BkZr0=");
        this.lastPins.add("sha1/IQ8siffEzV0bgl441sZZO6aTda4=");
        this.lastPins.add("sha1/XoxTGCJgHVZx1mqgzGSgYAdD1ag=");
        this.lastPins.add("sha1/tFVQFINFH+6MoKEM9a/eOkxeEVk=");
        String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
        c17954b.m144884e(new yp4.C21458a().m215574a(strReplace, strArr).m215574a(strReplace2, strArr).m215575b());
        k850 k850VarM144882c = c17954b.m144882c();
        this.http = k850VarM144882c;
        this.httpProxy = new ux40(k850VarM144882c);
        c17954b.m144899t(120L, timeUnit);
        this.cloudHttp = c17954b.m144882c();
        du2.m113670a("[common][network]", "Network during call init last");
        Log.e("[common][network]", "Network during call init last");
        RemoteConfig.m79284Y().subscribe(mkd0.m154956H(new e30() { // from class: l.ya20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197137a.lambda$init$0((RemoteConfig.ConfigStep) obj);
            }
        }, new e30() { // from class: l.za20
            @Override // p149l.e30
            public final void call(Object obj) {
                Network.m29557k((Throwable) obj);
            }
        }));
    }

    public static InputStream inputStreamAfterCheck(exc0 exc0Var) throws IOException {
        if (exc0Var.m118609q() != 204) {
            return exc0Var.m118606k().byteStream();
        }
        return null;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m29557k(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$createSmAntiFraudInit$8(Boolean bool) {
        return bool.booleanValue() ? SmAntiFraud.getBase() : "";
    }

    private /* synthetic */ k850.C17954b lambda$debug_setProxy$2() throws Exception {
        k850.C17954b c17954bM144867v = this.http.m144867v();
        c17954bM144867v.m144897r(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(InetAddress.getByName("proxy.p1staff.com"), 1337)));
        return c17954bM144867v;
    }

    private /* synthetic */ void lambda$debug_setProxy$3(k850.C17954b c17954b) {
        this.http = c17954b.m144882c();
        c17954b.m144899t(120L, TimeUnit.SECONDS);
        this.cloudHttp = c17954b.m144882c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(RemoteConfig.ConfigStep configStep) {
        String strM79302F = RemoteConfig.m79298x().m79302F("metaInfo");
        if (!TextUtils.isEmpty(strM79302F) && strM79302F.contains("metaInfo1") && strM79302F.contains("metaInfo2")) {
            du2.m113670a("[common][network]", "Network add meteInfo =".concat(strM79302F));
            try {
                JSONObject jSONObject = new JSONObject(strM79302F);
                String strOptString = jSONObject.optString("metaInfo1");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("metaInfo2");
                int length = jSONArrayOptJSONArray.length();
                qjw qjwVar = new qjw(strOptString, App.f15369e);
                try {
                    Field declaredField = qjw.class.getDeclaredField("a");
                    declaredField.setAccessible(true);
                    declaredField.set(qjwVar, strOptString);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    CrashHelper.m81296c(new RuntimeException("Failed to set MMCrypto.publicKey via reflection", e));
                }
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    try {
                        String strM175038a = qjwVar.m175038a(jSONArrayOptJSONArray.getString(i));
                        du2.m113670a("[common][network]", "Network getInitDecryptData result：" + strM175038a);
                        if (!this.lastPins.contains(strM175038a)) {
                            this.lastPins.add(strM175038a);
                            z = true;
                        }
                    } catch (Throwable th) {
                        CrashHelper.m81296c(new RuntimeException("Network getData error i=" + i + " , metaInfo = " + strM79302F, th));
                    }
                }
                if (z) {
                    String strReplace = mu5.f135738f.replace("https://", "");
                    String strReplace2 = mu5.f135737e.replace("https://", "");
                    String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
                    this.httpProxy.m196147f(new yp4.C21458a().m215574a(strReplace, strArr).m215574a(strReplace2, strArr).m215575b());
                }
            } catch (Throwable th2) {
                CrashHelper.m81296c(new RuntimeException("Network handle metaInfo error metaInfo = ".concat(strM79302F), th2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$smAntiFraudInit$9(TreeMap treeMap, HandlerThread handlerThread) {
        try {
            try {
                String str = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str)) {
                    str.toLowerCase().contains("samsung");
                }
                String base = SmAntiFraud.getBase();
                synchronized (treeMap) {
                    treeMap.put("smnd", base);
                    treeMap.notify();
                }
                handlerThread.quit();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                synchronized (treeMap) {
                    treeMap.put("smnd", "");
                    treeMap.notify();
                    handlerThread.quit();
                }
            }
        } catch (Throwable th) {
            synchronized (treeMap) {
                treeMap.put("smnd", "");
                treeMap.notify();
                handlerThread.quit();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C22306c lambda$uploadAdData$10(Act.C4299r c4299r) {
        du2.m113670a("[putong-common][upload]", "px7");
        return createSmAntiFraudInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadAdData$11(String str) {
        String str2;
        String strSerialize;
        String str3 = "";
        du2.m113670a("[putong-common][upload]", "px8");
        int i = 0;
        int i2 = 0;
        while (i2 < 5) {
            try {
                du2.m113670a("[putong-common][upload]", "s-uad1");
                xaj0<TreeMap<String, String>, Boolean, List<String>> xmpNodes = getXmpNodes();
                try {
                    xmpNodes.f191751a.put("smnd", str);
                    TreeMap<String, String> xmpXmlWhenGetCore = getXmpXmlWhenGetCore(xmpNodes.f191751a, xmpNodes.f191752b.booleanValue());
                    JsonAdapter<String> jsonAdapter = JsonAdapter.STRING_ADAPTER;
                    String strSerialize2 = jsonAdapter.MAP_ADAPTER().serialize(xmpXmlWhenGetCore);
                    try {
                        TreeMap treeMap = new TreeMap((SortedMap) xmpXmlWhenGetCore);
                        treeMap.remove(".fs_count");
                        treeMap.remove(".ignore");
                        treeMap.remove(".fs");
                        treeMap.remove("smnd");
                        strSerialize = jsonAdapter.MAP_ADAPTER().serialize(treeMap);
                    } catch (NoSuchElementException unused) {
                        strSerialize = str3;
                    }
                    String strM149477c = le2.m149477c(kgw.m145933b(strSerialize2.getBytes("UTF-8")), 2);
                    String strM149477c2 = le2.m149477c(kgw.m145933b(strSerialize.getBytes("UTF-8")), 2);
                    String validDiskHashForCurrentAccessToken = getValidDiskHashForCurrentAccessToken();
                    boolean zEquals = true;
                    if (validDiskHashForCurrentAccessToken == null) {
                        du2.m113670a("[putong-common][upload]", "not use sh1");
                    } else {
                        du2.m113670a("[putong-common][upload]", "ad1:" + validDiskHashForCurrentAccessToken + " cache1" + strM149477c2);
                        zEquals = true ^ validDiskHashForCurrentAccessToken.equals(strM149477c2);
                    }
                    if (zEquals) {
                        byte[] bytes = "SFOrmGZS_zkM5uv7ACBbYKyNLxTYdVlC".getBytes("UTF-8");
                        byte[] bArrM208680a = xgj.m208680a(strSerialize2);
                        byte[] bArr = new byte[16];
                        new Random(SystemClock.elapsedRealtime() + 213).nextBytes(bArr);
                        try {
                            NKResult nKResultM163223a = oa20.m163223a(bytes, bArrM208680a, bArr);
                            byte[] bArr2 = nKResultM163223a.f17157iv;
                            byte[] bArr3 = new byte[bArr2.length + nKResultM163223a.res.length];
                            System.arraycopy(bArr2, i, bArr3, i, bArr2.length);
                            byte[] bArr4 = nKResultM163223a.res;
                            System.arraycopy(bArr4, i, bArr3, nKResultM163223a.f17157iv.length, bArr4.length);
                            String strM208761i = xh5.m208761i("/ad-data");
                            utc0 utc0VarCreate = utc0.create(hyx.m133628d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), bArr3);
                            try {
                                String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
                                stc0.C20027a c20027aM185898q = common().m185898q(strM208761i);
                                StringBuilder sb = new StringBuilder();
                                str2 = str3;
                                try {
                                    try {
                                        sb.append("MAC ");
                                        sb.append(authToken(strM208761i, strValueOf, strM149477c, utc0VarCreate));
                                        stc0.C20027a c20027aM185893l = c20027aM185898q.m185889h("Authorization", sb.toString()).m185893l(utc0VarCreate);
                                        if (Act.foreground_() == null) {
                                            c20027aM185893l.m185882a("Client-State", OMSResourceType.background);
                                        }
                                        exc0 exc0VarExecute = null;
                                        int i3 = 0;
                                        while (i3 < 10) {
                                            try {
                                                try {
                                                    exc0VarExecute = this.http.mo144849a(c20027aM185893l.m185883b()).execute();
                                                    i3 += 11;
                                                } catch (Throwable th) {
                                                    t95.m187604b(exc0VarExecute);
                                                    throw th;
                                                }
                                            } catch (Exception unused2) {
                                                i3++;
                                            }
                                        }
                                        if (exc0VarExecute != null) {
                                            updateServerTime(exc0VarExecute.m118611u("Date"));
                                            Exception excCheck = ExceptionChecker.check(exc0VarExecute);
                                            if (excCheck != null) {
                                                throw excCheck;
                                            }
                                        }
                                        t95.m187604b(exc0VarExecute);
                                        if (i3 >= 11) {
                                            cacheBuildInfoHash(qib0.f154714c0.accessToken(), strM149477c2);
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        du2.m113670a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                                        CrashHelper.m81296c(e);
                                        i2++;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    CrashHelper.m81297d(e, 100);
                                    du2.m113670a("[putong-common][upload]", "uploadAdData::generate authToken failed::urlStr=" + strM208761i + "::uploadTempHash=" + strM149477c + "::c=" + new String(bArr3));
                                    throw new NetIgnoredException(new NetIgnoredException(e));
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            String str4 = str3;
                            CrashHelper.m81297d(e4, 50);
                            String str5 = (bArrM208680a == null || bArrM208680a.length <= 0) ? str4 : new String(bArrM208680a);
                            du2.m113670a("[putong-common][upload]", "uploadAdData::TantanApp.pluginApi.generateKey failed::clear=" + str5 + "::ivBytes=" + new String(bArr));
                            throw new NetIgnoredException(new NetIgnoredException(e4));
                        }
                    } else {
                        str2 = str3;
                    }
                    i2 += 5;
                } catch (Exception e5) {
                    e = e5;
                    str2 = str3;
                    du2.m113670a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                    CrashHelper.m81296c(e);
                    i2++;
                    str3 = str2;
                    i = 0;
                }
            } catch (Exception e6) {
                e = e6;
            }
            str3 = str2;
            i = 0;
        }
    }

    public static String language() {
        return rb20.m178557f();
    }

    private stc0.C20027a mayAddLocationHeader(cll cllVar, stc0.C20027a c20027a, String str) {
        addLocationHeader(c20027a, str);
        return c20027a;
    }

    private stc0 mayEncryptBody(stc0 stc0Var, stc0.C20027a c20027a, String str) throws Exception {
        if (b0f.m99762l()) {
            stc0Var = c20027a.m185889h("X-Janus-Response-flat", "1").m185883b();
        }
        if (b0f.m99763m(stc0Var.m185881k())) {
            String strM99761k = b0f.m99761k(stc0Var.m185871a());
            if (NullChecker.m81303a(strM99761k)) {
                return c20027a.m185891j(stc0Var.m185877g(), utc0.create(JSON, b0f.m99756f(strM99761k, str))).m185883b();
            }
        }
        return stc0Var;
    }

    public static <T> String mkString2(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (T t : collection) {
            if (t != null) {
                sb.append(t.toString());
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ed  */
    private xaj0<TreeMap<String, String>, Boolean, List<String>> prepareSimpleXml() {
        String strM114056b;
        String str;
        boolean z;
        boolean z2;
        System.currentTimeMillis();
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListM200324f0 = vwb.m200324f0("af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status");
        try {
            strM114056b = dyd.m114056b();
            try {
                try {
                    strM114056b = UUID.nameUUIDFromBytes(strM114056b.getBytes(vwb.f183321a)).toString();
                    z = !ValueObject.util_equals(strM114056b, dyd.m114055a());
                    str = strM114056b;
                    while (true) {
                        if (((!z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1))) {
                            break;
                        }
                        jNanoTime++;
                    }
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m81296c(new Exception("Network exception:" + e));
                    str = strM114056b;
                    z = false;
                }
                z2 = false;
                for (String str2 : arrayListM200324f0) {
                    try {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strM119473a = f51.m119473a(str2);
                                if (!ValueObject.util_equals(strM119473a, f51.m119474b(str2))) {
                                    z2 = true;
                                }
                                if (strM119473a != null) {
                                    treeMap.put(str2, strM119473a);
                                }
                            } else {
                                String strM119473a2 = f51.m119473a(str2);
                                if (strM119473a2 != null) {
                                    treeMap.put(str2, strM119473a2);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.m81296c(new Throwable("Network exception:" + th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        CrashHelper.m81296c(new Throwable("Network exception:" + th));
                        while (true) {
                            if (!z) {
                            }
                            jNanoTime++;
                        }
                        return new xaj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListM200324f0);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = false;
            }
        } catch (Exception e2) {
            e = e2;
            strM114056b = null;
        }
        if (!z) {
            treeMap.put(".uuid", str);
        }
        return new xaj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListM200324f0);
    }

    private xaj0<TreeMap<String, String>, Boolean, List<String>> prepareXmpXml() {
        boolean z;
        String str;
        boolean z2;
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListM200324f0 = vwb.m200324f0("af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status");
        du2.m113670a("[putong-common][upload]", "px1");
        int iM178554c = rb20.m178554c();
        du2.m113670a("[putong-common][upload]", "px2");
        boolean z3 = false;
        boolean z4 = (iM178554c & Integer.MIN_VALUE) != 0;
        String string = null;
        if (z4) {
            str = string;
            z = false;
        } else {
            try {
                string = UUID.nameUUIDFromBytes(dyd.m114056b().getBytes(vwb.f183321a)).toString();
                z = !ValueObject.util_equals(string, dyd.m114055a());
                str = string;
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("Network exception:" + e));
                str = string;
                z = false;
            }
        }
        du2.m113670a("[putong-common][upload]", "px3");
        if (!z4 && !z) {
            treeMap.put(".uuid", str);
        }
        try {
            z2 = false;
            for (String str2 : arrayListM200324f0) {
                try {
                    if (!z4) {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strM119473a = f51.m119473a(str2);
                                if (!ValueObject.util_equals(strM119473a, f51.m119474b(str2))) {
                                    z2 = true;
                                }
                                if (strM119473a != null) {
                                    treeMap.put(str2, strM119473a);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.m81296c(new Throwable("Network exception:" + th));
                        }
                    }
                    String strM119473a2 = f51.m119473a(str2);
                    if (strM119473a2 != null) {
                        treeMap.put(str2, strM119473a2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CrashHelper.m81296c(new Throwable("Network exception:" + th));
                    du2.m113670a("[putong-common][upload]", "px4");
                    treeMap.put(".Debuggable", rb20.m178556e() + "");
                    du2.m113670a("[putong-common][upload]", "px5");
                    du2.m113670a("[putong-common][upload]", "px6");
                    while (true) {
                        if (!z4) {
                        }
                        jNanoTime++;
                    }
                    if (!z4) {
                        z3 = true;
                    }
                    xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var = new xaj0<>(treeMap, Boolean.valueOf(z3), arrayListM200324f0);
                    this.xmpNodes = xaj0Var;
                    return xaj0Var;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
        }
        du2.m113670a("[putong-common][upload]", "px4");
        try {
            treeMap.put(".Debuggable", rb20.m178556e() + "");
            while (true) {
                if (((!z4 && jNanoTime % 7 == 1) || (!z4 && jNanoTime % 7 != 1)) && (((z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1)))) {
                    break;
                }
                jNanoTime++;
            }
        } catch (Throwable unused) {
            treeMap.put(".Debuggable", "0");
        }
        du2.m113670a("[putong-common][upload]", "px5");
        du2.m113670a("[putong-common][upload]", "px6");
        if (!z4 && !z && !z2) {
            z3 = true;
        }
        xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var2 = new xaj0<>(treeMap, Boolean.valueOf(z3), arrayListM200324f0);
        this.xmpNodes = xaj0Var2;
        return xaj0Var2;
    }

    private void smAntiFraudInit(final TreeMap<String, String> treeMap) {
        try {
            SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
            HashSet hashSet = new HashSet();
            hashSet.add("apps");
            hashSet.add("riskapp");
            hashSet.add("bssid");
            hashSet.add("cell");
            hashSet.add("network");
            hashSet.add("ssid");
            hashSet.add("wifiip");
            smOption.setNotCollect(hashSet);
            smOption.setTransport(false);
            smOption.setCloudConf(false);
            SmAntiFraud.create(App.f15369e, smOption);
            final HandlerThread handlerThread = new HandlerThread("smAnti");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            Thread thread = new Thread(new Runnable() { // from class: l.pa20
                @Override // java.lang.Runnable
                public final void run() {
                    Network.lambda$smAntiFraudInit$9(treeMap, handlerThread);
                }
            }, "smAnti");
            RunnableC4695b runnableC4695b = new RunnableC4695b(thread, handler);
            thread.start();
            handler.postDelayed(runnableC4695b, 10000L);
            try {
                synchronized (treeMap) {
                    try {
                        if (!treeMap.containsKey("smnd")) {
                            treeMap.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            treeMap.put("smnd", "");
        }
    }

    private void uploadAdData() {
        Act.foreground().filter(new ua20()).take(1).observeOn(Schedulers.m221493io()).switchMap(new w9j() { // from class: l.va20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180697a.lambda$uploadAdData$10((Act.C4299r) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.wa20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185424a.lambda$uploadAdData$11((String) obj);
            }
        }, new e30() { // from class: l.xa20
            @Override // p149l.e30
            public final void call(Object obj) {
                Network.m29553g((Throwable) obj);
            }
        }));
    }

    public stc0.C20027a auth(stc0.C20027a c20027a) {
        stc0.C20027a c20027aM185889h = common(c20027a).m185889h("Authorization", AUTH_CORE);
        if (Act.foreground_() == null) {
            c20027aM185889h.m185882a("Client-State", OMSResourceType.background);
        }
        c20027aM185889h.m185882a("X-TT-ClientInfo", getXttClientInfo());
        rb20.m178553b(c20027aM185889h);
        return c20027aM185889h;
    }

    public stc0.C20027a authBeforeSignUp(stc0.C20027a c20027a) {
        stc0.C20027a c20027aM185889h = common(c20027a).m185889h("Authorization", AUTH_BEFORE_SIGN_UP);
        if (Act.foreground_() == null) {
            c20027aM185889h.m185882a("Client-State", OMSResourceType.background);
        }
        c20027aM185889h.m185882a("X-TT-ClientInfo", getXttClientInfo());
        return c20027aM185889h;
    }

    public stc0.C20027a basic(stc0.C20027a c20027a) {
        return common(c20027a).m185889h("Authorization", AUTH_ACCOUNT).m185889h("X-TT-ClientInfo", getXttClientInfo());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[Catch: IOException -> 0x0087, TRY_LEAVE, TryCatch #4 {IOException -> 0x0087, blocks: (B:22:0x0082, B:27:0x0089, B:30:0x0094), top: B:108:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104 A[Catch: all -> 0x00f5, IOException -> 0x00f7, TRY_LEAVE, TryCatch #3 {IOException -> 0x00f7, blocks: (B:63:0x00f0, B:70:0x00f9, B:73:0x0104), top: B:106:0x00f0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    public Exception boxException(ApiExcep apiExcep) {
        AccountErrorResponse accountErrorResponse;
        gxc0 gxc0VarM118606k;
        AccountErrorResponse accountErrorResponse2;
        int i;
        Envelope envelope;
        gxc0 gxc0VarCreate;
        AccountErrorResponse accountErrorResponse3;
        Envelope envelope2;
        exc0 exc0Var = apiExcep.response;
        Meta meta = null;
        if (apiExcep instanceof ApiExcep.Client.BadRequest) {
            String string = exc0Var.m118604Y().m185881k().toString();
            String strString = "";
            gxc0 gxc0VarM118606k2 = exc0Var.m118606k();
            try {
                BufferedSource bufferedSourceSource = gxc0VarM118606k2.source();
                bufferedSourceSource.request(Long.MAX_VALUE);
                gxc0VarCreate = gxc0.create(gxc0VarM118606k2.contentType(), gxc0VarM118606k2.contentLength(), bufferedSourceSource.getBufferField().clone());
                try {
                    strString = gxc0VarCreate.string();
                    puk0.m171431e().m171433c(strString);
                    vjf0.m198623e().m198626b(strString);
                } catch (Exception unused) {
                    t95.m187604b(gxc0VarCreate);
                }
            } catch (Exception unused2) {
                gxc0VarCreate = null;
            }
            if (string.startsWith(mu5.f135737e) || string.startsWith(mu5.f135738f) || string.startsWith(mu5.f135754v) || string.startsWith(mu5.f135746n) || string.startsWith(mu5.f135757y)) {
                try {
                    accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                    if (accountErrorResponse3 != null) {
                        try {
                            if (accountErrorResponse3.code == 0) {
                                envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                                if (envelope2 == null) {
                                    meta = envelope2.meta;
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            NetReporter.reportError(e);
                        }
                    } else {
                        envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                        if (envelope2 == null) {
                            meta = envelope2.meta;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    accountErrorResponse3 = null;
                }
                if (accountErrorResponse3 != null && meta == null) {
                    return new TantanException.Client.AccountService(exc0Var, accountErrorResponse3);
                }
                if (meta != null) {
                    return new TantanException.Client.CoreService(exc0Var, meta);
                }
            }
        } else {
            if (apiExcep instanceof ApiExcep.Client.Forbidden) {
                gxc0 gxc0VarM118606k3 = exc0Var.m118606k();
                try {
                    Envelope envelope3 = Envelope.JSON_ADAPTER.parse(gxc0VarM118606k3.string());
                    if (envelope3 != null) {
                        meta = envelope3.meta;
                    }
                } catch (IOException e3) {
                    NetReporter.reportError(e3);
                    try {
                        gxc0VarM118606k3.close();
                    } catch (Exception e4) {
                        CrashHelper.m81296c(e4);
                    }
                }
                return new TantanException.Client.TantanForbidden(exc0Var, meta);
            }
            boolean z = apiExcep instanceof ApiExcep.Server;
            if (z != 0) {
                try {
                    try {
                        try {
                            String strString2 = exc0Var.m118606k().string();
                            AccountErrorResponse accountErrorResponse4 = AccountErrorResponse.JSON_ADAPTER.parse(strString2);
                            if (accountErrorResponse4 != null) {
                                try {
                                    if (accountErrorResponse4.code == 0) {
                                        envelope = Envelope.JSON_ADAPTER.parse(strString2);
                                        if (envelope == null) {
                                            meta = envelope.meta;
                                        }
                                    }
                                    gxc0VarM118606k = exc0Var.m118606k();
                                    z = accountErrorResponse4;
                                } catch (IOException e5) {
                                    e = e5;
                                    accountErrorResponse = accountErrorResponse4;
                                    if (exc0Var.m118609q() == 503) {
                                        NetReporter.reportError(e);
                                    }
                                    gxc0VarM118606k = exc0Var.m118606k();
                                    z = accountErrorResponse;
                                }
                                gxc0VarM118606k.close();
                                accountErrorResponse2 = z;
                            } else {
                                envelope = Envelope.JSON_ADAPTER.parse(strString2);
                                if (envelope == null) {
                                    meta = envelope.meta;
                                }
                                gxc0VarM118606k = exc0Var.m118606k();
                                z = accountErrorResponse4;
                                gxc0VarM118606k.close();
                                accountErrorResponse2 = z;
                            }
                        } catch (Exception e6) {
                            CrashHelper.m81296c(e6);
                            accountErrorResponse2 = z;
                        }
                    } catch (Throwable th) {
                        try {
                            exc0Var.m118606k().close();
                        } catch (Exception e7) {
                            CrashHelper.m81296c(e7);
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    accountErrorResponse = null;
                }
                int iM118609q = exc0Var.m118609q();
                if (accountErrorResponse2 != 0 && (i = accountErrorResponse2.code) != 0) {
                    iM118609q = i;
                }
                return new TantanException.ServerException(exc0Var, iM118609q, meta);
            }
        }
        return apiExcep;
    }

    public stc0.C20027a common() {
        return common(null);
    }

    public stc0.C20027a debug_noAuth() {
        return common();
    }

    public void debug_removeProxy() {
    }

    public void debug_setProxy() {
    }

    public void debug_timeout_for_http(int i) {
        k850.C17954b c17954bM144867v = this.http.m144867v();
        c17954bM144867v.m144899t(i, TimeUnit.SECONDS);
        k850 k850VarM144882c = c17954bM144867v.m144882c();
        this.http = k850VarM144882c;
        this.httpProxy = new ux40(k850VarM144882c);
        this.cloudHttp = c17954bM144867v.m144882c();
    }

    public String fakeToken(String str, utc0 utc0Var) throws IOException {
        return authToken(str, String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime())), UUID.randomUUID().toString(), utc0Var);
    }

    public k850 getDownloadHttp() {
        if (this.downloadHttp == null) {
            k850.C17954b c17954bM144867v = this.http.m144867v();
            k8c.m144927c(c17954bM144867v);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c17954bM144867v.m144885f(10000L, timeUnit);
            c17954bM144867v.m144899t(10000L, timeUnit);
            this.downloadHttp = c17954bM144867v.m144882c();
        }
        return this.downloadHttp;
    }

    public k850 getHttp(stc0 stc0Var) {
        return ((stc0Var.m185879i() instanceof avc0) && h500.CLOUD_API_TAG.equals(((avc0) stc0Var.m185879i()).f71930b)) ? this.cloudHttp : getNormalHttp();
    }

    public k850 getNormalHttp() {
        return this.httpProxy.m196146e();
    }

    public long guessedCurrentServerTime() {
        long j = this.lastServerTime;
        if (j > 0) {
            long jElapsedRealtime = j + (SystemClock.elapsedRealtime() - this.lastElapsedRealtime);
            if (jElapsedRealtime > 0) {
                return jElapsedRealtime;
            }
        }
        return System.currentTimeMillis();
    }

    public void invalidHashAccount() {
        this.hashAccount = null;
    }

    public boolean isChristmasEventEnabled() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, 11, 25, 0, 0, 1);
        calendar.add(6, -7);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, 14);
        long timeInMillis2 = calendar.getTimeInMillis();
        long jGuessedCurrentServerTime = guessedCurrentServerTime();
        return timeInMillis <= jGuessedCurrentServerTime && timeInMillis2 >= jGuessedCurrentServerTime;
    }

    public stc0 maybeUpdateRequestBeforeCall(stc0 stc0Var) throws Exception {
        n11.m157333f();
        String strM185873c = stc0Var.m185873c("Authorization");
        stc0.C20027a c20027aM185878h = stc0Var.m185878h();
        String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
        mayAddLocationHeader(stc0Var.m185881k(), c20027aM185878h, strValueOf);
        if (strM185873c != null && strM185873c.equals(AUTH_CORE)) {
            if (hasInvalidHash()) {
                synchronized (this) {
                    try {
                        if (hasInvalidHash()) {
                            if (qib0.m174779J0() && TextUtils.isEmpty(qib0.f154714c0.accessToken()) && qib0.f154714c0.mo97507U4()) {
                                CrashHelper.m81296c(new IllegalStateException("auth called with coreApi = null" + stc0Var.m185881k().toString()));
                            }
                            uploadAdData();
                            du2.m113670a("[putong-common][ab]", "maybeUpdateRequestBeforeCall start ，thread=" + Thread.currentThread() + ",hasRequestAb=" + this.hasRequestAb);
                            String strM149477c = le2.m149477c(kgw.m145933b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize(prepareSimpleXml().f191751a).getBytes("UTF-8")), 2);
                            if (this.hasRequestAb) {
                                ABManager.m29362v(2);
                            } else {
                                this.hasRequestAb = true;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                Objects.toString(Thread.currentThread());
                                qib0.f154702Q.m148248V();
                                Objects.toString(Thread.currentThread());
                                du2.m113670a("[putong-common][ab]", "maybeUpdateRequestBeforeCall waited testGroup for " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms，thread=" + Thread.currentThread());
                            }
                            this.updateTimeInSinceDeviceBootRealMillis = SystemClock.elapsedRealtime();
                            this.hash.onNext(strM149477c);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            try {
                stc0 stc0VarMayEncryptBody = mayEncryptBody(stc0Var, c20027aM185878h, strValueOf);
                c20027aM185878h.m185889h("Authorization", "MAC " + authToken(stc0VarMayEncryptBody.m185881k().toString(), strValueOf, this.hash.m221515e(), stc0VarMayEncryptBody.m185871a()));
            } catch (IllegalArgumentException e) {
                CrashHelper.m81297d(e, 100);
                throw new NetIgnoredException(e);
            }
        } else if (strM185873c != null && strM185873c.equals(AUTH_BEFORE_SIGN_UP)) {
            if (this.hashAccount == null) {
                synchronized (this) {
                    try {
                        if (this.hashAccount == null) {
                            this.hashAccount = le2.m149477c(kgw.m145933b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize(prepareSimpleXml().f191751a).getBytes("UTF-8")), 2);
                            qib0.f154702Q.m148247U();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            try {
                stc0 stc0VarMayEncryptBody2 = mayEncryptBody(stc0Var, c20027aM185878h, strValueOf);
                c20027aM185878h.m185889h("Authorization", "MAC " + authToken(stc0VarMayEncryptBody2.m185881k().toString(), strValueOf, this.hashAccount, stc0VarMayEncryptBody2.m185871a()));
            } catch (IllegalArgumentException e2) {
                CrashHelper.m81297d(e2, 100);
                throw new NetIgnoredException(e2);
            }
        } else if (strM185873c != null && strM185873c.equals(AUTH_ACCOUNT)) {
            stc0 stc0VarMayEncryptBody3 = mayEncryptBody(stc0Var, c20027aM185878h, strValueOf);
            c20027aM185878h.m185889h("Authorization", "MAC " + basicToken(stc0VarMayEncryptBody3.m185881k().toString(), strValueOf, stc0VarMayEncryptBody3.m185871a()));
        }
        stc0 stc0VarM185883b = c20027aM185878h.m185883b();
        return debug_fakeServerUnavailable ? stc0VarM185883b.m185878h().m185898q("http://core.unstable.putong.p1staff.com/service-unavailable").m185883b() : stc0VarM185883b;
    }

    public void resetNetworkControlParams() {
        this.updateTimeInSinceDeviceBootRealMillis = 0L;
        this.hasRequestAb = false;
        this.hash.onNext(null);
    }

    @Nullable
    public String seal(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = "OmwMfS0HBsSAVj64g1smBi76zurVMSBn".getBytes("UTF-8");
            byte[] bArrM208680a = xgj.m208680a(str);
            PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
            byte[] bArr = new byte[16];
            new Random(SystemClock.elapsedRealtime() + 1127).nextBytes(bArr);
            paddedBufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bytes), bArr));
            int outputSize = paddedBufferedBlockCipher.getOutputSize(bArrM208680a.length);
            byte[] bArr2 = new byte[outputSize];
            paddedBufferedBlockCipher.doFinal(bArr2, paddedBufferedBlockCipher.processBytes(bArrM208680a, 0, bArrM208680a.length, bArr2, 0));
            byte[] bArr3 = new byte[16 + outputSize];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, outputSize);
            return le2.m149477c(bArr3, 2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    public void updateServerTime(String str) {
        if (this.lastServerTime != -1 || str == null) {
            return;
        }
        try {
            this.lastElapsedRealtime = SystemClock.elapsedRealtime();
            this.lastServerTime = dateHeaderFormat.get().parse(str).getTime();
        } catch (ParseException e) {
            CrashHelper.m81296c(e);
        }
    }

    public void useNewConnectionPool() {
        this.httpProxy.m196148g(true);
    }

    private stc0.C20027a common(stc0.C20027a c20027a) {
        return rb20.m178552a(c20027a);
    }

    public stc0.C20027a basic() {
        return basic(null);
    }

    public String fakeToken(String str, String str2, utc0 utc0Var) throws IOException {
        return authToken(str, str2, UUID.randomUUID().toString(), utc0Var);
    }

    public stc0.C20027a authBeforeSignUp() {
        return authBeforeSignUp(null);
    }

    public stc0.C20027a auth() {
        return auth(null);
    }
}
