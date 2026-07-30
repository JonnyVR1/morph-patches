package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;
import l.f30;
import l.xaj0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w2e0 {

    /* JADX INFO: renamed from: g */
    public static String f24878g;

    /* JADX INFO: renamed from: a */
    public String f24879a;

    /* JADX INFO: renamed from: b */
    public String f24880b;

    /* JADX INFO: renamed from: c */
    public String f24881c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f24882d;

    /* JADX INFO: renamed from: e */
    public Context f24883e;

    /* JADX INFO: renamed from: f */
    public boolean f24884f;

    /* JADX INFO: renamed from: l.w2e0$a */
    public static class C1398a {

        /* JADX INFO: renamed from: a */
        public Context f24885a;

        /* JADX INFO: renamed from: b */
        public String f24886b;

        /* JADX INFO: renamed from: c */
        public boolean f24887c = true;

        public C1398a(Context context, String str) {
            this.f24885a = context;
            this.f24886b = str;
        }

        /* JADX INFO: renamed from: d */
        public w2e0 m26165d() {
            if (TextUtils.isEmpty(this.f24886b)) {
                this.f24887c = false;
            }
            if (!this.f24886b.startsWith("tantan")) {
                this.f24887c = false;
            }
            if (this.f24885a == null) {
                this.f24887c = false;
            }
            return new w2e0(this);
        }
    }

    public w2e0(C1398a c1398a) {
        this.f24884f = c1398a.f24887c;
        this.f24879a = c1398a.f24886b;
        this.f24883e = c1398a.f24885a;
        if (this.f24884f) {
            xaj0<String, Map<String, String>, String> xaj0VarM26154h = m26154h(this.f24879a);
            if (xaj0VarM26154h == null) {
                this.f24884f = false;
                return;
            }
            this.f24880b = (String) xaj0VarM26154h.a;
            this.f24882d = (Map) xaj0VarM26154h.b;
            this.f24881c = (String) xaj0VarM26154h.c;
        }
    }

    /* JADX INFO: renamed from: h */
    public static xaj0<String, Map<String, String>, String> m26154h(@NonNull String str) {
        Uri uri = Uri.parse(Uri.decode(str));
        String host = uri.getHost();
        String path = uri.getPath();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : uri.getQueryParameterNames()) {
            map.put(str2, uri.getQueryParameter(str2));
        }
        String fragment = uri.getFragment();
        if (!TextUtils.isEmpty(fragment) && map.containsKey("url")) {
            map.put("url", ((String) map.get("url")) + "#" + fragment);
        }
        return new xaj0<>(host, map, path);
    }

    /* JADX INFO: renamed from: a */
    public void m26155a(f30<String, String> f30Var) {
        Activity activityD;
        if (this.f24884f) {
            try {
                SchemeDoFactory.m1576a(this, f30Var);
            } catch (Exception e) {
                CrashHelper.g(e);
                if (!qib0.f19805c0.signedIn_() || j2e0.m17246k() || (activityD = xdl0.D(m26156b())) == null) {
                    return;
                }
                j2e0.m17242g(activityD);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m26156b() {
        return this.f24883e;
    }

    /* JADX INFO: renamed from: c */
    public String m26157c() {
        return this.f24879a;
    }

    /* JADX INFO: renamed from: d */
    public String m26158d() {
        return this.f24880b;
    }

    /* JADX INFO: renamed from: e */
    public Intent m26159e(f30<String, String> f30Var) {
        if (this.f24884f) {
            return SchemeDoFactory.m1577b(this, f30Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, String> m26160f() {
        return this.f24882d;
    }

    /* JADX INFO: renamed from: g */
    public String m26161g() {
        return this.f24881c;
    }
}
