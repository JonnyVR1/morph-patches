package p153l;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaDrm;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.InputDevice;
import com.clevertap.android.sdk.Constants;
import com.momo.momortc.MMConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class o0e {

    /* JADX INFO: renamed from: a */
    private static final String f144516a = riw.m181611a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84});

    /* JADX INFO: renamed from: b */
    private static final String f144517b = riw.m181611a(new byte[]{6, 80, 7, 1});

    /* JADX INFO: renamed from: c */
    private static final String f144518c = riw.m181611a(new byte[]{117, 20, 67, 88, 19});

    /* JADX INFO: renamed from: d */
    private static final String f144519d = riw.m181611a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: e */
    private static volatile JSONObject f144520e = null;

    /* JADX INFO: renamed from: f */
    private static final Object f144521f = new Object();

    /* JADX INFO: renamed from: g */
    private static volatile List<JSONObject> f144522g = null;

    /* JADX INFO: renamed from: h */
    private static final Object f144523h = new Object();

    /* JADX INFO: renamed from: i */
    private static volatile String f144524i = null;

    /* JADX INFO: renamed from: j */
    private static final Object f144525j = new Object();

    /* JADX INFO: renamed from: k */
    private static volatile String f144526k = null;

    /* JADX INFO: renamed from: l */
    private static final Object f144527l = new Object();

    /* JADX INFO: renamed from: m */
    private static final String[] f144528m = {riw.m181611a(new byte[]{89, 9, 31, 80, 8, 18, 88, 19, 83, 25, 9, 19, 67, HttpTokens.CARRIAGE_RETURN, 72, 83, 6, 72, 93, 7, 86, 94, 18, HttpTokens.CARRIAGE_RETURN}), riw.m181611a(new byte[]{83, 9, 92, 25, 21, 9, 64, 12, 94, 95, 15, 17, 69, 72, 92, 86, 6, 15, 67, HttpTokens.CARRIAGE_RETURN}), riw.m181611a(new byte[]{83, 9, 92, 25, 2, 10, 95, 19, 85, 25, 19, 18, 83, 1, 84, 68, 21, 19, 66, 3})};

    /* JADX INFO: renamed from: n */
    private static final String[] f144529n = {riw.m181611a(new byte[]{31, 2, 80, 67, 0, 73, 84, 7, 69, 86}), riw.m181611a(new byte[]{31, 2, 80, 67, 0, 73, 69, 21, 84, 69, 78, 86}), riw.m181611a(new byte[]{31, 21, 85, 84, 0, 20, 84, 73, 112, 89, 5, 20, 95, 15, 85, 24, 5, 7, 68, 7})};

    /* JADX INFO: renamed from: l.o0e$a */
    public static class CallableC19000a implements Callable<String> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return o0e.m165461n();
        }
    }

    /* JADX INFO: renamed from: l.o0e$b */
    public static class CallableC19001b implements Callable<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f144530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f144531b;

        public CallableC19001b(Context context, String str) {
            this.f144530a = context;
            this.f144531b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return piw.m172463a(this.f144530a, this.f144531b);
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m165436A() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: B */
    public static String m165437B() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: C */
    public static String m165438C() {
        return pde0.m171789b() + riw.m181611a(new byte[]{72}) + pde0.m171790c();
    }

    /* JADX INFO: renamed from: D */
    public static JSONObject m165439D() {
        x6b0 x6b0VarM209460b;
        JSONObject jSONObject = f144520e;
        if (jSONObject != null) {
            try {
                return new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                f144520e = null;
            }
        }
        synchronized (f144521f) {
            try {
                JSONObject jSONObject2 = f144520e;
                if (jSONObject2 != null) {
                    try {
                        return new JSONObject(jSONObject2.toString());
                    } catch (JSONException unused2) {
                        f144520e = null;
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                String strM181611a = riw.m181611a(new byte[]{86, 15, 93, 82, 62});
                try {
                    x6b0 x6b0VarM209460b2 = x6b0.m209460b(riw.m181611a(new byte[]{86, 15, 95, 80, 4, 20, 64, 20, 88, 89, 21, 57, 64, 20, 94, 71}));
                    if (x6b0VarM209460b2 != null) {
                        List<String> listM209463d = x6b0VarM209460b2.m209463d(riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 81, 8, 8, 87, 3, 67, 71, 19, 15, 94, 18}));
                        if (listM209463d.isEmpty() && (x6b0VarM209460b = x6b0.m209460b(riw.m181611a(new byte[]{85, 30, 65, 88, 19, 18, 85, 2, 110, 81, 8, 8, 87, 3, 67, 71, 19, 15, 94, 18, 110, 71, 19, 9, 64}))) != null) {
                            listM209463d = x6b0VarM209460b.m209463d(riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 81, 8, 8, 87, 3, 67, 71, 19, 15, 94, 18}));
                        }
                        try {
                            jSONObject3.put(strM181611a + riw.m181611a(new byte[]{86, 15, 95, 80, 4, 20, 64, 20, 88, 89, 21}), listM209463d.isEmpty() ? "" : listM209463d.get(0));
                        } catch (JSONException unused3) {
                            jSONObject3.put(strM181611a + riw.m181611a(new byte[]{86, 15, 95, 80, 4, 20, 64, 20, 88, 89, 21}), "");
                        }
                    }
                    x6b0 x6b0VarM209460b3 = x6b0.m209460b(riw.m181611a(new byte[]{82, 19, 88, 91, 5, 57, 64, 20, 94, 71}));
                    if ((x6b0VarM209460b3 == null || x6b0VarM209460b3.m209463d(riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 4, 66, 7, 95, 83})).isEmpty()) && ((x6b0VarM209460b3 = x6b0.m209460b(riw.m181611a(new byte[]{85, 30, 65, 88, 19, 18, 85, 2, 3, 104, 5, 3, 86, 7, 68, 91, 21, 57, 64, 20, 94, 71}))) == null || x6b0VarM209460b3.m209463d(riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 4, 66, 7, 95, 83})).isEmpty())) {
                        x6b0VarM209460b3 = x6b0.m209460b(riw.m181611a(new byte[]{84, 3, 87, 86, 20, 10, 68, 57, 65, 69, 14, 22}));
                    }
                    if (x6b0VarM209460b3 != null) {
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{82, 20, 80, 89, 5}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 4, 66, 7, 95, 83}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{94, 7, 92, 82}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 8, 81, 11, 84}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{84, 3, 71, 94, 2, 3}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 67, 82, HttpTokens.CARRIAGE_RETURN, 3, 81, 21, 84}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 65, 4, 20, 67, 15, 94, 89, 79, 20, 85, 10, 84, 86, 18, 3}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{82, 19, 88, 91, 5, 57, 89, 2}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 94, 5}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 88, 89, 2, 20, 85, 11, 84, 89, 21, 7, 92}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 65, 4, 20, 67, 15, 94, 89, 79, 15, 94, 5, 67, 82, 12, 3, 94, 18, 80, 91}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{68, 31, 65, 82}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 67, 24, 22, 85}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{68, 7, 86, 68}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 67, 0, 1, 67}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{69, 21, 84, 69}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 66, 18, 3, 66}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{84, 7, 69, 82}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 83, 0, 18, 85, 72, 68, 67, 2}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{93, 7, 95, 66, 7, 7, 83, 18, 68, 69, 4, 20}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 11, 81, 8, 68, 81, 0, 5, 68, 19, 67, 82, 19}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 11, 95, 2, 84, 91}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{67, 2, 90}), riw.m181611a(new byte[]{66, 9, 31, 85, 20, 15, 92, 2, 31, 65, 4, 20, 67, 15, 94, 89, 79, 21, 84, HttpTokens.CARRIAGE_RETURN}));
                        m165447L(x6b0VarM209460b3, jSONObject3, strM181611a + riw.m181611a(new byte[]{81, 4, 88, 91, 8, 21, 68}), riw.m181611a(new byte[]{66, 9, 31, 71, 19, 9, 84, 19, 82, 67, 79, 5, 64, 19, 31, 86, 3, 15, 92, 15, 66, 67}));
                    }
                    f144520e = jSONObject3;
                } catch (Exception unused4) {
                }
                return jSONObject3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m165440E(Context context) {
        try {
            return context.getFilesDir().getPath();
        } catch (Exception unused) {
            return f144518c;
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m165441F(Context context) {
        int simState = ((TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}))).getSimState();
        return (simState == 0 || simState == 1) ? 0 : 1;
    }

    /* JADX INFO: renamed from: G */
    public static int m165442G(Context context) {
        try {
            return Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), riw.m181611a(new byte[]{81, 5, 82, 82, 18, 21, 89, 4, 88, 91, 8, 18, 73, 57, 84, 89, 0, 4, 92, 3, 85})) == 1 ? 1 : 0;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m165443H(Context context) {
        int iM160952a = n03.m160951b(context).m160952a();
        if (iM160952a == 0) {
            return riw.m181611a(new byte[]{114, 47, 126, 122, 36, 50, 98, 47, 114, 104, 50, 51, 115, 37, 116, 100, 50});
        }
        if (iM160952a == 1) {
            return riw.m181611a(new byte[]{114, 47, 126, 122, 36, 50, 98, 47, 114, 104, 36, 52, 98, 41, 99, 104, 41, 49, 111, 51, 127, 118, 55, 39, 121, 42, 112, 117, 45, 35});
        }
        if (iM160952a != 11) {
            return iM160952a != 12 ? riw.m181611a(new byte[]{114, 47, 126, 122, 36, 50, 98, 47, 114, 104, 52, 40, 123, 40, 126, 96, 47}) : riw.m181611a(new byte[]{114, 47, 126, 122, 36, 50, 98, 47, 114, 104, 36, 52, 98, 41, 99, 104, 47, 41, 111, 46, 112, 101, 37, 49, 113, 52, 116});
        }
        return riw.m181611a(new byte[]{114, 47, 126, 122, 36, 50, 98, 47, 114, 104, 36, 52, 98, 41, 99, 104, 47, 41, 126, 35, 110, 114, 47, 52, 127, 42, 125, 114, 37});
    }

    /* JADX INFO: renamed from: I */
    public static int m165444I(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(riw.m181611a(new byte[]{91, 3, 72, 80, 20, 7, 66, 2}));
        if (keyguardManager == null) {
            return -1;
        }
        try {
            return ((Boolean) keyguardManager.getClass().getMethod(riw.m181611a(new byte[]{89, 21, 117, 82, 23, 15, 83, 3, 98, 82, 2, 19, 66, 3}), null).invoke(keyguardManager, null)).booleanValue() ? 1 : 0;
        } catch (Exception unused) {
            return keyguardManager.isKeyguardSecure() ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m165445J() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && networkInterfaceNextElement.getInterfaceAddresses().size() != 0 && (riw.m181611a(new byte[]{68, 19, 95, 7}).equals(networkInterfaceNextElement.getName()) || riw.m181611a(new byte[]{64, 22, 65, 7}).equals(networkInterfaceNextElement.getName()))) {
                    return 1;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: K */
    private static boolean m165446K(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: L */
    private static void m165447L(x6b0 x6b0Var, JSONObject jSONObject, String str, String str2) {
        try {
            try {
                List<String> listM209463d = x6b0Var.m209463d(str2);
                jSONObject.put(str, listM209463d.isEmpty() ? "" : listM209463d.get(0));
            } catch (JSONException unused) {
            }
        } catch (Exception unused2) {
            jSONObject.put(str, "");
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m165448a(Context context) {
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), riw.m181611a(new byte[]{85, 8, 80, 85, HttpTokens.CARRIAGE_RETURN, 3, 84, 57, 80, 84, 2, 3, 67, 21, 88, 85, 8, 10, 89, 18, 72, 104, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 21}));
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                arrayList.add(simpleStringSplitter.next());
            }
        }
        return Arrays.toString((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: b */
    public static synchronized List<String> m165449b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : f144528m) {
            for (String str2 : f144529n) {
                String str3 = str2 + riw.m181611a(new byte[]{31}) + str;
                if (m165446K(str3)) {
                    arrayList.add(str3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m165450c(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            String str = new String[]{riw.m181611a(new byte[]{70, 4, 94, 79})}[0];
            String str2 = Build.FINGERPRINT;
            if (str2.contains(str)) {
                arrayList.add(str2);
            }
        } catch (Exception unused) {
        }
        try {
            String[] strArr = {riw.m181611a(new byte[]{87, 9, 94, 80, HttpTokens.CARRIAGE_RETURN, 3, 111, 21, 85, 92}), riw.m181611a(new byte[]{85, 11, 68, 91, 0, 18, 95, 20}), riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 70, 66, 83, 10, 70, 82, 19, 88, 91, 21, 70, 86, 9, 67}), riw.m181611a(new byte[]{84, 20, 94, 94, 5, 82, 72})};
            String lowerCase = Build.MODEL.toLowerCase(Locale.ENGLISH);
            for (int i = 0; i < 4; i++) {
                if (lowerCase.contains(strArr[i])) {
                    arrayList.add(Build.MODEL);
                }
            }
        } catch (Exception unused2) {
        }
        try {
            String str3 = new String[]{riw.m181611a(new byte[]{119, 3, 95, 78, 12, 9, 68, 15, 94, 89})}[0];
            String str4 = Build.MANUFACTURER;
            if (str4.contains(str3)) {
                arrayList.add(str4);
            }
        } catch (Exception unused3) {
        }
        try {
            String[] strArr2 = {riw.m181611a(new byte[]{87, 9, 94, 80, HttpTokens.CARRIAGE_RETURN, 3, 111, 21, 85, 92}), riw.m181611a(new byte[]{67, 2, 90, 104, 17, 14, 95, 8, 84}), riw.m181611a(new byte[]{67, 2, 90, 104, 25, 94, 6}), riw.m181611a(new byte[]{70, 4, 94, 79, 89, 80, 64}), riw.m181611a(new byte[]{94, 9, 73})};
            for (int i2 = 0; i2 < 5; i2++) {
                String str5 = strArr2[i2];
                String str6 = Build.PRODUCT;
                if (str6.toLowerCase(Locale.ROOT).contains(str5)) {
                    arrayList.add(str6);
                }
            }
        } catch (Exception unused4) {
        }
        try {
            String str7 = new String[]{riw.m181611a(new byte[]{94, 9, 73})}[0];
            String str8 = Build.BOARD;
            if (str8.toLowerCase(Locale.ROOT).contains(str7)) {
                arrayList.add(str8);
            }
        } catch (Exception unused5) {
        }
        try {
            String str9 = new String[]{riw.m181611a(new byte[]{94, 9, 73})}[0];
            String str10 = Build.BOOTLOADER;
            if (str10.toLowerCase(Locale.ROOT).contains(str9)) {
                arrayList.add(str10);
            }
        } catch (Exception unused6) {
        }
        try {
            String[] strArr3 = {riw.m181611a(new byte[]{66, 7, 95, 84, 9, 19}), riw.m181611a(new byte[]{70, 4, 94, 79, 89, 80}), riw.m181611a(new byte[]{87, 9, 93, 83, 7, 15, 67, 14})};
            for (int i3 = 0; i3 < 3; i3++) {
                String str11 = strArr3[i3];
                String str12 = Build.HARDWARE;
                if (str12.equalsIgnoreCase(str11)) {
                    arrayList.add(str12);
                }
            }
        } catch (Exception unused7) {
        }
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService(riw.m181611a(new byte[]{67, 3, 95, 68, 14, 20}));
            int size = sensorManager.getSensorList(-1).size();
            for (int i4 = 0; i4 < size; i4++) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(i4);
                if (defaultSensor != null && defaultSensor.getName().contains(riw.m181611a(new byte[]{119, 9, 93, 83, 7, 15, 67, 14}))) {
                    arrayList.add(defaultSensor.getName());
                }
            }
        } catch (Throwable unused8) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m165451d(String str) {
        return str.equals(f144516a) || str.equals(f144518c);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public static int m165452e(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        return (or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 127, 114, 53, 49, 127, 52, 122, 104, 50, 50, 113, 50, 116})) && (connectivityManager = (ConnectivityManager) context.getSystemService(riw.m181611a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}))) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasTransport(4)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static String m165453f() {
        String radioVersion = Build.getRadioVersion();
        return TextUtils.isEmpty(radioVersion) ? f144517b : radioVersion;
    }

    /* JADX INFO: renamed from: g */
    private static String m165454g() {
        try {
            File file = new File(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 8, 85, 18, 30, 64, HttpTokens.CARRIAGE_RETURN, 7, 94, 86, 30, 86, 5, 2, 66, 3, 66, 68}));
            return file.exists() ? new BufferedReader(new InputStreamReader(new FileInputStream(file))).readLine().trim() : f144516a;
        } catch (Exception unused) {
            return f144518c;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m165455h(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}));
    }

    /* JADX INFO: renamed from: i */
    public static String m165456i() {
        return f2j0.m123623g(f2j0.m123625i(riw.m181611a(new byte[]{83, 7, 69, 23, 78, 22, 66, 9, 82, 24, 18, 31, 67, 73, 90, 82, 19, 8, 85, 10, 30, 69, 0, 8, 84, 9, 92, 24, 3, 9, 95, 18, 110, 94, 5})));
    }

    /* JADX INFO: renamed from: j */
    public static String m165457j() {
        String str = Build.FINGERPRINT;
        int iLastIndexOf = str.lastIndexOf(riw.m181611a(new byte[]{10}));
        if (iLastIndexOf <= 0) {
            return str;
        }
        String[] strArrSplit = str.substring(0, iLastIndexOf).split(riw.m181611a(new byte[]{31}));
        if (strArrSplit.length <= 2) {
            return str;
        }
        return ("" + strArrSplit[strArrSplit.length - 2] + riw.m181611a(new byte[]{31})) + strArrSplit[strArrSplit.length - 1];
    }

    /* JADX INFO: renamed from: k */
    public static long m165458k() {
        try {
            return new File(riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 83, 66, 8, 10, 84, 72, 65, 69, 14, 22})).lastModified();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m165459l(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), riw.m181611a(new byte[]{84, 3, 87, 86, 20, 10, 68, 57, 88, 89, 17, 19, 68, 57, 92, 82, 21, 14, 95, 2}));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m165460m(Context context) {
        byte b;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                byte b2 = 21;
                byte b3 = 84;
                char c = 2;
                byte b4 = 3;
                UserManager userManager = (UserManager) context.getSystemService(riw.m181611a(new byte[]{69, 21, 84, 69}));
                if (userManager != null) {
                    byte b5 = 67;
                    int i = 6;
                    jSONObject.put(riw.m181611a(new byte[]{67, 19, 65, 71, 14, 20, 68, 21, 124, 66, HttpTokens.CARRIAGE_RETURN, 18, 89, 22, 93, 82, 52, 21, 85, 20, 66}), UserManager.supportsMultipleUsers() ? 1 : 0);
                    List<UserHandle> userProfiles = userManager.getUserProfiles();
                    jSONObject.put(riw.m181611a(new byte[]{69, 21, 84, 69, 49, 20, 95, 0, 88, 91, 4, 21, 99, 15, 75, 82}), userProfiles != null ? userProfiles.size() : 0);
                    JSONArray jSONArray = new JSONArray();
                    if (userProfiles != null) {
                        Iterator<UserHandle> it = userProfiles.iterator();
                        while (it.hasNext()) {
                            UserHandle next = it.next();
                            byte b6 = b2;
                            JSONObject jSONObject2 = new JSONObject();
                            byte b7 = b3;
                            char c2 = c;
                            byte b8 = b4;
                            try {
                                long serialNumberForUser = userManager.getSerialNumberForUser(next);
                                b = b5;
                                try {
                                    byte[] bArr = new byte[i];
                                    bArr[0] = b;
                                    bArr[1] = b8;
                                    bArr[c2] = b;
                                    bArr[b8] = 94;
                                    bArr[4] = 0;
                                    bArr[5] = 10;
                                    jSONObject2.put(riw.m181611a(bArr), serialNumberForUser);
                                } catch (Throwable unused) {
                                    byte[] bArr2 = new byte[i];
                                    bArr2[0] = b;
                                    bArr2[1] = b8;
                                    bArr2[c2] = b;
                                    bArr2[b8] = 94;
                                    bArr2[4] = 0;
                                    bArr2[5] = 10;
                                    jSONObject2.put(riw.m181611a(bArr2), -1);
                                }
                            } catch (Throwable unused2) {
                                b = b5;
                            }
                            int i2 = i;
                            Iterator<UserHandle> it2 = it;
                            try {
                                long userCreationTime = userManager.getUserCreationTime(next);
                                byte[] bArr3 = new byte[7];
                                bArr3[0] = 83;
                                bArr3[1] = 20;
                                bArr3[c2] = b7;
                                bArr3[b8] = 86;
                                bArr3[4] = b6;
                                bArr3[5] = b8;
                                bArr3[i2] = b7;
                                jSONObject2.put(riw.m181611a(bArr3), userCreationTime);
                            } catch (Throwable unused3) {
                                byte[] bArr4 = new byte[7];
                                bArr4[0] = 83;
                                bArr4[1] = 20;
                                bArr4[c2] = b7;
                                bArr4[b8] = 86;
                                bArr4[4] = b6;
                                bArr4[5] = b8;
                                bArr4[i2] = b7;
                                jSONObject2.put(riw.m181611a(bArr4), -1);
                            }
                            jSONArray.put(jSONObject2);
                            i = i2;
                            b2 = b6;
                            b3 = b7;
                            c = c2;
                            b4 = b8;
                            it = it2;
                            b5 = b;
                        }
                    }
                    byte[] bArr5 = new byte[8];
                    bArr5[0] = 64;
                    bArr5[1] = 20;
                    bArr5[c] = 94;
                    bArr5[b4] = 81;
                    bArr5[4] = 8;
                    bArr5[5] = 10;
                    bArr5[i] = 85;
                    bArr5[7] = b2;
                    jSONObject.put(riw.m181611a(bArr5), jSONArray);
                }
            } catch (Throwable unused4) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: n */
    public static String m165461n() {
        StringBuilder sb = new StringBuilder();
        try {
            MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray(riw.m181611a(new byte[]{84, 3, 71, 94, 2, 3, 101, 8, 88, 70, 20, 3, 121, 2}));
            if (propertyByteArray != null) {
                sb.append(xhw.m211080a(propertyByteArray));
            }
            mediaDrm.release();
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m165462o() {
        String str = f144524i;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        synchronized (f144525j) {
            try {
                String str2 = f144524i;
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC19000a());
                try {
                    String str3 = (String) futureSubmit.get(1000L, TimeUnit.MILLISECONDS);
                    if (str3 != null && !str3.isEmpty() && !str3.equals(f144519d)) {
                        f144524i = str3;
                    }
                    futureSubmit.cancel(true);
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                    return str3;
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    futureSubmit.cancel(true);
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                    return "";
                } catch (Throwable th) {
                    futureSubmit.cancel(true);
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: p */
    public static String m165463p(Context context) {
        if (or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) && Build.VERSION.SDK_INT < 29) {
            try {
                String deviceId = ((TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}))).getDeviceId();
                return deviceId == null ? f144517b : deviceId;
            } catch (Exception e) {
                kmw.m150491a(e);
            }
        }
        return f144517b;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: q */
    public static String m165464q(Context context) {
        if (or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) && Build.VERSION.SDK_INT < 29) {
            try {
                String subscriberId = ((TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}))).getSubscriberId();
                return subscriberId == null ? f144517b : subscriberId;
            } catch (Exception e) {
                kmw.m150491a(e);
            }
        }
        return f144517b;
    }

    /* JADX INFO: renamed from: r */
    public static List<JSONObject> m165465r() {
        ArrayList arrayList = new ArrayList();
        for (int i : InputDevice.getDeviceIds()) {
            try {
                JSONObject jSONObject = new JSONObject();
                InputDevice device = InputDevice.getDevice(i);
                jSONObject.put(riw.m181611a(new byte[]{94, 7, 92, 82}), device.getName());
                jSONObject.put(riw.m181611a(new byte[]{89, 2}), device.getId());
                if (Build.VERSION.SDK_INT >= 29) {
                    jSONObject.put(riw.m181611a(new byte[]{89, 21, 116, 79, 21, 3, 66, 8, 80, 91}), device.isExternal() ? 1 : 0);
                } else {
                    jSONObject.put(riw.m181611a(new byte[]{89, 21, 116, 79, 21, 3, 66, 8, 80, 91}), -1);
                }
                jSONObject.put(riw.m181611a(new byte[]{89, 21, 103, 94, 19, 18, 69, 7, 93}), device.isVirtual() ? 1 : 0);
                arrayList.add(jSONObject);
            } catch (Exception e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), e.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static JSONObject m165466s(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            jSONObject.put(riw.m181611a(new byte[]{86, 15, 67, 68, 21, 47, 94, 21, 69, 86, HttpTokens.CARRIAGE_RETURN, 10, 100, 15, 92, 82}), j);
            jSONObject.put(riw.m181611a(new byte[]{92, 7, 66, 67, 52, 22, 84, 7, 69, 82, 53, 15, 93, 3}), j2);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: t */
    public static List<JSONObject> m165467t(Context context) {
        List<JSONObject> list = f144522g;
        if (list != null && !list.isEmpty()) {
            return new ArrayList(list);
        }
        synchronized (f144523h) {
            try {
                List<JSONObject> list2 = f144522g;
                if (list2 != null && !list2.isEmpty()) {
                    return new ArrayList(list2);
                }
                ArrayList arrayList = new ArrayList();
                try {
                    for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(128)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(riw.m181611a(new byte[]{81, 22, 65, 104, 15, 7, 93, 3}), packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
                        jSONObject.put(riw.m181611a(new byte[]{64, 7, 82, 92, 0, 1, 85, 40, 80, 90, 4}), packageInfo.packageName);
                        jSONObject.put(riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 40, 80, 90, 4}), packageInfo.versionName);
                        jSONObject.put(riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 37, 94, 83, 4}), packageInfo.versionCode);
                        jSONObject.put(riw.m181611a(new byte[]{86, 15, 67, 68, 21, 47, 94, 21, 69, 86, HttpTokens.CARRIAGE_RETURN, 10, 100, 15, 92, 82}), packageInfo.firstInstallTime);
                        jSONObject.put(riw.m181611a(new byte[]{92, 7, 66, 67, 52, 22, 84, 7, 69, 82, 53, 15, 93, 3}), packageInfo.lastUpdateTime);
                        jSONObject.put(riw.m181611a(new byte[]{67, 9, 68, 69, 2, 3, 116, 15, 67}), packageInfo.applicationInfo.sourceDir);
                        jSONObject.put(riw.m181611a(new byte[]{84, 7, 69, 86, 37, 15, 66}), packageInfo.applicationInfo.dataDir);
                        jSONObject.put(riw.m181611a(new byte[]{69, 15, 85}), packageInfo.applicationInfo.uid);
                        if ((packageInfo.applicationInfo.flags & MMConstants.ERR_WATERMARK_READ) != 0) {
                            jSONObject.put(riw.m181611a(new byte[]{68, 14, 88, 69, 5, 39, 64, 22}), 0);
                        } else {
                            jSONObject.put(riw.m181611a(new byte[]{68, 14, 88, 69, 5, 39, 64, 22}), 1);
                        }
                        arrayList.add(jSONObject);
                    }
                    if (!arrayList.isEmpty()) {
                        f144522g = arrayList;
                    }
                } catch (JSONException unused) {
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static JSONObject m165468u() {
        JSONObject jSONObject = new JSONObject();
        String strM181611a = riw.m181611a(new byte[]{90, 7, 71, 86, 62});
        try {
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{86, 15, 95, 80, 4, 20, 64, 20, 88, 89, 21}), Build.FINGERPRINT);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{82, 20, 80, 89, 5}), Build.BRAND);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{94, 7, 92, 82}), Build.PRODUCT);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{84, 3, 71, 94, 2, 3}), Build.DEVICE);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 67, 82, HttpTokens.CARRIAGE_RETURN, 3, 81, 21, 84}), Build.VERSION.RELEASE);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{82, 19, 88, 91, 5, 57, 89, 2}), Build.ID);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94, 57, 88, 89, 2, 20, 85, 11, 84, 89, 21, 7, 92}), Build.VERSION.INCREMENTAL);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{68, 31, 65, 82}), Build.TYPE);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{68, 7, 86, 68}), Build.TAGS);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{69, 21, 84, 69}), Build.USER);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{84, 7, 69, 82}), Build.TIME);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{93, 7, 95, 66, 7, 7, 83, 18, 68, 69, 4, 20}), Build.MANUFACTURER);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN}), Build.MODEL);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{67, 2, 90}), Build.VERSION.SDK_INT);
            jSONObject.put(strM181611a + riw.m181611a(new byte[]{81, 4, 88, 91, 8, 21, 68}), TextUtils.join(riw.m181611a(new byte[]{28}), Build.SUPPORTED_ABIS));
            return jSONObject;
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    private static InetAddress m165469v() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress inetAddress = null;
            do {
                try {
                    if (!networkInterfaces.hasMoreElements()) {
                        break;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        try {
                            if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.getHostAddress().indexOf(riw.m181611a(new byte[]{10})) == -1) {
                                inetAddress = inetAddressNextElement;
                                break;
                            }
                            inetAddress = null;
                        } catch (Exception unused) {
                            return inetAddressNextElement;
                        }
                    }
                } catch (Exception unused2) {
                    return inetAddress;
                }
            } while (inetAddress == null);
            return inetAddress;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m165470w(Context context) {
        String strM165471x = m165471x(context);
        String strM165472y = m165472y();
        String str = f144516a;
        if (strM165471x.equals(str) && strM165472y.equals(str)) {
            String strM165454g = m165454g();
            if (!strM165454g.equals(str)) {
                return strM165454g;
            }
        } else {
            Object obj = f144518c;
            if (!strM165471x.equals(obj) || !strM165472y.equals(obj)) {
                return ((m165451d(strM165471x) || m165451d(strM165472y) || strM165471x.equals(strM165472y)) && !m165451d(strM165471x) && m165451d(strM165472y)) ? strM165471x : strM165472y;
            }
            String strM165454g2 = m165454g();
            if (!strM165454g2.equals(obj)) {
                return strM165454g2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    private static String m165471x(Context context) {
        String string = f144516a;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                if (hardwareAddress != null && hardwareAddress.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format(riw.m181611a(new byte[]{21, 86, 3, 79, 91}), Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    if (networkInterfaceNextElement.getName().equals(riw.m181611a(new byte[]{71, 10, 80, 89, 81}))) {
                        string = sb.toString();
                        break;
                    }
                }
            }
            if (!string.equals(riw.m181611a(new byte[]{0, 84, 11, 7, 81, 92, 0, 86, 11, 7, 81, 92, 0, 86, 11, 7, 81})) && !string.equals(riw.m181611a(new byte[]{0, 86, 11, 7, 81, 92, 0, 86, 11, 7, 81, 92, 0, 86, 11, 7, 81}))) {
                return string;
            }
            return f144516a;
        } catch (Exception unused) {
            return f144518c;
        }
    }

    /* JADX INFO: renamed from: y */
    private static String m165472y() {
        try {
            byte[] hardwareAddress = NetworkInterface.getByInetAddress(m165469v()).getHardwareAddress();
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            for (int i2 = 0; i2 < hardwareAddress.length; i2++) {
                if (i2 != 0) {
                    stringBuffer.append(':');
                    i++;
                }
                String hexString = Integer.toHexString(hardwareAddress[i2] & 255);
                if (hexString.length() == 1) {
                    hexString = 0 + hexString;
                }
                stringBuffer.append(hexString);
            }
            return i != 0 ? stringBuffer.toString().toUpperCase(Locale.ROOT) : f144516a;
        } catch (Exception unused) {
            return f144518c;
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m165473z(Context context, String str) {
        String str2 = f144526k;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        synchronized (f144527l) {
            try {
                String str3 = f144526k;
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC19001b(context, str));
                try {
                    try {
                        String str4 = (String) futureSubmit.get(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
                        if (str4 != null && !str4.isEmpty()) {
                            f144526k = str4;
                        }
                        futureSubmit.cancel(true);
                        executorServiceNewSingleThreadExecutor.shutdownNow();
                        return str4;
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        f144526k = null;
                        futureSubmit.cancel(true);
                        executorServiceNewSingleThreadExecutor.shutdownNow();
                        return "";
                    }
                } catch (Throwable th) {
                    futureSubmit.cancel(true);
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
