package p009l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p1.mobile.putong.app.PutongAct;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import l.f30;
import l.le2;
import l.ogw;
import l.qib0;
import l.zhi;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q7i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<String, DownloadTask> f19058h;

    public q7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f19058h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: E */
    public final void m20821E(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("fail");
        if (bjq.m12051a(f400Var.mo12184c())) {
            m13718x(strOptString);
        } else {
            m13718x(strOptString2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m20822F(f400 f400Var, final JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("url");
        final JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m13720z(jSONObject, jSONObject2.toString());
                return;
            }
            if (this.f19058h.containsKey(strOptString)) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 500);
                jSONObject2.put("errMsg", "正在下载 " + strOptString);
                m13720z(jSONObject, jSONObject2.toString());
                return;
            }
            final File file = new File(m20824H(f400Var.mo12184c()), m20831O(strOptString));
            boolean zOptBoolean = jSONObject.optBoolean("forceUpdate");
            final boolean zOptBoolean2 = jSONObject.optBoolean("needResource");
            if (!zOptBoolean && file.exists()) {
                try {
                    jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 200);
                    if (zOptBoolean2) {
                        jSONObject2.put("resource", le2.c(zhi.e(file), 0));
                    }
                    m13720z(jSONObject, jSONObject2.toString());
                    return;
                } catch (Exception unused) {
                }
            }
            if (file.exists()) {
                file.delete();
            }
            DownloadTask downloadTaskM9947a = new DownloadTask.C0512b(qib0.D).m9963q(strOptString).m9956j(new f30() { // from class: l.o7i0
                public final void call(Object obj, Object obj2) {
                    this.f17860a.m20825I(strOptString, jSONObject2, zOptBoolean2, jSONObject, file, (DownloadTask) obj, (File) obj2);
                }
            }).m9952f(new f30() { // from class: l.p7i0
                public final void call(Object obj, Object obj2) {
                    this.f18417a.m20826J(strOptString, jSONObject2, jSONObject, file, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m9961o(file.getAbsoluteFile() + ".tmp").m9947a();
            C0513a.m9975u().m9986o(downloadTaskM9947a);
            this.f19058h.put(strOptString, downloadTaskM9947a);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m20823G(f400 f400Var, JSONObject jSONObject) {
        String strM12053c = bjq.m12053c(f400Var.mo12184c(), jSONObject.optString("key"), "");
        String strOptString = jSONObject.optString("success");
        jSONObject.optString("fail");
        m13719y(strOptString, strM12053c);
    }

    /* JADX INFO: renamed from: H */
    public final String m20824H(Context context) {
        File file = new File(context.getExternalFilesDir("TantanStorageBridge"), "svga");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m20825I(String str, JSONObject jSONObject, boolean z, JSONObject jSONObject2, File file, DownloadTask downloadTask, File file2) {
        this.f19058h.remove(str);
        try {
            jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 200);
            if (z) {
                jSONObject.put("resource", le2.c(zhi.e(file2), 0));
            }
            m13720z(jSONObject2, jSONObject.toString());
        } catch (Exception unused) {
        }
        file2.renameTo(file);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m20826J(String str, JSONObject jSONObject, JSONObject jSONObject2, File file, DownloadTask downloadTask, Throwable th) {
        this.f19058h.remove(str);
        try {
            jSONObject.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 400);
            m13720z(jSONObject2, jSONObject.toString());
            File file2 = new File(file.getAbsolutePath() + ".tmp");
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m20827K(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 100);
                jSONObject2.put("errMsg", "下载的地址不正确");
                m13720z(jSONObject, jSONObject2.toString());
                return;
            }
            File file = new File(m20824H(f400Var.mo12184c()), m20831O(strOptString));
            if (file.exists()) {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 200);
                jSONObject2.put("resource", le2.c(zhi.e(file), 0));
                m13720z(jSONObject, jSONObject2.toString());
            } else {
                jSONObject2.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, 300);
                jSONObject2.put("errMsg", "本地未下载 " + strOptString);
                m13720z(jSONObject, jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m20828L(f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        File file = new File(m20824H(f400Var.mo12184c()), m20831O(strOptString));
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m20829M(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("key");
        String strOptString2 = jSONObject.optString("success");
        String strOptString3 = jSONObject.optString("fail");
        if (bjq.m12052b(f400Var.mo12184c(), strOptString) && bjq.m12055e(f400Var.mo12184c(), strOptString)) {
            m13718x(strOptString2);
        } else {
            m13718x(strOptString3);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m20830N(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("key");
        String strOptString2 = jSONObject.optString(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA);
        String strOptString3 = jSONObject.optString("success");
        String strOptString4 = jSONObject.optString("fail");
        if (bjq.m12054d(f400Var.mo12184c(), strOptString, strOptString2)) {
            m13718x(strOptString3);
        } else {
            m13718x(strOptString4);
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m20831O(String str) {
        return ogw.f(str, true);
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: l */
    public void mo11879l(MKWebView mKWebView) {
        Iterator<String> it = this.f19058h.keySet().iterator();
        while (it.hasNext()) {
            C0513a.m9975u().m9985n(this.f19058h.get(it.next()));
        }
        this.f19058h.clear();
        super.mo11879l(mKWebView);
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "removeResource":
                m20828L(f400Var, jSONObject);
                return true;
            case "clearStorage":
                m20821E(f400Var, jSONObject);
                return true;
            case "readResource":
                m20827K(f400Var, jSONObject);
                return true;
            case "downloadResource":
                m20822F(f400Var, jSONObject);
                return true;
            case "getStorage":
                m20823G(f400Var, jSONObject);
                return true;
            case "removeStorage":
                m20829M(f400Var, jSONObject);
                return true;
            case "setStorage":
                m20830N(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
