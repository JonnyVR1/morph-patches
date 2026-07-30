package p149l;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d6w0 {

    /* JADX INFO: renamed from: a */
    public final f6w0 f84677a;

    /* JADX INFO: renamed from: b */
    public final WebView f84678b;

    /* JADX INFO: renamed from: c */
    public final List f84679c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map f84680d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final String f84681e = "";

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f84682f;

    /* JADX INFO: renamed from: g */
    public final zzfog f84683g;

    public d6w0(f6w0 f6w0Var, WebView webView, String str, List list, @Nullable String str2, String str3, zzfog zzfogVar) {
        this.f84677a = f6w0Var;
        this.f84678b = webView;
        this.f84683g = zzfogVar;
        this.f84682f = str2;
    }

    /* JADX INFO: renamed from: b */
    public static d6w0 m110193b(f6w0 f6w0Var, WebView webView, @Nullable String str, String str2) {
        return new d6w0(f6w0Var, webView, null, null, str, "", zzfog.HTML);
    }

    /* JADX INFO: renamed from: c */
    public static d6w0 m110194c(f6w0 f6w0Var, WebView webView, @Nullable String str, String str2) {
        return new d6w0(f6w0Var, webView, null, null, str, "", zzfog.JAVASCRIPT);
    }

    /* JADX INFO: renamed from: a */
    public final WebView m110195a() {
        return this.f84678b;
    }

    /* JADX INFO: renamed from: d */
    public final zzfog m110196d() {
        return this.f84683g;
    }

    /* JADX INFO: renamed from: e */
    public final f6w0 m110197e() {
        return this.f84677a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m110198f() {
        return this.f84682f;
    }

    /* JADX INFO: renamed from: g */
    public final String m110199g() {
        return this.f84681e;
    }

    /* JADX INFO: renamed from: h */
    public final List m110200h() {
        return Collections.unmodifiableList(this.f84679c);
    }

    /* JADX INFO: renamed from: i */
    public final Map m110201i() {
        return Collections.unmodifiableMap(this.f84680d);
    }
}
