package com.p051p1.mobile.putong.api.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.CachedBuildInfoHash;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.ak20;
import p153l.bkj0;
import p153l.d3d0;
import p153l.dj20;
import p153l.e7y;
import p153l.esf0;
import p153l.f1f;
import p153l.gcg0;
import p153l.i5d0;
import p153l.iiw;
import p153l.j650;
import p153l.jyb;
import p153l.k5d0;
import p153l.ka5;
import p153l.lhl;
import p153l.m51;
import p153l.pmw;
import p153l.psd0;
import p153l.q9c;
import p153l.qcj;
import p153l.qv5;
import p153l.qzd;
import p153l.rg50;
import p153l.rjj;
import p153l.rnl;
import p153l.te2;
import p153l.tu2;
import p153l.u11;
import p153l.ua5;
import p153l.uqb0;
import p153l.v3l0;
import p153l.wd00;
import p153l.wyd0;
import p153l.x1d0;
import p153l.xi20;
import p153l.xi5;
import p153l.xq4;
import p153l.y20;
import p153l.z1d0;

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
    private rg50 cloudHttp;
    private rg50 downloadHttp;
    private volatile String hashAccount;
    private rg50 http;
    private j650 httpProxy;
    private bkj0<TreeMap<String, String>, Boolean, List<String>> xmpNodes;
    public static final e7y JSON = e7y.m119773d("application/json; charset=utf-8");
    static wyd0 debug_proxyString = new wyd0("debug_proxy_string", "proxy.p1staff.com");
    private static ThreadLocal<SimpleDateFormat> dateHeaderFormat = new C4845a();
    private static String formattedLocation = "";
    public static boolean debug_fakeServerUnavailable = false;
    private static wyd0 savedBuildInfoHash = new wyd0("buildinfo_hash", null);
    private volatile long updateTimeInSinceDeviceBootRealMillis = 0;
    private C22507a<String> hash = C22507a.m222758b();
    private volatile boolean hasRequestAb = false;
    private Set<String> lastPins = new HashSet();
    public long lastElapsedRealtime = -1;
    public long lastServerTime = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$a */
    public class C4845a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.api.Network$b */
    public class RunnableC4846b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Thread f17877a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Handler f17878b;

        public RunnableC4846b(Thread thread, Handler handler) {
            this.f17877a = thread;
            this.f17878b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17877a.interrupt();
            this.f17878b.postDelayed(this, 100L);
        }
    }

    @SuppressLint({"LogUseError"})
    public Network(rg50.C19837b c19837b) {
        tu2.m192703a("[common][network]", "Network before call init");
        init(c19837b);
        tu2.m192703a("[common][network]", "Network after call init");
    }

    public static x1d0 addHMC(x1d0 x1d0Var) throws IOException {
        return ak20.m98541a(x1d0Var.m209023h()).m209034h("Authorization", "MAC " + basicToken(x1d0Var.m209026k().toString(), String.valueOf(TimeConverter.switchTime(System.currentTimeMillis())), x1d0Var.m209016a())).m209028b();
    }

    public static x1d0.C21228a addLocationHeader(x1d0.C21228a c21228a, String str) {
        Location locationM80048q;
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        if (abstractC13226a != null && (locationM80048q = abstractC13226a.m80048q()) != null) {
            try {
                c21228a.m209034h("Geolocation", f1f.m123563f(formatLocation(locationM80048q), str));
                return c21228a;
            } catch (Exception e) {
                c21228a.m209034h("Geolocation", formatLocation(locationM80048q));
                CrashHelper.m82479c(e);
            }
        }
        return c21228a;
    }

    private String authToken(String str, String str2, String str3, z1d0 z1d0Var) throws IOException {
        return getNewToken(Constants.VIA_REPORT_TYPE_WPA_STATE, "android4.9.8", new String[]{str, str2, uqb0.f180397c0.accessToken(), getUA(), str3}, z1d0Var);
    }

    private static String basicToken(String str, String str2, z1d0 z1d0Var) throws IOException {
        return getNewToken(Constants.VIA_REPORT_TYPE_START_WAP, "android4.9.8", new String[]{str, str2, qzd.m178768a(), getUA(), null}, z1d0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m30547c(String str) {
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
        cachedBuildInfoHashNew_.f39579ua = getUA();
        return savedBuildInfoHash.put(CachedBuildInfoHash.JSON_ADAPTER.serialize(cachedBuildInfoHashNew_));
    }

    private C22421c<String> createSmAntiFraudInit() {
        return C22421c.create(new C22421c.a() { // from class: l.bj20
            @Override // p153l.y20
            public final void call(Object obj) {
                Network.m30550f((gcg0) obj);
            }
        }).map(new qcj() { // from class: l.cj20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Network.lambda$createSmAntiFraudInit$8((Boolean) obj);
            }
        }).timeout(10L, TimeUnit.SECONDS, C22421c.just(""));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m30550f(gcg0 gcg0Var) {
        gcg0Var.onNext(Boolean.FALSE);
        gcg0Var.onCompleted();
    }

    public static String formatLocation(Location location) {
        String str;
        Location location2 = previousLocation;
        if (location2 != null && location2.m80012s() == location.m80012s() && previousLocation.m80013t() == location.m80013t() && previousLocation.m80014u() == location.m80014u()) {
            return formattedLocation;
        }
        previousLocation = location;
        try {
            String str2 = String.format(Locale.US, "geo:%1$.4f,%2$.4f;u=%3$.0f", Double.valueOf(location.m80014u()), Double.valueOf(location.m80016x()), Float.valueOf(location.m80012s()));
            formattedLocation = str2;
            return str2;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("Network formatLocation:");
            sb.append(e.getMessage());
            if (location == null) {
                str = "currentLocation is null";
            } else {
                str = "getLatitude:" + location.m80014u() + " getLongitude:" + location.m80016x() + " getAccuracy:" + location.m80012s();
            }
            sb.append(str);
            CrashHelper.m82479c(new Exception(sb.toString(), e));
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m30551g(Throwable th) {
    }

    public static String getFormattedLocation() {
        return formattedLocation;
    }

    private static String getMac(String[] strArr, byte[] bArr) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[1]);
        arrayList.add(strArr[2]);
        arrayList.add(strArr[4]);
        arrayList.add(rnl.m182265r(strArr[0]).m182282h());
        arrayList.add(strArr[3]);
        byte[] bytes = ("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh" + mkString2(arrayList)).getBytes("UTF-8");
        iiw iiwVar = new iiw();
        iiwVar.m140160i();
        iiwVar.m140162n(bytes);
        if (bArr != null) {
            iiwVar.m140162n(bArr);
        }
        return te2.m190678c(iiwVar.m140159g(), 2);
    }

    private static String getNewToken(String str, String str2, String[] strArr, z1d0 z1d0Var) throws IOException {
        byte[] byteArray;
        if (z1d0Var == null || !JSON.equals(z1d0Var.contentType())) {
            byteArray = null;
        } else {
            Buffer buffer = new Buffer();
            z1d0Var.writeTo(buffer);
            byteArray = buffer.readByteArray();
        }
        return JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147504e(jyb.m147507f0(str, str2), jyb.m147507f0(strArr[1], strArr[2], strArr[4]), jyb.m147507f0(getMac(strArr, byteArray))));
    }

    public static String getUA() {
        return ak20.m98544d();
    }

    private static String getValidDiskHashForCurrentAccessToken() {
        String str;
        tu2.m192703a("[putong-common][upload]", "s1...");
        String strAccessToken = uqb0.f180397c0.accessToken();
        if (strAccessToken == null) {
            tu2.m192703a("[putong-common][upload]", "s2");
            return null;
        }
        String str2 = savedBuildInfoHash.get();
        if (str2 == null) {
            tu2.m192703a("[putong-common][upload]", "s3");
            return null;
        }
        try {
            CachedBuildInfoHash cachedBuildInfoHash = CachedBuildInfoHash.JSON_ADAPTER.parse(str2);
            if (cachedBuildInfoHash.f39579ua == null || (str = cachedBuildInfoHash.accessToken) == null || cachedBuildInfoHash.hash == null) {
                throw new Exception("has null value in parsed data");
            }
            if (!TextUtils.equals(strAccessToken, str)) {
                tu2.m192703a("[putong-common][upload]", "s5");
                return null;
            }
            if (System.currentTimeMillis() - cachedBuildInfoHash.update_time >= 43200000) {
                tu2.m192703a("[putong-common][upload]", "s6");
                return null;
            }
            if (TextUtils.isEmpty(cachedBuildInfoHash.hash)) {
                tu2.m192703a("[putong-common][upload]", "s7");
                return null;
            }
            tu2.m192703a("[putong-common][upload]", "s8");
            return cachedBuildInfoHash.hash;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            tu2.m192703a("[putong-common][upload]", "s4");
            return null;
        }
    }

    private bkj0<TreeMap<String, String>, Boolean, List<String>> getXmpNodes() {
        bkj0<TreeMap<String, String>, Boolean, List<String>> bkj0Var = this.xmpNodes;
        return bkj0Var == null ? prepareXmpXml() : bkj0Var;
    }

    private TreeMap<String, String> getXmpXmlWhenGetCore(TreeMap<String, String> treeMap, boolean z) {
        tu2.m192703a("[putong-common][upload]", "start gxx");
        tu2.m192703a("[putong-common][upload]", "gx2");
        if (z) {
            try {
                String strM178777j = qzd.m178777j();
                if (!TextUtils.isEmpty(strM178777j)) {
                    treeMap.put(".ssn", strM178777j);
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            try {
                File parentFile = App.f16088e.getDatabasePath("core_v2_" + uqb0.f180397c0.userId()).getParentFile();
                if (parentFile.exists()) {
                    ArrayList arrayListM147522n = jyb.m147522n(jyb.m147487R(parentFile.list(), new qcj() { // from class: l.jj20
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Network.m30547c((String) obj);
                        }
                    }), new qcj() { // from class: l.zi20
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                        }
                    });
                    jyb.m147478I(arrayListM147522n, new Comparator() { // from class: l.aj20
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ((String) obj).compareTo((String) obj2);
                        }
                    });
                    treeMap.put(".fs", jyb.m147490U(arrayListM147522n, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
                    treeMap.put(".fs_count", String.valueOf(arrayListM147522n.size()));
                }
            } catch (Exception e2) {
                CrashHelper.m82479c(new Exception("Network exception:" + e2));
            }
            tu2.m192703a("[putong-common][upload]", "gx3");
        }
        return treeMap;
    }

    public static String getXttClientInfo() {
        return "{\"deviceToken\": \"" + qzd.m178768a() + "\"}";
    }

    public static boolean hasInvalidHash() {
        return uqb0.f180376H.hash.m222761e() == null || SystemClock.elapsedRealtime() - uqb0.f180376H.updateTimeInSinceDeviceBootRealMillis > 86400000;
    }

    public static C22507a<String> hash() {
        return uqb0.f180376H.hash;
    }

    @SuppressLint({"LogUseError"})
    private void init(rg50.C19837b c19837b) {
        tu2.m192703a("[common][network]", "Network during call init first");
        Log.e("[common][network]", "Network during call init first");
        c19837b.m181363a(new ka5());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c19837b.m181368f(10L, timeUnit);
        c19837b.m181383u(40L, timeUnit);
        String strReplace = qv5.f159702f.replace("https://", "");
        String strReplace2 = qv5.f159701e.replace("https://", "");
        lhl lhlVar = lhl.INSTANCE;
        String strM154222o = lhlVar.m154222o(strReplace);
        String strM154222o2 = lhlVar.m154222o(strReplace2);
        this.lastPins.add("sha1/1S4TwavjSdrotJWU73w4Q2BkZr0=");
        this.lastPins.add("sha1/IQ8siffEzV0bgl441sZZO6aTda4=");
        this.lastPins.add("sha1/XoxTGCJgHVZx1mqgzGSgYAdD1ag=");
        this.lastPins.add("sha1/tFVQFINFH+6MoKEM9a/eOkxeEVk=");
        String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
        c19837b.m181367e(new xq4.C21419a().m212715a(strReplace, strArr).m212715a(strReplace2, strArr).m212715a(strM154222o, strArr).m212715a(strM154222o2, strArr).m212716b());
        rg50 rg50VarM181365c = c19837b.m181365c();
        this.http = rg50VarM181365c;
        this.httpProxy = new j650(rg50VarM181365c);
        c19837b.m181383u(120L, timeUnit);
        this.cloudHttp = c19837b.m181365c();
        tu2.m192703a("[common][network]", "Network during call init last");
        Log.e("[common][network]", "Network during call init last");
        RemoteConfig.m80467Y().subscribe(psd0.m173597H(new y20() { // from class: l.hj20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110149a.lambda$init$0((RemoteConfig.ConfigStep) obj);
            }
        }, new y20() { // from class: l.ij20
            @Override // p153l.y20
            public final void call(Object obj) {
                Network.m30555k((Throwable) obj);
            }
        }));
    }

    public static InputStream inputStreamAfterCheck(i5d0 i5d0Var) throws IOException {
        if (i5d0Var.m138673q() != 204) {
            return i5d0Var.m138670k().byteStream();
        }
        return null;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m30555k(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$createSmAntiFraudInit$8(Boolean bool) {
        return bool.booleanValue() ? SmAntiFraud.getBase() : "";
    }

    private /* synthetic */ rg50.C19837b lambda$debug_setProxy$2() throws Exception {
        rg50.C19837b c19837bM181359v = this.http.m181359v();
        c19837bM181359v.m181381s(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(InetAddress.getByName("proxy.p1staff.com"), 1337)));
        return c19837bM181359v;
    }

    private /* synthetic */ void lambda$debug_setProxy$3(rg50.C19837b c19837b) {
        this.http = c19837b.m181365c();
        c19837b.m181383u(120L, TimeUnit.SECONDS);
        this.cloudHttp = c19837b.m181365c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(RemoteConfig.ConfigStep configStep) {
        String strM80485F = RemoteConfig.m80481x().m80485F("metaInfo");
        if (!TextUtils.isEmpty(strM80485F) && strM80485F.contains("metaInfo1") && strM80485F.contains("metaInfo2")) {
            tu2.m192703a("[common][network]", "Network add meteInfo =".concat(strM80485F));
            try {
                JSONObject jSONObject = new JSONObject(strM80485F);
                String strOptString = jSONObject.optString("metaInfo1");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("metaInfo2");
                int length = jSONArrayOptJSONArray.length();
                pmw pmwVar = new pmw(strOptString, App.f16088e);
                try {
                    Field declaredField = pmw.class.getDeclaredField("a");
                    declaredField.setAccessible(true);
                    declaredField.set(pmwVar, strOptString);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    CrashHelper.m82479c(new RuntimeException("Failed to set MMCrypto.publicKey via reflection", e));
                }
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    try {
                        String strM172976a = pmwVar.m172976a(jSONArrayOptJSONArray.getString(i));
                        tu2.m192703a("[common][network]", "Network getInitDecryptData result：" + strM172976a);
                        if (!this.lastPins.contains(strM172976a)) {
                            this.lastPins.add(strM172976a);
                            z = true;
                        }
                    } catch (Throwable th) {
                        CrashHelper.m82479c(new RuntimeException("Network getData error i=" + i + " , metaInfo = " + strM80485F, th));
                    }
                }
                if (z) {
                    String strReplace = qv5.f159702f.replace("https://", "");
                    String strReplace2 = qv5.f159701e.replace("https://", "");
                    lhl lhlVar = lhl.INSTANCE;
                    String strM154222o = lhlVar.m154222o(strReplace);
                    String strM154222o2 = lhlVar.m154222o(strReplace2);
                    String[] strArr = (String[]) new ArrayList(this.lastPins).toArray(new String[0]);
                    this.httpProxy.m143604f(new xq4.C21419a().m212715a(strReplace, strArr).m212715a(strReplace2, strArr).m212715a(strM154222o, strArr).m212715a(strM154222o2, strArr).m212716b());
                }
            } catch (Throwable th2) {
                CrashHelper.m82479c(new RuntimeException("Network handle metaInfo error metaInfo = ".concat(strM80485F), th2));
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
                CrashHelper.m82479c(e);
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
    public /* synthetic */ C22421c lambda$uploadAdData$10(Act.C4450r c4450r) {
        tu2.m192703a("[putong-common][upload]", "px7");
        return createSmAntiFraudInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadAdData$11(String str) {
        String str2;
        String strSerialize;
        String str3 = "";
        tu2.m192703a("[putong-common][upload]", "px8");
        int i = 0;
        int i2 = 0;
        while (i2 < 5) {
            try {
                tu2.m192703a("[putong-common][upload]", "s-uad1");
                bkj0<TreeMap<String, String>, Boolean, List<String>> xmpNodes = getXmpNodes();
                try {
                    xmpNodes.f77081a.put("smnd", str);
                    TreeMap<String, String> xmpXmlWhenGetCore = getXmpXmlWhenGetCore(xmpNodes.f77081a, xmpNodes.f77082b.booleanValue());
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
                    String strM190678c = te2.m190678c(iiw.m140148b(strSerialize2.getBytes("UTF-8")), 2);
                    String strM190678c2 = te2.m190678c(iiw.m140148b(strSerialize.getBytes("UTF-8")), 2);
                    String validDiskHashForCurrentAccessToken = getValidDiskHashForCurrentAccessToken();
                    boolean zEquals = true;
                    if (validDiskHashForCurrentAccessToken == null) {
                        tu2.m192703a("[putong-common][upload]", "not use sh1");
                    } else {
                        tu2.m192703a("[putong-common][upload]", "ad1:" + validDiskHashForCurrentAccessToken + " cache1" + strM190678c2);
                        zEquals = true ^ validDiskHashForCurrentAccessToken.equals(strM190678c2);
                    }
                    if (zEquals) {
                        byte[] bytes = "SFOrmGZS_zkM5uv7ACBbYKyNLxTYdVlC".getBytes("UTF-8");
                        byte[] bArrM181706a = rjj.m181706a(strSerialize2);
                        byte[] bArr = new byte[16];
                        new Random(SystemClock.elapsedRealtime() + 213).nextBytes(bArr);
                        try {
                            NKResult nKResultM211092a = xi20.m211092a(bytes, bArrM181706a, bArr);
                            byte[] bArr2 = nKResultM211092a.f17876iv;
                            byte[] bArr3 = new byte[bArr2.length + nKResultM211092a.res.length];
                            System.arraycopy(bArr2, i, bArr3, i, bArr2.length);
                            byte[] bArr4 = nKResultM211092a.res;
                            System.arraycopy(bArr4, i, bArr3, nKResultM211092a.f17876iv.length, bArr4.length);
                            String strM211107i = xi5.m211107i("/ad-data");
                            z1d0 z1d0VarCreate = z1d0.create(e7y.m119773d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), bArr3);
                            try {
                                String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
                                x1d0.C21228a c21228aM209043q = common().m209043q(strM211107i);
                                StringBuilder sb = new StringBuilder();
                                str2 = str3;
                                try {
                                    try {
                                        sb.append("MAC ");
                                        sb.append(authToken(strM211107i, strValueOf, strM190678c, z1d0VarCreate));
                                        x1d0.C21228a c21228aM209038l = c21228aM209043q.m209034h("Authorization", sb.toString()).m209038l(z1d0VarCreate);
                                        if (Act.foreground_() == null) {
                                            c21228aM209038l.m209027a("Client-State", OMSResourceType.background);
                                        }
                                        i5d0 i5d0VarExecute = null;
                                        int i3 = 0;
                                        while (i3 < 10) {
                                            try {
                                                try {
                                                    i5d0VarExecute = this.http.mo181341a(c21228aM209038l.m209028b()).execute();
                                                    i3 += 11;
                                                } catch (Throwable th) {
                                                    ua5.m195158b(i5d0VarExecute);
                                                    throw th;
                                                }
                                            } catch (Exception unused2) {
                                                i3++;
                                            }
                                        }
                                        if (i5d0VarExecute != null) {
                                            updateServerTime(i5d0VarExecute.m138675u("Date"));
                                            Exception excCheck = ExceptionChecker.check(i5d0VarExecute);
                                            if (excCheck != null) {
                                                throw excCheck;
                                            }
                                        }
                                        ua5.m195158b(i5d0VarExecute);
                                        if (i3 >= 11) {
                                            cacheBuildInfoHash(uqb0.f180397c0.accessToken(), strM190678c2);
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        tu2.m192703a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                                        CrashHelper.m82479c(e);
                                        i2++;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    CrashHelper.m82480d(e, 100);
                                    tu2.m192703a("[putong-common][upload]", "uploadAdData::generate authToken failed::urlStr=" + strM211107i + "::uploadTempHash=" + strM190678c + "::c=" + new String(bArr3));
                                    throw new NetIgnoredException(new NetIgnoredException(e));
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            String str4 = str3;
                            CrashHelper.m82480d(e4, 50);
                            String str5 = (bArrM181706a == null || bArrM181706a.length <= 0) ? str4 : new String(bArrM181706a);
                            tu2.m192703a("[putong-common][upload]", "uploadAdData::TantanApp.pluginApi.generateKey failed::clear=" + str5 + "::ivBytes=" + new String(bArr));
                            throw new NetIgnoredException(new NetIgnoredException(e4));
                        }
                    } else {
                        str2 = str3;
                    }
                    i2 += 5;
                } catch (Exception e5) {
                    e = e5;
                    str2 = str3;
                    tu2.m192703a("[putong-common][upload]", "uploadAdData::upload ad-data failed");
                    CrashHelper.m82479c(e);
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
        return ak20.m98546f();
    }

    private x1d0.C21228a mayAddLocationHeader(rnl rnlVar, x1d0.C21228a c21228a, String str) {
        addLocationHeader(c21228a, str);
        return c21228a;
    }

    private x1d0 mayEncryptBody(x1d0 x1d0Var, x1d0.C21228a c21228a, String str) throws Exception {
        if (f1f.m123569l()) {
            x1d0Var = c21228a.m209034h("X-Janus-Response-flat", "1").m209028b();
        }
        if (f1f.m123570m(x1d0Var.m209026k())) {
            String strM123568k = f1f.m123568k(x1d0Var.m209016a());
            if (NullChecker.m82486a(strM123568k)) {
                return c21228a.m209036j(x1d0Var.m209022g(), z1d0.create(JSON, f1f.m123563f(strM123568k, str))).m209028b();
            }
        }
        return x1d0Var;
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
    private bkj0<TreeMap<String, String>, Boolean, List<String>> prepareSimpleXml() {
        String strM178769b;
        String str;
        boolean z;
        boolean z2;
        System.currentTimeMillis();
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListM147507f0 = jyb.m147507f0("af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status");
        try {
            strM178769b = qzd.m178769b();
            try {
                try {
                    strM178769b = UUID.nameUUIDFromBytes(strM178769b.getBytes(jyb.f123125a)).toString();
                    z = !ValueObject.util_equals(strM178769b, qzd.m178768a());
                    str = strM178769b;
                    while (true) {
                        if (((!z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1))) {
                            break;
                        }
                        jNanoTime++;
                    }
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m82479c(new Exception("Network exception:" + e));
                    str = strM178769b;
                    z = false;
                }
                z2 = false;
                for (String str2 : arrayListM147507f0) {
                    try {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strM157083a = m51.m157083a(str2);
                                if (!ValueObject.util_equals(strM157083a, m51.m157084b(str2))) {
                                    z2 = true;
                                }
                                if (strM157083a != null) {
                                    treeMap.put(str2, strM157083a);
                                }
                            } else {
                                String strM157083a2 = m51.m157083a(str2);
                                if (strM157083a2 != null) {
                                    treeMap.put(str2, strM157083a2);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.m82479c(new Throwable("Network exception:" + th));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        CrashHelper.m82479c(new Throwable("Network exception:" + th));
                        while (true) {
                            if (!z) {
                            }
                            jNanoTime++;
                        }
                        return new bkj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListM147507f0);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = false;
            }
        } catch (Exception e2) {
            e = e2;
            strM178769b = null;
        }
        if (!z) {
            treeMap.put(".uuid", str);
        }
        return new bkj0<>(treeMap, Boolean.valueOf(z && !z2), arrayListM147507f0);
    }

    private bkj0<TreeMap<String, String>, Boolean, List<String>> prepareXmpXml() {
        boolean z;
        String str;
        boolean z2;
        TreeMap treeMap = new TreeMap();
        long jNanoTime = System.nanoTime();
        ArrayList<String> arrayListM147507f0 = jyb.m147507f0("af.fast_track_multiplier", "debug.atrace.tags.enableflags", "dev.bootcomplete", "drm.service.enabled", "gsm.current.phone-type", "gsm.network.type", "gsm.operator.alpha", "gsm.operator.iso-country", "gsm.operator.isroaming", "gsm.operator.numeric", "gsm.sim.operator.alpha", "gsm.sim.operator.iso-country", "gsm.sim.operator.numeric", "gsm.sim.state", "gsm.version.baseband", "gsm.version.ril-impl", "keyguard.no_require_sim", "media.aac_51_output_enabled", "net.bt.name", "net.change", "net.dns1", "net.dns2", "net.dns3", "net.hostname", "net.qtaguid_enabled", "net.tcp.default_init_rwnd", "ril.ecclist", "rild.libpath", "ro.adb.secure", "ro.allow.mock.location", "ro.baseband", "ro.board.platform", "ro.boot.baseband", "ro.boot.bootloader", "ro.boot.emmc", "ro.boot.hardware", "ro.boot.hardware.ddr", "ro.boot.hardware.display", "ro.boot.hardware.sku", "ro.boot.serialno", "ro.bootimage.build.date", "ro.bootimage.build.date.utc", "ro.bootimage.build.fingerprint", "ro.bootloader", "ro.bootmode", "ro.build.characteristics", "ro.build.date", "ro.build.date.utc", "ro.build.description", "ro.build.display.id", "ro.build.expect.baseband", "ro.build.expect.bootloader", "ro.build.fingerprint", "ro.build.flavor", "ro.build.host", "ro.build.id", "ro.build.product", "ro.build.tags", "ro.build.type", "ro.build.user", "ro.build.version.all_codenames", "ro.build.version.base_os", "ro.build.version.codename", "ro.build.version.incremental", "ro.build.version.preview_sdk", "ro.build.version.release", "ro.build.version.sdk", "ro.build.version.security_patch", "ro.carrier", "ro.com.android.dataroaming", "ro.com.android.wifi-watchlist", "ro.com.google.clientidbase", "ro.config.alarm_alert", "ro.config.notification_sound", "ro.config.ringtone", "ro.config.vc_call_vol_steps", "ro.crypto.state", "ro.dalvik.vm.native.bridge", "ro.debuggable", "ro.error.receiver.system.apps", "ro.expect.recovery_id", "ro.hardware", "ro.input.noresample", "ro.kernel.qemu", "ro.opengles.version", "ro.product.board", "ro.product.brand", "ro.product.cpu.abi", "ro.product.cpu.abi2", "ro.product.cpu.abilist", "ro.product.cpu.abilist32", "ro.product.cpu.abilist64", "ro.product.device", "ro.product.locale", "ro.product.manufacturer", "ro.product.model", "ro.product.name", "ro.qti.sensors.game_rv", "ro.qti.sensors.georv", "ro.recovery_id", "ro.revision", "ro.ril.svdo", "ro.ril.svlte1x", "ro.runtime.firstboot", "ro.secure", "ro.serialno", "ro.setupwizard.enterprise_mode", "ro.sf.lcd_density", "ro.telephony.call_ring.multiple", "ro.telephony.default_network", "ro.url.legal", "ro.url.legal.android_privacy", "ro.wifi.channels", "ro.zygote", "selinux.reload_policy", "service.bootanim.exit", "sys.boot_completed", "sys.usb.config", "sys.usb.configfs", "sys.usb.state", "telephony.lteOnCdmaDevice", "vold.has_adoptable", "vold.post_fs_data_done", "wifi.interface", "wifi.supplicant_scan_interval", "wlan.driver.status");
        tu2.m192703a("[putong-common][upload]", "px1");
        int iM98543c = ak20.m98543c();
        tu2.m192703a("[putong-common][upload]", "px2");
        boolean z3 = false;
        boolean z4 = (iM98543c & Integer.MIN_VALUE) != 0;
        String string = null;
        if (z4) {
            str = string;
            z = false;
        } else {
            try {
                string = UUID.nameUUIDFromBytes(qzd.m178769b().getBytes(jyb.f123125a)).toString();
                z = !ValueObject.util_equals(string, qzd.m178768a());
                str = string;
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("Network exception:" + e));
                str = string;
                z = false;
            }
        }
        tu2.m192703a("[putong-common][upload]", "px3");
        if (!z4 && !z) {
            treeMap.put(".uuid", str);
        }
        try {
            z2 = false;
            for (String str2 : arrayListM147507f0) {
                try {
                    if (!z4) {
                        try {
                            if (str2.equals("ro.product.model")) {
                                String strM157083a = m51.m157083a(str2);
                                if (!ValueObject.util_equals(strM157083a, m51.m157084b(str2))) {
                                    z2 = true;
                                }
                                if (strM157083a != null) {
                                    treeMap.put(str2, strM157083a);
                                }
                            }
                        } catch (Throwable th) {
                            CrashHelper.m82479c(new Throwable("Network exception:" + th));
                        }
                    }
                    String strM157083a2 = m51.m157083a(str2);
                    if (strM157083a2 != null) {
                        treeMap.put(str2, strM157083a2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CrashHelper.m82479c(new Throwable("Network exception:" + th));
                    tu2.m192703a("[putong-common][upload]", "px4");
                    treeMap.put(".Debuggable", ak20.m98545e() + "");
                    tu2.m192703a("[putong-common][upload]", "px5");
                    tu2.m192703a("[putong-common][upload]", "px6");
                    while (true) {
                        if (!z4) {
                        }
                        jNanoTime++;
                    }
                    if (!z4) {
                        z3 = true;
                    }
                    bkj0<TreeMap<String, String>, Boolean, List<String>> bkj0Var = new bkj0<>(treeMap, Boolean.valueOf(z3), arrayListM147507f0);
                    this.xmpNodes = bkj0Var;
                    return bkj0Var;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
        }
        tu2.m192703a("[putong-common][upload]", "px4");
        try {
            treeMap.put(".Debuggable", ak20.m98545e() + "");
            while (true) {
                if (((!z4 && jNanoTime % 7 == 1) || (!z4 && jNanoTime % 7 != 1)) && (((z && jNanoTime % 11 == 1) || (!z && jNanoTime % 11 != 1)) && ((z2 && jNanoTime % 13 == 1) || (!z2 && jNanoTime % 13 != 1)))) {
                    break;
                }
                jNanoTime++;
            }
        } catch (Throwable unused) {
            treeMap.put(".Debuggable", "0");
        }
        tu2.m192703a("[putong-common][upload]", "px5");
        tu2.m192703a("[putong-common][upload]", "px6");
        if (!z4 && !z && !z2) {
            z3 = true;
        }
        bkj0<TreeMap<String, String>, Boolean, List<String>> bkj0Var2 = new bkj0<>(treeMap, Boolean.valueOf(z3), arrayListM147507f0);
        this.xmpNodes = bkj0Var2;
        return bkj0Var2;
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
            SmAntiFraud.create(App.f16088e, smOption);
            final HandlerThread handlerThread = new HandlerThread("smAnti");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            Thread thread = new Thread(new Runnable() { // from class: l.yi20
                @Override // java.lang.Runnable
                public final void run() {
                    Network.lambda$smAntiFraudInit$9(treeMap, handlerThread);
                }
            }, "smAnti");
            RunnableC4846b runnableC4846b = new RunnableC4846b(thread, handler);
            thread.start();
            handler.postDelayed(runnableC4846b, 10000L);
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
                CrashHelper.m82479c(e);
            }
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            treeMap.put("smnd", "");
        }
    }

    private void uploadAdData() {
        Act.foreground().filter(new dj20()).take(1).observeOn(Schedulers.m222739io()).switchMap(new qcj() { // from class: l.ej20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94247a.lambda$uploadAdData$10((Act.C4450r) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.fj20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99294a.lambda$uploadAdData$11((String) obj);
            }
        }, new y20() { // from class: l.gj20
            @Override // p153l.y20
            public final void call(Object obj) {
                Network.m30551g((Throwable) obj);
            }
        }));
    }

    public x1d0.C21228a auth(x1d0.C21228a c21228a) {
        x1d0.C21228a c21228aM209034h = common(c21228a).m209034h("Authorization", AUTH_CORE);
        if (Act.foreground_() == null) {
            c21228aM209034h.m209027a("Client-State", OMSResourceType.background);
        }
        c21228aM209034h.m209027a("X-TT-ClientInfo", getXttClientInfo());
        ak20.m98542b(c21228aM209034h);
        return c21228aM209034h;
    }

    public x1d0.C21228a authBeforeSignUp(x1d0.C21228a c21228a) {
        x1d0.C21228a c21228aM209034h = common(c21228a).m209034h("Authorization", AUTH_BEFORE_SIGN_UP);
        if (Act.foreground_() == null) {
            c21228aM209034h.m209027a("Client-State", OMSResourceType.background);
        }
        c21228aM209034h.m209027a("X-TT-ClientInfo", getXttClientInfo());
        return c21228aM209034h;
    }

    public x1d0.C21228a basic(x1d0.C21228a c21228a) {
        return common(c21228a).m209034h("Authorization", AUTH_ACCOUNT).m209034h("X-TT-ClientInfo", getXttClientInfo());
    }

    /* JADX WARN: Code duplicated, block: B:124:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: IOException -> 0x00bb, TryCatch #8 {IOException -> 0x00bb, blocks: (B:32:0x00b6, B:37:0x00bd, B:40:0x00c8), top: B:124:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: IOException -> 0x00bb, TRY_LEAVE, TryCatch #8 {IOException -> 0x00bb, blocks: (B:32:0x00b6, B:37:0x00bd, B:40:0x00c8), top: B:124:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138 A[Catch: all -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #3 {all -> 0x0129, blocks: (B:71:0x0116, B:73:0x0124, B:80:0x012d, B:83:0x0138, B:91:0x0149, B:93:0x0151), top: B:110:0x0116 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    public Exception boxException(ApiExcep apiExcep) {
        AccountErrorResponse accountErrorResponse;
        int i;
        AccountErrorResponse accountErrorResponse2;
        k5d0 k5d0VarM138670k;
        Envelope envelope;
        k5d0 k5d0VarCreate;
        AccountErrorResponse accountErrorResponse3;
        Envelope envelope2;
        i5d0 i5d0Var = apiExcep.response;
        Meta meta = null;
        if (apiExcep instanceof ApiExcep.Client.BadRequest) {
            String string = i5d0Var.m138668Z().m209026k().toString();
            String strString = "";
            k5d0 k5d0VarM138670k2 = i5d0Var.m138670k();
            try {
                BufferedSource bufferedSourceSource = k5d0VarM138670k2.source();
                bufferedSourceSource.request(Long.MAX_VALUE);
                k5d0VarCreate = k5d0.create(k5d0VarM138670k2.contentType(), k5d0VarM138670k2.contentLength(), bufferedSourceSource.getBufferField().clone());
                try {
                    strString = k5d0VarCreate.string();
                    v3l0.m199281e().m199283c(strString);
                    esf0.m122324e().m122327b(strString);
                } catch (Exception unused) {
                    ua5.m195158b(k5d0VarCreate);
                }
            } catch (Exception unused2) {
                k5d0VarCreate = null;
            }
            String str = qv5.f159701e;
            if (string.startsWith(str)) {
                accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                if (accountErrorResponse3 == null) {
                    envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                    if (envelope2 == null) {
                        meta = envelope2.meta;
                    }
                } else if (accountErrorResponse3.code == 0) {
                    envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                    if (envelope2 == null) {
                        meta = envelope2.meta;
                    }
                }
                if (accountErrorResponse3 == null) {
                }
                if (meta != null) {
                    return new TantanException.Client.CoreService(i5d0Var, meta);
                }
            } else {
                String str2 = qv5.f159702f;
                if (string.startsWith(str2)) {
                    accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                    if (accountErrorResponse3 == null) {
                        envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                        if (envelope2 == null) {
                            meta = envelope2.meta;
                        }
                    } else if (accountErrorResponse3.code == 0) {
                        envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                        if (envelope2 == null) {
                            meta = envelope2.meta;
                        }
                    }
                    if (accountErrorResponse3 == null) {
                    }
                    if (meta != null) {
                        return new TantanException.Client.CoreService(i5d0Var, meta);
                    }
                } else {
                    String str3 = qv5.f159718v;
                    if (string.startsWith(str3)) {
                        accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                        if (accountErrorResponse3 == null) {
                            envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                            if (envelope2 == null) {
                                meta = envelope2.meta;
                            }
                        } else if (accountErrorResponse3.code == 0) {
                            envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                            if (envelope2 == null) {
                                meta = envelope2.meta;
                            }
                        }
                        if (accountErrorResponse3 == null) {
                        }
                        if (meta != null) {
                            return new TantanException.Client.CoreService(i5d0Var, meta);
                        }
                    } else {
                        String str4 = qv5.f159710n;
                        if (string.startsWith(str4)) {
                            accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                            if (accountErrorResponse3 == null) {
                                envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                                if (envelope2 == null) {
                                    meta = envelope2.meta;
                                }
                            } else if (accountErrorResponse3.code == 0) {
                                envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                                if (envelope2 == null) {
                                    meta = envelope2.meta;
                                }
                            }
                            if (accountErrorResponse3 == null) {
                            }
                            if (meta != null) {
                                return new TantanException.Client.CoreService(i5d0Var, meta);
                            }
                        } else {
                            String str5 = qv5.f159721y;
                            if (string.startsWith(str5)) {
                                accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                                if (accountErrorResponse3 == null) {
                                    envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                                    if (envelope2 == null) {
                                        meta = envelope2.meta;
                                    }
                                } else if (accountErrorResponse3.code == 0) {
                                    envelope2 = Envelope.JSON_ADAPTER.parse(strString);
                                    if (envelope2 == null) {
                                        meta = envelope2.meta;
                                    }
                                }
                                if (accountErrorResponse3 == null) {
                                }
                                if (meta != null) {
                                    return new TantanException.Client.CoreService(i5d0Var, meta);
                                }
                            } else {
                                lhl lhlVar = lhl.INSTANCE;
                                if (string.startsWith(lhlVar.m154220m(str)) || string.startsWith(lhlVar.m154220m(str2)) || string.startsWith(lhlVar.m154220m(str3)) || string.startsWith(lhlVar.m154220m(str4)) || string.startsWith(lhlVar.m154220m(str5))) {
                                    try {
                                        accountErrorResponse3 = AccountErrorResponse.JSON_ADAPTER.parse(strString);
                                        if (accountErrorResponse3 == null) {
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
                                    if (accountErrorResponse3 == null && meta == null) {
                                        return new TantanException.Client.AccountService(i5d0Var, accountErrorResponse3);
                                    }
                                    if (meta != null) {
                                        return new TantanException.Client.CoreService(i5d0Var, meta);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (apiExcep instanceof ApiExcep.Client.Forbidden) {
                k5d0 k5d0VarM138670k3 = i5d0Var.m138670k();
                try {
                    Envelope envelope3 = Envelope.JSON_ADAPTER.parse(k5d0VarM138670k3.string());
                    if (envelope3 != null) {
                        meta = envelope3.meta;
                    }
                } catch (IOException e3) {
                    NetReporter.reportError(e3);
                    try {
                        k5d0VarM138670k3.close();
                    } catch (Exception e4) {
                        CrashHelper.m82479c(e4);
                    }
                }
                return new TantanException.Client.TantanForbidden(i5d0Var, meta);
            }
            boolean z = apiExcep instanceof ApiExcep.Server;
            if (z != 0) {
                try {
                    try {
                        try {
                            String strString2 = i5d0Var.m138670k().string();
                            AccountErrorResponse accountErrorResponse4 = AccountErrorResponse.JSON_ADAPTER.parse(strString2);
                            if (accountErrorResponse4 != null) {
                                try {
                                    if (accountErrorResponse4.code == 0) {
                                        envelope = Envelope.JSON_ADAPTER.parse(strString2);
                                        if (envelope == null) {
                                            meta = envelope.meta;
                                        }
                                    }
                                    k5d0VarM138670k = i5d0Var.m138670k();
                                    z = accountErrorResponse4;
                                } catch (IOException e5) {
                                    e = e5;
                                    accountErrorResponse2 = accountErrorResponse4;
                                    if (i5d0Var.m138673q() == 503) {
                                        NetReporter.reportError(e);
                                    }
                                    k5d0VarM138670k = i5d0Var.m138670k();
                                    z = accountErrorResponse2;
                                }
                                k5d0VarM138670k.close();
                                accountErrorResponse = z;
                            } else {
                                envelope = Envelope.JSON_ADAPTER.parse(strString2);
                                if (envelope == null) {
                                    meta = envelope.meta;
                                }
                                k5d0VarM138670k = i5d0Var.m138670k();
                                z = accountErrorResponse4;
                                k5d0VarM138670k.close();
                                accountErrorResponse = z;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            accountErrorResponse2 = null;
                        }
                    } catch (Throwable th) {
                        try {
                            i5d0Var.m138670k().close();
                        } catch (Exception e7) {
                            CrashHelper.m82479c(e7);
                        }
                        throw th;
                    }
                } catch (Exception e8) {
                    CrashHelper.m82479c(e8);
                    accountErrorResponse = z;
                }
                int iM138673q = i5d0Var.m138673q();
                if (accountErrorResponse != 0 && (i = accountErrorResponse.code) != 0) {
                    iM138673q = i;
                }
                return new TantanException.ServerException(i5d0Var, iM138673q, meta);
            }
        }
        return apiExcep;
    }

    public x1d0.C21228a common() {
        return common(null);
    }

    public x1d0.C21228a debug_noAuth() {
        return common();
    }

    public void debug_removeProxy() {
    }

    public void debug_setProxy() {
    }

    public void debug_timeout_for_http(int i) {
        rg50.C19837b c19837bM181359v = this.http.m181359v();
        c19837bM181359v.m181383u(i, TimeUnit.SECONDS);
        rg50 rg50VarM181365c = c19837bM181359v.m181365c();
        this.http = rg50VarM181365c;
        this.httpProxy = new j650(rg50VarM181365c);
        this.cloudHttp = c19837bM181359v.m181365c();
    }

    public String fakeToken(String str, z1d0 z1d0Var) throws IOException {
        return authToken(str, String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime())), UUID.randomUUID().toString(), z1d0Var);
    }

    public rg50 getDownloadHttp() {
        if (this.downloadHttp == null) {
            rg50.C19837b c19837bM181359v = this.http.m181359v();
            q9c.m175837c(c19837bM181359v);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c19837bM181359v.m181368f(10000L, timeUnit);
            c19837bM181359v.m181383u(10000L, timeUnit);
            this.downloadHttp = c19837bM181359v.m181365c();
        }
        return this.downloadHttp;
    }

    public rg50 getHttp(x1d0 x1d0Var) {
        return ((x1d0Var.m209024i() instanceof d3d0) && wd00.CLOUD_API_TAG.equals(((d3d0) x1d0Var.m209024i()).f84888b)) ? this.cloudHttp : getNormalHttp();
    }

    public rg50 getNormalHttp() {
        return this.httpProxy.m143603e();
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

    public x1d0 maybeUpdateRequestBeforeCall(x1d0 x1d0Var) throws Exception {
        u11.m193892f();
        String strM209018c = x1d0Var.m209018c("Authorization");
        x1d0.C21228a c21228aM209023h = x1d0Var.m209023h();
        String strValueOf = String.valueOf(TimeConverter.switchTime(guessedCurrentServerTime()));
        mayAddLocationHeader(x1d0Var.m209026k(), c21228aM209023h, strValueOf);
        if (strM209018c != null && strM209018c.equals(AUTH_CORE)) {
            if (hasInvalidHash()) {
                synchronized (this) {
                    try {
                        if (hasInvalidHash()) {
                            if (uqb0.m197233J0() && TextUtils.isEmpty(uqb0.f180397c0.accessToken()) && uqb0.f180397c0.mo105296U4()) {
                                CrashHelper.m82479c(new IllegalStateException("auth called with coreApi = null" + x1d0Var.m209026k().toString()));
                            }
                            uploadAdData();
                            tu2.m192703a("[putong-common][ab]", "maybeUpdateRequestBeforeCall start ，thread=" + Thread.currentThread() + ",hasRequestAb=" + this.hasRequestAb);
                            String strM190678c = te2.m190678c(iiw.m140148b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize(prepareSimpleXml().f77081a).getBytes("UTF-8")), 2);
                            if (this.hasRequestAb) {
                                ABManager.m30360v(2);
                            } else {
                                this.hasRequestAb = true;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                Objects.toString(Thread.currentThread());
                                uqb0.f180385Q.m152542V();
                                Objects.toString(Thread.currentThread());
                                tu2.m192703a("[putong-common][ab]", "maybeUpdateRequestBeforeCall waited testGroup for " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms，thread=" + Thread.currentThread());
                            }
                            this.updateTimeInSinceDeviceBootRealMillis = SystemClock.elapsedRealtime();
                            this.hash.onNext(strM190678c);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            try {
                x1d0 x1d0VarMayEncryptBody = mayEncryptBody(x1d0Var, c21228aM209023h, strValueOf);
                c21228aM209023h.m209034h("Authorization", "MAC " + authToken(x1d0VarMayEncryptBody.m209026k().toString(), strValueOf, this.hash.m222761e(), x1d0VarMayEncryptBody.m209016a()));
            } catch (IllegalArgumentException e) {
                CrashHelper.m82480d(e, 100);
                throw new NetIgnoredException(e);
            }
        } else if (strM209018c != null && strM209018c.equals(AUTH_BEFORE_SIGN_UP)) {
            if (this.hashAccount == null) {
                synchronized (this) {
                    try {
                        if (this.hashAccount == null) {
                            this.hashAccount = te2.m190678c(iiw.m140148b(JsonAdapter.STRING_ADAPTER.MAP_ADAPTER().serialize(prepareSimpleXml().f77081a).getBytes("UTF-8")), 2);
                            uqb0.f180385Q.m152541U();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            try {
                x1d0 x1d0VarMayEncryptBody2 = mayEncryptBody(x1d0Var, c21228aM209023h, strValueOf);
                c21228aM209023h.m209034h("Authorization", "MAC " + authToken(x1d0VarMayEncryptBody2.m209026k().toString(), strValueOf, this.hashAccount, x1d0VarMayEncryptBody2.m209016a()));
            } catch (IllegalArgumentException e2) {
                CrashHelper.m82480d(e2, 100);
                throw new NetIgnoredException(e2);
            }
        } else if (strM209018c != null && strM209018c.equals(AUTH_ACCOUNT)) {
            x1d0 x1d0VarMayEncryptBody3 = mayEncryptBody(x1d0Var, c21228aM209023h, strValueOf);
            c21228aM209023h.m209034h("Authorization", "MAC " + basicToken(x1d0VarMayEncryptBody3.m209026k().toString(), strValueOf, x1d0VarMayEncryptBody3.m209016a()));
        }
        x1d0 x1d0VarM209028b = c21228aM209023h.m209028b();
        return debug_fakeServerUnavailable ? x1d0VarM209028b.m209023h().m209043q("http://core.unstable.putong.p1staff.com/service-unavailable").m209028b() : x1d0VarM209028b;
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
            byte[] bArrM181706a = rjj.m181706a(str);
            PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
            byte[] bArr = new byte[16];
            new Random(SystemClock.elapsedRealtime() + 1127).nextBytes(bArr);
            paddedBufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bytes), bArr));
            int outputSize = paddedBufferedBlockCipher.getOutputSize(bArrM181706a.length);
            byte[] bArr2 = new byte[outputSize];
            paddedBufferedBlockCipher.doFinal(bArr2, paddedBufferedBlockCipher.processBytes(bArrM181706a, 0, bArrM181706a.length, bArr2, 0));
            byte[] bArr3 = new byte[16 + outputSize];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, outputSize);
            return te2.m190678c(bArr3, 2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
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
            CrashHelper.m82479c(e);
        }
    }

    public void useNewConnectionPool() {
        this.httpProxy.m143605g(true);
    }

    private x1d0.C21228a common(x1d0.C21228a c21228a) {
        return ak20.m98541a(c21228a);
    }

    public x1d0.C21228a basic() {
        return basic(null);
    }

    public String fakeToken(String str, String str2, z1d0 z1d0Var) throws IOException {
        return authToken(str, str2, UUID.randomUUID().toString(), z1d0Var);
    }

    public x1d0.C21228a authBeforeSignUp() {
        return authBeforeSignUp(null);
    }

    public x1d0.C21228a auth() {
        return auth(null);
    }
}
