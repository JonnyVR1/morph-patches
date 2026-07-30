package p149l;

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
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
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
public final class kpy0 {

    /* JADX INFO: renamed from: a */
    public final Application f124204a;

    /* JADX INFO: renamed from: b */
    public final Handler f124205b;

    /* JADX INFO: renamed from: c */
    public final Executor f124206c;

    /* JADX INFO: renamed from: d */
    public final nhr0 f124207d;

    /* JADX INFO: renamed from: e */
    public final ics0 f124208e;

    /* JADX INFO: renamed from: f */
    public final wzx0 f124209f;

    /* JADX INFO: renamed from: g */
    public final fuy0 f124210g;

    /* JADX INFO: renamed from: h */
    public final gsu0 f124211h;

    public kpy0(Application application, b3r0 b3r0Var, Handler handler, Executor executor, nhr0 nhr0Var, ics0 ics0Var, wzx0 wzx0Var, fuy0 fuy0Var, gsu0 gsu0Var) {
        this.f124204a = application;
        this.f124205b = handler;
        this.f124206c = executor;
        this.f124207d = nhr0Var;
        this.f124208e = ics0Var;
        this.f124209f = wzx0Var;
        this.f124210g = fuy0Var;
        this.f124211h = gsu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m146895a(final ConsentInformation.InterfaceC2634b interfaceC2634b, hxy0 hxy0Var) {
        Objects.requireNonNull(interfaceC2634b);
        this.f124205b.post(new Runnable() { // from class: l.jjy0
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2634b.mo15383a();
            }
        });
        if (hxy0Var.f110002b != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.f124208e.m135367c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m146896b(Activity activity, rw5 rw5Var, final ConsentInformation.InterfaceC2634b interfaceC2634b, final ConsentInformation.InterfaceC2633a interfaceC2633a) {
        try {
            pw5 pw5VarM181375a = rw5Var.m181375a();
            if (pw5VarM181375a == null || !pw5VarM181375a.m171705b()) {
                v7t0.m197386a(this.f124204a);
            }
            final hxy0 hxy0VarM171255a = new psy0(this.f124210g, m146898d(this.f124209f.m206319c(activity, rw5Var))).m171255a();
            this.f124207d.m159450e(hxy0VarM171255a.f110001a);
            this.f124207d.m159452g(hxy0VarM171255a.f110002b);
            this.f124208e.m135368d(hxy0VarM171255a.f110003c);
            this.f124211h.m127839a().execute(new Runnable() { // from class: l.oly0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144567a.m146895a(interfaceC2634b, hxy0VarM171255a);
                }
            });
        } catch (zzg e) {
            this.f124205b.post(new Runnable() { // from class: l.uey0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2633a.mo15382a(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.f124205b.post(new Runnable() { // from class: l.khy0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2633a.mo15382a(zzgVar.zza());
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m146897c(@Nullable final Activity activity, final rw5 rw5Var, final ConsentInformation.InterfaceC2634b interfaceC2634b, final ConsentInformation.InterfaceC2633a interfaceC2633a) {
        this.f124206c.execute(new Runnable() { // from class: l.sny0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165528a.m146896b(activity, rw5Var, interfaceC2634b, interfaceC2633a);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final m6t0 m146898d(w3t0 w3t0Var) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f124204a));
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
                    String str = w3t0Var.f184435a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    vys0 vys0Var = w3t0Var.f184436b;
                    if (vys0Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = vys0Var.f183551c;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = vys0Var.f183549a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = vys0Var.f183550b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = w3t0Var.f184437c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = w3t0Var.f184438d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = w3t0Var.f184439e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    h1t0 h1t0Var = w3t0Var.f184440f;
                    if (h1t0Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = h1t0Var.f105460a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = h1t0Var.f105461b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = h1t0Var.f105462c;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzs0> list = h1t0Var.f105463d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzs0 zzs0Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzs0Var.f205822a;
                                if (num4 != null) {
                                    jsonWriter.name(StickStatus.top);
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzs0Var.f205823b;
                                if (num5 != null) {
                                    jsonWriter.name(BLiveGiftBubblePopupTitlePosition.left);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzs0Var.f205824c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzs0Var.f205825d;
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
                    zus0 zus0Var = w3t0Var.f184441g;
                    if (zus0Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = zus0Var.f204886a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = zus0Var.f204887b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zus0Var.f204888c;
                        if (str6 != null) {
                            jsonWriter.name(WBConstants.AUTH_PARAMS_VERSION);
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    p2t0 p2t0Var = w3t0Var.f184442h;
                    if (p2t0Var != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = p2t0Var.f146929a;
                        if (str7 != null) {
                            jsonWriter.name(WBConstants.AUTH_PARAMS_VERSION);
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = w3t0Var.f184443i;
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
                        m6t0 m6t0VarM153295a = m6t0.m153295a(new JsonReader(new StringReader(headerField)));
                        m6t0VarM153295a.f131763a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return m6t0VarM153295a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            m6t0 m6t0VarM153295a2 = m6t0.m153295a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return m6t0VarM153295a2;
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
