package p153l;

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
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class pzd {

    /* JADX INFO: renamed from: a */
    private static String f154825a = hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84});

    /* JADX INFO: renamed from: b */
    private static String f154826b = hmw.m136007a(new byte[]{6, 80, 7, 1});

    /* JADX INFO: renamed from: c */
    private static String f154827c = hmw.m136007a(new byte[]{117, 20, 67, 88, 19});

    /* JADX INFO: renamed from: d */
    private static String f154828d = hmw.m136007a(new byte[]{85, 30, 82, 82, 17, 18, 111, 3, 67, 69, 14, 20});

    /* JADX INFO: renamed from: l.pzd$a */
    public static class CallableC19470a implements Callable<String> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return pzd.m174403b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m174402a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}));
    }

    /* JADX INFO: renamed from: b */
    public static String m174403b() {
        StringBuilder sb = new StringBuilder();
        try {
            MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray(hmw.m136007a(new byte[]{84, 3, 71, 94, 2, 3, 101, 8, 88, 70, 20, 3, 121, 2}));
            if (propertyByteArray != null) {
                sb.append(yhw.m215997a(propertyByteArray));
            }
            mediaDrm.release();
        } catch (Exception unused) {
            sb.append(f154828d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m174404c() {
        String str;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC19470a());
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
    public static String m174405d(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                if (nr60.f143379b) {
                    return ((TelephonyManager) context.getSystemService(hmw.m136007a(new byte[]{64, 14, 94, 89, 4}))).getDeviceId();
                }
            } catch (Exception e) {
                lmw.m154891a(e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m174406e(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(hmw.m136007a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 80, 67, 9}), m174408g());
            jSONObject2.put(hmw.m136007a(new byte[]{93, 7, 82, 104, 0, 2, 84, 20, 84, 68, 18}), "");
            jSONObject2.put(hmw.m136007a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 84, 69, 12}), nr60.m164464c(context, 1));
            sb.append(m8g0.m157376a(Native.doCommand(jSONObject2.toString().getBytes(), 103)));
            linkedHashMap.put(hmw.m136007a(new byte[]{67, 5, 67, 82, 4, 8}), m174410i());
            linkedHashMap.put(hmw.m136007a(new byte[]{89, 11, 84, 94}), m174405d(context));
            linkedHashMap.put(hmw.m136007a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN}), m174407f());
            linkedHashMap.put(hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 15, 85}), m174402a(context));
            linkedHashMap.put(hmw.m136007a(new byte[]{93, 7, 82}), sb.toString());
            linkedHashMap.put(hmw.m136007a(new byte[]{83, 15, 85}), m174409h());
        } catch (Exception e) {
            lmw.m154891a(e);
        }
        try {
            String strM123987a = f4f0.m123987a(xnk0.f195404a, xnk0.f195405b);
            if (m8g0.m157377b(strM123987a)) {
                jSONObject.put(hmw.m136007a(new byte[]{67, 14, 80, 69, 4, 2, 111, 2, 84, 65, 8, 5, 85}), hmw.m136007a(new byte[]{85, 20, 67, 88, 19}));
            } else {
                jSONObject.put(hmw.m136007a(new byte[]{67, 14, 80, 69, 4, 2, 111, 2, 84, 65, 8, 5, 85}), strM123987a);
            }
            jSONObject.put(hmw.m136007a(new byte[]{84, 3, 71, 94, 2, 3}), linkedHashMap.toString().toLowerCase());
            jSONObject.put(hmw.m136007a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), str);
            jSONObject.put(hmw.m136007a(new byte[]{84, 20, 92, 66, 8, 2}), m174404c());
            jSONObject.put(hmw.m136007a(new byte[]{67, 3, 67, 94, 0, 10, 94, 9}), m174411j());
            String strM174405d = m174405d(context);
            if (m8g0.m157377b(strM174405d)) {
                jSONObject.put(hmw.m136007a(new byte[]{89, 11, 84, 94}), f154825a);
            } else {
                jSONObject.put(hmw.m136007a(new byte[]{89, 11, 84, 94}), strM174405d);
            }
            jSONObject.put(hmw.m136007a(new byte[]{67, 5, 67, 82, 4, 8}), m174410i());
            jSONObject.put(hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 15, 85}), m174402a(context));
            jSONObject.put(hmw.m136007a(new byte[]{93, 7, 82}), sb.toString());
            jSONObject.put(hmw.m136007a(new byte[]{67, 3, 66, 68, 8, 9, 94, 15, 85}), str);
            if (m8g0.m157377b(xnk0.f195407d)) {
                jSONObject.put(hmw.m136007a(new byte[]{95, 7, 88, 83}), f154825a);
            } else {
                jSONObject.put(hmw.m136007a(new byte[]{95, 7, 88, 83}), xnk0.f195407d);
            }
            String strM174409h = m174409h();
            if (m8g0.m157377b(strM174409h)) {
                jSONObject.put(hmw.m136007a(new byte[]{83, 15, 85}), f154825a);
            } else {
                jSONObject.put(hmw.m136007a(new byte[]{83, 15, 85}), strM174409h);
            }
            jSONObject.put(hmw.m136007a(new byte[]{93, 9, 85, 82, HttpTokens.CARRIAGE_RETURN}), m174407f());
            jSONObject.put(hmw.m136007a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 80, 67, 9}), m174408g());
            jSONObject.put(hmw.m136007a(new byte[]{67, 2, 82, 86, 19, 2, 111, 22, 84, 69, 12}), nr60.m164464c(context, 1));
            if (tl20.m191602a(context) == 1) {
                jSONObject.put(hmw.m136007a(new byte[]{71, 15, 87, 94, 62, 21, 68, 7, 69, 82}), 1);
            } else {
                jSONObject.put(hmw.m136007a(new byte[]{71, 15, 87, 94, 62, 21, 68, 7, 69, 82}), 0);
            }
        } catch (JSONException e2) {
            lmw.m154891a(e2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m174407f() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: g */
    public static String m174408g() {
        String string = null;
        try {
            if (Environment.getExternalStorageState().equals(hmw.m136007a(new byte[]{93, 9, 68, 89, 21, 3, 84}))) {
                string = Environment.getExternalStorageDirectory().toString();
            }
        } catch (Exception e) {
            lmw.m154891a(e);
        }
        return string == null ? hmw.m136007a(new byte[]{31, 21, 85, 84, 0, 20, 84}) : string;
    }

    /* JADX INFO: renamed from: h */
    public static String m174409h() {
        StringBuilder sb = new StringBuilder();
        String strM136007a = hmw.m136007a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 86, 31, 2, 84, 65, 8, 5, 85, 73, 69, 78, 17, 3});
        String strM136007a2 = hmw.m136007a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 87, 31, 2, 84, 65, 8, 5, 85, 73, 69, 78, 17, 3});
        try {
            if (m174412k(strM136007a, hmw.m136007a(new byte[]{93, 11, 82}))) {
                sb.append(m174413l(hmw.m136007a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 86, 31, 2, 84, 65, 8, 5, 85, 73, 82, 94, 5})));
            } else if (m174412k(strM136007a2, hmw.m136007a(new byte[]{67, 2}))) {
                sb.append(m174413l(hmw.m136007a(new byte[]{31, 21, 72, 68, 78, 4, 92, 9, 82, 92, 78, 11, 93, 5, 83, 91, 10, 87, 31, 2, 84, 65, 8, 5, 85, 73, 82, 94, 5})));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m174410i() {
        StringBuilder sb = new StringBuilder();
        sb.append(ode0.m167293a() + hmw.m136007a(new byte[]{72}));
        sb.append(ode0.m167294b());
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m174411j() {
        StringBuilder sb = new StringBuilder();
        try {
            if (Build.VERSION.SDK_INT > 24) {
                sb.append(Build.SERIAL);
            } else {
                Class<?> cls = Class.forName(hmw.m136007a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 53, 73, 21, 69, 82, 12, 54, 66, 9, 65, 82, 19, 18, 89, 3, 66}));
                sb.append((String) cls.getMethod(hmw.m136007a(new byte[]{87, 3, 69}), String.class).invoke(cls, hmw.m136007a(new byte[]{66, 9, 31, 68, 4, 20, 89, 7, 93, 89, 14})));
            }
        } catch (Exception unused) {
            sb.append(f154826b);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private static boolean m174412k(String str, String str2) throws IOException {
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
    private static String m174413l(String str) throws IOException {
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
