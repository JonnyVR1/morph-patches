package p153l;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class kgw0 {

    /* JADX INFO: renamed from: a */
    public ohw0 f126659a;

    /* JADX INFO: renamed from: b */
    public long f126660b;

    /* JADX INFO: renamed from: c */
    public int f126661c;

    public kgw0() {
        m149765b();
        this.f126659a = new ohw0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final WebView m149764a() {
        return (WebView) this.f126659a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m149765b() {
        this.f126660b = System.nanoTime();
        this.f126661c = 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo149766c() {
        this.f126659a.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m149767d(String str, long j) {
        if (j < this.f126660b || this.f126661c == 3) {
            return;
        }
        this.f126661c = 3;
        dgw0.m115758a().m115765g(m149764a(), str);
    }

    /* JADX INFO: renamed from: e */
    public final void m149768e(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        qgw0.m176525e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        dgw0.m115758a().m115764f(m149764a(), jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m149769f(String str, long j) {
        if (j >= this.f126660b) {
            this.f126661c = 2;
            dgw0.m115758a().m115765g(m149764a(), str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo149770g(kfw0 kfw0Var, jfw0 jfw0Var) {
        m149771h(kfw0Var, jfw0Var, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m149771h(kfw0 kfw0Var, jfw0 jfw0Var, JSONObject jSONObject) {
        String strM149628h = kfw0Var.m149628h();
        JSONObject jSONObject2 = new JSONObject();
        qgw0.m176525e(jSONObject2, "environment", "app");
        qgw0.m176525e(jSONObject2, "adSessionType", jfw0Var.m144733d());
        JSONObject jSONObject3 = new JSONObject();
        qgw0.m176525e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        qgw0.m176525e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        qgw0.m176525e(jSONObject3, "os", "Android");
        qgw0.m176525e(jSONObject2, "deviceInfo", jSONObject3);
        qgw0.m176525e(jSONObject2, "deviceCategory", pgw0.m172282a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        qgw0.m176525e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        qgw0.m176525e(jSONObject4, "partnerName", jfw0Var.m144734e().m154040b());
        qgw0.m176525e(jSONObject4, "partnerVersion", jfw0Var.m144734e().m154041c());
        qgw0.m176525e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        qgw0.m176525e(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        qgw0.m176525e(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, xfw0.m210858b().m210859a().getApplicationContext().getPackageName());
        qgw0.m176525e(jSONObject2, "app", jSONObject5);
        if (jfw0Var.m144735f() != null) {
            qgw0.m176525e(jSONObject2, "contentUrl", jfw0Var.m144735f());
        }
        qgw0.m176525e(jSONObject2, "customReferenceData", jfw0Var.m144736g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = jfw0Var.m144737h().iterator();
        if (it.hasNext()) {
            throw null;
        }
        dgw0.m115758a().m115766h(m149764a(), strM149628h, jSONObject2, jSONObject6, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final void m149772i(float f) {
        dgw0.m115758a().m115763e(m149764a(), f);
    }

    /* JADX INFO: renamed from: j */
    public final void m149773j(WebView webView) {
        this.f126659a = new ohw0(webView);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m149775l() {
        return this.f126659a.get() != 0;
    }

    /* JADX INFO: renamed from: k */
    public void mo149774k() {
    }
}
