package p149l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.LocalServerSocket;
import android.net.TrafficStats;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.hdata.android.Coded;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class xd5 {

    /* JADX INFO: renamed from: k */
    private static volatile LocalServerSocket f192304k;

    /* JADX INFO: renamed from: a */
    private static final String f192294a = sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3});

    /* JADX INFO: renamed from: b */
    private static volatile String f192295b = null;

    /* JADX INFO: renamed from: c */
    private static final Object f192296c = new Object();

    /* JADX INFO: renamed from: d */
    private static final FileFilter f192297d = new FileFilter() { // from class: l.wd5
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches(sgw.m184137a(new byte[]{83, 22, 68, 108, 81, 75, 9, HttpTokens.SEMI_COLON, 26}), file.getName());
        }
    };

    /* JADX INFO: renamed from: e */
    private static boolean f192298e = true;

    /* JADX INFO: renamed from: f */
    private static double f192299f = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: g */
    private static double f192300g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: h */
    private static final String[] f192301h = {sgw.m184137a(new byte[]{88, 31, 65, 82, 19, Tnaf.POW_2_WIDTH, 89, 21, 94, 69}), sgw.m184137a(new byte[]{65, 3, 92, 66}), sgw.m184137a(new byte[]{70, 4, 94, 79}), sgw.m184137a(new byte[]{70, 15, 67, 67, 8, 9}), sgw.m184137a(new byte[]{91, Tnaf.POW_2_WIDTH, 92})};

    /* JADX INFO: renamed from: i */
    private static final String[] f192302i = {sgw.m184137a(new byte[]{88, 31, 65, 82, 19, Tnaf.POW_2_WIDTH, 89, 21, 94, 69}), sgw.m184137a(new byte[]{65, 3, 92, 66}), sgw.m184137a(new byte[]{70, 4, 94, 79}), sgw.m184137a(new byte[]{70, 15, 67, 67, 8, 9})};

    /* JADX INFO: renamed from: j */
    private static final Pattern f192303j = Pattern.compile(sgw.m184137a(new byte[]{108, 2, 26, HttpTokens.CARRIAGE_RETURN, 61, 21, 26, HttpTokens.COLON, 70, 76, 89, 27, 10, 78, 106, 7, 76, 95, 113, 75, 107, 86, 76, 28, 109, 77, 24, 107, 18, 76}));

    /* JADX INFO: renamed from: l */
    public static final String[] f192305l = {sgw.m184137a(new byte[]{66, 3, 80, 83}), sgw.m184137a(new byte[]{71, 20, 88, 67, 4}), sgw.m184137a(new byte[]{95, 22, 84, 89}), sgw.m184137a(new byte[]{86, 9, 65, 82, 15}), sgw.m184137a(new byte[]{67, 18, 80, 67}), sgw.m184137a(new byte[]{92, 21, 69, 86, 21}), sgw.m184137a(new byte[]{81, 5, 82, 82, 18, 21}), sgw.m184137a(new byte[]{92, 15, 95, 92}), sgw.m184137a(new byte[]{66, 3, 80, 83, HttpTokens.CARRIAGE_RETURN, 15, 94, HttpTokens.CARRIAGE_RETURN}), sgw.m184137a(new byte[]{67, 3, 95, 83}), sgw.m184137a(new byte[]{66, 3, 82, 65}), sgw.m184137a(new byte[]{67, 3, 95, 83, 21, 9}), sgw.m184137a(new byte[]{66, 3, 82, 65, 7, 20, 95, 11}), sgw.m184137a(new byte[]{67, 18, 67, 68, 21, 20}), sgw.m184137a(new byte[]{67, 18, 67, 84, 12, 22}), sgw.m184137a(new byte[]{67, 18, 67, 89, 2, 11, 64}), sgw.m184137a(new byte[]{67, 18, 67, 84, 0, 18}), sgw.m184137a(new byte[]{64, 18, 67, 86, 2, 3}), sgw.m184137a(new byte[]{86, 9, 67, 92}), sgw.m184137a(new byte[]{85, 30, 84, 84, 23, 3}), sgw.m184137a(new byte[]{91, 15, 93, 91}), sgw.m184137a(new byte[]{111, 57, 66, 78, 18, 18, 85, 11, 110, 71, 19, 9, 64, 3, 67, 67, 24, 57, 87, 3, 69})};

    /* JADX INFO: renamed from: l.xd5$b */
    public static class C21088b {

        /* JADX INFO: renamed from: a */
        public String f192306a = "";

        /* JADX INFO: renamed from: b */
        public String f192307b = "";

        /* JADX INFO: renamed from: c */
        public String f192308c = "";

        /* JADX INFO: renamed from: d */
        public String f192309d = "";

        /* JADX INFO: renamed from: e */
        public String f192310e = "";

        /* JADX INFO: renamed from: f */
        public String f192311f = "";

        /* JADX INFO: renamed from: g */
        public String f192312g = "";

        /* JADX INFO: renamed from: a */
        public JSONObject m208265a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{69, 15, 85}), this.f192307b);
                jSONObject.put(sgw.m184137a(new byte[]{64, 15, 85}), this.f192306a);
                jSONObject.put(sgw.m184137a(new byte[]{64, 7, 82, 92, 15, 7, 93, 3}), this.f192308c);
                jSONObject.put(sgw.m184137a(new byte[]{81, 22, 65, 89, 0, 11, 85}), this.f192309d);
                jSONObject.put(sgw.m184137a(new byte[]{81, 22, 65, 65, 4, 20}), this.f192310e);
                jSONObject.put(sgw.m184137a(new byte[]{64, 20, 94, 84, 4, 21, 67}), this.f192311f);
                jSONObject.put(sgw.m184137a(new byte[]{86, 15, 93, 82, 18, 2, 89, 20}), this.f192312g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 83, 20, 84, 86, 21, 15, 94, 1, 17, 118, 17, 22, 121, 8, 87, 88, 65, 44, 99, 41, 127, HttpTokens.CARRIAGE_RETURN, 65}) + e.getMessage());
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$c */
    public static class C21089c {

        /* JADX INFO: renamed from: a */
        String f192313a;

        /* JADX INFO: renamed from: b */
        float f192314b;

        /* JADX INFO: renamed from: c */
        int f192315c;

        /* JADX INFO: renamed from: d */
        float f192316d;

        /* JADX INFO: renamed from: e */
        String f192317e;

        /* JADX INFO: renamed from: f */
        String f192318f;

        /* JADX INFO: renamed from: g */
        int f192319g;

        private C21089c() {
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208266a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{93, 9, 85, 82}), this.f192318f);
                jSONObject.put(sgw.m184137a(new byte[]{66, 7, 69, 94, 14}), this.f192314b);
                jSONObject.put(sgw.m184137a(new byte[]{67, 18, 80, 67, 20, 21}), this.f192317e);
                jSONObject.put(sgw.m184137a(new byte[]{82, 7, 69, 67, 4, 20, 73, 48}), this.f192315c);
                jSONObject.put(sgw.m184137a(new byte[]{82, 7, 69, 67, 4, 20, 73, 50}), this.f192316d);
                jSONObject.put(sgw.m184137a(new byte[]{83, 7, 65, 86, 2, 15, 68, 31}), this.f192313a);
                jSONObject.put(sgw.m184137a(new byte[]{83, 31, 82, 91, 4, 37, 95, 19, 95, 67}), this.f192319g);
                return jSONObject;
            } catch (Exception e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 114, 7, 69, 67, 4, 20, 73, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$d */
    public static class C21090d {

        /* JADX INFO: renamed from: a */
        int f192320a;

        /* JADX INFO: renamed from: b */
        int f192321b;

        /* JADX INFO: renamed from: c */
        int f192322c;

        /* JADX INFO: renamed from: d */
        int f192323d;

        /* JADX INFO: renamed from: e */
        int f192324e;

        /* JADX INFO: renamed from: f */
        int f192325f;

        private C21090d() {
            this.f192320a = 0;
            this.f192321b = 0;
            this.f192322c = 0;
            this.f192323d = 0;
            this.f192324e = 0;
            this.f192325f = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208267a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 88, 83}), this.f192320a);
                jSONObject.put(sgw.m184137a(new byte[]{67, 31, 66, 67, 4, 11, 111, 15, 85}), this.f192321b);
                jSONObject.put(sgw.m184137a(new byte[]{82, 7, 66, 82, 18, 18, 81, 18, 88, 88, 15, 57, 89, 2}), this.f192322c);
                jSONObject.put(sgw.m184137a(new byte[]{92, 7, 69, 94, 21, 19, 84, 3}), this.f192323d);
                jSONObject.put(sgw.m184137a(new byte[]{92, 9, 95, 80, 8, 18, 69, 2, 84}), this.f192324e);
                jSONObject.put(sgw.m184137a(new byte[]{84, 4, 92}), this.f192325f);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 115, 34, 124, 118, 34, 3, 92, 10, 120, 89, 7, 9, Tnaf.POW_2_WIDTH, 18, 94, 125, 18, 9, 94, 92, 17}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$e */
    public static class C21091e {

        /* JADX INFO: renamed from: a */
        int f192326a;

        /* JADX INFO: renamed from: b */
        int f192327b;

        /* JADX INFO: renamed from: c */
        float f192328c;

        /* JADX INFO: renamed from: d */
        int f192329d;

        /* JADX INFO: renamed from: e */
        Range<Integer> f192330e;

        /* JADX INFO: renamed from: f */
        int f192331f;

        /* JADX INFO: renamed from: g */
        int f192332g;

        /* JADX INFO: renamed from: h */
        SizeF f192333h;

        private C21091e() {
            this.f192326a = 0;
            this.f192327b = -1;
            this.f192329d = -1;
            this.f192330e = null;
            this.f192331f = -1;
            this.f192332g = -1;
            this.f192333h = null;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208268a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{86, 7, 82, 82}), this.f192326a);
                jSONObject.put(sgw.m184137a(new byte[]{64, 15, 73, 82, HttpTokens.CARRIAGE_RETURN, 21}), this.f192327b);
                jSONObject.put(sgw.m184137a(new byte[]{86, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 21}), this.f192328c);
                jSONObject.put(sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), this.f192329d);
                if (this.f192330e != null) {
                    jSONObject.put(sgw.m184137a(new byte[]{83, 9, 92, 71, 4, 8, 67, 7, 69, 94, 14, 8}), new JSONArray((Collection) Arrays.asList((Integer) this.f192330e.getLower(), (Integer) this.f192330e.getUpper())));
                }
                jSONObject.put(sgw.m184137a(new byte[]{81, 3, 99, 82, 6, 15, 95, 8, 66}), this.f192331f);
                jSONObject.put(sgw.m184137a(new byte[]{81, 0, 99, 82, 6, 15, 95, 8, 66}), this.f192332g);
                if (this.f192333h != null) {
                    jSONObject.put(sgw.m184137a(new byte[]{64, 14, 72, 68, 8, 5, 81, 10, 98, 94, 27, 3}), new JSONArray((Collection) Arrays.asList(Float.valueOf(this.f192333h.getWidth()), Float.valueOf(this.f192333h.getHeight()))));
                }
                return jSONObject;
            } catch (Exception e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 115, 7, 92, 82, 19, 7, 116, 3, 69, 86, 8, 10, Tnaf.POW_2_WIDTH, 18, 94, 125, 18, 9, 94, 92, 17}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$f */
    public static class C21092f implements Comparator<Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    /* JADX INFO: renamed from: l.xd5$g */
    public static class C21093g {

        /* JADX INFO: renamed from: a */
        int f192334a;

        /* JADX INFO: renamed from: b */
        int f192335b;

        /* JADX INFO: renamed from: c */
        int f192336c;

        /* JADX INFO: renamed from: d */
        int f192337d;

        /* JADX INFO: renamed from: e */
        int f192338e;

        /* JADX INFO: renamed from: f */
        int f192339f;

        /* JADX INFO: renamed from: g */
        int f192340g;

        /* JADX INFO: renamed from: h */
        int f192341h;

        private C21093g() {
            this.f192334a = 0;
            this.f192335b = 0;
            this.f192336c = 0;
            this.f192337d = 0;
            this.f192338e = 0;
            this.f192339f = 0;
            this.f192340g = 0;
            this.f192341h = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208270a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{66, 21, 66, 94}), this.f192341h);
                jSONObject.put(sgw.m184137a(new byte[]{93, 8, 82}), this.f192334a);
                jSONObject.put(sgw.m184137a(new byte[]{82, 21, 88, 84}), this.f192340g);
                jSONObject.put(sgw.m184137a(new byte[]{93, 5, 82}), this.f192335b);
                jSONObject.put(sgw.m184137a(new byte[]{81, 20, 87, 84, 15}), this.f192338e);
                jSONObject.put(sgw.m184137a(new byte[]{84, 4, 92}), this.f192339f);
                jSONObject.put(sgw.m184137a(new byte[]{92, 7, 82}), this.f192336c);
                jSONObject.put(sgw.m184137a(new byte[]{83, 15, 85}), this.f192337d);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 119, 53, 124, 116, 4, 10, 92, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$h */
    public static class C21094h {

        /* JADX INFO: renamed from: a */
        int f192342a;

        /* JADX INFO: renamed from: b */
        int f192343b;

        /* JADX INFO: renamed from: c */
        int f192344c;

        /* JADX INFO: renamed from: d */
        int f192345d;

        /* JADX INFO: renamed from: e */
        int f192346e;

        /* JADX INFO: renamed from: f */
        int f192347f;

        /* JADX INFO: renamed from: g */
        int f192348g;

        private C21094h() {
            this.f192342a = 0;
            this.f192343b = 0;
            this.f192344c = 0;
            this.f192345d = 0;
            this.f192346e = 0;
            this.f192347f = 0;
            this.f192348g = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208271a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{93, 8, 82}), this.f192342a);
                jSONObject.put(sgw.m184137a(new byte[]{93, 5, 82}), this.f192343b);
                jSONObject.put(sgw.m184137a(new byte[]{68, 7, 82}), this.f192344c);
                jSONObject.put(sgw.m184137a(new byte[]{83, 15}), this.f192345d);
                jSONObject.put(sgw.m184137a(new byte[]{85, 7, 67, 81, 2, 8}), this.f192346e);
                jSONObject.put(sgw.m184137a(new byte[]{64, 5, 88}), this.f192347f);
                jSONObject.put(sgw.m184137a(new byte[]{84, 4, 92}), this.f192348g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 124, 50, 116, 116, 4, 10, 92, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$i */
    public static class C21095i {

        /* JADX INFO: renamed from: a */
        public int f192349a;

        /* JADX INFO: renamed from: b */
        public int f192350b = -1;

        /* JADX INFO: renamed from: c */
        public String f192351c = "";

        /* JADX INFO: renamed from: d */
        public String f192352d = "";

        /* JADX INFO: renamed from: e */
        public CharSequence f192353e = "";

        /* JADX INFO: renamed from: f */
        public String f192354f = "";

        /* JADX INFO: renamed from: a */
        public JSONObject m208272a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{67, 10, 94, 67}), this.f192350b);
                jSONObject.put(sgw.m184137a(new byte[]{89, 5, 82, 94, 5}), this.f192353e);
                jSONObject.put(sgw.m184137a(new byte[]{89, 11, 66, 94}), this.f192351c);
                jSONObject.put(sgw.m184137a(new byte[]{83, 7, 67, 69, 8, 3, 66}), this.f192352d);
                jSONObject.put(sgw.m184137a(new byte[]{83, 9, 68, 89, 21, 20, 73}), this.f192354f);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 2, 20, 85, 7, 69, 82, 65, 53, 89, 11, 117, 82, 21, 7, 89, 10, 17, 125, 50, 41, 126, 70, 126, 85, 11, 3, 83, 18}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xd5$j */
    public static class C21096j {

        /* JADX INFO: renamed from: a */
        int f192355a;

        /* JADX INFO: renamed from: b */
        int f192356b;

        /* JADX INFO: renamed from: c */
        int f192357c;

        /* JADX INFO: renamed from: d */
        int f192358d;

        /* JADX INFO: renamed from: e */
        int f192359e;

        /* JADX INFO: renamed from: f */
        int f192360f;

        /* JADX INFO: renamed from: g */
        int f192361g;

        private C21096j() {
            this.f192355a = 0;
            this.f192356b = 0;
            this.f192357c = 0;
            this.f192358d = 0;
            this.f192359e = 0;
            this.f192360f = 0;
            this.f192361g = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m208273a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{93, 8, 82}), this.f192355a);
                jSONObject.put(sgw.m184137a(new byte[]{93, 5, 82}), this.f192356b);
                jSONObject.put(sgw.m184137a(new byte[]{92, 7, 82}), this.f192357c);
                jSONObject.put(sgw.m184137a(new byte[]{83, 15, 85}), this.f192358d);
                jSONObject.put(sgw.m184137a(new byte[]{64, 21, 82}), this.f192359e);
                jSONObject.put(sgw.m184137a(new byte[]{69, 7, 67, 81, 2, 8}), this.f192360f);
                jSONObject.put(sgw.m184137a(new byte[]{84, 4, 92}), this.f192361g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(sgw.m184137a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 103, 37, 117, 122, HttpTokens.SPACE, 37, 85, 10, 93, 126, 15, 0, 95, 70, 69, 88, 43, 21, 95, 8, 11, 23}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m208174A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return sgw.m184137a(new byte[]{126, 73, 112});
        }
        if (packageManager.hasSystemFeature(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14, 110, 91, 4}))) {
            return sgw.m184137a(new byte[]{4, 77});
        }
        return packageManager.hasSystemFeature(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14})) ? sgw.m184137a(new byte[]{2, 72, 73, 24, 82, 72, 72}) : sgw.m184137a(new byte[]{126, 73, 112});
    }

    /* JADX INFO: renamed from: A0 */
    public static Boolean m208175A0(Context context) {
        return Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), sgw.m184137a(new byte[]{93, 9, 82, 92, 62, 10, 95, 5, 80, 67, 8, 9, 94}), 0) != 0);
    }

    /* JADX INFO: renamed from: B */
    public static long m208176B() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: B0 */
    private static boolean m208177B0(String str) {
        return str != null && str.matches(sgw.m184137a(new byte[]{108, 2, 26}));
    }

    /* JADX INFO: renamed from: C */
    public static int m208178C(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), sgw.m184137a(new byte[]{67, 5, 67, 82, 4, 8, 111, 4, 67, 94, 6, 14, 68, 8, 84, 68, 18}));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m208179C0(Context context, String str) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            packageManager.getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Map<String, String> m208180D() {
        Object obj;
        HashMap map = new HashMap();
        try {
            for (Field field : Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 36, 69, 15, 93, 83})).getDeclaredFields()) {
                field.setAccessible(true);
                String lowerCase = field.getName().toLowerCase(Locale.ROOT);
                if (sgw.m184137a(new byte[]{88, 9, 66, 67, 77, 70, 69, 21, 84, 69, 77, 70, 82, 9, 80, 69, 5, 74, Tnaf.POW_2_WIDTH, 2, 84, 65, 8, 5, 85, 74, 17, 95, 0, 20, 84, 17, 80, 69, 4, 74, Tnaf.POW_2_WIDTH, 11, 94, 83, 4, 10, 28, 70, 66, 82, 19, 15, 81, 10, 29, 23, 3, 7, 94, 2, 29, 23, 3, 20, 81, 8, 85, 27, 65, 2, 89, 21, 65, 91, 0, 31, 28, 70, 92, 86, 15, 19, 86, 7, 82, 67, 20, 20, 85, 20, 29, 23, 17, 20, 95, 2, 68, 84, 21, 74, Tnaf.POW_2_WIDTH, 0, 88, 89, 6, 3, 66, 22, 67, 94, 15, 18, 28, 70, 82, 71, 20, 57, 81, 4, 88, 27, 65, 5, 64, 19, 110, 86, 3, 15, 2}).contains(lowerCase) && (obj = field.get(null)) != null) {
                    map.put(lowerCase, obj.toString());
                }
            }
            map.put(sgw.m184137a(new byte[]{66, 3, 93, 82, 0, 21, 85}), Build.VERSION.RELEASE);
            map.put(sgw.m184137a(new byte[]{67, 2, 90}), String.valueOf(Build.VERSION.SDK_INT));
            return map;
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 20, 15, 92, 2, 120, 89, 7, 9, 10, 70}), e);
            return map;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m208181D0(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    /* JADX INFO: renamed from: E */
    public static int m208182E() {
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 83, 22, 68, 7, 78, 5, 64, 19, 87, 69, 4, 23, 31, 5, 65, 66, 8, 8, 86, 9, 110, 90, 0, 30, 111, 0, 67, 82, Tnaf.POW_2_WIDTH})));
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.trim().isEmpty()) {
                    i = Integer.parseInt(line.trim());
                }
                bufferedReader.close();
                return i;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | NumberFormatException e) {
            Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 7, 73, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: E0 */
    private static boolean m208183E0() {
        String str = System.getenv(sgw.m184137a(new byte[]{96, 39, 101, 127}));
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(sgw.m184137a(new byte[]{10}));
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            arrayList.add(str2 + sgw.m184137a(new byte[]{31, 21, 68}));
            arrayList.add(str2 + sgw.m184137a(new byte[]{31, 2, 80, 82, 12, 9, 94, 21, 68}));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists() && !file.isDirectory() && file.canExecute()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static int m208184F() {
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 83, 22, 68, 7, 78, 5, 64, 19, 87, 69, 4, 23, 31, 5, 65, 66, 8, 8, 86, 9, 110, 90, 8, 8, 111, 0, 67, 82, Tnaf.POW_2_WIDTH})));
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.trim().isEmpty()) {
                    i = Integer.parseInt(line.trim());
                }
                bufferedReader.close();
                return i;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | NumberFormatException e) {
            Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 15, 95, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: F0 */
    private static boolean m208185F0() {
        return new File(sgw.m184137a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 80, 71, 17, 73, 99, 19, 65, 82, 19, 19, 67, 3, 67, 25, 0, 22, 91})).exists();
    }

    /* JADX INFO: renamed from: G */
    public static int m208186G(Context context) {
        try {
            return ((CameraManager) context.getSystemService(sgw.m184137a(new byte[]{83, 7, 92, 82, 19, 7}))).getCameraIdList().length;
        } catch (Throwable th) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 81, 5, 82, 82, 18, 21, 89, 8, 86, 23, 2, 7, 93, 3, 67, 86, 91, 70}), th);
            return -1;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: G0 */
    private static synchronized void m208187G0(TelephonyManager telephonyManager, C21093g c21093g, C21090d c21090d, C21094h c21094h, C21096j c21096j) {
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        if (allCellInfo != null && !allCellInfo.isEmpty()) {
            Iterator<CellInfo> it = allCellInfo.iterator();
            while (it.hasNext()) {
                TelephonyManager telephonyManager2 = telephonyManager;
                C21093g c21093g2 = c21093g;
                C21090d c21090d2 = c21090d;
                C21094h c21094h2 = c21094h;
                C21096j c21096j2 = c21096j;
                m208189H0(telephonyManager2, it.next(), c21093g2, c21090d2, c21094h2, c21096j2);
                telephonyManager = telephonyManager2;
                c21093g = c21093g2;
                c21090d = c21090d2;
                c21094h = c21094h2;
                c21096j = c21096j2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private static List<JSONObject> m208188H(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(sgw.m184137a(new byte[]{83, 7, 92, 82, 19, 7}));
            if (cameraManager == null) {
                Log.e(f192294a, sgw.m184137a(new byte[]{115, 7, 92, 82, 19, 7, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93}));
                return arrayList;
            }
            for (String str : cameraManager.getCameraIdList()) {
                C21091e c21091e = new C21091e();
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                m208197L0(cameraCharacteristics, c21091e);
                c21091e.f192327b = m208190I(cameraCharacteristics);
                m208199M0(cameraCharacteristics, c21091e);
                c21091e.f192329d = m208218c0(cameraCharacteristics, CameraCharacteristics.SENSOR_ORIENTATION);
                c21091e.f192330e = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                c21091e.f192331f = m208218c0(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                c21091e.f192332g = m208218c0(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                c21091e.f192333h = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                arrayList.add(c21091e.m208268a());
            }
            return arrayList;
        } catch (Throwable th) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 123, 8, 21, 68, 70, 101, 95, 19, 9, 71, 7, 83, 91, 4, 92, Tnaf.POW_2_WIDTH}), th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: H0 */
    private static synchronized void m208189H0(TelephonyManager telephonyManager, CellInfo cellInfo, C21093g c21093g, C21090d c21090d, C21094h c21094h, C21096j c21096j) {
        try {
            if (telephonyManager.getPhoneType() == 0) {
                return;
            }
            if (cellInfo instanceof CellInfoGsm) {
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                c21093g.f192335b = cellIdentity.getMcc();
                int mnc = cellIdentity.getMnc();
                c21093g.f192334a = mnc;
                if (c21093g.f192335b != Integer.MAX_VALUE && mnc != Integer.MAX_VALUE) {
                    CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                    c21093g.f192336c = cellIdentity.getLac();
                    c21093g.f192337d = cellIdentity.getCid();
                    c21093g.f192338e = cellIdentity.getArfcn();
                    c21093g.f192340g = cellIdentity.getBsic();
                    c21093g.f192339f = cellSignalStrength.getDbm();
                }
            } else if (cellInfo instanceof CellInfoCdma) {
                CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                CellSignalStrengthCdma cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                c21090d.f192320a = cellIdentity2.getNetworkId();
                c21090d.f192321b = cellIdentity2.getSystemId();
                c21090d.f192323d = cellIdentity2.getLatitude();
                c21090d.f192324e = cellIdentity2.getLongitude();
                c21090d.f192322c = cellIdentity2.getBasestationId();
                c21090d.f192325f = cellSignalStrength2.getCdmaDbm();
            } else if (cellInfo instanceof CellInfoLte) {
                if (!cellInfo.isRegistered()) {
                    return;
                }
                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                c21094h.f192342a = cellIdentity3.getMnc();
                int mcc = cellIdentity3.getMcc();
                c21094h.f192343b = mcc;
                if (c21094h.f192342a != Integer.MAX_VALUE && mcc != Integer.MAX_VALUE) {
                    CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                    c21094h.f192344c = cellIdentity3.getTac();
                    c21094h.f192345d = cellIdentity3.getCi();
                    c21094h.f192347f = cellIdentity3.getPci();
                    c21094h.f192346e = cellIdentity3.getEarfcn();
                    c21094h.f192348g = cellSignalStrength3.getDbm();
                }
            } else if (cellInfo instanceof CellInfoWcdma) {
                CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                c21096j.f192355a = cellIdentity4.getMnc();
                int mcc2 = cellIdentity4.getMcc();
                c21096j.f192356b = mcc2;
                if (c21096j.f192355a != Integer.MAX_VALUE && mcc2 != Integer.MAX_VALUE) {
                    c21096j.f192360f = cellIdentity4.getUarfcn();
                    c21096j.f192359e = cellIdentity4.getPsc();
                    c21096j.f192358d = cellIdentity4.getCid();
                    c21096j.f192357c = cellIdentity4.getLac();
                    c21096j.f192361g = cellSignalStrength4.getDbm();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    private static int m208190I(CameraCharacteristics cameraCharacteristics) {
        Size[] outputSizes;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null || outputSizes.length <= 0) {
                return 0;
            }
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), new C21092f());
            return (size.getWidth() * size.getHeight()) / 10000;
        } catch (AssertionError e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{113, 21, 66, 82, 19, 18, 89, 9, 95, 114, 19, 20, 95, 20, 17, 80, 4, 18, 115, 7, 92, 82, 19, 7, 96, 15, 73, 82, HttpTokens.CARRIAGE_RETURN, 21, 10, 70}), e);
            return 0;
        } catch (Exception e2) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 103, 8, 30, 85, 10, 66, HttpTokens.CARRIAGE_RETURN, 65}), e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: I0 */
    private static double[] m208191I0() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 67, 18, 80, 67}), sgw.m184137a(new byte[]{66}));
            try {
                String line = randomAccessFile.readLine();
                if (line == null) {
                    randomAccessFile.close();
                    return null;
                }
                String[] strArrSplit = line.split(sgw.m184137a(new byte[]{108, 21, 26}));
                double[] dArr = {Double.parseDouble(strArrSplit[5]), Double.parseDouble(strArrSplit[2]) + Double.parseDouble(strArrSplit[3]) + Double.parseDouble(strArrSplit[4]) + Double.parseDouble(strArrSplit[6]) + Double.parseDouble(strArrSplit[8]) + Double.parseDouble(strArrSplit[7])};
                randomAccessFile.close();
                return dArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 8, 8, 87, 70, 114, 103, 52, 70, 68, 15, 92, 82, 18, 92, Tnaf.POW_2_WIDTH}), e);
            return null;
        }
        Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 8, 8, 87, 70, 114, 103, 52, 70, 68, 15, 92, 82, 18, 92, Tnaf.POW_2_WIDTH}), e);
        return null;
    }

    /* JADX INFO: renamed from: J */
    private static int m208192J(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.isEmpty()) {
                    String[] strArrSplit = line.split(sgw.m184137a(new byte[]{29}));
                    if (strArrSplit.length == 2) {
                        int i = (Integer.parseInt(strArrSplit[1]) - Integer.parseInt(strArrSplit[0])) + 1;
                        bufferedReader.close();
                        return i;
                    }
                    if (strArrSplit.length == 1) {
                        int i2 = Integer.parseInt(strArrSplit[0]) + 1;
                        bufferedReader.close();
                        return i2;
                    }
                }
                bufferedReader.close();
                return -1;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | NumberFormatException e) {
            Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 14, 20, 85, 21, 119, 69, 14, 11, 118, 15, 93, 82, 91, 70}) + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: J0 */
    private static int m208193J0(String str) {
        if (!bti0.m103846b(str)) {
            return -1;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                int i = Integer.parseInt(bufferedReader.readLine().trim());
                bufferedReader.close();
                return i;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | NumberFormatException e) {
            Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 39, 15, 66, 21, 69, 123, 8, 8, 85, HttpTokens.SPACE, 67, 88, 12, 53, 73, 21, 69, 82, 12, HttpTokens.SPACE, 89, 10, 84, HttpTokens.CARRIAGE_RETURN, 65}) + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: K */
    public static String m208194K() {
        String property = System.getProperty(sgw.m184137a(new byte[]{95, 21, 31, 86, 19, 5, 88}));
        String upperCase = property != null ? property.toUpperCase(Locale.ENGLISH) : "";
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        String upperCase2 = (strArr.length > 0 ? strArr[0] : "").toUpperCase(Locale.ENGLISH);
        if (upperCase.startsWith(sgw.m184137a(new byte[]{125, 47, 97, 100}))) {
            return sgw.m184137a(new byte[]{93, 15, 65, 68});
        }
        if (upperCase.equals(sgw.m184137a(new byte[]{113, 39, 99, 116, 41, 80, 4})) || upperCase.startsWith(sgw.m184137a(new byte[]{113, 52, 124})) || upperCase2.startsWith(sgw.m184137a(new byte[]{113, 52, 124}))) {
            return sgw.m184137a(new byte[]{81, 20, 92});
        }
        return (upperCase.equals(sgw.m184137a(new byte[]{121, 80, 9, 1})) || upperCase.equals(sgw.m184137a(new byte[]{104, 94, 7, 104, 87, 82})) || upperCase2.startsWith(sgw.m184137a(new byte[]{104, 94, 7}))) ? sgw.m184137a(new byte[]{72, 94, 7}) : sgw.m184137a(new byte[]{69, 8, 90, 89, 14, 17, 94});
    }

    /* JADX INFO: renamed from: K0 */
    private static String m208195K0() {
        String strM184137a = sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 70, 3, 67, 68, 8, 9, 94});
        if (!bti0.m103846b(strM184137a)) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(strM184137a)));
            try {
                String line = bufferedReader.readLine();
                if (line == null || !line.startsWith(sgw.m184137a(new byte[]{124, 15, 95, 66, 25, 70, 70, 3, 67, 68, 8, 9, 94}))) {
                    bufferedReader.close();
                    return null;
                }
                String strSubstring = line.substring(14);
                bufferedReader.close();
                return strSubstring;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 91, 3, 67, 89, 4, 10, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8, 17, 81, 19, 9, 93, 70}) + strM184137a, e);
        }
        Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 91, 3, 67, 89, 4, 10, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8, 17, 81, 19, 9, 93, 70}) + strM184137a, e);
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static String[] m208196L() {
        String str;
        String str2 = null;
        try {
            Iterator<String> it = bti0.m103849e(sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 83, 22, 68, 94, 15, 0, 95})).iterator();
            str = null;
            while (it.hasNext()) {
                try {
                    String[] strArrSplit = it.next().split(sgw.m184137a(new byte[]{10}));
                    if (strArrSplit.length == 2) {
                        String strTrim = strArrSplit[0].trim();
                        String strTrim2 = strArrSplit[1].trim();
                        if (strTrim.equals(sgw.m184137a(new byte[]{120, 7, 67, 83, 22, 7, 66, 3})) || strTrim.equals(sgw.m184137a(new byte[]{70, 3, 95, 83, 14, 20, 111, 15, 85}))) {
                            str2 = strTrim2;
                        } else if (strTrim.equals(sgw.m184137a(new byte[]{96, 20, 94, 84, 4, 21, 67, 9, 67})) || strTrim.equals(sgw.m184137a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN, 70, 94, 7, 92, 82}))) {
                            str = strTrim2;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 121, 8, 87, 88, 91, 70}) + e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        return new String[]{str, str2};
    }

    /* JADX INFO: renamed from: L0 */
    private static void m208197L0(CameraCharacteristics cameraCharacteristics, C21091e c21091e) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            if (num.intValue() == 0) {
                c21091e.f192326a = 1;
            } else if (num.intValue() == 1) {
                c21091e.f192326a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static double m208198M() {
        double[] dArrM208191I0;
        int i = Build.VERSION.SDK_INT;
        double dMax = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (i < 26 && (dArrM208191I0 = m208191I0()) != null) {
            double d = dArrM208191I0[0];
            double d2 = dArrM208191I0[1];
            if (f192298e) {
                f192298e = false;
                f192299f = d;
                f192300g = d2;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            double d3 = f192300g;
            double d4 = (d2 + d) - (f192299f + d3);
            if (d4 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(Math.round((((d2 - d3) * 100.0d) / d4) * 100.0d) / 100.0d, 100.0d));
            }
            f192300g = d2;
            f192299f = d;
        }
        return dMax;
    }

    /* JADX INFO: renamed from: M0 */
    private static void m208199M0(CameraCharacteristics cameraCharacteristics, C21091e c21091e) {
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr != null) {
            Arrays.sort(fArr);
            c21091e.f192328c = fArr[fArr.length - 1];
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m208200N(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(sgw.m184137a(new byte[]{81, 5, 69, 94, 23, 15, 68, 31}));
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: O */
    public static String m208201O() {
        try {
            return (String) Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 80, 71, 17, 72, 113, 5, 69, 94, 23, 15, 68, 31, 101, 95, 19, 3, 81, 2})).getMethod(sgw.m184137a(new byte[]{83, 19, 67, 69, 4, 8, 68, 54, 67, 88, 2, 3, 67, 21, 127, 86, 12, 3}), null).invoke(null, null);
        } catch (Throwable th) {
            Log.e(sgw.m184137a(new byte[]{113, 22, 65, 126, 15, 0, 95}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 65, 69, 14, 5, 85, 21, 66, 23, 15, 7, 93, 3, 17, 85, 24, 70, 113, 5, 69, 94, 23, 15, 68, 31, 101, 95, 19, 3, 81, 2}), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public static String m208202P() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static Map<String, Boolean> m208203Q() {
        HashMap map = new HashMap();
        map.put(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 4, 69, 21, 30, 66, 18, 4}), Boolean.valueOf(m208262y0(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 4, 69, 21, 30, 66, 18, 4}))));
        map.put(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 8, 85, 18, 30, 64, HttpTokens.CARRIAGE_RETURN, 7, 94, 86}), Boolean.valueOf(m208262y0(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 8, 85, 18, 30, 64, HttpTokens.CARRIAGE_RETURN, 7, 94, 86}))));
        return map;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* JADX INFO: renamed from: R */
    private static String m208204R(int i, Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        try {
            return m208216b0(sgw.m184137a(new byte[]{87, 3, 69, 100, 20, 4, 67, 5, 67, 94, 3, 3, 66, 47, 85}), i, context);
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 6, 3, 68, 47, 92, 68, 8, 62, Tnaf.POW_2_WIDTH, 3, 67, 69, 14, 20, 10, 70}), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static Map<String, String> m208205S(Context context) {
        HashMap map = new HashMap();
        for (InputMethodInfo inputMethodInfo : ((InputMethodManager) context.getSystemService(sgw.m184137a(new byte[]{89, 8, 65, 66, 21, 57, 93, 3, 69, 95, 14, 2}))).getInputMethodList()) {
            map.put(bti0.m103852h(inputMethodInfo.getId()), inputMethodInfo.loadLabel(context.getPackageManager()).toString());
        }
        return map;
    }

    /* JADX INFO: renamed from: T */
    public static String m208206T() {
        String strM208195K0 = m208195K0();
        return (strM208195K0 == null || strM208195K0.isEmpty()) ? System.getProperty(sgw.m184137a(new byte[]{95, 21, 31, 65, 4, 20, 67, 15, 94, 89})) : strM208195K0;
    }

    /* JADX INFO: renamed from: U */
    public static String m208207U() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: V */
    public static String m208208V(Context context, int i) {
        try {
            if (!jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) || Build.VERSION.SDK_INT >= 29) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
            return (String) telephonyManager.getClass().getMethod(sgw.m184137a(new byte[]{87, 3, 69, 122, 4, 15, 84}), Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public static List<String> m208209W(Context context) {
        StorageManager storageManager = (StorageManager) context.getSystemService(sgw.m184137a(new byte[]{67, 18, 94, 69, 0, 1, 85}));
        ArrayList arrayList = new ArrayList();
        try {
            Method method = storageManager.getClass().getMethod(sgw.m184137a(new byte[]{87, 3, 69, 97, 14, 10, 69, 11, 84, 103, 0, 18, 88, 21}), null);
            Method method2 = storageManager.getClass().getMethod(sgw.m184137a(new byte[]{87, 3, 69, 97, 14, 10, 69, 11, 84, 100, 21, 7, 68, 3}), String.class);
            String[] strArr = (String[]) method.invoke(storageManager, null);
            if (strArr != null) {
                for (String str : strArr) {
                    if (sgw.m184137a(new byte[]{93, 9, 68, 89, 21, 3, 84}).equals((String) method2.invoke(storageManager, str))) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 47, 92, 10, 84, 80, 0, 10, Tnaf.POW_2_WIDTH, 7, 82, 84, 4, 21, 67, 92, 17}), e);
        } catch (NoSuchMethodException e2) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 43, 85, 18, 89, 88, 5, 70, 94, 9, 69, 23, 7, 9, 69, 8, 85, HttpTokens.CARRIAGE_RETURN, 65}), e2);
        } catch (InvocationTargetException e3) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 47, 94, Tnaf.POW_2_WIDTH, 94, 84, 0, 18, 89, 9, 95, 23, 21, 7, 66, 1, 84, 67, 65, 3, 72, 5, 84, 71, 21, 15, 95, 8, 11, 23}), e3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public static Map<String, String> m208210X() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (true) {
            String[] strArr = f192305l;
            if (i >= strArr.length) {
                return linkedHashMap;
            }
            try {
                linkedHashMap.put(strArr[i], Build.VERSION.SDK_INT > 28 ? new String(Coded.doCommand2(i, 1)) : new String(Coded.doCommand2(i, 0)));
            } catch (Exception e) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 121, 0, 18, 89, Tnaf.POW_2_WIDTH, 84, 113, 20, 8, 83, 47, 95, 81, 14, 92, Tnaf.POW_2_WIDTH}) + e);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static int m208211Y() {
        File[] fileArrListFiles;
        try {
            int iM208192J = m208192J(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 64, 9, 66, 68, 8, 4, 92, 3}));
            if (iM208192J == -1) {
                iM208192J = m208192J(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 64, 20, 84, 68, 4, 8, 68}));
            }
            return (iM208192J != -1 || (fileArrListFiles = new File(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73})).listFiles(f192297d)) == null) ? iM208192J : fileArrListFiles.length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static Map<String, String> m208212Z() {
        HashMap map = new HashMap();
        try {
            IBinder iBinderM140804a = lje0.m149964a().m149966c().m140804a();
            if (iBinderM140804a == null) {
                map.put(sgw.m184137a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 115, 94, 15, 2, 85, 20}), "");
                return map;
            }
            map.put(sgw.m184137a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 115, 94, 15, 2, 85, 20}), iBinderM140804a.getClass().getName());
            Class<?>[] interfaces = iBinderM140804a.getClass().getInterfaces();
            if (interfaces.length > 0) {
                map.put(sgw.m184137a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 95, 67, 4, 20, 86, 7, 82, 82}), interfaces[0].getName());
            } else {
                map.put(sgw.m184137a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 95, 67, 4, 20, 86, 7, 82, 82}), "");
            }
            ClassLoader classLoader = iBinderM140804a.getClass().getClassLoader();
            map.put(sgw.m184137a(new byte[]{92, 9, 80, 83, 4, 20}), classLoader != null ? classLoader.toString() : "");
            return map;
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 103, 9, 9, 94, 3, 124, 86, 15, 7, 87, 3, 67, 126, 15, 0, 95, 92, 17}) + e);
            return map;
        }
    }

    /* JADX INFO: renamed from: a0 */
    private static String m208214a0(int i) {
        if (i == 1) {
            return sgw.m184137a(new byte[]{81, 5});
        }
        if (i != 2) {
            return i != 4 ? sgw.m184137a(new byte[]{94, 9, 95, 82}) : sgw.m184137a(new byte[]{71, 15, 67, 82, HttpTokens.CARRIAGE_RETURN, 3, 67, 21});
        }
        return sgw.m184137a(new byte[]{69, 21, 83});
    }

    /* JADX INFO: renamed from: b */
    public static boolean m208215b(Context context) {
        String packageName = context.getPackageName();
        if (f192304k != null) {
            return false;
        }
        try {
            f192304k = new LocalServerSocket(packageName);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private static String m208216b0(String str, int i, Context context) {
        String string = null;
        try {
            Object objInvoke = TelephonyManager.class.getMethod(str, Integer.TYPE).invoke((TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4})), Integer.valueOf(i));
            if (objInvoke != null) {
                string = objInvoke.toString();
            }
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 52, 84, 81, HttpTokens.CARRIAGE_RETURN, 3, 72, 43, 84, 67, 9, 9, 84, 49, 88, 67, 9, 47, 84}), e);
        }
        return string != null ? string : "";
    }

    /* JADX INFO: renamed from: c */
    public static boolean m208217c(Context context) {
        return m208185F0() || m208250s0(context) || m208183E0();
    }

    /* JADX INFO: renamed from: c0 */
    private static int m208218c0(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<Integer> key) {
        Integer num = (Integer) cameraCharacteristics.get(key);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m208219d(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 2, 90, 65, 4, 20, 67, 15, 94, 89}), ygw.m214776b());
            } catch (Exception e) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 23, 50, 34, 123, 70, 71, 82, 19, 21, 89, 9, 95, HttpTokens.CARRIAGE_RETURN, 65}), e);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{95, 21, 110, 65, 4, 20, 67, 15, 94, 89}), Build.VERSION.RELEASE);
            } catch (Exception e2) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 23, 35, 19, 89, 10, 85, 25, 55, 35, 98, 53, 120, 120, 47, 72, 98, 35, 125, 114, HttpTokens.SPACE, 53, 117, 92, 17}), e2);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{93, 3, 88, 83}), m208208V(context, 0));
            } catch (Exception e3) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 4, 15, 84, 92, 17}), e3);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{68, 15, 92, 82, 62, 28, 95, 8, 84}), m208236l0());
            } catch (Exception e4) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 8, 11, 85, 60, 94, 89, 4, 92, Tnaf.POW_2_WIDTH}), e4);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), Long.valueOf(m208176B()));
            } catch (Exception e5) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 14, 9, 68, 50, 88, 90, 4, 92, Tnaf.POW_2_WIDTH}), e5);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{82, 20, 88, 80, 9, 18, 94, 3, 66, 68}), Integer.valueOf(m208178C(context)));
            } catch (Exception e6) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 19, 15, 87, 14, 69, 89, 4, 21, 67, 92, 17}), e6);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{82, 7, 69, 67, 4, 20, 73}), m208257w(context));
            } catch (Exception e7) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 40, 8, 86, 9, 11, 23}), e7);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{69, 21, 84, 69, 62, 7, 87, 3, 95, 67}), m208244p0(context));
            } catch (Exception e8) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 98, 18, 3, 66, 39, 86, 82, 15, 18, 10, 70}), e8);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{94, 3, 69, 104, 21, 20, 81, 0, 87, 94, 2}), m208240n0());
            } catch (Exception e9) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 19, 7, 86, 0, 88, 84, 18, 43, 81, 22, 11, 23}), e9);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{93, 9, 82, 92, 62, 10, 95, 5, 80, 67, 8, 9, 94}), m208175A0(context));
            } catch (Exception e10) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 124, 88, 2, HttpTokens.CARRIAGE_RETURN, 124, 9, 82, 86, 21, 15, 95, 8, 116, 89, 0, 4, 92, 3, 85, HttpTokens.CARRIAGE_RETURN, 65}), e10);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 2, 9, 69, 8, 69}), Integer.valueOf(m208211Y()));
            } catch (Exception e11) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 121, 20, 11, 82, 3, 67, 120, 7, 37, 96, 51, 114, 88, 19, 3, 67, 92, 17}), e11);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 12, 7, 72, 57, 87, 69, 4, 23}), Integer.valueOf(m208182E()));
            } catch (Exception e12) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 7, 73, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e12);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 12, 15, 94, 57, 87, 69, 4, 23}), Integer.valueOf(m208184F()));
            } catch (Exception e13) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 15, 95, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e13);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 21, 3, 93, 22, 84, 69, 0, 18, 69, 20, 84}), m208232j0());
            } catch (Exception e14) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 4, 11, 64, 3, 67, 86, 21, 19, 66, 3, 11, 23}) + e14);
            }
            try {
                String[] strArrM208196L = m208196L();
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 12, 9, 84, 3, 93}), strArrM208196L[0]);
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 23, 3, 94, 2, 94, 69}), strArrM208196L[1]);
            } catch (Exception e15) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 121, 8, 87, 88, 91, 70}) + e15);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, 0, 20, 83, 14}), m208194K());
            } catch (Exception e16) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 113, 20, 82, 95, 91, 70}) + e16);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 22, 68, 104, HttpTokens.CARRIAGE_RETURN, 9, 81, 2}), Double.valueOf(m208198M()));
            } catch (Exception e17) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 101, 21, 80, 80, 4, 92, Tnaf.POW_2_WIDTH}) + e17);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 7, 92, 82, 19, 7, 111, 5, 94, 66, 15, 18}), Integer.valueOf(m208186G(context)));
            } catch (Exception e18) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 116, 14, 19, 94, 18, 11, 23}) + e18);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 7, 92, 82, 19, 7, 111, 2, 84, 67, 0, 15, 92}), m208188H(context));
            } catch (Exception e19) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 123, 8, 21, 68, 92, 17}) + e19);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{82, 19, 88, 91, 5, 57, 89, 8, 87, 88}), m208180D());
            } catch (Exception e20) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 20, 15, 92, 2, 120, 89, 7, 9, 10, 70}) + e20);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{89, 8, 65, 66, 21, 57, 93, 3, 69, 95, 14, 2, 67}), m208205S(context));
            } catch (Exception e21) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 126, 15, 22, 69, 18, 124, 82, 21, 14, 95, 2, 125, 94, 18, 18, 10, 70}) + e21);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{81, 5, 82, 82, 18, 21, 89, 4, 88, 91, 8, 18, 73}), m208239n(context));
            } catch (Exception e22) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 2, 5, 85, 21, 66, 94, 3, 15, 92, 15, 69, 78, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 42, 89, 21, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e22);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 8, 8, 86, 9}), m208261y(context));
            } catch (Exception e23) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 121, 8, 87, 88, 91, 70}) + e23);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 3, 93, 91, 62, 15, 94, 0, 94}), m208243p(context));
            } catch (Exception e24) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, HttpTokens.CARRIAGE_RETURN, 10, 115, 3, 93, 91, 40, 8, 86, 9, 11, 23}) + e24);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{93, 9, 68, 89, 21, 3, 84, 57, 65, 88, 8, 8, 68, 21, 110, 91, 8, 21, 68}), m208209W(context));
            } catch (Exception e25) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 91, 70}) + e25);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 15, 92, 104, 2, 9, 69, 8, 69}), Integer.valueOf(m208220d0(context)));
            } catch (Exception e26) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 115, 9, 68, 89, 21, 92, Tnaf.POW_2_WIDTH}) + e26);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 15, 92, 104, 20, 21, 85, 2, 110, 84, 14, 19, 94, 18}), Integer.valueOf(m208226g0(ygw.m214775a())));
            } catch (Exception e27) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 101, 21, 84, 83, 34, 9, 69, 8, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e27);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{89, 21, 110, 68, 8, 11, 83, 7, 67, 83, 62, 20, 85, 7, 85, 78}), Boolean.valueOf(m208181D0(context)));
            } catch (Exception e28) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 98, 94, 12, 37, 81, 20, 85, 101, 4, 7, 84, 31, 11, 23}) + e28);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 15, 92, 104, 8, 8, 86, 9}), m208224f0(context));
            } catch (Exception e29) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 125, 19, 93, 67, 8, 47, 94, 0, 94, HttpTokens.CARRIAGE_RETURN, 65}) + e29);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{89, 21, 110, 69, 14, 9, 68}), Boolean.valueOf(m208217c(context)));
            } catch (Exception e30) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 52, 95, 9, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e30);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{91, 3, 67, 89, 4, 10, 111, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8}), m208206T());
            } catch (Exception e31) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 124, 4, 20, 94, 3, 93, 97, 4, 20, 67, 15, 94, 89, 91, 70}) + e31);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{92, 7, 95, 80, 20, 7, 87, 3}), m208207U());
            } catch (Exception e32) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 123, 0, 8, 87, 19, 80, 80, 4, 92, Tnaf.POW_2_WIDTH}) + e32);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 9, 93, 91, 4, 5, 68, 57, 71, 94, 19, 18, 69, 7, 93, 104, 8, 8, 86, 9, 110, 83, 4, 18, 81, 15, 93}), m208221e(context));
            } catch (Exception e33) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 113, 8, 10, 85, 35, 73, 94, 18, 18, 125, 7, 65, HttpTokens.CARRIAGE_RETURN, 65}) + e33);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 9, 93, 91, 4, 5, 68, 57, 67, 82, 0, 10, 111, 11, 80, 84, 9, 15, 94, 3, 110, 94, 15, 0, 95}), m208203Q());
            } catch (Exception e34) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 113, 8, 10, 85, 35, 73, 94, 18, 18, 125, 7, 65, HttpTokens.CARRIAGE_RETURN, 65}) + e34);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{68, 5, 65, 104, 17, 9, 66, 18, 110, 91, 8, 21, 68}), m208241o());
            } catch (Exception e35) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 2, 18, 89, Tnaf.POW_2_WIDTH, 84, 99, 2, 22, 96, 9, 67, 67, 45, 15, 67, 18, 11, 23}) + e35);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{81, 10, 93, 104, 18, 3, 94, 21, 94, 69, 62, 10, 89, 21, 69}), m208245q(context));
            } catch (Exception e36) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, HttpTokens.CARRIAGE_RETURN, 10, 99, 3, 95, 68, 14, 20, 124, 15, 66, 67, 91, 70}) + e36);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{68, 9, 65, 104, 21, 7, 67, HttpTokens.CARRIAGE_RETURN}), m208238m0(context));
            } catch (Exception e37) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 14, 22, 100, 7, 66, 92, 91, 70}) + e37);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{81, 22, 65, 104, 8, 8, 86, 9}), m208247r(context));
            } catch (Exception e38) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 17, 22, 121, 8, 87, 88, 91, 70}) + e38);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 9, 82, 92, 4, 18, 111, 9, 82, 84, 20, 22, 73}), Boolean.valueOf(m208215b(context)));
            } catch (Exception e39) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 42, 95, 5, 80, 91, 50, 3, 66, Tnaf.POW_2_WIDTH, 84, 69, 50, 9, 83, HttpTokens.CARRIAGE_RETURN, 84, 67, 91, 70}) + e39);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{67, 18, 80, 84, 10, 57, 68, 20, 80, 84, 4}), m208228h0());
            } catch (Exception e40) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 21, 7, 83, HttpTokens.CARRIAGE_RETURN, 101, 69, 0, 5, 85, 92, 17}) + e40);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{89, 21, 110, 84, 20, 21, 68, 9, 92, 94, 27, 3, 84, 57, 67, 88, 12}), Boolean.valueOf(m208260x0()));
            } catch (Exception e41) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 114, 66, 18, 18, 95, 11, 88, 77, 4, 2, 98, 9, 92, HttpTokens.CARRIAGE_RETURN, 65}) + e41);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{64, 14, 94, 89, 4, 57, 93, 7, 95, 86, 6, 3, 66, 57, 88, 89, 7, 9}), m208212Z());
            } catch (Throwable th) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 103, 9, 9, 94, 3, 124, 86, 15, 7, 87, 3, 67, 126, 15, 0, 95, 92, 17}) + th);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{71, 15, 95, 83, 14, 17, 111, 11, 80, 89, 0, 1, 85, 20, 110, 94, 15, 0, 95}), m208246q0());
            } catch (Throwable th2) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 96, 8, 8, 84, 9, 70, 122, 0, 8, 81, 1, 84, 69, 40, 8, 86, 9, 11, 23}) + th2);
            }
            try {
                linkedHashMap.put(sgw.m184137a(new byte[]{83, 9, 65, 84, 14, 2, 85}), m208210X());
            } catch (Exception e42) {
                Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 121, 0, 18, 89, Tnaf.POW_2_WIDTH, 84, 113, 20, 8, 83, 47, 95, 81, 14, 92, Tnaf.POW_2_WIDTH}) + e42);
            }
        } catch (Throwable th3) {
            Log.e(sgw.m184137a(new byte[]{100, 39, 118}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 115, 9, 93, 91, 4, 5, 68, 9, 67, 23, 2, 9, 92, 10, 84, 84, 21, 92, Tnaf.POW_2_WIDTH}) + th3);
        }
        return bti0.m103848d(linkedHashMap);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m208220d0(Context context) {
        int activeSubscriptionInfoCountMax = 1;
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(sgw.m184137a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}));
            activeSubscriptionInfoCountMax = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoCountMax() : 1;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
            return telephonyManager != null ? telephonyManager.getPhoneCount() : activeSubscriptionInfoCountMax;
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 18, 88, 89, 6, 70, 99, 47, 124, 23, 2, 9, 69, 8, 69}), e);
            return activeSubscriptionInfoCountMax;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, Map<String, String>> m208221e(Context context) {
        HashMap map = new HashMap();
        m208225g(map);
        m208227h(map);
        m208229i(context, map);
        return map;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e0 */
    private static void m208222e0(Context context, List<JSONObject> list) {
        SubscriptionManager subscriptionManager;
        if (jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) && (subscriptionManager = (SubscriptionManager) context.getSystemService(sgw.m184137a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}))) != null) {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null) {
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        C21095i c21095i = new C21095i();
                        c21095i.f192349a = subscriptionInfo.getSubscriptionId();
                        c21095i.f192352d = (String) subscriptionInfo.getCarrierName();
                        c21095i.f192353e = subscriptionInfo.getIccId();
                        c21095i.f192350b = subscriptionInfo.getSimSlotIndex();
                        c21095i.f192354f = subscriptionInfo.getCountryIso();
                        try {
                            c21095i.f192351c = m208204R(c21095i.f192349a, context);
                        } catch (Exception e) {
                            Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 40, 8, 86, 9, 119, 88, 19, 42, 95, 10, 93, 94, 17, 9, 64, 39, 95, 83, HttpTokens.SPACE, 4, 95, Tnaf.POW_2_WIDTH, 84, 23, 6, 3, 68, 47, 92, 68, 8, 62}), e);
                        }
                        list.add(c21095i.m208272a());
                    }
                }
            } catch (Exception e2) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 40, 8, 86, 9, 119, 88, 19, 42, 95, 10, 93, 94, 17, 9, 64, 39, 95, 83, HttpTokens.SPACE, 4, 95, Tnaf.POW_2_WIDTH, 84}), e2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m208223f(String str, String[] strArr, Map<String, Map<String, String>> map) {
        File[] fileArrListFiles;
        HashMap map2 = new HashMap();
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null) {
                    String upperCase = file2.getAbsolutePath().toUpperCase(Locale.ENGLISH);
                    for (String str2 : strArr) {
                        if (upperCase.contains(str2.toUpperCase(Locale.ENGLISH))) {
                            map2.put(str2, upperCase);
                        }
                    }
                }
            }
            map.put(str, map2);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static List<JSONObject> m208224f0(Context context) {
        ArrayList arrayList = new ArrayList();
        m208222e0(context, arrayList);
        return bti0.m103850f(arrayList);
    }

    /* JADX INFO: renamed from: g */
    private static void m208225g(Map<String, Map<String, String>> map) {
        String strM184137a = sgw.m184137a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 93, 94, 3});
        String[] strArr = f192301h;
        m208223f(strM184137a, strArr, map);
        m208223f(sgw.m184137a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 83, 94, 15}), f192302i, map);
        m208223f(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 11, 95, 2, 68, 91, 4}), strArr, map);
        m208223f(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 11, 89, 21, 82, 24}), new String[]{sgw.m184137a(new byte[]{70, 4, 94, 79}), sgw.m184137a(new byte[]{65, 3, 92, 66}), sgw.m184137a(new byte[]{70, 14, 94, 68, 21, 75, 94, 3, 69})}, map);
        m208223f(sgw.m184137a(new byte[]{31, 2, 84, 65}), new String[]{sgw.m184137a(new byte[]{70, 4, 94, 79}), sgw.m184137a(new byte[]{65, 3, 92, 66}), sgw.m184137a(new byte[]{70, 14, 94, 68, 21, 75, 94, 3, 69}), sgw.m184137a(new byte[]{68, 18, 88, 71, 2, 57})}, map);
        m208256v0(sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 57, 111, 22, 67, 88, 17, 3, 66, 18, 88, 82, 18, 57, 111}), new String[]{sgw.m184137a(new byte[]{70, 4, 94, 79}), sgw.m184137a(new byte[]{65, 3, 92, 66}), sgw.m184137a(new byte[]{85, 18, 89}), sgw.m184137a(new byte[]{71, 15, 95, 83, 14, 17, 67}), sgw.m184137a(new byte[]{82, 10, 68, 82, 18, 18, 81, 5, 90, 68})}, map);
        m208256v0(sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 94, 3, 69, 24, 0, 20, 64}), new String[]{sgw.m184137a(new byte[]{85, 18, 89})}, map);
        m208256v0(sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 94, 3, 69, 24, 19, 9, 69, 18, 84}), new String[]{sgw.m184137a(new byte[]{85, 18, 89})}, map);
        m208223f(sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 21, 95, 5, 90, 82, 21, 73}), new String[]{sgw.m184137a(new byte[]{65, 3, 92, 66, 5}), sgw.m184137a(new byte[]{82, 7, 66, 82, 3, 7, 94, 2, 110, 80, 4, 8, 73, 2})}, map);
        m208258w0(map);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g0 */
    public static int m208226g0(Context context) {
        if (!jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36}))) {
            return -1;
        }
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(sgw.m184137a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}));
        if (subscriptionManager != null) {
            return subscriptionManager.getActiveSubscriptionInfoCount();
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
        int i = 0;
        if (telephonyManager != null) {
            i = telephonyManager.getSimState() == 5 ? 1 : 0;
            try {
                Object objInvoke = TelephonyManager.class.getMethod(sgw.m184137a(new byte[]{87, 3, 69, 100, 8, 11, 99, 18, 80, 67, 4}), Integer.TYPE).invoke(telephonyManager, 1);
                if ((objInvoke instanceof Integer) && ((Integer) objInvoke).intValue() == 5) {
                    return 2;
                }
                return i;
            } catch (Exception e) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 50, 18, 81, 18, 84}), e);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    private static void m208227h(Map<String, Map<String, String>> map) {
        String[] strArr = {sgw.m184137a(new byte[]{93, 11, 82, 85, HttpTokens.CARRIAGE_RETURN, HttpTokens.CARRIAGE_RETURN}), sgw.m184137a(new byte[]{84, 11, 28})};
        if (m208256v0(sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 4, 92, 9, 82, 92}), strArr, map) != 1) {
            m208256v0(sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 64, 7, 67, 67, 8, 18, 89, 9, 95, 68}), strArr, map);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static List<String> m208228h0() {
        ArrayList arrayList = new ArrayList();
        try {
            throw new Exception(sgw.m184137a(new byte[]{84, 3, 69, 82, 2, 18}));
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                arrayList.add(sgw.m184137a(new byte[]{83, 10, 80, 77, 27, 91}) + stackTraceElement.getClassName() + sgw.m184137a(new byte[]{76, 70, 92, 82, 21, 14, 95, 2, 12}) + stackTraceElement.getMethodName());
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m208229i(Context context, Map<String, Map<String, String>> map) {
        if (context == null) {
            return;
        }
        List<String> listM208209W = m208209W(context);
        HashMap map2 = new HashMap();
        String[] strArr = {sgw.m184137a(new byte[]{82, 10, 68, 82, 18, 18, 81, 5, 90})};
        for (String str : listM208209W) {
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String str2 = strArr[0];
            if (lowerCase.contains(str2.toLowerCase(locale))) {
                map2.put(str2, lowerCase);
            }
            map.put(lowerCase, map2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private static String m208230i0(int i) {
        if (i == 2) {
            return sgw.m184137a(new byte[]{83, 14, 80, 69, 6, 15, 94, 1});
        }
        if (i == 3) {
            return sgw.m184137a(new byte[]{84, 15, 66, 84, 9, 7, 66, 1, 88, 89, 6});
        }
        if (i != 4) {
            return i != 5 ? sgw.m184137a(new byte[]{69, 8, 90, 89, 14, 17, 94}) : sgw.m184137a(new byte[]{86, 19, 93, 91});
        }
        return sgw.m184137a(new byte[]{94, 9, 69, 23, 2, 14, 81, 20, 86, 94, 15, 1});
    }

    /* JADX INFO: renamed from: j */
    private static float m208231j(int i) {
        float f;
        float f2;
        if (i <= 0 || i > 20000000) {
            return 0.0f;
        }
        if (i > 1500000) {
            f = i;
            f2 = 100000.0f;
        } else if (i > 15000) {
            f = i;
            f2 = 1000.0f;
        } else {
            if (i <= 150) {
                return i;
            }
            f = i;
            f2 = 10.0f;
        }
        return f / f2;
    }

    /* JADX INFO: renamed from: j0 */
    public static Map<String, String> m208232j0() {
        HashMap map = new HashMap();
        int iM208211Y = m208211Y();
        for (int i = 0; i < iM208211Y; i++) {
            Locale locale = Locale.ENGLISH;
            map.put(String.format(locale, sgw.m184137a(new byte[]{83, 22, 68, 18, 5}), Integer.valueOf(i)), m208234k0(String.format(locale, sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 18, 88, 3, 67, 90, 0, 10, 31, 18, 89, 82, 19, 11, 81, 10, 110, 77, 14, 8, 85, 67, 85, 24, 21, 3, 93, 22}), Integer.valueOf(i))));
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, Object> m208233k(Sensor sensor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(sgw.m184137a(new byte[]{94, 7, 92, 82}), sensor.getName());
        linkedHashMap.put(sgw.m184137a(new byte[]{70, 3, 95, 83, 14, 20}), sensor.getVendor());
        linkedHashMap.put(sgw.m184137a(new byte[]{70, 3, 67, 68, 8, 9, 94}), Integer.valueOf(sensor.getVersion()));
        linkedHashMap.put(sgw.m184137a(new byte[]{68, 31, 65, 82}), Integer.valueOf(sensor.getType()));
        linkedHashMap.put(sgw.m184137a(new byte[]{93, 7, 73, 101, 0, 8, 87, 3}), Float.valueOf(sensor.getMaximumRange()));
        linkedHashMap.put(sgw.m184137a(new byte[]{66, 3, 66, 88, HttpTokens.CARRIAGE_RETURN, 19, 68, 15, 94, 89}), Float.valueOf(sensor.getResolution()));
        linkedHashMap.put(sgw.m184137a(new byte[]{93, 15, 95, 115, 4, 10, 81, 31}), Integer.valueOf(sensor.getMinDelay()));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k0 */
    private static String m208234k0(String str) {
        return m208237m(m208231j(m208193J0(str)));
    }

    /* JADX INFO: renamed from: l */
    private static List<String> m208235l(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.split(SignParameters.NEW_LINE)) {
                Matcher matcher = f192303j.matcher(str2);
                if (matcher.find()) {
                    try {
                        arrayList.add(String.valueOf(Long.parseLong(matcher.group(1), 16)));
                    } catch (NumberFormatException e) {
                        Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 4, 30, 68, 20, 80, 84, 21, 50, 83, 22, 97, 88, 19, 18, 10, 70}) + e);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static String m208236l0() {
        try {
            return TimeZone.getDefault().getDisplayName(true, 0);
        } catch (AssertionError | Exception unused) {
            return sgw.m184137a(new byte[]{6, 80, 7, 1});
        }
    }

    /* JADX INFO: renamed from: m */
    private static String m208237m(float f) {
        return f > 0.0f ? String.format(Locale.ENGLISH, sgw.m184137a(new byte[]{21, 72, 0, 81, -93, -42, 115}), Float.valueOf(f)) : "";
    }

    /* JADX INFO: renamed from: m0 */
    public static Map<String, String> m208238m0(Context context) {
        HashMap map = new HashMap();
        ComponentName componentName = ((ActivityManager) context.getSystemService(sgw.m184137a(new byte[]{81, 5, 69, 94, 23, 15, 68, 31}))).getRunningTasks(1).get(0).topActivity;
        if (componentName != null) {
            map.put(sgw.m184137a(new byte[]{64, 7, 82, 92}), componentName.getPackageName());
            map.put(sgw.m184137a(new byte[]{83, 10, 80, 68, 18}), componentName.getClassName());
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m208239n(Context context) {
        int i;
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), sgw.m184137a(new byte[]{81, 5, 82, 82, 18, 21, 89, 4, 88, 91, 8, 18, 73, 57, 84, 89, 0, 4, 92, 3, 85}));
        } catch (Settings.SettingNotFoundException e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 84, 2, 3, 67, 21, 88, 85, 8, 10, 89, 18, 72, 23, 4, 8, 81, 4, 93, 82, 5, 70, 67, 3, 69, 67, 8, 8, 87}), e);
            i = 0;
        }
        return (i != 1 || (string = Settings.Secure.getString(context.getContentResolver(), sgw.m184137a(new byte[]{85, 8, 80, 85, HttpTokens.CARRIAGE_RETURN, 3, 84, 57, 80, 84, 2, 3, 67, 21, 88, 85, 8, 10, 89, 18, 72, 104, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 21}))) == null) ? arrayList : Arrays.asList(string.split(sgw.m184137a(new byte[]{10})));
    }

    /* JADX INFO: renamed from: n0 */
    public static Map<String, Long> m208240n0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long mobileRxBytes = TrafficStats.getMobileRxBytes();
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        linkedHashMap.put(sgw.m184137a(new byte[]{93, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, 98, 30, 115, 78, 21, 3, 67}), Long.valueOf(mobileRxBytes));
        linkedHashMap.put(sgw.m184137a(new byte[]{93, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, 100, 30, 115, 78, 21, 3, 67}), Long.valueOf(mobileTxBytes));
        linkedHashMap.put(sgw.m184137a(new byte[]{68, 9, 69, 86, HttpTokens.CARRIAGE_RETURN, 50, 72, 36, 72, 67, 4, 21}), Long.valueOf(totalTxBytes));
        linkedHashMap.put(sgw.m184137a(new byte[]{68, 9, 69, 86, HttpTokens.CARRIAGE_RETURN, 52, 72, 36, 72, 67, 4, 21}), Long.valueOf(totalRxBytes));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: o */
    public static List<String> m208241o() {
        return m208235l(bti0.m103853i(sgw.m184137a(new byte[]{83, 7, 69, 23, 78, 22, 66, 9, 82, 24, 15, 3, 68, 73, 69, 84, 17})));
    }

    /* JADX INFO: renamed from: o0 */
    public static String m208242o0() {
        String strM103853i = bti0.m103853i(sgw.m184137a(new byte[]{83, 7, 69, 23, 78, 22, 66, 9, 82, 24, 18, 3, 92, 0, 30, 84, 6, 20, 95, 19, 65}));
        if (strM103853i.isEmpty()) {
            sgw.m184137a(new byte[]{115, 1, 67, 88, 20, 22, Tnaf.POW_2_WIDTH, 5, 94, 89, 21, 3, 94, 18, 17, 94, 18, 70, 85, 11, 65, 67, 24, 72});
            return null;
        }
        Matcher matcher = Pattern.compile(sgw.m184137a(new byte[]{31, 19, 88, 83, 62, 78, 108, 2, 26, 30})).matcher(strM103853i);
        if (!matcher.find()) {
            sgw.m184137a(new byte[]{101, 47, 117, 23, 15, 9, 68, 70, 87, 88, 20, 8, 84, 70, 88, 89, 65, 5, 87, 20, 94, 66, 17, 70, 83, 9, 95, 67, 4, 8, 68, 72});
            return null;
        }
        String strGroup = matcher.group(1);
        if (m208177B0(strGroup)) {
            return String.format(Locale.US, sgw.m184137a(new byte[]{69, 86, 110, 86, 68, 2}), Integer.valueOf(Integer.parseInt(strGroup) + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL));
        }
        sgw.m184137a(new byte[]{101, 47, 117, 23, 8, 21, Tnaf.POW_2_WIDTH, 8, 94, 67, 65, 7, Tnaf.POW_2_WIDTH, 8, 68, 90, 3, 3, 66, 72});
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static synchronized JSONObject m208243p(Context context) {
        JSONObject jSONObject;
        try {
            C21093g c21093g = new C21093g();
            C21090d c21090d = new C21090d();
            C21094h c21094h = new C21094h();
            C21096j c21096j = new C21096j();
            if (jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 114, 120, HttpTokens.SPACE, 52, 99, 35, 110, 123, 46, 37, 113, 50, 120, 120, 47})) || jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127}))) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
                if (telephonyManager != null && (telephonyManager.getPhoneType() == 1 || telephonyManager.getPhoneType() == 2)) {
                    m208187G0(telephonyManager, c21093g, c21090d, c21094h, c21096j);
                }
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(sgw.m184137a(new byte[]{87, 21, 92, 104, 2, 3, 92, 10, 88, 89, 7, 9}), c21093g.m208270a());
                jSONObject.put(sgw.m184137a(new byte[]{83, 2, 92, 86, 62, 5, 85, 10, 93, 94, 15, 0, 95}), c21090d.m208267a());
                jSONObject.put(sgw.m184137a(new byte[]{71, 5, 85, 90, 0, 57, 83, 3, 93, 91, 8, 8, 86, 9}), c21096j.m208273a());
                jSONObject.put(sgw.m184137a(new byte[]{92, 18, 84, 104, 2, 3, 92, 10, 88, 89, 7, 9}), c21094h.m208271a());
            } catch (JSONException e) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 83, 20, 84, 86, 21, 15, 94, 1, 17, 125, 50, 41, 126, 70, 94, 85, 11, 3, 83, 18, 11, 23}), e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: p0 */
    public static String m208244p0(Context context) {
        String property;
        String str = f192295b;
        if (str != null) {
            return str;
        }
        synchronized (f192296c) {
            String str2 = f192295b;
            if (str2 != null) {
                return str2;
            }
            try {
                property = WebSettings.getDefaultUserAgent(context);
            } catch (Exception unused) {
                property = System.getProperty(sgw.m184137a(new byte[]{88, 18, 69, 71, 79, 7, 87, 3, 95, 67}), "");
            }
            StringBuilder sb = new StringBuilder();
            int length = property != null ? property.length() : 0;
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    sb.append(String.format(sgw.m184137a(new byte[]{108, 19, 20, 7, 85, 30}), Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
            }
            f192295b = sb.toString();
            return f192295b;
        }
    }

    /* JADX INFO: renamed from: q */
    public static List<Map<String, Object>> m208245q(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            Log.e(f192294a, sgw.m184137a(new byte[]{115, 9, 95, 67, 4, 30, 68, 70, 88, 68, 65, 8, 69, 10, 93, 27, 65, 20, 85, 18, 68, 69, 15, 15, 94, 1, 17, 82, 12, 22, 68, 31, 17, 68, 4, 8, 67, 9, 67, 23, HttpTokens.CARRIAGE_RETURN, 15, 67, 18, 31}));
            return arrayList;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20}));
        if (sensorManager == null) {
            Log.e(f192294a, sgw.m184137a(new byte[]{99, 3, 95, 68, 14, 20, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93, 27, 65, 20, 85, 18, 68, 69, 15, 15, 94, 1, 17, 82, 12, 22, 68, 31, 17, 68, 4, 8, 67, 9, 67, 23, HttpTokens.CARRIAGE_RETURN, 15, 67, 18, 31}));
            return arrayList;
        }
        Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
        while (it.hasNext()) {
            arrayList.add(m208233k(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public static Map<String, String> m208246q0() {
        HashMap map = new HashMap();
        try {
            IBinder iBinderM145319a = lje0.m149964a().m149967d().m145319a();
            if (iBinderM145319a == null) {
                map.put(sgw.m184137a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 117, 8, 8, 84, 3, 67}), "");
                return map;
            }
            map.put(sgw.m184137a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 117, 8, 8, 84, 3, 67}), iBinderM145319a.getClass().getName());
            Class<?>[] interfaces = iBinderM145319a.getClass().getInterfaces();
            if (interfaces.length > 0) {
                map.put(sgw.m184137a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 89, 21, 3, 66, 0, 80, 84, 4}), interfaces[0].getName());
            } else {
                map.put(sgw.m184137a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 89, 21, 3, 66, 0, 80, 84, 4}), "");
            }
            ClassLoader classLoader = iBinderM145319a.getClass().getClassLoader();
            map.put(sgw.m184137a(new byte[]{92, 9, 80, 83, 4, 20}), classLoader != null ? classLoader.toString() : "");
            return map;
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 96, 8, 8, 84, 9, 70, 122, 0, 8, 81, 1, 84, 69, 40, 8, 86, 9, 11, 23}) + e);
            return map;
        }
    }

    /* JADX INFO: renamed from: r */
    public static JSONObject m208247r(Context context) {
        C21088b c21088b = new C21088b();
        c21088b.f192306a = String.valueOf(Process.myPid());
        c21088b.f192307b = m208242o0();
        c21088b.f192309d = m208249s(context);
        c21088b.f192308c = context.getPackageName();
        c21088b.f192310e = m208253u(context);
        c21088b.f192312g = context.getFilesDir().getAbsolutePath();
        c21088b.f192311f = m208251t(context);
        return c21088b.m208265a();
    }

    /* JADX INFO: renamed from: r0 */
    private static boolean m208248r0() {
        String[] strArr = {sgw.m184137a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 115, 4, Tnaf.POW_2_WIDTH, 89, 5, 84, 126, 15, 0, 95, 54, 67, 88, 17}), sgw.m184137a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 118, 36, 53, 101, 18, 88, 91, 18}), sgw.m184137a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 123, 14, 1}), sgw.m184137a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 100, 21, 20, 85, 7, 92, 98, 21, 15, 92, 21}), sgw.m184137a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 54, 1, 74, 21, 100, 67, 8, 10})};
        for (int i = 0; i < 5; i++) {
            try {
                Class.forName(strArr[i]);
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private static String m208249s(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 71, 17, 10, 89, 5, 80, 67, 8, 9, 94, 70, 95, 86, 12, 3}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: s0 */
    private static boolean m208250s0(Context context) {
        String[] strArr = {sgw.m184137a(new byte[]{83, 9, 92, 25, 15, 9, 67, 14, 68, 81, 14, 19, 30, 7, 95, 83, 19, 9, 89, 2, 31, 68, 20}), sgw.m184137a(new byte[]{83, 9, 92, 25, 21, 14, 89, 20, 85, 71, 0, 20, 68, 31, 31, 68, 20, 22, 85, 20, 68, 68, 4, 20}), sgw.m184137a(new byte[]{85, 19, 31, 84, 9, 7, 89, 8, 87, 94, 19, 3, 30, 21, 68, 71, 4, 20, 67, 19}), sgw.m184137a(new byte[]{83, 9, 92, 25, 10, 9, 69, 21, 89, 94, 10, 2, 69, 18, 69, 86, 79, 21, 69, 22, 84, 69, 20, 21, 85, 20})};
        for (int i = 0; i < 4; i++) {
            if (m208179C0(context, strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    private static String m208251t(Context context) {
        String strM208202P = m208202P();
        if (!TextUtils.isEmpty(strM208202P)) {
            return strM208202P;
        }
        String strM208201O = m208201O();
        return !TextUtils.isEmpty(strM208201O) ? strM208201O : m208200N(context);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: t0 */
    public static boolean m208252t0() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    /* JADX INFO: renamed from: u */
    private static String m208253u(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{96, 7, 82, 92, 0, 1, 85, 70, 95, 86, 12, 3, Tnaf.POW_2_WIDTH, 8, 94, 67, 65, 0, 95, 19, 95, 83}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m208254u0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        return packageManager.hasSystemFeature(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14, 110, 91, 4})) || packageManager.hasSystemFeature(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14}));
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static String m208255v(Context context) {
        try {
            Class<?> cls = Class.forName(sgw.m184137a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 8, 69, 82, 19, 8, 81, 10, 31, 88, 18, 72, 96, 9, 70, 82, 19, 54, 66, 9, 87, 94, HttpTokens.CARRIAGE_RETURN, 3}));
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method method = cls.getMethod(sgw.m184137a(new byte[]{87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31}), null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(objNewInstance, null);
            if (objInvoke != null) {
                return String.valueOf(((Double) objInvoke).doubleValue());
            }
            Log.e(f192294a, sgw.m184137a(new byte[]{87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31, 125, 3, 69, 95, 14, 2, 30, 15, 95, 65, 14, HttpTokens.CARRIAGE_RETURN, 85, 70, 67, 82, 21, 19, 66, 8, 84, 83, 65, 8, 69, 10, 93}));
            return "";
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31, 10, 70}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: v0 */
    private static int m208256v0(String str, String[] strArr, Map<String, Map<String, String>> map) {
        BufferedReader bufferedReader;
        HashMap map2 = new HashMap();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (!bti0.m103846b(str)) {
                    return -1;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(str, new String[0]), new OpenOption[0])));
            } catch (Exception e) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 8, 21, 115, 9, 95, 67, 0, 15, 94, 53, 69, 69}), e);
                return -1;
            }
        } else {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            } catch (FileNotFoundException e2) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 8, 21, 115, 9, 95, 67, 0, 15, 94, 53, 69, 69}), e2);
                return -1;
            }
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    map.put(str, map2);
                    return 1;
                }
                String lowerCase = line.toLowerCase(Locale.ENGLISH);
                for (String str2 : strArr) {
                    if (lowerCase.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        map2.put(str2, lowerCase);
                    }
                }
            } catch (IOException e3) {
                Log.e(f192294a, sgw.m184137a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 86, 15, 93, 82, 91, 70}) + str, e3);
                return -1;
            } catch (SecurityException unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private static JSONObject m208257w(Context context) {
        Intent intentM136342l = ii5.m136342l(context, null, new IntentFilter(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 88, 89, 21, 3, 94, 18, 31, 86, 2, 18, 89, 9, 95, 25, 35, 39, 100, 50, 116, 101, 56, 57, 115, 46, 112, 121, 38, 35, 116})));
        C21089c c21089c = new C21089c();
        c21089c.f192313a = m208255v(context);
        if (intentM136342l != null) {
            c21089c.f192314b = intentM136342l.getIntExtra(sgw.m184137a(new byte[]{92, 3, 71, 82, HttpTokens.CARRIAGE_RETURN}), -1) / intentM136342l.getIntExtra(sgw.m184137a(new byte[]{67, 5, 80, 91, 4}), -1);
            c21089c.f192315c = intentM136342l.getIntExtra(sgw.m184137a(new byte[]{70, 9, 93, 67, 0, 1, 85}), -1);
            c21089c.f192316d = intentM136342l.getIntExtra(sgw.m184137a(new byte[]{68, 3, 92, 71, 4, 20, 81, 18, 68, 69, 4}), -1) / 10.0f;
            c21089c.f192317e = m208230i0(intentM136342l.getIntExtra(sgw.m184137a(new byte[]{67, 18, 80, 67, 20, 21}), -1));
            c21089c.f192318f = m208214a0(intentM136342l.getIntExtra(sgw.m184137a(new byte[]{64, 10, 68, 80, 6, 3, 84}), -1));
            if (Build.VERSION.SDK_INT >= 34) {
                c21089c.f192319g = intentM136342l.getIntExtra(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 3, 72, 18, 67, 86, 79, 37, 105, 37, 125, 114, 62, 37, 127, 51, 127, 99}), -1);
            } else {
                c21089c.f192319g = -1;
            }
        }
        return c21089c.m208266a();
    }

    /* JADX INFO: renamed from: w0 */
    private static void m208258w0(Map<String, Map<String, String>> map) {
        String[] strArr = {sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 89, 8, 69, 82, 19, 20, 69, 22, 69, 68}), sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 89, 9, 92, 82, 12}), sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 89, 9, 65, 88, 19, 18, 67}), sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 93, 15, 66, 84}), sgw.m184137a(new byte[]{31, 22, 67, 88, 2, 73, 91, 7, 93, 91, 18, 31, 93, 21})};
        for (int i = 0; i < 5; i++) {
            m208256v0(strArr[i], f192301h, map);
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m208259x() {
        return "";
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m208260x0() {
        return m208248r0() || m208264z0();
    }

    /* JADX INFO: renamed from: y */
    public static JSONObject m208261y(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(sgw.m184137a(new byte[]{89, 21, 110, 85, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 111, 3, 95, 86, 3, 10, 85}), m208252t0());
        } catch (Exception e) {
            Log.e(f192294a, sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 115, 91, 20, 3, 68, 9, 94, 67, 9, 35, 94, 7, 83, 91, 4, 2, 10, 70}), e);
        }
        try {
            jSONObject.put(sgw.m184137a(new byte[]{89, 21, 110, 85, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 111, 3, 73, 94, 18, 18}), m208254u0(context));
            jSONObject.put(sgw.m184137a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 23, 3, 66}), m208174A(context));
            jSONObject.put(sgw.m184137a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 12, 7, 83}), m208263z());
            jSONObject.put(sgw.m184137a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 15, 7, 93, 3}), m208259x());
            jSONObject.put(sgw.m184137a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 17, 3, 66, 11, 88, 68, 18, 15, 95, 8}), jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 36, 125, 98, 36, 50, 127, 41, 101, 127})));
        } catch (Exception e2) {
            Log.e(f192294a, sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 2, 20, 85, 7, 69, 82, 65, 1, 85, 18, 115, 91, 20, 3, 68, 9, 94, 67, 9, 47, 94, 0, 94, 23, 43, 53, 127, 40, 17, 88, 3, 12, 85, 5, 69}), e2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: y0 */
    private static boolean m208262y0(String str) {
        File file = new File(str);
        return file.exists() && file.isDirectory();
    }

    /* JADX INFO: renamed from: z */
    public static String m208263z() {
        return "";
    }

    /* JADX INFO: renamed from: z0 */
    private static boolean m208264z0() {
        return new String(Coded.doCommand(sgw.m184137a(new byte[]{68, 3, 66, 67}).getBytes(), 107)).equals(sgw.m184137a(new byte[]{67, 19, 82, 84, 4, 21, 67})) || (new File(sgw.m184137a(new byte[]{31, 2, 80, 67, 0, 73, 92, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 73, 68, 11, 65, 24, 2, 9, 94, 0, 88, 80, 18, 73, 30, 22})).exists() || new File(sgw.m184137a(new byte[]{31, 2, 80, 67, 0, 73, 92, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 73, 68, 11, 65, 24, 2, 9, 94, 0, 88, 80, 18, 73, 30, 21, 65})).exists());
    }
}
