package p009l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import l.df3;
import l.e51;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bci0 extends e400 {
    public bci0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: D */
    public final void m11936D(f400 f400Var, JSONObject jSONObject) {
        int iOptInt = jSONObject != null ? jSONObject.optInt(MiniWidgetProvider.KEY_TYPE, 1) : 1;
        if (iOptInt == 2) {
            Intent intent = new Intent("mk.close.close_all_page");
            if (ane0.f9584d) {
                intent.setPackage(App.e.getPackageName());
            }
            intent.putExtra("url", MKWebViewHelper.s(jSONObject.optJSONArray("url")));
            df3.c(f400Var.mo12184c(), intent);
            return;
        }
        if (iOptInt != 3) {
            f400Var.mo12184c().finish();
            return;
        }
        Intent intent2 = new Intent("mk.close.close_other_page");
        if (ane0.f9584d) {
            intent2.setPackage(App.e.getPackageName());
        }
        intent2.putExtra("webview_id", f400Var.mo12182a().getPageUID());
        df3.c(f400Var.mo12184c(), intent2);
    }

    /* JADX INFO: renamed from: E */
    public final void m11937E(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("pkgName");
            String strOptString2 = jSONObject.optString("url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + strOptString));
                intent.setFlags(268435456);
                this.f12358d.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                CrashHelper.c(e);
                this.f12358d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString2)));
            }
        } catch (Exception e2) {
            CrashHelper.c(e2);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m11938F(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("url");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            f400Var.mo12184c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m11935G(@NonNull f400 f400Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("pageID");
        try {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("extras");
        } catch (Exception e) {
            CrashHelper.c(e);
            jSONObjectOptJSONObject = null;
        }
        if (f400Var.mo12184c() instanceof MkWebViewAct) {
            ((MkWebViewAct) f400Var.mo12184c()).m10594l2(strOptString, jSONObjectOptJSONObject);
        }
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "setWebviewPageID":
                e51.M(new Runnable() { // from class: l.aci0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9395a.m11935G(f400Var, jSONObject);
                    }
                });
                return true;
            case "close":
                m11936D(f400Var, jSONObject);
                return true;
            case "jumpBrowser":
                m11938F(f400Var, jSONObject);
                return true;
            case "jumpAppStore":
                m11937E(jSONObject);
                return true;
            default:
                return false;
        }
    }
}
