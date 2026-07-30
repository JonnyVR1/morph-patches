package p007l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.momosec.mmuid.android.Native;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class cyd {

    /* JADX INFO: renamed from: a */
    private static String f2504a = ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84});

    /* JADX INFO: renamed from: b */
    private static String f2505b = ijw.m9418a(new byte[]{6, 80, 7, 1});

    /* JADX INFO: renamed from: c */
    private static String f2506c = ijw.m9418a(new byte[]{117, 20, 67, 88, 19});

    /* JADX INFO: renamed from: d */
    private static String f2507d = ijw.m9418a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: l.cyd$a */
    public static class CallableC0520a implements Callable<String> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return cyd.m8823b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m8822a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}));
    }

    /* JADX INFO: renamed from: b */
    public static String m8823b() {
        StringBuilder sb = new StringBuilder();
        try {
            MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray(ijw.m9418a(new byte[]{84, 3, 71, 94, 2, 3, 101, 8, 88, 70, 20, 3, 121, 2}));
            if (propertyByteArray != null) {
                sb.append(agw.m8549a(propertyByteArray));
            }
            mediaDrm.release();
        } catch (Exception unused) {
            sb.append(f2507d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m8824c() {
        String str;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC0520a());
        try {
            str = (String) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            str = "";
        } finally {
            futureSubmit.cancel(true);
            executorServiceNewSingleThreadExecutor.shutdownNow();
        }
        return str;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    public static String m8825d(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                if (ij60.f2913b) {
                    return ((TelephonyManager) context.getSystemService(ijw.m9418a(new byte[]{64, 14, 94, 89, 4}))).getDeviceId();
                }
            } catch (Exception e) {
                mjw.m9867a(e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m8826e(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ijw.m9418a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 80, 67, 9}), m8828g());
            jSONObject2.put(ijw.m9418a(new byte[]{93, 7, 82, 104, 0, 2, 84, 20, 84, 68, 18}), "");
            jSONObject2.put(ijw.m9418a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 84, 69, 12}), ij60.m9417c(context, 1));
            sb.append(e0g0.m9016a(Native.doCommand(jSONObject2.toString().getBytes(), 103)));
            linkedHashMap.put(ijw.m9418a(new byte[]{67, 5, 67, 82, 4, 8}), m8830i());
            linkedHashMap.put(ijw.m9418a(new byte[]{89, 11, 84, 94}), m8825d(context));
            linkedHashMap.put(ijw.m9418a(new byte[]{93, 9, 85, 82, 13}), m8827f());
            linkedHashMap.put(ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 15, 85}), m8822a(context));
            linkedHashMap.put(ijw.m9418a(new byte[]{93, 7, 82}), sb.toString());
            linkedHashMap.put(ijw.m9418a(new byte[]{83, 15, 85}), m8829h());
        } catch (Exception e) {
            mjw.m9867a(e);
        }
        try {
            String strM11959a = yve0.m11959a(rek0.f4074a, rek0.f4075b);
            if (e0g0.m9017b(strM11959a)) {
                jSONObject.put(ijw.m9418a(new byte[]{67, 14, 80, 69, 4, 2, 111, 2, 84, 65, 8, 5, 85}), ijw.m9418a(new byte[]{85, 20, 67, 88, 19}));
            } else {
                jSONObject.put(ijw.m9418a(new byte[]{67, 14, 80, 69, 4, 2, 111, 2, 84, 65, 8, 5, 85}), strM11959a);
            }
            jSONObject.put(ijw.m9418a(new byte[]{84, 3, 71, 94, 2, 3}), linkedHashMap.toString().toLowerCase());
            jSONObject.put(ijw.m9418a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), str);
            jSONObject.put(ijw.m9418a(new byte[]{84, 20, 92, 66, 8, 2}), m8824c());
            jSONObject.put(ijw.m9418a(new byte[]{67, 3, 67, 94, 0, 10, 94, 9}), m8831j());
            String strM8825d = m8825d(context);
            if (e0g0.m9017b(strM8825d)) {
                jSONObject.put(ijw.m9418a(new byte[]{89, 11, 84, 94}), f2504a);
            } else {
                jSONObject.put(ijw.m9418a(new byte[]{89, 11, 84, 94}), strM8825d);
            }
            jSONObject.put(ijw.m9418a(new byte[]{67, 5, 67, 82, 4, 8}), m8830i());
            jSONObject.put(ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 15, 85}), m8822a(context));
            jSONObject.put(ijw.m9418a(new byte[]{93, 7, 82}), sb.toString());
            jSONObject.put(ijw.m9418a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), str);
            if (e0g0.m9017b(rek0.f4077d)) {
                jSONObject.put(ijw.m9418a(new byte[]{95, 7, 88, 83}), f2504a);
            } else {
                jSONObject.put(ijw.m9418a(new byte[]{95, 7, 88, 83}), rek0.f4077d);
            }
            String strM8829h = m8829h();
            if (e0g0.m9017b(strM8829h)) {
                jSONObject.put(ijw.m9418a(new byte[]{83, 15, 85}), f2504a);
            } else {
                jSONObject.put(ijw.m9418a(new byte[]{83, 15, 85}), strM8829h);
            }
            jSONObject.put(ijw.m9418a(new byte[]{93, 9, 85, 82, 13}), m8827f());
            jSONObject.put(ijw.m9418a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 80, 67, 9}), m8828g());
            jSONObject.put(ijw.m9418a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 84, 69, 12}), ij60.m9417c(context, 1));
            if (jd20.m9518a(context) == 1) {
                jSONObject.put(ijw.m9418a(new byte[]{71, 15, 87, 94, 62, 21, 68, 7, 69, 82}), 1);
            } else {
                jSONObject.put(ijw.m9418a(new byte[]{71, 15, 87, 94, 62, 21, 68, 7, 69, 82}), 0);
            }
        } catch (JSONException e2) {
            mjw.m9867a(e2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m8827f() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: g */
    public static String m8828g() {
        String string = null;
        try {
            if (Environment.getExternalStorageState().equals(ijw.m9418a(new byte[]{93, 9, 68, 89, 21, 3, 84}))) {
                string = Environment.getExternalStorageDirectory().toString();
            }
        } catch (Exception e) {
            mjw.m9867a(e);
        }
        return string == null ? ijw.m9418a(new byte[]{31, 21, 85, 84, 0, 20, 84}) : string;
    }

    /* JADX INFO: renamed from: h */
    public static String m8829h() {
        StringBuilder sb = new StringBuilder();
        String strM9418a = ijw.m9418a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 86, 31, 2, 84, 65, 8, 5, 85, 73, 69, 78, 17, 3});
        String strM9418a2 = ijw.m9418a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 87, 31, 2, 84, 65, 8, 5, 85, 73, 69, 78, 17, 3});
        try {
            if (m8832k(strM9418a, ijw.m9418a(new byte[]{93, 11, 82}))) {
                sb.append(m8833l(ijw.m9418a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 86, 31, 2, 84, 65, 8, 5, 85, 73, 82, 94, 5})));
            } else if (m8832k(strM9418a2, ijw.m9418a(new byte[]{67, 2}))) {
                sb.append(m8833l(ijw.m9418a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 87, 31, 2, 84, 65, 8, 5, 85, 73, 82, 94, 5})));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m8830i() {
        StringBuilder sb = new StringBuilder();
        sb.append(j5e0.m9501a() + ijw.m9418a(new byte[]{72}));
        sb.append(j5e0.m9502b());
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m8831j() {
        StringBuilder sb = new StringBuilder();
        try {
            if (Build.VERSION.SDK_INT > 24) {
                sb.append(Build.SERIAL);
            } else {
                Class<?> cls = Class.forName(ijw.m9418a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 53, 73, 21, 69, 82, 12, 54, 66, 9, 65, 82, 19, 18, 89, 3, 66}));
                sb.append((String) cls.getMethod(ijw.m9418a(new byte[]{87, 3, 69}), String.class).invoke(cls, ijw.m9418a(new byte[]{66, 9, 31, 68, 4, 20, 89, 7, 93, 89, 14})));
            }
        } catch (Exception unused) {
            sb.append(f2505b);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private static boolean m8832k(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            boolean zContentEquals = bufferedReader.readLine().toLowerCase().contentEquals(str2);
            bufferedReader.close();
            return zContentEquals;
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
    }

    /* JADX INFO: renamed from: l */
    private static String m8833l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            return line;
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
    }
}
