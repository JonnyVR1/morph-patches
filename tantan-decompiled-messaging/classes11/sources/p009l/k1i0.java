package p009l;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.w9j;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k1i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public c4g0 f15386h;

    /* JADX INFO: renamed from: i */
    public c4g0 f15387i;

    public k1i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: G */
    public void m17277G(@NonNull f400 f400Var) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        try {
            f400Var.mo12184c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m17278H(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m13718x(str);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m17279I(String str, Boolean bool) {
        if (bool.booleanValue()) {
            m13718x(str);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m17280J(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        String strOptString3 = jSONObject.optString("success");
        jSONObject.optString("fail");
        if (strOptString.equals("onAppEnterBackground")) {
            if (this.f15387i == null) {
                this.f15387i = Act.foreground().map(new w9j() { // from class: l.g1i0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((Act.r) obj));
                    }
                }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.h1i0
                    public final void call(Object obj) {
                        this.f13841a.m17278H(strOptString2, (Boolean) obj);
                    }
                }));
                m13718x(strOptString3);
                return;
            }
            return;
        }
        if (strOptString.equals("onAppEnterForeground") && this.f15386h == null) {
            this.f15386h = Act.foreground().map(new w9j() { // from class: l.i1i0
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((Act.r) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.j1i0
                public final void call(Object obj) {
                    this.f14912a.m17279I(strOptString2, (Boolean) obj);
                }
            }));
            m13718x(strOptString3);
        }
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("jumpToLauncher")) {
            m17277G(f400Var);
            return true;
        }
        if (!str2.equals("subscribe")) {
            return false;
        }
        m17280J(f400Var, jSONObject);
        return true;
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: w */
    public void mo13717w() {
        super.mo13717w();
        if (NullChecker.a(this.f15386h)) {
            this.f15386h.unsubscribe();
            this.f15386h = null;
        }
        if (NullChecker.a(this.f15387i)) {
            this.f15387i.unsubscribe();
            this.f15387i = null;
        }
    }
}
