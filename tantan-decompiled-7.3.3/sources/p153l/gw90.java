package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class gw90 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f106740a = new wyd0("hometown_language_storage_tag", "");

    /* JADX INFO: renamed from: b */
    public static C22507a<HometownSuggest> f106741b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m132583c(File file, String str, DownloadTask downloadTask, File file2) {
        synchronized (gw90.class) {
            String absolutePath = file2.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            String str2 = File.separator;
            sb.append(str2);
            if (qwa.m178458i(absolutePath, sb.toString())) {
                String strM178457h = qwa.m178457h(new File(file + str2 + "fromSuggestions.json"));
                if (!TextUtils.isEmpty(strM178457h)) {
                    try {
                        f106741b.m137019l(HometownSuggest.JSON_ADAPTER.parse(strM178457h));
                    } catch (IOException e) {
                        CrashHelper.m82479c(e);
                    }
                    f106740a.put(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m132584d() {
        final String string = "";
        String str = "";
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("profile_hometown_language");
            if (!TextUtils.isEmpty(strM80485F)) {
                JSONObject jSONObject = new JSONObject(strM80485F);
                if (jSONObject.has("url")) {
                    string = jSONObject.getString("url");
                }
            }
        } catch (Exception unused) {
        }
        String strM132586f = m132586f();
        File fileM132585e = m132585e();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (TextUtils.isEmpty(strM132586f)) {
            return;
        }
        if (qwa.m178452c(fileM132585e)) {
            final File file = new File(strM132586f);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM132586f + File.separator + "fromSuggestions.zip";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            wyd0 wyd0Var = f106740a;
            if (!TextUtils.isEmpty(wyd0Var.get()) && TextUtils.equals(wyd0Var.get(), string)) {
                if (qwa.m178454e(file + File.separator + "fromSuggestions.json")) {
                    return;
                }
            }
            DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(string).m80823o(str).m80818j(new z20() { // from class: l.ew90
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    gw90.m132583c(file, string, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.fw90
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.m82479c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).m80809a();
            if (!C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
                C13274a.m80837u().m80848o(downloadTaskM80809a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m132585e() {
        File externalCacheDir = oki.m168026n() ? CoreModule.f18263b.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = CoreModule.f18263b.getCacheDir();
        }
        return externalCacheDir == null ? CoreModule.f18263b.getCacheDir() : externalCacheDir;
    }

    /* JADX INFO: renamed from: f */
    public static String m132586f() {
        File fileM132585e = m132585e();
        if (!NullChecker.m82486a(fileM132585e) || !fileM132585e.exists()) {
            return "";
        }
        return fileM132585e.getAbsolutePath() + File.separator + Constants.KEY_CONFIG;
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<HometownSuggest> m132587g() {
        if (f106741b.m222761e() == null) {
            l51.m152919y(new Runnable() { // from class: l.dw90
                @Override // java.lang.Runnable
                public final void run() {
                    gw90.m132589i();
                }
            });
        }
        return f106741b;
    }

    /* JADX INFO: renamed from: h */
    public static HometownSuggest m132588h() {
        return f106741b.m222761e();
    }

    /* JADX INFO: renamed from: i */
    public static void m132589i() {
        HometownSuggest hometownSuggestNew_;
        String strM132586f = m132586f();
        if (!TextUtils.isEmpty(strM132586f)) {
            File file = new File(strM132586f);
            if (file.exists()) {
                synchronized (gw90.class) {
                    try {
                        String strM178457h = qwa.m178457h(new File(file + File.separator + "fromSuggestions.json"));
                        if (!TextUtils.isEmpty(strM178457h)) {
                            try {
                                f106741b.m137019l(HometownSuggest.JSON_ADAPTER.parse(strM178457h));
                                return;
                            } catch (IOException unused) {
                                CrashHelper.m82480d(new RuntimeException("com.fasterxml.jackson.core.JsonParseException:" + strM178457h), 100);
                                f106740a.put("");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                m132584d();
            }
        }
        try {
            hometownSuggestNew_ = HometownSuggest.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194024c));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            hometownSuggestNew_ = HometownSuggest.new_();
        }
        f106741b.m137019l(hometownSuggestNew_);
    }
}
