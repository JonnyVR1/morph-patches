package p149l;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class k1i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public c4g0 f120589h;

    /* JADX INFO: renamed from: i */
    public c4g0 f120590i;

    public k1i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: G */
    public void m144165G(@NonNull f400 f400Var) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        try {
            f400Var.mo102961c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m144166H(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m114659x(str);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m144167I(String str, Boolean bool) {
        if (bool.booleanValue()) {
            m114659x(str);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m144168J(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        String strOptString3 = jSONObject.optString("success");
        jSONObject.optString("fail");
        if (strOptString.equals("onAppEnterBackground")) {
            if (this.f120590i == null) {
                this.f120590i = Act.foreground().map(new w9j() { // from class: l.g1i0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a((Act.C4299r) obj));
                    }
                }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.h1i0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f105432a.m144166H(strOptString2, (Boolean) obj);
                    }
                }));
                m114659x(strOptString3);
                return;
            }
            return;
        }
        if (strOptString.equals("onAppEnterForeground") && this.f120589h == null) {
            this.f120589h = Act.foreground().map(new w9j() { // from class: l.i1i0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((Act.C4299r) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.j1i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115815a.m144167I(strOptString2, (Boolean) obj);
                }
            }));
            m114659x(strOptString3);
        }
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("jumpToLauncher")) {
            m144165G(f400Var);
            return true;
        }
        if (!str2.equals("subscribe")) {
            return false;
        }
        m144168J(f400Var, jSONObject);
        return true;
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: w */
    public void mo114658w() {
        super.mo114658w();
        if (NullChecker.m81303a(this.f120589h)) {
            this.f120589h.unsubscribe();
            this.f120589h = null;
        }
        if (NullChecker.m81303a(this.f120590i)) {
            this.f120590i.unsubscribe();
            this.f120590i = null;
        }
    }
}
