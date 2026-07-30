package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ee80 {

    /* JADX INFO: renamed from: f */
    private static volatile ee80 f90680f;

    /* JADX INFO: renamed from: g */
    private static File f90681g;

    /* JADX INFO: renamed from: a */
    private t2m f90682a;

    /* JADX INFO: renamed from: b */
    private v3m f90683b;

    /* JADX INFO: renamed from: c */
    private HashMap<String, File> f90684c;

    /* JADX INFO: renamed from: d */
    private final Object f90685d;

    /* JADX INFO: renamed from: e */
    private final Object f90686e;

    /* JADX INFO: renamed from: l.ee80$a */
    public class RunnableC16583a implements Runnable {

        /* JADX INFO: renamed from: a */
        String f90687a;

        /* JADX INFO: renamed from: b */
        String f90688b;

        /* JADX INFO: renamed from: c */
        JSONObject f90689c;

        /* JADX INFO: renamed from: d */
        Object f90690d;

        public RunnableC16583a(Object obj, String str, String str2, JSONObject jSONObject) {
            this.f90690d = obj;
            this.f90687a = str;
            this.f90688b = str2;
            this.f90689c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        private File m115863a(@NonNull Object obj, String str, String str2) throws Throwable {
            File fileM115861h = ee80.this.m115861h(obj, this.f90687a, str2);
            FileUtil.m18414k(fileM115861h, str);
            return fileM115861h;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HashMap map;
            long jCurrentTimeMillis = System.currentTimeMillis();
            vsl vslVarM169154a = phw.m169153b().m169154a();
            if (this.f90689c != null) {
                map = new HashMap();
                Iterator<String> itKeys = this.f90689c.keys();
                if (this.f90689c.optInt("needDeviceId", 0) == 1) {
                    map.put(vslVarM169154a.mo87149g(0), vslVarM169154a.mo87147e(0));
                }
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, String.valueOf(this.f90689c.opt(next)));
                }
            } else {
                map = null;
            }
            ji80 ji80Var = new ji80();
            try {
                ji80Var.m141636c(new JSONObject(vslVarM169154a.mo87143a(this.f90688b, map, null)));
            } catch (Exception e) {
                MDLog.printErrStackTrace("SYNC-PreFetchManager", e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ec", -1);
                    jSONObject.put("em", "网络请求失败");
                    jSONObject.put("exmsg", e.getMessage());
                    ji80Var.m141636c(jSONObject);
                } catch (JSONException e2) {
                    MDLog.printErrStackTrace("SYNC-PreFetchManager", e2);
                }
            }
            MDLog.m7390d("SYNC-PreFetchManager", "request data: %s", ji80Var.m141634a());
            if (this.f90690d == null) {
                MDLog.m7391e("SYNC-PreFetchManager", "unique key is null!");
                return;
            }
            ji80Var.m141637d(System.currentTimeMillis() - jCurrentTimeMillis);
            try {
                String strM115856k = ee80.m115856k(this.f90690d, this.f90688b, this.f90689c);
                ee80.this.f90684c.put(strM115856k, m115863a(this.f90690d, ji80Var.toString(), strM115856k));
            } catch (IOException e3) {
                MDLog.printErrStackTrace("SYNC-PreFetchManager", e3);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PreFetchAction pk: ");
            sb.append(this.f90688b);
            JSONObject jSONObject = this.f90689c;
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            return sb.toString();
        }
    }

    private ee80() {
        cgh0 cgh0Var = new cgh0();
        this.f90683b = cgh0Var;
        this.f90682a = new xl10(cgh0Var);
        this.f90684c = new HashMap<>();
        this.f90685d = new Object();
        this.f90686e = new Object();
    }

    /* JADX INFO: renamed from: c */
    private void m115851c(@NonNull Object obj, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (strOptString.startsWith("/")) {
            strOptString = m115857l(str) + strOptString;
        }
        String str2 = strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        this.f90682a.mo187021a(m115856k(obj, str2, jSONObjectOptJSONObject), new RunnableC16583a(obj, str, str2, jSONObjectOptJSONObject));
    }

    /* JADX INFO: renamed from: f */
    private static File m115852f() {
        if (f90681g == null) {
            File file = new File(ohw.m164465c(), "PREFETCH");
            if (!file.exists()) {
                file.mkdirs();
            }
            f90681g = file;
        }
        return f90681g;
    }

    /* JADX INFO: renamed from: g */
    private File m115853g(@NonNull Object obj) {
        File file = new File(m115852f(), b0g0.m99775h(obj.toString()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: i */
    private File m115854i(@NonNull Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(m115853g(obj), b0g0.m99775h(str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: j */
    public static ee80 m115855j() {
        if (f90680f == null) {
            synchronized (ee80.class) {
                try {
                    if (f90680f == null) {
                        f90680f = new ee80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f90680f;
    }

    /* JADX INFO: renamed from: k */
    public static String m115856k(Object obj, String str, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("_");
        sb.append(str);
        sb.append(jSONObject != null ? jSONObject.toString() : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    private String m115857l(String str) {
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getHost();
    }

    /* JADX INFO: renamed from: b */
    public void m115858b(@NonNull Object obj, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this.f90685d) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    m115851c(obj, str, jSONArray.optJSONObject(i));
                }
            } catch (JSONException e) {
                MDLog.printErrStackTrace("SYNC-PreFetchManager", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m115859d(String str) {
        synchronized (this.f90686e) {
            try {
                File fileRemove = this.f90684c.remove(str);
                if (fileRemove != null) {
                    fileRemove.delete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m115860e(@NonNull Object obj) {
        File fileM115853g = m115853g(obj);
        if (fileM115853g != null) {
            FileUtil.m18406c(fileM115853g);
        }
    }

    /* JADX INFO: renamed from: h */
    public File m115861h(@NonNull Object obj, String str, String str2) {
        synchronized (this.f90686e) {
            try {
                File file = this.f90684c.get(str2);
                if (file != null && file.exists()) {
                    return file;
                }
                File fileM115854i = m115854i(obj, str);
                if (fileM115854i == null) {
                    return null;
                }
                return new File(fileM115854i, b0g0.m99775h(str2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m115862m(String str) throws InterruptedException {
        boolean zMo106709b;
        synchronized (this.f90685d) {
            zMo106709b = this.f90683b.mo106709b(str);
        }
        return zMo106709b;
    }
}
