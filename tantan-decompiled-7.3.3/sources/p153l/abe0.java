package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.scheme.SchemeDoFactory;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class abe0 {

    /* JADX INFO: renamed from: g */
    public static String f69605g;

    /* JADX INFO: renamed from: a */
    public String f69606a;

    /* JADX INFO: renamed from: b */
    public String f69607b;

    /* JADX INFO: renamed from: c */
    public String f69608c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f69609d;

    /* JADX INFO: renamed from: e */
    public Context f69610e;

    /* JADX INFO: renamed from: f */
    public boolean f69611f;

    /* JADX INFO: renamed from: l.abe0$a */
    public static class C15681a {

        /* JADX INFO: renamed from: a */
        public Context f69612a;

        /* JADX INFO: renamed from: b */
        public String f69613b;

        /* JADX INFO: renamed from: c */
        public boolean f69614c = true;

        public C15681a(Context context, String str) {
            this.f69612a = context;
            this.f69613b = str;
        }

        /* JADX INFO: renamed from: d */
        public abe0 m96748d() {
            if (TextUtils.isEmpty(this.f69613b)) {
                this.f69614c = false;
            }
            if (!this.f69613b.startsWith("tantan")) {
                this.f69614c = false;
            }
            if (this.f69612a == null) {
                this.f69614c = false;
            }
            return new abe0(this);
        }
    }

    public abe0(C15681a c15681a) {
        this.f69611f = c15681a.f69614c;
        this.f69606a = c15681a.f69613b;
        this.f69610e = c15681a.f69612a;
        if (this.f69611f) {
            bkj0<String, Map<String, String>, String> bkj0VarM96737h = m96737h(this.f69606a);
            if (bkj0VarM96737h == null) {
                this.f69611f = false;
                return;
            }
            this.f69607b = bkj0VarM96737h.f77081a;
            this.f69609d = bkj0VarM96737h.f77082b;
            this.f69608c = bkj0VarM96737h.f77083c;
        }
    }

    /* JADX INFO: renamed from: h */
    public static bkj0<String, Map<String, String>, String> m96737h(@NonNull String str) {
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
        return new bkj0<>(host, map, path);
    }

    /* JADX INFO: renamed from: a */
    public void m96738a(z20<String, String> z20Var) {
        Activity activityM105506D;
        if (this.f69611f) {
            try {
                SchemeDoFactory.m30664a(this, z20Var);
            } catch (Exception e) {
                CrashHelper.m82483g(e);
                if (!uqb0.f180397c0.signedIn_() || nae0.m162081k() || (activityM105506D = bnl0.m105506D(m96739b())) == null) {
                    return;
                }
                nae0.m162077g(activityM105506D);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Context m96739b() {
        return this.f69610e;
    }

    /* JADX INFO: renamed from: c */
    public String m96740c() {
        return this.f69606a;
    }

    /* JADX INFO: renamed from: d */
    public String m96741d() {
        return this.f69607b;
    }

    /* JADX INFO: renamed from: e */
    public Intent m96742e(z20<String, String> z20Var) {
        if (this.f69611f) {
            return SchemeDoFactory.m30665b(this, z20Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, String> m96743f() {
        return this.f69609d;
    }

    /* JADX INFO: renamed from: g */
    public String m96744g() {
        return this.f69608c;
    }
}
