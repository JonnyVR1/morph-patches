package p153l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.vivo.push.PushClientConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class bli0 extends wc00 {
    public bli0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: L */
    public final void m104915L(xc00 xc00Var, JSONObject jSONObject) {
        int iOptInt = jSONObject != null ? jSONObject.optInt("type", 1) : 1;
        if (iOptInt == 2) {
            Intent intent = new Intent("mk.close.close_all_page");
            if (hve0.f111752d) {
                intent.setPackage(App.f16088e.getPackageName());
            }
            intent.putExtra("url", MKWebViewHelper.m17949B(jSONObject.optJSONArray("url")));
            rf3.m181165c(xc00Var.mo99543c(), intent);
            return;
        }
        if (iOptInt != 3) {
            xc00Var.mo99543c().m68056e2();
            return;
        }
        Intent intent2 = new Intent("mk.close.close_other_page");
        if (hve0.f111752d) {
            intent2.setPackage(App.f16088e.getPackageName());
        }
        intent2.putExtra("webview_id", xc00Var.mo99541a().getPageUID());
        rf3.m181165c(xc00Var.mo99543c(), intent2);
    }

    /* JADX INFO: renamed from: M */
    public final void m104916M(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString(PushClientConstants.TAG_PKG_NAME);
            String strOptString2 = jSONObject.optString("url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + strOptString));
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                this.f188308d.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                CrashHelper.m82479c(e);
                this.f188308d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString2)));
            }
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m104917N(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("url");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            xc00Var.mo99543c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m104914O(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("pageID");
        try {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("extras");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            jSONObjectOptJSONObject = null;
        }
        if (xc00Var.mo99543c() instanceof MkWebViewAct) {
            ((MkWebViewAct) xc00Var.mo99543c()).m81426m2(strOptString, jSONObjectOptJSONObject);
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull final xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "setWebviewPageID":
                l51.m152893M(new Runnable() { // from class: l.ali0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72113a.m104914O(xc00Var, jSONObject);
                    }
                });
                return true;
            case "close":
                m104915L(xc00Var, jSONObject);
                return true;
            case "jumpBrowser":
                m104917N(xc00Var, jSONObject);
                return true;
            case "jumpAppStore":
                m104916M(jSONObject);
                return true;
            default:
                return false;
        }
    }
}
