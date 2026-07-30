package p153l;

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
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class xe5 {

    /* JADX INFO: renamed from: k */
    private static volatile LocalServerSocket f193679k;

    /* JADX INFO: renamed from: a */
    private static final String f193669a = riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3});

    /* JADX INFO: renamed from: b */
    private static volatile String f193670b = null;

    /* JADX INFO: renamed from: c */
    private static final Object f193671c = new Object();

    /* JADX INFO: renamed from: d */
    private static final FileFilter f193672d = new FileFilter() { // from class: l.we5
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches(riw.m181611a(new byte[]{83, 22, 68, 108, 81, 75, 9, HttpTokens.SEMI_COLON, 26}), file.getName());
        }
    };

    /* JADX INFO: renamed from: e */
    private static boolean f193673e = true;

    /* JADX INFO: renamed from: f */
    private static double f193674f = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: g */
    private static double f193675g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: h */
    private static final String[] f193676h = {riw.m181611a(new byte[]{88, 31, 65, 82, 19, Tnaf.POW_2_WIDTH, 89, 21, 94, 69}), riw.m181611a(new byte[]{65, 3, 92, 66}), riw.m181611a(new byte[]{70, 4, 94, 79}), riw.m181611a(new byte[]{70, 15, 67, 67, 8, 9}), riw.m181611a(new byte[]{91, Tnaf.POW_2_WIDTH, 92})};

    /* JADX INFO: renamed from: i */
    private static final String[] f193677i = {riw.m181611a(new byte[]{88, 31, 65, 82, 19, Tnaf.POW_2_WIDTH, 89, 21, 94, 69}), riw.m181611a(new byte[]{65, 3, 92, 66}), riw.m181611a(new byte[]{70, 4, 94, 79}), riw.m181611a(new byte[]{70, 15, 67, 67, 8, 9})};

    /* JADX INFO: renamed from: j */
    private static final Pattern f193678j = Pattern.compile(riw.m181611a(new byte[]{108, 2, 26, HttpTokens.CARRIAGE_RETURN, 61, 21, 26, HttpTokens.COLON, 70, 76, 89, 27, 10, 78, 106, 7, 76, 95, 113, 75, 107, 86, 76, 28, 109, 77, 24, 107, 18, 76}));

    /* JADX INFO: renamed from: l */
    public static final String[] f193680l = {riw.m181611a(new byte[]{66, 3, 80, 83}), riw.m181611a(new byte[]{71, 20, 88, 67, 4}), riw.m181611a(new byte[]{95, 22, 84, 89}), riw.m181611a(new byte[]{86, 9, 65, 82, 15}), riw.m181611a(new byte[]{67, 18, 80, 67}), riw.m181611a(new byte[]{92, 21, 69, 86, 21}), riw.m181611a(new byte[]{81, 5, 82, 82, 18, 21}), riw.m181611a(new byte[]{92, 15, 95, 92}), riw.m181611a(new byte[]{66, 3, 80, 83, HttpTokens.CARRIAGE_RETURN, 15, 94, HttpTokens.CARRIAGE_RETURN}), riw.m181611a(new byte[]{67, 3, 95, 83}), riw.m181611a(new byte[]{66, 3, 82, 65}), riw.m181611a(new byte[]{67, 3, 95, 83, 21, 9}), riw.m181611a(new byte[]{66, 3, 82, 65, 7, 20, 95, 11}), riw.m181611a(new byte[]{67, 18, 67, 68, 21, 20}), riw.m181611a(new byte[]{67, 18, 67, 84, 12, 22}), riw.m181611a(new byte[]{67, 18, 67, 89, 2, 11, 64}), riw.m181611a(new byte[]{67, 18, 67, 84, 0, 18}), riw.m181611a(new byte[]{64, 18, 67, 86, 2, 3}), riw.m181611a(new byte[]{86, 9, 67, 92}), riw.m181611a(new byte[]{85, 30, 84, 84, 23, 3}), riw.m181611a(new byte[]{91, 15, 93, 91}), riw.m181611a(new byte[]{111, 57, 66, 78, 18, 18, 85, 11, 110, 71, 19, 9, 64, 3, 67, 67, 24, 57, 87, 3, 69})};

    /* JADX INFO: renamed from: l.xe5$b */
    public static class C21302b {

        /* JADX INFO: renamed from: a */
        public String f193681a = "";

        /* JADX INFO: renamed from: b */
        public String f193682b = "";

        /* JADX INFO: renamed from: c */
        public String f193683c = "";

        /* JADX INFO: renamed from: d */
        public String f193684d = "";

        /* JADX INFO: renamed from: e */
        public String f193685e = "";

        /* JADX INFO: renamed from: f */
        public String f193686f = "";

        /* JADX INFO: renamed from: g */
        public String f193687g = "";

        /* JADX INFO: renamed from: a */
        public JSONObject m210649a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{69, 15, 85}), this.f193682b);
                jSONObject.put(riw.m181611a(new byte[]{64, 15, 85}), this.f193681a);
                jSONObject.put(riw.m181611a(new byte[]{64, 7, 82, 92, 15, 7, 93, 3}), this.f193683c);
                jSONObject.put(riw.m181611a(new byte[]{81, 22, 65, 89, 0, 11, 85}), this.f193684d);
                jSONObject.put(riw.m181611a(new byte[]{81, 22, 65, 65, 4, 20}), this.f193685e);
                jSONObject.put(riw.m181611a(new byte[]{64, 20, 94, 84, 4, 21, 67}), this.f193686f);
                jSONObject.put(riw.m181611a(new byte[]{86, 15, 93, 82, 18, 2, 89, 20}), this.f193687g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 20, 84, 86, 21, 15, 94, 1, 17, 118, 17, 22, 121, 8, 87, 88, 65, 44, 99, 41, 127, HttpTokens.CARRIAGE_RETURN, 65}) + e.getMessage());
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$c */
    public static class C21303c {

        /* JADX INFO: renamed from: a */
        String f193688a;

        /* JADX INFO: renamed from: b */
        float f193689b;

        /* JADX INFO: renamed from: c */
        int f193690c;

        /* JADX INFO: renamed from: d */
        float f193691d;

        /* JADX INFO: renamed from: e */
        String f193692e;

        /* JADX INFO: renamed from: f */
        String f193693f;

        /* JADX INFO: renamed from: g */
        int f193694g;

        private C21303c() {
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210650a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{93, 9, 85, 82}), this.f193693f);
                jSONObject.put(riw.m181611a(new byte[]{66, 7, 69, 94, 14}), this.f193689b);
                jSONObject.put(riw.m181611a(new byte[]{67, 18, 80, 67, 20, 21}), this.f193692e);
                jSONObject.put(riw.m181611a(new byte[]{82, 7, 69, 67, 4, 20, 73, 48}), this.f193690c);
                jSONObject.put(riw.m181611a(new byte[]{82, 7, 69, 67, 4, 20, 73, 50}), this.f193691d);
                jSONObject.put(riw.m181611a(new byte[]{83, 7, 65, 86, 2, 15, 68, 31}), this.f193688a);
                jSONObject.put(riw.m181611a(new byte[]{83, 31, 82, 91, 4, 37, 95, 19, 95, 67}), this.f193694g);
                return jSONObject;
            } catch (Exception e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 114, 7, 69, 67, 4, 20, 73, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$d */
    public static class C21304d {

        /* JADX INFO: renamed from: a */
        int f193695a;

        /* JADX INFO: renamed from: b */
        int f193696b;

        /* JADX INFO: renamed from: c */
        int f193697c;

        /* JADX INFO: renamed from: d */
        int f193698d;

        /* JADX INFO: renamed from: e */
        int f193699e;

        /* JADX INFO: renamed from: f */
        int f193700f;

        private C21304d() {
            this.f193695a = 0;
            this.f193696b = 0;
            this.f193697c = 0;
            this.f193698d = 0;
            this.f193699e = 0;
            this.f193700f = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210651a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 88, 83}), this.f193695a);
                jSONObject.put(riw.m181611a(new byte[]{67, 31, 66, 67, 4, 11, 111, 15, 85}), this.f193696b);
                jSONObject.put(riw.m181611a(new byte[]{82, 7, 66, 82, 18, 18, 81, 18, 88, 88, 15, 57, 89, 2}), this.f193697c);
                jSONObject.put(riw.m181611a(new byte[]{92, 7, 69, 94, 21, 19, 84, 3}), this.f193698d);
                jSONObject.put(riw.m181611a(new byte[]{92, 9, 95, 80, 8, 18, 69, 2, 84}), this.f193699e);
                jSONObject.put(riw.m181611a(new byte[]{84, 4, 92}), this.f193700f);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 115, 34, 124, 118, 34, 3, 92, 10, 120, 89, 7, 9, Tnaf.POW_2_WIDTH, 18, 94, 125, 18, 9, 94, 92, 17}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$e */
    public static class C21305e {

        /* JADX INFO: renamed from: a */
        int f193701a;

        /* JADX INFO: renamed from: b */
        int f193702b;

        /* JADX INFO: renamed from: c */
        float f193703c;

        /* JADX INFO: renamed from: d */
        int f193704d;

        /* JADX INFO: renamed from: e */
        Range<Integer> f193705e;

        /* JADX INFO: renamed from: f */
        int f193706f;

        /* JADX INFO: renamed from: g */
        int f193707g;

        /* JADX INFO: renamed from: h */
        SizeF f193708h;

        private C21305e() {
            this.f193701a = 0;
            this.f193702b = -1;
            this.f193704d = -1;
            this.f193705e = null;
            this.f193706f = -1;
            this.f193707g = -1;
            this.f193708h = null;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210652a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{86, 7, 82, 82}), this.f193701a);
                jSONObject.put(riw.m181611a(new byte[]{64, 15, 73, 82, HttpTokens.CARRIAGE_RETURN, 21}), this.f193702b);
                jSONObject.put(riw.m181611a(new byte[]{86, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 21}), this.f193703c);
                jSONObject.put(riw.m181611a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), this.f193704d);
                if (this.f193705e != null) {
                    jSONObject.put(riw.m181611a(new byte[]{83, 9, 92, 71, 4, 8, 67, 7, 69, 94, 14, 8}), new JSONArray((Collection) Arrays.asList((Integer) this.f193705e.getLower(), (Integer) this.f193705e.getUpper())));
                }
                jSONObject.put(riw.m181611a(new byte[]{81, 3, 99, 82, 6, 15, 95, 8, 66}), this.f193706f);
                jSONObject.put(riw.m181611a(new byte[]{81, 0, 99, 82, 6, 15, 95, 8, 66}), this.f193707g);
                if (this.f193708h != null) {
                    jSONObject.put(riw.m181611a(new byte[]{64, 14, 72, 68, 8, 5, 81, 10, 98, 94, 27, 3}), new JSONArray((Collection) Arrays.asList(Float.valueOf(this.f193708h.getWidth()), Float.valueOf(this.f193708h.getHeight()))));
                }
                return jSONObject;
            } catch (Exception e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 115, 7, 92, 82, 19, 7, 116, 3, 69, 86, 8, 10, Tnaf.POW_2_WIDTH, 18, 94, 125, 18, 9, 94, 92, 17}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$f */
    public static class C21306f implements Comparator<Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    /* JADX INFO: renamed from: l.xe5$g */
    public static class C21307g {

        /* JADX INFO: renamed from: a */
        int f193709a;

        /* JADX INFO: renamed from: b */
        int f193710b;

        /* JADX INFO: renamed from: c */
        int f193711c;

        /* JADX INFO: renamed from: d */
        int f193712d;

        /* JADX INFO: renamed from: e */
        int f193713e;

        /* JADX INFO: renamed from: f */
        int f193714f;

        /* JADX INFO: renamed from: g */
        int f193715g;

        /* JADX INFO: renamed from: h */
        int f193716h;

        private C21307g() {
            this.f193709a = 0;
            this.f193710b = 0;
            this.f193711c = 0;
            this.f193712d = 0;
            this.f193713e = 0;
            this.f193714f = 0;
            this.f193715g = 0;
            this.f193716h = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210654a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{66, 21, 66, 94}), this.f193716h);
                jSONObject.put(riw.m181611a(new byte[]{93, 8, 82}), this.f193709a);
                jSONObject.put(riw.m181611a(new byte[]{82, 21, 88, 84}), this.f193715g);
                jSONObject.put(riw.m181611a(new byte[]{93, 5, 82}), this.f193710b);
                jSONObject.put(riw.m181611a(new byte[]{81, 20, 87, 84, 15}), this.f193713e);
                jSONObject.put(riw.m181611a(new byte[]{84, 4, 92}), this.f193714f);
                jSONObject.put(riw.m181611a(new byte[]{92, 7, 82}), this.f193711c);
                jSONObject.put(riw.m181611a(new byte[]{83, 15, 85}), this.f193712d);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 119, 53, 124, 116, 4, 10, 92, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$h */
    public static class C21308h {

        /* JADX INFO: renamed from: a */
        int f193717a;

        /* JADX INFO: renamed from: b */
        int f193718b;

        /* JADX INFO: renamed from: c */
        int f193719c;

        /* JADX INFO: renamed from: d */
        int f193720d;

        /* JADX INFO: renamed from: e */
        int f193721e;

        /* JADX INFO: renamed from: f */
        int f193722f;

        /* JADX INFO: renamed from: g */
        int f193723g;

        private C21308h() {
            this.f193717a = 0;
            this.f193718b = 0;
            this.f193719c = 0;
            this.f193720d = 0;
            this.f193721e = 0;
            this.f193722f = 0;
            this.f193723g = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210655a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{93, 8, 82}), this.f193717a);
                jSONObject.put(riw.m181611a(new byte[]{93, 5, 82}), this.f193718b);
                jSONObject.put(riw.m181611a(new byte[]{68, 7, 82}), this.f193719c);
                jSONObject.put(riw.m181611a(new byte[]{83, 15}), this.f193720d);
                jSONObject.put(riw.m181611a(new byte[]{85, 7, 67, 81, 2, 8}), this.f193721e);
                jSONObject.put(riw.m181611a(new byte[]{64, 5, 88}), this.f193722f);
                jSONObject.put(riw.m181611a(new byte[]{84, 4, 92}), this.f193723g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 124, 50, 116, 116, 4, 10, 92, 47, 95, 81, 14, 70, 68, 9, 123, 68, 14, 8, 10, 70}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$i */
    public static class C21309i {

        /* JADX INFO: renamed from: a */
        public int f193724a;

        /* JADX INFO: renamed from: b */
        public int f193725b = -1;

        /* JADX INFO: renamed from: c */
        public String f193726c = "";

        /* JADX INFO: renamed from: d */
        public String f193727d = "";

        /* JADX INFO: renamed from: e */
        public CharSequence f193728e = "";

        /* JADX INFO: renamed from: f */
        public String f193729f = "";

        /* JADX INFO: renamed from: a */
        public JSONObject m210656a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{67, 10, 94, 67}), this.f193725b);
                jSONObject.put(riw.m181611a(new byte[]{89, 5, 82, 94, 5}), this.f193728e);
                jSONObject.put(riw.m181611a(new byte[]{89, 11, 66, 94}), this.f193726c);
                jSONObject.put(riw.m181611a(new byte[]{83, 7, 67, 69, 8, 3, 66}), this.f193727d);
                jSONObject.put(riw.m181611a(new byte[]{83, 9, 68, 89, 21, 20, 73}), this.f193729f);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 2, 20, 85, 7, 69, 82, 65, 53, 89, 11, 117, 82, 21, 7, 89, 10, 17, 125, 50, 41, 126, 70, 126, 85, 11, 3, 83, 18}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: l.xe5$j */
    public static class C21310j {

        /* JADX INFO: renamed from: a */
        int f193730a;

        /* JADX INFO: renamed from: b */
        int f193731b;

        /* JADX INFO: renamed from: c */
        int f193732c;

        /* JADX INFO: renamed from: d */
        int f193733d;

        /* JADX INFO: renamed from: e */
        int f193734e;

        /* JADX INFO: renamed from: f */
        int f193735f;

        /* JADX INFO: renamed from: g */
        int f193736g;

        private C21310j() {
            this.f193730a = 0;
            this.f193731b = 0;
            this.f193732c = 0;
            this.f193733d = 0;
            this.f193734e = 0;
            this.f193735f = 0;
            this.f193736g = 0;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m210657a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{93, 8, 82}), this.f193730a);
                jSONObject.put(riw.m181611a(new byte[]{93, 5, 82}), this.f193731b);
                jSONObject.put(riw.m181611a(new byte[]{92, 7, 82}), this.f193732c);
                jSONObject.put(riw.m181611a(new byte[]{83, 15, 85}), this.f193733d);
                jSONObject.put(riw.m181611a(new byte[]{64, 21, 82}), this.f193734e);
                jSONObject.put(riw.m181611a(new byte[]{69, 7, 67, 81, 2, 8}), this.f193735f);
                jSONObject.put(riw.m181611a(new byte[]{84, 4, 92}), this.f193736g);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(riw.m181611a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 103, 37, 117, 122, HttpTokens.SPACE, 37, 85, 10, 93, 126, 15, 0, 95, 70, 69, 88, 43, 21, 95, 8, 11, 23}), e);
                return jSONObject;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m210558A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return riw.m181611a(new byte[]{126, 73, 112});
        }
        if (packageManager.hasSystemFeature(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14, 110, 91, 4}))) {
            return riw.m181611a(new byte[]{4, 77});
        }
        return packageManager.hasSystemFeature(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14})) ? riw.m181611a(new byte[]{2, 72, 73, 24, 82, 72, 72}) : riw.m181611a(new byte[]{126, 73, 112});
    }

    /* JADX INFO: renamed from: A0 */
    public static Boolean m210559A0(Context context) {
        return Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), riw.m181611a(new byte[]{93, 9, 82, 92, 62, 10, 95, 5, 80, 67, 8, 9, 94}), 0) != 0);
    }

    /* JADX INFO: renamed from: B */
    public static long m210560B() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: B0 */
    private static boolean m210561B0(String str) {
        return str != null && str.matches(riw.m181611a(new byte[]{108, 2, 26}));
    }

    /* JADX INFO: renamed from: C */
    public static int m210562C(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), riw.m181611a(new byte[]{67, 5, 67, 82, 4, 8, 111, 4, 67, 94, 6, 14, 68, 8, 84, 68, 18}));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m210563C0(Context context, String str) {
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
    public static Map<String, String> m210564D() {
        Object obj;
        HashMap map = new HashMap();
        try {
            for (Field field : Class.forName(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 36, 69, 15, 93, 83})).getDeclaredFields()) {
                field.setAccessible(true);
                String lowerCase = field.getName().toLowerCase(Locale.ROOT);
                if (riw.m181611a(new byte[]{88, 9, 66, 67, 77, 70, 69, 21, 84, 69, 77, 70, 82, 9, 80, 69, 5, 74, Tnaf.POW_2_WIDTH, 2, 84, 65, 8, 5, 85, 74, 17, 95, 0, 20, 84, 17, 80, 69, 4, 74, Tnaf.POW_2_WIDTH, 11, 94, 83, 4, 10, 28, 70, 66, 82, 19, 15, 81, 10, 29, 23, 3, 7, 94, 2, 29, 23, 3, 20, 81, 8, 85, 27, 65, 2, 89, 21, 65, 91, 0, 31, 28, 70, 92, 86, 15, 19, 86, 7, 82, 67, 20, 20, 85, 20, 29, 23, 17, 20, 95, 2, 68, 84, 21, 74, Tnaf.POW_2_WIDTH, 0, 88, 89, 6, 3, 66, 22, 67, 94, 15, 18, 28, 70, 82, 71, 20, 57, 81, 4, 88, 27, 65, 5, 64, 19, 110, 86, 3, 15, 2}).contains(lowerCase) && (obj = field.get(null)) != null) {
                    map.put(lowerCase, obj.toString());
                }
            }
            map.put(riw.m181611a(new byte[]{66, 3, 93, 82, 0, 21, 85}), Build.VERSION.RELEASE);
            map.put(riw.m181611a(new byte[]{67, 2, 90}), String.valueOf(Build.VERSION.SDK_INT));
            return map;
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 20, 15, 92, 2, 120, 89, 7, 9, 10, 70}), e);
            return map;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m210565D0(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}));
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    /* JADX INFO: renamed from: E */
    public static int m210566E() {
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 83, 22, 68, 7, 78, 5, 64, 19, 87, 69, 4, 23, 31, 5, 65, 66, 8, 8, 86, 9, 110, 90, 0, 30, 111, 0, 67, 82, Tnaf.POW_2_WIDTH})));
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
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 7, 73, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: E0 */
    private static boolean m210567E0() {
        String str = System.getenv(riw.m181611a(new byte[]{96, 39, 101, 127}));
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(riw.m181611a(new byte[]{10}));
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            arrayList.add(str2 + riw.m181611a(new byte[]{31, 21, 68}));
            arrayList.add(str2 + riw.m181611a(new byte[]{31, 2, 80, 82, 12, 9, 94, 21, 68}));
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
    public static int m210568F() {
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 83, 22, 68, 7, 78, 5, 64, 19, 87, 69, 4, 23, 31, 5, 65, 66, 8, 8, 86, 9, 110, 90, 8, 8, 111, 0, 67, 82, Tnaf.POW_2_WIDTH})));
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
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 15, 95, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e);
            return i;
        }
    }

    /* JADX INFO: renamed from: F0 */
    private static boolean m210569F0() {
        return new File(riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 80, 71, 17, 73, 99, 19, 65, 82, 19, 19, 67, 3, 67, 25, 0, 22, 91})).exists();
    }

    /* JADX INFO: renamed from: G */
    public static int m210570G(Context context) {
        try {
            return ((CameraManager) context.getSystemService(riw.m181611a(new byte[]{83, 7, 92, 82, 19, 7}))).getCameraIdList().length;
        } catch (Throwable th) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 81, 5, 82, 82, 18, 21, 89, 8, 86, 23, 2, 7, 93, 3, 67, 86, 91, 70}), th);
            return -1;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: G0 */
    private static synchronized void m210571G0(TelephonyManager telephonyManager, C21307g c21307g, C21304d c21304d, C21308h c21308h, C21310j c21310j) {
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        if (allCellInfo != null && !allCellInfo.isEmpty()) {
            Iterator<CellInfo> it = allCellInfo.iterator();
            while (it.hasNext()) {
                TelephonyManager telephonyManager2 = telephonyManager;
                C21307g c21307g2 = c21307g;
                C21304d c21304d2 = c21304d;
                C21308h c21308h2 = c21308h;
                C21310j c21310j2 = c21310j;
                m210573H0(telephonyManager2, it.next(), c21307g2, c21304d2, c21308h2, c21310j2);
                telephonyManager = telephonyManager2;
                c21307g = c21307g2;
                c21304d = c21304d2;
                c21308h = c21308h2;
                c21310j = c21310j2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private static List<JSONObject> m210572H(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(riw.m181611a(new byte[]{83, 7, 92, 82, 19, 7}));
            if (cameraManager == null) {
                Log.e(f193669a, riw.m181611a(new byte[]{115, 7, 92, 82, 19, 7, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93}));
                return arrayList;
            }
            for (String str : cameraManager.getCameraIdList()) {
                C21305e c21305e = new C21305e();
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                m210581L0(cameraCharacteristics, c21305e);
                c21305e.f193702b = m210574I(cameraCharacteristics);
                m210583M0(cameraCharacteristics, c21305e);
                c21305e.f193704d = m210602c0(cameraCharacteristics, CameraCharacteristics.SENSOR_ORIENTATION);
                c21305e.f193705e = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                c21305e.f193706f = m210602c0(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                c21305e.f193707g = m210602c0(cameraCharacteristics, CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                c21305e.f193708h = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                arrayList.add(c21305e.m210652a());
            }
            return arrayList;
        } catch (Throwable th) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 123, 8, 21, 68, 70, 101, 95, 19, 9, 71, 7, 83, 91, 4, 92, Tnaf.POW_2_WIDTH}), th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: H0 */
    private static synchronized void m210573H0(TelephonyManager telephonyManager, CellInfo cellInfo, C21307g c21307g, C21304d c21304d, C21308h c21308h, C21310j c21310j) {
        try {
            if (telephonyManager.getPhoneType() == 0) {
                return;
            }
            if (cellInfo instanceof CellInfoGsm) {
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                c21307g.f193710b = cellIdentity.getMcc();
                int mnc = cellIdentity.getMnc();
                c21307g.f193709a = mnc;
                if (c21307g.f193710b != Integer.MAX_VALUE && mnc != Integer.MAX_VALUE) {
                    CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                    c21307g.f193711c = cellIdentity.getLac();
                    c21307g.f193712d = cellIdentity.getCid();
                    c21307g.f193713e = cellIdentity.getArfcn();
                    c21307g.f193715g = cellIdentity.getBsic();
                    c21307g.f193714f = cellSignalStrength.getDbm();
                }
            } else if (cellInfo instanceof CellInfoCdma) {
                CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                CellSignalStrengthCdma cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                c21304d.f193695a = cellIdentity2.getNetworkId();
                c21304d.f193696b = cellIdentity2.getSystemId();
                c21304d.f193698d = cellIdentity2.getLatitude();
                c21304d.f193699e = cellIdentity2.getLongitude();
                c21304d.f193697c = cellIdentity2.getBasestationId();
                c21304d.f193700f = cellSignalStrength2.getCdmaDbm();
            } else if (cellInfo instanceof CellInfoLte) {
                if (!cellInfo.isRegistered()) {
                    return;
                }
                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                c21308h.f193717a = cellIdentity3.getMnc();
                int mcc = cellIdentity3.getMcc();
                c21308h.f193718b = mcc;
                if (c21308h.f193717a != Integer.MAX_VALUE && mcc != Integer.MAX_VALUE) {
                    CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                    c21308h.f193719c = cellIdentity3.getTac();
                    c21308h.f193720d = cellIdentity3.getCi();
                    c21308h.f193722f = cellIdentity3.getPci();
                    c21308h.f193721e = cellIdentity3.getEarfcn();
                    c21308h.f193723g = cellSignalStrength3.getDbm();
                }
            } else if (cellInfo instanceof CellInfoWcdma) {
                CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                c21310j.f193730a = cellIdentity4.getMnc();
                int mcc2 = cellIdentity4.getMcc();
                c21310j.f193731b = mcc2;
                if (c21310j.f193730a != Integer.MAX_VALUE && mcc2 != Integer.MAX_VALUE) {
                    c21310j.f193735f = cellIdentity4.getUarfcn();
                    c21310j.f193734e = cellIdentity4.getPsc();
                    c21310j.f193733d = cellIdentity4.getCid();
                    c21310j.f193732c = cellIdentity4.getLac();
                    c21310j.f193736g = cellSignalStrength4.getDbm();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    private static int m210574I(CameraCharacteristics cameraCharacteristics) {
        Size[] outputSizes;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null || outputSizes.length <= 0) {
                return 0;
            }
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), new C21306f());
            return (size.getWidth() * size.getHeight()) / 10000;
        } catch (AssertionError e) {
            Log.e(f193669a, riw.m181611a(new byte[]{113, 21, 66, 82, 19, 18, 89, 9, 95, 114, 19, 20, 95, 20, 17, 80, 4, 18, 115, 7, 92, 82, 19, 7, 96, 15, 73, 82, HttpTokens.CARRIAGE_RETURN, 21, 10, 70}), e);
            return 0;
        } catch (Exception e2) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 103, 8, 30, 85, 10, 66, HttpTokens.CARRIAGE_RETURN, 65}), e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: I0 */
    private static double[] m210575I0() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 67, 18, 80, 67}), riw.m181611a(new byte[]{66}));
            try {
                String line = randomAccessFile.readLine();
                if (line == null) {
                    randomAccessFile.close();
                    return null;
                }
                String[] strArrSplit = line.split(riw.m181611a(new byte[]{108, 21, 26}));
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
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 8, 8, 87, 70, 114, 103, 52, 70, 68, 15, 92, 82, 18, 92, Tnaf.POW_2_WIDTH}), e);
            return null;
        }
        Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 8, 8, 87, 70, 114, 103, 52, 70, 68, 15, 92, 82, 18, 92, Tnaf.POW_2_WIDTH}), e);
        return null;
    }

    /* JADX INFO: renamed from: J */
    private static int m210576J(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.isEmpty()) {
                    String[] strArrSplit = line.split(riw.m181611a(new byte[]{29}));
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
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 14, 20, 85, 21, 119, 69, 14, 11, 118, 15, 93, 82, 91, 70}) + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: J0 */
    private static int m210577J0(String str) {
        if (!f2j0.m123618b(str)) {
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
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 66, 3, 80, 83, 39, 15, 66, 21, 69, 123, 8, 8, 85, HttpTokens.SPACE, 67, 88, 12, 53, 73, 21, 69, 82, 12, HttpTokens.SPACE, 89, 10, 84, HttpTokens.CARRIAGE_RETURN, 65}) + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: K */
    public static String m210578K() {
        String property = System.getProperty(riw.m181611a(new byte[]{95, 21, 31, 86, 19, 5, 88}));
        String upperCase = property != null ? property.toUpperCase(Locale.ENGLISH) : "";
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        String upperCase2 = (strArr.length > 0 ? strArr[0] : "").toUpperCase(Locale.ENGLISH);
        if (upperCase.startsWith(riw.m181611a(new byte[]{125, 47, 97, 100}))) {
            return riw.m181611a(new byte[]{93, 15, 65, 68});
        }
        if (upperCase.equals(riw.m181611a(new byte[]{113, 39, 99, 116, 41, 80, 4})) || upperCase.startsWith(riw.m181611a(new byte[]{113, 52, 124})) || upperCase2.startsWith(riw.m181611a(new byte[]{113, 52, 124}))) {
            return riw.m181611a(new byte[]{81, 20, 92});
        }
        return (upperCase.equals(riw.m181611a(new byte[]{121, 80, 9, 1})) || upperCase.equals(riw.m181611a(new byte[]{104, 94, 7, 104, 87, 82})) || upperCase2.startsWith(riw.m181611a(new byte[]{104, 94, 7}))) ? riw.m181611a(new byte[]{72, 94, 7}) : riw.m181611a(new byte[]{69, 8, 90, 89, 14, 17, 94});
    }

    /* JADX INFO: renamed from: K0 */
    private static String m210579K0() {
        String strM181611a = riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 70, 3, 67, 68, 8, 9, 94});
        if (!f2j0.m123618b(strM181611a)) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(strM181611a)));
            try {
                String line = bufferedReader.readLine();
                if (line == null || !line.startsWith(riw.m181611a(new byte[]{124, 15, 95, 66, 25, 70, 70, 3, 67, 68, 8, 9, 94}))) {
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
            Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 91, 3, 67, 89, 4, 10, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8, 17, 81, 19, 9, 93, 70}) + strM181611a, e);
        }
        Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 91, 3, 67, 89, 4, 10, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8, 17, 81, 19, 9, 93, 70}) + strM181611a, e);
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static String[] m210580L() {
        String str;
        String str2 = null;
        try {
            Iterator<String> it = f2j0.m123621e(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 83, 22, 68, 94, 15, 0, 95})).iterator();
            str = null;
            while (it.hasNext()) {
                try {
                    String[] strArrSplit = it.next().split(riw.m181611a(new byte[]{10}));
                    if (strArrSplit.length == 2) {
                        String strTrim = strArrSplit[0].trim();
                        String strTrim2 = strArrSplit[1].trim();
                        if (strTrim.equals(riw.m181611a(new byte[]{120, 7, 67, 83, 22, 7, 66, 3})) || strTrim.equals(riw.m181611a(new byte[]{70, 3, 95, 83, 14, 20, 111, 15, 85}))) {
                            str2 = strTrim2;
                        } else if (strTrim.equals(riw.m181611a(new byte[]{96, 20, 94, 84, 4, 21, 67, 9, 67})) || strTrim.equals(riw.m181611a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN, 70, 94, 7, 92, 82}))) {
                            str = strTrim2;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 121, 8, 87, 88, 91, 70}) + e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        return new String[]{str, str2};
    }

    /* JADX INFO: renamed from: L0 */
    private static void m210581L0(CameraCharacteristics cameraCharacteristics, C21305e c21305e) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            if (num.intValue() == 0) {
                c21305e.f193701a = 1;
            } else if (num.intValue() == 1) {
                c21305e.f193701a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static double m210582M() {
        double[] dArrM210575I0;
        int i = Build.VERSION.SDK_INT;
        double dMax = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (i < 26 && (dArrM210575I0 = m210575I0()) != null) {
            double d = dArrM210575I0[0];
            double d2 = dArrM210575I0[1];
            if (f193673e) {
                f193673e = false;
                f193674f = d;
                f193675g = d2;
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            double d3 = f193675g;
            double d4 = (d2 + d) - (f193674f + d3);
            if (d4 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dMax = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(Math.round((((d2 - d3) * 100.0d) / d4) * 100.0d) / 100.0d, 100.0d));
            }
            f193675g = d2;
            f193674f = d;
        }
        return dMax;
    }

    /* JADX INFO: renamed from: M0 */
    private static void m210583M0(CameraCharacteristics cameraCharacteristics, C21305e c21305e) {
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr != null) {
            Arrays.sort(fArr);
            c21305e.f193703c = fArr[fArr.length - 1];
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m210584N(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(riw.m181611a(new byte[]{81, 5, 69, 94, 23, 15, 68, 31}));
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
    public static String m210585O() {
        try {
            return (String) Class.forName(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 80, 71, 17, 72, 113, 5, 69, 94, 23, 15, 68, 31, 101, 95, 19, 3, 81, 2})).getMethod(riw.m181611a(new byte[]{83, 19, 67, 69, 4, 8, 68, 54, 67, 88, 2, 3, 67, 21, 127, 86, 12, 3}), null).invoke(null, null);
        } catch (Throwable th) {
            Log.e(riw.m181611a(new byte[]{113, 22, 65, 126, 15, 0, 95}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 65, 69, 14, 5, 85, 21, 66, 23, 15, 7, 93, 3, 17, 85, 24, 70, 113, 5, 69, 94, 23, 15, 68, 31, 101, 95, 19, 3, 81, 2}), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public static String m210586P() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static Map<String, Boolean> m210587Q() {
        HashMap map = new HashMap();
        map.put(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 4, 69, 21, 30, 66, 18, 4}), Boolean.valueOf(m210646y0(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 4, 69, 21, 30, 66, 18, 4}))));
        map.put(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 8, 85, 18, 30, 64, HttpTokens.CARRIAGE_RETURN, 7, 94, 86}), Boolean.valueOf(m210646y0(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 8, 85, 18, 30, 64, HttpTokens.CARRIAGE_RETURN, 7, 94, 86}))));
        return map;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    /* JADX INFO: renamed from: R */
    private static String m210588R(int i, Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        try {
            return m210600b0(riw.m181611a(new byte[]{87, 3, 69, 100, 20, 4, 67, 5, 67, 94, 3, 3, 66, 47, 85}), i, context);
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 6, 3, 68, 47, 92, 68, 8, 62, Tnaf.POW_2_WIDTH, 3, 67, 69, 14, 20, 10, 70}), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static Map<String, String> m210589S(Context context) {
        HashMap map = new HashMap();
        for (InputMethodInfo inputMethodInfo : ((InputMethodManager) context.getSystemService(riw.m181611a(new byte[]{89, 8, 65, 66, 21, 57, 93, 3, 69, 95, 14, 2}))).getInputMethodList()) {
            map.put(f2j0.m123624h(inputMethodInfo.getId()), inputMethodInfo.loadLabel(context.getPackageManager()).toString());
        }
        return map;
    }

    /* JADX INFO: renamed from: T */
    public static String m210590T() {
        String strM210579K0 = m210579K0();
        return (strM210579K0 == null || strM210579K0.isEmpty()) ? System.getProperty(riw.m181611a(new byte[]{95, 21, 31, 65, 4, 20, 67, 15, 94, 89})) : strM210579K0;
    }

    /* JADX INFO: renamed from: U */
    public static String m210591U() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: V */
    public static String m210592V(Context context, int i) {
        try {
            if (!or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) || Build.VERSION.SDK_INT >= 29) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}));
            return (String) telephonyManager.getClass().getMethod(riw.m181611a(new byte[]{87, 3, 69, 122, 4, 15, 84}), Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public static List<String> m210593W(Context context) {
        StorageManager storageManager = (StorageManager) context.getSystemService(riw.m181611a(new byte[]{67, 18, 94, 69, 0, 1, 85}));
        ArrayList arrayList = new ArrayList();
        try {
            Method method = storageManager.getClass().getMethod(riw.m181611a(new byte[]{87, 3, 69, 97, 14, 10, 69, 11, 84, 103, 0, 18, 88, 21}), null);
            Method method2 = storageManager.getClass().getMethod(riw.m181611a(new byte[]{87, 3, 69, 97, 14, 10, 69, 11, 84, 100, 21, 7, 68, 3}), String.class);
            String[] strArr = (String[]) method.invoke(storageManager, null);
            if (strArr != null) {
                for (String str : strArr) {
                    if (riw.m181611a(new byte[]{93, 9, 68, 89, 21, 3, 84}).equals((String) method2.invoke(storageManager, str))) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 47, 92, 10, 84, 80, 0, 10, Tnaf.POW_2_WIDTH, 7, 82, 84, 4, 21, 67, 92, 17}), e);
        } catch (NoSuchMethodException e2) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 43, 85, 18, 89, 88, 5, 70, 94, 9, 69, 23, 7, 9, 69, 8, 85, HttpTokens.CARRIAGE_RETURN, 65}), e2);
        } catch (InvocationTargetException e3) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 65, 47, 94, Tnaf.POW_2_WIDTH, 94, 84, 0, 18, 89, 9, 95, 23, 21, 7, 66, 1, 84, 67, 65, 3, 72, 5, 84, 71, 21, 15, 95, 8, 11, 23}), e3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public static Map<String, String> m210594X() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (true) {
            String[] strArr = f193680l;
            if (i >= strArr.length) {
                return linkedHashMap;
            }
            try {
                linkedHashMap.put(strArr[i], Build.VERSION.SDK_INT > 28 ? new String(Coded.doCommand2(i, 1)) : new String(Coded.doCommand2(i, 0)));
            } catch (Exception e) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 121, 0, 18, 89, Tnaf.POW_2_WIDTH, 84, 113, 20, 8, 83, 47, 95, 81, 14, 92, Tnaf.POW_2_WIDTH}) + e);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static int m210595Y() {
        File[] fileArrListFiles;
        try {
            int iM210576J = m210576J(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 64, 9, 66, 68, 8, 4, 92, 3}));
            if (iM210576J == -1) {
                iM210576J = m210576J(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73, 64, 20, 84, 68, 4, 8, 68}));
            }
            return (iM210576J != -1 || (fileArrListFiles = new File(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 2, 85, Tnaf.POW_2_WIDTH, 88, 84, 4, 21, 31, 21, 72, 68, 21, 3, 93, 73, 82, 71, 20, 73})).listFiles(f193672d)) == null) ? iM210576J : fileArrListFiles.length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static Map<String, String> m210596Z() {
        HashMap map = new HashMap();
        try {
            IBinder iBinderM168044a = qre0.m177538a().m177540c().m168044a();
            if (iBinderM168044a == null) {
                map.put(riw.m181611a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 115, 94, 15, 2, 85, 20}), "");
                return map;
            }
            map.put(riw.m181611a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 115, 94, 15, 2, 85, 20}), iBinderM168044a.getClass().getName());
            Class<?>[] interfaces = iBinderM168044a.getClass().getInterfaces();
            if (interfaces.length > 0) {
                map.put(riw.m181611a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 95, 67, 4, 20, 86, 7, 82, 82}), interfaces[0].getName());
            } else {
                map.put(riw.m181611a(new byte[]{96, 14, 94, 89, 4, 43, 81, 8, 80, 80, 4, 20, 29, 47, 95, 67, 4, 20, 86, 7, 82, 82}), "");
            }
            ClassLoader classLoader = iBinderM168044a.getClass().getClassLoader();
            map.put(riw.m181611a(new byte[]{92, 9, 80, 83, 4, 20}), classLoader != null ? classLoader.toString() : "");
            return map;
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 103, 9, 9, 94, 3, 124, 86, 15, 7, 87, 3, 67, 126, 15, 0, 95, 92, 17}) + e);
            return map;
        }
    }

    /* JADX INFO: renamed from: a0 */
    private static String m210598a0(int i) {
        if (i == 1) {
            return riw.m181611a(new byte[]{81, 5});
        }
        if (i != 2) {
            return i != 4 ? riw.m181611a(new byte[]{94, 9, 95, 82}) : riw.m181611a(new byte[]{71, 15, 67, 82, HttpTokens.CARRIAGE_RETURN, 3, 67, 21});
        }
        return riw.m181611a(new byte[]{69, 21, 83});
    }

    /* JADX INFO: renamed from: b */
    public static boolean m210599b(Context context) {
        String packageName = context.getPackageName();
        if (f193679k != null) {
            return false;
        }
        try {
            f193679k = new LocalServerSocket(packageName);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private static String m210600b0(String str, int i, Context context) {
        String string = null;
        try {
            Object objInvoke = TelephonyManager.class.getMethod(str, Integer.TYPE).invoke((TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4})), Integer.valueOf(i));
            if (objInvoke != null) {
                string = objInvoke.toString();
            }
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 52, 84, 81, HttpTokens.CARRIAGE_RETURN, 3, 72, 43, 84, 67, 9, 9, 84, 49, 88, 67, 9, 47, 84}), e);
        }
        return string != null ? string : "";
    }

    /* JADX INFO: renamed from: c */
    public static boolean m210601c(Context context) {
        return m210569F0() || m210634s0(context) || m210567E0();
    }

    /* JADX INFO: renamed from: c0 */
    private static int m210602c0(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<Integer> key) {
        Integer num = (Integer) cameraCharacteristics.get(key);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m210603d(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 2, 90, 65, 4, 20, 67, 15, 94, 89}), xiw.m211171b());
            } catch (Exception e) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 23, 50, 34, 123, 70, 71, 82, 19, 21, 89, 9, 95, HttpTokens.CARRIAGE_RETURN, 65}), e);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{95, 21, 110, 65, 4, 20, 67, 15, 94, 89}), Build.VERSION.RELEASE);
            } catch (Exception e2) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 23, 35, 19, 89, 10, 85, 25, 55, 35, 98, 53, 120, 120, 47, 72, 98, 35, 125, 114, HttpTokens.SPACE, 53, 117, 92, 17}), e2);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{93, 3, 88, 83}), m210592V(context, 0));
            } catch (Exception e3) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 4, 15, 84, 92, 17}), e3);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{68, 15, 92, 82, 62, 28, 95, 8, 84}), m210620l0());
            } catch (Exception e4) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 8, 11, 85, 60, 94, 89, 4, 92, Tnaf.POW_2_WIDTH}), e4);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), Long.valueOf(m210560B()));
            } catch (Exception e5) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 14, 9, 68, 50, 88, 90, 4, 92, Tnaf.POW_2_WIDTH}), e5);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{82, 20, 88, 80, 9, 18, 94, 3, 66, 68}), Integer.valueOf(m210562C(context)));
            } catch (Exception e6) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 19, 15, 87, 14, 69, 89, 4, 21, 67, 92, 17}), e6);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{82, 7, 69, 67, 4, 20, 73}), m210641w(context));
            } catch (Exception e7) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 40, 8, 86, 9, 11, 23}), e7);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{69, 21, 84, 69, 62, 7, 87, 3, 95, 67}), m210628p0(context));
            } catch (Exception e8) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 98, 18, 3, 66, 39, 86, 82, 15, 18, 10, 70}), e8);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{94, 3, 69, 104, 21, 20, 81, 0, 87, 94, 2}), m210624n0());
            } catch (Exception e9) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 19, 7, 86, 0, 88, 84, 18, 43, 81, 22, 11, 23}), e9);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{93, 9, 82, 92, 62, 10, 95, 5, 80, 67, 8, 9, 94}), m210559A0(context));
            } catch (Exception e10) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 124, 88, 2, HttpTokens.CARRIAGE_RETURN, 124, 9, 82, 86, 21, 15, 95, 8, 116, 89, 0, 4, 92, 3, 85, HttpTokens.CARRIAGE_RETURN, 65}), e10);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 2, 9, 69, 8, 69}), Integer.valueOf(m210595Y()));
            } catch (Exception e11) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 121, 20, 11, 82, 3, 67, 120, 7, 37, 96, 51, 114, 88, 19, 3, 67, 92, 17}), e11);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 12, 7, 72, 57, 87, 69, 4, 23}), Integer.valueOf(m210566E()));
            } catch (Exception e12) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 7, 73, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e12);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 12, 15, 94, 57, 87, 69, 4, 23}), Integer.valueOf(m210568F()));
            } catch (Exception e13) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 49, 51, 125, 15, 95, 113, 19, 3, 65, 45, 121, 77, 91, 70}) + e13);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 21, 3, 93, 22, 84, 69, 0, 18, 69, 20, 84}), m210616j0());
            } catch (Exception e14) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 4, 11, 64, 3, 67, 86, 21, 19, 66, 3, 11, 23}) + e14);
            }
            try {
                String[] strArrM210580L = m210580L();
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 12, 9, 84, 3, 93}), strArrM210580L[0]);
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 23, 3, 94, 2, 94, 69}), strArrM210580L[1]);
            } catch (Exception e15) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 121, 8, 87, 88, 91, 70}) + e15);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, 0, 20, 83, 14}), m210578K());
            } catch (Exception e16) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 113, 20, 82, 95, 91, 70}) + e16);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 22, 68, 104, HttpTokens.CARRIAGE_RETURN, 9, 81, 2}), Double.valueOf(m210582M()));
            } catch (Exception e17) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 17, 19, 101, 21, 80, 80, 4, 92, Tnaf.POW_2_WIDTH}) + e17);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 7, 92, 82, 19, 7, 111, 5, 94, 66, 15, 18}), Integer.valueOf(m210570G(context)));
            } catch (Exception e18) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 116, 14, 19, 94, 18, 11, 23}) + e18);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 7, 92, 82, 19, 7, 111, 2, 84, 67, 0, 15, 92}), m210572H(context));
            } catch (Exception e19) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 116, 0, 11, 85, 20, 80, 123, 8, 21, 68, 92, 17}) + e19);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{82, 19, 88, 91, 5, 57, 89, 8, 87, 88}), m210564D());
            } catch (Exception e20) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 20, 15, 92, 2, 120, 89, 7, 9, 10, 70}) + e20);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{89, 8, 65, 66, 21, 57, 93, 3, 69, 95, 14, 2, 67}), m210589S(context));
            } catch (Exception e21) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 126, 15, 22, 69, 18, 124, 82, 21, 14, 95, 2, 125, 94, 18, 18, 10, 70}) + e21);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{81, 5, 82, 82, 18, 21, 89, 4, 88, 91, 8, 18, 73}), m210623n(context));
            } catch (Exception e22) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 2, 5, 85, 21, 66, 94, 3, 15, 92, 15, 69, 78, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 42, 89, 21, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e22);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 8, 8, 86, 9}), m210645y(context));
            } catch (Exception e23) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 121, 8, 87, 88, 91, 70}) + e23);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 3, 93, 91, 62, 15, 94, 0, 94}), m210627p(context));
            } catch (Exception e24) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, HttpTokens.CARRIAGE_RETURN, 10, 115, 3, 93, 91, 40, 8, 86, 9, 11, 23}) + e24);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{93, 9, 68, 89, 21, 3, 84, 57, 65, 88, 8, 8, 68, 21, 110, 91, 8, 21, 68}), m210593W(context));
            } catch (Exception e25) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 122, 14, 19, 94, 18, 84, 83, 49, 9, 89, 8, 69, 68, 91, 70}) + e25);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 15, 92, 104, 2, 9, 69, 8, 69}), Integer.valueOf(m210604d0(context)));
            } catch (Exception e26) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 115, 9, 68, 89, 21, 92, Tnaf.POW_2_WIDTH}) + e26);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 15, 92, 104, 20, 21, 85, 2, 110, 84, 14, 19, 94, 18}), Integer.valueOf(m210610g0(xiw.m211170a())));
            } catch (Exception e27) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 101, 21, 84, 83, 34, 9, 69, 8, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e27);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{89, 21, 110, 68, 8, 11, 83, 7, 67, 83, 62, 20, 85, 7, 85, 78}), Boolean.valueOf(m210565D0(context)));
            } catch (Exception e28) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 98, 94, 12, 37, 81, 20, 85, 101, 4, 7, 84, 31, 11, 23}) + e28);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 15, 92, 104, 8, 8, 86, 9}), m210608f0(context));
            } catch (Exception e29) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 8, 11, 125, 19, 93, 67, 8, 47, 94, 0, 94, HttpTokens.CARRIAGE_RETURN, 65}) + e29);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{89, 21, 110, 69, 14, 9, 68}), Boolean.valueOf(m210601c(context)));
            } catch (Exception e30) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 52, 95, 9, 69, HttpTokens.CARRIAGE_RETURN, 65}) + e30);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{91, 3, 67, 89, 4, 10, 111, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8}), m210590T());
            } catch (Exception e31) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 124, 4, 20, 94, 3, 93, 97, 4, 20, 67, 15, 94, 89, 91, 70}) + e31);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{92, 7, 95, 80, 20, 7, 87, 3}), m210591U());
            } catch (Exception e32) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 123, 0, 8, 87, 19, 80, 80, 4, 92, Tnaf.POW_2_WIDTH}) + e32);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 9, 93, 91, 4, 5, 68, 57, 71, 94, 19, 18, 69, 7, 93, 104, 8, 8, 86, 9, 110, 83, 4, 18, 81, 15, 93}), m210605e(context));
            } catch (Exception e33) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 113, 8, 10, 85, 35, 73, 94, 18, 18, 125, 7, 65, HttpTokens.CARRIAGE_RETURN, 65}) + e33);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 9, 93, 91, 4, 5, 68, 57, 67, 82, 0, 10, 111, 11, 80, 84, 9, 15, 94, 3, 110, 94, 15, 0, 95}), m210587Q());
            } catch (Exception e34) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 113, 8, 10, 85, 35, 73, 94, 18, 18, 125, 7, 65, HttpTokens.CARRIAGE_RETURN, 65}) + e34);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{68, 5, 65, 104, 17, 9, 66, 18, 110, 91, 8, 21, 68}), m210625o());
            } catch (Exception e35) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 2, 18, 89, Tnaf.POW_2_WIDTH, 84, 99, 2, 22, 96, 9, 67, 67, 45, 15, 67, 18, 11, 23}) + e35);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{81, 10, 93, 104, 18, 3, 94, 21, 94, 69, 62, 10, 89, 21, 69}), m210629q(context));
            } catch (Exception e36) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, HttpTokens.CARRIAGE_RETURN, 10, 99, 3, 95, 68, 14, 20, 124, 15, 66, 67, 91, 70}) + e36);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{68, 9, 65, 104, 21, 7, 67, HttpTokens.CARRIAGE_RETURN}), m210622m0(context));
            } catch (Exception e37) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 99, 14, 22, 100, 7, 66, 92, 91, 70}) + e37);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{81, 22, 65, 104, 8, 8, 86, 9}), m210631r(context));
            } catch (Exception e38) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 118, 17, 22, 121, 8, 87, 88, 91, 70}) + e38);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 9, 82, 92, 4, 18, 111, 9, 82, 84, 20, 22, 73}), Boolean.valueOf(m210599b(context)));
            } catch (Exception e39) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 14, 84, 84, 10, 42, 95, 5, 80, 91, 50, 3, 66, Tnaf.POW_2_WIDTH, 84, 69, 50, 9, 83, HttpTokens.CARRIAGE_RETURN, 84, 67, 91, 70}) + e39);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{67, 18, 80, 84, 10, 57, 68, 20, 80, 84, 4}), m210612h0());
            } catch (Exception e40) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 100, 21, 7, 83, HttpTokens.CARRIAGE_RETURN, 101, 69, 0, 5, 85, 92, 17}) + e40);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{89, 21, 110, 84, 20, 21, 68, 9, 92, 94, 27, 3, 84, 57, 67, 88, 12}), Boolean.valueOf(m210644x0()));
            } catch (Exception e41) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 114, 66, 18, 18, 95, 11, 88, 77, 4, 2, 98, 9, 92, HttpTokens.CARRIAGE_RETURN, 65}) + e41);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{64, 14, 94, 89, 4, 57, 93, 7, 95, 86, 6, 3, 66, 57, 88, 89, 7, 9}), m210596Z());
            } catch (Throwable th) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 103, 9, 9, 94, 3, 124, 86, 15, 7, 87, 3, 67, 126, 15, 0, 95, 92, 17}) + th);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{71, 15, 95, 83, 14, 17, 111, 11, 80, 89, 0, 1, 85, 20, 110, 94, 15, 0, 95}), m210630q0());
            } catch (Throwable th2) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 96, 8, 8, 84, 9, 70, 122, 0, 8, 81, 1, 84, 69, 40, 8, 86, 9, 11, 23}) + th2);
            }
            try {
                linkedHashMap.put(riw.m181611a(new byte[]{83, 9, 65, 84, 14, 2, 85}), m210594X());
            } catch (Exception e42) {
                Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 121, 0, 18, 89, Tnaf.POW_2_WIDTH, 84, 113, 20, 8, 83, 47, 95, 81, 14, 92, Tnaf.POW_2_WIDTH}) + e42);
            }
        } catch (Throwable th3) {
            Log.e(riw.m181611a(new byte[]{100, 39, 118}), riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 115, 9, 93, 91, 4, 5, 68, 9, 67, 23, 2, 9, 92, 10, 84, 84, 21, 92, Tnaf.POW_2_WIDTH}) + th3);
        }
        return f2j0.m123620d(linkedHashMap);
    }

    /* JADX INFO: renamed from: d0 */
    public static int m210604d0(Context context) {
        int activeSubscriptionInfoCountMax = 1;
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(riw.m181611a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}));
            activeSubscriptionInfoCountMax = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoCountMax() : 1;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}));
            return telephonyManager != null ? telephonyManager.getPhoneCount() : activeSubscriptionInfoCountMax;
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 18, 88, 89, 6, 70, 99, 47, 124, 23, 2, 9, 69, 8, 69}), e);
            return activeSubscriptionInfoCountMax;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, Map<String, String>> m210605e(Context context) {
        HashMap map = new HashMap();
        m210609g(map);
        m210611h(map);
        m210613i(context, map);
        return map;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e0 */
    private static void m210606e0(Context context, List<JSONObject> list) {
        SubscriptionManager subscriptionManager;
        if (or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36})) && (subscriptionManager = (SubscriptionManager) context.getSystemService(riw.m181611a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}))) != null) {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null) {
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        C21309i c21309i = new C21309i();
                        c21309i.f193724a = subscriptionInfo.getSubscriptionId();
                        c21309i.f193727d = (String) subscriptionInfo.getCarrierName();
                        c21309i.f193728e = subscriptionInfo.getIccId();
                        c21309i.f193725b = subscriptionInfo.getSimSlotIndex();
                        c21309i.f193729f = subscriptionInfo.getCountryIso();
                        try {
                            c21309i.f193726c = m210588R(c21309i.f193724a, context);
                        } catch (Exception e) {
                            Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 40, 8, 86, 9, 119, 88, 19, 42, 95, 10, 93, 94, 17, 9, 64, 39, 95, 83, HttpTokens.SPACE, 4, 95, Tnaf.POW_2_WIDTH, 84, 23, 6, 3, 68, 47, 92, 68, 8, 62}), e);
                        }
                        list.add(c21309i.m210656a());
                    }
                }
            } catch (Exception e2) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 40, 8, 86, 9, 119, 88, 19, 42, 95, 10, 93, 94, 17, 9, 64, 39, 95, 83, HttpTokens.SPACE, 4, 95, Tnaf.POW_2_WIDTH, 84}), e2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m210607f(String str, String[] strArr, Map<String, Map<String, String>> map) {
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
    public static List<JSONObject> m210608f0(Context context) {
        ArrayList arrayList = new ArrayList();
        m210606e0(context, arrayList);
        return f2j0.m123622f(arrayList);
    }

    /* JADX INFO: renamed from: g */
    private static void m210609g(Map<String, Map<String, String>> map) {
        String strM181611a = riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 93, 94, 3});
        String[] strArr = f193676h;
        m210607f(strM181611a, strArr, map);
        m210607f(riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 83, 94, 15}), f193677i, map);
        m210607f(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 11, 95, 2, 68, 91, 4}), strArr, map);
        m210607f(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 11, 89, 21, 82, 24}), new String[]{riw.m181611a(new byte[]{70, 4, 94, 79}), riw.m181611a(new byte[]{65, 3, 92, 66}), riw.m181611a(new byte[]{70, 14, 94, 68, 21, 75, 94, 3, 69})}, map);
        m210607f(riw.m181611a(new byte[]{31, 2, 84, 65}), new String[]{riw.m181611a(new byte[]{70, 4, 94, 79}), riw.m181611a(new byte[]{65, 3, 92, 66}), riw.m181611a(new byte[]{70, 14, 94, 68, 21, 75, 94, 3, 69}), riw.m181611a(new byte[]{68, 18, 88, 71, 2, 57})}, map);
        m210640v0(riw.m181611a(new byte[]{31, 2, 84, 65, 78, 57, 111, 22, 67, 88, 17, 3, 66, 18, 88, 82, 18, 57, 111}), new String[]{riw.m181611a(new byte[]{70, 4, 94, 79}), riw.m181611a(new byte[]{65, 3, 92, 66}), riw.m181611a(new byte[]{85, 18, 89}), riw.m181611a(new byte[]{71, 15, 95, 83, 14, 17, 67}), riw.m181611a(new byte[]{82, 10, 68, 82, 18, 18, 81, 5, 90, 68})}, map);
        m210640v0(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 94, 3, 69, 24, 0, 20, 64}), new String[]{riw.m181611a(new byte[]{85, 18, 89})}, map);
        m210640v0(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 94, 3, 69, 24, 19, 9, 69, 18, 84}), new String[]{riw.m181611a(new byte[]{85, 18, 89})}, map);
        m210607f(riw.m181611a(new byte[]{31, 2, 84, 65, 78, 21, 95, 5, 90, 82, 21, 73}), new String[]{riw.m181611a(new byte[]{65, 3, 92, 66, 5}), riw.m181611a(new byte[]{82, 7, 66, 82, 3, 7, 94, 2, 110, 80, 4, 8, 73, 2})}, map);
        m210642w0(map);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g0 */
    public static int m210610g0(Context context) {
        if (!or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36}))) {
            return -1;
        }
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(riw.m181611a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}));
        if (subscriptionManager != null) {
            return subscriptionManager.getActiveSubscriptionInfoCount();
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}));
        int i = 0;
        if (telephonyManager != null) {
            i = telephonyManager.getSimState() == 5 ? 1 : 0;
            try {
                Object objInvoke = TelephonyManager.class.getMethod(riw.m181611a(new byte[]{87, 3, 69, 100, 8, 11, 99, 18, 80, 67, 4}), Integer.TYPE).invoke(telephonyManager, 1);
                if ((objInvoke instanceof Integer) && ((Integer) objInvoke).intValue() == 5) {
                    return 2;
                }
                return i;
            } catch (Exception e) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 6, 3, 68, 53, 88, 90, 50, 18, 81, 18, 84}), e);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    private static void m210611h(Map<String, Map<String, String>> map) {
        String[] strArr = {riw.m181611a(new byte[]{93, 11, 82, 85, HttpTokens.CARRIAGE_RETURN, HttpTokens.CARRIAGE_RETURN}), riw.m181611a(new byte[]{84, 11, 28})};
        if (m210640v0(riw.m181611a(new byte[]{31, 2, 84, 65, 78, 4, 92, 9, 82, 92}), strArr, map) != 1) {
            m210640v0(riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 64, 7, 67, 67, 8, 18, 89, 9, 95, 68}), strArr, map);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static List<String> m210612h0() {
        ArrayList arrayList = new ArrayList();
        try {
            throw new Exception(riw.m181611a(new byte[]{84, 3, 69, 82, 2, 18}));
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                arrayList.add(riw.m181611a(new byte[]{83, 10, 80, 77, 27, 91}) + stackTraceElement.getClassName() + riw.m181611a(new byte[]{76, 70, 92, 82, 21, 14, 95, 2, 12}) + stackTraceElement.getMethodName());
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m210613i(Context context, Map<String, Map<String, String>> map) {
        if (context == null) {
            return;
        }
        List<String> listM210593W = m210593W(context);
        HashMap map2 = new HashMap();
        String[] strArr = {riw.m181611a(new byte[]{82, 10, 68, 82, 18, 18, 81, 5, 90})};
        for (String str : listM210593W) {
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
    private static String m210614i0(int i) {
        if (i == 2) {
            return riw.m181611a(new byte[]{83, 14, 80, 69, 6, 15, 94, 1});
        }
        if (i == 3) {
            return riw.m181611a(new byte[]{84, 15, 66, 84, 9, 7, 66, 1, 88, 89, 6});
        }
        if (i != 4) {
            return i != 5 ? riw.m181611a(new byte[]{69, 8, 90, 89, 14, 17, 94}) : riw.m181611a(new byte[]{86, 19, 93, 91});
        }
        return riw.m181611a(new byte[]{94, 9, 69, 23, 2, 14, 81, 20, 86, 94, 15, 1});
    }

    /* JADX INFO: renamed from: j */
    private static float m210615j(int i) {
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
    public static Map<String, String> m210616j0() {
        HashMap map = new HashMap();
        int iM210595Y = m210595Y();
        for (int i = 0; i < iM210595Y; i++) {
            Locale locale = Locale.ENGLISH;
            map.put(String.format(locale, riw.m181611a(new byte[]{83, 22, 68, 18, 5}), Integer.valueOf(i)), m210618k0(String.format(locale, riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 18, 88, 3, 67, 90, 0, 10, 31, 18, 89, 82, 19, 11, 81, 10, 110, 77, 14, 8, 85, 67, 85, 24, 21, 3, 93, 22}), Integer.valueOf(i))));
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, Object> m210617k(Sensor sensor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(riw.m181611a(new byte[]{94, 7, 92, 82}), sensor.getName());
        linkedHashMap.put(riw.m181611a(new byte[]{70, 3, 95, 83, 14, 20}), sensor.getVendor());
        linkedHashMap.put(riw.m181611a(new byte[]{70, 3, 67, 68, 8, 9, 94}), Integer.valueOf(sensor.getVersion()));
        linkedHashMap.put(riw.m181611a(new byte[]{68, 31, 65, 82}), Integer.valueOf(sensor.getType()));
        linkedHashMap.put(riw.m181611a(new byte[]{93, 7, 73, 101, 0, 8, 87, 3}), Float.valueOf(sensor.getMaximumRange()));
        linkedHashMap.put(riw.m181611a(new byte[]{66, 3, 66, 88, HttpTokens.CARRIAGE_RETURN, 19, 68, 15, 94, 89}), Float.valueOf(sensor.getResolution()));
        linkedHashMap.put(riw.m181611a(new byte[]{93, 15, 95, 115, 4, 10, 81, 31}), Integer.valueOf(sensor.getMinDelay()));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k0 */
    private static String m210618k0(String str) {
        return m210621m(m210615j(m210577J0(str)));
    }

    /* JADX INFO: renamed from: l */
    private static List<String> m210619l(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.split(SignParameters.NEW_LINE)) {
                Matcher matcher = f193678j.matcher(str2);
                if (matcher.find()) {
                    try {
                        arrayList.add(String.valueOf(Long.parseLong(matcher.group(1), 16)));
                    } catch (NumberFormatException e) {
                        Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 4, 30, 68, 20, 80, 84, 21, 50, 83, 22, 97, 88, 19, 18, 10, 70}) + e);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static String m210620l0() {
        try {
            return TimeZone.getDefault().getDisplayName(true, 0);
        } catch (AssertionError | Exception unused) {
            return riw.m181611a(new byte[]{6, 80, 7, 1});
        }
    }

    /* JADX INFO: renamed from: m */
    private static String m210621m(float f) {
        return f > 0.0f ? String.format(Locale.ENGLISH, riw.m181611a(new byte[]{21, 72, 0, 81, -93, -42, 115}), Float.valueOf(f)) : "";
    }

    /* JADX INFO: renamed from: m0 */
    public static Map<String, String> m210622m0(Context context) {
        HashMap map = new HashMap();
        ComponentName componentName = ((ActivityManager) context.getSystemService(riw.m181611a(new byte[]{81, 5, 69, 94, 23, 15, 68, 31}))).getRunningTasks(1).get(0).topActivity;
        if (componentName != null) {
            map.put(riw.m181611a(new byte[]{64, 7, 82, 92}), componentName.getPackageName());
            map.put(riw.m181611a(new byte[]{83, 10, 80, 68, 18}), componentName.getClassName());
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m210623n(Context context) {
        int i;
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), riw.m181611a(new byte[]{81, 5, 82, 82, 18, 21, 89, 4, 88, 91, 8, 18, 73, 57, 84, 89, 0, 4, 92, 3, 85}));
        } catch (Settings.SettingNotFoundException e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 84, 2, 3, 67, 21, 88, 85, 8, 10, 89, 18, 72, 23, 4, 8, 81, 4, 93, 82, 5, 70, 67, 3, 69, 67, 8, 8, 87}), e);
            i = 0;
        }
        return (i != 1 || (string = Settings.Secure.getString(context.getContentResolver(), riw.m181611a(new byte[]{85, 8, 80, 85, HttpTokens.CARRIAGE_RETURN, 3, 84, 57, 80, 84, 2, 3, 67, 21, 88, 85, 8, 10, 89, 18, 72, 104, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 21}))) == null) ? arrayList : Arrays.asList(string.split(riw.m181611a(new byte[]{10})));
    }

    /* JADX INFO: renamed from: n0 */
    public static Map<String, Long> m210624n0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long mobileRxBytes = TrafficStats.getMobileRxBytes();
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        linkedHashMap.put(riw.m181611a(new byte[]{93, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, 98, 30, 115, 78, 21, 3, 67}), Long.valueOf(mobileRxBytes));
        linkedHashMap.put(riw.m181611a(new byte[]{93, 9, 83, 94, HttpTokens.CARRIAGE_RETURN, 3, 100, 30, 115, 78, 21, 3, 67}), Long.valueOf(mobileTxBytes));
        linkedHashMap.put(riw.m181611a(new byte[]{68, 9, 69, 86, HttpTokens.CARRIAGE_RETURN, 50, 72, 36, 72, 67, 4, 21}), Long.valueOf(totalTxBytes));
        linkedHashMap.put(riw.m181611a(new byte[]{68, 9, 69, 86, HttpTokens.CARRIAGE_RETURN, 52, 72, 36, 72, 67, 4, 21}), Long.valueOf(totalRxBytes));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: o */
    public static List<String> m210625o() {
        return m210619l(f2j0.m123625i(riw.m181611a(new byte[]{83, 7, 69, 23, 78, 22, 66, 9, 82, 24, 15, 3, 68, 73, 69, 84, 17})));
    }

    /* JADX INFO: renamed from: o0 */
    public static String m210626o0() {
        String strM123625i = f2j0.m123625i(riw.m181611a(new byte[]{83, 7, 69, 23, 78, 22, 66, 9, 82, 24, 18, 3, 92, 0, 30, 84, 6, 20, 95, 19, 65}));
        if (strM123625i.isEmpty()) {
            riw.m181611a(new byte[]{115, 1, 67, 88, 20, 22, Tnaf.POW_2_WIDTH, 5, 94, 89, 21, 3, 94, 18, 17, 94, 18, 70, 85, 11, 65, 67, 24, 72});
            return null;
        }
        Matcher matcher = Pattern.compile(riw.m181611a(new byte[]{31, 19, 88, 83, 62, 78, 108, 2, 26, 30})).matcher(strM123625i);
        if (!matcher.find()) {
            riw.m181611a(new byte[]{101, 47, 117, 23, 15, 9, 68, 70, 87, 88, 20, 8, 84, 70, 88, 89, 65, 5, 87, 20, 94, 66, 17, 70, 83, 9, 95, 67, 4, 8, 68, 72});
            return null;
        }
        String strGroup = matcher.group(1);
        if (m210561B0(strGroup)) {
            return String.format(Locale.US, riw.m181611a(new byte[]{69, 86, 110, 86, 68, 2}), Integer.valueOf(Integer.parseInt(strGroup) + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL));
        }
        riw.m181611a(new byte[]{101, 47, 117, 23, 8, 21, Tnaf.POW_2_WIDTH, 8, 94, 67, 65, 7, Tnaf.POW_2_WIDTH, 8, 68, 90, 3, 3, 66, 72});
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static synchronized JSONObject m210627p(Context context) {
        JSONObject jSONObject;
        try {
            C21307g c21307g = new C21307g();
            C21304d c21304d = new C21304d();
            C21308h c21308h = new C21308h();
            C21310j c21310j = new C21310j();
            if (or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 114, 120, HttpTokens.SPACE, 52, 99, 35, 110, 123, 46, 37, 113, 50, 120, 120, 47})) || or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127}))) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(riw.m181611a(new byte[]{64, 14, 94, 89, 4}));
                if (telephonyManager != null && (telephonyManager.getPhoneType() == 1 || telephonyManager.getPhoneType() == 2)) {
                    m210571G0(telephonyManager, c21307g, c21304d, c21308h, c21310j);
                }
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(riw.m181611a(new byte[]{87, 21, 92, 104, 2, 3, 92, 10, 88, 89, 7, 9}), c21307g.m210654a());
                jSONObject.put(riw.m181611a(new byte[]{83, 2, 92, 86, 62, 5, 85, 10, 93, 94, 15, 0, 95}), c21304d.m210651a());
                jSONObject.put(riw.m181611a(new byte[]{71, 5, 85, 90, 0, 57, 83, 3, 93, 91, 8, 8, 86, 9}), c21310j.m210657a());
                jSONObject.put(riw.m181611a(new byte[]{92, 18, 84, 104, 2, 3, 92, 10, 88, 89, 7, 9}), c21308h.m210655a());
            } catch (JSONException e) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 83, 20, 84, 86, 21, 15, 94, 1, 17, 125, 50, 41, 126, 70, 94, 85, 11, 3, 83, 18, 11, 23}), e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: p0 */
    public static String m210628p0(Context context) {
        String property;
        String str = f193670b;
        if (str != null) {
            return str;
        }
        synchronized (f193671c) {
            String str2 = f193670b;
            if (str2 != null) {
                return str2;
            }
            try {
                property = WebSettings.getDefaultUserAgent(context);
            } catch (Exception unused) {
                property = System.getProperty(riw.m181611a(new byte[]{88, 18, 69, 71, 79, 7, 87, 3, 95, 67}), "");
            }
            StringBuilder sb = new StringBuilder();
            int length = property != null ? property.length() : 0;
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    sb.append(String.format(riw.m181611a(new byte[]{108, 19, 20, 7, 85, 30}), Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
            }
            f193670b = sb.toString();
            return f193670b;
        }
    }

    /* JADX INFO: renamed from: q */
    public static List<Map<String, Object>> m210629q(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            Log.e(f193669a, riw.m181611a(new byte[]{115, 9, 95, 67, 4, 30, 68, 70, 88, 68, 65, 8, 69, 10, 93, 27, 65, 20, 85, 18, 68, 69, 15, 15, 94, 1, 17, 82, 12, 22, 68, 31, 17, 68, 4, 8, 67, 9, 67, 23, HttpTokens.CARRIAGE_RETURN, 15, 67, 18, 31}));
            return arrayList;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(riw.m181611a(new byte[]{67, 3, 95, 68, 14, 20}));
        if (sensorManager == null) {
            Log.e(f193669a, riw.m181611a(new byte[]{99, 3, 95, 68, 14, 20, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93, 27, 65, 20, 85, 18, 68, 69, 15, 15, 94, 1, 17, 82, 12, 22, 68, 31, 17, 68, 4, 8, 67, 9, 67, 23, HttpTokens.CARRIAGE_RETURN, 15, 67, 18, 31}));
            return arrayList;
        }
        Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
        while (it.hasNext()) {
            arrayList.add(m210617k(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public static Map<String, String> m210630q0() {
        HashMap map = new HashMap();
        try {
            IBinder iBinderM172752a = qre0.m177538a().m177541d().m172752a();
            if (iBinderM172752a == null) {
                map.put(riw.m181611a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 117, 8, 8, 84, 3, 67}), "");
                return map;
            }
            map.put(riw.m181611a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 117, 8, 8, 84, 3, 67}), iBinderM172752a.getClass().getName());
            Class<?>[] interfaces = iBinderM172752a.getClass().getInterfaces();
            if (interfaces.length > 0) {
                map.put(riw.m181611a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 89, 21, 3, 66, 0, 80, 84, 4}), interfaces[0].getName());
            } else {
                map.put(riw.m181611a(new byte[]{103, 15, 95, 83, 14, 17, 125, 7, 95, 86, 6, 3, 66, 75, 120, 89, 21, 3, 66, 0, 80, 84, 4}), "");
            }
            ClassLoader classLoader = iBinderM172752a.getClass().getClassLoader();
            map.put(riw.m181611a(new byte[]{92, 9, 80, 83, 4, 20}), classLoader != null ? classLoader.toString() : "");
            return map;
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 103, 14, 88, 91, 4, 70, 87, 3, 69, 96, 8, 8, 84, 9, 70, 122, 0, 8, 81, 1, 84, 69, 40, 8, 86, 9, 11, 23}) + e);
            return map;
        }
    }

    /* JADX INFO: renamed from: r */
    public static JSONObject m210631r(Context context) {
        C21302b c21302b = new C21302b();
        c21302b.f193681a = String.valueOf(Process.myPid());
        c21302b.f193682b = m210626o0();
        c21302b.f193684d = m210633s(context);
        c21302b.f193683c = context.getPackageName();
        c21302b.f193685e = m210637u(context);
        c21302b.f193687g = context.getFilesDir().getAbsolutePath();
        c21302b.f193686f = m210635t(context);
        return c21302b.m210649a();
    }

    /* JADX INFO: renamed from: r0 */
    private static boolean m210632r0() {
        String[] strArr = {riw.m181611a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 115, 4, Tnaf.POW_2_WIDTH, 89, 5, 84, 126, 15, 0, 95, 54, 67, 88, 17}), riw.m181611a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 118, 36, 53, 101, 18, 88, 91, 18}), riw.m181611a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 123, 14, 1}), riw.m181611a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 22, 1, 74, 21, 31, 100, 21, 20, 85, 7, 92, 98, 21, 15, 92, 21}), riw.m181611a(new byte[]{90, 7, 71, 86, 79, 10, 81, 8, 86, 25, 54, 1, 74, 21, 100, 67, 8, 10})};
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
    private static String m210633s(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 71, 17, 10, 89, 5, 80, 67, 8, 9, 94, 70, 95, 86, 12, 3}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: s0 */
    private static boolean m210634s0(Context context) {
        String[] strArr = {riw.m181611a(new byte[]{83, 9, 92, 25, 15, 9, 67, 14, 68, 81, 14, 19, 30, 7, 95, 83, 19, 9, 89, 2, 31, 68, 20}), riw.m181611a(new byte[]{83, 9, 92, 25, 21, 14, 89, 20, 85, 71, 0, 20, 68, 31, 31, 68, 20, 22, 85, 20, 68, 68, 4, 20}), riw.m181611a(new byte[]{85, 19, 31, 84, 9, 7, 89, 8, 87, 94, 19, 3, 30, 21, 68, 71, 4, 20, 67, 19}), riw.m181611a(new byte[]{83, 9, 92, 25, 10, 9, 69, 21, 89, 94, 10, 2, 69, 18, 69, 86, 79, 21, 69, 22, 84, 69, 20, 21, 85, 20})};
        for (int i = 0; i < 4; i++) {
            if (m210563C0(context, strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    private static String m210635t(Context context) {
        String strM210586P = m210586P();
        if (!TextUtils.isEmpty(strM210586P)) {
            return strM210586P;
        }
        String strM210585O = m210585O();
        return !TextUtils.isEmpty(strM210585O) ? strM210585O : m210584N(context);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: t0 */
    public static boolean m210636t0() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    /* JADX INFO: renamed from: u */
    private static String m210637u(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f193669a, riw.m181611a(new byte[]{96, 7, 82, 92, 0, 1, 85, 70, 95, 86, 12, 3, Tnaf.POW_2_WIDTH, 8, 94, 67, 65, 0, 95, 19, 95, 83}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m210638u0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        return packageManager.hasSystemFeature(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14, 110, 91, 4})) || packageManager.hasSystemFeature(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 4, 92, 19, 84, 67, 14, 9, 68, 14}));
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static String m210639v(Context context) {
        try {
            Class<?> cls = Class.forName(riw.m181611a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 8, 69, 82, 19, 8, 81, 10, 31, 88, 18, 72, 96, 9, 70, 82, 19, 54, 66, 9, 87, 94, HttpTokens.CARRIAGE_RETURN, 3}));
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method method = cls.getMethod(riw.m181611a(new byte[]{87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31}), null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(objNewInstance, null);
            if (objInvoke != null) {
                return String.valueOf(((Double) objInvoke).doubleValue());
            }
            Log.e(f193669a, riw.m181611a(new byte[]{87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31, 125, 3, 69, 95, 14, 2, 30, 15, 95, 65, 14, HttpTokens.CARRIAGE_RETURN, 85, 70, 67, 82, 21, 19, 66, 8, 84, 83, 65, 8, 69, 10, 93}));
            return "";
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 117, 0, 18, 68, 3, 67, 78, 34, 7, 64, 7, 82, 94, 21, 31, 10, 70}), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: v0 */
    private static int m210640v0(String str, String[] strArr, Map<String, Map<String, String>> map) {
        BufferedReader bufferedReader;
        HashMap map2 = new HashMap();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (!f2j0.m123618b(str)) {
                    return -1;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(str, new String[0]), new OpenOption[0])));
            } catch (Exception e) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 8, 21, 115, 9, 95, 67, 0, 15, 94, 53, 69, 69}), e);
                return -1;
            }
        } else {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            } catch (FileNotFoundException e2) {
                Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 8, 21, 115, 9, 95, 67, 0, 15, 94, 53, 69, 69}), e2);
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
                Log.e(f193669a, riw.m181611a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 19, 3, 81, 2, 88, 89, 6, 70, 86, 15, 93, 82, 91, 70}) + str, e3);
                return -1;
            } catch (SecurityException unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private static JSONObject m210641w(Context context) {
        Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 88, 89, 21, 3, 94, 18, 31, 86, 2, 18, 89, 9, 95, 25, 35, 39, 100, 50, 116, 101, 56, 57, 115, 46, 112, 121, 38, 35, 116})));
        C21303c c21303c = new C21303c();
        c21303c.f193688a = m210639v(context);
        if (intentM145018l != null) {
            c21303c.f193689b = intentM145018l.getIntExtra(riw.m181611a(new byte[]{92, 3, 71, 82, HttpTokens.CARRIAGE_RETURN}), -1) / intentM145018l.getIntExtra(riw.m181611a(new byte[]{67, 5, 80, 91, 4}), -1);
            c21303c.f193690c = intentM145018l.getIntExtra(riw.m181611a(new byte[]{70, 9, 93, 67, 0, 1, 85}), -1);
            c21303c.f193691d = intentM145018l.getIntExtra(riw.m181611a(new byte[]{68, 3, 92, 71, 4, 20, 81, 18, 68, 69, 4}), -1) / 10.0f;
            c21303c.f193692e = m210614i0(intentM145018l.getIntExtra(riw.m181611a(new byte[]{67, 18, 80, 67, 20, 21}), -1));
            c21303c.f193693f = m210598a0(intentM145018l.getIntExtra(riw.m181611a(new byte[]{64, 10, 68, 80, 6, 3, 84}), -1));
            if (Build.VERSION.SDK_INT >= 34) {
                c21303c.f193694g = intentM145018l.getIntExtra(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 3, 72, 18, 67, 86, 79, 37, 105, 37, 125, 114, 62, 37, 127, 51, 127, 99}), -1);
            } else {
                c21303c.f193694g = -1;
            }
        }
        return c21303c.m210650a();
    }

    /* JADX INFO: renamed from: w0 */
    private static void m210642w0(Map<String, Map<String, String>> map) {
        String[] strArr = {riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 89, 8, 69, 82, 19, 20, 69, 22, 69, 68}), riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 89, 9, 92, 82, 12}), riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 89, 9, 65, 88, 19, 18, 67}), riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 93, 15, 66, 84}), riw.m181611a(new byte[]{31, 22, 67, 88, 2, 73, 91, 7, 93, 91, 18, 31, 93, 21})};
        for (int i = 0; i < 5; i++) {
            m210640v0(strArr[i], f193676h, map);
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m210643x() {
        return "";
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m210644x0() {
        return m210632r0() || m210648z0();
    }

    /* JADX INFO: renamed from: y */
    public static JSONObject m210645y(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(riw.m181611a(new byte[]{89, 21, 110, 85, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 111, 3, 95, 86, 3, 10, 85}), m210636t0());
        } catch (Exception e) {
            Log.e(f193669a, riw.m181611a(new byte[]{117, 20, 67, 88, 19, 70, 89, 21, 115, 91, 20, 3, 68, 9, 94, 67, 9, 35, 94, 7, 83, 91, 4, 2, 10, 70}), e);
        }
        try {
            jSONObject.put(riw.m181611a(new byte[]{89, 21, 110, 85, HttpTokens.CARRIAGE_RETURN, 19, 85, 18, 94, 88, 21, 14, 111, 3, 73, 94, 18, 18}), m210638u0(context));
            jSONObject.put(riw.m181611a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 23, 3, 66}), m210558A(context));
            jSONObject.put(riw.m181611a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 12, 7, 83}), m210647z());
            jSONObject.put(riw.m181611a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 15, 7, 93, 3}), m210643x());
            jSONObject.put(riw.m181611a(new byte[]{82, 10, 68, 82, 21, 9, 95, 18, 89, 104, 17, 3, 66, 11, 88, 68, 18, 15, 95, 8}), or60.m168859a(context, riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 36, 125, 98, 36, 50, 127, 41, 101, 127})));
        } catch (Exception e2) {
            Log.e(f193669a, riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 2, 20, 85, 7, 69, 82, 65, 1, 85, 18, 115, 91, 20, 3, 68, 9, 94, 67, 9, 47, 94, 0, 94, 23, 43, 53, 127, 40, 17, 88, 3, 12, 85, 5, 69}), e2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: y0 */
    private static boolean m210646y0(String str) {
        File file = new File(str);
        return file.exists() && file.isDirectory();
    }

    /* JADX INFO: renamed from: z */
    public static String m210647z() {
        return "";
    }

    /* JADX INFO: renamed from: z0 */
    private static boolean m210648z0() {
        return new String(Coded.doCommand(riw.m181611a(new byte[]{68, 3, 66, 67}).getBytes(), 107)).equals(riw.m181611a(new byte[]{67, 19, 82, 84, 4, 21, 67})) || (new File(riw.m181611a(new byte[]{31, 2, 80, 67, 0, 73, 92, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 73, 68, 11, 65, 24, 2, 9, 94, 0, 88, 80, 18, 73, 30, 22})).exists() || new File(riw.m181611a(new byte[]{31, 2, 80, 67, 0, 73, 92, 9, 82, 86, HttpTokens.CARRIAGE_RETURN, 73, 68, 11, 65, 24, 2, 9, 94, 0, 88, 80, 18, 73, 30, 21, 65})).exists());
    }
}
