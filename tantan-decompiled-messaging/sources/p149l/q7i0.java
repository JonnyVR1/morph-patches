package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class q7i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<String, DownloadTask> f153047h;

    public q7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f153047h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: E */
    public final void m173265E(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("fail");
        if (bjq.m102187a(f400Var.mo102961c())) {
            m114659x(strOptString);
        } else {
            m114659x(strOptString2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m173266F(f400 f400Var, final JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("url");
        final JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m114661z(jSONObject, jSONObject2.toString());
                return;
            }
            if (this.f153047h.containsKey(strOptString)) {
                jSONObject2.put("code", 500);
                jSONObject2.put("errMsg", "正在下载 " + strOptString);
                m114661z(jSONObject, jSONObject2.toString());
                return;
            }
            final File file = new File(m173268H(f400Var.mo102961c()), m173275O(strOptString));
            boolean zOptBoolean = jSONObject.optBoolean("forceUpdate");
            final boolean zOptBoolean2 = jSONObject.optBoolean("needResource");
            if (!zOptBoolean && file.exists()) {
                try {
                    jSONObject2.put("code", 200);
                    if (zOptBoolean2) {
                        jSONObject2.put("resource", le2.m149477c(zhi.m218802e(file), 0));
                    }
                    m114661z(jSONObject, jSONObject2.toString());
                    return;
                } catch (Exception unused) {
                }
            }
            if (file.exists()) {
                file.delete();
            }
            DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154685D).m79642q(strOptString).m79635j(new f30() { // from class: l.o7i0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f142503a.m173269I(strOptString, jSONObject2, zOptBoolean2, jSONObject, file, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.p7i0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f147514a.m173270J(strOptString, jSONObject2, jSONObject, file, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79640o(file.getAbsoluteFile() + ".tmp").m79626a();
            C13111a.m79654u().m79665o(downloadTaskM79626a);
            this.f153047h.put(strOptString, downloadTaskM79626a);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m173267G(f400 f400Var, JSONObject jSONObject) {
        String strM102189c = bjq.m102189c(f400Var.mo102961c(), jSONObject.optString(Constants.KEY_KEY), "");
        String strOptString = jSONObject.optString("success");
        jSONObject.optString("fail");
        m114660y(strOptString, strM102189c);
    }

    /* JADX INFO: renamed from: H */
    public final String m173268H(Context context) {
        File file = new File(context.getExternalFilesDir("TantanStorageBridge"), "svga");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m173269I(String str, JSONObject jSONObject, boolean z, JSONObject jSONObject2, File file, DownloadTask downloadTask, File file2) {
        this.f153047h.remove(str);
        try {
            jSONObject.put("code", 200);
            if (z) {
                jSONObject.put("resource", le2.m149477c(zhi.m218802e(file2), 0));
            }
            m114661z(jSONObject2, jSONObject.toString());
        } catch (Exception unused) {
        }
        file2.renameTo(file);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m173270J(String str, JSONObject jSONObject, JSONObject jSONObject2, File file, DownloadTask downloadTask, Throwable th) {
        this.f153047h.remove(str);
        try {
            jSONObject.put("code", 400);
            m114661z(jSONObject2, jSONObject.toString());
            File file2 = new File(file.getAbsolutePath() + ".tmp");
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m173271K(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m114661z(jSONObject, jSONObject2.toString());
                return;
            }
            File file = new File(m173268H(f400Var.mo102961c()), m173275O(strOptString));
            if (file.exists()) {
                jSONObject2.put("code", 200);
                jSONObject2.put("resource", le2.m149477c(zhi.m218802e(file), 0));
                m114661z(jSONObject, jSONObject2.toString());
            } else {
                jSONObject2.put("code", 300);
                jSONObject2.put("errMsg", "本地未下载 " + strOptString);
                m114661z(jSONObject, jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m173272L(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        File file = new File(m173268H(f400Var.mo102961c()), m173275O(strOptString));
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m173273M(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.KEY_KEY);
        String strOptString2 = jSONObject.optString("success");
        String strOptString3 = jSONObject.optString("fail");
        if (bjq.m102188b(f400Var.mo102961c(), strOptString) && bjq.m102191e(f400Var.mo102961c(), strOptString)) {
            m114659x(strOptString2);
        } else {
            m114659x(strOptString3);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m173274N(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.KEY_KEY);
        String strOptString2 = jSONObject.optString("data");
        String strOptString3 = jSONObject.optString("success");
        String strOptString4 = jSONObject.optString("fail");
        if (bjq.m102190d(f400Var.mo102961c(), strOptString, strOptString2)) {
            m114659x(strOptString3);
        } else {
            m114659x(strOptString4);
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m173275O(String str) {
        return ogw.m164285f(str, true);
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: l */
    public void mo100662l(MKWebView mKWebView) {
        Iterator<String> it = this.f153047h.keySet().iterator();
        while (it.hasNext()) {
            C13111a.m79654u().m79664n(this.f153047h.get(it.next()));
        }
        this.f153047h.clear();
        super.mo100662l(mKWebView);
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "removeResource":
                m173272L(f400Var, jSONObject);
                return true;
            case "clearStorage":
                m173265E(f400Var, jSONObject);
                return true;
            case "readResource":
                m173271K(f400Var, jSONObject);
                return true;
            case "downloadResource":
                m173266F(f400Var, jSONObject);
                return true;
            case "getStorage":
                m173267G(f400Var, jSONObject);
                return true;
            case "removeStorage":
                m173273M(f400Var, jSONObject);
                return true;
            case "setStorage":
                m173274N(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
