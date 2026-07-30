package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import l.e51;
import l.eva;
import l.f30;
import l.qib0;
import l.rhi;
import l.t7c0;
import l.uqd0;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class co90 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f8771a = new uqd0("hometown_language_storage_tag", "");

    /* JADX INFO: renamed from: b */
    public static a<HometownSuggest> f8772b = a.b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11134c(File file, String str, DownloadTask downloadTask, File file2) {
        synchronized (co90.class) {
            String absolutePath = file2.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            String str2 = File.separator;
            sb.append(str2);
            if (eva.i(absolutePath, sb.toString())) {
                String strH = eva.h(new File(file + str2 + "fromSuggestions.json"));
                if (!TextUtils.isEmpty(strH)) {
                    try {
                        f8772b.onNext((HometownSuggest) HometownSuggest.JSON_ADAPTER.parse(strH));
                    } catch (IOException e) {
                        CrashHelper.c(e);
                    }
                    f8771a.put(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m11135d() {
        final String string = "";
        String str = "";
        try {
            String strF = RemoteConfig.x().F("profile_hometown_language");
            if (!TextUtils.isEmpty(strF)) {
                JSONObject jSONObject = new JSONObject(strF);
                if (jSONObject.has("url")) {
                    string = jSONObject.getString("url");
                }
            }
        } catch (Exception unused) {
        }
        String strM11137f = m11137f();
        File fileM11136e = m11136e();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (TextUtils.isEmpty(strM11137f)) {
            return;
        }
        if (eva.c(fileM11136e)) {
            final File file = new File(strM11137f);
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                str = strM11137f + File.separator + "fromSuggestions.zip";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            uqd0 uqd0Var = f8771a;
            if (!TextUtils.isEmpty((CharSequence) uqd0Var.get()) && TextUtils.equals((CharSequence) uqd0Var.get(), string)) {
                if (eva.e(file + File.separator + "fromSuggestions.json")) {
                    return;
                }
            }
            DownloadTask downloadTaskA = new DownloadTask.b(qib0.H.getDownloadHttp()).q(string).o(str).j(new f30() { // from class: l.ao90
                public final void call(Object obj, Object obj2) {
                    co90.m11134c(file, string, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.bo90
                public final void call(Object obj, Object obj2) {
                    Throwable th = (Throwable) obj2;
                    CrashHelper.c(new Exception("downloadFromSuggestions.json Fail exception:" + th.getMessage(), th));
                }
            }).a();
            if (!com.p1.mobile.putong.ui.download.a.u().y(downloadTaskA.x())) {
                com.p1.mobile.putong.ui.download.a.u().o(downloadTaskA);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m11136e() {
        File externalCacheDir = rhi.n() ? CoreModule.b.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = CoreModule.b.getCacheDir();
        }
        return externalCacheDir == null ? CoreModule.b.getCacheDir() : externalCacheDir;
    }

    /* JADX INFO: renamed from: f */
    public static String m11137f() {
        File fileM11136e = m11136e();
        if (!NullChecker.a(fileM11136e) || !fileM11136e.exists()) {
            return "";
        }
        return fileM11136e.getAbsolutePath() + File.separator + "config";
    }

    /* JADX INFO: renamed from: g */
    public static c<HometownSuggest> m11138g() {
        if (f8772b.e() == null) {
            e51.y(new Runnable() { // from class: l.zn90
                @Override // java.lang.Runnable
                public final void run() {
                    co90.m11140i();
                }
            });
        }
        return f8772b;
    }

    /* JADX INFO: renamed from: h */
    public static HometownSuggest m11139h() {
        return (HometownSuggest) f8772b.e();
    }

    /* JADX INFO: renamed from: i */
    public static void m11140i() {
        HometownSuggest hometownSuggestNew_;
        String strM11137f = m11137f();
        if (!TextUtils.isEmpty(strM11137f)) {
            File file = new File(strM11137f);
            if (file.exists()) {
                synchronized (co90.class) {
                    try {
                        String strH = eva.h(new File(file + File.separator + "fromSuggestions.json"));
                        if (!TextUtils.isEmpty(strH)) {
                            try {
                                f8772b.onNext((HometownSuggest) HometownSuggest.JSON_ADAPTER.parse(strH));
                                return;
                            } catch (IOException unused) {
                                CrashHelper.d(new RuntimeException("com.fasterxml.jackson.core.JsonParseException:" + strH), 100);
                                f8771a.put("");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                m11135d();
            }
        }
        try {
            hometownSuggestNew_ = (HometownSuggest) HometownSuggest.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.c));
        } catch (IOException e) {
            CrashHelper.c(e);
            hometownSuggestNew_ = HometownSuggest.new_();
        }
        f8772b.onNext(hometownSuggestNew_);
    }
}
