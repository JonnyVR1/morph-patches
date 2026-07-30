package com.p000p1.mobile.putong.api.api;

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
import com.ishumei.smantifraud.SmAntiFraud;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.CachedBuildInfoHash;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.ExceptionChecker;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.network.NetReporter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
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
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l.cll;
import l.du2;
import l.dyd;
import l.e30;
import l.exc0;
import l.f51;
import l.gxc0;
import l.hyx;
import l.k850;
import l.kgw;
import l.le2;
import l.mkd0;
import l.n11;
import l.puk0;
import l.qjw;
import l.stc0;
import l.t95;
import l.uqd0;
import l.utc0;
import l.vjf0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xgj;
import l.yp4;
import l.z3g0;
import okio.Buffer;
import okio.BufferedSource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p006l.avc0;
import p006l.b0f;
import p006l.j95;
import p006l.k8c;
import p006l.mu5;
import p006l.oa20;
import p006l.qib0;
import p006l.rb20;
import p006l.ux40;
import p006l.xh5;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
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
    public static final hyx JSON = hyx.d("application/json; charset=utf-8");
    static uqd0 debug_proxyString = new uqd0("debug_proxy_string", "proxy.p1staff.com");
    private static ThreadLocal<SimpleDateFormat> dateHeaderFormat = new C0120a();
    private static String formattedLocation = "";
    public static boolean debug_fakeServerUnavailable = false;
    private static uqd0 savedBuildInfoHash = new uqd0("buildinfo_hash", (String) null);
    private volatile long updateTimeInSinceDeviceBootRealMillis = 0;
    private a<String> hash = a.b();
    private volatile boolean hasRequestAb = false;
    private Set<String> lastPins = new HashSet();
    public long lastElapsedRealtime = -1;
    public long lastServerTime = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$a */
    public class C0120a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$b */
    public class RunnableC0121b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Thread f1147a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Handler f1148b;

        public RunnableC0121b(Thread thread, Handler handler) {
            this.f1147a = thread;
            this.f1148b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1147a.interrupt();
            this.f1148b.postDelayed(this, 100L);
        }
    }

    @SuppressLint({"LogUseError"})
    public Network(k850.b bVar) {
        du2.a("[common][network]", "Network before call init");
        init(bVar);
        du2.a("[common][network]", "Network after call init");
    }

    public static stc0 addHMC(stc0 stc0Var) throws IOException {
        return rb20.m22786a(stc0Var.h()).h(AUTH, "MAC " + basicToken(stc0Var.k().toString(), String.valueOf(TimeConverter.switchTime(System.currentTimeMillis())), stc0Var.a())).b();
    }

    public static stc0.a addLocationHeader(stc0.a aVar, String str) {
        Location locationQ;
        com.p1.mobile.putong.location.a aVar2 = qib0.f19778E;
        if (aVar2 != null && (locationQ = aVar2.q()) != null) {
            try {
                aVar.h("Geolocation", b0f.m12418f(formatLocation(locationQ), str));
                return aVar;
            } catch (Exception e) {
                aVar.h("Geolocation", formatLocation(locationQ));
                CrashHelper.c(e);
            }
        }
        return aVar;
    }

    private String authToken(String str, String str2, String str3, utc0 utc0Var) throws IOException {
        return getNewToken("15", "android4.9.8", new String[]{str, str2, qib0.f19805c0.accessToken(), getUA(), str3}, utc0Var);
    }

    private static String basicToken(String str, String str2, utc0 utc0Var) throws IOException {
        return getNewToken("16", "android4.9.8", new String[]{str, str2, dyd.a(), getUA(), null}, utc0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1455c(String str) {
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
        cachedBuildInfoHashNew_.ua = getUA();
        return savedBuildInfoHash.put(CachedBuildInfoHash.JSON_ADAPTER.serialize(cachedBuildInfoHashNew_));
    }

    private c<String> createSmAntiFraudInit() {
        return c.create(new c.a() { // from class: l.sa20
            public final void call(Object obj) {
                Network.m1458f((z3g0) obj);
            }
        }).map(new w9j() { // from class: l.ta20
            public final Object call(Object obj) {
                return Network.lambda$createSmAntiFraudInit$8((Boolean) obj);
            }
        }).timeout(10L, TimeUnit.SECONDS, c.just(""));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1458f(z3g0 z3g0Var) {
        z3g0Var.onNext(Boolean.FALSE);
        z3g0Var.onCompleted();
    }

    public static String formatLocation(Location location) {
        String str;
        Location location2 = previousLocation;
        if (location2 != null && location2.s() == location.s() && previousLocation.t() == location.t() && previousLocation.u() == location.u()) {
            return formattedLocation;
        }
        previousLocation = location;
        try {
            String str2 = String.format(Locale.US, "geo:%1$.4f,%2$.4f;u=%3$.0f", Double.valueOf(location.u()), Double.valueOf(location.x()), Float.valueOf(location.s()));
            formattedLocation = str2;
            return str2;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("Network formatLocation:");
            sb.append(e.getMessage());
            if (location == null) {
                str = "currentLocation is null";
            } else {
                str = "getLatitude:" + location.u() + " getLongitude:" + location.x() + " getAccuracy:" + location.s();
            }
            sb.append(str);
            CrashHelper.c(new Exception(sb.toString(), e));
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1459g(Throwable th) {
    }

    public static String getFormattedLocation() {
        return formattedLocation;
    }

    private static String getMac(String[] strArr, byte[] bArr) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[1]);
        arrayList.add(strArr[2]);
        arrayList.add(strArr[4]);
        arrayList.add(cll.r(strArr[0]).h());
        arrayList.add(strArr[3]);
        byte[] bytes = ("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh" + mkString2(arrayList)).getBytes("UTF-8");
        kgw kgwVar = new kgw();
        kgwVar.i();
        kgwVar.n(bytes);
        if (bArr != null) {
            kgwVar.n(bArr);
        }
        return le2.c(kgwVar.g(), 2);
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
        return JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.e(vwb.f0(new String[]{str, str2}), new List[]{vwb.f0(new String[]{strArr[1], strArr[2], strArr[4]}), vwb.f0(new String[]{getMac(strArr, byteArray)})}));
    }

    public static String getUA() {
        return rb20.m22789d();
    }

    private static String getValidDiskHashForCurrentAccessToken() {
        String str;
        du2.a("[putong-common][upload]", "s1...");
        String strAccessToken = qib0.f19805c0.accessToken();
        if (strAccessToken == null) {
            du2.a("[putong-common][upload]", "s2");
            return null;
        }
        String str2 = (String) savedBuildInfoHash.get();
        if (str2 == null) {
            du2.a("[putong-common][upload]", "s3");
            return null;
        }
        try {
            CachedBuildInfoHash cachedBuildInfoHash = (CachedBuildInfoHash) CachedBuildInfoHash.JSON_ADAPTER.parse(str2);
            if (cachedBuildInfoHash.ua == null || (str = cachedBuildInfoHash.accessToken) == null || cachedBuildInfoHash.hash == null) {
                throw new Exception("has null value in parsed data");
            }
            if (!TextUtils.equals(strAccessToken, str)) {
                du2.a("[putong-common][upload]", "s5");
                return null;
            }
            if (System.currentTimeMillis() - cachedBuildInfoHash.update_time >= 43200000) {
                du2.a("[putong-common][upload]", "s6");
                return null;
            }
            if (TextUtils.isEmpty(cachedBuildInfoHash.hash)) {
                du2.a("[putong-common][upload]", "s7");
                return null;
            }
            du2.a("[putong-common][upload]", "s8");
            return cachedBuildInfoHash.hash;
        } catch (Exception e) {
            CrashHelper.c(e);
            du2.a("[putong-common][upload]", "s4");
            return null;
        }
    }

    private xaj0<TreeMap<String, String>, Boolean, List<String>> getXmpNodes() {
        xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var = this.xmpNodes;
        return xaj0Var == null ? prepareXmpXml() : xaj0Var;
    }

    private TreeMap<String, String> getXmpXmlWhenGetCore(TreeMap<String, String> treeMap, boolean z) {
        du2.a("[putong-common][upload]", "start gxx");
        du2.a("[putong-common][upload]", "gx2");
        if (z) {
            try {
                String strJ = dyd.j();
                if (!TextUtils.isEmpty(strJ)) {
                    treeMap.put(".ssn", strJ);
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            try {
                File parentFile = App.e.getDatabasePath("core_v2_" + qib0.f19805c0.userId()).getParentFile();
                if (parentFile.exists()) {
                    ArrayList arrayListN = vwb.n(vwb.R(parentFile.list(), new w9j() { // from class: l.ab20
                        public final Object call(Object obj) {
                            return Network.m1455c((String) obj);
                        }
                    }), new w9j() { // from class: l.qa20
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                        }
                    });
                    vwb.I(arrayListN, new Comparator() { // from class: l.ra20
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ((String) obj).compareTo((String) obj2);
                        }
                    });
                    treeMap.put(".fs", vwb.U(arrayListN, " "));
                    treeMap.put(".fs_count", String.valueOf(arrayListN.size()));
                }
            } catch (Exception e2) {
                CrashHelper.c(new Exception("Network exception:" + e2));
            }
            du2.a("[putong-common][upload]", "gx3");
        }
        return treeMap;
    }

    public static String getXttClientInfo() {
        return "{\"deviceToken\": \"" + dyd.a() + "\"}";
    }

    public static boolean hasInvalidHash() {
        return qib0.f19784H.hash.e() == null || SystemClock.elapsedRealtime() - qib0.f19784H.updateTimeInSinceDeviceBootRealMillis > 86400000;
    }

    public static a<String> hash() {
        return qib0.f19784H.hash;
    }

    @SuppressLint({"LogUseError"})
    private void init(k850.b bVar) {
        du2.a("[common][network]", "Network during call init first");
        Log.e("[common][network]", "Network during call init first");
        bVar.a(new j95());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.f(10L, timeUnit);
        bVar.t(40L, timeUnit);
        String strReplace = mu5.f17257f.replace("https://", "");
        String strReplace2 = mu5.f17256e.replace("https://", "");
        this.lastPins.add("sha1/1S4TwavjSdrotJWU73w4Q2BkZr0=");
        this.lastPins.add("sha1/IQ8siffEzV0bgl441sZZO6aTda4=");
        this.lastPins.add("sha1/XoxTGCJgHVZx1mqgzGSgYAdD1ag=");
        this.lastPins.add("sha1/tFVQFINFH+6MoKEM9a/eOkxeEVk=");
        String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
        bVar.e(new yp4.a().a(strReplace, strArr).a(strReplace2, strArr).b());
        k850 k850VarC = bVar.c();
        this.http = k850VarC;
        this.httpProxy = new ux40(k850VarC);
        bVar.t(120L, timeUnit);
        this.cloudHttp = bVar.c();
        du2.a("[common][network]", "Network during call init last");
        Log.e("[common][network]", "Network during call init last");
        RemoteConfig.Y().subscribe(mkd0.H(new e30() { // from class: l.ya20
            public final void call(Object obj) {
                this.f28090a.lambda$init$0((RemoteConfig.ConfigStep) obj);
            }
        }, new e30() { // from class: l.za20
            public final void call(Object obj) {
                Network.m1463k((Throwable) obj);
            }
        }));
    }

    public static InputStream inputStreamAfterCheck(exc0 exc0Var) throws IOException {
        if (exc0Var.q() != 204) {
            return exc0Var.k().byteStream();
        }
        return null;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1463k(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$createSmAntiFraudInit$8(Boolean bool) {
        return bool.booleanValue() ? SmAntiFraud.getBase() : "";
    }

    private /* synthetic */ k850.b lambda$debug_setProxy$2() throws Exception {
        k850.b bVarV = this.http.v();
        bVarV.r(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(InetAddress.getByName("proxy.p1staff.com"), 1337)));
        return bVarV;
    }

    private /* synthetic */ void lambda$debug_setProxy$3(k850.b bVar) {
        this.http = bVar.c();
        bVar.t(120L, TimeUnit.SECONDS);
        this.cloudHttp = bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(RemoteConfig.ConfigStep configStep) {
        String strF = RemoteConfig.x().F("metaInfo");
        if (!TextUtils.isEmpty(strF) && strF.contains("metaInfo1") && strF.contains("metaInfo2")) {
            du2.a("[common][network]", "Network add meteInfo =".concat(strF));
            try {
                JSONObject jSONObject = new JSONObject(strF);
                String strOptString = jSONObject.optString("metaInfo1");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("metaInfo2");
                int length = jSONArrayOptJSONArray.length();
                qjw qjwVar = new qjw(strOptString, App.e);
                try {
                    Field declaredField = qjw.class.getDeclaredField("a");
                    declaredField.setAccessible(true);
                    declaredField.set(qjwVar, strOptString);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    CrashHelper.c(new RuntimeException("Failed to set MMCrypto.publicKey via reflection", e));
                }
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    try {
                        String strA = qjwVar.a(jSONArrayOptJSONArray.getString(i));
                        du2.a("[common][network]", "Network getInitDecryptData result：" + strA);
                        if (!this.lastPins.contains(strA)) {
                            this.lastPins.add(strA);
                            z = true;
                        }
                    } catch (Throwable th) {
                        CrashHelper.c(new RuntimeException("Network getData error i=" + i + " , metaInfo = " + strF, th));
                    }
                }
                if (z) {
                    String strReplace = mu5.f17257f.replace("https://", "");
                    String strReplace2 = mu5.f17256e.replace("https://", "");
                    String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
                    this.httpProxy.m25586f(new yp4.a().a(strReplace, strArr).a(strReplace2, strArr).b());
                }
            } catch (Throwable th2) {
                CrashHelper.c(new RuntimeException("Network handle metaInfo error metaInfo = ".concat(strF), th2));
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
                CrashHelper.c(e);
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
    public /* synthetic */ c lambda$uploadAdData$10(Act.r rVar) {
        du2.a("[putong-common][upload]", "px7");
        return createSmAntiFraudInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.NetIgnoredException */
    public /* synthetic */ void lambda$uploadAdData$11(String str) throws NetIgnoredException {
        String str2;
        String strSerialize;
        String str3 = "";
        du2.a("[putong-common][upload]", "px8");
        int i = 0;
        int i2 = 0;
        while (i2 < 5) {
            try {
                du2.a("[putong-common][upload]", "s-uad1");
                xaj0<TreeMap<String, String>, Boolean, List<String>> xmpNodes = getXmpNodes();
                try {
                    ((TreeMap) xmpNodes.a).put("smnd", str);
                    TreeMap<String, String> xmpXmlWhenGetCore = getXmpXmlWhenGetCore((TreeMap) xmpNodes.a, ((Boolean) xmpNodes.b).booleanValue());
                    JsonAdapter jsonAdapter = JsonAdapter.STRING_ADAPTER;
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
                    String strC = le2.c(kgw.b(strSerialize2.getBytes("UTF-8")), 2);
                    String strC2 = le2.c(kgw.b(strSerialize.getBytes("UTF-8")), 2);
                    String validDiskHashForCurrentAccessToken = getValidDiskHashForCurrentAccessToken();
                    boolean zEquals = true;
                    if (validDiskHashForCurrentAccessToken == null) {
                        du2.a("[putong-common][upload]", "not use sh1");
                    } else {
                        du2.a("[putong-common][upload]", "ad1:" + validDiskHashForCurrentAccessToken + " cache1" + strC2);
                        zEquals = true ^ validDiskHashForCurrentAccessToken.equals(strC2);
                    }
                    if (zEquals) {
                        byte[] bytes = "SFOrmGZS_zkM5uv7ACBbYKyNLxTYdVlC".getBytes("UTF-8");
                        byte[] bArrA = xgj.a(strSerialize2);
                        byte[] bArr = new byte[16];
                        new Random(SystemClock.elapsedRealtime() + 213).nextBytes(bArr);
                        try {
                            NKResult nKResultM20440a = oa20.m20440a(bytes, bArrA, bArr);
                            byte[] bArr2 = nKResultM20440a.f1146iv;
                            byte[] bArr3 = new byte[bArr2.length + nKResultM20440a.res.length];
                            System.arraycopy(bArr2, i, bArr3, i, bArr2.length);
                            byte[] bArr4 = nKResultM20440a.res;
                            System.arraycopy(bArr4, i, bArr3, nKResultM20440a.f1146iv.length, bArr4.length);
                            String strM27250i = xh5.m27250i("/ad-data");
                            utc0 utc0VarCreate = utc0.create(hyx.d("application/octet-stream"), bArr3);
                            try {
                                String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
                                stc0.a aVarQ = common().q(strM27250i);
                                StringBuilder sb = new StringBuilder();
                                str2 = str3;
                                try {
                                    try {
                                        sb.append("MAC ");
                                        sb.append(authToken(strM27250i, strValueOf, strC, utc0VarCreate));
                                        stc0.a aVarL = aVarQ.h(AUTH, sb.toString()).l(utc0VarCreate);
                                        if (Act.foreground_() == null) {
                                            aVarL.a("Client-State", "background");
                                        }
                                        exc0 exc0VarExecute = null;
                                        int i3 = 0;
                                        while (i3 < 10) {
                                            try {
                                                try {
                                                    exc0VarExecute = this.http.a(aVarL.b()).execute();
                                                    i3 += 11;
                                                } catch (Throwable th) {
                                                    t95.b(exc0VarExecute);
                                                    throw th;
                                                }
                                            } catch (Exception unused2) {
                                                i3++;
                                            }
                                        }
                                        if (exc0VarExecute != null) {
                                            updateServerTime(exc0VarExecute.u("Date"));
                                            Exception excCheck = ExceptionChecker.check(exc0VarExecute);
                                            if (excCheck != null) {
                                                throw excCheck;
                                            }
                                        }
                                        t95.b(exc0VarExecute);
                                        if (i3 >= 11) {
                                            cacheBuildInfoHash(qib0.f19805c0.accessToken(), strC2);
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        du2.a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                                        CrashHelper.c(e);
                                        i2++;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    CrashHelper.d(e, 100);
                                    du2.a("[putong-common][upload]", "uploadAdData::generate authToken failed::urlStr=" + strM27250i + "::uploadTempHash=" + strC + "::c=" + new String(bArr3));
                                    throw new NetIgnoredException(new NetIgnoredException(e));
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            String str4 = str3;
                            CrashHelper.d(e4, 50);
                            String str5 = (bArrA == null || bArrA.length <= 0) ? str4 : new String(bArrA);
                            du2.a("[putong-common][upload]", "uploadAdData::TantanApp.pluginApi.generateKey failed::clear=" + str5 + "::ivBytes=" + new String(bArr));
                            throw new NetIgnoredException(new NetIgnoredException(e4));
                        }
                    } else {
                        str2 = str3;
                    }
                    i2 += 5;
                } catch (Exception e5) {
                    e = e5;
                    str2 = str3;
                    du2.a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                    CrashHelper.c(e);
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
        return rb20.m22791f();
    }

    private stc0.a mayAddLocationHeader(cll cllVar, stc0.a aVar, String str) {
        addLocationHeader(aVar, str);
        return aVar;
    }

    private stc0 mayEncryptBody(stc0 stc0Var, stc0.a aVar, String str) throws Exception {
        if (b0f.m12424l()) {
            stc0Var = aVar.h("X-Janus-Response-flat", "1").b();
        }
        if (b0f.m12425m(stc0Var.k())) {
            String strM12423k = b0f.m12423k(stc0Var.a());
            if (NullChecker.a(strM12423k)) {
                return aVar.j(stc0Var.g(), utc0.create(JSON, b0f.m12418f(strM12423k, str))).b();
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
        String strB;
        String str;
        boolean z;
        boolean z2;
        System.currentTimeMillis();
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListF0 = vwb.f0(new String[]{"af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status"});
        try {
            strB = dyd.b();
            try {
                try {
                    strB = UUID.nameUUIDFromBytes(strB.getBytes(vwb.a)).toString();
                    z = !ValueObject.util_equals(strB, dyd.a());
                    str = strB;
                    while (true) {
                        if (((!z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1))) {
                            break;
                        }
                        jNanoTime++;
                    }
                } catch (Exception e) {
                    e = e;
                    CrashHelper.c(new Exception("Network exception:" + e));
                    str = strB;
                    z = false;
                }
                z2 = false;
                for (String str2 : arrayListF0) {
                    try {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strA = f51.a(str2);
                                if (!ValueObject.util_equals(strA, f51.b(str2))) {
                                    z2 = true;
                                }
                                if (strA != null) {
                                    treeMap.put(str2, strA);
                                }
                            } else {
                                String strA2 = f51.a(str2);
                                if (strA2 != null) {
                                    treeMap.put(str2, strA2);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.c(new Throwable("Network exception:" + th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        CrashHelper.c(new Throwable("Network exception:" + th));
                        while (true) {
                            if (!z) {
                            }
                            jNanoTime++;
                        }
                        return new xaj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListF0);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = false;
            }
        } catch (Exception e2) {
            e = e2;
            strB = null;
        }
        if (!z) {
            treeMap.put(".uuid", str);
        }
        return new xaj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListF0);
    }

    private xaj0<TreeMap<String, String>, Boolean, List<String>> prepareXmpXml() {
        boolean z;
        String str;
        boolean z2;
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListF0 = vwb.f0(new String[]{"af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status"});
        du2.a("[putong-common][upload]", "px1");
        int iM22788c = rb20.m22788c();
        du2.a("[putong-common][upload]", "px2");
        boolean z3 = false;
        boolean z4 = (iM22788c & Integer.MIN_VALUE) != 0;
        String string = null;
        if (z4) {
            str = string;
            z = false;
        } else {
            try {
                string = UUID.nameUUIDFromBytes(dyd.b().getBytes(vwb.a)).toString();
                z = !ValueObject.util_equals(string, dyd.a());
                str = string;
            } catch (Exception e) {
                CrashHelper.c(new Exception("Network exception:" + e));
                str = string;
                z = false;
            }
        }
        du2.a("[putong-common][upload]", "px3");
        if (!z4 && !z) {
            treeMap.put(".uuid", str);
        }
        try {
            z2 = false;
            for (String str2 : arrayListF0) {
                try {
                    if (!z4) {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strA = f51.a(str2);
                                if (!ValueObject.util_equals(strA, f51.b(str2))) {
                                    z2 = true;
                                }
                                if (strA != null) {
                                    treeMap.put(str2, strA);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.c(new Throwable("Network exception:" + th));
                        }
                    }
                    String strA2 = f51.a(str2);
                    if (strA2 != null) {
                        treeMap.put(str2, strA2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CrashHelper.c(new Throwable("Network exception:" + th));
                    du2.a("[putong-common][upload]", "px4");
                    treeMap.put(".Debuggable", rb20.m22790e() + "");
                    du2.a("[putong-common][upload]", "px5");
                    du2.a("[putong-common][upload]", "px6");
                    while (true) {
                        if (!z4) {
                        }
                        jNanoTime++;
                    }
                    if (!z4) {
                        z3 = true;
                    }
                    xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var = new xaj0<>(treeMap, Boolean.valueOf(z3), arrayListF0);
                    this.xmpNodes = xaj0Var;
                    return xaj0Var;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
        }
        du2.a("[putong-common][upload]", "px4");
        try {
            treeMap.put(".Debuggable", rb20.m22790e() + "");
            while (true) {
                if (((!z4 && jNanoTime % 7 == 1) || (!z4 && jNanoTime % 7 != 1)) && (((z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1)))) {
                    break;
                }
                jNanoTime++;
            }
        } catch (Throwable unused) {
            treeMap.put(".Debuggable", "0");
        }
        du2.a("[putong-common][upload]", "px5");
        du2.a("[putong-common][upload]", "px6");
        if (!z4 && !z && !z2) {
            z3 = true;
        }
        xaj0<TreeMap<String, String>, Boolean, List<String>> xaj0Var2 = new xaj0<>(treeMap, Boolean.valueOf(z3), arrayListF0);
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
            SmAntiFraud.create(App.e, smOption);
            final HandlerThread handlerThread = new HandlerThread("smAnti");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            Thread thread = new Thread(new Runnable() { // from class: l.pa20
                @Override // java.lang.Runnable
                public final void run() {
                    Network.lambda$smAntiFraudInit$9(treeMap, handlerThread);
                }
            }, "smAnti");
            RunnableC0121b runnableC0121b = new RunnableC0121b(thread, handler);
            thread.start();
            handler.postDelayed(runnableC0121b, 10000L);
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
                CrashHelper.c(e);
            }
        } catch (Exception e2) {
            CrashHelper.c(e2);
            treeMap.put("smnd", "");
        }
    }

    private void uploadAdData() {
        Act.foreground().filter(new w9j() { // from class: l.ua20
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Act.r) obj));
            }
        }).take(1).observeOn(Schedulers.io()).switchMap(new w9j() { // from class: l.va20
            public final Object call(Object obj) {
                return this.f24232a.lambda$uploadAdData$10((Act.r) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.wa20
            /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.NetIgnoredException */
            public final void call(Object obj) throws NetIgnoredException {
                this.f25056a.lambda$uploadAdData$11((String) obj);
            }
        }, new e30() { // from class: l.xa20
            public final void call(Object obj) {
                Network.m1459g((Throwable) obj);
            }
        }));
    }

    public stc0.a auth(stc0.a aVar) {
        stc0.a aVarH = common(aVar).h(AUTH, AUTH_CORE);
        if (Act.foreground_() == null) {
            aVarH.a("Client-State", "background");
        }
        aVarH.a("X-TT-ClientInfo", getXttClientInfo());
        rb20.m22787b(aVarH);
        return aVarH;
    }

    public stc0.a authBeforeSignUp(stc0.a aVar) {
        stc0.a aVarH = common(aVar).h(AUTH, AUTH_BEFORE_SIGN_UP);
        if (Act.foreground_() == null) {
            aVarH.a("Client-State", "background");
        }
        aVarH.a("X-TT-ClientInfo", getXttClientInfo());
        return aVarH;
    }

    public stc0.a basic(stc0.a aVar) {
        return common(aVar).h(AUTH, AUTH_ACCOUNT).h("X-TT-ClientInfo", getXttClientInfo());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[Catch: IOException -> 0x0087, TRY_LEAVE, TryCatch #4 {IOException -> 0x0087, blocks: (B:22:0x0082, B:27:0x0089, B:30:0x0094), top: B:108:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104 A[Catch: all -> 0x00f5, IOException -> 0x00f7, TRY_LEAVE, TryCatch #3 {IOException -> 0x00f7, blocks: (B:63:0x00f0, B:70:0x00f9, B:73:0x0104), top: B:106:0x00f0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    public Exception boxException(ApiExcep apiExcep) {
        AccountErrorResponse accountErrorResponse;
        gxc0 gxc0VarK;
        AccountErrorResponse accountErrorResponse2;
        int i;
        Envelope envelope;
        gxc0 gxc0VarCreate;
        AccountErrorResponse accountErrorResponse3;
        Envelope envelope2;
        exc0 exc0Var = apiExcep.response;
        Meta meta = null;
        if (apiExcep instanceof ApiExcep.Client.BadRequest) {
            String string = exc0Var.Y().k().toString();
            String strString = "";
            gxc0 gxc0VarK2 = exc0Var.k();
            try {
                BufferedSource bufferedSourceSource = gxc0VarK2.source();
                bufferedSourceSource.request(Long.MAX_VALUE);
                gxc0VarCreate = gxc0.create(gxc0VarK2.contentType(), gxc0VarK2.contentLength(), bufferedSourceSource.buffer().clone());
                try {
                    strString = gxc0VarCreate.string();
                    puk0.e().c(strString);
                    vjf0.e().b(strString);
                } catch (Exception unused) {
                    t95.b(gxc0VarCreate);
                }
            } catch (Exception unused2) {
                gxc0VarCreate = null;
            }
            if (string.startsWith(mu5.f17256e) || string.startsWith(mu5.f17257f) || string.startsWith(mu5.f17273v) || string.startsWith(mu5.f17265n) || string.startsWith(mu5.f17276y)) {
                try {
                    accountErrorResponse3 = (AccountErrorResponse) AccountErrorResponse.JSON_ADAPTER.parse(strString);
                    if (accountErrorResponse3 != null) {
                        try {
                            if (accountErrorResponse3.code == 0) {
                                envelope2 = (Envelope) Envelope.JSON_ADAPTER.parse(strString);
                                if (envelope2 == null) {
                                    meta = envelope2.meta;
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            NetReporter.reportError(e);
                        }
                    } else {
                        envelope2 = (Envelope) Envelope.JSON_ADAPTER.parse(strString);
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
                gxc0 gxc0VarK3 = exc0Var.k();
                try {
                    Envelope envelope3 = (Envelope) Envelope.JSON_ADAPTER.parse(gxc0VarK3.string());
                    if (envelope3 != null) {
                        meta = envelope3.meta;
                    }
                } catch (IOException e3) {
                    NetReporter.reportError(e3);
                    try {
                        gxc0VarK3.close();
                    } catch (Exception e4) {
                        CrashHelper.c(e4);
                    }
                }
                return new TantanException.Client.TantanForbidden(exc0Var, meta);
            }
            boolean z = apiExcep instanceof ApiExcep.Server;
            if (z != 0) {
                try {
                    try {
                        try {
                            String strString2 = exc0Var.k().string();
                            AccountErrorResponse accountErrorResponse4 = (AccountErrorResponse) AccountErrorResponse.JSON_ADAPTER.parse(strString2);
                            if (accountErrorResponse4 != null) {
                                try {
                                    if (accountErrorResponse4.code == 0) {
                                        envelope = (Envelope) Envelope.JSON_ADAPTER.parse(strString2);
                                        if (envelope == null) {
                                            meta = envelope.meta;
                                        }
                                    }
                                    gxc0VarK = exc0Var.k();
                                    z = accountErrorResponse4;
                                } catch (IOException e5) {
                                    e = e5;
                                    accountErrorResponse = accountErrorResponse4;
                                    if (exc0Var.q() == 503) {
                                        NetReporter.reportError(e);
                                    }
                                    gxc0VarK = exc0Var.k();
                                    z = accountErrorResponse;
                                }
                                gxc0VarK.close();
                                accountErrorResponse2 = z;
                            } else {
                                envelope = (Envelope) Envelope.JSON_ADAPTER.parse(strString2);
                                if (envelope == null) {
                                    meta = envelope.meta;
                                }
                                gxc0VarK = exc0Var.k();
                                z = accountErrorResponse4;
                                gxc0VarK.close();
                                accountErrorResponse2 = z;
                            }
                        } catch (Exception e6) {
                            CrashHelper.c(e6);
                            accountErrorResponse2 = z;
                        }
                    } catch (Throwable th) {
                        try {
                            exc0Var.k().close();
                        } catch (Exception e7) {
                            CrashHelper.c(e7);
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    accountErrorResponse = null;
                }
                int iQ = exc0Var.q();
                if (accountErrorResponse2 != 0 && (i = accountErrorResponse2.code) != 0) {
                    iQ = i;
                }
                return new TantanException.ServerException(exc0Var, iQ, meta);
            }
        }
        return apiExcep;
    }

    public stc0.a common() {
        return common(null);
    }

    public stc0.a debug_noAuth() {
        return common();
    }

    public void debug_removeProxy() {
    }

    public void debug_setProxy() {
    }

    public void debug_timeout_for_http(int i) {
        k850.b bVarV = this.http.v();
        bVarV.t(i, TimeUnit.SECONDS);
        k850 k850VarC = bVarV.c();
        this.http = k850VarC;
        this.httpProxy = new ux40(k850VarC);
        this.cloudHttp = bVarV.c();
    }

    public String fakeToken(String str, utc0 utc0Var) throws IOException {
        return authToken(str, String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime())), UUID.randomUUID().toString(), utc0Var);
    }

    public k850 getDownloadHttp() {
        if (this.downloadHttp == null) {
            k850.b bVarV = this.http.v();
            k8c.m17990c(bVarV);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bVarV.f(10000L, timeUnit);
            bVarV.t(10000L, timeUnit);
            this.downloadHttp = bVarV.c();
        }
        return this.downloadHttp;
    }

    public k850 getHttp(stc0 stc0Var) {
        return ((stc0Var.i() instanceof avc0) && "cloud_tag".equals(((avc0) stc0Var.i()).f8554b)) ? this.cloudHttp : getNormalHttp();
    }

    public k850 getNormalHttp() {
        return this.httpProxy.m25585e();
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
        calendar.set(2017, 11, 25, 0, 0, 1);
        calendar.add(6, -7);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, 14);
        long timeInMillis2 = calendar.getTimeInMillis();
        long jGuessedCurrentServerTime = guessedCurrentServerTime();
        return timeInMillis <= jGuessedCurrentServerTime && timeInMillis2 >= jGuessedCurrentServerTime;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.NetIgnoredException */
    public stc0 maybeUpdateRequestBeforeCall(stc0 stc0Var) throws Exception {
        n11.f();
        String strC = stc0Var.c(AUTH);
        stc0.a aVarH = stc0Var.h();
        String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
        mayAddLocationHeader(stc0Var.k(), aVarH, strValueOf);
        if (strC != null && strC.equals(AUTH_CORE)) {
            if (hasInvalidHash()) {
                synchronized (this) {
                    try {
                        if (hasInvalidHash()) {
                            if (qib0.m22123J0() && TextUtils.isEmpty(qib0.f19805c0.accessToken()) && qib0.f19805c0.mo11999U4()) {
                                CrashHelper.c(new IllegalStateException("auth called with coreApi = null" + stc0Var.k().toString()));
                            }
                            uploadAdData();
                            du2.a("[putong-common][ab]", "maybeUpdateRequestBeforeCall start ，thread=" + Thread.currentThread() + ",hasRequestAb=" + this.hasRequestAb);
                            String strC2 = le2.c(kgw.b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize((Map) prepareSimpleXml().a).getBytes("UTF-8")), 2);
                            if (this.hasRequestAb) {
                                ABManager.m1268v(2);
                            } else {
                                this.hasRequestAb = true;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                Objects.toString(Thread.currentThread());
                                qib0.f19793Q.m18520V();
                                Objects.toString(Thread.currentThread());
                                du2.a("[putong-common][ab]", "maybeUpdateRequestBeforeCall waited testGroup for " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms，thread=" + Thread.currentThread());
                            }
                            this.updateTimeInSinceDeviceBootRealMillis = SystemClock.elapsedRealtime();
                            this.hash.onNext(strC2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            try {
                stc0 stc0VarMayEncryptBody = mayEncryptBody(stc0Var, aVarH, strValueOf);
                aVarH.h(AUTH, "MAC " + authToken(stc0VarMayEncryptBody.k().toString(), strValueOf, (String) this.hash.e(), stc0VarMayEncryptBody.a()));
            } catch (IllegalArgumentException e) {
                CrashHelper.d(e, 100);
                throw new NetIgnoredException(e);
            }
        } else if (strC != null && strC.equals(AUTH_BEFORE_SIGN_UP)) {
            if (this.hashAccount == null) {
                synchronized (this) {
                    try {
                        if (this.hashAccount == null) {
                            this.hashAccount = le2.c(kgw.b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize((Map) prepareSimpleXml().a).getBytes("UTF-8")), 2);
                            qib0.f19793Q.m18519U();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            try {
                stc0 stc0VarMayEncryptBody2 = mayEncryptBody(stc0Var, aVarH, strValueOf);
                aVarH.h(AUTH, "MAC " + authToken(stc0VarMayEncryptBody2.k().toString(), strValueOf, this.hashAccount, stc0VarMayEncryptBody2.a()));
            } catch (IllegalArgumentException e2) {
                CrashHelper.d(e2, 100);
                throw new NetIgnoredException(e2);
            }
        } else if (strC != null && strC.equals(AUTH_ACCOUNT)) {
            stc0 stc0VarMayEncryptBody3 = mayEncryptBody(stc0Var, aVarH, strValueOf);
            aVarH.h(AUTH, "MAC " + basicToken(stc0VarMayEncryptBody3.k().toString(), strValueOf, stc0VarMayEncryptBody3.a()));
        }
        stc0 stc0VarB = aVarH.b();
        return debug_fakeServerUnavailable ? stc0VarB.h().q("http://core.unstable.putong.p1staff.com/service-unavailable").b() : stc0VarB;
    }

    public void resetNetworkControlParams() {
        this.updateTimeInSinceDeviceBootRealMillis = 0L;
        this.hasRequestAb = false;
        this.hash.onNext((Object) null);
    }

    @Nullable
    public String seal(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = "OmwMfS0HBsSAVj64g1smBi76zurVMSBn".getBytes("UTF-8");
            byte[] bArrA = xgj.a(str);
            PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
            byte[] bArr = new byte[16];
            new Random(SystemClock.elapsedRealtime() + 1127).nextBytes(bArr);
            paddedBufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bytes), bArr));
            int outputSize = paddedBufferedBlockCipher.getOutputSize(bArrA.length);
            byte[] bArr2 = new byte[outputSize];
            paddedBufferedBlockCipher.doFinal(bArr2, paddedBufferedBlockCipher.processBytes(bArrA, 0, bArrA.length, bArr2, 0));
            byte[] bArr3 = new byte[16 + outputSize];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, outputSize);
            return le2.c(bArr3, 2);
        } catch (Exception e) {
            CrashHelper.c(e);
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
            CrashHelper.c(e);
        }
    }

    public void useNewConnectionPool() {
        this.httpProxy.m25587g(true);
    }

    private stc0.a common(stc0.a aVar) {
        return rb20.m22786a(aVar);
    }

    public stc0.a basic() {
        return basic(null);
    }

    public String fakeToken(String str, String str2, utc0 utc0Var) throws IOException {
        return authToken(str, str2, UUID.randomUUID().toString(), utc0Var);
    }

    public stc0.a authBeforeSignUp() {
        return authBeforeSignUp(null);
    }

    public stc0.a auth() {
        return auth(null);
    }
}
