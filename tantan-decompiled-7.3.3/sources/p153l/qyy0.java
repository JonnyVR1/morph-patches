package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.consent_sdk.zzca;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentInformation;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class qyy0 {

    /* JADX INFO: renamed from: a */
    public final Application f160202a;

    /* JADX INFO: renamed from: b */
    public final Handler f160203b;

    /* JADX INFO: renamed from: c */
    public final Executor f160204c;

    /* JADX INFO: renamed from: d */
    public final tqr0 f160205d;

    /* JADX INFO: renamed from: e */
    public final ols0 f160206e;

    /* JADX INFO: renamed from: f */
    public final c9y0 f160207f;

    /* JADX INFO: renamed from: g */
    public final l3z0 f160208g;

    /* JADX INFO: renamed from: h */
    public final m1v0 f160209h;

    public qyy0(Application application, hcr0 hcr0Var, Handler handler, Executor executor, tqr0 tqr0Var, ols0 ols0Var, c9y0 c9y0Var, l3z0 l3z0Var, m1v0 m1v0Var) {
        this.f160202a = application;
        this.f160203b = handler;
        this.f160204c = executor;
        this.f160205d = tqr0Var;
        this.f160206e = ols0Var;
        this.f160207f = c9y0Var;
        this.f160208g = l3z0Var;
        this.f160209h = m1v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m178757a(final ConsentInformation.InterfaceC2657b interfaceC2657b, n6z0 n6z0Var) {
        Objects.requireNonNull(interfaceC2657b);
        this.f160203b.post(new Runnable() { // from class: l.psy0
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2657b.mo15437a();
            }
        });
        if (n6z0Var.f140564b != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.f160206e.m168167c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m178758b(Activity activity, wx5 wx5Var, final ConsentInformation.InterfaceC2657b interfaceC2657b, final ConsentInformation.InterfaceC2656a interfaceC2656a) {
        try {
            ux5 ux5VarM208366a = wx5Var.m208366a();
            if (ux5VarM208366a == null || !ux5VarM208366a.m198399b()) {
                bht0.m104368a(this.f160202a);
            }
            final n6z0 n6z0VarM199090a = new v1z0(this.f160208g, m178760d(this.f160207f.m108462c(activity, wx5Var))).m199090a();
            this.f160205d.m192355e(n6z0VarM199090a.f140563a);
            this.f160205d.m192357g(n6z0VarM199090a.f140564b);
            this.f160206e.m168168d(n6z0VarM199090a.f140565c);
            this.f160209h.m156721a().execute(new Runnable() { // from class: l.uuy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181099a.m178757a(interfaceC2657b, n6z0VarM199090a);
                }
            });
        } catch (zzg e) {
            this.f160203b.post(new Runnable() { // from class: l.aoy0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2656a.mo15436a(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.f160203b.post(new Runnable() { // from class: l.qqy0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2656a.mo15436a(zzgVar.zza());
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m178759c(@Nullable final Activity activity, final wx5 wx5Var, final ConsentInformation.InterfaceC2657b interfaceC2657b, final ConsentInformation.InterfaceC2656a interfaceC2656a) {
        this.f160204c.execute(new Runnable() { // from class: l.ywy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201893a.m178758b(activity, wx5Var, interfaceC2657b, interfaceC2656a);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final sft0 m178760d(cdt0 cdt0Var) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f160202a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = cdt0Var.f81264a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    b8t0 b8t0Var = cdt0Var.f81265b;
                    if (b8t0Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = b8t0Var.f75478c;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = b8t0Var.f75476a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = b8t0Var.f75477b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = cdt0Var.f81266c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = cdt0Var.f81267d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = cdt0Var.f81268e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    nat0 nat0Var = cdt0Var.f81269f;
                    if (nat0Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = nat0Var.f141043a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = nat0Var.f141044b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = nat0Var.f141045c;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<f9t0> list = nat0Var.f141046d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (f9t0 f9t0Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = f9t0Var.f97909a;
                                if (num4 != null) {
                                    jsonWriter.name(StickStatus.top);
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = f9t0Var.f97910b;
                                if (num5 != null) {
                                    jsonWriter.name(BLiveGiftBubblePopupTitlePosition.left);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = f9t0Var.f97911c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = f9t0Var.f97912d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    f4t0 f4t0Var = cdt0Var.f81270g;
                    if (f4t0Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = f4t0Var.f97141a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = f4t0Var.f97142b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = f4t0Var.f97143c;
                        if (str6 != null) {
                            jsonWriter.name(WBConstants.AUTH_PARAMS_VERSION);
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    vbt0 vbt0Var = cdt0Var.f81271h;
                    if (vbt0Var != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = vbt0Var.f183293a;
                        if (str7 != null) {
                            jsonWriter.name(WBConstants.AUTH_PARAMS_VERSION);
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = cdt0Var.f81272i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((zzca) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        sft0 sft0VarM185671a = sft0.m185671a(new JsonReader(new StringReader(headerField)));
                        sft0VarM185671a.f167767a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return sft0VarM185671a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            sft0 sft0VarM185671a2 = sft0.m185671a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return sft0VarM185671a2;
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        }
    }
}
