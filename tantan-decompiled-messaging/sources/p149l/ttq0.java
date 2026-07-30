package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.service.C14855az;
import com.xiaomi.push.service.C14857ba;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ttq0 {

    /* JADX INFO: renamed from: c */
    private static volatile ttq0 f172052c;

    /* JADX INFO: renamed from: a */
    private final Context f172053a;

    /* JADX INFO: renamed from: b */
    private Map<String, utq0> f172054b = new HashMap();

    private ttq0(Context context) {
        this.f172053a = context;
    }

    /* JADX INFO: renamed from: b */
    public static ttq0 m190616b(Context context) {
        if (context == null) {
            ilq0.m137025B("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f172052c == null) {
            synchronized (ttq0.class) {
                try {
                    if (f172052c == null) {
                        f172052c = new ttq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172052c;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, utq0> m190617a() {
        return this.f172054b;
    }

    /* JADX INFO: renamed from: c */
    public utq0 m190618c() {
        utq0 utq0Var = this.f172054b.get("UPLOADER_PUSH_CHANNEL");
        if (utq0Var != null) {
            return utq0Var;
        }
        utq0 utq0Var2 = this.f172054b.get("UPLOADER_HTTP");
        if (utq0Var2 != null) {
            return utq0Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m190619d(utq0 utq0Var, String str) {
        if (utq0Var == null) {
            ilq0.m137025B("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            ilq0.m137025B("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m190617a().put(str, utq0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m190620e(C14744gj c14744gj, String str) {
        if (TextUtils.isEmpty(str)) {
            ilq0.m137040m("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (C14855az.m86602a(c14744gj, false)) {
            return false;
        }
        if (TextUtils.isEmpty(c14744gj.m85633d())) {
            c14744gj.m85638f(C14855az.m86599a());
        }
        c14744gj.m85640g(str);
        C14857ba.m86611a(this.f172053a, c14744gj);
        return true;
    }
}
