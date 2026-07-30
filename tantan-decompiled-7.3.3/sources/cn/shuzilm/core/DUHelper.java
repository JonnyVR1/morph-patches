package cn.shuzilm.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.idv.identity.base.algorithm.IdentityFaceState;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.jj5;

/* JADX INFO: loaded from: classes.dex */
public class DUHelper extends PhoneStateListener {
    public static final int MAIN_DU_ASYNCHRONOUS = 1;
    public static final int MAIN_DU_SYNCHRONOUS = 0;

    /* JADX INFO: renamed from: a */
    private static final String f3730a = "du.lock";

    /* JADX INFO: renamed from: b */
    private static final String f3731b = "du";

    /* JADX INFO: renamed from: c */
    private static AIClient f3732c;
    public static Context mContext;
    public static int mMeic;
    public static int mPopu;
    public static int mPort;
    public static int mSplt;

    /* JADX INFO: renamed from: y */
    private static Timer f3754y;

    /* JADX INFO: renamed from: z */
    private static C0832t f3755z;

    /* JADX INFO: renamed from: C */
    private int f3756C = 2;

    /* JADX INFO: renamed from: D */
    private boolean f3757D = false;

    /* JADX INFO: renamed from: E */
    private long f3758E = 0;

    /* JADX INFO: renamed from: d */
    private static final DUHelper f3733d = new DUHelper();

    /* JADX INFO: renamed from: e */
    private static int f3734e = 0;

    /* JADX INFO: renamed from: f */
    private static int f3735f = 0;

    /* JADX INFO: renamed from: g */
    private static final Lock f3736g = new ReentrantLock();

    /* JADX INFO: renamed from: h */
    private static final Lock f3737h = new ReentrantLock();

    /* JADX INFO: renamed from: i */
    private static final ReentrantReadWriteLock f3738i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j */
    private static boolean f3739j = false;

    /* JADX INFO: renamed from: k */
    private static String f3740k = null;

    /* JADX INFO: renamed from: l */
    private static String f3741l = null;

    /* JADX INFO: renamed from: m */
    private static final JSONObject f3742m = new JSONObject();

    /* JADX INFO: renamed from: n */
    private static final JSONObject f3743n = new JSONObject();

    /* JADX INFO: renamed from: o */
    private static JSONObject f3744o = null;

    /* JADX INFO: renamed from: p */
    private static final ThreadLocal f3745p = new ThreadLocal();

    /* JADX INFO: renamed from: q */
    private static String f3746q = null;

    /* JADX INFO: renamed from: r */
    private static JSONObject f3747r = new JSONObject();

    /* JADX INFO: renamed from: s */
    private static final ExecutorService f3748s = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: t */
    private static final ExecutorService f3749t = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: u */
    private static final ExecutorService f3750u = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: v */
    private static long f3751v = 0;

    /* JADX INFO: renamed from: w */
    private static long f3752w = 0;

    /* JADX INFO: renamed from: x */
    private static volatile boolean f3753x = false;

    /* JADX INFO: renamed from: A */
    private static Timer f3728A = null;

    /* JADX INFO: renamed from: B */
    private static TimerTask f3729B = new C0818f();

    private DUHelper() {
    }

    public static void ZVTFJRA(Context context, Listener listener, int i, boolean z) {
        Listener listener2;
        try {
            Context contextM4727c = m4727c(context);
            listener2 = listener;
            try {
                f3749t.execute(new RunnableC0817e(contextM4727c, z, i, listener2, context));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                if (listener2 != null) {
                    listener2.handler("NA");
                }
                exc.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            listener2 = listener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m4695a(Context context, String str, String str2, int i) {
        try {
            try {
                f3752w = 0L;
                f3751v = 0L;
                f3751v = System.currentTimeMillis();
                if (!f3733d.m4738e(context)) {
                    Log.e("[shuzilm]", "[20006] network is unavailable.");
                    return null;
                }
                setConfig("apiKey", f3740k);
                JSONObject jSONObject = f3743n;
                m4710a(context, jSONObject, str);
                JSONObject jSONObject2 = f3742m;
                m4715a(jSONObject2, str2);
                String strQuery = query(context, jSONObject.toString(), jSONObject2.toString(), i);
                if (strQuery != null) {
                    try {
                        if (!strQuery.isEmpty()) {
                            if (jSONObject.optString("location").equals("1")) {
                                mPopu = 10001;
                            }
                            C0816dl.m4785d(mContext, strQuery, jSONObject.optString(MessageType.operation).equals("1"));
                        }
                    } catch (Exception unused) {
                    }
                }
                f3752w = System.currentTimeMillis();
                return strQuery;
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void aXZlZWNl(Context context, Intent intent);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m4722b(Context context, String str, String str2, String str3) {
        String strOnEvent = null;
        try {
            if (!f3733d.m4738e(context)) {
                Log.e("[shuzilm]", "[20004] network is unavailable.");
                return null;
            }
            m4714a("pEventCode", str);
            if (str2 != null) {
                m4714a("mEventCode", str2);
            }
            ThreadLocal threadLocal = f3745p;
            String string = threadLocal.get() != null ? ((JSONObject) threadLocal.get()).toString() : null;
            String string2 = f3742m.toString();
            synchronized (this) {
                strOnEvent = onEvent(context, string, string2, str3);
            }
            return strOnEvent;
        } catch (Exception e) {
            e.printStackTrace();
            return strOnEvent;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return strOnEvent;
        }
    }

    /* JADX INFO: renamed from: bm */
    public static void m4726bm(Context context, String str) {
        try {
            f3748s.execute(new RunnableC0819g(m4727c(context), str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private String m4729c(Context context, int i) {
        if (i >= 12) {
            return null;
        }
        if (i == 0) {
            try {
                Thread.sleep(20L);
            } catch (Throwable unused) {
                return null;
            }
        }
        synchronized (this) {
            try {
                String strNYfbIIFp = nYfbIIFp(context, WeJson.EMPTY_MAP, WeJson.EMPTY_MAP);
                if (strNYfbIIFp != null && !strNYfbIIFp.isEmpty()) {
                    return strNYfbIIFp;
                }
                Thread.sleep(120L);
                return m4729c(context, i + 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static native String c6M2YmYQ(Context context, int i);

    private static native String c6M3YmYQ(Context context, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static int m4733d(Context context) {
        String packageName = context.getPackageName();
        try {
            int i = ((int) context.getPackageManager().getPackageInfo(packageName, 0).firstInstallTime) % 10000;
            int iHashCode = (packageName + Build.MODEL).hashCode();
            if (iHashCode < 0) {
                iHashCode = -iHashCode;
            }
            mPort = (iHashCode % 5000) + 12000 + i;
            return 0;
        } catch (Exception e) {
            mPort = 17835;
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void dGZvcmRQ(Context context, String str, String str2);

    /* JADX INFO: renamed from: e */
    private String m4736e(Context context, String str) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m4741f(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return connectivityManager.getActiveNetwork() != null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void f2c071(int i, Listener listener) {
        try {
            Context contextM4727c = m4727c(mContext);
            if (contextM4727c != null && f3740k != null) {
                if (i == 1) {
                    getQueryID(mContext, "NA", "", false, 1, new C0831s(contextM4727c, i, listener), i + 100);
                    return;
                }
                String strM4719b = f3733d.m4719b(contextM4727c, i);
                if (listener != null) {
                    listener.handler(strM4719b);
                    return;
                }
                return;
            }
            Log.e("[shuzilm]", "[20005] sdk init error.");
            if (listener != null) {
                listener.handler(null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private JSONObject m4743g(Context context) {
        String strM4731c = m4731c(context, "cn.shuzilm.config.json");
        if (strM4731c != null) {
            return new JSONObject(strM4731c);
        }
        return null;
    }

    public static Map getQueryID(Context context, String str, String str2, boolean z, int i, Listener listener, int i2) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        String str3 = "1";
        if (z) {
            m4724b(2);
            setConfig("l_o", "0");
        } else {
            setConfig("l_o", "1");
        }
        try {
            HashMap map = new HashMap();
            Context contextM4727c = m4727c(context);
            DUHelper dUHelper = f3733d;
            dUHelper.f3756C = i2;
            if (i == 1) {
                dUHelper.m4708a(contextM4727c, str, str2, listener, i2);
                return null;
            }
            Lock lock = f3736g;
            if (lock.tryLock()) {
                String strM4695a = dUHelper.m4695a(contextM4727c, str, str2, i2);
                if (strM4695a != null) {
                    f3746q = strM4695a;
                } else {
                    str3 = "0";
                }
                if (strM4695a == null && (strM4695a = f3746q) == null) {
                    strM4695a = dUHelper.m4747i(contextM4727c);
                }
                map.put("device_id", strM4695a);
                map.put(BLiveRightItem.PERIOD_VALID, str3);
                lock.unlock();
            } else {
                String strM4747i = dUHelper.m4747i(contextM4727c);
                if (strM4747i == null) {
                    dUHelper.m4708a(contextM4727c, str, str2, listener, i2);
                }
                map.put("device_id", strM4747i);
                map.put(BLiveRightItem.PERIOD_VALID, "0");
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: go */
    public static void m4744go(Context context, String str, String str2) {
        try {
            Context contextM4727c = m4727c(context);
            if (!f3733d.m4738e(contextM4727c)) {
                Log.e("[shuzilm]", "[20002] network is unavailable.");
            } else if (f3736g.tryLock()) {
                try {
                    f3748s.execute(new RunnableC0826n(contextM4727c, str, str2));
                } catch (Exception unused) {
                }
                f3736g.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    private String m4746h(Context context) {
        try {
            DUHelper dUHelper = f3733d;
            Object objM4734d = dUHelper.m4734d(context, PlaceTypes.STORE);
            if (objM4734d instanceof String) {
                return null;
            }
            return dUHelper.m4736e(context, new JSONObject(objM4734d.toString()).getJSONObject("metadata").getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m4747i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_dna", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("device_id", null);
        }
        return null;
    }

    public static void init(Context context, String str, boolean z) {
        mContext = m4727c(context);
        f3740k = str;
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        f3748s.execute(new RunnableC0824l(context));
    }

    /* JADX INFO: renamed from: j */
    private void m4749j(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        if (defaultSensor != null) {
            m4706a(context, sensorManager, defaultSensor);
        }
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(3);
        if (defaultSensor2 != null) {
            m4706a(context, sensorManager, defaultSensor2);
        }
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
        if (defaultSensor3 != null) {
            m4706a(context, sensorManager, defaultSensor3);
        }
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(6);
        if (defaultSensor4 != null) {
            m4706a(context, sensorManager, defaultSensor4);
        }
        Sensor defaultSensor5 = sensorManager.getDefaultSensor(1);
        if (defaultSensor5 != null) {
            m4706a(context, sensorManager, defaultSensor5);
        }
        Sensor defaultSensor6 = sensorManager.getDefaultSensor(4);
        if (defaultSensor6 != null) {
            m4706a(context, sensorManager, defaultSensor6);
        }
        Sensor defaultSensor7 = sensorManager.getDefaultSensor(5);
        if (defaultSensor7 != null) {
            m4706a(context, sensorManager, defaultSensor7);
        }
        Sensor defaultSensor8 = sensorManager.getDefaultSensor(2);
        if (defaultSensor8 != null) {
            m4706a(context, sensorManager, defaultSensor8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static synchronized void m4750k(Context context) {
        try {
            if (f3753x) {
                return;
            }
            if (f3734e > 0) {
                return;
            }
            f3753x = true;
            Timer timer = new Timer();
            f3754y = timer;
            timer.schedule(new C0815d(context), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m4751l(Context context) {
        if (f3733d.m4738e(context)) {
            try {
                if (C0833u.m4807a(mContext, "android.permission.CHANGE_NETWORK_STATE") && C0833u.m4806a(context)) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
                    NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
                    C0820h c0820h = new C0820h(context);
                    oxlbmV0d(context, c0820h, 2);
                    connectivityManager.requestNetwork(networkRequestBuild, c0820h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void loadLibrary() {
        f3748s.execute(new RunnableC0823k());
    }

    /* JADX INFO: renamed from: m */
    private static String m4752m(Context context) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        try {
            ZVTFJRA(context, new C0821i(atomicReference, countDownLatch), 0, false);
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
            String str = (String) atomicReference.get();
            return str != null ? str : "0";
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return "0";
        } catch (NullPointerException unused2) {
            return "0";
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x00aa A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:6:0x0017, B:9:0x001f, B:11:0x0028, B:12:0x002c, B:14:0x0094, B:16:0x009a, B:26:0x00cb, B:18:0x00aa, B:20:0x00b0, B:22:0x00c1), top: B:29:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:6:0x0017, B:9:0x001f, B:11:0x0028, B:12:0x002c, B:14:0x0094, B:16:0x009a, B:26:0x00cb, B:18:0x00aa, B:20:0x00b0, B:22:0x00c1), top: B:29:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c1 A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:6:0x0017, B:9:0x001f, B:11:0x0028, B:12:0x002c, B:14:0x0094, B:16:0x009a, B:26:0x00cb, B:18:0x00aa, B:20:0x00b0, B:22:0x00c1), top: B:29:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x00b0, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public static String m4754n(Context context) {
        String str;
        long j;
        DUHelper dUHelper = f3733d;
        String strM4730c = dUHelper.f3757D ? m4730c(context, 501, (String) null) : "";
        try {
            JSONObject jSONObject = new JSONObject();
            if (strM4730c == null) {
                strM4730c = "0";
            }
            jSONObject.put("x1", strM4730c);
            jSONObject.put("x2", dUHelper.f3757D ? m4752m(context) : "");
            jSONObject.put("x3", Build.MANUFACTURER + Constants.SEPARATOR_COMMA + Build.MODEL);
            jSONObject.put("x4", Locale.getDefault().getCountry());
            jSONObject.put("x5", dUHelper.m4741f(context));
            jSONObject.put("x6", C0833u.m4806a(context));
            jSONObject.put("x7", m4739f(context, "660252AEC9476C1C43EF3FB903B3A60E"));
            jSONObject.put("x8", m4755o(context));
            jSONObject.put("x9", Build.VERSION.SDK_INT);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = f3752w;
            if (j2 > 0) {
                long j3 = f3751v;
                if (j3 > 0) {
                    str = "1," + (j2 - j3);
                } else if (j2 == 0) {
                    j = f3751v;
                    if (j > 0) {
                        str = "2," + (jCurrentTimeMillis - j);
                    } else if (j2 == 0 || f3751v != 0) {
                        str = "0";
                    } else {
                        str = "3";
                    }
                } else if (j2 == 0) {
                    str = "0";
                } else {
                    str = "0";
                }
            } else if (j2 == 0) {
                j = f3751v;
                if (j > 0) {
                    str = "2," + (jCurrentTimeMillis - j);
                } else if (j2 == 0) {
                    str = "0";
                } else {
                    str = "0";
                }
            } else if (j2 == 0) {
                str = "0";
            } else {
                str = "0";
            }
            jSONObject.put("x10", str);
            jSONObject.put("x0", String.valueOf(jCurrentTimeMillis));
            jSONObject.put("x11", m4739f(context, "2C281B48F6E872759F787C4106451E4D"));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "0";
        }
    }

    private static native String nYfbIIFp(Context context, String str, String str2);

    private static native String ntERIJNQ(Context context, int i, String str);

    /* JADX INFO: renamed from: o */
    private static String m4755o(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            String interfaceName = linkProperties.getInterfaceName();
            ProxyInfo httpProxy = linkProperties.getHttpProxy();
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            int size = dnsServers.size();
            if (interfaceName == null || interfaceName.isEmpty()) {
                stringBuffer.append("0,");
            } else {
                stringBuffer.append(interfaceName.concat(Constants.SEPARATOR_COMMA));
            }
            if (httpProxy != null) {
                stringBuffer.append(httpProxy.getHost().toString() + Constants.SEPARATOR_COMMA);
            } else {
                stringBuffer.append("0,");
            }
            for (int i = 0; i < size; i++) {
                stringBuffer.append(dnsServers.get(i).getHostAddress().toString() + "-");
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return stringBuffer.toString().length() > 0 ? stringBuffer.toString() : "0";
        }
    }

    private static native String onEvent(Context context, String str, String str2, String str3);

    public static Map onEvent(Context context, String str, String str2, int i, Listener listener) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        if (str == null) {
            return null;
        }
        try {
            Context contextM4727c = m4727c(context);
            if (i == 1) {
                f3733d.m4709a(contextM4727c, str, (String) null, str2, listener);
                return null;
            }
            HashMap map = new HashMap();
            Lock lock = f3736g;
            if (!lock.tryLock()) {
                f3733d.m4709a(contextM4727c, str, (String) null, str2, listener);
                return null;
            }
            map.put("SessionID", f3733d.m4722b(contextM4727c, str, null, str2));
            map.put("QueryID", f3746q);
            lock.unlock();
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String onIEvent(Context context, String str, String str2, String str3);

    public static void onIEvent(Context context, String str) {
        try {
            f3748s.execute(new RunnableC0814c(str, m4727c(context)));
        } catch (Exception unused) {
        }
    }

    private static native void onSSChanged(Context context, SignalStrength signalStrength);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onSensorChanged(Context context, SensorEvent sensorEvent);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void oxlbmV0d(Context context, Object obj, int i);

    private static native String query(Context context, String str, String str2, int i);

    public static void report(Context context, String str, String str2) {
        try {
            Context contextM4727c = m4727c(context);
            if (!f3733d.m4738e(contextM4727c)) {
                Log.e("[shuzilm]", "[20003] network is unavailable.");
            } else if (f3736g.tryLock()) {
                try {
                    f3748s.execute(new RunnableC0827o(contextM4727c, str, str2));
                } catch (Exception unused) {
                }
                f3736g.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String reportRun(Context context, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String run(Context context, String str, String str2);

    /* JADX INFO: renamed from: s */
    public static String m4757s(Context context, int i) {
        try {
            String str = RXScreenCaptureService.KEY_INDEX + String.valueOf(i);
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_dna", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(str, "");
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static int setConfig(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        try {
            f3733d.m4716a(f3743n, str, str2);
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int setData(String str, String str2) throws JSONException {
        f3733d.m4716a(f3742m, str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: sl */
    public static int m4758sl(Context context, IntentFilter intentFilter) {
        try {
            if (f3755z == null) {
                f3755z = new C0832t(null);
            }
            if (f3728A != null) {
                return 0;
            }
            jj5.m145018l(context, f3755z, intentFilter);
            Timer timer = new Timer();
            f3728A = timer;
            timer.schedule(f3729B, 10000L);
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static native String ttERIJNQ(Context context, String str, String str2);

    /* JADX INFO: renamed from: ul */
    public static int m4759ul(int i) {
        try {
            mContext.unregisterReceiver(f3755z);
        } catch (Exception unused) {
        }
        if (i != 0) {
            return -1;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("MTZiMjcx");
            aXZlZWNl(mContext, intent);
            Timer timer = f3728A;
            if (timer == null) {
                return -1;
            }
            timer.cancel();
            f3728A = null;
            return -1;
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static int unResListener() {
        try {
            ((TelephonyManager) mContext.getSystemService("phone")).listen(f3733d, 0);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String zZVTFJRA(Context context, String str);

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        try {
            onSSChanged(mContext, signalStrength);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m4742g() {
        int i = f3734e;
        f3734e = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    private boolean m4738e(Context context) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m4753m(Context context, int i, Listener listener) {
        if (i == 2) {
            f3750u.execute(new RunnableC0822j(context, listener));
        }
    }

    /* JADX INFO: renamed from: c */
    private static Context m4727c(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            return applicationContext != null ? applicationContext : context;
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m4739f(Context context, String str) {
        String strM4720b = m4720b(context, str);
        return strM4720b != null ? strM4720b : "0";
    }

    /* JADX INFO: renamed from: c */
    private String m4731c(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamOpen.close();
                    return sb.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private Object m4734d(Context context, String str) {
        try {
            JSONObject jSONObjectM4743g = f3744o;
            if (jSONObjectM4743g == null) {
                jSONObjectM4743g = m4743g(context);
                f3744o = jSONObjectM4743g;
            }
            return jSONObjectM4743g.opt(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m4730c(Context context, int i, String str) {
        try {
        } catch (Throwable unused) {
            return null;
        }
        return c6M3YmYQ(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4724b(int i) {
        if (f3739j) {
            return;
        }
        try {
            f3749t.execute(new RunnableC0825m(i));
            if (i == 2) {
                f3739j = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m4720b(Context context, String str) {
        if (str == null) {
            return null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_prefs", 0).getString(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m4719b(Context context, int i) {
        String strC6M2YmYQ;
        try {
            strC6M2YmYQ = c6M2YmYQ(context, i);
        } catch (Exception unused) {
            strC6M2YmYQ = null;
        }
        if (i != 1) {
            m4703a(context, i);
        }
        return strC6M2YmYQ;
    }

    /* JADX INFO: renamed from: a */
    private void m4703a(Context context, int i) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f3758E > 7000) {
                f3748s.execute(new RunnableC0830r(this, i));
                this.f3758E = jCurrentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public static String getQueryID(Context context, String str, String str2, boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        try {
            getQueryID(context, str, str2, z, 1, new C0828p(atomicReference, countDownLatch), 2);
            countDownLatch.await(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS);
            return (String) atomicReference.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4709a(Context context, String str, String str2, String str3, Listener listener) {
        f3748s.execute(new RunnableC0829q(this, context, str, str2, str3, listener));
    }

    /* JADX INFO: renamed from: a */
    private void m4714a(String str, String str2) {
        try {
            ThreadLocal threadLocal = f3745p;
            JSONObject jSONObject = (JSONObject) threadLocal.get();
            if (jSONObject != null) {
                jSONObject.put(str, str2);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, str2);
            threadLocal.set(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4716a(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4715a(JSONObject jSONObject, String str) throws JSONException {
        m4716a(jSONObject, "custom", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4710a(Context context, JSONObject jSONObject, String str) {
        String str2;
        try {
            if (jSONObject.isNull(PlaceTypes.STORE)) {
                if (str == null && (str = m4746h(context)) == null) {
                    str = (String) m4734d(context, PlaceTypes.STORE);
                }
                if (str != null) {
                    jSONObject.put(PlaceTypes.STORE, str);
                }
            }
            if (!jSONObject.isNull("apiKey") || (str2 = (String) m4734d(context, "apiKey")) == null) {
                return;
            }
            jSONObject.put("apiKey", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m4756o(Context context, String str, String str2, boolean z, int i, Listener listener, int i2) {
        m4730c(context, IdentityFaceState.FACE_OPEN_MOUTH_DONE, str2);
        getQueryID(context, str, str2, z, i, listener, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4708a(Context context, String str, String str2, Listener listener, int i) {
        try {
            f3734e++;
            f3748s.execute(new RunnableC0812a(this, context, str, str2, i, listener));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4706a(Context context, SensorManager sensorManager, Sensor sensor) {
        sensorManager.registerListener(new C0813b(this, context, sensorManager), sensor, 1);
    }
}
