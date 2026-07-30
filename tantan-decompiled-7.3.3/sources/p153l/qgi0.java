package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class qgi0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<String, DownloadTask> f157420h;

    public qgi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f157420h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: M */
    public final void m176480M(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("fail");
        if (alq.m98715a(xc00Var.mo99543c())) {
            m205738F(strOptString);
        } else {
            m205738F(strOptString2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m176481N(xc00 xc00Var, final JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("url");
        final JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m205740H(jSONObject, jSONObject2.toString());
                return;
            }
            if (this.f157420h.containsKey(strOptString)) {
                jSONObject2.put("code", 500);
                jSONObject2.put("errMsg", "正在下载 " + strOptString);
                m205740H(jSONObject, jSONObject2.toString());
                return;
            }
            final File file = new File(m176483P(xc00Var.mo99543c()), m176490W(strOptString));
            boolean zOptBoolean = jSONObject.optBoolean("forceUpdate");
            final boolean zOptBoolean2 = jSONObject.optBoolean("needResource");
            if (!zOptBoolean && file.exists()) {
                try {
                    jSONObject2.put("code", 200);
                    if (zOptBoolean2) {
                        jSONObject2.put("resource", te2.m190678c(wki.m206825e(file), 0));
                    }
                    m205740H(jSONObject, jSONObject2.toString());
                    return;
                } catch (Exception unused) {
                }
            }
            if (file.exists()) {
                file.delete();
            }
            DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180368D).m80825q(strOptString).m80818j(new z20() { // from class: l.ogi0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f147274a.m176484Q(strOptString, jSONObject2, zOptBoolean2, jSONObject, file, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.pgi0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f152297a.m176485R(strOptString, jSONObject2, jSONObject, file, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80823o(file.getAbsoluteFile() + ".tmp").m80809a();
            C13274a.m80837u().m80848o(downloadTaskM80809a);
            this.f157420h.put(strOptString, downloadTaskM80809a);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m176482O(xc00 xc00Var, JSONObject jSONObject) {
        String strM98717c = alq.m98717c(xc00Var.mo99543c(), jSONObject.optString(Constants.KEY_KEY), "");
        String strOptString = jSONObject.optString("success");
        jSONObject.optString("fail");
        m205739G(strOptString, strM98717c);
    }

    /* JADX INFO: renamed from: P */
    public final String m176483P(Context context) {
        File file = new File(context.getExternalFilesDir("TantanStorageBridge"), "svga");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m176484Q(String str, JSONObject jSONObject, boolean z, JSONObject jSONObject2, File file, DownloadTask downloadTask, File file2) {
        this.f157420h.remove(str);
        try {
            jSONObject.put("code", 200);
            if (z) {
                jSONObject.put("resource", te2.m190678c(wki.m206825e(file2), 0));
            }
            m205740H(jSONObject2, jSONObject.toString());
        } catch (Exception unused) {
        }
        file2.renameTo(file);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m176485R(String str, JSONObject jSONObject, JSONObject jSONObject2, File file, DownloadTask downloadTask, Throwable th) {
        this.f157420h.remove(str);
        try {
            jSONObject.put("code", 400);
            m205740H(jSONObject2, jSONObject.toString());
            File file2 = new File(file.getAbsolutePath() + ".tmp");
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m176486S(xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m205740H(jSONObject, jSONObject2.toString());
                return;
            }
            File file = new File(m176483P(xc00Var.mo99543c()), m176490W(strOptString));
            if (file.exists()) {
                jSONObject2.put("code", 200);
                jSONObject2.put("resource", te2.m190678c(wki.m206825e(file), 0));
                m205740H(jSONObject, jSONObject2.toString());
            } else {
                jSONObject2.put("code", 300);
                jSONObject2.put("errMsg", "本地未下载 " + strOptString);
                m205740H(jSONObject, jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m176487T(xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        File file = new File(m176483P(xc00Var.mo99543c()), m176490W(strOptString));
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m176488U(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.KEY_KEY);
        String strOptString2 = jSONObject.optString("success");
        String strOptString3 = jSONObject.optString("fail");
        if (alq.m98716b(xc00Var.mo99543c(), strOptString) && alq.m98719e(xc00Var.mo99543c(), strOptString)) {
            m205738F(strOptString2);
        } else {
            m205738F(strOptString3);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m176489V(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(Constants.KEY_KEY);
        String strOptString2 = jSONObject.optString("data");
        String strOptString3 = jSONObject.optString("success");
        String strOptString4 = jSONObject.optString("fail");
        if (alq.m98718d(xc00Var.mo99543c(), strOptString, strOptString2)) {
            m205738F(strOptString3);
        } else {
            m205738F(strOptString4);
        }
    }

    /* JADX INFO: renamed from: W */
    public final String m176490W(String str) {
        return niw.m163316f(str, true);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: t */
    public void mo104210t(MKWebView mKWebView) {
        Iterator<String> it = this.f157420h.keySet().iterator();
        while (it.hasNext()) {
            C13274a.m80837u().m80847n(this.f157420h.get(it.next()));
        }
        this.f157420h.clear();
        super.mo104210t(mKWebView);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "removeResource":
                m176487T(xc00Var, jSONObject);
                return true;
            case "clearStorage":
                m176480M(xc00Var, jSONObject);
                return true;
            case "readResource":
                m176486S(xc00Var, jSONObject);
                return true;
            case "downloadResource":
                m176481N(xc00Var, jSONObject);
                return true;
            case "getStorage":
                m176482O(xc00Var, jSONObject);
                return true;
            case "removeStorage":
                m176488U(xc00Var, jSONObject);
                return true;
            case "setStorage":
                m176489V(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
