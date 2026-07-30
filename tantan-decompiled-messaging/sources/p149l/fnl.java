package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.ContextThemeWrapper;
import androidx.core.app.NotificationCompat;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fnl {

    /* JADX INFO: renamed from: b */
    protected static final String f98429b = "fnl";

    /* JADX INFO: renamed from: a */
    protected MKWebView f98430a;

    public fnl(MKWebView mKWebView) {
        this.f98430a = mKWebView;
    }

    /* JADX INFO: renamed from: a */
    public Context m122322a() {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView == null) {
            return null;
        }
        Context context = mKWebView.getContext();
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextThemeWrapper) {
            return ((ContextThemeWrapper) context).getBaseContext();
        }
        if (context instanceof m16) {
            return ((m16) context).getBaseContext();
        }
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }

    /* JADX INFO: renamed from: b */
    public String m122323b() {
        MKWebView mKWebView = this.f98430a;
        return mKWebView != null ? mKWebView.getOriginURL() : "";
    }

    /* JADX INFO: renamed from: c */
    public final void m122324c(String str, String str2) {
        MKWebView mKWebView = this.f98430a;
        if (mKWebView != null) {
            mKWebView.m87086o0(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m122325d(String str, String str2, String str3, String str4) {
        m122324c(str, liw.m149941b(new String[]{"data", NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{str2, str4, str3}).toString());
    }

    /* JADX INFO: renamed from: e */
    public void m122326e(String str, JSONObject jSONObject, String str2, int i) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put(NotificationCompat.CATEGORY_STATUS, i);
            jSONObject2.put("message", str2);
            m122324c(str, jSONObject2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception;

    /* JADX INFO: renamed from: f */
    public void mo122327f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo122328g() {
    }
}
