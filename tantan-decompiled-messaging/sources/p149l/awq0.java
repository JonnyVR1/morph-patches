package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class awq0 {

    /* JADX INFO: renamed from: d */
    private static volatile awq0 f72073d;

    /* JADX INFO: renamed from: a */
    private Context f72074a;

    /* JADX INFO: renamed from: b */
    private Handler f72075b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private Map<String, Map<String, String>> f72076c = new HashMap();

    /* JADX INFO: renamed from: l.awq0$a */
    public class RunnableC15740a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f72077a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f72078b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f72079c;

        public RunnableC15740a(String str, String str2, String str3) {
            this.f72077a = str;
            this.f72078b = str2;
            this.f72079c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences.Editor editorEdit = awq0.this.f72074a.getSharedPreferences(this.f72077a, 4).edit();
            editorEdit.putString(this.f72078b, this.f72079c);
            editorEdit.commit();
        }
    }

    private awq0(Context context) {
        this.f72074a = context;
    }

    /* JADX INFO: renamed from: b */
    private synchronized String m99300b(String str, String str2) {
        if (this.f72076c == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map<String, String> map = this.f72076c.get(str);
            if (map == null) {
                return "";
            }
            return map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static awq0 m99301d(Context context) {
        if (f72073d == null) {
            synchronized (awq0.class) {
                try {
                    if (f72073d == null) {
                        f72073d = new awq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f72073d;
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m99302f(String str, String str2, String str3) {
        try {
            if (this.f72076c == null) {
                this.f72076c = new HashMap();
            }
            Map<String, String> map = this.f72076c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f72076c.put(str, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m99303c(String str, String str2, String str3) {
        String strM99300b = m99300b(str, str2);
        if (!TextUtils.isEmpty(strM99300b)) {
            return strM99300b;
        }
        return this.f72074a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m99304e(String str, String str2, String str3) {
        m99302f(str, str2, str3);
        this.f72075b.post(new RunnableC15740a(str, str2, str3));
    }
}
