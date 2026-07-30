package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g5r0 {

    /* JADX INFO: renamed from: d */
    private static volatile g5r0 f102351d;

    /* JADX INFO: renamed from: a */
    private Context f102352a;

    /* JADX INFO: renamed from: b */
    private Handler f102353b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private Map<String, Map<String, String>> f102354c = new HashMap();

    /* JADX INFO: renamed from: l.g5r0$a */
    public class RunnableC17160a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f102355a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f102356b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f102357c;

        public RunnableC17160a(String str, String str2, String str3) {
            this.f102355a = str;
            this.f102356b = str2;
            this.f102357c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences.Editor editorEdit = g5r0.this.f102352a.getSharedPreferences(this.f102355a, 4).edit();
            editorEdit.putString(this.f102356b, this.f102357c);
            editorEdit.commit();
        }
    }

    private g5r0(Context context) {
        this.f102352a = context;
    }

    /* JADX INFO: renamed from: b */
    private synchronized String m129069b(String str, String str2) {
        if (this.f102354c == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map<String, String> map = this.f102354c.get(str);
            if (map == null) {
                return "";
            }
            return map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static g5r0 m129070d(Context context) {
        if (f102351d == null) {
            synchronized (g5r0.class) {
                try {
                    if (f102351d == null) {
                        f102351d = new g5r0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f102351d;
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m129071f(String str, String str2, String str3) {
        try {
            if (this.f102354c == null) {
                this.f102354c = new HashMap();
            }
            Map<String, String> map = this.f102354c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f102354c.put(str, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m129072c(String str, String str2, String str3) {
        String strM129069b = m129069b(str, str2);
        if (!TextUtils.isEmpty(strM129069b)) {
            return strM129069b;
        }
        return this.f102352a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m129073e(String str, String str2, String str3) {
        m129071f(str, str2, str3);
        this.f102353b.post(new RunnableC17160a(str, str2, str3));
    }
}
