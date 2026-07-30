package p149l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.vivo.push.PushClientConstants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class bci0 extends e400 {
    public bci0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public final void m101067D(f400 f400Var, JSONObject jSONObject) {
        int iOptInt = jSONObject != null ? jSONObject.optInt("type", 1) : 1;
        if (iOptInt == 2) {
            Intent intent = new Intent("mk.close.close_all_page");
            if (ane0.f70732d) {
                intent.setPackage(App.f15369e.getPackageName());
            }
            intent.putExtra("url", MKWebViewHelper.m87103s(jSONObject.optJSONArray("url")));
            df3.m111427c(f400Var.mo102961c(), intent);
            return;
        }
        if (iOptInt != 3) {
            f400Var.mo102961c().m66873d2();
            return;
        }
        Intent intent2 = new Intent("mk.close.close_other_page");
        if (ane0.f70732d) {
            intent2.setPackage(App.f15369e.getPackageName());
        }
        intent2.putExtra("webview_id", f400Var.mo102959a().getPageUID());
        df3.m111427c(f400Var.mo102961c(), intent2);
    }

    /* JADX INFO: renamed from: E */
    public final void m101068E(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString(PushClientConstants.TAG_PKG_NAME);
            String strOptString2 = jSONObject.optString("url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + strOptString));
                intent.setFlags(268435456);
                this.f89239d.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                CrashHelper.m81296c(e);
                this.f89239d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString2)));
            }
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m101069F(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("url");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            f400Var.mo102961c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m101066G(@NonNull f400 f400Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("pageID");
        try {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("extras");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            jSONObjectOptJSONObject = null;
        }
        if (f400Var.mo102961c() instanceof MkWebViewAct) {
            ((MkWebViewAct) f400Var.mo102961c()).m80243l2(strOptString, jSONObjectOptJSONObject);
        }
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "setWebviewPageID":
                e51.m114748M(new Runnable() { // from class: l.aci0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68848a.m101066G(f400Var, jSONObject);
                    }
                });
                return true;
            case "close":
                m101067D(f400Var, jSONObject);
                return true;
            case "jumpBrowser":
                m101069F(f400Var, jSONObject);
                return true;
            case "jumpAppStore":
                m101068E(jSONObject);
                return true;
            default:
                return false;
        }
    }
}
