package p153l;

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
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class puq0 {

    /* JADX INFO: renamed from: a */
    d610.C16462c f154212a;

    /* JADX INFO: renamed from: b */
    Map<String, String> f154213b;

    /* JADX INFO: renamed from: c */
    volatile JSONObject f154214c;

    /* JADX INFO: renamed from: b */
    private static r4r0 m173899b(String str, byte[] bArr, String str2, String str3) {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                irq0.m141848a(httpURLConnection);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
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
                            m4r0.m157051a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            m4r0.m157051a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    r4r0 r4r0Var = new r4r0(responseCode, "http response code " + responseCode);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                    m4r0.m157051a(null);
                    return r4r0Var;
                }
                r4r0 r4r0Var2 = new r4r0(206, "http response code " + responseCode);
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused2) {
                }
                m4r0.m157051a(null);
                return r4r0Var2;
            } catch (Throwable th3) {
                th = th3;
                try {
                    q5r0.m175516f(th);
                    return new r4r0(207, th);
                } finally {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    m4r0.m157051a(null);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m173900c(HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("magic_tag", "ss_app_log");
        if (this.f154214c == null) {
            Context contextM161022i = n0r0.m161022i();
            try {
                this.f154214c = new JSONObject();
                if (this.f154213b != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : this.f154213b.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    this.f154214c.put("custom", jSONObject2);
                }
                this.f154214c.put("os", "Android");
                this.f154214c.put("platform", "Android");
                this.f154214c.put("os_version", hwq0.m137485k());
                this.f154214c.put("os_api", Build.VERSION.SDK_INT);
                this.f154214c.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, this.f154212a.f85239d);
                this.f154214c.put("sdk_version_code", this.f154212a.f85239d);
                this.f154214c.put("sdk_version_name", this.f154212a.f85240e);
                this.f154214c.put("aid", this.f154212a.f85236a);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    str = str2 + ' ' + str;
                }
                this.f154214c.put("device_model", str);
                this.f154214c.put("device_brand", str2);
                this.f154214c.put("device_manufacturer", Build.MANUFACTURER);
                this.f154214c.put("channel", this.f154212a.f85238c);
                this.f154214c.put("app_version", this.f154212a.f85240e);
                this.f154214c.put("version_code", this.f154212a.f85239d);
                this.f154214c.put("update_version_code", this.f154212a.f85239d);
                this.f154214c.put("manifest_version_code", this.f154212a.f85239d);
                this.f154214c.put("bd_did", this.f154212a.m114354b());
                String packageName = contextM161022i.getPackageName();
                this.f154214c.put("package", packageName);
                PackageInfo packageInfo = contextM161022i.getPackageManager().getPackageInfo(packageName, 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    int i = applicationInfo.labelRes;
                    this.f154214c.put("display_name", i > 0 ? contextM161022i.getString(i) : contextM161022i.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            } catch (Exception unused) {
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("header", this.f154214c);
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
    public String m173901a() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m173902d(Context context, d610.C16462c c16462c, Map<String, String> map) {
        if (c16462c == null) {
            return;
        }
        this.f154212a = c16462c;
        this.f154213b = map;
    }

    /* JADX INFO: renamed from: f */
    public void m173904f(HashMap<String, String> map, o7m o7mVar) {
        d610.C16462c c16462c = this.f154212a;
        if (c16462c == null && !TextUtils.isEmpty(c16462c.m114354b())) {
            if (o7mVar != null) {
                o7mVar.m166363a(false);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObjectM173900c = m173900c(map);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(jSONObjectM173900c.toString().getBytes("UTF-8"));
                    m4r0.m157051a(gZIPOutputStream2);
                } catch (Throwable unused) {
                    gZIPOutputStream = gZIPOutputStream2;
                    m4r0.m157051a(gZIPOutputStream);
                }
            } catch (Throwable unused2) {
            }
            m4r0.m157051a(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str = n0r0.m161024k().m169526i() + "?version_code=" + this.f154212a.f85239d + "&device_platform=android&aid=" + this.f154212a.f85236a + "&iid=iid";
            d610.C16462c c16462c2 = this.f154212a;
            r4r0 r4r0VarM173899b = m173899b(str, byteArray, c16462c2.f85236a, c16462c2.f85237b);
            if (o7mVar != null) {
                o7mVar.m166363a(r4r0VarM173899b.m179816a());
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m173903e(String str) {
    }
}
