package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class w2e0 {

    /* JADX INFO: renamed from: g */
    public static String f184217g;

    /* JADX INFO: renamed from: a */
    public String f184218a;

    /* JADX INFO: renamed from: b */
    public String f184219b;

    /* JADX INFO: renamed from: c */
    public String f184220c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f184221d;

    /* JADX INFO: renamed from: e */
    public Context f184222e;

    /* JADX INFO: renamed from: f */
    public boolean f184223f;

    /* JADX INFO: renamed from: l.w2e0$a */
    public static class C20787a {

        /* JADX INFO: renamed from: a */
        public Context f184224a;

        /* JADX INFO: renamed from: b */
        public String f184225b;

        /* JADX INFO: renamed from: c */
        public boolean f184226c = true;

        public C20787a(Context context, String str) {
            this.f184224a = context;
            this.f184225b = str;
        }

        /* JADX INFO: renamed from: d */
        public w2e0 m201103d() {
            if (TextUtils.isEmpty(this.f184225b)) {
                this.f184226c = false;
            }
            if (!this.f184225b.startsWith("tantan")) {
                this.f184226c = false;
            }
            if (this.f184224a == null) {
                this.f184226c = false;
            }
            return new w2e0(this);
        }
    }

    public w2e0(C20787a c20787a) {
        this.f184223f = c20787a.f184226c;
        this.f184218a = c20787a.f184225b;
        this.f184222e = c20787a.f184224a;
        if (this.f184223f) {
            xaj0<String, Map<String, String>, String> xaj0VarM201092h = m201092h(this.f184218a);
            if (xaj0VarM201092h == null) {
                this.f184223f = false;
                return;
            }
            this.f184219b = xaj0VarM201092h.f191751a;
            this.f184221d = xaj0VarM201092h.f191752b;
            this.f184220c = xaj0VarM201092h.f191753c;
        }
    }

    /* JADX INFO: renamed from: h */
    public static xaj0<String, Map<String, String>, String> m201092h(@NonNull String str) {
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
    public void m201093a(f30<String, String> f30Var) {
        Activity activityM208326D;
        if (this.f184223f) {
            try {
                SchemeDoFactory.m29666a(this, f30Var);
            } catch (Exception e) {
                CrashHelper.m81300g(e);
                if (!qib0.f154714c0.signedIn_() || j2e0.m139444k() || (activityM208326D = xdl0.m208326D(m201094b())) == null) {
                    return;
                }
                j2e0.m139440g(activityM208326D);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m201094b() {
        return this.f184222e;
    }

    /* JADX INFO: renamed from: c */
    public String m201095c() {
        return this.f184218a;
    }

    /* JADX INFO: renamed from: d */
    public String m201096d() {
        return this.f184219b;
    }

    /* JADX INFO: renamed from: e */
    public Intent m201097e(f30<String, String> f30Var) {
        if (this.f184223f) {
            return SchemeDoFactory.m29667b(this, f30Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, String> m201098f() {
        return this.f184221d;
    }

    /* JADX INFO: renamed from: g */
    public String m201099g() {
        return this.f184220c;
    }
}
