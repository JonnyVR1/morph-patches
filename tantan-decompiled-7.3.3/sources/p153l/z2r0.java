package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.service.C15003az;
import com.xiaomi.push.service.C15005ba;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class z2r0 {

    /* JADX INFO: renamed from: c */
    private static volatile z2r0 f202729c;

    /* JADX INFO: renamed from: a */
    private final Context f202730a;

    /* JADX INFO: renamed from: b */
    private Map<String, a3r0> f202731b = new HashMap();

    private z2r0(Context context) {
        this.f202730a = context;
    }

    /* JADX INFO: renamed from: b */
    public static z2r0 m218456b(Context context) {
        if (context == null) {
            ouq0.m169378B("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f202729c == null) {
            synchronized (z2r0.class) {
                try {
                    if (f202729c == null) {
                        f202729c = new z2r0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f202729c;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, a3r0> m218457a() {
        return this.f202731b;
    }

    /* JADX INFO: renamed from: c */
    public a3r0 m218458c() {
        a3r0 a3r0Var = this.f202731b.get("UPLOADER_PUSH_CHANNEL");
        if (a3r0Var != null) {
            return a3r0Var;
        }
        a3r0 a3r0Var2 = this.f202731b.get("UPLOADER_HTTP");
        if (a3r0Var2 != null) {
            return a3r0Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m218459d(a3r0 a3r0Var, String str) {
        if (a3r0Var == null) {
            ouq0.m169378B("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            ouq0.m169378B("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m218457a().put(str, a3r0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m218460e(C14892gj c14892gj, String str) {
        if (TextUtils.isEmpty(str)) {
            ouq0.m169393m("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (C15003az.m87773a(c14892gj, false)) {
            return false;
        }
        if (TextUtils.isEmpty(c14892gj.m86804d())) {
            c14892gj.m86809f(C15003az.m87770a());
        }
        c14892gj.m86811g(str);
        C15005ba.m87782a(this.f202730a, c14892gj);
        return true;
    }
}
