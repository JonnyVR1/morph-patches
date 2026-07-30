package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jlq0 {

    /* JADX INFO: renamed from: a */
    tx00.C20306c f118555a;

    /* JADX INFO: renamed from: b */
    Map<String, String> f118556b;

    /* JADX INFO: renamed from: c */
    volatile JSONObject f118557c;

    /* JADX INFO: renamed from: b */
    private static lvq0 m142103b(String str, byte[] bArr, String str2, String str3) {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                diq0.m111907a(httpURLConnection);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
                httpURLConnection.setRequestProperty("Accept-Encoding", HttpHeaderValues.GZIP);
                if (!TextUtils.isEmpty(str3)) {
                    httpURLConnection.setRequestProperty("aid", str2);
                    httpURLConnection.setRequestProperty("x-auth-token", str3);
                }
                httpURLConnection.setRequestMethod("POST");
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            gvq0.m128290a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            gvq0.m128290a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    lvq0 lvq0Var = new lvq0(responseCode, "http response code " + responseCode);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                    gvq0.m128290a(null);
                    return lvq0Var;
                }
                lvq0 lvq0Var2 = new lvq0(206, "http response code " + responseCode);
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused2) {
                }
                gvq0.m128290a(null);
                return lvq0Var2;
            } catch (Throwable th3) {
                th = th3;
                try {
                    kwq0.m147633f(th);
                    return new lvq0(207, th);
                } finally {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    gvq0.m128290a(null);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m142104c(HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("magic_tag", "ss_app_log");
        if (this.f118557c == null) {
            Context contextM132700i = hrq0.m132700i();
            try {
                this.f118557c = new JSONObject();
                if (this.f118556b != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : this.f118556b.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    this.f118557c.put("custom", jSONObject2);
                }
                this.f118557c.put("os", "Android");
                this.f118557c.put("platform", "Android");
                this.f118557c.put("os_version", bnq0.m102841k());
                this.f118557c.put("os_api", Build.VERSION.SDK_INT);
                this.f118557c.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, this.f118555a.f172456d);
                this.f118557c.put("sdk_version_code", this.f118555a.f172456d);
                this.f118557c.put("sdk_version_name", this.f118555a.f172457e);
                this.f118557c.put("aid", this.f118555a.f172453a);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    str = str2 + ' ' + str;
                }
                this.f118557c.put("device_model", str);
                this.f118557c.put("device_brand", str2);
                this.f118557c.put("device_manufacturer", Build.MANUFACTURER);
                this.f118557c.put("channel", this.f118555a.f172455c);
                this.f118557c.put("app_version", this.f118555a.f172457e);
                this.f118557c.put("version_code", this.f118555a.f172456d);
                this.f118557c.put("update_version_code", this.f118555a.f172456d);
                this.f118557c.put("manifest_version_code", this.f118555a.f172456d);
                this.f118557c.put("bd_did", this.f118555a.m190928b());
                String packageName = contextM132700i.getPackageName();
                this.f118557c.put("package", packageName);
                PackageInfo packageInfo = contextM132700i.getPackageManager().getPackageInfo(packageName, 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    int i = applicationInfo.labelRes;
                    this.f118557c.put("display_name", i > 0 ? contextM132700i.getString(i) : contextM132700i.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            } catch (Exception unused) {
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("header", this.f118557c);
        jSONObject.put("local_time", jCurrentTimeMillis);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        jSONObject3.put("local_time_ms", jCurrentTimeMillis2);
        jSONObject3.put("tea_event_index", 10001);
        jSONObject3.put("session_id", UUID.randomUUID().toString());
        jSONObject3.put("datetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(jCurrentTimeMillis2)));
        if (map != null) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject4.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject3.put("pv_filters", jSONObject4);
        }
        jSONArray.put(jSONObject3);
        jSONObject.put("launch", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public String m142105a() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m142106d(Context context, tx00.C20306c c20306c, Map<String, String> map) {
        if (c20306c == null) {
            return;
        }
        this.f118555a = c20306c;
        this.f118556b = map;
    }

    /* JADX INFO: renamed from: f */
    public void m142108f(HashMap<String, String> map, y4m y4mVar) {
        tx00.C20306c c20306c = this.f118555a;
        if (c20306c == null && !TextUtils.isEmpty(c20306c.m190928b())) {
            if (y4mVar != null) {
                y4mVar.m212925a(false);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObjectM142104c = m142104c(map);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(jSONObjectM142104c.toString().getBytes("UTF-8"));
                    gvq0.m128290a(gZIPOutputStream2);
                } catch (Throwable unused) {
                    gZIPOutputStream = gZIPOutputStream2;
                    gvq0.m128290a(gZIPOutputStream);
                }
            } catch (Throwable unused2) {
            }
            gvq0.m128290a(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str = hrq0.m132702k().m143405i() + "?version_code=" + this.f118555a.f172456d + "&device_platform=android&aid=" + this.f118555a.f172453a + "&iid=iid";
            tx00.C20306c c20306c2 = this.f118555a;
            lvq0 lvq0VarM142103b = m142103b(str, byteArray, c20306c2.f172453a, c20306c2.f172454b);
            if (y4mVar != null) {
                y4mVar.m212925a(lvq0VarM142103b.m151903a());
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m142107e(String str) {
    }
}
