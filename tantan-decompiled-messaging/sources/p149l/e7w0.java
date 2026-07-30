package p149l;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e7w0 {

    /* JADX INFO: renamed from: a */
    public i8w0 f89761a;

    /* JADX INFO: renamed from: b */
    public long f89762b;

    /* JADX INFO: renamed from: c */
    public int f89763c;

    public e7w0() {
        m115217b();
        this.f89761a = new i8w0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final WebView m115216a() {
        return (WebView) this.f89761a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m115217b() {
        this.f89762b = System.nanoTime();
        this.f89763c = 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo115218c() {
        this.f89761a.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m115219d(String str, long j) {
        if (j < this.f89762b || this.f89763c == 3) {
            return;
        }
        this.f89763c = 3;
        x6w0.m207211a().m207218g(m115216a(), str);
    }

    /* JADX INFO: renamed from: e */
    public final void m115220e(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        k7w0.m144708e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        x6w0.m207211a().m207217f(m115216a(), jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m115221f(String str, long j) {
        if (j >= this.f89762b) {
            this.f89763c = 2;
            x6w0.m207211a().m207218g(m115216a(), str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo115222g(e6w0 e6w0Var, d6w0 d6w0Var) {
        m115223h(e6w0Var, d6w0Var, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m115223h(e6w0 e6w0Var, d6w0 d6w0Var, JSONObject jSONObject) {
        String strM115116h = e6w0Var.m115116h();
        JSONObject jSONObject2 = new JSONObject();
        k7w0.m144708e(jSONObject2, "environment", "app");
        k7w0.m144708e(jSONObject2, "adSessionType", d6w0Var.m110196d());
        JSONObject jSONObject3 = new JSONObject();
        k7w0.m144708e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        k7w0.m144708e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        k7w0.m144708e(jSONObject3, "os", "Android");
        k7w0.m144708e(jSONObject2, "deviceInfo", jSONObject3);
        k7w0.m144708e(jSONObject2, "deviceCategory", j7w0.m140120a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        k7w0.m144708e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        k7w0.m144708e(jSONObject4, "partnerName", d6w0Var.m110197e().m119698b());
        k7w0.m144708e(jSONObject4, "partnerVersion", d6w0Var.m110197e().m119699c());
        k7w0.m144708e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        k7w0.m144708e(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        k7w0.m144708e(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, r6w0.m178099b().m178100a().getApplicationContext().getPackageName());
        k7w0.m144708e(jSONObject2, "app", jSONObject5);
        if (d6w0Var.m110198f() != null) {
            k7w0.m144708e(jSONObject2, "contentUrl", d6w0Var.m110198f());
        }
        k7w0.m144708e(jSONObject2, "customReferenceData", d6w0Var.m110199g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = d6w0Var.m110200h().iterator();
        if (it.hasNext()) {
            throw null;
        }
        x6w0.m207211a().m207219h(m115216a(), strM115116h, jSONObject2, jSONObject6, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final void m115224i(float f) {
        x6w0.m207211a().m207216e(m115216a(), f);
    }

    /* JADX INFO: renamed from: j */
    public final void m115225j(WebView webView) {
        this.f89761a = new i8w0(webView);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m115227l() {
        return this.f89761a.get() != 0;
    }

    /* JADX INFO: renamed from: k */
    public void mo115226k() {
    }
}
