package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class co90 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f81756a = new uqd0("hometown_language_storage_tag", "");

    /* JADX INFO: renamed from: b */
    public static C22392a<HometownSuggest> f81757b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m107942c(File file, String str, DownloadTask downloadTask, File file2) {
        synchronized (co90.class) {
            String absolutePath = file2.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            String str2 = File.separator;
            sb.append(str2);
            if (eva.m118254i(absolutePath, sb.toString())) {
                String strM118253h = eva.m118253h(new File(file + str2 + "fromSuggestions.json"));
                if (!TextUtils.isEmpty(strM118253h)) {
                    try {
                        f81757b.m132487l(HometownSuggest.JSON_ADAPTER.parse(strM118253h));
                    } catch (IOException e) {
                        CrashHelper.m81296c(e);
                    }
                    f81756a.put(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m107943d() {
        final String string = "";
        String str = "";
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("profile_hometown_language");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONObject jSONObject = new JSONObject(strM79302F);
                if (jSONObject.has("url")) {
                    string = jSONObject.getString("url");
                }
            }
        } catch (Exception unused) {
        }
        String strM107945f = m107945f();
        File fileM107944e = m107944e();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (TextUtils.isEmpty(strM107945f)) {
            return;
        }
        if (eva.m118248c(fileM107944e)) {
            final File file = new File(strM107945f);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM107945f + File.separator + "fromSuggestions.zip";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            uqd0 uqd0Var = f81756a;
            if (!TextUtils.isEmpty(uqd0Var.get()) && TextUtils.equals(uqd0Var.get(), string)) {
                if (eva.m118250e(file + File.separator + "fromSuggestions.json")) {
                    return;
                }
            }
            DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(string).m79640o(str).m79635j(new f30() { // from class: l.ao90
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    co90.m107942c(file, string, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.bo90
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.m81296c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).m79626a();
            if (!C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
                C13111a.m79654u().m79665o(downloadTaskM79626a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m107944e() {
        File externalCacheDir = rhi.m179370n() ? CoreModule.f17544b.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = CoreModule.f17544b.getCacheDir();
        }
        return externalCacheDir == null ? CoreModule.f17544b.getCacheDir() : externalCacheDir;
    }

    /* JADX INFO: renamed from: f */
    public static String m107945f() {
        File fileM107944e = m107944e();
        if (!NullChecker.m81303a(fileM107944e) || !fileM107944e.exists()) {
            return "";
        }
        return fileM107944e.getAbsolutePath() + File.separator + Constants.KEY_CONFIG;
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<HometownSuggest> m107946g() {
        if (f81757b.m221515e() == null) {
            e51.m114774y(new Runnable() { // from class: l.zn90
                @Override // java.lang.Runnable
                public final void run() {
                    co90.m107948i();
                }
            });
        }
        return f81757b;
    }

    /* JADX INFO: renamed from: h */
    public static HometownSuggest m107947h() {
        return f81757b.m221515e();
    }

    /* JADX INFO: renamed from: i */
    public static void m107948i() {
        HometownSuggest hometownSuggestNew_;
        String strM107945f = m107945f();
        if (!TextUtils.isEmpty(strM107945f)) {
            File file = new File(strM107945f);
            if (file.exists()) {
                synchronized (co90.class) {
                    try {
                        String strM118253h = eva.m118253h(new File(file + File.separator + "fromSuggestions.json"));
                        if (!TextUtils.isEmpty(strM118253h)) {
                            try {
                                f81757b.m132487l(HometownSuggest.JSON_ADAPTER.parse(strM118253h));
                                return;
                            } catch (IOException unused) {
                                CrashHelper.m81297d(new RuntimeException("com.fasterxml.jackson.core.JsonParseException:" + strM118253h), 100);
                                f81756a.put("");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                m107943d();
            }
        }
        try {
            hometownSuggestNew_ = HometownSuggest.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168689c));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            hometownSuggestNew_ = HometownSuggest.new_();
        }
        f81757b.m132487l(hometownSuggestNew_);
    }
}
